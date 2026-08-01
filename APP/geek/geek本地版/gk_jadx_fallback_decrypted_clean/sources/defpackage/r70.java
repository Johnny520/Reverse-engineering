package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class r70 implements java.lang.Cloneable {
    public static final int[] t = null;
    public static final defpackage.iy u = null;
    public static final java.lang.ThreadLocal v = null;
    public final java.lang.String a;
    public long b;
    public long c;
    public android.animation.TimeInterpolator d;
    public final java.util.ArrayList e;
    public final java.util.ArrayList f;
    public defpackage.a8 g;
    public defpackage.a8 h;
    public defpackage.z6 i;
    public final int[] j;
    public java.util.ArrayList k;
    public java.util.ArrayList l;
    public final java.util.ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public java.util.ArrayList q;
    public java.util.ArrayList r;
    public defpackage.iy s;

    static {
            r0 = 3
            r1 = 4
            r2 = 2
            r3 = 1
            int[] r0 = new int[]{r2, r3, r0, r1}
            defpackage.r70.t = r0
            iy r0 = new iy
            r1 = 8
            r0.<init>(r1)
            defpackage.r70.u = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.r70.v = r0
            return
    }

    public r70() {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r3.a = r0
            r0 = -1
            r3.b = r0
            r3.c = r0
            r0 = 0
            r3.d = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.e = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f = r1
            a8 r1 = new a8
            r2 = 4
            r1.<init>(r2)
            r3.g = r1
            a8 r1 = new a8
            r1.<init>(r2)
            r3.h = r1
            r3.i = r0
            int[] r1 = defpackage.r70.t
            r3.j = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.m = r1
            r1 = 0
            r3.n = r1
            r3.o = r1
            r3.p = r1
            r3.q = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.r = r0
            iy r0 = defpackage.r70.u
            r3.s = r0
            return
    }

    public static void b(defpackage.a8 r4, android.view.View r5, defpackage.x70 r6) {
            java.lang.Object r0 = r4.a
            n6 r0 = (defpackage.n6) r0
            java.lang.Object r1 = r4.d
            n6 r1 = (defpackage.n6) r1
            java.lang.Object r2 = r4.b
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            java.lang.Object r4 = r4.c
            bs r4 = (defpackage.bs) r4
            r0.put(r5, r6)
            int r6 = r5.getId()
            r0 = 0
            if (r6 < 0) goto L27
            int r3 = r2.indexOfKey(r6)
            if (r3 < 0) goto L24
            r2.put(r6, r0)
            goto L27
        L24:
            r2.put(r6, r5)
        L27:
            java.util.WeakHashMap r6 = defpackage.ja0.a
            java.lang.String r6 = defpackage.y90.k(r5)
            if (r6 == 0) goto L3c
            boolean r2 = r1.containsKey(r6)
            if (r2 == 0) goto L39
            r1.put(r6, r0)
            goto L3c
        L39:
            r1.put(r6, r5)
        L3c:
            android.view.ViewParent r6 = r5.getParent()
            boolean r6 = r6 instanceof android.widget.ListView
            if (r6 == 0) goto L84
            android.view.ViewParent r6 = r5.getParent()
            android.widget.ListView r6 = (android.widget.ListView) r6
            android.widget.ListAdapter r1 = r6.getAdapter()
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L84
            int r1 = r6.getPositionForView(r5)
            long r1 = r6.getItemIdAtPosition(r1)
            boolean r6 = r4.a
            if (r6 == 0) goto L63
            r4.b()
        L63:
            long[] r6 = r4.b
            int r3 = r4.d
            int r6 = defpackage.ff.d(r6, r3, r1)
            if (r6 < 0) goto L7d
            java.lang.Object r5 = r4.c(r1, r0)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L84
            r6 = 0
            defpackage.s90.r(r5, r6)
            r4.d(r1, r0)
            return
        L7d:
            r6 = 1
            defpackage.s90.r(r5, r6)
            r4.d(r1, r5)
        L84:
            return
    }

    public static defpackage.n6 n() {
            java.lang.ThreadLocal r0 = defpackage.r70.v
            java.lang.Object r1 = r0.get()
            n6 r1 = (defpackage.n6) r1
            if (r1 != 0) goto L12
            n6 r1 = new n6
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    public static boolean s(defpackage.x70 r0, defpackage.x70 r1, java.lang.String r2) {
            java.util.HashMap r0 = r0.a
            java.lang.Object r0 = r0.get(r2)
            java.util.HashMap r1 = r1.a
            java.lang.Object r1 = r1.get(r2)
            if (r0 != 0) goto L12
            if (r1 != 0) goto L12
            r0 = 0
            return r0
        L12:
            r2 = 1
            if (r0 == 0) goto L1e
            if (r1 != 0) goto L18
            goto L1e
        L18:
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ r2
            return r0
        L1e:
            return r2
    }

    public void A(defpackage.iy r1) {
            r0 = this;
            if (r1 != 0) goto L7
            iy r1 = defpackage.r70.u
            r0.s = r1
            return
        L7:
            r0.s = r1
            return
    }

    public void B() {
            r0 = this;
            return
    }

    public void C(long r1) {
            r0 = this;
            r0.b = r1
            return
    }

    public final void D() {
            r5 = this;
            int r0 = r5.n
            if (r0 != 0) goto L2c
            java.util.ArrayList r0 = r5.q
            r1 = 0
            if (r0 == 0) goto L2a
            int r0 = r0.size()
            if (r0 <= 0) goto L2a
            java.util.ArrayList r0 = r5.q
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r3 = r1
        L1c:
            if (r3 >= r2) goto L2a
            java.lang.Object r4 = r0.get(r3)
            q70 r4 = (defpackage.q70) r4
            r4.b()
            int r3 = r3 + 1
            goto L1c
        L2a:
            r5.p = r1
        L2c:
            int r0 = r5.n
            int r0 = r0 + 1
            r5.n = r0
            return
    }

    public java.lang.String E(java.lang.String r7) {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.Class r7 = r6.getClass()
            java.lang.String r7 = r7.getSimpleName()
            r0.append(r7)
            java.lang.String r7 = "@"
            r0.append(r7)
            int r7 = r6.hashCode()
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            r0.append(r7)
            java.lang.String r7 = ": "
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            long r0 = r6.c
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            java.lang.String r1 = ") "
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "dur("
            r0.append(r7)
            long r4 = r6.c
            r0.append(r4)
            r0.append(r1)
            java.lang.String r7 = r0.toString()
        L4f:
            long r4 = r6.b
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L6e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "dly("
            r0.append(r7)
            long r2 = r6.b
            r0.append(r2)
            r0.append(r1)
            java.lang.String r7 = r0.toString()
        L6e:
            android.animation.TimeInterpolator r0 = r6.d
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "interp("
            r0.append(r7)
            android.animation.TimeInterpolator r7 = r6.d
            r0.append(r7)
            r0.append(r1)
            java.lang.String r7 = r0.toString()
        L8b:
            java.util.ArrayList r0 = r6.e
            int r1 = r0.size()
            java.util.ArrayList r2 = r6.f
            if (r1 > 0) goto L9d
            int r1 = r2.size()
            if (r1 <= 0) goto L9c
            goto L9d
        L9c:
            return r7
        L9d:
            java.lang.String r1 = "tgts("
            java.lang.String r7 = defpackage.z30.i(r7, r1)
            int r1 = r0.size()
            java.lang.String r3 = ", "
            r4 = 0
            if (r1 <= 0) goto Lcf
            r1 = r4
        Lad:
            int r5 = r0.size()
            if (r1 >= r5) goto Lcf
            if (r1 <= 0) goto Lb9
            java.lang.String r7 = defpackage.z30.i(r7, r3)
        Lb9:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r7)
            java.lang.Object r7 = r0.get(r1)
            r5.append(r7)
            java.lang.String r7 = r5.toString()
            int r1 = r1 + 1
            goto Lad
        Lcf:
            int r0 = r2.size()
            if (r0 <= 0) goto Lf7
        Ld5:
            int r0 = r2.size()
            if (r4 >= r0) goto Lf7
            if (r4 <= 0) goto Le1
            java.lang.String r7 = defpackage.z30.i(r7, r3)
        Le1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.Object r7 = r2.get(r4)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            int r4 = r4 + 1
            goto Ld5
        Lf7:
            java.lang.String r0 = ")"
            java.lang.String r7 = defpackage.z30.i(r7, r0)
            return r7
    }

    public void a(defpackage.q70 r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.q
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.q = r0
        Lb:
            java.util.ArrayList r0 = r1.q
            r0.add(r2)
            return
    }

    public abstract void c(defpackage.x70 r1);

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r1 = this;
            r70 r0 = r1.i()
            return r0
    }

    public final void d(android.view.View r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L48
        L3:
            r3.getId()
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L31
            x70 r0 = new x70
            r0.<init>(r3)
            if (r4 == 0) goto L19
            r2.f(r0)
            goto L1c
        L19:
            r2.c(r0)
        L1c:
            java.util.ArrayList r1 = r0.c
            r1.add(r2)
            r2.e(r0)
            if (r4 == 0) goto L2c
            a8 r1 = r2.g
            b(r1, r3, r0)
            goto L31
        L2c:
            a8 r1 = r2.h
            b(r1, r3, r0)
        L31:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L48
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
        L38:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L48
            android.view.View r1 = r3.getChildAt(r0)
            r2.d(r1, r4)
            int r0 = r0 + 1
            goto L38
        L48:
            return
    }

    public void e(defpackage.x70 r1) {
            r0 = this;
            return
    }

    public abstract void f(defpackage.x70 r1);

    public final void g(android.view.ViewGroup r8, boolean r9) {
            r7 = this;
            r7.h(r9)
            java.util.ArrayList r0 = r7.e
            int r1 = r0.size()
            java.util.ArrayList r2 = r7.f
            if (r1 > 0) goto L18
            int r1 = r2.size()
            if (r1 <= 0) goto L14
            goto L18
        L14:
            r7.d(r8, r9)
            return
        L18:
            r1 = 0
            r3 = r1
        L1a:
            int r4 = r0.size()
            if (r3 >= r4) goto L56
            java.lang.Object r4 = r0.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            android.view.View r4 = r8.findViewById(r4)
            if (r4 == 0) goto L53
            x70 r5 = new x70
            r5.<init>(r4)
            if (r9 == 0) goto L3b
            r7.f(r5)
            goto L3e
        L3b:
            r7.c(r5)
        L3e:
            java.util.ArrayList r6 = r5.c
            r6.add(r7)
            r7.e(r5)
            if (r9 == 0) goto L4e
            a8 r6 = r7.g
            b(r6, r4, r5)
            goto L53
        L4e:
            a8 r6 = r7.h
            b(r6, r4, r5)
        L53:
            int r3 = r3 + 1
            goto L1a
        L56:
            int r8 = r2.size()
            if (r1 >= r8) goto L88
            java.lang.Object r8 = r2.get(r1)
            android.view.View r8 = (android.view.View) r8
            x70 r0 = new x70
            r0.<init>(r8)
            if (r9 == 0) goto L6d
            r7.f(r0)
            goto L70
        L6d:
            r7.c(r0)
        L70:
            java.util.ArrayList r3 = r0.c
            r3.add(r7)
            r7.e(r0)
            if (r9 == 0) goto L80
            a8 r3 = r7.g
            b(r3, r8, r0)
            goto L85
        L80:
            a8 r3 = r7.h
            b(r3, r8, r0)
        L85:
            int r1 = r1 + 1
            goto L56
        L88:
            return
    }

    public final void h(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L1e
            a8 r1 = r0.g
            java.lang.Object r1 = r1.a
            n6 r1 = (defpackage.n6) r1
            r1.clear()
            a8 r1 = r0.g
            java.lang.Object r1 = r1.b
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            r1.clear()
            a8 r1 = r0.g
            java.lang.Object r1 = r1.c
            bs r1 = (defpackage.bs) r1
            r1.a()
            return
        L1e:
            a8 r1 = r0.h
            java.lang.Object r1 = r1.a
            n6 r1 = (defpackage.n6) r1
            r1.clear()
            a8 r1 = r0.h
            java.lang.Object r1 = r1.b
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            r1.clear()
            a8 r1 = r0.h
            java.lang.Object r1 = r1.c
            bs r1 = (defpackage.bs) r1
            r1.a()
            return
    }

    public defpackage.r70 i() {
            r4 = this;
            r0 = 0
            java.lang.Object r1 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L23
            r70 r1 = (defpackage.r70) r1     // Catch: java.lang.CloneNotSupportedException -> L23
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.CloneNotSupportedException -> L23
            r2.<init>()     // Catch: java.lang.CloneNotSupportedException -> L23
            r1.r = r2     // Catch: java.lang.CloneNotSupportedException -> L23
            a8 r2 = new a8     // Catch: java.lang.CloneNotSupportedException -> L23
            r3 = 4
            r2.<init>(r3)     // Catch: java.lang.CloneNotSupportedException -> L23
            r1.g = r2     // Catch: java.lang.CloneNotSupportedException -> L23
            a8 r2 = new a8     // Catch: java.lang.CloneNotSupportedException -> L23
            r3 = 4
            r2.<init>(r3)     // Catch: java.lang.CloneNotSupportedException -> L23
            r1.h = r2     // Catch: java.lang.CloneNotSupportedException -> L23
            r1.k = r0     // Catch: java.lang.CloneNotSupportedException -> L23
            r1.l = r0     // Catch: java.lang.CloneNotSupportedException -> L23
            return r1
        L23:
            return r0
    }

    public android.animation.Animator j(android.view.ViewGroup r1, defpackage.x70 r2, defpackage.x70 r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void k(android.view.ViewGroup r20, defpackage.a8 r21, defpackage.a8 r22, java.util.ArrayList r23, java.util.ArrayList r24) {
            r19 = this;
            r0 = r19
            r1 = r20
            n6 r2 = n()
            android.util.SparseIntArray r3 = new android.util.SparseIntArray
            r3.<init>()
            int r4 = r23.size()
            r6 = 0
        L12:
            if (r6 >= r4) goto L105
            r7 = r23
            java.lang.Object r8 = r7.get(r6)
            x70 r8 = (defpackage.x70) r8
            r9 = r24
            java.lang.Object r10 = r9.get(r6)
            x70 r10 = (defpackage.x70) r10
            r11 = 0
            if (r8 == 0) goto L30
            java.util.ArrayList r12 = r8.c
            boolean r12 = r12.contains(r0)
            if (r12 != 0) goto L30
            r8 = r11
        L30:
            if (r10 == 0) goto L3b
            java.util.ArrayList r12 = r10.c
            boolean r12 = r12.contains(r0)
            if (r12 != 0) goto L3b
            r10 = r11
        L3b:
            if (r8 != 0) goto L47
            if (r10 != 0) goto L47
        L3f:
            r15 = r22
            r16 = r4
            r17 = r6
            goto Lff
        L47:
            if (r8 == 0) goto L51
            if (r10 == 0) goto L51
            boolean r12 = r0.q(r8, r10)
            if (r12 == 0) goto L3f
        L51:
            android.animation.Animator r12 = r0.j(r1, r8, r10)
            if (r12 == 0) goto L3f
            java.lang.String r13 = r0.a
            if (r10 == 0) goto Ld6
            android.view.View r8 = r10.b
            java.lang.String[] r10 = r0.o()
            if (r10 == 0) goto Lca
            int r14 = r10.length
            if (r14 <= 0) goto Lca
            x70 r14 = new x70
            r14.<init>(r8)
            r15 = r22
            java.lang.Object r5 = r15.a
            n6 r5 = (defpackage.n6) r5
            java.lang.Object r5 = r5.getOrDefault(r8, r11)
            x70 r5 = (defpackage.x70) r5
            r16 = r4
            if (r5 == 0) goto L97
            r11 = 0
        L7c:
            int r4 = r10.length
            if (r11 >= r4) goto L97
            r4 = r10[r11]
            r17 = r6
            java.util.HashMap r6 = r5.a
            java.lang.Object r6 = r6.get(r4)
            r18 = r5
            java.util.HashMap r5 = r14.a
            r5.put(r4, r6)
            int r11 = r11 + 1
            r6 = r17
            r5 = r18
            goto L7c
        L97:
            r17 = r6
            int r4 = r2.c
            r5 = 0
        L9c:
            if (r5 >= r4) goto Lc8
            java.lang.Object r6 = r2.h(r5)
            android.animation.Animator r6 = (android.animation.Animator) r6
            r10 = 0
            java.lang.Object r6 = r2.getOrDefault(r6, r10)
            p70 r6 = (defpackage.p70) r6
            x70 r11 = r6.c
            if (r11 == 0) goto Lc5
            android.view.View r11 = r6.a
            if (r11 != r8) goto Lc5
            java.lang.String r11 = r6.b
            boolean r11 = r11.equals(r13)
            if (r11 == 0) goto Lc5
            x70 r6 = r6.c
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto Lc5
            r11 = r10
            goto Ld3
        Lc5:
            int r5 = r5 + 1
            goto L9c
        Lc8:
            r11 = r12
            goto Ld3
        Lca:
            r15 = r22
            r16 = r4
            r17 = r6
            r10 = r11
            r14 = r10
            goto Lc8
        Ld3:
            r12 = r11
            r11 = r14
            goto Ldf
        Ld6:
            r15 = r22
            r16 = r4
            r17 = r6
            r10 = r11
            android.view.View r8 = r8.b
        Ldf:
            if (r12 == 0) goto Lff
            p70 r4 = new p70
            db0 r5 = defpackage.bb0.a
            zb0 r5 = new zb0
            r5.<init>(r1)
            r4.<init>()
            r4.a = r8
            r4.b = r13
            r4.c = r11
            r4.d = r5
            r4.e = r0
            r2.put(r12, r4)
            java.util.ArrayList r4 = r0.r
            r4.add(r12)
        Lff:
            int r6 = r17 + 1
            r4 = r16
            goto L12
        L105:
            int r1 = r3.size()
            if (r1 == 0) goto L134
            r5 = 0
        L10c:
            int r1 = r3.size()
            if (r5 >= r1) goto L134
            int r1 = r3.keyAt(r5)
            java.util.ArrayList r2 = r0.r
            java.lang.Object r1 = r2.get(r1)
            android.animation.Animator r1 = (android.animation.Animator) r1
            int r2 = r3.valueAt(r5)
            long r6 = (long) r2
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r6 = r6 - r8
            long r8 = r1.getStartDelay()
            long r8 = r8 + r6
            r1.setStartDelay(r8)
            int r5 = r5 + 1
            goto L10c
        L134:
            return
    }

    public final void l() {
            r6 = this;
            int r0 = r6.n
            r1 = 1
            int r0 = r0 - r1
            r6.n = r0
            if (r0 != 0) goto L76
            java.util.ArrayList r0 = r6.q
            r2 = 0
            if (r0 == 0) goto L2e
            int r0 = r0.size()
            if (r0 <= 0) goto L2e
            java.util.ArrayList r0 = r6.q
            java.lang.Object r0 = r0.clone()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            r4 = r2
        L20:
            if (r4 >= r3) goto L2e
            java.lang.Object r5 = r0.get(r4)
            q70 r5 = (defpackage.q70) r5
            r5.e(r6)
            int r4 = r4 + 1
            goto L20
        L2e:
            r0 = r2
        L2f:
            a8 r3 = r6.g
            java.lang.Object r3 = r3.c
            bs r3 = (defpackage.bs) r3
            int r3 = r3.e()
            if (r0 >= r3) goto L51
            a8 r3 = r6.g
            java.lang.Object r3 = r3.c
            bs r3 = (defpackage.bs) r3
            java.lang.Object r3 = r3.f(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L4e
            java.util.WeakHashMap r4 = defpackage.ja0.a
            defpackage.s90.r(r3, r2)
        L4e:
            int r0 = r0 + 1
            goto L2f
        L51:
            r0 = r2
        L52:
            a8 r3 = r6.h
            java.lang.Object r3 = r3.c
            bs r3 = (defpackage.bs) r3
            int r3 = r3.e()
            if (r0 >= r3) goto L74
            a8 r3 = r6.h
            java.lang.Object r3 = r3.c
            bs r3 = (defpackage.bs) r3
            java.lang.Object r3 = r3.f(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L71
            java.util.WeakHashMap r4 = defpackage.ja0.a
            defpackage.s90.r(r3, r2)
        L71:
            int r0 = r0 + 1
            goto L52
        L74:
            r6.p = r1
        L76:
            return
    }

    public final defpackage.x70 m(android.view.View r5, boolean r6) {
            r4 = this;
            z6 r0 = r4.i
            if (r0 == 0) goto L9
            x70 r5 = r0.m(r5, r6)
            return r5
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.k
            goto L10
        Le:
            java.util.ArrayList r0 = r4.l
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            x70 r3 = (defpackage.x70) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r5 = r4.l
            goto L35
        L33:
            java.util.ArrayList r5 = r4.k
        L35:
            java.lang.Object r5 = r5.get(r2)
            x70 r5 = (defpackage.x70) r5
            return r5
        L3c:
            r5 = 0
            return r5
    }

    public java.lang.String[] o() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final defpackage.x70 p(android.view.View r2, boolean r3) {
            r1 = this;
            z6 r0 = r1.i
            if (r0 == 0) goto L9
            x70 r2 = r0.p(r2, r3)
            return r2
        L9:
            if (r3 == 0) goto Le
            a8 r3 = r1.g
            goto L10
        Le:
            a8 r3 = r1.h
        L10:
            java.lang.Object r3 = r3.a
            n6 r3 = (defpackage.n6) r3
            r0 = 0
            java.lang.Object r2 = r3.getOrDefault(r2, r0)
            x70 r2 = (defpackage.x70) r2
            return r2
    }

    public boolean q(defpackage.x70 r6, defpackage.x70 r7) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L39
            if (r7 == 0) goto L39
            java.lang.String[] r1 = r5.o()
            if (r1 == 0) goto L1b
            int r2 = r1.length
            r3 = r0
        Ld:
            if (r3 >= r2) goto L39
            r4 = r1[r3]
            boolean r4 = s(r6, r7, r4)
            if (r4 == 0) goto L18
            goto L37
        L18:
            int r3 = r3 + 1
            goto Ld
        L1b:
            java.util.HashMap r1 = r6.a
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        L25:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = s(r6, r7, r2)
            if (r2 == 0) goto L25
        L37:
            r6 = 1
            return r6
        L39:
            return r0
    }

    public final boolean r(android.view.View r6) {
            r5 = this;
            int r0 = r6.getId()
            java.util.ArrayList r1 = r5.e
            int r2 = r1.size()
            r3 = 1
            java.util.ArrayList r4 = r5.f
            if (r2 != 0) goto L16
            int r2 = r4.size()
            if (r2 != 0) goto L16
            return r3
        L16:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L29
            boolean r6 = r4.contains(r6)
            if (r6 == 0) goto L27
            goto L29
        L27:
            r6 = 0
            return r6
        L29:
            return r3
    }

    public void t(android.view.View r6) {
            r5 = this;
            boolean r0 = r5.p
            if (r0 != 0) goto L5b
            n6 r0 = n()
            int r1 = r0.c
            db0 r2 = defpackage.bb0.a
            android.view.WindowId r6 = r6.getWindowId()
            r2 = 1
            int r1 = r1 - r2
        L12:
            if (r1 < 0) goto L34
            java.lang.Object r3 = r0.j(r1)
            p70 r3 = (defpackage.p70) r3
            android.view.View r4 = r3.a
            if (r4 == 0) goto L31
            zb0 r3 = r3.d
            android.view.WindowId r3 = r3.a
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L31
            java.lang.Object r3 = r0.h(r1)
            android.animation.Animator r3 = (android.animation.Animator) r3
            r3.pause()
        L31:
            int r1 = r1 + (-1)
            goto L12
        L34:
            java.util.ArrayList r6 = r5.q
            if (r6 == 0) goto L59
            int r6 = r6.size()
            if (r6 <= 0) goto L59
            java.util.ArrayList r6 = r5.q
            java.lang.Object r6 = r6.clone()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = r6.size()
            r1 = 0
        L4b:
            if (r1 >= r0) goto L59
            java.lang.Object r3 = r6.get(r1)
            q70 r3 = (defpackage.q70) r3
            r3.c()
            int r1 = r1 + 1
            goto L4b
        L59:
            r5.o = r2
        L5b:
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r0 = r1.E(r0)
            return r0
    }

    public void u(defpackage.q70 r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.q
            if (r0 != 0) goto L5
            goto L13
        L5:
            r0.remove(r2)
            java.util.ArrayList r2 = r1.q
            int r2 = r2.size()
            if (r2 != 0) goto L13
            r2 = 0
            r1.q = r2
        L13:
            return
    }

    public void v(android.view.View r6) {
            r5 = this;
            boolean r0 = r5.o
            if (r0 == 0) goto L60
            boolean r0 = r5.p
            r1 = 0
            if (r0 != 0) goto L5e
            n6 r0 = n()
            int r2 = r0.c
            db0 r3 = defpackage.bb0.a
            android.view.WindowId r6 = r6.getWindowId()
            int r2 = r2 + (-1)
        L17:
            if (r2 < 0) goto L39
            java.lang.Object r3 = r0.j(r2)
            p70 r3 = (defpackage.p70) r3
            android.view.View r4 = r3.a
            if (r4 == 0) goto L36
            zb0 r3 = r3.d
            android.view.WindowId r3 = r3.a
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L36
            java.lang.Object r3 = r0.h(r2)
            android.animation.Animator r3 = (android.animation.Animator) r3
            r3.resume()
        L36:
            int r2 = r2 + (-1)
            goto L17
        L39:
            java.util.ArrayList r6 = r5.q
            if (r6 == 0) goto L5e
            int r6 = r6.size()
            if (r6 <= 0) goto L5e
            java.util.ArrayList r6 = r5.q
            java.lang.Object r6 = r6.clone()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = r6.size()
            r2 = r1
        L50:
            if (r2 >= r0) goto L5e
            java.lang.Object r3 = r6.get(r2)
            q70 r3 = (defpackage.q70) r3
            r3.d()
            int r2 = r2 + 1
            goto L50
        L5e:
            r5.o = r1
        L60:
            return
    }

    public void w() {
            r10 = this;
            r10.D()
            n6 r0 = n()
            java.util.ArrayList r1 = r10.r
            int r2 = r1.size()
            r3 = 0
        Le:
            if (r3 >= r2) goto L58
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            android.animation.Animator r4 = (android.animation.Animator) r4
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto Le
            r10.D()
            if (r4 == 0) goto Le
            o70 r5 = new o70
            r5.<init>(r10, r0)
            r4.addListener(r5)
            long r5 = r10.c
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L36
            r4.setDuration(r5)
        L36:
            long r5 = r10.b
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 < 0) goto L44
            long r7 = r4.getStartDelay()
            long r7 = r7 + r5
            r4.setStartDelay(r7)
        L44:
            android.animation.TimeInterpolator r5 = r10.d
            if (r5 == 0) goto L4b
            r4.setInterpolator(r5)
        L4b:
            y0 r5 = new y0
            r6 = 5
            r5.<init>(r6, r10)
            r4.addListener(r5)
            r4.start()
            goto Le
        L58:
            java.util.ArrayList r0 = r10.r
            r0.clear()
            r10.l()
            return
    }

    public void x(long r1) {
            r0 = this;
            r0.c = r1
            return
    }

    public void y(defpackage.gt r1) {
            r0 = this;
            return
    }

    public void z(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.d = r1
            return
    }
}
