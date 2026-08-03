package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۤۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
@Yue.InterfaceC5336(28)
public class C6487 extends Yue.C6486 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final java.lang.String f22824 = "createFromFamiliesWithDefault";

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final int f22825 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final java.lang.String f22826 = "sans-serif";

    public C6487() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // Yue.C6486, Yue.C6484, Yue.C6489
    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public android.graphics.Typeface mo23934(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 android.graphics.Typeface r2, int r3, boolean r4) {
            r0 = this;
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r3, r4)
            return r1
    }

    @Override // Yue.C6486
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public android.graphics.Typeface mo23941(java.lang.Object r5) {
            r4 = this;
            java.lang.Class<?> r0 = r4.f22817     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 0
            java.lang.reflect.Array.set(r0, r1, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.reflect.Method r5 = r4.f22823     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.String r1 = "sans-serif"
            r2 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r3, r2}     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 0
            java.lang.Object r5 = r5.invoke(r1, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r5
        L24:
            r5 = move-exception
            goto L27
        L26:
            r5 = move-exception
        L27:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
    }

    @Override // Yue.C6486
    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public java.lang.reflect.Method mo23951(java.lang.Class<?> r4) throws java.lang.NoSuchMethodException {
            r3 = this;
            r0 = 1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r1, r2, r2}
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r2, r4)
            r4.setAccessible(r0)
            return r4
    }
}
