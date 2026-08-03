package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements p.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9887a;

    public /* synthetic */ e(int r1) {
            r0 = this;
            r0.f9887a = r1
            r0.<init>()
            return
    }

    @Override // p.i
    public final void c(int r1, v1.p0 r2, int[] r3, int[] r4) {
            r0 = this;
            int r2 = r0.f9887a
            switch(r2) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            r1 = 0
            p.j.b(r3, r4, r1)
            return
        La:
            r2 = 0
            p.j.c(r1, r3, r4, r2)
            return
    }

    public final java.lang.String toString() {
            r1 = this;
            int r0 = r1.f9887a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "Arrangement#Top"
            return r0
        L8:
            java.lang.String r0 = "Arrangement#Bottom"
            return r0
    }
}
