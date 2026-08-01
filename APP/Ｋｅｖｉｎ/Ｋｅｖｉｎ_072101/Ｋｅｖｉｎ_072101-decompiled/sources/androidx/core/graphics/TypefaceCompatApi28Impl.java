package androidx.core.graphics;

/* JADX INFO: loaded from: classes2.dex */
public class TypefaceCompatApi28Impl extends androidx.core.graphics.TypefaceCompatApi26Impl {
    private static final java.lang.String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final java.lang.String DEFAULT_FAMILY = "sans-serif";
    private static final int RESOLVE_BY_FONT_TABLE = -1;

    public TypefaceCompatApi28Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    protected android.graphics.Typeface createFromFamiliesWithDefault(java.lang.Object r6) {
            r5 = this;
            java.lang.Class<?> r0 = r5.mFontFamily     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r1 = 0
            java.lang.reflect.Array.set(r0, r1, r6)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.reflect.Method r1 = r5.mCreateFromFamiliesWithDefault     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.String r2 = "sans-serif"
            r3 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2, r4, r3}     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            r3 = 0
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.reflect.InvocationTargetException -> L24 java.lang.IllegalAccessException -> L26
            return r1
        L24:
            r0 = move-exception
            goto L27
        L26:
            r0 = move-exception
        L27:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl, androidx.core.graphics.TypefaceCompatApi21Impl, androidx.core.graphics.TypefaceCompatBaseImpl
    android.graphics.Typeface createWeightStyle(android.content.Context r2, android.graphics.Typeface r3, int r4, boolean r5) {
            r1 = this;
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r3, r4, r5)
            return r0
    }

    @Override // androidx.core.graphics.TypefaceCompatApi26Impl
    protected java.lang.reflect.Method obtainCreateFromFamiliesWithDefaultMethod(java.lang.Class<?> r8) throws java.lang.NoSuchMethodException {
            r7 = this;
            r0 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r8, r0)
            java.lang.Class<android.graphics.Typeface> r2 = android.graphics.Typeface.class
            java.lang.Class r3 = r1.getClass()
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Class r6 = java.lang.Integer.TYPE
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r4, r5, r6}
            java.lang.String r4 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r3)
            r2.setAccessible(r0)
            return r2
    }
}
