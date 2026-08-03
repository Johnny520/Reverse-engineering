package ia;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6537b;

    public a(byte[] r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f6536a = r1
            r0.f6537b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof ia.a
            if (r0 != 0) goto L8
            goto L1b
        L8:
            ia.a r3 = (ia.a) r3
            byte[] r0 = r2.f6536a
            byte[] r1 = r3.f6536a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r0 = r2.f6537b
            boolean r3 = r3.f6537b
            if (r0 == r3) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            byte[] r0 = r2.f6536a
            int r0 = java.util.Arrays.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r2.f6537b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            byte[] r0 = r3.f6536a
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FakeInteractionMergeResult(bytes="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", changed="
            r1.append(r0)
            boolean r0 = r3.f6537b
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
