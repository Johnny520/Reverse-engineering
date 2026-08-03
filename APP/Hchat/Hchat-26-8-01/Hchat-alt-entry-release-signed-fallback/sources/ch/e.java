package ch;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public java.util.List f1665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fh.k f1666h;

    @Override // x6.d
    public final int G(g6.b r5) {
            r4 = this;
            java.util.List r0 = r4.f1665g
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
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r5.e(r3)
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
            fh.k r2 = r4.f1666h
            if (r2 == 0) goto L3d
            int r2 = r2.G(r5)
            goto L3e
        L3d:
            r2 = r1
        L3e:
            r3 = 7
            r5.n(r3)
            r3 = 6
            r5.c(r3, r2)
            r2 = 4
            r5.c(r2, r1)
            r2 = 3
            r5.c(r2, r1)
            r2 = 1
            r5.c(r2, r1)
            r5.c(r1, r0)
            int r0 = r5.g()
            r5.i(r0)
            return r0
    }
}
