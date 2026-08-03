package com.google.android.material.bottomnavigation;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20022})
public class BottomNavigationItemView extends com.google.android.material.navigation.NavigationBarItemView {
    public BottomNavigationItemView(@Yue.InterfaceC4410 android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @Yue.InterfaceC1848
    public int getItemDefaultMarginResId() {
            r1 = this;
            int r0 = com.google.android.material.R.dimen.design_bottom_navigation_margin
            return r0
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @Yue.InterfaceC3573
    public int getItemLayoutResId() {
            r1 = this;
            int r0 = com.google.android.material.R.layout.design_bottom_navigation_item
            return r0
    }
}
