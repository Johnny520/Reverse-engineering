package okio;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class Base64 {
    private static final byte[] BASE64 = null;
    private static final byte[] BASE64_URL_SAFE = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            okio.ByteString r1 = r0.encodeUtf8(r1)
            byte[] r1 = r1.getData$okio()
            okio.Base64.BASE64 = r1
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            byte[] r0 = r0.getData$okio()
            okio.Base64.BASE64_URL_SAFE = r0
            return
    }

    public static final byte[] decodeBase64ToArray(java.lang.String r14) {
            r14.getClass()
            int r0 = r14.length()
        L7:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L27
            int r5 = r0 + (-1)
            char r5 = r14.charAt(r5)
            r6 = 61
            if (r5 == r6) goto L24
            if (r5 == r4) goto L24
            if (r5 == r3) goto L24
            if (r5 == r2) goto L24
            if (r5 == r1) goto L24
            goto L27
        L24:
            int r0 = r0 + (-1)
            goto L7
        L27:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r5 = (int) r5
            byte[] r6 = new byte[r5]
            r7 = 0
            r8 = r7
            r9 = r8
            r10 = r9
        L35:
            r11 = 0
            if (r7 >= r0) goto L9d
            char r12 = r14.charAt(r7)
            r13 = 65
            if (r13 > r12) goto L47
            r13 = 91
            if (r12 >= r13) goto L47
            int r12 = r12 + (-65)
            goto L7e
        L47:
            r13 = 97
            if (r13 > r12) goto L52
            r13 = 123(0x7b, float:1.72E-43)
            if (r12 >= r13) goto L52
            int r12 = r12 + (-71)
            goto L7e
        L52:
            r13 = 48
            if (r13 > r12) goto L5d
            r13 = 58
            if (r12 >= r13) goto L5d
            int r12 = r12 + 4
            goto L7e
        L5d:
            r13 = 43
            if (r12 == r13) goto L7c
            r13 = 45
            if (r12 != r13) goto L66
            goto L7c
        L66:
            r13 = 47
            if (r12 == r13) goto L79
            r13 = 95
            if (r12 != r13) goto L6f
            goto L79
        L6f:
            if (r12 == r4) goto L9a
            if (r12 == r3) goto L9a
            if (r12 == r2) goto L9a
            if (r12 != r1) goto L78
            goto L9a
        L78:
            return r11
        L79:
            r12 = 63
            goto L7e
        L7c:
            r12 = 62
        L7e:
            int r9 = r9 << 6
            r9 = r9 | r12
            int r8 = r8 + 1
            int r11 = r8 % 4
            if (r11 != 0) goto L9a
            int r11 = r10 + 1
            int r12 = r9 >> 16
            byte r12 = (byte) r12
            r6[r10] = r12
            int r12 = r10 + 2
            int r13 = r9 >> 8
            byte r13 = (byte) r13
            r6[r11] = r13
            int r10 = r10 + 3
            byte r11 = (byte) r9
            r6[r12] = r11
        L9a:
            int r7 = r7 + 1
            goto L35
        L9d:
            int r8 = r8 % 4
            r14 = 1
            if (r8 == r14) goto Lcc
            r14 = 2
            if (r8 == r14) goto Lba
            r14 = 3
            if (r8 == r14) goto La9
            goto Lc4
        La9:
            int r14 = r9 << 6
            int r0 = r10 + 1
            int r1 = r14 >> 16
            byte r1 = (byte) r1
            r6[r10] = r1
            int r10 = r10 + 2
            int r14 = r14 >> 8
            byte r14 = (byte) r14
            r6[r0] = r14
            goto Lc4
        Lba:
            int r14 = r9 << 12
            int r0 = r10 + 1
            int r14 = r14 >> 16
            byte r14 = (byte) r14
            r6[r10] = r14
            r10 = r0
        Lc4:
            if (r10 != r5) goto Lc7
            return r6
        Lc7:
            byte[] r14 = java.util.Arrays.copyOf(r6, r10)
            return r14
        Lcc:
            return r11
    }

    public static final java.lang.String encodeBase64(byte[] r11, byte[] r12) {
            r11.getClass()
            r12.getClass()
            int r0 = r11.length
            r1 = 2
            int r0 = r0 + r1
            int r0 = r0 / 3
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            int r2 = r11.length
            int r3 = r11.length
            int r3 = r3 % 3
            int r2 = r2 - r3
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L53
            int r5 = r3 + 1
            r6 = r11[r3]
            int r7 = r3 + 2
            r5 = r11[r5]
            int r3 = r3 + 3
            r7 = r11[r7]
            int r8 = r4 + 1
            r9 = r6 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> r1
            r9 = r12[r9]
            r0[r4] = r9
            int r9 = r4 + 2
            r6 = r6 & 3
            int r6 = r6 << 4
            r10 = r5 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 4
            r6 = r6 | r10
            r6 = r12[r6]
            r0[r8] = r6
            int r6 = r4 + 3
            r5 = r5 & 15
            int r5 = r5 << r1
            r8 = r7 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> 6
            r5 = r5 | r8
            r5 = r12[r5]
            r0[r9] = r5
            int r4 = r4 + 4
            r5 = r7 & 63
            r5 = r12[r5]
            r0[r6] = r5
            goto L16
        L53:
            int r5 = r11.length
            int r5 = r5 - r2
            r2 = 61
            r6 = 1
            if (r5 == r6) goto L87
            if (r5 == r1) goto L5d
            goto La3
        L5d:
            int r5 = r3 + 1
            r3 = r11[r3]
            r11 = r11[r5]
            int r5 = r4 + 1
            r6 = r3 & 255(0xff, float:3.57E-43)
            int r6 = r6 >> r1
            r6 = r12[r6]
            r0[r4] = r6
            int r6 = r4 + 2
            r3 = r3 & 3
            int r3 = r3 << 4
            r7 = r11 & 255(0xff, float:3.57E-43)
            int r7 = r7 >> 4
            r3 = r3 | r7
            r3 = r12[r3]
            r0[r5] = r3
            int r4 = r4 + 3
            r11 = r11 & 15
            int r11 = r11 << r1
            r11 = r12[r11]
            r0[r6] = r11
            r0[r4] = r2
            goto La3
        L87:
            r11 = r11[r3]
            int r3 = r4 + 1
            r5 = r11 & 255(0xff, float:3.57E-43)
            int r1 = r5 >> 2
            r1 = r12[r1]
            r0[r4] = r1
            int r1 = r4 + 2
            r11 = r11 & 3
            int r11 = r11 << 4
            r11 = r12[r11]
            r0[r3] = r11
            int r4 = r4 + 3
            r0[r1] = r2
            r0[r4] = r2
        La3:
            java.lang.String r11 = okio._JvmPlatformKt.toUtf8String(r0)
            return r11
    }

    public static /* synthetic */ java.lang.String encodeBase64$default(byte[] r0, byte[] r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L6
            byte[] r1 = okio.Base64.BASE64
        L6:
            java.lang.String r0 = encodeBase64(r0, r1)
            return r0
    }

    public static final byte[] getBASE64() {
            byte[] r0 = okio.Base64.BASE64
            return r0
    }

    public static /* synthetic */ void getBASE64$annotations() {
            return
    }

    public static final byte[] getBASE64_URL_SAFE() {
            byte[] r0 = okio.Base64.BASE64_URL_SAFE
            return r0
    }

    public static /* synthetic */ void getBASE64_URL_SAFE$annotations() {
            return
    }
}
