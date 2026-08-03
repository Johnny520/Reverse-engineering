package h0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4930b;

    public k1(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f4929a = r1
            r0.f4930b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof h0.k1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h0.k1 r8 = (h0.k1) r8
            long r3 = r8.f4929a
            long r5 = r7.f4929a
            boolean r1 = f1.w.c(r5, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f4930b
            long r5 = r8.f4930b
            boolean r8 = f1.w.c(r3, r5)
            if (r8 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = f1.w.f3132h
            long r0 = r3.f4929a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f4930b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SelectionColors(selectionHandleColor="
            r0.<init>(r1)
            long r1 = r3.f4929a
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", selectionBackgroundColor="
            r0.append(r1)
            long r1 = r3.f4930b
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
