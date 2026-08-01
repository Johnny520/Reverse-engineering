package com.alibaba.fastjson2.util;

import com.android.p002dx.p005io.Opcodes;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import net.bytebuddy.pool.TypePool;
import p025.AbstractC7012;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3660 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final BigInteger[] f9146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final long[] f9147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final long[] f9148;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final double[] f9149;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final double[] f9150;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C3661 f9151;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final char[][] f9152;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final char[][] f9153;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final int[] f9154;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final short[] f9155;

    static {
        C3661 c3661;
        long j;
        int i;
        int i2;
        if (AbstractC3687.f9263 <= 8 || AbstractC3687.f9274) {
            c3661 = null;
        } else {
            try {
                MethodHandles.Lookup lookupM6328 = AbstractC3687.m6328(AbstractC3660.class);
                Class cls = Long.TYPE;
                MethodType methodType = MethodType.methodType(cls, cls, cls);
                c3661 = (C3661) LambdaMetafactory.metafactory(lookupM6328, "multiplyHigh", MethodType.methodType(C3661.class), methodType, lookupM6328.findStatic(Math.class, "multiplyHigh", methodType), methodType).getTarget().invokeExact();
            } catch (Throwable unused) {
                c3661 = null;
            }
        }
        if (c3661 == null) {
            c3661 = new C3661();
        }
        f9151 = c3661;
        AbstractC3682.m6259("Infinity".getBytes(StandardCharsets.ISO_8859_1), 0);
        char[] charArray = "Infinity".toCharArray();
        AbstractC3682.m6289(0, charArray);
        AbstractC3682.m6289(4, charArray);
        double[] dArr = new double[325];
        f9150 = dArr;
        f9149 = new double[325];
        f9148 = new long[]{10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L, Long.MAX_VALUE};
        f9147 = new long[27];
        f9146 = new BigInteger[343];
        int length = dArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            f9150[i3] = Double.valueOf("1.0E" + i3).doubleValue();
            f9149[i3] = Double.valueOf("1.0E-" + i3).doubleValue();
        }
        double[] dArr2 = f9149;
        dArr2[dArr2.length - 1] = Double.MIN_VALUE;
        int i4 = 0;
        long j2 = 1;
        while (true) {
            long[] jArr = f9147;
            if (i4 >= jArr.length) {
                break;
            }
            jArr[i4] = j2;
            j2 *= 5;
            i4++;
        }
        BigInteger bigIntegerValueOf = BigInteger.valueOf(5L);
        f9146[0] = BigInteger.ONE;
        int i5 = 1;
        while (true) {
            BigInteger[] bigIntegerArr = f9146;
            if (i5 >= bigIntegerArr.length) {
                break;
            }
            bigIntegerArr[i5] = bigIntegerValueOf.pow(i5);
            i5++;
        }
        char[][] cArr = new char[325][];
        f9153 = cArr;
        f9152 = new char[325][];
        int length2 = cArr.length;
        for (int i6 = 0; i6 < length2; i6++) {
            String strM12147 = AbstractC7012.m12147(i6, "1.0E");
            String strM121472 = AbstractC7012.m12147(i6, "1.0E-");
            f9153[i6] = strM12147.toCharArray();
            f9152[i6] = strM121472.toCharArray();
        }
        char[][] cArr2 = f9152;
        cArr2[cArr2.length - 1] = new char[]{'4', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '9', 'E', SignatureVisitor.SUPER, '3', '2', '4'};
        f9154 = new int[100];
        f9155 = new short[100];
        for (long j3 = 0; j3 < 10; j3++) {
            for (long j4 = 0; j4 < 10; j4++) {
                if (AbstractC3687.f9276) {
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
                f9154[i8] = (int) j;
                f9155[i8] = (short) i7;
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static int m6227(long j, int i, int i2, char[] cArr, int i3) {
        long j2;
        int i4;
        int iM6277;
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
        long[] jArr = f9148;
        if (i5 >= -3 && i5 < 7) {
            if (i5 < 0) {
                AbstractC3682.m6324(i3, AbstractC3682.f9225, cArr);
                int i7 = i3 + 2;
                if (i5 == -2) {
                    cArr[i7] = '0';
                    i7 = i3 + 3;
                } else if (i5 == -3) {
                    AbstractC3682.m6324(i7, 3145776, cArr);
                    i7 = i3 + 4;
                }
                return AbstractC3682.m6277(cArr, i7, j2);
            }
            int i8 = (i4 - 1) - i5;
            if (i8 <= 0) {
                int iM62772 = AbstractC3682.m6277(cArr, i3, j2);
                int i9 = -i8;
                if (i9 > 0) {
                    int i10 = 0;
                    while (i10 < i9) {
                        cArr[iM62772] = '0';
                        i10++;
                        iM62772++;
                    }
                }
                AbstractC3682.m6324(iM62772, AbstractC3682.f9227, cArr);
                return iM62772 + 2;
            }
            int i11 = i8 - 1;
            long j3 = jArr[i11];
            long j4 = (int) (j2 / j3);
            int iM62773 = AbstractC3682.m6277(cArr, i3, j4);
            int i12 = iM62773 + 1;
            cArr[iM62773] = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            long j5 = j2 - (j4 * j3);
            while (true) {
                i11--;
                if (i11 <= -1 || j5 >= jArr[i11]) {
                    break;
                }
                cArr[i12] = '0';
                i12++;
            }
            return AbstractC3682.m6277(cArr, i12, j5);
        }
        if (i4 == 1) {
            cArr[i3] = (char) (j2 + 48);
            AbstractC3682.m6324(i3 + 1, AbstractC3682.f9227, cArr);
            iM6277 = i3 + 3;
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
            iM6277 = AbstractC3682.m6277(cArr, i15, j7);
        }
        int i16 = iM6277 + 1;
        cArr[iM6277] = 'E';
        if (i5 < 0) {
            cArr[i16] = SignatureVisitor.SUPER;
            i5 = -i5;
            i16 = iM6277 + 2;
        }
        int[] iArr = f9154;
        if (i5 > 99) {
            int i17 = (int) ((((long) i5) * 1374389535) >> 37);
            cArr[i16] = (char) (i17 + 48);
            AbstractC3682.m6324(i16 + 1, iArr[i5 - (i17 * 100)], cArr);
            return i16 + 3;
        }
        if (i5 > 9) {
            AbstractC3682.m6324(i16, iArr[i5], cArr);
            return i16 + 2;
        }
        int i18 = i16 + 1;
        cArr[i16] = (char) (i5 + 48);
        return i18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static int m6228(int i, int i2, int i3, long j, byte[] bArr) {
        int i4;
        long j2;
        int iM6276;
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
        long[] jArr = f9148;
        if (i5 >= -3 && i5 < 7) {
            if (i5 < 0) {
                AbstractC3682.m6317(bArr, i3, AbstractC3682.f9226);
                int i7 = i3 + 2;
                if (i5 == -2) {
                    bArr[i7] = 48;
                    i7 = i3 + 3;
                } else if (i5 == -3) {
                    AbstractC3682.m6317(bArr, i7, (short) 12336);
                    i7 = i3 + 4;
                }
                return AbstractC3682.m6276(j2, bArr, i7);
            }
            int i8 = (i4 - 1) - i5;
            if (i8 <= 0) {
                int iM62762 = AbstractC3682.m6276(j2, bArr, i3);
                int i9 = -i8;
                if (i9 > 0) {
                    int i10 = 0;
                    while (i10 < i9) {
                        bArr[iM62762] = 48;
                        i10++;
                        iM62762++;
                    }
                }
                AbstractC3682.m6317(bArr, iM62762, AbstractC3682.f9228);
                return iM62762 + 2;
            }
            int i11 = i8 - 1;
            long j3 = jArr[i11];
            long j4 = (int) (j2 / j3);
            int iM6313 = AbstractC3682.m6313(j4, bArr, i3);
            int i12 = iM6313 + 1;
            bArr[iM6313] = 46;
            long j5 = j2 - (j4 * j3);
            while (true) {
                i11--;
                if (i11 <= -1 || j5 >= jArr[i11]) {
                    break;
                }
                bArr[i12] = 48;
                i12++;
            }
            return AbstractC3682.m6276(j5, bArr, i12);
        }
        if (i4 == 1) {
            bArr[i3] = (byte) (j2 + 48);
            AbstractC3682.m6317(bArr, i3 + 1, AbstractC3682.f9228);
            iM6276 = i3 + 3;
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
            iM6276 = AbstractC3682.m6276(j7, bArr, i15);
        }
        int i16 = iM6276 + 1;
        bArr[iM6276] = 69;
        if (i5 < 0) {
            bArr[i16] = 45;
            i5 = -i5;
            i16 = iM6276 + 2;
        }
        short[] sArr = f9155;
        if (i5 > 99) {
            int i17 = (int) ((((long) i5) * 1374389535) >> 37);
            bArr[i16] = (byte) (i17 + 48);
            AbstractC3682.m6317(bArr, i16 + 1, sArr[i5 - (i17 * 100)]);
            return i16 + 3;
        }
        if (i5 > 9) {
            AbstractC3682.m6317(bArr, i16, sArr[i5]);
            return i16 + 2;
        }
        int i18 = i16 + 1;
        bArr[i16] = (byte) (i5 + 48);
        return i18;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static long m6229(long j, long j2, int i) {
        f9151.getClass();
        long jM6237 = C3661.m6237(j, j2);
        if (i >= 64) {
            return jM6237 >>> (i - 64);
        }
        return ((j * j2) >>> i) | (jM6237 << (64 - i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static long m6230(int i, long j, long j2, long j3) {
        int i2 = i - 64;
        f9151.getClass();
        long jM6237 = C3661.m6237(j, j2);
        long j4 = j2 * j;
        long jM62372 = (C3661.m6237(j, j3) << 32) + ((j * j3) >>> 32);
        long j5 = j4 + jM62372;
        if ((j4 | jM62372) < 0 && ((j4 & jM62372) < 0 || j5 >= 0)) {
            jM6237++;
        }
        if (i2 >= 0) {
            return jM6237 >>> i2;
        }
        return (j5 >>> i) | (jM6237 << (-i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x019c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C3658 m6231(float f) {
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        int i5;
        long jM6230;
        long j2;
        int i6;
        long jM6237;
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i7 = (iFloatToRawIntBits >> 23) & Opcodes.CONST_METHOD_TYPE;
        int i8 = 8388607 & iFloatToRawIntBits;
        boolean z = i8 > 0;
        if (i7 > 0) {
            if (i7 == 255) {
                return C3658.f9136;
            }
            i2 = 8388608 | i8;
            i = i7 - 150;
        } else {
            if (i8 == 0) {
                return iFloatToRawIntBits == 0 ? C3658.f9135 : C3658.f9138;
            }
            int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i8) - 8;
            i = (-149) - iNumberOfLeadingZeros;
            i2 = i8 << iNumberOfLeadingZeros;
        }
        long[] jArr = f9147;
        if (i >= 0) {
            C3688 c3688 = AbstractC3692.f9308[i];
            i4 = c3688.f9292;
            i5 = c3688.f9291;
            j = c3688.f9287;
            if (c3688.f9289 && i2 > c3688.f9290) {
                i4++;
                i5++;
            }
            int i9 = c3688.f9288 + 6;
            int i10 = i + i9;
            if (i9 >= 0) {
                i3 = 1;
                jM6230 = (((long) i2) * jArr[i9]) << i10;
            } else if (i10 < 40) {
                jM6230 = (((long) i2) << i10) / jArr[-i9];
                i3 = 1;
            } else {
                C3689 c3689 = C3689.f9294[-i9];
                i3 = 1;
                jM6230 = m6230((c3689.f9295 + 71) - i10, ((long) i2) << 39, c3689.f9297, c3689.f9296);
            }
        } else {
            i3 = 1;
            C3688 c36882 = AbstractC3692.f9309[-i];
            int i11 = c36882.f9292;
            int i12 = c36882.f9291;
            j = c36882.f9287;
            if (c36882.f9289 && i2 > c36882.f9290) {
                i11++;
                i12++;
            }
            i4 = i11;
            i5 = i12;
            int i13 = c36882.f9288 + 6;
            int i14 = i + i13;
            if (i14 >= 0) {
                jM6230 = (jArr[i13] * ((long) i2)) << i14;
            } else if (i13 < 17) {
                jM6230 = (((long) i2) * jArr[i13]) >> (-i14);
            } else if (i13 < jArr.length) {
                jM6230 = m6229(i2, jArr[i13], -i14);
            } else if (i13 < jArr.length + 4) {
                jM6230 = m6229(((long) i2) * jArr[(i13 - jArr.length) + 1], jArr[jArr.length - 1], -i14);
            } else {
                C3689 c36892 = C3689.f9294[i13];
                jM6230 = m6230((-(c36892.f9298 + i14)) + 39, ((long) i2) << 39, c36892.f9300, c36892.f9299);
            }
        }
        C3661 c3661 = f9151;
        if (jM6230 < 1000000000) {
            c3661.getClass();
            return new C3658(2, i4, C3661.m6237(jM6230, 7737125245533626719L) >> 22);
        }
        c3661.getClass();
        long jM62372 = C3661.m6237(jM6230, 4951760157141521100L) >> 28;
        long j3 = jM6230 - (1000000000 * jM62372);
        int i15 = ((1000000001 - j3) << i3) <= j ? i3 : 0;
        if (i15 == 0) {
            if (((j3 + 1) << (z ? i3 : 2)) <= j) {
                j2 = jM62372 + ((long) i15);
                int i16 = i5 - 1;
                if (i15 == 0 || f9148[i16] != j2) {
                    i6 = i16;
                } else {
                    i4++;
                    j2 = 1;
                    i6 = 0;
                }
            } else {
                if (z) {
                    jM6237 = (C3661.m6237(jM6230, 6189700196426901375L) >> 25) + ((long) (j3 % 100000000 >= 50000000 ? i3 : 0));
                    i6 = i5;
                } else {
                    jM6237 = (C3661.m6237(jM6230, 7737125245533626719L) >> 22) + ((long) (j3 % 10000000 >= 5000000 ? i3 : 0));
                    i6 = i5 + 1;
                }
                j2 = jM6237;
            }
        }
        return new C3658(i6 + 1, i4, j2);
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
    */
    public static C3658 m6232(double d) {
        int i;
        long j;
        int i2;
        long j2;
        long j3;
        int i3;
        int i4;
        long jM6230;
        boolean z;
        long j4;
        int i5;
        if (d == Double.MIN_VALUE) {
            return C3658.f9137;
        }
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d);
        int i6 = ((int) (jDoubleToRawLongBits >> 52)) & 2047;
        long j5 = 4503599627370495L & jDoubleToRawLongBits;
        boolean z2 = j5 > 0;
        if (i6 > 0) {
            if (i6 == 2047) {
                return C3658.f9136;
            }
            j = 4503599627370496L | j5;
            i = i6 - 1075;
        } else {
            if (j5 == 0) {
                return jDoubleToRawLongBits == 0 ? C3658.f9135 : C3658.f9138;
            }
            int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j5) - 11;
            i = (-1074) - iNumberOfLeadingZeros;
            j = j5 << iNumberOfLeadingZeros;
        }
        double[] dArr = f9150;
        long[] jArr = f9147;
        if (i >= 0) {
            C3688 c3688 = C3688.f9286[i];
            i3 = c3688.f9292;
            byte b = c3688.f9291;
            j2 = c3688.f9293;
            i2 = 1;
            j3 = c3688.f9287;
            if (c3688.f9289) {
                long j6 = c3688.f9290;
                if (j < j6) {
                    i4 = b;
                    i5 = c3688.f9288;
                    int i7 = i + i5;
                    if (i5 < 0) {
                        C3689 c3689 = C3689.f9294[-i5];
                        jM6230 = m6230(32 - ((i7 - 10) - c3689.f9295), j << 10, c3689.f9297, c3689.f9296);
                        if (i5 != -1 || i7 >= 11) {
                        }
                    } else {
                        jM6230 = (j * jArr[i5]) << i7;
                    }
                    z = true;
                } else if (j > j6) {
                    i3++;
                    i4 = b + 1;
                    i5 = c3688.f9288;
                    int i72 = i + i5;
                    if (i5 < 0) {
                    }
                    z = true;
                } else {
                    int i8 = i3 + 1;
                    if (d == dArr[i8]) {
                        return new C3658(i8);
                    }
                    i4 = b;
                    i5 = c3688.f9288;
                    int i722 = i + i5;
                    if (i5 < 0) {
                    }
                    z = true;
                }
            }
            if (!z) {
                long j7 = jM6230 / 10;
                if (i4 == 16) {
                    i4--;
                    j7 = (j7 + 5) / 10;
                }
                return new C3658(i4 + 2, i3, j7);
            }
            long j8 = jM6230 / 1000;
            long j9 = jM6230 - (1000 * j8);
            int i9 = ((10001 - (j9 * 10)) << i2) <= j3 ? i2 : 0;
            if (i9 == 0) {
                if (((j9 + 1) << (z2 ? i2 : 2)) <= j2) {
                    j4 = j8 + ((long) i9);
                    i4--;
                } else if (z2) {
                    j4 = (jM6230 + 50) / 100;
                } else {
                    j4 = (jM6230 + 5) / 10;
                    i4++;
                }
            }
            return new C3658(i4 + 1, i3, j4);
        }
        i2 = 1;
        C3688 c36882 = C3688.f9285[-i];
        int i10 = c36882.f9292;
        int i11 = c36882.f9291;
        j2 = c36882.f9293;
        j3 = c36882.f9287;
        if (c36882.f9289) {
            long j10 = c36882.f9290;
            if (j >= j10) {
                if (j > j10) {
                    i10++;
                    i11++;
                } else {
                    if (i10 >= -1) {
                        int i12 = i10 + 1;
                        if (d == dArr[i12]) {
                            return new C3658(i12);
                        }
                    }
                    if (i10 < -1) {
                        if (d == f9149[(-i10) - 1]) {
                            return new C3658(i10 + 1);
                        }
                    }
                }
            }
        }
        i3 = i10;
        i4 = i11;
        int i13 = c36882.f9288;
        int i14 = i + i13;
        if (i14 >= 0) {
            jM6230 = (jArr[i13] * j) << i14;
        } else if (i13 < jArr.length) {
            jM6230 = m6229(j, jArr[i13], -i14);
        } else if (i13 < jArr.length + 4) {
            jM6230 = m6229(j * jArr[(i13 - jArr.length) + 1], jArr[jArr.length - 1], -i14);
        } else {
            C3689 c36892 = C3689.f9294[i13];
            jM6230 = m6230((-(c36892.f9298 + i14)) + 10, j << 10, c36892.f9300, c36892.f9299);
        }
        z = false;
        if (!z) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static int m6233(char[] cArr, int i, double d) {
        if (d == 0.0d) {
            if (Double.doubleToLongBits(d) == Long.MIN_VALUE) {
                cArr[i] = SignatureVisitor.SUPER;
                i++;
            }
            cArr[i] = '0';
            AbstractC3682.m6324(i + 1, AbstractC3682.f9227, cArr);
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
            int iM6319 = AbstractC3682.m6319(j);
            return m6227(j, iM6319, iM6319 - 1, cArr, i2);
        }
        C3658 c3658M6232 = m6232(d);
        int i3 = c3658M6232.f9140;
        if (!c3658M6232.f9139) {
            return m6227(c3658M6232.f9142, c3658M6232.f9141, i3, cArr, i2);
        }
        if (c3658M6232 == C3658.f9136) {
            AbstractC3682.m6306(cArr, i2, AbstractC3682.f9223);
            return i2 + 4;
        }
        if (i3 >= 0) {
            char[] cArr2 = f9153[i3];
            System.arraycopy(cArr2, 0, cArr, i2, cArr2.length);
            return i2 + cArr2.length;
        }
        char[] cArr3 = f9152[-i3];
        System.arraycopy(cArr3, 0, cArr, i2, cArr3.length);
        return i2 + cArr3.length;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m6234(byte[] bArr, int i, double d) {
        if (d == 0.0d) {
            if (Double.doubleToLongBits(d) == Long.MIN_VALUE) {
                bArr[i] = 45;
                i++;
            }
            bArr[i] = 48;
            AbstractC3682.m6317(bArr, i + 1, AbstractC3682.f9228);
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
            int iM6319 = AbstractC3682.m6319(j);
            return m6228(iM6319, iM6319 - 1, i2, j, bArr);
        }
        C3658 c3658M6232 = m6232(d);
        int i3 = c3658M6232.f9140;
        if (!c3658M6232.f9139) {
            return m6228(c3658M6232.f9141, i3, i2, c3658M6232.f9142, bArr);
        }
        if (c3658M6232 == C3658.f9136) {
            AbstractC3682.m6325(i2, bArr, AbstractC3682.f9224);
            return i2 + 4;
        }
        int i4 = 0;
        if (i3 >= 0) {
            char[] cArr = f9153[i3];
            int length = cArr.length;
            while (i4 < length) {
                bArr[i2] = (byte) cArr[i4];
                i4++;
                i2++;
            }
            return i2;
        }
        char[] cArr2 = f9152[-i3];
        int length2 = cArr2.length;
        while (i4 < length2) {
            bArr[i2] = (byte) cArr2[i4];
            i4++;
            i2++;
        }
        return i2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static int m6235(byte[] bArr, int i, float f) {
        int i2;
        if (Float.isNaN(f) || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            AbstractC3682.m6325(i, bArr, AbstractC3682.f9224);
            return i + 4;
        }
        if (f == 0.0f) {
            if (Float.floatToIntBits(f) == Integer.MIN_VALUE) {
                bArr[i] = 45;
                i++;
            }
            bArr[i] = 48;
            AbstractC3682.m6317(bArr, i + 1, AbstractC3682.f9228);
            return i + 3;
        }
        if (f < 0.0f) {
            bArr[i] = 45;
            f = -f;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        C3658 c3658M6231 = m6231(f);
        return m6228(c3658M6231.f9141, c3658M6231.f9140, i2, c3658M6231.f9142, bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static int m6236(char[] cArr, int i, float f) {
        int i2;
        if (Float.isNaN(f) || f == Float.POSITIVE_INFINITY || f == Float.NEGATIVE_INFINITY) {
            AbstractC3682.m6306(cArr, i, AbstractC3682.f9223);
            return i + 4;
        }
        if (f == 0.0f) {
            if (Float.floatToIntBits(f) == Integer.MIN_VALUE) {
                cArr[i] = SignatureVisitor.SUPER;
                i++;
            }
            cArr[i] = '0';
            AbstractC3682.m6324(i + 1, AbstractC3682.f9227, cArr);
            return i + 3;
        }
        if (f < 0.0f) {
            cArr[i] = SignatureVisitor.SUPER;
            f = -f;
            i2 = i + 1;
        } else {
            i2 = i;
        }
        C3658 c3658M6231 = m6231(f);
        return m6227(c3658M6231.f9142, c3658M6231.f9141, c3658M6231.f9140, cArr, i2);
    }
}
