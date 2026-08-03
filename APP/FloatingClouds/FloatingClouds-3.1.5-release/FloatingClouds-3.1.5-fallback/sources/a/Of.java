package a;

/* JADX INFO: loaded from: classes.dex */
public class Of extends a.Nf {
    public final java.lang.Class<?> f;
    public final java.lang.reflect.Constructor<?> g;
    public final java.lang.reflect.Method h;
    public final java.lang.reflect.Method i;
    public final java.lang.reflect.Method j;
    public final java.lang.reflect.Method k;
    public final java.lang.reflect.Method l;

    public Of() {
            r8 = this;
            r8.<init>()
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Constructor r2 = r1.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r3 = l(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r5 = android.graphics.fonts.FontVariationAxis[].class
            java.lang.Class<java.nio.ByteBuffer> r6 = java.nio.ByteBuffer.class
            java.lang.Class[] r4 = new java.lang.Class[]{r6, r4, r5, r4, r4}     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r5 = "addFontFromBuffer"
            java.lang.reflect.Method r4 = r1.getMethod(r5, r4)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r5 = "freeze"
            java.lang.reflect.Method r5 = r1.getMethod(r5, r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.String r6 = "abortCreation"
            java.lang.reflect.Method r6 = r1.getMethod(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r0 = r8.m(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            r7 = r1
            r1 = r0
            r0 = r7
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
            r8.f = r0
            r8.g = r2
            r8.h = r3
            r8.i = r4
            r8.j = r5
            r8.k = r6
            r8.l = r1
            return
    }

    public static java.lang.reflect.Method l(java.lang.Class r8) {
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Class<android.content.res.AssetManager> r0 = android.content.res.AssetManager.class
            java.lang.Class r3 = java.lang.Boolean.TYPE
            java.lang.Class<android.graphics.fonts.FontVariationAxis[]> r7 = android.graphics.fonts.FontVariationAxis[].class
            r4 = r2
            r5 = r2
            r6 = r2
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1, r2, r3, r4, r5, r6, r7}
            java.lang.String r1 = "addFontFromAssetManager"
            java.lang.reflect.Method r8 = r8.getMethod(r1, r0)
            return r8
    }

    @Override // a.Nf, a.Rf
    public final android.graphics.Typeface a(android.content.Context r12, a.S6.c r13, android.content.res.Resources r14, int r15) {
            r11 = this;
            java.lang.reflect.Method r0 = r11.h
            if (r0 != 0) goto Lb
            java.lang.String r1 = "TypefaceCompatApi26Impl"
            java.lang.String r2 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        Lb:
            if (r0 == 0) goto L49
            java.lang.Object r5 = r11.k()
            r14 = 0
            if (r5 != 0) goto L16
            r3 = r11
            goto L43
        L16:
            a.S6$d[] r13 = r13.f259a
            int r15 = r13.length
            r0 = 0
        L1a:
            if (r0 >= r15) goto L3c
            r1 = r13[r0]
            java.lang.String r6 = r1.f260a
            java.lang.String r2 = r1.d
            android.graphics.fonts.FontVariationAxis[] r10 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r2)
            int r8 = r1.b
            boolean r9 = r1.c
            int r7 = r1.e
            r3 = r11
            r4 = r12
            boolean r12 = r3.h(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != 0) goto L38
            r11.g(r5)
            return r14
        L38:
            int r0 = r0 + 1
            r12 = r4
            goto L1a
        L3c:
            r3 = r11
            boolean r12 = r11.j(r5)
            if (r12 != 0) goto L44
        L43:
            return r14
        L44:
            android.graphics.Typeface r12 = r11.i(r5)
            return r12
        L49:
            r3 = r11
            r4 = r12
            android.graphics.Typeface r12 = super.a(r4, r13, r14, r15)
            return r12
    }

    @Override // a.Rf
    public final android.graphics.Typeface b(android.content.Context r12, a.T6[] r13, int r14) {
            r11 = this;
            int r0 = r13.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            goto Ldc
        L7:
            java.lang.reflect.Method r0 = r11.h
            if (r0 != 0) goto L12
            java.lang.String r3 = "TypefaceCompatApi26Impl"
            java.lang.String r4 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r3, r4)
        L12:
            if (r0 == 0) goto L9d
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = r13.length
            r4 = 0
            r5 = r4
        L1c:
            if (r5 >= r3) goto L38
            r6 = r13[r5]
            int r7 = r6.e
            if (r7 == 0) goto L25
            goto L35
        L25:
            android.net.Uri r6 = r6.f272a
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L2e
            goto L35
        L2e:
            java.nio.MappedByteBuffer r7 = a.Sf.e(r12, r6)
            r0.put(r6, r7)
        L35:
            int r5 = r5 + 1
            goto L1c
        L38:
            java.util.Map r12 = java.util.Collections.unmodifiableMap(r0)
            java.lang.Object r0 = r11.k()
            if (r0 != 0) goto L44
            goto Ldc
        L44:
            int r3 = r13.length
            r5 = r4
            r6 = r5
        L47:
            if (r5 >= r3) goto L84
            r7 = r13[r5]
            android.net.Uri r8 = r7.f272a
            java.lang.Object r8 = r12.get(r8)
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            if (r8 != 0) goto L56
            goto L81
        L56:
            int r6 = r7.b
            int r9 = r7.c
            boolean r7 = r7.d
            java.lang.reflect.Method r10 = r11.i     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L79
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L79
            java.lang.Object[] r6 = new java.lang.Object[]{r8, r6, r1, r9, r7}     // Catch: java.lang.Throwable -> L79
            java.lang.Object r6 = r10.invoke(r0, r6)     // Catch: java.lang.Throwable -> L79
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L79
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L79
            goto L7a
        L79:
            r6 = r4
        L7a:
            if (r6 != 0) goto L80
            r11.g(r0)
            return r1
        L80:
            r6 = r2
        L81:
            int r5 = r5 + 1
            goto L47
        L84:
            if (r6 != 0) goto L8a
            r11.g(r0)
            return r1
        L8a:
            boolean r12 = r11.j(r0)
            if (r12 != 0) goto L91
            goto Ldc
        L91:
            android.graphics.Typeface r12 = r11.i(r0)
            if (r12 != 0) goto L98
            goto Ldc
        L98:
            android.graphics.Typeface r12 = android.graphics.Typeface.create(r12, r14)
            return r12
        L9d:
            a.T6 r13 = r11.d(r14, r13)
            android.content.ContentResolver r12 = r12.getContentResolver()
            android.net.Uri r14 = r13.f272a     // Catch: java.io.IOException -> Ldc
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r12 = r12.openFileDescriptor(r14, r0, r1)     // Catch: java.io.IOException -> Ldc
            if (r12 != 0) goto Lb5
            if (r12 == 0) goto Ldc
            r12.close()     // Catch: java.io.IOException -> Ldc
            return r1
        Lb5:
            android.graphics.Typeface$Builder r14 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> Ld2
            java.io.FileDescriptor r0 = r12.getFileDescriptor()     // Catch: java.lang.Throwable -> Ld2
            r14.<init>(r0)     // Catch: java.lang.Throwable -> Ld2
            int r0 = r13.c     // Catch: java.lang.Throwable -> Ld2
            android.graphics.Typeface$Builder r14 = r14.setWeight(r0)     // Catch: java.lang.Throwable -> Ld2
            boolean r13 = r13.d     // Catch: java.lang.Throwable -> Ld2
            android.graphics.Typeface$Builder r13 = r14.setItalic(r13)     // Catch: java.lang.Throwable -> Ld2
            android.graphics.Typeface r13 = r13.build()     // Catch: java.lang.Throwable -> Ld2
            r12.close()     // Catch: java.io.IOException -> Ldc
            return r13
        Ld2:
            r13 = move-exception
            r12.close()     // Catch: java.lang.Throwable -> Ld7
            goto Ldb
        Ld7:
            r12 = move-exception
            r13.addSuppressed(r12)     // Catch: java.io.IOException -> Ldc
        Ldb:
            throw r13     // Catch: java.io.IOException -> Ldc
        Ldc:
            return r1
    }

    @Override // a.Rf
    public final android.graphics.Typeface c(android.content.Context r10, android.content.res.Resources r11, int r12, java.lang.String r13, int r14) {
            r9 = this;
            java.lang.reflect.Method r1 = r9.h
            if (r1 != 0) goto Lb
            java.lang.String r2 = "TypefaceCompatApi26Impl"
            java.lang.String r3 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r2, r3)
        Lb:
            if (r1 == 0) goto L32
            java.lang.Object r2 = r9.k()
            r8 = 0
            if (r2 != 0) goto L15
            goto L2c
        L15:
            r4 = 0
            r5 = -1
            r6 = -1
            r7 = 0
            r0 = r9
            r1 = r10
            r3 = r13
            boolean r1 = r0.h(r1, r2, r3, r4, r5, r6, r7)
            if (r1 != 0) goto L26
            r9.g(r2)
            return r8
        L26:
            boolean r1 = r9.j(r2)
            if (r1 != 0) goto L2d
        L2c:
            return r8
        L2d:
            android.graphics.Typeface r1 = r9.i(r2)
            return r1
        L32:
            android.graphics.Typeface r1 = super.c(r10, r11, r12, r13, r14)
            return r1
    }

    public final void g(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.k     // Catch: java.lang.Throwable -> L6
            r1 = 0
            r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L6
        L6:
            return
    }

    public final boolean h(android.content.Context r11, java.lang.Object r12, java.lang.String r13, int r14, int r15, int r16, android.graphics.fonts.FontVariationAxis[] r17) {
            r10 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r10.h     // Catch: java.lang.Throwable -> L2b
            android.content.res.AssetManager r2 = r11.getAssets()     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch: java.lang.Throwable -> L2b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)     // Catch: java.lang.Throwable -> L2b
            r3 = r13
            r9 = r17
            java.lang.Object[] r11 = new java.lang.Object[]{r2, r3, r4, r5, r6, r7, r8, r9}     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r11 = r1.invoke(r12, r11)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L2b
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L2b
            return r11
        L2b:
            return r0
    }

    public android.graphics.Typeface i(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            throw r0
    }

    public final boolean j(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.j     // Catch: java.lang.Throwable -> Le
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Le
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = 0
            return r3
    }

    public final java.lang.Object k() {
            r2 = this;
            r0 = 0
            java.lang.reflect.Constructor<?> r1 = r2.g     // Catch: java.lang.Throwable -> L7
            java.lang.Object r0 = r1.newInstance(r0)     // Catch: java.lang.Throwable -> L7
        L7:
            return r0
    }

    public java.lang.reflect.Method m(java.lang.Class<?> r1) {
            r0 = this;
            r0 = 0
            throw r0
    }
}
