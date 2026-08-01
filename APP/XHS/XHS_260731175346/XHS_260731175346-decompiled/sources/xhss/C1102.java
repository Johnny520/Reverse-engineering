package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲇᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C1102 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public int f3537;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.String f3538;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.C0262[] f3539;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C1054 f3540;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public int f3541;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public xhss.C1050 f3542;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public int f3543;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public xhss.C0481[] f3544;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public int f3545;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C1050 f3546;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f3547;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f3548;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public xhss.C0481[] f3549;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public xhss.C0262[] f3550;

    public C1102(xhss.C1054 r1) {
            r0 = this;
            r0.<init>()
            r0.f3540 = r1
            r1 = 256(0x100, float:3.59E-43)
            xhss.ᛳᛴᛶᛷ[] r1 = new xhss.C0262[r1]
            r0.f3539 = r1
            r1 = 1
            r0.f3548 = r1
            xhss.ᲇᛶᲁᛶ r1 = new xhss.ᲇᛶᲁᛶ
            r1.<init>()
            r0.f3546 = r1
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C0262 m1777(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof java.lang.Integer
            r1 = 3
            if (r0 == 0) goto L10
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            xhss.ᛳᛴᛶᛷ r6 = r6.m1788(r1, r7)
            return r6
        L10:
            boolean r0 = r7 instanceof java.lang.Byte
            if (r0 == 0) goto L1f
            java.lang.Byte r7 = (java.lang.Byte) r7
            int r7 = r7.intValue()
            xhss.ᛳᛴᛶᛷ r6 = r6.m1788(r1, r7)
            return r6
        L1f:
            boolean r0 = r7 instanceof java.lang.Character
            if (r0 == 0) goto L2e
            java.lang.Character r7 = (java.lang.Character) r7
            char r7 = r7.charValue()
            xhss.ᛳᛴᛶᛷ r6 = r6.m1788(r1, r7)
            return r6
        L2e:
            boolean r0 = r7 instanceof java.lang.Short
            if (r0 == 0) goto L3d
            java.lang.Short r7 = (java.lang.Short) r7
            int r7 = r7.intValue()
            xhss.ᛳᛴᛶᛷ r6 = r6.m1788(r1, r7)
            return r6
        L3d:
            boolean r0 = r7 instanceof java.lang.Boolean
            if (r0 == 0) goto L4c
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            xhss.ᛳᛴᛶᛷ r6 = r6.m1788(r1, r7)
            return r6
        L4c:
            boolean r0 = r7 instanceof java.lang.Float
            if (r0 == 0) goto L60
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            r0 = 4
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            xhss.ᛳᛴᛶᛷ r6 = r6.m1788(r0, r7)
            return r6
        L60:
            boolean r0 = r7 instanceof java.lang.Long
            if (r0 == 0) goto L70
            java.lang.Long r7 = (java.lang.Long) r7
            long r0 = r7.longValue()
            r7 = 5
            xhss.ᛳᛴᛶᛷ r6 = r6.m1780(r0, r7)
            return r6
        L70:
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L84
            java.lang.Double r7 = (java.lang.Double) r7
            double r0 = r7.doubleValue()
            r7 = 6
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            xhss.ᛳᛴᛶᛷ r6 = r6.m1780(r0, r7)
            return r6
        L84:
            boolean r0 = r7 instanceof java.lang.String
            if (r0 == 0) goto L91
            java.lang.String r7 = (java.lang.String) r7
            r0 = 8
            xhss.ᛳᛴᛶᛷ r6 = r6.m1786(r7, r0)
            return r6
        L91:
            boolean r0 = r7 instanceof xhss.C0843
            if (r0 == 0) goto Lca
            xhss.ᲀᛲᲀᲈ r7 = (xhss.C0843) r7
            int r0 = r7.f2741
            r1 = 12
            r2 = 10
            if (r0 != r1) goto La0
            r0 = r2
        La0:
            r1 = 7
            if (r0 != r2) goto Lb2
            java.lang.String r0 = r7.f2739
            int r2 = r7.f2740
            int r7 = r7.f2742
            java.lang.String r7 = r0.substring(r2, r7)
            xhss.ᛳᛴᛶᛷ r6 = r6.m1786(r7, r1)
            return r6
        Lb2:
            r2 = 11
            if (r0 != r2) goto Lc1
            java.lang.String r7 = r7.m1428()
            r0 = 16
            xhss.ᛳᛴᛶᛷ r6 = r6.m1786(r7, r0)
            return r6
        Lc1:
            java.lang.String r7 = r7.m1428()
            xhss.ᛳᛴᛶᛷ r6 = r6.m1786(r7, r1)
            return r6
        Lca:
            boolean r0 = r7 instanceof xhss.C0683
            if (r0 == 0) goto Le0
            xhss.ᛷᛸᛴᛳ r7 = (xhss.C0683) r7
            int r1 = r7.f2308
            java.lang.String r2 = r7.f2305
            java.lang.String r3 = r7.f2306
            java.lang.String r4 = r7.f2309
            boolean r5 = r7.f2307
            r0 = r6
            xhss.ᛳᛴᛶᛷ r6 = r0.m1787(r1, r2, r3, r4, r5)
            return r6
        Le0:
            r0 = r6
            boolean r6 = r7 instanceof xhss.C1146
            if (r6 == 0) goto Lfc
            xhss.ᲈᛶᛵᛴ r7 = (xhss.C1146) r7
            java.lang.String r6 = r7.f3711
            java.lang.String r1 = r7.f3709
            xhss.ᛷᛸᛴᛳ r2 = r7.f3710
            java.lang.Object[] r7 = r7.f3712
            xhss.ᛳᛴᛶᛷ r7 = r0.m1781(r2, r7)
            r2 = 17
            int r7 = r7.f965
            xhss.ᛳᛴᛶᛷ r6 = r0.m1778(r2, r7, r6, r1)
            return r6
        Lfc:
            java.lang.String r6 = "value "
            xhss.C0532.m956(r7, r6)
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0262 m1778(int r12, int r13, java.lang.String r14, java.lang.String r15) {
            r11 = this;
            int r0 = r14.hashCode()
            int r1 = r15.hashCode()
            int r1 = r1 * r0
            int r0 = r13 + 1
            int r0 = r0 * r1
            int r0 = r0 + r12
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r0 & r1
            xhss.ᛳᛴᛶᛷ r0 = r11.m1790(r10)
        L16:
            if (r0 == 0) goto L3b
            int r1 = r0.f962
            if (r1 != r12) goto L38
            int r1 = r0.f967
            if (r1 != r10) goto L38
            long r1 = r0.f970
            long r3 = (long) r13
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L38
            java.lang.String r1 = r0.f969
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L38
            java.lang.String r1 = r0.f964
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L38
            return r0
        L38:
            xhss.ᛳᛴᛶᛷ r0 = r0.f966
            goto L16
        L3b:
            xhss.ᲇᛶᲁᛶ r0 = r11.f3546
            int r1 = r11.m1784(r14, r15)
            r0.m1711(r12, r13, r1)
            xhss.ᛳᛴᛶᛷ r2 = new xhss.ᛳᛴᛶᛷ
            int r3 = r11.f3548
            int r0 = r3 + 1
            r11.f3548 = r0
            r5 = 0
            long r8 = (long) r13
            r4 = r12
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            r11.m1779(r2)
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final void m1779(xhss.C0262 r8) {
            r7 = this;
            int r0 = r7.f3547
            xhss.ᛳᛴᛶᛷ[] r1 = r7.f3539
            int r2 = r1.length
            int r2 = r2 * 3
            int r2 = r2 / 4
            if (r0 <= r2) goto L2f
            int r0 = r1.length
            int r1 = r0 * 2
            int r1 = r1 + 1
            xhss.ᛳᛴᛶᛷ[] r2 = new xhss.C0262[r1]
            int r0 = r0 + (-1)
        L14:
            if (r0 < 0) goto L2c
            xhss.ᛳᛴᛶᛷ[] r3 = r7.f3539
            r3 = r3[r0]
        L1a:
            if (r3 == 0) goto L29
            int r4 = r3.f967
            int r4 = r4 % r1
            xhss.ᛳᛴᛶᛷ r5 = r3.f966
            r6 = r2[r4]
            r3.f966 = r6
            r2[r4] = r3
            r3 = r5
            goto L1a
        L29:
            int r0 = r0 + (-1)
            goto L14
        L2c:
            r7.f3539 = r2
            r1 = r2
        L2f:
            int r0 = r7.f3547
            int r0 = r0 + 1
            r7.f3547 = r0
            int r7 = r8.f967
            int r0 = r1.length
            int r7 = r7 % r0
            r0 = r1[r7]
            r8.f966 = r0
            r1[r7] = r8
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C0262 m1780(long r12, int r14) {
            r11 = this;
            int r0 = (int) r12
            int r1 = r14 + r0
            r2 = 32
            long r2 = r12 >>> r2
            int r2 = (int) r2
            int r1 = r1 + r2
            r3 = 2147483647(0x7fffffff, float:NaN)
            r9 = r1 & r3
            xhss.ᛳᛴᛶᛷ r1 = r11.m1790(r9)
        L12:
            if (r1 == 0) goto L26
            int r3 = r1.f962
            if (r3 != r14) goto L23
            int r3 = r1.f967
            if (r3 != r9) goto L23
            long r3 = r1.f970
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 != 0) goto L23
            return r1
        L23:
            xhss.ᛳᛴᛶᛷ r1 = r1.f966
            goto L12
        L26:
            int r5 = r11.f3548
            xhss.ᲇᛶᲁᛶ r1 = r11.f3546
            r1.m1709(r14)
            int r3 = r1.f3375
            int r4 = r3 + 8
            byte[] r6 = r1.f3374
            int r6 = r6.length
            if (r4 <= r6) goto L3b
            r6 = 8
            r1.m1702(r6)
        L3b:
            byte[] r6 = r1.f3374
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
            r1.f3375 = r4
            int r0 = r11.f3548
            int r0 = r0 + 2
            r11.f3548 = r0
            xhss.ᛳᛴᛶᛷ r4 = new xhss.ᛳᛴᛶᛷ
            r7 = r12
            r6 = r14
            r4.<init>(r5, r6, r7, r9)
            r11.m1779(r4)
            return r4
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final xhss.C0262 m1781(xhss.C0683 r13, java.lang.Object... r14) {
            r12 = this;
            xhss.ᲇᛶᲁᛶ r0 = r12.f3542
            if (r0 != 0) goto Lb
            xhss.ᲇᛶᲁᛶ r0 = new xhss.ᲇᛶᲁᛶ
            r0.<init>()
            r12.f3542 = r0
        Lb:
            int r1 = r14.length
            int[] r2 = new int[r1]
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r1) goto L1f
            r5 = r14[r4]
            xhss.ᛳᛴᛶᛷ r5 = r12.m1777(r5)
            int r5 = r5.f965
            r2[r4] = r5
            int r4 = r4 + 1
            goto L10
        L1f:
            int r4 = r0.f3375
            int r6 = r13.f2308
            java.lang.String r7 = r13.f2305
            java.lang.String r8 = r13.f2306
            java.lang.String r9 = r13.f2309
            boolean r10 = r13.f2307
            r5 = r12
            xhss.ᛳᛴᛶᛷ r12 = r5.m1787(r6, r7, r8, r9, r10)
            int r12 = r12.f965
            r0.m1708(r12)
            r0.m1708(r1)
            r12 = r3
        L39:
            if (r12 >= r1) goto L43
            r6 = r2[r12]
            r0.m1708(r6)
            int r12 = r12 + 1
            goto L39
        L43:
            int r12 = r0.f3375
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
            xhss.ᲇᛶᲁᛶ r13 = r5.f3542
            byte[] r13 = r13.f3374
            xhss.ᛳᛴᛶᛷ r14 = r5.m1790(r11)
        L65:
            if (r14 == 0) goto L8d
            int r0 = r14.f962
            r1 = 64
            if (r0 != r1) goto L8a
            int r0 = r14.f967
            if (r0 != r11) goto L8a
            long r0 = r14.f970
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
            xhss.ᲇᛶᲁᛶ r12 = r5.f3542
            r12.f3375 = r4
            return r14
        L8a:
            xhss.ᛳᛴᛶᛷ r14 = r14.f966
            goto L65
        L8d:
            xhss.ᛳᛴᛶᛷ r6 = new xhss.ᛳᛴᛶᛷ
            int r7 = r5.f3543
            int r12 = r7 + 1
            r5.f3543 = r12
            r8 = 64
            long r9 = (long) r4
            r6.<init>(r7, r8, r9, r11)
            r5.m1779(r6)
            return r6
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final int m1782(xhss.C0262 r5) {
            r4 = this;
            xhss.ᛳᛴᛶᛷ[] r0 = r4.f3550
            if (r0 != 0) goto La
            r0 = 16
            xhss.ᛳᛴᛶᛷ[] r0 = new xhss.C0262[r0]
            r4.f3550 = r0
        La:
            int r1 = r4.f3545
            int r2 = r0.length
            if (r1 != r2) goto L1c
            int r1 = r0.length
            int r1 = r1 * 2
            xhss.ᛳᛴᛶᛷ[] r1 = new xhss.C0262[r1]
            int r2 = r0.length
            r3 = 0
            java.lang.System.arraycopy(r0, r3, r1, r3, r2)
            r4.f3550 = r1
            r0 = r1
        L1c:
            int r1 = r4.f3545
            int r2 = r1 + 1
            r4.f3545 = r2
            r0[r1] = r5
            r4.m1779(r5)
            int r4 = r5.f965
            return r4
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final int m1783(java.lang.String r12) {
            r11 = this;
            int r0 = r12.hashCode()
            r1 = 1
            int r0 = r0 + r1
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r2
            xhss.ᛳᛴᛶᛷ r2 = r11.m1790(r0)
        Le:
            if (r2 == 0) goto L26
            int r3 = r2.f962
            if (r3 != r1) goto L23
            int r3 = r2.f967
            if (r3 != r0) goto L23
            java.lang.String r3 = r2.f964
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L23
            int r11 = r2.f965
            return r11
        L23:
            xhss.ᛳᛴᛶᛷ r2 = r2.f966
            goto Le
        L26:
            xhss.ᲇᛶᲁᛶ r2 = r11.f3546
            r2.m1709(r1)
            int r3 = r12.length()
            r4 = 0
            r5 = 65535(0xffff, float:9.1834E-41)
            if (r3 > r5) goto L7d
            int r6 = r2.f3375
            int r7 = r6 + 2
            int r8 = r7 + r3
            byte[] r9 = r2.f3374
            int r9 = r9.length
            if (r8 <= r9) goto L45
            int r8 = r3 + 2
            r2.m1702(r8)
        L45:
            byte[] r8 = r2.f3374
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
            r2.f3375 = r7
            r2.m1705(r12, r4, r5)
            goto L6e
        L6c:
            r2.f3375 = r7
        L6e:
            xhss.ᛳᛴᛶᛷ r2 = new xhss.ᛳᛴᛶᛷ
            int r3 = r11.f3548
            int r4 = r3 + 1
            r11.f3548 = r4
            r2.<init>(r3, r1, r0, r12)
            r11.m1779(r2)
            return r3
        L7d:
            java.lang.String r11 = "UTF8 string too large"
            xhss.C0532.m959(r11)
            return r4
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int m1784(java.lang.String r6, java.lang.String r7) {
            r5 = this;
            int r0 = r6.hashCode()
            int r1 = r7.hashCode()
            int r1 = r1 * r0
            r0 = 12
            int r1 = r1 + r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r1 = r1 & r2
            xhss.ᛳᛴᛶᛷ r2 = r5.m1790(r1)
        L14:
            if (r2 == 0) goto L34
            int r3 = r2.f962
            if (r3 != r0) goto L31
            int r3 = r2.f967
            if (r3 != r1) goto L31
            java.lang.String r3 = r2.f969
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L31
            java.lang.String r3 = r2.f964
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L31
            int r5 = r2.f965
            return r5
        L31:
            xhss.ᛳᛴᛶᛷ r2 = r2.f966
            goto L14
        L34:
            int r2 = r5.m1783(r6)
            int r3 = r5.m1783(r7)
            xhss.ᲇᛶᲁᛶ r4 = r5.f3546
            r4.m1711(r0, r2, r3)
            xhss.ᛳᛴᛶᛷ r0 = new xhss.ᛳᛴᛶᛷ
            int r2 = r5.f3548
            int r3 = r2 + 1
            r5.f3548 = r3
            r0.<init>(r2, r1, r6, r7)
            r5.m1779(r0)
            return r2
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final int m1785(java.lang.String r11, int r12) {
            r10 = this;
            int r0 = r11.hashCode()
            r1 = 129(0x81, float:1.81E-43)
            int r0 = r0 + r1
            int r0 = r0 + r12
            r2 = 2147483647(0x7fffffff, float:NaN)
            r9 = r0 & r2
            xhss.ᛳᛴᛶᛷ r0 = r10.m1790(r9)
        L11:
            if (r0 == 0) goto L30
            int r2 = r0.f962
            if (r2 != r1) goto L2d
            int r2 = r0.f967
            if (r2 != r9) goto L2d
            long r2 = r0.f970
            long r4 = (long) r12
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L2d
            java.lang.String r2 = r0.f964
            boolean r2 = r2.equals(r11)
            if (r2 == 0) goto L2d
            int r10 = r0.f965
            return r10
        L2d:
            xhss.ᛳᛴᛶᛷ r0 = r0.f966
            goto L11
        L30:
            xhss.ᛳᛴᛶᛷ r3 = new xhss.ᛳᛴᛶᛷ
            int r4 = r10.f3545
            r5 = 129(0x81, float:1.81E-43)
            long r7 = (long) r12
            r6 = r11
            r3.<init>(r4, r5, r6, r7, r9)
            int r10 = r10.m1782(r3)
            return r10
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final xhss.C0262 m1786(java.lang.String r5, int r6) {
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = r0 + r6
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            xhss.ᛳᛴᛶᛷ r1 = r4.m1790(r0)
        Ld:
            if (r1 == 0) goto L23
            int r2 = r1.f962
            if (r2 != r6) goto L20
            int r2 = r1.f967
            if (r2 != r0) goto L20
            java.lang.String r2 = r1.f964
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L20
            return r1
        L20:
            xhss.ᛳᛴᛶᛷ r1 = r1.f966
            goto Ld
        L23:
            xhss.ᲇᛶᲁᛶ r1 = r4.f3546
            int r2 = r4.m1783(r5)
            r1.m1704(r6, r2)
            xhss.ᛳᛴᛶᛷ r1 = new xhss.ᛳᛴᛶᛷ
            int r2 = r4.f3548
            int r3 = r2 + 1
            r4.f3548 = r3
            r1.<init>(r2, r6, r0, r5)
            r4.m1779(r1)
            return r1
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final xhss.C0262 m1787(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16) {
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
            xhss.ᛳᛴᛶᛷ r2 = r11.m1790(r8)
        L24:
            if (r2 == 0) goto L51
            int r6 = r2.f962
            if (r6 != r3) goto L4e
            int r6 = r2.f967
            if (r6 != r8) goto L4e
            long r6 = r2.f970
            long r9 = (long) r1
            int r6 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r6 != 0) goto L4e
            java.lang.String r6 = r2.f963
            boolean r6 = r6.equals(r13)
            if (r6 == 0) goto L4e
            java.lang.String r6 = r2.f969
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L4e
            java.lang.String r6 = r2.f964
            boolean r6 = r6.equals(r15)
            if (r6 == 0) goto L4e
            return r2
        L4e:
            xhss.ᛳᛴᛶᛷ r2 = r2.f966
            goto L24
        L51:
            xhss.ᲇᛶᲁᛶ r2 = r11.f3546
            if (r12 > r0) goto L61
            r0 = 9
            xhss.ᛳᛴᛶᛷ r0 = r11.m1789(r0, r13, r14, r15)
            int r0 = r0.f965
            r2.m1710(r12, r0)
            goto L71
        L61:
            if (r16 == 0) goto L66
            r0 = 11
            goto L68
        L66:
            r0 = 10
        L68:
            xhss.ᛳᛴᛶᛷ r0 = r11.m1789(r0, r13, r14, r15)
            int r0 = r0.f965
            r2.m1710(r12, r0)
        L71:
            xhss.ᛳᛴᛶᛷ r0 = new xhss.ᛳᛴᛶᛷ
            int r12 = r11.f3548
            int r2 = r12 + 1
            r11.f3548 = r2
            r2 = 15
            long r6 = (long) r1
            r1 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r11.m1779(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0262 m1788(int r9, int r10) {
            r8 = this;
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = r9 + r10
            r7 = r1 & r0
            xhss.ᛳᛴᛶᛷ r0 = r8.m1790(r7)
        Lb:
            if (r0 == 0) goto L20
            int r1 = r0.f962
            if (r1 != r9) goto L1d
            int r1 = r0.f967
            if (r1 != r7) goto L1d
            long r1 = r0.f970
            long r3 = (long) r10
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L1d
            return r0
        L1d:
            xhss.ᛳᛴᛶᛷ r0 = r0.f966
            goto Lb
        L20:
            xhss.ᲇᛶᲁᛶ r0 = r8.f3546
            r0.m1709(r9)
            r0.m1706(r10)
            xhss.ᛳᛴᛶᛷ r2 = new xhss.ᛳᛴᛶᛷ
            int r3 = r8.f3548
            int r0 = r3 + 1
            r8.f3548 = r0
            long r5 = (long) r10
            r4 = r9
            r2.<init>(r3, r4, r5, r7)
            r8.m1779(r2)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final xhss.C0262 m1789(int r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
            r11 = this;
            int r0 = r13.hashCode()
            int r1 = r14.hashCode()
            int r1 = r1 * r0
            int r0 = r15.hashCode()
            int r0 = r0 * r1
            int r0 = r0 + r12
            r1 = 2147483647(0x7fffffff, float:NaN)
            r10 = r0 & r1
            xhss.ᛳᛴᛶᛷ r0 = r11.m1790(r10)
        L18:
            if (r0 == 0) goto L3e
            int r1 = r0.f962
            if (r1 != r12) goto L3b
            int r1 = r0.f967
            if (r1 != r10) goto L3b
            java.lang.String r1 = r0.f963
            boolean r1 = r1.equals(r13)
            if (r1 == 0) goto L3b
            java.lang.String r1 = r0.f969
            boolean r1 = r1.equals(r14)
            if (r1 == 0) goto L3b
            java.lang.String r1 = r0.f964
            boolean r1 = r1.equals(r15)
            if (r1 == 0) goto L3b
            return r0
        L3b:
            xhss.ᛳᛴᛶᛷ r0 = r0.f966
            goto L18
        L3e:
            r0 = 7
            xhss.ᛳᛴᛶᛷ r0 = r11.m1786(r13, r0)
            int r0 = r0.f965
            int r1 = r11.m1784(r14, r15)
            xhss.ᲇᛶᲁᛶ r2 = r11.f3546
            r2.m1711(r12, r0, r1)
            xhss.ᛳᛴᛶᛷ r2 = new xhss.ᛳᛴᛶᛷ
            int r3 = r11.f3548
            int r0 = r3 + 1
            r11.f3548 = r0
            r8 = 0
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            r11.m1779(r2)
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final xhss.C0262 m1790(int r2) {
            r1 = this;
            xhss.ᛳᛴᛶᛷ[] r1 = r1.f3539
            int r0 = r1.length
            int r2 = r2 % r0
            r1 = r1[r2]
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final int m1791(java.lang.String r5) {
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 128(0x80, float:1.8E-43)
            int r0 = r0 + r1
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r2
            xhss.ᛳᛴᛶᛷ r2 = r4.m1790(r0)
        Lf:
            if (r2 == 0) goto L27
            int r3 = r2.f962
            if (r3 != r1) goto L24
            int r3 = r2.f967
            if (r3 != r0) goto L24
            java.lang.String r3 = r2.f964
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L24
            int r4 = r2.f965
            return r4
        L24:
            xhss.ᛳᛴᛶᛷ r2 = r2.f966
            goto Lf
        L27:
            xhss.ᛳᛴᛶᛷ r2 = new xhss.ᛳᛴᛶᛷ
            int r3 = r4.f3545
            r2.<init>(r3, r1, r0, r5)
            int r4 = r4.m1782(r2)
            return r4
    }
}
