package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends r7.s {
    @Override // r7.s
    public final int S(r7.s r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = -1
            return r2
        L4:
            int r0 = r1.f7388g
            int r2 = r2.f7388g
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    @Override // r7.s
    public final void W() {
            r0 = this;
            return
    }

    @Override // r7.s, java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            r7.s r1 = (r7.s) r1
            int r1 = r0.S(r1)
            return r1
    }

    @Override // r7.s
    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<u7.d> r1 = u7.d.class
            k7.a r1 = r3.u(r1)
            u7.d r1 = (u7.d) r1
            int r2 = r3.f7388g
            if (r1 == 0) goto L19
            int r2 = r2 + 1
            r7.f r1 = r1.f13535t
            int r1 = r1.f11560n
            int r2 = r2 + r1
            goto L1b
        L19:
            int r2 = r2 + 1
        L1b:
            byte r1 = (byte) r2
            java.lang.String r1 = y7.a.n(r1)
            r0.append(r1)
            r1 = 58
            r0.append(r1)
            java.lang.String r1 = r3.f11578m
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
