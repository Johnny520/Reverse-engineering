package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;
import p000.AbstractC0274gu;
import p000.AbstractC0618q2;
import p000.oa0;
import p000.y90;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1093a;

    /* JADX INFO: renamed from: b */
    public Button f1094b;

    /* JADX INFO: renamed from: c */
    public int f1095c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0274gu.m1303F(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0618q2.f3771b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m724a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f1093a.getPaddingTop() == i2 && this.f1093a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f1093a;
        WeakHashMap weakHashMap = oa0.f3426a;
        if (y90.m2735g(textView)) {
            y90.m2739k(textView, y90.m2734f(textView), i2, y90.m2733e(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f1094b;
    }

    public TextView getMessageView() {
        return this.f1093a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1093a = (TextView) findViewById(R.id.snackbar_text);
        this.f1094b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f1093a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f1095c <= 0 || this.f1094b.getMeasuredWidth() <= this.f1095c) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m724a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m724a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f1095c = i;
    }
}
