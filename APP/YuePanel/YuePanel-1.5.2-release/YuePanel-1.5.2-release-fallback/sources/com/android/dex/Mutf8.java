package com.android.dex;

/* JADX INFO: loaded from: classes.dex */
public final class Mutf8 {
    private Mutf8() {
            r0 = this;
            r0.<init>()
            return
    }

    private static long countBytes(java.lang.String r6, boolean r7) throws java.io.UTFDataFormatException {
            int r0 = r6.length()
            r1 = 0
            r3 = 0
        L7:
            if (r3 >= r0) goto L36
            char r4 = r6.charAt(r3)
            if (r4 == 0) goto L17
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 > r5) goto L17
            r4 = 1
        L15:
            long r1 = r1 + r4
            goto L21
        L17:
            r5 = 2047(0x7ff, float:2.868E-42)
            if (r4 > r5) goto L1e
            r4 = 2
            goto L15
        L1e:
            r4 = 3
            goto L15
        L21:
            if (r7 == 0) goto L33
            r4 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 > 0) goto L2b
            goto L33
        L2b:
            java.io.UTFDataFormatException r6 = new java.io.UTFDataFormatException
            java.lang.String r7 = "String more than 65535 UTF bytes long"
            r6.<init>(r7)
            throw r6
        L33:
            int r3 = r3 + 1
            goto L7
        L36:
            return r1
    }

    public static java.lang.String decode(com.android.dex.util.ByteInput r7, char[] r8) throws java.io.UTFDataFormatException {
            r0 = 0
            r1 = r0
        L2:
            byte r2 = r7.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            char r2 = (char) r2
            if (r2 != 0) goto L11
            java.lang.String r7 = new java.lang.String
            r7.<init>(r8, r0, r1)
            return r7
        L11:
            r8[r1] = r2
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L1a
            int r1 = r1 + 1
            goto L2
        L1a:
            r4 = r2 & 224(0xe0, float:3.14E-43)
            r5 = 192(0xc0, float:2.69E-43)
            if (r4 != r5) goto L3e
            byte r4 = r7.readByte()
            r5 = r4 & 192(0xc0, float:2.69E-43)
            if (r5 != r3) goto L36
            int r3 = r1 + 1
            r2 = r2 & 31
            int r2 = r2 << 6
            r4 = r4 & 63
            r2 = r2 | r4
            char r2 = (char) r2
            r8[r1] = r2
        L34:
            r1 = r3
            goto L2
        L36:
            java.io.UTFDataFormatException r7 = new java.io.UTFDataFormatException
            java.lang.String r8 = "bad second byte"
            r7.<init>(r8)
            throw r7
        L3e:
            r4 = r2 & 240(0xf0, float:3.36E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r4 != r5) goto L6e
            byte r4 = r7.readByte()
            byte r5 = r7.readByte()
            r6 = r4 & 192(0xc0, float:2.69E-43)
            if (r6 != r3) goto L66
            r6 = r5 & 192(0xc0, float:2.69E-43)
            if (r6 != r3) goto L66
            int r3 = r1 + 1
            r2 = r2 & 15
            int r2 = r2 << 12
            r4 = r4 & 63
            int r4 = r4 << 6
            r2 = r2 | r4
            r4 = r5 & 63
            r2 = r2 | r4
            char r2 = (char) r2
            r8[r1] = r2
            goto L34
        L66:
            java.io.UTFDataFormatException r7 = new java.io.UTFDataFormatException
            java.lang.String r8 = "bad second or third byte"
            r7.<init>(r8)
            throw r7
        L6e:
            java.io.UTFDataFormatException r7 = new java.io.UTFDataFormatException
            java.lang.String r8 = "bad byte"
            r7.<init>(r8)
            throw r7
    }

    public static void encode(byte[] r6, int r7, java.lang.String r8) {
            int r0 = r8.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L53
            char r2 = r8.charAt(r1)
            if (r2 == 0) goto L18
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 > r3) goto L18
            int r3 = r7 + 1
            byte r2 = (byte) r2
            r6[r7] = r2
            r7 = r3
            goto L50
        L18:
            r3 = 2047(0x7ff, float:2.868E-42)
            if (r2 > r3) goto L31
            int r3 = r7 + 1
            int r4 = r2 >> 6
            r4 = r4 & 31
            r4 = r4 | 192(0xc0, float:2.69E-43)
            byte r4 = (byte) r4
            r6[r7] = r4
            int r7 = r7 + 2
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r6[r3] = r2
            goto L50
        L31:
            int r3 = r7 + 1
            int r4 = r2 >> 12
            r4 = r4 & 15
            r4 = r4 | 224(0xe0, float:3.14E-43)
            byte r4 = (byte) r4
            r6[r7] = r4
            int r4 = r7 + 2
            int r5 = r2 >> 6
            r5 = r5 & 63
            r5 = r5 | 128(0x80, float:1.8E-43)
            byte r5 = (byte) r5
            r6[r3] = r5
            int r7 = r7 + 3
            r2 = r2 & 63
            r2 = r2 | 128(0x80, float:1.8E-43)
            byte r2 = (byte) r2
            r6[r4] = r2
        L50:
            int r1 = r1 + 1
            goto L5
        L53:
            return
    }

    public static byte[] encode(java.lang.String r2) throws java.io.UTFDataFormatException {
            r0 = 1
            long r0 = countBytes(r2, r0)
            int r0 = (int) r0
            byte[] r0 = new byte[r0]
            r1 = 0
            encode(r0, r1, r2)
            return r0
    }
}
