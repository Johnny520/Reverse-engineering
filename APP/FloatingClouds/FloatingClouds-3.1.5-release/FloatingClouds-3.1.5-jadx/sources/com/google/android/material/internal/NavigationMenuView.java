package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C0998f;
import androidx.appcompat.view.menu.InterfaceC1003k;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC1003k {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // androidx.appcompat.view.menu.InterfaceC1003k
    /* JADX INFO: renamed from: c */
    public final void mo2305c(C0998f c0998f) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
