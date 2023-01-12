package com.example.recyclerviewdemo.Model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder>{

    public  String[] menus;
    public  int[] prices;
    public  String[] images;

    public MenuAdapter(){
        this.menus=WebDataSource.getProduct();
        this.prices=WebDataSource.getPrice();
        this.images=WebDataSource.getImg();
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_list,parent,false);
        ViewHolder vh=new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        /*
        holder.tx2.setText(this.menus[position]);
        holder.tx4.setText(String.valueOf(this.prices[position]));
        holder.foodImg.setImageResource(R.drawable.big_mac);

         */
        holder.t1.setText(this.menus[position]);
        holder.t2.setText(String.valueOf(this.prices[position]));
        holder.foodImg.setImageResource(R.drawable.big_mac);
    }

    @Override
    public int getItemCount() {
        return this.menus.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        /*
        ImageView foodImg;
        TextView tx1,tx2,tx3,tx4;
         */
        ImageView foodImg;
        TextView t1,t2;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImg=itemView.findViewById(R.id.imageView);
            t1=itemView.findViewById(R.id.textView);
            t2=itemView.findViewById(R.id.textView2);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int pos=getAdapterPosition();
                    String food=WebDataSource.getProductName(pos);
                    Toast.makeText(itemView.getContext(), "使用者點選了第"+(pos+1)+"個品項："+food, Toast.LENGTH_SHORT).show();
                }
            });
            itemView.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View view) {
                    Toast.makeText(itemView.getContext(), "這是長按觸發的行為", Toast.LENGTH_SHORT).show();
                    return false;
                }
            });

        }
    /*
        public ImageView getFoodImg() {
            return foodImg;
        }

        public TextView getTx1() {
            return tx1;
        }

        public TextView getTx2() {
            return tx2;
        }

        public TextView getTx3() {
            return tx3;
        }

        public TextView getTx4() {
            return tx4;
        }

     */

        public ImageView getFoodImg() {
            return foodImg;
        }

        public TextView getT1() {
            return t1;
        }

        public TextView getT2() {
            return t2;
        }
    }

}
