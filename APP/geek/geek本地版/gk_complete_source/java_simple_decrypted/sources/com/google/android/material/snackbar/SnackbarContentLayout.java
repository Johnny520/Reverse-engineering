package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ljx.wechatmod.R;
import defpackage.ct;
import defpackage.ja0;
import defpackage.q2;
import defpackage.t90;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {
    public TextView a;
    public Button b;
    public int c;

    public SnackbarContentLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        ct.w(r2, R.attr.motionEasingEmphasizedInterpolator, q2.b);
    }

    public final boolean a(int r4, int r5, int r6) {
        if (r4 == getOrientation()) goto L5;
        setOrientation(r4);
        boolean r42 = true;
    L7:
        if (this.a.getPaddingTop() == r5) goto L9;
    L12:
        TextView r43 = this.a;
        WeakHashMap r0 = ja0.a;
        if (t90.g(r43) == false) goto L16;
        t90.k(r43, t90.f(r43), r5, t90.e(r43), r6);
        return true;
    L16:
        r43.setPadding(r43.getPaddingLeft(), r5, r43.getPaddingRight(), r6);
        return true;
    L9:
        if (this.a.getPaddingBottom() != r6) goto L12;
        return r42;
    L5:
        r42 = false;
        goto L7
    }

    public Button getActionView() {
        return this.b;
    }

    public TextView getMessageView() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (TextView) findViewById(R.id.snackbar_text);
        this.b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
        super.onMeasure(r8, r9);
        if (getOrientation() == 1) goto L28;
        int r0 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int r2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout r3 = this.a.getLayout();
        if (r3 != null) goto L8;
    L10:
        boolean r32 = false;
    L11:
        if (r32 == true) goto L13;
    L19:
        if (r32 == true) goto L23;
        r0 = r2;
    L23:
        if (a(0, r0, r0) == false) goto L27;
    L24:
        super.onMeasure(r8, r9);
        return;
    L27:
        return;
    L13:
        if (this.c <= 0) goto L19;
        if (this.b.getMeasuredWidth() <= this.c) goto L19;
        if (a(1, r0, r0 - r2) == true) goto L24;
        return;
    L8:
        if (r3.getLineCount() <= 1) goto L10;
        r32 = true;
        goto L11
    }

    public void setMaxInlineActionWidth(int r1) {
        this.c = r1;
    }
}
