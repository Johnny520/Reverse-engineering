package p8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.Object f10353b;

    public f(java.lang.Object r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f10352a = r2
            r0.f10353b = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p8.f
            if (r0 != 0) goto L8
            goto L1b
        L8:
            p8.f r3 = (p8.f) r3
            boolean r0 = r2.f10352a
            boolean r1 = r3.f10352a
            if (r0 == r1) goto L11
            goto L1b
        L11:
            java.lang.Object r0 = r2.f10353b
            java.lang.Object r3 = r3.f10353b
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L1d
        L1b:
            r3 = 0
            return r3
        L1d:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.f10352a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f10353b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SnsCachedNativeLookup(querySucceeded="
            r0.<init>(r1)
            boolean r1 = r2.f10352a
            r0.append(r1)
            java.lang.String r1 = ", nativeInfo="
            r0.append(r1)
            java.lang.Object r1 = r2.f10353b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
