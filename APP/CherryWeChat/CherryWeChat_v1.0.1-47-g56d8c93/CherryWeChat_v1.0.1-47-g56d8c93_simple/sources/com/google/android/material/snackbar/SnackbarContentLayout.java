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

    public SnackbarContentLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        AbstractC0714Qj.m1474E(r2, R.attr.motionEasingEmphasizedInterpolator, AbstractC0776S2.f2454b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2472a(int r4, int r5, int r6) {
        if (r4 == getOrientation()) goto L5;
        setOrientation(r4);
        boolean r42 = true;
    L7:
        if (this.f4585a.getPaddingTop() == r5) goto L9;
    L12:
        TextView r43 = this.f4585a;
        if (r43.isPaddingRelative() == false) goto L16;
        r43.setPaddingRelative(r43.getPaddingStart(), r5, r43.getPaddingEnd(), r6);
        return true;
    L16:
        r43.setPadding(r43.getPaddingLeft(), r5, r43.getPaddingRight(), r6);
        return true;
    L9:
        if (this.f4585a.getPaddingBottom() != r6) goto L12;
        return r42;
    L5:
        r42 = false;
        goto L7
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
    public final void onMeasure(int r8, int r9) {
        super.onMeasure(r8, r9);
        if (getOrientation() == 1) goto L28;
        int r0 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int r2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout r3 = this.f4585a.getLayout();
        if (r3 != null) goto L8;
    L10:
        boolean r32 = false;
    L11:
        if (r32 == true) goto L13;
    L19:
        if (r32 == true) goto L23;
        r0 = r2;
    L23:
        if (m2472a(0, r0, r0) == false) goto L27;
    L24:
        super.onMeasure(r8, r9);
        return;
    L27:
        return;
    L13:
        if (this.f4587c <= 0) goto L19;
        if (this.f4586b.getMeasuredWidth() <= this.f4587c) goto L19;
        if (m2472a(1, r0, r0 - r2) == true) goto L24;
        return;
    L8:
        if (r3.getLineCount() <= 1) goto L10;
        r32 = true;
        goto L11
    }

    public void setMaxInlineActionWidth(int r1) {
        this.f4587c = r1;
    }
}
