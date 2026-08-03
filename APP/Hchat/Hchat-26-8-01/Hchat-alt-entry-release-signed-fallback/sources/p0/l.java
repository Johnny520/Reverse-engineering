package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends p0.k {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f10073j;

    public /* synthetic */ l(int r1) {
            r0 = this;
            r0.f10073j = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f10073j
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            int r0 = r4.f10072i
            int r1 = r0 + 2
            r4.f10072i = r1
            java.lang.Object[] r1 = r4.f10070g
            int r0 = r0 + 1
            r0 = r1[r0]
            return r0
        L12:
            int r0 = r4.f10072i
            int r1 = r0 + 2
            r4.f10072i = r1
            java.lang.Object[] r1 = r4.f10070g
            r0 = r1[r0]
            return r0
        L1d:
            int r0 = r4.f10072i
            int r1 = r0 + 2
            r4.f10072i = r1
            f.s r1 = new f.s
            java.lang.Object[] r2 = r4.f10070g
            r3 = r2[r0]
            int r0 = r0 + 1
            r0 = r2[r0]
            r2 = 1
            r1.<init>(r3, r2, r0)
            return r1
    }
}
