package com.chameleoncompany.chameleon;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Isaac on 9/24/2015.
 */
public class cycleViewAdapter extends RecyclerView.Adapter<PaletteViewHolder> {
    private List<Palette> palettes;

    public cycleViewAdapter(List<Palette> palettes){
        this.palettes = new ArrayList<Palette>();
        this.palettes.addAll(palettes);
    }

    @Override
    public PaletteViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.card_view, viewGroup, false);

        return new PaletteViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PaletteViewHolder paletteViewHolder, int i) {
        Palette palette = palettes.get(i);
        paletteViewHolder.titleText.setText(palette.getName());
        paletteViewHolder.contentText.setText(palette.getHexValue());

        paletteViewHolder.titleText.setBackgroundColor(palette.getIntValue());
        paletteViewHolder.contentText.setBackgroundColor(palette.getVal());
        paletteViewHolder.s3.setBackgroundColor(palette.getS3());
        paletteViewHolder.s4.setBackgroundColor(palette.getS4());
        paletteViewHolder.s5.setBackgroundColor(palette.getS5());




    }

    @Override
    public int getItemCount() {
        return palettes.size();
    }
}
