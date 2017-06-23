package com.example.bruce.patient2patient;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by bruce on 6/22/17.
 */

public class FavoriteAdapter extends RecyclerView.Adapter<FavoriteAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Person> favoriteList;

    public FavoriteAdapter(Context mContext, ArrayList<Person> favoriteList) {
        this.mContext = mContext;
        this.favoriteList = favoriteList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View contactView = inflater.inflate(R.layout.recycler_chat, parent, false);

        return new ViewHolder(contactView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final Person currFavorite = favoriteList.get(position);
        holder.descriptionView.setText(currFavorite.getDescription());
        holder.usernameView.setText(currFavorite.getUsername());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to their profile view
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView usernameView, descriptionView;

        public ViewHolder(View itemView) {
            super(itemView);
            usernameView = (TextView) itemView.findViewById(R.id.username);
            descriptionView = (TextView) itemView.findViewById(R.id.last_message);
        }
    }
}