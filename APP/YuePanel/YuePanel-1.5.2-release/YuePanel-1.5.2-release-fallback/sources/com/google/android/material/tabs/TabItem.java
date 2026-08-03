package com.google.android.material.tabs;

/* JADX INFO: loaded from: classes.dex */
public class TabItem extends android.view.View {
    public final int customLayout;
    public final android.graphics.drawable.Drawable icon;
    public final java.lang.CharSequence text;

    public TabItem(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TabItem(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int[] r0 = com.google.android.material.R.styleable.TabItem
            Yue.ۥۢۡۥۦ r2 = Yue.C6264.m23338(r2, r3, r0)
            int r3 = com.google.android.material.R.styleable.TabItem_android_text
            java.lang.CharSequence r3 = r2.m23363(r3)
            r1.text = r3
            int r3 = com.google.android.material.R.styleable.TabItem_android_icon
            android.graphics.drawable.Drawable r3 = r2.m23347(r3)
            r1.icon = r3
            int r3 = com.google.android.material.R.styleable.TabItem_android_layout
            r0 = 0
            int r3 = r2.m23360(r3, r0)
            r1.customLayout = r3
            r2.m23371()
            return
    }
}
