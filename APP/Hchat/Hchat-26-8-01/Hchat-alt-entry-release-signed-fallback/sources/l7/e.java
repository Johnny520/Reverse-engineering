package l7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends l7.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l7.l f7875r;

    public e(l7.l r1) {
            r0 = this;
            r0.f7875r = r1
            r0.<init>()
            return
    }

    @Override // l7.a, k7.c, k7.a
    public final void B(q7.b r2) {
            r1 = this;
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "Can't read on empty package"
            r2.<init>(r0)
            throw r2
    }

    @Override // k7.c, k7.a
    public final int C(java.io.ByteArrayOutputStream r2) {
            r1 = this;
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "Can't write on empty package"
            r2.<init>(r0)
            throw r2
    }

    @Override // l7.f
    public final int U() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // l7.f
    public final java.lang.String V() {
            r1 = this;
            java.lang.String r0 = "empty-package"
            return r0
    }

    @Override // l7.f
    public final l7.l Y() {
            r1 = this;
            l7.l r0 = r1.f7875r
            return r0
    }

    @Override // l7.f, l7.g
    public final u7.c a() {
            r1 = this;
            u7.b r0 = r1.f7877p
            return r0
    }

    @Override // l7.f, java.lang.Comparable
    public final int compareTo(java.lang.Object r2) {
            r1 = this;
            l7.f r2 = (l7.f) r2
            r0 = 0
            int r2 = r2.U()
            int r2 = java.lang.Integer.compare(r0, r2)
            return r2
    }

    @Override // l7.f
    public final boolean isEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // k7.c, k7.a
    public final int p() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // k7.c, k7.a
    public final byte[] r() {
            r1 = this;
            r0 = 0
            byte[] r0 = new byte[r0]
            return r0
    }

    @Override // l7.f, l7.a
    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "empty-package"
            return r0
    }

    @Override // k7.a
    public final boolean y() {
            r1 = this;
            r0 = 1
            return r0
    }
}
