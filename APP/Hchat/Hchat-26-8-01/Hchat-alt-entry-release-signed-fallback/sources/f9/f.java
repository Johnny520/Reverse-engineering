package f9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3367b;

    public f(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f3366a = r1
            r0.f3367b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L19
        L3:
            boolean r0 = r3 instanceof f9.f
            if (r0 != 0) goto L8
            goto L17
        L8:
            f9.f r3 = (f9.f) r3
            boolean r0 = r2.f3366a
            boolean r1 = r3.f3366a
            if (r0 == r1) goto L11
            goto L17
        L11:
            boolean r0 = r2.f3367b
            boolean r3 = r3.f3367b
            if (r0 == r3) goto L19
        L17:
            r3 = 0
            return r3
        L19:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.f3366a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r2.f3367b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageWriteResult(success="
            r0.<init>(r1)
            boolean r1 = r2.f3366a
            r0.append(r1)
            java.lang.String r1 = ", notified="
            r0.append(r1)
            boolean r1 = r2.f3367b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
