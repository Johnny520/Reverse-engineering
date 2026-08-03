package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import io.github.cherrywechat.R;
import p000.AbstractC0148Dc;
import p000.AbstractC0828TB;
import p000.AbstractC0939Vu;
import p000.AbstractC1293cr;
import p000.C0076Bq;
import p000.C0678Pq;
import p000.C0692Q3;
import p000.C0849Tq;
import p000.C1107Zq;
import p000.C1306d3;
import p000.C1393f3;
import p000.C1481h3;
import p000.C2304o4;
import p000.C2613v4;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C2613v4 {
    public MaterialComponentsViewInflater() {
    }

    @Override // p000.C2613v4
    /* JADX INFO: renamed from: a */
    public final C1306d3 mo2499a(Context r2, AttributeSet r3) {
        return new C0076Bq(r2, r3);
    }

    @Override // p000.C2613v4
    /* JADX INFO: renamed from: b */
    public final C1393f3 mo2500b(Context r2, AttributeSet r3) {
        return new MaterialButton(r2, r3);
    }

    @Override // p000.C2613v4
    /* JADX INFO: renamed from: c */
    public final C1481h3 mo2501c(Context r2, AttributeSet r3) {
        return new C0678Pq(r2, r3);
    }

    @Override // p000.C2613v4
    /* JADX INFO: renamed from: d */
    public final C0692Q3 mo2502d(Context r9, AttributeSet r10) {
        C0849Tq r0 = new C0849Tq(AbstractC0148Dc.m291y(r9, r10, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), r10);
        Context r2 = r0.getContext();
        int[] r4 = AbstractC0939Vu.f2948q;
        TypedArray r102 = AbstractC1293cr.m2534G(r2, r10, r4, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (r102.hasValue(0) == false) goto L5;
        r0.setButtonTintList(AbstractC0828TB.m1643j(r2, r102, 0));
    L5:
        r0.f2696f = r102.getBoolean(1, false);
        r102.recycle();
        return r0;
    }

    @Override // p000.C2613v4
    /* JADX INFO: renamed from: e */
    public final C2304o4 mo2503e(Context r9, AttributeSet r10) {
        C1107Zq r0 = new C1107Zq(AbstractC0148Dc.m291y(r9, r10, android.R.attr.textViewStyle, 0), r10, android.R.attr.textViewStyle);
        Context r92 = r0.getContext();
        if (AbstractC1293cr.m2538Q(r92, R.attr.textAppearanceLineHeightEnabled, true) == false) goto L12;
        Resources.Theme r3 = r92.getTheme();
        int[] r5 = AbstractC0939Vu.f2952u;
        TypedArray r6 = r3.obtainStyledAttributes(r10, r5, android.R.attr.textViewStyle, 0);
        int r93 = C1107Zq.m2030g(r92, r6, new int[]{1, 2});
        r6.recycle();
        if (r93 != (-1)) goto L12;
        TypedArray r94 = r3.obtainStyledAttributes(r10, r5, android.R.attr.textViewStyle, 0);
        int r102 = r94.getResourceId(0, -1);
        r94.recycle();
        if (r102 == (-1)) goto L12;
        TypedArray r95 = r3.obtainStyledAttributes(r102, AbstractC0939Vu.f2951t);
        int r103 = C1107Zq.m2030g(r0.getContext(), r95, new int[]{2, 4});
        r95.recycle();
        if (r103 < 0) goto L12;
        r0.setLineHeight(r103);
    L12:
        return r0;
    }
}
