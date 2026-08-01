package defpackage;

/* JADX INFO: renamed from: ᛲᛷᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0330 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final defpackage.AbstractC0330 f1704 = null;

    static {
            java.lang.String r0 = "newInstance"
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            r2 = 0
            r3 = 1
            java.lang.String r4 = "sun.misc.Unsafe"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = "theUnsafe"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L29
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r5.get(r2)     // Catch: java.lang.Exception -> L29
            java.lang.String r6 = "allocateInstance"
            java.lang.Class[] r7 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L29
            java.lang.reflect.Method r4 = r4.getMethod(r6, r7)     // Catch: java.lang.Exception -> L29
            ᛱᲁᛱᛳ r6 = new ᛱᲁᛱᛳ     // Catch: java.lang.Exception -> L29
            r6.<init>(r4, r5)     // Catch: java.lang.Exception -> L29
            goto L73
        L29:
            java.lang.Class<java.io.ObjectStreamClass> r4 = java.io.ObjectStreamClass.class
            java.lang.String r5 = "getConstructorId"
            java.lang.Class[] r6 = new java.lang.Class[]{r1}     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r5 = r4.getDeclaredMethod(r5, r6)     // Catch: java.lang.Exception -> L5b
            r5.setAccessible(r3)     // Catch: java.lang.Exception -> L5b
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L5b
            java.lang.Object r2 = r5.invoke(r2, r6)     // Catch: java.lang.Exception -> L5b
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Exception -> L5b
            int r2 = r2.intValue()     // Catch: java.lang.Exception -> L5b
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5b
            java.lang.Class[] r5 = new java.lang.Class[]{r1, r5}     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r0, r5)     // Catch: java.lang.Exception -> L5b
            r4.setAccessible(r3)     // Catch: java.lang.Exception -> L5b
            ᛶᛴᛱᛵ r6 = new ᛶᛴᛱᛵ     // Catch: java.lang.Exception -> L5b
            r6.<init>(r4, r2)     // Catch: java.lang.Exception -> L5b
            goto L73
        L5b:
            java.lang.Class<java.io.ObjectInputStream> r2 = java.io.ObjectInputStream.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r1}     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r1)     // Catch: java.lang.Exception -> L6e
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L6e
            ᲀᛲᲁᛶ r6 = new ᲀᛲᲁᛶ     // Catch: java.lang.Exception -> L6e
            r6.<init>(r0)     // Catch: java.lang.Exception -> L6e
            goto L73
        L6e:
            ᛳᛱᛷᛳ r6 = new ᛳᛱᛷᛳ
            r6.<init>()
        L73:
            defpackage.AbstractC0330.f1704 = r6
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public abstract java.lang.Object mo707(java.lang.Class r1);
}
