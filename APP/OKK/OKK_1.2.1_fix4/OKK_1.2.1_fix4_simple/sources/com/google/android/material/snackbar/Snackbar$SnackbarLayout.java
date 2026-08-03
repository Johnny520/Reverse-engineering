package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import p092z0.AbstractC1145c;

/* JADX INFO: loaded from: classes.dex */
public final class Snackbar$SnackbarLayout extends AbstractC1145c {
    public Snackbar$SnackbarLayout(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // p092z0.AbstractC1145c, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r6, int r7) {
        super.onMeasure(r6, r7);
        int r62 = getChildCount();
        int r72 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int r02 = 0;
    L3:
        if (r02 >= r62) goto L8;
        View r1 = getChildAt(r02);
        if (r1.getLayoutParams().width != (-1)) goto L7;
        r1.measure(View.MeasureSpec.makeMeasureSpec(r72, 1073741824), View.MeasureSpec.makeMeasureSpec(r1.getMeasuredHeight(), 1073741824));
    L7:
        r02 = r02 + 1;
        goto L3
    }

    @Override // p092z0.AbstractC1145c, android.view.View
    public /* bridge */ /* synthetic */ void setBackground(Drawable r1) {
        super.setBackground(r1);
    }

    @Override // p092z0.AbstractC1145c, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundDrawable(Drawable r1) {
        super.setBackgroundDrawable(r1);
    }

    @Override // p092z0.AbstractC1145c, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintList(ColorStateList r1) {
        super.setBackgroundTintList(r1);
    }

    @Override // p092z0.AbstractC1145c, android.view.View
    public /* bridge */ /* synthetic */ void setBackgroundTintMode(PorterDuff.Mode r1) {
        super.setBackgroundTintMode(r1);
    }

    @Override // p092z0.AbstractC1145c, android.view.View
    public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams r1) {
        super.setLayoutParams(r1);
    }

    @Override // p092z0.AbstractC1145c, android.view.View
    public /* bridge */ /* synthetic */ void setOnClickListener(View.OnClickListener r1) {
        super.setOnClickListener(r1);
    }
}
