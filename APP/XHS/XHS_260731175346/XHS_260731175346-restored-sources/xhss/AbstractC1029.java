package xhss;

/* JADX INFO: renamed from: xhss.ᲇᛴᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1029 {

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static final xhss.AbstractC1029 f3332 = null;

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
            xhss.ᛸᲀᛷᛲ r6 = new xhss.ᛸᲀᛷᛲ     // Catch: java.lang.Exception -> L29
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
            xhss.ᛳᛸᛲᛶ r6 = new xhss.ᛳᛸᛲᛶ     // Catch: java.lang.Exception -> L5b
            r6.<init>(r2, r4)     // Catch: java.lang.Exception -> L5b
            goto L73
        L5b:
            java.lang.Class<java.io.ObjectInputStream> r2 = java.io.ObjectInputStream.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1, r1}     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r1)     // Catch: java.lang.Exception -> L6e
            r0.setAccessible(r3)     // Catch: java.lang.Exception -> L6e
            xhss.ᲈᲈᲇᛵ r6 = new xhss.ᲈᲈᲇᛵ     // Catch: java.lang.Exception -> L6e
            r6.<init>(r0)     // Catch: java.lang.Exception -> L6e
            goto L73
        L6e:
            xhss.ᲀᛴᛱᛳ r6 = new xhss.ᲀᛴᛱᛳ
            r6.<init>()
        L73:
            xhss.AbstractC1029.f3332 = r6
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ */
    public abstract java.lang.Object mo621(java.lang.Class r1);
}
