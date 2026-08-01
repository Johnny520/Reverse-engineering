package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class dt extends defpackage.ct {
    public static java.util.Map A(java.util.ArrayList r5) {
            int r0 = r5.size()
            if (r0 == 0) goto L48
            r1 = 1
            if (r0 == r1) goto L2e
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r5.size()
            int r1 = z(r1)
            r0.<init>(r1)
            int r1 = r5.size()
            r2 = 0
        L1b:
            if (r2 >= r1) goto L2d
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            kx r3 = (defpackage.kx) r3
            java.lang.Object r4 = r3.a
            java.lang.Object r3 = r3.b
            r0.put(r4, r3)
            goto L1b
        L2d:
            return r0
        L2e:
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            kx r5 = (defpackage.kx) r5
            java.lang.String r0 = "pair"
            defpackage.ip.o(r0, r5)
            java.lang.Object r0 = r5.a
            java.lang.Object r5 = r5.b
            java.util.Map r5 = java.util.Collections.singletonMap(r0, r5)
            java.lang.String r0 = "singletonMap(...)"
            defpackage.ip.n(r0, r5)
            return r5
        L48:
            zi r5 = defpackage.zi.a
            return r5
    }

    public static int z(int r1) {
            if (r1 >= 0) goto L3
            return r1
        L3:
            r0 = 3
            if (r1 >= r0) goto L9
            int r1 = r1 + 1
            return r1
        L9:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            r0 = 1061158912(0x3f400000, float:0.75)
            float r1 = r1 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            int r1 = (int) r1
            return r1
        L16:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }
}
