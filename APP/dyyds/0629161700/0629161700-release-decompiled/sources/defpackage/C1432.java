package defpackage;

/* JADX INFO: renamed from: ᛸᛲᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1432 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1232[] f6290;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.lang.String[] f6291;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int[] f6292;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final int f6293;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final byte[] f6294;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int[] f6295;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int f6296;

    public C1432(byte[] r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r0.<init>()
            r0.f6294 = r1
            r2 = 8
            int r3 = r0.m2635(r2)
            int[] r4 = new int[r3]
            r0.f6292 = r4
            java.lang.String[] r4 = new java.lang.String[r3]
            r0.f6291 = r4
            r4 = 0
            r5 = 1
            r6 = 10
            r8 = r4
            r9 = r8
            r10 = r9
            r7 = r5
        L1f:
            r11 = 4
            if (r7 >= r3) goto L55
            int[] r12 = r0.f6292
            int r13 = r7 + 1
            int r14 = r6 + 1
            r12[r7] = r14
            r12 = r1[r6]
            r15 = 3
            r16 = 5
            switch(r12) {
                case 1: goto L49;
                case 2: goto L32;
                case 3: goto L38;
                case 4: goto L38;
                case 5: goto L44;
                case 6: goto L44;
                case 7: goto L41;
                case 8: goto L41;
                case 9: goto L38;
                case 10: goto L38;
                case 11: goto L38;
                case 12: goto L38;
                case 13: goto L32;
                case 14: goto L32;
                case 15: goto L3f;
                case 16: goto L41;
                case 17: goto L3c;
                case 18: goto L37;
                case 19: goto L41;
                case 20: goto L41;
                default: goto L32;
            }
        L32:
            defpackage.C0086.m557()
            r0 = 0
            throw r0
        L37:
            r10 = r5
        L38:
            r7 = r13
            r11 = r16
            goto L53
        L3c:
            r9 = r5
            r10 = r9
            goto L38
        L3f:
            r7 = r13
            goto L53
        L41:
            r7 = r13
            r11 = r15
            goto L53
        L44:
            int r7 = r7 + 2
            r11 = 9
            goto L53
        L49:
            int r7 = r0.m2635(r14)
            int r11 = r7 + 3
            if (r11 <= r8) goto L3f
            r8 = r11
            goto L3f
        L53:
            int r6 = r6 + r11
            goto L1f
        L55:
            r0.f6296 = r8
            r0.f6293 = r6
            r1 = 0
            if (r9 == 0) goto L5f
            ᛷᛲᲁᲇ[] r3 = new defpackage.C1232[r3]
            goto L60
        L5f:
            r3 = r1
        L60:
            r0.f6290 = r3
            if (r10 == 0) goto Laa
            char[] r1 = new char[r8]
            int r3 = r0.m2636()
            int r5 = r3 + (-2)
            int r5 = r0.m2635(r5)
        L70:
            if (r5 <= 0) goto La5
            java.lang.String r6 = r0.m2634(r1, r3)
            int r7 = r3 + 2
            int r7 = r0.m2632(r7)
            int r8 = r3 + 6
            java.lang.String r9 = "BootstrapMethods"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto La0
            int r1 = r0.m2635(r8)
            int[] r5 = new int[r1]
            int r3 = r3 + r2
        L8d:
            if (r4 >= r1) goto L9e
            r5[r4] = r3
            int r2 = r3 + 2
            int r2 = r0.m2635(r2)
            int r2 = r2 * 2
            int r2 = r2 + r11
            int r3 = r3 + r2
            int r4 = r4 + 1
            goto L8d
        L9e:
            r1 = r5
            goto Laa
        La0:
            int r3 = r8 + r7
            int r5 = r5 + (-1)
            goto L70
        La5:
            defpackage.C0086.m557()
            r0 = 0
            throw r0
        Laa:
            r0.f6295 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static defpackage.C1063 m2619(int r1, defpackage.C1063[] r2) {
            r0 = r2[r1]
            if (r0 != 0) goto Lb
            ᛶᛴᲀᲇ r0 = new ᛶᛴᲀᲇ
            r0.<init>()
            r2[r1] = r0
        Lb:
            r1 = r2[r1]
            short r2 = r1.f4709
            r2 = r2 & (-2)
            short r2 = (short) r2
            r1.f4709 = r2
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int m2620(defpackage.C1515 r18, int r19, java.lang.String r20, char[] r21) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r20
            r3 = r21
            r4 = 91
            r5 = 0
            r6 = 101(0x65, float:1.42E-43)
            r7 = 64
            r8 = 0
            r9 = 1
            byte[] r10 = r0.f6294
            if (r1 != 0) goto L33
            r1 = r10[r19]
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 == r7) goto L2c
            if (r1 == r4) goto L25
            if (r1 == r6) goto L22
            int r0 = r19 + 3
            return r0
        L22:
            int r0 = r19 + 5
            return r0
        L25:
            int r1 = r19 + 1
            int r0 = r0.m2623(r5, r1, r8, r3)
            return r0
        L2c:
            int r1 = r19 + 3
            int r0 = r0.m2623(r5, r1, r9, r3)
            return r0
        L33:
            boolean r11 = r1.f6691
            java.lang.Object r12 = r1.f6690
            ᛱᛶᛲᛲ r12 = (defpackage.C0109) r12
            java.lang.Object r13 = r1.f6689
            ᛱᛲᛳᛲ r13 = (defpackage.C0031) r13
            int r14 = r19 + 1
            r15 = r10[r19]
            r15 = r15 & 255(0xff, float:3.57E-43)
            if (r15 == r7) goto L231
            r5 = 70
            if (r15 == r5) goto L223
            r7 = 83
            r16 = r9
            int[] r9 = r0.f6292
            if (r15 == r7) goto L20e
            r7 = 99
            if (r15 == r7) goto L1fc
            if (r15 == r6) goto L1d2
            r6 = 115(0x73, float:1.61E-43)
            if (r15 == r6) goto L1c8
            r6 = 73
            if (r15 == r6) goto L223
            r7 = 74
            if (r15 == r7) goto L223
            r11 = 90
            if (r15 == r11) goto L1b1
            if (r15 == r4) goto L9a
            switch(r15) {
                case 66: goto L85;
                case 67: goto L70;
                case 68: goto L223;
                default: goto L6c;
            }
        L6c:
            defpackage.C0086.m557()
            return r8
        L70:
            int r3 = r0.m2635(r14)
            r3 = r9[r3]
            int r0 = r0.m2632(r3)
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r1.m2761(r0, r2)
            int r0 = r19 + 3
            return r0
        L85:
            int r3 = r0.m2635(r14)
            r3 = r9[r3]
            int r0 = r0.m2632(r3)
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1.m2761(r0, r2)
            int r0 = r19 + 3
            return r0
        L9a:
            int r4 = r0.m2635(r14)
            int r12 = r19 + 3
            if (r4 != 0) goto Lab
            ᛸᛶᛸᛳ r1 = r1.m2759(r2)
            int r0 = r0.m2623(r1, r14, r8, r3)
            return r0
        Lab:
            r10 = r10[r12]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 == r5) goto L192
            r5 = 83
            if (r10 == r5) goto L176
            if (r10 == r11) goto L154
            if (r10 == r6) goto L139
            if (r10 == r7) goto L11e
            switch(r10) {
                case 66: goto L102;
                case 67: goto Le6;
                case 68: goto Lc7;
                default: goto Lbe;
            }
        Lbe:
            ᛸᛶᛸᛳ r1 = r1.m2759(r2)
            int r0 = r0.m2623(r1, r14, r8, r3)
            return r0
        Lc7:
            double[] r3 = new double[r4]
        Lc9:
            if (r8 >= r4) goto Le2
            int r5 = r12 + 1
            int r5 = r0.m2635(r5)
            r5 = r9[r5]
            long r5 = r0.m2621(r5)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto Lc9
        Le2:
            r1.m2761(r3, r2)
            return r12
        Le6:
            char[] r3 = new char[r4]
        Le8:
            if (r8 >= r4) goto Lfe
            int r5 = r12 + 1
            int r5 = r0.m2635(r5)
            r5 = r9[r5]
            int r5 = r0.m2632(r5)
            char r5 = (char) r5
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto Le8
        Lfe:
            r1.m2761(r3, r2)
            return r12
        L102:
            byte[] r3 = new byte[r4]
        L104:
            if (r8 >= r4) goto L11a
            int r5 = r12 + 1
            int r5 = r0.m2635(r5)
            r5 = r9[r5]
            int r5 = r0.m2632(r5)
            byte r5 = (byte) r5
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L104
        L11a:
            r1.m2761(r3, r2)
            return r12
        L11e:
            long[] r3 = new long[r4]
        L120:
            if (r8 >= r4) goto L135
            int r5 = r12 + 1
            int r5 = r0.m2635(r5)
            r5 = r9[r5]
            long r5 = r0.m2621(r5)
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L120
        L135:
            r1.m2761(r3, r2)
            return r12
        L139:
            int[] r3 = new int[r4]
        L13b:
            if (r8 >= r4) goto L150
            int r5 = r12 + 1
            int r5 = r0.m2635(r5)
            r5 = r9[r5]
            int r5 = r0.m2632(r5)
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L13b
        L150:
            r1.m2761(r3, r2)
            return r12
        L154:
            boolean[] r3 = new boolean[r4]
            r5 = r8
        L157:
            if (r5 >= r4) goto L172
            int r6 = r12 + 1
            int r6 = r0.m2635(r6)
            r6 = r9[r6]
            int r6 = r0.m2632(r6)
            if (r6 == 0) goto L16a
            r6 = r16
            goto L16b
        L16a:
            r6 = r8
        L16b:
            r3[r5] = r6
            int r12 = r12 + 3
            int r5 = r5 + 1
            goto L157
        L172:
            r1.m2761(r3, r2)
            return r12
        L176:
            short[] r3 = new short[r4]
        L178:
            if (r8 >= r4) goto L18e
            int r5 = r12 + 1
            int r5 = r0.m2635(r5)
            r5 = r9[r5]
            int r5 = r0.m2632(r5)
            short r5 = (short) r5
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L178
        L18e:
            r1.m2761(r3, r2)
            return r12
        L192:
            float[] r3 = new float[r4]
        L194:
            if (r8 >= r4) goto L1ad
            int r5 = r12 + 1
            int r5 = r0.m2635(r5)
            r5 = r9[r5]
            int r5 = r0.m2632(r5)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L194
        L1ad:
            r1.m2761(r3, r2)
            return r12
        L1b1:
            int r3 = r0.m2635(r14)
            r3 = r9[r3]
            int r0 = r0.m2632(r3)
            if (r0 != 0) goto L1c0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L1c2
        L1c0:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L1c2:
            r1.m2761(r0, r2)
            int r0 = r19 + 3
            return r0
        L1c8:
            java.lang.String r0 = r0.m2634(r3, r14)
            r1.m2761(r0, r2)
            int r0 = r19 + 3
            return r0
        L1d2:
            java.lang.String r4 = r0.m2634(r3, r14)
            int r5 = r19 + 3
            java.lang.String r0 = r0.m2634(r3, r5)
            int r3 = r1.f6693
            int r3 = r3 + 1
            r1.f6693 = r3
            if (r11 == 0) goto L1eb
            int r1 = r12.m605(r2)
            r13.m344(r1)
        L1eb:
            int r1 = r12.m605(r4)
            r13.m340(r6, r1)
            int r0 = r12.m605(r0)
            r13.m344(r0)
            int r0 = r19 + 5
            return r0
        L1fc:
            java.lang.String r0 = r0.m2634(r3, r14)
            int r3 = r0.length()
            ᲇᲀᛴᲁ r0 = defpackage.C2118.m3539(r0, r8, r3)
            r1.m2761(r0, r2)
            int r0 = r19 + 3
            return r0
        L20e:
            int r3 = r0.m2635(r14)
            r3 = r9[r3]
            int r0 = r0.m2632(r3)
            short r0 = (short) r0
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r1.m2761(r0, r2)
            int r0 = r19 + 3
            return r0
        L223:
            int r4 = r0.m2635(r14)
            java.lang.Object r0 = r0.m2639(r3, r4)
            r1.m2761(r0, r2)
            int r0 = r19 + 3
            return r0
        L231:
            r16 = r9
            java.lang.String r4 = r0.m2634(r3, r14)
            int r6 = r1.f6693
            int r6 = r6 + 1
            r1.f6693 = r6
            if (r11 == 0) goto L246
            int r1 = r12.m605(r2)
            r13.m344(r1)
        L246:
            int r1 = r12.m605(r4)
            r13.m340(r7, r1)
            r13.m344(r8)
            ᛸᛶᛸᛳ r1 = new ᛸᛶᛸᛳ
            r2 = r16
            r1.<init>(r12, r2, r13, r5)
            int r4 = r19 + 3
            int r0 = r0.m2623(r1, r4, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final long m2621(int r5) {
            r4 = this;
            int r0 = r4.m2632(r5)
            long r0 = (long) r0
            int r5 = r5 + 4
            int r4 = r4.m2632(r5)
            long r4 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            r2 = 32
            long r0 = r0 << r2
            long r4 = r4 | r0
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m2622(defpackage.C1621 r8, defpackage.C1743 r9, int r10, boolean r11) {
            r7 = this;
            int r0 = r10 + 1
            byte[] r1 = r7.f6294
            r10 = r1[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r11 == 0) goto Ld
            r8.f7149 = r10
            goto Lf
        Ld:
            r8.f7170 = r10
        Lf:
            char[] r9 = r9.f7717
            r1 = 0
        L12:
            if (r1 >= r10) goto L5d
            int r2 = r7.m2635(r0)
            int r0 = r0 + 2
        L1a:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L5a
            java.lang.String r2 = r7.m2634(r9, r0)
            int r0 = r0 + 2
            ᛱᛶᛲᛲ r4 = r8.f7177
            java.lang.String r5 = r8.f7182
            if (r11 == 0) goto L3f
            ᛸᛶᛸᛳ[] r6 = r8.f7152
            if (r6 != 0) goto L36
            int r5 = defpackage.C2118.m3543(r5)
            ᛸᛶᛸᛳ[] r6 = new defpackage.C1515[r5]
            r8.f7152 = r6
        L36:
            r5 = r6[r1]
            ᛸᛶᛸᛳ r2 = defpackage.C1515.m2754(r4, r2, r5)
            r6[r1] = r2
            goto L53
        L3f:
            ᛸᛶᛸᛳ[] r6 = r8.f7136
            if (r6 != 0) goto L4b
            int r5 = defpackage.C2118.m3543(r5)
            ᛸᛶᛸᛳ[] r6 = new defpackage.C1515[r5]
            r8.f7136 = r6
        L4b:
            r5 = r6[r1]
            ᛸᛶᛸᛳ r2 = defpackage.C1515.m2754(r4, r2, r5)
            r6[r1] = r2
        L53:
            r4 = 1
            int r0 = r7.m2623(r2, r0, r4, r9)
            r2 = r3
            goto L1a
        L5a:
            int r1 = r1 + 1
            goto L12
        L5d:
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int m2623(defpackage.C1515 r2, int r3, boolean r4, char[] r5) {
            r1 = this;
            int r0 = r1.m2635(r3)
            int r3 = r3 + 2
            if (r4 == 0) goto L18
        L8:
            int r4 = r0 + (-1)
            if (r0 <= 0) goto L23
            java.lang.String r0 = r1.m2634(r5, r3)
            int r3 = r3 + 2
            int r3 = r1.m2620(r2, r3, r0, r5)
            r0 = r4
            goto L8
        L18:
            int r4 = r0 + (-1)
            if (r0 <= 0) goto L23
            r0 = 0
            int r3 = r1.m2620(r2, r3, r0, r5)
            r0 = r4
            goto L18
        L23:
            if (r2 == 0) goto L28
            r2.m2760()
        L28:
            return r3
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public final int m2624(int r5, java.lang.Object[] r6, int r7, char[] r8, defpackage.C1063[] r9) {
            r4 = this;
            int r0 = r5 + 1
            byte[] r1 = r4.f6294
            r1 = r1[r5]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 3
            switch(r1) {
                case 0: goto L53;
                case 1: goto L4b;
                case 2: goto L43;
                case 3: goto L3c;
                case 4: goto L34;
                case 5: goto L2c;
                case 6: goto L24;
                case 7: goto L1d;
                case 8: goto L11;
                default: goto Ld;
            }
        Ld:
            defpackage.C0086.m557()
            return r2
        L11:
            int r4 = r4.m2635(r0)
            ᛶᛴᲀᲇ r4 = m2619(r4, r9)
            r6[r7] = r4
        L1b:
            int r5 = r5 + r3
            return r5
        L1d:
            java.lang.String r4 = r4.m2633(r8, r0)
            r6[r7] = r4
            goto L1b
        L24:
            r4 = 6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r7] = r4
            return r0
        L2c:
            r4 = 5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r7] = r4
            return r0
        L34:
            r4 = 4
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r7] = r4
            return r0
        L3c:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6[r7] = r4
            return r0
        L43:
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r7] = r4
            return r0
        L4b:
            r4 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r7] = r4
            return r0
        L53:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            r6[r7] = r4
            return r0
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final java.lang.String m2625(char[] r8, int r9, int r10) {
            r7 = this;
            int r10 = r10 + r9
            r0 = 0
            r1 = r0
        L3:
            if (r9 >= r10) goto L4b
            int r2 = r9 + 1
            byte[] r3 = r7.f6294
            r4 = r3[r9]
            r5 = r4 & 128(0x80, float:1.8E-43)
            if (r5 != 0) goto L19
            int r9 = r1 + 1
            r3 = r4 & 127(0x7f, float:1.78E-43)
            char r3 = (char) r3
            r8[r1] = r3
            r1 = r9
            r9 = r2
            goto L3
        L19:
            r5 = r4 & 224(0xe0, float:3.14E-43)
            r6 = 192(0xc0, float:2.69E-43)
            if (r5 != r6) goto L31
            int r5 = r1 + 1
            r4 = r4 & 31
            int r4 = r4 << 6
            int r9 = r9 + 2
            r2 = r3[r2]
            r2 = r2 & 63
            int r4 = r4 + r2
            char r2 = (char) r4
            r8[r1] = r2
        L2f:
            r1 = r5
            goto L3
        L31:
            int r5 = r1 + 1
            r4 = r4 & 15
            int r4 = r4 << 12
            int r6 = r9 + 2
            r2 = r3[r2]
            r2 = r2 & 63
            int r2 = r2 << 6
            int r4 = r4 + r2
            int r9 = r9 + 3
            r2 = r3[r6]
            r2 = r2 & 63
            int r4 = r4 + r2
            char r2 = (char) r4
            r8[r1] = r2
            goto L2f
        L4b:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r8, r0, r1)
            return r7
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final int m2626(defpackage.C1743 r10, int r11) {
            r9 = this;
            int r0 = r9.m2632(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L6e
            if (r1 == r2) goto L6e
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L6b;
                case 17: goto L6b;
                case 18: goto L6b;
                case 19: goto L68;
                case 20: goto L68;
                case 21: goto L68;
                case 22: goto L6e;
                case 23: goto L6b;
                default: goto L10;
            }
        L10:
            r4 = 0
            switch(r1) {
                case 64: goto L23;
                case 65: goto L23;
                case 66: goto L6b;
                case 67: goto L1f;
                case 68: goto L1f;
                case 69: goto L1f;
                case 70: goto L1f;
                case 71: goto L18;
                case 72: goto L18;
                case 73: goto L18;
                case 74: goto L18;
                case 75: goto L18;
                default: goto L14;
            }
        L14:
            defpackage.C0086.m557()
            return r4
        L18:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L73
        L1f:
            r0 = r0 & r3
        L20:
            int r11 = r11 + 3
            goto L73
        L23:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.m2635(r1)
            int r11 = r11 + 3
            ᛶᛴᲀᲇ[] r3 = new defpackage.C1063[r1]
            r10.f7719 = r3
            ᛶᛴᲀᲇ[] r3 = new defpackage.C1063[r1]
            r10.f7709 = r3
            int[] r3 = new int[r1]
            r10.f7710 = r3
        L38:
            if (r4 >= r1) goto L73
            int r3 = r9.m2635(r11)
            int r5 = r11 + 2
            int r5 = r9.m2635(r5)
            int r6 = r11 + 4
            int r6 = r9.m2635(r6)
            int r11 = r11 + 6
            ᛶᛴᲀᲇ[] r7 = r10.f7719
            ᛶᛴᲀᲇ[] r8 = r10.f7726
            ᛶᛴᲀᲇ r8 = m2619(r3, r8)
            r7[r4] = r8
            ᛶᛴᲀᲇ[] r7 = r10.f7709
            int r3 = r3 + r5
            ᛶᛴᲀᲇ[] r5 = r10.f7726
            ᛶᛴᲀᲇ r3 = m2619(r3, r5)
            r7[r4] = r3
            int[] r3 = r10.f7710
            r3[r4] = r6
            int r4 = r4 + 1
            goto L38
        L68:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L73
        L6b:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            goto L20
        L6e:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L73:
            r10.f7708 = r0
            int r0 = r9.m2628(r11)
            if (r0 != 0) goto L7d
            r9 = 0
            goto L85
        L7d:
            ᛱᛲᛳᛲ r1 = new ᛱᛲᛳᛲ
            byte[] r9 = r9.f6294
            r1.<init>(r11, r9)
            r9 = r1
        L85:
            r10.f7711 = r9
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r0 = r0 + r11
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final java.lang.String m2627(char[] r4, int r5) {
            r3 = this;
            java.lang.String[] r0 = r3.f6291
            r1 = r0[r5]
            if (r1 == 0) goto L7
            return r1
        L7:
            int[] r1 = r3.f6292
            r1 = r1[r5]
            int r2 = r1 + 2
            int r1 = r3.m2635(r1)
            java.lang.String r3 = r3.m2625(r4, r2, r1)
            r0[r5] = r3
            return r3
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int m2628(int r1) {
            r0 = this;
            byte[] r0 = r0.f6294
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final short m2629(int r2) {
            r1 = this;
            byte[] r1 = r1.f6294
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1326 m2630(defpackage.C1326[] r7, java.lang.String r8, int r9, int r10) {
            r6 = this;
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L3:
            byte[] r3 = r6.f6294
            if (r2 >= r0) goto L30
            r4 = r7[r2]
            java.lang.Object r5 = r4.f5856
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L2d
            ᛷᛸᛱᛸ r6 = new ᛷᛸᛱᛸ
            java.lang.Object r7 = r4.f5856
            java.lang.String r7 = (java.lang.String) r7
            r6.<init>(r7)
            ᛱᛲᛳᛲ r7 = new ᛱᛲᛳᛲ
            byte[] r8 = new byte[r10]
            java.lang.System.arraycopy(r3, r9, r8, r1, r10)
            r7.<init>(r1)
            r7.f520 = r8
            r7.f518 = r10
            r6.f5857 = r7
            return r6
        L2d:
            int r2 = r2 + 1
            goto L3
        L30:
            ᛷᛸᛱᛸ r6 = new ᛷᛸᛱᛸ
            r6.<init>(r8)
            ᛱᛲᛳᛲ r7 = new ᛱᛲᛳᛲ
            byte[] r8 = new byte[r10]
            java.lang.System.arraycopy(r3, r9, r8, r1, r10)
            r7.<init>(r1)
            r7.f520 = r8
            r7.f518 = r10
            r6.f5857 = r7
            return r6
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final int m2631(int[] r3, int r4) {
            r2 = this;
            if (r3 == 0) goto L19
            int r0 = r3.length
            if (r4 >= r0) goto L19
            r0 = r3[r4]
            int r0 = r2.m2628(r0)
            r1 = 67
            if (r0 >= r1) goto L10
            goto L19
        L10:
            r3 = r3[r4]
            int r3 = r3 + 1
            int r2 = r2.m2635(r3)
            return r2
        L19:
            r2 = -1
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final int m2632(int r3) {
            r2 = this;
            byte[] r2 = r2.f6294
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 24
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final java.lang.String m2633(char[] r2, int r3) {
            r1 = this;
            int[] r0 = r1.f6292
            int r3 = r1.m2635(r3)
            r3 = r0[r3]
            java.lang.String r1 = r1.m2634(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final java.lang.String m2634(char[] r2, int r3) {
            r1 = this;
            int r0 = r1.m2635(r3)
            if (r3 == 0) goto Le
            if (r0 != 0) goto L9
            goto Le
        L9:
            java.lang.String r1 = r1.m2627(r2, r0)
            return r1
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public final int m2635(int r2) {
            r1 = this;
            byte[] r1 = r1.f6294
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final int m2636() {
            r4 = this;
            int r0 = r4.f6293
            int r1 = r0 + 8
            int r0 = r0 + 6
            int r0 = r4.m2635(r0)
            int r0 = r0 * 2
            int r0 = r0 + r1
            int r1 = r4.m2635(r0)
            int r0 = r0 + 2
        L13:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L30
            int r1 = r0 + 6
            int r1 = r4.m2635(r1)
            int r0 = r0 + 8
        L1f:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto L2e
            int r1 = r0 + 2
            int r1 = r4.m2632(r1)
            int r1 = r1 + 6
            int r0 = r0 + r1
            r1 = r3
            goto L1f
        L2e:
            r1 = r2
            goto L13
        L30:
            int r1 = r4.m2635(r0)
            int r0 = r0 + 2
        L36:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L53
            int r1 = r0 + 6
            int r1 = r4.m2635(r1)
            int r0 = r0 + 8
        L42:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto L51
            int r1 = r0 + 2
            int r1 = r4.m2632(r1)
            int r1 = r1 + 6
            int r0 = r0 + r1
            r1 = r3
            goto L42
        L51:
            r1 = r2
            goto L36
        L53:
            int r0 = r0 + 2
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final void m2637(defpackage.C1621 r54, defpackage.C1743 r55, int r56) {
            r53 = this;
            r0 = r53
            r1 = r54
            r8 = r55
            r2 = r56
            int r7 = r1.f7164
            ᛱᛲᛳᛲ r9 = r1.f7166
            ᛱᛶᛲᛲ r10 = r1.f7177
            char[] r11 = r8.f7717
            int r12 = r0.m2635(r2)
            int r3 = r2 + 2
            int r3 = r0.m2635(r3)
            int r4 = r2 + 4
            int r13 = r0.m2632(r4)
            r14 = 8
            int r15 = r2 + 8
            byte[] r2 = r0.f6294
            int r4 = r2.length
            int r4 = r4 - r15
            if (r13 > r4) goto Le2b
            int r4 = r15 + r13
            int r5 = r13 + 1
            ᛶᛴᲀᲇ[] r5 = new defpackage.C1063[r5]
            r8.f7726 = r5
            r6 = r15
        L33:
            r56 = r2
            r16 = r14
            r14 = 255(0xff, float:3.57E-43)
            r18 = 1
            if (r6 >= r4) goto Lfb
            int r19 = r6 - r15
            r20 = 4
            r2 = r56[r6]
            r2 = r2 & r14
            switch(r2) {
                case 0: goto Lf3;
                case 1: goto Lf3;
                case 2: goto Lf3;
                case 3: goto Lf3;
                case 4: goto Lf3;
                case 5: goto Lf3;
                case 6: goto Lf3;
                case 7: goto Lf3;
                case 8: goto Lf3;
                case 9: goto Lf3;
                case 10: goto Lf3;
                case 11: goto Lf3;
                case 12: goto Lf3;
                case 13: goto Lf3;
                case 14: goto Lf3;
                case 15: goto Lf3;
                case 16: goto Lf0;
                case 17: goto L56;
                case 18: goto Lf0;
                case 19: goto L56;
                case 20: goto L56;
                case 21: goto Lf0;
                case 22: goto Lf0;
                case 23: goto Lf0;
                case 24: goto Lf0;
                case 25: goto Lf0;
                case 26: goto Lf3;
                case 27: goto Lf3;
                case 28: goto Lf3;
                case 29: goto Lf3;
                case 30: goto Lf3;
                case 31: goto Lf3;
                case 32: goto Lf3;
                case 33: goto Lf3;
                case 34: goto Lf3;
                case 35: goto Lf3;
                case 36: goto Lf3;
                case 37: goto Lf3;
                case 38: goto Lf3;
                case 39: goto Lf3;
                case 40: goto Lf3;
                case 41: goto Lf3;
                case 42: goto Lf3;
                case 43: goto Lf3;
                case 44: goto Lf3;
                case 45: goto Lf3;
                case 46: goto Lf3;
                case 47: goto Lf3;
                case 48: goto Lf3;
                case 49: goto Lf3;
                case 50: goto Lf3;
                case 51: goto Lf3;
                case 52: goto Lf3;
                case 53: goto Lf3;
                case 54: goto Lf0;
                case 55: goto Lf0;
                case 56: goto Lf0;
                case 57: goto Lf0;
                case 58: goto Lf0;
                case 59: goto Lf3;
                case 60: goto Lf3;
                case 61: goto Lf3;
                case 62: goto Lf3;
                case 63: goto Lf3;
                case 64: goto Lf3;
                case 65: goto Lf3;
                case 66: goto Lf3;
                case 67: goto Lf3;
                case 68: goto Lf3;
                case 69: goto Lf3;
                case 70: goto Lf3;
                case 71: goto Lf3;
                case 72: goto Lf3;
                case 73: goto Lf3;
                case 74: goto Lf3;
                case 75: goto Lf3;
                case 76: goto Lf3;
                case 77: goto Lf3;
                case 78: goto Lf3;
                case 79: goto Lf3;
                case 80: goto Lf3;
                case 81: goto Lf3;
                case 82: goto Lf3;
                case 83: goto Lf3;
                case 84: goto Lf3;
                case 85: goto Lf3;
                case 86: goto Lf3;
                case 87: goto Lf3;
                case 88: goto Lf3;
                case 89: goto Lf3;
                case 90: goto Lf3;
                case 91: goto Lf3;
                case 92: goto Lf3;
                case 93: goto Lf3;
                case 94: goto Lf3;
                case 95: goto Lf3;
                case 96: goto Lf3;
                case 97: goto Lf3;
                case 98: goto Lf3;
                case 99: goto Lf3;
                case 100: goto Lf3;
                case 101: goto Lf3;
                case 102: goto Lf3;
                case 103: goto Lf3;
                case 104: goto Lf3;
                case 105: goto Lf3;
                case 106: goto Lf3;
                case 107: goto Lf3;
                case 108: goto Lf3;
                case 109: goto Lf3;
                case 110: goto Lf3;
                case 111: goto Lf3;
                case 112: goto Lf3;
                case 113: goto Lf3;
                case 114: goto Lf3;
                case 115: goto Lf3;
                case 116: goto Lf3;
                case 117: goto Lf3;
                case 118: goto Lf3;
                case 119: goto Lf3;
                case 120: goto Lf3;
                case 121: goto Lf3;
                case 122: goto Lf3;
                case 123: goto Lf3;
                case 124: goto Lf3;
                case 125: goto Lf3;
                case 126: goto Lf3;
                case 127: goto Lf3;
                case 128: goto Lf3;
                case 129: goto Lf3;
                case 130: goto Lf3;
                case 131: goto Lf3;
                case 132: goto L56;
                case 133: goto Lf3;
                case 134: goto Lf3;
                case 135: goto Lf3;
                case 136: goto Lf3;
                case 137: goto Lf3;
                case 138: goto Lf3;
                case 139: goto Lf3;
                case 140: goto Lf3;
                case 141: goto Lf3;
                case 142: goto Lf3;
                case 143: goto Lf3;
                case 144: goto Lf3;
                case 145: goto Lf3;
                case 146: goto Lf3;
                case 147: goto Lf3;
                case 148: goto Lf3;
                case 149: goto Lf3;
                case 150: goto Lf3;
                case 151: goto Lf3;
                case 152: goto Lf3;
                case 153: goto Le3;
                case 154: goto Le3;
                case 155: goto Le3;
                case 156: goto Le3;
                case 157: goto Le3;
                case 158: goto Le3;
                case 159: goto Le3;
                case 160: goto Le3;
                case 161: goto Le3;
                case 162: goto Le3;
                case 163: goto Le3;
                case 164: goto Le3;
                case 165: goto Le3;
                case 166: goto Le3;
                case 167: goto Le3;
                case 168: goto Le3;
                case 169: goto Lf0;
                case 170: goto Lb3;
                case 171: goto L88;
                case 172: goto Lf3;
                case 173: goto Lf3;
                case 174: goto Lf3;
                case 175: goto Lf3;
                case 176: goto Lf3;
                case 177: goto Lf3;
                case 178: goto L56;
                case 179: goto L56;
                case 180: goto L56;
                case 181: goto L56;
                case 182: goto L56;
                case 183: goto L56;
                case 184: goto L56;
                case 185: goto L65;
                case 186: goto L65;
                case 187: goto L56;
                case 188: goto Lf0;
                case 189: goto L56;
                case 190: goto Lf3;
                case 191: goto Lf3;
                case 192: goto L56;
                case 193: goto L56;
                case 194: goto Lf3;
                case 195: goto Lf3;
                case 196: goto L6d;
                case 197: goto L69;
                case 198: goto Le3;
                case 199: goto Le3;
                case 200: goto L5a;
                case 201: goto L5a;
                case 202: goto L4b;
                case 203: goto L4b;
                case 204: goto L4b;
                case 205: goto L4b;
                case 206: goto L4b;
                case 207: goto L4b;
                case 208: goto L4b;
                case 209: goto L4b;
                case 210: goto L4b;
                case 211: goto L4b;
                case 212: goto L4b;
                case 213: goto L4b;
                case 214: goto L4b;
                case 215: goto L4b;
                case 216: goto L4b;
                case 217: goto L4b;
                case 218: goto L4b;
                case 219: goto L4b;
                case 220: goto L5a;
                default: goto L47;
            }
        L47:
            defpackage.C0086.m557()
            return
        L4b:
            int r2 = r6 + 1
            int r2 = r0.m2635(r2)
            int r2 = r2 + r19
            m2619(r2, r5)
        L56:
            int r6 = r6 + 3
            goto Lf5
        L5a:
            int r2 = r6 + 1
            int r2 = r0.m2632(r2)
            int r2 = r2 + r19
            m2619(r2, r5)
        L65:
            int r6 = r6 + 5
            goto Lf5
        L69:
            int r6 = r6 + 4
            goto Lf5
        L6d:
            int r2 = r6 + 1
            r2 = r56[r2]
            r2 = r2 & r14
            r14 = 132(0x84, float:1.85E-43)
            if (r2 == r14) goto L84
            r14 = 169(0xa9, float:2.37E-43)
            if (r2 == r14) goto L69
            switch(r2) {
                case 21: goto L69;
                case 22: goto L69;
                case 23: goto L69;
                case 24: goto L69;
                case 25: goto L69;
                default: goto L7d;
            }
        L7d:
            switch(r2) {
                case 54: goto L69;
                case 55: goto L69;
                case 56: goto L69;
                case 57: goto L69;
                case 58: goto L69;
                default: goto L80;
            }
        L80:
            defpackage.C0086.m557()
            return
        L84:
            int r6 = r6 + 6
            goto Lf5
        L88:
            r2 = r19 & 3
            int r2 = 4 - r2
            int r2 = r2 + r6
            int r6 = r0.m2632(r2)
            int r6 = r6 + r19
            m2619(r6, r5)
            int r6 = r2 + 4
            int r6 = r0.m2632(r6)
            int r2 = r2 + 8
        L9e:
            int r14 = r6 + (-1)
            if (r6 <= 0) goto Lb1
            int r6 = r2 + 4
            int r6 = r0.m2632(r6)
            int r6 = r6 + r19
            m2619(r6, r5)
            int r2 = r2 + 8
            r6 = r14
            goto L9e
        Lb1:
            r6 = r2
            goto Lf5
        Lb3:
            r2 = r19 & 3
            int r2 = 4 - r2
            int r2 = r2 + r6
            int r6 = r0.m2632(r2)
            int r6 = r6 + r19
            m2619(r6, r5)
            int r6 = r2 + 8
            int r6 = r0.m2632(r6)
            int r14 = r2 + 4
            int r14 = r0.m2632(r14)
            int r6 = r6 - r14
            int r6 = r6 + 1
            int r2 = r2 + 12
        Ld2:
            int r14 = r6 + (-1)
            if (r6 <= 0) goto Lb1
            int r6 = r0.m2632(r2)
            int r6 = r6 + r19
            m2619(r6, r5)
            int r2 = r2 + 4
            r6 = r14
            goto Ld2
        Le3:
            int r2 = r6 + 1
            short r2 = r0.m2629(r2)
            int r2 = r2 + r19
            m2619(r2, r5)
            goto L56
        Lf0:
            int r6 = r6 + 2
            goto Lf5
        Lf3:
            int r6 = r6 + 1
        Lf5:
            r2 = r56
            r14 = r16
            goto L33
        Lfb:
            r17 = 132(0x84, float:1.85E-43)
            r20 = 4
            int r2 = r0.m2635(r6)
            r19 = r2
            r2 = 2
            int r6 = r6 + r2
        L107:
            int r21 = r19 + (-1)
            r22 = r2
            r2 = 7
            r23 = r4
            int[] r4 = r0.f6292
            r24 = r4
            if (r19 <= 0) goto L16b
            int r14 = r0.m2635(r6)
            ᛶᛴᲀᲇ r26 = m2619(r14, r5)
            int r14 = r6 + 2
            int r14 = r0.m2635(r14)
            ᛶᛴᲀᲇ r27 = m2619(r14, r5)
            int r14 = r6 + 4
            int r14 = r0.m2635(r14)
            ᛶᛴᲀᲇ r28 = m2619(r14, r5)
            int r14 = r6 + 6
            int r14 = r0.m2635(r14)
            r14 = r24[r14]
            java.lang.String r14 = r0.m2634(r11, r14)
            int r6 = r6 + 8
            ᛵᛴᛴᛳ r25 = new ᛵᛴᛴᛳ
            if (r14 == 0) goto L14d
            ᛷᛲᲁᲀ r2 = r10.m612(r2, r14)
            int r4 = r2.f5529
            r29 = r4
        L14a:
            r30 = r14
            goto L150
        L14d:
            r29 = 0
            goto L14a
        L150:
            r25.<init>(r26, r27, r28, r29, r30)
            r2 = r25
            ᛵᛴᛴᛳ r4 = r1.f7135
            if (r4 != 0) goto L15c
            r1.f7135 = r2
            goto L160
        L15c:
            ᛵᛴᛴᛳ r4 = r1.f7137
            r4.f3926 = r2
        L160:
            r1.f7137 = r2
            r19 = r21
            r2 = r22
            r4 = r23
            r14 = 255(0xff, float:3.57E-43)
            goto L107
        L16b:
            int r14 = r0.m2635(r6)
            int r6 = r6 + 2
            r28 = r18
            r2 = 0
            r25 = 0
            r27 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
        L180:
            int r29 = r14 + (-1)
            if (r14 <= 0) goto L310
            java.lang.String r14 = r0.m2634(r11, r6)
            r30 = 0
            int r4 = r6 + 2
            int r4 = r0.m2632(r4)
            r35 = r6
            int r6 = r35 + 6
            r36 = r15
            java.lang.String r15 = "LocalVariableTable"
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L1fe
            int r14 = r8.f7723
            r14 = r14 & 2
            if (r14 != 0) goto L1f6
            int r14 = r0.m2635(r6)
            int r15 = r35 + 8
        L1aa:
            int r33 = r14 + (-1)
            if (r14 <= 0) goto L1f4
            int r14 = r0.m2635(r15)
            r35 = r5[r14]
            if (r35 != 0) goto L1cd
            if (r35 != 0) goto L1bf
            ᛶᛴᲀᲇ r35 = new ᛶᛴᲀᲇ
            r35.<init>()
            r5[r14] = r35
        L1bf:
            r35 = r14
            r14 = r5[r35]
            r37 = r15
            short r15 = r14.f4709
            r15 = r15 | 1
            short r15 = (short) r15
            r14.f4709 = r15
            goto L1d1
        L1cd:
            r35 = r14
            r37 = r15
        L1d1:
            int r15 = r37 + 2
            int r14 = r0.m2635(r15)
            int r14 = r14 + r35
            r15 = r5[r14]
            if (r15 != 0) goto L1ef
            if (r15 != 0) goto L1e6
            ᛶᛴᲀᲇ r15 = new ᛶᛴᲀᲇ
            r15.<init>()
            r5[r14] = r15
        L1e6:
            r14 = r5[r14]
            short r15 = r14.f4709
            r15 = r15 | 1
            short r15 = (short) r15
            r14.f4709 = r15
        L1ef:
            int r15 = r37 + 10
            r14 = r33
            goto L1aa
        L1f4:
            r33 = r6
        L1f6:
            r39 = r7
            r42 = r9
            r37 = r10
            goto L2ff
        L1fe:
            java.lang.String r15 = "LocalVariableTypeTable"
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L209
            r34 = r6
            goto L1f6
        L209:
            java.lang.String r15 = "LineNumberTable"
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L2a3
            int r14 = r8.f7723
            r14 = r14 & 2
            if (r14 != 0) goto L1f6
            int r14 = r0.m2635(r6)
            int r15 = r35 + 8
        L21d:
            int r35 = r14 + (-1)
            if (r14 <= 0) goto L1f6
            int r14 = r0.m2635(r15)
            r37 = r14
            int r14 = r15 + 2
            int r14 = r0.m2635(r14)
            int r15 = r15 + 4
            r38 = r5[r37]
            if (r38 != 0) goto L24a
            if (r38 != 0) goto L23c
            ᛶᛴᲀᲇ r38 = new ᛶᛴᲀᲇ
            r38.<init>()
            r5[r37] = r38
        L23c:
            r38 = r15
            r15 = r5[r37]
            r39 = r7
            short r7 = r15.f4709
            r7 = r7 | 1
            short r7 = (short) r7
            r15.f4709 = r7
            goto L24e
        L24a:
            r39 = r7
            r38 = r15
        L24e:
            r7 = r5[r37]
            short r15 = r7.f4709
            r37 = r10
            r10 = r15 & 128(0x80, float:1.8E-43)
            if (r10 != 0) goto L263
            r10 = r15 | 128(0x80, float:1.8E-43)
            short r10 = (short) r10
            r7.f4709 = r10
            short r10 = (short) r14
            r7.f4711 = r10
            r42 = r9
            goto L293
        L263:
            int[] r10 = r7.f4708
            r15 = r20
            if (r10 != 0) goto L26d
            int[] r10 = new int[r15]
            r7.f4708 = r10
        L26d:
            r20 = r10[r30]
            r40 = r15
            int r15 = r20 + 1
            r10[r30] = r15
            r41 = r14
            int r14 = r10.length
            if (r15 < r14) goto L28d
            int r14 = r10.length
            int r14 = r14 + 4
            int[] r14 = new int[r14]
            r40 = r15
            int r15 = r10.length
            r42 = r9
            r9 = r30
            java.lang.System.arraycopy(r10, r9, r14, r9, r15)
            r7.f4708 = r14
            r10 = r14
            goto L291
        L28d:
            r42 = r9
            r40 = r15
        L291:
            r10[r40] = r41
        L293:
            r14 = r35
            r10 = r37
            r15 = r38
            r7 = r39
            r9 = r42
            r20 = 4
            r30 = 0
            goto L21d
        L2a3:
            r39 = r7
            r42 = r9
            r37 = r10
            java.lang.String r7 = "RuntimeVisibleTypeAnnotations"
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L2b8
            r7 = r18
            int[] r31 = r0.m2638(r1, r8, r6, r7)
            goto L2ff
        L2b8:
            java.lang.String r7 = "RuntimeInvisibleTypeAnnotations"
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L2c6
            r9 = 0
            int[] r32 = r0.m2638(r1, r8, r6, r9)
            goto L2ff
        L2c6:
            java.lang.String r7 = "StackMapTable"
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L2dd
            int r7 = r8.f7723
            r20 = 4
            r7 = r7 & 4
            if (r7 != 0) goto L2ff
            int r25 = r35 + 8
            int r7 = r6 + r4
            r27 = r7
            goto L2ff
        L2dd:
            r20 = 4
            java.lang.String r7 = "StackMap"
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L2f6
            int r7 = r8.f7723
            r7 = r7 & 4
            if (r7 != 0) goto L2ff
            int r25 = r35 + 8
            int r7 = r6 + r4
            r27 = r7
            r28 = 0
            goto L2ff
        L2f6:
            ᛷᛸᛱᛸ[] r7 = r8.f7718
            ᛷᛸᛱᛸ r7 = r0.m2630(r7, r14, r6, r4)
            r7.f5859 = r2
            r2 = r7
        L2ff:
            int r6 = r6 + r4
            r14 = r29
            r15 = r36
            r10 = r37
            r7 = r39
            r9 = r42
            r18 = 1
            r20 = 4
            goto L180
        L310:
            r39 = r7
            r42 = r9
            r37 = r10
            r36 = r15
            int r4 = r8.f7723
            r4 = r4 & 8
            if (r4 == 0) goto L320
            r9 = 1
            goto L321
        L320:
            r9 = 0
        L321:
            r10 = -1
            if (r25 == 0) goto L451
            r8.f7715 = r10
            r4 = 0
            r8.f7720 = r4
            r8.f7712 = r4
            r8.f7725 = r4
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r8.f7721 = r6
            r8.f7722 = r4
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r8.f7713 = r4
            if (r9 == 0) goto L422
            java.lang.String r4 = r8.f7724
            int r15 = r8.f7716
            r15 = r15 & 8
            if (r15 != 0) goto L367
            java.lang.String r15 = "<init>"
            r29 = 3
            java.lang.String r14 = r8.f7714
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L358
            r14 = 6
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r30 = 0
            r6[r30] = r14
        L356:
            r14 = 1
            goto L36d
        L358:
            r30 = 0
            int r14 = r0.f6293
            int r14 = r14 + 2
            char[] r15 = r8.f7717
            java.lang.String r14 = r0.m2633(r15, r14)
            r6[r30] = r14
            goto L356
        L367:
            r29 = 3
            r30 = 0
            r14 = r30
        L36d:
            r15 = r14
            r14 = 1
        L36f:
            int r10 = r14 + 1
            char r7 = r4.charAt(r14)
            r1 = 70
            if (r7 == r1) goto L410
            r1 = 76
            if (r7 == r1) goto L3f4
            r1 = 83
            if (r7 == r1) goto L3ac
            r1 = 73
            if (r7 == r1) goto L3ac
            r1 = 74
            if (r7 == r1) goto L3d8
            r1 = 90
            if (r7 == r1) goto L3ac
            r1 = 91
            if (r7 == r1) goto L3af
            switch(r7) {
                case 66: goto L3ac;
                case 67: goto L3ac;
                case 68: goto L39c;
                default: goto L394;
            }
        L394:
            r8.f7712 = r15
        L396:
            r18 = 1
            r20 = 4
            goto L428
        L39c:
            int r1 = r15 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r29)
            r6[r15] = r7
        L3a4:
            r15 = r1
            r14 = r10
            r18 = 1
            r20 = 4
            goto L41d
        L3ac:
            r20 = 4
            goto L3e7
        L3af:
            char r7 = r4.charAt(r10)
            if (r7 != r1) goto L3b8
            int r10 = r10 + 1
            goto L3af
        L3b8:
            char r1 = r4.charAt(r10)
            r7 = 76
            if (r1 != r7) goto L3cb
        L3c0:
            int r10 = r10 + 1
            char r1 = r4.charAt(r10)
            r7 = 59
            if (r1 == r7) goto L3cb
            goto L3c0
        L3cb:
            int r1 = r15 + 1
            r18 = 1
            int r10 = r10 + 1
            java.lang.String r7 = r4.substring(r14, r10)
            r6[r15] = r7
            goto L3a4
        L3d8:
            int r1 = r15 + 1
            r20 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            r6[r15] = r7
            r15 = r1
            r14 = r10
            r18 = 1
            goto L41d
        L3e7:
            int r1 = r15 + 1
            r18 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            r6[r15] = r7
        L3f1:
            r15 = r1
            r14 = r10
            goto L41d
        L3f4:
            r18 = 1
            r20 = 4
            r1 = r10
        L3f9:
            char r7 = r4.charAt(r1)
            r14 = 59
            if (r7 == r14) goto L404
            int r1 = r1 + 1
            goto L3f9
        L404:
            int r7 = r15 + 1
            int r14 = r1 + 1
            java.lang.String r1 = r4.substring(r10, r1)
            r6[r15] = r1
            r15 = r7
            goto L41d
        L410:
            r18 = 1
            r20 = 4
            int r1 = r15 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r22)
            r6[r15] = r7
            goto L3f1
        L41d:
            r1 = r54
            r10 = -1
            goto L36f
        L422:
            r29 = 3
            r30 = 0
            goto L396
        L428:
            r1 = r25
        L42a:
            int r4 = r27 + (-2)
            if (r1 >= r4) goto L459
            r4 = r56[r1]
            r6 = r16
            if (r4 != r6) goto L44c
            int r4 = r1 + 1
            int r4 = r0.m2635(r4)
            if (r4 < 0) goto L44c
            if (r4 >= r13) goto L44c
            int r15 = r36 + r4
            r6 = r56[r15]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            r7 = 187(0xbb, float:2.62E-43)
            if (r6 != r7) goto L44c
            m2619(r4, r5)
        L44c:
            int r1 = r1 + 1
            r16 = 8
            goto L42a
        L451:
            r18 = 1
            r20 = 4
            r29 = 3
            r30 = 0
        L459:
            if (r9 == 0) goto L479
            int r1 = r8.f7723
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L479
            r4 = 0
            r6 = 0
            r1 = r2
            r2 = -1
            r7 = r5
            r5 = 0
            r17 = r56
            r10 = r1
            r14 = r7
            r7 = r23
            r43 = r27
            r15 = r30
            r1 = r54
            r1.m2929(r2, r3, r4, r5, r6)
        L476:
            r2 = r31
            goto L486
        L479:
            r1 = r54
            r17 = r56
            r10 = r2
            r14 = r5
            r7 = r23
            r43 = r27
            r15 = r30
            goto L476
        L486:
            int r4 = r0.m2631(r2, r15)
            r5 = r32
            int r6 = r0.m2631(r5, r15)
            r30 = r15
            int r15 = r8.f7723
            r15 = r15 & 256(0x100, float:3.59E-43)
            if (r15 != 0) goto L49b
            r15 = 33
            goto L49d
        L49b:
            r15 = r30
        L49d:
            r21 = r4
            r23 = r6
            r56 = r9
            r4 = r30
            r20 = r4
            r22 = r20
            r6 = r36
        L4ab:
            if (r6 >= r7) goto Lc46
            int r9 = r6 - r36
            r0 = r14[r9]
            r31 = r7
            if (r0 == 0) goto L4f1
            int r7 = r8.f7723
            r40 = r7
            r7 = 2
            r40 = r40 & 2
            if (r40 != 0) goto L4c1
            r40 = 1
            goto L4c3
        L4c1:
            r40 = r30
        L4c3:
            r1.m2924(r0)
            if (r40 == 0) goto L4f1
            short r7 = r0.f4709
            r40 = r2
            r2 = 128(0x80, float:1.8E-43)
            r7 = r7 & r2
            if (r7 == 0) goto L4f3
            short r2 = r0.f4711
            r7 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r7
            r1.m2930(r2, r0)
            int[] r2 = r0.f4708
            if (r2 == 0) goto L4f3
            r2 = 1
        L4df:
            int[] r7 = r0.f4708
            r41 = r3
            r3 = r7[r30]
            if (r2 > r3) goto L4f5
            r3 = r7[r2]
            r1.m2930(r3, r0)
            int r2 = r2 + 1
            r3 = r41
            goto L4df
        L4f1:
            r40 = r2
        L4f3:
            r41 = r3
        L4f5:
            r7 = r25
        L4f7:
            if (r7 == 0) goto L677
            int r0 = r8.f7715
            r2 = -1
            if (r0 == r9) goto L50a
            if (r0 != r2) goto L501
            goto L50a
        L501:
            r47 = r2
        L503:
            r0 = r5
            r25 = r6
            r6 = r40
            goto L67b
        L50a:
            if (r0 == r2) goto L538
            if (r28 == 0) goto L510
            if (r56 == 0) goto L514
        L510:
            r0 = r5
            r25 = r6
            goto L525
        L514:
            int r2 = r8.f7720
            int r3 = r8.f7725
            r0 = r5
            java.lang.Object[] r5 = r8.f7721
            int r4 = r8.f7722
            r25 = r6
            java.lang.Object[] r6 = r8.f7713
            r1.m2929(r2, r3, r4, r5, r6)
            goto L533
        L525:
            int r3 = r8.f7712
            java.lang.Object[] r5 = r8.f7721
            int r4 = r8.f7722
            java.lang.Object[] r6 = r8.f7713
            r2 = -1
            r1 = r54
            r1.m2929(r2, r3, r4, r5, r6)
        L533:
            r6 = r30
        L535:
            r1 = r43
            goto L53d
        L538:
            r0 = r5
            r25 = r6
            r6 = r4
            goto L535
        L53d:
            if (r7 >= r1) goto L666
            char[] r4 = r8.f7717
            ᛶᛴᲀᲇ[] r5 = r8.f7726
            if (r28 == 0) goto L550
            int r2 = r7 + 1
            r3 = r17[r7]
            r7 = 255(0xff, float:3.57E-43)
            r3 = r3 & r7
            r7 = r2
        L54d:
            r2 = r30
            goto L556
        L550:
            r2 = -1
            r8.f7715 = r2
            r3 = 255(0xff, float:3.57E-43)
            goto L54d
        L556:
            r8.f7725 = r2
            r2 = 64
            if (r3 >= r2) goto L56f
            r2 = r29
            r8.f7720 = r2
            r2 = 0
            r8.f7722 = r2
            r43 = r1
            r49 = r6
            r1 = r7
            r35 = 128(0x80, float:1.8E-43)
            r47 = -1
            r7 = r0
            goto L648
        L56f:
            r2 = 128(0x80, float:1.8E-43)
            if (r3 >= r2) goto L595
            int r32 = r3 + (-64)
            r3 = r2
            java.lang.Object[] r2 = r8.f7713
            r43 = r3
            r3 = 0
            r35 = r43
            r47 = -1
            r43 = r1
            r1 = r7
            r7 = r0
            r0 = r53
            int r1 = r0.m2624(r1, r2, r3, r4, r5)
            r2 = 4
            r8.f7720 = r2
            r3 = 1
            r8.f7722 = r3
            r49 = r6
        L591:
            r3 = r32
            goto L648
        L595:
            r43 = r1
            r35 = r2
            r1 = r7
            r47 = -1
            r7 = r0
            r0 = r53
            r2 = 247(0xf7, float:3.46E-43)
            if (r3 < r2) goto L662
            int r32 = r0.m2635(r1)
            r48 = r1
            int r1 = r48 + 2
            if (r3 != r2) goto L5bd
            java.lang.Object[] r2 = r8.f7713
            r3 = 0
            r49 = r6
            r6 = 4
            int r1 = r0.m2624(r1, r2, r3, r4, r5)
            r8.f7720 = r6
            r3 = 1
            r8.f7722 = r3
            goto L591
        L5bd:
            r49 = r6
            r6 = 4
            r0 = 248(0xf8, float:3.48E-43)
            r2 = 251(0xfb, float:3.52E-43)
            if (r3 < r0) goto L5d8
            if (r3 >= r2) goto L5d8
            r0 = 2
            r8.f7720 = r0
            int r0 = 251 - r3
            r8.f7725 = r0
            int r2 = r8.f7712
            int r2 = r2 - r0
            r8.f7712 = r2
            r0 = 0
            r8.f7722 = r0
            goto L591
        L5d8:
            r0 = 0
            if (r3 != r2) goto L5e1
            r2 = 3
            r8.f7720 = r2
            r8.f7722 = r0
            goto L591
        L5e1:
            r0 = 255(0xff, float:3.57E-43)
            if (r3 >= r0) goto L617
            if (r56 == 0) goto L5ea
            int r0 = r8.f7712
            goto L5eb
        L5ea:
            r0 = 0
        L5eb:
            int r2 = r3 + (-251)
            r3 = r0
            r46 = r2
        L5f0:
            if (r46 <= 0) goto L605
            r0 = r2
            java.lang.Object[] r2 = r8.f7721
            int r48 = r3 + 1
            r6 = r0
            r0 = r53
            int r1 = r0.m2624(r1, r2, r3, r4, r5)
            int r46 = r46 + (-1)
            r2 = r6
            r3 = r48
            r6 = 4
            goto L5f0
        L605:
            r3 = 1
            r0 = r53
            r6 = r2
            r8.f7720 = r3
            r8.f7725 = r6
            int r2 = r8.f7712
            int r2 = r2 + r6
            r8.f7712 = r2
            r2 = 0
            r8.f7722 = r2
            goto L591
        L617:
            r2 = 0
            r0 = r53
            int r6 = r0.m2635(r1)
            int r1 = r48 + 4
            r8.f7720 = r2
            r8.f7725 = r6
            r8.f7712 = r6
            r3 = 0
        L627:
            if (r3 >= r6) goto L632
            java.lang.Object[] r2 = r8.f7721
            int r1 = r0.m2624(r1, r2, r3, r4, r5)
            int r3 = r3 + 1
            goto L627
        L632:
            int r6 = r0.m2635(r1)
            int r1 = r1 + 2
            r8.f7722 = r6
            r3 = 0
        L63b:
            if (r3 >= r6) goto L591
            java.lang.Object[] r2 = r8.f7713
            int r1 = r0.m2624(r1, r2, r3, r4, r5)
            int r3 = r3 + 1
            r0 = r53
            goto L63b
        L648:
            int r0 = r8.f7715
            r18 = 1
            int r3 = r3 + 1
            int r3 = r3 + r0
            r8.f7715 = r3
            m2619(r3, r5)
            r5 = r7
            r6 = r25
            r4 = r49
            r29 = 3
            r30 = 0
            r7 = r1
        L65e:
            r1 = r54
            goto L4f7
        L662:
            defpackage.C0086.m557()
            return
        L666:
            r49 = r6
            r47 = -1
            r5 = r0
            r43 = r1
            r6 = r25
            r4 = r49
            r7 = 0
            r29 = 3
            r30 = 0
            goto L65e
        L677:
            r47 = -1
            goto L503
        L67b:
            if (r4 == 0) goto L6a5
            int r1 = r8.f7723
            r16 = 8
            r1 = r1 & 8
            if (r1 == 0) goto L699
            r3 = 0
            r5 = 0
            r1 = 256(0x100, float:3.59E-43)
            r2 = 0
            r4 = 0
            r32 = r7
            r35 = r10
            r7 = r53
            r10 = r0
            r0 = r54
            r0.m2929(r1, r2, r3, r4, r5)
            r1 = r0
            goto L6a2
        L699:
            r1 = r54
            r32 = r7
            r35 = r10
            r7 = r53
            r10 = r0
        L6a2:
            r27 = 0
            goto L6b0
        L6a5:
            r1 = r54
            r32 = r7
            r35 = r10
            r7 = r53
            r10 = r0
            r27 = r4
        L6b0:
            r0 = r17[r25]
            r2 = 255(0xff, float:3.57E-43)
            r0 = r0 & r2
            r2 = 200(0xc8, float:2.8E-43)
            switch(r0) {
                case 0: goto Lb76;
                case 1: goto Lb76;
                case 2: goto Lb76;
                case 3: goto Lb76;
                case 4: goto Lb76;
                case 5: goto Lb76;
                case 6: goto Lb76;
                case 7: goto Lb76;
                case 8: goto Lb76;
                case 9: goto Lb76;
                case 10: goto Lb76;
                case 11: goto Lb76;
                case 12: goto Lb76;
                case 13: goto Lb76;
                case 14: goto Lb76;
                case 15: goto Lb76;
                case 16: goto Lb56;
                case 17: goto Lb32;
                case 18: goto Lb06;
                case 19: goto Lae1;
                case 20: goto Lae1;
                case 21: goto Labd;
                case 22: goto Labd;
                case 23: goto Labd;
                case 24: goto Labd;
                case 25: goto Labd;
                case 26: goto La99;
                case 27: goto La99;
                case 28: goto La99;
                case 29: goto La99;
                case 30: goto La99;
                case 31: goto La99;
                case 32: goto La99;
                case 33: goto La99;
                case 34: goto La99;
                case 35: goto La99;
                case 36: goto La99;
                case 37: goto La99;
                case 38: goto La99;
                case 39: goto La99;
                case 40: goto La99;
                case 41: goto La99;
                case 42: goto La99;
                case 43: goto La99;
                case 44: goto La99;
                case 45: goto La99;
                case 46: goto Lb76;
                case 47: goto Lb76;
                case 48: goto Lb76;
                case 49: goto Lb76;
                case 50: goto Lb76;
                case 51: goto Lb76;
                case 52: goto Lb76;
                case 53: goto Lb76;
                case 54: goto Labd;
                case 55: goto Labd;
                case 56: goto Labd;
                case 57: goto Labd;
                case 58: goto Labd;
                case 59: goto La73;
                case 60: goto La73;
                case 61: goto La73;
                case 62: goto La73;
                case 63: goto La73;
                case 64: goto La73;
                case 65: goto La73;
                case 66: goto La73;
                case 67: goto La73;
                case 68: goto La73;
                case 69: goto La73;
                case 70: goto La73;
                case 71: goto La73;
                case 72: goto La73;
                case 73: goto La73;
                case 74: goto La73;
                case 75: goto La73;
                case 76: goto La73;
                case 77: goto La73;
                case 78: goto La73;
                case 79: goto Lb76;
                case 80: goto Lb76;
                case 81: goto Lb76;
                case 82: goto Lb76;
                case 83: goto Lb76;
                case 84: goto Lb76;
                case 85: goto Lb76;
                case 86: goto Lb76;
                case 87: goto Lb76;
                case 88: goto Lb76;
                case 89: goto Lb76;
                case 90: goto Lb76;
                case 91: goto Lb76;
                case 92: goto Lb76;
                case 93: goto Lb76;
                case 94: goto Lb76;
                case 95: goto Lb76;
                case 96: goto Lb76;
                case 97: goto Lb76;
                case 98: goto Lb76;
                case 99: goto Lb76;
                case 100: goto Lb76;
                case 101: goto Lb76;
                case 102: goto Lb76;
                case 103: goto Lb76;
                case 104: goto Lb76;
                case 105: goto Lb76;
                case 106: goto Lb76;
                case 107: goto Lb76;
                case 108: goto Lb76;
                case 109: goto Lb76;
                case 110: goto Lb76;
                case 111: goto Lb76;
                case 112: goto Lb76;
                case 113: goto Lb76;
                case 114: goto Lb76;
                case 115: goto Lb76;
                case 116: goto Lb76;
                case 117: goto Lb76;
                case 118: goto Lb76;
                case 119: goto Lb76;
                case 120: goto Lb76;
                case 121: goto Lb76;
                case 122: goto Lb76;
                case 123: goto Lb76;
                case 124: goto Lb76;
                case 125: goto Lb76;
                case 126: goto Lb76;
                case 127: goto Lb76;
                case 128: goto Lb76;
                case 129: goto Lb76;
                case 130: goto Lb76;
                case 131: goto Lb76;
                case 132: goto La4e;
                case 133: goto Lb76;
                case 134: goto Lb76;
                case 135: goto Lb76;
                case 136: goto Lb76;
                case 137: goto Lb76;
                case 138: goto Lb76;
                case 139: goto Lb76;
                case 140: goto Lb76;
                case 141: goto Lb76;
                case 142: goto Lb76;
                case 143: goto Lb76;
                case 144: goto Lb76;
                case 145: goto Lb76;
                case 146: goto Lb76;
                case 147: goto Lb76;
                case 148: goto Lb76;
                case 149: goto Lb76;
                case 150: goto Lb76;
                case 151: goto Lb76;
                case 152: goto Lb76;
                case 153: goto La29;
                case 154: goto La29;
                case 155: goto La29;
                case 156: goto La29;
                case 157: goto La29;
                case 158: goto La29;
                case 159: goto La29;
                case 160: goto La29;
                case 161: goto La29;
                case 162: goto La29;
                case 163: goto La29;
                case 164: goto La29;
                case 165: goto La29;
                case 166: goto La29;
                case 167: goto La29;
                case 168: goto La29;
                case 169: goto Labd;
                case 170: goto L9d0;
                case 171: goto L940;
                case 172: goto Lb76;
                case 173: goto Lb76;
                case 174: goto Lb76;
                case 175: goto Lb76;
                case 176: goto Lb76;
                case 177: goto Lb76;
                case 178: goto L8cf;
                case 179: goto L8cf;
                case 180: goto L8cf;
                case 181: goto L8cf;
                case 182: goto L8cf;
                case 183: goto L8cf;
                case 184: goto L8cf;
                case 185: goto L8cf;
                case 186: goto L802;
                case 187: goto L7ea;
                case 188: goto Lb56;
                case 189: goto L7ea;
                case 190: goto Lb76;
                case 191: goto Lb76;
                case 192: goto L7ea;
                case 193: goto L7ea;
                case 194: goto Lb76;
                case 195: goto Lb76;
                case 196: goto L7b9;
                case 197: goto L756;
                case 198: goto La29;
                case 199: goto La29;
                case 200: goto L73c;
                case 201: goto L73c;
                case 202: goto L6ed;
                case 203: goto L6ed;
                case 204: goto L6ed;
                case 205: goto L6ed;
                case 206: goto L6ed;
                case 207: goto L6ed;
                case 208: goto L6ed;
                case 209: goto L6ed;
                case 210: goto L6ed;
                case 211: goto L6ed;
                case 212: goto L6ed;
                case 213: goto L6ed;
                case 214: goto L6ed;
                case 215: goto L6ed;
                case 216: goto L6ed;
                case 217: goto L6ed;
                case 218: goto L6ed;
                case 219: goto L6ed;
                case 220: goto L6c0;
                default: goto L6ba;
            }
        L6ba:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L6c0:
            int r0 = r25 + 1
            int r0 = r7.m2632(r0)
            int r0 = r0 + r9
            r0 = r14[r0]
            r1.m2918(r2, r0)
            int r0 = r25 + 5
            r40 = r10
            r46 = r12
            r3 = r20
            r5 = r21
            r10 = r37
            r12 = r42
            r2 = 255(0xff, float:3.57E-43)
            r4 = 1
        L6dd:
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            goto Lb94
        L6ed:
            r3 = 218(0xda, float:3.05E-43)
            if (r0 >= r3) goto L6f4
            int r0 = r0 + (-49)
            goto L6f6
        L6f4:
            int r0 = r0 + (-20)
        L6f6:
            int r3 = r25 + 1
            int r3 = r7.m2635(r3)
            int r3 = r3 + r9
            r3 = r14[r3]
            r4 = 167(0xa7, float:2.34E-43)
            if (r0 == r4) goto L723
            r5 = 168(0xa8, float:2.35E-43)
            if (r0 != r5) goto L708
            goto L723
        L708:
            if (r0 >= r4) goto L713
            int r0 = r0 + 1
            r18 = 1
            r0 = r0 ^ 1
            int r0 = r0 + (-1)
            goto L715
        L713:
            r0 = r0 ^ 1
        L715:
            int r4 = r9 + 3
            ᛶᛴᲀᲇ r4 = m2619(r4, r14)
            r1.m2918(r0, r4)
            r1.m2918(r2, r3)
            r2 = 1
            goto L72a
        L723:
            int r0 = r0 + 33
            r1.m2918(r0, r3)
            r2 = r27
        L72a:
            int r0 = r25 + 3
            r4 = r2
            r40 = r10
            r46 = r12
            r3 = r20
            r5 = r21
        L735:
            r10 = r37
            r12 = r42
            r2 = 255(0xff, float:3.57E-43)
            goto L6dd
        L73c:
            int r0 = r0 - r15
            int r2 = r25 + 1
            int r2 = r7.m2632(r2)
            int r2 = r2 + r9
            r2 = r14[r2]
            r1.m2918(r0, r2)
            int r0 = r25 + 5
            r40 = r10
            r46 = r12
            r3 = r20
            r5 = r21
            r4 = r27
            goto L735
        L756:
            int r0 = r25 + 1
            java.lang.String r0 = r7.m2633(r11, r0)
            int r2 = r25 + 3
            r2 = r17[r2]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r3 = r42
            int r4 = r3.f518
            r1.f7140 = r4
            r4 = r37
            r5 = 7
            ᛷᛲᲁᲀ r0 = r4.m612(r5, r0)
            int r5 = r0.f5529
            r37 = r13
            r13 = 197(0xc5, float:2.76E-43)
            r3.m340(r13, r5)
            r3.m347(r2)
            ᛶᛴᲀᲇ r5 = r1.f7165
            if (r5 == 0) goto L79b
            r13 = r39
            r39 = r14
            r14 = 4
            if (r13 == r14) goto L793
            r14 = 3
            if (r13 != r14) goto L78b
            goto L793
        L78b:
            int r0 = r1.f7155
            int r2 = 1 - r2
            int r2 = r2 + r0
            r1.f7155 = r2
            goto L79f
        L793:
            ᛸᛴᛱᲁ r5 = r5.f4710
            r14 = 197(0xc5, float:2.76E-43)
            r5.mo2675(r14, r2, r0, r4)
            goto L79f
        L79b:
            r13 = r39
            r39 = r14
        L79f:
            int r0 = r25 + 4
        L7a1:
            r40 = r10
            r46 = r12
            r42 = r15
            r5 = r21
            r2 = 255(0xff, float:3.57E-43)
            r16 = 8
            r44 = 7
            r50 = 4
            r12 = r3
            r10 = r4
            r3 = r20
        L7b5:
            r4 = r27
            goto Lb94
        L7b9:
            r4 = r37
            r3 = r42
            r37 = r13
            r13 = r39
            r39 = r14
            int r0 = r25 + 1
            r0 = r17[r0]
            r2 = 255(0xff, float:3.57E-43)
            r0 = r0 & r2
            r14 = 132(0x84, float:1.85E-43)
            if (r0 != r14) goto L7e0
            int r0 = r25 + 2
            int r0 = r7.m2635(r0)
            int r2 = r25 + 4
            short r2 = r7.m2629(r2)
            r1.m2912(r0, r2)
            int r0 = r25 + 6
            goto L7a1
        L7e0:
            int r2 = r25 + 2
            int r2 = r7.m2635(r2)
            r1.m2925(r0, r2)
            goto L79f
        L7ea:
            r4 = r37
            r3 = r42
            r37 = r13
            r13 = r39
            r39 = r14
            r14 = 132(0x84, float:1.85E-43)
            int r2 = r25 + 1
            java.lang.String r2 = r7.m2633(r11, r2)
            r1.m2920(r0, r2)
            int r0 = r25 + 3
            goto L7a1
        L802:
            r4 = r37
            r3 = r42
            r37 = r13
            r13 = r39
            r39 = r14
            r14 = 132(0x84, float:1.85E-43)
            int r0 = r25 + 1
            int r0 = r7.m2635(r0)
            r0 = r24[r0]
            int r2 = r0 + 2
            int r2 = r7.m2635(r2)
            r2 = r24[r2]
            java.lang.String r5 = r7.m2634(r11, r2)
            r45 = 2
            int r2 = r2 + 2
            java.lang.String r2 = r7.m2634(r11, r2)
            int[] r14 = r7.f6295
            int r0 = r7.m2635(r0)
            r0 = r14[r0]
            int r14 = r7.m2635(r0)
            java.lang.Object r14 = r7.m2639(r11, r14)
            ᛶᛶᲇᛲ r14 = (defpackage.C1100) r14
            r40 = r0
            int r0 = r40 + 2
            int r0 = r7.m2635(r0)
            r42 = r15
            java.lang.Object[] r15 = new java.lang.Object[r0]
            r50 = 4
            int r40 = r40 + 4
            r46 = r40
            r40 = r10
            r10 = r46
            r46 = r12
            r12 = 0
        L855:
            if (r12 >= r0) goto L86c
            r48 = r0
            int r0 = r7.m2635(r10)
            java.lang.Object r0 = r7.m2639(r11, r0)
            r15[r12] = r0
            r45 = 2
            int r10 = r10 + 2
            int r12 = r12 + 1
            r0 = r48
            goto L855
        L86c:
            int r0 = r3.f518
            r1.f7140 = r0
            ᛷᛲᲁᲀ r0 = r4.m611(r14, r15)
            r10 = 18
            int r0 = r0.f5529
            ᛷᛲᲁᲀ r0 = r4.m610(r10, r0, r5, r2)
            int r2 = r0.f5529
            r5 = 186(0xba, float:2.6E-43)
            r3.m340(r5, r2)
            r2 = 0
            r3.m344(r2)
            ᛶᛴᲀᲇ r2 = r1.f7165
            if (r2 == 0) goto L8bb
            r14 = 4
            if (r13 == r14) goto L8b5
            r14 = 3
            if (r13 != r14) goto L892
            goto L8b5
        L892:
            int r2 = r0.f5532
            if (r2 != 0) goto L89e
            java.lang.String r2 = r0.f5526
            int r2 = defpackage.C2118.m3541(r2)
            r0.f5532 = r2
        L89e:
            r0 = r2 & 3
            r45 = 2
            int r2 = r2 >> 2
            int r0 = r0 - r2
            r18 = 1
            int r0 = r0 + 1
            int r2 = r1.f7155
            int r2 = r2 + r0
            int r0 = r1.f7134
            if (r2 <= r0) goto L8b2
            r1.f7134 = r2
        L8b2:
            r1.f7155 = r2
            goto L8bb
        L8b5:
            ᛸᛴᛱᲁ r2 = r2.f4710
            r15 = 0
            r2.mo2675(r5, r15, r0, r4)
        L8bb:
            int r0 = r25 + 5
            r12 = r3
            r10 = r4
            r3 = r20
            r5 = r21
            r4 = r27
            r2 = 255(0xff, float:3.57E-43)
            r16 = 8
            r44 = 7
        L8cb:
            r50 = 4
            goto Lb94
        L8cf:
            r40 = r10
            r46 = r12
            r4 = r37
            r3 = r42
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r2 = r25 + 1
            int r2 = r7.m2635(r2)
            r2 = r24[r2]
            int r5 = r2 + 2
            int r5 = r7.m2635(r5)
            r5 = r24[r5]
            r10 = r2
            java.lang.String r2 = r7.m2633(r11, r10)
            r12 = r3
            java.lang.String r3 = r7.m2634(r11, r5)
            r45 = 2
            int r5 = r5 + 2
            java.lang.String r5 = r7.m2634(r11, r5)
            r14 = 182(0xb6, float:2.55E-43)
            if (r0 >= r14) goto L90c
            r1.m2917(r0, r2, r3, r5)
            r10 = r4
            r44 = 7
            goto L92c
        L90c:
            int r10 = r10 + (-1)
            r10 = r17[r10]
            r14 = 11
            if (r10 != r14) goto L91d
            r10 = r1
            r1 = r0
            r0 = r10
            r10 = r4
            r4 = r5
            r5 = 1
        L91a:
            r44 = 7
            goto L924
        L91d:
            r10 = r1
            r1 = r0
            r0 = r10
            r10 = r4
            r4 = r5
            r5 = 0
            goto L91a
        L924:
            r0.m2916(r1, r2, r3, r4, r5)
            r52 = r1
            r1 = r0
            r0 = r52
        L92c:
            r2 = 185(0xb9, float:2.59E-43)
            if (r0 != r2) goto L93d
            int r0 = r25 + 5
        L932:
            r3 = r20
            r5 = r21
            r4 = r27
            r2 = 255(0xff, float:3.57E-43)
            r16 = 8
            goto L8cb
        L93d:
            int r0 = r25 + 3
            goto L932
        L940:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r44 = 7
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            r0 = r9 & 3
            r50 = 4
            int r2 = 4 - r0
            int r2 = r2 + r25
            int r0 = r7.m2632(r2)
            int r0 = r0 + r9
            r0 = r39[r0]
            int r3 = r2 + 4
            int r3 = r7.m2632(r3)
            r16 = 8
            int r2 = r2 + 8
            int[] r4 = new int[r3]
            ᛶᛴᲀᲇ[] r5 = new defpackage.C1063[r3]
            r14 = 0
        L970:
            if (r14 >= r3) goto L988
            int r15 = r7.m2632(r2)
            r4[r14] = r15
            int r15 = r2 + 4
            int r15 = r7.m2632(r15)
            int r15 = r15 + r9
            r15 = r39[r15]
            r5[r14] = r15
            int r2 = r2 + 8
            int r14 = r14 + 1
            goto L970
        L988:
            int r14 = r12.f518
            r1.f7140 = r14
            r14 = 171(0xab, float:2.4E-43)
            r12.m347(r14)
            int r14 = r12.f518
            r50 = 4
            int r14 = r14 % 4
            int r14 = 4 - r14
            int r14 = r14 % 4
            r25 = r2
            r2 = 0
            r15 = 0
            r12.m338(r15, r2, r14)
            int r2 = r1.f7140
            r14 = 1
            r0.m2013(r12, r2, r14)
            r12.m339(r3)
            r2 = 0
        L9ac:
            if (r2 >= r3) goto L9c1
            r15 = r4[r2]
            r12.m339(r15)
            r15 = r5[r2]
            r48 = r2
            int r2 = r1.f7140
            r15.m2013(r12, r2, r14)
            int r2 = r48 + 1
            r14 = 1
            r15 = 0
            goto L9ac
        L9c1:
            r1.m2914(r0, r5)
            r3 = r20
            r5 = r21
            r0 = r25
            r4 = r27
            r2 = 255(0xff, float:3.57E-43)
            goto L8cb
        L9d0:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r16 = 8
            r44 = 7
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            r0 = r9 & 3
            r50 = 4
            int r2 = 4 - r0
            int r2 = r2 + r25
            int r0 = r7.m2632(r2)
            int r0 = r0 + r9
            r0 = r39[r0]
            int r3 = r2 + 4
            int r3 = r7.m2632(r3)
            int r4 = r2 + 8
            int r4 = r7.m2632(r4)
            int r2 = r2 + 12
            int r5 = r4 - r3
            r18 = 1
            int r5 = r5 + 1
            ᛶᛴᲀᲇ[] r14 = new defpackage.C1063[r5]
            r15 = 0
        La0a:
            if (r15 >= r5) goto La1b
            int r25 = r7.m2632(r2)
            int r25 = r25 + r9
            r25 = r39[r25]
            r14[r15] = r25
            int r2 = r2 + 4
            int r15 = r15 + 1
            goto La0a
        La1b:
            r1.m2913(r3, r4, r0, r14)
            r0 = r2
        La1f:
            r3 = r20
            r5 = r21
            r4 = r27
        La25:
            r2 = 255(0xff, float:3.57E-43)
            goto Lb94
        La29:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r2 = r25 + 1
            short r2 = r7.m2629(r2)
            int r2 = r2 + r9
            r2 = r39[r2]
            r1.m2918(r0, r2)
        La4b:
            int r0 = r25 + 3
            goto La1f
        La4e:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r0 = r25 + 1
            r0 = r17[r0]
            r2 = 255(0xff, float:3.57E-43)
            r0 = r0 & r2
            int r2 = r25 + 2
            r2 = r17[r2]
            r1.m2912(r0, r2)
            goto La4b
        La73:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r0 = r0 + (-59)
            int r2 = r0 >> 2
            int r2 = r2 + 54
            r29 = 3
            r0 = r0 & 3
            r1.m2925(r2, r0)
        La96:
            int r0 = r25 + 1
            goto La1f
        La99:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r16 = 8
            r29 = 3
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r0 = r0 + (-26)
            int r2 = r0 >> 2
            int r2 = r2 + 21
            r0 = r0 & 3
            r1.m2925(r2, r0)
            goto La96
        Labd:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r2 = r25 + 1
            r2 = r17[r2]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r1.m2925(r0, r2)
            int r0 = r25 + 2
            goto La1f
        Lae1:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r0 = r25 + 1
            int r0 = r7.m2635(r0)
            java.lang.Object r0 = r7.m2639(r11, r0)
            r1.m2915(r0)
            goto La4b
        Lb06:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r0 = r25 + 1
            r0 = r17[r0]
            r2 = 255(0xff, float:3.57E-43)
            r0 = r0 & r2
            java.lang.Object r0 = r7.m2639(r11, r0)
            r1.m2915(r0)
        Lb2a:
            int r0 = r25 + 2
        Lb2c:
            r3 = r20
            r5 = r21
            goto L7b5
        Lb32:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r2 = 255(0xff, float:3.57E-43)
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r3 = r25 + 1
            short r3 = r7.m2629(r3)
            r1.m2911(r0, r3)
            int r0 = r25 + 3
            goto Lb2c
        Lb56:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r2 = 255(0xff, float:3.57E-43)
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r3 = r25 + 1
            r3 = r17[r3]
            r1.m2911(r0, r3)
            goto Lb2a
        Lb76:
            r40 = r10
            r46 = r12
            r10 = r37
            r12 = r42
            r2 = 255(0xff, float:3.57E-43)
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            r1.m2923(r0)
            int r0 = r25 + 1
            goto Lb2c
        Lb94:
            if (r6 == 0) goto Lbc6
            int r14 = r6.length
            if (r3 >= r14) goto Lbc6
            if (r5 > r9) goto Lbc6
            if (r5 != r9) goto Lbba
            r5 = r6[r3]
            int r5 = r7.m2626(r8, r5)
            java.lang.String r14 = r7.m2634(r11, r5)
            r45 = 2
            int r5 = r5 + 2
            int r15 = r8.f7708
            ᛱᛲᛳᛲ r2 = r8.f7711
            r20 = r0
            r0 = 1
            ᛸᛶᛸᛳ r2 = r1.m2910(r15, r2, r14, r0)
            r7.m2623(r2, r5, r0, r11)
            goto Lbbc
        Lbba:
            r20 = r0
        Lbbc:
            int r3 = r3 + 1
            int r5 = r7.m2631(r6, r3)
            r0 = r20
            goto La25
        Lbc6:
            r20 = r0
            r0 = r22
            r2 = r23
        Lbcc:
            if (r40 == 0) goto Lc13
            r14 = r40
            int r15 = r14.length
            if (r0 >= r15) goto Lc0c
            if (r2 > r9) goto Lc0c
            if (r2 != r9) goto Lbf9
            r2 = r14[r0]
            int r2 = r7.m2626(r8, r2)
            java.lang.String r15 = r7.m2634(r11, r2)
            r45 = 2
            int r2 = r2 + 2
            r21 = r0
            int r0 = r8.f7708
            r22 = r3
            ᛱᛲᛳᛲ r3 = r8.f7711
            r23 = r4
            r4 = 0
            ᛸᛶᛸᛳ r0 = r1.m2910(r0, r3, r15, r4)
            r3 = 1
            r7.m2623(r0, r2, r3, r11)
            goto Lbff
        Lbf9:
            r21 = r0
            r22 = r3
            r23 = r4
        Lbff:
            int r0 = r21 + 1
            int r2 = r7.m2631(r14, r0)
            r40 = r14
            r3 = r22
            r4 = r23
            goto Lbcc
        Lc0c:
            r21 = r0
            r22 = r3
            r23 = r4
            goto Lc1b
        Lc13:
            r21 = r0
            r22 = r3
            r23 = r4
            r14 = r40
        Lc1b:
            r0 = r7
            r4 = r23
            r7 = r31
            r25 = r32
            r3 = r41
            r15 = r42
            r29 = 3
            r30 = 0
            r23 = r2
            r2 = r6
            r42 = r12
            r6 = r20
            r20 = r22
            r12 = r46
            r22 = r21
            r21 = r5
            r5 = r14
            r14 = r39
            r39 = r13
            r13 = r37
            r37 = r10
            r10 = r35
            goto L4ab
        Lc46:
            r7 = r0
            r6 = r2
            r41 = r3
            r35 = r10
            r46 = r12
            r10 = r37
            r37 = r13
            r13 = r39
            r39 = r14
            r14 = r5
            r0 = r39[r37]
            if (r0 == 0) goto Lc5e
            r1.m2924(r0)
        Lc5e:
            r4 = r33
            if (r4 == 0) goto Ld80
            int r0 = r8.f7723
            r45 = 2
            r0 = r0 & 2
            if (r0 != 0) goto Ld80
            r0 = r34
            if (r0 == 0) goto Lc9b
            int r2 = r7.m2635(r0)
            r29 = 3
            int r2 = r2 * 3
            int[] r3 = new int[r2]
            int r34 = r0 + 2
            r0 = r34
        Lc7c:
            if (r2 <= 0) goto Lc99
            int r5 = r2 + (-1)
            int r9 = r0 + 6
            r3[r5] = r9
            int r5 = r2 + (-2)
            int r9 = r0 + 8
            int r9 = r7.m2635(r9)
            r3[r5] = r9
            int r2 = r2 + (-3)
            int r5 = r7.m2635(r0)
            r3[r2] = r5
            int r0 = r0 + 10
            goto Lc7c
        Lc99:
            r2 = r3
            goto Lc9c
        Lc9b:
            r2 = 0
        Lc9c:
            int r0 = r7.m2635(r4)
            r45 = 2
            int r33 = r4 + 2
            r3 = r33
        Lca6:
            int r4 = r0 + (-1)
            if (r0 <= 0) goto Ld80
            int r0 = r7.m2635(r3)
            int r5 = r3 + 2
            int r5 = r7.m2635(r5)
            int r9 = r3 + 4
            java.lang.String r9 = r7.m2634(r11, r9)
            int r12 = r3 + 6
            java.lang.String r12 = r7.m2634(r11, r12)
            int r15 = r3 + 8
            int r15 = r7.m2635(r15)
            int r3 = r3 + 10
            r56 = r3
            r16 = r4
            if (r2 == 0) goto Lce8
            r3 = 0
        Lccf:
            int r4 = r2.length
            if (r3 >= r4) goto Lce8
            r4 = r2[r3]
            if (r4 != r0) goto Lce5
            int r4 = r3 + 1
            r4 = r2[r4]
            if (r4 != r15) goto Lce5
            int r3 = r3 + 2
            r3 = r2[r3]
            java.lang.String r3 = r7.m2634(r11, r3)
            goto Lce9
        Lce5:
            int r3 = r3 + 3
            goto Lccf
        Lce8:
            r3 = 0
        Lce9:
            r4 = r39[r0]
            int r0 = r0 + r5
            r0 = r39[r0]
            if (r3 == 0) goto Ld27
            ᛱᛲᛳᛲ r5 = r1.f7174
            if (r5 != 0) goto Lcfb
            ᛱᛲᛳᛲ r5 = new ᛱᛲᛳᛲ
            r5.<init>()
            r1.f7174 = r5
        Lcfb:
            r17 = r2
            int r2 = r1.f7173
            r18 = 1
            int r2 = r2 + 1
            r1.f7173 = r2
            int r2 = r4.f4707
            r5.m344(r2)
            int r2 = r0.f4707
            r19 = r2
            int r2 = r4.f4707
            int r2 = r19 - r2
            r5.m344(r2)
            int r2 = r10.m605(r9)
            r5.m344(r2)
            int r2 = r10.m605(r3)
            r5.m344(r2)
            r5.m344(r15)
            goto Ld29
        Ld27:
            r17 = r2
        Ld29:
            ᛱᛲᛳᛲ r2 = r1.f7179
            if (r2 != 0) goto Ld34
            ᛱᛲᛳᛲ r2 = new ᛱᛲᛳᛲ
            r2.<init>()
            r1.f7179 = r2
        Ld34:
            int r3 = r1.f7147
            r18 = 1
            int r3 = r3 + 1
            r1.f7147 = r3
            int r3 = r4.f4707
            r2.m344(r3)
            int r0 = r0.f4707
            int r3 = r4.f4707
            int r0 = r0 - r3
            r2.m344(r0)
            int r0 = r10.m605(r9)
            r2.m344(r0)
            int r0 = r10.m605(r12)
            r2.m344(r0)
            r2.m344(r15)
            if (r13 == 0) goto Ld75
            r9 = 0
            char r0 = r12.charAt(r9)
            r2 = 74
            if (r0 == r2) goto Ld6c
            r3 = 68
            if (r0 != r3) goto Ld6a
            goto Ld6c
        Ld6a:
            r0 = 1
            goto Ld6d
        Ld6c:
            r0 = 2
        Ld6d:
            int r15 = r15 + r0
            int r0 = r1.f7138
            if (r15 <= r0) goto Ld78
            r1.f7138 = r15
            goto Ld78
        Ld75:
            r2 = 74
            r9 = 0
        Ld78:
            r3 = r56
            r0 = r16
            r2 = r17
            goto Lca6
        Ld80:
            r9 = 0
            r10 = 65
            if (r6 == 0) goto Ldd0
            int r12 = r6.length
            r13 = r9
        Ld87:
            if (r13 >= r12) goto Ldd0
            r0 = r6[r13]
            int r2 = r7.m2628(r0)
            r3 = 64
            if (r2 == r3) goto Ld9e
            if (r2 != r10) goto Ld96
            goto Ld9e
        Ld96:
            r40 = r6
            r9 = r7
            r51 = r41
            r45 = 2
            goto Ldc5
        Ld9e:
            int r0 = r7.m2626(r8, r0)
            r40 = r6
            java.lang.String r6 = r7.m2634(r11, r0)
            r45 = 2
            int r15 = r0 + 2
            int r1 = r8.f7708
            ᛱᛲᛳᛲ r2 = r8.f7711
            ᛶᛴᲀᲇ[] r3 = r8.f7719
            ᛶᛴᲀᲇ[] r4 = r8.f7709
            int[] r5 = r8.f7710
            r7 = 1
            r9 = r53
            r0 = r54
            r51 = r41
            ᛸᛶᛸᛳ r1 = r0.m2926(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1
            r9.m2623(r1, r15, r3, r11)
        Ldc5:
            int r13 = r13 + 1
            r1 = r54
            r7 = r9
            r6 = r40
            r41 = r51
            r9 = 0
            goto Ld87
        Ldd0:
            r9 = r7
            r51 = r41
            r45 = 2
            if (r14 == 0) goto Le11
            int r12 = r14.length
            r13 = 0
        Ldd9:
            if (r13 >= r12) goto Le11
            r0 = r14[r13]
            int r1 = r9.m2628(r0)
            r15 = 64
            if (r1 == r15) goto Ldec
            if (r1 != r10) goto Lde8
            goto Ldec
        Lde8:
            r0 = r54
            r3 = 1
            goto Le0c
        Ldec:
            int r0 = r9.m2626(r8, r0)
            java.lang.String r6 = r9.m2634(r11, r0)
            int r0 = r0 + 2
            int r1 = r8.f7708
            ᛱᛲᛳᛲ r2 = r8.f7711
            ᛶᛴᲀᲇ[] r3 = r8.f7719
            ᛶᛴᲀᲇ[] r4 = r8.f7709
            int[] r5 = r8.f7710
            r7 = 0
            r10 = r0
            r0 = r54
            ᛸᛶᛸᛳ r1 = r0.m2926(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1
            r9.m2623(r1, r10, r3, r11)
        Le0c:
            int r13 = r13 + 1
            r10 = 65
            goto Ldd9
        Le11:
            r0 = r54
            r2 = r35
        Le15:
            if (r2 == 0) goto Le23
            java.lang.Object r1 = r2.f5859
            ᛷᛸᛱᛸ r1 = (defpackage.C1326) r1
            ᛷᛸᛱᛸ r3 = r0.f7158
            r2.f5859 = r3
            r0.f7158 = r2
            r2 = r1
            goto Le15
        Le23:
            r1 = r46
            r3 = r51
            r0.m2927(r1, r3)
            return
        Le2b:
            defpackage.C0086.m557()
            return
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final int[] m2638(defpackage.C1621 r12, defpackage.C1743 r13, int r14, boolean r15) {
            r11 = this;
            char[] r0 = r13.f7717
            int r1 = r11.m2635(r14)
            int[] r2 = new int[r1]
            int r14 = r14 + 2
            r3 = 0
        Lb:
            if (r3 >= r1) goto L94
            r2[r3] = r14
            int r4 = r11.m2632(r14)
            int r5 = r4 >>> 24
            r6 = 23
            r7 = 0
            if (r5 == r6) goto L4c
            switch(r5) {
                case 16: goto L4c;
                case 17: goto L4c;
                case 18: goto L4c;
                default: goto L1d;
            }
        L1d:
            switch(r5) {
                case 64: goto L27;
                case 65: goto L27;
                case 66: goto L4c;
                case 67: goto L4c;
                case 68: goto L4c;
                case 69: goto L4c;
                case 70: goto L4c;
                case 71: goto L24;
                case 72: goto L24;
                case 73: goto L24;
                case 74: goto L24;
                case 75: goto L24;
                default: goto L20;
            }
        L20:
            defpackage.C0086.m557()
            return r7
        L24:
            int r14 = r14 + 4
            goto L4e
        L27:
            int r6 = r14 + 1
            int r6 = r11.m2635(r6)
            int r14 = r14 + 3
        L2f:
            int r8 = r6 + (-1)
            if (r6 <= 0) goto L4e
            int r6 = r11.m2635(r14)
            int r9 = r14 + 2
            int r9 = r11.m2635(r9)
            int r14 = r14 + 6
            ᛶᛴᲀᲇ[] r10 = r13.f7726
            m2619(r6, r10)
            int r6 = r6 + r9
            ᛶᛴᲀᲇ[] r9 = r13.f7726
            m2619(r6, r9)
            r6 = r8
            goto L2f
        L4c:
            int r14 = r14 + 3
        L4e:
            int r6 = r11.m2628(r14)
            r8 = 66
            r9 = 1
            if (r5 != r8) goto L87
            if (r6 != 0) goto L5a
            goto L61
        L5a:
            ᛱᛲᛳᛲ r7 = new ᛱᛲᛳᛲ
            byte[] r5 = r11.f6294
            r7.<init>(r14, r5)
        L61:
            int r6 = r6 * 2
            int r6 = r6 + r9
            int r6 = r6 + r14
            java.lang.String r14 = r11.m2634(r0, r6)
            int r6 = r6 + 2
            r4 = r4 & (-256(0xffffffffffffff00, float:NaN))
            ᛱᛶᛲᛲ r5 = r12.f7177
            if (r15 == 0) goto L7a
            ᛸᛶᛸᛳ r8 = r12.f7141
            ᛸᛶᛸᛳ r14 = defpackage.C1515.m2755(r5, r4, r7, r14, r8)
            r12.f7141 = r14
            goto L82
        L7a:
            ᛸᛶᛸᛳ r8 = r12.f7161
            ᛸᛶᛸᛳ r14 = defpackage.C1515.m2755(r5, r4, r7, r14, r8)
            r12.f7161 = r14
        L82:
            int r14 = r11.m2623(r14, r6, r9, r0)
            goto L90
        L87:
            int r6 = r6 * 2
            int r6 = r6 + 3
            int r6 = r6 + r14
            int r14 = r11.m2623(r7, r6, r9, r0)
        L90:
            int r3 = r3 + 1
            goto Lb
        L94:
            return r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.Object m2639(char[] r13, int r14) {
            r12 = this;
            int[] r0 = r12.f6292
            r1 = r0[r14]
            int r2 = r1 + (-1)
            byte[] r3 = r12.f6294
            r2 = r3[r2]
            r4 = 0
            switch(r2) {
                case 3: goto Le7;
                case 4: goto Lda;
                case 5: goto Ld1;
                case 6: goto Lc4;
                case 7: goto La9;
                case 8: goto La4;
                default: goto Le;
            }
        Le:
            r5 = 11
            switch(r2) {
                case 15: goto L74;
                case 16: goto L66;
                case 17: goto L18;
                default: goto L13;
            }
        L13:
            defpackage.C0086.m557()
            r12 = 0
            return r12
        L18:
            ᛷᛲᲁᲇ[] r2 = r12.f6290
            r3 = r2[r14]
            if (r3 == 0) goto L1f
            return r3
        L1f:
            int r3 = r1 + 2
            int r3 = r12.m2635(r3)
            r0 = r0[r3]
            java.lang.String r3 = r12.m2634(r13, r0)
            int r0 = r0 + 2
            java.lang.String r0 = r12.m2634(r13, r0)
            int[] r5 = r12.f6295
            int r1 = r12.m2635(r1)
            r1 = r5[r1]
            int r5 = r12.m2635(r1)
            java.lang.Object r5 = r12.m2639(r13, r5)
            ᛶᛶᲇᛲ r5 = (defpackage.C1100) r5
            int r6 = r1 + 2
            int r6 = r12.m2635(r6)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r1 = r1 + 4
        L4d:
            if (r4 >= r6) goto L5e
            int r8 = r12.m2635(r1)
            java.lang.Object r8 = r12.m2639(r13, r8)
            r7[r4] = r8
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L4d
        L5e:
            ᛷᛲᲁᲇ r12 = new ᛷᛲᲁᲇ
            r12.<init>(r3, r0, r5, r7)
            r2[r14] = r12
            return r12
        L66:
            java.lang.String r12 = r12.m2634(r13, r1)
            ᲇᲀᛴᲁ r13 = new ᲇᲀᛴᲁ
            int r14 = r12.length()
            r13.<init>(r5, r4, r14, r12)
            return r13
        L74:
            int r7 = r12.m2628(r1)
            r14 = 1
            int r1 = r1 + r14
            int r1 = r12.m2635(r1)
            r1 = r0[r1]
            int r2 = r1 + 2
            int r2 = r12.m2635(r2)
            r0 = r0[r2]
            java.lang.String r8 = r12.m2633(r13, r1)
            java.lang.String r9 = r12.m2634(r13, r0)
            int r0 = r0 + 2
            java.lang.String r10 = r12.m2634(r13, r0)
            int r1 = r1 - r14
            r12 = r3[r1]
            if (r12 != r5) goto L9d
            r11 = r14
            goto L9e
        L9d:
            r11 = r4
        L9e:
            ᛶᛶᲇᛲ r6 = new ᛶᛶᲇᛲ
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        La4:
            java.lang.String r12 = r12.m2634(r13, r1)
            return r12
        La9:
            java.lang.String r12 = r12.m2634(r13, r1)
            ᲇᲀᛴᲁ r13 = new ᲇᲀᛴᲁ
            char r14 = r12.charAt(r4)
            r0 = 91
            if (r14 != r0) goto Lba
            r14 = 9
            goto Lbc
        Lba:
            r14 = 12
        Lbc:
            int r0 = r12.length()
            r13.<init>(r14, r4, r0, r12)
            return r13
        Lc4:
            long r12 = r12.m2621(r1)
            double r12 = java.lang.Double.longBitsToDouble(r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            return r12
        Ld1:
            long r12 = r12.m2621(r1)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            return r12
        Lda:
            int r12 = r12.m2632(r1)
            float r12 = java.lang.Float.intBitsToFloat(r12)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            return r12
        Le7:
            int r12 = r12.m2632(r1)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
    }
}
