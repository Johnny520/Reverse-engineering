package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements tg.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m.a f21476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xb.i f21477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f21478i;

    public g(m.a r1, xb.i r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.f21476g = r1
            r0.f21477h = r2
            r0.f21478i = r3
            return
    }

    @Override // tg.d
    public final java.lang.Object b(tg.e r5, wf.c r6) {
            r4 = this;
            boolean r0 = r6 instanceof xb.d
            if (r0 == 0) goto L13
            r0 = r6
            xb.d r0 = (xb.d) r0
            int r1 = r0.f21468h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21468h = r1
            goto L18
        L13:
            xb.d r0 = new xb.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f21467g
            int r1 = r0.f21468h
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            f8.i.I0(r6)
            goto L45
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L2c:
            f8.i.I0(r6)
            xb.f r6 = new xb.f
            xb.i r1 = r4.f21477h
            float r3 = r4.f21478i
            r6.<init>(r5, r1, r3)
            r0.f21468h = r2
            m.a r5 = r4.f21476g
            java.lang.Object r5 = r5.b(r6, r0)
            xf.a r6 = xf.a.f21579g
            if (r5 != r6) goto L45
            return r6
        L45:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
