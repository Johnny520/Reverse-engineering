package com.google.android.material.theme;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends defpackage.q5 {
    public MaterialComponentsViewInflater() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.q5
    public final defpackage.u2 a(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            jt r0 = new jt
            r0.<init>(r2, r3)
            return r0
    }

    @Override // defpackage.q5
    public final defpackage.w2 b(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r0.<init>(r2, r3)
            return r0
    }

    @Override // defpackage.q5
    public final defpackage.y2 c(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            xt r0 = new xt
            r0.<init>(r2, r3)
            return r0
    }

    @Override // defpackage.q5
    public final defpackage.e4 d(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            cu r0 = new cu
            r1 = 2131821579(0x7f11040b, float:1.9275905E38)
            r5 = 2130969431(0x7f040357, float:1.7547544E38)
            android.content.Context r9 = defpackage.ff.W(r9, r10, r5, r1)
            r0.<init>(r9, r10)
            android.content.Context r2 = r0.getContext()
            r9 = 0
            int[] r7 = new int[r9]
            int[] r4 = defpackage.wy.o
            r6 = 2131821579(0x7f11040b, float:1.9275905E38)
            r3 = r10
            android.content.res.TypedArray r10 = defpackage.a80.u(r2, r3, r4, r5, r6, r7)
            boolean r1 = r10.hasValue(r9)
            if (r1 == 0) goto L2d
            android.content.res.ColorStateList r1 = defpackage.ct.n(r2, r10, r9)
            defpackage.wb.c(r0, r1)
        L2d:
            r1 = 1
            boolean r9 = r10.getBoolean(r1, r9)
            r0.f = r9
            r10.recycle()
            return r0
    }

    @Override // defpackage.q5
    public final defpackage.g5 e(android.content.Context r10, android.util.AttributeSet r11) {
            r9 = this;
            gu r0 = new gu
            r1 = 16842884(0x1010084, float:2.3693928E-38)
            r2 = 0
            android.content.Context r10 = defpackage.ff.W(r10, r11, r1, r2)
            r0.<init>(r10, r11, r1)
            android.content.Context r10 = r0.getContext()
            r3 = 2130969600(0x7f040400, float:1.7547886E38)
            r4 = 1
            boolean r3 = defpackage.gt.z(r10, r3, r4)
            if (r3 == 0) goto L5c
            android.content.res.Resources$Theme r3 = r10.getTheme()
            int[] r5 = defpackage.wy.r
            android.content.res.TypedArray r6 = r3.obtainStyledAttributes(r11, r5, r1, r2)
            r7 = 2
            int[] r8 = new int[]{r4, r7}
            int r10 = defpackage.gu.f(r10, r6, r8)
            r6.recycle()
            r6 = -1
            if (r10 == r6) goto L35
            goto L5c
        L35:
            android.content.res.TypedArray r10 = r3.obtainStyledAttributes(r11, r5, r1, r2)
            int r11 = r10.getResourceId(r2, r6)
            r10.recycle()
            if (r11 == r6) goto L5c
            int[] r10 = defpackage.wy.q
            android.content.res.TypedArray r10 = r3.obtainStyledAttributes(r11, r10)
            android.content.Context r11 = r0.getContext()
            int[] r1 = new int[]{r4, r7}
            int r11 = defpackage.gu.f(r11, r10, r1)
            r10.recycle()
            if (r11 < 0) goto L5c
            r0.setLineHeight(r11)
        L5c:
            return r0
    }
}
