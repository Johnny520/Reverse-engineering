package com.google.android.material.theme;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.C1247R;
import com.google.android.material.button.MaterialButton;
import p000a.C0030Ba;
import p000a.C0093F0;
import p000a.C0096F3;
import p000a.C0129H0;
import p000a.C0165J0;
import p000a.C0211La;
import p000a.C0318Ra;
import p000a.C0336Sa;
import p000a.C0390Va;
import p000a.C0408Wa;
import p000a.C0523cf;
import p000a.C0623i1;
import p000a.C0794r1;
import p000a.C0851u1;
import p000a.C0955za;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0851u1 {
    @Override // p000a.C0851u1
    /* JADX INFO: renamed from: a */
    public final C0093F0 mo1971a(Context context, AttributeSet attributeSet) {
        return new C0030Ba(context, attributeSet);
    }

    @Override // p000a.C0851u1
    /* JADX INFO: renamed from: b */
    public final C0129H0 mo1972b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p000a.C0851u1
    /* JADX INFO: renamed from: c */
    public final C0165J0 mo1973c(Context context, AttributeSet attributeSet) {
        return new C0211La(context, attributeSet);
    }

    @Override // p000a.C0851u1
    /* JADX INFO: renamed from: d */
    public final C0623i1 mo1974d(Context context, AttributeSet attributeSet) {
        int i = C1247R.attr.radioButtonStyle;
        int i2 = C0318Ra.f1139g;
        C0318Ra c0318Ra = new C0318Ra(C0408Wa.m1054a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = c0318Ra.getContext();
        TypedArray typedArrayM1301d = C0523cf.m1301d(context2, attributeSet, C1247R.styleable.MaterialRadioButton, i, i2, new int[0]);
        if (typedArrayM1301d.hasValue(C1247R.styleable.MaterialRadioButton_buttonTint)) {
            C0096F3.m257c(c0318Ra, C0336Sa.m925b(context2, typedArrayM1301d, C1247R.styleable.MaterialRadioButton_buttonTint));
        }
        c0318Ra.f1142f = typedArrayM1301d.getBoolean(C1247R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayM1301d.recycle();
        return c0318Ra;
    }

    @Override // p000a.C0851u1
    /* JADX INFO: renamed from: e */
    public final C0794r1 mo1975e(Context context, AttributeSet attributeSet) {
        C0390Va c0390Va = new C0390Va(C0408Wa.m1054a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = c0390Va.getContext();
        if (C0955za.m2245b(context2, C1247R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C1247R.styleable.MaterialTextView, R.attr.textViewStyle, 0);
            int iM1021h = C0390Va.m1021h(context2, typedArrayObtainStyledAttributes, C1247R.styleable.MaterialTextView_android_lineHeight, C1247R.styleable.MaterialTextView_lineHeight);
            typedArrayObtainStyledAttributes.recycle();
            if (iM1021h == -1) {
                TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, C1247R.styleable.MaterialTextView, R.attr.textViewStyle, 0);
                int resourceId = typedArrayObtainStyledAttributes2.getResourceId(C1247R.styleable.MaterialTextView_android_textAppearance, -1);
                typedArrayObtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, C1247R.styleable.MaterialTextAppearance);
                    int iM1021h2 = C0390Va.m1021h(c0390Va.getContext(), typedArrayObtainStyledAttributes3, C1247R.styleable.MaterialTextAppearance_android_lineHeight, C1247R.styleable.MaterialTextAppearance_lineHeight);
                    typedArrayObtainStyledAttributes3.recycle();
                    if (iM1021h2 >= 0) {
                        c0390Va.setLineHeight(iM1021h2);
                    }
                }
            }
        }
        return c0390Va;
    }
}
