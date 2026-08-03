package ci;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements k.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1744a;

    public l(long r1) {
            r0 = this;
            r0.<init>()
            r0.f1744a = r1
            return
    }

    @Override // k.y0
    public final x1.i a(n.k r4) {
            r3 = this;
            r4.getClass()
            ci.k r0 = new ci.k
            long r1 = r3.f1744a
            r0.<init>(r4, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof ci.l
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ci.l r8 = (ci.l) r8
            long r3 = r8.f1744a
            long r5 = r7.f1744a
            boolean r8 = f1.w.c(r5, r3)
            if (r8 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // k.y0
    public final int hashCode() {
            r2 = this;
            int r0 = f1.w.f3132h
            long r0 = r2.f1744a
            int r0 = java.lang.Long.hashCode(r0)
            return r0
    }
}
