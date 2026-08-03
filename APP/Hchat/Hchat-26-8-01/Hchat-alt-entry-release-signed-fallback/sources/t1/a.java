package t1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f12978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12979b;

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof t1.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t1.a r8 = (t1.a) r8
            long r3 = r7.f12978a
            long r5 = r8.f12978a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            float r1 = r7.f12979b
            float r8 = r8.f12979b
            int r8 = java.lang.Float.compare(r1, r8)
            if (r8 == 0) goto L20
            return r2
        L20:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f12978a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f12979b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DataPointAtTime(time="
            r0.<init>(r1)
            long r1 = r3.f12978a
            r0.append(r1)
            java.lang.String r1 = ", dataPoint="
            r0.append(r1)
            float r1 = r3.f12979b
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
