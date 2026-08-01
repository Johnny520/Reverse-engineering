package defpackage;

/* JADX INFO: renamed from: ᛵᛲᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0839 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.lang.reflect.Method f3860 = null;

    static {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.lang.reflect.Method[] r1 = r0.getMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L9:
            r5 = 0
            if (r4 >= r2) goto L2f
            r6 = r1[r4]
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "addSuppressed"
            boolean r7 = defpackage.AbstractC0498.m1280(r7, r8)
            if (r7 == 0) goto L2c
            java.lang.Class[] r7 = r6.getParameterTypes()
            int r8 = r7.length
            r9 = 1
            if (r8 != r9) goto L24
            r5 = r7[r3]
        L24:
            boolean r5 = defpackage.AbstractC0498.m1280(r5, r0)
            if (r5 == 0) goto L2c
            r5 = r6
            goto L2f
        L2c:
            int r4 = r4 + 1
            goto L9
        L2f:
            defpackage.AbstractC0839.f3860 = r5
            int r0 = r1.length
        L32:
            if (r3 >= r0) goto L46
            r2 = r1[r3]
            java.lang.String r2 = r2.getName()
            java.lang.String r4 = "getSuppressed"
            boolean r2 = defpackage.AbstractC0498.m1280(r2, r4)
            if (r2 == 0) goto L43
            goto L46
        L43:
            int r3 = r3 + 1
            goto L32
        L46:
            return
    }
}
