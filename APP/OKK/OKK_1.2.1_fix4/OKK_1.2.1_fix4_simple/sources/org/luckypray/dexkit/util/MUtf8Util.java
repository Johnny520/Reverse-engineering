package org.luckypray.dexkit.util;

import java.io.UTFDataFormatException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class MUtf8Util {
    private MUtf8Util() {
    }

    private static long countBytes(String r6, boolean r7) throws UTFDataFormatException {
        int r02 = r6.length();
        long r1 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r02) goto L21;
        char r4 = r6.charAt(r3);
        if (r4 == 0) goto L11;
        if (r4 > 127) goto L11;
        long r42 = 1;
    L9:
        r1 = r1 + r42;
        if (r7 == false) goto L20;
        if (r1 <= 65535) goto L20;
        throw new UTFDataFormatException("String more than 65535 UTF bytes long");
    L20:
        r3 = r3 + 1;
    L11:
        if (r4 > 2047) goto L13;
        r42 = 2;
        goto L9
    L13:
        r42 = 3;
        goto L9
    L21:
        return r1;
    }

    public static String decode(ByteBuffer r6) throws UTFDataFormatException {
        StringBuilder r02 = new StringBuilder();
    L4:
        if (r6.hasRemaining() == false) goto L6;
        char r1 = (char) (r6.get() & 255);
        if (r1 == 0) goto L10;
        if (r1 < 128) goto L13;
        if ((r1 & 224) == 192) goto L16;
        if ((r1 & 240) != 224) goto L31;
        byte r3 = r6.get();
        byte r4 = r6.get();
        if ((r3 & 192) != 128) goto L29;
        if ((r4 & 192) != 128) goto L29;
        r02.append((char) ((((r1 & 15) << 12) | ((r3 & 63) << 6)) | (r4 & 63)));
    L29:
        throw new UTFDataFormatException("bad second or third byte");
    L31:
        throw new UTFDataFormatException("bad byte");
    L16:
        byte r32 = r6.get();
        if ((r32 & 192) != 128) goto L20;
        r02.append((char) (((r1 & 31) << 6) | (r32 & 63)));
        goto L4
    L20:
        throw new UTFDataFormatException("bad second byte");
    L13:
        r02.append(r1);
        goto L4
    L10:
        return r02.toString();
    L6:
        return r02.toString();
    }

    public static void encode(byte[] r6, int r7, String r8) {
        int r02 = r8.length();
        int r1 = 0;
    L3:
        if (r1 >= r02) goto L14;
        char r2 = r8.charAt(r1);
        if (r2 == 0) goto L10;
        if (r2 > 127) goto L10;
        r6[r7] = (byte) r2;
        r7 = r7 + 1;
    L13:
        r1 = r1 + 1;
    L10:
        if (r2 > 2047) goto L12;
        int r3 = r7 + 1;
        r6[r7] = (byte) (((r2 >> 6) & 31) | 192);
        r7 = r7 + 2;
        r6[r3] = (byte) ((r2 & '?') | 128);
        goto L13
    L12:
        r6[r7] = (byte) (((r2 >> '\f') & 15) | 224);
        int r4 = r7 + 2;
        r6[r7 + 1] = (byte) (((r2 >> 6) & 63) | 128);
        r7 = r7 + 3;
        r6[r4] = (byte) ((r2 & '?') | 128);
        goto L13
    }

    public static byte[] encode(String r2) throws UTFDataFormatException {
        byte[] r02 = new byte[(int) countBytes(r2, true)];
        encode(r02, 0, r2);
        return r02;
    }
}
