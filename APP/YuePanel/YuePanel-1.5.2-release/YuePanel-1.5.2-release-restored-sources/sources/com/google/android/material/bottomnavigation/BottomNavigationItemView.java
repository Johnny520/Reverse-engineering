package com.google.android.material.bottomnavigation;

import Yue.InterfaceC4398;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.content.Context;
import com.google.android.material.C1980R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
public class BottomNavigationItemView extends NavigationBarItemView {
    public BottomNavigationItemView(@InterfaceC6391 Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @InterfaceC4398
    public int getItemDefaultMarginResId() {
        return C1980R.dimen.design_bottom_navigation_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @InterfaceC5683
    public int getItemLayoutResId() {
        return C1980R.layout.design_bottom_navigation_item;
    }
}
