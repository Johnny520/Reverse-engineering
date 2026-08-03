package wb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.util.Set f15353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f15354c;

    public c6(boolean r1, java.util.Set r2, java.lang.String r3) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f15352a = r1
            r0.f15353b = r2
            r0.f15354c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof wb.c6
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            wb.c6 r5 = (wb.c6) r5
            boolean r1 = r4.f15352a
            boolean r3 = r5.f15352a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Set r1 = r4.f15353b
            java.util.Set r3 = r5.f15353b
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r1 = r4.f15354c
            java.lang.String r5 = r5.f15354c
            boolean r5 = gg.l.a(r1, r5)
            if (r5 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.f15352a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            java.util.Set r1 = r2.f15353b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r2.f15354c
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "MessageBlockRuleState(typeAll="
            r0.<init>(r1)
            boolean r1 = r3.f15352a
            r0.append(r1)
            java.lang.String r1 = ", types="
            r0.append(r1)
            java.util.Set r1 = r3.f15353b
            r0.append(r1)
            java.lang.String r1 = ", textKeywords="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r3.f15354c
            java.lang.String r0 = eh.a.r(r0, r2, r1)
            return r0
    }
}
