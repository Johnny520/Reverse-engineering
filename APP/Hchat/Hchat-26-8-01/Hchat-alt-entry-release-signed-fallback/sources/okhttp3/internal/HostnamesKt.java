package okhttp3.internal;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(java.lang.String r6) {
            int r0 = r6.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L2d
            char r3 = r6.charAt(r2)
            r4 = 31
            int r4 = gg.l.c(r3, r4)
            if (r4 <= 0) goto L2b
            r4 = 127(0x7f, float:1.78E-43)
            int r4 = gg.l.c(r3, r4)
            if (r4 < 0) goto L1d
            goto L2b
        L1d:
            java.lang.String r4 = " #%/:?@[\\]"
            r5 = 6
            int r3 = og.m.q0(r4, r3, r1, r5)
            r4 = -1
            if (r3 == r4) goto L28
            goto L2b
        L28:
            int r2 = r2 + 1
            goto L6
        L2b:
            r6 = 1
            return r6
        L2d:
            return r1
    }

    private static final boolean decodeIpv4Suffix(java.lang.String r7, int r8, int r9, byte[] r10, int r11) {
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
            int r6 = gg.l.c(r4, r5)
            if (r6 < 0) goto L3f
            r6 = 57
            int r6 = gg.l.c(r4, r6)
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
            if (r0 != r11) goto L52
            r7 = 1
            return r7
        L52:
            return r1
    }

    private static final java.net.InetAddress decodeIpv6(java.lang.String r10, int r11, int r12) {
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            if (r11 >= r12) goto L76
            if (r4 != r0) goto Lf
            goto L7a
        Lf:
            int r7 = r11 + 2
            if (r7 > r12) goto L27
            java.lang.String r8 = "::"
            boolean r8 = og.t.c0(r10, r8, r11, r2)
            if (r8 == 0) goto L27
            if (r5 == r3) goto L1f
            goto L7a
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r7 != r12) goto L25
            goto L76
        L25:
            r6 = r7
            goto L49
        L27:
            if (r4 == 0) goto L33
            java.lang.String r7 = ":"
            boolean r7 = og.t.c0(r10, r7, r11, r2)
            if (r7 == 0) goto L35
            int r11 = r11 + 1
        L33:
            r6 = r11
            goto L49
        L35:
            java.lang.String r7 = "."
            boolean r11 = og.t.c0(r10, r7, r11, r2)
            if (r11 == 0) goto L7a
            int r11 = r4 + (-2)
            boolean r10 = decodeIpv4Suffix(r10, r6, r12, r1, r11)
            if (r10 != 0) goto L46
            goto L7a
        L46:
            int r4 = r4 + 2
            goto L76
        L49:
            r7 = r2
            r11 = r6
        L4b:
            if (r11 >= r12) goto L5d
            char r8 = r10.charAt(r11)
            int r8 = okhttp3.internal.Util.parseHexDigit(r8)
            if (r8 == r3) goto L5d
            int r7 = r7 << 4
            int r7 = r7 + r8
            int r11 = r11 + 1
            goto L4b
        L5d:
            int r8 = r11 - r6
            if (r8 == 0) goto L7a
            r9 = 4
            if (r8 <= r9) goto L65
            goto L7a
        L65:
            int r8 = r4 + 1
            int r9 = r7 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r4 + 2
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r1[r8] = r7
            goto L9
        L76:
            if (r4 == r0) goto L88
            if (r5 != r3) goto L7c
        L7a:
            r10 = 0
            return r10
        L7c:
            int r10 = r4 - r5
            int r11 = 16 - r10
            java.lang.System.arraycopy(r1, r5, r1, r11, r10)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L88:
            java.net.InetAddress r10 = java.net.InetAddress.getByAddress(r1)
            return r10
    }

    private static final java.lang.String inet6AddressToAscii(byte[] r8) {
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
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
        L2a:
            int r4 = r8.length
            if (r1 >= r4) goto L5a
            r4 = 58
            if (r1 != r0) goto L3b
            r2.writeByte(r4)
            int r1 = r1 + r3
            if (r1 != r5) goto L2a
            r2.writeByte(r4)
            goto L2a
        L3b:
            if (r1 <= 0) goto L40
            r2.writeByte(r4)
        L40:
            r4 = r8[r1]
            r6 = 255(0xff, float:3.57E-43)
            int r4 = okhttp3.internal.Util.and(r4, r6)
            int r4 = r4 << 8
            int r7 = r1 + 1
            r7 = r8[r7]
            int r6 = okhttp3.internal.Util.and(r7, r6)
            r4 = r4 | r6
            long r6 = (long) r4
            r2.writeHexadecimalUnsignedLong(r6)
            int r1 = r1 + 2
            goto L2a
        L5a:
            java.lang.String r8 = r2.readUtf8()
            return r8
    }

    public static final java.lang.String toCanonicalHost(java.lang.String r4) {
            r4.getClass()
            java.lang.String r0 = ":"
            r1 = 0
            boolean r0 = og.m.h0(r4, r0, r1)
            if (r0 == 0) goto L62
            java.lang.String r0 = "["
            boolean r0 = og.t.d0(r4, r0, r1)
            if (r0 == 0) goto L27
            java.lang.String r0 = "]"
            boolean r0 = og.t.W(r4, r0, r1)
            if (r0 == 0) goto L27
            int r0 = r4.length()
            r1 = 1
            int r0 = r0 - r1
            java.net.InetAddress r0 = decodeIpv6(r4, r1, r0)
            goto L2f
        L27:
            int r0 = r4.length()
            java.net.InetAddress r0 = decodeIpv6(r4, r1, r0)
        L2f:
            if (r0 != 0) goto L32
            goto L84
        L32:
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L40
            java.lang.String r4 = inet6AddressToAscii(r1)
            return r4
        L40:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L49
            java.lang.String r4 = r0.getHostAddress()
            return r4
        L49:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.<init>(r2)
            r1.append(r4)
            r4 = 39
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L62:
            java.lang.String r4 = java.net.IDN.toASCII(r4)     // Catch: java.lang.IllegalArgumentException -> L84
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L84
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L84
            r0.getClass()     // Catch: java.lang.IllegalArgumentException -> L84
            java.lang.String r4 = r4.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> L84
            r4.getClass()     // Catch: java.lang.IllegalArgumentException -> L84
            int r0 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L84
            if (r0 != 0) goto L7c
            goto L84
        L7c:
            boolean r0 = containsInvalidHostnameAsciiCodes(r4)     // Catch: java.lang.IllegalArgumentException -> L84
            if (r0 == 0) goto L83
            goto L84
        L83:
            return r4
        L84:
            r4 = 0
            return r4
    }
}
