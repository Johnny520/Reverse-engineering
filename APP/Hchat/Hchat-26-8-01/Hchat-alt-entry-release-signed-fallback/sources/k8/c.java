package k8;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f7396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7397b;

    public c(java.lang.Object r1, int r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f7396a = r1
            r0.f7397b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof k8.c
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            k8.c r5 = (k8.c) r5
            java.lang.Object r1 = r4.f7396a
            java.lang.Object r3 = r5.f7396a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f7397b
            int r5 = r5.f7397b
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f7396a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r2.f7397b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SearchNode(value="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f7396a
            r0.append(r1)
            java.lang.String r1 = ", depth="
            r0.append(r1)
            int r1 = r2.f7397b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
