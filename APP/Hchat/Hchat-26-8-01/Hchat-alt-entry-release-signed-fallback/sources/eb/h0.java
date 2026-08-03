package eb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.Object f2551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f2552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f2553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2555e;

    public h0(java.lang.Object r1, java.lang.String r2, java.lang.String r3, int r4, int r5) {
            r0 = this;
            r2.getClass()
            r3.getClass()
            r0.<init>()
            r0.f2551a = r1
            r0.f2552b = r2
            r0.f2553c = r3
            r0.f2554d = r4
            r0.f2555e = r5
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof eb.h0
            if (r0 != 0) goto L8
            goto L38
        L8:
            eb.h0 r3 = (eb.h0) r3
            java.lang.Object r0 = r2.f2551a
            java.lang.Object r1 = r3.f2551a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L38
        L15:
            java.lang.String r0 = r2.f2552b
            java.lang.String r1 = r3.f2552b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L38
        L20:
            java.lang.String r0 = r2.f2553c
            java.lang.String r1 = r3.f2553c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L2b
            goto L38
        L2b:
            int r0 = r2.f2554d
            int r1 = r3.f2554d
            if (r0 == r1) goto L32
            goto L38
        L32:
            int r0 = r2.f2555e
            int r3 = r3.f2555e
            if (r0 == r3) goto L3a
        L38:
            r3 = 0
            return r3
        L3a:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.f2551a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f2552b
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r3.f2553c
            int r0 = eh.a.g(r0, r1, r2)
            int r2 = r3.f2554d
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f2555e
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AppliedTextDecoration(input="
            r0.<init>(r1)
            java.lang.Object r1 = r3.f2551a
            r0.append(r1)
            java.lang.String r1 = ", originalText="
            r0.append(r1)
            java.lang.String r1 = r3.f2552b
            r0.append(r1)
            java.lang.String r1 = ", decoratedText="
            r0.append(r1)
            java.lang.String r1 = r3.f2553c
            r0.append(r1)
            java.lang.String r1 = ", prefixLength="
            r0.append(r1)
            int r1 = r3.f2554d
            r0.append(r1)
            java.lang.String r1 = ", suffixLength="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r3.f2555e
            java.lang.String r0 = j8.b.j(r0, r2, r1)
            return r0
    }
}
