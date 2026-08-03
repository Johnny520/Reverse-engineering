package l4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l4.e implements l4.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w4.a f7842e;

    public f(v4.d0 r2, int r3, v4.z r4, h4.u r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            v4.c0 r5 = r4.f14132h
            java.lang.String r5 = r5.f14067g
            w4.c r2 = r2.f14088g
            r3 = r3 & 8
            if (r3 == 0) goto Lf
            r3 = 1
            goto L10
        Lf:
            r3 = 0
        L10:
            v4.c0 r4 = r4.f14131g
            java.lang.String r4 = r4.f14067g
            java.lang.String r0 = "<init>"
            boolean r4 = r4.equals(r0)
            w4.a r5 = w4.a.d(r5)
            if (r3 == 0) goto L21
            goto L2e
        L21:
            if (r4 == 0) goto L2a
            r3 = 2147483647(0x7fffffff, float:NaN)
            w4.c r2 = r2.d(r3)
        L2a:
            w4.a r5 = r5.e(r2)
        L2e:
            r1.f7842e = r5
            return
    }

    @Override // l4.b
    public final w4.a a() {
            r1 = this;
            w4.a r0 = r1.f7842e
            return r0
    }
}
