package p376;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import p377.AbstractC8985;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言苏子楪兰世哲.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC8977 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f25219 = new byte[0];

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m14562(long j, byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i + i3] = (byte) (255 & j);
            j >>= 8;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static byte[] m14563(InputStream inputStream, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long j = i;
        byte[] bArr = (byte[]) AbstractC8985.f25235.get();
        Arrays.fill(bArr, (byte) 0);
        long j2 = 0;
        if (j != 0) {
            int length = bArr.length;
            int iMin = (j <= 0 || j >= ((long) length)) ? length : (int) j;
            while (iMin > 0) {
                int i2 = inputStream.read(bArr, 0, iMin);
                if (-1 == i2) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
                j2 += (long) i2;
                if (j > 0) {
                    iMin = (int) Math.min(j - j2, length);
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m14564(int i, byte[] bArr, int i2) {
        if (i2 > 8) {
            C5919.m11249("Can't read more than eight bytes into a long value");
            return 0L;
        }
        long j = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j |= (((long) bArr[i + i3]) & 255) << (i3 * 8);
        }
        return j;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static int m14565(int i, long j) {
        try {
            return Math.addExact(i, Math.toIntExact(j));
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Argument too large or result overflows", e);
        }
    }
}
