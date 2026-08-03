package f9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f3355b;

    public c(java.lang.Object r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f3354a = r2
            r0.f3355b = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L1f
        L3:
            boolean r0 = r5 instanceof f9.c
            if (r0 != 0) goto L8
            goto L1d
        L8:
            f9.c r5 = (f9.c) r5
            long r0 = r4.f3354a
            long r2 = r5.f3354a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L1d
        L13:
            java.lang.Object r0 = r4.f3355b
            java.lang.Object r5 = r5.f3355b
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L1f
        L1d:
            r5 = 0
            return r5
        L1f:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f3354a
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f3355b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MenuMessageBinding(msgId="
            r0.<init>(r1)
            long r1 = r3.f3354a
            r0.append(r1)
            java.lang.String r1 = ", nativeMessage="
            r0.append(r1)
            java.lang.Object r1 = r3.f3355b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
