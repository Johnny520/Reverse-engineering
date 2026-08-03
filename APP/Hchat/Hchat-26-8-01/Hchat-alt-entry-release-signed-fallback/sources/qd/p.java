package qd;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends qd.l implements qd.o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public java.lang.String f10906l;

    public p(java.lang.String r1, qd.j r2) {
            r0 = this;
            r0.<init>()
            r0.f10906l = r1
            r0.f10902i = r2
            return
    }

    @Override // qd.l
    public final qd.l H() {
            r3 = this;
            qd.p r0 = new qd.p
            java.lang.String r1 = r3.f10906l
            qd.j r2 = r3.f10902i
            r0.<init>(r1, r2)
            r0.B(r3)
            ud.p r1 = r3.f10903j
            r0.V(r1)
            return r0
    }

    @Override // qd.l
    public final java.lang.String X() {
            r1 = this;
            java.lang.String r0 = r1.f10906l
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof qd.p
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            java.lang.String r0 = r1.f10906l
            qd.p r2 = (qd.p) r2
            java.lang.String r2 = r2.f10906l
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // qd.o
    public final java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.f10906l
            return r0
    }

    public final int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.f10906l
            int r0 = r0.hashCode()
            return r0
    }

    @Override // qd.o
    public final void p(java.lang.String r1) {
            r0 = this;
            r0.f10906l = r1
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = r5.f10906l
            qd.j r1 = r5.f10902i
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " "
            java.lang.String r3 = ")"
            java.lang.String r4 = "("
            java.lang.String r0 = bc.e.k(r4, r0, r2, r1, r3)
            return r0
    }
}
