package com.google.android.material.internal;

import Yue.InterfaceC7144;
import android.content.Context;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;
import androidx.appcompat.view.menu.SubMenuC8702;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class NavigationSubMenu extends SubMenuC8702 {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, C8697 c8697) {
        super(context, navigationMenu, c8697);
    }

    @Override // androidx.appcompat.view.menu.C8694
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((C8694) getParentMenu()).onItemsChanged(z);
    }
}
