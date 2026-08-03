package m;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m.o2 f8300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gg.a f8301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u2.c f8302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b.e f8304e;

    public o1(m.o2 r1, fg.p r2, u2.c r3) {
            r0 = this;
            r0.<init>()
            r0.f8300a = r1
            gg.a r2 = (gg.a) r2
            r0.f8301b = r2
            r0.f8302c = r3
            b.e r1 = new b.e
            r2 = 22
            r1.<init>(r2)
            r0.f8304e = r1
            return
    }

    public static void a(s1.k r3) {
            java.lang.Object r3 = r3.f12262a
            int r0 = r3.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L15
            java.lang.Object r2 = r3.get(r1)
            s1.t r2 = (s1.t) r2
            r2.a()
            int r1 = r1 + 1
            goto L7
        L15:
            return
    }

    public final java.lang.Object b(fg.p r5, yf.c r6) {
            r4 = this;
            boolean r0 = r6 instanceof m.n1
            if (r0 == 0) goto L13
            r0 = r6
            m.n1 r0 = (m.n1) r0
            int r1 = r0.f8283i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8283i = r1
            goto L18
        L13:
            m.n1 r0 = new m.n1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f8281g
            int r1 = r0.f8283i
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            f8.i.I0(r6)
            goto L4d
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L2c:
            f8.i.I0(r6)
            r4.f8303d = r2
            ci.j r6 = new ci.j
            r1 = 0
            r3 = 10
            r6.<init>(r4, r5, r1, r3)
            r0.f8283i = r2
            qg.f1 r5 = new qg.f1
            wf.g r1 = r0.getContext()
            r5.<init>(r0, r1)
            java.lang.Object r5 = fb.v0.L(r5, r5, r6)
            xf.a r6 = xf.a.f21579g
            if (r5 != r6) goto L4d
            return r6
        L4d:
            r5 = 0
            r4.f8303d = r5
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
