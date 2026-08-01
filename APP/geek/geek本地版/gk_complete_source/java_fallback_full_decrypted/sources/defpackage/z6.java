package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z6 extends defpackage.r70 {
    public int A;
    public java.util.ArrayList w;
    public boolean x;
    public int y;
    public boolean z;

    @Override // defpackage.r70
    public final void A(defpackage.iy r3) {
            r2 = this;
            super.A(r3)
            int r0 = r2.A
            r0 = r0 | 4
            r2.A = r0
            java.util.ArrayList r0 = r2.w
            if (r0 == 0) goto L24
            r0 = 0
        Le:
            java.util.ArrayList r1 = r2.w
            int r1 = r1.size()
            if (r0 >= r1) goto L24
            java.util.ArrayList r1 = r2.w
            java.lang.Object r1 = r1.get(r0)
            r70 r1 = (defpackage.r70) r1
            r1.A(r3)
            int r0 = r0 + 1
            goto Le
        L24:
            return
    }

    @Override // defpackage.r70
    public final void B() {
            r3 = this;
            int r0 = r3.A
            r0 = r0 | 2
            r3.A = r0
            java.util.ArrayList r0 = r3.w
            int r0 = r0.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1d
            java.util.ArrayList r2 = r3.w
            java.lang.Object r2 = r2.get(r1)
            r70 r2 = (defpackage.r70) r2
            r2.B()
            int r1 = r1 + 1
            goto Ld
        L1d:
            return
    }

    @Override // defpackage.r70
    public final void C(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // defpackage.r70
    public final java.lang.String E(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = super.E(r6)
            r1 = 0
        L5:
            java.util.ArrayList r2 = r5.w
            int r2 = r2.size()
            if (r1 >= r2) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            java.util.ArrayList r0 = r5.w
            java.lang.Object r0 = r0.get(r1)
            r70 r0 = (defpackage.r70) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "  "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r0.E(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L5
        L41:
            return r0
    }

    public final void F(defpackage.r70 r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.w
            r0.add(r5)
            r5.i = r4
            long r0 = r4.c
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L12
            r5.x(r0)
        L12:
            int r0 = r4.A
            r0 = r0 & 1
            if (r0 == 0) goto L1d
            android.animation.TimeInterpolator r0 = r4.d
            r5.z(r0)
        L1d:
            int r0 = r4.A
            r0 = r0 & 2
            if (r0 == 0) goto L26
            r5.B()
        L26:
            int r0 = r4.A
            r0 = r0 & 4
            if (r0 == 0) goto L31
            iy r0 = r4.s
            r5.A(r0)
        L31:
            int r0 = r4.A
            r0 = r0 & 8
            if (r0 == 0) goto L3b
            r0 = 0
            r5.y(r0)
        L3b:
            return
    }

    @Override // defpackage.r70
    public final void c(defpackage.x70 r7) {
            r6 = this;
            android.view.View r0 = r7.b
            boolean r1 = r6.r(r0)
            if (r1 == 0) goto L28
            java.util.ArrayList r1 = r6.w
            int r2 = r1.size()
            r3 = 0
        Lf:
            if (r3 >= r2) goto L28
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            r70 r4 = (defpackage.r70) r4
            boolean r5 = r4.r(r0)
            if (r5 == 0) goto Lf
            r4.c(r7)
            java.util.ArrayList r5 = r7.c
            r5.add(r4)
            goto Lf
        L28:
            return
    }

    @Override // defpackage.r70
    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            r70 r0 = r1.i()
            return r0
    }

    @Override // defpackage.r70
    public final void e(defpackage.x70 r4) {
            r3 = this;
            java.util.ArrayList r0 = r3.w
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList r2 = r3.w
            java.lang.Object r2 = r2.get(r1)
            r70 r2 = (defpackage.r70) r2
            r2.e(r4)
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    @Override // defpackage.r70
    public final void f(defpackage.x70 r7) {
            r6 = this;
            android.view.View r0 = r7.b
            boolean r1 = r6.r(r0)
            if (r1 == 0) goto L28
            java.util.ArrayList r1 = r6.w
            int r2 = r1.size()
            r3 = 0
        Lf:
            if (r3 >= r2) goto L28
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            r70 r4 = (defpackage.r70) r4
            boolean r5 = r4.r(r0)
            if (r5 == 0) goto Lf
            r4.f(r7)
            java.util.ArrayList r5 = r7.c
            r5.add(r4)
            goto Lf
        L28:
            return
    }

    @Override // defpackage.r70
    public final defpackage.r70 i() {
            r5 = this;
            r70 r0 = super.i()
            z6 r0 = (defpackage.z6) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.w = r1
            java.util.ArrayList r1 = r5.w
            int r1 = r1.size()
            r2 = 0
        L14:
            if (r2 >= r1) goto L2c
            java.util.ArrayList r3 = r5.w
            java.lang.Object r3 = r3.get(r2)
            r70 r3 = (defpackage.r70) r3
            r70 r3 = r3.i()
            java.util.ArrayList r4 = r0.w
            r4.add(r3)
            r3.i = r0
            int r2 = r2 + 1
            goto L14
        L2c:
            return r0
    }

    @Override // defpackage.r70
    public final void k(android.view.ViewGroup r12, defpackage.a8 r13, defpackage.a8 r14, java.util.ArrayList r15, java.util.ArrayList r16) {
            r11 = this;
            long r0 = r11.b
            java.util.ArrayList r2 = r11.w
            int r2 = r2.size()
            r3 = 0
        L9:
            if (r3 >= r2) goto L3d
            java.util.ArrayList r4 = r11.w
            java.lang.Object r4 = r4.get(r3)
            r5 = r4
            r70 r5 = (defpackage.r70) r5
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L21
            boolean r4 = r11.x
            if (r4 != 0) goto L28
            if (r3 != 0) goto L21
            goto L28
        L21:
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            goto L37
        L28:
            long r8 = r5.b
            int r4 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r4 <= 0) goto L33
            long r8 = r8 + r0
            r5.C(r8)
            goto L21
        L33:
            r5.C(r0)
            goto L21
        L37:
            r5.k(r6, r7, r8, r9, r10)
            int r3 = r3 + 1
            goto L9
        L3d:
            return
    }

    @Override // defpackage.r70
    public final void t(android.view.View r4) {
            r3 = this;
            super.t(r4)
            java.util.ArrayList r0 = r3.w
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList r2 = r3.w
            java.lang.Object r2 = r2.get(r1)
            r70 r2 = (defpackage.r70) r2
            r2.t(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // defpackage.r70
    public final void v(android.view.View r4) {
            r3 = this;
            super.v(r4)
            java.util.ArrayList r0 = r3.w
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList r2 = r3.w
            java.lang.Object r2 = r2.get(r1)
            r70 r2 = (defpackage.r70) r2
            r2.v(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // defpackage.r70
    public final void w() {
            r6 = this;
            java.util.ArrayList r0 = r6.w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            r6.D()
            r6.l()
            return
        Lf:
            nj r0 = new nj
            r0.<init>()
            r0.b = r6
            java.util.ArrayList r1 = r6.w
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L1e:
            if (r4 >= r2) goto L2c
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            r70 r5 = (defpackage.r70) r5
            r5.a(r0)
            goto L1e
        L2c:
            java.util.ArrayList r0 = r6.w
            int r0 = r0.size()
            r6.y = r0
            boolean r0 = r6.x
            if (r0 != 0) goto L6d
            r0 = 1
        L39:
            java.util.ArrayList r1 = r6.w
            int r1 = r1.size()
            if (r0 >= r1) goto L5f
            java.util.ArrayList r1 = r6.w
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)
            r70 r1 = (defpackage.r70) r1
            java.util.ArrayList r2 = r6.w
            java.lang.Object r2 = r2.get(r0)
            r70 r2 = (defpackage.r70) r2
            nj r4 = new nj
            r5 = 1
            r4.<init>(r5, r2)
            r1.a(r4)
            int r0 = r0 + 1
            goto L39
        L5f:
            java.util.ArrayList r0 = r6.w
            java.lang.Object r0 = r0.get(r3)
            r70 r0 = (defpackage.r70) r0
            if (r0 == 0) goto L81
            r0.w()
            return
        L6d:
            java.util.ArrayList r0 = r6.w
            int r1 = r0.size()
        L73:
            if (r3 >= r1) goto L81
            java.lang.Object r2 = r0.get(r3)
            int r3 = r3 + 1
            r70 r2 = (defpackage.r70) r2
            r2.w()
            goto L73
        L81:
            return
    }

    @Override // defpackage.r70
    public final void x(long r4) {
            r3 = this;
            r3.c = r4
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            java.util.ArrayList r0 = r3.w
            if (r0 == 0) goto L21
            int r0 = r0.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L21
            java.util.ArrayList r2 = r3.w
            java.lang.Object r2 = r2.get(r1)
            r70 r2 = (defpackage.r70) r2
            r2.x(r4)
            int r1 = r1 + 1
            goto L11
        L21:
            return
    }

    @Override // defpackage.r70
    public final void y(defpackage.gt r4) {
            r3 = this;
            int r0 = r3.A
            r0 = r0 | 8
            r3.A = r0
            java.util.ArrayList r0 = r3.w
            int r0 = r0.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1d
            java.util.ArrayList r2 = r3.w
            java.lang.Object r2 = r2.get(r1)
            r70 r2 = (defpackage.r70) r2
            r2.y(r4)
            int r1 = r1 + 1
            goto Ld
        L1d:
            return
    }

    @Override // defpackage.r70
    public final void z(android.animation.TimeInterpolator r4) {
            r3 = this;
            int r0 = r3.A
            r0 = r0 | 1
            r3.A = r0
            java.util.ArrayList r0 = r3.w
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.util.ArrayList r2 = r3.w
            java.lang.Object r2 = r2.get(r1)
            r70 r2 = (defpackage.r70) r2
            r2.z(r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            r3.d = r4
            return
    }
}
