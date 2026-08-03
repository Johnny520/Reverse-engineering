package n2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements n2.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8975b;

    public r(int r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f8974a = r1
            r0.f8975b = r2
            return
    }

    @Override // n2.g
    public final void a(k5.n r5) {
            r4 = this;
            java.lang.Object r0 = r5.f7242l
            c8.a r0 = (c8.a) r0
            int r0 = r0.b()
            int r1 = r4.f8974a
            r2 = 0
            int r0 = r9.e0.r(r1, r2, r0)
            java.lang.Object r1 = r5.f7242l
            c8.a r1 = (c8.a) r1
            int r1 = r1.b()
            int r3 = r4.f8975b
            int r1 = r9.e0.r(r3, r2, r1)
            if (r0 >= r1) goto L23
            r5.h(r0, r1)
            return
        L23:
            r5.h(r1, r0)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof n2.r
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n2.r r5 = (n2.r) r5
            int r1 = r5.f8974a
            int r3 = r4.f8974a
            if (r3 == r1) goto L13
            return r2
        L13:
            int r1 = r4.f8975b
            int r5 = r5.f8975b
            if (r1 == r5) goto L1a
            return r2
        L1a:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f8974a
            int r0 = r0 * 31
            int r1 = r2.f8975b
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SetSelectionCommand(start="
            r0.<init>(r1)
            int r1 = r3.f8974a
            r0.append(r1)
            java.lang.String r1 = ", end="
            r0.append(r1)
            int r1 = r3.f8975b
            r2 = 41
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
