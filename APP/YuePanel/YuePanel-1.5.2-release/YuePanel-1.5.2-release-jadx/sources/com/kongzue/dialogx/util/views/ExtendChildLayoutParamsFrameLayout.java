package com.kongzue.dialogx.util.views;

import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendChildLayoutParamsFrameLayout extends FrameLayout {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ExtendChildLayoutParamsFrameLayout(@InterfaceC6391 Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        setLayoutParams(new RelativeLayout.LayoutParams(layoutParams.width, layoutParams.height));
        super.addView(view, i, layoutParams);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ExtendChildLayoutParamsFrameLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExtendChildLayoutParamsFrameLayout(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
