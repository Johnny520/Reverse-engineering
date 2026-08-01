package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.ljx.wechatmod.R;
import p000.AbstractC0168dz;
import p000.AbstractC0219fc;
import p000.AbstractC0259gf;
import p000.AbstractC0274gu;
import p000.AbstractC0493mp;
import p000.C0081bu;
import p000.C0174e4;
import p000.C0237fu;
import p000.C0249g5;
import p000.C0461lu;
import p000.C0534nt;
import p000.C0621q5;
import p000.C0766u2;
import p000.C0841w2;
import p000.C0915y2;
import p000.g80;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0621q5 {
    @Override // p000.C0621q5
    /* JADX INFO: renamed from: a */
    public final C0766u2 mo749a(Context context, AttributeSet attributeSet) {
        return new C0534nt(context, attributeSet);
    }

    @Override // p000.C0621q5
    /* JADX INFO: renamed from: b */
    public final C0841w2 mo750b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p000.C0621q5
    /* JADX INFO: renamed from: c */
    public final C0915y2 mo751c(Context context, AttributeSet attributeSet) {
        return new C0081bu(context, attributeSet);
    }

    @Override // p000.C0621q5
    /* JADX INFO: renamed from: d */
    public final C0174e4 mo752d(Context context, AttributeSet attributeSet) {
        C0237fu c0237fu = new C0237fu(AbstractC0259gf.m1245c0(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0237fu.getContext();
        TypedArray typedArrayM1170A = g80.m1170A(context2, attributeSet, AbstractC0168dz.f1452o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM1170A.hasValue(0)) {
            AbstractC0219fc.m1092c(c0237fu, AbstractC0274gu.m1315i(context2, typedArrayM1170A, 0));
        }
        c0237fu.f1839f = typedArrayM1170A.getBoolean(1, false);
        typedArrayM1170A.recycle();
        return c0237fu;
    }

    @Override // p000.C0621q5
    /* JADX INFO: renamed from: e */
    public final C0249g5 mo753e(Context context, AttributeSet attributeSet) {
        C0461lu c0461lu = new C0461lu(AbstractC0259gf.m1245c0(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0461lu.getContext();
        if (AbstractC0493mp.m1837K(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0168dz.f1455r;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iM1779f = C0461lu.m1779f(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM1779f == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0168dz.f1454q);
                    int iM1779f2 = C0461lu.m1779f(c0461lu.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM1779f2 >= 0) {
                        c0461lu.setLineHeight(iM1779f2);
                    }
                }
            }
        }
        return c0461lu;
    }
}
