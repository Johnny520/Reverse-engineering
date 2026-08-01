package okhttp3.internal;

/* JADX INFO: compiled from: hostnames.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0002\u001a\"\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0002\u001a\f\u0010\r\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\f\u0010\u000e\u001a\u0004\u0018\u00010\u0003*\u00020\u0003¨\u0006\u000f"}, m115d2 = {"decodeIpv4Suffix", "", "input", "", "pos", "", "limit", "address", "", "addressOffset", "decodeIpv6", "Ljava/net/InetAddress;", "inet6AddressToAscii", "containsInvalidHostnameAsciiCodes", "toCanonicalHost", "okhttp"}, m116k = 2, m117mv = {1, 8, 0}, m119xi = 48)
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(java.lang.String r10) {
            r0 = 0
            int r1 = r10.length()
        L5:
            if (r0 >= r1) goto L32
            char r8 = r10.charAt(r0)
            r2 = 31
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r8, r2)
            r9 = 1
            if (r2 <= 0) goto L31
            r2 = 127(0x7f, float:1.78E-43)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r8, r2)
            if (r2 < 0) goto L1d
            goto L31
        L1d:
            java.lang.String r2 = " #%/:?@[\\]"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r8
            int r2 = kotlin.text.StringsKt.indexOf$default(r2, r3, r4, r5, r6, r7)
            r3 = -1
            if (r2 == r3) goto L2e
            return r9
        L2e:
            int r0 = r0 + 1
            goto L5
        L31:
            return r9
        L32:
            r0 = 0
            return r0
    }

    private static final boolean decodeIpv4Suffix(java.lang.String r8, int r9, int r10, byte[] r11, int r12) {
            r0 = r12
            r1 = r9
        L2:
            r2 = 0
            if (r1 >= r10) goto L4e
            int r3 = r11.length
            if (r0 != r3) goto L9
            return r2
        L9:
            if (r0 == r12) goto L16
            char r3 = r8.charAt(r1)
            r4 = 46
            if (r3 == r4) goto L14
            return r2
        L14:
            int r1 = r1 + 1
        L16:
            r3 = 0
            r4 = r1
        L18:
            if (r1 >= r10) goto L42
            char r5 = r8.charAt(r1)
            r6 = 48
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r5, r6)
            if (r7 < 0) goto L42
            r7 = 57
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r5, r7)
            if (r7 <= 0) goto L2f
            goto L42
        L2f:
            if (r3 != 0) goto L34
            if (r4 == r1) goto L34
            return r2
        L34:
            int r7 = r3 * 10
            int r7 = r7 + r5
            int r3 = r7 + (-48)
            r6 = 255(0xff, float:3.57E-43)
            if (r3 <= r6) goto L3e
            return r2
        L3e:
            int r1 = r1 + 1
            goto L18
        L42:
            int r5 = r1 - r4
            if (r5 != 0) goto L47
            return r2
        L47:
            int r2 = r0 + 1
            byte r6 = (byte) r3
            r11[r0] = r6
            r0 = r2
            goto L2
        L4e:
            int r3 = r12 + 4
            if (r0 != r3) goto L53
            r2 = 1
        L53:
            return r2
    }

    private static final java.net.InetAddress decodeIpv6(java.lang.String r13, int r14, int r15) {
            r0 = 16
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = -1
            r3 = -1
            r4 = r14
            r10 = r4
        L9:
            r11 = -1
            r12 = 0
            if (r10 >= r15) goto L8c
            int r4 = r0.length
            if (r1 != r4) goto L11
            return r12
        L11:
            int r4 = r10 + 2
            if (r4 > r15) goto L2e
            r8 = 4
            r9 = 0
            java.lang.String r5 = "::"
            r7 = 0
            r4 = r13
            r6 = r10
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L2e
            if (r2 == r11) goto L25
            return r12
        L25:
            int r10 = r10 + 2
            int r1 = r1 + 2
            r2 = r1
            if (r10 != r15) goto L5b
            goto L8c
        L2e:
            if (r1 == 0) goto L5b
            r8 = 4
            r9 = 0
            java.lang.String r5 = ":"
            r7 = 0
            r4 = r13
            r6 = r10
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L40
            int r10 = r10 + 1
            goto L5b
        L40:
            r8 = 4
            r9 = 0
            java.lang.String r5 = "."
            r7 = 0
            r4 = r13
            r6 = r10
            boolean r4 = kotlin.text.StringsKt.startsWith$default(r4, r5, r6, r7, r8, r9)
            if (r4 == 0) goto L5a
            int r4 = r1 + (-2)
            boolean r4 = decodeIpv4Suffix(r13, r3, r15, r0, r4)
            if (r4 != 0) goto L56
            return r12
        L56:
            int r1 = r1 + 2
            goto L8c
        L5a:
            return r12
        L5b:
            r4 = 0
            r3 = r10
        L5d:
            if (r10 >= r15) goto L71
            char r5 = r13.charAt(r10)
            int r5 = okhttp3.internal.Util.parseHexDigit(r5)
            if (r5 == r11) goto L71
            int r6 = r4 << 4
            int r4 = r6 + r5
            int r10 = r10 + 1
            goto L5d
        L71:
            int r5 = r10 - r3
            if (r5 == 0) goto L8b
            r6 = 4
            if (r5 <= r6) goto L79
            goto L8b
        L79:
            int r6 = r1 + 1
            int r7 = r4 >>> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r0[r1] = r7
            int r1 = r6 + 1
            r7 = r4 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r0[r6] = r7
            goto L9
        L8b:
            return r12
        L8c:
            int r4 = r0.length
            if (r1 == r4) goto La2
            if (r2 != r11) goto L92
            return r12
        L92:
            int r4 = r0.length
            int r5 = r1 - r2
            int r4 = r4 - r5
            int r5 = r1 - r2
            java.lang.System.arraycopy(r0, r2, r0, r4, r5)
            int r4 = r0.length
            int r4 = r4 - r1
            int r4 = r4 + r2
            r5 = 0
            java.util.Arrays.fill(r0, r2, r4, r5)
        La2:
            java.net.InetAddress r4 = java.net.InetAddress.getByAddress(r0)
            return r4
    }

    private static final java.lang.String inet6AddressToAscii(byte[] r8) {
            r0 = 0
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
        L5:
            int r4 = r8.length
            r5 = 16
            if (r3 >= r4) goto L27
            r4 = r3
        Lb:
            if (r3 >= r5) goto L1a
            r6 = r8[r3]
            if (r6 != 0) goto L1a
            int r6 = r3 + 1
            r6 = r8[r6]
            if (r6 != 0) goto L1a
            int r3 = r3 + 2
            goto Lb
        L1a:
            int r5 = r3 - r4
            if (r5 <= r1) goto L23
            r6 = 4
            if (r5 < r6) goto L23
            r0 = r4
            r1 = r5
        L23:
            int r3 = r3 + 2
            goto L5
        L27:
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
            r3 = 0
        L2f:
            int r4 = r8.length
            if (r3 >= r4) goto L60
            r4 = 58
            if (r3 != r0) goto L40
            r2.writeByte(r4)
            int r3 = r3 + r1
            if (r3 != r5) goto L2f
            r2.writeByte(r4)
            goto L2f
        L40:
            if (r3 <= 0) goto L45
            r2.writeByte(r4)
        L45:
            r4 = r8[r3]
            r6 = 255(0xff, float:3.57E-43)
            int r4 = okhttp3.internal.Util.and(r4, r6)
            int r4 = r4 << 8
            int r7 = r3 + 1
            r7 = r8[r7]
            int r6 = okhttp3.internal.Util.and(r7, r6)
            r4 = r4 | r6
            long r6 = (long) r4
            r2.writeHexadecimalUnsignedLong(r6)
            int r3 = r3 + 2
            goto L2f
        L60:
            java.lang.String r4 = r2.readUtf8()
            return r4
    }

    public static final java.lang.String toCanonicalHost(java.lang.String r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            r0 = r7
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = ":"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r3 = 0
            r4 = 2
            r5 = 0
            boolean r1 = kotlin.text.StringsKt.contains$default(r1, r2, r3, r4, r5)
            r2 = 1
            if (r1 == 0) goto L77
            java.lang.String r1 = "["
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r0, r1, r3, r4, r5)
            if (r1 == 0) goto L31
            java.lang.String r1 = "]"
            boolean r1 = kotlin.text.StringsKt.endsWith$default(r0, r1, r3, r4, r5)
            if (r1 == 0) goto L31
            int r1 = r0.length()
            int r1 = r1 - r2
            java.net.InetAddress r1 = decodeIpv6(r0, r2, r1)
            goto L39
        L31:
            int r1 = r0.length()
            java.net.InetAddress r1 = decodeIpv6(r0, r3, r1)
        L39:
            if (r1 != 0) goto L3c
            return r5
        L3c:
            byte[] r2 = r1.getAddress()
            int r3 = r2.length
            r4 = 16
            if (r3 != r4) goto L4f
            java.lang.String r3 = "address"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r3 = inet6AddressToAscii(r2)
            return r3
        L4f:
            int r3 = r2.length
            r4 = 4
            if (r3 != r4) goto L58
            java.lang.String r3 = r1.getHostAddress()
            return r3
        L58:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Invalid IPv6 address: '"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            r5 = 39
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L77:
            java.lang.String r1 = java.net.IDN.toASCII(r0)     // Catch: java.lang.IllegalArgumentException -> La7
            java.lang.String r4 = "toASCII(host)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)     // Catch: java.lang.IllegalArgumentException -> La7
            java.util.Locale r4 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> La7
            java.lang.String r6 = "US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)     // Catch: java.lang.IllegalArgumentException -> La7
            java.lang.String r1 = r1.toLowerCase(r4)     // Catch: java.lang.IllegalArgumentException -> La7
            java.lang.String r4 = "this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)     // Catch: java.lang.IllegalArgumentException -> La7
            r4 = r1
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.IllegalArgumentException -> La7
            int r4 = r4.length()     // Catch: java.lang.IllegalArgumentException -> La7
            if (r4 != 0) goto L9b
            r3 = r2
        L9b:
            if (r3 == 0) goto L9e
            return r5
        L9e:
            boolean r2 = containsInvalidHostnameAsciiCodes(r1)     // Catch: java.lang.IllegalArgumentException -> La7
            if (r2 == 0) goto La5
            goto La6
        La5:
            r5 = r1
        La6:
            return r5
        La7:
            r1 = move-exception
            return r5
    }
}
