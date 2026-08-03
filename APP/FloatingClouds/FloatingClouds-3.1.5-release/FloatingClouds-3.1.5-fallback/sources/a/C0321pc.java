package a;

/* JADX INFO: renamed from: a.pc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0321pc extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.List<a.C0303oc> f641a;

    @Override // a.AbstractC0040a2
    public final int b(a.B6 r5) {
            r4 = this;
            java.util.List<a.oc> r0 = r4.f641a
            r1 = 0
            if (r0 == 0) goto L3e
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L35
            java.lang.Object r3 = r0.next()
            a.oc r3 = (a.C0303oc) r3
            if (r3 == 0) goto L27
        L22:
            int r3 = r3.b(r5)
            goto L2d
        L27:
            a.oc r3 = new a.oc
            r3.<init>()
            goto L22
        L2d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L14
        L35:
            int[] r0 = a.C0383t3.v0(r2)
            int r0 = r5.d(r0)
            goto L3f
        L3e:
            r0 = r1
        L3f:
            r2 = 2
            r5.i(r2)
            r2 = 1
            r5.a(r2, r1)
            r5.a(r1, r0)
            int r0 = r5.e()
            r5.f(r0)
            return r0
    }
}
