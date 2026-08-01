package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final defpackage.d4 a;
    public final defpackage.r5 b;
    public final defpackage.ml c;
    public boolean d;
    public int e;

    public a(defpackage.d4 r2, defpackage.r5 r3, java.lang.ClassLoader r4, defpackage.tl r5, defpackage.cm r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r0 = -1
            r1.e = r0
            r1.a = r2
            r1.b = r3
            java.lang.String r2 = r6.a
            ml r2 = r5.a(r2)
            r1.c = r2
            android.os.Bundle r3 = r6.j
            if (r3 == 0) goto L1c
            r3.setClassLoader(r4)
        L1c:
            r2.C(r3)
            java.lang.String r3 = r6.b
            r2.e = r3
            boolean r3 = r6.c
            r2.m = r3
            r3 = 1
            r2.o = r3
            int r3 = r6.d
            r2.v = r3
            int r3 = r6.e
            r2.w = r3
            java.lang.String r3 = r6.f
            r2.x = r3
            boolean r3 = r6.g
            r2.A = r3
            boolean r3 = r6.h
            r2.l = r3
            boolean r3 = r6.i
            r2.z = r3
            boolean r3 = r6.k
            r2.y = r3
            jq[] r3 = defpackage.jq.values()
            int r4 = r6.l
            r3 = r3[r4]
            r2.K = r3
            android.os.Bundle r3 = r6.m
            if (r3 == 0) goto L57
            r2.b = r3
            goto L5e
        L57:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r2.b = r3
        L5e:
            r3 = 2
            boolean r3 = defpackage.yl.A(r3)
            if (r3 == 0) goto L78
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Instantiated fragment "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L78:
            return
    }

    public a(defpackage.d4 r2, defpackage.r5 r3, defpackage.ml r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r0 = -1
            r1.e = r0
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public a(defpackage.d4 r3, defpackage.r5 r4, defpackage.ml r5, defpackage.cm r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            r1 = -1
            r2.e = r1
            r2.a = r3
            r2.b = r4
            r2.c = r5
            r3 = 0
            r5.c = r3
            r5.d = r3
            r5.q = r0
            r5.n = r0
            r5.k = r0
            ml r4 = r5.g
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.e
            goto L22
        L21:
            r4 = r3
        L22:
            r5.h = r4
            r5.g = r3
            android.os.Bundle r3 = r6.m
            if (r3 == 0) goto L2d
            r5.b = r3
            return
        L2d:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r5.b = r3
            return
    }

    public final void a() {
            r6 = this;
            r0 = 3
            boolean r1 = defpackage.yl.A(r0)
            java.lang.String r2 = "FragmentManager"
            ml r3 = r6.c
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "moveto ACTIVITY_CREATED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            android.os.Bundle r1 = r3.b
            yl r1 = r3.t
            r1.F()
            r3.a = r0
            r1 = 1
            r3.C = r1
            boolean r0 = defpackage.yl.A(r0)
            if (r0 == 0) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "moveto RESTORE_VIEW_STATE: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L3f:
            android.view.View r0 = r3.E
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L8d
            android.os.Bundle r4 = r3.b
            android.util.SparseArray r5 = r3.c
            if (r5 == 0) goto L50
            r0.restoreHierarchyState(r5)
            r3.c = r2
        L50:
            android.view.View r0 = r3.E
            if (r0 == 0) goto L5f
            fm r0 = r3.M
            android.os.Bundle r5 = r3.d
            gm r0 = r0.c
            r0.b(r5)
            r3.d = r2
        L5f:
            r3.C = r1
            r3.u(r4)
            boolean r0 = r3.C
            if (r0 == 0) goto L74
            android.view.View r0 = r3.E
            if (r0 == 0) goto L8d
            fm r0 = r3.M
            iq r4 = defpackage.iq.ON_CREATE
            r0.c(r4)
            goto L8d
        L74:
            f50 r0 = new f50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onViewStateRestored()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            r3.b = r2
            yl r0 = r3.t
            r0.y = r1
            r0.z = r1
            am r2 = r0.F
            r2.h = r1
            r2 = 4
            r0.p(r2)
            d4 r0 = r6.a
            r0.c(r1)
            return
    }

    public final void b() {
            r8 = this;
            r5 r0 = r8.b
            java.lang.Object r0 = r0.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            ml r1 = r8.c
            android.view.ViewGroup r2 = r1.D
            r3 = -1
            if (r2 != 0) goto Le
            goto L4a
        Le:
            int r4 = r0.indexOf(r1)
            int r5 = r4 + (-1)
        L14:
            if (r5 < 0) goto L2e
            java.lang.Object r6 = r0.get(r5)
            ml r6 = (defpackage.ml) r6
            android.view.ViewGroup r7 = r6.D
            if (r7 != r2) goto L2b
            android.view.View r6 = r6.E
            if (r6 == 0) goto L2b
            int r0 = r2.indexOfChild(r6)
            int r3 = r0 + 1
            goto L4a
        L2b:
            int r5 = r5 + (-1)
            goto L14
        L2e:
            int r4 = r4 + 1
            int r5 = r0.size()
            if (r4 >= r5) goto L4a
            java.lang.Object r5 = r0.get(r4)
            ml r5 = (defpackage.ml) r5
            android.view.ViewGroup r6 = r5.D
            if (r6 != r2) goto L49
            android.view.View r5 = r5.E
            if (r5 == 0) goto L49
            int r3 = r2.indexOfChild(r5)
            goto L4a
        L49:
            goto L2e
        L4a:
            android.view.ViewGroup r0 = r1.D
            android.view.View r1 = r1.E
            r0.addView(r1, r3)
            return
    }

    public final void c() {
            r7 = this;
            r0 = 3
            boolean r0 = defpackage.yl.A(r0)
            ml r1 = r7.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto ATTACHED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            ml r0 = r1.g
            java.lang.String r2 = " that does not belong to this FragmentManager!"
            java.lang.String r3 = " declared target fragment "
            r5 r4 = r7.b
            r5 = 0
            java.lang.String r6 = "Fragment "
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.e
            java.lang.Object r4 = r4.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            androidx.fragment.app.a r0 = (androidx.fragment.app.a) r0
            if (r0 == 0) goto L41
            ml r2 = r1.g
            java.lang.String r2 = r2.e
            r1.h = r2
            r1.g = r5
            r5 = r0
            goto L87
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r3)
            ml r1 = r1.g
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            java.lang.String r0 = r1.h
            if (r0 == 0) goto L87
            java.lang.Object r4 = r4.b
            java.util.HashMap r4 = (java.util.HashMap) r4
            java.lang.Object r0 = r4.get(r0)
            r5 = r0
            androidx.fragment.app.a r5 = (androidx.fragment.app.a) r5
            if (r5 == 0) goto L70
            goto L87
        L70:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r6)
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r1.h
            java.lang.String r1 = defpackage.z30.l(r4, r1, r2)
            r0.<init>(r1)
            throw r0
        L87:
            if (r5 == 0) goto L8c
            r5.k()
        L8c:
            yl r0 = r1.r
            nl r2 = r0.n
            r1.s = r2
            ml r0 = r0.p
            r1.u = r0
            d4 r0 = r7.a
            r2 = 0
            r0.j(r2)
            java.util.ArrayList r3 = r1.P
            java.util.Iterator r4 = r3.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L105
            r3.clear()
            yl r3 = r1.t
            nl r4 = r1.s
            ip r5 = r1.c()
            r3.b(r4, r5, r1)
            r1.a = r2
            r1.C = r2
            nl r3 = r1.s
            androidx.fragment.app.FragmentActivity r3 = r3.D
            r1.l(r3)
            boolean r3 = r1.C
            if (r3 == 0) goto Lee
            yl r3 = r1.r
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.l
            java.util.Iterator r3 = r3.iterator()
        Lcd:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ldd
            java.lang.Object r4 = r3.next()
            bm r4 = (defpackage.bm) r4
            r4.a()
            goto Lcd
        Ldd:
            yl r1 = r1.t
            r1.y = r2
            r1.z = r2
            am r3 = r1.F
            r3.h = r2
            r1.p(r2)
            r0.e(r2)
            return
        Lee:
            f50 r0 = new f50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onAttach()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L105:
            java.lang.ClassCastException r0 = defpackage.z30.h(r4)
            throw r0
    }

    public final int d() {
            r14 = this;
            ml r0 = r14.c
            yl r1 = r0.r
            if (r1 != 0) goto L9
            int r0 = r0.a
            return r0
        L9:
            int r1 = r14.e
            jq r2 = r0.K
            int r2 = r2.ordinal()
            r3 = 0
            r4 = 5
            r5 = -1
            r6 = 3
            r7 = 4
            r8 = 2
            r9 = 1
            if (r2 == r9) goto L2f
            if (r2 == r8) goto L2a
            if (r2 == r6) goto L25
            if (r2 == r7) goto L33
            int r1 = java.lang.Math.min(r1, r5)
            goto L33
        L25:
            int r1 = java.lang.Math.min(r1, r4)
            goto L33
        L2a:
            int r1 = java.lang.Math.min(r1, r9)
            goto L33
        L2f:
            int r1 = java.lang.Math.min(r1, r3)
        L33:
            boolean r2 = r0.m
            if (r2 == 0) goto L5f
            boolean r2 = r0.n
            if (r2 == 0) goto L50
            int r1 = r14.e
            int r1 = java.lang.Math.max(r1, r8)
            android.view.View r2 = r0.E
            if (r2 == 0) goto L5f
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L5f
            int r1 = java.lang.Math.min(r1, r8)
            goto L5f
        L50:
            int r2 = r14.e
            if (r2 >= r7) goto L5b
            int r2 = r0.a
            int r1 = java.lang.Math.min(r1, r2)
            goto L5f
        L5b:
            int r1 = java.lang.Math.min(r1, r9)
        L5f:
            boolean r2 = r0.k
            if (r2 != 0) goto L67
            int r1 = java.lang.Math.min(r1, r9)
        L67:
            android.view.ViewGroup r2 = r0.D
            if (r2 == 0) goto Laa
            yl r10 = r0.j()
            vh r10 = r10.y()
            cg r2 = defpackage.cg.f(r2, r10)
            g40 r10 = r2.d(r0)
            if (r10 == 0) goto L80
            int r10 = r10.b
            goto L81
        L80:
            r10 = r3
        L81:
            java.util.ArrayList r2 = r2.c
            int r11 = r2.size()
        L87:
            if (r3 >= r11) goto L9e
            java.lang.Object r12 = r2.get(r3)
            int r3 = r3 + 1
            g40 r12 = (defpackage.g40) r12
            ml r13 = r12.c
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L87
            boolean r13 = r12.f
            if (r13 != 0) goto L87
            goto L9f
        L9e:
            r12 = 0
        L9f:
            if (r12 == 0) goto La9
            if (r10 == 0) goto La5
            if (r10 != r9) goto La9
        La5:
            int r2 = r12.b
            r3 = r2
            goto Laa
        La9:
            r3 = r10
        Laa:
            if (r3 != r8) goto Lb2
            r2 = 6
            int r1 = java.lang.Math.min(r1, r2)
            goto Lca
        Lb2:
            if (r3 != r6) goto Lb9
            int r1 = java.lang.Math.max(r1, r6)
            goto Lca
        Lb9:
            boolean r2 = r0.l
            if (r2 == 0) goto Lca
            int r2 = r0.q
            if (r2 <= 0) goto Lc6
            int r1 = java.lang.Math.min(r1, r9)
            goto Lca
        Lc6:
            int r1 = java.lang.Math.min(r1, r5)
        Lca:
            boolean r2 = r0.F
            if (r2 == 0) goto Ld6
            int r2 = r0.a
            if (r2 >= r4) goto Ld6
            int r1 = java.lang.Math.min(r1, r7)
        Ld6:
            boolean r2 = defpackage.yl.A(r8)
            if (r2 == 0) goto Lf7
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "computeExpectedState() of "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r3 = " for "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r0)
        Lf7:
            return r1
    }

    public final void e() {
            r7 = this;
            r0 = 3
            boolean r0 = defpackage.yl.A(r0)
            ml r1 = r7.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            boolean r0 = r1.J
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L6e
            d4 r0 = r7.a
            r0.k(r3)
            android.os.Bundle r4 = r1.b
            yl r5 = r1.t
            r5.F()
            r1.a = r2
            r1.C = r3
            androidx.lifecycle.a r5 = r1.L
            androidx.fragment.app.Fragment$5 r6 = new androidx.fragment.app.Fragment$5
            r6.<init>(r1)
            r5.a(r6)
            gm r5 = r1.O
            r5.b(r4)
            r1.m(r4)
            r1.J = r2
            boolean r2 = r1.C
            if (r2 == 0) goto L55
            androidx.lifecycle.a r1 = r1.L
            iq r2 = defpackage.iq.ON_CREATE
            r1.d(r2)
            r0.f(r3)
            return
        L55:
            f50 r0 = new f50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onCreate()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L6e:
            android.os.Bundle r0 = r1.b
            if (r0 == 0) goto L8c
            java.lang.String r4 = "android:support:fragments"
            android.os.Parcelable r0 = r0.getParcelable(r4)
            if (r0 == 0) goto L8c
            yl r4 = r1.t
            r4.K(r0)
            yl r0 = r1.t
            r0.y = r3
            r0.z = r3
            am r4 = r0.F
            r4.h = r3
            r0.p(r2)
        L8c:
            r1.a = r2
            return
    }

    public final void f() {
            r7 = this;
            ml r0 = r7.c
            boolean r1 = r0.m
            if (r1 == 0) goto L7
            return
        L7:
            r1 = 3
            boolean r1 = defpackage.yl.A(r1)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto CREATE_VIEW: "
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L21:
            android.os.Bundle r1 = r0.b
            android.view.LayoutInflater r1 = r0.q(r1)
            android.view.ViewGroup r3 = r0.D
            if (r3 == 0) goto L2c
            goto L99
        L2c:
            int r3 = r0.w
            if (r3 == 0) goto L98
            r4 = -1
            if (r3 == r4) goto L7f
            yl r4 = r0.r
            ip r4 = r4.o
            android.view.View r3 = r4.G(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 != 0) goto L99
            boolean r4 = r0.o
            if (r4 == 0) goto L44
            goto L99
        L44:
            android.content.Context r1 = r0.z()     // Catch: android.content.res.Resources.NotFoundException -> L53
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L53
            int r2 = r0.w     // Catch: android.content.res.Resources.NotFoundException -> L53
            java.lang.String r1 = r1.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L53
            goto L55
        L53:
            java.lang.String r1 = "unknown"
        L55:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No view found for id 0x"
            r3.<init>(r4)
            int r4 = r0.w
            java.lang.String r4 = java.lang.Integer.toHexString(r4)
            r3.append(r4)
            java.lang.String r4 = " ("
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = ") for fragment "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L7f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Cannot create fragment "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " for a container view with no id"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L98:
            r3 = 0
        L99:
            r0.D = r3
            android.os.Bundle r4 = r0.b
            r0.v(r1, r3, r4)
            android.view.View r1 = r0.E
            r4 = 2
            if (r1 == 0) goto L130
            r5 = 0
            r1.setSaveFromParentEnabled(r5)
            android.view.View r1 = r0.E
            r6 = 2131296428(0x7f0900ac, float:1.8210772E38)
            r1.setTag(r6, r0)
            if (r3 == 0) goto Lb6
            r7.b()
        Lb6:
            boolean r1 = r0.y
            if (r1 == 0) goto Lc1
            android.view.View r1 = r0.E
            r3 = 8
            r1.setVisibility(r3)
        Lc1:
            android.view.View r1 = r0.E
            java.util.WeakHashMap r3 = defpackage.ja0.a
            boolean r1 = defpackage.v90.b(r1)
            if (r1 == 0) goto Ld1
            android.view.View r1 = r0.E
            defpackage.w90.c(r1)
            goto Ldb
        Ld1:
            android.view.View r1 = r0.E
            dm r3 = new dm
            r3.<init>(r1, r5)
            r1.addOnAttachStateChangeListener(r3)
        Ldb:
            yl r1 = r0.t
            r1.p(r4)
            d4 r1 = r7.a
            r1.p(r5)
            android.view.View r1 = r0.E
            int r1 = r1.getVisibility()
            android.view.View r3 = r0.E
            float r3 = r3.getAlpha()
            ll r5 = r0.f()
            r5.j = r3
            android.view.ViewGroup r3 = r0.D
            if (r3 == 0) goto L130
            if (r1 != 0) goto L130
            android.view.View r1 = r0.E
            android.view.View r1 = r1.findFocus()
            if (r1 == 0) goto L12a
            ll r3 = r0.f()
            r3.k = r1
            boolean r3 = defpackage.yl.A(r4)
            if (r3 == 0) goto L12a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "requestFocus: Saved focused view "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = " for Fragment "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            android.util.Log.v(r2, r1)
        L12a:
            android.view.View r1 = r0.E
            r2 = 0
            r1.setAlpha(r2)
        L130:
            r0.a = r4
            return
    }

    public final void g() {
            r10 = this;
            r0 = 3
            boolean r1 = defpackage.yl.A(r0)
            java.lang.String r2 = "FragmentManager"
            ml r3 = r10.c
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "movefrom CREATED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            boolean r1 = r3.l
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L29
            int r1 = r3.q
            if (r1 <= 0) goto L27
            goto L29
        L27:
            r1 = r5
            goto L2a
        L29:
            r1 = r4
        L2a:
            r5 r6 = r10.b
            if (r1 != 0) goto L5b
            java.lang.Object r7 = r6.d
            am r7 = (defpackage.am) r7
            java.util.HashMap r8 = r7.c
            java.lang.String r9 = r3.e
            boolean r8 = r8.containsKey(r9)
            if (r8 != 0) goto L3d
            goto L44
        L3d:
            boolean r8 = r7.f
            if (r8 == 0) goto L44
            boolean r7 = r7.g
            goto L45
        L44:
            r7 = r5
        L45:
            if (r7 == 0) goto L48
            goto L5b
        L48:
            java.lang.String r0 = r3.h
            if (r0 == 0) goto L58
            ml r0 = r6.g(r0)
            if (r0 == 0) goto L58
            boolean r1 = r0.A
            if (r1 == 0) goto L58
            r3.g = r0
        L58:
            r3.a = r4
            return
        L5b:
            nl r7 = r3.s
            if (r7 == 0) goto L66
            java.lang.Object r7 = r6.d
            am r7 = (defpackage.am) r7
            boolean r7 = r7.g
            goto L71
        L66:
            androidx.fragment.app.FragmentActivity r7 = r7.D
            if (r7 == 0) goto L70
            boolean r7 = r7.isChangingConfigurations()
            r7 = r7 ^ r5
            goto L71
        L70:
            r7 = r5
        L71:
            if (r1 != 0) goto L75
            if (r7 == 0) goto Lb8
        L75:
            java.lang.Object r1 = r6.d
            am r1 = (defpackage.am) r1
            java.util.HashMap r7 = r1.e
            java.util.HashMap r1 = r1.d
            boolean r0 = defpackage.yl.A(r0)
            if (r0 == 0) goto L94
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r8 = "Clearing non-config state for "
            r0.<init>(r8)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L94:
            java.lang.String r0 = r3.e
            java.lang.Object r0 = r1.get(r0)
            am r0 = (defpackage.am) r0
            if (r0 == 0) goto La6
            r0.a()
            java.lang.String r0 = r3.e
            r1.remove(r0)
        La6:
            java.lang.String r0 = r3.e
            java.lang.Object r0 = r7.get(r0)
            ra0 r0 = (defpackage.ra0) r0
            if (r0 == 0) goto Lb8
            r0.a()
            java.lang.String r0 = r3.e
            r7.remove(r0)
        Lb8:
            yl r0 = r3.t
            r0.k()
            androidx.lifecycle.a r0 = r3.L
            iq r1 = defpackage.iq.ON_DESTROY
            r0.d(r1)
            r3.a = r4
            r3.J = r4
            r3.C = r5
            d4 r0 = r10.a
            r0.g(r4)
            java.util.ArrayList r0 = r6.i()
            int r1 = r0.size()
        Ld7:
            if (r4 >= r1) goto Lf5
            java.lang.Object r2 = r0.get(r4)
            int r4 = r4 + 1
            androidx.fragment.app.a r2 = (androidx.fragment.app.a) r2
            if (r2 == 0) goto Ld7
            ml r2 = r2.c
            java.lang.String r5 = r3.e
            java.lang.String r7 = r2.h
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto Ld7
            r2.g = r3
            r5 = 0
            r2.h = r5
            goto Ld7
        Lf5:
            java.lang.String r0 = r3.h
            if (r0 == 0) goto Lff
            ml r0 = r6.g(r0)
            r3.g = r0
        Lff:
            r6.w(r10)
            return
    }

    public final void h() {
            r7 = this;
            r0 = 3
            boolean r0 = defpackage.yl.A(r0)
            ml r1 = r7.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATE_VIEW: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            android.view.ViewGroup r0 = r1.D
            if (r0 == 0) goto L27
            android.view.View r2 = r1.E
            if (r2 == 0) goto L27
            r0.removeView(r2)
        L27:
            yl r0 = r1.t
            r2 = 1
            r0.p(r2)
            android.view.View r0 = r1.E
            if (r0 == 0) goto L49
            fm r0 = r1.M
            r0.f()
            androidx.lifecycle.a r0 = r0.b
            jq r0 = r0.c
            jq r3 = defpackage.jq.c
            int r0 = r0.compareTo(r3)
            if (r0 < 0) goto L49
            fm r0 = r1.M
            iq r3 = defpackage.iq.ON_DESTROY
            r0.c(r3)
        L49:
            r1.a = r2
            r0 = 0
            r1.C = r0
            r1.o()
            boolean r2 = r1.C
            if (r2 == 0) goto Le7
            ra0 r2 = r1.d()
            java.lang.String r3 = "store"
            defpackage.ip.o(r3, r2)
            se r3 = defpackage.se.b
            java.lang.String r4 = "defaultCreationExtras"
            defpackage.ip.o(r4, r3)
            java.lang.Class<pr> r4 = defpackage.pr.class
            java.lang.String r5 = r4.getCanonicalName()
            if (r5 == 0) goto Ldf
            java.lang.String r6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r5 = r6.concat(r5)
            java.lang.String r6 = "key"
            defpackage.ip.o(r6, r5)
            java.util.LinkedHashMap r2 = r2.a
            java.lang.Object r6 = r2.get(r5)
            pa0 r6 = (defpackage.pa0) r6
            boolean r4 = r4.isInstance(r6)
            if (r4 == 0) goto L8c
            java.lang.String r2 = "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get"
            defpackage.ip.m(r2, r6)
            goto Lb3
        L8c:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.LinkedHashMap r3 = r3.a
            r4.putAll(r3)
            vh r3 = defpackage.vh.p
            r4.put(r3, r5)
            pr r3 = new pr     // Catch: java.lang.AbstractMethodError -> La2
            r3.<init>()     // Catch: java.lang.AbstractMethodError -> La2
        La0:
            r6 = r3
            goto La8
        La2:
            pr r3 = new pr
            r3.<init>()
            goto La0
        La8:
            java.lang.Object r2 = r2.put(r5, r6)
            pa0 r2 = (defpackage.pa0) r2
            if (r2 == 0) goto Lb3
            r2.a()
        Lb3:
            pr r6 = (defpackage.pr) r6
            e40 r2 = r6.c
            int r3 = r2.c
            if (r3 > 0) goto Ld2
            r1.p = r0
            d4 r0 = r7.a
            r2 = 0
            r0.q(r2)
            r0 = 0
            r1.D = r0
            r1.E = r0
            r1.M = r0
            androidx.lifecycle.b r3 = r1.N
            r3.e(r0)
            r1.n = r2
            return
        Ld2:
            java.lang.Object[] r1 = r2.b
            r0 = r1[r0]
            r0.getClass()
            java.lang.ClassCastException r0 = new java.lang.ClassCastException
            r0.<init>()
            throw r0
        Ldf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Local and anonymous classes can not be ViewModels"
            r0.<init>(r1)
            throw r0
        Le7:
            f50 r0 = new f50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onDestroyView()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void i() {
            r8 = this;
            r0 = 3
            boolean r1 = defpackage.yl.A(r0)
            java.lang.String r2 = "FragmentManager"
            ml r3 = r8.c
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "movefrom ATTACHED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            r1 = -1
            r3.a = r1
            r4 = 0
            r3.C = r4
            r3.p()
            boolean r5 = r3.C
            if (r5 == 0) goto Lbb
            yl r5 = r3.t
            boolean r6 = r5.A
            if (r6 != 0) goto L39
            r5.k()
            yl r5 = new yl
            r5.<init>()
            r3.t = r5
        L39:
            d4 r5 = r8.a
            r5.h(r4)
            r3.a = r1
            r1 = 0
            r3.s = r1
            r3.u = r1
            r3.r = r1
            boolean r5 = r3.l
            if (r5 == 0) goto L4f
            int r5 = r3.q
            if (r5 <= 0) goto L6a
        L4f:
            r5 r5 = r8.b
            java.lang.Object r5 = r5.d
            am r5 = (defpackage.am) r5
            java.util.HashMap r6 = r5.c
            java.lang.String r7 = r3.e
            boolean r6 = r6.containsKey(r7)
            if (r6 != 0) goto L60
            goto L67
        L60:
            boolean r6 = r5.f
            if (r6 == 0) goto L67
            boolean r5 = r5.g
            goto L68
        L67:
            r5 = 1
        L68:
            if (r5 == 0) goto Lba
        L6a:
            boolean r0 = defpackage.yl.A(r0)
            if (r0 == 0) goto L81
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "initState called for fragment: "
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L81:
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r3)
            r3.L = r0
            gm r0 = new gm
            r0.<init>(r3)
            r3.O = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.e = r0
            r3.k = r4
            r3.l = r4
            r3.m = r4
            r3.n = r4
            r3.o = r4
            r3.q = r4
            r3.r = r1
            yl r0 = new yl
            r0.<init>()
            r3.t = r0
            r3.s = r1
            r3.v = r4
            r3.w = r4
            r3.x = r1
            r3.y = r4
            r3.z = r4
        Lba:
            return
        Lbb:
            f50 r0 = new f50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onDetach()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void j() {
            r4 = this;
            ml r0 = r4.c
            boolean r1 = r0.m
            if (r1 == 0) goto L5c
            boolean r1 = r0.n
            if (r1 == 0) goto L5c
            boolean r1 = r0.p
            if (r1 != 0) goto L5c
            r1 = 3
            boolean r1 = defpackage.yl.A(r1)
            if (r1 == 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATE_VIEW: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L28:
            android.os.Bundle r1 = r0.b
            android.view.LayoutInflater r1 = r0.q(r1)
            r2 = 0
            android.os.Bundle r3 = r0.b
            r0.v(r1, r2, r3)
            android.view.View r1 = r0.E
            if (r1 == 0) goto L5c
            r2 = 0
            r1.setSaveFromParentEnabled(r2)
            android.view.View r1 = r0.E
            r3 = 2131296428(0x7f0900ac, float:1.8210772E38)
            r1.setTag(r3, r0)
            boolean r1 = r0.y
            if (r1 == 0) goto L4f
            android.view.View r1 = r0.E
            r3 = 8
            r1.setVisibility(r3)
        L4f:
            yl r1 = r0.t
            r3 = 2
            r1.p(r3)
            d4 r1 = r4.a
            r1.p(r2)
            r0.a = r3
        L5c:
            return
    }

    public final void k() {
            r9 = this;
            boolean r0 = r9.d
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            ml r3 = r9.c
            if (r0 == 0) goto L21
            boolean r0 = defpackage.yl.A(r2)
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Ignoring re-entrant call to moveToExpectedState() for "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
        L20:
            return
        L21:
            r0 = 1
            r4 = 0
            r9.d = r0     // Catch: java.lang.Throwable -> L3a
        L25:
            int r5 = r9.d()     // Catch: java.lang.Throwable -> L3a
            int r6 = r3.a     // Catch: java.lang.Throwable -> L3a
            r7 = 3
            if (r5 == r6) goto L115
            if (r5 <= r6) goto L94
            int r6 = r6 + 1
            switch(r6) {
                case 0: goto L90;
                case 1: goto L8c;
                case 2: goto L85;
                case 3: goto L81;
                case 4: goto L45;
                case 5: goto L41;
                case 6: goto L3d;
                case 7: goto L36;
                default: goto L35;
            }     // Catch: java.lang.Throwable -> L3a
        L35:
            goto L25
        L36:
            r9.n()     // Catch: java.lang.Throwable -> L3a
            goto L25
        L3a:
            r0 = move-exception
            goto L17b
        L3d:
            r5 = 6
            r3.a = r5     // Catch: java.lang.Throwable -> L3a
            goto L25
        L41:
            r9.p()     // Catch: java.lang.Throwable -> L3a
            goto L25
        L45:
            android.view.View r5 = r3.E     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L7d
            android.view.ViewGroup r5 = r3.D     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L7d
            yl r6 = r3.j()     // Catch: java.lang.Throwable -> L3a
            vh r6 = r6.y()     // Catch: java.lang.Throwable -> L3a
            cg r5 = defpackage.cg.f(r5, r6)     // Catch: java.lang.Throwable -> L3a
            android.view.View r6 = r3.E     // Catch: java.lang.Throwable -> L3a
            int r6 = r6.getVisibility()     // Catch: java.lang.Throwable -> L3a
            int r6 = defpackage.z30.b(r6)     // Catch: java.lang.Throwable -> L3a
            boolean r7 = defpackage.yl.A(r2)     // Catch: java.lang.Throwable -> L3a
            if (r7 == 0) goto L7a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            java.lang.String r8 = "SpecialEffectsController: Enqueuing add operation for fragment "
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            r7.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L3a
            android.util.Log.v(r1, r7)     // Catch: java.lang.Throwable -> L3a
        L7a:
            r5.a(r6, r2, r9)     // Catch: java.lang.Throwable -> L3a
        L7d:
            r5 = 4
            r3.a = r5     // Catch: java.lang.Throwable -> L3a
            goto L25
        L81:
            r9.a()     // Catch: java.lang.Throwable -> L3a
            goto L25
        L85:
            r9.j()     // Catch: java.lang.Throwable -> L3a
            r9.f()     // Catch: java.lang.Throwable -> L3a
            goto L25
        L8c:
            r9.e()     // Catch: java.lang.Throwable -> L3a
            goto L25
        L90:
            r9.c()     // Catch: java.lang.Throwable -> L3a
            goto L25
        L94:
            int r6 = r6 + (-1)
            switch(r6) {
                case -1: goto L110;
                case 0: goto L10b;
                case 1: goto L104;
                case 2: goto Lfe;
                case 3: goto La7;
                case 4: goto La2;
                case 5: goto L9e;
                case 6: goto L9a;
                default: goto L99;
            }     // Catch: java.lang.Throwable -> L3a
        L99:
            goto L25
        L9a:
            r9.l()     // Catch: java.lang.Throwable -> L3a
            goto L25
        L9e:
            r5 = 5
            r3.a = r5     // Catch: java.lang.Throwable -> L3a
            goto L25
        La2:
            r9.q()     // Catch: java.lang.Throwable -> L3a
            goto L25
        La7:
            boolean r5 = defpackage.yl.A(r7)     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto Lc1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            r5.<init>()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r6 = "movefrom ACTIVITY_CREATED: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L3a
            r5.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3a
            android.util.Log.d(r1, r5)     // Catch: java.lang.Throwable -> L3a
        Lc1:
            android.view.View r5 = r3.E     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto Lcc
            android.util.SparseArray r5 = r3.c     // Catch: java.lang.Throwable -> L3a
            if (r5 != 0) goto Lcc
            r9.o()     // Catch: java.lang.Throwable -> L3a
        Lcc:
            android.view.View r5 = r3.E     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto Lfa
            android.view.ViewGroup r5 = r3.D     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto Lfa
            yl r6 = r3.j()     // Catch: java.lang.Throwable -> L3a
            vh r6 = r6.y()     // Catch: java.lang.Throwable -> L3a
            cg r5 = defpackage.cg.f(r5, r6)     // Catch: java.lang.Throwable -> L3a
            boolean r6 = defpackage.yl.A(r2)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto Lf7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            java.lang.String r8 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L3a
            r6.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3a
            android.util.Log.v(r1, r6)     // Catch: java.lang.Throwable -> L3a
        Lf7:
            r5.a(r0, r7, r9)     // Catch: java.lang.Throwable -> L3a
        Lfa:
            r3.a = r7     // Catch: java.lang.Throwable -> L3a
            goto L25
        Lfe:
            r3.n = r4     // Catch: java.lang.Throwable -> L3a
            r3.a = r2     // Catch: java.lang.Throwable -> L3a
            goto L25
        L104:
            r9.h()     // Catch: java.lang.Throwable -> L3a
            r3.a = r0     // Catch: java.lang.Throwable -> L3a
            goto L25
        L10b:
            r9.g()     // Catch: java.lang.Throwable -> L3a
            goto L25
        L110:
            r9.i()     // Catch: java.lang.Throwable -> L3a
            goto L25
        L115:
            boolean r5 = r3.I     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L178
            android.view.View r5 = r3.E     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L166
            android.view.ViewGroup r5 = r3.D     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L166
            yl r6 = r3.j()     // Catch: java.lang.Throwable -> L3a
            vh r6 = r6.y()     // Catch: java.lang.Throwable -> L3a
            cg r5 = defpackage.cg.f(r5, r6)     // Catch: java.lang.Throwable -> L3a
            boolean r6 = r3.y     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L14c
            boolean r2 = defpackage.yl.A(r2)     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L148
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            java.lang.String r6 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            r2.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3a
            android.util.Log.v(r1, r2)     // Catch: java.lang.Throwable -> L3a
        L148:
            r5.a(r7, r0, r9)     // Catch: java.lang.Throwable -> L3a
            goto L166
        L14c:
            boolean r6 = defpackage.yl.A(r2)     // Catch: java.lang.Throwable -> L3a
            if (r6 == 0) goto L163
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3a
            java.lang.String r7 = "SpecialEffectsController: Enqueuing show operation for fragment "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L3a
            r6.append(r3)     // Catch: java.lang.Throwable -> L3a
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3a
            android.util.Log.v(r1, r6)     // Catch: java.lang.Throwable -> L3a
        L163:
            r5.a(r2, r0, r9)     // Catch: java.lang.Throwable -> L3a
        L166:
            yl r1 = r3.r     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L176
            boolean r2 = r3.k     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L176
            boolean r2 = defpackage.yl.B(r3)     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L176
            r1.x = r0     // Catch: java.lang.Throwable -> L3a
        L176:
            r3.I = r4     // Catch: java.lang.Throwable -> L3a
        L178:
            r9.d = r4
            return
        L17b:
            r9.d = r4
            throw r0
    }

    public final void l() {
            r3 = this;
            r0 = 3
            boolean r0 = defpackage.yl.A(r0)
            ml r1 = r3.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom RESUMED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            yl r0 = r1.t
            r2 = 5
            r0.p(r2)
            android.view.View r0 = r1.E
            if (r0 == 0) goto L2d
            fm r0 = r1.M
            iq r2 = defpackage.iq.ON_PAUSE
            r0.c(r2)
        L2d:
            androidx.lifecycle.a r0 = r1.L
            iq r2 = defpackage.iq.ON_PAUSE
            r0.d(r2)
            r0 = 6
            r1.a = r0
            r0 = 1
            r1.C = r0
            d4 r0 = r3.a
            r1 = 0
            r0.i(r1)
            return
    }

    public final void m(java.lang.ClassLoader r4) {
            r3 = this;
            ml r0 = r3.c
            android.os.Bundle r1 = r0.b
            if (r1 != 0) goto L7
            goto L44
        L7:
            r1.setClassLoader(r4)
            android.os.Bundle r4 = r0.b
            java.lang.String r1 = "android:view_state"
            android.util.SparseArray r4 = r4.getSparseParcelableArray(r1)
            r0.c = r4
            android.os.Bundle r4 = r0.b
            java.lang.String r1 = "android:view_registry_state"
            android.os.Bundle r4 = r4.getBundle(r1)
            r0.d = r4
            android.os.Bundle r4 = r0.b
            java.lang.String r1 = "android:target_state"
            java.lang.String r4 = r4.getString(r1)
            r0.h = r4
            if (r4 == 0) goto L35
            android.os.Bundle r4 = r0.b
            java.lang.String r1 = "android:target_req_state"
            r2 = 0
            int r4 = r4.getInt(r1, r2)
            r0.i = r4
        L35:
            android.os.Bundle r4 = r0.b
            java.lang.String r1 = "android:user_visible_hint"
            r2 = 1
            boolean r4 = r4.getBoolean(r1, r2)
            r0.G = r4
            if (r4 != 0) goto L44
            r0.F = r2
        L44:
            return
    }

    public final void n() {
            r7 = this;
            r0 = 3
            boolean r0 = defpackage.yl.A(r0)
            java.lang.String r1 = "FragmentManager"
            ml r2 = r7.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            ll r0 = r2.H
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.E
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.E
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = defpackage.yl.A(r5)
            if (r5 == 0) goto L7d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "requestFocus: Restoring focused view "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r0 = " "
            r5.append(r0)
            if (r4 == 0) goto L55
            java.lang.String r0 = "succeeded"
            goto L57
        L55:
            java.lang.String r0 = "failed"
        L57:
            r5.append(r0)
            java.lang.String r0 = " on Fragment "
            r5.append(r0)
            r5.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r5.append(r0)
            android.view.View r0 = r2.E
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            ll r0 = r2.f()
            r0.k = r3
            yl r0 = r2.t
            r0.F()
            yl r0 = r2.t
            r1 = 1
            r0.t(r1)
            r0 = 7
            r2.a = r0
            r2.C = r1
            androidx.lifecycle.a r1 = r2.L
            iq r4 = defpackage.iq.ON_RESUME
            r1.d(r4)
            android.view.View r1 = r2.E
            if (r1 == 0) goto La5
            fm r1 = r2.M
            androidx.lifecycle.a r1 = r1.b
            r1.d(r4)
        La5:
            yl r1 = r2.t
            r4 = 0
            r1.y = r4
            r1.z = r4
            am r5 = r1.F
            r5.h = r4
            r1.p(r0)
            d4 r0 = r7.a
            r0.l(r4)
            r2.b = r3
            r2.c = r3
            r2.d = r3
            return
    }

    public final void o() {
            r3 = this;
            ml r0 = r3.c
            android.view.View r1 = r0.E
            if (r1 != 0) goto L7
            goto L2d
        L7:
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.view.View r2 = r0.E
            r2.saveHierarchyState(r1)
            int r2 = r1.size()
            if (r2 <= 0) goto L19
            r0.c = r1
        L19:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            fm r2 = r0.M
            gm r2 = r2.c
            r2.c(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L2d
            r0.d = r1
        L2d:
            return
    }

    public final void p() {
            r5 = this;
            r0 = 3
            boolean r0 = defpackage.yl.A(r0)
            ml r1 = r5.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto STARTED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            yl r0 = r1.t
            r0.F()
            yl r0 = r1.t
            r2 = 1
            r0.t(r2)
            r0 = 5
            r1.a = r0
            r2 = 0
            r1.C = r2
            r1.s()
            boolean r3 = r1.C
            if (r3 == 0) goto L59
            androidx.lifecycle.a r3 = r1.L
            iq r4 = defpackage.iq.ON_START
            r3.d(r4)
            android.view.View r3 = r1.E
            if (r3 == 0) goto L46
            fm r3 = r1.M
            androidx.lifecycle.a r3 = r3.b
            r3.d(r4)
        L46:
            yl r1 = r1.t
            r1.y = r2
            r1.z = r2
            am r3 = r1.F
            r3.h = r2
            r1.p(r0)
            d4 r0 = r5.a
            r0.n(r2)
            return
        L59:
            f50 r0 = new f50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onStart()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void q() {
            r4 = this;
            r0 = 3
            boolean r0 = defpackage.yl.A(r0)
            ml r1 = r4.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom STARTED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            yl r0 = r1.t
            r2 = 1
            r0.z = r2
            am r3 = r0.F
            r3.h = r2
            r2 = 4
            r0.p(r2)
            android.view.View r0 = r1.E
            if (r0 == 0) goto L34
            fm r0 = r1.M
            iq r3 = defpackage.iq.ON_STOP
            r0.c(r3)
        L34:
            androidx.lifecycle.a r0 = r1.L
            iq r3 = defpackage.iq.ON_STOP
            r0.d(r3)
            r1.a = r2
            r0 = 0
            r1.C = r0
            r1.t()
            boolean r2 = r1.C
            if (r2 == 0) goto L4d
            d4 r1 = r4.a
            r1.o(r0)
            return
        L4d:
            f50 r0 = new f50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onStop()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }
}
