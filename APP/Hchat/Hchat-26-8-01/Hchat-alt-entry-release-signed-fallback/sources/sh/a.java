package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12484b;

    public a(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f12483a = r1
            r0.f12484b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof sh.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sh.a r8 = (sh.a) r8
            long r3 = r7.f12483a
            long r5 = r8.f12483a
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f12484b
            long r5 = r8.f12484b
            boolean r8 = f1.w.c(r3, r5)
            if (r8 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = f1.w.f3132h
            long r0 = r3.f12483a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f12484b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            long r0 = r5.f12483a
            java.lang.String r0 = f1.w.i(r0)
            long r1 = r5.f12484b
            java.lang.String r1 = f1.w.i(r1)
            java.lang.String r2 = ", disabledColor="
            java.lang.String r3 = ")"
            java.lang.String r4 = "BasicComponentColors(color="
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}
