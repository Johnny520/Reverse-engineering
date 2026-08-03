package m7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends r7.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m7.t f8762m;

    public s(m7.t r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.f8762m = r2
            return
    }

    @Override // r7.b, k7.a
    public final void B(q7.b r4) {
            r3 = this;
            m7.t r0 = r3.f8762m
            r7.a r1 = r0.f8765s
            int r1 = r1.f11551o
            r2 = 0
            if (r1 != 0) goto Lb
            r0 = r2
            goto L14
        Lb:
            m.a r0 = r0.f8771y
            int r0 = r0.get()
            int r1 = r4.f10666k
            int r0 = r0 - r1
        L14:
            r3.M(r0, r2)
            super.B(r4)
            return
    }

    @Override // r7.b, k7.a
    public final byte[] r() {
            r1 = this;
            byte[] r0 = r1.f11553k
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "size = "
            r0.<init>(r1)
            int r1 = r2.p()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
