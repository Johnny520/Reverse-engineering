package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class c80 extends defpackage.ct {
    public static java.lang.Class k;
    public static java.lang.reflect.Constructor l;
    public static java.lang.reflect.Method m;
    public static java.lang.reflect.Method n;
    public static boolean o;
    public final java.lang.Class d;
    public final java.lang.reflect.Constructor e;
    public final java.lang.reflect.Method f;
    public final java.lang.reflect.Method g;
    public final java.lang.reflect.Method h;
    public final java.lang.reflect.Method i;
    public final java.lang.reflect.Method j;

    public c80() {
            r9 = this;
            r9.<init>()
            r0 = 0
            java.lang.String r1 = "android.graphics.FontFamily"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Constructor r2 = r1.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
            java.lang.reflect.Method r3 = E(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
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
            java.lang.reflect.Method r0 = r9.F(r1)     // Catch: java.lang.NoSuchMethodException -> L36 java.lang.ClassNotFoundException -> L38
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
            r9.d = r0
            r9.e = r2
            r9.f = r3
            r9.g = r4
            r9.h = r5
            r9.i = r6
            r9.j = r1
            return
    }

    public static boolean A(java.lang.Object r1, java.lang.String r2, int r3, boolean r4) {
            D()
            java.lang.reflect.Method r0 = defpackage.c80.m     // Catch: java.lang.Throwable -> L1c
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L1c
            return r1
        L1c:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    public static void D() {
            boolean r0 = defpackage.c80.o
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            defpackage.c80.o = r0
            r1 = 0
            java.lang.String r2 = "android.graphics.FontFamily"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Constructor r3 = r2.getConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.String r4 = "addFontWeightStyle"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class[] r5 = new java.lang.Class[]{r5, r6, r7}     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Method r4 = r2.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class<android.graphics.Typeface> r5 = android.graphics.Typeface.class
            java.lang.String r6 = "createFromFamiliesWithDefault"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            java.lang.reflect.Method r1 = r5.getMethod(r6, r0)     // Catch: java.lang.NoSuchMethodException -> L3a java.lang.ClassNotFoundException -> L3c
            r0 = r1
            r1 = r3
            goto L4d
        L3a:
            r0 = move-exception
            goto L3d
        L3c:
            r0 = move-exception
        L3d:
            java.lang.Class r2 = r0.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "TypefaceCompatApi21Impl"
            android.util.Log.e(r3, r2, r0)
            r0 = r1
            r2 = r0
            r4 = r2
        L4d:
            defpackage.c80.l = r1
            defpackage.c80.k = r2
            defpackage.c80.m = r4
            defpackage.c80.n = r0
            return
    }

    public static java.lang.reflect.Method E(java.lang.Class r8) {
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

    public android.graphics.Typeface B(java.lang.Object r5) {
            r4 = this;
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 0
            java.lang.Class r2 = r4.d     // Catch: java.lang.Throwable -> L1e
            r3 = 1
            java.lang.Object r2 = java.lang.reflect.Array.newInstance(r2, r3)     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            java.lang.reflect.Array.set(r2, r3, r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Method r5 = r4.j     // Catch: java.lang.Throwable -> L1e
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0, r0}     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = r5.invoke(r1, r0)     // Catch: java.lang.Throwable -> L1e
            android.graphics.Typeface r5 = (android.graphics.Typeface) r5     // Catch: java.lang.Throwable -> L1e
            return r5
        L1e:
            return r1
    }

    public final boolean C(java.lang.Object r3) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.h     // Catch: java.lang.Throwable -> Le
            r1 = 0
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> Le
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Throwable -> Le
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Throwable -> Le
            return r3
        Le:
            r3 = 0
            return r3
    }

    public java.lang.reflect.Method F(java.lang.Class r4) {
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

    @Override // defpackage.ct
    public final android.graphics.Typeface g(android.content.Context r10, defpackage.dl r11, android.content.res.Resources r12, int r13) {
            r9 = this;
            java.lang.reflect.Method r13 = r9.f
            if (r13 != 0) goto Lb
            java.lang.String r0 = "TypefaceCompatApi26Impl"
            java.lang.String r1 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r0, r1)
        Lb:
            if (r13 == 0) goto L50
            r12 = 0
            java.lang.reflect.Constructor r13 = r9.e     // Catch: java.lang.Throwable -> L16
            java.lang.Object r13 = r13.newInstance(r12)     // Catch: java.lang.Throwable -> L16
            r3 = r13
            goto L17
        L16:
            r3 = r12
        L17:
            if (r3 != 0) goto L1b
            r1 = r9
            goto L4a
        L1b:
            el[] r11 = r11.a
            int r13 = r11.length
            r0 = 0
        L1f:
            if (r0 >= r13) goto L43
            r1 = r11[r0]
            java.lang.String r4 = r1.a
            int r5 = r1.e
            int r6 = r1.b
            boolean r7 = r1.c
            java.lang.String r1 = r1.d
            android.graphics.fonts.FontVariationAxis[] r8 = android.graphics.fonts.FontVariationAxis.fromFontVariationSettings(r1)
            r1 = r9
            r2 = r10
            boolean r10 = r1.z(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != 0) goto L3f
            java.lang.reflect.Method r10 = r1.i     // Catch: java.lang.Throwable -> L4a
            r10.invoke(r3, r12)     // Catch: java.lang.Throwable -> L4a
            goto L4a
        L3f:
            int r0 = r0 + 1
            r10 = r2
            goto L1f
        L43:
            r1 = r9
            boolean r10 = r9.C(r3)
            if (r10 != 0) goto L4b
        L4a:
            return r12
        L4b:
            android.graphics.Typeface r10 = r9.B(r3)
            return r10
        L50:
            r1 = r9
            r2 = r10
            D()
            java.lang.reflect.Constructor r10 = defpackage.c80.l     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.InstantiationException -> Lbc java.lang.IllegalAccessException -> Lbe
            r13 = 0
            java.lang.Object r10 = r10.newInstance(r13)     // Catch: java.lang.reflect.InvocationTargetException -> Lb9 java.lang.InstantiationException -> Lbc java.lang.IllegalAccessException -> Lbe
            el[] r11 = r11.a
            int r0 = r11.length
            r3 = 0
            r4 = r3
        L61:
            if (r4 >= r0) goto L93
            r5 = r11[r4]
            java.io.File r6 = defpackage.gt.k(r2)
            if (r6 != 0) goto L6c
            goto Lad
        L6c:
            int r7 = r5.f     // Catch: java.lang.RuntimeException -> L74 java.lang.Throwable -> L8d
            boolean r7 = defpackage.gt.f(r6, r12, r7)     // Catch: java.lang.RuntimeException -> L74 java.lang.Throwable -> L8d
            if (r7 != 0) goto L78
        L74:
            r6.delete()
            goto Lad
        L78:
            java.lang.String r7 = r6.getPath()     // Catch: java.lang.RuntimeException -> L74 java.lang.Throwable -> L8d
            int r8 = r5.b     // Catch: java.lang.RuntimeException -> L74 java.lang.Throwable -> L8d
            boolean r5 = r5.c     // Catch: java.lang.RuntimeException -> L74 java.lang.Throwable -> L8d
            boolean r5 = A(r10, r7, r8, r5)     // Catch: java.lang.RuntimeException -> L74 java.lang.Throwable -> L8d
            if (r5 != 0) goto L87
            goto L74
        L87:
            r6.delete()
            int r4 = r4 + 1
            goto L61
        L8d:
            r0 = move-exception
            r10 = r0
            r6.delete()
            throw r10
        L93:
            D()
            java.lang.Class r11 = defpackage.c80.k     // Catch: java.lang.reflect.InvocationTargetException -> Lae java.lang.IllegalAccessException -> Lb1
            r12 = 1
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r11, r12)     // Catch: java.lang.reflect.InvocationTargetException -> Lae java.lang.IllegalAccessException -> Lb1
            java.lang.reflect.Array.set(r11, r3, r10)     // Catch: java.lang.reflect.InvocationTargetException -> Lae java.lang.IllegalAccessException -> Lb1
            java.lang.reflect.Method r10 = defpackage.c80.n     // Catch: java.lang.reflect.InvocationTargetException -> Lae java.lang.IllegalAccessException -> Lb1
            java.lang.Object[] r11 = new java.lang.Object[]{r11}     // Catch: java.lang.reflect.InvocationTargetException -> Lae java.lang.IllegalAccessException -> Lb1
            java.lang.Object r10 = r10.invoke(r13, r11)     // Catch: java.lang.reflect.InvocationTargetException -> Lae java.lang.IllegalAccessException -> Lb1
            r13 = r10
            android.graphics.Typeface r13 = (android.graphics.Typeface) r13     // Catch: java.lang.reflect.InvocationTargetException -> Lae java.lang.IllegalAccessException -> Lb1
        Lad:
            return r13
        Lae:
            r0 = move-exception
        Laf:
            r10 = r0
            goto Lb3
        Lb1:
            r0 = move-exception
            goto Laf
        Lb3:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
        Lb9:
            r0 = move-exception
        Lba:
            r10 = r0
            goto Lc0
        Lbc:
            r0 = move-exception
            goto Lba
        Lbe:
            r0 = move-exception
            goto Lba
        Lc0:
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            r11.<init>(r10)
            throw r11
    }

    @Override // defpackage.ct
    public final android.graphics.Typeface h(android.content.Context r13, defpackage.gl[] r14, int r15) {
            r12 = this;
            int r0 = r14.length
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            goto Le2
        L7:
            java.lang.reflect.Method r0 = r12.f
            if (r0 != 0) goto L12
            java.lang.String r3 = "TypefaceCompatApi26Impl"
            java.lang.String r4 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r3, r4)
        L12:
            if (r0 == 0) goto La3
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r3 = r14.length
            r4 = 0
            r5 = r4
        L1c:
            if (r5 >= r3) goto L38
            r6 = r14[r5]
            int r7 = r6.e
            if (r7 == 0) goto L25
            goto L35
        L25:
            android.net.Uri r6 = r6.a
            boolean r7 = r0.containsKey(r6)
            if (r7 == 0) goto L2e
            goto L35
        L2e:
            java.nio.MappedByteBuffer r7 = defpackage.gt.o(r13, r6)
            r0.put(r6, r7)
        L35:
            int r5 = r5 + 1
            goto L1c
        L38:
            java.util.Map r13 = java.util.Collections.unmodifiableMap(r0)
            java.lang.reflect.Constructor r0 = r12.e     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L43
            goto L44
        L43:
            r0 = r1
        L44:
            if (r0 != 0) goto L48
            goto Le2
        L48:
            int r3 = r14.length
            r5 = r4
            r6 = r5
        L4b:
            java.lang.reflect.Method r7 = r12.i
            if (r5 >= r3) goto L8a
            r8 = r14[r5]
            android.net.Uri r9 = r8.a
            java.lang.Object r9 = r13.get(r9)
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            if (r9 != 0) goto L5c
            goto L87
        L5c:
            int r6 = r8.b
            int r10 = r8.c
            boolean r8 = r8.d
            java.lang.reflect.Method r11 = r12.g     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> L7f
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object[] r6 = new java.lang.Object[]{r9, r6, r1, r10, r8}     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r6 = r11.invoke(r0, r6)     // Catch: java.lang.Throwable -> L7f
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L7f
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L7f
            goto L80
        L7f:
            r6 = r4
        L80:
            if (r6 != 0) goto L86
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> Le2
            goto Le2
        L86:
            r6 = r2
        L87:
            int r5 = r5 + 1
            goto L4b
        L8a:
            if (r6 != 0) goto L90
            r7.invoke(r0, r1)     // Catch: java.lang.Throwable -> Le2
            goto Le2
        L90:
            boolean r13 = r12.C(r0)
            if (r13 != 0) goto L97
            goto Le2
        L97:
            android.graphics.Typeface r13 = r12.B(r0)
            if (r13 != 0) goto L9e
            goto Le2
        L9e:
            android.graphics.Typeface r13 = android.graphics.Typeface.create(r13, r15)
            return r13
        La3:
            gl r14 = r12.l(r15, r14)
            android.content.ContentResolver r13 = r13.getContentResolver()
            android.net.Uri r15 = r14.a
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r13 = r13.openFileDescriptor(r15, r0, r1)
            if (r13 != 0) goto Lbb
            if (r13 == 0) goto Le2
            r13.close()
            return r1
        Lbb:
            android.graphics.Typeface$Builder r15 = new android.graphics.Typeface$Builder     // Catch: java.lang.Throwable -> Ld8
            java.io.FileDescriptor r0 = r13.getFileDescriptor()     // Catch: java.lang.Throwable -> Ld8
            r15.<init>(r0)     // Catch: java.lang.Throwable -> Ld8
            int r0 = r14.c     // Catch: java.lang.Throwable -> Ld8
            android.graphics.Typeface$Builder r15 = r15.setWeight(r0)     // Catch: java.lang.Throwable -> Ld8
            boolean r14 = r14.d     // Catch: java.lang.Throwable -> Ld8
            android.graphics.Typeface$Builder r14 = r15.setItalic(r14)     // Catch: java.lang.Throwable -> Ld8
            android.graphics.Typeface r14 = r14.build()     // Catch: java.lang.Throwable -> Ld8
            r13.close()     // Catch: java.lang.Throwable -> Le2
            return r14
        Ld8:
            r14 = move-exception
            r13.close()     // Catch: java.lang.Throwable -> Ldd
            goto Le1
        Ldd:
            r13 = move-exception
            r14.addSuppressed(r13)     // Catch: java.lang.Throwable -> Le2
        Le1:
            throw r14     // Catch: java.lang.Throwable -> Le2
        Le2:
            return r1
    }

    @Override // defpackage.ct
    public final android.graphics.Typeface i(android.content.Context r10, android.content.res.Resources r11, int r12, java.lang.String r13, int r14) {
            r9 = this;
            java.lang.reflect.Method r0 = r9.f
            if (r0 != 0) goto Lb
            java.lang.String r1 = "TypefaceCompatApi26Impl"
            java.lang.String r2 = "Unable to collect necessary private methods. Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        Lb:
            if (r0 == 0) goto L3a
            r11 = 0
            java.lang.reflect.Constructor r12 = r9.e     // Catch: java.lang.Throwable -> L16
            java.lang.Object r12 = r12.newInstance(r11)     // Catch: java.lang.Throwable -> L16
            r2 = r12
            goto L17
        L16:
            r2 = r11
        L17:
            if (r2 != 0) goto L1b
            r0 = r9
            goto L34
        L1b:
            r6 = -1
            r7 = 0
            r4 = 0
            r5 = -1
            r0 = r9
            r1 = r10
            r3 = r13
            boolean r10 = r0.z(r1, r2, r3, r4, r5, r6, r7)
            if (r10 != 0) goto L2e
            java.lang.reflect.Method r10 = r0.i     // Catch: java.lang.Throwable -> L34
            r10.invoke(r2, r11)     // Catch: java.lang.Throwable -> L34
            goto L34
        L2e:
            boolean r10 = r9.C(r2)
            if (r10 != 0) goto L35
        L34:
            return r11
        L35:
            android.graphics.Typeface r10 = r9.B(r2)
            return r10
        L3a:
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            r8 = r14
            android.graphics.Typeface r10 = super.i(r4, r5, r6, r7, r8)
            return r10
    }

    public final boolean z(android.content.Context r11, java.lang.Object r12, java.lang.String r13, int r14, int r15, int r16, android.graphics.fonts.FontVariationAxis[] r17) {
            r10 = this;
            r0 = 0
            java.lang.reflect.Method r1 = r10.f     // Catch: java.lang.Throwable -> L2b
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
}
