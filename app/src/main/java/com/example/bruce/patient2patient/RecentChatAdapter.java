package com.example.bruce.patient2patient;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;

import java.util.ArrayList;

/**
 * Created by bruce on 6/22/17.
 */

public class RecentChatAdapter extends RecyclerView.Adapter<RecentChatAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Chat> chatArrayList;

    public RecentChatAdapter(Context mContext, ArrayList<Chat> currentChat) {
        this.mContext = mContext;

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
        final Chat currChat = chatArrayList.get(position);
        holder.lastMessageView.setText(currChat.lastMessage);
        holder.usernameView.setText(currChat.getChater().getUsername());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go to chat view
            }
        });

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        TextView usernameView, lastMessageView;

        public ViewHolder(View itemView) {
            super(itemView);
            usernameView = (TextView) itemView.findViewById(R.id.username);
            lastMessageView = (TextView) itemView.findViewById(R.id.last_message);
        }
    }
}
