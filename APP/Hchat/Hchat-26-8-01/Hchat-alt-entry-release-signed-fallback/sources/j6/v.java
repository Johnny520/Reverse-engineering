package j6;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j6.v f6769a = null;

    static {
            java.lang.String r0 = "newInstance"
            java.lang.Class<java.io.ObjectStreamClass> r1 = java.io.ObjectStreamClass.class
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            r3 = 0
            r4 = 1
            java.lang.String r5 = "sun.misc.Unsafe"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L2b
            java.lang.String r6 = "theUnsafe"
            java.lang.reflect.Field r6 = r5.getDeclaredField(r6)     // Catch: java.lang.Exception -> L2b
            r6.setAccessible(r4)     // Catch: java.lang.Exception -> L2b
            java.lang.Object r6 = r6.get(r3)     // Catch: java.lang.Exception -> L2b
            java.lang.String r7 = "allocateInstance"
            java.lang.Class[] r8 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r5 = r5.getMethod(r7, r8)     // Catch: java.lang.Exception -> L2b
            j6.r r7 = new j6.r     // Catch: java.lang.Exception -> L2b
            r7.<init>(r5, r6)     // Catch: java.lang.Exception -> L2b
            goto L73
        L2b:
            java.lang.String r5 = "getConstructorId"
            java.lang.Class[] r6 = new java.lang.Class[]{r2}     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r5 = r1.getDeclaredMethod(r5, r6)     // Catch: java.lang.Exception -> L5b
            r5.setAccessible(r4)     // Catch: java.lang.Exception -> L5b
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Exception -> L5b
            java.lang.Object r3 = r5.invoke(r3, r6)     // Catch: java.lang.Exception -> L5b
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Exception -> L5b
            int r3 = r3.intValue()     // Catch: java.lang.Exception -> L5b
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> L5b
            java.lang.Class[] r5 = new java.lang.Class[]{r2, r5}     // Catch: java.lang.Exception -> L5b
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r0, r5)     // Catch: java.lang.Exception -> L5b
            r1.setAccessible(r4)     // Catch: java.lang.Exception -> L5b
            j6.s r7 = new j6.s     // Catch: java.lang.Exception -> L5b
            r7.<init>(r1, r3)     // Catch: java.lang.Exception -> L5b
            goto L73
        L5b:
            java.lang.Class<java.io.ObjectInputStream> r1 = java.io.ObjectInputStream.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r2}     // Catch: java.lang.Exception -> L6e
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r0, r2)     // Catch: java.lang.Exception -> L6e
            r0.setAccessible(r4)     // Catch: java.lang.Exception -> L6e
            j6.t r7 = new j6.t     // Catch: java.lang.Exception -> L6e
            r7.<init>(r0)     // Catch: java.lang.Exception -> L6e
            goto L73
        L6e:
            j6.u r7 = new j6.u
            r7.<init>()
        L73:
            j6.v.f6769a = r7
            return
    }

    public abstract java.lang.Object a(java.lang.Class r1);
}
