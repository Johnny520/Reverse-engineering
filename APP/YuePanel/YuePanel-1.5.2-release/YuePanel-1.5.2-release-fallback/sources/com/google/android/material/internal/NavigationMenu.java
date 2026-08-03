package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class NavigationMenu extends androidx.appcompat.view.menu.C7343 {
    public NavigationMenu(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // androidx.appcompat.view.menu.C7343, android.view.Menu
    @Yue.InterfaceC4410
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.addInternal(r1, r2, r3, r4)
            androidx.appcompat.view.menu.ۥ۟۟۟ۢ r1 = (androidx.appcompat.view.menu.C7348) r1
            com.google.android.material.internal.NavigationSubMenu r2 = new com.google.android.material.internal.NavigationSubMenu
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3, r0, r1)
            r1.m28238(r2)
            return r2
    }
}
