package com.crisspian.recyclerviewexamples_01.adapter;

import android.media.Image;
import android.os.Binder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.crisspian.recyclerviewexamples_01.databinding.ItemListDataBinding;
import com.crisspian.recyclerviewexamples_01.model.Item;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemViewHolder>{

    private List<Item> itemList;
    private elementoseleccionado mListener;


    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemListDataBinding mBinding = ItemListDataBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);

        return new ItemViewHolder(mBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {

        Item mitem = itemList.get(position);
        holder.mtextview.setText(mitem.getItemDescription());
        Glide.with(holder.itemView.getContext()).load(mitem.getUrlImage()).centerCrop().into(holder.mimagenview);

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }


    //CLASE VIEWHOLDER
    public class ItemViewHolder extends RecyclerView.ViewHolder  {

            private ImageView mimagenview;
            private TextView mtextview;

                //lleno el constructor y lo implemento
            public ItemViewHolder(@NonNull ItemListDataBinding mBinding) {
                super(mBinding.getRoot());
                mtextview = mBinding.tvItem;
                mimagenview=mBinding.ivItem;
                itemView.setOnClickListener(this);

    }



     //  @Override
     //  public void onClick(View view) {
     //     int position =getLayoutPosition();
     //     ImageView eleimagen = itemList.get(position);
      //    String eletext= itemList.get(position);
      //  }
   // }

    //se genera una interface para mostrar la palabra

   // public interface elementoseleccionado{
   //     void passElement(Image mimagen , String mtext)
   // }
}
