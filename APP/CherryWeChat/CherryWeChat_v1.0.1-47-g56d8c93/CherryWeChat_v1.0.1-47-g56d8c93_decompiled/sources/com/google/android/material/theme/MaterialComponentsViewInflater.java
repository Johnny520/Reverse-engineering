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
    @Override // p000.C2613v4
    /* JADX INFO: renamed from: a */
    public final C1306d3 mo2499a(Context context, AttributeSet attributeSet) {
        return new C0076Bq(context, attributeSet);
    }

    @Override // p000.C2613v4
    /* JADX INFO: renamed from: b */
    public final C1393f3 mo2500b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p000.C2613v4
    /* JADX INFO: renamed from: c */
    public final C1481h3 mo2501c(Context context, AttributeSet attributeSet) {
        return new C0678Pq(context, attributeSet);
    }

    @Override // p000.C2613v4
    /* JADX INFO: renamed from: d */
    public final C0692Q3 mo2502d(Context context, AttributeSet attributeSet) {
        C0849Tq c0849Tq = new C0849Tq(AbstractC0148Dc.m291y(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0849Tq.getContext();
        TypedArray typedArrayM2534G = AbstractC1293cr.m2534G(context2, attributeSet, AbstractC0939Vu.f2948q, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM2534G.hasValue(0)) {
            c0849Tq.setButtonTintList(AbstractC0828TB.m1643j(context2, typedArrayM2534G, 0));
        }
        c0849Tq.f2696f = typedArrayM2534G.getBoolean(1, false);
        typedArrayM2534G.recycle();
        return c0849Tq;
    }

    @Override // p000.C2613v4
    /* JADX INFO: renamed from: e */
    public final C2304o4 mo2503e(Context context, AttributeSet attributeSet) {
        C1107Zq c1107Zq = new C1107Zq(AbstractC0148Dc.m291y(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c1107Zq.getContext();
        if (AbstractC1293cr.m2538Q(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0939Vu.f2952u;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iM2030g = C1107Zq.m2030g(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM2030g == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0939Vu.f2951t);
                    int iM2030g2 = C1107Zq.m2030g(c1107Zq.getContext(), typedArrayObtainStyledAttributes3, 2, 4);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM2030g2 >= 0) {
                        c1107Zq.setLineHeight(iM2030g2);
                    }
                }
            }
        }
        return c1107Zq;
    }
}
