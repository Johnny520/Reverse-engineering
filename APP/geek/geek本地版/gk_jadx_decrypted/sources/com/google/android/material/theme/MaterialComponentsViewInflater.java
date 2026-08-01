package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.ljx.wechatmod.R;
import p000.AbstractC0126ct;
import p000.AbstractC0222ff;
import p000.AbstractC0273gt;
import p000.AbstractC0850wb;
import p000.AbstractC0873wy;
import p000.C0127cu;
import p000.C0174e4;
import p000.C0249g5;
import p000.C0274gu;
import p000.C0386jt;
import p000.C0622q5;
import p000.C0767u2;
import p000.C0841w2;
import p000.C0905xt;
import p000.C0915y2;
import p000.a80;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0622q5 {
    @Override // p000.C0622q5
    /* JADX INFO: renamed from: a */
    public final C0767u2 mo791a(Context context, AttributeSet attributeSet) {
        return new C0386jt(context, attributeSet);
    }

    @Override // p000.C0622q5
    /* JADX INFO: renamed from: b */
    public final C0841w2 mo792b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p000.C0622q5
    /* JADX INFO: renamed from: c */
    public final C0915y2 mo793c(Context context, AttributeSet attributeSet) {
        return new C0905xt(context, attributeSet);
    }

    @Override // p000.C0622q5
    /* JADX INFO: renamed from: d */
    public final C0174e4 mo794d(Context context, AttributeSet attributeSet) {
        C0127cu c0127cu = new C0127cu(AbstractC0222ff.m1177W(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0127cu.getContext();
        TypedArray typedArrayM56u = a80.m56u(context2, attributeSet, AbstractC0873wy.f5056o, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (typedArrayM56u.hasValue(0)) {
            AbstractC0850wb.m2560c(c0127cu, AbstractC0126ct.m816n(context2, typedArrayM56u, 0));
        }
        c0127cu.f1324f = typedArrayM56u.getBoolean(1, false);
        typedArrayM56u.recycle();
        return c0127cu;
    }

    @Override // p000.C0622q5
    /* JADX INFO: renamed from: e */
    public final C0249g5 mo795e(Context context, AttributeSet attributeSet) {
        C0274gu c0274gu = new C0274gu(AbstractC0222ff.m1177W(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0274gu.getContext();
        if (AbstractC0273gt.m1317z(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0873wy.f5059r;
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int iM1329f = C0274gu.m1329f(context2, typedArrayObtainStyledAttributes, 1, 2);
            typedArrayObtainStyledAttributes.recycle();
            if (iM1329f == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0873wy.f5058q);
                    int iM1329f2 = C0274gu.m1329f(c0274gu.getContext(), typedArrayObtainStyledAttributes3, 1, 2);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM1329f2 >= 0) {
                        c0274gu.setLineHeight(iM1329f2);
                    }
                }
            }
        }
        return c0274gu;
    }
}
