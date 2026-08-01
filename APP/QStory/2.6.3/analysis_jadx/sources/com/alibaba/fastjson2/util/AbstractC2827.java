package com.alibaba.fastjson2.util;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p009.AbstractC6183;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2827 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final BigInteger[] f8801;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long[] f8802;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long[] f8803;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final double[] f8804;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final double[] f8805;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C2828 f8806;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final char[][] f8807;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final char[][] f8808;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int[] f8809;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final short[] f8810;

    static {
        C2828 c2828;
        long j;
        int i;
        int i2;
        if (AbstractC2854.f8918 <= 8 || AbstractC2854.f8929) {
            c2828 = null;
        } else {
            try {
                MethodHandles.Lookup lookupM5768 = AbstractC2854.m5768(AbstractC2827.class);
                Class cls = Long.TYPE;
                MethodType methodType = MethodType.methodType(cls, cls, cls);
                c2828 = (C2828) LambdaMetafactory.metafactory(lookupM5768, "multiplyHigh", MethodType.methodType(C2828.class), methodType, lookupM5768.findStatic(Math.class, "multiplyHigh", methodType), methodType).getTarget().invokeExact();
            } catch (Throwable unused) {
                c2828 = null;
            }
        }
        if (c2828 == null) {
            c2828 = new C2828();
        }
        f8806 = c2828;
        AbstractC2849.m5699("Infinity".getBytes(StandardCharsets.ISO_8859_1), 0);
        char[] charArray = "Infinity".toCharArray();
        AbstractC2849.m5729(0, charArray);
        AbstractC2849.m5729(4, charArray);
        double[] dArr = new double[325];
        f8805 = dArr;
        f8804 = new double[325];
        f8803 = new long[]{10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L, Long.MAX_VALUE};
        f8802 = new long[27];
        f8801 = new BigInteger[343];
        int length = dArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            f8805[i3] = Double.valueOf("1.0E" + i3).doubleValue();
            f8804[i3] = Double.valueOf("1.0E-" + i3).doubleValue();
        }
        double[] dArr2 = f8804;
        dArr2[dArr2.length - 1] = Double.MIN_VALUE;
        int i4 = 0;
        long j2 = 1;
        while (true) {
            long[] jArr = f8802;
            if (i4 >= jArr.length) {
                break;
            }
            jArr[i4] = j2;
            j2 *= 5;
            i4++;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(5L);
        f8801[0] = BigInteger.ONE;
        int i5 = 1;
        while (true) {
            BigInteger[] bigIntegerArr = f8801;
            if (i5 >= bigIntegerArr.length) {
                break;
            }
            bigIntegerArr[i5] = bigIntegerValueOf.pow(i5);
            i5++;
        }
        char[][] cArr = new char[325][];
        f8808 = cArr;
        f8807 = new char[325][];
        int length2 = cArr.length;
        for (int i6 = 0; i6 < length2; i6++) {
            String strM11588 = AbstractC6183.m11588(i6, "1.0E");
            String strM115882 = AbstractC6183.m11588(i6, "1.0E-");
            f8808[i6] = strM11588.toCharArray();
            f8807[i6] = strM115882.toCharArray();
        }
        char[][] cArr2 = f8807;
        cArr2[cArr2.length - 1] = new char[]{'4', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '9', 'E', SignatureVisitor.SUPER, '3', '2', '4'};
        f8809 = new int[100];
        f8810 = new short[100];
        for (long j3 = 0; j3 < 10; j3++) {
            for (long j4 = 0; j4 < 10; j4++) {
                if (AbstractC2854.f8931) {
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
                f8809[i8] = (int) j;
                f8810[i8] = (short) i7;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m5667(long j, int i, int i2, char[] cArr, int i3) {
        long j2;
        int i4;
        int iM5717;
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
        long[] jArr = f8803;
        if (i5 >= -3 && i5 < 7) {
            if (i5 < 0) {
                AbstractC2849.m5764(i3, AbstractC2849.f8880, cArr);
                int i7 = i3 + 2;
                if (i5 == -2) {
                    cArr[i7] = '0';
                    i7 = i3 + 3;
                } else if (i5 == -3) {
                    AbstractC2849.m5764(i7, 3145776, cArr);
                    i7 = i3 + 4;
                }
                return AbstractC2849.m5717(cArr, i7, j2);
            }
            int i8 = (i4 - 1) - i5;
            if (i8 <= 0) {
                int iM57172 = AbstractC2849.m5717(cArr, i3, j2);
                int i9 = -i8;
                if (i9 > 0) {
                    int i10 = 0;
                    while (i10 < i9) {
                        cArr[iM57172] = '0';
                        i10++;
                        iM57172++;
                    }
                }
                AbstractC2849.m5764(iM57172, AbstractC2849.f8882, cArr);
                return iM57172 + 2;
            }
            int i11 = i8 - 1;
            long j3 = jArr[i11];
            long j4 = (int) (j2 / j3);
            int iM57173 = AbstractC2849.m5717(cArr, i3, j4);
            int i12 = iM57173 + 1;
            cArr[iM57173] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            long j5 = j2 - (j4 * j3);
            while (true) {
                i11--;
                if (i11 <= -1 || j5 >= jArr[i11]) {
                    break;
                }
                cArr[i12] = '0';
                i12++;
            }
            return AbstractC2849.m5717(cArr, i12, j5);
        }
        if (i4 == 1) {
            cArr[i3] = (char) (j2 + 48);
            AbstractC2849.m5764(i3 + 1, AbstractC2849.f8882, cArr);
            iM5717 = i3 + 3;
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
            iM5717 = AbstractC2849.m5717(cArr, i15, j7);
        }
        int i16 = iM5717 + 1;
        cArr[iM5717] = 'E';
        if (i5 < 0) {
            cArr[i16] = SignatureVisitor.SUPER;
            i5 = -i5;
            i16 = iM5717 + 2;
        }
        int[] iArr = f8809;
        if (i5 > 99) {
            int i17 = (int) ((((long) i5) * 1374389535) >> 37);
            cArr[i16] = (char) (i17 + 48);
            AbstractC2849.m5764(i16 + 1, iArr[i5 - (i17 * 100)], cArr);
            return i16 + 3;
        }
        if (i5 > 9) {
            AbstractC2849.m5764(i16, iArr[i5], cArr);
            return i16 + 2;
        }
        int i18 = i16 + 1;
        cArr[i16] = (char) (i5 + 48);
        return i18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m5668(int i, int i2, int i3, long j, byte[] bArr) {
        int i4;
        long j2;
        int iM5716;
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
        long[] jArr = f8803;
        if (i5 >= -3 && i5 < 7) {
            if (i5 < 0) {
                AbstractC2849.m5757(bArr, i3, AbstractC2849.f8881);
                int i7 = i3 + 2;
                if (i5 == -2) {
                    bArr[i7] = 48;
                    i7 = i3 + 3;
                } else if (i5 == -3) {
                    AbstractC2849.m5757(bArr, i7, (short) 12336);
                    i7 = i3 + 4;
                }
                return AbstractC2849.m5716(j2, bArr, i7);
            }
            int i8 = (i4 - 1) - i5;
            if (i8 <= 0) {
                int iM57162 = AbstractC2849.m5716(j2, bArr, i3);
                int i9 = -i8;
                if (i9 > 0) {
                    int i10 = 0;
                    while (i10 < i9) {
                        bArr[iM57162] = 48;
                        i10++;
                        iM57162++;
                    }
                }
                AbstractC2849.m5757(bArr, iM57162, AbstractC2849.f8883);
                return iM57162 + 2;
            }
            int i11 = i8 - 1;
            long j3 = jArr[i11];
            long j4 = (int) (j2 / j3);
            int iM5753 = AbstractC2849.m5753(j4, bArr, i3);
            int i12 = iM5753 + 1;
            bArr[iM5753] = 46;
            long j5 = j2 - (j4 * j3);
            while (true) {
                i11--;
                if (i11 <= -1 || j5 >= jArr[i11]) {
                    break;
                }
                bArr[i12] = 48;
                i12++;
            }
            return AbstractC2849.m5716(j5, bArr, i12);
        }
        if (i4 == 1) {
            bArr[i3] = (byte) (j2 + 48);
            AbstractC2849.m5757(bArr, i3 + 1, AbstractC2849.f8883);
            iM5716 = i3 + 3;
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
            iM5716 = AbstractC2849.m5716(j7, bArr, i15);
        }
        int i16 = iM5716 + 1;
        bArr[iM5716] = 69;
        if (i5 < 0) {
            bArr[i16] = 45;
            i5 = -i5;
            i16 = iM5716 + 2;
        }
        short[] sArr = f8810;
        if (i5 > 99) {
            int i17 = (int) ((((long) i5) * 1374389535) >> 37);
            bArr[i16] = (byte) (i17 + 48);
            AbstractC2849.m5757(bArr, i16 + 1, sArr[i5 - (i17 * 100)]);
            return i16 + 3;
        }
        if (i5 > 9) {
            AbstractC2849.m5757(bArr, i16, sArr[i5]);
            return i16 + 2;
        }
        int i18 = i16 + 1;
        bArr[i16] = (byte) (i5 + 48);
        return i18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static long m5669(long j, long j2, int i) {
        f8806.getClass();
        long jM5677 = C2828.m5677(j, j2);
        if (i >= 64) {
            return jM5677 >>> (i - 64);
        }
        return ((j * j2) >>> i) | (jM5677 << (64 - i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m5670(int i, long j, long j2, long j3) {
        int i2 = i - 64;
        f8806.getClass();
        long jM5677 = C2828.m5677(j, j2);
        long j4 = j2 * j;
        long jM56772 = (C2828.m5677(j, j3) << 32) + ((j * j3) >>> 32);
        long j5 = j4 + jM56772;
        if ((j4 | jM56772) < 0 && ((j4 & jM56772) < 0 || j5 >= 0)) {
            jM5677++;
        }
        if (i2 >= 0) {
            return jM5677 >>> i2;
        }
        return (j5 >>> i) | (jM5677 << (-i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x019c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.alibaba.fastjson2.util.C2825 m5671(float r23) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2827.m5671(float):com.alibaba.fastjson2.util.飘花落叶言子世哲兰楪苏");
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
    public static com.alibaba.fastjson2.util.C2825 m5672(double r29) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.util.AbstractC2827.m5672(double):com.alibaba.fastjson2.util.飘花落叶言子世哲兰楪苏");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m5673(char[] cArr, int i, double d) {
        if (d == 0.0d) {
            if (Double.doubleToLongBits(d) == Long.MIN_VALUE) {
                cArr[i] = SignatureVisitor.SUPER;
                i++;
            }
            cArr[i] = '0';
            AbstractC2849.m5764(i + 1, AbstractC2849.f8882, cArr);
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
            int iM5759 = AbstractC2849.m5759(j);
            return m5667(j, iM5759, iM5759 - 1, cArr, i2);
        }
        C2825 c2825M5672 = m5672(d);
        int i3 = c2825M5672.f8795;
        if (!c2825M5672.f8794) {
            return m5667(c2825M5672.f8797, c2825M5672.f8796, i3, cArr, i2);
        }
        if (c2825M5672 == C2825.f8791) {
            AbstractC2849.m5746(cArr, i2, AbstractC2849.f8878);
            return i2 + 4;
        }
        if (i3 >= 0) {
            char[] cArr2 = f8808[i3];
            System.arraycopy(cArr2, 0, cArr, i2, cArr2.length);
            return i2 + cArr2.length;
        }
        char[] cArr3 = f8807[-i3];
        System.arraycopy(cArr3, 0, cArr, i2, cArr3.length);
        return i2 + cArr3.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m5674(byte[] bArr, int i, double d) {
        if (d == 0.0d) {
            if (Double.doubleToLongBits(d) == Long.MIN_VALUE) {
                bArr[i] = 45;
                i++;
            }
            bArr[i] = 48;
            AbstractC2849.m5757(bArr, i + 1, AbstractC2849.f8883);
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
            int iM5759 = AbstractC2849.m5759(j);
            return m5668(iM5759, iM5759 - 1, i2, j, bArr);
        }
        C2825 c2825M5672 = m5672(d);
        int i3 = c2825M5672.f8795;
        if (!c2825M5672.f8794) {
            return m5668(c2825M5672.f8796, i3, i2, c2825M5672.f8797, bArr);
        }
        if (c2825M5672 == C2825.f8791) {
            AbstractC2849.m5765(i2, bArr, AbstractC2849.f8879);
            return i2 + 4;
        }
        int i4 = 0;
        if (i3 >= 0) {
            char[] cArr = f8808[i3];
            int length = cArr.length;
            while (i4 < length) {
                bArr[i2] = (byte) cArr[i4];
                i4++;
                i2++;
            }
            return i2;
        }
        char[] cArr2 = f8807[-i3];
        int length2 = cArr2.length;
        while (i4 < length2) {
            bArr[i2] = (byte) cArr2[i4];
            i4++;
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m5675(byte[] bArr, int i, float f) {
        int i2;
        if (Float.isNaN(f) || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            AbstractC2849.m5765(i, bArr, AbstractC2849.f8879);
            return i + 4;
        }
        if (f == 0.0f) {
            if (Float.floatToIntBits(f) == Integer.MIN_VALUE) {
                bArr[i] = 45;
                i++;
            }
            bArr[i] = 48;
            AbstractC2849.m5757(bArr, i + 1, AbstractC2849.f8883);
            return i + 3;
        }
        if (f < 0.0f) {
            bArr[i] = 45;
            f = -f;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        C2825 c2825M5671 = m5671(f);
        return m5668(c2825M5671.f8796, c2825M5671.f8795, i2, c2825M5671.f8797, bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m5676(char[] cArr, int i, float f) {
        int i2;
        if (Float.isNaN(f) || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            AbstractC2849.m5746(cArr, i, AbstractC2849.f8878);
            return i + 4;
        }
        if (f == 0.0f) {
            if (Float.floatToIntBits(f) == Integer.MIN_VALUE) {
                cArr[i] = SignatureVisitor.SUPER;
                i++;
            }
            cArr[i] = '0';
            AbstractC2849.m5764(i + 1, AbstractC2849.f8882, cArr);
            return i + 3;
        }
        if (f < 0.0f) {
            cArr[i] = SignatureVisitor.SUPER;
            f = -f;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        C2825 c2825M5671 = m5671(f);
        return m5667(c2825M5671.f8797, c2825M5671.f8796, c2825M5671.f8795, cArr, i2);
    }
}
