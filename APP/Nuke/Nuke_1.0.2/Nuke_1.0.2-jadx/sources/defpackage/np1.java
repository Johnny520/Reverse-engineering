package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class np1 {
    public static final Base64.Encoder a = Base64.getUrlEncoder().withoutPadding();
    public static final Base64.Decoder b = Base64.getUrlDecoder();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int a(String str, long j, byte[] bArr) {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int iD = d(-2128831035, bytes);
        byte[] bArr2 = new byte[8];
        e(bArr2, 0, j);
        return d(d(iD, bArr2), bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static long b(long j, byte[] bArr) {
        for (byte b2 : bArr) {
            j = (j ^ (((long) b2) & 255)) * 1099511628211L;
        }
        return j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void c(String str, long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        long jB = (b(-3750763034362895579L, bytes) ^ j) ^ (-7046029254386353131L);
        if (jB == 0) {
            jB = 7809847782465536322L;
        }
        int length = bArr.length - i2;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                long j2 = jB ^ (jB << 13);
                long j3 = j2 ^ (j2 >>> 7);
                jB = j3 ^ (j3 << 17);
            }
            bArr2[i + i3] = (byte) ((((int) (jB >>> (i4 * 8))) & 255) ^ bArr[i2 + i3]);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int d(int i, byte[] bArr) {
        for (byte b2 : bArr) {
            i = (i ^ (b2 & 255)) * 16777619;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void e(byte[] bArr, int i, long j) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) (j >>> (56 - (i2 * 8)));
        }
    }
}
