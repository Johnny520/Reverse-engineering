package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k3 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ int f638;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ p000.g3 f639;

    public /* synthetic */ k3(p000.g3 r1, int r2) {
            r0 = this;
            r0.f638 = r2
            r0.f639 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r42 = this;
            r0 = r42
            int r1 = r0.f638
            r2 = 1
            r3 = 6
            r4 = 4
            r5 = 0
            r6 = 3
            r7 = 16
            r8 = 0
            r9 = 9
            r10 = 7
            switch(r1) {
                case 0: goto L46b;
                case 1: goto L14;
                default: goto L12;
            }
        L12:
            goto L486
        L14:
            ۟.g3 r1 = r0.f639
            byte[] r11 = new byte[r9]
            r11 = {x0560: FILL_ARRAY_DATA , data: [-26, -3, 76, -112, 70, -117, -93, -3, 70} // fill-array
            byte[] r12 = new byte[r3]
            r12 = {x056a: FILL_ARRAY_DATA , data: [-62, -98, 45, -4, 42, -23} // fill-array
            java.lang.String r11 = p000.oa.m332(r11, r12)
            p000.h4.m189(r11, r1)
            ۟.h2$a r11 = p000.h2.f427
            r11.getClass()
            java.lang.String r11 = ۟.h2.a.m183()
            java.lang.String r11 = p000.jb.m208(r11)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "config-26.json"
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.String r11 = p000.u6.m433(r11, r5, r3)
            int r12 = r11.length()
            if (r12 <= 0) goto L51
            r12 = r2
            goto L52
        L51:
            r12 = r8
        L52:
            if (r12 == 0) goto L6c
            java.lang.String r12 = p000.a.f83
            byte[] r7 = new byte[r7]
            r7 = {x0572: FILL_ARRAY_DATA , data: [62, -102, 97, 2, 30, -9, 109, -59, 61, 82, 65, -90, 107, -61, 57, 82} // fill-array
            byte[] r12 = new byte[r3]
            r12 = {x057e: FILL_ARRAY_DATA , data: [93, -11, 15, 100, 119, -112} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r12)
            java.lang.String r7 = p000.a.m23(r11, r7)
            java.lang.String r11 = p000.jb.m208(r7)
        L6c:
            byte[] r7 = new byte[r2]
            r12 = -28
            r7[r8] = r12
            byte[] r12 = new byte[r3]
            r12 = {x0586: FILL_ARRAY_DATA , data: [-97, 100, 105, 103, -10, 85} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r12)
            boolean r7 = p000.ta.m423(r11, r7)
            if (r7 != 0) goto L82
            goto L9c
        L82:
            byte[] r7 = new byte[r2]
            r12 = -16
            r7[r8] = r12
            byte[] r12 = new byte[r3]
            r12 = {x058e: FILL_ARRAY_DATA , data: [-117, 76, -55, -55, -72, 19} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r12)
            boolean r7 = p000.ta.m423(r11, r7)
            if (r7 != r2) goto L99
            r7 = r2
            goto L9a
        L99:
            r7 = r8
        L9a:
            if (r7 != 0) goto L9f
        L9c:
            r0 = r1
            goto L467
        L9f:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>(r11)
            ۟.o5 r11 = new ۟.o5
            byte[] r12 = new byte[r3]
            r12 = {x0596: FILL_ARRAY_DATA , data: [0, -93, -88, 37, 16, -91} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x059e: FILL_ARRAY_DATA , data: [110, -52, -36, 76, 115, -64} // fill-array
            java.lang.String r12 = p000.oa.m332(r12, r13)
            org.json.JSONObject r12 = r7.optJSONObject(r12)
            r13 = 5
            if (r12 != 0) goto Lbd
            goto L182
        Lbd:
            ۟.p1 r24 = new ۟.p1
            byte[] r14 = new byte[r13]
            r14 = {x05a6: FILL_ARRAY_DATA , data: [-8, 63, 49, -73, 26} // fill-array
            byte[] r15 = new byte[r3]
            r15 = {x05ae: FILL_ARRAY_DATA , data: [-103, 83, 70, -42, 99, -48} // fill-array
            java.lang.String r14 = p000.oa.m332(r14, r15)
            boolean r14 = r12.optBoolean(r14)
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r14)
            byte[] r14 = new byte[r13]
            r14 = {x05b6: FILL_ARRAY_DATA , data: [18, -120, -70, 100, 70} // fill-array
            byte[] r5 = new byte[r3]
            r5 = {x05be: FILL_ARRAY_DATA , data: [102, -31, -50, 8, 35, -85} // fill-array
            java.lang.String r5 = p000.oa.m332(r14, r5)
            java.lang.String r16 = r12.optString(r5)
            byte[] r5 = new byte[r13]
            r5 = {x05c6: FILL_ARRAY_DATA , data: [85, -32, -55, -57, 9} // fill-array
            byte[] r14 = new byte[r3]
            r14 = {x05ce: FILL_ARRAY_DATA , data: [60, -114, -67, -75, 102, -67} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r14)
            java.lang.String r17 = r12.optString(r5)
            byte[] r5 = new byte[r4]
            r5 = {x05d6: FILL_ARRAY_DATA , data: [-120, -71, 90, -78} // fill-array
            byte[] r14 = new byte[r3]
            r14 = {x05dc: FILL_ARRAY_DATA , data: [-19, -63, 51, -58, 0, -87} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r14)
            boolean r5 = r12.optBoolean(r5)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r5)
            byte[] r5 = new byte[r4]
            r5 = {x05e4: FILL_ARRAY_DATA , data: [10, -77, 35, -113} // fill-array
            byte[] r14 = new byte[r3]
            r14 = {x05ea: FILL_ARRAY_DATA , data: [121, -37, 76, -8, 71, 13} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r14)
            boolean r5 = r12.optBoolean(r5)
            java.lang.Boolean r19 = java.lang.Boolean.valueOf(r5)
            byte[] r5 = new byte[r2]
            r14 = -104(0xffffffffffffff98, float:NaN)
            r5[r8] = r14
            byte[] r14 = new byte[r3]
            r14 = {x05f2: FILL_ARRAY_DATA , data: [-2, 88, 59, -19, -89, 96} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r14)
            boolean r5 = r12.optBoolean(r5)
            java.lang.Boolean r20 = java.lang.Boolean.valueOf(r5)
            byte[] r5 = new byte[r6]
            r5 = {x05fa: FILL_ARRAY_DATA , data: [113, 95, 71} // fill-array
            byte[] r6 = new byte[r3]
            r6 = {x0600: FILL_ARRAY_DATA , data: [4, 45, 43, -1, -76, 48} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            java.lang.String r21 = r12.optString(r5)
            byte[] r5 = new byte[r4]
            r5 = {x0608: FILL_ARRAY_DATA , data: [114, -114, 95, -68} // fill-array
            byte[] r6 = new byte[r3]
            r6 = {x060e: FILL_ARRAY_DATA , data: [6, -25, 50, -39, -19, 108} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            int r5 = r12.optInt(r5)
            java.lang.Integer r22 = java.lang.Integer.valueOf(r5)
            byte[] r5 = new byte[r2]
            r6 = -120(0xffffffffffffff88, float:NaN)
            r5[r8] = r6
            byte[] r6 = new byte[r3]
            r6 = {x0616: FILL_ARRAY_DATA , data: [-2, 108, 40, 100, 43, -112} // fill-array
            java.lang.String r5 = p000.oa.m332(r5, r6)
            int r5 = r12.optInt(r5)
            java.lang.Integer r23 = java.lang.Integer.valueOf(r5)
            r14 = r24
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            r5 = r24
        L182:
            byte[] r6 = new byte[r4]
            r6 = {x061e: FILL_ARRAY_DATA , data: [100, 95, 46, -128} // fill-array
            byte[] r12 = new byte[r3]
            r12 = {x0624: FILL_ARRAY_DATA , data: [7, 48, 64, -26, -22, 59} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r12)
            org.json.JSONObject r6 = r7.optJSONObject(r6)
            r12 = 2
            if (r6 != 0) goto L19a
            r14 = 0
            goto L2d3
        L19a:
            ۟.o1 r14 = new ۟.o1
            r25 = r14
            byte[] r15 = new byte[r12]
            r15 = {x062c: FILL_ARRAY_DATA , data: [-117, 125} // fill-array
            byte[] r4 = new byte[r3]
            r4 = {x0632: FILL_ARRAY_DATA , data: [-23, 11, 14, -1, 43, 68} // fill-array
            java.lang.String r4 = p000.oa.m332(r15, r4)
            int r4 = r6.optInt(r4)
            java.lang.Integer r26 = java.lang.Integer.valueOf(r4)
            r4 = 10
            byte[] r15 = new byte[r4]
            r15 = {x063a: FILL_ARRAY_DATA , data: [63, -14, 118, 115, -42, 18, 59, -5, 107, 96} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x0644: FILL_ARRAY_DATA , data: [76, -102, 25, 4, -124, 119} // fill-array
            java.lang.String r13 = p000.oa.m332(r15, r13)
            boolean r13 = r6.optBoolean(r13)
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r13)
            byte[] r13 = new byte[r4]
            r13 = {x064c: FILL_ARRAY_DATA , data: [12, 122, -35, 54, 119, 66, 49, 111, -49, 57} // fill-array
            byte[] r15 = new byte[r3]
            r15 = {x0656: FILL_ARRAY_DATA , data: [126, 31, -86, 87, 5, 38} // fill-array
            java.lang.String r13 = p000.oa.m332(r13, r15)
            boolean r13 = r6.optBoolean(r13)
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r13)
            byte[] r4 = new byte[r4]
            r4 = {x065e: FILL_ARRAY_DATA , data: [-105, -76, 82, -66, 93, 50, -125, -128, 89, -121} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x0668: FILL_ARRAY_DATA , data: [-25, -43, 43, -21, 46, 87} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r13)
            java.lang.String r29 = r6.optString(r4)
            byte[] r4 = new byte[r10]
            r4 = {x0670: FILL_ARRAY_DATA , data: [-2, 3, -91, 14, 5, 8, -25} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x0678: FILL_ARRAY_DATA , data: [-117, 112, -64, 106, 80, 122} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r13)
            java.lang.String r30 = r6.optString(r4)
            r4 = 8
            byte[] r13 = new byte[r4]
            r13 = {x0680: FILL_ARRAY_DATA , data: [-26, -112, 40, 40, -3, -73, -3, -110} // fill-array
            byte[] r15 = new byte[r3]
            r15 = {x0688: FILL_ARRAY_DATA , data: [-113, -2, 92, 90, -110, -30} // fill-array
            java.lang.String r13 = p000.oa.m332(r13, r15)
            java.lang.String r31 = r6.optString(r13)
            r13 = 12
            byte[] r13 = new byte[r13]
            r13 = {x0690: FILL_ARRAY_DATA , data: [117, 14, 6, 121, -53, -13, 82, 27, 1, 119, -51, -14} // fill-array
            byte[] r15 = new byte[r3]
            r15 = {x069a: FILL_ARRAY_DATA , data: [0, 126, 98, 24, -65, -106} // fill-array
            java.lang.String r13 = p000.oa.m332(r13, r15)
            java.lang.String r32 = r6.optString(r13)
            byte[] r13 = new byte[r9]
            r13 = {x06a2: FILL_ARRAY_DATA , data: [91, 64, 81, -89, -114, -13, 124, 87, 74} // fill-array
            byte[] r15 = new byte[r3]
            r15 = {x06ac: FILL_ARRAY_DATA , data: [41, 37, 38, -58, -4, -105} // fill-array
            java.lang.String r13 = p000.oa.m332(r13, r15)
            java.lang.String r33 = r6.optString(r13)
            byte[] r4 = new byte[r4]
            r4 = {x06b4: FILL_ARRAY_DATA , data: [-56, 76, -32, 55, 118, 95, -39, 72} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x06bc: FILL_ARRAY_DATA , data: [-85, 36, -123, 84, 29, 10} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r13)
            java.lang.String r34 = r6.optString(r4)
            byte[] r4 = new byte[r12]
            r4 = {x06c4: FILL_ARRAY_DATA , data: [60, 59} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x06ca: FILL_ARRAY_DATA , data: [72, 92, 84, 27, -86, 6} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r13)
            java.lang.String r35 = r6.optString(r4)
            byte[] r4 = new byte[r10]
            r4 = {x06d2: FILL_ARRAY_DATA , data: [-17, -70, 10, -14, -6, 103, -18} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x06da: FILL_ARRAY_DATA , data: [-98, -53, 77, -128, -107, 18} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r13)
            java.lang.String r36 = r6.optString(r4)
            byte[] r4 = new byte[r12]
            r4 = {x06e2: FILL_ARRAY_DATA , data: [73, -70} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x06e8: FILL_ARRAY_DATA , data: [45, -39, -78, -88, 100, 81} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r13)
            java.lang.String r37 = r6.optString(r4)
            byte[] r4 = new byte[r10]
            r4 = {x06f0: FILL_ARRAY_DATA , data: [24, -125, 107, 106, -111, -71, 5} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x06f8: FILL_ARRAY_DATA , data: [117, -30, 2, 4, -59, -48} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r13)
            java.lang.String r38 = r6.optString(r4)
            byte[] r4 = new byte[r9]
            r4 = {x0700: FILL_ARRAY_DATA , data: [61, -48, 63, 7, 26, -115, 27, -36, 56} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x070a: FILL_ARRAY_DATA , data: [79, -75, 72, 102, 104, -23} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r13)
            java.lang.String r39 = r6.optString(r4)
            byte[] r4 = new byte[r3]
            r4 = {x0712: FILL_ARRAY_DATA , data: [-53, -77, 79, -78, 14, 28} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x071a: FILL_ARRAY_DATA , data: [-92, -33, 43, -26, 103, 108} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r13)
            java.lang.String r40 = r6.optString(r4)
            byte[] r4 = new byte[r9]
            r4 = {x0722: FILL_ARRAY_DATA , data: [112, 68, -62, 19, -96, -15, 74, 66, -64} // fill-array
            byte[] r9 = new byte[r3]
            r9 = {x072c: FILL_ARRAY_DATA , data: [30, 43, -80, 126, -63, -99} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r9)
            java.lang.String r41 = r6.optString(r4)
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L2d3:
            byte[] r4 = new byte[r10]
            r4 = {x0734: FILL_ARRAY_DATA , data: [92, 61, -17, 30, -23, 84, 73} // fill-array
            byte[] r6 = new byte[r3]
            r6 = {x073c: FILL_ARRAY_DATA , data: [61, 77, -97, 74, -116, 44} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r6)
            java.lang.String r15 = r7.optString(r4)
            byte[] r4 = new byte[r3]
            r4 = {x0744: FILL_ARRAY_DATA , data: [11, 84, 21, 39, 98, 3} // fill-array
            byte[] r6 = new byte[r3]
            r6 = {x074c: FILL_ARRAY_DATA , data: [120, 60, 122, 80, 47, 115} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r6)
            boolean r4 = r7.optBoolean(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            byte[] r6 = new byte[r3]
            r6 = {x0754: FILL_ARRAY_DATA , data: [8, -7, 13, -22, -19, -89} // fill-array
            byte[] r9 = new byte[r3]
            r9 = {x075c: FILL_ARRAY_DATA , data: [123, -115, 108, -98, -104, -44} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r9)
            int r6 = r7.optInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            byte[] r9 = new byte[r3]
            r9 = {x0764: FILL_ARRAY_DATA , data: [-96, -110, -110, -108, 81, -10} // fill-array
            byte[] r10 = new byte[r3]
            r10 = {x076c: FILL_ARRAY_DATA , data: [-43, -30, -10, -11, 37, -109} // fill-array
            java.lang.String r9 = p000.oa.m332(r9, r10)
            org.json.JSONObject r7 = r7.optJSONObject(r9)
            if (r7 != 0) goto L32b
            r20 = r1
            r18 = 0
            goto L45b
        L32b:
            ۟.wb r9 = new ۟.wb
            byte[] r10 = new byte[r2]
            r13 = 64
            r10[r8] = r13
            byte[] r13 = new byte[r3]
            r13 = {x0774: FILL_ARRAY_DATA , data: [53, -15, -62, 52, 51, 92} // fill-array
            java.lang.String r10 = p000.oa.m332(r10, r13)
            boolean r26 = r7.optBoolean(r10)
            byte[] r2 = new byte[r2]
            r10 = 118(0x76, float:1.65E-43)
            r2[r8] = r10
            byte[] r8 = new byte[r3]
            r8 = {x077c: FILL_ARRAY_DATA , data: [16, 112, 7, 89, -50, -55} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r8)
            boolean r27 = r7.optBoolean(r2)
            byte[] r2 = new byte[r12]
            r2 = {x0784: FILL_ARRAY_DATA , data: [-25, -82} // fill-array
            byte[] r8 = new byte[r3]
            r8 = {x078a: FILL_ARRAY_DATA , data: [-111, -64, 44, -45, -86, 117} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r8)
            java.lang.String r2 = r7.optString(r2)
            r8 = 14
            byte[] r10 = new byte[r8]
            r10 = {x0792: FILL_ARRAY_DATA , data: [-38, -74, 37, 92, -105, -97, -36, -88, 54, 39, -51, -61, -101, -17} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x079e: FILL_ARRAY_DATA , data: [-75, -58, 81, 15, -29, -19} // fill-array
            java.lang.String r10 = p000.oa.m332(r10, r13)
            p000.h4.m188(r10, r2)
            byte[] r10 = new byte[r12]
            r10 = {x07a6: FILL_ARRAY_DATA , data: [93, -111} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x07ac: FILL_ARRAY_DATA , data: [43, -14, -125, -70, -78, -71} // fill-array
            java.lang.String r10 = p000.oa.m332(r10, r13)
            int r29 = r7.optInt(r10)
            byte[] r10 = new byte[r12]
            r10 = {x07b4: FILL_ARRAY_DATA , data: [-67, -106} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x07ba: FILL_ARRAY_DATA , data: [-39, -29, 24, 28, -13, 90} // fill-array
            java.lang.String r10 = p000.oa.m332(r10, r13)
            java.lang.String r10 = r7.optString(r10)
            byte[] r13 = new byte[r8]
            r13 = {x07c2: FILL_ARRAY_DATA , data: [61, -57, -16, -98, -91, 82, 59, -39, -29, -27, -1, 14, 124, -98} // fill-array
            byte[] r8 = new byte[r3]
            r8 = {x07ce: FILL_ARRAY_DATA , data: [82, -73, -124, -51, -47, 32} // fill-array
            java.lang.String r8 = p000.oa.m332(r13, r8)
            p000.h4.m188(r8, r10)
            byte[] r8 = new byte[r12]
            r8 = {x07d6: FILL_ARRAY_DATA , data: [-124, -51} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x07dc: FILL_ARRAY_DATA , data: [-32, -71, 124, -17, -21, 63} // fill-array
            java.lang.String r8 = p000.oa.m332(r8, r13)
            java.lang.String r8 = r7.optString(r8)
            r13 = 14
            byte[] r12 = new byte[r13]
            r12 = {x07e4: FILL_ARRAY_DATA , data: [84, 67, -40, 107, 119, 89, 82, 93, -53, 16, 45, 5, 21, 26} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x07f0: FILL_ARRAY_DATA , data: [59, 51, -84, 56, 3, 43} // fill-array
            java.lang.String r12 = p000.oa.m332(r12, r13)
            p000.h4.m188(r12, r8)
            r12 = 5
            byte[] r13 = new byte[r12]
            r13 = {x07f8: FILL_ARRAY_DATA , data: [-47, -94, -127, -57, -85} // fill-array
            byte[] r12 = new byte[r3]
            r12 = {x0800: FILL_ARRAY_DATA , data: [-91, -53, -11, -85, -50, 31} // fill-array
            java.lang.String r12 = p000.oa.m332(r13, r12)
            java.lang.String r12 = r7.optString(r12)
            r13 = 14
            byte[] r0 = new byte[r13]
            r0 = {x0808: FILL_ARRAY_DATA , data: [16, -8, -13, 60, 11, 72, 22, -26, -32, 71, 81, 20, 81, -95} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x0814: FILL_ARRAY_DATA , data: [127, -120, -121, 111, 127, 58} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r13)
            p000.h4.m188(r0, r12)
            r0 = 5
            byte[] r0 = new byte[r0]
            r0 = {x081c: FILL_ARRAY_DATA , data: [-68, 98, -17, -49, 71} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x0824: FILL_ARRAY_DATA , data: [-43, 12, -101, -67, 40, 123} // fill-array
            java.lang.String r0 = p000.oa.m332(r0, r13)
            java.lang.String r0 = r7.optString(r0)
            r13 = 14
            byte[] r13 = new byte[r13]
            r13 = {x082c: FILL_ARRAY_DATA , data: [-43, -2, -10, -117, -83, -55, -45, -32, -27, -16, -9, -107, -108, -89} // fill-array
            r20 = r1
            byte[] r1 = new byte[r3]
            r1 = {x0838: FILL_ARRAY_DATA , data: [-70, -114, -126, -40, -39, -69} // fill-array
            java.lang.String r1 = p000.oa.m332(r13, r1)
            p000.h4.m188(r1, r0)
            r1 = 4
            byte[] r1 = new byte[r1]
            r1 = {x0840: FILL_ARRAY_DATA , data: [127, 24, 117, -120} // fill-array
            byte[] r13 = new byte[r3]
            r13 = {x0846: FILL_ARRAY_DATA , data: [11, 113, 24, -19, 127, 25} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r13)
            int r34 = r7.optInt(r1)
            r1 = 2
            byte[] r1 = new byte[r1]
            r1 = {x084e: FILL_ARRAY_DATA , data: [-110, 58} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x0854: FILL_ARRAY_DATA , data: [-32, 74, -125, 99, -109, 26} // fill-array
            java.lang.String r1 = p000.oa.m332(r1, r3)
            boolean r1 = r7.optBoolean(r1)
            java.lang.Boolean r35 = java.lang.Boolean.valueOf(r1)
            r25 = r9
            r28 = r2
            r30 = r10
            r31 = r8
            r32 = r12
            r33 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r18 = r9
        L45b:
            r12 = r11
            r13 = r5
            r16 = r4
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17, r18)
            r5 = r11
            r0 = r20
        L467:
            r0.mo12(r5)
            return
        L46b:
            ۟.g3 r1 = r0.f639
            byte[] r2 = new byte[r10]
            r2 = {x085c: FILL_ARRAY_DATA , data: [111, 59, -72, -103, 19, -2, 37} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x0864: FILL_ARRAY_DATA , data: [75, 90, -37, -19, 122, -111} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r3)
            p000.h4.m189(r2, r1)
            android.app.Activity r2 = p000.l3.m263()
            r1.mo12(r2)
            return
        L486:
            ۟.g3 r1 = r0.f639
            byte[] r4 = new byte[r9]
            r4 = {x086c: FILL_ARRAY_DATA , data: [-112, -94, -124, -116, -47, 32, -43, -94, -114} // fill-array
            byte[] r5 = new byte[r3]
            r5 = {x0876: FILL_ARRAY_DATA , data: [-76, -63, -27, -32, -67, 66} // fill-array
            java.lang.String r4 = p000.oa.m332(r4, r5)
            p000.h4.m189(r4, r1)
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Thread.sleep(r4)
            ۟.h2$a r4 = p000.h2.f427
            r4.getClass()
            java.lang.String r4 = ۟.h2.a.m183()
            java.lang.String r4 = p000.jb.m208(r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r4)
            java.lang.String r4 = "bul.json"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r5 = 0
            java.lang.String r4 = p000.u6.m433(r4, r5, r3)
            r9 = 11
            byte[] r9 = new byte[r9]
            r9 = {x087e: FILL_ARRAY_DATA , data: [41, 14, 35, -18, 41, -39, 56, 42, 51, -13, 62} // fill-array
            byte[] r10 = new byte[r3]
            r10 = {x0888: FILL_ARRAY_DATA , data: [76, 96, 64, -100, 80, -87} // fill-array
            p000.oa.m332(r9, r10)
            int r9 = r4.length()
            if (r9 <= 0) goto L4d8
            r9 = r2
            goto L4d9
        L4d8:
            r9 = r8
        L4d9:
            if (r9 == 0) goto L554
            java.lang.String r9 = p000.a.f83
            byte[] r7 = new byte[r7]
            r7 = {x0890: FILL_ARRAY_DATA , data: [-13, -45, 59, 87, 0, -97, -13, -121, 108, 15, 0, -97, -13, -45, 59, 87} // fill-array
            byte[] r9 = new byte[r3]
            r9 = {x089c: FILL_ARRAY_DATA , data: [-59, -27, 13, 97, 54, -87} // fill-array
            java.lang.String r7 = p000.oa.m332(r7, r9)
            java.lang.String r4 = p000.a.m23(r4, r7)
            java.lang.String r4 = p000.jb.m208(r4)
            byte[] r2 = new byte[r2]
            r7 = -15
            r2[r8] = r7
            byte[] r7 = new byte[r3]
            r7 = {x08a4: FILL_ARRAY_DATA , data: [-118, -117, 82, 97, -71, 58} // fill-array
            java.lang.String r2 = p000.oa.m332(r2, r7)
            boolean r2 = p000.ta.m423(r4, r2)
            if (r2 == 0) goto L554
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r4)
            ۟.a0 r4 = new ۟.a0
            byte[] r6 = new byte[r6]
            r6 = {x08ac: FILL_ARRAY_DATA , data: [22, 88, -1} // fill-array
            byte[] r7 = new byte[r3]
            r7 = {x08b2: FILL_ARRAY_DATA , data: [119, 52, -109, -107, 36, -85} // fill-array
            java.lang.String r6 = p000.oa.m332(r6, r7)
            int r6 = r2.optInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 4
            byte[] r7 = new byte[r7]
            r7 = {x08ba: FILL_ARRAY_DATA , data: [-101, 41, -103, 8} // fill-array
            byte[] r3 = new byte[r3]
            r3 = {x08c0: FILL_ARRAY_DATA , data: [-9, 64, -22, 124, 90, -10} // fill-array
            java.lang.String r3 = p000.oa.m332(r7, r3)
            org.json.JSONArray r2 = r2.optJSONArray(r3)
            if (r2 != 0) goto L53b
            goto L550
        L53b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r3 = r2.length()
        L544:
            if (r8 >= r3) goto L550
            java.lang.String r7 = r2.getString(r8)
            r5.add(r7)
            int r8 = r8 + 1
            goto L544
        L550:
            r4.<init>(r6, r5)
            r5 = r4
        L554:
            r1.mo12(r5)
            return
    }
}
