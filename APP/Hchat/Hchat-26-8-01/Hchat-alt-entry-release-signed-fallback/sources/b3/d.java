package b3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class d extends a.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final java.lang.Class f451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.reflect.Constructor f452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final java.lang.reflect.Method f453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final java.lang.reflect.Method f454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final java.lang.reflect.Method f455n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final java.lang.reflect.Method f456o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final java.lang.reflect.Method f457p;

    public d() {
            r9 = this;
            r9.<init>()
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Constructor r2 = r1.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r3 = f1(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r4 = "addFontFromBuffer"
            java.lang.Class<java.nio.ByteBuffer> r5 = java.nio.ByteBuffer.class
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r7 = android.graphics.fonts.FontVariationAxis[].class
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6, r7, r6, r6}     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r4 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r5 = "freeze"
            java.lang.reflect.Method r5 = r1.getMethod(r5, r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r6 = "abortCreation"
            java.lang.reflect.Method r6 = r1.getMethod(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r0 = r9.g1(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            r8 = r1
            r1 = r0
            r0 = r8
            goto L52
        L36:
            r1 = move-exception
            goto L39
        L38:
            r1 = move-exception
        L39:
            java.lang.Class r2 = r1.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "Unable to collect necessary methods for class "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "TypefaceCompatApi26Impl"
            android.util.Log.e(r3, r2, r1)
            r1 = r0
            r2 = r1
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L52:
            r9.f451j = r0
            r9.f452k = r2
            r9.f453l = r3
            r9.f454m = r4
            r9.f455n = r5
            r9.f456o = r6
            r9.f457p = r1
            return
    }

    public static java.lang.reflect.Method f1(java.lang.Class r8) {
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r7 = android.graphics.fonts.FontVariationAxis[].class
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class r2 = java.lang.Integer.TYPE
            r4 = r2
            r5 = r2
            r6 = r2
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r8 = r8.getMethod(r1, r0)
            return r8
    }

    @Override // a.a
    public final android.graphics.Typeface D(android.content.Context r13, e3.d[] r14) {
            r12 = this;
            int r0 = r14.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            goto L109
        L7:
            java.lang.reflect.Method r0 = r12.f453l
            if (r0 != 0) goto L12
            java.lang.String r3 = "TypefaceCompatApi26Impl"
            java.lang.String r4 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r3, r4)
        L12:
            r3 = 0
            if (r0 == 0) goto Laf
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r4 = r14.length
            r5 = r3
        L1c:
            if (r5 >= r4) goto L38
            r6 = r14[r5]
            int r7 = r6.f2352e
            if (r7 == 0) goto L25
            goto L35
        L25:
            android.net.Uri r6 = r6.f2348a
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L2e
            goto L35
        L2e:
            java.nio.MappedByteBuffer r7 = a7.a.C(r13, r6)
            r0.put(r6, r7)
        L35:
            int r5 = r5 + 1
            goto L1c
        L38:
            java.util.Map r13 = java.util.Collections.unmodifiableMap(r0)
            java.lang.reflect.Constructor r0 = r12.f452k     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 != 0) goto L48
            goto L109
        L48:
            int r4 = r14.length
            r5 = r3
            r6 = r5
        L4b:
            java.lang.reflect.Method r7 = r12.f456o
            if (r5 >= r4) goto L8b
            r8 = r14[r5]
            android.net.Uri r9 = r8.f2348a
            java.lang.Object r9 = r13.get(r9)
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            if (r9 != 0) goto L5c
            goto L88
        L5c:
            int r6 = r8.f2349b
            int r10 = r8.f2350c
            boolean r8 = r8.f2351d
            java.lang.reflect.Method r11 = r12.f454m     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object[] r6 = new java.lang.Object[]{r9, r6, r1, r10, r8}     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r6 = r11.invoke(r0, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L7f
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L7f
            goto L80
        L7f:
            r6 = r3
        L80:
            if (r6 != 0) goto L87
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> L109
            goto L109
        L87:
            r6 = r2
        L88:
            int r5 = r5 + 1
            goto L4b
        L8b:
            if (r6 != 0) goto L92
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> L109
            goto L109
        L92:
            java.lang.reflect.Method r13 = r12.f455n     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r13 = r13.invoke(r0, r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.lang.Throwable -> L9f
            boolean r13 = r13.booleanValue()     // Catch: java.lang.Throwable -> L9f
            goto La0
        L9f:
            r13 = r3
        La0:
            if (r13 != 0) goto La3
            goto L109
        La3:
            android.graphics.Typeface r13 = r12.e1(r0)
            if (r13 != 0) goto Laa
            goto L109
        Laa:
            android.graphics.Typeface r13 = android.graphics.Typeface.create(r13, r3)
            return r13
        Laf:
            int r0 = r14.length
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = r1
        Lb4:
            if (r3 >= r0) goto Lce
            r5 = r14[r3]
            int r6 = r5.f2350c
            int r6 = r6 + (-400)
            int r6 = java.lang.Math.abs(r6)
            int r6 = r6 * 2
            boolean r7 = r5.f2351d
            int r6 = r6 + r7
            if (r4 == 0) goto Lc9
            if (r2 <= r6) goto Lcb
        Lc9:
            r4 = r5
            r2 = r6
        Lcb:
            int r3 = r3 + 1
            goto Lb4
        Lce:
            android.content.ContentResolver r13 = r13.getContentResolver()
            android.net.Uri r14 = r4.f2348a
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r13 = r13.openFileDescriptor(r14, r0, r1)
            if (r13 != 0) goto Le2
            if (r13 == 0) goto L109
            r13.close()
            return r1
        Le2:
            android.graphics.Typeface$Builder r14 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> Lff
            java.io.FileDescriptor r0 = r13.getFileDescriptor()     // Catch: java.lang.Throwable -> Lff
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Lff
            int r0 = r4.f2350c     // Catch: java.lang.Throwable -> Lff
            android.graphics.Typeface$Builder r14 = r14.setWeight(r0)     // Catch: java.lang.Throwable -> Lff
            boolean r0 = r4.f2351d     // Catch: java.lang.Throwable -> Lff
            android.graphics.Typeface$Builder r14 = r14.setItalic(r0)     // Catch: java.lang.Throwable -> Lff
            android.graphics.Typeface r14 = r14.build()     // Catch: java.lang.Throwable -> Lff
            r13.close()     // Catch: java.lang.Throwable -> L109
            return r14
        Lff:
            r14 = move-exception
            r13.close()     // Catch: java.lang.Throwable -> L104
            goto L108
        L104:
            r13 = move-exception
            r14.addSuppressed(r13)     // Catch: java.lang.Throwable -> L109
        L108:
            throw r14     // Catch: java.lang.Throwable -> L109
        L109:
            return r1
    }

    public android.graphics.Typeface e1(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Class r2 = r4.f451j     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            java.lang.reflect.Array.set(r2, r3, r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Method r5 = r4.f457p     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r0}     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = r5.invoke(r1, r0)     // Catch: java.lang.Throwable -> L1e
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5     // Catch: java.lang.Throwable -> L1e
            return r5
        L1e:
            return r1
    }

    public java.lang.reflect.Method g1(java.lang.Class r4) {
            r3 = this;
            r0 = 1
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r1, r1}
            java.lang.Class<android.graphics.Typeface> r1 = android.graphics.Typeface.class
            java.lang.String r2 = "createFromFamiliesWithDefault"
            java.lang.reflect.Method r4 = r1.getDeclaredMethod(r2, r4)
            r4.setAccessible(r0)
            return r4
    }
}
