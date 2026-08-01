package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends defpackage.nz implements defpackage.xz {
    public defpackage.p8 p;
    public final android.view.View.OnLayoutChangeListener q;

    public CarouselLayoutManager() {
            r2 = this;
            vh r0 = new vh
            r1 = 27
            r0.<init>(r1)
            r2.<init>()
            o8 r0 = new o8
            r0.<init>()
            m8 r0 = new m8
            r0.<init>(r2)
            r2.q = r0
            r2.j0()
            r0 = 0
            r2.A0(r0)
            return
    }

    @android.annotation.SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            o8 r3 = new o8
            r3.<init>()
            m8 r3 = new m8
            r3.<init>(r0)
            r0.q = r3
            vh r3 = new vh
            r4 = 27
            r3.<init>(r4)
            r0.j0()
            if (r2 == 0) goto L32
            int[] r3 = defpackage.wy.b
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r2, r3)
            r2 = 0
            r1.getInt(r2, r2)
            r0.j0()
            int r2 = r1.getInt(r2, r2)
            r0.A0(r2)
            r1.recycle()
        L32:
            return
    }

    public final void A0(int r4) {
            r3 = this;
            r0 = 1
            if (r4 == 0) goto L1a
            if (r4 != r0) goto L6
            goto L1a
        L6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "invalid orientation:"
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L1a:
            r1 = 0
            r3.c(r1)
            p8 r1 = r3.p
            if (r1 == 0) goto L28
            int r1 = r1.a
            if (r4 == r1) goto L27
            goto L28
        L27:
            return
        L28:
            if (r4 == 0) goto L3b
            if (r4 != r0) goto L33
            p8 r4 = new p8
            r0 = 0
            r4.<init>(r3, r0)
            goto L41
        L33:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "invalid orientation"
            r4.<init>(r0)
            throw r4
        L3b:
            p8 r4 = new p8
            r0 = 1
            r4.<init>(r3, r0)
        L41:
            r3.p = r4
            r3.j0()
            return
    }

    @Override // defpackage.nz
    public final void O(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            r1.j0()
            android.view.View$OnLayoutChangeListener r0 = r1.q
            r2.addOnLayoutChangeListener(r0)
            return
    }

    @Override // defpackage.nz
    public final void P(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            android.view.View$OnLayoutChangeListener r0 = r1.q
            r2.removeOnLayoutChangeListener(r0)
            return
    }

    @Override // defpackage.nz
    public final android.view.View Q(android.view.View r4, int r5, defpackage.tz r6, defpackage.yz r7) {
            r3 = this;
            int r6 = r3.v()
            if (r6 != 0) goto L8
            goto L96
        L8:
            p8 r6 = r3.p
            int r6 = r6.a
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = -1
            r1 = 1
            if (r5 == r1) goto L46
            r2 = 2
            if (r5 == r2) goto L3c
            r2 = 17
            if (r5 == r2) goto L4b
            r2 = 33
            if (r5 == r2) goto L48
            r2 = 66
            if (r5 == r2) goto L3e
            r2 = 130(0x82, float:1.82E-43)
            if (r5 == r2) goto L3a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown focus request:"
            r6.<init>(r2)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "CarouselLayoutManager"
            android.util.Log.d(r6, r5)
        L38:
            r5 = r7
            goto L54
        L3a:
            if (r6 != r1) goto L38
        L3c:
            r5 = r1
            goto L54
        L3e:
            if (r6 != 0) goto L38
            boolean r5 = r3.z0()
            if (r5 == 0) goto L3c
        L46:
            r5 = r0
            goto L54
        L48:
            if (r6 != r1) goto L38
            goto L46
        L4b:
            if (r6 != 0) goto L38
            boolean r5 = r3.z0()
            if (r5 == 0) goto L46
            goto L3c
        L54:
            if (r5 != r7) goto L57
            goto L96
        L57:
            r6 = 0
            if (r5 != r0) goto L8b
            int r4 = defpackage.nz.F(r4)
            if (r4 != 0) goto L61
            goto L96
        L61:
            android.view.View r4 = r3.u(r6)
            int r4 = defpackage.nz.F(r4)
            int r4 = r4 - r1
            if (r4 < 0) goto L7a
            int r5 = r3.z()
            if (r4 < r5) goto L73
            goto L7a
        L73:
            p8 r4 = r3.p
            r4.a()
            r4 = 0
            throw r4
        L7a:
            boolean r4 = r3.z0()
            if (r4 == 0) goto L86
            int r4 = r3.v()
            int r6 = r4 + (-1)
        L86:
            android.view.View r4 = r3.u(r6)
            return r4
        L8b:
            int r4 = defpackage.nz.F(r4)
            int r5 = r3.z()
            int r5 = r5 - r1
            if (r4 != r5) goto L98
        L96:
            r4 = 0
            return r4
        L98:
            int r4 = r3.v()
            int r4 = r4 - r1
            android.view.View r4 = r3.u(r4)
            int r4 = defpackage.nz.F(r4)
            int r4 = r4 + r1
            if (r4 < 0) goto Lb6
            int r5 = r3.z()
            if (r4 < r5) goto Laf
            goto Lb6
        Laf:
            p8 r4 = r3.p
            r4.a()
            r4 = 0
            throw r4
        Lb6:
            boolean r4 = r3.z0()
            if (r4 == 0) goto Lbd
            goto Lc3
        Lbd:
            int r4 = r3.v()
            int r6 = r4 + (-1)
        Lc3:
            android.view.View r4 = r3.u(r6)
            return r4
    }

    @Override // defpackage.nz
    public final void R(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.R(r2)
            int r0 = r1.v()
            if (r0 <= 0) goto L26
            r0 = 0
            android.view.View r0 = r1.u(r0)
            int r0 = defpackage.nz.F(r0)
            r2.setFromIndex(r0)
            int r0 = r1.v()
            int r0 = r0 + (-1)
            android.view.View r0 = r1.u(r0)
            int r0 = defpackage.nz.F(r0)
            r2.setToIndex(r0)
        L26:
            return
    }

    @Override // defpackage.nz
    public final void U(int r1, int r2) {
            r0 = this;
            r0.z()
            return
    }

    @Override // defpackage.nz
    public final void X(int r1, int r2) {
            r0 = this;
            r0.z()
            return
    }

    @Override // defpackage.nz
    public final void Z(defpackage.tz r3, defpackage.yz r4) {
            r2 = this;
            int r4 = r4.b()
            if (r4 <= 0) goto L2f
            boolean r4 = r2.y0()
            if (r4 == 0) goto Lf
            int r4 = r2.n
            goto L11
        Lf:
            int r4 = r2.o
        L11:
            float r4 = (float) r4
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 > 0) goto L18
            goto L2f
        L18:
            r2.z0()
            r4 = 0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            b00 r3 = r3.i(r4, r0)
            android.view.View r3 = r3.a
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r3.<init>(r4)
            throw r3
        L2f:
            r2.e0(r3)
            return
    }

    @Override // defpackage.xz
    public final android.graphics.PointF a(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.nz
    public final void a0(defpackage.yz r1) {
            r0 = this;
            int r1 = r0.v()
            if (r1 != 0) goto L7
            return
        L7:
            r1 = 0
            android.view.View r1 = r0.u(r1)
            defpackage.nz.F(r1)
            return
    }

    @Override // defpackage.nz
    public final boolean d() {
            r1 = this;
            boolean r0 = r1.y0()
            return r0
    }

    @Override // defpackage.nz
    public final boolean e() {
            r1 = this;
            boolean r0 = r1.y0()
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.nz
    public final boolean i0(androidx.recyclerview.widget.RecyclerView r1, android.view.View r2, android.graphics.Rect r3, boolean r4, boolean r5) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.nz
    public final int j(defpackage.yz r1) {
            r0 = this;
            r0.v()
            r1 = 0
            return r1
    }

    @Override // defpackage.nz
    public final int k(defpackage.yz r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.nz
    public final int k0(int r4, defpackage.tz r5, defpackage.yz r6) {
            r3 = this;
            boolean r6 = r3.y0()
            r0 = 0
            if (r6 == 0) goto L23
            int r6 = r3.v()
            if (r6 == 0) goto L23
            if (r4 != 0) goto L10
            goto L23
        L10:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            b00 r4 = r5.i(r0, r1)
            android.view.View r4 = r4.a
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r4.<init>(r5)
            throw r4
        L23:
            return r0
    }

    @Override // defpackage.nz
    public final int l(defpackage.yz r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.nz
    public final void l0(int r1) {
            r0 = this;
            return
    }

    @Override // defpackage.nz
    public final int m(defpackage.yz r1) {
            r0 = this;
            r0.v()
            r1 = 0
            return r1
    }

    @Override // defpackage.nz
    public final int m0(int r4, defpackage.tz r5, defpackage.yz r6) {
            r3 = this;
            boolean r6 = r3.e()
            r0 = 0
            if (r6 == 0) goto L23
            int r6 = r3.v()
            if (r6 == 0) goto L23
            if (r4 != 0) goto L10
            goto L23
        L10:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            b00 r4 = r5.i(r0, r1)
            android.view.View r4 = r4.a
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r4.<init>(r5)
            throw r4
        L23:
            return r0
    }

    @Override // defpackage.nz
    public final int n(defpackage.yz r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.nz
    public final int o(defpackage.yz r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // defpackage.nz
    public final defpackage.oz r() {
            r2 = this;
            oz r0 = new oz
            r1 = -2
            r0.<init>(r1, r1)
            return r0
    }

    @Override // defpackage.nz
    public final void v0(androidx.recyclerview.widget.RecyclerView r2, int r3) {
            r1 = this;
            n8 r0 = new n8
            android.content.Context r2 = r2.getContext()
            r0.<init>(r1, r2)
            r0.a = r3
            r1.w0(r0)
            return
    }

    @Override // defpackage.nz
    public final void y(android.view.View r1, android.graphics.Rect r2) {
            r0 = this;
            super.y(r1, r2)
            r2.centerY()
            boolean r1 = r0.y0()
            if (r1 == 0) goto Lf
            r2.centerX()
        Lf:
            r1 = 0
            throw r1
    }

    public final boolean y0() {
            r1 = this;
            p8 r0 = r1.p
            int r0 = r0.a
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean z0() {
            r2 = this;
            boolean r0 = r2.y0()
            if (r0 == 0) goto Le
            int r0 = r2.A()
            r1 = 1
            if (r0 != r1) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }
}
