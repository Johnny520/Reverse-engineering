package hb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f5431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5432b;

    public l(java.util.List r1, long r2) {
            r0 = this;
            r0.<init>()
            r0.f5431a = r1
            r0.f5432b = r2
            return
    }

    public final boolean a() {
            r4 = this;
            java.util.List r0 = r4.f5431a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L18
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.f5432b
            long r0 = r0 - r2
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L1f
        L3:
            boolean r0 = r5 instanceof hb.l
            if (r0 != 0) goto L8
            goto L1d
        L8:
            hb.l r5 = (hb.l) r5
            java.util.List r0 = r4.f5431a
            java.util.List r1 = r5.f5431a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1d
        L15:
            long r0 = r4.f5432b
            long r2 = r5.f5432b
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L1f
        L1d:
            r5 = 0
            return r5
        L1f:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f5431a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            long r1 = r3.f5432b
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CachedContacts(items="
            r0.<init>(r1)
            java.util.List r1 = r3.f5431a
            r0.append(r1)
            java.lang.String r1 = ", savedAt="
            r0.append(r1)
            long r1 = r3.f5432b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
