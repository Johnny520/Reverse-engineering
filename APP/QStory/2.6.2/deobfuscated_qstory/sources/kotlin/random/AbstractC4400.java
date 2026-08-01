package kotlin.random;

import androidx.activity.AbstractC0053;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import net.bytebuddy.pool.TypePool;
import p051.C6536;
import p060.AbstractC6857;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlin.random.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4400 {
    public static final Random$Default Default = new Random$Default(null);
    private static final AbstractC4400 defaultRandom;

    static {
        Integer num = AbstractC6857.f18304;
        defaultRandom = num == null || num.intValue() >= 34 ? new C6536() : new C4403();
    }

    public static /* synthetic */ byte[] nextBytes$default(AbstractC4400 abstractC4400, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            C5919.m11247("Super calls with default arguments not supported in this target, function: nextBytes");
            return null;
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return abstractC4400.nextBytes(bArr, i, i2);
    }

    public abstract int nextBits(int i);

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public byte[] nextBytes(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i < 0 || i > bArr.length || i2 < 0 || i2 > bArr.length) {
            C5919.m11253(AbstractC0053.m154(AbstractC0053.m151(i, i2, "fromIndex (", ") or toIndex (", ") are out of range: 0.."), bArr.length, TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            return null;
        }
        if (i > i2) {
            throw new IllegalArgumentException(("fromIndex (" + i + ") must be not greater than toIndex (" + i2 + ").").toString());
        }
        int i3 = (i2 - i) / 4;
        for (int i4 = 0; i4 < i3; i4++) {
            int iNextInt = nextInt();
            bArr[i] = (byte) iNextInt;
            bArr[i + 1] = (byte) (iNextInt >>> 8);
            bArr[i + 2] = (byte) (iNextInt >>> 16);
            bArr[i + 3] = (byte) (iNextInt >>> 24);
            i += 4;
        }
        int i5 = i2 - i;
        int iNextBits = nextBits(i5 * 8);
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i + i6] = (byte) (iNextBits >>> (i6 * 8));
        }
        return bArr;
    }

    public double nextDouble(double d, double d2) {
        double dNextDouble;
        if (d2 <= d) {
            C5919.m11253(AbstractC4921.m9902(Double.valueOf(d), Double.valueOf(d2)));
            return 0.0d;
        }
        double d3 = d2 - d;
        if (!Double.isInfinite(d3) || Math.abs(d) > Double.MAX_VALUE || Math.abs(d2) > Double.MAX_VALUE) {
            dNextDouble = d + (nextDouble() * d3);
        } else {
            double dNextDouble2 = ((d2 / 2.0d) - (d / 2.0d)) * nextDouble();
            dNextDouble = d + dNextDouble2 + dNextDouble2;
        }
        return dNextDouble >= d2 ? Math.nextAfter(d2, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public abstract int nextInt();

    public int nextInt(int i, int i2) {
        int iNextInt;
        int i3;
        int iNextBits;
        if (i2 <= i) {
            C5919.m11253(AbstractC4921.m9902(Integer.valueOf(i), Integer.valueOf(i2)));
            return 0;
        }
        int i4 = i2 - i;
        if (i4 > 0 || i4 == Integer.MIN_VALUE) {
            if (((-i4) & i4) == i4) {
                iNextBits = nextBits(31 - Integer.numberOfLeadingZeros(i4));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i3 = iNextInt % i4;
                } while ((i4 - 1) + (iNextInt - i3) < 0);
                iNextBits = i3;
            }
            return i + iNextBits;
        }
        while (true) {
            int iNextInt2 = nextInt();
            if (i <= iNextInt2 && iNextInt2 < i2) {
                return iNextInt2;
            }
        }
    }

    public long nextLong(long j, long j2) {
        long jNextLong;
        long j3;
        long jNextBits;
        int iNextInt;
        if (j2 <= j) {
            C5919.m11253(AbstractC4921.m9902(Long.valueOf(j), Long.valueOf(j2)));
            return 0L;
        }
        long j4 = j2 - j;
        if (j4 > 0) {
            if (((-j4) & j4) == j4) {
                int i = (int) j4;
                int i2 = (int) (j4 >>> 32);
                if (i != 0) {
                    iNextInt = nextBits(31 - Integer.numberOfLeadingZeros(i));
                } else if (i2 == 1) {
                    iNextInt = nextInt();
                } else {
                    jNextBits = (((long) nextBits(31 - Integer.numberOfLeadingZeros(i2))) << 32) + (((long) nextInt()) & 4294967295L);
                }
                jNextBits = ((long) iNextInt) & 4294967295L;
            } else {
                do {
                    jNextLong = nextLong() >>> 1;
                    j3 = jNextLong % j4;
                } while ((j4 - 1) + (jNextLong - j3) < 0);
                jNextBits = j3;
            }
            return j + jNextBits;
        }
        while (true) {
            long jNextLong2 = nextLong();
            if (j <= jNextLong2 && jNextLong2 < j2) {
                return jNextLong2;
            }
        }
    }

    public int nextInt(int i) {
        return nextInt(0, i);
    }

    public double nextDouble(double d) {
        return nextDouble(0.0d, d);
    }

    public double nextDouble() {
        return ((((long) nextBits(26)) << 27) + ((long) nextBits(27))) / 9.007199254740992E15d;
    }

    public long nextLong(long j) {
        return nextLong(0L, j);
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public byte[] nextBytes(byte[] bArr) {
        bArr.getClass();
        return nextBytes(bArr, 0, bArr.length);
    }

    public byte[] nextBytes(int i) {
        return nextBytes(new byte[i]);
    }
}
