package p000;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class np1 {

    /* JADX INFO: renamed from: a */
    public static final Base64.Encoder f7278a = Base64.getUrlEncoder().withoutPadding();

    /* JADX INFO: renamed from: b */
    public static final Base64.Decoder f7279b = Base64.getUrlDecoder();

    /* JADX INFO: renamed from: a */
    public static int m3347a(String str, long j, byte[] bArr) {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        int iM3350d = m3350d(-2128831035, bytes);
        byte[] bArr2 = new byte[8];
        m3351e(bArr2, 0, j);
        return m3350d(m3350d(iM3350d, bArr2), bArr);
    }

    /* JADX INFO: renamed from: b */
    public static long m3348b(long j, byte[] bArr) {
        for (byte b : bArr) {
            j = (j ^ (((long) b) & 255)) * 1099511628211L;
        }
        return j;
    }

    /* JADX INFO: renamed from: c */
    public static void m3349c(String str, long j, byte[] bArr, byte[] bArr2, int i, int i2) {
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = str.getBytes(charset);
        bytes.getClass();
        long jM3348b = (m3348b(-3750763034362895579L, bytes) ^ j) ^ (-7046029254386353131L);
        if (jM3348b == 0) {
            jM3348b = 7809847782465536322L;
        }
        int length = bArr.length - i2;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = i3 & 7;
            if (i4 == 0) {
                long j2 = jM3348b ^ (jM3348b << 13);
                long j3 = j2 ^ (j2 >>> 7);
                jM3348b = j3 ^ (j3 << 17);
            }
            bArr2[i + i3] = (byte) ((((int) (jM3348b >>> (i4 * 8))) & 255) ^ bArr[i2 + i3]);
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m3350d(int i, byte[] bArr) {
        for (byte b : bArr) {
            i = (i ^ (b & 255)) * 16777619;
        }
        return i;
    }

    /* JADX INFO: renamed from: e */
    public static void m3351e(byte[] bArr, int i, long j) {
        for (int i2 = 0; i2 < 8; i2++) {
            bArr[i + i2] = (byte) (j >>> (56 - (i2 * 8)));
        }
    }
}
