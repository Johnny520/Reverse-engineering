package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p000.InterfaceC0292Gr;
import p000.MenuC2204lr;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements InterfaceC0292Gr {
    public NavigationMenuView(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    @Override // p000.InterfaceC0292Gr
    /* JADX INFO: renamed from: b */
    public final void mo591b(MenuC2204lr r1) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
