package fh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.util.List f3958g;

    @Override // x6.d
    public final int G(g6.b r5) {
            r4 = this;
            java.util.List r0 = r4.f3958g
            r1 = 0
            if (r0 == 0) goto L33
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2a
            java.lang.Object r3 = r0.next()
            fh.k r3 = (fh.k) r3
            int r3 = r3.G(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L12
        L2a:
            int[] r0 = tf.m.O1(r2)
            int r0 = r5.f(r0)
            goto L34
        L33:
            r0 = r1
        L34:
            r2 = 3
            r5.n(r2)
            r2 = 2
            r5.c(r2, r1)
            r5.c(r1, r0)
            int r0 = r5.g()
            r5.i(r0)
            return r0
    }

    public final void k0(fh.k r2) {
            r1 = this;
            java.util.List r0 = r1.f3958g
            if (r0 != 0) goto L9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            r1.f3958g = r0
            r0.add(r2)
            return
    }
}
