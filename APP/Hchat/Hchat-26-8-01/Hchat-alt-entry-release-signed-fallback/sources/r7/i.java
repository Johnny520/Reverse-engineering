package r7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends r7.k {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f11563q;

    public /* synthetic */ i(int r1, int r2) {
            r0 = this;
            r0.f11563q = r2
            r0.<init>(r1)
            return
    }

    @Override // r7.k
    public final int P() {
            r2 = this;
            int r0 = r2.f11563q
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            byte[] r0 = r2.f11553k
            r1 = 0
            int r0 = k7.a.s(r0, r1)
            return r0
        Ld:
            byte[] r0 = r2.f11553k
            r1 = 0
            int r0 = k7.a.x(r0, r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r1) goto L1b
            r0 = -1
            goto L1d
        L1b:
            int r0 = r0 * 4
        L1d:
            return r0
    }

    @Override // r7.k
    public final void S(int r3) {
            r2 = this;
            int r0 = r2.f11563q
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            byte[] r0 = r2.f11553k
            r1 = 0
            k7.a.D(r0, r1, r3)
            return
        Lc:
            r0 = -1
            if (r3 != r0) goto L13
            r3 = 65535(0xffff, float:9.1834E-41)
            goto L18
        L13:
            int r3 = r3 / 4
            r7.k.R(r3)
        L18:
            byte[] r0 = r2.f11553k
            r1 = 0
            k7.a.E(r0, r1, r3)
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.f11563q
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            r7.k r2 = (r7.k) r2
            if (r2 != r1) goto Lb
            r2 = 0
            goto L17
        Lb:
            int r0 = r1.N()
            int r2 = r2.N()
            int r2 = y7.a.b(r0, r2)
        L17:
            return r2
        L18:
            r7.k r2 = (r7.k) r2
            if (r2 != r1) goto L1e
            r2 = 0
            goto L2a
        L1e:
            int r0 = r1.N()
            int r2 = r2.N()
            int r2 = y7.a.b(r0, r2)
        L2a:
            return r2
    }
}
