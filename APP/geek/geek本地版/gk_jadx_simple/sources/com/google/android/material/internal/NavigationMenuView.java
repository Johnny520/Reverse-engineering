package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.fv;
import defpackage.ku;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends RecyclerView implements fv {
    public NavigationMenuView(Context r2, AttributeSet r3) {
        super(r2, r3, 0);
        setLayoutManager(new LinearLayoutManager(1));
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // defpackage.fv
    public final void b(ku r1) {
    }
}
