package top.linl.dexparser.util;

import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ConversionUtils {
    public static long byte2Int(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return 0L;
        }
        return (((long) (bArr[3] & DefaultClassResolver.NAME)) << 24) | ((long) ((bArr[2] & DefaultClassResolver.NAME) << 16)) | ((long) ((bArr[1] & DefaultClassResolver.NAME) << 8)) | ((long) (bArr[0] & DefaultClassResolver.NAME));
    }

    public static int byteToUnsignedInt(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return 0;
        }
        return (bArr[0] & DefaultClassResolver.NAME) | ((bArr[3] & DefaultClassResolver.NAME) << 24) | ((bArr[2] & DefaultClassResolver.NAME) << 16) | ((bArr[1] & DefaultClassResolver.NAME) << 8);
    }

    public static String bytesToHex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & DefaultClassResolver.NAME);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase();
    }

    public static byte[] bytesToUnsignedBytes(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = (byte) (bArr[i] & DefaultClassResolver.NAME);
        }
        return bArr2;
    }

    public static int bytesToUnsignedShort(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return 0;
        }
        return ((bArr[1] & DefaultClassResolver.NAME) << 8) | (bArr[0] & DefaultClassResolver.NAME);
    }

    public static int readULeb128(byte[] bArr, int i) {
        byte b = bArr[i];
        bArr[i] = b;
        int i2 = 0;
        int i3 = 0;
        do {
            i2 |= (b & 127) << (i3 * 7);
            i3++;
            if ((b & 128) != 128) {
                break;
            }
        } while (i3 < 5);
        return i2;
    }
}
