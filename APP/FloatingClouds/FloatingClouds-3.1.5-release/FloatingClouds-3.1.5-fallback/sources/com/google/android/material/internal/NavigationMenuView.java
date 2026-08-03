package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuView extends androidx.recyclerview.widget.RecyclerView implements androidx.appcompat.view.menu.k {
    public NavigationMenuView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
            r3 = 1
            r2.<init>(r3)
            r1.setLayoutManager(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.k
    public final void c(androidx.appcompat.view.menu.f r1) {
            r0 = this;
            return
    }

    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }
}
