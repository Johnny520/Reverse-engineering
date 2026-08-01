package xhss;

/* JADX INFO: renamed from: xhss.ᛱᲁᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C0103 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int[] f470;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public int[] f471;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int[] f472;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0985 f473;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public int[] f474;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f475;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public short f476;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int[] f477;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public short f478;

    public C0103(xhss.C0985 r1) {
            r0 = this;
            r0.<init>()
            r0.f473 = r1
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public static int m273(xhss.C1102 r10, java.lang.Object r11) {
            boolean r0 = r11 instanceof java.lang.Integer
            if (r0 == 0) goto Le
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r10 = r11.intValue()
            r11 = 4194304(0x400000, float:5.877472E-39)
        Lc:
            r10 = r10 | r11
            return r10
        Le:
            boolean r0 = r11 instanceof java.lang.String
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L4c
            java.lang.String r11 = (java.lang.String) r11
            char r0 = r11.charAt(r2)
            r3 = 91
            r4 = 12
            if (r0 != r3) goto L23
            r0 = 9
            goto L24
        L23:
            r0 = r4
        L24:
            int r3 = r11.length()
            r5 = 10
            if (r0 != r5) goto L34
            int r0 = 0 - r1
            int r3 = r3 + r1
            java.lang.String r11 = r11.substring(r0, r3)
            goto L47
        L34:
            if (r0 != r4) goto L43
            java.lang.String r11 = r11.substring(r2, r3)
            java.lang.String r0 = "L"
            java.lang.String r1 = ";"
            java.lang.String r11 = xhss.AbstractC0390.m781(r0, r11, r1)
            goto L47
        L43:
            java.lang.String r11 = r11.substring(r2, r3)
        L47:
            int r10 = m275(r10, r11, r2)
            return r10
        L4c:
            xhss.ᲁᲁᛱᲀ r11 = (xhss.C0985) r11
            short r0 = r11.f3198
            r0 = r0 & 4
            if (r0 == 0) goto L5f
            java.lang.String r0 = ""
            int r11 = r11.f3205
            int r10 = r10.m1785(r0, r11)
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            goto Lc
        L5f:
            xhss.ᛵᛶᛳ[] r0 = r10.f3549
            if (r0 != 0) goto L6d
            r0 = 16
            xhss.ᛵᛶᛳ[] r3 = new xhss.C0481[r0]
            r10.f3549 = r3
            xhss.ᛵᛶᛳ[] r0 = new xhss.C0481[r0]
            r10.f3544 = r0
        L6d:
            int r0 = java.lang.System.identityHashCode(r11)
            xhss.ᛵᛶᛳ[] r3 = r10.f3549
            int r4 = r3.length
            int r4 = r0 % r4
            r3 = r3[r4]
        L78:
            if (r3 == 0) goto L85
            java.lang.Object r4 = r3.f1742
            xhss.ᲁᲁᛱᲀ r4 = (xhss.C0985) r4
            if (r4 == r11) goto L85
            java.lang.Object r3 = r3.f1744
            xhss.ᛵᛶᛳ r3 = (xhss.C0481) r3
            goto L78
        L85:
            if (r3 == 0) goto L88
            goto Le7
        L88:
            int r3 = r10.f3541
            xhss.ᛵᛶᛳ[] r4 = r10.f3549
            int r5 = r4.length
            int r5 = r5 * 3
            int r5 = r5 / 4
            if (r3 <= r5) goto Lbc
            int r3 = r4.length
            int r4 = r3 * 2
            int r4 = r4 + r1
            xhss.ᛵᛶᛳ[] r5 = new xhss.C0481[r4]
            int r3 = r3 - r1
        L9a:
            if (r3 < 0) goto Lba
            xhss.ᛵᛶᛳ[] r1 = r10.f3549
            r1 = r1[r3]
        La0:
            if (r1 == 0) goto Lb7
            java.lang.Object r6 = r1.f1742
            xhss.ᲁᲁᛱᲀ r6 = (xhss.C0985) r6
            int r6 = java.lang.System.identityHashCode(r6)
            int r6 = r6 % r4
            java.lang.Object r7 = r1.f1744
            xhss.ᛵᛶᛳ r7 = (xhss.C0481) r7
            r8 = r5[r6]
            r1.f1744 = r8
            r5[r6] = r1
            r1 = r7
            goto La0
        Lb7:
            int r3 = r3 + (-1)
            goto L9a
        Lba:
            r10.f3549 = r5
        Lbc:
            int r1 = r10.f3541
            xhss.ᛵᛶᛳ[] r3 = r10.f3544
            int r4 = r3.length
            if (r1 != r4) goto Lcf
            int r1 = r3.length
            int r1 = r1 * 2
            xhss.ᛵᛶᛳ[] r1 = new xhss.C0481[r1]
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r2, r4)
            r10.f3544 = r1
            r3 = r1
        Lcf:
            xhss.ᛵᛶᛳ r1 = new xhss.ᛵᛶᛳ
            int r2 = r10.f3541
            r1.<init>(r2, r11)
            xhss.ᛵᛶᛳ[] r11 = r10.f3549
            int r4 = r11.length
            int r0 = r0 % r4
            r4 = r11[r0]
            r1.f1744 = r4
            r11[r0] = r1
            int r11 = r2 + 1
            r10.f3541 = r11
            r3[r2] = r1
            r3 = r1
        Le7:
            int r11 = r3.f1741
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 130(0x82, float:1.82E-43)
            int r2 = r1 + r11
            r9 = r2 & r0
            xhss.ᛳᛴᛶᛷ r0 = r10.m1790(r9)
        Lf6:
            java.lang.String r6 = ""
            if (r0 == 0) goto L117
            int r2 = r0.f962
            if (r2 != r1) goto L114
            int r2 = r0.f967
            if (r2 != r9) goto L114
            long r2 = r0.f970
            long r4 = (long) r11
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L114
            java.lang.String r2 = r0.f964
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L114
            int r10 = r0.f965
            goto L125
        L114:
            xhss.ᛳᛴᛶᛷ r0 = r0.f966
            goto Lf6
        L117:
            xhss.ᛳᛴᛶᛷ r3 = new xhss.ᛳᛴᛶᛷ
            int r4 = r10.f3545
            r5 = 130(0x82, float:1.82E-43)
            long r7 = (long) r11
            r3.<init>(r4, r5, r6, r7, r9)
            int r10 = r10.m1782(r3)
        L125:
            r11 = 16777216(0x1000000, float:2.3509887E-38)
            goto Lc
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static boolean m274(xhss.C1102 r19, int r20, int[] r21, int r22) {
            r0 = r19
            r1 = r20
            r2 = r21[r22]
            r3 = 0
            if (r2 != r1) goto Lb
            goto L135
        Lb:
            r4 = 67108863(0x3ffffff, float:1.5046327E-36)
            r4 = r4 & r1
            r5 = 4194309(0x400005, float:5.877479E-39)
            if (r4 != r5) goto L19
            if (r2 != r5) goto L18
            goto L135
        L18:
            r1 = r5
        L19:
            r4 = 1
            if (r2 != 0) goto L1f
            r21[r22] = r1
            return r4
        L1f:
            r6 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r7 = r2 & r6
            r8 = 4194304(0x400000, float:5.877472E-39)
            r9 = 62914560(0x3c00000, float:1.1284746E-36)
            r10 = 8388608(0x800000, float:1.1754944E-38)
            if (r7 != 0) goto L3f
            r11 = r2 & r9
            if (r11 != r10) goto L30
            goto L3f
        L30:
            if (r2 != r5) goto L130
            r0 = r1 & r6
            if (r0 != 0) goto L3c
            r0 = r1 & r9
            if (r0 != r10) goto L3b
            goto L3c
        L3b:
            r1 = r8
        L3c:
            r8 = r1
            goto L130
        L3f:
            if (r1 != r5) goto L43
            goto L135
        L43:
            r5 = -4194304(0xffffffffffc00000, float:NaN)
            r11 = r1 & r5
            r5 = r5 & r2
            java.lang.String r12 = "java/lang/Object"
            if (r11 != r5) goto L111
            r5 = r2 & r9
            if (r5 != r10) goto L107
            r5 = r1 & r6
            r5 = r5 | r10
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r6
            r6 = r6 & r2
            r0.getClass()
            r7 = 32
            if (r1 >= r6) goto L67
            long r8 = (long) r1
            long r10 = (long) r6
        L61:
            long r10 = r10 << r7
            long r7 = r8 | r10
            r16 = r7
            goto L6a
        L67:
            long r8 = (long) r6
            long r10 = (long) r1
            goto L61
        L6a:
            int r7 = r1 + r6
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 131(0x83, float:1.84E-43)
            int r7 = r7 + r9
            r7 = r7 & r8
            xhss.ᛳᛴᛶᛷ r8 = r0.m1790(r7)
        L77:
            if (r8 == 0) goto L8e
            int r10 = r8.f962
            if (r10 != r9) goto L8b
            int r10 = r8.f967
            if (r10 != r7) goto L8b
            long r10 = r8.f970
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 != 0) goto L8b
            int r0 = r8.f968
            goto Lf6
        L8b:
            xhss.ᛳᛴᛶᛷ r8 = r8.f966
            goto L77
        L8e:
            xhss.ᛳᛴᛶᛷ[] r8 = r0.f3550
            r1 = r8[r1]
            java.lang.String r1 = r1.f964
            r6 = r8[r6]
            java.lang.String r6 = r6.f964
            java.lang.Class<xhss.ᲇᛷᛳᛵ> r8 = xhss.C1054.class
            java.lang.ClassLoader r8 = r8.getClassLoader()
            r9 = 46
            r10 = 47
            java.lang.String r11 = r1.replace(r10, r9)     // Catch: java.lang.ClassNotFoundException -> L100
            java.lang.Class r11 = java.lang.Class.forName(r11, r3, r8)     // Catch: java.lang.ClassNotFoundException -> L100
            java.lang.String r13 = r6.replace(r10, r9)     // Catch: java.lang.ClassNotFoundException -> Lf9
            java.lang.Class r8 = java.lang.Class.forName(r13, r3, r8)     // Catch: java.lang.ClassNotFoundException -> Lf9
            boolean r13 = r11.isAssignableFrom(r8)
            if (r13 == 0) goto Lba
            r12 = r1
            goto Le1
        Lba:
            boolean r1 = r8.isAssignableFrom(r11)
            if (r1 == 0) goto Lc2
            r12 = r6
            goto Le1
        Lc2:
            boolean r1 = r11.isInterface()
            if (r1 != 0) goto Le1
            boolean r1 = r8.isInterface()
            if (r1 == 0) goto Lcf
            goto Le1
        Lcf:
            java.lang.Class r11 = r11.getSuperclass()
            boolean r1 = r11.isAssignableFrom(r8)
            if (r1 == 0) goto Lcf
            java.lang.String r1 = r11.getName()
            java.lang.String r12 = r1.replace(r9, r10)
        Le1:
            int r1 = r0.m1791(r12)
            xhss.ᛳᛴᛶᛷ r13 = new xhss.ᛳᛴᛶᛷ
            int r14 = r0.f3545
            r15 = 131(0x83, float:1.84E-43)
            r18 = r7
            r13.<init>(r14, r15, r16, r18)
            r0.m1779(r13)
            r13.f968 = r1
            r0 = r1
        Lf6:
            r8 = r5 | r0
            goto L130
        Lf9:
            r0 = move-exception
            java.lang.TypeNotPresentException r1 = new java.lang.TypeNotPresentException
            r1.<init>(r6, r0)
            throw r1
        L100:
            r0 = move-exception
            java.lang.TypeNotPresentException r2 = new java.lang.TypeNotPresentException
            r2.<init>(r1, r0)
            throw r2
        L107:
            r1 = r1 & r6
            int r1 = r1 + r6
            r1 = r1 | r10
            int r0 = r0.m1791(r12)
        L10e:
            r8 = r1 | r0
            goto L130
        L111:
            r5 = r1 & r6
            if (r5 != 0) goto L119
            r11 = r1 & r9
            if (r11 != r10) goto L130
        L119:
            if (r5 == 0) goto L11f
            r1 = r1 & r9
            if (r1 == r10) goto L11f
            int r5 = r5 + r6
        L11f:
            if (r7 == 0) goto L126
            r1 = r2 & r9
            if (r1 == r10) goto L126
            int r7 = r7 + r6
        L126:
            int r1 = java.lang.Math.min(r5, r7)
            r1 = r1 | r10
            int r0 = r0.m1791(r12)
            goto L10e
        L130:
            if (r8 == r2) goto L135
            r21[r22] = r8
            return r4
        L135:
            return r3
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public static int m275(xhss.C1102 r17, java.lang.String r18, int r19) {
            r0 = r17
            r1 = r18
            char r2 = r18.charAt(r19)
            r4 = 70
            if (r2 == r4) goto Lbb
            r5 = 8388608(0x800000, float:1.1754944E-38)
            r6 = 76
            if (r2 == r6) goto La9
            r7 = 4194305(0x400001, float:5.877473E-39)
            r8 = 83
            if (r2 == r8) goto La8
            r9 = 86
            r10 = 0
            if (r2 == r9) goto La7
            r9 = 73
            if (r2 == r9) goto La8
            r11 = 4194308(0x400004, float:5.877477E-39)
            r12 = 74
            if (r2 == r12) goto La6
            r13 = 90
            if (r2 == r13) goto La8
            r14 = 4194307(0x400003, float:5.877476E-39)
            r15 = 91
            if (r2 == r15) goto L46
            switch(r2) {
                case 66: goto La8;
                case 67: goto La8;
                case 68: goto L45;
                default: goto L37;
            }
        L37:
            java.lang.String r0 = r18.substring(r19)
            java.lang.String r1 = "Invalid descriptor: "
            java.lang.String r0 = r1.concat(r0)
            xhss.C0532.m959(r0)
            return r10
        L45:
            return r14
        L46:
            int r2 = r19 + 1
            r16 = 4194306(0x400002, float:5.877475E-39)
        L4b:
            char r3 = r1.charAt(r2)
            if (r3 != r15) goto L54
            int r2 = r2 + 1
            goto L4b
        L54:
            char r3 = r1.charAt(r2)
            if (r3 == r4) goto L9e
            if (r3 == r6) goto L8b
            if (r3 == r8) goto L87
            if (r3 == r13) goto L83
            if (r3 == r9) goto L81
            if (r3 == r12) goto L7f
            switch(r3) {
                case 66: goto L7b;
                case 67: goto L77;
                case 68: goto L75;
                default: goto L67;
            }
        L67:
            java.lang.String r0 = r1.substring(r2)
            java.lang.String r1 = "Invalid descriptor fragment: "
            java.lang.String r0 = r1.concat(r0)
            xhss.C0532.m959(r0)
            return r10
        L75:
            r3 = r14
            goto La0
        L77:
            r3 = 4194315(0x40000b, float:5.877487E-39)
            goto La0
        L7b:
            r3 = 4194314(0x40000a, float:5.877486E-39)
            goto La0
        L7f:
            r3 = r11
            goto La0
        L81:
            r3 = r7
            goto La0
        L83:
            r3 = 4194313(0x400009, float:5.877484E-39)
            goto La0
        L87:
            r3 = 4194316(0x40000c, float:5.877489E-39)
            goto La0
        L8b:
            int r3 = r2 + 1
            int r4 = r1.length()
            int r4 = r4 + (-1)
            java.lang.String r1 = r1.substring(r3, r4)
            int r0 = r0.m1791(r1)
            r3 = r0 | r5
            goto La0
        L9e:
            r3 = r16
        La0:
            int r2 = r2 - r19
            int r0 = r2 << 26
            r0 = r0 | r3
            return r0
        La6:
            return r11
        La7:
            return r10
        La8:
            return r7
        La9:
            int r2 = r19 + 1
            int r3 = r1.length()
            int r3 = r3 + (-1)
            java.lang.String r1 = r1.substring(r2, r3)
            int r0 = r0.m1791(r1)
            r0 = r0 | r5
            return r0
        Lbb:
            r16 = 4194306(0x400002, float:5.877475E-39)
            return r16
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ */
    public void mo134(int r19, int r20, xhss.C0262 r21, xhss.C1102 r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = 4194309(0x400005, float:5.877479E-39)
            r6 = 4194306(0x400002, float:5.877475E-39)
            r8 = 4194305(0x400001, float:5.877473E-39)
            r9 = 4194307(0x400003, float:5.877476E-39)
            r10 = 4194308(0x400004, float:5.877477E-39)
            r11 = 4194304(0x400000, float:5.877472E-39)
            switch(r1) {
                case 0: goto L33d;
                case 1: goto L33a;
                case 2: goto L336;
                case 3: goto L336;
                case 4: goto L336;
                case 5: goto L336;
                case 6: goto L336;
                case 7: goto L336;
                case 8: goto L336;
                case 9: goto L32f;
                case 10: goto L32f;
                case 11: goto L32b;
                case 12: goto L32b;
                case 13: goto L32b;
                case 14: goto L324;
                case 15: goto L324;
                case 16: goto L336;
                case 17: goto L336;
                case 18: goto L2c8;
                default: goto L1e;
            }
        L1e:
            switch(r1) {
                case 21: goto L336;
                case 22: goto L32f;
                case 23: goto L32b;
                case 24: goto L324;
                case 25: goto L2c0;
                default: goto L21;
            }
        L21:
            r13 = 25165824(0x1800000, float:4.7019774E-38)
            r14 = 20971520(0x1400000, float:3.526483E-38)
            r15 = 62914560(0x3c00000, float:1.1284746E-36)
            r16 = 8388608(0x800000, float:1.1754944E-38)
            r7 = 2
            r17 = 1048576(0x100000, float:1.469368E-39)
            r12 = 1
            switch(r1) {
                case 46: goto L2b9;
                case 47: goto L2af;
                case 48: goto L2a8;
                case 49: goto L29e;
                case 50: goto L28d;
                case 51: goto L2b9;
                case 52: goto L2b9;
                case 53: goto L2b9;
                case 54: goto L269;
                case 55: goto L23d;
                case 56: goto L269;
                case 57: goto L23d;
                case 58: goto L269;
                default: goto L30;
            }
        L30:
            r5 = 3
            r13 = 91
            r14 = 4
            r15 = 0
            switch(r1) {
                case 79: goto L239;
                case 80: goto L235;
                case 81: goto L239;
                case 82: goto L235;
                case 83: goto L239;
                case 84: goto L239;
                case 85: goto L239;
                case 86: goto L239;
                case 87: goto L231;
                case 88: goto L22d;
                case 89: goto L222;
                case 90: goto L210;
                case 91: goto L1f7;
                case 92: goto L1e2;
                case 93: goto L1c6;
                case 94: goto L1a3;
                case 95: goto L194;
                case 96: goto L2b9;
                case 97: goto L18a;
                case 98: goto L2a8;
                case 99: goto L180;
                case 100: goto L2b9;
                case 101: goto L18a;
                case 102: goto L2a8;
                case 103: goto L180;
                case 104: goto L2b9;
                case 105: goto L18a;
                case 106: goto L2a8;
                case 107: goto L180;
                case 108: goto L2b9;
                case 109: goto L18a;
                case 110: goto L2a8;
                case 111: goto L180;
                case 112: goto L2b9;
                case 113: goto L18a;
                case 114: goto L2a8;
                case 115: goto L180;
                case 116: goto L33d;
                case 117: goto L33d;
                case 118: goto L33d;
                case 119: goto L33d;
                case 120: goto L2b9;
                case 121: goto L176;
                case 122: goto L2b9;
                case 123: goto L176;
                case 124: goto L2b9;
                case 125: goto L176;
                case 126: goto L2b9;
                case 127: goto L18a;
                case 128: goto L2b9;
                case 129: goto L18a;
                case 130: goto L2b9;
                case 131: goto L18a;
                case 132: goto L172;
                case 133: goto L168;
                case 134: goto L161;
                case 135: goto L157;
                case 136: goto L2b9;
                case 137: goto L2a8;
                case 138: goto L29e;
                case 139: goto L150;
                case 140: goto L168;
                case 141: goto L157;
                case 142: goto L2b9;
                case 143: goto L2af;
                case 144: goto L2a8;
                case 145: goto L33d;
                case 146: goto L33d;
                case 147: goto L33d;
                case 148: goto L149;
                case 149: goto L2b9;
                case 150: goto L2b9;
                case 151: goto L149;
                case 152: goto L149;
                case 153: goto L231;
                case 154: goto L231;
                case 155: goto L231;
                case 156: goto L231;
                case 157: goto L231;
                case 158: goto L231;
                case 159: goto L22d;
                case 160: goto L22d;
                case 161: goto L22d;
                case 162: goto L22d;
                case 163: goto L22d;
                case 164: goto L22d;
                case 165: goto L22d;
                case 166: goto L22d;
                case 167: goto L33d;
                case 168: goto L143;
                case 169: goto L143;
                case 170: goto L231;
                case 171: goto L231;
                case 172: goto L231;
                case 173: goto L22d;
                case 174: goto L231;
                case 175: goto L22d;
                case 176: goto L231;
                case 177: goto L33d;
                case 178: goto L13d;
                case 179: goto L137;
                case 180: goto L12e;
                case 181: goto L125;
                case 182: goto Ldf;
                case 183: goto Ldf;
                case 184: goto Ldf;
                case 185: goto Ldf;
                case 186: goto Ld4;
                case 187: goto Lc7;
                case 188: goto L83;
                case 189: goto L63;
                case 190: goto L150;
                case 191: goto L231;
                case 192: goto L4a;
                case 193: goto L150;
                case 194: goto L231;
                case 195: goto L231;
                default: goto L38;
            }
        L38:
            switch(r1) {
                case 197: goto L41;
                case 198: goto L231;
                case 199: goto L231;
                default: goto L3b;
            }
        L3b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L41:
            r0.m287(r2)
            java.lang.String r1 = r3.f964
            r0.m286(r4, r1)
            return
        L4a:
            java.lang.String r1 = r3.f964
            r0.m283()
            char r2 = r1.charAt(r15)
            if (r2 != r13) goto L59
            r0.m286(r4, r1)
            return
        L59:
            int r1 = r4.m1791(r1)
            r1 = r1 | r16
            r0.m282(r1)
            return
        L63:
            java.lang.String r1 = r3.f964
            r0.m283()
            char r2 = r1.charAt(r15)
            if (r2 != r13) goto L78
            java.lang.String r2 = "["
            java.lang.String r1 = r2.concat(r1)
            r0.m286(r4, r1)
            return
        L78:
            r2 = 75497472(0x4800000, float:3.0092655E-36)
            int r1 = r4.m1791(r1)
            r1 = r1 | r2
            r0.m282(r1)
            return
        L83:
            r0.m283()
            switch(r2) {
                case 4: goto Lc0;
                case 5: goto Lb9;
                case 6: goto Lb2;
                case 7: goto Lab;
                case 8: goto La4;
                case 9: goto L9d;
                case 10: goto L96;
                case 11: goto L8f;
                default: goto L89;
            }
        L89:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L8f:
            r1 = 71303172(0x4400004, float:2.2569499E-36)
            r0.m282(r1)
            return
        L96:
            r1 = 71303169(0x4400001, float:2.2569493E-36)
            r0.m282(r1)
            return
        L9d:
            r1 = 71303180(0x440000c, float:2.2569513E-36)
            r0.m282(r1)
            return
        La4:
            r1 = 71303178(0x440000a, float:2.256951E-36)
            r0.m282(r1)
            return
        Lab:
            r1 = 71303171(0x4400003, float:2.2569497E-36)
            r0.m282(r1)
            return
        Lb2:
            r1 = 71303170(0x4400002, float:2.2569495E-36)
            r0.m282(r1)
            return
        Lb9:
            r1 = 71303179(0x440000b, float:2.2569511E-36)
            r0.m282(r1)
            return
        Lc0:
            r1 = 71303177(0x4400009, float:2.2569508E-36)
            r0.m282(r1)
            return
        Lc7:
            java.lang.String r1 = r3.f964
            int r1 = r4.m1785(r1, r2)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r2
            r0.m282(r1)
            return
        Ld4:
            java.lang.String r1 = r3.f964
            r0.m280(r1)
            java.lang.String r1 = r3.f964
            r0.m286(r4, r1)
            return
        Ldf:
            java.lang.String r2 = r3.f964
            r0.m280(r2)
            r2 = 184(0xb8, float:2.58E-43)
            if (r1 == r2) goto L11f
            int r2 = r0.m283()
            r5 = 183(0xb7, float:2.56E-43)
            if (r1 != r5) goto L11f
            java.lang.String r1 = r3.f969
            char r1 = r1.charAt(r15)
            r5 = 60
            if (r1 != r5) goto L11f
            int[] r1 = r0.f474
            if (r1 != 0) goto L102
            int[] r1 = new int[r7]
            r0.f474 = r1
        L102:
            int r5 = r1.length
            int r6 = r0.f475
            if (r6 < r5) goto L117
            int r6 = r6 + r12
            int r1 = r5 * 2
            int r1 = java.lang.Math.max(r6, r1)
            int[] r1 = new int[r1]
            int[] r6 = r0.f474
            java.lang.System.arraycopy(r6, r15, r1, r15, r5)
            r0.f474 = r1
        L117:
            int r5 = r0.f475
            int r6 = r5 + 1
            r0.f475 = r6
            r1[r5] = r2
        L11f:
            java.lang.String r1 = r3.f964
            r0.m286(r4, r1)
            return
        L125:
            java.lang.String r1 = r3.f964
            r0.m280(r1)
            r0.m283()
            return
        L12e:
            r0.m287(r12)
            java.lang.String r1 = r3.f964
            r0.m286(r4, r1)
            return
        L137:
            java.lang.String r1 = r3.f964
            r0.m280(r1)
            return
        L13d:
            java.lang.String r1 = r3.f964
            r0.m286(r4, r1)
            return
        L143:
            java.lang.String r0 = "JSR/RET are not supported with computeFrames option"
            xhss.C0532.m959(r0)
            return
        L149:
            r0.m287(r14)
            r0.m282(r8)
            return
        L150:
            r0.m287(r12)
            r0.m282(r8)
            return
        L157:
            r0.m287(r12)
            r0.m282(r9)
            r0.m282(r11)
            return
        L161:
            r0.m287(r12)
            r0.m282(r6)
            return
        L168:
            r0.m287(r12)
            r0.m282(r10)
            r0.m282(r11)
            return
        L172:
            r0.m277(r2, r8)
            return
        L176:
            r0.m287(r5)
            r0.m282(r10)
            r0.m282(r11)
            return
        L180:
            r0.m287(r14)
            r0.m282(r9)
            r0.m282(r11)
            return
        L18a:
            r0.m287(r14)
            r0.m282(r10)
            r0.m282(r11)
            return
        L194:
            int r1 = r0.m283()
            int r2 = r0.m283()
            r0.m282(r1)
            r0.m282(r2)
            return
        L1a3:
            int r1 = r0.m283()
            int r2 = r0.m283()
            int r3 = r0.m283()
            int r4 = r0.m283()
            r0.m282(r2)
            r0.m282(r1)
            r0.m282(r4)
            r0.m282(r3)
            r0.m282(r2)
            r0.m282(r1)
            return
        L1c6:
            int r1 = r0.m283()
            int r2 = r0.m283()
            int r3 = r0.m283()
            r0.m282(r2)
            r0.m282(r1)
            r0.m282(r3)
            r0.m282(r2)
            r0.m282(r1)
            return
        L1e2:
            int r1 = r0.m283()
            int r2 = r0.m283()
            r0.m282(r2)
            r0.m282(r1)
            r0.m282(r2)
            r0.m282(r1)
            return
        L1f7:
            int r1 = r0.m283()
            int r2 = r0.m283()
            int r3 = r0.m283()
            r0.m282(r1)
            r0.m282(r3)
            r0.m282(r2)
            r0.m282(r1)
            return
        L210:
            int r1 = r0.m283()
            int r2 = r0.m283()
            r0.m282(r1)
            r0.m282(r2)
            r0.m282(r1)
            return
        L222:
            int r1 = r0.m283()
            r0.m282(r1)
            r0.m282(r1)
            return
        L22d:
            r0.m287(r7)
            return
        L231:
            r0.m287(r12)
            return
        L235:
            r0.m287(r14)
            return
        L239:
            r0.m287(r5)
            return
        L23d:
            r0.m287(r12)
            int r1 = r0.m283()
            r0.m277(r2, r1)
            int r1 = r2 + 1
            r0.m277(r1, r11)
            if (r2 <= 0) goto L33d
            int r1 = r2 + (-1)
            int r2 = r0.m284(r1)
            if (r2 == r10) goto L265
            if (r2 != r9) goto L259
            goto L265
        L259:
            r3 = r2 & r15
            if (r3 == r14) goto L25f
            if (r3 != r13) goto L33d
        L25f:
            r2 = r2 | r17
            r0.m277(r1, r2)
            return
        L265:
            r0.m277(r1, r11)
            return
        L269:
            int r1 = r0.m283()
            r0.m277(r2, r1)
            if (r2 <= 0) goto L33d
            int r1 = r2 + (-1)
            int r2 = r0.m284(r1)
            if (r2 == r10) goto L289
            if (r2 != r9) goto L27d
            goto L289
        L27d:
            r3 = r2 & r15
            if (r3 == r14) goto L283
            if (r3 != r13) goto L33d
        L283:
            r2 = r2 | r17
            r0.m277(r1, r2)
            return
        L289:
            r0.m277(r1, r11)
            return
        L28d:
            r0.m287(r12)
            int r1 = r0.m283()
            if (r1 != r5) goto L297
            goto L29a
        L297:
            r2 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            int r1 = r1 + r2
        L29a:
            r0.m282(r1)
            return
        L29e:
            r0.m287(r7)
            r0.m282(r9)
            r0.m282(r11)
            return
        L2a8:
            r0.m287(r7)
            r0.m282(r6)
            return
        L2af:
            r0.m287(r7)
            r0.m282(r10)
            r0.m282(r11)
            return
        L2b9:
            r0.m287(r7)
            r0.m282(r8)
            return
        L2c0:
            int r1 = r0.m284(r2)
            r0.m282(r1)
            return
        L2c8:
            r16 = 8388608(0x800000, float:1.1754944E-38)
            int r1 = r3.f962
            switch(r1) {
                case 3: goto L320;
                case 4: goto L31c;
                case 5: goto L315;
                case 6: goto L30e;
                case 7: goto L302;
                case 8: goto L2f6;
                default: goto L2cf;
            }
        L2cf:
            switch(r1) {
                case 15: goto L2ea;
                case 16: goto L2de;
                case 17: goto L2d8;
                default: goto L2d2;
            }
        L2d2:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L2d8:
            java.lang.String r1 = r3.f964
            r0.m286(r4, r1)
            return
        L2de:
            java.lang.String r1 = "java/lang/invoke/MethodType"
            int r1 = r4.m1791(r1)
            r1 = r1 | r16
            r0.m282(r1)
            return
        L2ea:
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            int r1 = r4.m1791(r1)
            r1 = r1 | r16
            r0.m282(r1)
            return
        L2f6:
            java.lang.String r1 = "java/lang/String"
            int r1 = r4.m1791(r1)
            r1 = r1 | r16
            r0.m282(r1)
            return
        L302:
            java.lang.String r1 = "java/lang/Class"
            int r1 = r4.m1791(r1)
            r1 = r1 | r16
            r0.m282(r1)
            return
        L30e:
            r0.m282(r9)
            r0.m282(r11)
            return
        L315:
            r0.m282(r10)
            r0.m282(r11)
            return
        L31c:
            r0.m282(r6)
            return
        L320:
            r0.m282(r8)
            return
        L324:
            r0.m282(r9)
            r0.m282(r11)
            return
        L32b:
            r0.m282(r6)
            return
        L32f:
            r0.m282(r10)
            r0.m282(r11)
            return
        L336:
            r0.m282(r8)
            return
        L33a:
            r0.m282(r5)
        L33d:
            return
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final void m276(xhss.C1102 r10, int r11, java.lang.String r12, int r13) {
            r9 = this;
            int[] r0 = new int[r13]
            r9.f470 = r0
            r1 = 0
            int[] r2 = new int[r1]
            r9.f471 = r2
            r2 = r11 & 8
            r3 = 1
            if (r2 != 0) goto L26
            r2 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 & r2
            if (r11 != 0) goto L20
            java.lang.String r11 = r10.f3538
            int r11 = r10.m1791(r11)
            r2 = 8388608(0x800000, float:1.1754944E-38)
            r11 = r11 | r2
            r0[r1] = r11
        L1e:
            r11 = r3
            goto L27
        L20:
            r11 = 4194310(0x400006, float:5.87748E-39)
            r0[r1] = r11
            goto L1e
        L26:
            r11 = r1
        L27:
            int r0 = xhss.C0843.m1421(r12)
            xhss.ᲀᛲᲀᲈ[] r2 = new xhss.C0843[r0]
            r5 = r1
            r4 = r3
        L2f:
            char r6 = r12.charAt(r4)
            r7 = 41
            if (r6 == r7) goto L63
            r6 = r4
        L38:
            char r7 = r12.charAt(r6)
            r8 = 91
            if (r7 != r8) goto L43
            int r6 = r6 + 1
            goto L38
        L43:
            int r7 = r6 + 1
            char r6 = r12.charAt(r6)
            r8 = 76
            if (r6 != r8) goto L58
            r6 = 59
            int r6 = r12.indexOf(r6, r7)
            int r6 = r6 + r3
            int r7 = java.lang.Math.max(r7, r6)
        L58:
            int r6 = r5 + 1
            xhss.ᲀᛲᲀᲈ r4 = xhss.C0843.m1425(r12, r4, r7)
            r2[r5] = r4
            r5 = r6
            r4 = r7
            goto L2f
        L63:
            r12 = r1
        L64:
            r3 = 4194304(0x400000, float:5.877472E-39)
            if (r12 >= r0) goto L8c
            r4 = r2[r12]
            java.lang.String r4 = r4.m1428()
            int r4 = m275(r10, r4, r1)
            int[] r5 = r9.f470
            int r6 = r11 + 1
            r5[r11] = r4
            r7 = 4194308(0x400004, float:5.877477E-39)
            if (r4 == r7) goto L85
            r7 = 4194307(0x400003, float:5.877476E-39)
            if (r4 != r7) goto L83
            goto L85
        L83:
            r11 = r6
            goto L89
        L85:
            int r11 = r11 + 2
            r5[r6] = r3
        L89:
            int r12 = r12 + 1
            goto L64
        L8c:
            if (r11 >= r13) goto L96
            int[] r10 = r9.f470
            int r12 = r11 + 1
            r10[r11] = r3
            r11 = r12
            goto L8c
        L96:
            return
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final void m277(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.f477
            if (r0 != 0) goto La
            r0 = 10
            int[] r0 = new int[r0]
            r4.f477 = r0
        La:
            int r1 = r0.length
            if (r5 < r1) goto L1f
            int r0 = r5 + 1
            int r2 = r1 * 2
            int r0 = java.lang.Math.max(r0, r2)
            int[] r0 = new int[r0]
            int[] r2 = r4.f477
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r1)
            r4.f477 = r0
        L1f:
            r0[r5] = r6
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int m278(int r9, int r10) {
            r8 = this;
            r0 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r0 = r0 & r9
            r1 = 62914560(0x3c00000, float:1.1284746E-36)
            r1 = r1 & r9
            r2 = 20971520(0x1400000, float:3.526483E-38)
            r3 = 4194304(0x400000, float:5.877472E-39)
            r4 = 4194307(0x400003, float:5.877476E-39)
            r5 = 4194308(0x400004, float:5.877477E-39)
            r6 = 1048576(0x100000, float:1.469368E-39)
            r7 = 1048575(0xfffff, float:1.469367E-39)
            if (r1 != r2) goto L28
            int[] r8 = r8.f470
            r10 = r9 & r7
            r8 = r8[r10]
            int r0 = r0 + r8
            r8 = r9 & r6
            if (r8 == 0) goto L27
            if (r0 == r5) goto L26
            if (r0 != r4) goto L27
        L26:
            return r3
        L27:
            return r0
        L28:
            r2 = 25165824(0x1800000, float:4.7019774E-38)
            if (r1 != r2) goto L3e
            int[] r8 = r8.f471
            r1 = r9 & r7
            int r10 = r10 - r1
            r8 = r8[r10]
            int r0 = r0 + r8
            r8 = r9 & r6
            if (r8 == 0) goto L3d
            if (r0 == r5) goto L3c
            if (r0 != r4) goto L3d
        L3c:
            return r3
        L3d:
            return r0
        L3e:
            return r9
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m279(xhss.C0962 r14) {
            r13 = this;
            int[] r0 = r13.f470
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = r3
        L6:
            int r5 = r0.length
            r6 = 2
            r7 = 4194307(0x400003, float:5.877476E-39)
            r8 = 4194308(0x400004, float:5.877477E-39)
            r9 = 1
            if (r2 >= r5) goto L26
            r5 = r0[r2]
            if (r5 == r8) goto L19
            if (r5 != r7) goto L18
            goto L19
        L18:
            r6 = r9
        L19:
            int r2 = r2 + r6
            r6 = 4194304(0x400000, float:5.877472E-39)
            if (r5 != r6) goto L21
            int r4 = r4 + 1
            goto L6
        L21:
            int r4 = r4 + 1
            int r3 = r3 + r4
            r4 = r1
            goto L6
        L26:
            int[] r2 = r13.f471
            r4 = r1
            r5 = r4
        L2a:
            int r10 = r2.length
            if (r4 >= r10) goto L3b
            r10 = r2[r4]
            if (r10 == r8) goto L36
            if (r10 != r7) goto L34
            goto L36
        L34:
            r10 = r9
            goto L37
        L36:
            r10 = r6
        L37:
            int r4 = r4 + r10
            int r5 = r5 + 1
            goto L2a
        L3b:
            xhss.ᲁᲁᛱᲀ r13 = r13.f473
            int r13 = r13.f3205
            r14.m1591(r13, r3, r5)
            r13 = 3
            r4 = r1
        L44:
            int r10 = r3 + (-1)
            if (r3 <= 0) goto L5c
            r3 = r0[r4]
            if (r3 == r8) goto L51
            if (r3 != r7) goto L4f
            goto L51
        L4f:
            r11 = r9
            goto L52
        L51:
            r11 = r6
        L52:
            int r4 = r4 + r11
            int r11 = r13 + 1
            int[] r12 = r14.f3125
            r12[r13] = r3
            r3 = r10
            r13 = r11
            goto L44
        L5c:
            int r0 = r5 + (-1)
            if (r5 <= 0) goto L74
            r3 = r2[r1]
            if (r3 == r8) goto L69
            if (r3 != r7) goto L67
            goto L69
        L67:
            r4 = r9
            goto L6a
        L69:
            r4 = r6
        L6a:
            int r1 = r1 + r4
            int r4 = r13 + 1
            int[] r5 = r14.f3125
            r5[r13] = r3
            r5 = r0
            r13 = r4
            goto L5c
        L74:
            r14.m1595()
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final void m280(java.lang.String r5) {
            r4 = this;
            r0 = 0
            char r0 = r5.charAt(r0)
            r1 = 40
            r2 = 1
            r3 = 2
            if (r0 != r1) goto L15
            int r5 = xhss.C0843.m1422(r5)
            int r5 = r5 >> r3
            int r5 = r5 - r2
            r4.m287(r5)
            return
        L15:
            r5 = 74
            if (r0 == r5) goto L22
            r5 = 68
            if (r0 != r5) goto L1e
            goto L22
        L1e:
            r4.m287(r2)
            return
        L22:
            r4.m287(r3)
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final boolean m281(xhss.C1102 r9, xhss.C0103 r10, int r11) {
            r8 = this;
            int[] r0 = r8.f470
            int r0 = r0.length
            int[] r1 = r8.f471
            int r1 = r1.length
            int[] r2 = r10.f470
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L12
            int[] r2 = new int[r0]
            r10.f470 = r2
            r2 = r3
            goto L13
        L12:
            r2 = r4
        L13:
            r5 = r4
        L14:
            if (r5 >= r0) goto L41
            int[] r6 = r8.f477
            if (r6 == 0) goto L2b
            int r7 = r6.length
            if (r5 >= r7) goto L2b
            r6 = r6[r5]
            if (r6 != 0) goto L26
            int[] r6 = r8.f470
            r6 = r6[r5]
            goto L2f
        L26:
            int r6 = r8.m278(r6, r1)
            goto L2f
        L2b:
            int[] r6 = r8.f470
            r6 = r6[r5]
        L2f:
            int[] r7 = r8.f474
            if (r7 == 0) goto L37
            int r6 = r8.m285(r9, r6)
        L37:
            int[] r7 = r10.f470
            boolean r6 = m274(r9, r6, r7, r5)
            r2 = r2 | r6
            int r5 = r5 + 1
            goto L14
        L41:
            if (r11 <= 0) goto L64
            r1 = r4
        L44:
            if (r1 >= r0) goto L54
            int[] r5 = r8.f470
            r5 = r5[r1]
            int[] r6 = r10.f470
            boolean r5 = m274(r9, r5, r6, r1)
            r2 = r2 | r5
            int r1 = r1 + 1
            goto L44
        L54:
            int[] r8 = r10.f471
            if (r8 != 0) goto L5d
            int[] r8 = new int[r3]
            r10.f471 = r8
            goto L5e
        L5d:
            r3 = r2
        L5e:
            boolean r8 = m274(r9, r11, r8, r4)
            r8 = r8 | r3
            return r8
        L64:
            int[] r11 = r8.f471
            int r11 = r11.length
            short r0 = r8.f478
            int r11 = r11 + r0
            int[] r0 = r10.f471
            if (r0 != 0) goto L76
            short r0 = r8.f476
            int r0 = r0 + r11
            int[] r0 = new int[r0]
            r10.f471 = r0
            goto L77
        L76:
            r3 = r2
        L77:
            r0 = r4
        L78:
            if (r0 >= r11) goto L90
            int[] r2 = r8.f471
            r2 = r2[r0]
            int[] r5 = r8.f474
            if (r5 == 0) goto L86
            int r2 = r8.m285(r9, r2)
        L86:
            int[] r5 = r10.f471
            boolean r2 = m274(r9, r2, r5, r0)
            r3 = r3 | r2
            int r0 = r0 + 1
            goto L78
        L90:
            short r0 = r8.f476
            if (r4 >= r0) goto Lb0
            int[] r0 = r8.f472
            r0 = r0[r4]
            int r0 = r8.m278(r0, r1)
            int[] r2 = r8.f474
            if (r2 == 0) goto La4
            int r0 = r8.m285(r9, r0)
        La4:
            int[] r2 = r10.f471
            int r5 = r11 + r4
            boolean r0 = m274(r9, r0, r2, r5)
            r3 = r3 | r0
            int r4 = r4 + 1
            goto L90
        Lb0:
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final void m282(int r5) {
            r4 = this;
            int[] r0 = r4.f472
            if (r0 != 0) goto La
            r0 = 10
            int[] r0 = new int[r0]
            r4.f472 = r0
        La:
            int r1 = r0.length
            short r2 = r4.f476
            if (r2 < r1) goto L21
            int r2 = r2 + 1
            int r0 = r1 * 2
            int r0 = java.lang.Math.max(r2, r0)
            int[] r0 = new int[r0]
            int[] r2 = r4.f472
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r1)
            r4.f472 = r0
        L21:
            short r1 = r4.f476
            int r2 = r1 + 1
            short r2 = (short) r2
            r4.f476 = r2
            r0[r1] = r5
            short r5 = r4.f478
            int r5 = r5 + r2
            short r5 = (short) r5
            xhss.ᲁᲁᛱᲀ r4 = r4.f473
            short r0 = r4.f3201
            if (r5 <= r0) goto L36
            r4.f3201 = r5
        L36:
            return
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final int m283() {
            r2 = this;
            short r0 = r2.f476
            if (r0 <= 0) goto Le
            int[] r1 = r2.f472
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r2.f476 = r0
            r2 = r1[r0]
            return r2
        Le:
            short r0 = r2.f478
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r2.f478 = r0
            int r2 = -r0
            r0 = 25165824(0x1800000, float:4.7019774E-38)
            r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final int m284(int r3) {
            r2 = this;
            int[] r2 = r2.f477
            r0 = 20971520(0x1400000, float:3.526483E-38)
            if (r2 == 0) goto L13
            int r1 = r2.length
            if (r3 < r1) goto La
            goto L13
        La:
            r1 = r2[r3]
            if (r1 != 0) goto L12
            r0 = r0 | r3
            r2[r3] = r0
            return r0
        L12:
            return r1
        L13:
            r2 = r3 | r0
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int m285(xhss.C1102 r9, int r10) {
            r8 = this;
            r0 = 4194310(0x400006, float:5.87748E-39)
            if (r10 == r0) goto L10
            r1 = -4194304(0xffffffffffc00000, float:NaN)
            r1 = r1 & r10
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == r2) goto L10
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            if (r1 != r2) goto L56
        L10:
            r1 = 0
        L11:
            int r2 = r8.f475
            if (r1 >= r2) goto L56
            int[] r2 = r8.f474
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L2e
            int[] r2 = r8.f470
            r2 = r2[r6]
        L2c:
            int r2 = r2 + r3
            goto L39
        L2e:
            r7 = 25165824(0x1800000, float:4.7019774E-38)
            if (r4 != r7) goto L39
            int[] r2 = r8.f471
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L2c
        L39:
            if (r10 != r2) goto L53
            r8 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L47
            java.lang.String r10 = r9.f3538
            int r9 = r9.m1791(r10)
        L45:
            r8 = r8 | r9
            return r8
        L47:
            r10 = r10 & r5
            xhss.ᛳᛴᛶᛷ[] r0 = r9.f3550
            r10 = r0[r10]
            java.lang.String r10 = r10.f964
            int r9 = r9.m1791(r10)
            goto L45
        L53:
            int r1 = r1 + 1
            goto L11
        L56:
            return r10
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final void m286(xhss.C1102 r5, java.lang.String r6) {
            r4 = this;
            r0 = 0
            char r1 = r6.charAt(r0)
            r2 = 40
            if (r1 != r2) goto L37
            r0 = 1
            r1 = r0
        Lb:
            char r2 = r6.charAt(r1)
            r3 = 41
            if (r2 == r3) goto L36
        L13:
            char r2 = r6.charAt(r1)
            r3 = 91
            if (r2 != r3) goto L1e
            int r1 = r1 + 1
            goto L13
        L1e:
            int r2 = r1 + 1
            char r1 = r6.charAt(r1)
            r3 = 76
            if (r1 != r3) goto L34
            r1 = 59
            int r1 = r6.indexOf(r1, r2)
            int r1 = r1 + r0
            int r1 = java.lang.Math.max(r2, r1)
            goto Lb
        L34:
            r1 = r2
            goto Lb
        L36:
            int r0 = r0 + r1
        L37:
            int r5 = m275(r5, r6, r0)
            if (r5 == 0) goto L4f
            r4.m282(r5)
            r6 = 4194308(0x400004, float:5.877477E-39)
            if (r5 == r6) goto L4a
            r6 = 4194307(0x400003, float:5.877476E-39)
            if (r5 != r6) goto L4f
        L4a:
            r5 = 4194304(0x400000, float:5.877472E-39)
            r4.m282(r5)
        L4f:
            return
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final void m287(int r3) {
            r2 = this;
            short r0 = r2.f476
            if (r0 < r3) goto L9
            int r0 = r0 - r3
            short r3 = (short) r0
            r2.f476 = r3
            return
        L9:
            short r1 = r2.f478
            int r3 = r3 - r0
            int r1 = r1 - r3
            short r3 = (short) r1
            r2.f478 = r3
            r3 = 0
            r2.f476 = r3
            return
    }
}
