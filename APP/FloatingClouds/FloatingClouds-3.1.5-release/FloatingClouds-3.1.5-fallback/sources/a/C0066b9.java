package a;

/* JADX INFO: renamed from: a.b9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0066b9 extends a.mh.b {
    public final android.view.View b;
    public int c;
    public int d;
    public final int[] e;

    public C0066b9(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = 2
            int[] r0 = new int[r0]
            r1.e = r0
            r1.b = r2
            return
    }

    @Override // a.mh.b
    public final a.nh a(a.nh r3, java.util.List<a.mh> r4) {
            r2 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r4.next()
            a.mh r0 = (a.mh) r0
            a.mh$e r1 = r0.f581a
            int r1 = r1.c()
            r1 = r1 & 8
            if (r1 == 0) goto L4
            int r4 = r2.d
            a.mh$e r0 = r0.f581a
            float r0 = r0.b()
            r1 = 0
            int r4 = a.C0434w0.c(r4, r1, r0)
            float r4 = (float) r4
            android.view.View r0 = r2.b
            r0.setTranslationY(r4)
        L2d:
            return r3
    }
}
