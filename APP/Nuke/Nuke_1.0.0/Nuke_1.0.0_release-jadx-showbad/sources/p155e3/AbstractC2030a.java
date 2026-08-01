package p155e3;

import com.bumptech.glide.AbstractC1926h;
import p049I2.AbstractC0797o;
import p110W0.C1577b;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;

/* JADX INFO: renamed from: e3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2030a implements Comparable {

    /* JADX INFO: renamed from: d */
    public static final C1577b f6765d = new C1577b(22);

    /* JADX INFO: renamed from: e */
    public static final long f6766e = AbstractC0797o.m1388m(4611686018427387903L);

    /* JADX INFO: renamed from: f */
    public static final long f6767f = AbstractC0797o.m1388m(-4611686018427387903L);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final long m3730a(long j5, long j6) {
        long j7 = 1000000;
        long j8 = j6 / j7;
        long jM1383g = AbstractC0797o.m1383g(j5, j8);
        if (-4611686018426L > jM1383g || jM1383g >= 4611686018427L) {
            return AbstractC0797o.m1388m(jM1383g);
        }
        long j9 = ((jM1383g * j7) + (j6 - (j8 * j7))) << 1;
        int i5 = AbstractC2031b.f6768a;
        return j9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final long m3731b(long j5, long j6) {
        int i5 = ((int) j5) & 1;
        if (i5 != (((int) j6) & 1)) {
            return i5 == 1 ? m3730a(j5 >> 1, j6 >> 1) : m3730a(j6 >> 1, j5 >> 1);
        }
        if (i5 == 0) {
            long j7 = (j5 >> 1) + (j6 >> 1);
            if (-4611686018426999999L > j7 || j7 >= 4611686018427000000L) {
                return AbstractC0797o.m1388m(j7 / ((long) 1000000));
            }
            long j8 = j7 << 1;
            int i6 = AbstractC2031b.f6768a;
            return j8;
        }
        long jM1383g = AbstractC0797o.m1383g(j5 >> 1, j6 >> 1);
        if (jM1383g == 9223372036854759646L) {
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (jM1383g == 4611686018427387903L || jM1383g == -4611686018427387903L) {
            return AbstractC0797o.m1388m(jM1383g);
        }
        if (-4611686018426L > jM1383g || jM1383g >= 4611686018427L) {
            return AbstractC0797o.m1388m(AbstractC1926h.m3569l(jM1383g));
        }
        long j9 = (jM1383g * ((long) 1000000)) << 1;
        int i7 = AbstractC2031b.f6768a;
        return j9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final long m3732c(long j5, EnumC2032c enumC2032c) {
        AbstractC1665j.m2985e(enumC2032c, "unit");
        if (j5 == f6766e) {
            return Long.MAX_VALUE;
        }
        if (j5 == f6767f) {
            return Long.MIN_VALUE;
        }
        return AbstractC1784a.m3226l(j5 >> 1, (((int) j5) & 1) == 0 ? EnumC2032c.NANOSECONDS : EnumC2032c.MILLISECONDS, enumC2032c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m3733d(long j5) {
        long j6 = ((-(j5 >> 1)) << 1) + ((long) (((int) j5) & 1));
        int i5 = AbstractC2031b.f6768a;
        return j6;
    }
}
