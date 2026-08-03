package com.google.android.material.timepicker;

import Yue.C3024;
import Yue.C3055;
import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ClickActionDelegate extends C3024 {
    private final C3055.C0034 clickAction;

    public ClickActionDelegate(Context context, int i) {
        this.clickAction = new C3055.C0034(16, context.getString(i));
    }

    @Override // Yue.C3024
    public void onInitializeAccessibilityNodeInfo(View view, C3055 c3055) {
        super.onInitializeAccessibilityNodeInfo(view, c3055);
        c3055.m119(this.clickAction);
    }
}
