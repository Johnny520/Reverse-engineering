package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qx {
    public static final java.lang.reflect.Method a = null;

    static {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.reflect.Method[] r1 = r0.getMethods()
            defpackage.ip.l(r1)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lc:
            r5 = 0
            if (r4 >= r2) goto L37
            r6 = r1[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "addSuppressed"
            boolean r7 = defpackage.ip.i(r7, r8)
            if (r7 == 0) goto L34
            java.lang.Class[] r7 = r6.getParameterTypes()
            java.lang.String r8 = "getParameterTypes(...)"
            defpackage.ip.n(r8, r7)
            int r8 = r7.length
            r9 = 1
            if (r8 != r9) goto L2c
            r5 = r7[r3]
        L2c:
            boolean r5 = defpackage.ip.i(r5, r0)
            if (r5 == 0) goto L34
            r5 = r6
            goto L37
        L34:
            int r4 = r4 + 1
            goto Lc
        L37:
            defpackage.qx.a = r5
            int r0 = r1.length
        L3a:
            if (r3 >= r0) goto L4e
            r2 = r1[r3]
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "getSuppressed"
            boolean r2 = defpackage.ip.i(r2, r4)
            if (r2 == 0) goto L4b
            return
        L4b:
            int r3 = r3 + 1
            goto L3a
        L4e:
            return
    }
}
