package androidx.fragment.app;

/* JADX INFO: loaded from: classes.dex */
public class b implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, a.InterfaceC0479y9, a.Gg, androidx.lifecycle.c, a.Ld {
    public static final java.lang.Object U = null;
    public boolean A;
    public boolean B;
    public boolean C;
    public final boolean D;
    public boolean E;
    public android.view.ViewGroup F;
    public android.view.View G;
    public boolean H;
    public boolean I;
    public androidx.fragment.app.b.d J;
    public boolean K;
    public boolean L;
    public java.lang.String M;
    public androidx.lifecycle.e.b N;
    public androidx.lifecycle.h O;
    public a.C0334q7 P;
    public final a.Bb<a.InterfaceC0479y9> Q;
    public a.Kd R;
    public final java.util.ArrayList<androidx.fragment.app.b.f> S;
    public final androidx.fragment.app.b.C0018b T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f905a;
    public android.os.Bundle b;
    public android.util.SparseArray<android.os.Parcelable> c;
    public android.os.Bundle d;
    public java.lang.String e;
    public android.os.Bundle f;
    public androidx.fragment.app.b g;
    public java.lang.String h;
    public int i;
    public java.lang.Boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public a.AbstractC0119e7 t;
    public a.X6.a u;
    public a.C0191i7 v;
    public androidx.fragment.app.b w;
    public int x;
    public int y;
    public java.lang.String z;

    public class a implements java.lang.Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.b f906a;

        public a(androidx.fragment.app.b r1) {
                r0 = this;
                r0.<init>()
                r0.f906a = r1
                return
        }

        @Override // java.lang.Runnable
        public final void run() {
                r2 = this;
                androidx.fragment.app.b r0 = r2.f906a
                androidx.fragment.app.b$d r1 = r0.J
                if (r1 == 0) goto Ld
                androidx.fragment.app.b$d r0 = r0.b()
                r0.getClass()
            Ld:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b, reason: collision with other inner class name */
    public class C0018b extends androidx.fragment.app.b.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.b f907a;

        public C0018b(androidx.fragment.app.b r1) {
                r0 = this;
                r0.f907a = r1
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.b.f
        public final void a() {
                r3 = this;
                androidx.fragment.app.b r0 = r3.f907a
                a.Kd r1 = r0.R
                r1.a()
                androidx.lifecycle.n.b(r0)
                android.os.Bundle r1 = r0.b
                if (r1 == 0) goto L15
                java.lang.String r2 = "registryState"
                android.os.Bundle r1 = r1.getBundle(r2)
                goto L16
            L15:
                r1 = 0
            L16:
                a.Kd r0 = r0.R
                r0.b(r1)
                return
        }
    }

    public class c extends a.AbstractC0040a2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.fragment.app.b f908a;

        public c(androidx.fragment.app.b r1) {
                r0 = this;
                r0.<init>()
                r0.f908a = r1
                return
        }

        @Override // a.AbstractC0040a2
        public final android.view.View c(int r4) {
                r3 = this;
                androidx.fragment.app.b r0 = r3.f908a
                android.view.View r1 = r0.G
                if (r1 == 0) goto Lb
                android.view.View r4 = r1.findViewById(r4)
                return r4
            Lb:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Fragment "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = " does not have a view"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
        }

        @Override // a.AbstractC0040a2
        public final boolean f() {
                r1 = this;
                androidx.fragment.app.b r0 = r1.f908a
                android.view.View r0 = r0.G
                if (r0 == 0) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f909a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        public java.lang.Object g;
        public java.lang.Object h;
        public java.lang.Object i;
        public float j;
        public android.view.View k;
    }

    public static class e extends java.lang.RuntimeException {
    }

    public static abstract class f {
        public f() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void a();
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.fragment.app.b.U = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f905a = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.e = r0
            r0 = 0
            r1.h = r0
            r1.j = r0
            a.i7 r0 = new a.i7
            r0.<init>()
            r1.v = r0
            r0 = 1
            r1.D = r0
            r1.I = r0
            androidx.fragment.app.b$a r0 = new androidx.fragment.app.b$a
            r0.<init>(r1)
            androidx.lifecycle.e$b r0 = androidx.lifecycle.e.b.e
            r1.N = r0
            a.Bb r0 = new a.Bb
            r0.<init>()
            r1.Q = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.S = r0
            androidx.fragment.app.b$b r0 = new androidx.fragment.app.b$b
            r0.<init>(r1)
            r1.T = r0
            r1.g()
            return
    }

    public final android.content.Context A() {
            r3 = this;
            android.content.Context r0 = r3.d()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " not attached to a context."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final android.view.View B() {
            r3 = this;
            android.view.View r0 = r3.G
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " did not return a View from onCreateView() or this was called before onCreateView()."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void C() {
            r3 = this;
            android.os.Bundle r0 = r3.b
            if (r0 == 0) goto L20
            java.lang.String r1 = "childFragmentManager"
            android.os.Bundle r0 = r0.getBundle(r1)
            if (r0 == 0) goto L20
            a.i7 r1 = r3.v
            r1.V(r0)
            a.i7 r0 = r3.v
            r1 = 0
            r0.G = r1
            r0.H = r1
            a.k7 r2 = r0.N
            r2.i = r1
            r1 = 1
            r0.u(r1)
        L20:
            return
    }

    public final void D(int r2, int r3, int r4, int r5) {
            r1 = this;
            androidx.fragment.app.b$d r0 = r1.J
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            if (r3 != 0) goto Ld
            if (r4 != 0) goto Ld
            if (r5 != 0) goto Ld
            return
        Ld:
            androidx.fragment.app.b$d r0 = r1.b()
            r0.b = r2
            androidx.fragment.app.b$d r2 = r1.b()
            r2.c = r3
            androidx.fragment.app.b$d r2 = r1.b()
            r2.d = r4
            androidx.fragment.app.b$d r2 = r1.b()
            r2.e = r5
            return
    }

    public final void E(android.os.Bundle r3) {
            r2 = this;
            a.e7 r0 = r2.t
            if (r0 == 0) goto L15
            boolean r1 = r0.G
            if (r1 != 0) goto Ld
            boolean r0 = r0.H
            if (r0 != 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added and state has been saved"
            r3.<init>(r0)
            throw r3
        L15:
            r2.f = r3
            return
    }

    public a.AbstractC0040a2 a() {
            r1 = this;
            androidx.fragment.app.b$c r0 = new androidx.fragment.app.b$c
            r0.<init>(r1)
            return r0
    }

    public final androidx.fragment.app.b.d b() {
            r2 = this;
            androidx.fragment.app.b$d r0 = r2.J
            if (r0 != 0) goto L1a
            androidx.fragment.app.b$d r0 = new androidx.fragment.app.b$d
            r0.<init>()
            java.lang.Object r1 = androidx.fragment.app.b.U
            r0.g = r1
            r0.h = r1
            r0.i = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.j = r1
            r1 = 0
            r0.k = r1
            r2.J = r0
        L1a:
            androidx.fragment.app.b$d r0 = r2.J
            return r0
    }

    public final a.AbstractC0119e7 c() {
            r3 = this;
            a.X6$a r0 = r3.u
            if (r0 == 0) goto L7
            a.i7 r0 = r3.v
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " has not been attached yet."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final android.content.Context d() {
            r1 = this;
            a.X6$a r0 = r1.u
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            a.X6 r0 = r0.b
            return r0
    }

    public final int e() {
            r2 = this;
            androidx.lifecycle.e$b r0 = r2.N
            androidx.lifecycle.e$b r1 = androidx.lifecycle.e.b.b
            if (r0 == r1) goto L1a
            androidx.fragment.app.b r1 = r2.w
            if (r1 != 0) goto Lb
            goto L1a
        Lb:
            int r0 = r0.ordinal()
            androidx.fragment.app.b r1 = r2.w
            int r1 = r1.e()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L1a:
            int r0 = r0.ordinal()
            return r0
    }

    public final a.AbstractC0119e7 f() {
            r3 = this;
            a.e7 r0 = r3.t
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " not associated with a fragment manager."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void g() {
            r3 = this;
            androidx.lifecycle.h r0 = new androidx.lifecycle.h
            r0.<init>(r3)
            r3.O = r0
            a.Kd r0 = new a.Kd
            r0.<init>(r3)
            r3.R = r0
            java.util.ArrayList<androidx.fragment.app.b$f> r0 = r3.S
            androidx.fragment.app.b$b r1 = r3.T
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L23
            int r2 = r3.f905a
            if (r2 < 0) goto L20
            r1.a()
            return
        L20:
            r0.add(r1)
        L23:
            return
    }

    @Override // androidx.lifecycle.c
    public final a.A4 getDefaultViewModelCreationExtras() {
            r4 = this;
            android.content.Context r0 = r4.A()
            android.content.Context r0 = r0.getApplicationContext()
        L8:
            boolean r1 = r0 instanceof android.content.ContextWrapper
            if (r1 == 0) goto L1a
            boolean r1 = r0 instanceof android.app.Application
            if (r1 == 0) goto L13
            android.app.Application r0 = (android.app.Application) r0
            goto L1b
        L13:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L8
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L44
            r1 = 3
            boolean r1 = a.AbstractC0119e7.J(r1)
            if (r1 == 0) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not find Application instance from Context "
            r1.<init>(r2)
            android.content.Context r2 = r4.A()
            android.content.Context r2 = r2.getApplicationContext()
            r1.append(r2)
            java.lang.String r2 = ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "FragmentManager"
            android.util.Log.d(r2, r1)
        L44:
            a.Ab r1 = new a.Ab
            r1.<init>()
            java.util.LinkedHashMap r2 = r1.f9a
            if (r0 == 0) goto L52
            androidx.lifecycle.p r3 = androidx.lifecycle.p.f942a
            r2.put(r3, r0)
        L52:
            androidx.lifecycle.n$b r0 = androidx.lifecycle.n.f940a
            r2.put(r0, r4)
            androidx.lifecycle.n$c r0 = androidx.lifecycle.n.b
            r2.put(r0, r4)
            android.os.Bundle r0 = r4.f
            if (r0 == 0) goto L65
            androidx.lifecycle.n$a r3 = androidx.lifecycle.n.c
            r2.put(r3, r0)
        L65:
            return r1
    }

    @Override // a.InterfaceC0479y9
    public final androidx.lifecycle.e getLifecycle() {
            r1 = this;
            androidx.lifecycle.h r0 = r1.O
            return r0
    }

    @Override // a.Ld
    public final androidx.savedstate.a getSavedStateRegistry() {
            r1 = this;
            a.Kd r0 = r1.R
            androidx.savedstate.a r0 = r0.b
            return r0
    }

    @Override // a.Gg
    public final a.Fg getViewModelStore() {
            r3 = this;
            a.e7 r0 = r3.t
            if (r0 == 0) goto L2e
            int r0 = r3.e()
            r1 = 1
            if (r0 == r1) goto L26
            a.e7 r0 = r3.t
            a.k7 r0 = r0.N
            java.util.HashMap<java.lang.String, a.Fg> r0 = r0.f
            java.lang.String r1 = r3.e
            java.lang.Object r1 = r0.get(r1)
            a.Fg r1 = (a.Fg) r1
            if (r1 != 0) goto L25
            a.Fg r1 = new a.Fg
            r1.<init>()
            java.lang.String r2 = r3.e
            r0.put(r2, r1)
        L25:
            return r1
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported"
            r0.<init>(r1)
            throw r0
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Can't access ViewModels from detached fragment"
            r0.<init>(r1)
            throw r0
    }

    public final void h() {
            r3 = this;
            r3.g()
            java.lang.String r0 = r3.e
            r3.M = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r3.e = r0
            r0 = 0
            r3.k = r0
            r3.l = r0
            r3.n = r0
            r3.o = r0
            r3.q = r0
            r3.s = r0
            r1 = 0
            r3.t = r1
            a.i7 r2 = new a.i7
            r2.<init>()
            r3.v = r2
            r3.u = r1
            r3.x = r0
            r3.y = r0
            r3.z = r1
            r3.A = r0
            r3.B = r0
            return
    }

    public final boolean i() {
            r1 = this;
            a.X6$a r0 = r1.u
            if (r0 == 0) goto La
            boolean r0 = r1.k
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean j() {
            r3 = this;
            boolean r0 = r3.A
            if (r0 != 0) goto L1a
            a.e7 r0 = r3.t
            r1 = 0
            if (r0 == 0) goto L19
            androidx.fragment.app.b r2 = r3.w
            r0.getClass()
            if (r2 != 0) goto L12
            r0 = r1
            goto L16
        L12:
            boolean r0 = r2.j()
        L16:
            if (r0 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            r0 = 1
            return r0
    }

    public final boolean k() {
            r1 = this;
            int r0 = r1.s
            if (r0 <= 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public void l() {
            r1 = this;
            r0 = 1
            r1.E = r0
            return
    }

    @java.lang.Deprecated
    public final void m(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            r0 = 2
            boolean r0 = a.AbstractC0119e7.J(r0)
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fragment "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = " received the following in onActivityResult(): requestCode: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " resultCode: "
            r0.append(r3)
            r0.append(r4)
            java.lang.String r3 = " data: "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "FragmentManager"
            android.util.Log.v(r4, r3)
        L32:
            return
    }

    public void n(a.X6 r2) {
            r1 = this;
            r2 = 1
            r1.E = r2
            a.X6$a r0 = r1.u
            if (r0 != 0) goto L9
            r0 = 0
            goto Lb
        L9:
            a.X6 r0 = r0.f370a
        Lb:
            if (r0 == 0) goto Lf
            r1.E = r2
        Lf:
            return
    }

    public void o(android.os.Bundle r4) {
            r3 = this;
            r4 = 1
            r3.E = r4
            r3.C()
            a.i7 r0 = r3.v
            int r1 = r0.u
            if (r1 < r4) goto Ld
            return
        Ld:
            r1 = 0
            r0.G = r1
            r0.H = r1
            a.k7 r2 = r0.N
            r2.i = r1
            r0.u(r4)
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            r1 = 1
            r0.E = r1
            return
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            a.X6 r0 = r1.z()
            r0.onCreateContextMenu(r2, r3, r4)
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.E = r0
            return
    }

    public android.view.View p(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void q() {
            r1 = this;
            r0 = 1
            r1.E = r0
            return
    }

    public void r() {
            r1 = this;
            r0 = 1
            r1.E = r0
            return
    }

    public android.view.LayoutInflater s(android.os.Bundle r2) {
            r1 = this;
            a.X6$a r2 = r1.u
            if (r2 == 0) goto L16
            a.X6 r2 = r2.e
            android.view.LayoutInflater r0 = r2.getLayoutInflater()
            android.view.LayoutInflater r2 = r0.cloneInContext(r2)
            a.i7 r0 = r1.v
            a.a7 r0 = r0.f
            r2.setFactory2(r0)
            return r2
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            r2.<init>(r0)
            throw r2
    }

    public void t(android.os.Bundle r1) {
            r0 = this;
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r2)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "} ("
            r0.append(r1)
            java.lang.String r1 = r2.e
            r0.append(r1)
            int r1 = r2.x
            if (r1 == 0) goto L3e
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.x
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L3e:
            java.lang.String r1 = r2.z
            if (r1 == 0) goto L4c
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r1 = r2.z
            r0.append(r1)
        L4c:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void u() {
            r1 = this;
            r0 = 1
            r1.E = r0
            return
    }

    public void v() {
            r1 = this;
            r0 = 1
            r1.E = r0
            return
    }

    public void w(android.view.View r1) {
            r0 = this;
            return
    }

    public void x(android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.E = r1
            return
    }

    public void y(android.view.LayoutInflater r5, android.view.ViewGroup r6, android.os.Bundle r7) {
            r4 = this;
            a.i7 r0 = r4.v
            r0.P()
            r0 = 1
            r4.r = r0
            a.q7 r0 = new a.q7
            a.Fg r1 = r4.getViewModelStore()
            a.M2 r2 = new a.M2
            r3 = 9
            r2.<init>(r3, r4)
            r0.<init>(r4, r1, r2)
            r4.P = r0
            android.view.View r5 = r4.p(r5, r6, r7)
            r4.G = r5
            if (r5 == 0) goto L6f
            a.q7 r5 = r4.P
            r5.b()
            r5 = 3
            boolean r5 = a.AbstractC0119e7.J(r5)
            if (r5 == 0) goto L4b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Setting ViewLifecycleOwner on View "
            r5.<init>(r6)
            android.view.View r6 = r4.G
            r5.append(r6)
            java.lang.String r6 = " for Fragment "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "FragmentManager"
            android.util.Log.d(r6, r5)
        L4b:
            android.view.View r5 = r4.G
            a.q7 r6 = r4.P
            a.Mg.a(r5, r6)
            android.view.View r5 = r4.G
            a.q7 r6 = r4.P
            java.lang.String r7 = "<this>"
            a.C0193i9.e(r5, r7)
            int r7 = androidx.lifecycle.viewmodel.R.id.view_tree_view_model_store_owner
            r5.setTag(r7, r6)
            android.view.View r5 = r4.G
            a.q7 r6 = r4.P
            androidx.savedstate.b.a(r5, r6)
            a.Bb<a.y9> r5 = r4.Q
            a.q7 r6 = r4.P
            r5.g(r6)
            return
        L6f:
            a.q7 r5 = r4.P
            androidx.lifecycle.h r5 = r5.d
            if (r5 != 0) goto L79
            r5 = 0
            r4.P = r5
            return
        L79:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Called getViewLifecycleOwner() but onCreateView() returned null"
            r5.<init>(r6)
            throw r5
    }

    public final a.X6 z() {
            r3 = this;
            a.X6$a r0 = r3.u
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            a.X6 r0 = r0.f370a
        L8:
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fragment "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " not attached to an activity."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }
}
