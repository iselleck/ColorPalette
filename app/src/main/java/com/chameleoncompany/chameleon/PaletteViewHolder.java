package com.chameleoncompany.chameleon;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
;

/**
 * Created by Isaac on 9/24/2015.
 */
public class PaletteViewHolder extends RecyclerView.ViewHolder {
    protected Button titleText;
    protected Button contentText;

    protected Button s3, s4, s5;

    protected CardView card;

    public PaletteViewHolder(View itemView){
        super(itemView);
        titleText = (Button) itemView.findViewById(R.id.name);
        contentText = (Button) itemView.findViewById(R.id.hexValue);
        s3 = (Button) itemView.findViewById(R.id.swatch3);
        s4 = (Button) itemView.findViewById(R.id.swatch4);
        s5 = (Button) itemView.findViewById(R.id.swatch5);
        card = (CardView) itemView;
    }
}
