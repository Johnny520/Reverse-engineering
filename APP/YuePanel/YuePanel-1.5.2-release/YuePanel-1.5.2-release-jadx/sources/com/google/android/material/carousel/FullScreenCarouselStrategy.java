package com.google.android.material.carousel;

import Yue.InterfaceC6391;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class FullScreenCarouselStrategy extends CarouselStrategy {
    @Override // com.google.android.material.carousel.CarouselStrategy
    @InterfaceC6391
    public KeylineState onFirstChildMeasuredWithMargins(@InterfaceC6391 Carousel carousel, @InterfaceC6391 View view) {
        float containerHeight;
        int i;
        int i2;
        RecyclerView.C8922 c8922 = (RecyclerView.C8922) view.getLayoutParams();
        if (carousel.isHorizontal()) {
            containerHeight = carousel.getContainerWidth();
            i = ((ViewGroup.MarginLayoutParams) c8922).leftMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c8922).rightMargin;
        } else {
            containerHeight = carousel.getContainerHeight();
            i = ((ViewGroup.MarginLayoutParams) c8922).topMargin;
            i2 = ((ViewGroup.MarginLayoutParams) c8922).bottomMargin;
        }
        float f = i + i2;
        return CarouselStrategyHelper.createLeftAlignedKeylineState(view.getContext(), f, containerHeight, new Arrangement(0, 0.0f, 0.0f, 0.0f, 0, 0.0f, 0, Math.min(containerHeight + f, containerHeight), 1, containerHeight));
    }
}
