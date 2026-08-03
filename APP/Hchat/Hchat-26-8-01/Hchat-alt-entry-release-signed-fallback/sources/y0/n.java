package y0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n implements x1.i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y0.n f21819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public vg.c f21820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y0.n f21823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y0.n f21824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public x1.n1 f21825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public x1.i1 f21826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f21828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f21830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c1.b f21831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f21832t;

    public n() {
            r1 = this;
            r1.<init>()
            r1.f21819g = r1
            r0 = -1
            r1.f21822j = r0
            return
    }

    public final qg.t Y0() {
            r3 = this;
            vg.c r0 = r3.f21820h
            if (r0 != 0) goto L2f
            x1.r1 r0 = x1.k.x(r3)
            y1.t r0 = (y1.t) r0
            wf.g r0 = r0.getCoroutineContext()
            x1.r1 r1 = x1.k.x(r3)
            y1.t r1 = (y1.t) r1
            wf.g r1 = r1.getCoroutineContext()
            qg.q r2 = qg.q.f11090h
            wf.e r1 = r1.s(r2)
            qg.r0 r1 = (qg.r0) r1
            qg.t0 r2 = new qg.t0
            r2.<init>(r1)
            wf.g r0 = r0.e(r2)
            vg.c r0 = qg.v.a(r0)
            r3.f21820h = r0
        L2f:
            return r0
    }

    public boolean Z0() {
            r1 = this;
            boolean r0 = r1 instanceof k.o
            r0 = r0 ^ 1
            return r0
    }

    public void a1() {
            r1 = this;
            boolean r0 = r1.f21832t
            if (r0 == 0) goto L9
            java.lang.String r0 = "node attached multiple times"
            u1.a.b(r0)
        L9:
            x1.i1 r0 = r1.f21826n
            if (r0 == 0) goto Le
            goto L13
        Le:
            java.lang.String r0 = "attach invoked on a node without a coordinator"
            u1.a.b(r0)
        L13:
            r0 = 1
            r1.f21832t = r0
            r1.f21829q = r0
            return
    }

    public void b1() {
            r4 = this;
            boolean r0 = r4.f21832t
            if (r0 != 0) goto L9
            java.lang.String r0 = "Cannot detach a node that is not attached"
            u1.a.b(r0)
        L9:
            boolean r0 = r4.f21829q
            if (r0 == 0) goto L12
            java.lang.String r0 = "Must run runAttachLifecycle() before markAsDetached()"
            u1.a.b(r0)
        L12:
            boolean r0 = r4.f21830r
            if (r0 == 0) goto L1b
            java.lang.String r0 = "Must run runDetachLifecycle() before markAsDetached()"
            u1.a.b(r0)
        L1b:
            r0 = 0
            r4.f21832t = r0
            vg.c r0 = r4.f21820h
            if (r0 == 0) goto L30
            s1.w r1 = new s1.w
            java.lang.String r2 = "The Modifier.Node was detached"
            r3 = 2
            r1.<init>(r2, r3)
            qg.v.c(r0, r1)
            r0 = 0
            r4.f21820h = r0
        L30:
            return
    }

    public void c1() {
            r0 = this;
            return
    }

    public void d1() {
            r0 = this;
            return
    }

    public void e1() {
            r0 = this;
            return
    }

    public void f1() {
            r1 = this;
            boolean r0 = r1.f21832t
            if (r0 != 0) goto L9
            java.lang.String r0 = "reset() called on an unattached node"
            u1.a.b(r0)
        L9:
            r1.e1()
            return
    }

    public void g1() {
            r1 = this;
            boolean r0 = r1.f21832t
            if (r0 != 0) goto L9
            java.lang.String r0 = "Must run markAsAttached() prior to runAttachLifecycle"
            u1.a.b(r0)
        L9:
            boolean r0 = r1.f21829q
            if (r0 != 0) goto L12
            java.lang.String r0 = "Must run runAttachLifecycle() only once after markAsAttached()"
            u1.a.b(r0)
        L12:
            r0 = 0
            r1.f21829q = r0
            r1.c1()
            r0 = 1
            r1.f21830r = r0
            return
    }

    public void h1() {
            r1 = this;
            boolean r0 = r1.f21832t
            if (r0 != 0) goto L9
            java.lang.String r0 = "node detached multiple times"
            u1.a.b(r0)
        L9:
            x1.i1 r0 = r1.f21826n
            if (r0 == 0) goto Le
            goto L13
        Le:
            java.lang.String r0 = "detach invoked on a node without a coordinator"
            u1.a.b(r0)
        L13:
            boolean r0 = r1.f21830r
            if (r0 != 0) goto L1c
            java.lang.String r0 = "Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()"
            u1.a.b(r0)
        L1c:
            r0 = 0
            r1.f21830r = r0
            c1.b r0 = r1.f21831s
            if (r0 == 0) goto L26
            r0.invoke()
        L26:
            r1.d1()
            return
    }

    public void i1(y0.n r1) {
            r0 = this;
            r0.f21819g = r1
            return
    }

    public void j1(x1.i1 r1) {
            r0 = this;
            r0.f21826n = r1
            return
    }
}
