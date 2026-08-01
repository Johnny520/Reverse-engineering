package defpackage;

/* JADX INFO: renamed from: ᛱᛶᛲᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0109 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public int f955;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public defpackage.C1231[] f956;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int f957;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public defpackage.C0031 f958;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C1231[] f959;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public defpackage.C1126[] f960;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f961;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.String f962;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C0581 f963;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public int f964;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public defpackage.C1126[] f965;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f966;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f967;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C0031 f968;

    public C0109(defpackage.C0581 r1) {
            r0 = this;
            r0.<init>()
            r0.f963 = r1
            r1 = 256(0x100, float:3.59E-43)
            ᛷᛲᲁᲀ[] r1 = new defpackage.C1231[r1]
            r0.f959 = r1
            r1 = 1
            r0.f967 = r1
            ᛱᛲᛳᛲ r1 = new ᛱᛲᛳᛲ
            r1.<init>()
            r0.f968 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int m602(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            int r0 = r6.hashCode()
            int r1 = r7.hashCode()
            int r1 = r1 * r0
            r0 = 12
            int r1 = r1 + r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            ᛷᛲᲁᲀ r2 = r5.m613(r1)
        L14:
            if (r2 == 0) goto L34
            int r3 = r2.f5530
            if (r3 != r0) goto L31
            int r3 = r2.f5524
            if (r3 != r1) goto L31
            java.lang.String r3 = r2.f5527
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L31
            java.lang.String r3 = r2.f5526
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L31
            int r5 = r2.f5529
            return r5
        L31:
            ᛷᛲᲁᲀ r2 = r2.f5525
            goto L14
        L34:
            int r2 = r5.m605(r6)
            int r3 = r5.m605(r7)
            ᛱᛲᛳᛲ r4 = r5.f968
            r4.m346(r0, r2, r3)
            ᛷᛲᲁᲀ r0 = new ᛷᛲᲁᲀ
            int r2 = r5.f967
            int r3 = r2 + 1
            r5.f967 = r3
            r0.<init>(r2, r1, r6, r7)
            r5.m606(r0)
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final int m603(java.lang.String r5) {
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 + r1
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r2
            ᛷᛲᲁᲀ r2 = r4.m613(r0)
        Lf:
            if (r2 == 0) goto L27
            int r3 = r2.f5530
            if (r3 != r1) goto L24
            int r3 = r2.f5524
            if (r3 != r0) goto L24
            java.lang.String r3 = r2.f5526
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L24
            int r4 = r2.f5529
            return r4
        L24:
            ᛷᛲᲁᲀ r2 = r2.f5525
            goto Lf
        L27:
            ᛷᛲᲁᲀ r2 = new ᛷᛲᲁᲀ
            int r3 = r4.f964
            r2.<init>(r3, r1, r0, r5)
            int r4 = r4.m604(r2)
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final int m604(defpackage.C1231 r5) {
            r4 = this;
            ᛷᛲᲁᲀ[] r0 = r4.f956
            if (r0 != 0) goto La
            r0 = 16
            ᛷᛲᲁᲀ[] r0 = new defpackage.C1231[r0]
            r4.f956 = r0
        La:
            int r1 = r4.f964
            int r2 = r0.length
            if (r1 != r2) goto L1c
            int r1 = r0.length
            int r1 = r1 * 2
            ᛷᛲᲁᲀ[] r1 = new defpackage.C1231[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r4.f956 = r1
            r0 = r1
        L1c:
            int r1 = r4.f964
            int r2 = r1 + 1
            r4.f964 = r2
            r0[r1] = r5
            r4.m606(r5)
            int r4 = r5.f5529
            return r4
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int m605(java.lang.String r12) {
            r11 = this;
            int r0 = r12.hashCode()
            r1 = 1
            int r0 = r0 + r1
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r2
            ᛷᛲᲁᲀ r2 = r11.m613(r0)
        Le:
            if (r2 == 0) goto L26
            int r3 = r2.f5530
            if (r3 != r1) goto L23
            int r3 = r2.f5524
            if (r3 != r0) goto L23
            java.lang.String r3 = r2.f5526
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L23
            int r11 = r2.f5529
            return r11
        L23:
            ᛷᛲᲁᲀ r2 = r2.f5525
            goto Le
        L26:
            ᛱᛲᛳᛲ r2 = r11.f968
            r2.m347(r1)
            int r3 = r12.length()
            r4 = 0
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r5) goto L7d
            int r6 = r2.f518
            int r7 = r6 + 2
            int r8 = r7 + r3
            byte[] r9 = r2.f520
            int r9 = r9.length
            if (r8 <= r9) goto L45
            int r8 = r3 + 2
            r2.m345(r8)
        L45:
            byte[] r8 = r2.f520
            int r9 = r6 + 1
            int r10 = r3 >>> 8
            byte r10 = (byte) r10
            r8[r6] = r10
            byte r6 = (byte) r3
            r8[r9] = r6
        L51:
            if (r4 >= r3) goto L6c
            char r6 = r12.charAt(r4)
            if (r6 < r1) goto L66
            r9 = 127(0x7f, float:1.78E-43)
            if (r6 > r9) goto L66
            int r9 = r7 + 1
            byte r6 = (byte) r6
            r8[r7] = r6
            int r4 = r4 + 1
            r7 = r9
            goto L51
        L66:
            r2.f518 = r7
            r2.m343(r12, r4, r5)
            goto L6e
        L6c:
            r2.f518 = r7
        L6e:
            ᛷᛲᲁᲀ r2 = new ᛷᛲᲁᲀ
            int r3 = r11.f967
            int r4 = r3 + 1
            r11.f967 = r4
            r2.<init>(r3, r1, r0, r12)
            r11.m606(r2)
            return r3
        L7d:
            java.lang.String r11 = "UTF8 string too large"
            defpackage.C2264.m3684(r11)
            return r4
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final void m606(defpackage.C1231 r8) {
            r7 = this;
            int r0 = r7.f961
            ᛷᛲᲁᲀ[] r1 = r7.f959
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 4
            if (r0 <= r2) goto L2f
            int r0 = r1.length
            int r1 = r0 * 2
            int r1 = r1 + 1
            ᛷᛲᲁᲀ[] r2 = new defpackage.C1231[r1]
            int r0 = r0 + (-1)
        L14:
            if (r0 < 0) goto L2c
            ᛷᛲᲁᲀ[] r3 = r7.f959
            r3 = r3[r0]
        L1a:
            if (r3 == 0) goto L29
            int r4 = r3.f5524
            int r4 = r4 % r1
            ᛷᛲᲁᲀ r5 = r3.f5525
            r6 = r2[r4]
            r3.f5525 = r6
            r2[r4] = r3
            r3 = r5
            goto L1a
        L29:
            int r0 = r0 + (-1)
            goto L14
        L2c:
            r7.f959 = r2
            r1 = r2
        L2f:
            int r0 = r7.f961
            int r0 = r0 + 1
            r7.f961 = r0
            int r7 = r8.f5524
            int r0 = r1.length
            int r7 = r7 % r0
            r0 = r1[r7]
            r8.f5525 = r0
            r1[r7] = r8
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.C1231 m607(long r12, int r14) {
            r11 = this;
            int r0 = (int) r12
            int r1 = r14 + r0
            r2 = 32
            long r2 = r12 >>> r2
            int r2 = (int) r2
            int r1 = r1 + r2
            r3 = 2147483647(0x7fffffff, float:NaN)
            r9 = r1 & r3
            ᛷᛲᲁᲀ r1 = r11.m613(r9)
        L12:
            if (r1 == 0) goto L26
            int r3 = r1.f5530
            if (r3 != r14) goto L23
            int r3 = r1.f5524
            if (r3 != r9) goto L23
            long r3 = r1.f5531
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L23
            return r1
        L23:
            ᛷᛲᲁᲀ r1 = r1.f5525
            goto L12
        L26:
            int r5 = r11.f967
            ᛱᛲᛳᛲ r1 = r11.f968
            r1.m347(r14)
            int r3 = r1.f518
            int r4 = r3 + 8
            byte[] r6 = r1.f520
            int r6 = r6.length
            if (r4 <= r6) goto L3b
            r6 = 8
            r1.m345(r6)
        L3b:
            byte[] r6 = r1.f520
            int r7 = r3 + 1
            int r8 = r2 >>> 24
            byte r8 = (byte) r8
            r6[r3] = r8
            int r8 = r3 + 2
            int r10 = r2 >>> 16
            byte r10 = (byte) r10
            r6[r7] = r10
            int r7 = r3 + 3
            int r10 = r2 >>> 8
            byte r10 = (byte) r10
            r6[r8] = r10
            int r8 = r3 + 4
            byte r2 = (byte) r2
            r6[r7] = r2
            int r2 = r3 + 5
            int r7 = r0 >>> 24
            byte r7 = (byte) r7
            r6[r8] = r7
            int r7 = r3 + 6
            int r8 = r0 >>> 16
            byte r8 = (byte) r8
            r6[r2] = r8
            int r3 = r3 + 7
            int r2 = r0 >>> 8
            byte r2 = (byte) r2
            r6[r7] = r2
            byte r0 = (byte) r0
            r6[r3] = r0
            r1.f518 = r4
            int r0 = r11.f967
            int r0 = r0 + 2
            r11.f967 = r0
            ᛷᛲᲁᲀ r4 = new ᛷᛲᲁᲀ
            r7 = r12
            r6 = r14
            r4.<init>(r5, r6, r7, r9)
            r11.m606(r4)
            return r4
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final int m608(int r11, java.lang.String r12) {
            r10 = this;
            int r0 = r12.hashCode()
            r1 = 129(0x81, float:1.81E-43)
            int r0 = r0 + r1
            int r0 = r0 + r11
            r2 = 2147483647(0x7fffffff, float:NaN)
            r9 = r0 & r2
            ᛷᛲᲁᲀ r0 = r10.m613(r9)
        L11:
            if (r0 == 0) goto L30
            int r2 = r0.f5530
            if (r2 != r1) goto L2d
            int r2 = r0.f5524
            if (r2 != r9) goto L2d
            long r2 = r0.f5531
            long r4 = (long) r11
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2d
            java.lang.String r2 = r0.f5526
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L2d
            int r10 = r0.f5529
            return r10
        L2d:
            ᛷᛲᲁᲀ r0 = r0.f5525
            goto L11
        L30:
            ᛷᛲᲁᲀ r3 = new ᛷᛲᲁᲀ
            int r4 = r10.f964
            r5 = 129(0x81, float:1.81E-43)
            long r7 = (long) r11
            r6 = r12
            r3.<init>(r4, r5, r6, r7, r9)
            int r10 = r10.m604(r3)
            return r10
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C1231 m609(int r9, int r10) {
            r8 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r9 + r10
            r7 = r1 & r0
            ᛷᛲᲁᲀ r0 = r8.m613(r7)
        Lb:
            if (r0 == 0) goto L20
            int r1 = r0.f5530
            if (r1 != r9) goto L1d
            int r1 = r0.f5524
            if (r1 != r7) goto L1d
            long r1 = r0.f5531
            long r3 = (long) r10
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            return r0
        L1d:
            ᛷᛲᲁᲀ r0 = r0.f5525
            goto Lb
        L20:
            ᛱᛲᛳᛲ r0 = r8.f968
            r0.m347(r9)
            r0.m339(r10)
            ᛷᛲᲁᲀ r2 = new ᛷᛲᲁᲀ
            int r3 = r8.f967
            int r0 = r3 + 1
            r8.f967 = r0
            long r5 = (long) r10
            r4 = r9
            r2.<init>(r3, r4, r5, r7)
            r8.m606(r2)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1231 m610(int r12, int r13, java.lang.String r14, java.lang.String r15) {
            r11 = this;
            int r0 = r14.hashCode()
            int r1 = r15.hashCode()
            int r1 = r1 * r0
            int r0 = r13 + 1
            int r0 = r0 * r1
            int r0 = r0 + r12
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r0 & r1
            ᛷᛲᲁᲀ r0 = r11.m613(r10)
        L16:
            if (r0 == 0) goto L3b
            int r1 = r0.f5530
            if (r1 != r12) goto L38
            int r1 = r0.f5524
            if (r1 != r10) goto L38
            long r1 = r0.f5531
            long r3 = (long) r13
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L38
            java.lang.String r1 = r0.f5527
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L38
            java.lang.String r1 = r0.f5526
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L38
            return r0
        L38:
            ᛷᛲᲁᲀ r0 = r0.f5525
            goto L16
        L3b:
            ᛱᛲᛳᛲ r0 = r11.f968
            int r1 = r11.m602(r14, r15)
            r0.m346(r12, r13, r1)
            ᛷᛲᲁᲀ r2 = new ᛷᛲᲁᲀ
            int r3 = r11.f967
            int r0 = r3 + 1
            r11.f967 = r0
            r5 = 0
            long r8 = (long) r13
            r4 = r12
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            r11.m606(r2)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1231 m611(defpackage.C1100 r13, java.lang.Object... r14) {
            r12 = this;
            ᛱᛲᛳᛲ r0 = r12.f958
            if (r0 != 0) goto Lb
            ᛱᛲᛳᛲ r0 = new ᛱᛲᛳᛲ
            r0.<init>()
            r12.f958 = r0
        Lb:
            int r1 = r14.length
            int[] r2 = new int[r1]
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r1) goto L1f
            r5 = r14[r4]
            ᛷᛲᲁᲀ r5 = r12.m614(r5)
            int r5 = r5.f5529
            r2[r4] = r5
            int r4 = r4 + 1
            goto L10
        L1f:
            int r4 = r0.f518
            int r6 = r13.f4909
            java.lang.String r7 = r13.f4910
            java.lang.String r8 = r13.f4908
            java.lang.String r9 = r13.f4907
            boolean r10 = r13.f4906
            r5 = r12
            ᛷᛲᲁᲀ r12 = r5.m616(r6, r7, r8, r9, r10)
            int r12 = r12.f5529
            r0.m344(r12)
            r0.m344(r1)
            r12 = r3
        L39:
            if (r12 >= r1) goto L43
            r6 = r2[r12]
            r0.m344(r6)
            int r12 = r12 + 1
            goto L39
        L43:
            int r12 = r0.f518
            int r12 = r12 - r4
            int r13 = r13.hashCode()
            int r0 = r14.length
            r1 = r3
        L4c:
            if (r1 >= r0) goto L58
            r2 = r14[r1]
            int r2 = r2.hashCode()
            r13 = r13 ^ r2
            int r1 = r1 + 1
            goto L4c
        L58:
            r14 = 2147483647(0x7fffffff, float:NaN)
            r11 = r13 & r14
            ᛱᛲᛳᛲ r13 = r5.f958
            byte[] r13 = r13.f520
            ᛷᛲᲁᲀ r14 = r5.m613(r11)
        L65:
            if (r14 == 0) goto L8d
            int r0 = r14.f5530
            r1 = 64
            if (r0 != r1) goto L8a
            int r0 = r14.f5524
            if (r0 != r11) goto L8a
            long r0 = r14.f5531
            int r0 = (int) r0
            r1 = r3
        L75:
            if (r1 >= r12) goto L85
            int r2 = r4 + r1
            r2 = r13[r2]
            int r6 = r0 + r1
            r6 = r13[r6]
            if (r2 == r6) goto L82
            goto L8a
        L82:
            int r1 = r1 + 1
            goto L75
        L85:
            ᛱᛲᛳᛲ r12 = r5.f958
            r12.f518 = r4
            return r14
        L8a:
            ᛷᛲᲁᲀ r14 = r14.f5525
            goto L65
        L8d:
            ᛷᛲᲁᲀ r6 = new ᛷᛲᲁᲀ
            int r7 = r5.f955
            int r12 = r7 + 1
            r5.f955 = r12
            r8 = 64
            long r9 = (long) r4
            r6.<init>(r7, r8, r9, r11)
            r5.m606(r6)
            return r6
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.C1231 m612(int r5, java.lang.String r6) {
            r4 = this;
            int r0 = r6.hashCode()
            int r0 = r0 + r5
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            ᛷᛲᲁᲀ r1 = r4.m613(r0)
        Ld:
            if (r1 == 0) goto L23
            int r2 = r1.f5530
            if (r2 != r5) goto L20
            int r2 = r1.f5524
            if (r2 != r0) goto L20
            java.lang.String r2 = r1.f5526
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L20
            return r1
        L20:
            ᛷᛲᲁᲀ r1 = r1.f5525
            goto Ld
        L23:
            ᛱᛲᛳᛲ r1 = r4.f968
            int r2 = r4.m605(r6)
            r1.m340(r5, r2)
            ᛷᛲᲁᲀ r1 = new ᛷᛲᲁᲀ
            int r2 = r4.f967
            int r3 = r2 + 1
            r4.f967 = r3
            r1.<init>(r2, r5, r0, r6)
            r4.m606(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final defpackage.C1231 m613(int r2) {
            r1 = this;
            ᛷᛲᲁᲀ[] r1 = r1.f959
            int r0 = r1.length
            int r2 = r2 % r0
            r1 = r1[r2]
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C1231 m614(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof java.lang.Integer
            r1 = 3
            if (r0 == 0) goto L10
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            ᛷᛲᲁᲀ r6 = r6.m609(r1, r7)
            return r6
        L10:
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto L1f
            java.lang.Byte r7 = (java.lang.Byte) r7
            int r7 = r7.intValue()
            ᛷᛲᲁᲀ r6 = r6.m609(r1, r7)
            return r6
        L1f:
            boolean r0 = r7 instanceof java.lang.Character
            if (r0 == 0) goto L2e
            java.lang.Character r7 = (java.lang.Character) r7
            char r7 = r7.charValue()
            ᛷᛲᲁᲀ r6 = r6.m609(r1, r7)
            return r6
        L2e:
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 == 0) goto L3d
            java.lang.Short r7 = (java.lang.Short) r7
            int r7 = r7.intValue()
            ᛷᛲᲁᲀ r6 = r6.m609(r1, r7)
            return r6
        L3d:
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L4c
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            ᛷᛲᲁᲀ r6 = r6.m609(r1, r7)
            return r6
        L4c:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L60
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r0 = 4
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            ᛷᛲᲁᲀ r6 = r6.m609(r0, r7)
            return r6
        L60:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L70
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            r7 = 5
            ᛷᛲᲁᲀ r6 = r6.m607(r0, r7)
            return r6
        L70:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L84
            java.lang.Double r7 = (java.lang.Double) r7
            double r0 = r7.doubleValue()
            r7 = 6
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            ᛷᛲᲁᲀ r6 = r6.m607(r0, r7)
            return r6
        L84:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L91
            java.lang.String r7 = (java.lang.String) r7
            r0 = 8
            ᛷᛲᲁᲀ r6 = r6.m612(r0, r7)
            return r6
        L91:
            boolean r0 = r7 instanceof defpackage.C2118
            if (r0 == 0) goto Lca
            ᲇᲀᛴᲁ r7 = (defpackage.C2118) r7
            int r0 = r7.f9083
            r1 = 12
            r2 = 10
            if (r0 != r1) goto La0
            r0 = r2
        La0:
            r1 = 7
            if (r0 != r2) goto Lb2
            java.lang.String r0 = r7.f9084
            int r2 = r7.f9082
            int r7 = r7.f9081
            java.lang.String r7 = r0.substring(r2, r7)
            ᛷᛲᲁᲀ r6 = r6.m612(r1, r7)
            return r6
        Lb2:
            r2 = 11
            if (r0 != r2) goto Lc1
            java.lang.String r7 = r7.m3546()
            r0 = 16
            ᛷᛲᲁᲀ r6 = r6.m612(r0, r7)
            return r6
        Lc1:
            java.lang.String r7 = r7.m3546()
            ᛷᛲᲁᲀ r6 = r6.m612(r1, r7)
            return r6
        Lca:
            boolean r0 = r7 instanceof defpackage.C1100
            if (r0 == 0) goto Le0
            ᛶᛶᲇᛲ r7 = (defpackage.C1100) r7
            int r1 = r7.f4909
            java.lang.String r2 = r7.f4910
            java.lang.String r3 = r7.f4908
            java.lang.String r4 = r7.f4907
            boolean r5 = r7.f4906
            r0 = r6
            ᛷᛲᲁᲀ r6 = r0.m616(r1, r2, r3, r4, r5)
            return r6
        Le0:
            r0 = r6
            boolean r6 = r7 instanceof defpackage.C1232
            if (r6 == 0) goto Lfc
            ᛷᛲᲁᲇ r7 = (defpackage.C1232) r7
            java.lang.String r6 = r7.f5535
            java.lang.String r1 = r7.f5536
            ᛶᛶᲇᛲ r2 = r7.f5534
            java.lang.Object[] r7 = r7.f5533
            ᛷᛲᲁᲀ r7 = r0.m611(r2, r7)
            r2 = 17
            int r7 = r7.f5529
            ᛷᛲᲁᲀ r6 = r0.m610(r2, r7, r6, r1)
            return r6
        Lfc:
            java.lang.String r6 = "value "
            defpackage.C2264.m3685(r7, r6)
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C1231 m615(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r11 = this;
            int r0 = r13.hashCode()
            int r1 = r14.hashCode()
            int r1 = r1 * r0
            int r0 = r15.hashCode()
            int r0 = r0 * r1
            int r0 = r0 + r12
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r0 & r1
            ᛷᛲᲁᲀ r0 = r11.m613(r10)
        L18:
            if (r0 == 0) goto L3e
            int r1 = r0.f5530
            if (r1 != r12) goto L3b
            int r1 = r0.f5524
            if (r1 != r10) goto L3b
            java.lang.String r1 = r0.f5528
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L3b
            java.lang.String r1 = r0.f5527
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L3b
            java.lang.String r1 = r0.f5526
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L3b
            return r0
        L3b:
            ᛷᛲᲁᲀ r0 = r0.f5525
            goto L18
        L3e:
            r0 = 7
            ᛷᛲᲁᲀ r0 = r11.m612(r0, r13)
            int r0 = r0.f5529
            int r1 = r11.m602(r14, r15)
            ᛱᛲᛳᛲ r2 = r11.f968
            r2.m346(r12, r0, r1)
            ᛷᛲᲁᲀ r2 = new ᛷᛲᲁᲀ
            int r3 = r11.f967
            int r0 = r3 + 1
            r11.f967 = r0
            r8 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            r11.m606(r2)
            return r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1231 m616(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16) {
            r11 = this;
            r0 = 4
            if (r12 <= r0) goto L8
            if (r16 == 0) goto L8
            int r1 = r12 << 8
            goto L9
        L8:
            r1 = r12
        L9:
            int r2 = r13.hashCode()
            int r3 = r14.hashCode()
            int r3 = r3 * r2
            int r2 = r15.hashCode()
            int r2 = r2 * r3
            int r2 = r2 * r1
            r3 = 15
            int r2 = r2 + r3
            r6 = 2147483647(0x7fffffff, float:NaN)
            r8 = r2 & r6
            ᛷᛲᲁᲀ r2 = r11.m613(r8)
        L24:
            if (r2 == 0) goto L51
            int r6 = r2.f5530
            if (r6 != r3) goto L4e
            int r6 = r2.f5524
            if (r6 != r8) goto L4e
            long r6 = r2.f5531
            long r9 = (long) r1
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r6 = r2.f5528
            boolean r6 = r6.equals(r13)
            if (r6 == 0) goto L4e
            java.lang.String r6 = r2.f5527
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L4e
            java.lang.String r6 = r2.f5526
            boolean r6 = r6.equals(r15)
            if (r6 == 0) goto L4e
            return r2
        L4e:
            ᛷᛲᲁᲀ r2 = r2.f5525
            goto L24
        L51:
            ᛱᛲᛳᛲ r2 = r11.f968
            if (r12 > r0) goto L61
            r0 = 9
            ᛷᛲᲁᲀ r0 = r11.m615(r0, r13, r14, r15)
            int r0 = r0.f5529
            r2.m341(r12, r0)
            goto L71
        L61:
            if (r16 == 0) goto L66
            r0 = 11
            goto L68
        L66:
            r0 = 10
        L68:
            ᛷᛲᲁᲀ r0 = r11.m615(r0, r13, r14, r15)
            int r0 = r0.f5529
            r2.m341(r12, r0)
        L71:
            ᛷᛲᲁᲀ r0 = new ᛷᛲᲁᲀ
            int r12 = r11.f967
            int r2 = r12 + 1
            r11.f967 = r2
            r2 = 15
            long r6 = (long) r1
            r1 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r11.m606(r0)
            return r0
    }
}
