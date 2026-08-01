package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;
import p000.AbstractC0126ct;
import p000.AbstractC0619q2;
import p000.ja0;
import p000.t90;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f1168a;

    /* JADX INFO: renamed from: b */
    public Button f1169b;

    /* JADX INFO: renamed from: c */
    public int f1170c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0126ct.m825w(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0619q2.f3972b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m766a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f1168a.getPaddingTop() == i2 && this.f1168a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f1168a;
        WeakHashMap weakHashMap = ja0.f2600a;
        if (t90.m2370g(textView)) {
            t90.m2374k(textView, t90.m2369f(textView), i2, t90.m2368e(textView), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f1169b;
    }

    public TextView getMessageView() {
        return this.f1168a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1168a = (TextView) findViewById(R.id.snackbar_text);
        this.f1169b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f1168a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f1170c <= 0 || this.f1169b.getMeasuredWidth() <= this.f1170c) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m766a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m766a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f1170c = i;
    }
}
