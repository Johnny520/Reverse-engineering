package com.youth.banner.holder;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public interface IViewHolder<T, VH> {
    void onBindView(VH r1, T r2, int r3, int r4);

    VH onCreateHolder(ViewGroup r1, int r2);
}
