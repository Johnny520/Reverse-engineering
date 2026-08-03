package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class NavigationMenu extends C8694 {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.C8694, android.view.Menu
    @InterfaceC6391
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C8697 c8697 = (C8697) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, c8697);
        c8697.m29048(navigationSubMenu);
        return navigationSubMenu;
    }
}
