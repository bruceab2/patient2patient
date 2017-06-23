package com.example.bruce.patient2patient;

/**
 * Created by bruce on 6/22/17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFragmentChats extends Fragment {


    private RecyclerView mRecyclerView;
   // private AccountStatementAdapter mAccountStatementAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

  //  @Override
   /* public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab_fragment_chats, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view_chat);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(layoutManager);
        LayoutInflater layoutInflater = getLayoutInflater();
        View relView = layoutInflater.inflate(R.layout.item_account_transaction, null);
        mAccountStatementAdapter = new AccountStatementAdapter(this, currAccount, ID);
        mRecyclerView.setAdapter(mAccountStatementAdapter);


        return rootView;
    }*/

}
