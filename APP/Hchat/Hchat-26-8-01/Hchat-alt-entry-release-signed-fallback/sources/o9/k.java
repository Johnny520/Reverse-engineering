package o9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f9642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.List f9643b;

    public k(java.lang.String r1, java.util.List r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f9642a = r1
            r0.f9643b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof o9.k
            if (r0 != 0) goto L8
            goto L1f
        L8:
            o9.k r3 = (o9.k) r3
            java.lang.String r0 = r2.f9642a
            java.lang.String r1 = r3.f9642a
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.util.List r0 = r2.f9643b
            java.util.List r3 = r3.f9643b
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f9642a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r2.f9643b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParsedAtContent(content="
            r0.<init>(r1)
            java.lang.String r1 = r2.f9642a
            r0.append(r1)
            java.lang.String r1 = ", atList="
            r0.append(r1)
            java.util.List r1 = r2.f9643b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
