package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public class h extends androidx.transition.e {
    public java.util.ArrayList<androidx.transition.e> C;
    public boolean D;
    public int E;
    public boolean F;
    public int G;

    public class a extends androidx.transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.transition.e f1031a;

        public a(androidx.transition.e r1) {
                r0 = this;
                r0.<init>()
                r0.f1031a = r1
                return
        }

        @Override // androidx.transition.f, androidx.transition.e.f
        public final void f(androidx.transition.e r2) {
                r1 = this;
                androidx.transition.e r0 = r1.f1031a
                r0.A()
                r2.y(r1)
                return
        }
    }

    public class b extends androidx.transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.transition.h f1032a;

        public b(androidx.transition.h r1) {
                r0 = this;
                r0.<init>()
                r0.f1032a = r1
                return
        }

        @Override // androidx.transition.f, androidx.transition.e.f
        public final void e(androidx.transition.e r3) {
                r2 = this;
                androidx.transition.h r0 = r2.f1032a
                java.util.ArrayList<androidx.transition.e> r1 = r0.C
                r1.remove(r3)
                boolean r3 = r0.s()
                if (r3 != 0) goto L1b
                a.z r3 = androidx.transition.e.g.c
                r1 = 0
                r0.v(r0, r3, r1)
                r3 = 1
                r0.r = r3
                a.z r3 = androidx.transition.e.g.b
                r0.v(r0, r3, r1)
            L1b:
                return
        }
    }

    public static class c extends androidx.transition.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.transition.h f1033a;

        @Override // androidx.transition.f, androidx.transition.e.f
        public final void d(androidx.transition.e r2) {
                r1 = this;
                androidx.transition.h r2 = r1.f1033a
                boolean r0 = r2.F
                if (r0 != 0) goto Lc
                r2.I()
                r0 = 1
                r2.F = r0
            Lc:
                return
        }

        @Override // androidx.transition.f, androidx.transition.e.f
        public final void f(androidx.transition.e r3) {
                r2 = this;
                androidx.transition.h r0 = r2.f1033a
                int r1 = r0.E
                int r1 = r1 + (-1)
                r0.E = r1
                if (r1 != 0) goto L10
                r1 = 0
                r0.F = r1
                r0.m()
            L10:
                r3.y(r2)
                return
        }
    }

    public h() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.C = r0
            r0 = 1
            r1.D = r0
            r0 = 0
            r1.F = r0
            r1.G = r0
            return
    }

    @Override // androidx.transition.e
    public final void A() {
            r4 = this;
            java.util.ArrayList<androidx.transition.e> r0 = r4.C
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            r4.I()
            r4.m()
            return
        Lf:
            androidx.transition.h$c r0 = new androidx.transition.h$c
            r0.<init>()
            r0.f1033a = r4
            java.util.ArrayList<androidx.transition.e> r1 = r4.C
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.a(r0)
            goto L1c
        L2c:
            java.util.ArrayList<androidx.transition.e> r0 = r4.C
            int r0 = r0.size()
            r4.E = r0
            boolean r0 = r4.D
            if (r0 != 0) goto L6d
            r0 = 1
        L39:
            java.util.ArrayList<androidx.transition.e> r1 = r4.C
            int r1 = r1.size()
            if (r0 >= r1) goto L5e
            java.util.ArrayList<androidx.transition.e> r1 = r4.C
            int r2 = r0 + (-1)
            java.lang.Object r1 = r1.get(r2)
            androidx.transition.e r1 = (androidx.transition.e) r1
            java.util.ArrayList<androidx.transition.e> r2 = r4.C
            java.lang.Object r2 = r2.get(r0)
            androidx.transition.e r2 = (androidx.transition.e) r2
            androidx.transition.h$a r3 = new androidx.transition.h$a
            r3.<init>(r2)
            r1.a(r3)
            int r0 = r0 + 1
            goto L39
        L5e:
            java.util.ArrayList<androidx.transition.e> r0 = r4.C
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            androidx.transition.e r0 = (androidx.transition.e) r0
            if (r0 == 0) goto L83
            r0.A()
            return
        L6d:
            java.util.ArrayList<androidx.transition.e> r0 = r4.C
            java.util.Iterator r0 = r0.iterator()
        L73:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L83
            java.lang.Object r1 = r0.next()
            androidx.transition.e r1 = (androidx.transition.e) r1
            r1.A()
            goto L73
        L83:
            return
    }

    @Override // androidx.transition.e
    public final void B(long r20, long r22) {
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.w
            androidx.transition.h r7 = r0.i
            r8 = 0
            if (r7 == 0) goto L20
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L16
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Le0
        L16:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L20
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L20
            goto Le0
        L20:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 1
            r11 = 0
            if (r7 >= 0) goto L28
            r12 = r10
            goto L29
        L28:
            r12 = r11
        L29:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L31
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L39
        L31:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L40
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L40
        L39:
            r0.r = r11
            a.z r14 = androidx.transition.e.g.f1027a
            r0.v(r0, r14, r12)
        L40:
            boolean r14 = r0.D
            if (r14 == 0) goto L5e
        L44:
            java.util.ArrayList<androidx.transition.e> r7 = r0.C
            int r7 = r7.size()
            if (r11 >= r7) goto L5a
            java.util.ArrayList<androidx.transition.e> r7 = r0.C
            java.lang.Object r7 = r7.get(r11)
            androidx.transition.e r7 = (androidx.transition.e) r7
            r7.B(r1, r3)
            int r11 = r11 + 1
            goto L44
        L5a:
            r16 = r8
            goto Lc5
        L5e:
            r11 = r10
        L5f:
            java.util.ArrayList<androidx.transition.e> r14 = r0.C
            int r14 = r14.size()
            if (r11 >= r14) goto L7a
            java.util.ArrayList<androidx.transition.e> r14 = r0.C
            java.lang.Object r14 = r14.get(r11)
            androidx.transition.e r14 = (androidx.transition.e) r14
            long r14 = r14.x
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 <= 0) goto L77
        L75:
            int r11 = r11 - r10
            goto L81
        L77:
            int r11 = r11 + 1
            goto L5f
        L7a:
            java.util.ArrayList<androidx.transition.e> r11 = r0.C
            int r11 = r11.size()
            goto L75
        L81:
            if (r7 < 0) goto La8
        L83:
            java.util.ArrayList<androidx.transition.e> r7 = r0.C
            int r7 = r7.size()
            if (r11 >= r7) goto L5a
            java.util.ArrayList<androidx.transition.e> r7 = r0.C
            java.lang.Object r7 = r7.get(r11)
            androidx.transition.e r7 = (androidx.transition.e) r7
            long r14 = r7.x
            r16 = r8
            long r8 = r1 - r14
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 >= 0) goto L9e
            goto Lc5
        L9e:
            long r14 = r3 - r14
            r7.B(r8, r14)
            int r11 = r11 + 1
            r8 = r16
            goto L83
        La8:
            r16 = r8
        Laa:
            if (r11 < 0) goto Lc5
            java.util.ArrayList<androidx.transition.e> r7 = r0.C
            java.lang.Object r7 = r7.get(r11)
            androidx.transition.e r7 = (androidx.transition.e) r7
            long r8 = r7.x
            long r14 = r1 - r8
            long r8 = r3 - r8
            r7.B(r14, r8)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 < 0) goto Lc2
            goto Lc5
        Lc2:
            int r11 = r11 + (-1)
            goto Laa
        Lc5:
            androidx.transition.h r7 = r0.i
            if (r7 == 0) goto Le0
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Ld1
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Ld7
        Ld1:
            if (r13 >= 0) goto Le0
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 < 0) goto Le0
        Ld7:
            if (r1 <= 0) goto Ldb
            r0.r = r10
        Ldb:
            a.z r1 = androidx.transition.e.g.b
            r0.v(r0, r1, r12)
        Le0:
            return
    }

    @Override // androidx.transition.e
    public final void C(long r4) {
            r3 = this;
            r3.c = r4
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L21
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            if (r0 == 0) goto L21
            int r0 = r0.size()
            r1 = 0
        L11:
            if (r1 >= r0) goto L21
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.C(r4)
            int r1 = r1 + 1
            goto L11
        L21:
            return
    }

    @Override // androidx.transition.e
    public final void D(androidx.transition.e.c r4) {
            r3 = this;
            int r0 = r3.G
            r0 = r0 | 8
            r3.G = r0
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            int r0 = r0.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.D(r4)
            int r1 = r1 + 1
            goto Ld
        L1d:
            return
    }

    @Override // androidx.transition.e
    public final void E(android.animation.TimeInterpolator r4) {
            r3 = this;
            int r0 = r3.G
            r0 = r0 | 1
            r3.G = r0
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            if (r0 == 0) goto L1f
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.E(r4)
            int r1 = r1 + 1
            goto Lf
        L1f:
            r3.d = r4
            return
    }

    @Override // androidx.transition.e
    public final void F(androidx.transition.e.a r3) {
            r2 = this;
            super.F(r3)
            int r0 = r2.G
            r0 = r0 | 4
            r2.G = r0
            java.util.ArrayList<androidx.transition.e> r0 = r2.C
            if (r0 == 0) goto L24
            r0 = 0
        Le:
            java.util.ArrayList<androidx.transition.e> r1 = r2.C
            int r1 = r1.size()
            if (r0 >= r1) goto L24
            java.util.ArrayList<androidx.transition.e> r1 = r2.C
            java.lang.Object r1 = r1.get(r0)
            androidx.transition.e r1 = (androidx.transition.e) r1
            r1.F(r3)
            int r0 = r0 + 1
            goto Le
        L24:
            return
    }

    @Override // androidx.transition.e
    public final void G() {
            r3 = this;
            int r0 = r3.G
            r0 = r0 | 2
            r3.G = r0
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            int r0 = r0.size()
            r1 = 0
        Ld:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.G()
            int r1 = r1 + 1
            goto Ld
        L1d:
            return
    }

    @Override // androidx.transition.e
    public final void H(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    @Override // androidx.transition.e
    public final java.lang.String J(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = super.J(r6)
            r1 = 0
        L5:
            java.util.ArrayList<androidx.transition.e> r2 = r5.C
            int r2 = r2.size()
            if (r1 >= r2) goto L41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "\n"
            r2.append(r0)
            java.util.ArrayList<androidx.transition.e> r0 = r5.C
            java.lang.Object r0 = r0.get(r1)
            androidx.transition.e r0 = (androidx.transition.e) r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r4 = "  "
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = r0.J(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            int r1 = r1 + 1
            goto L5
        L41:
            return r0
    }

    public final void K(androidx.transition.e r5) {
            r4 = this;
            java.util.ArrayList<androidx.transition.e> r0 = r4.C
            r0.add(r5)
            r5.i = r4
            long r0 = r4.c
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L12
            r5.C(r0)
        L12:
            int r0 = r4.G
            r0 = r0 & 1
            if (r0 == 0) goto L1d
            android.animation.TimeInterpolator r0 = r4.d
            r5.E(r0)
        L1d:
            int r0 = r4.G
            r0 = r0 & 2
            if (r0 == 0) goto L26
            r5.G()
        L26:
            int r0 = r4.G
            r0 = r0 & 4
            if (r0 == 0) goto L31
            androidx.transition.e$a r0 = r4.v
            r5.F(r0)
        L31:
            int r0 = r4.G
            r0 = r0 & 8
            if (r0 == 0) goto L3b
            r0 = 0
            r5.D(r0)
        L3b:
            return
    }

    @Override // androidx.transition.e
    public final void c() {
            r3 = this;
            super.c()
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.c()
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // androidx.transition.e
    public final /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            androidx.transition.e r0 = r1.j()
            return r0
    }

    @Override // androidx.transition.e
    public final void d(a.Ff r4) {
            r3 = this;
            android.view.View r0 = r4.b
            boolean r0 = r3.u(r0)
            if (r0 == 0) goto L2b
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.transition.e r1 = (androidx.transition.e) r1
            android.view.View r2 = r4.b
            boolean r2 = r1.u(r2)
            if (r2 == 0) goto Le
            r1.d(r4)
            java.util.ArrayList<androidx.transition.e> r2 = r4.c
            r2.add(r1)
            goto Le
        L2b:
            return
    }

    @Override // androidx.transition.e
    public final void f(a.Ff r4) {
            r3 = this;
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L17
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.f(r4)
            int r1 = r1 + 1
            goto L7
        L17:
            return
    }

    @Override // androidx.transition.e
    public final void g(a.Ff r4) {
            r3 = this;
            android.view.View r0 = r4.b
            boolean r0 = r3.u(r0)
            if (r0 == 0) goto L2b
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            androidx.transition.e r1 = (androidx.transition.e) r1
            android.view.View r2 = r4.b
            boolean r2 = r1.u(r2)
            if (r2 == 0) goto Le
            r1.g(r4)
            java.util.ArrayList<androidx.transition.e> r2 = r4.c
            r2.add(r1)
            goto Le
        L2b:
            return
    }

    @Override // androidx.transition.e
    public final androidx.transition.e j() {
            r5 = this;
            androidx.transition.e r0 = super.j()
            androidx.transition.h r0 = (androidx.transition.h) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.C = r1
            java.util.ArrayList<androidx.transition.e> r1 = r5.C
            int r1 = r1.size()
            r2 = 0
        L14:
            if (r2 >= r1) goto L2c
            java.util.ArrayList<androidx.transition.e> r3 = r5.C
            java.lang.Object r3 = r3.get(r2)
            androidx.transition.e r3 = (androidx.transition.e) r3
            androidx.transition.e r3 = r3.j()
            java.util.ArrayList<androidx.transition.e> r4 = r0.C
            r4.add(r3)
            r3.i = r0
            int r2 = r2 + 1
            goto L14
        L2c:
            return r0
    }

    @Override // androidx.transition.e
    public final void l(android.widget.FrameLayout r12, a.A2 r13, a.A2 r14, java.util.ArrayList r15, java.util.ArrayList r16) {
            r11 = this;
            long r0 = r11.b
            java.util.ArrayList<androidx.transition.e> r2 = r11.C
            int r2 = r2.size()
            r3 = 0
        L9:
            if (r3 >= r2) goto L3d
            java.util.ArrayList<androidx.transition.e> r4 = r11.C
            java.lang.Object r4 = r4.get(r3)
            r5 = r4
            androidx.transition.e r5 = (androidx.transition.e) r5
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L21
            boolean r4 = r11.D
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
            r5.H(r8)
            goto L21
        L33:
            r5.H(r0)
            goto L21
        L37:
            r5.l(r6, r7, r8, r9, r10)
            int r3 = r3 + 1
            goto L9
        L3d:
            return
    }

    @Override // androidx.transition.e
    public final boolean s() {
            r3 = this;
            r0 = 0
            r1 = r0
        L2:
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            int r2 = r2.size()
            if (r1 >= r2) goto L1d
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            boolean r2 = r2.s()
            if (r2 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            int r1 = r1 + 1
            goto L2
        L1d:
            return r0
    }

    @Override // androidx.transition.e
    public final void w(android.view.ViewGroup r4) {
            r3 = this;
            super.w(r4)
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.w(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }

    @Override // androidx.transition.e
    public final void x() {
            r7 = this;
            r0 = 0
            r7.w = r0
            androidx.transition.h$b r0 = new androidx.transition.h$b
            r0.<init>(r7)
            r1 = 0
        La:
            java.util.ArrayList<androidx.transition.e> r2 = r7.C
            int r2 = r2.size()
            if (r1 >= r2) goto L39
            java.util.ArrayList<androidx.transition.e> r2 = r7.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.a(r0)
            r2.x()
            long r3 = r2.w
            boolean r5 = r7.D
            if (r5 == 0) goto L2f
            long r5 = r7.w
            long r2 = java.lang.Math.max(r5, r3)
            r7.w = r2
            goto L36
        L2f:
            long r5 = r7.w
            r2.x = r5
            long r5 = r5 + r3
            r7.w = r5
        L36:
            int r1 = r1 + 1
            goto La
        L39:
            return
    }

    @Override // androidx.transition.e
    public final androidx.transition.e y(androidx.transition.e.f r1) {
            r0 = this;
            super.y(r1)
            return r0
    }

    @Override // androidx.transition.e
    public final void z(android.widget.FrameLayout r4) {
            r3 = this;
            super.z(r4)
            java.util.ArrayList<androidx.transition.e> r0 = r3.C
            int r0 = r0.size()
            r1 = 0
        La:
            if (r1 >= r0) goto L1a
            java.util.ArrayList<androidx.transition.e> r2 = r3.C
            java.lang.Object r2 = r2.get(r1)
            androidx.transition.e r2 = (androidx.transition.e) r2
            r2.z(r4)
            int r1 = r1 + 1
            goto La
        L1a:
            return
    }
}
