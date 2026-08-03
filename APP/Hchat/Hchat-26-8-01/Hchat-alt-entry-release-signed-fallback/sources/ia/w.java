package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6639b;

    public w(long r1, int r3) {
            r0 = this;
            r0.<init>()
            r0.f6638a = r1
            r0.f6639b = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof ia.w
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ia.w r8 = (ia.w) r8
            long r3 = r7.f6638a
            long r5 = r8.f6638a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            int r1 = r7.f6639b
            int r8 = r8.f6639b
            if (r1 == r8) goto L1c
            return r2
        L1c:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f6638a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r2.f6639b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Varint(value="
            r0.<init>(r1)
            long r1 = r3.f6638a
            r0.append(r1)
            java.lang.String r1 = ", next="
            r0.append(r1)
            int r1 = r3.f6639b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
