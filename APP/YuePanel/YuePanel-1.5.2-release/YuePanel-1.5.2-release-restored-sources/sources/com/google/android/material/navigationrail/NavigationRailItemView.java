package com.google.android.material.navigationrail;

import Yue.InterfaceC4398;
import Yue.InterfaceC5683;
import Yue.InterfaceC6391;
import Yue.InterfaceC7144;
import android.content.Context;
import android.view.View;
import com.google.android.material.C1980R;
import com.google.android.material.navigation.NavigationBarItemView;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY_GROUP})
final class NavigationRailItemView extends NavigationBarItemView {
    public NavigationRailItemView(@InterfaceC6391 Context context) {
        super(context);
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @InterfaceC4398
    public int getItemDefaultMarginResId() {
        return C1980R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // com.google.android.material.navigation.NavigationBarItemView
    @InterfaceC5683
    public int getItemLayoutResId() {
        return C1980R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }
}
