package com.example.foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private Context context;
    private List<String> categoryList;
    private Fragment parentFragment;

    public CategoryAdapter(Context context, List<String> categories, Fragment parentFragment) {
        this.context = context;
        this.categoryList = categories;
        this.parentFragment = parentFragment;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_card_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        String category = categoryList.get(position);
        holder.itemTitle.setText(category);
        holder.itemImage.setImageResource(R.drawable.ic_launcher_foreground);
        holder.itemView.setOnClickListener(view -> {
            FragmentTransaction transaction = parentFragment.getActivity().getSupportFragmentManager().beginTransaction();
            transaction.replace(parentFragment.getId(), new MealDetailsFragment());
            transaction.addToBackStack(null);
            transaction.commit();
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }

    public static class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView itemTitle;
        ImageView itemImage;
        public CategoryViewHolder(View itemView) {
            super(itemView);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            itemImage = itemView.findViewById(R.id.itemImage);        }
    }
}
