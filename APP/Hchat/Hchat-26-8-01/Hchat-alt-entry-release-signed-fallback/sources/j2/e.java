package j2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6682c;

    public e(int r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f6680a = r1
            r0.f6681b = r2
            r0.f6682c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof j2.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            j2.e r5 = (j2.e) r5
            int r1 = r4.f6680a
            int r3 = r5.f6680a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f6681b
            int r3 = r5.f6681b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            boolean r1 = r4.f6682c
            boolean r5 = r5.f6682c
            if (r1 == r5) goto L21
            return r2
        L21:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.f6680a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f6681b
            int r0 = eh.a.e(r2, r0, r1)
            boolean r1 = r3.f6682c
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BidiRun(start="
            r0.<init>(r1)
            int r1 = r2.f6680a
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r2.f6681b
            r0.append(r1)
            java.lang.String r1 = ", isRtl="
            r0.append(r1)
            boolean r1 = r2.f6682c
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
