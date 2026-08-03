package b3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b3.d {
    @Override // b3.d
    public final android.graphics.Typeface e1(java.lang.Object r4) {
            r3 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Class r1 = r3.f451j     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            r2 = 1
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            r2 = 0
            java.lang.reflect.Array.set(r1, r2, r4)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            java.lang.reflect.Method r4 = r3.f457p     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            java.lang.String r2 = "sans-serif"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r0, r0}     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            r1 = 0
            java.lang.Object r4 = r4.invoke(r1, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            android.graphics.Typeface r4 = (android.graphics.Typeface) r4     // Catch: java.lang.reflect.InvocationTargetException -> L20 java.lang.IllegalAccessException -> L22
            return r4
        L20:
            r4 = move-exception
            goto L23
        L22:
            r4 = move-exception
        L23:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r4)
            throw r0
    }

    @Override // b3.d
    public final java.lang.reflect.Method g1(java.lang.Class r4) {
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
