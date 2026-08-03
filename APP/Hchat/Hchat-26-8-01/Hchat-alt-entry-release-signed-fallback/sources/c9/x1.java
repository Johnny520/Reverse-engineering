package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c9.u1 f1433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c9.v1 f1434b;

    public x1(c9.u1 r1, c9.v1 r2) {
            r0 = this;
            r0.<init>()
            r0.f1433a = r1
            r0.f1434b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof c9.x1
            if (r0 != 0) goto L8
            goto L1b
        L8:
            c9.x1 r3 = (c9.x1) r3
            c9.u1 r0 = r2.f1433a
            c9.u1 r1 = r3.f1433a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            c9.v1 r0 = r2.f1434b
            c9.v1 r3 = r3.f1434b
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
            c9.u1 r0 = r2.f1433a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            c9.v1 r1 = r2.f1434b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NativeGroupMenuTarget(target="
            r0.<init>(r1)
            c9.u1 r1 = r2.f1433a
            r0.append(r1)
            java.lang.String r1 = ", action="
            r0.append(r1)
            c9.v1 r1 = r2.f1434b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
