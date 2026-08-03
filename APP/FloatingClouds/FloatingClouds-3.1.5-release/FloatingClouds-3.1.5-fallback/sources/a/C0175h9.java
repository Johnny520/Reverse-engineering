package a;

/* JADX INFO: renamed from: a.h9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0175h9 extends a.AbstractC0040a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public java.util.List<a.C0115e3> f496a;
    public final int b;

    public C0175h9() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.b = r0
            return
    }

    @Override // a.AbstractC0040a2
    public final int b(a.B6 r6) {
            r5 = this;
            java.util.List<a.e3> r0 = r5.f496a
            r1 = 0
            if (r0 == 0) goto L38
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = a.C0312p3.g0(r0, r3)
            r2.<init>(r3)
            java.util.Iterator r0 = r0.iterator()
        L14:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r0.next()
            a.e3 r3 = (a.C0115e3) r3
            r3.getClass()
            int r3 = r3.b(r6)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.add(r3)
            goto L14
        L2f:
            int[] r0 = a.C0383t3.v0(r2)
            int r0 = r6.d(r0)
            goto L39
        L38:
            r0 = r1
        L39:
            int r2 = r5.b
            r3 = 1
            if (r2 == r3) goto L44
            r4 = 2
            if (r2 != r4) goto L42
            goto L45
        L42:
            r6 = 0
            throw r6
        L44:
            r3 = 0
        L45:
            r2 = 3
            r6.i(r2)
            r2 = 2
            r6.a(r2, r1)
            r6.a(r1, r0)
            if (r3 == 0) goto L68
            r0 = 1
            r6.h(r0, r1)
            java.nio.ByteBuffer r1 = r6.f26a
            int r2 = r6.b
            int r2 = r2 - r0
            r6.b = r2
            r1.put(r2, r3)
            int[] r1 = r6.d
            int r2 = r6.g()
            r1[r0] = r2
        L68:
            int r0 = r6.e()
            r6.f(r0)
            return r0
    }
}
