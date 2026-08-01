package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.ljx.wechatmod.R;
import defpackage.a80;
import defpackage.ct;
import defpackage.cu;
import defpackage.e4;
import defpackage.ff;
import defpackage.g5;
import defpackage.gt;
import defpackage.gu;
import defpackage.jt;
import defpackage.q5;
import defpackage.u2;
import defpackage.w2;
import defpackage.wb;
import defpackage.wy;
import defpackage.xt;
import defpackage.y2;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends q5 {
    public MaterialComponentsViewInflater() {
    }

    @Override // defpackage.q5
    public final u2 a(Context r2, AttributeSet r3) {
        return new jt(r2, r3);
    }

    @Override // defpackage.q5
    public final w2 b(Context r2, AttributeSet r3) {
        return new MaterialButton(r2, r3);
    }

    @Override // defpackage.q5
    public final y2 c(Context r2, AttributeSet r3) {
        return new xt(r2, r3);
    }

    @Override // defpackage.q5
    public final e4 d(Context r9, AttributeSet r10) {
        cu r0 = new cu(ff.W(r9, r10, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), r10);
        Context r2 = r0.getContext();
        int[] r4 = wy.o;
        TypedArray r102 = a80.u(r2, r10, r4, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (r102.hasValue(0) == false) goto L5;
        wb.c(r0, ct.n(r2, r102, 0));
    L5:
        r0.f = r102.getBoolean(1, false);
        r102.recycle();
        return r0;
    }

    @Override // defpackage.q5
    public final g5 e(Context r10, AttributeSet r11) {
        gu r0 = new gu(ff.W(r10, r11, android.R.attr.textViewStyle, 0), r11, android.R.attr.textViewStyle);
        Context r102 = r0.getContext();
        if (gt.z(r102, R.attr.textAppearanceLineHeightEnabled, true) == false) goto L12;
        Resources.Theme r3 = r102.getTheme();
        int[] r5 = wy.r;
        TypedArray r6 = r3.obtainStyledAttributes(r11, r5, android.R.attr.textViewStyle, 0);
        int r103 = gu.f(r102, r6, new int[]{1, 2});
        r6.recycle();
        if (r103 != (-1)) goto L12;
        TypedArray r104 = r3.obtainStyledAttributes(r11, r5, android.R.attr.textViewStyle, 0);
        int r112 = r104.getResourceId(0, -1);
        r104.recycle();
        if (r112 == (-1)) goto L12;
        TypedArray r105 = r3.obtainStyledAttributes(r112, wy.q);
        int r113 = gu.f(r0.getContext(), r105, new int[]{1, 2});
        r105.recycle();
        if (r113 < 0) goto L12;
        r0.setLineHeight(r113);
    L12:
        return r0;
    }
}
