package xb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements tg.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tg.e f21473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xb.i f21474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f21475i;

    public f(tg.e r1, xb.i r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.f21473g = r1
            r0.f21474h = r2
            r0.f21475i = r3
            return
    }

    @Override // tg.e
    public final java.lang.Object e(java.lang.Object r5, wf.c r6) {
            r4 = this;
            boolean r0 = r6 instanceof xb.e
            if (r0 == 0) goto L13
            r0 = r6
            xb.e r0 = (xb.e) r0
            int r1 = r0.f21471h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21471h = r1
            goto L18
        L13:
            xb.e r0 = new xb.e
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f21470g
            int r1 = r0.f21471h
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            f8.i.I0(r6)
            goto L63
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            j8.o.A(r5)
            r5 = 0
            return r5
        L2c:
            f8.i.I0(r6)
            r6 = r5
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            xb.i r1 = r4.f21474h
            i.c r1 = r1.f21492k
            i0.j1 r1 = r1.f5606e
            java.lang.Object r1 = r1.getValue()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            float r6 = r6 - r1
            float r6 = java.lang.Math.abs(r6)
            float r1 = r4.f21475i
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L53
            r6 = r2
            goto L54
        L53:
            r6 = 0
        L54:
            if (r6 == 0) goto L63
            r0.f21471h = r2
            tg.e r6 = r4.f21473g
            java.lang.Object r5 = r6.e(r5, r0)
            xf.a r6 = xf.a.f21579g
            if (r5 != r6) goto L63
            return r6
        L63:
            sf.n r5 = sf.n.f12433a
            return r5
    }
}
