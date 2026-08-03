package p000;

/* JADX INFO: loaded from: classes.dex */
public final class u3 extends java.lang.ClassLoader {

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final /* synthetic */ int f1062 = 0;

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.ClassLoader f1063;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final java.lang.ClassLoader f1064;

    public static final class a {
        @android.annotation.SuppressLint({"DiscouragedPrivateApi"})
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m428(java.lang.ClassLoader r10) {
                r0 = 6
                if (r10 == 0) goto L83
                java.lang.Class<java.lang.ClassLoader> r1 = java.lang.ClassLoader.class
                byte[] r2 = new byte[r0]     // Catch: java.lang.Exception -> L82
                r3 = 91
                r4 = 0
                r2[r4] = r3     // Catch: java.lang.Exception -> L82
                r3 = -28
                r5 = 1
                r2[r5] = r3     // Catch: java.lang.Exception -> L82
                r3 = 14
                r6 = 2
                r2[r6] = r3     // Catch: java.lang.Exception -> L82
                r3 = 7
                r7 = 3
                r2[r7] = r3     // Catch: java.lang.Exception -> L82
                r3 = -88
                r8 = 4
                r2[r8] = r3     // Catch: java.lang.Exception -> L82
                r3 = -68
                r9 = 5
                r2[r9] = r3     // Catch: java.lang.Exception -> L82
                byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L82
                r3 = 43
                r0[r4] = r3     // Catch: java.lang.Exception -> L82
                r3 = -123(0xffffffffffffff85, float:NaN)
                r0[r5] = r3     // Catch: java.lang.Exception -> L82
                r3 = 124(0x7c, float:1.74E-43)
                r0[r6] = r3     // Catch: java.lang.Exception -> L82
                r3 = 98
                r0[r7] = r3     // Catch: java.lang.Exception -> L82
                r3 = -58
                r0[r8] = r3     // Catch: java.lang.Exception -> L82
                r3 = -56
                r0[r9] = r3     // Catch: java.lang.Exception -> L82
                java.lang.String r0 = p000.oa.m332(r2, r0)     // Catch: java.lang.Exception -> L82
                java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Exception -> L82
                r0.setAccessible(r5)     // Catch: java.lang.Exception -> L82
                java.lang.Class<۟.u3> r1 = p000.u3.class
                java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L82
                java.lang.Object r2 = r0.get(r1)     // Catch: java.lang.Exception -> L82
                boolean r3 = r2 instanceof java.lang.ClassLoader     // Catch: java.lang.Exception -> L82
                r4 = 0
                if (r3 == 0) goto L5b
                java.lang.ClassLoader r2 = (java.lang.ClassLoader) r2     // Catch: java.lang.Exception -> L82
                goto L5c
            L5b:
                r2 = r4
            L5c:
                if (r2 != 0) goto L64
                java.lang.Class<de.robv.android.xposed.XposedBridge> r2 = de.robv.android.xposed.XposedBridge.class
                java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Exception -> L82
            L64:
                if (r2 == 0) goto L6e
                java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L82
                java.lang.String r4 = r3.getName()     // Catch: java.lang.Exception -> L82
            L6e:
                java.lang.Class<۟.u3> r3 = p000.u3.class
                java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L82
                boolean r3 = p000.h4.m185(r4, r3)     // Catch: java.lang.Exception -> L82
                if (r3 != 0) goto L82
                ۟.u3 r3 = new ۟.u3     // Catch: java.lang.Exception -> L82
                r3.<init>(r2, r10)     // Catch: java.lang.Exception -> L82
                r0.set(r1, r3)     // Catch: java.lang.Exception -> L82
            L82:
                return
            L83:
                java.lang.NullPointerException r10 = new java.lang.NullPointerException
                r1 = 19
                byte[] r1 = new byte[r1]
                r1 = {x009a: FILL_ARRAY_DATA , data: [14, -30, 32, 1, 17, -35, 2, -17, 37, 23, 16, -79, 80, -77, 97, 28, 23, -3, 1} // fill-array
                byte[] r0 = new byte[r0]
                r0 = {x00a8: FILL_ARRAY_DATA , data: [109, -114, 65, 114, 98, -111} // fill-array
                java.lang.String r0 = p000.oa.m332(r1, r0)
                r10.<init>(r0)
                throw r10
        }
    }

    public u3(java.lang.ClassLoader r3, java.lang.ClassLoader r4) {
            r2 = this;
            r0 = 6
            byte[] r1 = new byte[r0]
            r1 = {x001a: FILL_ARRAY_DATA , data: [-24, 79, 20, -23, -111, 42} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [-117, 35, 86, -120, -30, 79} // fill-array
            java.lang.String r0 = p000.oa.m332(r1, r0)
            p000.h4.m189(r0, r4)
            r2.<init>()
            r2.f1063 = r3
            r2.f1064 = r4
            return
    }

    @Override // java.lang.ClassLoader
    public final java.net.URL getResource(java.lang.String r4) {
            r3 = this;
            r0 = 4
            byte[] r0 = new byte[r0]
            r0 = {x003a: FILL_ARRAY_DATA , data: [-80, -71, 84, 36} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x0040: FILL_ARRAY_DATA , data: [-34, -40, 57, 65, 71, 89} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r4)
            java.lang.ClassLoader r0 = r3.f1063
            if (r0 == 0) goto L1c
            java.net.URL r0 = r0.getResource(r4)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            if (r0 != 0) goto L38
            java.lang.ClassLoader r0 = r3.f1064
            java.net.URL r0 = r0.getResource(r4)
            r4 = 16
            byte[] r4 = new byte[r4]
            r4 = {x0048: FILL_ARRAY_DATA , data: [61, 41, 97, -124, 114, 21, 53, 57, 103, -75, 114, 78, 116, 98, 59, -1} // fill-array
            byte[] r1 = new byte[r1]
            r1 = {x0054: FILL_ARRAY_DATA , data: [90, 76, 21, -42, 23, 102} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r1)
            p000.h4.m188(r4, r0)
        L38:
            return r0
    }

    @Override // java.lang.ClassLoader
    public final java.lang.Class<?> loadClass(java.lang.String r12, boolean r13) {
            r11 = this;
            r13 = 4
            byte[] r0 = new byte[r13]
            r0 = {x00a4: FILL_ARRAY_DATA , data: [115, 55, -52, -50} // fill-array
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x00aa: FILL_ARRAY_DATA , data: [29, 86, -95, -85, -26, -92} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m189(r0, r12)
            r0 = 14
            java.lang.ClassLoader r2 = r11.f1063     // Catch: java.lang.Exception -> L8b
            p000.h4.m186(r2)     // Catch: java.lang.Exception -> L8b
            java.lang.Class r2 = r2.loadClass(r12)     // Catch: java.lang.Exception -> L8b
            byte[] r3 = new byte[r0]     // Catch: java.lang.Exception -> L8b
            r4 = -41
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L8b
            r4 = -125(0xffffffffffffff83, float:NaN)
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Exception -> L8b
            r4 = -101(0xffffffffffffff9b, float:NaN)
            r7 = 2
            r3[r7] = r4     // Catch: java.lang.Exception -> L8b
            r4 = 42
            r8 = 3
            r3[r8] = r4     // Catch: java.lang.Exception -> L8b
            r4 = -17
            r3[r13] = r4     // Catch: java.lang.Exception -> L8b
            r4 = 89
            r9 = 5
            r3[r9] = r4     // Catch: java.lang.Exception -> L8b
            r4 = -38
            r3[r1] = r4     // Catch: java.lang.Exception -> L8b
            r4 = 7
            r10 = -97
            r3[r4] = r10     // Catch: java.lang.Exception -> L8b
            r4 = 8
            r10 = -119(0xffffffffffffff89, float:NaN)
            r3[r4] = r10     // Catch: java.lang.Exception -> L8b
            r4 = 9
            r10 = 102(0x66, float:1.43E-43)
            r3[r4] = r10     // Catch: java.lang.Exception -> L8b
            r4 = 10
            r10 = -126(0xffffffffffffff82, float:NaN)
            r3[r4] = r10     // Catch: java.lang.Exception -> L8b
            r4 = 11
            r10 = 27
            r3[r4] = r10     // Catch: java.lang.Exception -> L8b
            r4 = 12
            r10 = -107(0xffffffffffffff95, float:NaN)
            r3[r4] = r10     // Catch: java.lang.Exception -> L8b
            r4 = 13
            r10 = -59
            r3[r4] = r10     // Catch: java.lang.Exception -> L8b
            byte[] r4 = new byte[r1]     // Catch: java.lang.Exception -> L8b
            r10 = -69
            r4[r5] = r10     // Catch: java.lang.Exception -> L8b
            r5 = -20
            r4[r6] = r5     // Catch: java.lang.Exception -> L8b
            r5 = -6
            r4[r7] = r5     // Catch: java.lang.Exception -> L8b
            r5 = 78
            r4[r8] = r5     // Catch: java.lang.Exception -> L8b
            r5 = -84
            r4[r13] = r5     // Catch: java.lang.Exception -> L8b
            r13 = 53
            r4[r9] = r13     // Catch: java.lang.Exception -> L8b
            java.lang.String r13 = p000.oa.m332(r3, r4)     // Catch: java.lang.Exception -> L8b
            p000.h4.m188(r13, r2)     // Catch: java.lang.Exception -> L8b
            return r2
        L8b:
            java.lang.ClassLoader r13 = r11.f1064
            java.lang.Class r12 = r13.loadClass(r12)
            byte[] r13 = new byte[r0]
            r13 = {x00b2: FILL_ARRAY_DATA , data: [-18, -36, 77, 64, -6, 41, -29, -64, 95, 12, -105, 107, -84, -102} // fill-array
            byte[] r0 = new byte[r1]
            r0 = {x00be: FILL_ARRAY_DATA , data: [-126, -77, 44, 36, -71, 69} // fill-array
            java.lang.String r13 = p000.oa.m332(r13, r0)
            p000.h4.m188(r13, r12)
            return r12
    }
}
