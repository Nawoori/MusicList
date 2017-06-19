package com.nawoori.android.musiclist;

import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by User on 2017-06-19.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.Holder>{


    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
    if(context == null)
        context = prent.getContext();
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class Holder extends RecyclerView.ViewHolder {
        public int posotion;
        public Uri musicUri;
        public final View mView;

        public Holder(View view) {
            super(view);
            mView = view;


        }
    }

}
