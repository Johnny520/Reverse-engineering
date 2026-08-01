package defpackage;

/* JADX INFO: renamed from: ᛸᛴᛱᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1468 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f6498;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int[] f6499;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int[] f6500;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int[] f6501;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int[] f6502;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public defpackage.C1063 f6503;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int[] f6504;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public short f6505;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public short f6506;

    public C1468(defpackage.C1063 r1) {
            r0 = this;
            r0.<init>()
            r0.f6503 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public static boolean m2663(defpackage.C0109 r19, int r20, int[] r21, int r22) {
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
            ᛷᛲᲁᲀ r8 = r0.m613(r7)
        L77:
            if (r8 == 0) goto L8e
            int r10 = r8.f5530
            if (r10 != r9) goto L8b
            int r10 = r8.f5524
            if (r10 != r7) goto L8b
            long r10 = r8.f5531
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 != 0) goto L8b
            int r0 = r8.f5532
            goto Lf6
        L8b:
            ᛷᛲᲁᲀ r8 = r8.f5525
            goto L77
        L8e:
            ᛷᛲᲁᲀ[] r8 = r0.f956
            r1 = r8[r1]
            java.lang.String r1 = r1.f5526
            r6 = r8[r6]
            java.lang.String r6 = r6.f5526
            java.lang.Class<ᛳᲇᲇᲇ> r8 = defpackage.C0581.class
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
            int r1 = r0.m603(r12)
            ᛷᛲᲁᲀ r13 = new ᛷᛲᲁᲀ
            int r14 = r0.f964
            r15 = 131(0x83, float:1.84E-43)
            r18 = r7
            r13.<init>(r14, r15, r16, r18)
            r0.m606(r13)
            r13.f5532 = r1
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
            int r0 = r0.m603(r12)
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
            int r0 = r0.m603(r12)
            goto L10e
        L130:
            if (r8 == r2) goto L135
            r21[r22] = r8
            return r4
        L135:
            return r3
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static int m2664(defpackage.C0109 r17, java.lang.String r18, int r19) {
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
            defpackage.C2264.m3684(r0)
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
            defpackage.C2264.m3684(r0)
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
            int r0 = r0.m603(r1)
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
            int r0 = r0.m603(r1)
            r0 = r0 | r5
            return r0
        Lbb:
            r16 = 4194306(0x400002, float:5.877475E-39)
            return r16
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static int m2665(defpackage.C0109 r10, java.lang.Object r11) {
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
            java.lang.String r11 = defpackage.AbstractC0225.m817(r0, r11, r1)
            goto L47
        L43:
            java.lang.String r11 = r11.substring(r2, r3)
        L47:
            int r10 = m2664(r10, r11, r2)
            return r10
        L4c:
            ᛶᛴᲀᲇ r11 = (defpackage.C1063) r11
            short r0 = r11.f4709
            r0 = r0 & 4
            if (r0 == 0) goto L5f
            java.lang.String r0 = ""
            int r11 = r11.f4707
            int r10 = r10.m608(r11, r0)
            r11 = 12582912(0xc00000, float:1.7632415E-38)
            goto Lc
        L5f:
            ᛶᛸᛶᛲ[] r0 = r10.f965
            if (r0 != 0) goto L6d
            r0 = 16
            ᛶᛸᛶᛲ[] r3 = new defpackage.C1126[r0]
            r10.f965 = r3
            ᛶᛸᛶᛲ[] r0 = new defpackage.C1126[r0]
            r10.f960 = r0
        L6d:
            int r0 = java.lang.System.identityHashCode(r11)
            ᛶᛸᛶᛲ[] r3 = r10.f965
            int r4 = r3.length
            int r4 = r0 % r4
            r3 = r3[r4]
        L78:
            if (r3 == 0) goto L85
            java.lang.Object r4 = r3.f5014
            ᛶᛴᲀᲇ r4 = (defpackage.C1063) r4
            if (r4 == r11) goto L85
            java.lang.Object r3 = r3.f5013
            ᛶᛸᛶᛲ r3 = (defpackage.C1126) r3
            goto L78
        L85:
            if (r3 == 0) goto L88
            goto Le7
        L88:
            int r3 = r10.f957
            ᛶᛸᛶᛲ[] r4 = r10.f965
            int r5 = r4.length
            int r5 = r5 * 3
            int r5 = r5 / 4
            if (r3 <= r5) goto Lbc
            int r3 = r4.length
            int r4 = r3 * 2
            int r4 = r4 + r1
            ᛶᛸᛶᛲ[] r5 = new defpackage.C1126[r4]
            int r3 = r3 - r1
        L9a:
            if (r3 < 0) goto Lba
            ᛶᛸᛶᛲ[] r1 = r10.f965
            r1 = r1[r3]
        La0:
            if (r1 == 0) goto Lb7
            java.lang.Object r6 = r1.f5014
            ᛶᛴᲀᲇ r6 = (defpackage.C1063) r6
            int r6 = java.lang.System.identityHashCode(r6)
            int r6 = r6 % r4
            java.lang.Object r7 = r1.f5013
            ᛶᛸᛶᛲ r7 = (defpackage.C1126) r7
            r8 = r5[r6]
            r1.f5013 = r8
            r5[r6] = r1
            r1 = r7
            goto La0
        Lb7:
            int r3 = r3 + (-1)
            goto L9a
        Lba:
            r10.f965 = r5
        Lbc:
            int r1 = r10.f957
            ᛶᛸᛶᛲ[] r3 = r10.f960
            int r4 = r3.length
            if (r1 != r4) goto Lcf
            int r1 = r3.length
            int r1 = r1 * 2
            ᛶᛸᛶᛲ[] r1 = new defpackage.C1126[r1]
            int r4 = r3.length
            java.lang.System.arraycopy(r3, r2, r1, r2, r4)
            r10.f960 = r1
            r3 = r1
        Lcf:
            ᛶᛸᛶᛲ r1 = new ᛶᛸᛶᛲ
            int r2 = r10.f957
            r1.<init>(r2, r11)
            ᛶᛸᛶᛲ[] r11 = r10.f965
            int r4 = r11.length
            int r0 = r0 % r4
            r4 = r11[r0]
            r1.f5013 = r4
            r11[r0] = r1
            int r11 = r2 + 1
            r10.f957 = r11
            r3[r2] = r1
            r3 = r1
        Le7:
            int r11 = r3.f5016
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1 = 130(0x82, float:1.82E-43)
            int r2 = r1 + r11
            r9 = r2 & r0
            ᛷᛲᲁᲀ r0 = r10.m613(r9)
        Lf6:
            java.lang.String r6 = ""
            if (r0 == 0) goto L117
            int r2 = r0.f5530
            if (r2 != r1) goto L114
            int r2 = r0.f5524
            if (r2 != r9) goto L114
            long r2 = r0.f5531
            long r4 = (long) r11
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L114
            java.lang.String r2 = r0.f5526
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L114
            int r10 = r0.f5529
            goto L125
        L114:
            ᛷᛲᲁᲀ r0 = r0.f5525
            goto Lf6
        L117:
            ᛷᛲᲁᲀ r3 = new ᛷᛲᲁᲀ
            int r4 = r10.f964
            r5 = 130(0x82, float:1.82E-43)
            long r7 = (long) r11
            r3.<init>(r4, r5, r6, r7, r9)
            int r10 = r10.m604(r3)
        L125:
            r11 = 16777216(0x1000000, float:2.3509887E-38)
            goto Lc
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final void m2666(int r3) {
            r2 = this;
            short r0 = r2.f6506
            if (r0 < r3) goto L9
            int r0 = r0 - r3
            short r3 = (short) r0
            r2.f6506 = r3
            return
        L9:
            short r1 = r2.f6505
            int r3 = r3 - r0
            int r1 = r1 - r3
            short r3 = (short) r1
            r2.f6505 = r3
            r3 = 0
            r2.f6506 = r3
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m2667(java.lang.String r5) {
            r4 = this;
            r0 = 0
            char r0 = r5.charAt(r0)
            r1 = 40
            r2 = 1
            r3 = 2
            if (r0 != r1) goto L15
            int r5 = defpackage.C2118.m3541(r5)
            int r5 = r5 >> r3
            int r5 = r5 - r2
            r4.m2666(r5)
            return
        L15:
            r5 = 74
            if (r0 == r5) goto L22
            r5 = 68
            if (r0 != r5) goto L1e
            goto L22
        L1e:
            r4.m2666(r2)
            return
        L22:
            r4.m2666(r3)
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean m2668(defpackage.C0109 r9, defpackage.C1468 r10, int r11) {
            r8 = this;
            int[] r0 = r8.f6504
            int r0 = r0.length
            int[] r1 = r8.f6502
            int r1 = r1.length
            int[] r2 = r10.f6504
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L12
            int[] r2 = new int[r0]
            r10.f6504 = r2
            r2 = r3
            goto L13
        L12:
            r2 = r4
        L13:
            r5 = r4
        L14:
            if (r5 >= r0) goto L41
            int[] r6 = r8.f6501
            if (r6 == 0) goto L2b
            int r7 = r6.length
            if (r5 >= r7) goto L2b
            r6 = r6[r5]
            if (r6 != 0) goto L26
            int[] r6 = r8.f6504
            r6 = r6[r5]
            goto L2f
        L26:
            int r6 = r8.m2670(r6, r1)
            goto L2f
        L2b:
            int[] r6 = r8.f6504
            r6 = r6[r5]
        L2f:
            int[] r7 = r8.f6499
            if (r7 == 0) goto L37
            int r6 = r8.m2676(r9, r6)
        L37:
            int[] r7 = r10.f6504
            boolean r6 = m2663(r9, r6, r7, r5)
            r2 = r2 | r6
            int r5 = r5 + 1
            goto L14
        L41:
            if (r11 <= 0) goto L64
            r1 = r4
        L44:
            if (r1 >= r0) goto L54
            int[] r5 = r8.f6504
            r5 = r5[r1]
            int[] r6 = r10.f6504
            boolean r5 = m2663(r9, r5, r6, r1)
            r2 = r2 | r5
            int r1 = r1 + 1
            goto L44
        L54:
            int[] r8 = r10.f6502
            if (r8 != 0) goto L5d
            int[] r8 = new int[r3]
            r10.f6502 = r8
            goto L5e
        L5d:
            r3 = r2
        L5e:
            boolean r8 = m2663(r9, r11, r8, r4)
            r8 = r8 | r3
            return r8
        L64:
            int[] r11 = r8.f6502
            int r11 = r11.length
            short r0 = r8.f6505
            int r11 = r11 + r0
            int[] r0 = r10.f6502
            if (r0 != 0) goto L76
            short r0 = r8.f6506
            int r0 = r0 + r11
            int[] r0 = new int[r0]
            r10.f6502 = r0
            goto L77
        L76:
            r3 = r2
        L77:
            r0 = r4
        L78:
            if (r0 >= r11) goto L90
            int[] r2 = r8.f6502
            r2 = r2[r0]
            int[] r5 = r8.f6499
            if (r5 == 0) goto L86
            int r2 = r8.m2676(r9, r2)
        L86:
            int[] r5 = r10.f6502
            boolean r2 = m2663(r9, r2, r5, r0)
            r3 = r3 | r2
            int r0 = r0 + 1
            goto L78
        L90:
            short r0 = r8.f6506
            if (r4 >= r0) goto Lb0
            int[] r0 = r8.f6500
            r0 = r0[r4]
            int r0 = r8.m2670(r0, r1)
            int[] r2 = r8.f6499
            if (r2 == 0) goto La4
            int r0 = r8.m2676(r9, r0)
        La4:
            int[] r2 = r10.f6502
            int r5 = r11 + r4
            boolean r0 = m2663(r9, r0, r2, r5)
            r3 = r3 | r0
            int r4 = r4 + 1
            goto L90
        Lb0:
            return r3
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final void m2669(defpackage.C0109 r10, int r11, java.lang.String r12, int r13) {
            r9 = this;
            int[] r0 = new int[r13]
            r9.f6504 = r0
            r1 = 0
            int[] r2 = new int[r1]
            r9.f6502 = r2
            r2 = r11 & 8
            r3 = 1
            if (r2 != 0) goto L26
            r2 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 & r2
            if (r11 != 0) goto L20
            java.lang.String r11 = r10.f962
            int r11 = r10.m603(r11)
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
            int r0 = defpackage.C2118.m3543(r12)
            ᲇᲀᛴᲁ[] r2 = new defpackage.C2118[r0]
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
            ᲇᲀᛴᲁ r4 = defpackage.C2118.m3539(r12, r4, r7)
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
            java.lang.String r4 = r4.m3546()
            int r4 = m2664(r10, r4, r1)
            int[] r5 = r9.f6504
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
            int[] r10 = r9.f6504
            int r12 = r11 + 1
            r10[r11] = r3
            r11 = r12
            goto L8c
        L96:
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int m2670(int r9, int r10) {
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
            int[] r8 = r8.f6504
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
            int[] r8 = r8.f6502
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

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final void m2671(int r5) {
            r4 = this;
            int[] r0 = r4.f6500
            if (r0 != 0) goto La
            r0 = 10
            int[] r0 = new int[r0]
            r4.f6500 = r0
        La:
            int r1 = r0.length
            short r2 = r4.f6506
            if (r2 < r1) goto L21
            int r2 = r2 + 1
            int r0 = r1 * 2
            int r0 = java.lang.Math.max(r2, r0)
            int[] r0 = new int[r0]
            int[] r2 = r4.f6500
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r1)
            r4.f6500 = r0
        L21:
            short r1 = r4.f6506
            int r2 = r1 + 1
            short r2 = (short) r2
            r4.f6506 = r2
            r0[r1] = r5
            short r5 = r4.f6505
            int r5 = r5 + r2
            short r5 = (short) r5
            ᛶᛴᲀᲇ r4 = r4.f6503
            short r0 = r4.f4701
            if (r5 <= r0) goto L36
            r4.f4701 = r5
        L36:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m2672(defpackage.C1621 r14) {
            r13 = this;
            int[] r0 = r13.f6504
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
            int[] r2 = r13.f6502
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
            ᛶᛴᲀᲇ r13 = r13.f6503
            int r13 = r13.f4707
            r14.m2909(r13, r3, r5)
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
            int[] r12 = r14.f7168
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
            int[] r5 = r14.f7168
            r5[r13] = r3
            r5 = r0
            r13 = r4
            goto L5c
        L74:
            r14.m2931()
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final int m2673() {
            r2 = this;
            short r0 = r2.f6506
            if (r0 <= 0) goto Le
            int[] r1 = r2.f6500
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r2.f6506 = r0
            r2 = r1[r0]
            return r2
        Le:
            short r0 = r2.f6505
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r2.f6505 = r0
            int r2 = -r0
            r0 = 25165824(0x1800000, float:4.7019774E-38)
            r2 = r2 | r0
            return r2
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final void m2674(defpackage.C0109 r5, java.lang.String r6) {
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
            int r5 = m2664(r5, r6, r0)
            if (r5 == 0) goto L4f
            r4.m2671(r5)
            r6 = 4194308(0x400004, float:5.877477E-39)
            if (r5 == r6) goto L4a
            r6 = 4194307(0x400003, float:5.877476E-39)
            if (r5 != r6) goto L4f
        L4a:
            r5 = 4194304(0x400000, float:5.877472E-39)
            r4.m2671(r5)
        L4f:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void mo2675(int r19, int r20, defpackage.C1231 r21, defpackage.C0109 r22) {
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
                case 0: goto L339;
                case 1: goto L336;
                case 2: goto L332;
                case 3: goto L332;
                case 4: goto L332;
                case 5: goto L332;
                case 6: goto L332;
                case 7: goto L332;
                case 8: goto L332;
                case 9: goto L32b;
                case 10: goto L32b;
                case 11: goto L327;
                case 12: goto L327;
                case 13: goto L327;
                case 14: goto L320;
                case 15: goto L320;
                case 16: goto L332;
                case 17: goto L332;
                case 18: goto L2c4;
                default: goto L1e;
            }
        L1e:
            switch(r1) {
                case 21: goto L332;
                case 22: goto L32b;
                case 23: goto L327;
                case 24: goto L320;
                case 25: goto L2bc;
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
                case 46: goto L2b5;
                case 47: goto L2ab;
                case 48: goto L2a4;
                case 49: goto L29a;
                case 50: goto L289;
                case 51: goto L2b5;
                case 52: goto L2b5;
                case 53: goto L2b5;
                case 54: goto L265;
                case 55: goto L239;
                case 56: goto L265;
                case 57: goto L239;
                case 58: goto L265;
                default: goto L30;
            }
        L30:
            r5 = 3
            r13 = 91
            r14 = 4
            r15 = 0
            switch(r1) {
                case 79: goto L235;
                case 80: goto L231;
                case 81: goto L235;
                case 82: goto L231;
                case 83: goto L235;
                case 84: goto L235;
                case 85: goto L235;
                case 86: goto L235;
                case 87: goto L22d;
                case 88: goto L229;
                case 89: goto L21e;
                case 90: goto L20c;
                case 91: goto L1f3;
                case 92: goto L1de;
                case 93: goto L1c2;
                case 94: goto L19f;
                case 95: goto L190;
                case 96: goto L2b5;
                case 97: goto L186;
                case 98: goto L2a4;
                case 99: goto L17c;
                case 100: goto L2b5;
                case 101: goto L186;
                case 102: goto L2a4;
                case 103: goto L17c;
                case 104: goto L2b5;
                case 105: goto L186;
                case 106: goto L2a4;
                case 107: goto L17c;
                case 108: goto L2b5;
                case 109: goto L186;
                case 110: goto L2a4;
                case 111: goto L17c;
                case 112: goto L2b5;
                case 113: goto L186;
                case 114: goto L2a4;
                case 115: goto L17c;
                case 116: goto L339;
                case 117: goto L339;
                case 118: goto L339;
                case 119: goto L339;
                case 120: goto L2b5;
                case 121: goto L172;
                case 122: goto L2b5;
                case 123: goto L172;
                case 124: goto L2b5;
                case 125: goto L172;
                case 126: goto L2b5;
                case 127: goto L186;
                case 128: goto L2b5;
                case 129: goto L186;
                case 130: goto L2b5;
                case 131: goto L186;
                case 132: goto L16e;
                case 133: goto L164;
                case 134: goto L15d;
                case 135: goto L153;
                case 136: goto L2b5;
                case 137: goto L2a4;
                case 138: goto L29a;
                case 139: goto L14c;
                case 140: goto L164;
                case 141: goto L153;
                case 142: goto L2b5;
                case 143: goto L2ab;
                case 144: goto L2a4;
                case 145: goto L339;
                case 146: goto L339;
                case 147: goto L339;
                case 148: goto L145;
                case 149: goto L2b5;
                case 150: goto L2b5;
                case 151: goto L145;
                case 152: goto L145;
                case 153: goto L22d;
                case 154: goto L22d;
                case 155: goto L22d;
                case 156: goto L22d;
                case 157: goto L22d;
                case 158: goto L22d;
                case 159: goto L229;
                case 160: goto L229;
                case 161: goto L229;
                case 162: goto L229;
                case 163: goto L229;
                case 164: goto L229;
                case 165: goto L229;
                case 166: goto L229;
                case 167: goto L339;
                case 168: goto L13f;
                case 169: goto L13f;
                case 170: goto L22d;
                case 171: goto L22d;
                case 172: goto L22d;
                case 173: goto L229;
                case 174: goto L22d;
                case 175: goto L229;
                case 176: goto L22d;
                case 177: goto L339;
                case 178: goto L139;
                case 179: goto L133;
                case 180: goto L12a;
                case 181: goto L121;
                case 182: goto Ldb;
                case 183: goto Ldb;
                case 184: goto Ldb;
                case 185: goto Ldb;
                case 186: goto Ld0;
                case 187: goto Lc3;
                case 188: goto L81;
                case 189: goto L61;
                case 190: goto L14c;
                case 191: goto L22d;
                case 192: goto L48;
                case 193: goto L14c;
                case 194: goto L22d;
                case 195: goto L22d;
                default: goto L38;
            }
        L38:
            switch(r1) {
                case 197: goto L3f;
                case 198: goto L22d;
                case 199: goto L22d;
                default: goto L3b;
            }
        L3b:
            defpackage.C0086.m557()
            return
        L3f:
            r0.m2666(r2)
            java.lang.String r1 = r3.f5526
            r0.m2674(r4, r1)
            return
        L48:
            java.lang.String r1 = r3.f5526
            r0.m2673()
            char r2 = r1.charAt(r15)
            if (r2 != r13) goto L57
            r0.m2674(r4, r1)
            return
        L57:
            int r1 = r4.m603(r1)
            r1 = r1 | r16
            r0.m2671(r1)
            return
        L61:
            java.lang.String r1 = r3.f5526
            r0.m2673()
            char r2 = r1.charAt(r15)
            if (r2 != r13) goto L76
            java.lang.String r2 = "["
            java.lang.String r1 = r2.concat(r1)
            r0.m2674(r4, r1)
            return
        L76:
            r2 = 75497472(0x4800000, float:3.0092655E-36)
            int r1 = r4.m603(r1)
            r1 = r1 | r2
            r0.m2671(r1)
            return
        L81:
            r0.m2673()
            switch(r2) {
                case 4: goto Lbc;
                case 5: goto Lb5;
                case 6: goto Lae;
                case 7: goto La7;
                case 8: goto La0;
                case 9: goto L99;
                case 10: goto L92;
                case 11: goto L8b;
                default: goto L87;
            }
        L87:
            defpackage.C0086.m557()
            return
        L8b:
            r1 = 71303172(0x4400004, float:2.2569499E-36)
            r0.m2671(r1)
            return
        L92:
            r1 = 71303169(0x4400001, float:2.2569493E-36)
            r0.m2671(r1)
            return
        L99:
            r1 = 71303180(0x440000c, float:2.2569513E-36)
            r0.m2671(r1)
            return
        La0:
            r1 = 71303178(0x440000a, float:2.256951E-36)
            r0.m2671(r1)
            return
        La7:
            r1 = 71303171(0x4400003, float:2.2569497E-36)
            r0.m2671(r1)
            return
        Lae:
            r1 = 71303170(0x4400002, float:2.2569495E-36)
            r0.m2671(r1)
            return
        Lb5:
            r1 = 71303179(0x440000b, float:2.2569511E-36)
            r0.m2671(r1)
            return
        Lbc:
            r1 = 71303177(0x4400009, float:2.2569508E-36)
            r0.m2671(r1)
            return
        Lc3:
            java.lang.String r1 = r3.f5526
            int r1 = r4.m608(r2, r1)
            r2 = 12582912(0xc00000, float:1.7632415E-38)
            r1 = r1 | r2
            r0.m2671(r1)
            return
        Ld0:
            java.lang.String r1 = r3.f5526
            r0.m2667(r1)
            java.lang.String r1 = r3.f5526
            r0.m2674(r4, r1)
            return
        Ldb:
            java.lang.String r2 = r3.f5526
            r0.m2667(r2)
            r2 = 184(0xb8, float:2.58E-43)
            if (r1 == r2) goto L11b
            int r2 = r0.m2673()
            r5 = 183(0xb7, float:2.56E-43)
            if (r1 != r5) goto L11b
            java.lang.String r1 = r3.f5527
            char r1 = r1.charAt(r15)
            r5 = 60
            if (r1 != r5) goto L11b
            int[] r1 = r0.f6499
            if (r1 != 0) goto Lfe
            int[] r1 = new int[r7]
            r0.f6499 = r1
        Lfe:
            int r5 = r1.length
            int r6 = r0.f6498
            if (r6 < r5) goto L113
            int r6 = r6 + r12
            int r1 = r5 * 2
            int r1 = java.lang.Math.max(r6, r1)
            int[] r1 = new int[r1]
            int[] r6 = r0.f6499
            java.lang.System.arraycopy(r6, r15, r1, r15, r5)
            r0.f6499 = r1
        L113:
            int r5 = r0.f6498
            int r6 = r5 + 1
            r0.f6498 = r6
            r1[r5] = r2
        L11b:
            java.lang.String r1 = r3.f5526
            r0.m2674(r4, r1)
            return
        L121:
            java.lang.String r1 = r3.f5526
            r0.m2667(r1)
            r0.m2673()
            return
        L12a:
            r0.m2666(r12)
            java.lang.String r1 = r3.f5526
            r0.m2674(r4, r1)
            return
        L133:
            java.lang.String r1 = r3.f5526
            r0.m2667(r1)
            return
        L139:
            java.lang.String r1 = r3.f5526
            r0.m2674(r4, r1)
            return
        L13f:
            java.lang.String r0 = "JSR/RET are not supported with computeFrames option"
            defpackage.C2264.m3684(r0)
            return
        L145:
            r0.m2666(r14)
            r0.m2671(r8)
            return
        L14c:
            r0.m2666(r12)
            r0.m2671(r8)
            return
        L153:
            r0.m2666(r12)
            r0.m2671(r9)
            r0.m2671(r11)
            return
        L15d:
            r0.m2666(r12)
            r0.m2671(r6)
            return
        L164:
            r0.m2666(r12)
            r0.m2671(r10)
            r0.m2671(r11)
            return
        L16e:
            r0.m2677(r2, r8)
            return
        L172:
            r0.m2666(r5)
            r0.m2671(r10)
            r0.m2671(r11)
            return
        L17c:
            r0.m2666(r14)
            r0.m2671(r9)
            r0.m2671(r11)
            return
        L186:
            r0.m2666(r14)
            r0.m2671(r10)
            r0.m2671(r11)
            return
        L190:
            int r1 = r0.m2673()
            int r2 = r0.m2673()
            r0.m2671(r1)
            r0.m2671(r2)
            return
        L19f:
            int r1 = r0.m2673()
            int r2 = r0.m2673()
            int r3 = r0.m2673()
            int r4 = r0.m2673()
            r0.m2671(r2)
            r0.m2671(r1)
            r0.m2671(r4)
            r0.m2671(r3)
            r0.m2671(r2)
            r0.m2671(r1)
            return
        L1c2:
            int r1 = r0.m2673()
            int r2 = r0.m2673()
            int r3 = r0.m2673()
            r0.m2671(r2)
            r0.m2671(r1)
            r0.m2671(r3)
            r0.m2671(r2)
            r0.m2671(r1)
            return
        L1de:
            int r1 = r0.m2673()
            int r2 = r0.m2673()
            r0.m2671(r2)
            r0.m2671(r1)
            r0.m2671(r2)
            r0.m2671(r1)
            return
        L1f3:
            int r1 = r0.m2673()
            int r2 = r0.m2673()
            int r3 = r0.m2673()
            r0.m2671(r1)
            r0.m2671(r3)
            r0.m2671(r2)
            r0.m2671(r1)
            return
        L20c:
            int r1 = r0.m2673()
            int r2 = r0.m2673()
            r0.m2671(r1)
            r0.m2671(r2)
            r0.m2671(r1)
            return
        L21e:
            int r1 = r0.m2673()
            r0.m2671(r1)
            r0.m2671(r1)
            return
        L229:
            r0.m2666(r7)
            return
        L22d:
            r0.m2666(r12)
            return
        L231:
            r0.m2666(r14)
            return
        L235:
            r0.m2666(r5)
            return
        L239:
            r0.m2666(r12)
            int r1 = r0.m2673()
            r0.m2677(r2, r1)
            int r1 = r2 + 1
            r0.m2677(r1, r11)
            if (r2 <= 0) goto L339
            int r1 = r2 + (-1)
            int r2 = r0.m2678(r1)
            if (r2 == r10) goto L261
            if (r2 != r9) goto L255
            goto L261
        L255:
            r3 = r2 & r15
            if (r3 == r14) goto L25b
            if (r3 != r13) goto L339
        L25b:
            r2 = r2 | r17
            r0.m2677(r1, r2)
            return
        L261:
            r0.m2677(r1, r11)
            return
        L265:
            int r1 = r0.m2673()
            r0.m2677(r2, r1)
            if (r2 <= 0) goto L339
            int r1 = r2 + (-1)
            int r2 = r0.m2678(r1)
            if (r2 == r10) goto L285
            if (r2 != r9) goto L279
            goto L285
        L279:
            r3 = r2 & r15
            if (r3 == r14) goto L27f
            if (r3 != r13) goto L339
        L27f:
            r2 = r2 | r17
            r0.m2677(r1, r2)
            return
        L285:
            r0.m2677(r1, r11)
            return
        L289:
            r0.m2666(r12)
            int r1 = r0.m2673()
            if (r1 != r5) goto L293
            goto L296
        L293:
            r2 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            int r1 = r1 + r2
        L296:
            r0.m2671(r1)
            return
        L29a:
            r0.m2666(r7)
            r0.m2671(r9)
            r0.m2671(r11)
            return
        L2a4:
            r0.m2666(r7)
            r0.m2671(r6)
            return
        L2ab:
            r0.m2666(r7)
            r0.m2671(r10)
            r0.m2671(r11)
            return
        L2b5:
            r0.m2666(r7)
            r0.m2671(r8)
            return
        L2bc:
            int r1 = r0.m2678(r2)
            r0.m2671(r1)
            return
        L2c4:
            r16 = 8388608(0x800000, float:1.1754944E-38)
            int r1 = r3.f5530
            switch(r1) {
                case 3: goto L31c;
                case 4: goto L318;
                case 5: goto L311;
                case 6: goto L30a;
                case 7: goto L2fe;
                case 8: goto L2f2;
                default: goto L2cb;
            }
        L2cb:
            switch(r1) {
                case 15: goto L2e6;
                case 16: goto L2da;
                case 17: goto L2d4;
                default: goto L2ce;
            }
        L2ce:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L2d4:
            java.lang.String r1 = r3.f5526
            r0.m2674(r4, r1)
            return
        L2da:
            java.lang.String r1 = "java/lang/invoke/MethodType"
            int r1 = r4.m603(r1)
            r1 = r1 | r16
            r0.m2671(r1)
            return
        L2e6:
            java.lang.String r1 = "java/lang/invoke/MethodHandle"
            int r1 = r4.m603(r1)
            r1 = r1 | r16
            r0.m2671(r1)
            return
        L2f2:
            java.lang.String r1 = "java/lang/String"
            int r1 = r4.m603(r1)
            r1 = r1 | r16
            r0.m2671(r1)
            return
        L2fe:
            java.lang.String r1 = "java/lang/Class"
            int r1 = r4.m603(r1)
            r1 = r1 | r16
            r0.m2671(r1)
            return
        L30a:
            r0.m2671(r9)
            r0.m2671(r11)
            return
        L311:
            r0.m2671(r10)
            r0.m2671(r11)
            return
        L318:
            r0.m2671(r6)
            return
        L31c:
            r0.m2671(r8)
            return
        L320:
            r0.m2671(r9)
            r0.m2671(r11)
            return
        L327:
            r0.m2671(r6)
            return
        L32b:
            r0.m2671(r10)
            r0.m2671(r11)
            return
        L332:
            r0.m2671(r8)
            return
        L336:
            r0.m2671(r5)
        L339:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final int m2676(defpackage.C0109 r9, int r10) {
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
            int r2 = r8.f6498
            if (r1 >= r2) goto L56
            int[] r2 = r8.f6499
            r2 = r2[r1]
            r3 = -67108864(0xfffffffffc000000, float:-2.658456E36)
            r3 = r3 & r2
            r4 = 62914560(0x3c00000, float:1.1284746E-36)
            r4 = r4 & r2
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r2 & r5
            r7 = 20971520(0x1400000, float:3.526483E-38)
            if (r4 != r7) goto L2e
            int[] r2 = r8.f6504
            r2 = r2[r6]
        L2c:
            int r2 = r2 + r3
            goto L39
        L2e:
            r7 = 25165824(0x1800000, float:4.7019774E-38)
            if (r4 != r7) goto L39
            int[] r2 = r8.f6502
            int r4 = r2.length
            int r4 = r4 - r6
            r2 = r2[r4]
            goto L2c
        L39:
            if (r10 != r2) goto L53
            r8 = 8388608(0x800000, float:1.1754944E-38)
            if (r10 != r0) goto L47
            java.lang.String r10 = r9.f962
            int r9 = r9.m603(r10)
        L45:
            r8 = r8 | r9
            return r8
        L47:
            r10 = r10 & r5
            ᛷᛲᲁᲀ[] r0 = r9.f956
            r10 = r0[r10]
            java.lang.String r10 = r10.f5526
            int r9 = r9.m603(r10)
            goto L45
        L53:
            int r1 = r1 + 1
            goto L11
        L56:
            return r10
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final void m2677(int r5, int r6) {
            r4 = this;
            int[] r0 = r4.f6501
            if (r0 != 0) goto La
            r0 = 10
            int[] r0 = new int[r0]
            r4.f6501 = r0
        La:
            int r1 = r0.length
            if (r5 < r1) goto L1f
            int r0 = r5 + 1
            int r2 = r1 * 2
            int r0 = java.lang.Math.max(r0, r2)
            int[] r0 = new int[r0]
            int[] r2 = r4.f6501
            r3 = 0
            java.lang.System.arraycopy(r2, r3, r0, r3, r1)
            r4.f6501 = r0
        L1f:
            r0[r5] = r6
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final int m2678(int r3) {
            r2 = this;
            int[] r2 = r2.f6501
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
}
