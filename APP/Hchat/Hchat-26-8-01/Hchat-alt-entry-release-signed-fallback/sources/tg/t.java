package tg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ug.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f13248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public qg.g f13249b;

    @Override // ug.d
    public final boolean a(ug.b r5) {
            r4 = this;
            tg.r r5 = (tg.r) r5
            long r0 = r4.f13248a
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto Lc
            r5 = 0
            return r5
        Lc:
            long r0 = r5.f13241o
            long r2 = r5.f13242p
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L16
            r5.f13242p = r0
        L16:
            r4.f13248a = r0
            r5 = 1
            return r5
    }

    @Override // ug.d
    public final wf.c[] b(ug.b r5) {
            r4 = this;
            tg.r r5 = (tg.r) r5
            long r0 = r4.f13248a
            r2 = -1
            r4.f13248a = r2
            r2 = 0
            r4.f13249b = r2
            wf.c[] r5 = r5.u(r0)
            return r5
    }
}
