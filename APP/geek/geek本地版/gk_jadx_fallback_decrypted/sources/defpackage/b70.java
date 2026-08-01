package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b70 {
    public java.util.HashMap a;
    public double b;
    public double c;

    public static defpackage.b70 a(double r16, double r18) {
            b70 r6 = new b70
            r4 = 4632233691727265792(0x4049000000000000, double:50.0)
            r0 = r16
            r2 = r18
            mo r7 = defpackage.mo.a(r0, r2, r4)
            r8 = r4
            double r0 = r7.a
            double r0 = r0 - r18
            double r0 = java.lang.Math.abs(r0)
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r12 = r0
            r14 = r10
        L19:
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2d
            long r0 = java.lang.Math.round(r18)
            double r2 = r7.a
            long r2 = java.lang.Math.round(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L30
        L2d:
            r2 = r18
            goto L61
        L30:
            double r4 = r8 + r14
            r0 = r16
            r2 = r18
            mo r4 = defpackage.mo.a(r0, r2, r4)
            double r0 = r4.a
            double r0 = r0 - r18
            double r0 = java.lang.Math.abs(r0)
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 >= 0) goto L48
            r12 = r0
            r7 = r4
        L48:
            double r4 = r8 - r14
            r0 = r16
            r2 = r18
            mo r4 = defpackage.mo.a(r0, r2, r4)
            double r0 = r4.a
            double r0 = r0 - r2
            double r0 = java.lang.Math.abs(r0)
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 >= 0) goto L5f
            r12 = r0
            r7 = r4
        L5f:
            double r14 = r14 + r10
            goto L19
        L61:
            r6.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.a = r0
            r0 = r16
            r6.b = r0
            r6.c = r2
            return r6
    }

    public final int b(int r9) {
            r8 = this;
            java.util.HashMap r0 = r8.a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L24
            double r2 = r8.b
            double r4 = r8.c
            double r6 = (double) r9
            mo r1 = defpackage.mo.a(r2, r4, r6)
            int r1 = r1.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r0.put(r9, r1)
        L24:
            int r9 = r1.intValue()
            return r9
    }
}
