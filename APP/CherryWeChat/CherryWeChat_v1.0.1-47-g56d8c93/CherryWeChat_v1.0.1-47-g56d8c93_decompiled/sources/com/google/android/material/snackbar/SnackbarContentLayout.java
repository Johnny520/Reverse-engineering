package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import p000.AbstractC0714Qj;
import p000.AbstractC0776S2;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f4585a;

    /* JADX INFO: renamed from: b */
    public Button f4586b;

    /* JADX INFO: renamed from: c */
    public int f4587c;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0714Qj.m1474E(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2454b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2472a(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f4585a.getPaddingTop() == i2 && this.f4585a.getPaddingBottom() == i3) {
            return z;
        }
        TextView textView = this.f4585a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f4586b;
    }

    public TextView getMessageView() {
        return this.f4585a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f4585a = (TextView) findViewById(R.id.snackbar_text);
        this.f4586b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f4585a.getLayout();
        boolean z = layout != null && layout.getLineCount() > 1;
        if (!z || this.f4587c <= 0 || this.f4586b.getMeasuredWidth() <= this.f4587c) {
            if (!z) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m2472a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m2472a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f4587c = i;
    }
}
