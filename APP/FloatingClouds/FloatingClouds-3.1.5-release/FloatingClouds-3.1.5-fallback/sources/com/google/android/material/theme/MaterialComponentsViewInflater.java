package com.google.android.material.theme;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends a.C0399u1 {
    public MaterialComponentsViewInflater() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // a.C0399u1
    public final a.F0 a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            a.Ba r0 = new a.Ba
            r0.<init>(r2, r3)
            return r0
    }

    @Override // a.C0399u1
    public final a.H0 b(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r0.<init>(r2, r3)
            return r0
    }

    @Override // a.C0399u1
    public final a.J0 c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            a.La r0 = new a.La
            r0.<init>(r2, r3)
            return r0
    }

    @Override // a.C0399u1
    public final a.C0185i1 d(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            a.Ra r0 = new a.Ra
            int r4 = com.google.android.material.R.attr.radioButtonStyle
            int r5 = a.Ra.g
            android.content.Context r8 = a.Wa.a(r8, r9, r4, r5)
            r0.<init>(r8, r9, r4)
            android.content.Context r1 = r0.getContext()
            int[] r3 = com.google.android.material.R.styleable.MaterialRadioButton
            r8 = 0
            int[] r6 = new int[r8]
            r2 = r9
            android.content.res.TypedArray r9 = a.C0091cf.d(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.R.styleable.MaterialRadioButton_buttonTint
            boolean r2 = r9.hasValue(r2)
            if (r2 == 0) goto L2c
            int r2 = com.google.android.material.R.styleable.MaterialRadioButton_buttonTint
            android.content.res.ColorStateList r1 = a.Sa.b(r1, r9, r2)
            a.F3.c(r0, r1)
        L2c:
            int r1 = com.google.android.material.R.styleable.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r1, r8)
            r0.f = r8
            r9.recycle()
            return r0
    }

    @Override // a.C0399u1
    public final a.C0345r1 e(android.content.Context r8, android.util.AttributeSet r9) {
            r7 = this;
            a.Va r0 = new a.Va
            r1 = 16842884(0x1010084, float:2.3693928E-38)
            r2 = 0
            android.content.Context r8 = a.Wa.a(r8, r9, r1, r2)
            r0.<init>(r8, r9, r1)
            android.content.Context r8 = r0.getContext()
            int r3 = com.google.android.material.R.attr.textAppearanceLineHeightEnabled
            r4 = 1
            boolean r3 = a.C0498za.b(r8, r3, r4)
            if (r3 == 0) goto L66
            android.content.res.Resources$Theme r3 = r8.getTheme()
            int[] r4 = com.google.android.material.R.styleable.MaterialTextView
            android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r9, r4, r1, r2)
            int r5 = com.google.android.material.R.styleable.MaterialTextView_android_lineHeight
            int r6 = com.google.android.material.R.styleable.MaterialTextView_lineHeight
            int[] r5 = new int[]{r5, r6}
            int r8 = a.Va.h(r8, r4, r5)
            r4.recycle()
            r4 = -1
            if (r8 == r4) goto L37
            goto L66
        L37:
            int[] r8 = com.google.android.material.R.styleable.MaterialTextView
            android.content.res.TypedArray r8 = r3.obtainStyledAttributes(r9, r8, r1, r2)
            int r9 = com.google.android.material.R.styleable.MaterialTextView_android_textAppearance
            int r9 = r8.getResourceId(r9, r4)
            r8.recycle()
            if (r9 == r4) goto L66
            int[] r8 = com.google.android.material.R.styleable.MaterialTextAppearance
            android.content.res.TypedArray r8 = r3.obtainStyledAttributes(r9, r8)
            android.content.Context r9 = r0.getContext()
            int r1 = com.google.android.material.R.styleable.MaterialTextAppearance_android_lineHeight
            int r2 = com.google.android.material.R.styleable.MaterialTextAppearance_lineHeight
            int[] r1 = new int[]{r1, r2}
            int r9 = a.Va.h(r9, r8, r1)
            r8.recycle()
            if (r9 < 0) goto L66
            r0.setLineHeight(r9)
        L66:
            return r0
    }
}
