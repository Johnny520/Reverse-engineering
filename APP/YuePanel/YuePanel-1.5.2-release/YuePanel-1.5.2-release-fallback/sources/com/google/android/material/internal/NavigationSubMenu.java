package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class NavigationSubMenu extends androidx.appcompat.view.menu.SubMenuC7359 {
    public NavigationSubMenu(android.content.Context r1, com.google.android.material.internal.NavigationMenu r2, androidx.appcompat.view.menu.C7348 r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.appcompat.view.menu.C7343
    public void onItemsChanged(boolean r2) {
            r1 = this;
            super.onItemsChanged(r2)
            android.view.Menu r0 = r1.getParentMenu()
            androidx.appcompat.view.menu.ۥ۟۟۟۟ r0 = (androidx.appcompat.view.menu.C7343) r0
            r0.onItemsChanged(r2)
            return
    }
}
