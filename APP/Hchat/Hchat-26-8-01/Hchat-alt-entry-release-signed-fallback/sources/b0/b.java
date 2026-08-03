package b0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b0.h f344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d0.d f345i;

    public /* synthetic */ b(b0.h r1, d0.d r2, int r3) {
            r0 = this;
            r0.f343g = r3
            r0.f344h = r1
            r0.f345i = r2
            r0.<init>()
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r6 = this;
            int r0 = r6.f343g
            switch(r0) {
                case 0: goto L5c;
                case 1: goto L30;
                default: goto L5;
            }
        L5:
            b0.h r0 = r6.f344h
            fg.a r0 = r0.f369c
            java.lang.Object r0 = r0.invoke()
            r1 = r0
            v1.t r1 = (v1.t) r1
            boolean r1 = r1.C()
            if (r1 == 0) goto L17
            goto L18
        L17:
            r0 = 0
        L18:
            v1.t r0 = (v1.t) r0
            if (r0 != 0) goto L1f
            e1.c r0 = e1.c.f2295e
            goto L2f
        L1f:
            d0.d r1 = r6.f345i
            e1.c r1 = r1.w0(r0)
            r2 = 0
            long r2 = r0.m0(r2)
            e1.c r0 = r1.i(r2)
        L2f:
            return r0
        L30:
            b0.h r0 = r6.f344h
            b0.a r1 = r0.f373g
            b0.b r2 = new b0.b
            r3 = 2
            d0.d r4 = r6.f345i
            r2.<init>(r0, r4, r3)
            gg.u r3 = new gg.u
            r3.<init>()
            w0.s r0 = r0.f371e
            aa.c r4 = new aa.c
            r5 = 1
            r4.<init>(r3, r5, r2)
            java.lang.String r2 = "positioner"
            r0.c(r2, r1, r4)
            java.lang.Object r0 = r3.f4564g
            if (r0 == 0) goto L55
            e1.c r0 = (e1.c) r0
            return r0
        L55:
            java.lang.String r0 = "result"
            gg.l.g(r0)
            r0 = 0
            throw r0
        L5c:
            b0.h r0 = r6.f344h
            b0.a r1 = r0.f372f
            ab.a r2 = new ab.a
            r3 = 1
            d0.d r4 = r6.f345i
            r2.<init>(r4, r3)
            gg.u r3 = new gg.u
            r3.<init>()
            w0.s r0 = r0.f371e
            aa.c r4 = new aa.c
            r5 = 1
            r4.<init>(r3, r5, r2)
            java.lang.String r2 = "dataBuilder"
            r0.c(r2, r1, r4)
            java.lang.Object r0 = r3.f4564g
            if (r0 == 0) goto L81
            z.c r0 = (z.c) r0
            return r0
        L81:
            java.lang.String r0 = "result"
            gg.l.g(r0)
            r0 = 0
            throw r0
    }
}
