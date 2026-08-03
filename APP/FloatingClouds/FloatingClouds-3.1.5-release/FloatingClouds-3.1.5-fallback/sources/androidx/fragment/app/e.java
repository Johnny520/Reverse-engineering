package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.C0064b7 f913a;
    public final a.A2 b;
    public final androidx.fragment.app.b c;
    public boolean d;
    public int e;

    public class a implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ android.view.View f914a;

        public a(android.view.View r1) {
                r0 = this;
                r0.<init>()
                r0.f914a = r1
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(android.view.View r2) {
                r1 = this;
                android.view.View r2 = r1.f914a
                r2.removeOnAttachStateChangeListener(r1)
                java.util.WeakHashMap<android.view.View, a.Jg> r0 = a.C0414ug.f721a
                a.C0414ug.c.c(r2)
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }
    }

    public e(a.C0064b7 r2, a.A2 r3, androidx.fragment.app.b r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r0 = -1
            r1.e = r0
            r1.f913a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    public e(a.C0064b7 r3, a.A2 r4, androidx.fragment.app.b r5, android.os.Bundle r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.d = r0
            r1 = -1
            r2.e = r1
            r2.f913a = r3
            r2.b = r4
            r2.c = r5
            r3 = 0
            r5.c = r3
            r5.d = r3
            r5.s = r0
            r5.o = r0
            r5.k = r0
            androidx.fragment.app.b r4 = r5.g
            if (r4 == 0) goto L21
            java.lang.String r4 = r4.e
            goto L22
        L21:
            r4 = r3
        L22:
            r5.h = r4
            r5.g = r3
            r5.b = r6
            java.lang.String r3 = "arguments"
            android.os.Bundle r3 = r6.getBundle(r3)
            r5.f = r3
            return
    }

    public e(a.C0064b7 r2, a.A2 r3, java.lang.ClassLoader r4, androidx.fragment.app.d r5, android.os.Bundle r6) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            r0 = -1
            r1.e = r0
            r1.f913a = r2
            r1.b = r3
            java.lang.String r2 = "state"
            android.os.Parcelable r2 = r6.getParcelable(r2)
            a.n7 r2 = (a.C0280n7) r2
            java.lang.String r3 = r2.f598a
            androidx.fragment.app.b r3 = r5.a(r3)
            java.lang.String r5 = r2.b
            r3.e = r5
            boolean r5 = r2.c
            r3.n = r5
            boolean r5 = r2.d
            r3.p = r5
            r5 = 1
            r3.q = r5
            int r5 = r2.e
            r3.x = r5
            int r5 = r2.f
            r3.y = r5
            java.lang.String r5 = r2.g
            r3.z = r5
            boolean r5 = r2.h
            r3.C = r5
            boolean r5 = r2.i
            r3.l = r5
            boolean r5 = r2.j
            r3.B = r5
            boolean r5 = r2.k
            r3.A = r5
            androidx.lifecycle.e$b[] r5 = androidx.lifecycle.e.b.values()
            int r0 = r2.l
            r5 = r5[r0]
            r3.N = r5
            java.lang.String r5 = r2.m
            r3.h = r5
            int r5 = r2.n
            r3.i = r5
            boolean r2 = r2.o
            r3.I = r2
            r1.c = r3
            r3.b = r6
            java.lang.String r2 = "arguments"
            android.os.Bundle r2 = r6.getBundle(r2)
            if (r2 == 0) goto L6b
            r2.setClassLoader(r4)
        L6b:
            r3.E(r2)
            r2 = 2
            boolean r2 = a.AbstractC0119e7.J(r2)
            if (r2 == 0) goto L88
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Instantiated fragment "
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentManager"
            android.util.Log.v(r3, r2)
        L88:
            return
    }

    public final void a() {
            r7 = this;
            r0 = 3
            boolean r1 = a.AbstractC0119e7.J(r0)
            java.lang.String r2 = "FragmentManager"
            androidx.fragment.app.b r3 = r7.c
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "moveto ACTIVITY_CREATED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            android.os.Bundle r1 = r3.b
            java.lang.String r4 = "savedInstanceState"
            if (r1 == 0) goto L25
            r1.getBundle(r4)
        L25:
            a.i7 r1 = r3.v
            r1.P()
            r3.f905a = r0
            r1 = 0
            r3.E = r1
            r3.l()
            boolean r5 = r3.E
            java.lang.String r6 = "Fragment "
            if (r5 == 0) goto Lab
            boolean r0 = a.AbstractC0119e7.J(r0)
            if (r0 == 0) goto L4f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "moveto RESTORE_VIEW_STATE: "
            r0.<init>(r5)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L4f:
            android.view.View r0 = r3.G
            r2 = 0
            if (r0 == 0) goto L95
            android.os.Bundle r0 = r3.b
            if (r0 == 0) goto L5d
            android.os.Bundle r0 = r0.getBundle(r4)
            goto L5e
        L5d:
            r0 = r2
        L5e:
            android.util.SparseArray<android.os.Parcelable> r4 = r3.c
            if (r4 == 0) goto L69
            android.view.View r5 = r3.G
            r5.restoreHierarchyState(r4)
            r3.c = r2
        L69:
            r3.E = r1
            r3.x(r0)
            boolean r0 = r3.E
            if (r0 == 0) goto L7e
            android.view.View r0 = r3.G
            if (r0 == 0) goto L95
            a.q7 r0 = r3.P
            androidx.lifecycle.e$a r4 = androidx.lifecycle.e.a.ON_CREATE
            r0.a(r4)
            goto L95
        L7e:
            a.Fe r0 = new a.Fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onViewStateRestored()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L95:
            r3.b = r2
            a.i7 r0 = r3.v
            r0.G = r1
            r0.H = r1
            a.k7 r2 = r0.N
            r2.i = r1
            r2 = 4
            r0.u(r2)
            a.b7 r0 = r7.f913a
            r0.a(r3, r1)
            return
        Lab:
            a.Fe r0 = new a.Fe
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r3)
            java.lang.String r2 = " did not call through to super.onActivityCreated()"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void b() {
            r8 = this;
            r0 = -1
            androidx.fragment.app.b r1 = r8.c
            android.view.ViewGroup r2 = r1.F
        L5:
            r3 = 0
            if (r2 == 0) goto L27
            int r4 = androidx.fragment.R.id.fragment_container_view_tag
            java.lang.Object r4 = r2.getTag(r4)
            boolean r5 = r4 instanceof androidx.fragment.app.b
            if (r5 == 0) goto L15
            androidx.fragment.app.b r4 = (androidx.fragment.app.b) r4
            goto L16
        L15:
            r4 = r3
        L16:
            if (r4 == 0) goto L1a
            r3 = r4
            goto L27
        L1a:
            android.view.ViewParent r2 = r2.getParent()
            boolean r4 = r2 instanceof android.view.View
            if (r4 == 0) goto L25
            android.view.View r2 = (android.view.View) r2
            goto L5
        L25:
            r2 = r3
            goto L5
        L27:
            androidx.fragment.app.b r2 = r1.w
            if (r3 == 0) goto L67
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L67
            int r2 = r1.y
            a.o7$b r4 = a.C0298o7.f620a
            a.m7 r4 = new a.m7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Attempting to nest fragment "
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r6 = " within the view of parent fragment "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = " via container with ID "
            r5.append(r3)
            r5.append(r2)
            java.lang.String r2 = " without using parent's childFragmentManager"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r1, r2)
            a.C0298o7.b(r4)
            a.o7$b r2 = a.C0298o7.a(r1)
            r2.getClass()
        L67:
            a.A2 r2 = r8.b
            r2.getClass()
            android.view.ViewGroup r3 = r1.F
            if (r3 != 0) goto L71
            goto Lae
        L71:
            java.lang.Object r2 = r2.f7a
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r4 = r2.indexOf(r1)
            int r5 = r4 + (-1)
        L7b:
            if (r5 < 0) goto L94
            java.lang.Object r6 = r2.get(r5)
            androidx.fragment.app.b r6 = (androidx.fragment.app.b) r6
            android.view.ViewGroup r7 = r6.F
            if (r7 != r3) goto L92
            android.view.View r6 = r6.G
            if (r6 == 0) goto L92
            int r0 = r3.indexOfChild(r6)
            int r0 = r0 + 1
            goto Lae
        L92:
            int r5 = r5 + r0
            goto L7b
        L94:
            int r4 = r4 + 1
            int r5 = r2.size()
            if (r4 >= r5) goto Lae
            java.lang.Object r5 = r2.get(r4)
            androidx.fragment.app.b r5 = (androidx.fragment.app.b) r5
            android.view.ViewGroup r6 = r5.F
            if (r6 != r3) goto L94
            android.view.View r5 = r5.G
            if (r5 == 0) goto L94
            int r0 = r3.indexOfChild(r5)
        Lae:
            android.view.ViewGroup r2 = r1.F
            android.view.View r1 = r1.G
            r2.addView(r1, r0)
            return
    }

    public final void c() {
            r7 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            androidx.fragment.app.b r1 = r7.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto ATTACHED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            androidx.fragment.app.b r0 = r1.g
            r2 = 0
            java.lang.String r3 = " that does not belong to this FragmentManager!"
            java.lang.String r4 = " declared target fragment "
            a.A2 r5 = r7.b
            java.lang.String r6 = "Fragment "
            if (r0 == 0) goto L5e
            java.lang.String r0 = r0.e
            java.lang.Object r5 = r5.b
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.lang.Object r0 = r5.get(r0)
            androidx.fragment.app.e r0 = (androidx.fragment.app.e) r0
            if (r0 == 0) goto L41
            androidx.fragment.app.b r3 = r1.g
            java.lang.String r3 = r3.e
            r1.h = r3
            r1.g = r2
            r2 = r0
            goto L87
        L41:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r4)
            androidx.fragment.app.b r1 = r1.g
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L5e:
            java.lang.String r0 = r1.h
            if (r0 == 0) goto L87
            java.lang.Object r2 = r5.b
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Object r0 = r2.get(r0)
            r2 = r0
            androidx.fragment.app.e r2 = (androidx.fragment.app.e) r2
            if (r2 == 0) goto L70
            goto L87
        L70:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = r1.h
            java.lang.String r1 = a.C0487z.h(r2, r1, r3)
            r0.<init>(r1)
            throw r0
        L87:
            if (r2 == 0) goto L8c
            r2.k()
        L8c:
            a.e7 r0 = r1.t
            a.X6$a r2 = r0.v
            r1.u = r2
            androidx.fragment.app.b r0 = r0.x
            r1.w = r0
            a.b7 r0 = r7.f913a
            r2 = 0
            r0.g(r1, r2)
            java.util.ArrayList<androidx.fragment.app.b$f> r3 = r1.S
            java.util.Iterator r4 = r3.iterator()
        La2:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb2
            java.lang.Object r5 = r4.next()
            androidx.fragment.app.b$f r5 = (androidx.fragment.app.b.f) r5
            r5.a()
            goto La2
        Lb2:
            r3.clear()
            a.i7 r3 = r1.v
            a.X6$a r4 = r1.u
            a.a2 r5 = r1.a()
            r3.b(r4, r5, r1)
            r1.f905a = r2
            r1.E = r2
            a.X6$a r3 = r1.u
            a.X6 r3 = r3.b
            r1.n(r3)
            boolean r3 = r1.E
            if (r3 == 0) goto Lf8
            a.e7 r3 = r1.t
            java.util.concurrent.CopyOnWriteArrayList<a.l7> r3 = r3.o
            java.util.Iterator r3 = r3.iterator()
        Ld7:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Le7
            java.lang.Object r4 = r3.next()
            a.l7 r4 = (a.InterfaceC0244l7) r4
            r4.a(r1)
            goto Ld7
        Le7:
            a.i7 r3 = r1.v
            r3.G = r2
            r3.H = r2
            a.k7 r4 = r3.N
            r4.i = r2
            r3.u(r2)
            r0.b(r1, r2)
            return
        Lf8:
            a.Fe r0 = new a.Fe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onAttach()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
    }

    public final int d() {
            r12 = this;
            androidx.fragment.app.b r0 = r12.c
            a.e7 r1 = r0.t
            if (r1 != 0) goto L9
            int r0 = r0.f905a
            return r0
        L9:
            int r1 = r12.e
            androidx.lifecycle.e$b r2 = r0.N
            int r2 = r2.ordinal()
            r3 = 5
            r4 = -1
            r5 = 3
            r6 = 4
            r7 = 2
            r8 = 1
            if (r2 == r8) goto L2e
            if (r2 == r7) goto L29
            if (r2 == r5) goto L24
            if (r2 == r6) goto L33
            int r1 = java.lang.Math.min(r1, r4)
            goto L33
        L24:
            int r1 = java.lang.Math.min(r1, r3)
            goto L33
        L29:
            int r1 = java.lang.Math.min(r1, r8)
            goto L33
        L2e:
            r2 = 0
            int r1 = java.lang.Math.min(r1, r2)
        L33:
            boolean r2 = r0.n
            if (r2 == 0) goto L5f
            boolean r2 = r0.o
            if (r2 == 0) goto L50
            int r1 = r12.e
            int r1 = java.lang.Math.max(r1, r7)
            android.view.View r2 = r0.G
            if (r2 == 0) goto L5f
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L5f
            int r1 = java.lang.Math.min(r1, r7)
            goto L5f
        L50:
            int r2 = r12.e
            if (r2 >= r6) goto L5b
            int r2 = r0.f905a
            int r1 = java.lang.Math.min(r1, r2)
            goto L5f
        L5b:
            int r1 = java.lang.Math.min(r1, r8)
        L5f:
            boolean r2 = r0.p
            if (r2 == 0) goto L6b
            android.view.ViewGroup r2 = r0.F
            if (r2 != 0) goto L6b
            int r1 = java.lang.Math.min(r1, r6)
        L6b:
            boolean r2 = r0.k
            if (r2 != 0) goto L73
            int r1 = java.lang.Math.min(r1, r8)
        L73:
            android.view.ViewGroup r2 = r0.F
            r9 = 0
            if (r2 == 0) goto La6
            a.e7 r10 = r0.f()
            androidx.fragment.app.f r2 = androidx.fragment.app.f.i(r2, r10)
            r2.getClass()
            androidx.fragment.app.f$c r10 = r2.f(r0)
            if (r10 == 0) goto L8c
            androidx.fragment.app.f$c$a r10 = r10.b
            goto L8d
        L8c:
            r10 = r9
        L8d:
            androidx.fragment.app.f$c r2 = r2.g(r0)
            if (r2 == 0) goto L95
            androidx.fragment.app.f$c$a r9 = r2.b
        L95:
            if (r10 != 0) goto L99
            r2 = r4
            goto La1
        L99:
            int[] r2 = androidx.fragment.app.f.d.$EnumSwitchMapping$0
            int r11 = r10.ordinal()
            r2 = r2[r11]
        La1:
            if (r2 == r4) goto La6
            if (r2 == r8) goto La6
            r9 = r10
        La6:
            androidx.fragment.app.f$c$a r2 = androidx.fragment.app.f.c.a.b
            if (r9 != r2) goto Lb0
            r2 = 6
            int r1 = java.lang.Math.min(r1, r2)
            goto Lcc
        Lb0:
            androidx.fragment.app.f$c$a r2 = androidx.fragment.app.f.c.a.c
            if (r9 != r2) goto Lb9
            int r1 = java.lang.Math.max(r1, r5)
            goto Lcc
        Lb9:
            boolean r2 = r0.l
            if (r2 == 0) goto Lcc
            boolean r2 = r0.k()
            if (r2 == 0) goto Lc8
            int r1 = java.lang.Math.min(r1, r8)
            goto Lcc
        Lc8:
            int r1 = java.lang.Math.min(r1, r4)
        Lcc:
            boolean r2 = r0.H
            if (r2 == 0) goto Ld8
            int r2 = r0.f905a
            if (r2 >= r3) goto Ld8
            int r1 = java.lang.Math.min(r1, r6)
        Ld8:
            boolean r2 = r0.m
            if (r2 == 0) goto Le0
            int r1 = java.lang.Math.max(r1, r5)
        Le0:
            boolean r2 = a.AbstractC0119e7.J(r7)
            if (r2 == 0) goto L101
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
        L101:
            return r1
    }

    public final void e() {
            r7 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            androidx.fragment.app.b r1 = r7.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            android.os.Bundle r0 = r1.b
            if (r0 == 0) goto L27
            java.lang.String r2 = "savedInstanceState"
            android.os.Bundle r0 = r0.getBundle(r2)
            goto L28
        L27:
            r0 = 0
        L28:
            boolean r2 = r1.L
            r3 = 1
            if (r2 != 0) goto L73
            a.b7 r2 = r7.f913a
            r4 = 0
            r2.h(r1, r4)
            a.i7 r5 = r1.v
            r5.P()
            r1.f905a = r3
            r1.E = r4
            androidx.lifecycle.h r5 = r1.O
            androidx.fragment.app.Fragment$6 r6 = new androidx.fragment.app.Fragment$6
            r6.<init>(r1)
            r5.a(r6)
            r1.o(r0)
            r1.L = r3
            boolean r0 = r1.E
            if (r0 == 0) goto L5a
            androidx.lifecycle.h r0 = r1.O
            androidx.lifecycle.e$a r3 = androidx.lifecycle.e.a.ON_CREATE
            r0.f(r3)
            r2.c(r1, r4)
            return
        L5a:
            a.Fe r0 = new a.Fe
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Fragment "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = " did not call through to super.onCreate()"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L73:
            r1.f905a = r3
            r1.C()
            return
    }

    public final void f() {
            r10 = this;
            androidx.fragment.app.b r0 = r10.c
            boolean r1 = r0.n
            if (r1 == 0) goto L7
            return
        L7:
            r1 = 3
            boolean r2 = a.AbstractC0119e7.J(r1)
            java.lang.String r3 = "FragmentManager"
            if (r2 == 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "moveto CREATE_VIEW: "
            r2.<init>(r4)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            android.util.Log.d(r3, r2)
        L21:
            android.os.Bundle r2 = r0.b
            java.lang.String r4 = "savedInstanceState"
            r5 = 0
            if (r2 == 0) goto L2d
            android.os.Bundle r2 = r2.getBundle(r4)
            goto L2e
        L2d:
            r2 = r5
        L2e:
            android.view.LayoutInflater r6 = r0.s(r2)
            android.view.ViewGroup r7 = r0.F
            if (r7 == 0) goto L39
            r5 = r7
            goto Ldb
        L39:
            int r7 = r0.y
            if (r7 == 0) goto Ldb
            r5 = -1
            if (r7 == r5) goto Lc2
            a.e7 r5 = r0.t
            a.a2 r5 = r5.w
            android.view.View r5 = r5.c(r7)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r5 != 0) goto L91
            boolean r7 = r0.q
            if (r7 != 0) goto Ldb
            boolean r7 = r0.p
            if (r7 == 0) goto L56
            goto Ldb
        L56:
            android.content.Context r1 = r0.A()     // Catch: android.content.res.Resources.NotFoundException -> L65
            android.content.res.Resources r1 = r1.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L65
            int r2 = r0.y     // Catch: android.content.res.Resources.NotFoundException -> L65
            java.lang.String r1 = r1.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L65
            goto L67
        L65:
            java.lang.String r1 = "unknown"
        L67:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "No view found for id 0x"
            r3.<init>(r4)
            int r4 = r0.y
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
        L91:
            boolean r7 = r5 instanceof androidx.fragment.app.FragmentContainerView
            if (r7 != 0) goto Ldb
            a.o7$b r7 = a.C0298o7.f620a
            a.m7 r7 = new a.m7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "Attempting to add fragment "
            r8.<init>(r9)
            r8.append(r0)
            java.lang.String r9 = " to container "
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = " which is not a FragmentContainerView"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r0, r8)
            a.C0298o7.b(r7)
            a.o7$b r7 = a.C0298o7.a(r0)
            r7.getClass()
            goto Ldb
        Lc2:
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
        Ldb:
            r0.F = r5
            r0.y(r6, r5, r2)
            android.view.View r2 = r0.G
            r6 = 2
            if (r2 == 0) goto L196
            boolean r1 = a.AbstractC0119e7.J(r1)
            if (r1 == 0) goto Lfc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto VIEW_CREATED: "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r3, r1)
        Lfc:
            android.view.View r1 = r0.G
            r2 = 0
            r1.setSaveFromParentEnabled(r2)
            android.view.View r1 = r0.G
            int r7 = androidx.fragment.R.id.fragment_container_view_tag
            r1.setTag(r7, r0)
            if (r5 == 0) goto L10e
            r10.b()
        L10e:
            boolean r1 = r0.A
            if (r1 == 0) goto L119
            android.view.View r1 = r0.G
            r5 = 8
            r1.setVisibility(r5)
        L119:
            android.view.View r1 = r0.G
            boolean r1 = r1.isAttachedToWindow()
            if (r1 == 0) goto L129
            android.view.View r1 = r0.G
            java.util.WeakHashMap<android.view.View, a.Jg> r5 = a.C0414ug.f721a
            a.C0414ug.c.c(r1)
            goto L133
        L129:
            android.view.View r1 = r0.G
            androidx.fragment.app.e$a r5 = new androidx.fragment.app.e$a
            r5.<init>(r1)
            r1.addOnAttachStateChangeListener(r5)
        L133:
            android.os.Bundle r1 = r0.b
            if (r1 == 0) goto L13a
            r1.getBundle(r4)
        L13a:
            android.view.View r1 = r0.G
            r0.w(r1)
            a.i7 r1 = r0.v
            r1.u(r6)
            a.b7 r1 = r10.f913a
            android.view.View r4 = r0.G
            r1.m(r0, r4, r2)
            android.view.View r1 = r0.G
            int r1 = r1.getVisibility()
            android.view.View r2 = r0.G
            float r2 = r2.getAlpha()
            androidx.fragment.app.b$d r4 = r0.b()
            r4.j = r2
            android.view.ViewGroup r2 = r0.F
            if (r2 == 0) goto L196
            if (r1 != 0) goto L196
            android.view.View r1 = r0.G
            android.view.View r1 = r1.findFocus()
            if (r1 == 0) goto L190
            androidx.fragment.app.b$d r2 = r0.b()
            r2.k = r1
            boolean r2 = a.AbstractC0119e7.J(r6)
            if (r2 == 0) goto L190
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "requestFocus: Saved focused view "
            r2.<init>(r4)
            r2.append(r1)
            java.lang.String r1 = " for Fragment "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            android.util.Log.v(r3, r1)
        L190:
            android.view.View r1 = r0.G
            r2 = 0
            r1.setAlpha(r2)
        L196:
            r0.f905a = r6
            return
    }

    public final void g() {
            r9 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            androidx.fragment.app.b r1 = r9.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            boolean r0 = r1.l
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L2a
            boolean r0 = r1.k()
            if (r0 != 0) goto L2a
            r0 = r2
            goto L2b
        L2a:
            r0 = r3
        L2b:
            r4 = 0
            a.A2 r5 = r9.b
            if (r0 == 0) goto L35
            java.lang.String r6 = r1.e
            r5.j(r6, r4)
        L35:
            if (r0 != 0) goto L64
            java.lang.Object r6 = r5.d
            a.k7 r6 = (a.C0226k7) r6
            java.util.HashMap<java.lang.String, androidx.fragment.app.b> r7 = r6.d
            java.lang.String r8 = r1.e
            boolean r7 = r7.containsKey(r8)
            if (r7 != 0) goto L46
            goto L4d
        L46:
            boolean r7 = r6.g
            if (r7 == 0) goto L4d
            boolean r6 = r6.h
            goto L4e
        L4d:
            r6 = r2
        L4e:
            if (r6 == 0) goto L51
            goto L64
        L51:
            java.lang.String r0 = r1.h
            if (r0 == 0) goto L61
            androidx.fragment.app.b r0 = r5.c(r0)
            if (r0 == 0) goto L61
            boolean r2 = r0.C
            if (r2 == 0) goto L61
            r1.g = r0
        L61:
            r1.f905a = r3
            return
        L64:
            a.X6$a r6 = r1.u
            if (r6 == 0) goto L6f
            java.lang.Object r6 = r5.d
            a.k7 r6 = (a.C0226k7) r6
            boolean r6 = r6.h
            goto L7a
        L6f:
            a.X6 r6 = r6.b
            if (r6 == 0) goto L79
            boolean r6 = r6.isChangingConfigurations()
            r6 = r6 ^ r2
            goto L7a
        L79:
            r6 = r2
        L7a:
            if (r0 == 0) goto L7d
            goto L7f
        L7d:
            if (r6 == 0) goto L86
        L7f:
            java.lang.Object r0 = r5.d
            a.k7 r0 = (a.C0226k7) r0
            r0.c(r1, r3)
        L86:
            a.i7 r0 = r1.v
            r0.l()
            androidx.lifecycle.h r0 = r1.O
            androidx.lifecycle.e$a r6 = androidx.lifecycle.e.a.ON_DESTROY
            r0.f(r6)
            r1.f905a = r3
            r1.L = r3
            r1.E = r2
            a.b7 r0 = r9.f913a
            r0.d(r1, r3)
            java.util.ArrayList r0 = r5.e()
            java.util.Iterator r0 = r0.iterator()
        La5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lc4
            java.lang.Object r2 = r0.next()
            androidx.fragment.app.e r2 = (androidx.fragment.app.e) r2
            if (r2 == 0) goto La5
            java.lang.String r3 = r1.e
            androidx.fragment.app.b r2 = r2.c
            java.lang.String r6 = r2.h
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto La5
            r2.g = r1
            r2.h = r4
            goto La5
        Lc4:
            java.lang.String r0 = r1.h
            if (r0 == 0) goto Lce
            androidx.fragment.app.b r0 = r5.c(r0)
            r1.g = r0
        Lce:
            r5.i(r9)
            return
    }

    public final void h() {
            r6 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            androidx.fragment.app.b r1 = r6.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom CREATE_VIEW: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            android.view.ViewGroup r0 = r1.F
            if (r0 == 0) goto L27
            android.view.View r2 = r1.G
            if (r2 == 0) goto L27
            r0.removeView(r2)
        L27:
            a.i7 r0 = r1.v
            r2 = 1
            r0.u(r2)
            android.view.View r0 = r1.G
            if (r0 == 0) goto L49
            a.q7 r0 = r1.P
            r0.b()
            androidx.lifecycle.h r0 = r0.d
            androidx.lifecycle.e$b r0 = r0.c
            androidx.lifecycle.e$b r3 = androidx.lifecycle.e.b.c
            int r0 = r0.compareTo(r3)
            if (r0 < 0) goto L49
            a.q7 r0 = r1.P
            androidx.lifecycle.e$a r3 = androidx.lifecycle.e.a.ON_DESTROY
            r0.a(r3)
        L49:
            r1.f905a = r2
            r0 = 0
            r1.E = r0
            r1.q()
            boolean r2 = r1.E
            if (r2 == 0) goto La5
            a.Fg r2 = r1.getViewModelStore()
            androidx.lifecycle.q r3 = new androidx.lifecycle.q
            a.I9$b$a r4 = a.I9.b.e
            r3.<init>(r2, r4)
            java.lang.Class<a.I9$b> r2 = a.I9.b.class
            java.lang.String r4 = r2.getCanonicalName()
            if (r4 == 0) goto L9d
            java.lang.String r5 = "androidx.lifecycle.ViewModelProvider.DefaultKey:"
            java.lang.String r4 = r5.concat(r4)
            a.Dg r2 = r3.a(r2, r4)
            a.I9$b r2 = (a.I9.b) r2
            a.oe<a.I9$a> r2 = r2.d
            int r3 = r2.c
            r4 = r0
        L79:
            if (r4 >= r3) goto L87
            java.lang.Object[] r5 = r2.b
            r5 = r5[r4]
            a.I9$a r5 = (a.I9.a) r5
            r5.getClass()
            int r4 = r4 + 1
            goto L79
        L87:
            r1.r = r0
            a.b7 r2 = r6.f913a
            r2.n(r1, r0)
            r2 = 0
            r1.F = r2
            r1.G = r2
            r1.P = r2
            a.Bb<a.y9> r3 = r1.Q
            r3.g(r2)
            r1.o = r0
            return
        L9d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Local and anonymous classes can not be ViewModels"
            r0.<init>(r1)
            throw r0
        La5:
            a.Fe r0 = new a.Fe
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
            r7 = this;
            r0 = 3
            boolean r1 = a.AbstractC0119e7.J(r0)
            java.lang.String r2 = "FragmentManager"
            androidx.fragment.app.b r3 = r7.c
            if (r1 == 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "movefrom ATTACHED: "
            r1.<init>(r4)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L1c:
            r1 = -1
            r3.f905a = r1
            r4 = 0
            r3.E = r4
            r3.r()
            boolean r5 = r3.E
            if (r5 == 0) goto L88
            a.i7 r5 = r3.v
            boolean r6 = r5.I
            if (r6 != 0) goto L39
            r5.l()
            a.i7 r5 = new a.i7
            r5.<init>()
            r3.v = r5
        L39:
            a.b7 r5 = r7.f913a
            r5.e(r3, r4)
            r3.f905a = r1
            r1 = 0
            r3.u = r1
            r3.w = r1
            r3.t = r1
            boolean r1 = r3.l
            if (r1 == 0) goto L52
            boolean r1 = r3.k()
            if (r1 != 0) goto L52
            goto L6d
        L52:
            a.A2 r1 = r7.b
            java.lang.Object r1 = r1.d
            a.k7 r1 = (a.C0226k7) r1
            java.util.HashMap<java.lang.String, androidx.fragment.app.b> r4 = r1.d
            java.lang.String r5 = r3.e
            boolean r4 = r4.containsKey(r5)
            if (r4 != 0) goto L63
            goto L6a
        L63:
            boolean r4 = r1.g
            if (r4 == 0) goto L6a
            boolean r1 = r1.h
            goto L6b
        L6a:
            r1 = 1
        L6b:
            if (r1 == 0) goto L87
        L6d:
            boolean r0 = a.AbstractC0119e7.J(r0)
            if (r0 == 0) goto L84
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "initState called for fragment: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L84:
            r3.h()
        L87:
            return
        L88:
            a.Fe r0 = new a.Fe
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
            r5 = this;
            androidx.fragment.app.b r0 = r5.c
            boolean r1 = r0.n
            if (r1 == 0) goto L71
            boolean r1 = r0.o
            if (r1 == 0) goto L71
            boolean r1 = r0.r
            if (r1 != 0) goto L71
            r1 = 3
            boolean r1 = a.AbstractC0119e7.J(r1)
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
            java.lang.String r2 = "savedInstanceState"
            r3 = 0
            if (r1 == 0) goto L34
            android.os.Bundle r1 = r1.getBundle(r2)
            goto L35
        L34:
            r1 = r3
        L35:
            android.view.LayoutInflater r4 = r0.s(r1)
            r0.y(r4, r3, r1)
            android.view.View r1 = r0.G
            if (r1 == 0) goto L71
            r3 = 0
            r1.setSaveFromParentEnabled(r3)
            android.view.View r1 = r0.G
            int r4 = androidx.fragment.R.id.fragment_container_view_tag
            r1.setTag(r4, r0)
            boolean r1 = r0.A
            if (r1 == 0) goto L56
            android.view.View r1 = r0.G
            r4 = 8
            r1.setVisibility(r4)
        L56:
            android.os.Bundle r1 = r0.b
            if (r1 == 0) goto L5d
            r1.getBundle(r2)
        L5d:
            android.view.View r1 = r0.G
            r0.w(r1)
            a.i7 r1 = r0.v
            r2 = 2
            r1.u(r2)
            a.b7 r1 = r5.f913a
            android.view.View r4 = r0.G
            r1.m(r0, r4, r3)
            r0.f905a = r2
        L71:
            return
    }

    public final void k() {
            r12 = this;
            a.A2 r0 = r12.b
            boolean r1 = r12.d
            r2 = 2
            java.lang.String r3 = "FragmentManager"
            androidx.fragment.app.b r4 = r12.c
            if (r1 == 0) goto L23
            boolean r0 = a.AbstractC0119e7.J(r2)
            if (r0 == 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ignoring re-entrant call to moveToExpectedState() for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r3, r0)
        L22:
            return
        L23:
            r1 = 1
            r5 = 0
            r12.d = r1     // Catch: java.lang.Throwable -> L43
            r6 = r5
        L28:
            int r7 = r12.d()     // Catch: java.lang.Throwable -> L43
            int r8 = r4.f905a     // Catch: java.lang.Throwable -> L43
            androidx.fragment.app.f$c$b r9 = androidx.fragment.app.f.c.b.b
            androidx.fragment.app.f$c$b r10 = androidx.fragment.app.f.c.b.c
            r11 = 3
            if (r7 == r8) goto L144
            if (r7 <= r8) goto Lc1
            int r8 = r8 + 1
            switch(r8) {
                case 0: goto Lbc;
                case 1: goto Lb7;
                case 2: goto Laf;
                case 3: goto Laa;
                case 4: goto L50;
                case 5: goto L4b;
                case 6: goto L46;
                case 7: goto L3e;
                default: goto L3c;
            }
        L3c:
            goto L141
        L3e:
            r12.n()     // Catch: java.lang.Throwable -> L43
            goto L141
        L43:
            r0 = move-exception
            goto L203
        L46:
            r6 = 6
            r4.f905a = r6     // Catch: java.lang.Throwable -> L43
            goto L141
        L4b:
            r12.p()     // Catch: java.lang.Throwable -> L43
            goto L141
        L50:
            android.view.View r6 = r4.G     // Catch: java.lang.Throwable -> L43
            r7 = 4
            if (r6 == 0) goto La6
            android.view.ViewGroup r6 = r4.F     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto La6
            a.e7 r8 = r4.f()     // Catch: java.lang.Throwable -> L43
            androidx.fragment.app.f r6 = androidx.fragment.app.f.i(r6, r8)     // Catch: java.lang.Throwable -> L43
            android.view.View r8 = r4.G     // Catch: java.lang.Throwable -> L43
            int r8 = r8.getVisibility()     // Catch: java.lang.Throwable -> L43
            if (r8 == 0) goto L87
            if (r8 == r7) goto L85
            r9 = 8
            if (r8 != r9) goto L71
            r9 = r10
            goto L87
        L71:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "Unknown visibility "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L43
            r1.append(r8)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L43
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L43
            throw r0     // Catch: java.lang.Throwable -> L43
        L85:
            androidx.fragment.app.f$c$b r9 = androidx.fragment.app.f.c.b.d     // Catch: java.lang.Throwable -> L43
        L87:
            r6.getClass()     // Catch: java.lang.Throwable -> L43
            boolean r8 = a.AbstractC0119e7.J(r2)     // Catch: java.lang.Throwable -> L43
            if (r8 == 0) goto La1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            java.lang.String r10 = "SpecialEffectsController: Enqueuing add operation for fragment "
            r8.<init>(r10)     // Catch: java.lang.Throwable -> L43
            r8.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L43
            android.util.Log.v(r3, r8)     // Catch: java.lang.Throwable -> L43
        La1:
            androidx.fragment.app.f$c$a r8 = androidx.fragment.app.f.c.a.b     // Catch: java.lang.Throwable -> L43
            r6.d(r9, r8, r12)     // Catch: java.lang.Throwable -> L43
        La6:
            r4.f905a = r7     // Catch: java.lang.Throwable -> L43
            goto L141
        Laa:
            r12.a()     // Catch: java.lang.Throwable -> L43
            goto L141
        Laf:
            r12.j()     // Catch: java.lang.Throwable -> L43
            r12.f()     // Catch: java.lang.Throwable -> L43
            goto L141
        Lb7:
            r12.e()     // Catch: java.lang.Throwable -> L43
            goto L141
        Lbc:
            r12.c()     // Catch: java.lang.Throwable -> L43
            goto L141
        Lc1:
            int r8 = r8 + (-1)
            switch(r8) {
                case -1: goto L13e;
                case 0: goto L13a;
                case 1: goto L134;
                case 2: goto L12f;
                case 3: goto Ld6;
                case 4: goto Ld2;
                case 5: goto Lcd;
                case 6: goto Lc8;
                default: goto Lc6;
            }     // Catch: java.lang.Throwable -> L43
        Lc6:
            goto L141
        Lc8:
            r12.l()     // Catch: java.lang.Throwable -> L43
            goto L141
        Lcd:
            r6 = 5
            r4.f905a = r6     // Catch: java.lang.Throwable -> L43
            goto L141
        Ld2:
            r12.q()     // Catch: java.lang.Throwable -> L43
            goto L141
        Ld6:
            boolean r6 = a.AbstractC0119e7.J(r11)     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto Lf0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r6.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = "movefrom ACTIVITY_CREATED: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L43
            r6.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L43
            android.util.Log.d(r3, r6)     // Catch: java.lang.Throwable -> L43
        Lf0:
            android.view.View r6 = r4.G     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto Lfb
            android.util.SparseArray<android.os.Parcelable> r6 = r4.c     // Catch: java.lang.Throwable -> L43
            if (r6 != 0) goto Lfb
            r12.o()     // Catch: java.lang.Throwable -> L43
        Lfb:
            android.view.View r6 = r4.G     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L12c
            android.view.ViewGroup r6 = r4.F     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L12c
            a.e7 r7 = r4.f()     // Catch: java.lang.Throwable -> L43
            androidx.fragment.app.f r6 = androidx.fragment.app.f.i(r6, r7)     // Catch: java.lang.Throwable -> L43
            r6.getClass()     // Catch: java.lang.Throwable -> L43
            boolean r7 = a.AbstractC0119e7.J(r2)     // Catch: java.lang.Throwable -> L43
            if (r7 == 0) goto L125
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            java.lang.String r8 = "SpecialEffectsController: Enqueuing remove operation for fragment "
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L43
            r7.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L43
            android.util.Log.v(r3, r7)     // Catch: java.lang.Throwable -> L43
        L125:
            androidx.fragment.app.f$c$b r7 = androidx.fragment.app.f.c.b.f919a     // Catch: java.lang.Throwable -> L43
            androidx.fragment.app.f$c$a r8 = androidx.fragment.app.f.c.a.c     // Catch: java.lang.Throwable -> L43
            r6.d(r7, r8, r12)     // Catch: java.lang.Throwable -> L43
        L12c:
            r4.f905a = r11     // Catch: java.lang.Throwable -> L43
            goto L141
        L12f:
            r4.o = r5     // Catch: java.lang.Throwable -> L43
            r4.f905a = r2     // Catch: java.lang.Throwable -> L43
            goto L141
        L134:
            r12.h()     // Catch: java.lang.Throwable -> L43
            r4.f905a = r1     // Catch: java.lang.Throwable -> L43
            goto L141
        L13a:
            r12.g()     // Catch: java.lang.Throwable -> L43
            goto L141
        L13e:
            r12.i()     // Catch: java.lang.Throwable -> L43
        L141:
            r6 = r1
            goto L28
        L144:
            if (r6 != 0) goto L194
            r6 = -1
            if (r8 != r6) goto L194
            boolean r6 = r4.l     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L194
            boolean r6 = r4.k()     // Catch: java.lang.Throwable -> L43
            if (r6 != 0) goto L194
            boolean r6 = a.AbstractC0119e7.J(r11)     // Catch: java.lang.Throwable -> L43
            if (r6 == 0) goto L16d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r6.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r7 = "Cleaning up state of never attached fragment: "
            r6.append(r7)     // Catch: java.lang.Throwable -> L43
            r6.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L43
            android.util.Log.d(r3, r6)     // Catch: java.lang.Throwable -> L43
        L16d:
            java.lang.Object r6 = r0.d     // Catch: java.lang.Throwable -> L43
            a.k7 r6 = (a.C0226k7) r6     // Catch: java.lang.Throwable -> L43
            r6.c(r4, r1)     // Catch: java.lang.Throwable -> L43
            r0.i(r12)     // Catch: java.lang.Throwable -> L43
            boolean r0 = a.AbstractC0119e7.J(r11)     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L191
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "initState called for fragment: "
            r0.append(r6)     // Catch: java.lang.Throwable -> L43
            r0.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43
            android.util.Log.d(r3, r0)     // Catch: java.lang.Throwable -> L43
        L191:
            r4.h()     // Catch: java.lang.Throwable -> L43
        L194:
            boolean r0 = r4.K     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L200
            android.view.View r0 = r4.G     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L1e9
            android.view.ViewGroup r0 = r4.F     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L1e9
            a.e7 r6 = r4.f()     // Catch: java.lang.Throwable -> L43
            androidx.fragment.app.f r0 = androidx.fragment.app.f.i(r0, r6)     // Catch: java.lang.Throwable -> L43
            boolean r6 = r4.A     // Catch: java.lang.Throwable -> L43
            androidx.fragment.app.f$c$a r7 = androidx.fragment.app.f.c.a.f918a
            if (r6 == 0) goto L1cc
            r0.getClass()     // Catch: java.lang.Throwable -> L43
            boolean r2 = a.AbstractC0119e7.J(r2)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L1c8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "SpecialEffectsController: Enqueuing hide operation for fragment "
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L43
            r2.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L43
            android.util.Log.v(r3, r2)     // Catch: java.lang.Throwable -> L43
        L1c8:
            r0.d(r10, r7, r12)     // Catch: java.lang.Throwable -> L43
            goto L1e9
        L1cc:
            r0.getClass()     // Catch: java.lang.Throwable -> L43
            boolean r2 = a.AbstractC0119e7.J(r2)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L1e6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            java.lang.String r6 = "SpecialEffectsController: Enqueuing show operation for fragment "
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L43
            r2.append(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L43
            android.util.Log.v(r3, r2)     // Catch: java.lang.Throwable -> L43
        L1e6:
            r0.d(r9, r7, r12)     // Catch: java.lang.Throwable -> L43
        L1e9:
            a.e7 r0 = r4.t     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L1f9
            boolean r2 = r4.k     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L1f9
            boolean r2 = a.AbstractC0119e7.K(r4)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L1f9
            r0.F = r1     // Catch: java.lang.Throwable -> L43
        L1f9:
            r4.K = r5     // Catch: java.lang.Throwable -> L43
            a.i7 r0 = r4.v     // Catch: java.lang.Throwable -> L43
            r0.o()     // Catch: java.lang.Throwable -> L43
        L200:
            r12.d = r5
            return
        L203:
            r12.d = r5
            throw r0
    }

    public final void l() {
            r3 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            androidx.fragment.app.b r1 = r3.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom RESUMED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            a.i7 r0 = r1.v
            r2 = 5
            r0.u(r2)
            android.view.View r0 = r1.G
            if (r0 == 0) goto L2d
            a.q7 r0 = r1.P
            androidx.lifecycle.e$a r2 = androidx.lifecycle.e.a.ON_PAUSE
            r0.a(r2)
        L2d:
            androidx.lifecycle.h r0 = r1.O
            androidx.lifecycle.e$a r2 = androidx.lifecycle.e.a.ON_PAUSE
            r0.f(r2)
            r0 = 6
            r1.f905a = r0
            r0 = 1
            r1.E = r0
            a.b7 r0 = r3.f913a
            r2 = 0
            r0.f(r1, r2)
            return
    }

    public final void m(java.lang.ClassLoader r5) {
            r4 = this;
            androidx.fragment.app.b r0 = r4.c
            android.os.Bundle r1 = r0.b
            if (r1 != 0) goto L7
            goto L51
        L7:
            r1.setClassLoader(r5)
            android.os.Bundle r5 = r0.b
            java.lang.String r1 = "savedInstanceState"
            android.os.Bundle r5 = r5.getBundle(r1)
            if (r5 != 0) goto L1e
            android.os.Bundle r5 = r0.b
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r5.putBundle(r1, r2)
        L1e:
            android.os.Bundle r5 = r0.b     // Catch: android.os.BadParcelableException -> L52
            java.lang.String r1 = "viewState"
            android.util.SparseArray r5 = r5.getSparseParcelableArray(r1)     // Catch: android.os.BadParcelableException -> L52
            r0.c = r5     // Catch: android.os.BadParcelableException -> L52
            android.os.Bundle r5 = r0.b
            java.lang.String r1 = "viewRegistryState"
            android.os.Bundle r5 = r5.getBundle(r1)
            r0.d = r5
            android.os.Bundle r5 = r0.b
            java.lang.String r1 = "state"
            android.os.Parcelable r5 = r5.getParcelable(r1)
            a.n7 r5 = (a.C0280n7) r5
            if (r5 == 0) goto L4a
            java.lang.String r1 = r5.m
            r0.h = r1
            int r1 = r5.n
            r0.i = r1
            boolean r5 = r5.o
            r0.I = r5
        L4a:
            boolean r5 = r0.I
            if (r5 != 0) goto L51
            r5 = 1
            r0.H = r5
        L51:
            return
        L52:
            r5 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to restore view hierarchy state for fragment "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0, r5)
            throw r1
    }

    public final void n() {
            r7 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.b r2 = r7.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            androidx.fragment.app.b$d r0 = r2.J
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.k
        L25:
            if (r0 == 0) goto L7d
            android.view.View r4 = r2.G
            if (r0 != r4) goto L2c
            goto L36
        L2c:
            android.view.ViewParent r4 = r0.getParent()
        L30:
            if (r4 == 0) goto L7d
            android.view.View r5 = r2.G
            if (r4 != r5) goto L78
        L36:
            boolean r4 = r0.requestFocus()
            r5 = 2
            boolean r5 = a.AbstractC0119e7.J(r5)
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
            android.view.View r0 = r2.G
            android.view.View r0 = r0.findFocus()
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            android.util.Log.v(r1, r0)
            goto L7d
        L78:
            android.view.ViewParent r4 = r4.getParent()
            goto L30
        L7d:
            androidx.fragment.app.b$d r0 = r2.b()
            r0.k = r3
            a.i7 r0 = r2.v
            r0.P()
            a.i7 r0 = r2.v
            r1 = 1
            r0.z(r1)
            r0 = 7
            r2.f905a = r0
            r2.E = r1
            androidx.lifecycle.h r1 = r2.O
            androidx.lifecycle.e$a r4 = androidx.lifecycle.e.a.ON_RESUME
            r1.f(r4)
            android.view.View r1 = r2.G
            if (r1 == 0) goto La5
            a.q7 r1 = r2.P
            androidx.lifecycle.h r1 = r1.d
            r1.f(r4)
        La5:
            a.i7 r1 = r2.v
            r4 = 0
            r1.G = r4
            r1.H = r4
            a.k7 r5 = r1.N
            r5.i = r4
            r1.u(r0)
            a.b7 r0 = r7.f913a
            r0.i(r2, r4)
            a.A2 r0 = r7.b
            java.lang.String r1 = r2.e
            r0.j(r1, r3)
            r2.b = r3
            r2.c = r3
            r2.d = r3
            return
    }

    public final void o() {
            r3 = this;
            androidx.fragment.app.b r0 = r3.c
            android.view.View r1 = r0.G
            if (r1 != 0) goto L7
            goto L51
        L7:
            r1 = 2
            boolean r1 = a.AbstractC0119e7.J(r1)
            if (r1 == 0) goto L2b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Saving view state for fragment "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r2 = " with view "
            r1.append(r2)
            android.view.View r2 = r0.G
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.v(r2, r1)
        L2b:
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            android.view.View r2 = r0.G
            r2.saveHierarchyState(r1)
            int r2 = r1.size()
            if (r2 <= 0) goto L3d
            r0.c = r1
        L3d:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            a.q7 r2 = r0.P
            a.Kd r2 = r2.e
            r2.c(r1)
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L51
            r0.d = r1
        L51:
            return
    }

    public final void p() {
            r5 = this;
            r0 = 3
            boolean r0 = a.AbstractC0119e7.J(r0)
            androidx.fragment.app.b r1 = r5.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "moveto STARTED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            a.i7 r0 = r1.v
            r0.P()
            a.i7 r0 = r1.v
            r2 = 1
            r0.z(r2)
            r0 = 5
            r1.f905a = r0
            r2 = 0
            r1.E = r2
            r1.u()
            boolean r3 = r1.E
            if (r3 == 0) goto L59
            androidx.lifecycle.h r3 = r1.O
            androidx.lifecycle.e$a r4 = androidx.lifecycle.e.a.ON_START
            r3.f(r4)
            android.view.View r3 = r1.G
            if (r3 == 0) goto L46
            a.q7 r3 = r1.P
            androidx.lifecycle.h r3 = r3.d
            r3.f(r4)
        L46:
            a.i7 r3 = r1.v
            r3.G = r2
            r3.H = r2
            a.k7 r4 = r3.N
            r4.i = r2
            r3.u(r0)
            a.b7 r0 = r5.f913a
            r0.k(r1, r2)
            return
        L59:
            a.Fe r0 = new a.Fe
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
            boolean r0 = a.AbstractC0119e7.J(r0)
            androidx.fragment.app.b r1 = r4.c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "movefrom STARTED: "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r0)
        L1c:
            a.i7 r0 = r1.v
            r2 = 1
            r0.H = r2
            a.k7 r3 = r0.N
            r3.i = r2
            r2 = 4
            r0.u(r2)
            android.view.View r0 = r1.G
            if (r0 == 0) goto L34
            a.q7 r0 = r1.P
            androidx.lifecycle.e$a r3 = androidx.lifecycle.e.a.ON_STOP
            r0.a(r3)
        L34:
            androidx.lifecycle.h r0 = r1.O
            androidx.lifecycle.e$a r3 = androidx.lifecycle.e.a.ON_STOP
            r0.f(r3)
            r1.f905a = r2
            r0 = 0
            r1.E = r0
            r1.v()
            boolean r2 = r1.E
            if (r2 == 0) goto L4d
            a.b7 r2 = r4.f913a
            r2.l(r1, r0)
            return
        L4d:
            a.Fe r0 = new a.Fe
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
