package k5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends o5.r {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7188j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f7189k;

    public /* synthetic */ d0(java.lang.Object r1, androidx.lifecycle.x r2, int r3, int r4, int r5) {
            r0 = this;
            r0.f7188j = r5
            r0.f7189k = r1
            r0.<init>(r2, r3, r4)
            return
    }

    @Override // o5.r
    public final java.lang.Object a(a5.a r2, int r3) {
            r1 = this;
            int r3 = r1.f7188j
            switch(r3) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.Object r3 = r1.f7189k
            p5.b r3 = (p5.b) r3
            k5.u r3 = r3.f10251g
            w5.a r2 = fb.v0.J(r3, r2)
            return r2
        L10:
            k5.g0 r3 = new k5.g0
            java.lang.Object r0 = r1.f7189k
            k5.f0 r0 = (k5.f0) r0
            k5.u r0 = r0.f7202a
            r3.<init>(r0, r2)
            return r3
    }
}
