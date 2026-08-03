package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ca {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m118(android.content.Context r50, java.lang.String r51) {
            r0 = 7
            byte[] r1 = new byte[r0]
            r1 = {x0378: FILL_ARRAY_DATA , data: [-66, 122, -98, -128, 72, -113, -87} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x0380: FILL_ARRAY_DATA , data: [-35, 21, -16, -12, 45, -9} // fill-array
            p000.oa.m332(r1, r3)
            boolean r1 = p000.ta.m420(r51)
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = r4
        L1a:
            if (r1 == 0) goto L1e
            goto L374
        L1e:
            android.content.pm.PackageManager r1 = r50.getPackageManager()     // Catch: java.lang.Exception -> L374
            r5 = 64
            r6 = r51
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r6, r5)     // Catch: java.lang.Exception -> L374
            if (r1 != 0) goto L2e
            goto L374
        L2e:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L374
            r8 = 4
            r9 = 2
            r10 = 5
            r11 = 3
            r12 = -122(0xffffffffffffff86, float:NaN)
            r15 = -113(0xffffffffffffff8f, float:NaN)
            r16 = -49
            r17 = 45
            r18 = 77
            r19 = 79
            r20 = 18
            r21 = 15
            r22 = 14
            r23 = 32
            r24 = 12
            r25 = 59
            r26 = 29
            r27 = 13
            r28 = 112(0x70, float:1.57E-43)
            r29 = 23
            r30 = -61
            r31 = 51
            r32 = 46
            r33 = 31
            r34 = 22
            r35 = 42
            r36 = 36
            r37 = 108(0x6c, float:1.51E-43)
            r38 = 20
            r14 = 28
            r40 = 9
            r13 = 11
            r7 = 10
            if (r6 < r14) goto L189
            java.lang.Class r6 = r1.getClass()     // Catch: java.lang.Exception -> L374
            byte[] r14 = new byte[r13]     // Catch: java.lang.Exception -> L374
            r44 = 89
            r14[r4] = r44     // Catch: java.lang.Exception -> L374
            r45 = 127(0x7f, float:1.78E-43)
            r14[r3] = r45     // Catch: java.lang.Exception -> L374
            r14[r9] = r15     // Catch: java.lang.Exception -> L374
            r15 = -48
            r14[r11] = r15     // Catch: java.lang.Exception -> L374
            r15 = -95
            r14[r8] = r15     // Catch: java.lang.Exception -> L374
            r14[r10] = r5     // Catch: java.lang.Exception -> L374
            r14[r2] = r18     // Catch: java.lang.Exception -> L374
            r45 = 95
            r14[r0] = r45     // Catch: java.lang.Exception -> L374
            r42 = 8
            r14[r42] = r12     // Catch: java.lang.Exception -> L374
            r45 = -40
            r14[r40] = r45     // Catch: java.lang.Exception -> L374
            r45 = -89
            r14[r7] = r45     // Catch: java.lang.Exception -> L374
            byte[] r12 = new byte[r2]     // Catch: java.lang.Exception -> L374
            r12[r4] = r35     // Catch: java.lang.Exception -> L374
            r12[r3] = r34     // Catch: java.lang.Exception -> L374
            r46 = -24
            r12[r9] = r46     // Catch: java.lang.Exception -> L374
            r46 = -66
            r12[r11] = r46     // Catch: java.lang.Exception -> L374
            r46 = -56
            r12[r8] = r46     // Catch: java.lang.Exception -> L374
            r12[r10] = r32     // Catch: java.lang.Exception -> L374
            java.lang.String r12 = p000.oa.m332(r14, r12)     // Catch: java.lang.Exception -> L374
            java.lang.reflect.Field r6 = r6.getDeclaredField(r12)     // Catch: java.lang.Exception -> L374
            java.lang.Object r6 = r6.get(r1)     // Catch: java.lang.Exception -> L374
            if (r6 != 0) goto L112
            java.lang.Class r6 = r1.getClass()     // Catch: java.lang.Exception -> L374
            byte[] r12 = new byte[r7]     // Catch: java.lang.Exception -> L374
            r12[r4] = r11     // Catch: java.lang.Exception -> L374
            r14 = -52
            r12[r3] = r14     // Catch: java.lang.Exception -> L374
            r14 = -128(0xffffffffffffff80, float:NaN)
            r12[r9] = r14     // Catch: java.lang.Exception -> L374
            r12[r11] = r30     // Catch: java.lang.Exception -> L374
            r14 = -81
            r12[r8] = r14     // Catch: java.lang.Exception -> L374
            r14 = -103(0xffffffffffffff99, float:NaN)
            r12[r10] = r14     // Catch: java.lang.Exception -> L374
            r12[r2] = r10     // Catch: java.lang.Exception -> L374
            r14 = -41
            r12[r0] = r14     // Catch: java.lang.Exception -> L374
            r14 = -126(0xffffffffffffff82, float:NaN)
            r15 = 8
            r12[r15] = r14     // Catch: java.lang.Exception -> L374
            r14 = -34
            r12[r40] = r14     // Catch: java.lang.Exception -> L374
            byte[] r14 = new byte[r2]     // Catch: java.lang.Exception -> L374
            r14[r4] = r28     // Catch: java.lang.Exception -> L374
            r15 = -91
            r14[r3] = r15     // Catch: java.lang.Exception -> L374
            r15 = -25
            r14[r9] = r15     // Catch: java.lang.Exception -> L374
            r15 = -83
            r14[r11] = r15     // Catch: java.lang.Exception -> L374
            r15 = -50
            r14[r8] = r15     // Catch: java.lang.Exception -> L374
            r15 = -19
            r14[r10] = r15     // Catch: java.lang.Exception -> L374
            java.lang.String r12 = p000.oa.m332(r12, r14)     // Catch: java.lang.Exception -> L374
            java.lang.reflect.Field r6 = r6.getDeclaredField(r12)     // Catch: java.lang.Exception -> L374
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.Exception -> L374
            boolean r6 = r1 instanceof java.lang.Object[]     // Catch: java.lang.Exception -> L374
            if (r6 == 0) goto L1d4
            goto L1d1
        L112:
            java.lang.Class r1 = r6.getClass()     // Catch: java.lang.Exception -> L374
            r12 = 21
            byte[] r14 = new byte[r12]     // Catch: java.lang.Exception -> L374
            r14[r4] = r31     // Catch: java.lang.Exception -> L374
            r14[r3] = r44     // Catch: java.lang.Exception -> L374
            r12 = 125(0x7d, float:1.75E-43)
            r14[r9] = r12     // Catch: java.lang.Exception -> L374
            r12 = 53
            r14[r11] = r12     // Catch: java.lang.Exception -> L374
            r12 = 28
            r14[r8] = r12     // Catch: java.lang.Exception -> L374
            r12 = -92
            r14[r10] = r12     // Catch: java.lang.Exception -> L374
            r14[r2] = r29     // Catch: java.lang.Exception -> L374
            r12 = 83
            r14[r0] = r12     // Catch: java.lang.Exception -> L374
            r12 = 103(0x67, float:1.44E-43)
            r42 = 8
            r14[r42] = r12     // Catch: java.lang.Exception -> L374
            r14[r40] = r4     // Catch: java.lang.Exception -> L374
            r14[r7] = r40     // Catch: java.lang.Exception -> L374
            r14[r13] = r15     // Catch: java.lang.Exception -> L374
            r14[r24] = r23     // Catch: java.lang.Exception -> L374
            r14[r27] = r19     // Catch: java.lang.Exception -> L374
            r12 = 90
            r14[r22] = r12     // Catch: java.lang.Exception -> L374
            r14[r21] = r26     // Catch: java.lang.Exception -> L374
            r12 = 16
            r14[r12] = r13     // Catch: java.lang.Exception -> L374
            r12 = 17
            r14[r12] = r15     // Catch: java.lang.Exception -> L374
            r12 = 49
            r14[r20] = r12     // Catch: java.lang.Exception -> L374
            r12 = 19
            r15 = 78
            r14[r12] = r15     // Catch: java.lang.Exception -> L374
            r12 = 122(0x7a, float:1.71E-43)
            r14[r38] = r12     // Catch: java.lang.Exception -> L374
            byte[] r12 = new byte[r2]     // Catch: java.lang.Exception -> L374
            r15 = 84
            r12[r4] = r15     // Catch: java.lang.Exception -> L374
            r15 = 60
            r12[r3] = r15     // Catch: java.lang.Exception -> L374
            r12[r9] = r40     // Catch: java.lang.Exception -> L374
            r15 = 116(0x74, float:1.63E-43)
            r12[r11] = r15     // Catch: java.lang.Exception -> L374
            r12[r8] = r37     // Catch: java.lang.Exception -> L374
            r12[r10] = r16     // Catch: java.lang.Exception -> L374
            java.lang.String r12 = p000.oa.m332(r14, r12)     // Catch: java.lang.Exception -> L374
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L374
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r12, r14)     // Catch: java.lang.Exception -> L374
            java.lang.Object[] r12 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L374
            java.lang.Object r1 = r1.invoke(r6, r12)     // Catch: java.lang.Exception -> L374
            boolean r6 = r1 instanceof java.lang.Object[]     // Catch: java.lang.Exception -> L374
            if (r6 == 0) goto L1d4
            goto L1d1
        L189:
            java.lang.Class r6 = r1.getClass()     // Catch: java.lang.Exception -> L374
            byte[] r12 = new byte[r7]     // Catch: java.lang.Exception -> L374
            r12[r4] = r17     // Catch: java.lang.Exception -> L374
            r12[r3] = r18     // Catch: java.lang.Exception -> L374
            r12[r9] = r16     // Catch: java.lang.Exception -> L374
            r14 = 113(0x71, float:1.58E-43)
            r12[r11] = r14     // Catch: java.lang.Exception -> L374
            r12[r8] = r15     // Catch: java.lang.Exception -> L374
            r12[r10] = r19     // Catch: java.lang.Exception -> L374
            r14 = 43
            r12[r2] = r14     // Catch: java.lang.Exception -> L374
            r14 = 86
            r12[r0] = r14     // Catch: java.lang.Exception -> L374
            r14 = -51
            r15 = 8
            r12[r15] = r14     // Catch: java.lang.Exception -> L374
            r12[r40] = r37     // Catch: java.lang.Exception -> L374
            byte[] r14 = new byte[r2]     // Catch: java.lang.Exception -> L374
            r15 = 94
            r14[r4] = r15     // Catch: java.lang.Exception -> L374
            r14[r3] = r36     // Catch: java.lang.Exception -> L374
            r15 = -88
            r14[r9] = r15     // Catch: java.lang.Exception -> L374
            r14[r11] = r33     // Catch: java.lang.Exception -> L374
            r15 = -18
            r14[r8] = r15     // Catch: java.lang.Exception -> L374
            r14[r10] = r25     // Catch: java.lang.Exception -> L374
            java.lang.String r12 = p000.oa.m332(r12, r14)     // Catch: java.lang.Exception -> L374
            java.lang.reflect.Field r6 = r6.getDeclaredField(r12)     // Catch: java.lang.Exception -> L374
            java.lang.Object r1 = r6.get(r1)     // Catch: java.lang.Exception -> L374
            boolean r6 = r1 instanceof java.lang.Object[]     // Catch: java.lang.Exception -> L374
            if (r6 == 0) goto L1d4
        L1d1:
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.Exception -> L374
            goto L1d5
        L1d4:
            r1 = 0
        L1d5:
            if (r1 == 0) goto L374
            int r6 = r1.length     // Catch: java.lang.Exception -> L374
            if (r6 != 0) goto L1dc
            r6 = r3
            goto L1dd
        L1dc:
            r6 = r4
        L1dd:
            if (r6 == 0) goto L1e1
            goto L374
        L1e1:
            int r6 = r1.length     // Catch: java.lang.Exception -> L374
            r12 = r4
        L1e3:
            if (r12 >= r6) goto L374
            r14 = r1[r12]     // Catch: java.lang.Exception -> L374
            if (r14 == 0) goto L35c
            java.lang.Class r15 = r14.getClass()     // Catch: java.lang.Exception -> L374
            byte[] r5 = new byte[r13]     // Catch: java.lang.Exception -> L374
            r37 = -60
            r5[r4] = r37     // Catch: java.lang.Exception -> L374
            r5[r3] = r19     // Catch: java.lang.Exception -> L374
            r5[r9] = r13     // Catch: java.lang.Exception -> L374
            r37 = -27
            r5[r11] = r37     // Catch: java.lang.Exception -> L374
            r44 = 91
            r5[r8] = r44     // Catch: java.lang.Exception -> L374
            r44 = -90
            r5[r10] = r44     // Catch: java.lang.Exception -> L374
            r44 = -15
            r5[r2] = r44     // Catch: java.lang.Exception -> L374
            r44 = 82
            r5[r0] = r44     // Catch: java.lang.Exception -> L374
            r42 = 8
            r5[r42] = r25     // Catch: java.lang.Exception -> L374
            r44 = -3
            r5[r40] = r44     // Catch: java.lang.Exception -> L374
            r44 = 86
            r5[r7] = r44     // Catch: java.lang.Exception -> L374
            byte[] r13 = new byte[r2]     // Catch: java.lang.Exception -> L374
            r46 = -80
            r13[r4] = r46     // Catch: java.lang.Exception -> L374
            r13[r3] = r23     // Catch: java.lang.Exception -> L374
            r46 = 73
            r13[r9] = r46     // Catch: java.lang.Exception -> L374
            r46 = -100
            r13[r11] = r46     // Catch: java.lang.Exception -> L374
            r47 = 47
            r13[r8] = r47     // Catch: java.lang.Exception -> L374
            r13[r10] = r30     // Catch: java.lang.Exception -> L374
            java.lang.String r5 = p000.oa.m332(r5, r13)     // Catch: java.lang.Exception -> L374
            java.lang.Class[] r13 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L374
            java.lang.reflect.Method r5 = r15.getDeclaredMethod(r5, r13)     // Catch: java.lang.Exception -> L374
            java.lang.Object[] r13 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L374
            java.lang.Object r5 = r5.invoke(r14, r13)     // Catch: java.lang.Exception -> L374
            r13 = 53
            byte[] r14 = new byte[r13]     // Catch: java.lang.Exception -> L374
            r13 = 70
            r14[r4] = r13     // Catch: java.lang.Exception -> L374
            r13 = 110(0x6e, float:1.54E-43)
            r14[r3] = r13     // Catch: java.lang.Exception -> L374
            r14[r9] = r24     // Catch: java.lang.Exception -> L374
            r13 = -98
            r14[r11] = r13     // Catch: java.lang.Exception -> L374
            r13 = -59
            r14[r8] = r13     // Catch: java.lang.Exception -> L374
            r13 = -1
            r14[r10] = r13     // Catch: java.lang.Exception -> L374
            r13 = 73
            r14[r2] = r13     // Catch: java.lang.Exception -> L374
            r13 = 117(0x75, float:1.64E-43)
            r14[r0] = r13     // Catch: java.lang.Exception -> L374
            r13 = 8
            r14[r13] = r22     // Catch: java.lang.Exception -> L374
            r13 = -99
            r14[r40] = r13     // Catch: java.lang.Exception -> L374
            r13 = -111(0xffffffffffffff91, float:NaN)
            r14[r7] = r13     // Catch: java.lang.Exception -> L374
            r15 = -68
            r47 = 11
            r14[r47] = r15     // Catch: java.lang.Exception -> L374
            r15 = 74
            r14[r24] = r15     // Catch: java.lang.Exception -> L374
            r15 = 126(0x7e, float:1.77E-43)
            r14[r27] = r15     // Catch: java.lang.Exception -> L374
            r15 = 64
            r14[r22] = r15     // Catch: java.lang.Exception -> L374
            r14[r21] = r13     // Catch: java.lang.Exception -> L374
            r16 = 16
            r48 = -124(0xffffffffffffff84, float:NaN)
            r14[r16] = r48     // Catch: java.lang.Exception -> L374
            r16 = 17
            r48 = -17
            r14[r16] = r48     // Catch: java.lang.Exception -> L374
            r16 = 92
            r14[r20] = r16     // Catch: java.lang.Exception -> L374
            r16 = 19
            r14[r16] = r25     // Catch: java.lang.Exception -> L374
            r14[r38] = r38     // Catch: java.lang.Exception -> L374
            r16 = -99
            r41 = 21
            r14[r41] = r16     // Catch: java.lang.Exception -> L374
            r16 = -59
            r14[r34] = r16     // Catch: java.lang.Exception -> L374
            r16 = -14
            r14[r29] = r16     // Catch: java.lang.Exception -> L374
            r16 = 24
            r48 = 71
            r14[r16] = r48     // Catch: java.lang.Exception -> L374
            r16 = 25
            r48 = 117(0x75, float:1.64E-43)
            r14[r16] = r48     // Catch: java.lang.Exception -> L374
            r16 = 26
            r14[r16] = r18     // Catch: java.lang.Exception -> L374
            r16 = 27
            r14[r16] = r46     // Catch: java.lang.Exception -> L374
            r16 = -112(0xffffffffffffff90, float:NaN)
            r43 = 28
            r14[r43] = r16     // Catch: java.lang.Exception -> L374
            r16 = -16
            r14[r26] = r16     // Catch: java.lang.Exception -> L374
            r16 = 30
            r48 = 68
            r14[r16] = r48     // Catch: java.lang.Exception -> L374
            r14[r33] = r25     // Catch: java.lang.Exception -> L374
            r14[r23] = r38     // Catch: java.lang.Exception -> L374
            r16 = 33
            r48 = -117(0xffffffffffffff8b, float:NaN)
            r14[r16] = r48     // Catch: java.lang.Exception -> L374
            r16 = 34
            r48 = -107(0xffffffffffffff95, float:NaN)
            r14[r16] = r48     // Catch: java.lang.Exception -> L374
            r16 = 35
            r48 = -7
            r14[r16] = r48     // Catch: java.lang.Exception -> L374
            r16 = 8
            r14[r36] = r16     // Catch: java.lang.Exception -> L374
            r42 = 37
            r14[r42] = r28     // Catch: java.lang.Exception -> L374
            r42 = 38
            r14[r42] = r21     // Catch: java.lang.Exception -> L374
            r42 = 39
            r45 = -122(0xffffffffffffff86, float:NaN)
            r14[r42] = r45     // Catch: java.lang.Exception -> L374
            r42 = 40
            r48 = -119(0xffffffffffffff89, float:NaN)
            r14[r42] = r48     // Catch: java.lang.Exception -> L374
            r42 = 41
            r48 = -11
            r14[r42] = r48     // Catch: java.lang.Exception -> L374
            r42 = 70
            r14[r35] = r42     // Catch: java.lang.Exception -> L374
            r39 = 43
            r42 = 53
            r14[r39] = r42     // Catch: java.lang.Exception -> L374
            r48 = 44
            r49 = 34
            r14[r48] = r49     // Catch: java.lang.Exception -> L374
            r48 = -117(0xffffffffffffff8b, float:NaN)
            r14[r17] = r48     // Catch: java.lang.Exception -> L374
            r14[r32] = r13     // Catch: java.lang.Exception -> L374
            r13 = 47
            r48 = -7
            r14[r13] = r48     // Catch: java.lang.Exception -> L374
            r13 = 48
            r48 = 105(0x69, float:1.47E-43)
            r14[r13] = r48     // Catch: java.lang.Exception -> L374
            r13 = 49
            r48 = 105(0x69, float:1.47E-43)
            r14[r13] = r48     // Catch: java.lang.Exception -> L374
            r13 = 50
            r14[r13] = r20     // Catch: java.lang.Exception -> L374
            r13 = -109(0xffffffffffffff93, float:NaN)
            r14[r31] = r13     // Catch: java.lang.Exception -> L374
            r13 = 52
            r14[r13] = r46     // Catch: java.lang.Exception -> L374
            byte[] r13 = new byte[r2]     // Catch: java.lang.Exception -> L374
            r48 = 40
            r13[r4] = r48     // Catch: java.lang.Exception -> L374
            r48 = 27
            r13[r3] = r48     // Catch: java.lang.Exception -> L374
            r48 = 96
            r13[r9] = r48     // Catch: java.lang.Exception -> L374
            r48 = -14
            r13[r11] = r48     // Catch: java.lang.Exception -> L374
            r13[r8] = r37     // Catch: java.lang.Exception -> L374
            r13[r10] = r46     // Catch: java.lang.Exception -> L374
            java.lang.String r13 = p000.oa.m332(r14, r13)     // Catch: java.lang.Exception -> L374
            p000.h4.m187(r13, r5)     // Catch: java.lang.Exception -> L374
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Exception -> L374
            java.lang.String r5 = p000.jb.m213(r5)     // Catch: java.lang.Exception -> L374
            p000.h4.m186(r5)     // Catch: java.lang.Exception -> L374
            boolean r13 = p000.ta.m420(r5)     // Catch: java.lang.Exception -> L374
            r13 = r13 ^ r3
            if (r13 == 0) goto L36d
            goto L376
        L35c:
            r15 = r5
            r47 = r13
            r16 = 8
            r39 = 43
            r41 = 21
            r42 = 53
            r43 = 28
            r44 = 86
            r45 = -122(0xffffffffffffff86, float:NaN)
        L36d:
            int r12 = r12 + 1
            r5 = r15
            r13 = r47
            goto L1e3
        L374:
            java.lang.String r5 = ""
        L376:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static java.lang.String m119(android.app.Application r39, java.lang.String r40) {
            r1 = 3
            byte[] r0 = new byte[r1]
            r0 = {x032a: FILL_ARRAY_DATA , data: [127, 105, -127} // fill-array
            r2 = 6
            byte[] r3 = new byte[r2]
            r3 = {x0330: FILL_ARRAY_DATA , data: [30, 25, -15, -16, -67, -15} // fill-array
            p000.oa.m332(r0, r3)
            r3 = 11
            byte[] r0 = new byte[r3]
            r0 = {x0338: FILL_ARRAY_DATA , data: [-113, 91, -32, -20, -64, 82, -102, 116, -30, -22, -60} // fill-array
            byte[] r4 = new byte[r2]
            r4 = {x0342: FILL_ARRAY_DATA , data: [-1, 58, -125, -121, -95, 53} // fill-array
            p000.oa.m332(r0, r4)
            java.lang.String r0 = m118(r39, r40)
            boolean r4 = p000.ta.m420(r0)
            r5 = 0
            if (r4 == 0) goto L8a
            java.lang.String r4 = ""
            byte[] r0 = new byte[r1]
            r0 = {x034a: FILL_ARRAY_DATA , data: [-66, 76, 114} // fill-array
            byte[] r6 = new byte[r2]
            r6 = {x0350: FILL_ARRAY_DATA , data: [-33, 60, 2, 102, 127, 2} // fill-array
            p000.oa.m332(r0, r6)
            byte[] r0 = new byte[r2]
            r0 = {x0358: FILL_ARRAY_DATA , data: [31, -126, 22, -51, 63, 44} // fill-array
            byte[] r6 = new byte[r2]
            r6 = {x0360: FILL_ARRAY_DATA , data: [126, -9, 98, -91, 80, 94} // fill-array
            p000.oa.m332(r0, r6)
            android.content.ContentResolver r7 = r39.getContentResolver()     // Catch: java.lang.Exception -> L7f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7f
            r0.<init>()     // Catch: java.lang.Exception -> L7f
            java.lang.String r6 = "content://"
            r0.append(r6)     // Catch: java.lang.Exception -> L7f
            r6 = r40
            r0.append(r6)     // Catch: java.lang.Exception -> L7f
            java.lang.String r6 = "/s"
            r0.append(r6)     // Catch: java.lang.Exception -> L7f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L7f
            android.net.Uri r8 = android.net.Uri.parse(r0)     // Catch: java.lang.Exception -> L7f
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            android.database.Cursor r0 = r7.query(r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Exception -> L7f
            if (r0 == 0) goto L89
            r0.moveToFirst()     // Catch: java.lang.Exception -> L7f
            java.lang.String r6 = r0.getString(r5)     // Catch: java.lang.Exception -> L7f
            if (r6 != 0) goto L7a
            r6 = r4
        L7a:
            r0.close()     // Catch: java.lang.Exception -> L7f
            r0 = r6
            goto L8a
        L7f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 == 0) goto L89
            p000.g5.m166(r0)
        L89:
            r0 = r4
        L8a:
            r4 = 13
            byte[] r6 = new byte[r4]
            r6 = {x0368: FILL_ARRAY_DATA , data: [-40, 15, -25, 64, 2, -12, -5, 7, -29, 69, 33, -22, -50} // fill-array
            byte[] r7 = new byte[r2]
            r7 = {x0374: FILL_ARRAY_DATA , data: [-85, 102, -128, 46, 64, -115} // fill-array
            p000.oa.m332(r6, r7)
            java.lang.String r6 = ۟.m3.a.m280()
            int r6 = r6.length()
            r7 = 1
            if (r6 <= 0) goto La6
            r6 = r7
            goto La7
        La6:
            r6 = r5
        La7:
            if (r6 == 0) goto L329
            r6 = 7
            r8 = 5
            r9 = 4
            r10 = 2
            r11 = -12
            r12 = 79
            r13 = 9
            r15 = -61
            r16 = -35
            r17 = -50
            r18 = 8
            java.io.File r4 = new java.io.File     // Catch: java.lang.Exception -> L124
            java.lang.String r14 = ۟.m3.a.m280()     // Catch: java.lang.Exception -> L124
            r4.<init>(r14)     // Catch: java.lang.Exception -> L124
            ۟.n r4 = p000.n.m289(r4)     // Catch: java.lang.Exception -> L124
            byte[] r14 = new byte[r3]     // Catch: java.lang.Exception -> L124
            r19 = -120(0xffffffffffffff88, float:NaN)
            r14[r5] = r19     // Catch: java.lang.Exception -> L124
            r19 = -68
            r14[r7] = r19     // Catch: java.lang.Exception -> L124
            r19 = 54
            r14[r10] = r19     // Catch: java.lang.Exception -> L124
            r14[r1] = r11     // Catch: java.lang.Exception -> L124
            r19 = -128(0xffffffffffffff80, float:NaN)
            r14[r9] = r19     // Catch: java.lang.Exception -> L124
            r14[r8] = r12     // Catch: java.lang.Exception -> L124
            r14[r2] = r15     // Catch: java.lang.Exception -> L124
            r19 = -32
            r14[r6] = r19     // Catch: java.lang.Exception -> L124
            r19 = 125(0x7d, float:1.75E-43)
            r14[r18] = r19     // Catch: java.lang.Exception -> L124
            r19 = -69
            r14[r13] = r19     // Catch: java.lang.Exception -> L124
            r19 = 10
            r14[r19] = r16     // Catch: java.lang.Exception -> L124
            byte[] r12 = new byte[r2]     // Catch: java.lang.Exception -> L124
            r20 = -21
            r12[r5] = r20     // Catch: java.lang.Exception -> L124
            r12[r7] = r17     // Catch: java.lang.Exception -> L124
            r20 = 83
            r12[r10] = r20     // Catch: java.lang.Exception -> L124
            r20 = -107(0xffffffffffffff95, float:NaN)
            r12[r1] = r20     // Catch: java.lang.Exception -> L124
            r12[r9] = r11     // Catch: java.lang.Exception -> L124
            r20 = 42
            r12[r8] = r20     // Catch: java.lang.Exception -> L124
            p000.oa.m332(r14, r12)     // Catch: java.lang.Exception -> L124
            int r12 = r4.m291()     // Catch: java.lang.Exception -> L124
            if (r12 != r10) goto L329
            ۟.g0 r4 = r4.m290()     // Catch: java.lang.Exception -> L124
            java.lang.String r4 = r4.f386     // Catch: java.lang.Exception -> L124
            p000.h4.m186(r4)     // Catch: java.lang.Exception -> L124
            int r1 = r4.length()     // Catch: java.lang.Exception -> L124
            if (r1 <= 0) goto L11f
            r5 = r7
        L11f:
            if (r5 == 0) goto L329
        L121:
            r0 = r4
            goto L329
        L124:
            net.dongliu.apk.parser.ApkFile r4 = new net.dongliu.apk.parser.ApkFile     // Catch: java.lang.Exception -> L329
            java.io.File r12 = new java.io.File     // Catch: java.lang.Exception -> L329
            java.lang.String r14 = ۟.m3.a.m280()     // Catch: java.lang.Exception -> L329
            r12.<init>(r14)     // Catch: java.lang.Exception -> L329
            r4.<init>(r12)     // Catch: java.lang.Exception -> L329
            java.util.List r4 = r4.getApkV2Singers()     // Catch: java.lang.Exception -> L329
            r12 = 20
            byte[] r14 = new byte[r12]     // Catch: java.lang.Exception -> L329
            r20 = -89
            r14[r5] = r20     // Catch: java.lang.Exception -> L329
            r20 = 114(0x72, float:1.6E-43)
            r14[r7] = r20     // Catch: java.lang.Exception -> L329
            r21 = 26
            r14[r10] = r21     // Catch: java.lang.Exception -> L329
            r21 = -1
            r14[r1] = r21     // Catch: java.lang.Exception -> L329
            r21 = -92
            r14[r9] = r21     // Catch: java.lang.Exception -> L329
            r21 = 17
            r14[r8] = r21     // Catch: java.lang.Exception -> L329
            r22 = -106(0xffffffffffffff96, float:NaN)
            r14[r2] = r22     // Catch: java.lang.Exception -> L329
            r23 = 37
            r14[r6] = r23     // Catch: java.lang.Exception -> L329
            r23 = 61
            r14[r18] = r23     // Catch: java.lang.Exception -> L329
            r23 = -41
            r14[r13] = r23     // Catch: java.lang.Exception -> L329
            r23 = -70
            r24 = 10
            r14[r24] = r23     // Catch: java.lang.Exception -> L329
            r24 = 29
            r14[r3] = r24     // Catch: java.lang.Exception -> L329
            r25 = 12
            r26 = -91
            r14[r25] = r26     // Catch: java.lang.Exception -> L329
            r27 = 101(0x65, float:1.42E-43)
            r28 = 13
            r14[r28] = r27     // Catch: java.lang.Exception -> L329
            r28 = 14
            r14[r28] = r24     // Catch: java.lang.Exception -> L329
            r12 = 15
            r14[r12] = r22     // Catch: java.lang.Exception -> L329
            r29 = -6
            r30 = 16
            r14[r30] = r29     // Catch: java.lang.Exception -> L329
            r31 = 84
            r14[r21] = r31     // Catch: java.lang.Exception -> L329
            r31 = -18
            r32 = 18
            r14[r32] = r31     // Catch: java.lang.Exception -> L329
            r31 = 62
            r33 = 19
            r14[r33] = r31     // Catch: java.lang.Exception -> L329
            byte[] r12 = new byte[r2]     // Catch: java.lang.Exception -> L329
            r34 = -64
            r12[r5] = r34     // Catch: java.lang.Exception -> L329
            r34 = 23
            r12[r7] = r34     // Catch: java.lang.Exception -> L329
            r35 = 110(0x6e, float:1.54E-43)
            r12[r10] = r35     // Catch: java.lang.Exception -> L329
            r35 = -66
            r12[r1] = r35     // Catch: java.lang.Exception -> L329
            r35 = -44
            r12[r9] = r35     // Catch: java.lang.Exception -> L329
            r35 = 122(0x7a, float:1.71E-43)
            r12[r8] = r35     // Catch: java.lang.Exception -> L329
            java.lang.String r12 = p000.oa.m332(r14, r12)     // Catch: java.lang.Exception -> L329
            p000.h4.m188(r12, r4)     // Catch: java.lang.Exception -> L329
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L329
        L1bb:
            boolean r12 = r4.hasNext()     // Catch: java.lang.Exception -> L329
            if (r12 == 0) goto L329
            java.lang.Object r12 = r4.next()     // Catch: java.lang.Exception -> L329
            net.dongliu.apk.parser.bean.ApkV2Signer r12 = (net.dongliu.apk.parser.bean.ApkV2Signer) r12     // Catch: java.lang.Exception -> L329
            java.util.List r12 = r12.getCertificateMetas()     // Catch: java.lang.Exception -> L329
            r14 = 24
            byte[] r13 = new byte[r14]     // Catch: java.lang.Exception -> L329
            r13[r5] = r14     // Catch: java.lang.Exception -> L329
            r14 = 52
            r13[r7] = r14     // Catch: java.lang.Exception -> L329
            r13[r10] = r15     // Catch: java.lang.Exception -> L329
            r36 = -5
            r13[r1] = r36     // Catch: java.lang.Exception -> L329
            r36 = -33
            r13[r9] = r36     // Catch: java.lang.Exception -> L329
            r13[r8] = r11     // Catch: java.lang.Exception -> L329
            r13[r2] = r3     // Catch: java.lang.Exception -> L329
            r36 = 56
            r13[r6] = r36     // Catch: java.lang.Exception -> L329
            r36 = -47
            r13[r18] = r36     // Catch: java.lang.Exception -> L329
            r35 = 9
            r13[r35] = r36     // Catch: java.lang.Exception -> L329
            r36 = -39
            r37 = 10
            r13[r37] = r36     // Catch: java.lang.Exception -> L329
            r36 = -25
            r13[r3] = r36     // Catch: java.lang.Exception -> L329
            r13[r25] = r3     // Catch: java.lang.Exception -> L329
            r37 = 13
            r13[r37] = r14     // Catch: java.lang.Exception -> L329
            r13[r28] = r29     // Catch: java.lang.Exception -> L329
            r14 = 15
            r13[r14] = r16     // Catch: java.lang.Exception -> L329
            r13[r30] = r17     // Catch: java.lang.Exception -> L329
            r13[r21] = r36     // Catch: java.lang.Exception -> L329
            r13[r32] = r25     // Catch: java.lang.Exception -> L329
            r14 = 121(0x79, float:1.7E-43)
            r13[r33] = r14     // Catch: java.lang.Exception -> L329
            r14 = -103(0xffffffffffffff99, float:NaN)
            r24 = 20
            r13[r24] = r14     // Catch: java.lang.Exception -> L329
            r14 = 21
            r13[r14] = r22     // Catch: java.lang.Exception -> L329
            r14 = 22
            r36 = -108(0xffffffffffffff94, float:NaN)
            r13[r14] = r36     // Catch: java.lang.Exception -> L329
            r14 = -81
            r13[r34] = r14     // Catch: java.lang.Exception -> L329
            byte[] r14 = new byte[r2]     // Catch: java.lang.Exception -> L329
            r36 = 127(0x7f, float:1.78E-43)
            r14[r5] = r36     // Catch: java.lang.Exception -> L329
            r36 = 81
            r14[r7] = r36     // Catch: java.lang.Exception -> L329
            r36 = -73
            r14[r10] = r36     // Catch: java.lang.Exception -> L329
            r36 = -72
            r14[r1] = r36     // Catch: java.lang.Exception -> L329
            r14[r9] = r23     // Catch: java.lang.Exception -> L329
            r36 = -122(0xffffffffffffff86, float:NaN)
            r14[r8] = r36     // Catch: java.lang.Exception -> L329
            java.lang.String r13 = p000.oa.m332(r13, r14)     // Catch: java.lang.Exception -> L329
            p000.h4.m188(r13, r12)     // Catch: java.lang.Exception -> L329
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Exception -> L329
        L246:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Exception -> L329
            if (r13 == 0) goto L325
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Exception -> L329
            net.dongliu.apk.parser.bean.CertificateMeta r13 = (net.dongliu.apk.parser.bean.CertificateMeta) r13     // Catch: java.lang.Exception -> L329
            java.lang.String r14 = r13.getCertMd5()     // Catch: java.lang.Exception -> L329
            r11 = 15
            byte[] r15 = new byte[r11]     // Catch: java.lang.Exception -> L329
            r15[r5] = r10     // Catch: java.lang.Exception -> L329
            r11 = 55
            r15[r7] = r11     // Catch: java.lang.Exception -> L329
            r11 = 30
            r15[r10] = r11     // Catch: java.lang.Exception -> L329
            r11 = -45
            r15[r1] = r11     // Catch: java.lang.Exception -> L329
            r15[r9] = r34     // Catch: java.lang.Exception -> L329
            r11 = 112(0x70, float:1.57E-43)
            r15[r8] = r11     // Catch: java.lang.Exception -> L329
            r15[r2] = r21     // Catch: java.lang.Exception -> L329
            r11 = 31
            r15[r6] = r11     // Catch: java.lang.Exception -> L329
            r15[r18] = r28     // Catch: java.lang.Exception -> L329
            r11 = 9
            r15[r11] = r26     // Catch: java.lang.Exception -> L329
            r11 = 90
            r38 = 10
            r15[r38] = r11     // Catch: java.lang.Exception -> L329
            r11 = 44
            r15[r3] = r11     // Catch: java.lang.Exception -> L329
            r11 = 75
            r15[r25] = r11     // Catch: java.lang.Exception -> L329
            r11 = 124(0x7c, float:1.74E-43)
            r38 = 13
            r15[r38] = r11     // Catch: java.lang.Exception -> L329
            r11 = 67
            r15[r28] = r11     // Catch: java.lang.Exception -> L329
            byte[] r11 = new byte[r2]     // Catch: java.lang.Exception -> L329
            r11[r5] = r27     // Catch: java.lang.Exception -> L329
            r38 = 82
            r11[r7] = r38     // Catch: java.lang.Exception -> L329
            r38 = 106(0x6a, float:1.49E-43)
            r11[r10] = r38     // Catch: java.lang.Exception -> L329
            r38 = -112(0xffffffffffffff90, float:NaN)
            r11[r1] = r38     // Catch: java.lang.Exception -> L329
            r11[r9] = r20     // Catch: java.lang.Exception -> L329
            r11[r8] = r10     // Catch: java.lang.Exception -> L329
            java.lang.String r11 = p000.oa.m332(r15, r11)     // Catch: java.lang.Exception -> L329
            p000.h4.m188(r11, r14)     // Catch: java.lang.Exception -> L329
            int r11 = r14.length()     // Catch: java.lang.Exception -> L329
            if (r11 <= 0) goto L2b5
            r11 = r7
            goto L2b6
        L2b5:
            r11 = r5
        L2b6:
            if (r11 == 0) goto L31f
            java.lang.String r4 = r13.getCertMd5()     // Catch: java.lang.Exception -> L329
            r11 = 15
            byte[] r11 = new byte[r11]     // Catch: java.lang.Exception -> L329
            r13 = 79
            r11[r5] = r13     // Catch: java.lang.Exception -> L329
            r12 = -86
            r11[r7] = r12     // Catch: java.lang.Exception -> L329
            r11[r10] = r31     // Catch: java.lang.Exception -> L329
            r12 = -14
            r11[r1] = r12     // Catch: java.lang.Exception -> L329
            r12 = -52
            r11[r9] = r12     // Catch: java.lang.Exception -> L329
            r12 = 113(0x71, float:1.58E-43)
            r11[r8] = r12     // Catch: java.lang.Exception -> L329
            r12 = 92
            r11[r2] = r12     // Catch: java.lang.Exception -> L329
            r12 = -126(0xffffffffffffff82, float:NaN)
            r11[r6] = r12     // Catch: java.lang.Exception -> L329
            r6 = 46
            r11[r18] = r6     // Catch: java.lang.Exception -> L329
            r6 = -124(0xffffffffffffff84, float:NaN)
            r14 = 9
            r11[r14] = r6     // Catch: java.lang.Exception -> L329
            r6 = -127(0xffffffffffffff81, float:NaN)
            r15 = 10
            r11[r15] = r6     // Catch: java.lang.Exception -> L329
            r6 = 45
            r11[r3] = r6     // Catch: java.lang.Exception -> L329
            r11[r25] = r2     // Catch: java.lang.Exception -> L329
            r3 = -31
            r19 = 13
            r11[r19] = r3     // Catch: java.lang.Exception -> L329
            r3 = 99
            r11[r28] = r3     // Catch: java.lang.Exception -> L329
            byte[] r2 = new byte[r2]     // Catch: java.lang.Exception -> L329
            r3 = 40
            r2[r5] = r3     // Catch: java.lang.Exception -> L329
            r3 = -49
            r2[r7] = r3     // Catch: java.lang.Exception -> L329
            r3 = 74
            r2[r10] = r3     // Catch: java.lang.Exception -> L329
            r3 = -79
            r2[r1] = r3     // Catch: java.lang.Exception -> L329
            r3 = -87
            r2[r9] = r3     // Catch: java.lang.Exception -> L329
            r2[r8] = r1     // Catch: java.lang.Exception -> L329
            java.lang.String r1 = p000.oa.m332(r11, r2)     // Catch: java.lang.Exception -> L329
            p000.h4.m188(r1, r4)     // Catch: java.lang.Exception -> L329
            goto L121
        L31f:
            r11 = -12
            r15 = -61
            goto L246
        L325:
            r13 = 9
            goto L1bb
        L329:
            return r0
    }
}
