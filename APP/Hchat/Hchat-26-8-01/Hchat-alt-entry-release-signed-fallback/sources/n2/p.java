package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements n2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8971b;

    public p(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f8970a = r1
            r0.f8971b = r2
            return
    }

    @Override // n2.g
    public final void a(k5.n r5) {
            r4 = this;
            int r0 = r5.f7240j
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = r1
        L9:
            java.lang.Object r3 = r5.f7242l
            c8.a r3 = (c8.a) r3
            if (r0 == 0) goto L13
            r5.f7240j = r2
            r5.f7241k = r2
        L13:
            int r0 = r4.f8970a
            int r2 = r3.b()
            int r0 = r9.e0.r(r0, r1, r2)
            int r2 = r4.f8971b
            int r3 = r3.b()
            int r1 = r9.e0.r(r2, r1, r3)
            if (r0 == r1) goto L32
            if (r0 >= r1) goto L2f
            r5.g(r0, r1)
            return
        L2f:
            r5.g(r1, r0)
        L32:
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof n2.p
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n2.p r5 = (n2.p) r5
            int r1 = r5.f8970a
            int r3 = r4.f8970a
            if (r3 == r1) goto L13
            return r2
        L13:
            int r1 = r4.f8971b
            int r5 = r5.f8971b
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f8970a
            int r0 = r0 * 31
            int r1 = r2.f8971b
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SetComposingRegionCommand(start="
            r0.<init>(r1)
            int r1 = r3.f8970a
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r3.f8971b
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
