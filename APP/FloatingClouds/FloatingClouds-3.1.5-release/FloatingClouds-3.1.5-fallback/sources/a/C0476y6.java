package a;

/* JADX INFO: renamed from: a.y6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0476y6 extends a.Z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.List f768a;
    public a.C0115e3 b;

    public C0476y6() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // a.AbstractC0040a2
    public final int b(a.B6 r5) {
            r4 = this;
            java.util.List r0 = r4.f768a
            r1 = 0
            if (r0 == 0) goto L35
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2c
            java.lang.Object r3 = r0.next()
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r5.c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L14
        L2c:
            int[] r0 = a.C0383t3.v0(r2)
            int r0 = r5.d(r0)
            goto L36
        L35:
            r0 = r1
        L36:
            a.e3 r2 = r4.b
            if (r2 == 0) goto L3f
            int r2 = r2.b(r5)
            goto L40
        L3f:
            r2 = r1
        L40:
            r3 = 6
            r5.i(r3)
            r3 = 5
            r5.a(r3, r2)
            r2 = 3
            r5.a(r2, r1)
            r2 = 1
            r5.a(r2, r1)
            r5.a(r1, r0)
            int r0 = r5.e()
            r5.f(r0)
            return r0
    }
}
