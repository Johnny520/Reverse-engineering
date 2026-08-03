package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends o5.r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7193j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k5.f0 f7194k;

    public e0(k5.f0 r1, androidx.lifecycle.x r2, int r3, int r4, int r5) {
            r0 = this;
            r0.f7194k = r1
            r0.f7193j = r5
            r0.<init>(r2, r3, r4)
            return
    }

    @Override // o5.r
    public final java.lang.Object a(a5.a r2, int r3) {
            r1 = this;
            int r0 = r1.f7193j
            int r0 = r0 + (-1)
            if (r3 != r0) goto Lc
            k5.d r3 = new k5.d
            r3.<init>(r2)
            return r3
        Lc:
            k5.g0 r3 = new k5.g0
            k5.f0 r0 = r1.f7194k
            k5.u r0 = r0.f7202a
            r3.<init>(r0, r2)
            return r3
    }
}
