package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class j0 extends g3.i0 {
    public j0(g3.r0 r1, android.view.WindowInsets r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public j0(g3.r0 r1, g3.j0 r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // g3.n0
    public g3.r0 a() {
            r2 = this;
            android.view.WindowInsets r0 = r2.f4208c
            android.view.WindowInsets r0 = b0.b0.e(r0)
            r1 = 0
            g3.r0 r0 = g3.r0.c(r0, r1)
            return r0
    }

    @Override // g3.h0, g3.n0
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof g3.j0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            g3.j0 r5 = (g3.j0) r5
            android.view.WindowInsets r1 = r4.f4208c
            android.view.WindowInsets r3 = r5.f4208c
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            b3.a r1 = r4.f4212g
            b3.a r3 = r5.f4212g
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L2b
            int r1 = r4.f4213h
            int r5 = r5.f4213h
            boolean r5 = g3.h0.C(r1, r5)
            if (r5 == 0) goto L2b
            return r0
        L2b:
            return r2
    }

    @Override // g3.n0
    public g3.d f() {
            r2 = this;
            android.view.WindowInsets r0 = r2.f4208c
            android.view.DisplayCutout r0 = b0.b0.c(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            g3.d r1 = new g3.d
            r1.<init>(r0)
            return r1
    }

    @Override // g3.n0
    public int hashCode() {
            r1 = this;
            android.view.WindowInsets r0 = r1.f4208c
            int r0 = r0.hashCode()
            return r0
    }
}
