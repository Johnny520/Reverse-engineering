package o7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends o7.b {
    @Override // o7.b
    public final void L(int r1, k7.a r2) {
            r0 = this;
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Empty BlockList"
            r1.<init>(r2)
            throw r1
    }

    @Override // o7.b
    public final boolean M(k7.a r2) {
            r1 = this;
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Empty BlockList"
            r2.<init>(r0)
            throw r2
    }

    @Override // o7.b
    public final void d0(int r1, boolean r2) {
            r0 = this;
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r1 = "Empty BlockList"
            j8.o.t(r1)
            return
    }

    @Override // o7.b
    public final int size() {
            r1 = this;
            r0 = 0
            return r0
    }
}
