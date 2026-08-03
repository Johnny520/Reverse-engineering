package a;

/* JADX INFO: loaded from: classes.dex */
public final class xh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> f764a = null;
    public static final java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> b = null;

    public static final class a {
        public static android.database.Cursor a(java.lang.Object r6, java.lang.String r7, java.lang.Object[] r8) {
                java.lang.String r0 = "rawQuery"
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                java.lang.String r2 = "sql"
                a.C0193i9.e(r7, r2)
                r2 = 0
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                r4 = 0
                java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)     // Catch: java.lang.Throwable -> L5a
                java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L5a
                java.lang.Class r5 = r6.getClass()     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.Throwable -> L5a
                java.lang.Class[] r3 = new java.lang.Class[]{r1, r3}     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.Throwable -> L5a
                java.lang.reflect.Method r3 = r5.getMethod(r0, r3)     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.Throwable -> L5a
                java.lang.Object[] r5 = new java.lang.Object[]{r7, r8}     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.Throwable -> L5a
                java.lang.Object r3 = r3.invoke(r6, r5)     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.Throwable -> L5a
                boolean r5 = r3 instanceof android.database.Cursor     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.Throwable -> L5a
                if (r5 == 0) goto L5a
                android.database.Cursor r3 = (android.database.Cursor) r3     // Catch: java.lang.NoSuchMethodException -> L31 java.lang.Throwable -> L5a
                r2 = r3
                goto L5a
            L31:
                java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Throwable -> L5a
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r1, r4)     // Catch: java.lang.Throwable -> L5a
                java.lang.Class r4 = r4.getClass()     // Catch: java.lang.Throwable -> L5a
                java.lang.Class[] r1 = new java.lang.Class[]{r1, r4}     // Catch: java.lang.Throwable -> L5a
                java.lang.reflect.Method r0 = r3.getMethod(r0, r1)     // Catch: java.lang.Throwable -> L5a
                if (r8 == 0) goto L4a
                java.lang.String[] r8 = (java.lang.String[]) r8     // Catch: java.lang.Throwable -> L5a
                goto L4b
            L4a:
                r8 = r2
            L4b:
                java.lang.Object[] r7 = new java.lang.Object[]{r7, r8}     // Catch: java.lang.Throwable -> L5a
                java.lang.Object r6 = r0.invoke(r6, r7)     // Catch: java.lang.Throwable -> L5a
                boolean r7 = r6 instanceof android.database.Cursor     // Catch: java.lang.Throwable -> L5a
                if (r7 == 0) goto L5a
                android.database.Cursor r6 = (android.database.Cursor) r6     // Catch: java.lang.Throwable -> L5a
                r2 = r6
            L5a:
                return r2
        }
    }

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            a.xh.f764a = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            a.xh.b = r0
            return
    }
}
