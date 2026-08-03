package d7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends d7.s {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c7.g f2070m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2071n;

    public t(int r1, c7.g r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f2071n = r1
            r0.f2070m = r2
            return
    }

    @Override // d7.s
    public final int S(java.io.InputStream r6) {
            r5 = this;
            int r0 = r5.f2071n
            r1 = 0
            r5.M(r0, r1)
            byte[] r0 = r5.f11553k
            int r2 = r0.length
            int r0 = r6.read(r0, r1, r2)
            c7.g r3 = r5.f2070m
            if (r0 == r2) goto L27
            r5.M(r0, r1)
            c7.g r2 = r5.T()
            if (r2 != r3) goto L27
            int r2 = r5.p()
            r4 = 4
            if (r2 >= r4) goto L22
            goto L27
        L22:
            byte[] r2 = r5.f11553k
            k7.a.D(r2, r1, r1)
        L27:
            c7.g r1 = r5.T()
            if (r1 == r3) goto L2e
            return r0
        L2e:
            int r6 = r5.V(r6)
            int r6 = r6 + r0
            return r6
    }

    public final c7.g T() {
            r6 = this;
            int r0 = r6.p()
            r1 = 4
            r2 = 0
            if (r0 >= r1) goto La
            r0 = r2
            goto L10
        La:
            byte[] r0 = r6.f11553k
            int r0 = k7.a.s(r0, r2)
        L10:
            c7.g[] r1 = c7.g.f1049n
            int r3 = r1.length
        L13:
            if (r2 >= r3) goto L1f
            r4 = r1[r2]
            int r5 = r4.f1051g
            if (r0 != r5) goto L1c
            return r4
        L1c:
            int r2 = r2 + 1
            goto L13
        L1f:
            r0 = 0
            return r0
    }

    public final boolean U() {
            r2 = this;
            c7.g r0 = r2.T()
            c7.g r1 = r2.f2070m
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public int V(java.io.InputStream r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
