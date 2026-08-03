package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.lang.reflect.Field;
import org.luckypray.dexkit.C1031R;
import p006D.AbstractC0080Q;
import p056f0.AbstractC0805P;
import p060h0.AbstractC0945a;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public TextView f2432a;

    /* JADX INFO: renamed from: b */
    public Button f2433b;

    /* JADX INFO: renamed from: c */
    public int f2434c;

    public SnackbarContentLayout(Context r2, AttributeSet r3) {
        super(r2, r3);
        AbstractC0805P.m2039S(r2, C1031R.attr.motionEasingEmphasizedInterpolator, AbstractC0945a.f3355b);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1886a(int r4, int r5, int r6) {
        if (r4 == getOrientation()) goto L5;
        setOrientation(r4);
        boolean r42 = true;
    L7:
        if (this.f2432a.getPaddingTop() == r5) goto L9;
    L12:
        TextView r43 = this.f2432a;
        Field r02 = AbstractC0080Q.f219a;
        if (r43.isPaddingRelative() == false) goto L15;
        r43.setPaddingRelative(r43.getPaddingStart(), r5, r43.getPaddingEnd(), r6);
        return true;
    L15:
        r43.setPadding(r43.getPaddingLeft(), r5, r43.getPaddingRight(), r6);
        return true;
    L9:
        if (this.f2432a.getPaddingBottom() != r6) goto L12;
        return r42;
    L5:
        r42 = false;
        goto L7
    }

    public Button getActionView() {
        return this.f2433b;
    }

    public TextView getMessageView() {
        return this.f2432a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2432a = (TextView) findViewById(C1031R.id.snackbar_text);
        this.f2433b = (Button) findViewById(C1031R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int r8, int r9) {
        super.onMeasure(r8, r9);
        if (getOrientation() != 1) goto L5;
        return;
    L5:
        int r02 = getResources().getDimensionPixelSize(C1031R.dimen.design_snackbar_padding_vertical_2lines);
        int r2 = getResources().getDimensionPixelSize(C1031R.dimen.design_snackbar_padding_vertical);
        Layout r3 = this.f2432a.getLayout();
        if (r3 != null) goto L8;
    L10:
        boolean r32 = false;
    L11:
        if (r32 == true) goto L13;
    L19:
        if (r32 == true) goto L23;
        r02 = r2;
    L23:
        if (m1886a(0, r02, r02) == false) goto L27;
    L24:
        super.onMeasure(r8, r9);
        return;
    L27:
        return;
    L13:
        if (this.f2434c <= 0) goto L19;
        if (this.f2433b.getMeasuredWidth() <= this.f2434c) goto L19;
        if (m1886a(1, r02, r02 - r2) == true) goto L24;
        return;
    L8:
        if (r3.getLineCount() <= 1) goto L10;
        r32 = true;
        goto L11
    }

    public void setMaxInlineActionWidth(int r1) {
        this.f2434c = r1;
    }
}
