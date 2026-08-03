package com.google.android.material.tabs;

import Yue.C7837;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
public class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public TabItem(Context context) {
        this(context, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C7837 c7837M24868 = C7837.m24868(context, attributeSet, C1980R.styleable.TabItem);
        this.text = c7837M24868.m24891(C1980R.styleable.TabItem_android_text);
        this.icon = c7837M24868.m24875(C1980R.styleable.TabItem_android_icon);
        this.customLayout = c7837M24868.m24888(C1980R.styleable.TabItem_android_layout, 0);
        c7837M24868.m24899();
    }
}
