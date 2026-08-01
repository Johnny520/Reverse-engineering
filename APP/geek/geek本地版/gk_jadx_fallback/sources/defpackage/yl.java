package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class yl {
    public boolean A;
    public boolean B;
    public java.util.ArrayList C;
    public java.util.ArrayList D;
    public java.util.ArrayList E;
    public defpackage.am F;
    public final defpackage.y6 G;
    public final java.util.ArrayList a;
    public boolean b;
    public final defpackage.r5 c;
    public java.util.ArrayList d;
    public java.util.ArrayList e;
    public final defpackage.ql f;
    public androidx.activity.a g;
    public final defpackage.sl h;
    public final java.util.concurrent.atomic.AtomicInteger i;
    public final java.util.Map j;
    public final defpackage.d4 k;
    public final java.util.concurrent.CopyOnWriteArrayList l;
    public int m;
    public defpackage.nl n;
    public defpackage.ip o;
    public defpackage.ml p;
    public defpackage.ml q;
    public final defpackage.tl r;
    public final defpackage.vh s;
    public defpackage.d4 t;
    public defpackage.d4 u;
    public defpackage.d4 v;
    public java.util.ArrayDeque w;
    public boolean x;
    public boolean y;
    public boolean z;

    public yl() {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.a = r0
            r5 r0 = new r5
            r0.<init>()
            r2.c = r0
            ql r0 = new ql
            r0.<init>(r2)
            r2.f = r0
            sl r0 = new sl
            r0.<init>(r2)
            r2.h = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            r2.i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r0 = java.util.Collections.synchronizedMap(r0)
            r2.j = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Collections.synchronizedMap(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Collections.synchronizedMap(r0)
            vh r0 = new vh
            r0.<init>(r2)
            d4 r0 = new d4
            r0.<init>(r2)
            r2.k = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.l = r0
            r0 = -1
            r2.m = r0
            tl r0 = new tl
            r0.<init>(r2)
            r2.r = r0
            vh r0 = new vh
            r1 = 24
            r0.<init>(r1)
            r2.s = r0
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            r2.w = r0
            y6 r0 = new y6
            r1 = 7
            r0.<init>(r1, r2)
            r2.G = r0
            return
    }

    public static boolean A(int r1) {
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static boolean B(defpackage.ml r5) {
            r5.getClass()
            yl r5 = r5.t
            r5 r5 = r5.c
            r5.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Object r5 = r5.b
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.util.Collection r5 = r5.values()
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r5.next()
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            if (r1 == 0) goto L2f
            ml r1 = r1.c
            r0.add(r1)
            goto L1b
        L2f:
            r1 = 0
            r0.add(r1)
            goto L1b
        L34:
            int r5 = r0.size()
            r1 = 0
            r2 = r1
            r3 = r2
        L3b:
            if (r3 >= r5) goto L4f
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            ml r4 = (defpackage.ml) r4
            if (r4 == 0) goto L4b
            boolean r2 = B(r4)
        L4b:
            if (r2 == 0) goto L3b
            r5 = 1
            return r5
        L4f:
            return r1
    }

    public static boolean C(defpackage.ml r1) {
            if (r1 != 0) goto L3
            goto L13
        L3:
            boolean r0 = r1.B
            if (r0 == 0) goto L15
            yl r0 = r1.r
            if (r0 == 0) goto L13
            ml r1 = r1.u
            boolean r1 = C(r1)
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    public static boolean D(defpackage.ml r2) {
            if (r2 != 0) goto L3
            goto L15
        L3:
            yl r0 = r2.r
            ml r1 = r0.q
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L17
            ml r2 = r0.p
            boolean r2 = D(r2)
            if (r2 == 0) goto L17
        L15:
            r2 = 1
            return r2
        L17:
            r2 = 0
            return r2
    }

    public static void R(defpackage.ml r2) {
            r0 = 2
            boolean r0 = A(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "show: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            boolean r0 = r2.y
            if (r0 == 0) goto L27
            r0 = 0
            r2.y = r0
            boolean r0 = r2.I
            r0 = r0 ^ 1
            r2.I = r0
        L27:
            return
    }

    public final void E(int r6, boolean r7) {
            r5 = this;
            nl r0 = r5.n
            if (r0 != 0) goto L10
            r0 = -1
            if (r6 != r0) goto L8
            goto L10
        L8:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "No activity"
            r6.<init>(r7)
            throw r6
        L10:
            if (r7 != 0) goto L17
            int r7 = r5.m
            if (r6 != r7) goto L17
            goto L80
        L17:
            r5.m = r6
            r5 r6 = r5.c
            java.lang.Object r7 = r6.b
            java.util.HashMap r7 = (java.util.HashMap) r7
            java.lang.Object r0 = r6.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L29:
            if (r3 >= r1) goto L41
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            ml r4 = (defpackage.ml) r4
            java.lang.String r4 = r4.e
            java.lang.Object r4 = r7.get(r4)
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            if (r4 == 0) goto L29
            r4.k()
            goto L29
        L41:
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L49:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r7.next()
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            if (r0 == 0) goto L49
            r0.k()
            ml r1 = r0.c
            boolean r3 = r1.l
            if (r3 == 0) goto L49
            int r1 = r1.q
            if (r1 <= 0) goto L65
            goto L49
        L65:
            r6.w(r0)
            goto L49
        L69:
            r5.S()
            boolean r6 = r5.x
            if (r6 == 0) goto L80
            nl r6 = r5.n
            if (r6 == 0) goto L80
            int r7 = r5.m
            r0 = 7
            if (r7 != r0) goto L80
            androidx.fragment.app.FragmentActivity r6 = r6.G
            r6.f()
            r5.x = r2
        L80:
            return
    }

    public final void F() {
            r2 = this;
            nl r0 = r2.n
            if (r0 != 0) goto L5
            goto L2c
        L5:
            r0 = 0
            r2.y = r0
            r2.z = r0
            am r1 = r2.F
            r1.h = r0
            r5 r0 = r2.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            ml r1 = (defpackage.ml) r1
            if (r1 == 0) goto L18
            yl r1 = r1.t
            r1.F()
            goto L18
        L2c:
            return
    }

    public final boolean G() {
            r5 = this;
            r0 = 0
            r5.t(r0)
            r1 = 1
            r5.s(r1)
            ml r2 = r5.q
            if (r2 == 0) goto L17
            yl r2 = r2.g()
            boolean r2 = r2.G()
            if (r2 == 0) goto L17
            return r1
        L17:
            java.util.ArrayList r2 = r5.C
            java.util.ArrayList r3 = r5.D
            r4 = -1
            boolean r2 = r5.H(r2, r3, r4, r0)
            if (r2 == 0) goto L34
            r5.b = r1
            java.util.ArrayList r1 = r5.C     // Catch: java.lang.Throwable -> L2f
            java.util.ArrayList r3 = r5.D     // Catch: java.lang.Throwable -> L2f
            r5.J(r1, r3)     // Catch: java.lang.Throwable -> L2f
            r5.d()
            goto L34
        L2f:
            r0 = move-exception
            r5.d()
            throw r0
        L34:
            r5.T()
            boolean r1 = r5.B
            if (r1 == 0) goto L40
            r5.B = r0
            r5.S()
        L40:
            r5 r0 = r5.c
            java.lang.Object r0 = r0.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            r1 = 0
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r0.removeAll(r1)
            return r2
    }

    public final boolean H(java.util.ArrayList r4, java.util.ArrayList r5, int r6, int r7) {
            r3 = this;
            java.util.ArrayList r0 = r3.d
            if (r0 != 0) goto L5
            goto L61
        L5:
            r1 = 1
            if (r6 >= 0) goto L23
            r2 = r7 & 1
            if (r2 != 0) goto L23
            int r6 = r0.size()
            int r6 = r6 - r1
            if (r6 >= 0) goto L14
            goto L61
        L14:
            java.util.ArrayList r7 = r3.d
            java.lang.Object r6 = r7.remove(r6)
            r4.add(r6)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r5.add(r4)
            return r1
        L23:
            if (r6 < 0) goto L57
            int r0 = r0.size()
            int r0 = r0 - r1
        L2a:
            if (r0 < 0) goto L3e
            java.util.ArrayList r2 = r3.d
            java.lang.Object r2 = r2.get(r0)
            b7 r2 = (defpackage.b7) r2
            if (r6 < 0) goto L3b
            int r2 = r2.r
            if (r6 != r2) goto L3b
            goto L3e
        L3b:
            int r0 = r0 + (-1)
            goto L2a
        L3e:
            if (r0 >= 0) goto L41
            goto L61
        L41:
            r7 = r7 & r1
            if (r7 == 0) goto L58
        L44:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L58
            java.util.ArrayList r7 = r3.d
            java.lang.Object r7 = r7.get(r0)
            b7 r7 = (defpackage.b7) r7
            if (r6 < 0) goto L58
            int r7 = r7.r
            if (r6 != r7) goto L58
            goto L44
        L57:
            r0 = -1
        L58:
            java.util.ArrayList r6 = r3.d
            int r6 = r6.size()
            int r6 = r6 - r1
            if (r0 != r6) goto L63
        L61:
            r4 = 0
            return r4
        L63:
            java.util.ArrayList r6 = r3.d
            int r6 = r6.size()
            int r6 = r6 - r1
        L6a:
            if (r6 <= r0) goto L7d
            java.util.ArrayList r7 = r3.d
            java.lang.Object r7 = r7.remove(r6)
            r4.add(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.add(r7)
            int r6 = r6 + (-1)
            goto L6a
        L7d:
            return r1
    }

    public final void I(defpackage.ml r5) {
            r4 = this;
            r0 = 2
            boolean r0 = A(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "FragmentManager"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "remove: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r2 = " nesting="
            r1.append(r2)
            int r2 = r5.q
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L24:
            int r0 = r5.q
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r1
        L2d:
            boolean r3 = r5.z
            if (r3 == 0) goto L35
            if (r0 != 0) goto L34
            goto L35
        L34:
            return
        L35:
            r5 r0 = r4.c
            java.lang.Object r3 = r0.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            monitor-enter(r3)
            java.lang.Object r0 = r0.c     // Catch: java.lang.Throwable -> L54
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L54
            r0.remove(r5)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
            r5.k = r1
            boolean r0 = B(r5)
            if (r0 == 0) goto L4e
            r4.x = r2
        L4e:
            r5.l = r2
            r4.Q(r5)
            return
        L54:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L54
            throw r5
    }

    public final void J(java.util.ArrayList r5, java.util.ArrayList r6) {
            r4 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L7
            goto L5e
        L7:
            int r0 = r5.size()
            int r1 = r6.size()
            if (r0 != r1) goto L5f
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        L17:
            if (r1 >= r0) goto L59
            java.lang.Object r3 = r5.get(r1)
            b7 r3 = (defpackage.b7) r3
            boolean r3 = r3.o
            if (r3 != 0) goto L56
            if (r2 == r1) goto L28
            r4.u(r5, r6, r2, r1)
        L28:
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r1)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
        L36:
            if (r2 >= r0) goto L51
            java.lang.Object r3 = r6.get(r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L51
            java.lang.Object r3 = r5.get(r2)
            b7 r3 = (defpackage.b7) r3
            boolean r3 = r3.o
            if (r3 != 0) goto L51
            int r2 = r2 + 1
            goto L36
        L51:
            r4.u(r5, r6, r1, r2)
            int r1 = r2 + (-1)
        L56:
            int r1 = r1 + 1
            goto L17
        L59:
            if (r2 == r0) goto L5e
            r4.u(r5, r6, r2, r0)
        L5e:
            return
        L5f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Internal error with the back stack records"
            r5.<init>(r6)
            throw r5
    }

    public final void K(android.os.Parcelable r20) {
            r19 = this;
            r0 = r19
            if (r20 != 0) goto L5
            goto Ld
        L5:
            r1 = r20
            zl r1 = (defpackage.zl) r1
            java.util.ArrayList r2 = r1.a
            if (r2 != 0) goto Le
        Ld:
            return
        Le:
            r5 r2 = r0.c
            java.lang.Object r3 = r2.b
            java.util.HashMap r3 = (java.util.HashMap) r3
            r3.clear()
            java.util.ArrayList r3 = r1.a
            int r4 = r3.size()
            r6 = 0
        L1e:
            d4 r7 = r0.k
            java.lang.String r8 = "): "
            r9 = 2
            java.lang.String r10 = "FragmentManager"
            if (r6 >= r4) goto Lab
            java.lang.Object r11 = r3.get(r6)
            int r6 = r6 + 1
            cm r11 = (defpackage.cm) r11
            if (r11 == 0) goto L1e
            am r12 = r0.F
            java.lang.String r13 = r11.b
            java.util.HashMap r12 = r12.c
            java.lang.Object r12 = r12.get(r13)
            ml r12 = (defpackage.ml) r12
            if (r12 == 0) goto L5c
            boolean r13 = A(r9)
            if (r13 == 0) goto L56
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "restoreSaveState: re-attaching retained "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r10, r13)
        L56:
            androidx.fragment.app.a r13 = new androidx.fragment.app.a
            r13.<init>(r7, r2, r12, r11)
            goto L74
        L5c:
            androidx.fragment.app.a r12 = new androidx.fragment.app.a
            nl r7 = r0.n
            androidx.fragment.app.FragmentActivity r7 = r7.D
            java.lang.ClassLoader r15 = r7.getClassLoader()
            tl r16 = r0.x()
            d4 r13 = r0.k
            r5 r14 = r0.c
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            r13 = r12
        L74:
            ml r7 = r13.c
            r7.r = r0
            boolean r9 = A(r9)
            if (r9 == 0) goto L97
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "restoreSaveState: active ("
            r9.<init>(r11)
            java.lang.String r11 = r7.e
            r9.append(r11)
            r9.append(r8)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            android.util.Log.v(r10, r7)
        L97:
            nl r7 = r0.n
            androidx.fragment.app.FragmentActivity r7 = r7.D
            java.lang.ClassLoader r7 = r7.getClassLoader()
            r13.m(r7)
            r2.v(r13)
            int r7 = r0.m
            r13.e = r7
            goto L1e
        Lab:
            am r3 = r0.F
            r3.getClass()
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.HashMap r3 = r3.c
            java.util.Collection r3 = r3.values()
            r4.<init>(r3)
            int r3 = r4.size()
            r6 = 0
        Lc0:
            r11 = 1
            if (r6 >= r3) goto L110
            java.lang.Object r12 = r4.get(r6)
            int r6 = r6 + 1
            ml r12 = (defpackage.ml) r12
            java.lang.String r13 = r12.e
            java.lang.Object r14 = r2.b
            java.util.HashMap r14 = (java.util.HashMap) r14
            java.lang.Object r13 = r14.get(r13)
            if (r13 == 0) goto Ld8
            goto Lc0
        Ld8:
            boolean r13 = A(r9)
            if (r13 == 0) goto Lf9
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Discarding retained Fragment "
            r13.<init>(r14)
            r13.append(r12)
            java.lang.String r14 = " that was not found in the set of active Fragments "
            r13.append(r14)
            java.util.ArrayList r14 = r1.a
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.util.Log.v(r10, r13)
        Lf9:
            am r13 = r0.F
            r13.b(r12)
            r12.r = r0
            androidx.fragment.app.a r13 = new androidx.fragment.app.a
            r13.<init>(r7, r2, r12)
            r13.e = r11
            r13.k()
            r12.l = r11
            r13.k()
            goto Lc0
        L110:
            java.util.ArrayList r3 = r1.b
            java.lang.Object r4 = r2.c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.clear()
            if (r3 == 0) goto L15f
            int r4 = r3.size()
            r6 = 0
        L120:
            if (r6 >= r4) goto L15f
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            java.lang.String r7 = (java.lang.String) r7
            ml r12 = r2.g(r7)
            if (r12 == 0) goto L151
            boolean r13 = A(r9)
            if (r13 == 0) goto L14d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "restoreSaveState: added ("
            r13.<init>(r14)
            r13.append(r7)
            r13.append(r8)
            r13.append(r12)
            java.lang.String r7 = r13.toString()
            android.util.Log.v(r10, r7)
        L14d:
            r2.a(r12)
            goto L120
        L151:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "No instantiated fragment for ("
            java.lang.String r3 = ")"
            java.lang.String r2 = defpackage.z30.j(r2, r7, r3)
            r1.<init>(r2)
            throw r1
        L15f:
            c7[] r3 = r1.c
            r4 = 0
            if (r3 == 0) goto L28a
            java.util.ArrayList r3 = new java.util.ArrayList
            c7[] r6 = r1.c
            int r6 = r6.length
            r3.<init>(r6)
            r0.d = r3
            r3 = 0
        L16f:
            c7[] r6 = r1.c
            int r7 = r6.length
            if (r3 >= r7) goto L288
            r6 = r6[r3]
            int[] r7 = r6.a
            b7 r12 = new b7
            r12.<init>(r0)
            r13 = 0
            r14 = 0
        L17f:
            int r15 = r7.length
            if (r13 >= r15) goto L20e
            em r15 = new em
            r15.<init>()
            int r16 = r13 + 1
            r20 = r9
            r9 = r7[r13]
            r15.a = r9
            boolean r9 = A(r20)
            if (r9 == 0) goto L1b8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r5 = "Instantiate "
            r9.<init>(r5)
            r9.append(r12)
            java.lang.String r5 = " op #"
            r9.append(r5)
            r9.append(r14)
            java.lang.String r5 = " base fragment #"
            r9.append(r5)
            r5 = r7[r16]
            r9.append(r5)
            java.lang.String r5 = r9.toString()
            android.util.Log.v(r10, r5)
        L1b8:
            java.util.ArrayList r5 = r6.b
            java.lang.Object r5 = r5.get(r14)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L1c9
            ml r5 = r2.g(r5)
            r15.b = r5
            goto L1cb
        L1c9:
            r15.b = r4
        L1cb:
            jq[] r5 = defpackage.jq.values()
            int[] r9 = r6.c
            r9 = r9[r14]
            r5 = r5[r9]
            r15.g = r5
            jq[] r5 = defpackage.jq.values()
            int[] r9 = r6.d
            r9 = r9[r14]
            r5 = r5[r9]
            r15.h = r5
            int r5 = r13 + 2
            r9 = r7[r16]
            r15.c = r9
            int r16 = r13 + 3
            r5 = r7[r5]
            r15.d = r5
            int r18 = r13 + 4
            r4 = r7[r16]
            r15.e = r4
            int r13 = r13 + 5
            r11 = r7[r18]
            r15.f = r11
            r12.b = r9
            r12.c = r5
            r12.d = r4
            r12.e = r11
            r12.b(r15)
            int r14 = r14 + 1
            r9 = r20
            r4 = 0
            r11 = 1
            goto L17f
        L20e:
            r20 = r9
            int r4 = r6.e
            r12.f = r4
            java.lang.String r4 = r6.f
            r12.h = r4
            int r4 = r6.g
            r12.r = r4
            r4 = 1
            r12.g = r4
            int r4 = r6.h
            r12.i = r4
            java.lang.CharSequence r4 = r6.i
            r12.j = r4
            int r4 = r6.j
            r12.k = r4
            java.lang.CharSequence r4 = r6.k
            r12.l = r4
            java.util.ArrayList r4 = r6.l
            r12.m = r4
            java.util.ArrayList r4 = r6.m
            r12.n = r4
            boolean r4 = r6.n
            r12.o = r4
            r4 = 1
            r12.c(r4)
            boolean r5 = A(r20)
            if (r5 == 0) goto L27a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "restoreAllState: back stack #"
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r6 = " (index "
            r5.append(r6)
            int r6 = r12.r
            r5.append(r6)
            r5.append(r8)
            r5.append(r12)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r10, r5)
            as r5 = new as
            r5.<init>()
            java.io.PrintWriter r6 = new java.io.PrintWriter
            r6.<init>(r5)
            java.lang.String r5 = "  "
            r7 = 0
            r12.d(r5, r6, r7)
            r6.close()
            goto L27b
        L27a:
            r7 = 0
        L27b:
            java.util.ArrayList r5 = r0.d
            r5.add(r12)
            int r3 = r3 + 1
            r9 = r20
            r11 = r4
            r4 = 0
            goto L16f
        L288:
            r7 = 0
            goto L28e
        L28a:
            r3 = r4
            r7 = 0
            r0.d = r3
        L28e:
            java.util.concurrent.atomic.AtomicInteger r3 = r0.i
            int r4 = r1.d
            r3.set(r4)
            java.lang.String r3 = r1.e
            if (r3 == 0) goto L2a2
            ml r2 = r2.g(r3)
            r0.q = r2
            r0.n(r2)
        L2a2:
            java.util.ArrayList r2 = r1.f
            if (r2 == 0) goto L2cc
            r5 = r7
        L2a7:
            int r3 = r2.size()
            if (r5 >= r3) goto L2cc
            java.util.ArrayList r3 = r1.g
            java.lang.Object r3 = r3.get(r5)
            android.os.Bundle r3 = (android.os.Bundle) r3
            nl r4 = r0.n
            androidx.fragment.app.FragmentActivity r4 = r4.D
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r3.setClassLoader(r4)
            java.util.Map r4 = r0.j
            java.lang.Object r6 = r2.get(r5)
            r4.put(r6, r3)
            int r5 = r5 + 1
            goto L2a7
        L2cc:
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            java.util.ArrayList r1 = r1.h
            r2.<init>(r1)
            r0.w = r2
            return
    }

    public final defpackage.zl L() {
            r13 = this;
            java.util.HashSet r0 = r13.e()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            r2 = 0
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            cg r1 = (defpackage.cg) r1
            boolean r3 = r1.e
            if (r3 == 0) goto L8
            r1.e = r2
            r1.c()
            goto L8
        L1f:
            java.util.HashSet r0 = r13.e()
            java.util.Iterator r0 = r0.iterator()
        L27:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            cg r1 = (defpackage.cg) r1
            r1.e()
            goto L27
        L37:
            r0 = 1
            r13.t(r0)
            r13.y = r0
            am r1 = r13.F
            r1.h = r0
            r5 r0 = r13.c
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.lang.Object r0 = r0.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            int r3 = r0.size()
            r1.<init>(r3)
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L5b:
            boolean r3 = r0.hasNext()
            r4 = 2
            r5 = 0
            if (r3 == 0) goto L12f
            java.lang.Object r3 = r0.next()
            androidx.fragment.app.a r3 = (androidx.fragment.app.a) r3
            if (r3 == 0) goto L5b
            ml r6 = r3.c
            cm r7 = new cm
            r7.<init>(r6)
            int r8 = r6.a
            r9 = -1
            if (r8 <= r9) goto L103
            android.os.Bundle r8 = r7.m
            if (r8 != 0) goto L103
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            r6.r(r8)
            gm r9 = r6.O
            r9.c(r8)
            yl r9 = r6.t
            zl r9 = r9.L()
            if (r9 == 0) goto L95
            java.lang.String r10 = "android:support:fragments"
            r8.putParcelable(r10, r9)
        L95:
            d4 r9 = r3.a
            r9.m(r2)
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto La1
            goto La2
        La1:
            r5 = r8
        La2:
            android.view.View r8 = r6.E
            if (r8 == 0) goto La9
            r3.o()
        La9:
            android.util.SparseArray r3 = r6.c
            if (r3 == 0) goto Lbb
            if (r5 != 0) goto Lb4
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        Lb4:
            java.lang.String r3 = "android:view_state"
            android.util.SparseArray r8 = r6.c
            r5.putSparseParcelableArray(r3, r8)
        Lbb:
            android.os.Bundle r3 = r6.d
            if (r3 == 0) goto Lcd
            if (r5 != 0) goto Lc6
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        Lc6:
            java.lang.String r3 = "android:view_registry_state"
            android.os.Bundle r8 = r6.d
            r5.putBundle(r3, r8)
        Lcd:
            boolean r3 = r6.G
            if (r3 != 0) goto Ldf
            if (r5 != 0) goto Ld8
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
        Ld8:
            java.lang.String r3 = "android:user_visible_hint"
            boolean r8 = r6.G
            r5.putBoolean(r3, r8)
        Ldf:
            r7.m = r5
            java.lang.String r3 = r6.h
            if (r3 == 0) goto L107
            if (r5 != 0) goto Lee
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r7.m = r3
        Lee:
            android.os.Bundle r3 = r7.m
            java.lang.String r5 = "android:target_state"
            java.lang.String r8 = r6.h
            r3.putString(r5, r8)
            int r3 = r6.i
            if (r3 == 0) goto L107
            android.os.Bundle r5 = r7.m
            java.lang.String r8 = "android:target_req_state"
            r5.putInt(r8, r3)
            goto L107
        L103:
            android.os.Bundle r3 = r6.b
            r7.m = r3
        L107:
            r1.add(r7)
            boolean r3 = A(r4)
            if (r3 == 0) goto L5b
            java.lang.String r3 = "FragmentManager"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Saved state of "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r5 = ": "
            r4.append(r5)
            android.os.Bundle r5 = r7.m
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.v(r3, r4)
            goto L5b
        L12f:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L143
            boolean r0 = A(r4)
            if (r0 == 0) goto L142
            java.lang.String r0 = "FragmentManager"
            java.lang.String r1 = "saveAllState: no fragments!"
            android.util.Log.v(r0, r1)
        L142:
            return r5
        L143:
            r5 r0 = r13.c
            java.lang.Object r3 = r0.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            monitor-enter(r3)
            java.lang.Object r6 = r0.c     // Catch: java.lang.Throwable -> L157
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L157
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L157
            if (r6 == 0) goto L15a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L157
            r6 = r5
            goto L1a7
        L157:
            r0 = move-exception
            goto L236
        L15a:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L157
            java.lang.Object r7 = r0.c     // Catch: java.lang.Throwable -> L157
            java.util.ArrayList r7 = (java.util.ArrayList) r7     // Catch: java.lang.Throwable -> L157
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L157
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L157
            java.lang.Object r0 = r0.c     // Catch: java.lang.Throwable -> L157
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L157
            int r7 = r0.size()     // Catch: java.lang.Throwable -> L157
            r8 = r2
        L170:
            if (r8 >= r7) goto L1a6
            java.lang.Object r9 = r0.get(r8)     // Catch: java.lang.Throwable -> L157
            int r8 = r8 + 1
            ml r9 = (defpackage.ml) r9     // Catch: java.lang.Throwable -> L157
            java.lang.String r10 = r9.e     // Catch: java.lang.Throwable -> L157
            r6.add(r10)     // Catch: java.lang.Throwable -> L157
            boolean r10 = A(r4)     // Catch: java.lang.Throwable -> L157
            if (r10 == 0) goto L170
            java.lang.String r10 = "FragmentManager"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L157
            r11.<init>()     // Catch: java.lang.Throwable -> L157
            java.lang.String r12 = "saveAllState: adding fragment ("
            r11.append(r12)     // Catch: java.lang.Throwable -> L157
            java.lang.String r12 = r9.e     // Catch: java.lang.Throwable -> L157
            r11.append(r12)     // Catch: java.lang.Throwable -> L157
            java.lang.String r12 = "): "
            r11.append(r12)     // Catch: java.lang.Throwable -> L157
            r11.append(r9)     // Catch: java.lang.Throwable -> L157
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> L157
            android.util.Log.v(r10, r9)     // Catch: java.lang.Throwable -> L157
            goto L170
        L1a6:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L157
        L1a7:
            java.util.ArrayList r0 = r13.d
            if (r0 == 0) goto L1ee
            int r0 = r0.size()
            if (r0 <= 0) goto L1ee
            c7[] r3 = new defpackage.c7[r0]
        L1b3:
            if (r2 >= r0) goto L1ef
            c7 r7 = new c7
            java.util.ArrayList r8 = r13.d
            java.lang.Object r8 = r8.get(r2)
            b7 r8 = (defpackage.b7) r8
            r7.<init>(r8)
            r3[r2] = r7
            boolean r7 = A(r4)
            if (r7 == 0) goto L1eb
            java.lang.String r7 = "FragmentManager"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "saveAllState: adding back stack #"
            r8.<init>(r9)
            r8.append(r2)
            java.lang.String r9 = ": "
            r8.append(r9)
            java.util.ArrayList r9 = r13.d
            java.lang.Object r9 = r9.get(r2)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r7, r8)
        L1eb:
            int r2 = r2 + 1
            goto L1b3
        L1ee:
            r3 = r5
        L1ef:
            zl r0 = new zl
            r0.<init>()
            r0.e = r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.f = r2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.g = r4
            r0.a = r1
            r0.b = r6
            r0.c = r3
            java.util.concurrent.atomic.AtomicInteger r1 = r13.i
            int r1 = r1.get()
            r0.d = r1
            ml r1 = r13.q
            if (r1 == 0) goto L21a
            java.lang.String r1 = r1.e
            r0.e = r1
        L21a:
            java.util.Map r1 = r13.j
            java.util.Set r1 = r1.keySet()
            r2.addAll(r1)
            java.util.Map r1 = r13.j
            java.util.Collection r1 = r1.values()
            r4.addAll(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayDeque r2 = r13.w
            r1.<init>(r2)
            r0.h = r1
            return r0
        L236:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L157
            throw r0
    }

    public final void M() {
            r3 = this;
            java.util.ArrayList r0 = r3.a
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.a     // Catch: java.lang.Throwable -> L22
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L22
            r2 = 1
            if (r1 != r2) goto L24
            nl r1 = r3.n     // Catch: java.lang.Throwable -> L22
            android.os.Handler r1 = r1.E     // Catch: java.lang.Throwable -> L22
            y6 r2 = r3.G     // Catch: java.lang.Throwable -> L22
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L22
            nl r1 = r3.n     // Catch: java.lang.Throwable -> L22
            android.os.Handler r1 = r1.E     // Catch: java.lang.Throwable -> L22
            y6 r2 = r3.G     // Catch: java.lang.Throwable -> L22
            r1.post(r2)     // Catch: java.lang.Throwable -> L22
            r3.T()     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r1 = move-exception
            goto L26
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            return
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            throw r1
    }

    public final void N(defpackage.ml r2, boolean r3) {
            r1 = this;
            android.view.ViewGroup r2 = r1.w(r2)
            if (r2 == 0) goto L11
            boolean r0 = r2 instanceof androidx.fragment.app.FragmentContainerView
            if (r0 == 0) goto L11
            androidx.fragment.app.FragmentContainerView r2 = (androidx.fragment.app.FragmentContainerView) r2
            r3 = r3 ^ 1
            r2.setDrawDisappearingViewsLast(r3)
        L11:
            return
    }

    public final void O(defpackage.ml r3, defpackage.jq r4) {
            r2 = this;
            java.lang.String r0 = r3.e
            r5 r1 = r2.c
            ml r0 = r1.g(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L19
            nl r0 = r3.s
            if (r0 == 0) goto L16
            yl r0 = r3.r
            if (r0 != r2) goto L19
        L16:
            r3.K = r4
            return
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = " is not an active fragment of FragmentManager "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public final void P(defpackage.ml r4) {
            r3 = this;
            if (r4 == 0) goto L35
            java.lang.String r0 = r4.e
            r5 r1 = r3.c
            ml r0 = r1.g(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L19
            nl r0 = r4.s
            if (r0 == 0) goto L35
            yl r0 = r4.r
            if (r0 != r3) goto L19
            goto L35
        L19:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = " is not an active fragment of FragmentManager "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L35:
            ml r0 = r3.q
            r3.q = r4
            r3.n(r0)
            ml r4 = r3.q
            r3.n(r4)
            return
    }

    public final void Q(defpackage.ml r6) {
            r5 = this;
            android.view.ViewGroup r0 = r5.w(r6)
            if (r0 == 0) goto L4a
            ll r1 = r6.H
            r2 = 0
            if (r1 != 0) goto Ld
            r3 = r2
            goto Lf
        Ld:
            int r3 = r1.b
        Lf:
            if (r1 != 0) goto L13
            r4 = r2
            goto L15
        L13:
            int r4 = r1.c
        L15:
            int r4 = r4 + r3
            if (r1 != 0) goto L1a
            r3 = r2
            goto L1c
        L1a:
            int r3 = r1.d
        L1c:
            int r3 = r3 + r4
            if (r1 != 0) goto L21
            r1 = r2
            goto L23
        L21:
            int r1 = r1.e
        L23:
            int r1 = r1 + r3
            if (r1 <= 0) goto L4a
            r1 = 2131296700(0x7f0901bc, float:1.8211324E38)
            java.lang.Object r3 = r0.getTag(r1)
            if (r3 != 0) goto L32
            r0.setTag(r1, r6)
        L32:
            java.lang.Object r0 = r0.getTag(r1)
            ml r0 = (defpackage.ml) r0
            ll r6 = r6.H
            if (r6 != 0) goto L3d
            goto L3f
        L3d:
            boolean r2 = r6.a
        L3f:
            ll r6 = r0.H
            if (r6 != 0) goto L44
            goto L4a
        L44:
            ll r6 = r0.f()
            r6.a = r2
        L4a:
            return
    }

    public final void S() {
            r7 = this;
            r5 r0 = r7.c
            java.util.ArrayList r0 = r0.i()
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L2a
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            ml r5 = r4.c
            boolean r6 = r5.F
            if (r6 == 0) goto Lc
            boolean r6 = r7.b
            if (r6 == 0) goto L24
            r4 = 1
            r7.B = r4
            goto Lc
        L24:
            r5.F = r2
            r4.k()
            goto Lc
        L2a:
            return
    }

    public final void T() {
            r4 = this;
            java.util.ArrayList r0 = r4.a
            monitor-enter(r0)
            java.util.ArrayList r1 = r4.a     // Catch: java.lang.Throwable -> L19
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L19
            r2 = 1
            if (r1 != 0) goto L1b
            sl r1 = r4.h     // Catch: java.lang.Throwable -> L19
            r1.a = r2     // Catch: java.lang.Throwable -> L19
            xw r1 = r1.c     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L17
            r1.a()     // Catch: java.lang.Throwable -> L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            return
        L19:
            r1 = move-exception
            goto L3f
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            sl r0 = r4.h
            java.util.ArrayList r1 = r4.d
            r3 = 0
            if (r1 == 0) goto L28
            int r1 = r1.size()
            goto L29
        L28:
            r1 = r3
        L29:
            if (r1 <= 0) goto L34
            ml r1 = r4.p
            boolean r1 = D(r1)
            if (r1 == 0) goto L34
            goto L35
        L34:
            r2 = r3
        L35:
            r0.a = r2
            xw r0 = r0.c
            if (r0 == 0) goto L3e
            r0.a()
        L3e:
            return
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r1
    }

    public final androidx.fragment.app.a a(defpackage.ml r4) {
            r3 = this;
            r0 = 2
            boolean r0 = A(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            androidx.fragment.app.a r0 = r3.f(r4)
            r4.r = r3
            r5 r1 = r3.c
            r1.v(r0)
            boolean r2 = r4.z
            if (r2 != 0) goto L3e
            r1.a(r4)
            r1 = 0
            r4.l = r1
            android.view.View r2 = r4.E
            if (r2 != 0) goto L35
            r4.I = r1
        L35:
            boolean r4 = B(r4)
            if (r4 == 0) goto L3e
            r4 = 1
            r3.x = r4
        L3e:
            return r0
    }

    public final void b(defpackage.nl r6, defpackage.ip r7, defpackage.ml r8) {
            r5 = this;
            nl r0 = r5.n
            if (r0 != 0) goto L153
            r5.n = r6
            r5.o = r7
            r5.p = r8
            java.util.concurrent.CopyOnWriteArrayList r7 = r5.l
            if (r8 == 0) goto L17
            ul r0 = new ul
            r0.<init>(r8)
            r7.add(r0)
            goto L1c
        L17:
            if (r6 == 0) goto L1c
            r7.add(r6)
        L1c:
            ml r7 = r5.p
            if (r7 == 0) goto L23
            r5.T()
        L23:
            if (r6 == 0) goto L37
            androidx.fragment.app.FragmentActivity r7 = r6.G
            androidx.activity.a r7 = r7.i()
            r5.g = r7
            if (r8 == 0) goto L31
            r0 = r8
            goto L32
        L31:
            r0 = r6
        L32:
            sl r1 = r5.h
            r7.a(r0, r1)
        L37:
            r7 = 0
            r0 = 1
            if (r8 == 0) goto L5b
            yl r6 = r8.r
            am r6 = r6.F
            java.util.HashMap r1 = r6.d
            java.lang.String r2 = r8.e
            java.lang.Object r2 = r1.get(r2)
            am r2 = (defpackage.am) r2
            if (r2 != 0) goto L57
            am r2 = new am
            boolean r6 = r6.f
            r2.<init>(r6)
            java.lang.String r6 = r8.e
            r1.put(r6, r2)
        L57:
            r5.F = r2
            goto Ld1
        L5b:
            if (r6 == 0) goto Lca
            androidx.fragment.app.FragmentActivity r6 = r6.G
            ra0 r6 = r6.d()
            java.lang.String r1 = "store"
            defpackage.ip.o(r1, r6)
            se r1 = defpackage.se.b
            java.lang.String r2 = "defaultCreationExtras"
            defpackage.ip.o(r2, r1)
            java.lang.Class<am> r2 = defpackage.am.class
            java.lang.String r3 = r2.getCanonicalName()
            if (r3 == 0) goto Lc2
            java.lang.String r4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r3 = r4.concat(r3)
            java.lang.String r4 = "key"
            defpackage.ip.o(r4, r3)
            java.util.LinkedHashMap r6 = r6.a
            java.lang.Object r4 = r6.get(r3)
            pa0 r4 = (defpackage.pa0) r4
            boolean r2 = r2.isInstance(r4)
            if (r2 == 0) goto L96
            java.lang.String r6 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            defpackage.ip.m(r6, r4)
            goto Lbd
        L96:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.LinkedHashMap r1 = r1.a
            r2.putAll(r1)
            vh r1 = defpackage.vh.p
            r2.put(r1, r3)
            am r1 = new am     // Catch: java.lang.AbstractMethodError -> Lac
            r1.<init>(r0)     // Catch: java.lang.AbstractMethodError -> Lac
        Laa:
            r4 = r1
            goto Lb2
        Lac:
            am r1 = new am
            r1.<init>(r0)
            goto Laa
        Lb2:
            java.lang.Object r6 = r6.put(r3, r4)
            pa0 r6 = (defpackage.pa0) r6
            if (r6 == 0) goto Lbd
            r6.a()
        Lbd:
            am r4 = (defpackage.am) r4
            r5.F = r4
            goto Ld1
        Lc2:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "Local and anonymous classes can not be ViewModels"
            r6.<init>(r7)
            throw r6
        Lca:
            am r6 = new am
            r6.<init>(r7)
            r5.F = r6
        Ld1:
            am r6 = r5.F
            boolean r1 = r5.y
            if (r1 != 0) goto Ldb
            boolean r1 = r5.z
            if (r1 == 0) goto Ldc
        Ldb:
            r7 = r0
        Ldc:
            r6.h = r7
            r5 r7 = r5.c
            r7.d = r6
            nl r6 = r5.n
            if (r6 == 0) goto L152
            androidx.fragment.app.FragmentActivity r6 = r6.G
            sb r6 = r6.j
            if (r8 == 0) goto Lfa
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r8.e
            java.lang.String r0 = ":"
            java.lang.String r7 = defpackage.z30.l(r7, r8, r0)
            goto Lfc
        Lfa:
            java.lang.String r7 = ""
        Lfc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "FragmentManager:"
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "StartActivityForResult"
            java.lang.String r8 = defpackage.z30.i(r7, r8)
            v1 r0 = new v1
            r1 = 1
            r0.<init>(r1)
            rl r1 = new rl
            r2 = 2
            r1.<init>(r5, r2)
            d4 r8 = r6.b(r8, r0, r1)
            r5.t = r8
            java.lang.String r8 = "StartIntentSenderForResult"
            java.lang.String r8 = defpackage.z30.i(r7, r8)
            v1 r0 = new v1
            r1 = 2
            r0.<init>(r1)
            rl r1 = new rl
            r2 = 0
            r1.<init>(r5, r2)
            d4 r8 = r6.b(r8, r0, r1)
            r5.u = r8
            java.lang.String r8 = "RequestPermissions"
            java.lang.String r7 = defpackage.z30.i(r7, r8)
            v1 r8 = new v1
            r0 = 0
            r8.<init>(r0)
            rl r0 = new rl
            r1 = 1
            r0.<init>(r5, r1)
            d4 r6 = r6.b(r7, r8, r0)
            r5.v = r6
        L152:
            return
        L153:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Already attached"
            r6.<init>(r7)
            throw r6
    }

    public final void c(defpackage.ml r5) {
            r4 = this;
            r0 = 2
            boolean r1 = A(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "attach: "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r2, r1)
        L1a:
            boolean r1 = r5.z
            if (r1 == 0) goto L4a
            r1 = 0
            r5.z = r1
            boolean r1 = r5.k
            if (r1 != 0) goto L4a
            r5 r1 = r4.c
            r1.a(r5)
            boolean r0 = A(r0)
            if (r0 == 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "add from attach: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r2, r0)
        L41:
            boolean r5 = B(r5)
            if (r5 == 0) goto L4a
            r5 = 1
            r4.x = r5
        L4a:
            return
    }

    public final void d() {
            r1 = this;
            r0 = 0
            r1.b = r0
            java.util.ArrayList r0 = r1.D
            r0.clear()
            java.util.ArrayList r0 = r1.C
            r0.clear()
            return
    }

    public final java.util.HashSet e() {
            r6 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5 r1 = r6.c
            java.util.ArrayList r1 = r1.i()
            int r2 = r1.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            androidx.fragment.app.a r4 = (androidx.fragment.app.a) r4
            ml r4 = r4.c
            android.view.ViewGroup r4 = r4.D
            if (r4 == 0) goto L10
            vh r5 = r6.y()
            cg r4 = defpackage.cg.f(r4, r5)
            r0.add(r4)
            goto L10
        L2c:
            return r0
    }

    public final androidx.fragment.app.a f(defpackage.ml r4) {
            r3 = this;
            java.lang.String r0 = r4.e
            r5 r1 = r3.c
            java.lang.Object r2 = r1.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r0 = r2.get(r0)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            if (r0 == 0) goto L11
            return r0
        L11:
            androidx.fragment.app.a r0 = new androidx.fragment.app.a
            d4 r2 = r3.k
            r0.<init>(r2, r1, r4)
            nl r4 = r3.n
            androidx.fragment.app.FragmentActivity r4 = r4.D
            java.lang.ClassLoader r4 = r4.getClassLoader()
            r0.m(r4)
            int r4 = r3.m
            r0.e = r4
            return r0
    }

    public final void g(defpackage.ml r5) {
            r4 = this;
            java.lang.String r0 = "FragmentManager"
            r1 = 2
            boolean r2 = A(r1)
            if (r2 == 0) goto L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "detach: "
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r0, r2)
        L1a:
            boolean r2 = r5.z
            if (r2 != 0) goto L5d
            r2 = 1
            r5.z = r2
            boolean r3 = r5.k
            if (r3 == 0) goto L5d
            boolean r1 = A(r1)
            if (r1 == 0) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "remove from detach: "
            r1.<init>(r3)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.v(r0, r1)
        L3c:
            r5 r0 = r4.c
            java.lang.Object r1 = r0.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            monitor-enter(r1)
            java.lang.Object r0 = r0.c     // Catch: java.lang.Throwable -> L5a
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L5a
            r0.remove(r5)     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            r0 = 0
            r5.k = r0
            boolean r0 = B(r5)
            if (r0 == 0) goto L56
            r4.x = r2
        L56:
            r4.Q(r5)
            return
        L5a:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            throw r5
        L5d:
            return
    }

    public final void h() {
            r3 = this;
            r5 r0 = r3.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            ml r1 = (defpackage.ml) r1
            if (r1 == 0) goto La
            r2 = 1
            r1.C = r2
            yl r1 = r1.t
            r1.h()
            goto La
        L21:
            return
    }

    public final boolean i() {
            r5 = this;
            int r0 = r5.m
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            goto L2e
        L7:
            r5 r0 = r5.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            ml r3 = (defpackage.ml) r3
            if (r3 == 0) goto L11
            boolean r4 = r3.y
            if (r4 != 0) goto L2a
            yl r3 = r3.t
            boolean r3 = r3.i()
            goto L2b
        L2a:
            r3 = r1
        L2b:
            if (r3 == 0) goto L11
            return r2
        L2e:
            return r1
    }

    public final boolean j() {
            r7 = this;
            int r0 = r7.m
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            r5 r0 = r7.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = r1
        L13:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L41
            java.lang.Object r5 = r0.next()
            ml r5 = (defpackage.ml) r5
            if (r5 == 0) goto L13
            boolean r6 = C(r5)
            if (r6 == 0) goto L13
            boolean r6 = r5.y
            if (r6 != 0) goto L32
            yl r6 = r5.t
            boolean r6 = r6.j()
            goto L33
        L32:
            r6 = r1
        L33:
            if (r6 == 0) goto L13
            if (r3 != 0) goto L3c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L3c:
            r3.add(r5)
            r4 = r2
            goto L13
        L41:
            java.util.ArrayList r0 = r7.e
            if (r0 == 0) goto L63
        L45:
            java.util.ArrayList r0 = r7.e
            int r0 = r0.size()
            if (r1 >= r0) goto L63
            java.util.ArrayList r0 = r7.e
            java.lang.Object r0 = r0.get(r1)
            ml r0 = (defpackage.ml) r0
            if (r3 == 0) goto L5d
            boolean r2 = r3.contains(r0)
            if (r2 != 0) goto L60
        L5d:
            r0.getClass()
        L60:
            int r1 = r1 + 1
            goto L45
        L63:
            r7.e = r3
            return r4
    }

    public final void k() {
            r9 = this;
            r0 = 1
            r9.A = r0
            r9.t(r0)
            java.util.HashSet r0 = r9.e()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            cg r1 = (defpackage.cg) r1
            r1.e()
            goto Le
        L1e:
            r0 = -1
            r9.p(r0)
            r0 = 0
            r9.n = r0
            r9.o = r0
            r9.p = r0
            androidx.activity.a r1 = r9.g
            if (r1 == 0) goto L47
            sl r1 = r9.h
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.b
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L45
            java.lang.Object r2 = r1.next()
            h8 r2 = (defpackage.h8) r2
            r2.cancel()
            goto L35
        L45:
            r9.g = r0
        L47:
            d4 r0 = r9.t
            if (r0 == 0) goto L1c4
            java.lang.Object r1 = r0.c
            sb r1 = (defpackage.sb) r1
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            android.os.Bundle r2 = r1.g
            java.util.HashMap r3 = r1.f
            java.util.ArrayList r4 = r1.d
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L6e
            java.util.HashMap r4 = r1.b
            java.lang.Object r4 = r4.remove(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L6e
            java.util.HashMap r5 = r1.a
            r5.remove(r4)
        L6e:
            java.util.HashMap r4 = r1.e
            r4.remove(r0)
            boolean r4 = r3.containsKey(r0)
            java.lang.String r5 = "ActivityResultRegistry"
            java.lang.String r6 = "Dropping pending result for request "
            java.lang.String r7 = ": "
            if (r4 == 0) goto L9b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r0)
            r4.append(r7)
            java.lang.Object r8 = r3.get(r0)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r5, r4)
            r3.remove(r0)
        L9b:
            boolean r3 = r2.containsKey(r0)
            if (r3 == 0) goto Lbd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            r3.append(r0)
            r3.append(r7)
            android.os.Parcelable r4 = r2.getParcelable(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r5, r3)
            r2.remove(r0)
        Lbd:
            java.util.HashMap r1 = r1.c
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L1be
            d4 r0 = r9.u
            java.lang.Object r1 = r0.c
            sb r1 = (defpackage.sb) r1
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            android.os.Bundle r2 = r1.g
            java.util.HashMap r3 = r1.f
            java.util.ArrayList r4 = r1.d
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto Lea
            java.util.HashMap r4 = r1.b
            java.lang.Object r4 = r4.remove(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto Lea
            java.util.HashMap r8 = r1.a
            r8.remove(r4)
        Lea:
            java.util.HashMap r4 = r1.e
            r4.remove(r0)
            boolean r4 = r3.containsKey(r0)
            if (r4 == 0) goto L111
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r0)
            r4.append(r7)
            java.lang.Object r8 = r3.get(r0)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r5, r4)
            r3.remove(r0)
        L111:
            boolean r3 = r2.containsKey(r0)
            if (r3 == 0) goto L133
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            r3.append(r0)
            r3.append(r7)
            android.os.Parcelable r4 = r2.getParcelable(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r5, r3)
            r2.remove(r0)
        L133:
            java.util.HashMap r1 = r1.c
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L1b8
            d4 r0 = r9.v
            java.lang.Object r1 = r0.c
            sb r1 = (defpackage.sb) r1
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            android.os.Bundle r2 = r1.g
            java.util.HashMap r3 = r1.f
            java.util.ArrayList r4 = r1.d
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L160
            java.util.HashMap r4 = r1.b
            java.lang.Object r4 = r4.remove(r0)
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L160
            java.util.HashMap r8 = r1.a
            r8.remove(r4)
        L160:
            java.util.HashMap r4 = r1.e
            r4.remove(r0)
            boolean r4 = r3.containsKey(r0)
            if (r4 == 0) goto L187
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r0)
            r4.append(r7)
            java.lang.Object r8 = r3.get(r0)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r5, r4)
            r3.remove(r0)
        L187:
            boolean r3 = r2.containsKey(r0)
            if (r3 == 0) goto L1a9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r6)
            r3.append(r0)
            r3.append(r7)
            android.os.Parcelable r4 = r2.getParcelable(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            android.util.Log.w(r5, r3)
            r2.remove(r0)
        L1a9:
            java.util.HashMap r1 = r1.c
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L1b2
            goto L1c4
        L1b2:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L1b8:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L1be:
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        L1c4:
            return
    }

    public final boolean l() {
            r5 = this;
            int r0 = r5.m
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            goto L2e
        L7:
            r5 r0 = r5.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            ml r3 = (defpackage.ml) r3
            if (r3 == 0) goto L11
            boolean r4 = r3.y
            if (r4 != 0) goto L2a
            yl r3 = r3.t
            boolean r3 = r3.l()
            goto L2b
        L2a:
            r3 = r1
        L2b:
            if (r3 == 0) goto L11
            return r2
        L2e:
            return r1
    }

    public final void m() {
            r3 = this;
            int r0 = r3.m
            r1 = 1
            if (r0 >= r1) goto L6
            goto L28
        L6:
            r5 r0 = r3.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            ml r1 = (defpackage.ml) r1
            if (r1 == 0) goto L10
            boolean r2 = r1.y
            if (r2 != 0) goto L10
            yl r1 = r1.t
            r1.m()
            goto L10
        L28:
            return
    }

    public final void n(defpackage.ml r3) {
            r2 = this;
            if (r3 == 0) goto L33
            java.lang.String r0 = r3.e
            r5 r1 = r2.c
            ml r0 = r1.g(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L33
            yl r0 = r3.r
            r0.getClass()
            boolean r0 = D(r3)
            java.lang.Boolean r1 = r3.j
            if (r1 == 0) goto L23
            boolean r1 = r1.booleanValue()
            if (r1 == r0) goto L33
        L23:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3.j = r0
            yl r3 = r3.t
            r3.T()
            ml r0 = r3.q
            r3.n(r0)
        L33:
            return
    }

    public final boolean o() {
            r5 = this;
            int r0 = r5.m
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            r5 r0 = r5.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        L11:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r0.next()
            ml r3 = (defpackage.ml) r3
            if (r3 == 0) goto L11
            boolean r4 = C(r3)
            if (r4 == 0) goto L11
            boolean r4 = r3.y
            if (r4 != 0) goto L30
            yl r3 = r3.t
            boolean r3 = r3.o()
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L11
            r1 = r2
            goto L11
        L35:
            return r1
    }

    public final void p(int r5) {
            r4 = this;
            r0 = 1
            r1 = 0
            r4.b = r0     // Catch: java.lang.Throwable -> L3e
            r5 r2 = r4.c     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = r2.b     // Catch: java.lang.Throwable -> L3e
            java.util.HashMap r2 = (java.util.HashMap) r2     // Catch: java.lang.Throwable -> L3e
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3e
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L23
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3e
            androidx.fragment.app.a r3 = (androidx.fragment.app.a) r3     // Catch: java.lang.Throwable -> L3e
            if (r3 == 0) goto L12
            r3.e = r5     // Catch: java.lang.Throwable -> L3e
            goto L12
        L23:
            r4.E(r5, r1)     // Catch: java.lang.Throwable -> L3e
            java.util.HashSet r5 = r4.e()     // Catch: java.lang.Throwable -> L3e
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L3e
        L2e:
            boolean r2 = r5.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L40
            java.lang.Object r2 = r5.next()     // Catch: java.lang.Throwable -> L3e
            cg r2 = (defpackage.cg) r2     // Catch: java.lang.Throwable -> L3e
            r2.e()     // Catch: java.lang.Throwable -> L3e
            goto L2e
        L3e:
            r5 = move-exception
            goto L46
        L40:
            r4.b = r1
            r4.t(r0)
            return
        L46:
            r4.b = r1
            throw r5
    }

    public final void q(java.lang.String r14, java.io.FileDescriptor r15, java.io.PrintWriter r16, java.lang.String[] r17) {
            r13 = this;
            r0 = r16
            java.lang.String r1 = "    "
            java.lang.String r1 = defpackage.z30.i(r14, r1)
            r5 r2 = r13.c
            java.lang.Object r3 = r2.c
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.String r4 = "    "
            java.lang.String r4 = defpackage.z30.i(r14, r4)
            java.lang.Object r2 = r2.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L31f
            r0.print(r14)
            java.lang.String r5 = "Active Fragments:"
            r0.println(r5)
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L2e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L31f
            java.lang.Object r5 = r2.next()
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            r0.print(r14)
            if (r5 == 0) goto L316
            ml r5 = r5.c
            r0.println(r5)
            r5.getClass()
            r0.print(r4)
            java.lang.String r6 = "mFragmentId=#"
            r0.print(r6)
            int r6 = r5.v
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r0.print(r6)
            java.lang.String r6 = " mContainerId=#"
            r0.print(r6)
            int r6 = r5.w
            java.lang.String r6 = java.lang.Integer.toHexString(r6)
            r0.print(r6)
            java.lang.String r6 = " mTag="
            r0.print(r6)
            java.lang.String r6 = r5.x
            r0.println(r6)
            r0.print(r4)
            java.lang.String r6 = "mState="
            r0.print(r6)
            int r6 = r5.a
            r0.print(r6)
            java.lang.String r6 = " mWho="
            r0.print(r6)
            java.lang.String r6 = r5.e
            r0.print(r6)
            java.lang.String r6 = " mBackStackNesting="
            r0.print(r6)
            int r6 = r5.q
            r0.println(r6)
            r0.print(r4)
            java.lang.String r6 = "mAdded="
            r0.print(r6)
            boolean r6 = r5.k
            r0.print(r6)
            java.lang.String r6 = " mRemoving="
            r0.print(r6)
            boolean r6 = r5.l
            r0.print(r6)
            java.lang.String r6 = " mFromLayout="
            r0.print(r6)
            boolean r6 = r5.m
            r0.print(r6)
            java.lang.String r6 = " mInLayout="
            r0.print(r6)
            boolean r6 = r5.n
            r0.println(r6)
            r0.print(r4)
            java.lang.String r6 = "mHidden="
            r0.print(r6)
            boolean r6 = r5.y
            r0.print(r6)
            java.lang.String r6 = " mDetached="
            r0.print(r6)
            boolean r6 = r5.z
            r0.print(r6)
            java.lang.String r6 = " mMenuVisible="
            r0.print(r6)
            boolean r6 = r5.B
            r0.print(r6)
            java.lang.String r6 = " mHasMenu="
            r0.print(r6)
            r6 = 0
            r0.println(r6)
            r0.print(r4)
            java.lang.String r7 = "mRetainInstance="
            r0.print(r7)
            boolean r7 = r5.A
            r0.print(r7)
            java.lang.String r7 = " mUserVisibleHint="
            r0.print(r7)
            boolean r7 = r5.G
            r0.println(r7)
            yl r7 = r5.r
            if (r7 == 0) goto L10e
            r0.print(r4)
            java.lang.String r7 = "mFragmentManager="
            r0.print(r7)
            yl r7 = r5.r
            r0.println(r7)
        L10e:
            nl r7 = r5.s
            if (r7 == 0) goto L11f
            r0.print(r4)
            java.lang.String r7 = "mHost="
            r0.print(r7)
            nl r7 = r5.s
            r0.println(r7)
        L11f:
            ml r7 = r5.u
            if (r7 == 0) goto L130
            r0.print(r4)
            java.lang.String r7 = "mParentFragment="
            r0.print(r7)
            ml r7 = r5.u
            r0.println(r7)
        L130:
            android.os.Bundle r7 = r5.f
            if (r7 == 0) goto L141
            r0.print(r4)
            java.lang.String r7 = "mArguments="
            r0.print(r7)
            android.os.Bundle r7 = r5.f
            r0.println(r7)
        L141:
            android.os.Bundle r7 = r5.b
            if (r7 == 0) goto L152
            r0.print(r4)
            java.lang.String r7 = "mSavedFragmentState="
            r0.print(r7)
            android.os.Bundle r7 = r5.b
            r0.println(r7)
        L152:
            android.util.SparseArray r7 = r5.c
            if (r7 == 0) goto L163
            r0.print(r4)
            java.lang.String r7 = "mSavedViewState="
            r0.print(r7)
            android.util.SparseArray r7 = r5.c
            r0.println(r7)
        L163:
            android.os.Bundle r7 = r5.d
            if (r7 == 0) goto L174
            r0.print(r4)
            java.lang.String r7 = "mSavedViewRegistryState="
            r0.print(r7)
            android.os.Bundle r7 = r5.d
            r0.println(r7)
        L174:
            ml r7 = r5.g
            r8 = 0
            if (r7 == 0) goto L17a
            goto L18a
        L17a:
            yl r7 = r5.r
            if (r7 == 0) goto L189
            java.lang.String r9 = r5.h
            if (r9 == 0) goto L189
            r5 r7 = r7.c
            ml r7 = r7.g(r9)
            goto L18a
        L189:
            r7 = r8
        L18a:
            if (r7 == 0) goto L1a1
            r0.print(r4)
            java.lang.String r9 = "mTarget="
            r0.print(r9)
            r0.print(r7)
            java.lang.String r7 = " mTargetRequestCode="
            r0.print(r7)
            int r7 = r5.i
            r0.println(r7)
        L1a1:
            r0.print(r4)
            java.lang.String r7 = "mPopDirection="
            r0.print(r7)
            ll r7 = r5.H
            if (r7 != 0) goto L1af
            r7 = r6
            goto L1b1
        L1af:
            boolean r7 = r7.a
        L1b1:
            r0.println(r7)
            ll r7 = r5.H
            if (r7 != 0) goto L1ba
            r7 = r6
            goto L1bc
        L1ba:
            int r7 = r7.b
        L1bc:
            if (r7 == 0) goto L1d1
            r0.print(r4)
            java.lang.String r7 = "getEnterAnim="
            r0.print(r7)
            ll r7 = r5.H
            if (r7 != 0) goto L1cc
            r7 = r6
            goto L1ce
        L1cc:
            int r7 = r7.b
        L1ce:
            r0.println(r7)
        L1d1:
            ll r7 = r5.H
            if (r7 != 0) goto L1d7
            r7 = r6
            goto L1d9
        L1d7:
            int r7 = r7.c
        L1d9:
            if (r7 == 0) goto L1ee
            r0.print(r4)
            java.lang.String r7 = "getExitAnim="
            r0.print(r7)
            ll r7 = r5.H
            if (r7 != 0) goto L1e9
            r7 = r6
            goto L1eb
        L1e9:
            int r7 = r7.c
        L1eb:
            r0.println(r7)
        L1ee:
            ll r7 = r5.H
            if (r7 != 0) goto L1f4
            r7 = r6
            goto L1f6
        L1f4:
            int r7 = r7.d
        L1f6:
            if (r7 == 0) goto L20b
            r0.print(r4)
            java.lang.String r7 = "getPopEnterAnim="
            r0.print(r7)
            ll r7 = r5.H
            if (r7 != 0) goto L206
            r7 = r6
            goto L208
        L206:
            int r7 = r7.d
        L208:
            r0.println(r7)
        L20b:
            ll r7 = r5.H
            if (r7 != 0) goto L211
            r7 = r6
            goto L213
        L211:
            int r7 = r7.e
        L213:
            if (r7 == 0) goto L228
            r0.print(r4)
            java.lang.String r7 = "getPopExitAnim="
            r0.print(r7)
            ll r7 = r5.H
            if (r7 != 0) goto L223
            r7 = r6
            goto L225
        L223:
            int r7 = r7.e
        L225:
            r0.println(r7)
        L228:
            android.view.ViewGroup r7 = r5.D
            if (r7 == 0) goto L239
            r0.print(r4)
            java.lang.String r7 = "mContainer="
            r0.print(r7)
            android.view.ViewGroup r7 = r5.D
            r0.println(r7)
        L239:
            android.view.View r7 = r5.E
            if (r7 == 0) goto L24a
            r0.print(r4)
            java.lang.String r7 = "mView="
            r0.print(r7)
            android.view.View r7 = r5.E
            r0.println(r7)
        L24a:
            android.content.Context r7 = r5.h()
            if (r7 == 0) goto L2ec
            ra0 r7 = r5.d()
            java.lang.String r9 = "store"
            defpackage.ip.o(r9, r7)
            se r9 = defpackage.se.b
            java.lang.String r10 = "defaultCreationExtras"
            defpackage.ip.o(r10, r9)
            java.lang.Class<pr> r10 = defpackage.pr.class
            java.lang.String r11 = r10.getCanonicalName()
            if (r11 == 0) goto L2e4
            java.lang.String r12 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r11 = r12.concat(r11)
            java.lang.String r12 = "key"
            defpackage.ip.o(r12, r11)
            java.util.LinkedHashMap r7 = r7.a
            java.lang.Object r12 = r7.get(r11)
            pa0 r12 = (defpackage.pa0) r12
            boolean r10 = r10.isInstance(r12)
            if (r10 == 0) goto L287
            java.lang.String r7 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            defpackage.ip.m(r7, r12)
            goto L2ae
        L287:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.LinkedHashMap r9 = r9.a
            r10.putAll(r9)
            vh r9 = defpackage.vh.p
            r10.put(r9, r11)
            pr r9 = new pr     // Catch: java.lang.AbstractMethodError -> L29d
            r9.<init>()     // Catch: java.lang.AbstractMethodError -> L29d
        L29b:
            r12 = r9
            goto L2a3
        L29d:
            pr r9 = new pr
            r9.<init>()
            goto L29b
        L2a3:
            java.lang.Object r7 = r7.put(r11, r12)
            pa0 r7 = (defpackage.pa0) r7
            if (r7 == 0) goto L2ae
            r7.a()
        L2ae:
            pr r12 = (defpackage.pr) r12
            e40 r7 = r12.c
            int r9 = r7.c
            if (r9 <= 0) goto L2ec
            r0.print(r4)
            java.lang.String r9 = "Loaders:"
            r0.println(r9)
            int r9 = r7.c
            if (r9 > 0) goto L2c3
            goto L2ec
        L2c3:
            java.lang.Object[] r14 = r7.b
            r14 = r14[r6]
            if (r14 != 0) goto L2de
            r0.print(r4)
            java.lang.String r14 = "  #"
            r0.print(r14)
            int[] r14 = r7.a
            r14 = r14[r6]
            r0.print(r14)
            java.lang.String r14 = ": "
            r0.print(r14)
            throw r8
        L2de:
            java.lang.ClassCastException r14 = new java.lang.ClassCastException
            r14.<init>()
            throw r14
        L2e4:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Local and anonymous classes can not be ViewModels"
            r14.<init>(r0)
            throw r14
        L2ec:
            r0.print(r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Child "
            r6.<init>(r7)
            yl r7 = r5.t
            r6.append(r7)
            java.lang.String r7 = ":"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r0.println(r6)
            yl r5 = r5.t
            java.lang.String r6 = "  "
            java.lang.String r6 = defpackage.z30.i(r4, r6)
            r8 = r17
            r5.q(r6, r15, r0, r8)
            goto L2e
        L316:
            r8 = r17
            java.lang.String r5 = "null"
            r0.println(r5)
            goto L2e
        L31f:
            int r2 = r3.size()
            r4 = 0
            if (r2 <= 0) goto L351
            r0.print(r14)
            java.lang.String r5 = "Added Fragments:"
            r0.println(r5)
            r5 = r4
        L32f:
            if (r5 >= r2) goto L351
            java.lang.Object r6 = r3.get(r5)
            ml r6 = (defpackage.ml) r6
            r0.print(r14)
            java.lang.String r7 = "  #"
            r0.print(r7)
            r0.print(r5)
            java.lang.String r7 = ": "
            r0.print(r7)
            java.lang.String r6 = r6.toString()
            r0.println(r6)
            int r5 = r5 + 1
            goto L32f
        L351:
            java.util.ArrayList r2 = r13.e
            if (r2 == 0) goto L388
            int r2 = r2.size()
            if (r2 <= 0) goto L388
            r0.print(r14)
            java.lang.String r3 = "Fragments Created Menus:"
            r0.println(r3)
            r3 = r4
        L364:
            if (r3 >= r2) goto L388
            java.util.ArrayList r5 = r13.e
            java.lang.Object r5 = r5.get(r3)
            ml r5 = (defpackage.ml) r5
            r0.print(r14)
            java.lang.String r6 = "  #"
            r0.print(r6)
            r0.print(r3)
            java.lang.String r6 = ": "
            r0.print(r6)
            java.lang.String r5 = r5.toString()
            r0.println(r5)
            int r3 = r3 + 1
            goto L364
        L388:
            java.util.ArrayList r2 = r13.d
            if (r2 == 0) goto L3c3
            int r2 = r2.size()
            if (r2 <= 0) goto L3c3
            r0.print(r14)
            java.lang.String r3 = "Back Stack:"
            r0.println(r3)
            r3 = r4
        L39b:
            if (r3 >= r2) goto L3c3
            java.util.ArrayList r5 = r13.d
            java.lang.Object r5 = r5.get(r3)
            b7 r5 = (defpackage.b7) r5
            r0.print(r14)
            java.lang.String r6 = "  #"
            r0.print(r6)
            r0.print(r3)
            java.lang.String r6 = ": "
            r0.print(r6)
            java.lang.String r6 = r5.toString()
            r0.println(r6)
            r6 = 1
            r5.d(r1, r0, r6)
            int r3 = r3 + 1
            goto L39b
        L3c3:
            r0.print(r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Back Stack Index: "
            r1.<init>(r2)
            java.util.concurrent.atomic.AtomicInteger r2 = r13.i
            int r2 = r2.get()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            java.util.ArrayList r1 = r13.a
            monitor-enter(r1)
            java.util.ArrayList r2 = r13.a     // Catch: java.lang.Throwable -> L410
            int r2 = r2.size()     // Catch: java.lang.Throwable -> L410
            if (r2 <= 0) goto L413
            r0.print(r14)     // Catch: java.lang.Throwable -> L410
            java.lang.String r3 = "Pending Actions:"
            r0.println(r3)     // Catch: java.lang.Throwable -> L410
        L3f0:
            if (r4 >= r2) goto L413
            java.util.ArrayList r3 = r13.a     // Catch: java.lang.Throwable -> L410
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L410
            wl r3 = (defpackage.wl) r3     // Catch: java.lang.Throwable -> L410
            r0.print(r14)     // Catch: java.lang.Throwable -> L410
            java.lang.String r5 = "  #"
            r0.print(r5)     // Catch: java.lang.Throwable -> L410
            r0.print(r4)     // Catch: java.lang.Throwable -> L410
            java.lang.String r5 = ": "
            r0.print(r5)     // Catch: java.lang.Throwable -> L410
            r0.println(r3)     // Catch: java.lang.Throwable -> L410
            int r4 = r4 + 1
            goto L3f0
        L410:
            r0 = move-exception
            r14 = r0
            goto L484
        L413:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L410
            r0.print(r14)
            java.lang.String r1 = "FragmentManager misc state:"
            r0.println(r1)
            r0.print(r14)
            java.lang.String r1 = "  mHost="
            r0.print(r1)
            nl r1 = r13.n
            r0.println(r1)
            r0.print(r14)
            java.lang.String r1 = "  mContainer="
            r0.print(r1)
            ip r1 = r13.o
            r0.println(r1)
            ml r1 = r13.p
            if (r1 == 0) goto L447
            r0.print(r14)
            java.lang.String r1 = "  mParent="
            r0.print(r1)
            ml r1 = r13.p
            r0.println(r1)
        L447:
            r0.print(r14)
            java.lang.String r1 = "  mCurState="
            r0.print(r1)
            int r1 = r13.m
            r0.print(r1)
            java.lang.String r1 = " mStateSaved="
            r0.print(r1)
            boolean r1 = r13.y
            r0.print(r1)
            java.lang.String r1 = " mStopped="
            r0.print(r1)
            boolean r1 = r13.z
            r0.print(r1)
            java.lang.String r1 = " mDestroyed="
            r0.print(r1)
            boolean r1 = r13.A
            r0.println(r1)
            boolean r1 = r13.x
            if (r1 == 0) goto L483
            r0.print(r14)
            java.lang.String r14 = "  mNeedMenuInvalidate="
            r0.print(r14)
            boolean r14 = r13.x
            r0.println(r14)
        L483:
            return
        L484:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L410
            throw r14
    }

    public final void r(defpackage.wl r3, boolean r4) {
            r2 = this;
            if (r4 != 0) goto L2b
            nl r0 = r2.n
            if (r0 != 0) goto L1a
            boolean r3 = r2.A
            if (r3 == 0) goto L12
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has been destroyed"
            r3.<init>(r4)
            throw r3
        L12:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "FragmentManager has not been attached to a host."
            r3.<init>(r4)
            throw r3
        L1a:
            boolean r0 = r2.y
            if (r0 != 0) goto L23
            boolean r0 = r2.z
            if (r0 != 0) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can not perform this action after onSaveInstanceState"
            r3.<init>(r4)
            throw r3
        L2b:
            java.util.ArrayList r0 = r2.a
            monitor-enter(r0)
            nl r1 = r2.n     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L40
            if (r4 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L36:
            r3 = move-exception
            goto L4a
        L38:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L36
            java.lang.String r4 = "Activity has been destroyed"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L36
            throw r3     // Catch: java.lang.Throwable -> L36
        L40:
            java.util.ArrayList r4 = r2.a     // Catch: java.lang.Throwable -> L36
            r4.add(r3)     // Catch: java.lang.Throwable -> L36
            r2.M()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
    }

    public final void s(boolean r3) {
            r2 = this;
            boolean r0 = r2.b
            if (r0 != 0) goto L5b
            nl r0 = r2.n
            if (r0 != 0) goto L1c
            boolean r3 = r2.A
            if (r3 == 0) goto L14
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has been destroyed"
            r3.<init>(r0)
            throw r3
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has not been attached to a host."
            r3.<init>(r0)
            throw r3
        L1c:
            android.os.Looper r0 = android.os.Looper.myLooper()
            nl r1 = r2.n
            android.os.Handler r1 = r1.E
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L53
            if (r3 != 0) goto L3d
            boolean r3 = r2.y
            if (r3 != 0) goto L35
            boolean r3 = r2.z
            if (r3 != 0) goto L35
            goto L3d
        L35:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can not perform this action after onSaveInstanceState"
            r3.<init>(r0)
            throw r3
        L3d:
            java.util.ArrayList r3 = r2.C
            if (r3 != 0) goto L4f
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.C = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.D = r3
        L4f:
            r3 = 0
            r2.b = r3
            return
        L53:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must be called from main thread of fragment host"
            r3.<init>(r0)
            throw r3
        L5b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager is already executing transactions"
            r3.<init>(r0)
            throw r3
    }

    public final boolean t(boolean r9) {
            r8 = this;
            r8.s(r9)
            r9 = 0
            r0 = r9
        L5:
            java.util.ArrayList r1 = r8.C
            java.util.ArrayList r2 = r8.D
            java.util.ArrayList r3 = r8.a
            monitor-enter(r3)
            java.util.ArrayList r4 = r8.a     // Catch: java.lang.Throwable -> L17
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r4 == 0) goto L19
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            r6 = r9
            goto L42
        L17:
            r9 = move-exception
            goto L76
        L19:
            java.util.ArrayList r4 = r8.a     // Catch: java.lang.Throwable -> L17
            int r4 = r4.size()     // Catch: java.lang.Throwable -> L17
            r5 = r9
            r6 = r5
        L21:
            if (r5 >= r4) goto L33
            java.util.ArrayList r7 = r8.a     // Catch: java.lang.Throwable -> L17
            java.lang.Object r7 = r7.get(r5)     // Catch: java.lang.Throwable -> L17
            wl r7 = (defpackage.wl) r7     // Catch: java.lang.Throwable -> L17
            boolean r7 = r7.a(r1, r2)     // Catch: java.lang.Throwable -> L17
            r6 = r6 | r7
            int r5 = r5 + 1
            goto L21
        L33:
            java.util.ArrayList r1 = r8.a     // Catch: java.lang.Throwable -> L17
            r1.clear()     // Catch: java.lang.Throwable -> L17
            nl r1 = r8.n     // Catch: java.lang.Throwable -> L17
            android.os.Handler r1 = r1.E     // Catch: java.lang.Throwable -> L17
            y6 r2 = r8.G     // Catch: java.lang.Throwable -> L17
            r1.removeCallbacks(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
        L42:
            if (r6 == 0) goto L57
            r0 = 1
            r8.b = r0
            java.util.ArrayList r1 = r8.C     // Catch: java.lang.Throwable -> L52
            java.util.ArrayList r2 = r8.D     // Catch: java.lang.Throwable -> L52
            r8.J(r1, r2)     // Catch: java.lang.Throwable -> L52
            r8.d()
            goto L5
        L52:
            r9 = move-exception
            r8.d()
            throw r9
        L57:
            r8.T()
            boolean r1 = r8.B
            if (r1 == 0) goto L63
            r8.B = r9
            r8.S()
        L63:
            r5 r9 = r8.c
            java.lang.Object r9 = r9.b
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.util.Collection r9 = r9.values()
            r1 = 0
            java.util.Set r1 = java.util.Collections.singleton(r1)
            r9.removeAll(r1)
            return r0
        L76:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L17
            throw r9
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r4)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = " in "
            r0.append(r1)
            ml r1 = r4.p
            java.lang.String r2 = "}"
            java.lang.String r3 = "{"
            if (r1 == 0) goto L43
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            ml r1 = r4.p
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6b
        L43:
            nl r1 = r4.n
            if (r1 == 0) goto L66
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r0.append(r3)
            nl r1 = r4.n
            int r1 = java.lang.System.identityHashCode(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            r0.append(r2)
            goto L6b
        L66:
            java.lang.String r1 = "null"
            r0.append(r1)
        L6b:
            java.lang.String r1 = "}}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void u(java.util.ArrayList r23, java.util.ArrayList r24, int r25, int r26) {
            r22 = this;
            r1 = r22
            r0 = r23
            r2 = r24
            r3 = r26
            r5 r4 = r1.c
            r5 = r25
            java.lang.Object r6 = r0.get(r5)
            b7 r6 = (defpackage.b7) r6
            boolean r6 = r6.o
            java.util.ArrayList r7 = r1.E
            if (r7 != 0) goto L20
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1.E = r7
            goto L23
        L20:
            r7.clear()
        L23:
            java.util.ArrayList r7 = r1.E
            java.util.List r8 = r4.p()
            r7.addAll(r8)
            ml r7 = r1.q
            r9 = r5
            r10 = 0
        L30:
            r11 = 1
            if (r9 >= r3) goto L178
            java.lang.Object r12 = r0.get(r9)
            b7 r12 = (defpackage.b7) r12
            java.lang.Object r13 = r2.get(r9)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L12b
            java.util.ArrayList r13 = r1.E
            java.util.ArrayList r8 = r12.a
            r15 = 0
        L4a:
            int r14 = r8.size()
            if (r15 >= r14) goto L126
            java.lang.Object r14 = r8.get(r15)
            em r14 = (defpackage.em) r14
            int r5 = r14.a
            if (r5 == r11) goto L112
            r16 = r11
            r11 = 2
            r17 = r6
            r6 = 9
            if (r5 == r11) goto La4
            r11 = 3
            if (r5 == r11) goto L8a
            r11 = 6
            if (r5 == r11) goto L8a
            r11 = 7
            if (r5 == r11) goto L84
            r11 = 8
            if (r5 == r11) goto L71
            goto L7e
        L71:
            em r5 = new em
            r5.<init>(r6, r7)
            r8.add(r15, r5)
            int r15 = r15 + 1
            ml r5 = r14.b
            r7 = r5
        L7e:
            r19 = r9
        L80:
            r6 = r16
            goto L11c
        L84:
            r6 = r16
        L86:
            r19 = r9
            goto L117
        L8a:
            ml r5 = r14.b
            r13.remove(r5)
            ml r5 = r14.b
            if (r5 != r7) goto L7e
            em r7 = new em
            r7.<init>(r6, r5)
            r8.add(r15, r7)
            int r15 = r15 + 1
            r19 = r9
            r6 = r16
            r7 = 0
            goto L11c
        La4:
            ml r5 = r14.b
            int r11 = r5.w
            int r18 = r13.size()
            int r18 = r18 + (-1)
            r6 = r18
            r18 = 0
        Lb2:
            if (r6 < 0) goto Lff
            java.lang.Object r19 = r13.get(r6)
            r20 = r6
            r6 = r19
            ml r6 = (defpackage.ml) r6
            r19 = r9
            int r9 = r6.w
            if (r9 != r11) goto Lfa
            if (r6 != r5) goto Lc9
            r18 = r16
            goto Lfa
        Lc9:
            if (r6 != r7) goto Ld8
            em r7 = new em
            r9 = 9
            r7.<init>(r9, r6)
            r8.add(r15, r7)
            int r15 = r15 + 1
            r7 = 0
        Ld8:
            em r9 = new em
            r21 = r7
            r7 = 3
            r9.<init>(r7, r6)
            int r7 = r14.c
            r9.c = r7
            int r7 = r14.e
            r9.e = r7
            int r7 = r14.d
            r9.d = r7
            int r7 = r14.f
            r9.f = r7
            r8.add(r15, r9)
            r13.remove(r6)
            int r15 = r15 + 1
            r7 = r21
        Lfa:
            int r6 = r20 + (-1)
            r9 = r19
            goto Lb2
        Lff:
            r19 = r9
            if (r18 == 0) goto L10a
            r8.remove(r15)
            int r15 = r15 + (-1)
            goto L80
        L10a:
            r6 = r16
            r14.a = r6
            r13.add(r5)
            goto L11c
        L112:
            r17 = r6
            r6 = r11
            goto L86
        L117:
            ml r5 = r14.b
            r13.add(r5)
        L11c:
            int r15 = r15 + r6
            r5 = r25
            r11 = r6
            r6 = r17
            r9 = r19
            goto L4a
        L126:
            r17 = r6
            r19 = r9
            goto L166
        L12b:
            r17 = r6
            r19 = r9
            r6 = r11
            java.util.ArrayList r5 = r1.E
            java.util.ArrayList r8 = r12.a
            int r9 = r8.size()
            int r9 = r9 - r6
        L139:
            if (r9 < 0) goto L166
            java.lang.Object r11 = r8.get(r9)
            em r11 = (defpackage.em) r11
            int r13 = r11.a
            if (r13 == r6) goto L15c
            r6 = 3
            if (r13 == r6) goto L156
            switch(r13) {
                case 6: goto L156;
                case 7: goto L15d;
                case 8: goto L154;
                case 9: goto L151;
                case 10: goto L14c;
                default: goto L14b;
            }
        L14b:
            goto L162
        L14c:
            jq r13 = r11.g
            r11.h = r13
            goto L162
        L151:
            ml r7 = r11.b
            goto L162
        L154:
            r7 = 0
            goto L162
        L156:
            ml r11 = r11.b
            r5.add(r11)
            goto L162
        L15c:
            r6 = 3
        L15d:
            ml r11 = r11.b
            r5.remove(r11)
        L162:
            int r9 = r9 + (-1)
            r6 = 1
            goto L139
        L166:
            if (r10 != 0) goto L16f
            boolean r5 = r12.g
            if (r5 == 0) goto L16d
            goto L16f
        L16d:
            r10 = 0
            goto L170
        L16f:
            r10 = 1
        L170:
            int r9 = r19 + 1
            r5 = r25
            r6 = r17
            goto L30
        L178:
            r17 = r6
            java.util.ArrayList r5 = r1.E
            r5.clear()
            if (r17 != 0) goto L1b4
            int r5 = r1.m
            r6 = 1
            if (r5 < r6) goto L1b4
            r5 = r25
        L188:
            if (r5 >= r3) goto L1b4
            java.lang.Object r6 = r0.get(r5)
            b7 r6 = (defpackage.b7) r6
            java.util.ArrayList r6 = r6.a
            int r7 = r6.size()
            r8 = 0
        L197:
            if (r8 >= r7) goto L1b1
            java.lang.Object r9 = r6.get(r8)
            int r8 = r8 + 1
            em r9 = (defpackage.em) r9
            ml r9 = r9.b
            if (r9 == 0) goto L197
            yl r10 = r9.r
            if (r10 == 0) goto L197
            androidx.fragment.app.a r9 = r1.f(r9)
            r4.v(r9)
            goto L197
        L1b1:
            int r5 = r5 + 1
            goto L188
        L1b4:
            r4 = r25
        L1b6:
            r5 = -1
            if (r4 >= r3) goto L37c
            java.lang.Object r6 = r0.get(r4)
            b7 r6 = (defpackage.b7) r6
            java.lang.Object r7 = r2.get(r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L2ab
            r6.c(r5)
            yl r5 = r6.p
            java.util.ArrayList r7 = r6.a
            int r8 = r7.size()
            r9 = 1
            int r8 = r8 - r9
        L1d8:
            if (r8 < 0) goto L378
            java.lang.Object r10 = r7.get(r8)
            em r10 = (defpackage.em) r10
            ml r11 = r10.b
            if (r11 == 0) goto L218
            ll r12 = r11.H
            if (r12 != 0) goto L1e9
            goto L1ef
        L1e9:
            ll r12 = r11.f()
            r12.a = r9
        L1ef:
            int r12 = r6.f
            r13 = 8194(0x2002, float:1.1482E-41)
            r14 = 4097(0x1001, float:5.741E-42)
            if (r12 == r14) goto L202
            r15 = 4099(0x1003, float:5.744E-42)
            if (r12 == r15) goto L201
            if (r12 == r13) goto L1ff
            r13 = 0
            goto L202
        L1ff:
            r13 = r14
            goto L202
        L201:
            r13 = r15
        L202:
            ll r12 = r11.H
            if (r12 != 0) goto L209
            if (r13 != 0) goto L209
            goto L210
        L209:
            r11.f()
            ll r12 = r11.H
            r12.f = r13
        L210:
            r11.f()
            ll r12 = r11.H
            r12.getClass()
        L218:
            int r12 = r10.a
            switch(r12) {
                case 1: goto L296;
                case 2: goto L21d;
                case 3: goto L287;
                case 4: goto L275;
                case 5: goto L263;
                case 6: goto L254;
                case 7: goto L242;
                case 8: goto L23d;
                case 9: goto L239;
                case 10: goto L233;
                default: goto L21d;
            }
        L21d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown cmd: "
            r2.<init>(r3)
            int r3 = r10.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L233:
            jq r10 = r10.g
            r5.O(r11, r10)
            goto L2a7
        L239:
            r5.P(r11)
            goto L2a7
        L23d:
            r10 = 0
            r5.P(r10)
            goto L2a7
        L242:
            int r12 = r10.c
            int r13 = r10.d
            int r14 = r10.e
            int r10 = r10.f
            r11.B(r12, r13, r14, r10)
            r5.N(r11, r9)
            r5.g(r11)
            goto L2a7
        L254:
            int r12 = r10.c
            int r13 = r10.d
            int r14 = r10.e
            int r10 = r10.f
            r11.B(r12, r13, r14, r10)
            r5.c(r11)
            goto L2a7
        L263:
            int r12 = r10.c
            int r13 = r10.d
            int r14 = r10.e
            int r10 = r10.f
            r11.B(r12, r13, r14, r10)
            r5.N(r11, r9)
            r5.z(r11)
            goto L2a7
        L275:
            int r12 = r10.c
            int r13 = r10.d
            int r14 = r10.e
            int r10 = r10.f
            r11.B(r12, r13, r14, r10)
            r5.getClass()
            R(r11)
            goto L2a7
        L287:
            int r12 = r10.c
            int r13 = r10.d
            int r14 = r10.e
            int r10 = r10.f
            r11.B(r12, r13, r14, r10)
            r5.a(r11)
            goto L2a7
        L296:
            int r12 = r10.c
            int r13 = r10.d
            int r14 = r10.e
            int r10 = r10.f
            r11.B(r12, r13, r14, r10)
            r5.N(r11, r9)
            r5.I(r11)
        L2a7:
            int r8 = r8 + (-1)
            goto L1d8
        L2ab:
            r5 = 1
            r6.c(r5)
            yl r5 = r6.p
            java.util.ArrayList r7 = r6.a
            int r8 = r7.size()
            r9 = 0
            r10 = r9
        L2b9:
            if (r10 >= r8) goto L378
            java.lang.Object r11 = r7.get(r10)
            em r11 = (defpackage.em) r11
            ml r12 = r11.b
            if (r12 == 0) goto L2e8
            ll r13 = r12.H
            if (r13 != 0) goto L2ca
            goto L2d0
        L2ca:
            ll r13 = r12.f()
            r13.a = r9
        L2d0:
            int r13 = r6.f
            ll r14 = r12.H
            if (r14 != 0) goto L2d9
            if (r13 != 0) goto L2d9
            goto L2e0
        L2d9:
            r12.f()
            ll r14 = r12.H
            r14.f = r13
        L2e0:
            r12.f()
            ll r13 = r12.H
            r13.getClass()
        L2e8:
            int r13 = r11.a
            switch(r13) {
                case 1: goto L363;
                case 2: goto L2ed;
                case 3: goto L354;
                case 4: goto L345;
                case 5: goto L333;
                case 6: goto L324;
                case 7: goto L312;
                case 8: goto L30e;
                case 9: goto L309;
                case 10: goto L303;
                default: goto L2ed;
            }
        L2ed:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown cmd: "
            r2.<init>(r3)
            int r3 = r11.a
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L303:
            jq r11 = r11.h
            r5.O(r12, r11)
            goto L374
        L309:
            r11 = 0
            r5.P(r11)
            goto L374
        L30e:
            r5.P(r12)
            goto L374
        L312:
            int r13 = r11.c
            int r14 = r11.d
            int r15 = r11.e
            int r11 = r11.f
            r12.B(r13, r14, r15, r11)
            r5.N(r12, r9)
            r5.c(r12)
            goto L374
        L324:
            int r13 = r11.c
            int r14 = r11.d
            int r15 = r11.e
            int r11 = r11.f
            r12.B(r13, r14, r15, r11)
            r5.g(r12)
            goto L374
        L333:
            int r13 = r11.c
            int r14 = r11.d
            int r15 = r11.e
            int r11 = r11.f
            r12.B(r13, r14, r15, r11)
            r5.N(r12, r9)
            R(r12)
            goto L374
        L345:
            int r13 = r11.c
            int r14 = r11.d
            int r15 = r11.e
            int r11 = r11.f
            r12.B(r13, r14, r15, r11)
            r5.z(r12)
            goto L374
        L354:
            int r13 = r11.c
            int r14 = r11.d
            int r15 = r11.e
            int r11 = r11.f
            r12.B(r13, r14, r15, r11)
            r5.I(r12)
            goto L374
        L363:
            int r13 = r11.c
            int r14 = r11.d
            int r15 = r11.e
            int r11 = r11.f
            r12.B(r13, r14, r15, r11)
            r5.N(r12, r9)
            r5.a(r12)
        L374:
            int r10 = r10 + 1
            goto L2b9
        L378:
            int r4 = r4 + 1
            goto L1b6
        L37c:
            int r4 = r3 + (-1)
            java.lang.Object r4 = r2.get(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r6 = r25
        L38a:
            if (r6 >= r3) goto L3d6
            java.lang.Object r7 = r0.get(r6)
            b7 r7 = (defpackage.b7) r7
            if (r4 == 0) goto L3b6
            java.util.ArrayList r8 = r7.a
            int r8 = r8.size()
            r16 = 1
            int r8 = r8 + (-1)
        L39e:
            if (r8 < 0) goto L3d3
            java.util.ArrayList r9 = r7.a
            java.lang.Object r9 = r9.get(r8)
            em r9 = (defpackage.em) r9
            ml r9 = r9.b
            if (r9 == 0) goto L3b3
            androidx.fragment.app.a r9 = r1.f(r9)
            r9.k()
        L3b3:
            int r8 = r8 + (-1)
            goto L39e
        L3b6:
            java.util.ArrayList r7 = r7.a
            int r8 = r7.size()
            r9 = 0
        L3bd:
            if (r9 >= r8) goto L3d3
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            em r10 = (defpackage.em) r10
            ml r10 = r10.b
            if (r10 == 0) goto L3bd
            androidx.fragment.app.a r10 = r1.f(r10)
            r10.k()
            goto L3bd
        L3d3:
            int r6 = r6 + 1
            goto L38a
        L3d6:
            int r6 = r1.m
            r7 = 1
            r1.E(r6, r7)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r7 = r25
        L3e3:
            if (r7 >= r3) goto L413
            java.lang.Object r8 = r0.get(r7)
            b7 r8 = (defpackage.b7) r8
            java.util.ArrayList r8 = r8.a
            int r9 = r8.size()
            r10 = 0
        L3f2:
            if (r10 >= r9) goto L410
            java.lang.Object r11 = r8.get(r10)
            int r10 = r10 + 1
            em r11 = (defpackage.em) r11
            ml r11 = r11.b
            if (r11 == 0) goto L3f2
            android.view.ViewGroup r11 = r11.D
            if (r11 == 0) goto L3f2
            vh r12 = r1.y()
            cg r11 = defpackage.cg.f(r11, r12)
            r6.add(r11)
            goto L3f2
        L410:
            int r7 = r7 + 1
            goto L3e3
        L413:
            java.util.Iterator r6 = r6.iterator()
        L417:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L463
            java.lang.Object r7 = r6.next()
            cg r7 = (defpackage.cg) r7
            r7.d = r4
            java.util.ArrayList r8 = r7.b
            monitor-enter(r8)
            r7.g()     // Catch: java.lang.Throwable -> L457
            r9 = 0
            r7.e = r9     // Catch: java.lang.Throwable -> L457
            java.util.ArrayList r10 = r7.b     // Catch: java.lang.Throwable -> L457
            int r10 = r10.size()     // Catch: java.lang.Throwable -> L457
            int r10 = r10 + (-1)
        L436:
            if (r10 < 0) goto L45c
            java.util.ArrayList r11 = r7.b     // Catch: java.lang.Throwable -> L457
            java.lang.Object r11 = r11.get(r10)     // Catch: java.lang.Throwable -> L457
            g40 r11 = (defpackage.g40) r11     // Catch: java.lang.Throwable -> L457
            ml r12 = r11.c     // Catch: java.lang.Throwable -> L457
            android.view.View r12 = r12.E     // Catch: java.lang.Throwable -> L457
            int r12 = defpackage.z30.c(r12)     // Catch: java.lang.Throwable -> L457
            int r13 = r11.a     // Catch: java.lang.Throwable -> L457
            r14 = 2
            if (r13 != r14) goto L459
            if (r12 == r14) goto L459
            ml r10 = r11.c     // Catch: java.lang.Throwable -> L457
            r10.getClass()     // Catch: java.lang.Throwable -> L457
            r7.e = r9     // Catch: java.lang.Throwable -> L457
            goto L45c
        L457:
            r0 = move-exception
            goto L461
        L459:
            int r10 = r10 + (-1)
            goto L436
        L45c:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L457
            r7.c()
            goto L417
        L461:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L457
            throw r0
        L463:
            r4 = r25
        L465:
            if (r4 >= r3) goto L485
            java.lang.Object r6 = r0.get(r4)
            b7 r6 = (defpackage.b7) r6
            java.lang.Object r7 = r2.get(r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L47f
            int r7 = r6.r
            if (r7 < 0) goto L47f
            r6.r = r5
        L47f:
            r6.getClass()
            int r4 = r4 + 1
            goto L465
        L485:
            return
    }

    public final defpackage.ml v(int r6) {
            r5 = this;
            r5 r0 = r5.c
            java.lang.Object r1 = r0.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            int r2 = r2 + (-1)
        Lc:
            if (r2 < 0) goto L1e
            java.lang.Object r3 = r1.get(r2)
            ml r3 = (defpackage.ml) r3
            if (r3 == 0) goto L1b
            int r4 = r3.v
            if (r4 != r6) goto L1b
            return r3
        L1b:
            int r2 = r2 + (-1)
            goto Lc
        L1e:
            java.lang.Object r0 = r0.b
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L2a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.a r1 = (androidx.fragment.app.a) r1
            if (r1 == 0) goto L2a
            ml r1 = r1.c
            int r2 = r1.v
            if (r2 != r6) goto L2a
            return r1
        L3f:
            r6 = 0
            return r6
    }

    public final android.view.ViewGroup w(defpackage.ml r2) {
            r1 = this;
            android.view.ViewGroup r0 = r2.D
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r2.w
            if (r0 > 0) goto La
            goto L21
        La:
            ip r0 = r1.o
            boolean r0 = r0.H()
            if (r0 == 0) goto L21
            ip r0 = r1.o
            int r2 = r2.w
            android.view.View r2 = r0.G(r2)
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L21
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        L21:
            r2 = 0
            return r2
    }

    public final defpackage.tl x() {
            r1 = this;
            ml r0 = r1.p
            if (r0 == 0) goto Lb
            yl r0 = r0.r
            tl r0 = r0.x()
            return r0
        Lb:
            tl r0 = r1.r
            return r0
    }

    public final defpackage.vh y() {
            r1 = this;
            ml r0 = r1.p
            if (r0 == 0) goto Lb
            yl r0 = r0.r
            vh r0 = r0.y()
            return r0
        Lb:
            vh r0 = r1.s
            return r0
    }

    public final void z(defpackage.ml r3) {
            r2 = this;
            r0 = 2
            boolean r0 = A(r0)
            if (r0 == 0) goto L1a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "hide: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FragmentManager"
            android.util.Log.v(r1, r0)
        L1a:
            boolean r0 = r3.y
            if (r0 != 0) goto L29
            r0 = 1
            r3.y = r0
            boolean r1 = r3.I
            r0 = r0 ^ r1
            r3.I = r0
            r2.Q(r3)
        L29:
            return
    }
}
