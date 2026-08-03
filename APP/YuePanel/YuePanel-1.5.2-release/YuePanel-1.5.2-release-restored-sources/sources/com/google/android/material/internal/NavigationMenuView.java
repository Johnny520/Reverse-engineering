package com.google.android.material.internal;

import Yue.InterfaceC7144;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.view.menu.C8694;
import androidx.appcompat.view.menu.InterfaceC8700;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class NavigationMenuView extends RecyclerView implements InterfaceC8700 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NavigationMenuView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700
    public int getWindowAnimations() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC8700
    public void initialize(C8694 c8694) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
