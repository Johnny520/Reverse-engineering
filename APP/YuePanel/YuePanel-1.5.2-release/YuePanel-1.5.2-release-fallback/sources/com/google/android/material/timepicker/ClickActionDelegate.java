package com.google.android.material.timepicker;

/* JADX INFO: loaded from: classes.dex */
class ClickActionDelegate extends Yue.C0104 {
    private final Yue.C0140.C0141 clickAction;

    public ClickActionDelegate(android.content.Context r3, int r4) {
            r2 = this;
            r2.<init>()
            Yue.ۥ۟۟ۥۧ$ۥ r0 = new Yue.ۥ۟۟ۥۧ$ۥ
            r1 = 16
            java.lang.String r3 = r3.getString(r4)
            r0.<init>(r1, r3)
            r2.clickAction = r0
            return
    }

    @Override // Yue.C0104
    public void onInitializeAccessibilityNodeInfo(android.view.View r1, Yue.C0140 r2) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1, r2)
            Yue.ۥ۟۟ۥۧ$ۥ r1 = r0.clickAction
            r2.m627(r1)
            return
    }
}
