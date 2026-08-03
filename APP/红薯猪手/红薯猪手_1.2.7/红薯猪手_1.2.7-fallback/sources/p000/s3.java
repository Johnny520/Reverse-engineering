package p000;

/* JADX INFO: loaded from: classes.dex */
public final class s3 {

    public static final class a extends de.robv.android.xposed.XC_MethodReplacement {
        public a() {
                r0 = this;
                r0.<init>()
                return
        }

        public final java.lang.Object replaceHookedMethod(de.robv.android.xposed.XC_MethodHook.MethodHookParam r5) {
                r4 = this;
                r0 = 0
                if (r5 == 0) goto L6
                java.lang.reflect.Member r5 = r5.method
                goto L7
            L6:
                r5 = r0
            L7:
                r1 = 61
                byte[] r1 = new byte[r1]
                r1 = {x00de: FILL_ARRAY_DATA , data: [67, 6, -48, -90, 82, -37, 76, 29, -46, -91, 6, -104, 79, 22, -100, -87, 19, -53, 89, 83, -56, -91, 82, -42, 66, 29, -111, -92, 7, -44, 65, 83, -56, -77, 2, -35, 13, 25, -35, -68, 19, -106, 65, 18, -46, -83, 92, -54, 72, 21, -48, -81, 17, -52, 3, 62, -39, -66, 26, -41, 73} // fill-array
                r2 = 6
                byte[] r3 = new byte[r2]
                r3 = {x0102: FILL_ARRAY_DATA , data: [45, 115, -68, -54, 114, -72} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r3)
                p000.h4.m187(r1, r5)
                java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
                java.lang.Class r5 = r5.getReturnType()
                java.lang.String r5 = r5.getSimpleName()
                int r1 = r5.hashCode()
                r3 = 0
                switch(r1) {
                    case -1325958191: goto La9;
                    case 104431: goto L8b;
                    case 3327612: goto L6b;
                    case 64711720: goto L4f;
                    case 97526364: goto L2f;
                    default: goto L2d;
                }
            L2d:
                goto Lc6
            L2f:
                r1 = 5
                byte[] r1 = new byte[r1]
                r1 = {x010a: FILL_ARRAY_DATA , data: [-43, 122, -32, -102, 105} // fill-array
                byte[] r2 = new byte[r2]
                r2 = {x0112: FILL_ARRAY_DATA , data: [-77, 22, -113, -5, 29, 98} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r2)
                boolean r5 = r5.equals(r1)
                if (r5 != 0) goto L46
                goto Lc6
            L46:
                p000.b6.m73()
                r5 = 0
                java.lang.Float r5 = java.lang.Float.valueOf(r5)
                return r5
            L4f:
                r1 = 7
                byte[] r1 = new byte[r1]
                r1 = {x011a: FILL_ARRAY_DATA , data: [109, 22, 124, -5, -47, 8, 97} // fill-array
                byte[] r2 = new byte[r2]
                r2 = {x0122: FILL_ARRAY_DATA , data: [15, 121, 19, -105, -76, 105} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r2)
                boolean r5 = r5.equals(r1)
                if (r5 != 0) goto L65
                goto Lc6
            L65:
                p000.b6.m73()
                java.lang.Boolean r5 = java.lang.Boolean.FALSE
                return r5
            L6b:
                r1 = 4
                byte[] r1 = new byte[r1]
                r1 = {x012a: FILL_ARRAY_DATA , data: [126, -64, -10, 118} // fill-array
                byte[] r2 = new byte[r2]
                r2 = {x0130: FILL_ARRAY_DATA , data: [18, -81, -104, 17, 57, 14} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r2)
                boolean r5 = r5.equals(r1)
                if (r5 != 0) goto L81
                goto Lc6
            L81:
                p000.b6.m73()
                r0 = 0
                java.lang.Long r5 = java.lang.Long.valueOf(r0)
                return r5
            L8b:
                r1 = 3
                byte[] r1 = new byte[r1]
                r1 = {x0138: FILL_ARRAY_DATA , data: [-19, 13, 52} // fill-array
                byte[] r2 = new byte[r2]
                r2 = {x013e: FILL_ARRAY_DATA , data: [-124, 99, 64, -69, -125, 48} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r2)
                boolean r5 = r5.equals(r1)
                if (r5 != 0) goto La1
                goto Lc6
            La1:
                p000.b6.m73()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                return r5
            La9:
                byte[] r1 = new byte[r2]
                r1 = {x0146: FILL_ARRAY_DATA , data: [21, -78, -99, 1, -115, -107} // fill-array
                byte[] r2 = new byte[r2]
                r2 = {x014e: FILL_ARRAY_DATA , data: [113, -35, -24, 99, -31, -16} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r2)
                boolean r5 = r5.equals(r1)
                if (r5 != 0) goto Lbe
                goto Lc6
            Lbe:
                p000.b6.m73()
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                return r5
            Lc6:
                return r0
        }
    }

    static {
            ۟.s3$a r0 = new ۟.s3$a
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.Object m393(p000.g3<? super de.robv.android.xposed.XC_MethodHook.MethodHookParam, ? extends java.lang.Object> r8, de.robv.android.xposed.XC_MethodHook.MethodHookParam r9) {
            r0 = 6
            byte[] r1 = new byte[r0]
            r1 = {x016c: FILL_ARRAY_DATA , data: [85, -108, 34, -111, 78, 91} // fill-array
            byte[] r2 = new byte[r0]
            r2 = {x0174: FILL_ARRAY_DATA , data: [61, -5, 77, -6, 43, 41} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            p000.h4.m189(r1, r8)
            r1 = 5
            byte[] r2 = new byte[r1]
            r2 = {x017c: FILL_ARRAY_DATA , data: [59, 60, -16, 18, -88} // fill-array
            byte[] r3 = new byte[r0]
            r3 = {x0184: FILL_ARRAY_DATA , data: [75, 93, -126, 115, -59, 32} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            p000.h4.m189(r2, r9)
            java.lang.Object r8 = r8.mo12(r9)
            r2 = 16
            r3 = 4
            if (r8 == 0) goto L4d
            java.lang.Class r4 = r8.getClass()
            java.lang.String r4 = r4.getSimpleName()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            byte[] r5 = new byte[r2]
            r5 = {x018c: FILL_ARRAY_DATA , data: [104, -12, 49, 91, 41, 125, 110, -40, 28, 71, 59, 48, 50, -75, 83, 29} // fill-array
            byte[] r6 = new byte[r0]
            r6 = {x0198: FILL_ARRAY_DATA , data: [28, -101, 125, 52, 94, 24} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            p000.h4.m188(r5, r4)
            goto L5b
        L4d:
            byte[] r4 = new byte[r3]
            r4 = {x01a0: FILL_ARRAY_DATA , data: [32, 46, -123, 11} // fill-array
            byte[] r5 = new byte[r0]
            r5 = {x01a6: FILL_ARRAY_DATA , data: [78, 91, -23, 103, -107, 105} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
        L5b:
            java.lang.reflect.Member r5 = r9.method
            r6 = 61
            byte[] r6 = new byte[r6]
            r6 = {x01ae: FILL_ARRAY_DATA , data: [-20, 49, 79, -2, -50, 91, -29, 42, 77, -3, -102, 24, -32, 33, 3, -15, -113, 75, -10, 100, 87, -3, -50, 86, -19, 42, 14, -4, -101, 84, -18, 100, 87, -21, -98, 93, -94, 46, 66, -28, -113, 22, -18, 37, 77, -11, -64, 74, -25, 34, 79, -9, -115, 76, -84, 9, 70, -26, -122, 87, -26} // fill-array
            byte[] r7 = new byte[r0]
            r7 = {x01d2: FILL_ARRAY_DATA , data: [-126, 68, 35, -110, -18, 56} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r7)
            p000.h4.m187(r6, r5)
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
            java.lang.Class r5 = r5.getReturnType()
            java.lang.String r5 = r5.getSimpleName()
            r6 = 18
            byte[] r6 = new byte[r6]
            r6 = {x01da: FILL_ARRAY_DATA , data: [64, 34, -65, 105, 29, 19, 87, 43, -82, 116, 21, 19, 66, 111, -27, 20, 90, 87} // fill-array
            byte[] r7 = new byte[r0]
            r7 = {x01e8: FILL_ARRAY_DATA , data: [39, 71, -53, 58, 116, 126} // fill-array
            p000.oa.m332(r6, r7)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r6)
            byte[] r2 = new byte[r2]
            r2 = {x01f0: FILL_ARRAY_DATA , data: [5, 30, -87, 14, -62, -32, 3, 50, -124, 18, -48, -83, 95, 95, -53, 72} // fill-array
            byte[] r6 = new byte[r0]
            r6 = {x01fc: FILL_ARRAY_DATA , data: [113, 113, -27, 97, -75, -123} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r6)
            p000.h4.m188(r2, r5)
            int r2 = r5.hashCode()
            r6 = 7
            switch(r2) {
                case -1325958191: goto L132;
                case 104431: goto Lf3;
                case 3327612: goto Lde;
                case 64711720: goto Lc0;
                case 97526364: goto Laa;
                default: goto La8;
            }
        La8:
            goto L154
        Laa:
            byte[] r1 = new byte[r1]
            r1 = {x0204: FILL_ARRAY_DATA , data: [77, 52, -44, 42, 109} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x020c: FILL_ARRAY_DATA , data: [43, 88, -69, 75, 25, -83} // fill-array
            java.lang.String r0 = p000.oa.m332(r1, r0)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L147
            goto L154
        Lc0:
            byte[] r1 = new byte[r6]
            r1 = {x0214: FILL_ARRAY_DATA , data: [109, 39, -108, -102, -13, 85, 97} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x021c: FILL_ARRAY_DATA , data: [15, 72, -5, -10, -106, 52} // fill-array
            java.lang.String r0 = p000.oa.m332(r1, r0)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto Ld6
            goto L154
        Ld6:
            boolean r0 = p000.h4.m185(r4, r5)
            if (r0 != 0) goto L154
            goto L14d
        Lde:
            byte[] r1 = new byte[r3]
            r1 = {x0224: FILL_ARRAY_DATA , data: [72, -66, 123, -91} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x022a: FILL_ARRAY_DATA , data: [36, -47, 21, -62, -45, 83} // fill-array
            java.lang.String r0 = p000.oa.m332(r1, r0)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L147
            goto L154
        Lf3:
            r1 = 3
            byte[] r2 = new byte[r1]
            r2 = {x0232: FILL_ARRAY_DATA , data: [11, 2, 20} // fill-array
            byte[] r3 = new byte[r0]
            r3 = {x0238: FILL_ARRAY_DATA , data: [98, 108, 96, -46, 120, 20} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L109
            goto L154
        L109:
            byte[] r1 = new byte[r1]
            r1 = {x0240: FILL_ARRAY_DATA , data: [-117, 90, 16} // fill-array
            byte[] r2 = new byte[r0]
            r2 = {x0246: FILL_ARRAY_DATA , data: [-30, 52, 100, -55, -95, -76} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r2)
            boolean r1 = p000.h4.m185(r4, r1)
            if (r1 != 0) goto L154
            byte[] r1 = new byte[r6]
            r1 = {x024e: FILL_ARRAY_DATA , data: [-79, 85, -29, 104, 31, 79, -86} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x0256: FILL_ARRAY_DATA , data: [-40, 59, -105, 13, 120, 42} // fill-array
            java.lang.String r0 = p000.oa.m332(r1, r0)
            boolean r0 = p000.h4.m185(r4, r0)
            if (r0 != 0) goto L154
            goto L14d
        L132:
            byte[] r1 = new byte[r0]
            r1 = {x025e: FILL_ARRAY_DATA , data: [78, -16, -111, 28, 27, -114} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x0266: FILL_ARRAY_DATA , data: [42, -97, -28, 126, 119, -21} // fill-array
            java.lang.String r0 = p000.oa.m332(r1, r0)
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L147
            goto L154
        L147:
            boolean r0 = p000.h4.m185(r4, r5)
            if (r0 != 0) goto L154
        L14d:
            p000.b6.m73()
            java.lang.Object r8 = p000.r3.m375(r9)
        L154:
            return r8
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final de.robv.android.xposed.XC_MethodHook.Unhook m394(java.lang.reflect.Method r3, p000.g3 r4) {
            r0 = 6
            byte[] r1 = new byte[r0]
            r1 = {x0026: FILL_ARRAY_DATA , data: [126, 113, -60, -124, -100, 26} // fill-array
            byte[] r2 = new byte[r0]
            r2 = {x002e: FILL_ARRAY_DATA , data: [66, 5, -84, -19, -17, 36} // fill-array
            p000.oa.m332(r1, r2)
            byte[] r1 = new byte[r0]
            r1 = {x0036: FILL_ARRAY_DATA , data: [-96, -14, -79, -96, -111, 127} // fill-array
            byte[] r0 = new byte[r0]
            r0 = {x003e: FILL_ARRAY_DATA , data: [-56, -99, -34, -53, -12, 13} // fill-array
            p000.oa.m332(r1, r0)
            ۟.t3 r0 = new ۟.t3
            r0.<init>(r4)
            de.robv.android.xposed.XC_MethodHook$Unhook r3 = p000.r3.m374(r3, r0)
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m395(java.lang.String r12, java.lang.String r13, java.lang.Object[] r14, p000.g3 r15) {
            java.lang.ClassLoader r0 = p000.l3.m264()
            r1 = 6
            byte[] r2 = new byte[r1]
            r2 = {x011a: FILL_ARRAY_DATA , data: [-101, -111, -45, -126, 34, 58} // fill-array
            byte[] r3 = new byte[r1]
            r3 = {x0122: FILL_ARRAY_DATA , data: [-89, -27, -69, -21, 81, 4} // fill-array
            p000.oa.m332(r2, r3)
            r2 = 4
            byte[] r3 = new byte[r2]
            r3 = {x012a: FILL_ARRAY_DATA , data: [-44, 36, -32, -78} // fill-array
            byte[] r4 = new byte[r1]
            r4 = {x0130: FILL_ARRAY_DATA , data: [-75, 86, -121, -63, -83, -21} // fill-array
            p000.oa.m332(r3, r4)
            r3 = 2
            byte[] r4 = new byte[r3]
            r4 = {x0138: FILL_ARRAY_DATA , data: [123, -111} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x013e: FILL_ARRAY_DATA , data: [24, -3, -48, -51, 31, 112} // fill-array
            p000.oa.m332(r4, r5)
            byte[] r4 = new byte[r1]
            r4 = {x0146: FILL_ARRAY_DATA , data: [68, 104, -90, -79, -50, 58} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x014e: FILL_ARRAY_DATA , data: [44, 7, -55, -38, -85, 72} // fill-array
            p000.oa.m332(r4, r5)
            r4 = 0
            java.lang.Class r12 = p000.r3.m360(r12, r0, r3)
            if (r12 == 0) goto L118
            int r0 = r14.length
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r0)
            byte[] r0 = new byte[r1]
            r0 = {x0156: FILL_ARRAY_DATA , data: [-88, 70, 30, 108, 84, 104} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x015e: FILL_ARRAY_DATA , data: [-108, 50, 118, 5, 39, 86} // fill-array
            p000.oa.m332(r0, r5)
            byte[] r0 = new byte[r2]
            r0 = {x0166: FILL_ARRAY_DATA , data: [-33, 15, 66, 47} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x016c: FILL_ARRAY_DATA , data: [-66, 125, 37, 92, 18, 54} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r5)
            p000.h4.m189(r0, r14)
            byte[] r0 = new byte[r1]
            r0 = {x0174: FILL_ARRAY_DATA , data: [104, 53, 91, -3, 88, -81} // fill-array
            byte[] r5 = new byte[r1]
            r5 = {x017c: FILL_ARRAY_DATA , data: [0, 90, 52, -106, 61, -35} // fill-array
            p000.oa.m332(r0, r5)
            r0 = 1
            if (r13 == 0) goto L7e
            int r5 = r13.length()     // Catch: java.lang.Throwable -> L112
            if (r5 != 0) goto L7c
            goto L7e
        L7c:
            r5 = r4
            goto L7f
        L7e:
            r5 = r0
        L7f:
            if (r5 == 0) goto L83
            goto L118
        L83:
            int r5 = r14.length     // Catch: java.lang.Throwable -> L112
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r14, r5)     // Catch: java.lang.Throwable -> L112
            java.lang.reflect.Method r12 = de.robv.android.xposed.XposedHelpers.findMethodExact(r12, r13, r14)     // Catch: java.lang.Throwable -> L112
            r13 = 20
            byte[] r14 = new byte[r13]     // Catch: java.lang.Throwable -> L112
            r5 = 26
            r14[r4] = r5     // Catch: java.lang.Throwable -> L112
            r5 = 101(0x65, float:1.42E-43)
            r14[r0] = r5     // Catch: java.lang.Throwable -> L112
            r5 = 22
            r14[r3] = r5     // Catch: java.lang.Throwable -> L112
            r5 = -108(0xffffffffffffff94, float:NaN)
            r6 = 3
            r14[r6] = r5     // Catch: java.lang.Throwable -> L112
            r7 = 14
            r14[r2] = r7     // Catch: java.lang.Throwable -> L112
            r8 = 113(0x71, float:1.58E-43)
            r9 = 5
            r14[r9] = r8     // Catch: java.lang.Throwable -> L112
            r8 = 8
            r14[r1] = r8     // Catch: java.lang.Throwable -> L112
            r10 = 7
            r11 = 100
            r14[r10] = r11     // Catch: java.lang.Throwable -> L112
            r10 = 23
            r14[r8] = r10     // Catch: java.lang.Throwable -> L112
            r8 = 9
            r14[r8] = r5     // Catch: java.lang.Throwable -> L112
            r5 = 10
            r14[r5] = r1     // Catch: java.lang.Throwable -> L112
            r5 = 11
            r8 = 108(0x6c, float:1.51E-43)
            r14[r5] = r8     // Catch: java.lang.Throwable -> L112
            r5 = 29
            r8 = 12
            r14[r8] = r5     // Catch: java.lang.Throwable -> L112
            r5 = 13
            r10 = 111(0x6f, float:1.56E-43)
            r14[r5] = r10     // Catch: java.lang.Throwable -> L112
            r14[r7] = r8     // Catch: java.lang.Throwable -> L112
            r5 = 15
            r7 = -40
            r14[r5] = r7     // Catch: java.lang.Throwable -> L112
            r5 = 16
            r7 = 109(0x6d, float:1.53E-43)
            r14[r5] = r7     // Catch: java.lang.Throwable -> L112
            r5 = 17
            r7 = 58
            r14[r5] = r7     // Catch: java.lang.Throwable -> L112
            r5 = 18
            r7 = 82
            r14[r5] = r7     // Catch: java.lang.Throwable -> L112
            r5 = 19
            r7 = 37
            r14[r5] = r7     // Catch: java.lang.Throwable -> L112
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L112
            r5 = 124(0x7c, float:1.74E-43)
            r1[r4] = r5     // Catch: java.lang.Throwable -> L112
            r1[r0] = r8     // Catch: java.lang.Throwable -> L112
            r0 = 120(0x78, float:1.68E-43)
            r1[r3] = r0     // Catch: java.lang.Throwable -> L112
            r0 = -16
            r1[r6] = r0     // Catch: java.lang.Throwable -> L112
            r0 = 67
            r1[r2] = r0     // Catch: java.lang.Throwable -> L112
            r1[r9] = r13     // Catch: java.lang.Throwable -> L112
            java.lang.String r13 = p000.oa.m332(r14, r1)     // Catch: java.lang.Throwable -> L112
            p000.h4.m188(r13, r12)     // Catch: java.lang.Throwable -> L112
            m394(r12, r15)     // Catch: java.lang.Throwable -> L112
            goto L118
        L112:
            r12 = move-exception
            java.lang.StringBuilder r13 = p000.b0.f131
            ۟.b0.a.m58(r12)
        L118:
            return
    }
}
