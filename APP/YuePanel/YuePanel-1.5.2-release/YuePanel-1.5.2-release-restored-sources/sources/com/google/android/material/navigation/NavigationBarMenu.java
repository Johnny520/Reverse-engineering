package com.google.android.material.navigation;

import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.C8697;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public final class NavigationBarMenu extends C8694 {
    private final int maxItemCount;

    @InterfaceC6391
    private final Class<?> viewClass;

    public NavigationBarMenu(@InterfaceC6391 Context context, @InterfaceC6391 Class<?> cls, int i) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
    }

    @Override // androidx.appcompat.view.menu.C8694
    @InterfaceC6391
    public MenuItem addInternal(int i, int i2, int i3, @InterfaceC6391 CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
            if (menuItemAddInternal instanceof C8697) {
                ((C8697) menuItemAddInternal).m29044(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.maxItemCount + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.C8694, android.view.Menu
    @InterfaceC6391
    public SubMenu addSubMenu(int i, int i2, int i3, @InterfaceC6391 CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName() + " does not support submenus");
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
