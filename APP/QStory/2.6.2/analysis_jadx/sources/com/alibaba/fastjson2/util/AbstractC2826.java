package com.alibaba.fastjson2.util;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2826 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final BigInteger[] f8799;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long[] f8800;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long[] f8801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final double[] f8802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final double[] f8803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2827 f8804;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final char[][] f8805;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final char[][] f8806;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int[] f8807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final short[] f8808;

    static {
        C2827 c2827;
        long j;
        int i;
        int i2;
        if (AbstractC2853.f8916 <= 8 || AbstractC2853.f8927) {
            c2827 = null;
        } else {
            try {
                MethodHandles.Lookup lookupM5723 = AbstractC2853.m5723(AbstractC2826.class);
                Class cls = Long.TYPE;
                MethodType methodType = MethodType.methodType(cls, cls, cls);
                c2827 = (C2827) LambdaMetafactory.metafactory(lookupM5723, "multiplyHigh", MethodType.methodType(C2827.class), methodType, lookupM5723.findStatic(Math.class, "multiplyHigh", methodType), methodType).getTarget().invokeExact();
            } catch (Throwable unused) {
                c2827 = null;
            }
        }
        if (c2827 == null) {
            c2827 = new C2827();
        }
        f8804 = c2827;
        AbstractC2848.m5654("Infinity".getBytes(StandardCharsets.ISO_8859_1), 0);
        char[] charArray = "Infinity".toCharArray();
        AbstractC2848.m5684(0, charArray);
        AbstractC2848.m5684(4, charArray);
        double[] dArr = new double[325];
        f8803 = dArr;
        f8802 = new double[325];
        f8801 = new long[]{10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L, Long.MAX_VALUE};
        f8800 = new long[27];
        f8799 = new BigInteger[343];
        int length = dArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            f8803[i3] = Double.valueOf("1.0E" + i3).doubleValue();
            f8802[i3] = Double.valueOf("1.0E-" + i3).doubleValue();
        }
        double[] dArr2 = f8802;
        dArr2[dArr2.length - 1] = Double.MIN_VALUE;
        int i4 = 0;
        long j2 = 1;
        while (true) {
            long[] jArr = f8800;
            if (i4 >= jArr.length) {
                break;
            }
            jArr[i4] = j2;
            j2 *= 5;
            i4++;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(5L);
        f8799[0] = BigInteger.ONE;
        int i5 = 1;
        while (true) {
            BigInteger[] bigIntegerArr = f8799;
            if (i5 >= bigIntegerArr.length) {
                break;
            }
            bigIntegerArr[i5] = bigIntegerValueOf.pow(i5);
            i5++;
        }
        char[][] cArr = new char[325][];
        f8806 = cArr;
        f8805 = new char[325][];
        int length2 = cArr.length;
        for (int i6 = 0; i6 < length2; i6++) {
            String strM11556 = AbstractC6136.m11556(i6, "1.0E");
            String strM115562 = AbstractC6136.m11556(i6, "1.0E-");
            f8806[i6] = strM11556.toCharArray();
            f8805[i6] = strM115562.toCharArray();
        }
        char[][] cArr2 = f8805;
        cArr2[cArr2.length - 1] = new char[]{'4', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '9', 'E', SignatureVisitor.SUPER, '3', '2', '4'};
        f8807 = new int[100];
        f8808 = new short[100];
        for (long j3 = 0; j3 < 10; j3++) {
            for (long j4 = 0; j4 < 10; j4++) {
                if (AbstractC2853.f8929) {
                    j = ((j3 + 48) << 16) | (48 + j4);
                    i = (((int) j3) + 48) << 8;
                    i2 = (int) j4;
                } else {
                    j = ((j4 + 48) << 16) | (48 + j3);
                    i = (((int) j4) + 48) << 8;
                    i2 = (int) j3;
                }
                int i7 = i | (i2 + 48);
                int i8 = (int) ((j3 * 10) + j4);
                f8807[i8] = (int) j;
                f8808[i8] = (short) i7;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m5622(long j, int i, int i2, char[] cArr, int i3) {
        long j2;
        int i4;
        int iM5672;
        int i5 = i2;
        if ((j & 1) == 0 && j % 5 == 0) {
            j2 = j;
            int i6 = i;
            while (j2 % 100 == 0) {
                i6 -= 2;
                j2 /= 100;
                if (i6 == 1) {
                    break;
                }
            }
            if ((1 & j2) == 0 && j2 % 5 == 0 && j2 > 0) {
                i4 = i6 - 1;
                j2 /= 10;
            } else {
                i4 = i6;
            }
        } else {
            j2 = j;
            i4 = i;
        }
        long[] jArr = f8801;
        if (i5 >= -3 && i5 < 7) {
            if (i5 < 0) {
                AbstractC2848.m5719(i3, AbstractC2848.f8878, cArr);
                int i7 = i3 + 2;
                if (i5 == -2) {
                    cArr[i7] = '0';
                    i7 = i3 + 3;
                } else if (i5 == -3) {
                    AbstractC2848.m5719(i7, 3145776, cArr);
                    i7 = i3 + 4;
                }
                return AbstractC2848.m5672(cArr, i7, j2);
            }
            int i8 = (i4 - 1) - i5;
            if (i8 <= 0) {
                int iM56722 = AbstractC2848.m5672(cArr, i3, j2);
                int i9 = -i8;
                if (i9 > 0) {
                    int i10 = 0;
                    while (i10 < i9) {
                        cArr[iM56722] = '0';
                        i10++;
                        iM56722++;
                    }
                }
                AbstractC2848.m5719(iM56722, AbstractC2848.f8880, cArr);
                return iM56722 + 2;
            }
            int i11 = i8 - 1;
            long j3 = jArr[i11];
            long j4 = (int) (j2 / j3);
            int iM56723 = AbstractC2848.m5672(cArr, i3, j4);
            int i12 = iM56723 + 1;
            cArr[iM56723] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            long j5 = j2 - (j4 * j3);
            while (true) {
                i11--;
                if (i11 <= -1 || j5 >= jArr[i11]) {
                    break;
                }
                cArr[i12] = '0';
                i12++;
            }
            return AbstractC2848.m5672(cArr, i12, j5);
        }
        if (i4 == 1) {
            cArr[i3] = (char) (j2 + 48);
            AbstractC2848.m5719(i3 + 1, AbstractC2848.f8880, cArr);
            iM5672 = i3 + 3;
        } else {
            int i13 = i4 - 2;
            long j6 = jArr[i13];
            int i14 = (int) (j2 / j6);
            cArr[i3] = (char) (i14 + 48);
            cArr[i3 + 1] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            int i15 = i3 + 2;
            long j7 = j2 - (((long) i14) * j6);
            while (true) {
                i13--;
                if (i13 <= -1 || j7 >= jArr[i13]) {
                    break;
                }
                cArr[i15] = '0';
                i15++;
            }
            iM5672 = AbstractC2848.m5672(cArr, i15, j7);
        }
        int i16 = iM5672 + 1;
        cArr[iM5672] = 'E';
        if (i5 < 0) {
            cArr[i16] = SignatureVisitor.SUPER;
            i5 = -i5;
            i16 = iM5672 + 2;
        }
        int[] iArr = f8807;
        if (i5 > 99) {
            int i17 = (int) ((((long) i5) * 1374389535) >> 37);
            cArr[i16] = (char) (i17 + 48);
            AbstractC2848.m5719(i16 + 1, iArr[i5 - (i17 * 100)], cArr);
            return i16 + 3;
        }
        if (i5 > 9) {
            AbstractC2848.m5719(i16, iArr[i5], cArr);
            return i16 + 2;
        }
        int i18 = i16 + 1;
        cArr[i16] = (char) (i5 + 48);
        return i18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m5623(int i, int i2, int i3, long j, byte[] bArr) {
        int i4;
        long j2;
        int iM5671;
        int i5 = i2;
        if ((j & 1) == 0 && j % 5 == 0) {
            int i6 = i;
            j2 = j;
            while (j2 % 100 == 0) {
                i6 -= 2;
                j2 /= 100;
                if (i6 == 1) {
                    break;
                }
            }
            if ((1 & j2) == 0 && j2 % 5 == 0 && j2 > 0) {
                i4 = i6 - 1;
                j2 /= 10;
            } else {
                i4 = i6;
            }
        } else {
            i4 = i;
            j2 = j;
        }
        long[] jArr = f8801;
        if (i5 >= -3 && i5 < 7) {
            if (i5 < 0) {
                AbstractC2848.m5712(bArr, i3, AbstractC2848.f8879);
                int i7 = i3 + 2;
                if (i5 == -2) {
                    bArr[i7] = 48;
                    i7 = i3 + 3;
                } else if (i5 == -3) {
                    AbstractC2848.m5712(bArr, i7, (short) 12336);
                    i7 = i3 + 4;
                }
                return AbstractC2848.m5671(j2, bArr, i7);
            }
            int i8 = (i4 - 1) - i5;
            if (i8 <= 0) {
                int iM56712 = AbstractC2848.m5671(j2, bArr, i3);
                int i9 = -i8;
                if (i9 > 0) {
                    int i10 = 0;
                    while (i10 < i9) {
                        bArr[iM56712] = 48;
                        i10++;
                        iM56712++;
                    }
                }
                AbstractC2848.m5712(bArr, iM56712, AbstractC2848.f8881);
                return iM56712 + 2;
            }
            int i11 = i8 - 1;
            long j3 = jArr[i11];
            long j4 = (int) (j2 / j3);
            int iM5708 = AbstractC2848.m5708(j4, bArr, i3);
            int i12 = iM5708 + 1;
            bArr[iM5708] = 46;
            long j5 = j2 - (j4 * j3);
            while (true) {
                i11--;
                if (i11 <= -1 || j5 >= jArr[i11]) {
                    break;
                }
                bArr[i12] = 48;
                i12++;
            }
            return AbstractC2848.m5671(j5, bArr, i12);
        }
        if (i4 == 1) {
            bArr[i3] = (byte) (j2 + 48);
            AbstractC2848.m5712(bArr, i3 + 1, AbstractC2848.f8881);
            iM5671 = i3 + 3;
        } else {
            int i13 = i4 - 2;
            long j6 = jArr[i13];
            int i14 = (int) (j2 / j6);
            bArr[i3] = (byte) (i14 + 48);
            bArr[i3 + 1] = 46;
            int i15 = i3 + 2;
            long j7 = j2 - (((long) i14) * j6);
            while (true) {
                i13--;
                if (i13 <= -1 || j7 >= jArr[i13]) {
                    break;
                }
                bArr[i15] = 48;
                i15++;
            }
            iM5671 = AbstractC2848.m5671(j7, bArr, i15);
        }
        int i16 = iM5671 + 1;
        bArr[iM5671] = 69;
        if (i5 < 0) {
            bArr[i16] = 45;
            i5 = -i5;
            i16 = iM5671 + 2;
        }
        short[] sArr = f8808;
        if (i5 > 99) {
            int i17 = (int) ((((long) i5) * 1374389535) >> 37);
            bArr[i16] = (byte) (i17 + 48);
            AbstractC2848.m5712(bArr, i16 + 1, sArr[i5 - (i17 * 100)]);
            return i16 + 3;
        }
        if (i5 > 9) {
            AbstractC2848.m5712(bArr, i16, sArr[i5]);
            return i16 + 2;
        }
        int i18 = i16 + 1;
        bArr[i16] = (byte) (i5 + 48);
        return i18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static long m5624(long j, long j2, int i) {
        f8804.getClass();
        long jM5632 = C2827.m5632(j, j2);
        if (i >= 64) {
            return jM5632 >>> (i - 64);
        }
        return ((j * j2) >>> i) | (jM5632 << (64 - i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m5625(int i, long j, long j2, long j3) {
        int i2 = i - 64;
        f8804.getClass();
        long jM5632 = C2827.m5632(j, j2);
        long j4 = j2 * j;
        long jM56322 = (C2827.m5632(j, j3) << 32) + ((j * j3) >>> 32);
        long j5 = j4 + jM56322;
        if ((j4 | jM56322) < 0 && ((j4 & jM56322) < 0 || j5 >= 0)) {
            jM5632++;
        }
        if (i2 >= 0) {
            return jM5632 >>> i2;
        }
        return (j5 >>> i) | (jM5632 << (-i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x019c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.util.C2824 m5626(float r23) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2826.m5626(float):com.alibaba.fastjson2.util.飘花落叶言子世哲兰楪苏");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0198  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.util.C2824 m5627(double r29) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2826.m5627(double):com.alibaba.fastjson2.util.飘花落叶言子世哲兰楪苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m5628(char[] cArr, int i, double d) {
        if (d == 0.0d) {
            if (Double.doubleToLongBits(d) == Long.MIN_VALUE) {
                cArr[i] = SignatureVisitor.SUPER;
                i++;
            }
            cArr[i] = '0';
            AbstractC2848.m5719(i + 1, AbstractC2848.f8880, cArr);
            return i + 3;
        }
        if (d < 0.0d) {
            if (d != Double.NEGATIVE_INFINITY) {
                cArr[i] = SignatureVisitor.SUPER;
                i++;
            }
            d = -d;
        }
        int i2 = i;
        long j = (long) d;
        if (d == j) {
            int iM5714 = AbstractC2848.m5714(j);
            return m5622(j, iM5714, iM5714 - 1, cArr, i2);
        }
        C2824 c2824M5627 = m5627(d);
        int i3 = c2824M5627.f8793;
        if (!c2824M5627.f8792) {
            return m5622(c2824M5627.f8795, c2824M5627.f8794, i3, cArr, i2);
        }
        if (c2824M5627 == C2824.f8789) {
            AbstractC2848.m5701(cArr, i2, AbstractC2848.f8876);
            return i2 + 4;
        }
        if (i3 >= 0) {
            char[] cArr2 = f8806[i3];
            System.arraycopy(cArr2, 0, cArr, i2, cArr2.length);
            return i2 + cArr2.length;
        }
        char[] cArr3 = f8805[-i3];
        System.arraycopy(cArr3, 0, cArr, i2, cArr3.length);
        return i2 + cArr3.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m5629(byte[] bArr, int i, double d) {
        if (d == 0.0d) {
            if (Double.doubleToLongBits(d) == Long.MIN_VALUE) {
                bArr[i] = 45;
                i++;
            }
            bArr[i] = 48;
            AbstractC2848.m5712(bArr, i + 1, AbstractC2848.f8881);
            return i + 3;
        }
        if (d < 0.0d) {
            if (d != Double.NEGATIVE_INFINITY) {
                bArr[i] = 45;
                i++;
            }
            d = -d;
        }
        int i2 = i;
        long j = (long) d;
        if (d == j) {
            int iM5714 = AbstractC2848.m5714(j);
            return m5623(iM5714, iM5714 - 1, i2, j, bArr);
        }
        C2824 c2824M5627 = m5627(d);
        int i3 = c2824M5627.f8793;
        if (!c2824M5627.f8792) {
            return m5623(c2824M5627.f8794, i3, i2, c2824M5627.f8795, bArr);
        }
        if (c2824M5627 == C2824.f8789) {
            AbstractC2848.m5720(i2, bArr, AbstractC2848.f8877);
            return i2 + 4;
        }
        int i4 = 0;
        if (i3 >= 0) {
            char[] cArr = f8806[i3];
            int length = cArr.length;
            while (i4 < length) {
                bArr[i2] = (byte) cArr[i4];
                i4++;
                i2++;
            }
            return i2;
        }
        char[] cArr2 = f8805[-i3];
        int length2 = cArr2.length;
        while (i4 < length2) {
            bArr[i2] = (byte) cArr2[i4];
            i4++;
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m5630(byte[] bArr, int i, float f) {
        int i2;
        if (Float.isNaN(f) || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            AbstractC2848.m5720(i, bArr, AbstractC2848.f8877);
            return i + 4;
        }
        if (f == 0.0f) {
            if (Float.floatToIntBits(f) == Integer.MIN_VALUE) {
                bArr[i] = 45;
                i++;
            }
            bArr[i] = 48;
            AbstractC2848.m5712(bArr, i + 1, AbstractC2848.f8881);
            return i + 3;
        }
        if (f < 0.0f) {
            bArr[i] = 45;
            f = -f;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        C2824 c2824M5626 = m5626(f);
        return m5623(c2824M5626.f8794, c2824M5626.f8793, i2, c2824M5626.f8795, bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m5631(char[] cArr, int i, float f) {
        int i2;
        if (Float.isNaN(f) || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            AbstractC2848.m5701(cArr, i, AbstractC2848.f8876);
            return i + 4;
        }
        if (f == 0.0f) {
            if (Float.floatToIntBits(f) == Integer.MIN_VALUE) {
                cArr[i] = SignatureVisitor.SUPER;
                i++;
            }
            cArr[i] = '0';
            AbstractC2848.m5719(i + 1, AbstractC2848.f8880, cArr);
            return i + 3;
        }
        if (f < 0.0f) {
            cArr[i] = SignatureVisitor.SUPER;
            f = -f;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        C2824 c2824M5626 = m5626(f);
        return m5622(c2824M5626.f8795, c2824M5626.f8794, c2824M5626.f8793, cArr, i2);
    }
}
