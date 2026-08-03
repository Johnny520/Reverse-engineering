package uf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends m3.c implements java.util.Iterator, hg.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f13779k;

    public e(uf.g r1, int r2) {
            r0 = this;
            r0.f13779k = r2
            r1.getClass()
            r0.<init>()
            r0.f8716j = r1
            r2 = -1
            r0.f8714h = r2
            int r1 = r1.f13791n
            r0.f8715i = r1
            r0.d()
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f13779k
            switch(r0) {
                case 0: goto L4a;
                case 1: goto L2a;
                default: goto L5;
            }
        L5:
            r3.c()
            int r0 = r3.f8713g
            java.lang.Object r1 = r3.f8716j
            uf.g r1 = (uf.g) r1
            int r2 = r1.f13789l
            if (r0 >= r2) goto L25
            int r2 = r0 + 1
            r3.f8713g = r2
            r3.f8714h = r0
            java.lang.Object[] r0 = r1.f13785h
            r0.getClass()
            int r1 = r3.f8714h
            r0 = r0[r1]
            r3.d()
            goto L29
        L25:
            bsh.j.e()
            r0 = 0
        L29:
            return r0
        L2a:
            r3.c()
            int r0 = r3.f8713g
            java.lang.Object r1 = r3.f8716j
            uf.g r1 = (uf.g) r1
            int r2 = r1.f13789l
            if (r0 >= r2) goto L45
            int r2 = r0 + 1
            r3.f8713g = r2
            r3.f8714h = r0
            java.lang.Object[] r1 = r1.f13784g
            r0 = r1[r0]
            r3.d()
            goto L49
        L45:
            bsh.j.e()
            r0 = 0
        L49:
            return r0
        L4a:
            r3.c()
            int r0 = r3.f8713g
            java.lang.Object r1 = r3.f8716j
            uf.g r1 = (uf.g) r1
            int r2 = r1.f13789l
            if (r0 >= r2) goto L66
            int r2 = r0 + 1
            r3.f8713g = r2
            r3.f8714h = r0
            uf.f r2 = new uf.f
            r2.<init>(r1, r0)
            r3.d()
            goto L6a
        L66:
            bsh.j.e()
            r2 = 0
        L6a:
            return r2
    }
}
