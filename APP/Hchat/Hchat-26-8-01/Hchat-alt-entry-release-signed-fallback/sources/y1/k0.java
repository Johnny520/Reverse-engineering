package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 implements qg.t {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final android.view.View f21987g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n2.t f21988h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qg.t f21989i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f21990j;

    public k0(android.view.View r1, n2.t r2, qg.t r3) {
            r0 = this;
            r0.<init>()
            r0.f21987g = r1
            r0.f21988h = r2
            r0.f21989i = r3
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r2 = 0
            r1.<init>(r2)
            r0.f21990j = r1
            return
    }

    public final void a(f0.u r5, yf.c r6) {
            r4 = this;
            boolean r0 = r6 instanceof y1.j0
            if (r0 == 0) goto L13
            r0 = r6
            y1.j0 r0 = (y1.j0) r0
            int r1 = r0.f21978i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21978i = r1
            goto L18
        L13:
            y1.j0 r0 = new y1.j0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f21976g
            int r1 = r0.f21978i
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            return
        L27:
            f8.i.I0(r6)
            goto L4e
        L2b:
            f8.i.I0(r6)
            f1.p r6 = new f1.p
            r1 = 7
            r6.<init>(r5, r1, r4)
            ci.j r5 = new ci.j
            r1 = 26
            r3 = 0
            r5.<init>(r4, r3, r1)
            r0.f21978i = r2
            ci.e r1 = new ci.e
            java.util.concurrent.atomic.AtomicReference r2 = r4.f21990j
            r1.<init>(r6, r2, r5, r3)
            java.lang.Object r5 = qg.v.e(r1, r0)
            xf.a r6 = xf.a.f21579g
            if (r5 != r6) goto L4e
            return
        L4e:
            okio.a.c()
            return
    }

    @Override // qg.t
    public final wf.g n() {
            r1 = this;
            qg.t r0 = r1.f21989i
            wf.g r0 = r0.n()
            return r0
    }
}
