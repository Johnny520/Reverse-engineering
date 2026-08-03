package fh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends x6.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.util.List f3948h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public gh.a f3949i;

    public /* synthetic */ j(int r1) {
            r0 = this;
            r0.f3947g = r1
            r0.<init>()
            return
    }

    @Override // x6.d
    public final int G(g6.b r5) {
            r4 = this;
            int r0 = r4.f3947g
            switch(r0) {
                case 0: goto L5f;
                default: goto L5;
            }
        L5:
            java.util.List r0 = r4.f3948h
            r1 = 0
            if (r0 == 0) goto L41
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L38
            java.lang.Object r3 = r0.next()
            fh.m r3 = (fh.m) r3
            if (r3 == 0) goto L2a
        L25:
            int r3 = r3.G(r5)
            goto L30
        L2a:
            fh.m r3 = new fh.m
            r3.<init>()
            goto L25
        L30:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L17
        L38:
            int[] r0 = tf.m.O1(r2)
            int r0 = r5.f(r0)
            goto L42
        L41:
            r0 = r1
        L42:
            gh.a r2 = r4.f3949i
            if (r2 == 0) goto L4b
            int r2 = r2.G(r5)
            goto L4c
        L4b:
            r2 = r1
        L4c:
            r3 = 2
            r5.n(r3)
            r3 = 1
            r5.c(r3, r2)
            r5.c(r1, r0)
            int r0 = r5.g()
            r5.i(r0)
            return r0
        L5f:
            java.util.List r0 = r4.f3948h
            r1 = 0
            if (r0 == 0) goto L92
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = tf.n.e1(r0)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L71:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L89
            java.lang.Object r3 = r0.next()
            fh.i r3 = (fh.i) r3
            int r3 = r3.G(r5)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L71
        L89:
            int[] r0 = tf.m.O1(r2)
            int r0 = r5.f(r0)
            goto L93
        L92:
            r0 = r1
        L93:
            gh.a r2 = r4.f3949i
            if (r2 == 0) goto L9c
            int r2 = r2.G(r5)
            goto L9d
        L9c:
            r2 = r1
        L9d:
            r3 = 3
            r5.n(r3)
            r3 = 2
            r5.c(r3, r2)
            r5.c(r1, r0)
            int r0 = r5.g()
            r5.i(r0)
            return r0
    }

    public void k0(fh.m r2) {
            r1 = this;
            java.util.List r0 = r1.f3948h
            if (r0 != 0) goto L9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            r1.f3948h = r0
            r0.add(r2)
            return
    }
}
