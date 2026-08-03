package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.C1247R;
import java.util.WeakHashMap;
import p000a.C0181Jg;
import p000a.C0866ug;
import p000a.C0888w0;
import p000a.C0899wb;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f5872a;

    /* JADX INFO: renamed from: b */
    public Button f5873b;

    /* JADX INFO: renamed from: c */
    public int f5874c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0899wb.m2188d(context, C1247R.attr.motionEasingEmphasizedInterpolator, C0888w0.f3469b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3255a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f5872a.getPaddingTop() == i2 && this.f5872a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f5872a;
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f5873b;
    }

    public TextView getMessageView() {
        return this.f5872a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f5872a = (TextView) findViewById(C1247R.id.snackbar_text);
        this.f5873b = (Button) findViewById(C1247R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(C1247R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C1247R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f5872a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f5874c <= 0 || this.f5873b.getMeasuredWidth() <= this.f5874c) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m3255a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m3255a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f5874c = i;
    }
}
