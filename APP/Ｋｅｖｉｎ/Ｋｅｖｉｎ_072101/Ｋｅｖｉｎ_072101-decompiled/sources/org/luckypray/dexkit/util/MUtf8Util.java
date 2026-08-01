package org.luckypray.dexkit.util;

/* JADX INFO: loaded from: classes2.dex */
public final class MUtf8Util {
    private MUtf8Util() {
            r0 = this;
            r0.<init>()
            return
    }

    private static long countBytes(java.lang.String r7, boolean r8) throws java.io.UTFDataFormatException {
            r0 = 0
            int r2 = r7.length()
            r3 = 0
        L7:
            if (r3 >= r2) goto L37
            char r4 = r7.charAt(r3)
            if (r4 == 0) goto L17
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 > r5) goto L17
            r5 = 1
            long r0 = r0 + r5
            goto L22
        L17:
            r5 = 2047(0x7ff, float:2.868E-42)
            if (r4 > r5) goto L1f
            r5 = 2
            long r0 = r0 + r5
            goto L22
        L1f:
            r5 = 3
            long r0 = r0 + r5
        L22:
            if (r8 == 0) goto L34
            r5 = 65535(0xffff, double:3.23786E-319)
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 > 0) goto L2c
            goto L34
        L2c:
            java.io.UTFDataFormatException r5 = new java.io.UTFDataFormatException
            java.lang.String r6 = "String more than 65535 UTF bytes long"
            r5.<init>(r6)
            throw r5
        L34:
            int r3 = r3 + 1
            goto L7
        L37:
            return r0
    }

    public static java.lang.String decode(java.nio.ByteBuffer r6) throws java.io.UTFDataFormatException {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            boolean r1 = r6.hasRemaining()
            if (r1 != 0) goto L10
            java.lang.String r1 = r0.toString()
            return r1
        L10:
            byte r1 = r6.get()
            r1 = r1 & 255(0xff, float:3.57E-43)
            char r1 = (char) r1
            if (r1 != 0) goto L1e
            java.lang.String r2 = r0.toString()
            return r2
        L1e:
            r2 = 128(0x80, float:1.8E-43)
            if (r1 >= r2) goto L26
            r0.append(r1)
            goto L75
        L26:
            r3 = r1 & 224(0xe0, float:3.14E-43)
            r4 = 192(0xc0, float:2.69E-43)
            if (r3 != r4) goto L4a
            byte r3 = r6.get()
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = r3 & 192(0xc0, float:2.69E-43)
            if (r4 != r2) goto L42
            r2 = r1 & 31
            int r2 = r2 << 6
            r4 = r3 & 63
            r2 = r2 | r4
            char r2 = (char) r2
            r0.append(r2)
            goto L75
        L42:
            java.io.UTFDataFormatException r2 = new java.io.UTFDataFormatException
            java.lang.String r4 = "bad second byte"
            r2.<init>(r4)
            throw r2
        L4a:
            r3 = r1 & 240(0xf0, float:3.36E-43)
            r4 = 224(0xe0, float:3.14E-43)
            if (r3 != r4) goto L7e
            byte r3 = r6.get()
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r4 = r6.get()
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = r3 & 192(0xc0, float:2.69E-43)
            if (r5 != r2) goto L76
            r5 = r4 & 192(0xc0, float:2.69E-43)
            if (r5 != r2) goto L76
            r2 = r1 & 15
            int r2 = r2 << 12
            r5 = r3 & 63
            int r5 = r5 << 6
            r2 = r2 | r5
            r5 = r4 & 63
            r2 = r2 | r5
            char r2 = (char) r2
            r0.append(r2)
        L75:
            goto L5
        L76:
            java.io.UTFDataFormatException r2 = new java.io.UTFDataFormatException
            java.lang.String r5 = "bad second or third byte"
            r2.<init>(r5)
            throw r2
        L7e:
            java.io.UTFDataFormatException r2 = new java.io.UTFDataFormatException
            java.lang.String r3 = "bad byte"
            r2.<init>(r3)
            throw r2
    }

    public static void encode(byte[] r5, int r6, java.lang.String r7) {
            int r0 = r7.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L54
            char r2 = r7.charAt(r1)
            if (r2 == 0) goto L18
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 > r3) goto L18
            int r3 = r6 + 1
            byte r4 = (byte) r2
            r5[r6] = r4
            r6 = r3
            goto L51
        L18:
            r3 = 2047(0x7ff, float:2.868E-42)
            if (r2 > r3) goto L31
            int r3 = r6 + 1
            int r4 = r2 >> 6
            r4 = r4 & 31
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r5[r6] = r4
            int r6 = r3 + 1
            r4 = r2 & 63
            r4 = r4 | 128(0x80, float:1.8E-43)
            byte r4 = (byte) r4
            r5[r3] = r4
            goto L51
        L31:
            int r3 = r6 + 1
            int r4 = r2 >> 12
            r4 = r4 & 15
            r4 = r4 | 224(0xe0, float:3.14E-43)
            byte r4 = (byte) r4
            r5[r6] = r4
            int r6 = r3 + 1
            int r4 = r2 >> 6
            r4 = r4 & 63
            r4 = r4 | 128(0x80, float:1.8E-43)
            byte r4 = (byte) r4
            r5[r3] = r4
            int r3 = r6 + 1
            r4 = r2 & 63
            r4 = r4 | 128(0x80, float:1.8E-43)
            byte r4 = (byte) r4
            r5[r6] = r4
            r6 = r3
        L51:
            int r1 = r1 + 1
            goto L5
        L54:
            return
    }

    public static byte[] encode(java.lang.String r3) throws java.io.UTFDataFormatException {
            r0 = 1
            long r0 = countBytes(r3, r0)
            int r0 = (int) r0
            byte[] r1 = new byte[r0]
            r2 = 0
            encode(r1, r2, r3)
            return r1
    }
}
