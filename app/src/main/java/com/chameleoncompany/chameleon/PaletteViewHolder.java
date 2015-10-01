package com.chameleoncompany.chameleon;

import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;

;

/**
 * Created by Isaac on 9/24/2015.
 */
public class PaletteViewHolder extends RecyclerView.ViewHolder {
    protected TextView titleText;
    protected TextView contentText;

    protected TextView s1,s3, s4, s5;

    protected CardView card;
    public int pos;


    public PaletteViewHolder(final View itemView){
        super(itemView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                itemView.getContext().startActivity(new Intent(itemView.getContext(), inspectActivity.class));
            }
        });

        titleText = (TextView) itemView.findViewById(R.id.name);
        s1 = (TextView) itemView.findViewById(R.id.swatch1);
        contentText = (TextView) itemView.findViewById(R.id.hexValue);
        s3 = (TextView) itemView.findViewById(R.id.swatch3);
        s4 = (TextView) itemView.findViewById(R.id.swatch4);
        s5 = (TextView) itemView.findViewById(R.id.swatch5);
        card = (CardView) itemView;
    }

}









