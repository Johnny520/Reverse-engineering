package p000;

/* JADX INFO: loaded from: classes.dex */
public final class na extends p000.za {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f827 = null;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static boolean f828;

    static {
            r0 = 3
            byte[] r0 = new byte[r0]
            r0 = {x0016: FILL_ARRAY_DATA , data: [121, 23, -50} // fill-array
            r1 = 6
            byte[] r1 = new byte[r1]
            r1 = {x001c: FILL_ARRAY_DATA , data: [17, 126, -86, 119, -31, -118} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r1)
            p000.na.f827 = r0
            r0 = 1
            p000.na.f828 = r0
            return
    }

    public na() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m301(de.robv.android.xposed.XC_MethodHook.MethodHookParam r7) {
            ۟.k r0 = p000.k8.f660
            ۟.k r0 = ۟.k8.a.m235()
            java.lang.String r0 = r0.f538
            r1 = 12
            byte[] r1 = new byte[r1]
            r1 = {x00b2: FILL_ARRAY_DATA , data: [86, 18, -49, 117, -121, 12, 69, 55, -62, 89, -97, 23} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x00bc: FILL_ARRAY_DATA , data: [23, 126, -90, 26, -13, 100} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m188(r1, r0)
            r1 = 0
            r3 = 3
            java.lang.Class r0 = p000.r3.m360(r0, r1, r3)
            if (r0 != 0) goto L26
            goto Lb1
        L26:
            java.lang.Object r3 = r7.thisObject
            r4 = 10
            byte[] r5 = new byte[r4]
            r5 = {x00c4: FILL_ARRAY_DATA , data: [90, -103, -107, -88, 82, 24, 68, -108, -97, -81} // fill-array
            byte[] r6 = new byte[r2]
            r6 = {x00ce: FILL_ARRAY_DATA , data: [46, -15, -4, -37, 29, 122} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            p000.h4.m188(r5, r3)
            r5 = 8
            byte[] r5 = new byte[r5]
            r5 = {x00d6: FILL_ARRAY_DATA , data: [18, 37, -61, -31, -88, 13, 30, 38} // fill-array
            byte[] r6 = new byte[r2]
            r6 = {x00de: FILL_ARRAY_DATA , data: [123, 81, -90, -116, -2, 100} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            java.lang.Object r3 = p000.r3.m364(r3, r5)
            boolean r5 = r3 instanceof android.view.View
            if (r5 == 0) goto L56
            android.view.View r3 = (android.view.View) r3
            goto L57
        L56:
            r3 = r1
        L57:
            r5 = -1
            if (r3 == 0) goto L7a
            r1 = 16
            byte[] r1 = new byte[r1]
            r1 = {x00e6: FILL_ARRAY_DATA , data: [-6, -14, 109, 15, -103, 22, -30, -13, 116, 24, -103, 21, -9, -17, 122, 24} // fill-array
            byte[] r6 = new byte[r2]
            r6 = {x00f2: FILL_ARRAY_DATA , data: [-106, -101, 27, 106, -40, 99} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r6)
            java.lang.Integer r1 = p000.r3.m366(r0, r1)
            if (r1 == 0) goto L75
            int r1 = r1.intValue()
            goto L76
        L75:
            r1 = r5
        L76:
            android.view.View r1 = r3.findViewById(r1)
        L7a:
            if (r1 != 0) goto L7d
            goto Lb1
        L7d:
            byte[] r4 = new byte[r4]
            r4 = {x00fa: FILL_ARRAY_DATA , data: [-116, 21, 44, 70, 38, 97, -93, 1, 53, 75} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x0104: FILL_ARRAY_DATA , data: [-19, 96, 88, 46, 73, 19} // fill-array
            java.lang.String r2 = p000.oa.m332(r4, r2)
            java.lang.Integer r0 = p000.r3.m366(r0, r2)
            if (r0 == 0) goto L95
            int r5 = r0.intValue()
        L95:
            android.view.View r0 = r3.findViewById(r5)
            java.lang.Object[] r7 = r7.args
            r2 = 0
            r7 = r7[r2]
            ۟.ja r3 = new ۟.ja
            r3.<init>(r2, r7)
            r1.setOnClickListener(r3)
            if (r0 == 0) goto Lb1
            ۟.ja r1 = new ۟.ja
            r2 = 1
            r1.<init>(r2, r7)
            r0.setOnClickListener(r1)
        Lb1:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static final void m302(de.robv.android.xposed.XC_MethodHook.MethodHookParam r8) {
            java.lang.Object r0 = r8.thisObject
            r1 = 10
            byte[] r1 = new byte[r1]
            r1 = {x00c2: FILL_ARRAY_DATA , data: [102, -16, 75, -98, 13, -61, 120, -3, 65, -103} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x00cc: FILL_ARRAY_DATA , data: [18, -104, 34, -19, 66, -95} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m188(r1, r0)
            r1 = 7
            byte[] r1 = new byte[r1]
            r1 = {x00d4: FILL_ARRAY_DATA , data: [-111, 119, 4, -79, 87, 39, -127} // fill-array
            byte[] r3 = new byte[r2]
            r3 = {x00dc: FILL_ARRAY_DATA , data: [-10, 18, 112, -25, 62, 66} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            r3 = 0
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.Object r0 = p000.r3.m357(r0, r1, r4)
            android.view.View r0 = (android.view.View) r0
            r1 = -1
            r4 = 12
            if (r0 == 0) goto L6d
            ۟.k r5 = p000.k8.f660
            ۟.k r5 = ۟.k8.a.m235()
            java.lang.String r5 = r5.f536
            byte[] r6 = new byte[r4]
            r6 = {x00e4: FILL_ARRAY_DATA , data: [30, 85, -101, 23, 94, 99, 1, 125, -117, 38, 91, 104} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x00ee: FILL_ARRAY_DATA , data: [83, 52, -17, 101, 55, 27} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r7)
            p000.h4.m188(r6, r5)
            r6 = 15
            byte[] r6 = new byte[r6]
            r6 = {x00f6: FILL_ARRAY_DATA , data: [-84, 69, -99, -25, -34, -1, -73, 113, -102, -29, -34, -24, -88, 117, -103} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x0102: FILL_ARRAY_DATA , data: [-63, 16, -18, -126, -84, -66} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r7)
            java.lang.Integer r5 = p000.r3.m367(r5, r6)
            if (r5 == 0) goto L67
            int r5 = r5.intValue()
            goto L68
        L67:
            r5 = r1
        L68:
            android.view.View r5 = r0.findViewById(r5)
            goto L6e
        L6d:
            r5 = 0
        L6e:
            if (r5 != 0) goto L71
            goto Lc0
        L71:
            java.lang.Object[] r8 = r8.args
            r8 = r8[r3]
            ۟.k r3 = p000.k8.f660
            ۟.k r3 = ۟.k8.a.m235()
            java.lang.String r3 = r3.f536
            byte[] r4 = new byte[r4]
            r4 = {x010a: FILL_ARRAY_DATA , data: [125, -15, -1, 119, -98, 85, 98, -39, -17, 70, -101, 94} // fill-array
            byte[] r6 = new byte[r2]
            r6 = {x0114: FILL_ARRAY_DATA , data: [48, -112, -117, 5, -9, 45} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r6)
            p000.h4.m188(r4, r3)
            r4 = 11
            byte[] r4 = new byte[r4]
            r4 = {x011c: FILL_ARRAY_DATA , data: [98, 84, -109, 7, -63, 10, 125, 76, -83, 4, -51} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x0126: FILL_ARRAY_DATA , data: [22, 34, -52, 105, -88, 105} // fill-array
            java.lang.String r2 = p000.oa.m332(r4, r2)
            java.lang.Integer r2 = p000.r3.m367(r3, r2)
            if (r2 == 0) goto La8
            int r1 = r2.intValue()
        La8:
            android.view.View r0 = r0.findViewById(r1)
            if (r0 == 0) goto Lb7
            ۟.ja r1 = new ۟.ja
            r2 = 2
            r1.<init>(r2, r8)
            r0.setOnClickListener(r1)
        Lb7:
            ۟.ja r0 = new ۟.ja
            r1 = 3
            r0.<init>(r1, r8)
            r5.setOnClickListener(r0)
        Lc0:
            return
    }

    @Override // p000.a4
    /* JADX INFO: renamed from: ۥ */
    public final void mo28(java.lang.String r13) {
            r12 = this;
            r0 = 11
            byte[] r1 = new byte[r0]
            r1 = {x00e2: FILL_ARRAY_DATA , data: [97, -75, 113, -53, 0, 76, 98, -119, 127, -59, 0} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x00ec: FILL_ARRAY_DATA , data: [17, -57, 30, -88, 101, 63} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m189(r1, r13)
            ۟.c1 r13 = p000.c1.f209
            boolean r13 = p000.e1.m132(r13)
            p000.na.f828 = r13
            if (r13 == 0) goto Le0
            ۟.k r13 = p000.k8.f660
            java.lang.String r13 = r13.f586
            r1 = 27
            byte[] r1 = new byte[r1]
            r1 = {x00f4: FILL_ARRAY_DATA , data: [-80, -42, 65, 75, 63, -90, -84, -36, 70, 91, 26, -90, -121, -34, 100, 87, 54, -91, -86, -36, 94, 90, 54, -96, -95, -33, 65} // fill-array
            byte[] r3 = new byte[r2]
            r3 = {x0106: FILL_ARRAY_DATA , data: [-30, -77, 50, 62, 83, -46} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m188(r1, r13)
            ۟.k r1 = p000.k8.f660
            java.lang.String r3 = r1.f587
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r1 = r1.f588
            r6 = 17
            byte[] r6 = new byte[r6]
            r6 = {x010e: FILL_ARRAY_DATA , data: [69, 116, 48, 70, -27, 22, 88, 126, 37, 81, -49, 10, 115, 124, 18, 88, -11} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x011c: FILL_ARRAY_DATA , data: [22, 17, 81, 52, -122, 126} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r7)
            p000.h4.m188(r6, r1)
            r6 = 0
            r7 = 0
            r8 = 3
            java.lang.Class r1 = p000.r3.m360(r1, r6, r8)
            r5[r7] = r1
            ۟.ka r1 = p000.ka.f665
            p000.r3.m370(r13, r3, r5, r1)
            ۟.k r13 = p000.k8.f660
            java.lang.String r13 = r13.f589
            r1 = 28
            byte[] r1 = new byte[r1]
            r1 = {x0124: FILL_ARRAY_DATA , data: [80, 73, -105, -6, -15, -47, 123, 101, -108, -47, -13, -26, 118, 69, -116, -48, -50, -41, 123, 95, -123, -38, -22, -64, 108, 111, -116, -57} // fill-array
            byte[] r3 = new byte[r2]
            r3 = {x0136: FILL_ARRAY_DATA , data: [30, 44, -32, -76, -98, -91} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m188(r1, r13)
            ۟.k r1 = p000.k8.f660
            java.lang.String r3 = r1.f590
            r5 = 2
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r1 = r1.f591
            r10 = 15
            byte[] r10 = new byte[r10]
            r10 = {x013e: FILL_ARRAY_DATA , data: [5, -126, 109, 21, 13, -32, 46, -128, 91, 21, 37, -6, 8, -127, 106} // fill-array
            byte[] r11 = new byte[r2]
            r11 = {x014a: FILL_ARRAY_DATA , data: [75, -19, 25, 112, 68, -108} // fill-array
            java.lang.String r10 = p000.oa.m332(r10, r11)
            p000.h4.m188(r10, r1)
            java.lang.Class r1 = p000.r3.m360(r1, r6, r8)
            r9[r7] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r9[r4] = r1
            ۟.la r1 = p000.la.f748
            p000.r3.m370(r13, r3, r9, r1)
            ۟.k r13 = p000.k8.f660
            java.lang.String r13 = r13.f596
            r1 = 25
            byte[] r1 = new byte[r1]
            r1 = {x0152: FILL_ARRAY_DATA , data: [-87, -76, -78, -36, 56, 61, -107, -65, -113, -51, 30, 49, -92, -76, -88, -51, 9, 51, -117, -73, -93, -53, 56, 48, -108} // fill-array
            byte[] r3 = new byte[r2]
            r3 = {x0164: FILL_ARRAY_DATA , data: [-25, -37, -58, -71, 123, 92} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            p000.h4.m188(r1, r13)
            ۟.k r1 = p000.k8.f660
            java.lang.String r3 = r1.f597
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = r1.f592
            byte[] r0 = new byte[r0]
            r0 = {x016c: FILL_ARRAY_DATA , data: [-27, 7, 63, 21, 113, 14, -39, 12, 8, 28, 65} // fill-array
            byte[] r2 = new byte[r2]
            r2 = {x0176: FILL_ARRAY_DATA , data: [-85, 104, 75, 112, 50, 111} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r2)
            p000.h4.m188(r0, r1)
            java.lang.Class r0 = p000.r3.m360(r1, r6, r8)
            r5[r7] = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r5[r4] = r0
            ۟.ma r0 = p000.ma.f782
            p000.r3.m370(r13, r3, r5, r0)
        Le0:
            return
    }
}
