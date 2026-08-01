package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class ml implements android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, defpackage.oq, defpackage.sa0, defpackage.lo, defpackage.u10 {
    public static final java.lang.Object Q = null;
    public boolean A;
    public final boolean B;
    public boolean C;
    public android.view.ViewGroup D;
    public android.view.View E;
    public boolean F;
    public boolean G;
    public defpackage.ll H;
    public boolean I;
    public boolean J;
    public defpackage.jq K;
    public androidx.lifecycle.a L;
    public defpackage.fm M;
    public final androidx.lifecycle.b N;
    public defpackage.gm O;
    public final java.util.ArrayList P;
    public int a;
    public android.os.Bundle b;
    public android.util.SparseArray c;
    public android.os.Bundle d;
    public java.lang.String e;
    public android.os.Bundle f;
    public defpackage.ml g;
    public java.lang.String h;
    public int i;
    public java.lang.Boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public int q;
    public defpackage.yl r;
    public defpackage.nl s;
    public defpackage.yl t;
    public defpackage.ml u;
    public int v;
    public int w;
    public java.lang.String x;
    public boolean y;
    public boolean z;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.ml.Q = r0
            return
    }

    public ml() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.a = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r1.e = r0
            r0 = 0
            r1.h = r0
            r1.j = r0
            yl r0 = new yl
            r0.<init>()
            r1.t = r0
            r0 = 1
            r1.B = r0
            r1.G = r0
            jq r0 = defpackage.jq.e
            r1.K = r0
            androidx.lifecycle.b r0 = new androidx.lifecycle.b
            r0.<init>()
            r1.N = r0
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.P = r0
            androidx.lifecycle.a r0 = new androidx.lifecycle.a
            r0.<init>(r1)
            r1.L = r0
            gm r0 = new gm
            r0.<init>(r1)
            r1.O = r0
            return
    }

    public final android.view.View A() {
            r3 = this;
            android.view.View r0 = r3.E
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

    public final void B(int r2, int r3, int r4, int r5) {
            r1 = this;
            ll r0 = r1.H
            if (r0 != 0) goto Ld
            if (r2 != 0) goto Ld
            if (r3 != 0) goto Ld
            if (r4 != 0) goto Ld
            if (r5 != 0) goto Ld
            return
        Ld:
            ll r0 = r1.f()
            r0.b = r2
            ll r2 = r1.f()
            r2.c = r3
            ll r2 = r1.f()
            r2.d = r4
            ll r2 = r1.f()
            r2.e = r5
            return
    }

    public final void C(android.os.Bundle r3) {
            r2 = this;
            yl r0 = r2.r
            if (r0 == 0) goto L15
            boolean r1 = r0.y
            if (r1 != 0) goto Ld
            boolean r0 = r0.z
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

    @Override // defpackage.u10
    public final defpackage.a3 b() {
            r1 = this;
            gm r0 = r1.O
            java.lang.Object r0 = r0.c
            a3 r0 = (defpackage.a3) r0
            return r0
    }

    public defpackage.ip c() {
            r1 = this;
            kl r0 = new kl
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.sa0
    public final defpackage.ra0 d() {
            r3 = this;
            yl r0 = r3.r
            if (r0 == 0) goto L2e
            int r0 = r3.i()
            r1 = 1
            if (r0 == r1) goto L26
            yl r0 = r3.r
            am r0 = r0.F
            java.util.HashMap r0 = r0.e
            java.lang.String r1 = r3.e
            java.lang.Object r1 = r0.get(r1)
            ra0 r1 = (defpackage.ra0) r1
            if (r1 != 0) goto L25
            ra0 r1 = new ra0
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

    @Override // defpackage.oq
    public final androidx.lifecycle.a e() {
            r1 = this;
            androidx.lifecycle.a r0 = r1.L
            return r0
    }

    public final defpackage.ll f() {
            r2 = this;
            ll r0 = r2.H
            if (r0 != 0) goto L1a
            ll r0 = new ll
            r0.<init>()
            java.lang.Object r1 = defpackage.ml.Q
            r0.g = r1
            r0.h = r1
            r0.i = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.j = r1
            r1 = 0
            r0.k = r1
            r2.H = r0
        L1a:
            ll r0 = r2.H
            return r0
    }

    public final defpackage.yl g() {
            r3 = this;
            nl r0 = r3.s
            if (r0 == 0) goto L7
            yl r0 = r3.t
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

    public final android.content.Context h() {
            r1 = this;
            nl r0 = r1.s
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            androidx.fragment.app.FragmentActivity r0 = r0.D
            return r0
    }

    public final int i() {
            r2 = this;
            jq r0 = r2.K
            jq r1 = defpackage.jq.b
            if (r0 == r1) goto L1a
            ml r1 = r2.u
            if (r1 != 0) goto Lb
            goto L1a
        Lb:
            int r0 = r0.ordinal()
            ml r1 = r2.u
            int r1 = r1.i()
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L1a:
            int r0 = r0.ordinal()
            return r0
    }

    public final defpackage.yl j() {
            r3 = this;
            yl r0 = r3.r
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

    public final void k(int r3, int r4, android.content.Intent r5) {
            r2 = this;
            r0 = 2
            boolean r0 = defpackage.yl.A(r0)
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

    public void l(android.content.Context r2) {
            r1 = this;
            r2 = 1
            r1.C = r2
            nl r0 = r1.s
            if (r0 != 0) goto L9
            r0 = 0
            goto Lb
        L9:
            androidx.fragment.app.FragmentActivity r0 = r0.C
        Lb:
            if (r0 == 0) goto Lf
            r1.C = r2
        Lf:
            return
    }

    public void m(android.os.Bundle r4) {
            r3 = this;
            r0 = 1
            r3.C = r0
            r1 = 0
            if (r4 == 0) goto L20
            java.lang.String r2 = "android:support:fragments"
            android.os.Parcelable r4 = r4.getParcelable(r2)
            if (r4 == 0) goto L20
            yl r2 = r3.t
            r2.K(r4)
            yl r4 = r3.t
            r4.y = r1
            r4.z = r1
            am r2 = r4.F
            r2.h = r1
            r4.p(r0)
        L20:
            yl r4 = r3.t
            int r2 = r4.m
            if (r2 < r0) goto L27
            return
        L27:
            r4.y = r1
            r4.z = r1
            am r2 = r4.F
            r2.h = r1
            r4.p(r0)
            return
    }

    public android.view.View n(android.view.LayoutInflater r1, android.view.ViewGroup r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void o() {
            r1 = this;
            r0 = 1
            r1.C = r0
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            r1 = 1
            r0.C = r1
            return
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu r2, android.view.View r3, android.view.ContextMenu.ContextMenuInfo r4) {
            r1 = this;
            nl r0 = r1.s
            if (r0 != 0) goto L6
            r0 = 0
            goto L8
        L6:
            androidx.fragment.app.FragmentActivity r0 = r0.C
        L8:
            if (r0 == 0) goto Le
            r0.onCreateContextMenu(r2, r3, r4)
            return
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Fragment "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r4 = " not attached to an activity."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r1 = this;
            r0 = 1
            r1.C = r0
            return
    }

    public void p() {
            r1 = this;
            r0 = 1
            r1.C = r0
            return
    }

    public android.view.LayoutInflater q(android.os.Bundle r2) {
            r1 = this;
            nl r2 = r1.s
            if (r2 == 0) goto L16
            androidx.fragment.app.FragmentActivity r2 = r2.G
            android.view.LayoutInflater r0 = r2.getLayoutInflater()
            android.view.LayoutInflater r2 = r0.cloneInContext(r2)
            yl r0 = r1.t
            ql r0 = r0.f
            r2.setFactory2(r0)
            return r2
        L16:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager."
            r2.<init>(r0)
            throw r2
    }

    public abstract void r(android.os.Bundle r1);

    public void s() {
            r1 = this;
            r0 = 1
            r1.C = r0
            return
    }

    public void t() {
            r1 = this;
            r0 = 1
            r1.C = r0
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
            int r1 = r2.v
            if (r1 == 0) goto L3e
            java.lang.String r1 = " id=0x"
            r0.append(r1)
            int r1 = r2.v
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
        L3e:
            java.lang.String r1 = r2.x
            if (r1 == 0) goto L4c
            java.lang.String r1 = " tag="
            r0.append(r1)
            java.lang.String r1 = r2.x
            r0.append(r1)
        L4c:
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void u(android.os.Bundle r1) {
            r0 = this;
            r1 = 1
            r0.C = r1
            return
    }

    public void v(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            yl r4 = r1.t
            r4.F()
            r4 = 1
            r1.p = r4
            fm r4 = new fm
            ra0 r0 = r1.d()
            r4.<init>(r0)
            r1.M = r4
            android.view.View r2 = r1.n(r2, r3)
            r1.E = r2
            if (r2 == 0) goto L51
            fm r2 = r1.M
            r2.f()
            android.view.View r2 = r1.E
            fm r3 = r1.M
            java.lang.String r4 = "<this>"
            defpackage.ip.o(r4, r2)
            r0 = 2131296695(0x7f0901b7, float:1.8211314E38)
            r2.setTag(r0, r3)
            android.view.View r2 = r1.E
            fm r3 = r1.M
            defpackage.ip.o(r4, r2)
            r0 = 2131296698(0x7f0901ba, float:1.821132E38)
            r2.setTag(r0, r3)
            android.view.View r2 = r1.E
            fm r3 = r1.M
            defpackage.ip.o(r4, r2)
            r4 = 2131296697(0x7f0901b9, float:1.8211318E38)
            r2.setTag(r4, r3)
            androidx.lifecycle.b r2 = r1.N
            fm r3 = r1.M
            r2.e(r3)
            return
        L51:
            fm r2 = r1.M
            androidx.lifecycle.a r2 = r2.b
            if (r2 != 0) goto L5b
            r2 = 0
            r1.M = r2
            return
        L5b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Called getViewLifecycleOwner() but onCreateView() returned null"
            r2.<init>(r3)
            throw r2
    }

    public final void w() {
            r2 = this;
            r0 = 1
            r2.C = r0
            yl r0 = r2.t
            r5 r0 = r0.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            ml r1 = (defpackage.ml) r1
            if (r1 == 0) goto Lf
            r1.w()
            goto Lf
        L21:
            return
    }

    public final void x() {
            r2 = this;
            yl r0 = r2.t
            r5 r0 = r0.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            ml r1 = (defpackage.ml) r1
            if (r1 == 0) goto Lc
            r1.x()
            goto Lc
        L1e:
            return
    }

    public final void y() {
            r2 = this;
            yl r0 = r2.t
            r5 r0 = r0.c
            java.util.List r0 = r0.p()
            java.util.Iterator r0 = r0.iterator()
        Lc:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r0.next()
            ml r1 = (defpackage.ml) r1
            if (r1 == 0) goto Lc
            r1.y()
            goto Lc
        L1e:
            return
    }

    public final android.content.Context z() {
            r3 = this;
            android.content.Context r0 = r3.h()
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
}
