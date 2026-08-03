package ic;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements hc.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ud.r f6654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6655h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6656i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.String f6657j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6658k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ic.e f6659l;

    public d(ud.r r4, qd.s r5) {
            r3 = this;
            int r0 = r5.f10925g
            int r1 = r5.f10926h
            qd.k r2 = r5.b()
            qd.j r2 = r2.f10895b
            qd.k r5 = r5.b()
            java.lang.String r5 = r5.f10894a
            r3.<init>()
            r3.f6654g = r4
            r3.f6655h = r0
            r3.f6656i = r1
            r3.f6657j = r5
            ic.e r4 = new ic.e
            r4.<init>(r3)
            r3.f6659l = r4
            return
    }

    public static ic.d a(ud.r r2, qd.s r3) {
            qd.k r0 = r3.b()
            boolean r1 = r0.f10898e
            if (r1 == 0) goto La
            r2 = 0
            return r2
        La:
            ic.d r1 = r0.f10900g
            if (r1 == 0) goto Lf
            return r1
        Lf:
            ic.d r1 = new ic.d
            r1.<init>(r2, r3)
            r0.f10900g = r1
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof ic.d
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ic.d r5 = (ic.d) r5
            int r1 = r4.f6655h
            int r3 = r5.f6655h
            if (r1 != r3) goto L23
            int r1 = r4.f6656i
            int r3 = r5.f6656i
            if (r1 != r3) goto L23
            ud.r r1 = r4.f6654g
            ud.r r5 = r5.f6654g
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L23
            return r0
        L23:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f6655h
            int r0 = r0 * 31
            int r1 = r2.f6656i
            int r0 = r0 + r1
            int r0 = r0 * 31
            ud.r r1 = r2.f6654g
            od.d r1 = r1.f13717k
            int r1 = r1.f9783m
            int r0 = r0 + r1
            return r0
    }

    @Override // hc.a
    public final int j() {
            r1 = this;
            r0 = 5
            return r0
    }

    @Override // hc.c
    public final void t(int r1) {
            r0 = this;
            r0.f6658k = r1
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "v"
            java.lang.String r1 = "}"
            int r2 = r5.f6655h
            int r3 = r5.f6656i
            java.lang.String r4 = "VarNode{r"
            java.lang.String r0 = eh.a.k(r2, r3, r4, r0, r1)
            return r0
    }
}
