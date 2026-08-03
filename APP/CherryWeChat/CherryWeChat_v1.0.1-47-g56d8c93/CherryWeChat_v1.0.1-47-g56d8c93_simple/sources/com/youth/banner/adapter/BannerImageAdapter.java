package com.youth.banner.adapter;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.youth.banner.holder.BannerImageHolder;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class BannerImageAdapter<T> extends BannerAdapter<T, BannerImageHolder> {
    public BannerImageAdapter(List<T> r1) {
        super(r1);
    }

    @Override // com.youth.banner.holder.IViewHolder
    public /* bridge */ /* synthetic */ Object onCreateHolder(ViewGroup r1, int r2) {
        return onCreateHolder(r1, r2);
    }

    @Override // com.youth.banner.holder.IViewHolder
    public BannerImageHolder onCreateHolder(ViewGroup r2, int r3) {
        ImageView r32 = new ImageView(r2.getContext());
        r32.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        r32.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return new BannerImageHolder(r32);
    }
}
