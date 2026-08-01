package okio;

/* JADX INFO: renamed from: okio.-Base64, reason: invalid class name */
/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\nH\u0000\u001a\u0016\u0010\u000b\u001a\u00020\n*\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005¨\u0006\r"}, m115d2 = {"BASE64", "", "getBASE64$annotations", "()V", "getBASE64", "()[B", "BASE64_URL_SAFE", "getBASE64_URL_SAFE$annotations", "getBASE64_URL_SAFE", "decodeBase64ToArray", "", "encodeBase64", "map", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class Base64 {
    private static final byte[] BASE64 = null;
    private static final byte[] BASE64_URL_SAFE = null;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            byte[] r0 = r0.getData$okio()
            okio.Base64.BASE64 = r0
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_"
            okio.ByteString r0 = r0.encodeUtf8(r1)
            byte[] r0 = r0.getData$okio()
            okio.Base64.BASE64_URL_SAFE = r0
            return
    }

    public static final byte[] decodeBase64ToArray(java.lang.String r17) {
            r0 = r17
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            int r1 = r17.length()
        Lb:
            r2 = 9
            r3 = 32
            r4 = 13
            r5 = 10
            if (r1 <= 0) goto L2c
            int r6 = r1 + (-1)
            char r6 = r0.charAt(r6)
            r7 = 61
            if (r6 == r7) goto L28
            if (r6 == r5) goto L28
            if (r6 == r4) goto L28
            if (r6 == r3) goto L28
            if (r6 == r2) goto L28
            goto L2c
        L28:
            int r1 = r1 + (-1)
            goto Lb
        L2c:
            long r6 = (long) r1
            r8 = 6
            long r6 = r6 * r8
            r8 = 8
            long r6 = r6 / r8
            int r6 = (int) r6
            byte[] r6 = new byte[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
        L3a:
            r11 = 0
            if (r10 >= r1) goto Lb9
            char r12 = r0.charAt(r10)
            r13 = 0
            r14 = 65
            r15 = 0
            r16 = 1
            if (r14 > r12) goto L50
            r14 = 91
            if (r12 >= r14) goto L50
            r14 = r16
            goto L51
        L50:
            r14 = r15
        L51:
            if (r14 == 0) goto L56
            int r11 = r12 + (-65)
            goto L98
        L56:
            r14 = 97
            if (r14 > r12) goto L61
            r14 = 123(0x7b, float:1.72E-43)
            if (r12 >= r14) goto L61
            r14 = r16
            goto L62
        L61:
            r14 = r15
        L62:
            if (r14 == 0) goto L67
            int r11 = r12 + (-71)
            goto L98
        L67:
            r14 = 48
            if (r14 > r12) goto L71
            r14 = 58
            if (r12 >= r14) goto L71
            r15 = r16
        L71:
            if (r15 == 0) goto L76
            int r11 = r12 + 4
            goto L98
        L76:
            r14 = 43
            if (r12 == r14) goto L96
            r14 = 45
            if (r12 != r14) goto L7f
            goto L96
        L7f:
            r14 = 47
            if (r12 == r14) goto L93
            r14 = 95
            if (r12 != r14) goto L88
            goto L93
        L88:
            if (r12 == r5) goto L92
            if (r12 == r4) goto L92
            if (r12 == r3) goto L92
            if (r12 != r2) goto L91
            goto L92
        L91:
            return r11
        L92:
            goto Lb6
        L93:
            r11 = 63
            goto L98
        L96:
            r11 = 62
        L98:
            int r13 = r9 << 6
            r9 = r13 | r11
            int r8 = r8 + 1
            int r13 = r8 % 4
            if (r13 != 0) goto Lb6
            int r13 = r7 + 1
            int r14 = r9 >> 16
            byte r14 = (byte) r14
            r6[r7] = r14
            int r7 = r13 + 1
            int r14 = r9 >> 8
            byte r14 = (byte) r14
            r6[r13] = r14
            int r13 = r7 + 1
            byte r14 = (byte) r9
            r6[r7] = r14
            r7 = r13
        Lb6:
            int r10 = r10 + 1
            goto L3a
        Lb9:
            int r2 = r8 % 4
            switch(r2) {
                case 1: goto Ldb;
                case 2: goto Ld0;
                case 3: goto Lbf;
                default: goto Lbe;
            }
        Lbe:
            goto Ldc
        Lbf:
            int r9 = r9 << 6
            int r3 = r7 + 1
            int r4 = r9 >> 16
            byte r4 = (byte) r4
            r6[r7] = r4
            int r7 = r3 + 1
            int r4 = r9 >> 8
            byte r4 = (byte) r4
            r6[r3] = r4
            goto Ldc
        Ld0:
            int r9 = r9 << 12
            int r3 = r7 + 1
            int r4 = r9 >> 16
            byte r4 = (byte) r4
            r6[r7] = r4
            r7 = r3
            goto Ldc
        Ldb:
            return r11
        Ldc:
            int r3 = r6.length
            if (r7 != r3) goto Le0
            return r6
        Le0:
            byte[] r3 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r4 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            return r3
    }

    public static final java.lang.String encodeBase64(byte[] r11, byte[] r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "map"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            int r0 = r11.length
            int r0 = r0 + 2
            int r0 = r0 / 3
            int r0 = r0 * 4
            byte[] r1 = new byte[r0]
            r2 = 0
            int r3 = r11.length
            int r4 = r11.length
            int r4 = r4 % 3
            int r3 = r3 - r4
            r4 = 0
        L1a:
            if (r4 >= r3) goto L5a
            int r5 = r4 + 1
            r4 = r11[r4]
            int r6 = r5 + 1
            r5 = r11[r5]
            int r7 = r6 + 1
            r6 = r11[r6]
            int r8 = r2 + 1
            r9 = r4 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 2
            r9 = r12[r9]
            r1[r2] = r9
            int r2 = r8 + 1
            r9 = r4 & 3
            int r9 = r9 << 4
            r10 = r5 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 4
            r9 = r9 | r10
            r9 = r12[r9]
            r1[r8] = r9
            int r8 = r2 + 1
            r9 = r5 & 15
            int r9 = r9 << 2
            r10 = r6 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 6
            r9 = r9 | r10
            r9 = r12[r9]
            r1[r2] = r9
            int r2 = r8 + 1
            r9 = r6 & 63
            r9 = r12[r9]
            r1[r8] = r9
            r4 = r7
            goto L1a
        L5a:
            int r5 = r11.length
            int r5 = r5 - r3
            r6 = 61
            switch(r5) {
                case 1: goto L90;
                case 2: goto L62;
                default: goto L61;
            }
        L61:
            goto Lad
        L62:
            int r5 = r4 + 1
            r4 = r11[r4]
            r7 = r11[r5]
            int r8 = r2 + 1
            r9 = r4 & 255(0xff, float:3.57E-43)
            int r9 = r9 >> 2
            r9 = r12[r9]
            r1[r2] = r9
            int r2 = r8 + 1
            r9 = r4 & 3
            int r9 = r9 << 4
            r10 = r7 & 255(0xff, float:3.57E-43)
            int r10 = r10 >> 4
            r9 = r9 | r10
            r9 = r12[r9]
            r1[r8] = r9
            int r8 = r2 + 1
            r9 = r7 & 15
            int r9 = r9 << 2
            r9 = r12[r9]
            r1[r2] = r9
            r1[r8] = r6
            r4 = r5
            r2 = r8
            goto Lad
        L90:
            r5 = r11[r4]
            int r7 = r2 + 1
            r8 = r5 & 255(0xff, float:3.57E-43)
            int r8 = r8 >> 2
            r8 = r12[r8]
            r1[r2] = r8
            int r2 = r7 + 1
            r8 = r5 & 3
            int r8 = r8 << 4
            r8 = r12[r8]
            r1[r7] = r8
            int r7 = r2 + 1
            r1[r2] = r6
            r1[r7] = r6
            r2 = r7
        Lad:
            java.lang.String r5 = okio._JvmPlatformKt.toUtf8String(r1)
            return r5
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
