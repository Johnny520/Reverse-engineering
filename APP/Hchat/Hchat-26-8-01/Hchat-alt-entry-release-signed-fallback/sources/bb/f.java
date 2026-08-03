package bb;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9.f f649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f650c;

    public f(java.lang.String r1, y9.f r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f648a = r1
            r0.f649b = r2
            r0.f650c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof bb.f
            if (r0 != 0) goto L8
            goto L26
        L8:
            bb.f r3 = (bb.f) r3
            java.lang.String r0 = r2.f648a
            java.lang.String r1 = r3.f648a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            y9.f r0 = r2.f649b
            y9.f r1 = r3.f649b
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L20
            goto L26
        L20:
            int r0 = r2.f650c
            int r3 = r3.f650c
            if (r0 == r3) goto L28
        L26:
            r3 = 0
            return r3
        L28:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f648a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            y9.f r1 = r2.f649b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f650c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SuffixPart(text="
            r0.<init>(r1)
            java.lang.String r1 = r3.f648a
            r0.append(r1)
            java.lang.String r1 = ", color="
            r0.append(r1)
            y9.f r1 = r3.f649b
            r0.append(r1)
            java.lang.String r1 = ", weight="
            r0.append(r1)
            java.lang.String r1 = ")"
            int r2 = r3.f650c
            java.lang.String r0 = j8.b.j(r0, r2, r1)
            return r0
    }
}
