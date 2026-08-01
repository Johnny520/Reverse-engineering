package xhss;

/* JADX INFO: renamed from: xhss.ᛷᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0693 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final byte[] f2341;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int[] f2342;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final xhss.C1146[] f2343;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f2344;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final int f2345;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.String[] f2346;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int[] f2347;

    public C0693(byte[] r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            r0.<init>()
            r0.f2341 = r1
            r2 = 8
            int r3 = r0.m1181(r2)
            int[] r4 = new int[r3]
            r0.f2342 = r4
            java.lang.String[] r4 = new java.lang.String[r3]
            r0.f2346 = r4
            r4 = 0
            r5 = 1
            r6 = 10
            r8 = r4
            r9 = r8
            r10 = r9
            r7 = r5
        L1f:
            r11 = 4
            if (r7 >= r3) goto L56
            int[] r12 = r0.f2342
            int r13 = r7 + 1
            int r14 = r6 + 1
            r12[r7] = r14
            r12 = r1[r6]
            r15 = 3
            r16 = 5
            switch(r12) {
                case 1: goto L4a;
                case 2: goto L32;
                case 3: goto L39;
                case 4: goto L39;
                case 5: goto L45;
                case 6: goto L45;
                case 7: goto L42;
                case 8: goto L42;
                case 9: goto L39;
                case 10: goto L39;
                case 11: goto L39;
                case 12: goto L39;
                case 13: goto L32;
                case 14: goto L32;
                case 15: goto L40;
                case 16: goto L42;
                case 17: goto L3d;
                case 18: goto L38;
                case 19: goto L42;
                case 20: goto L42;
                default: goto L32;
            }
        L32:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L38:
            r10 = r5
        L39:
            r7 = r13
            r11 = r16
            goto L54
        L3d:
            r9 = r5
            r10 = r9
            goto L39
        L40:
            r7 = r13
            goto L54
        L42:
            r7 = r13
            r11 = r15
            goto L54
        L45:
            int r7 = r7 + 2
            r11 = 9
            goto L54
        L4a:
            int r7 = r0.m1181(r14)
            int r11 = r7 + 3
            if (r11 <= r8) goto L40
            r8 = r11
            goto L40
        L54:
            int r6 = r6 + r11
            goto L1f
        L56:
            r0.f2345 = r8
            r0.f2344 = r6
            r1 = 0
            if (r9 == 0) goto L60
            xhss.ᲈᛶᛵᛴ[] r3 = new xhss.C1146[r3]
            goto L61
        L60:
            r3 = r1
        L61:
            r0.f2343 = r3
            if (r10 == 0) goto Lac
            char[] r1 = new char[r8]
            int r3 = r0.m1173()
            int r5 = r3 + (-2)
            int r5 = r0.m1181(r5)
        L71:
            if (r5 <= 0) goto La6
            java.lang.String r6 = r0.m1184(r3, r1)
            int r7 = r3 + 2
            int r7 = r0.m1186(r7)
            int r8 = r3 + 6
            java.lang.String r9 = "BootstrapMethods"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto La1
            int r1 = r0.m1181(r8)
            int[] r5 = new int[r1]
            int r3 = r3 + r2
        L8e:
            if (r4 >= r1) goto L9f
            r5[r4] = r3
            int r2 = r3 + 2
            int r2 = r0.m1181(r2)
            int r2 = r2 * 2
            int r2 = r2 + r11
            int r3 = r3 + r2
            int r4 = r4 + 1
            goto L8e
        L9f:
            r1 = r5
            goto Lac
        La1:
            int r3 = r8 + r7
            int r5 = r5 + (-1)
            goto L71
        La6:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        Lac:
            r0.f2347 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public static xhss.C0985 m1172(int r1, xhss.C0985[] r2) {
            r0 = r2[r1]
            if (r0 != 0) goto Lb
            xhss.ᲁᲁᛱᲀ r0 = new xhss.ᲁᲁᛱᲀ
            r0.<init>()
            r2[r1] = r0
        Lb:
            r1 = r2[r1]
            short r2 = r1.f3198
            r2 = r2 & (-2)
            short r2 = (short) r2
            r1.f3198 = r2
            return r1
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int m1173() {
            r4 = this;
            int r0 = r4.f2344
            int r1 = r0 + 8
            int r0 = r0 + 6
            int r0 = r4.m1181(r0)
            int r0 = r0 * 2
            int r0 = r0 + r1
            int r1 = r4.m1181(r0)
            int r0 = r0 + 2
        L13:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L30
            int r1 = r0 + 6
            int r1 = r4.m1181(r1)
            int r0 = r0 + 8
        L1f:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto L2e
            int r1 = r0 + 2
            int r1 = r4.m1186(r1)
            int r1 = r1 + 6
            int r0 = r0 + r1
            r1 = r3
            goto L1f
        L2e:
            r1 = r2
            goto L13
        L30:
            int r1 = r4.m1181(r0)
            int r0 = r0 + 2
        L36:
            int r2 = r1 + (-1)
            if (r1 <= 0) goto L53
            int r1 = r0 + 6
            int r1 = r4.m1181(r1)
            int r0 = r0 + 8
        L42:
            int r3 = r1 + (-1)
            if (r1 <= 0) goto L51
            int r1 = r0 + 2
            int r1 = r4.m1186(r1)
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

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public final java.lang.String m1174(char[] r8, int r9, int r10) {
            r7 = this;
            int r10 = r10 + r9
            r0 = 0
            r1 = r0
        L3:
            if (r9 >= r10) goto L4b
            int r2 = r9 + 1
            byte[] r3 = r7.f2341
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

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int m1175(int[] r3, int r4) {
            r2 = this;
            if (r3 == 0) goto L19
            int r0 = r3.length
            if (r4 >= r0) goto L19
            r0 = r3[r4]
            int r0 = r2.m1179(r0)
            r1 = 67
            if (r0 >= r1) goto L10
            goto L19
        L10:
            r3 = r3[r4]
            int r3 = r3 + 1
            int r2 = r2.m1181(r3)
            return r2
        L19:
            r2 = -1
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final int m1176(xhss.C0720 r10, int r11) {
            r9 = this;
            int r0 = r9.m1186(r11)
            int r1 = r0 >>> 24
            r2 = 1
            if (r1 == 0) goto L70
            if (r1 == r2) goto L70
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L6d;
                case 17: goto L6d;
                case 18: goto L6d;
                case 19: goto L6a;
                case 20: goto L6a;
                case 21: goto L6a;
                case 22: goto L70;
                case 23: goto L6d;
                default: goto L10;
            }
        L10:
            switch(r1) {
                case 64: goto L24;
                case 65: goto L24;
                case 66: goto L6d;
                case 67: goto L20;
                case 68: goto L20;
                case 69: goto L20;
                case 70: goto L20;
                case 71: goto L19;
                case 72: goto L19;
                case 73: goto L19;
                case 74: goto L19;
                case 75: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L19:
            r1 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r0 = r0 & r1
            int r11 = r11 + 4
            goto L75
        L20:
            r0 = r0 & r3
        L21:
            int r11 = r11 + 3
            goto L75
        L24:
            r0 = r0 & r3
            int r1 = r11 + 1
            int r1 = r9.m1181(r1)
            int r11 = r11 + 3
            xhss.ᲁᲁᛱᲀ[] r3 = new xhss.C0985[r1]
            r10.f2404 = r3
            xhss.ᲁᲁᛱᲀ[] r3 = new xhss.C0985[r1]
            r10.f2409 = r3
            int[] r3 = new int[r1]
            r10.f2398 = r3
            r3 = 0
        L3a:
            if (r3 >= r1) goto L75
            int r4 = r9.m1181(r11)
            int r5 = r11 + 2
            int r5 = r9.m1181(r5)
            int r6 = r11 + 4
            int r6 = r9.m1181(r6)
            int r11 = r11 + 6
            xhss.ᲁᲁᛱᲀ[] r7 = r10.f2404
            xhss.ᲁᲁᛱᲀ[] r8 = r10.f2405
            xhss.ᲁᲁᛱᲀ r8 = m1172(r4, r8)
            r7[r3] = r8
            xhss.ᲁᲁᛱᲀ[] r7 = r10.f2409
            int r4 = r4 + r5
            xhss.ᲁᲁᛱᲀ[] r5 = r10.f2405
            xhss.ᲁᲁᛱᲀ r4 = m1172(r4, r5)
            r7[r3] = r4
            int[] r4 = r10.f2398
            r4[r3] = r6
            int r3 = r3 + 1
            goto L3a
        L6a:
            r0 = r0 & r3
            int r11 = r11 + r2
            goto L75
        L6d:
            r0 = r0 & (-256(0xffffffffffffff00, float:NaN))
            goto L21
        L70:
            r1 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r1
            int r11 = r11 + 2
        L75:
            r10.f2401 = r0
            int r0 = r9.m1179(r11)
            if (r0 != 0) goto L7f
            r9 = 0
            goto L87
        L7f:
            xhss.ᲇᛶᲁᛶ r1 = new xhss.ᲇᛶᲁᛶ
            byte[] r9 = r9.f2341
            r1.<init>(r9, r11)
            r9 = r1
        L87:
            r10.f2400 = r9
            int r11 = r11 + r2
            int r0 = r0 * 2
            int r0 = r0 + r11
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public final java.lang.String m1177(int r4, char[] r5) {
            r3 = this;
            java.lang.String[] r0 = r3.f2346
            r1 = r0[r4]
            if (r1 == 0) goto L7
            return r1
        L7:
            int[] r1 = r3.f2342
            r1 = r1[r4]
            int r2 = r1 + 2
            int r1 = r3.m1181(r1)
            java.lang.String r3 = r3.m1174(r5, r2, r1)
            r0[r4] = r3
            return r3
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final int[] m1178(xhss.C0962 r11, xhss.C0720 r12, int r13, boolean r14) {
            r10 = this;
            char[] r0 = r12.f2392
            int r1 = r10.m1181(r13)
            int[] r2 = new int[r1]
            int r13 = r13 + 2
            r3 = 0
        Lb:
            if (r3 >= r1) goto L96
            r2[r3] = r13
            int r4 = r10.m1186(r13)
            int r5 = r4 >>> 24
            r6 = 23
            if (r5 == r6) goto L4d
            switch(r5) {
                case 16: goto L4d;
                case 17: goto L4d;
                case 18: goto L4d;
                default: goto L1c;
            }
        L1c:
            switch(r5) {
                case 64: goto L28;
                case 65: goto L28;
                case 66: goto L4d;
                case 67: goto L4d;
                case 68: goto L4d;
                case 69: goto L4d;
                case 70: goto L4d;
                case 71: goto L25;
                case 72: goto L25;
                case 73: goto L25;
                case 74: goto L25;
                case 75: goto L25;
                default: goto L1f;
            }
        L1f:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        L25:
            int r13 = r13 + 4
            goto L4f
        L28:
            int r6 = r13 + 1
            int r6 = r10.m1181(r6)
            int r13 = r13 + 3
        L30:
            int r7 = r6 + (-1)
            if (r6 <= 0) goto L4f
            int r6 = r10.m1181(r13)
            int r8 = r13 + 2
            int r8 = r10.m1181(r8)
            int r13 = r13 + 6
            xhss.ᲁᲁᛱᲀ[] r9 = r12.f2405
            m1172(r6, r9)
            int r6 = r6 + r8
            xhss.ᲁᲁᛱᲀ[] r8 = r12.f2405
            m1172(r6, r8)
            r6 = r7
            goto L30
        L4d:
            int r13 = r13 + 3
        L4f:
            int r6 = r10.m1179(r13)
            r7 = 66
            r8 = 0
            r9 = 1
            if (r5 != r7) goto L89
            if (r6 != 0) goto L5c
            goto L63
        L5c:
            xhss.ᲇᛶᲁᛶ r8 = new xhss.ᲇᛶᲁᛶ
            byte[] r5 = r10.f2341
            r8.<init>(r5, r13)
        L63:
            int r6 = r6 * 2
            int r6 = r6 + r9
            int r6 = r6 + r13
            java.lang.String r13 = r10.m1184(r6, r0)
            int r6 = r6 + 2
            r4 = r4 & (-256(0xffffffffffffff00, float:NaN))
            xhss.ᲇᲇᲈᛷ r5 = r11.f3116
            if (r14 == 0) goto L7c
            xhss.ᛱᲇᲈᛶ r7 = r11.f3153
            xhss.ᛱᲇᲈᛶ r13 = xhss.C0110.m302(r5, r4, r8, r13, r7)
            r11.f3153 = r13
            goto L84
        L7c:
            xhss.ᛱᲇᲈᛶ r7 = r11.f3164
            xhss.ᛱᲇᲈᛶ r13 = xhss.C0110.m302(r5, r4, r8, r13, r7)
            r11.f3164 = r13
        L84:
            int r13 = r10.m1182(r13, r6, r9, r0)
            goto L92
        L89:
            int r6 = r6 * 2
            int r6 = r6 + 3
            int r6 = r6 + r13
            int r13 = r10.m1182(r8, r6, r9, r0)
        L92:
            int r3 = r3 + 1
            goto Lb
        L96:
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final int m1179(int r1) {
            r0 = this;
            byte[] r0 = r0.f2341
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public final void m1180(xhss.C0962 r8, xhss.C0720 r9, int r10, boolean r11) {
            r7 = this;
            int r0 = r10 + 1
            byte[] r1 = r7.f2341
            r10 = r1[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r11 == 0) goto Ld
            r8.f3158 = r10
            goto Lf
        Ld:
            r8.f3155 = r10
        Lf:
            char[] r9 = r9.f2392
            r1 = 0
        L12:
            if (r1 >= r10) goto L5d
            int r2 = r7.m1181(r0)
            int r0 = r0 + 2
        L1a:
            int r3 = r2 + (-1)
            if (r2 <= 0) goto L5a
            java.lang.String r2 = r7.m1184(r0, r9)
            int r0 = r0 + 2
            xhss.ᲇᲇᲈᛷ r4 = r8.f3116
            java.lang.String r5 = r8.f3152
            if (r11 == 0) goto L3f
            xhss.ᛱᲇᲈᛶ[] r6 = r8.f3127
            if (r6 != 0) goto L36
            int r5 = xhss.C0843.m1421(r5)
            xhss.ᛱᲇᲈᛶ[] r6 = new xhss.C0110[r5]
            r8.f3127 = r6
        L36:
            r5 = r6[r1]
            xhss.ᛱᲇᲈᛶ r2 = xhss.C0110.m299(r4, r2, r5)
            r6[r1] = r2
            goto L53
        L3f:
            xhss.ᛱᲇᲈᛶ[] r6 = r8.f3135
            if (r6 != 0) goto L4b
            int r5 = xhss.C0843.m1421(r5)
            xhss.ᛱᲇᲈᛶ[] r6 = new xhss.C0110[r5]
            r8.f3135 = r6
        L4b:
            r5 = r6[r1]
            xhss.ᛱᲇᲈᛶ r2 = xhss.C0110.m299(r4, r2, r5)
            r6[r1] = r2
        L53:
            r4 = 1
            int r0 = r7.m1182(r2, r0, r4, r9)
            r2 = r3
            goto L1a
        L5a:
            int r1 = r1 + 1
            goto L12
        L5d:
            return
    }

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final int m1181(int r2) {
            r1 = this;
            byte[] r1 = r1.f2341
            r0 = r1[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 8
            int r2 = r2 + 1
            r1 = r1[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public final int m1182(xhss.C0110 r2, int r3, boolean r4, char[] r5) {
            r1 = this;
            int r0 = r1.m1181(r3)
            int r3 = r3 + 2
            if (r4 == 0) goto L18
        L8:
            int r4 = r0 + (-1)
            if (r0 <= 0) goto L23
            java.lang.String r0 = r1.m1184(r3, r5)
            int r3 = r3 + 2
            int r3 = r1.m1183(r2, r3, r0, r5)
            r0 = r4
            goto L8
        L18:
            int r4 = r0 + (-1)
            if (r0 <= 0) goto L23
            r0 = 0
            int r3 = r1.m1183(r2, r3, r0, r5)
            r0 = r4
            goto L18
        L23:
            if (r2 == 0) goto L28
            r2.m307()
        L28:
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final int m1183(xhss.C0110 r18, int r19, java.lang.String r20, char[] r21) {
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
            byte[] r10 = r0.f2341
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
            int r0 = r0.m1182(r5, r1, r8, r3)
            return r0
        L2c:
            int r1 = r19 + 3
            int r0 = r0.m1182(r5, r1, r9, r3)
            return r0
        L33:
            boolean r11 = r1.f490
            xhss.ᲇᲇᲈᛷ r12 = r1.f493
            xhss.ᲇᛶᲁᛶ r13 = r1.f491
            int r14 = r19 + 1
            r15 = r10[r19]
            r15 = r15 & 255(0xff, float:3.57E-43)
            if (r15 == r7) goto L22f
            r5 = 70
            if (r15 == r5) goto L221
            r7 = 83
            r16 = r9
            int[] r9 = r0.f2342
            if (r15 == r7) goto L20c
            r7 = 99
            if (r15 == r7) goto L1fa
            if (r15 == r6) goto L1d0
            r6 = 115(0x73, float:1.61E-43)
            if (r15 == r6) goto L1c6
            r6 = 73
            if (r15 == r6) goto L221
            r7 = 74
            if (r15 == r7) goto L221
            r11 = 90
            if (r15 == r11) goto L1af
            if (r15 == r4) goto L98
            switch(r15) {
                case 66: goto L83;
                case 67: goto L6e;
                case 68: goto L221;
                default: goto L68;
            }
        L68:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L6e:
            int r3 = r0.m1181(r14)
            r3 = r9[r3]
            int r0 = r0.m1186(r3)
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r1.m304(r0, r2)
            int r0 = r19 + 3
            return r0
        L83:
            int r3 = r0.m1181(r14)
            r3 = r9[r3]
            int r0 = r0.m1186(r3)
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r1.m304(r0, r2)
            int r0 = r19 + 3
            return r0
        L98:
            int r4 = r0.m1181(r14)
            int r12 = r19 + 3
            if (r4 != 0) goto La9
            xhss.ᛱᲇᲈᛶ r1 = r1.m305(r2)
            int r0 = r0.m1182(r1, r14, r8, r3)
            return r0
        La9:
            r10 = r10[r12]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r10 == r5) goto L190
            r5 = 83
            if (r10 == r5) goto L174
            if (r10 == r11) goto L152
            if (r10 == r6) goto L137
            if (r10 == r7) goto L11c
            switch(r10) {
                case 66: goto L100;
                case 67: goto Le4;
                case 68: goto Lc5;
                default: goto Lbc;
            }
        Lbc:
            xhss.ᛱᲇᲈᛶ r1 = r1.m305(r2)
            int r0 = r0.m1182(r1, r14, r8, r3)
            return r0
        Lc5:
            double[] r3 = new double[r4]
        Lc7:
            if (r8 >= r4) goto Le0
            int r5 = r12 + 1
            int r5 = r0.m1181(r5)
            r5 = r9[r5]
            long r5 = r0.m1192(r5)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto Lc7
        Le0:
            r1.m304(r3, r2)
            return r12
        Le4:
            char[] r3 = new char[r4]
        Le6:
            if (r8 >= r4) goto Lfc
            int r5 = r12 + 1
            int r5 = r0.m1181(r5)
            r5 = r9[r5]
            int r5 = r0.m1186(r5)
            char r5 = (char) r5
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto Le6
        Lfc:
            r1.m304(r3, r2)
            return r12
        L100:
            byte[] r3 = new byte[r4]
        L102:
            if (r8 >= r4) goto L118
            int r5 = r12 + 1
            int r5 = r0.m1181(r5)
            r5 = r9[r5]
            int r5 = r0.m1186(r5)
            byte r5 = (byte) r5
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L102
        L118:
            r1.m304(r3, r2)
            return r12
        L11c:
            long[] r3 = new long[r4]
        L11e:
            if (r8 >= r4) goto L133
            int r5 = r12 + 1
            int r5 = r0.m1181(r5)
            r5 = r9[r5]
            long r5 = r0.m1192(r5)
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L11e
        L133:
            r1.m304(r3, r2)
            return r12
        L137:
            int[] r3 = new int[r4]
        L139:
            if (r8 >= r4) goto L14e
            int r5 = r12 + 1
            int r5 = r0.m1181(r5)
            r5 = r9[r5]
            int r5 = r0.m1186(r5)
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L139
        L14e:
            r1.m304(r3, r2)
            return r12
        L152:
            boolean[] r3 = new boolean[r4]
            r5 = r8
        L155:
            if (r5 >= r4) goto L170
            int r6 = r12 + 1
            int r6 = r0.m1181(r6)
            r6 = r9[r6]
            int r6 = r0.m1186(r6)
            if (r6 == 0) goto L168
            r6 = r16
            goto L169
        L168:
            r6 = r8
        L169:
            r3[r5] = r6
            int r12 = r12 + 3
            int r5 = r5 + 1
            goto L155
        L170:
            r1.m304(r3, r2)
            return r12
        L174:
            short[] r3 = new short[r4]
        L176:
            if (r8 >= r4) goto L18c
            int r5 = r12 + 1
            int r5 = r0.m1181(r5)
            r5 = r9[r5]
            int r5 = r0.m1186(r5)
            short r5 = (short) r5
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L176
        L18c:
            r1.m304(r3, r2)
            return r12
        L190:
            float[] r3 = new float[r4]
        L192:
            if (r8 >= r4) goto L1ab
            int r5 = r12 + 1
            int r5 = r0.m1181(r5)
            r5 = r9[r5]
            int r5 = r0.m1186(r5)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r3[r8] = r5
            int r12 = r12 + 3
            int r8 = r8 + 1
            goto L192
        L1ab:
            r1.m304(r3, r2)
            return r12
        L1af:
            int r3 = r0.m1181(r14)
            r3 = r9[r3]
            int r0 = r0.m1186(r3)
            if (r0 != 0) goto L1be
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L1c0
        L1be:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
        L1c0:
            r1.m304(r0, r2)
            int r0 = r19 + 3
            return r0
        L1c6:
            java.lang.String r0 = r0.m1184(r14, r3)
            r1.m304(r0, r2)
            int r0 = r19 + 3
            return r0
        L1d0:
            java.lang.String r4 = r0.m1184(r14, r3)
            int r5 = r19 + 3
            java.lang.String r0 = r0.m1184(r5, r3)
            int r3 = r1.f492
            int r3 = r3 + 1
            r1.f492 = r3
            if (r11 == 0) goto L1e9
            int r1 = r12.m1783(r2)
            r13.m1708(r1)
        L1e9:
            int r1 = r12.m1783(r4)
            r13.m1704(r6, r1)
            int r0 = r12.m1783(r0)
            r13.m1708(r0)
            int r0 = r19 + 5
            return r0
        L1fa:
            java.lang.String r0 = r0.m1184(r14, r3)
            int r3 = r0.length()
            xhss.ᲀᛲᲀᲈ r0 = xhss.C0843.m1425(r0, r8, r3)
            r1.m304(r0, r2)
            int r0 = r19 + 3
            return r0
        L20c:
            int r3 = r0.m1181(r14)
            r3 = r9[r3]
            int r0 = r0.m1186(r3)
            short r0 = (short) r0
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            r1.m304(r0, r2)
            int r0 = r19 + 3
            return r0
        L221:
            int r4 = r0.m1181(r14)
            java.lang.Object r0 = r0.m1187(r4, r3)
            r1.m304(r0, r2)
            int r0 = r19 + 3
            return r0
        L22f:
            r16 = r9
            java.lang.String r4 = r0.m1184(r14, r3)
            int r6 = r1.f492
            int r6 = r6 + 1
            r1.f492 = r6
            if (r11 == 0) goto L244
            int r1 = r12.m1783(r2)
            r13.m1708(r1)
        L244:
            int r1 = r12.m1783(r4)
            r13.m1704(r7, r1)
            r13.m1708(r8)
            xhss.ᛱᲇᲈᛶ r1 = new xhss.ᛱᲇᲈᛶ
            r2 = r16
            r1.<init>(r12, r2, r13, r5)
            int r4 = r19 + 3
            int r0 = r0.m1182(r1, r4, r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final java.lang.String m1184(int r2, char[] r3) {
            r1 = this;
            int r0 = r1.m1181(r2)
            if (r2 == 0) goto Le
            if (r0 != 0) goto L9
            goto Le
        L9:
            java.lang.String r1 = r1.m1177(r0, r3)
            return r1
        Le:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final short m1185(int r2) {
            r1 = this;
            byte[] r1 = r1.f2341
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

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final int m1186(int r3) {
            r2 = this;
            byte[] r2 = r2.f2341
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

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.lang.Object m1187(int r13, char[] r14) {
            r12 = this;
            int[] r0 = r12.f2342
            r1 = r0[r13]
            int r2 = r1 + (-1)
            byte[] r3 = r12.f2341
            r2 = r3[r2]
            r4 = 0
            switch(r2) {
                case 3: goto Le8;
                case 4: goto Ldb;
                case 5: goto Ld2;
                case 6: goto Lc5;
                case 7: goto Laa;
                case 8: goto La5;
                default: goto Le;
            }
        Le:
            r5 = 11
            switch(r2) {
                case 15: goto L75;
                case 16: goto L67;
                case 17: goto L19;
                default: goto L13;
            }
        L13:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            r12.<init>()
            throw r12
        L19:
            xhss.ᲈᛶᛵᛴ[] r2 = r12.f2343
            r3 = r2[r13]
            if (r3 == 0) goto L20
            return r3
        L20:
            int r3 = r1 + 2
            int r3 = r12.m1181(r3)
            r0 = r0[r3]
            java.lang.String r3 = r12.m1184(r0, r14)
            int r0 = r0 + 2
            java.lang.String r0 = r12.m1184(r0, r14)
            int[] r5 = r12.f2347
            int r1 = r12.m1181(r1)
            r1 = r5[r1]
            int r5 = r12.m1181(r1)
            java.lang.Object r5 = r12.m1187(r5, r14)
            xhss.ᛷᛸᛴᛳ r5 = (xhss.C0683) r5
            int r6 = r1 + 2
            int r6 = r12.m1181(r6)
            java.lang.Object[] r7 = new java.lang.Object[r6]
            int r1 = r1 + 4
        L4e:
            if (r4 >= r6) goto L5f
            int r8 = r12.m1181(r1)
            java.lang.Object r8 = r12.m1187(r8, r14)
            r7[r4] = r8
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L4e
        L5f:
            xhss.ᲈᛶᛵᛴ r12 = new xhss.ᲈᛶᛵᛴ
            r12.<init>(r3, r0, r5, r7)
            r2[r13] = r12
            return r12
        L67:
            java.lang.String r12 = r12.m1184(r1, r14)
            xhss.ᲀᛲᲀᲈ r13 = new xhss.ᲀᛲᲀᲈ
            int r14 = r12.length()
            r13.<init>(r5, r4, r14, r12)
            return r13
        L75:
            int r7 = r12.m1179(r1)
            r13 = 1
            int r1 = r1 + r13
            int r1 = r12.m1181(r1)
            r1 = r0[r1]
            int r2 = r1 + 2
            int r2 = r12.m1181(r2)
            r0 = r0[r2]
            java.lang.String r8 = r12.m1191(r1, r14)
            java.lang.String r9 = r12.m1184(r0, r14)
            int r0 = r0 + 2
            java.lang.String r10 = r12.m1184(r0, r14)
            int r1 = r1 - r13
            r12 = r3[r1]
            if (r12 != r5) goto L9e
            r11 = r13
            goto L9f
        L9e:
            r11 = r4
        L9f:
            xhss.ᛷᛸᛴᛳ r6 = new xhss.ᛷᛸᛴᛳ
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        La5:
            java.lang.String r12 = r12.m1184(r1, r14)
            return r12
        Laa:
            java.lang.String r12 = r12.m1184(r1, r14)
            xhss.ᲀᛲᲀᲈ r13 = new xhss.ᲀᛲᲀᲈ
            char r14 = r12.charAt(r4)
            r0 = 91
            if (r14 != r0) goto Lbb
            r14 = 9
            goto Lbd
        Lbb:
            r14 = 12
        Lbd:
            int r0 = r12.length()
            r13.<init>(r14, r4, r0, r12)
            return r13
        Lc5:
            long r12 = r12.m1192(r1)
            double r12 = java.lang.Double.longBitsToDouble(r12)
            java.lang.Double r12 = java.lang.Double.valueOf(r12)
            return r12
        Ld2:
            long r12 = r12.m1192(r1)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            return r12
        Ldb:
            int r12 = r12.m1186(r1)
            float r12 = java.lang.Float.intBitsToFloat(r12)
            java.lang.Float r12 = java.lang.Float.valueOf(r12)
            return r12
        Le8:
            int r12 = r12.m1186(r1)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            return r12
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public final int m1188(int r4, java.lang.Object[] r5, int r6, char[] r7, xhss.C0985[] r8) {
            r3 = this;
            int r0 = r4 + 1
            byte[] r1 = r3.f2341
            r1 = r1[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 3
            switch(r1) {
                case 0: goto L54;
                case 1: goto L4c;
                case 2: goto L44;
                case 3: goto L3d;
                case 4: goto L35;
                case 5: goto L2d;
                case 6: goto L25;
                case 7: goto L1e;
                case 8: goto L12;
                default: goto Lc;
            }
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>()
            throw r3
        L12:
            int r3 = r3.m1181(r0)
            xhss.ᲁᲁᛱᲀ r3 = m1172(r3, r8)
            r5[r6] = r3
        L1c:
            int r4 = r4 + r2
            return r4
        L1e:
            java.lang.String r3 = r3.m1191(r0, r7)
            r5[r6] = r3
            goto L1c
        L25:
            r3 = 6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r6] = r3
            return r0
        L2d:
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r6] = r3
            return r0
        L35:
            r3 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r6] = r3
            return r0
        L3d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r5[r6] = r3
            return r0
        L44:
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r6] = r3
            return r0
        L4c:
            r3 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r6] = r3
            return r0
        L54:
            r3 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5[r6] = r3
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final xhss.C0623 m1189(xhss.C0623[] r7, java.lang.String r8, int r9, int r10) {
            r6 = this;
            int r0 = r7.length
            r1 = 0
            r2 = r1
        L3:
            byte[] r3 = r6.f2341
            if (r2 >= r0) goto L30
            r4 = r7[r2]
            java.lang.Object r5 = r4.f2151
            java.lang.String r5 = (java.lang.String) r5
            boolean r5 = r5.equals(r8)
            if (r5 == 0) goto L2d
            xhss.ᛷᛱᛳᲁ r6 = new xhss.ᛷᛱᛳᲁ
            java.lang.Object r7 = r4.f2151
            java.lang.String r7 = (java.lang.String) r7
            r6.<init>(r7)
            xhss.ᲇᛶᲁᛶ r7 = new xhss.ᲇᛶᲁᛶ
            byte[] r8 = new byte[r10]
            java.lang.System.arraycopy(r3, r9, r8, r1, r10)
            r7.<init>(r1)
            r7.f3374 = r8
            r7.f3375 = r10
            r6.f2153 = r7
            return r6
        L2d:
            int r2 = r2 + 1
            goto L3
        L30:
            xhss.ᛷᛱᛳᲁ r6 = new xhss.ᛷᛱᛳᲁ
            r6.<init>(r8)
            xhss.ᲇᛶᲁᛶ r7 = new xhss.ᲇᛶᲁᛶ
            byte[] r8 = new byte[r10]
            java.lang.System.arraycopy(r3, r9, r8, r1, r10)
            r7.<init>(r1)
            r7.f3374 = r8
            r7.f3375 = r10
            r6.f2153 = r7
            return r6
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m1190(xhss.C0962 r54, xhss.C0720 r55, int r56) {
            r53 = this;
            r0 = r53
            r1 = r54
            r8 = r55
            r2 = r56
            int r7 = r1.f3121
            xhss.ᲇᛶᲁᛶ r9 = r1.f3150
            xhss.ᲇᲇᲈᛷ r10 = r1.f3116
            char[] r11 = r8.f2392
            int r12 = r0.m1181(r2)
            int r3 = r2 + 2
            int r3 = r0.m1181(r3)
            int r4 = r2 + 4
            int r13 = r0.m1186(r4)
            r14 = 8
            int r15 = r2 + 8
            byte[] r2 = r0.f2341
            int r4 = r2.length
            int r4 = r4 - r15
            if (r13 > r4) goto Le31
            int r4 = r15 + r13
            int r5 = r13 + 1
            xhss.ᲁᲁᛱᲀ[] r5 = new xhss.C0985[r5]
            r8.f2405 = r5
            r6 = r15
        L33:
            r56 = r2
            r16 = r14
            r14 = 255(0xff, float:3.57E-43)
            r18 = 1
            if (r6 >= r4) goto Lff
            int r19 = r6 - r15
            r20 = 4
            r2 = r56[r6]
            r2 = r2 & r14
            switch(r2) {
                case 0: goto Lf7;
                case 1: goto Lf7;
                case 2: goto Lf7;
                case 3: goto Lf7;
                case 4: goto Lf7;
                case 5: goto Lf7;
                case 6: goto Lf7;
                case 7: goto Lf7;
                case 8: goto Lf7;
                case 9: goto Lf7;
                case 10: goto Lf7;
                case 11: goto Lf7;
                case 12: goto Lf7;
                case 13: goto Lf7;
                case 14: goto Lf7;
                case 15: goto Lf7;
                case 16: goto Lf4;
                case 17: goto L58;
                case 18: goto Lf4;
                case 19: goto L58;
                case 20: goto L58;
                case 21: goto Lf4;
                case 22: goto Lf4;
                case 23: goto Lf4;
                case 24: goto Lf4;
                case 25: goto Lf4;
                case 26: goto Lf7;
                case 27: goto Lf7;
                case 28: goto Lf7;
                case 29: goto Lf7;
                case 30: goto Lf7;
                case 31: goto Lf7;
                case 32: goto Lf7;
                case 33: goto Lf7;
                case 34: goto Lf7;
                case 35: goto Lf7;
                case 36: goto Lf7;
                case 37: goto Lf7;
                case 38: goto Lf7;
                case 39: goto Lf7;
                case 40: goto Lf7;
                case 41: goto Lf7;
                case 42: goto Lf7;
                case 43: goto Lf7;
                case 44: goto Lf7;
                case 45: goto Lf7;
                case 46: goto Lf7;
                case 47: goto Lf7;
                case 48: goto Lf7;
                case 49: goto Lf7;
                case 50: goto Lf7;
                case 51: goto Lf7;
                case 52: goto Lf7;
                case 53: goto Lf7;
                case 54: goto Lf4;
                case 55: goto Lf4;
                case 56: goto Lf4;
                case 57: goto Lf4;
                case 58: goto Lf4;
                case 59: goto Lf7;
                case 60: goto Lf7;
                case 61: goto Lf7;
                case 62: goto Lf7;
                case 63: goto Lf7;
                case 64: goto Lf7;
                case 65: goto Lf7;
                case 66: goto Lf7;
                case 67: goto Lf7;
                case 68: goto Lf7;
                case 69: goto Lf7;
                case 70: goto Lf7;
                case 71: goto Lf7;
                case 72: goto Lf7;
                case 73: goto Lf7;
                case 74: goto Lf7;
                case 75: goto Lf7;
                case 76: goto Lf7;
                case 77: goto Lf7;
                case 78: goto Lf7;
                case 79: goto Lf7;
                case 80: goto Lf7;
                case 81: goto Lf7;
                case 82: goto Lf7;
                case 83: goto Lf7;
                case 84: goto Lf7;
                case 85: goto Lf7;
                case 86: goto Lf7;
                case 87: goto Lf7;
                case 88: goto Lf7;
                case 89: goto Lf7;
                case 90: goto Lf7;
                case 91: goto Lf7;
                case 92: goto Lf7;
                case 93: goto Lf7;
                case 94: goto Lf7;
                case 95: goto Lf7;
                case 96: goto Lf7;
                case 97: goto Lf7;
                case 98: goto Lf7;
                case 99: goto Lf7;
                case 100: goto Lf7;
                case 101: goto Lf7;
                case 102: goto Lf7;
                case 103: goto Lf7;
                case 104: goto Lf7;
                case 105: goto Lf7;
                case 106: goto Lf7;
                case 107: goto Lf7;
                case 108: goto Lf7;
                case 109: goto Lf7;
                case 110: goto Lf7;
                case 111: goto Lf7;
                case 112: goto Lf7;
                case 113: goto Lf7;
                case 114: goto Lf7;
                case 115: goto Lf7;
                case 116: goto Lf7;
                case 117: goto Lf7;
                case 118: goto Lf7;
                case 119: goto Lf7;
                case 120: goto Lf7;
                case 121: goto Lf7;
                case 122: goto Lf7;
                case 123: goto Lf7;
                case 124: goto Lf7;
                case 125: goto Lf7;
                case 126: goto Lf7;
                case 127: goto Lf7;
                case 128: goto Lf7;
                case 129: goto Lf7;
                case 130: goto Lf7;
                case 131: goto Lf7;
                case 132: goto L58;
                case 133: goto Lf7;
                case 134: goto Lf7;
                case 135: goto Lf7;
                case 136: goto Lf7;
                case 137: goto Lf7;
                case 138: goto Lf7;
                case 139: goto Lf7;
                case 140: goto Lf7;
                case 141: goto Lf7;
                case 142: goto Lf7;
                case 143: goto Lf7;
                case 144: goto Lf7;
                case 145: goto Lf7;
                case 146: goto Lf7;
                case 147: goto Lf7;
                case 148: goto Lf7;
                case 149: goto Lf7;
                case 150: goto Lf7;
                case 151: goto Lf7;
                case 152: goto Lf7;
                case 153: goto Le7;
                case 154: goto Le7;
                case 155: goto Le7;
                case 156: goto Le7;
                case 157: goto Le7;
                case 158: goto Le7;
                case 159: goto Le7;
                case 160: goto Le7;
                case 161: goto Le7;
                case 162: goto Le7;
                case 163: goto Le7;
                case 164: goto Le7;
                case 165: goto Le7;
                case 166: goto Le7;
                case 167: goto Le7;
                case 168: goto Le7;
                case 169: goto Lf4;
                case 170: goto Lb7;
                case 171: goto L8c;
                case 172: goto Lf7;
                case 173: goto Lf7;
                case 174: goto Lf7;
                case 175: goto Lf7;
                case 176: goto Lf7;
                case 177: goto Lf7;
                case 178: goto L58;
                case 179: goto L58;
                case 180: goto L58;
                case 181: goto L58;
                case 182: goto L58;
                case 183: goto L58;
                case 184: goto L58;
                case 185: goto L67;
                case 186: goto L67;
                case 187: goto L58;
                case 188: goto Lf4;
                case 189: goto L58;
                case 190: goto Lf7;
                case 191: goto Lf7;
                case 192: goto L58;
                case 193: goto L58;
                case 194: goto Lf7;
                case 195: goto Lf7;
                case 196: goto L6f;
                case 197: goto L6b;
                case 198: goto Le7;
                case 199: goto Le7;
                case 200: goto L5c;
                case 201: goto L5c;
                case 202: goto L4d;
                case 203: goto L4d;
                case 204: goto L4d;
                case 205: goto L4d;
                case 206: goto L4d;
                case 207: goto L4d;
                case 208: goto L4d;
                case 209: goto L4d;
                case 210: goto L4d;
                case 211: goto L4d;
                case 212: goto L4d;
                case 213: goto L4d;
                case 214: goto L4d;
                case 215: goto L4d;
                case 216: goto L4d;
                case 217: goto L4d;
                case 218: goto L4d;
                case 219: goto L4d;
                case 220: goto L5c;
                default: goto L47;
            }
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L4d:
            int r2 = r6 + 1
            int r2 = r0.m1181(r2)
            int r2 = r2 + r19
            m1172(r2, r5)
        L58:
            int r6 = r6 + 3
            goto Lf9
        L5c:
            int r2 = r6 + 1
            int r2 = r0.m1186(r2)
            int r2 = r2 + r19
            m1172(r2, r5)
        L67:
            int r6 = r6 + 5
            goto Lf9
        L6b:
            int r6 = r6 + 4
            goto Lf9
        L6f:
            int r2 = r6 + 1
            r2 = r56[r2]
            r2 = r2 & r14
            r14 = 132(0x84, float:1.85E-43)
            if (r2 == r14) goto L88
            r14 = 169(0xa9, float:2.37E-43)
            if (r2 == r14) goto L6b
            switch(r2) {
                case 21: goto L6b;
                case 22: goto L6b;
                case 23: goto L6b;
                case 24: goto L6b;
                case 25: goto L6b;
                default: goto L7f;
            }
        L7f:
            switch(r2) {
                case 54: goto L6b;
                case 55: goto L6b;
                case 56: goto L6b;
                case 57: goto L6b;
                case 58: goto L6b;
                default: goto L82;
            }
        L82:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L88:
            int r6 = r6 + 6
            goto Lf9
        L8c:
            r2 = r19 & 3
            int r2 = 4 - r2
            int r2 = r2 + r6
            int r6 = r0.m1186(r2)
            int r6 = r6 + r19
            m1172(r6, r5)
            int r6 = r2 + 4
            int r6 = r0.m1186(r6)
            int r2 = r2 + 8
        La2:
            int r14 = r6 + (-1)
            if (r6 <= 0) goto Lb5
            int r6 = r2 + 4
            int r6 = r0.m1186(r6)
            int r6 = r6 + r19
            m1172(r6, r5)
            int r2 = r2 + 8
            r6 = r14
            goto La2
        Lb5:
            r6 = r2
            goto Lf9
        Lb7:
            r2 = r19 & 3
            int r2 = 4 - r2
            int r2 = r2 + r6
            int r6 = r0.m1186(r2)
            int r6 = r6 + r19
            m1172(r6, r5)
            int r6 = r2 + 8
            int r6 = r0.m1186(r6)
            int r14 = r2 + 4
            int r14 = r0.m1186(r14)
            int r6 = r6 - r14
            int r6 = r6 + 1
            int r2 = r2 + 12
        Ld6:
            int r14 = r6 + (-1)
            if (r6 <= 0) goto Lb5
            int r6 = r0.m1186(r2)
            int r6 = r6 + r19
            m1172(r6, r5)
            int r2 = r2 + 4
            r6 = r14
            goto Ld6
        Le7:
            int r2 = r6 + 1
            short r2 = r0.m1185(r2)
            int r2 = r2 + r19
            m1172(r2, r5)
            goto L58
        Lf4:
            int r6 = r6 + 2
            goto Lf9
        Lf7:
            int r6 = r6 + 1
        Lf9:
            r2 = r56
            r14 = r16
            goto L33
        Lff:
            r17 = 132(0x84, float:1.85E-43)
            r20 = 4
            int r2 = r0.m1181(r6)
            r19 = r2
            r2 = 2
            int r6 = r6 + r2
        L10b:
            int r21 = r19 + (-1)
            r22 = r2
            r2 = 7
            r23 = r4
            int[] r4 = r0.f2342
            r24 = r4
            if (r19 <= 0) goto L16f
            int r14 = r0.m1181(r6)
            xhss.ᲁᲁᛱᲀ r26 = m1172(r14, r5)
            int r14 = r6 + 2
            int r14 = r0.m1181(r14)
            xhss.ᲁᲁᛱᲀ r27 = m1172(r14, r5)
            int r14 = r6 + 4
            int r14 = r0.m1181(r14)
            xhss.ᲁᲁᛱᲀ r28 = m1172(r14, r5)
            int r14 = r6 + 6
            int r14 = r0.m1181(r14)
            r14 = r24[r14]
            java.lang.String r14 = r0.m1184(r14, r11)
            int r6 = r6 + 8
            xhss.ᛵᲇᲇᲇ r25 = new xhss.ᛵᲇᲇᲇ
            if (r14 == 0) goto L151
            xhss.ᛳᛴᛶᛷ r2 = r10.m1786(r14, r2)
            int r4 = r2.f965
            r29 = r4
        L14e:
            r30 = r14
            goto L154
        L151:
            r29 = 0
            goto L14e
        L154:
            r25.<init>(r26, r27, r28, r29, r30)
            r2 = r25
            xhss.ᛵᲇᲇᲇ r4 = r1.f3165
            if (r4 != 0) goto L160
            r1.f3165 = r2
            goto L164
        L160:
            xhss.ᛵᲇᲇᲇ r4 = r1.f3143
            r4.f1917 = r2
        L164:
            r1.f3143 = r2
            r19 = r21
            r2 = r22
            r4 = r23
            r14 = 255(0xff, float:3.57E-43)
            goto L10b
        L16f:
            int r14 = r0.m1181(r6)
            int r6 = r6 + 2
            r28 = r18
            r2 = 0
            r25 = 0
            r27 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
        L184:
            int r29 = r14 + (-1)
            if (r14 <= 0) goto L314
            java.lang.String r14 = r0.m1184(r6, r11)
            r30 = 0
            int r4 = r6 + 2
            int r4 = r0.m1186(r4)
            r35 = r6
            int r6 = r35 + 6
            r36 = r15
            java.lang.String r15 = "LocalVariableTable"
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L202
            int r14 = r8.f2391
            r14 = r14 & 2
            if (r14 != 0) goto L1fa
            int r14 = r0.m1181(r6)
            int r15 = r35 + 8
        L1ae:
            int r33 = r14 + (-1)
            if (r14 <= 0) goto L1f8
            int r14 = r0.m1181(r15)
            r35 = r5[r14]
            if (r35 != 0) goto L1d1
            if (r35 != 0) goto L1c3
            xhss.ᲁᲁᛱᲀ r35 = new xhss.ᲁᲁᛱᲀ
            r35.<init>()
            r5[r14] = r35
        L1c3:
            r35 = r14
            r14 = r5[r35]
            r37 = r15
            short r15 = r14.f3198
            r15 = r15 | 1
            short r15 = (short) r15
            r14.f3198 = r15
            goto L1d5
        L1d1:
            r35 = r14
            r37 = r15
        L1d5:
            int r15 = r37 + 2
            int r14 = r0.m1181(r15)
            int r14 = r14 + r35
            r15 = r5[r14]
            if (r15 != 0) goto L1f3
            if (r15 != 0) goto L1ea
            xhss.ᲁᲁᛱᲀ r15 = new xhss.ᲁᲁᛱᲀ
            r15.<init>()
            r5[r14] = r15
        L1ea:
            r14 = r5[r14]
            short r15 = r14.f3198
            r15 = r15 | 1
            short r15 = (short) r15
            r14.f3198 = r15
        L1f3:
            int r15 = r37 + 10
            r14 = r33
            goto L1ae
        L1f8:
            r33 = r6
        L1fa:
            r39 = r7
            r42 = r9
            r37 = r10
            goto L303
        L202:
            java.lang.String r15 = "LocalVariableTypeTable"
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L20d
            r34 = r6
            goto L1fa
        L20d:
            java.lang.String r15 = "LineNumberTable"
            boolean r15 = r15.equals(r14)
            if (r15 == 0) goto L2a7
            int r14 = r8.f2391
            r14 = r14 & 2
            if (r14 != 0) goto L1fa
            int r14 = r0.m1181(r6)
            int r15 = r35 + 8
        L221:
            int r35 = r14 + (-1)
            if (r14 <= 0) goto L1fa
            int r14 = r0.m1181(r15)
            r37 = r14
            int r14 = r15 + 2
            int r14 = r0.m1181(r14)
            int r15 = r15 + 4
            r38 = r5[r37]
            if (r38 != 0) goto L24e
            if (r38 != 0) goto L240
            xhss.ᲁᲁᛱᲀ r38 = new xhss.ᲁᲁᛱᲀ
            r38.<init>()
            r5[r37] = r38
        L240:
            r38 = r15
            r15 = r5[r37]
            r39 = r7
            short r7 = r15.f3198
            r7 = r7 | 1
            short r7 = (short) r7
            r15.f3198 = r7
            goto L252
        L24e:
            r39 = r7
            r38 = r15
        L252:
            r7 = r5[r37]
            short r15 = r7.f3198
            r37 = r10
            r10 = r15 & 128(0x80, float:1.8E-43)
            if (r10 != 0) goto L267
            r10 = r15 | 128(0x80, float:1.8E-43)
            short r10 = (short) r10
            r7.f3198 = r10
            short r10 = (short) r14
            r7.f3195 = r10
            r42 = r9
            goto L297
        L267:
            int[] r10 = r7.f3196
            r15 = r20
            if (r10 != 0) goto L271
            int[] r10 = new int[r15]
            r7.f3196 = r10
        L271:
            r20 = r10[r30]
            r40 = r15
            int r15 = r20 + 1
            r10[r30] = r15
            r41 = r14
            int r14 = r10.length
            if (r15 < r14) goto L291
            int r14 = r10.length
            int r14 = r14 + 4
            int[] r14 = new int[r14]
            r40 = r15
            int r15 = r10.length
            r42 = r9
            r9 = r30
            java.lang.System.arraycopy(r10, r9, r14, r9, r15)
            r7.f3196 = r14
            r10 = r14
            goto L295
        L291:
            r42 = r9
            r40 = r15
        L295:
            r10[r40] = r41
        L297:
            r14 = r35
            r10 = r37
            r15 = r38
            r7 = r39
            r9 = r42
            r20 = 4
            r30 = 0
            goto L221
        L2a7:
            r39 = r7
            r42 = r9
            r37 = r10
            java.lang.String r7 = "RuntimeVisibleTypeAnnotations"
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L2bc
            r7 = r18
            int[] r31 = r0.m1178(r1, r8, r6, r7)
            goto L303
        L2bc:
            java.lang.String r7 = "RuntimeInvisibleTypeAnnotations"
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L2ca
            r9 = 0
            int[] r32 = r0.m1178(r1, r8, r6, r9)
            goto L303
        L2ca:
            java.lang.String r7 = "StackMapTable"
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L2e1
            int r7 = r8.f2391
            r20 = 4
            r7 = r7 & 4
            if (r7 != 0) goto L303
            int r25 = r35 + 8
            int r7 = r6 + r4
            r27 = r7
            goto L303
        L2e1:
            r20 = 4
            java.lang.String r7 = "StackMap"
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L2fa
            int r7 = r8.f2391
            r7 = r7 & 4
            if (r7 != 0) goto L303
            int r25 = r35 + 8
            int r7 = r6 + r4
            r27 = r7
            r28 = 0
            goto L303
        L2fa:
            xhss.ᛷᛱᛳᲁ[] r7 = r8.f2397
            xhss.ᛷᛱᛳᲁ r7 = r0.m1189(r7, r14, r6, r4)
            r7.f2152 = r2
            r2 = r7
        L303:
            int r6 = r6 + r4
            r14 = r29
            r15 = r36
            r10 = r37
            r7 = r39
            r9 = r42
            r18 = 1
            r20 = 4
            goto L184
        L314:
            r39 = r7
            r42 = r9
            r37 = r10
            r36 = r15
            int r4 = r8.f2391
            r4 = r4 & 8
            if (r4 == 0) goto L324
            r9 = 1
            goto L325
        L324:
            r9 = 0
        L325:
            r10 = -1
            if (r25 == 0) goto L455
            r8.f2403 = r10
            r4 = 0
            r8.f2408 = r4
            r8.f2393 = r4
            r8.f2395 = r4
            java.lang.Object[] r6 = new java.lang.Object[r3]
            r8.f2402 = r6
            r8.f2399 = r4
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r8.f2394 = r4
            if (r9 == 0) goto L426
            java.lang.String r4 = r8.f2407
            int r15 = r8.f2406
            r15 = r15 & 8
            if (r15 != 0) goto L36b
            java.lang.String r15 = "<init>"
            r29 = 3
            java.lang.String r14 = r8.f2396
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L35c
            r14 = 6
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r30 = 0
            r6[r30] = r14
        L35a:
            r14 = 1
            goto L371
        L35c:
            r30 = 0
            int r14 = r0.f2344
            int r14 = r14 + 2
            char[] r15 = r8.f2392
            java.lang.String r14 = r0.m1191(r14, r15)
            r6[r30] = r14
            goto L35a
        L36b:
            r29 = 3
            r30 = 0
            r14 = r30
        L371:
            r15 = r14
            r14 = 1
        L373:
            int r10 = r14 + 1
            char r7 = r4.charAt(r14)
            r1 = 70
            if (r7 == r1) goto L414
            r1 = 76
            if (r7 == r1) goto L3f8
            r1 = 83
            if (r7 == r1) goto L3b0
            r1 = 73
            if (r7 == r1) goto L3b0
            r1 = 74
            if (r7 == r1) goto L3dc
            r1 = 90
            if (r7 == r1) goto L3b0
            r1 = 91
            if (r7 == r1) goto L3b3
            switch(r7) {
                case 66: goto L3b0;
                case 67: goto L3b0;
                case 68: goto L3a0;
                default: goto L398;
            }
        L398:
            r8.f2393 = r15
        L39a:
            r18 = 1
            r20 = 4
            goto L42c
        L3a0:
            int r1 = r15 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r29)
            r6[r15] = r7
        L3a8:
            r15 = r1
            r14 = r10
            r18 = 1
            r20 = 4
            goto L421
        L3b0:
            r20 = 4
            goto L3eb
        L3b3:
            char r7 = r4.charAt(r10)
            if (r7 != r1) goto L3bc
            int r10 = r10 + 1
            goto L3b3
        L3bc:
            char r1 = r4.charAt(r10)
            r7 = 76
            if (r1 != r7) goto L3cf
        L3c4:
            int r10 = r10 + 1
            char r1 = r4.charAt(r10)
            r7 = 59
            if (r1 == r7) goto L3cf
            goto L3c4
        L3cf:
            int r1 = r15 + 1
            r18 = 1
            int r10 = r10 + 1
            java.lang.String r7 = r4.substring(r14, r10)
            r6[r15] = r7
            goto L3a8
        L3dc:
            int r1 = r15 + 1
            r20 = 4
            java.lang.Integer r7 = java.lang.Integer.valueOf(r20)
            r6[r15] = r7
            r15 = r1
            r14 = r10
            r18 = 1
            goto L421
        L3eb:
            int r1 = r15 + 1
            r18 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r18)
            r6[r15] = r7
        L3f5:
            r15 = r1
            r14 = r10
            goto L421
        L3f8:
            r18 = 1
            r20 = 4
            r1 = r10
        L3fd:
            char r7 = r4.charAt(r1)
            r14 = 59
            if (r7 == r14) goto L408
            int r1 = r1 + 1
            goto L3fd
        L408:
            int r7 = r15 + 1
            int r14 = r1 + 1
            java.lang.String r1 = r4.substring(r10, r1)
            r6[r15] = r1
            r15 = r7
            goto L421
        L414:
            r18 = 1
            r20 = 4
            int r1 = r15 + 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r22)
            r6[r15] = r7
            goto L3f5
        L421:
            r1 = r54
            r10 = -1
            goto L373
        L426:
            r29 = 3
            r30 = 0
            goto L39a
        L42c:
            r1 = r25
        L42e:
            int r4 = r27 + (-2)
            if (r1 >= r4) goto L45d
            r4 = r56[r1]
            r6 = r16
            if (r4 != r6) goto L450
            int r4 = r1 + 1
            int r4 = r0.m1181(r4)
            if (r4 < 0) goto L450
            if (r4 >= r13) goto L450
            int r15 = r36 + r4
            r6 = r56[r15]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            r7 = 187(0xbb, float:2.62E-43)
            if (r6 != r7) goto L450
            m1172(r4, r5)
        L450:
            int r1 = r1 + 1
            r16 = 8
            goto L42e
        L455:
            r18 = 1
            r20 = 4
            r29 = 3
            r30 = 0
        L45d:
            if (r9 == 0) goto L47d
            int r1 = r8.f2391
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L47d
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
            r1.m1599(r2, r3, r4, r5, r6)
        L47a:
            r2 = r31
            goto L48a
        L47d:
            r1 = r54
            r17 = r56
            r10 = r2
            r14 = r5
            r7 = r23
            r43 = r27
            r15 = r30
            goto L47a
        L48a:
            int r4 = r0.m1175(r2, r15)
            r5 = r32
            int r6 = r0.m1175(r5, r15)
            r30 = r15
            int r15 = r8.f2391
            r15 = r15 & 256(0x100, float:3.59E-43)
            if (r15 != 0) goto L49f
            r15 = 33
            goto L4a1
        L49f:
            r15 = r30
        L4a1:
            r21 = r4
            r23 = r6
            r56 = r9
            r4 = r30
            r20 = r4
            r22 = r20
            r6 = r36
        L4af:
            if (r6 >= r7) goto Lc4c
            int r9 = r6 - r36
            r0 = r14[r9]
            r31 = r7
            if (r0 == 0) goto L4f5
            int r7 = r8.f2391
            r40 = r7
            r7 = 2
            r40 = r40 & 2
            if (r40 != 0) goto L4c5
            r40 = 1
            goto L4c7
        L4c5:
            r40 = r30
        L4c7:
            r1.m1600(r0)
            if (r40 == 0) goto L4f5
            short r7 = r0.f3198
            r40 = r2
            r2 = 128(0x80, float:1.8E-43)
            r7 = r7 & r2
            if (r7 == 0) goto L4f7
            short r2 = r0.f3195
            r7 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r7
            r1.m1585(r2, r0)
            int[] r2 = r0.f3196
            if (r2 == 0) goto L4f7
            r2 = 1
        L4e3:
            int[] r7 = r0.f3196
            r41 = r3
            r3 = r7[r30]
            if (r2 > r3) goto L4f9
            r3 = r7[r2]
            r1.m1585(r3, r0)
            int r2 = r2 + 1
            r3 = r41
            goto L4e3
        L4f5:
            r40 = r2
        L4f7:
            r41 = r3
        L4f9:
            r7 = r25
        L4fb:
            if (r7 == 0) goto L67d
            int r0 = r8.f2403
            r2 = -1
            if (r0 == r9) goto L50e
            if (r0 != r2) goto L505
            goto L50e
        L505:
            r47 = r2
        L507:
            r0 = r5
            r25 = r6
            r6 = r40
            goto L681
        L50e:
            if (r0 == r2) goto L53c
            if (r28 == 0) goto L514
            if (r56 == 0) goto L518
        L514:
            r0 = r5
            r25 = r6
            goto L529
        L518:
            int r2 = r8.f2408
            int r3 = r8.f2395
            r0 = r5
            java.lang.Object[] r5 = r8.f2402
            int r4 = r8.f2399
            r25 = r6
            java.lang.Object[] r6 = r8.f2394
            r1.m1599(r2, r3, r4, r5, r6)
            goto L537
        L529:
            int r3 = r8.f2393
            java.lang.Object[] r5 = r8.f2402
            int r4 = r8.f2399
            java.lang.Object[] r6 = r8.f2394
            r2 = -1
            r1 = r54
            r1.m1599(r2, r3, r4, r5, r6)
        L537:
            r6 = r30
        L539:
            r1 = r43
            goto L541
        L53c:
            r0 = r5
            r25 = r6
            r6 = r4
            goto L539
        L541:
            if (r7 >= r1) goto L66c
            char[] r4 = r8.f2392
            xhss.ᲁᲁᛱᲀ[] r5 = r8.f2405
            if (r28 == 0) goto L554
            int r2 = r7 + 1
            r3 = r17[r7]
            r7 = 255(0xff, float:3.57E-43)
            r3 = r3 & r7
            r7 = r2
        L551:
            r2 = r30
            goto L55a
        L554:
            r2 = -1
            r8.f2403 = r2
            r3 = 255(0xff, float:3.57E-43)
            goto L551
        L55a:
            r8.f2395 = r2
            r2 = 64
            if (r3 >= r2) goto L573
            r2 = r29
            r8.f2408 = r2
            r2 = 0
            r8.f2399 = r2
            r43 = r1
            r49 = r6
            r1 = r7
            r35 = 128(0x80, float:1.8E-43)
            r47 = -1
            r7 = r0
            goto L64c
        L573:
            r2 = 128(0x80, float:1.8E-43)
            if (r3 >= r2) goto L599
            int r32 = r3 + (-64)
            r3 = r2
            java.lang.Object[] r2 = r8.f2394
            r43 = r3
            r3 = 0
            r35 = r43
            r47 = -1
            r43 = r1
            r1 = r7
            r7 = r0
            r0 = r53
            int r1 = r0.m1188(r1, r2, r3, r4, r5)
            r2 = 4
            r8.f2408 = r2
            r3 = 1
            r8.f2399 = r3
            r49 = r6
        L595:
            r3 = r32
            goto L64c
        L599:
            r43 = r1
            r35 = r2
            r1 = r7
            r47 = -1
            r7 = r0
            r0 = r53
            r2 = 247(0xf7, float:3.46E-43)
            if (r3 < r2) goto L666
            int r32 = r0.m1181(r1)
            r48 = r1
            int r1 = r48 + 2
            if (r3 != r2) goto L5c1
            java.lang.Object[] r2 = r8.f2394
            r3 = 0
            r49 = r6
            r6 = 4
            int r1 = r0.m1188(r1, r2, r3, r4, r5)
            r8.f2408 = r6
            r3 = 1
            r8.f2399 = r3
            goto L595
        L5c1:
            r49 = r6
            r6 = 4
            r0 = 248(0xf8, float:3.48E-43)
            r2 = 251(0xfb, float:3.52E-43)
            if (r3 < r0) goto L5dc
            if (r3 >= r2) goto L5dc
            r0 = 2
            r8.f2408 = r0
            int r0 = 251 - r3
            r8.f2395 = r0
            int r2 = r8.f2393
            int r2 = r2 - r0
            r8.f2393 = r2
            r0 = 0
            r8.f2399 = r0
            goto L595
        L5dc:
            r0 = 0
            if (r3 != r2) goto L5e5
            r2 = 3
            r8.f2408 = r2
            r8.f2399 = r0
            goto L595
        L5e5:
            r0 = 255(0xff, float:3.57E-43)
            if (r3 >= r0) goto L61b
            if (r56 == 0) goto L5ee
            int r0 = r8.f2393
            goto L5ef
        L5ee:
            r0 = 0
        L5ef:
            int r2 = r3 + (-251)
            r3 = r0
            r46 = r2
        L5f4:
            if (r46 <= 0) goto L609
            r0 = r2
            java.lang.Object[] r2 = r8.f2402
            int r48 = r3 + 1
            r6 = r0
            r0 = r53
            int r1 = r0.m1188(r1, r2, r3, r4, r5)
            int r46 = r46 + (-1)
            r2 = r6
            r3 = r48
            r6 = 4
            goto L5f4
        L609:
            r3 = 1
            r0 = r53
            r6 = r2
            r8.f2408 = r3
            r8.f2395 = r6
            int r2 = r8.f2393
            int r2 = r2 + r6
            r8.f2393 = r2
            r2 = 0
            r8.f2399 = r2
            goto L595
        L61b:
            r2 = 0
            r0 = r53
            int r6 = r0.m1181(r1)
            int r1 = r48 + 4
            r8.f2408 = r2
            r8.f2395 = r6
            r8.f2393 = r6
            r3 = 0
        L62b:
            if (r3 >= r6) goto L636
            java.lang.Object[] r2 = r8.f2402
            int r1 = r0.m1188(r1, r2, r3, r4, r5)
            int r3 = r3 + 1
            goto L62b
        L636:
            int r6 = r0.m1181(r1)
            int r1 = r1 + 2
            r8.f2399 = r6
            r3 = 0
        L63f:
            if (r3 >= r6) goto L595
            java.lang.Object[] r2 = r8.f2394
            int r1 = r0.m1188(r1, r2, r3, r4, r5)
            int r3 = r3 + 1
            r0 = r53
            goto L63f
        L64c:
            int r0 = r8.f2403
            r18 = 1
            int r3 = r3 + 1
            int r3 = r3 + r0
            r8.f2403 = r3
            m1172(r3, r5)
            r5 = r7
            r6 = r25
            r4 = r49
            r29 = 3
            r30 = 0
            r7 = r1
        L662:
            r1 = r54
            goto L4fb
        L666:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L66c:
            r49 = r6
            r47 = -1
            r5 = r0
            r43 = r1
            r6 = r25
            r4 = r49
            r7 = 0
            r29 = 3
            r30 = 0
            goto L662
        L67d:
            r47 = -1
            goto L507
        L681:
            if (r4 == 0) goto L6ab
            int r1 = r8.f2391
            r16 = 8
            r1 = r1 & 8
            if (r1 == 0) goto L69f
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
            r0.m1599(r1, r2, r3, r4, r5)
            r1 = r0
            goto L6a8
        L69f:
            r1 = r54
            r32 = r7
            r35 = r10
            r7 = r53
            r10 = r0
        L6a8:
            r27 = 0
            goto L6b6
        L6ab:
            r1 = r54
            r32 = r7
            r35 = r10
            r7 = r53
            r10 = r0
            r27 = r4
        L6b6:
            r0 = r17[r25]
            r2 = 255(0xff, float:3.57E-43)
            r0 = r0 & r2
            r2 = 200(0xc8, float:2.8E-43)
            switch(r0) {
                case 0: goto Lb7c;
                case 1: goto Lb7c;
                case 2: goto Lb7c;
                case 3: goto Lb7c;
                case 4: goto Lb7c;
                case 5: goto Lb7c;
                case 6: goto Lb7c;
                case 7: goto Lb7c;
                case 8: goto Lb7c;
                case 9: goto Lb7c;
                case 10: goto Lb7c;
                case 11: goto Lb7c;
                case 12: goto Lb7c;
                case 13: goto Lb7c;
                case 14: goto Lb7c;
                case 15: goto Lb7c;
                case 16: goto Lb5c;
                case 17: goto Lb38;
                case 18: goto Lb0c;
                case 19: goto Lae7;
                case 20: goto Lae7;
                case 21: goto Lac3;
                case 22: goto Lac3;
                case 23: goto Lac3;
                case 24: goto Lac3;
                case 25: goto Lac3;
                case 26: goto La9f;
                case 27: goto La9f;
                case 28: goto La9f;
                case 29: goto La9f;
                case 30: goto La9f;
                case 31: goto La9f;
                case 32: goto La9f;
                case 33: goto La9f;
                case 34: goto La9f;
                case 35: goto La9f;
                case 36: goto La9f;
                case 37: goto La9f;
                case 38: goto La9f;
                case 39: goto La9f;
                case 40: goto La9f;
                case 41: goto La9f;
                case 42: goto La9f;
                case 43: goto La9f;
                case 44: goto La9f;
                case 45: goto La9f;
                case 46: goto Lb7c;
                case 47: goto Lb7c;
                case 48: goto Lb7c;
                case 49: goto Lb7c;
                case 50: goto Lb7c;
                case 51: goto Lb7c;
                case 52: goto Lb7c;
                case 53: goto Lb7c;
                case 54: goto Lac3;
                case 55: goto Lac3;
                case 56: goto Lac3;
                case 57: goto Lac3;
                case 58: goto Lac3;
                case 59: goto La79;
                case 60: goto La79;
                case 61: goto La79;
                case 62: goto La79;
                case 63: goto La79;
                case 64: goto La79;
                case 65: goto La79;
                case 66: goto La79;
                case 67: goto La79;
                case 68: goto La79;
                case 69: goto La79;
                case 70: goto La79;
                case 71: goto La79;
                case 72: goto La79;
                case 73: goto La79;
                case 74: goto La79;
                case 75: goto La79;
                case 76: goto La79;
                case 77: goto La79;
                case 78: goto La79;
                case 79: goto Lb7c;
                case 80: goto Lb7c;
                case 81: goto Lb7c;
                case 82: goto Lb7c;
                case 83: goto Lb7c;
                case 84: goto Lb7c;
                case 85: goto Lb7c;
                case 86: goto Lb7c;
                case 87: goto Lb7c;
                case 88: goto Lb7c;
                case 89: goto Lb7c;
                case 90: goto Lb7c;
                case 91: goto Lb7c;
                case 92: goto Lb7c;
                case 93: goto Lb7c;
                case 94: goto Lb7c;
                case 95: goto Lb7c;
                case 96: goto Lb7c;
                case 97: goto Lb7c;
                case 98: goto Lb7c;
                case 99: goto Lb7c;
                case 100: goto Lb7c;
                case 101: goto Lb7c;
                case 102: goto Lb7c;
                case 103: goto Lb7c;
                case 104: goto Lb7c;
                case 105: goto Lb7c;
                case 106: goto Lb7c;
                case 107: goto Lb7c;
                case 108: goto Lb7c;
                case 109: goto Lb7c;
                case 110: goto Lb7c;
                case 111: goto Lb7c;
                case 112: goto Lb7c;
                case 113: goto Lb7c;
                case 114: goto Lb7c;
                case 115: goto Lb7c;
                case 116: goto Lb7c;
                case 117: goto Lb7c;
                case 118: goto Lb7c;
                case 119: goto Lb7c;
                case 120: goto Lb7c;
                case 121: goto Lb7c;
                case 122: goto Lb7c;
                case 123: goto Lb7c;
                case 124: goto Lb7c;
                case 125: goto Lb7c;
                case 126: goto Lb7c;
                case 127: goto Lb7c;
                case 128: goto Lb7c;
                case 129: goto Lb7c;
                case 130: goto Lb7c;
                case 131: goto Lb7c;
                case 132: goto La54;
                case 133: goto Lb7c;
                case 134: goto Lb7c;
                case 135: goto Lb7c;
                case 136: goto Lb7c;
                case 137: goto Lb7c;
                case 138: goto Lb7c;
                case 139: goto Lb7c;
                case 140: goto Lb7c;
                case 141: goto Lb7c;
                case 142: goto Lb7c;
                case 143: goto Lb7c;
                case 144: goto Lb7c;
                case 145: goto Lb7c;
                case 146: goto Lb7c;
                case 147: goto Lb7c;
                case 148: goto Lb7c;
                case 149: goto Lb7c;
                case 150: goto Lb7c;
                case 151: goto Lb7c;
                case 152: goto Lb7c;
                case 153: goto La2f;
                case 154: goto La2f;
                case 155: goto La2f;
                case 156: goto La2f;
                case 157: goto La2f;
                case 158: goto La2f;
                case 159: goto La2f;
                case 160: goto La2f;
                case 161: goto La2f;
                case 162: goto La2f;
                case 163: goto La2f;
                case 164: goto La2f;
                case 165: goto La2f;
                case 166: goto La2f;
                case 167: goto La2f;
                case 168: goto La2f;
                case 169: goto Lac3;
                case 170: goto L9d6;
                case 171: goto L946;
                case 172: goto Lb7c;
                case 173: goto Lb7c;
                case 174: goto Lb7c;
                case 175: goto Lb7c;
                case 176: goto Lb7c;
                case 177: goto Lb7c;
                case 178: goto L8d5;
                case 179: goto L8d5;
                case 180: goto L8d5;
                case 181: goto L8d5;
                case 182: goto L8d5;
                case 183: goto L8d5;
                case 184: goto L8d5;
                case 185: goto L8d5;
                case 186: goto L808;
                case 187: goto L7f0;
                case 188: goto Lb5c;
                case 189: goto L7f0;
                case 190: goto Lb7c;
                case 191: goto Lb7c;
                case 192: goto L7f0;
                case 193: goto L7f0;
                case 194: goto Lb7c;
                case 195: goto Lb7c;
                case 196: goto L7bf;
                case 197: goto L75c;
                case 198: goto La2f;
                case 199: goto La2f;
                case 200: goto L742;
                case 201: goto L742;
                case 202: goto L6f3;
                case 203: goto L6f3;
                case 204: goto L6f3;
                case 205: goto L6f3;
                case 206: goto L6f3;
                case 207: goto L6f3;
                case 208: goto L6f3;
                case 209: goto L6f3;
                case 210: goto L6f3;
                case 211: goto L6f3;
                case 212: goto L6f3;
                case 213: goto L6f3;
                case 214: goto L6f3;
                case 215: goto L6f3;
                case 216: goto L6f3;
                case 217: goto L6f3;
                case 218: goto L6f3;
                case 219: goto L6f3;
                case 220: goto L6c6;
                default: goto L6c0;
            }
        L6c0:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L6c6:
            int r0 = r25 + 1
            int r0 = r7.m1186(r0)
            int r0 = r0 + r9
            r0 = r14[r0]
            r1.m1593(r2, r0)
            int r0 = r25 + 5
            r40 = r10
            r46 = r12
            r3 = r20
            r5 = r21
            r10 = r37
            r12 = r42
            r2 = 255(0xff, float:3.57E-43)
            r4 = 1
        L6e3:
            r16 = 8
            r44 = 7
            r50 = 4
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            goto Lb9a
        L6f3:
            r3 = 218(0xda, float:3.05E-43)
            if (r0 >= r3) goto L6fa
            int r0 = r0 + (-49)
            goto L6fc
        L6fa:
            int r0 = r0 + (-20)
        L6fc:
            int r3 = r25 + 1
            int r3 = r7.m1181(r3)
            int r3 = r3 + r9
            r3 = r14[r3]
            r4 = 167(0xa7, float:2.34E-43)
            if (r0 == r4) goto L729
            r5 = 168(0xa8, float:2.35E-43)
            if (r0 != r5) goto L70e
            goto L729
        L70e:
            if (r0 >= r4) goto L719
            int r0 = r0 + 1
            r18 = 1
            r0 = r0 ^ 1
            int r0 = r0 + (-1)
            goto L71b
        L719:
            r0 = r0 ^ 1
        L71b:
            int r4 = r9 + 3
            xhss.ᲁᲁᛱᲀ r4 = m1172(r4, r14)
            r1.m1593(r0, r4)
            r1.m1593(r2, r3)
            r2 = 1
            goto L730
        L729:
            int r0 = r0 + 33
            r1.m1593(r0, r3)
            r2 = r27
        L730:
            int r0 = r25 + 3
            r4 = r2
            r40 = r10
            r46 = r12
            r3 = r20
            r5 = r21
        L73b:
            r10 = r37
            r12 = r42
            r2 = 255(0xff, float:3.57E-43)
            goto L6e3
        L742:
            int r0 = r0 - r15
            int r2 = r25 + 1
            int r2 = r7.m1186(r2)
            int r2 = r2 + r9
            r2 = r14[r2]
            r1.m1593(r0, r2)
            int r0 = r25 + 5
            r40 = r10
            r46 = r12
            r3 = r20
            r5 = r21
            r4 = r27
            goto L73b
        L75c:
            int r0 = r25 + 1
            java.lang.String r0 = r7.m1191(r0, r11)
            int r2 = r25 + 3
            r2 = r17[r2]
            r3 = 255(0xff, float:3.57E-43)
            r2 = r2 & r3
            r3 = r42
            int r4 = r3.f3375
            r1.f3118 = r4
            r4 = r37
            r5 = 7
            xhss.ᛳᛴᛶᛷ r0 = r4.m1786(r0, r5)
            int r5 = r0.f965
            r37 = r13
            r13 = 197(0xc5, float:2.76E-43)
            r3.m1704(r13, r5)
            r3.m1709(r2)
            xhss.ᲁᲁᛱᲀ r5 = r1.f3131
            if (r5 == 0) goto L7a1
            r13 = r39
            r39 = r14
            r14 = 4
            if (r13 == r14) goto L799
            r14 = 3
            if (r13 != r14) goto L791
            goto L799
        L791:
            int r0 = r1.f3142
            int r2 = 1 - r2
            int r2 = r2 + r0
            r1.f3142 = r2
            goto L7a5
        L799:
            xhss.ᛱᲁᲀᛲ r5 = r5.f3203
            r14 = 197(0xc5, float:2.76E-43)
            r5.mo134(r14, r2, r0, r4)
            goto L7a5
        L7a1:
            r13 = r39
            r39 = r14
        L7a5:
            int r0 = r25 + 4
        L7a7:
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
        L7bb:
            r4 = r27
            goto Lb9a
        L7bf:
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
            if (r0 != r14) goto L7e6
            int r0 = r25 + 2
            int r0 = r7.m1181(r0)
            int r2 = r25 + 4
            short r2 = r7.m1185(r2)
            r1.m1590(r0, r2)
            int r0 = r25 + 6
            goto L7a7
        L7e6:
            int r2 = r25 + 2
            int r2 = r7.m1181(r2)
            r1.m1597(r0, r2)
            goto L7a5
        L7f0:
            r4 = r37
            r3 = r42
            r37 = r13
            r13 = r39
            r39 = r14
            r14 = 132(0x84, float:1.85E-43)
            int r2 = r25 + 1
            java.lang.String r2 = r7.m1191(r2, r11)
            r1.m1601(r2, r0)
            int r0 = r25 + 3
            goto L7a7
        L808:
            r4 = r37
            r3 = r42
            r37 = r13
            r13 = r39
            r39 = r14
            r14 = 132(0x84, float:1.85E-43)
            int r0 = r25 + 1
            int r0 = r7.m1181(r0)
            r0 = r24[r0]
            int r2 = r0 + 2
            int r2 = r7.m1181(r2)
            r2 = r24[r2]
            java.lang.String r5 = r7.m1184(r2, r11)
            r45 = 2
            int r2 = r2 + 2
            java.lang.String r2 = r7.m1184(r2, r11)
            int[] r14 = r7.f2347
            int r0 = r7.m1181(r0)
            r0 = r14[r0]
            int r14 = r7.m1181(r0)
            java.lang.Object r14 = r7.m1187(r14, r11)
            xhss.ᛷᛸᛴᛳ r14 = (xhss.C0683) r14
            r40 = r0
            int r0 = r40 + 2
            int r0 = r7.m1181(r0)
            r42 = r15
            java.lang.Object[] r15 = new java.lang.Object[r0]
            r50 = 4
            int r40 = r40 + 4
            r46 = r40
            r40 = r10
            r10 = r46
            r46 = r12
            r12 = 0
        L85b:
            if (r12 >= r0) goto L872
            r48 = r0
            int r0 = r7.m1181(r10)
            java.lang.Object r0 = r7.m1187(r0, r11)
            r15[r12] = r0
            r45 = 2
            int r10 = r10 + 2
            int r12 = r12 + 1
            r0 = r48
            goto L85b
        L872:
            int r0 = r3.f3375
            r1.f3118 = r0
            xhss.ᛳᛴᛶᛷ r0 = r4.m1781(r14, r15)
            r10 = 18
            int r0 = r0.f965
            xhss.ᛳᛴᛶᛷ r0 = r4.m1778(r10, r0, r5, r2)
            int r2 = r0.f965
            r5 = 186(0xba, float:2.6E-43)
            r3.m1704(r5, r2)
            r2 = 0
            r3.m1708(r2)
            xhss.ᲁᲁᛱᲀ r2 = r1.f3131
            if (r2 == 0) goto L8c1
            r14 = 4
            if (r13 == r14) goto L8bb
            r14 = 3
            if (r13 != r14) goto L898
            goto L8bb
        L898:
            int r2 = r0.f968
            if (r2 != 0) goto L8a4
            java.lang.String r2 = r0.f964
            int r2 = xhss.C0843.m1422(r2)
            r0.f968 = r2
        L8a4:
            r0 = r2 & 3
            r45 = 2
            int r2 = r2 >> 2
            int r0 = r0 - r2
            r18 = 1
            int r0 = r0 + 1
            int r2 = r1.f3142
            int r2 = r2 + r0
            int r0 = r1.f3138
            if (r2 <= r0) goto L8b8
            r1.f3138 = r2
        L8b8:
            r1.f3142 = r2
            goto L8c1
        L8bb:
            xhss.ᛱᲁᲀᛲ r2 = r2.f3203
            r15 = 0
            r2.mo134(r5, r15, r0, r4)
        L8c1:
            int r0 = r25 + 5
            r12 = r3
            r10 = r4
            r3 = r20
            r5 = r21
            r4 = r27
            r2 = 255(0xff, float:3.57E-43)
            r16 = 8
            r44 = 7
        L8d1:
            r50 = 4
            goto Lb9a
        L8d5:
            r40 = r10
            r46 = r12
            r4 = r37
            r3 = r42
            r37 = r13
            r42 = r15
            r13 = r39
            r39 = r14
            int r2 = r25 + 1
            int r2 = r7.m1181(r2)
            r2 = r24[r2]
            int r5 = r2 + 2
            int r5 = r7.m1181(r5)
            r5 = r24[r5]
            r10 = r2
            java.lang.String r2 = r7.m1191(r10, r11)
            r12 = r3
            java.lang.String r3 = r7.m1184(r5, r11)
            r45 = 2
            int r5 = r5 + 2
            java.lang.String r5 = r7.m1184(r5, r11)
            r14 = 182(0xb6, float:2.55E-43)
            if (r0 >= r14) goto L912
            r1.m1586(r0, r2, r3, r5)
            r10 = r4
            r44 = 7
            goto L932
        L912:
            int r10 = r10 + (-1)
            r10 = r17[r10]
            r14 = 11
            if (r10 != r14) goto L923
            r10 = r1
            r1 = r0
            r0 = r10
            r10 = r4
            r4 = r5
            r5 = 1
        L920:
            r44 = 7
            goto L92a
        L923:
            r10 = r1
            r1 = r0
            r0 = r10
            r10 = r4
            r4 = r5
            r5 = 0
            goto L920
        L92a:
            r0.m1584(r1, r2, r3, r4, r5)
            r52 = r1
            r1 = r0
            r0 = r52
        L932:
            r2 = 185(0xb9, float:2.59E-43)
            if (r0 != r2) goto L943
            int r0 = r25 + 5
        L938:
            r3 = r20
            r5 = r21
            r4 = r27
            r2 = 255(0xff, float:3.57E-43)
            r16 = 8
            goto L8d1
        L943:
            int r0 = r25 + 3
            goto L938
        L946:
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
            int r0 = r7.m1186(r2)
            int r0 = r0 + r9
            r0 = r39[r0]
            int r3 = r2 + 4
            int r3 = r7.m1186(r3)
            r16 = 8
            int r2 = r2 + 8
            int[] r4 = new int[r3]
            xhss.ᲁᲁᛱᲀ[] r5 = new xhss.C0985[r3]
            r14 = 0
        L976:
            if (r14 >= r3) goto L98e
            int r15 = r7.m1186(r2)
            r4[r14] = r15
            int r15 = r2 + 4
            int r15 = r7.m1186(r15)
            int r15 = r15 + r9
            r15 = r39[r15]
            r5[r14] = r15
            int r2 = r2 + 8
            int r14 = r14 + 1
            goto L976
        L98e:
            int r14 = r12.f3375
            r1.f3118 = r14
            r14 = 171(0xab, float:2.4E-43)
            r12.m1709(r14)
            int r14 = r12.f3375
            r50 = 4
            int r14 = r14 % 4
            int r14 = 4 - r14
            int r14 = r14 % 4
            r25 = r2
            r2 = 0
            r15 = 0
            r12.m1707(r15, r2, r14)
            int r2 = r1.f3118
            r14 = 1
            r0.m1623(r12, r2, r14)
            r12.m1706(r3)
            r2 = 0
        L9b2:
            if (r2 >= r3) goto L9c7
            r15 = r4[r2]
            r12.m1706(r15)
            r15 = r5[r2]
            r48 = r2
            int r2 = r1.f3118
            r15.m1623(r12, r2, r14)
            int r2 = r48 + 1
            r14 = 1
            r15 = 0
            goto L9b2
        L9c7:
            r1.m1581(r0, r5)
            r3 = r20
            r5 = r21
            r0 = r25
            r4 = r27
            r2 = 255(0xff, float:3.57E-43)
            goto L8d1
        L9d6:
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
            int r0 = r7.m1186(r2)
            int r0 = r0 + r9
            r0 = r39[r0]
            int r3 = r2 + 4
            int r3 = r7.m1186(r3)
            int r4 = r2 + 8
            int r4 = r7.m1186(r4)
            int r2 = r2 + 12
            int r5 = r4 - r3
            r18 = 1
            int r5 = r5 + 1
            xhss.ᲁᲁᛱᲀ[] r14 = new xhss.C0985[r5]
            r15 = 0
        La10:
            if (r15 >= r5) goto La21
            int r25 = r7.m1186(r2)
            int r25 = r25 + r9
            r25 = r39[r25]
            r14[r15] = r25
            int r2 = r2 + 4
            int r15 = r15 + 1
            goto La10
        La21:
            r1.m1596(r3, r4, r0, r14)
            r0 = r2
        La25:
            r3 = r20
            r5 = r21
            r4 = r27
        La2b:
            r2 = 255(0xff, float:3.57E-43)
            goto Lb9a
        La2f:
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
            short r2 = r7.m1185(r2)
            int r2 = r2 + r9
            r2 = r39[r2]
            r1.m1593(r0, r2)
        La51:
            int r0 = r25 + 3
            goto La25
        La54:
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
            r1.m1590(r0, r2)
            goto La51
        La79:
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
            r1.m1597(r2, r0)
        La9c:
            int r0 = r25 + 1
            goto La25
        La9f:
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
            r1.m1597(r2, r0)
            goto La9c
        Lac3:
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
            r1.m1597(r0, r2)
            int r0 = r25 + 2
            goto La25
        Lae7:
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
            int r0 = r7.m1181(r0)
            java.lang.Object r0 = r7.m1187(r0, r11)
            r1.m1583(r0)
            goto La51
        Lb0c:
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
            java.lang.Object r0 = r7.m1187(r0, r11)
            r1.m1583(r0)
        Lb30:
            int r0 = r25 + 2
        Lb32:
            r3 = r20
            r5 = r21
            goto L7bb
        Lb38:
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
            short r3 = r7.m1185(r3)
            r1.m1588(r0, r3)
            int r0 = r25 + 3
            goto Lb32
        Lb5c:
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
            r1.m1588(r0, r3)
            goto Lb30
        Lb7c:
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
            r1.m1594(r0)
            int r0 = r25 + 1
            goto Lb32
        Lb9a:
            if (r6 == 0) goto Lbcc
            int r14 = r6.length
            if (r3 >= r14) goto Lbcc
            if (r5 > r9) goto Lbcc
            if (r5 != r9) goto Lbc0
            r5 = r6[r3]
            int r5 = r7.m1176(r8, r5)
            java.lang.String r14 = r7.m1184(r5, r11)
            r45 = 2
            int r5 = r5 + 2
            int r15 = r8.f2401
            xhss.ᲇᛶᲁᛶ r2 = r8.f2400
            r20 = r0
            r0 = 1
            xhss.ᛱᲇᲈᛶ r2 = r1.m1602(r15, r2, r14, r0)
            r7.m1182(r2, r5, r0, r11)
            goto Lbc2
        Lbc0:
            r20 = r0
        Lbc2:
            int r3 = r3 + 1
            int r5 = r7.m1175(r6, r3)
            r0 = r20
            goto La2b
        Lbcc:
            r20 = r0
            r0 = r22
            r2 = r23
        Lbd2:
            if (r40 == 0) goto Lc19
            r14 = r40
            int r15 = r14.length
            if (r0 >= r15) goto Lc12
            if (r2 > r9) goto Lc12
            if (r2 != r9) goto Lbff
            r2 = r14[r0]
            int r2 = r7.m1176(r8, r2)
            java.lang.String r15 = r7.m1184(r2, r11)
            r45 = 2
            int r2 = r2 + 2
            r21 = r0
            int r0 = r8.f2401
            r22 = r3
            xhss.ᲇᛶᲁᛶ r3 = r8.f2400
            r23 = r4
            r4 = 0
            xhss.ᛱᲇᲈᛶ r0 = r1.m1602(r0, r3, r15, r4)
            r3 = 1
            r7.m1182(r0, r2, r3, r11)
            goto Lc05
        Lbff:
            r21 = r0
            r22 = r3
            r23 = r4
        Lc05:
            int r0 = r21 + 1
            int r2 = r7.m1175(r14, r0)
            r40 = r14
            r3 = r22
            r4 = r23
            goto Lbd2
        Lc12:
            r21 = r0
            r22 = r3
            r23 = r4
            goto Lc21
        Lc19:
            r21 = r0
            r22 = r3
            r23 = r4
            r14 = r40
        Lc21:
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
            goto L4af
        Lc4c:
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
            if (r0 == 0) goto Lc64
            r1.m1600(r0)
        Lc64:
            r4 = r33
            if (r4 == 0) goto Ld86
            int r0 = r8.f2391
            r45 = 2
            r0 = r0 & 2
            if (r0 != 0) goto Ld86
            r0 = r34
            if (r0 == 0) goto Lca1
            int r2 = r7.m1181(r0)
            r29 = 3
            int r2 = r2 * 3
            int[] r3 = new int[r2]
            int r34 = r0 + 2
            r0 = r34
        Lc82:
            if (r2 <= 0) goto Lc9f
            int r5 = r2 + (-1)
            int r9 = r0 + 6
            r3[r5] = r9
            int r5 = r2 + (-2)
            int r9 = r0 + 8
            int r9 = r7.m1181(r9)
            r3[r5] = r9
            int r2 = r2 + (-3)
            int r5 = r7.m1181(r0)
            r3[r2] = r5
            int r0 = r0 + 10
            goto Lc82
        Lc9f:
            r2 = r3
            goto Lca2
        Lca1:
            r2 = 0
        Lca2:
            int r0 = r7.m1181(r4)
            r45 = 2
            int r33 = r4 + 2
            r3 = r33
        Lcac:
            int r4 = r0 + (-1)
            if (r0 <= 0) goto Ld86
            int r0 = r7.m1181(r3)
            int r5 = r3 + 2
            int r5 = r7.m1181(r5)
            int r9 = r3 + 4
            java.lang.String r9 = r7.m1184(r9, r11)
            int r12 = r3 + 6
            java.lang.String r12 = r7.m1184(r12, r11)
            int r15 = r3 + 8
            int r15 = r7.m1181(r15)
            int r3 = r3 + 10
            r56 = r3
            r16 = r4
            if (r2 == 0) goto Lcee
            r3 = 0
        Lcd5:
            int r4 = r2.length
            if (r3 >= r4) goto Lcee
            r4 = r2[r3]
            if (r4 != r0) goto Lceb
            int r4 = r3 + 1
            r4 = r2[r4]
            if (r4 != r15) goto Lceb
            int r3 = r3 + 2
            r3 = r2[r3]
            java.lang.String r3 = r7.m1184(r3, r11)
            goto Lcef
        Lceb:
            int r3 = r3 + 3
            goto Lcd5
        Lcee:
            r3 = 0
        Lcef:
            r4 = r39[r0]
            int r0 = r0 + r5
            r0 = r39[r0]
            if (r3 == 0) goto Ld2d
            xhss.ᲇᛶᲁᛶ r5 = r1.f3144
            if (r5 != 0) goto Ld01
            xhss.ᲇᛶᲁᛶ r5 = new xhss.ᲇᛶᲁᛶ
            r5.<init>()
            r1.f3144 = r5
        Ld01:
            r17 = r2
            int r2 = r1.f3148
            r18 = 1
            int r2 = r2 + 1
            r1.f3148 = r2
            int r2 = r4.f3205
            r5.m1708(r2)
            int r2 = r0.f3205
            r19 = r2
            int r2 = r4.f3205
            int r2 = r19 - r2
            r5.m1708(r2)
            int r2 = r10.m1783(r9)
            r5.m1708(r2)
            int r2 = r10.m1783(r3)
            r5.m1708(r2)
            r5.m1708(r15)
            goto Ld2f
        Ld2d:
            r17 = r2
        Ld2f:
            xhss.ᲇᛶᲁᛶ r2 = r1.f3139
            if (r2 != 0) goto Ld3a
            xhss.ᲇᛶᲁᛶ r2 = new xhss.ᲇᛶᲁᛶ
            r2.<init>()
            r1.f3139 = r2
        Ld3a:
            int r3 = r1.f3129
            r18 = 1
            int r3 = r3 + 1
            r1.f3129 = r3
            int r3 = r4.f3205
            r2.m1708(r3)
            int r0 = r0.f3205
            int r3 = r4.f3205
            int r0 = r0 - r3
            r2.m1708(r0)
            int r0 = r10.m1783(r9)
            r2.m1708(r0)
            int r0 = r10.m1783(r12)
            r2.m1708(r0)
            r2.m1708(r15)
            if (r13 == 0) goto Ld7b
            r9 = 0
            char r0 = r12.charAt(r9)
            r2 = 74
            if (r0 == r2) goto Ld72
            r3 = 68
            if (r0 != r3) goto Ld70
            goto Ld72
        Ld70:
            r0 = 1
            goto Ld73
        Ld72:
            r0 = 2
        Ld73:
            int r15 = r15 + r0
            int r0 = r1.f3145
            if (r15 <= r0) goto Ld7e
            r1.f3145 = r15
            goto Ld7e
        Ld7b:
            r2 = 74
            r9 = 0
        Ld7e:
            r3 = r56
            r0 = r16
            r2 = r17
            goto Lcac
        Ld86:
            r9 = 0
            r10 = 65
            if (r6 == 0) goto Ldd6
            int r12 = r6.length
            r13 = r9
        Ld8d:
            if (r13 >= r12) goto Ldd6
            r0 = r6[r13]
            int r2 = r7.m1179(r0)
            r3 = 64
            if (r2 == r3) goto Lda4
            if (r2 != r10) goto Ld9c
            goto Lda4
        Ld9c:
            r40 = r6
            r9 = r7
            r51 = r41
            r45 = 2
            goto Ldcb
        Lda4:
            int r0 = r7.m1176(r8, r0)
            r40 = r6
            java.lang.String r6 = r7.m1184(r0, r11)
            r45 = 2
            int r15 = r0 + 2
            int r1 = r8.f2401
            xhss.ᲇᛶᲁᛶ r2 = r8.f2400
            xhss.ᲁᲁᛱᲀ[] r3 = r8.f2404
            xhss.ᲁᲁᛱᲀ[] r4 = r8.f2409
            int[] r5 = r8.f2398
            r7 = 1
            r9 = r53
            r0 = r54
            r51 = r41
            xhss.ᛱᲇᲈᛶ r1 = r0.m1592(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1
            r9.m1182(r1, r15, r3, r11)
        Ldcb:
            int r13 = r13 + 1
            r1 = r54
            r7 = r9
            r6 = r40
            r41 = r51
            r9 = 0
            goto Ld8d
        Ldd6:
            r9 = r7
            r51 = r41
            r45 = 2
            if (r14 == 0) goto Le17
            int r12 = r14.length
            r13 = 0
        Lddf:
            if (r13 >= r12) goto Le17
            r0 = r14[r13]
            int r1 = r9.m1179(r0)
            r15 = 64
            if (r1 == r15) goto Ldf2
            if (r1 != r10) goto Ldee
            goto Ldf2
        Ldee:
            r0 = r54
            r3 = 1
            goto Le12
        Ldf2:
            int r0 = r9.m1176(r8, r0)
            java.lang.String r6 = r9.m1184(r0, r11)
            int r0 = r0 + 2
            int r1 = r8.f2401
            xhss.ᲇᛶᲁᛶ r2 = r8.f2400
            xhss.ᲁᲁᛱᲀ[] r3 = r8.f2404
            xhss.ᲁᲁᛱᲀ[] r4 = r8.f2409
            int[] r5 = r8.f2398
            r7 = 0
            r10 = r0
            r0 = r54
            xhss.ᛱᲇᲈᛶ r1 = r0.m1592(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1
            r9.m1182(r1, r10, r3, r11)
        Le12:
            int r13 = r13 + 1
            r10 = 65
            goto Lddf
        Le17:
            r0 = r54
            r2 = r35
        Le1b:
            if (r2 == 0) goto Le29
            java.lang.Object r1 = r2.f2152
            xhss.ᛷᛱᛳᲁ r1 = (xhss.C0623) r1
            xhss.ᛷᛱᛳᲁ r3 = r0.f3117
            r2.f2152 = r3
            r0.f3117 = r2
            r2 = r1
            goto Le1b
        Le29:
            r1 = r46
            r3 = r51
            r0.m1589(r1, r3)
            return
        Le31:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final java.lang.String m1191(int r2, char[] r3) {
            r1 = this;
            int[] r0 = r1.f2342
            int r2 = r1.m1181(r2)
            r2 = r0[r2]
            java.lang.String r1 = r1.m1184(r2, r3)
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final long m1192(int r5) {
            r4 = this;
            int r0 = r4.m1186(r5)
            long r0 = (long) r0
            int r5 = r5 + 4
            int r4 = r4.m1186(r5)
            long r4 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            r2 = 32
            long r0 = r0 << r2
            long r4 = r4 | r0
            return r4
    }
}
