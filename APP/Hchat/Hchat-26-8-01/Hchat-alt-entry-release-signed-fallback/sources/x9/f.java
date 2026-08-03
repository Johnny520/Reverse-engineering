package x9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f21416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21417b;

    public f(java.lang.String r1, boolean r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f21416a = r1
            r0.f21417b = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof x9.f
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            x9.f r5 = (x9.f) r5
            java.lang.String r1 = r4.f21416a
            java.lang.String r3 = r5.f21416a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            boolean r1 = r4.f21417b
            boolean r5 = r5.f21417b
            if (r1 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f21416a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r2.f21417b
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "KeywordRule(keyword="
            r0.<init>(r1)
            java.lang.String r1 = r2.f21416a
            r0.append(r1)
            java.lang.String r1 = ", wholeWord="
            r0.append(r1)
            boolean r1 = r2.f21417b
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
