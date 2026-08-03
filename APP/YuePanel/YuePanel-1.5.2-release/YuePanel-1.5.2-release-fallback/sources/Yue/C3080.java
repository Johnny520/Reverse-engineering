package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۤۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3080 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m12961(java.lang.String r10) {
            int r0 = r10.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L30
            char r4 = r10.charAt(r2)
            r3 = 31
            int r3 = Yue.C3329.m13910(r4, r3)
            r9 = 1
            if (r3 <= 0) goto L2f
            r3 = 127(0x7f, float:1.78E-43)
            int r3 = Yue.C3329.m13910(r4, r3)
            if (r3 < 0) goto L1e
            goto L2f
        L1e:
            r7 = 6
            r8 = 0
            java.lang.String r3 = " #%/:?@[\\]"
            r5 = 0
            r6 = 0
            int r3 = Yue.C5989.m22363(r3, r4, r5, r6, r7, r8)
            r4 = -1
            if (r3 == r4) goto L2c
            return r9
        L2c:
            int r2 = r2 + 1
            goto L6
        L2f:
            return r9
        L30:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final boolean m12962(java.lang.String r7, int r8, int r9, byte[] r10, int r11) {
            r0 = r11
        L1:
            r1 = 0
            if (r8 >= r9) goto L4c
            int r2 = r10.length
            if (r0 != r2) goto L8
            return r1
        L8:
            if (r0 == r11) goto L15
            char r2 = r7.charAt(r8)
            r3 = 46
            if (r2 == r3) goto L13
            return r1
        L13:
            int r8 = r8 + 1
        L15:
            r2 = r8
            r3 = r1
        L17:
            if (r2 >= r9) goto L3f
            char r4 = r7.charAt(r2)
            r5 = 48
            int r6 = Yue.C3329.m13910(r4, r5)
            if (r6 < 0) goto L3f
            r6 = 57
            int r6 = Yue.C3329.m13910(r4, r6)
            if (r6 <= 0) goto L2e
            goto L3f
        L2e:
            if (r3 != 0) goto L33
            if (r8 == r2) goto L33
            return r1
        L33:
            int r3 = r3 * 10
            int r3 = r3 + r4
            int r3 = r3 - r5
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L3c
            return r1
        L3c:
            int r2 = r2 + 1
            goto L17
        L3f:
            int r8 = r2 - r8
            if (r8 != 0) goto L44
            return r1
        L44:
            int r8 = r0 + 1
            byte r1 = (byte) r3
            r10[r0] = r1
            r0 = r8
            r8 = r2
            goto L1
        L4c:
            int r11 = r11 + 4
            if (r0 != r11) goto L51
            r1 = 1
        L51:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final java.net.InetAddress m12963(java.lang.String r18, int r19, int r20) {
            r6 = r18
            r7 = r20
            r8 = 16
            byte[] r9 = new byte[r8]
            r11 = -1
            r12 = r19
            r14 = r11
            r15 = r14
            r13 = 0
        Le:
            r16 = 0
            if (r12 >= r7) goto L96
            if (r13 != r8) goto L15
            return r16
        L15:
            int r5 = r12 + 2
            if (r5 > r7) goto L38
            r4 = 4
            r17 = 0
            java.lang.String r1 = "::"
            r3 = 0
            r0 = r18
            r2 = r12
            r10 = r5
            r5 = r17
            boolean r0 = Yue.C5988.m22314(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L38
            if (r14 == r11) goto L2e
            return r16
        L2e:
            int r13 = r13 + 2
            if (r10 != r7) goto L35
            r14 = r13
            goto L96
        L35:
            r15 = r10
            r14 = r13
            goto L67
        L38:
            if (r13 == 0) goto L4a
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r18
            r2 = r12
            boolean r0 = Yue.C5988.m22314(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L4c
            int r12 = r12 + 1
        L4a:
            r15 = r12
            goto L67
        L4c:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r18
            r2 = r12
            boolean r0 = Yue.C5988.m22314(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L66
            int r0 = r13 + (-2)
            boolean r0 = m12962(r6, r15, r7, r9, r0)
            if (r0 != 0) goto L63
            return r16
        L63:
            int r13 = r13 + 2
            goto L96
        L66:
            return r16
        L67:
            r12 = r15
            r0 = 0
        L69:
            if (r12 >= r7) goto L7b
            char r1 = r6.charAt(r12)
            int r1 = Yue.C6656.m25596(r1)
            if (r1 == r11) goto L7b
            int r0 = r0 << 4
            int r0 = r0 + r1
            int r12 = r12 + 1
            goto L69
        L7b:
            int r1 = r12 - r15
            if (r1 == 0) goto L95
            r2 = 4
            if (r1 <= r2) goto L83
            goto L95
        L83:
            int r1 = r13 + 1
            int r2 = r0 >>> 8
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r9[r13] = r2
            int r13 = r13 + 2
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            r9[r1] = r0
            goto Le
        L95:
            return r16
        L96:
            if (r13 == r8) goto La8
            if (r14 != r11) goto L9b
            return r16
        L9b:
            int r0 = r13 - r14
            int r1 = 16 - r0
            java.lang.System.arraycopy(r9, r14, r9, r1, r0)
            int r8 = r8 - r13
            int r8 = r8 + r14
            r0 = 0
            java.util.Arrays.fill(r9, r14, r8, r0)
        La8:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r9)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final java.lang.String m12964(byte[] r8) {
            r0 = -1
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r8.length
            r5 = 16
            if (r2 >= r4) goto L25
            r4 = r2
        La:
            if (r4 >= r5) goto L19
            r6 = r8[r4]
            if (r6 != 0) goto L19
            int r6 = r4 + 1
            r6 = r8[r6]
            if (r6 != 0) goto L19
            int r4 = r4 + 2
            goto La
        L19:
            int r5 = r4 - r2
            if (r5 <= r3) goto L22
            r6 = 4
            if (r5 < r6) goto L22
            r0 = r2
            r3 = r5
        L22:
            int r2 = r4 + 2
            goto L4
        L25:
            Yue.ۥۣ۟ۢۨ r2 = new Yue.ۥۣ۟ۢۨ
            r2.<init>()
        L2a:
            int r4 = r8.length
            if (r1 >= r4) goto L5a
            r4 = 58
            if (r1 != r0) goto L3b
            r2.m4898(r4)
            int r1 = r1 + r3
            if (r1 != r5) goto L2a
            r2.m4898(r4)
            goto L2a
        L3b:
            if (r1 <= 0) goto L40
            r2.m4898(r4)
        L40:
            r4 = r8[r1]
            r6 = 255(0xff, float:3.57E-43)
            int r4 = Yue.C6656.m25556(r4, r6)
            int r4 = r4 << 8
            int r7 = r1 + 1
            r7 = r8[r7]
            int r6 = Yue.C6656.m25556(r7, r6)
            r4 = r4 | r6
            long r6 = (long) r4
            r2.m4900(r6)
            int r1 = r1 + 2
            goto L2a
        L5a:
            java.lang.String r8 = r2.mo4867()
            return r8
    }

    @Yue.InterfaceC4543
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String m12965(@Yue.InterfaceC4418 java.lang.String r4) {
            java.lang.String r0 = "<this>"
            Yue.C3329.m13906(r4, r0)
            java.lang.String r0 = ":"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = Yue.C5989.m22342(r4, r0, r1, r2, r3)
            if (r0 == 0) goto L6e
            java.lang.String r0 = "["
            boolean r0 = Yue.C5988.m22315(r4, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "]"
            boolean r0 = Yue.C5988.m22280(r4, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            int r0 = r4.length()
            r1 = 1
            int r0 = r0 - r1
            java.net.InetAddress r0 = m12963(r4, r1, r0)
            goto L33
        L2b:
            int r0 = r4.length()
            java.net.InetAddress r0 = m12963(r4, r1, r0)
        L33:
            if (r0 != 0) goto L36
            return r3
        L36:
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L49
            java.lang.String r4 = "address"
            Yue.C3329.m13905(r1, r4)
            java.lang.String r4 = m12964(r1)
            return r4
        L49:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L52
            java.lang.String r4 = r0.getHostAddress()
            return r4
        L52:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.append(r2)
            r1.append(r4)
            r4 = 39
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L6e:
            java.lang.String r4 = java.net.IDN.toASCII(r4)     // Catch: java.lang.IllegalArgumentException -> L96
            java.lang.String r0 = "toASCII(host)"
            Yue.C3329.m13905(r4, r0)     // Catch: java.lang.IllegalArgumentException -> L96
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L96
            java.lang.String r1 = "US"
            Yue.C3329.m13905(r0, r1)     // Catch: java.lang.IllegalArgumentException -> L96
            java.lang.String r4 = r4.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> L96
            java.lang.String r0 = "this as java.lang.String).toLowerCase(locale)"
            Yue.C3329.m13905(r4, r0)     // Catch: java.lang.IllegalArgumentException -> L96
            int r0 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L96
            if (r0 != 0) goto L8e
            return r3
        L8e:
            boolean r0 = m12961(r4)     // Catch: java.lang.IllegalArgumentException -> L96
            if (r0 == 0) goto L95
            goto L96
        L95:
            r3 = r4
        L96:
            return r3
    }
}
