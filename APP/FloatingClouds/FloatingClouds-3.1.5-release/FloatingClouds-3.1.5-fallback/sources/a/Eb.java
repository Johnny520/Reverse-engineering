package a;

/* JADX INFO: loaded from: classes.dex */
public final class Eb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.Eb f74a = null;

    static {
            a.Eb r0 = new a.Eb
            r0.<init>()
            a.Eb.f74a = r0
            return
    }

    public static boolean a(java.lang.String r8, boolean r9) {
            java.lang.String r0 = "MuteService"
            r1 = 0
            java.util.concurrent.ConcurrentHashMap<java.lang.String, a.G4> r2 = a.xh.f764a     // Catch: java.lang.Throwable -> L33
            java.util.Set r2 = r2.entrySet()     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = "<get-entries>(...)"
            a.C0193i9.d(r2, r3)     // Catch: java.lang.Throwable -> L33
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L33
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L35
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L33
            r4 = r3
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = "<get-key>(...)"
            a.C0193i9.d(r4, r5)     // Catch: java.lang.Throwable -> L33
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = "EnMicroMsg"
            boolean r4 = a.Be.I(r4, r5, r1)     // Catch: java.lang.Throwable -> L33
            if (r4 == 0) goto L12
            goto L36
        L33:
            r8 = move-exception
            goto La7
        L35:
            r3 = 0
        L36:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L33
            if (r3 == 0) goto L9d
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L33
            a.G4 r2 = (a.G4) r2     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L9d
            java.lang.Object r2 = r2.f96a     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L47
            goto L9d
        L47:
            if (r9 == 0) goto L4c
            java.lang.String r3 = "UPDATE rcontact SET type = type | 512 WHERE username = ?"
            goto L4e
        L4c:
            java.lang.String r3 = "UPDATE rcontact SET type = type & ~512 WHERE username = ?"
        L4e:
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = "execSQL"
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class<java.lang.Object[]> r7 = java.lang.Object[].class
            java.lang.Class[] r6 = new java.lang.Class[]{r6, r7}     // Catch: java.lang.Throwable -> L33
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.Throwable -> L33
            java.lang.String[] r5 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r5 = new java.lang.Object[]{r3, r5}     // Catch: java.lang.Throwable -> L33
            r4.invoke(r2, r5)     // Catch: java.lang.Throwable -> L33
            boolean r9 = c(r2, r8, r9)     // Catch: java.lang.Throwable -> L33
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r2.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = "setMuteViaDb execSQL verify="
            r2.append(r4)     // Catch: java.lang.Throwable -> L33
            r2.append(r9)     // Catch: java.lang.Throwable -> L33
            java.lang.String r4 = ": "
            r2.append(r4)     // Catch: java.lang.Throwable -> L33
            r2.append(r3)     // Catch: java.lang.Throwable -> L33
            java.lang.String r3 = " [wxid="
            r2.append(r3)     // Catch: java.lang.Throwable -> L33
            r2.append(r8)     // Catch: java.lang.Throwable -> L33
            java.lang.String r8 = "]"
            r2.append(r8)     // Catch: java.lang.Throwable -> L33
            java.lang.String r8 = r2.toString()     // Catch: java.lang.Throwable -> L33
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r8}     // Catch: java.lang.Throwable -> L33
            a.C0453x1.b(r8)     // Catch: java.lang.Throwable -> L33
            return r9
        L9d:
            java.lang.String r8 = "setMuteViaDb: no EnMicroMsg DB instance"
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r8}     // Catch: java.lang.Throwable -> L33
            a.C0453x1.e(r8)     // Catch: java.lang.Throwable -> L33
            return r1
        La7:
            java.lang.String r9 = "setMuteViaDb FAILED"
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r9, r8}
            a.C0453x1.a(r8)
            return r1
    }

    public static void b(java.lang.String r6, boolean r7, java.lang.ClassLoader r8) {
            java.lang.String r0 = "MuteService"
            java.lang.String r1 = "setMuteViaJavaLayer: e01.e2.Q="
            java.lang.String r2 = "setMuteViaJavaLayer: already "
            java.lang.String r3 = "e01.e2"
            r4 = 0
            java.lang.Class r8 = java.lang.Class.forName(r3, r4, r8)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "Q"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.Throwable -> L2e
            java.lang.reflect.Method r8 = r8.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L2e
            r3 = 1
            r8.setAccessible(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            java.lang.Object r6 = r8.invoke(r3, r6)     // Catch: java.lang.Throwable -> L2e
            boolean r8 = r6 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L30
            r3 = r6
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r6 = move-exception
            goto L6a
        L30:
            if (r3 == 0) goto L36
            boolean r4 = r3.booleanValue()     // Catch: java.lang.Throwable -> L2e
        L36:
            if (r4 != r7) goto L51
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L2e
            r6.append(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = ", skip"
            r6.append(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}     // Catch: java.lang.Throwable -> L2e
            a.C0453x1.b(r6)     // Catch: java.lang.Throwable -> L2e
            return
        L51:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L2e
            r6.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r7 = ", DB write should have handled it"
            r6.append(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r6}     // Catch: java.lang.Throwable -> L2e
            a.C0453x1.e(r6)     // Catch: java.lang.Throwable -> L2e
            return
        L6a:
            java.lang.String r7 = "setMuteViaJavaLayer FAILED"
            java.lang.Object[] r6 = new java.lang.Object[]{r0, r7, r6}
            a.C0453x1.a(r6)
            return
    }

    public static boolean c(java.lang.Object r5, java.lang.String r6, boolean r7) {
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "rawQuery"
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r4 = 0
            java.lang.Object r3 = java.lang.reflect.Array.newInstance(r3, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.Class r3 = r3.getClass()     // Catch: java.lang.Throwable -> L5f
            java.lang.Class[] r2 = new java.lang.Class[]{r2, r3}     // Catch: java.lang.Throwable -> L5f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r1 = "SELECT type FROM rcontact WHERE username=?"
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L5f
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r6}     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = r0.invoke(r5, r6)     // Catch: java.lang.Throwable -> L5f
            boolean r6 = r5 instanceof android.database.Cursor     // Catch: java.lang.Throwable -> L5f
            if (r6 == 0) goto L30
            android.database.Cursor r5 = (android.database.Cursor) r5     // Catch: java.lang.Throwable -> L5f
            goto L31
        L30:
            r5 = 0
        L31:
            if (r5 != 0) goto L34
            return r4
        L34:
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L4f
            if (r6 == 0) goto L51
            long r0 = r5.getLong(r4)     // Catch: java.lang.Throwable -> L4f
            r2 = 512(0x200, double:2.53E-321)
            long r0 = r0 & r2
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r0 = 1
            if (r6 == 0) goto L4a
            r6 = r0
            goto L4b
        L4a:
            r6 = r4
        L4b:
            if (r6 != r7) goto L51
            r4 = r0
            goto L51
        L4f:
            r6 = move-exception
            goto L59
        L51:
            r5.close()     // Catch: java.lang.Throwable -> L5f
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L5f
            goto L64
        L59:
            throw r6     // Catch: java.lang.Throwable -> L5a
        L5a:
            r7 = move-exception
            a.C0435w1.e(r5, r6)     // Catch: java.lang.Throwable -> L5f
            throw r7     // Catch: java.lang.Throwable -> L5f
        L5f:
            r5 = move-exception
            a.wd$a r5 = a.C0465xd.a(r5)
        L64:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            boolean r7 = r5 instanceof a.C0447wd.a
            if (r7 == 0) goto L6b
            r5 = r6
        L6b:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
    }
}
