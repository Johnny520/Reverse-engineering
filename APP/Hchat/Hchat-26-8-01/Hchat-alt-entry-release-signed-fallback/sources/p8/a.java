package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10309b;

    public a(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f10308a = r1
            r0.f10309b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p8.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            p8.a r8 = (p8.a) r8
            long r3 = r7.f10308a
            long r5 = r8.f10308a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            long r3 = r7.f10309b
            long r5 = r8.f10309b
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 == 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            long r0 = r3.f10308a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f10309b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "VideoSpan(start="
            java.lang.String r1 = ", end="
            long r2 = r4.f10308a
            java.lang.StringBuilder r0 = p.a.o(r2, r0, r1)
            java.lang.String r1 = ")"
            long r2 = r4.f10309b
            java.lang.String r0 = eh.a.p(r0, r2, r1)
            return r0
    }
}
