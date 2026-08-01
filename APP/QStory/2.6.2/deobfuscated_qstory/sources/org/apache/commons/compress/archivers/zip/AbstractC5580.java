package org.apache.commons.compress.archivers.zip;

import androidx.activity.AbstractC0053;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5580 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final /* synthetic */ int f15357 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final long f15358 = m10888(2162688);

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static byte m10884(int i) {
        if (i <= 255 && i >= 0) {
            return i < 128 ? (byte) i : (byte) (i - 256);
        }
        C5919.m11249(AbstractC0053.m161(i, "Can only convert non-negative integers between [0,255] to byte: [", "]"));
        return (byte) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m10885(C5584 c5584) {
        int i = c5584.f15371;
        return i == 0 || i == ZipMethod.UNSHRINKING.getCode() || i == ZipMethod.IMPLODING.getCode() || i == 8 || i == ZipMethod.ENHANCED_DEFLATED.getCode() || i == ZipMethod.BZIP2.getCode() || ZipMethod.isZstd(i) || i == ZipMethod.XZ.getCode();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m10886(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; i < bArr.length / 2; i++) {
            byte b = bArr[i];
            int i2 = length - i;
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static BigInteger m10887(long j) {
        if (j < -2147483648L) {
            throw new IllegalArgumentException("Negative longs < -2^31 not permitted: [" + j + "]");
        }
        if (j < 0 && j >= -2147483648L) {
            int i = (int) j;
            j = i < 0 ? ((long) i) + 4294967296L : i;
        }
        return BigInteger.valueOf(j);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static long m10888(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, ((int) ((j >> 25) & 127)) + 1980);
        calendar.set(2, ((int) ((j >> 21) & 15)) - 1);
        calendar.set(5, ((int) (j >> 16)) & 31);
        calendar.set(11, ((int) (j >> 11)) & 31);
        calendar.set(12, ((int) (j >> 5)) & 63);
        calendar.set(13, ((int) (j << 1)) & 62);
        calendar.set(14, 0);
        return calendar.getTime().getTime();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static byte[] m10889(byte[] bArr) {
        if (bArr != null) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        return null;
    }
}
