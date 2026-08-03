package Yue;

import Yue.C4555;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nlongSaturatedMath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n1#1,81:1\n80#1:82\n80#1:83\n80#1:84\n80#1:85\n80#1:86\n80#1:87\n*S KotlinDebug\n*F\n+ 1 longSaturatedMath.kt\nkotlin/time/LongSaturatedMathKt\n*L\n14#1:82\n17#1:83\n36#1:84\n46#1:85\n53#1:86\n57#1:87\n*E\n"})
public final class C5884 {
    /* JADX INFO: renamed from: ۥ */
    public static final long m2552(long j, long j2, long j3) {
        if (!C4555.m13438(j2) || (j ^ j3) >= 0) {
            return j;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final long m2553(long j) {
        return j < 0 ? C4555.f9803.m13501() : C4555.f9803.m13491();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m18203(long j) {
        return ((j - 1) | 1) == Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final long m18204(long j, @InterfaceC6399 EnumC4559 enumC4559, long j2) {
        C5499.m17103(enumC4559, "unit");
        long jM13452 = C4555.m13452(j2, enumC4559);
        if (((j - 1) | 1) == Long.MAX_VALUE) {
            return m2552(j, j2, jM13452);
        }
        if ((1 | (jM13452 - 1)) == Long.MAX_VALUE) {
            return m18205(j, enumC4559, j2);
        }
        long j3 = j + jM13452;
        return ((j ^ j3) & (jM13452 ^ j3)) < 0 ? j < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final long m18205(long j, EnumC4559 enumC4559, long j2) {
        long jM13398 = C4555.m13398(j2, 2);
        long jM13452 = C4555.m13452(jM13398, enumC4559);
        return (1 | (jM13452 - 1)) == Long.MAX_VALUE ? jM13452 : m18204(m18204(j, enumC4559, jM13398), enumC4559, C4555.m13441(j2, jM13398));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final long m18206(long j, long j2, @InterfaceC6399 EnumC4559 enumC4559) {
        C5499.m17103(enumC4559, "unit");
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? C4555.m13459(m2553(j2)) : m18207(j, j2, enumC4559);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final long m18207(long j, long j2, EnumC4559 enumC4559) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return C4558.m13596(j3, enumC4559);
        }
        EnumC4559 enumC45592 = EnumC4559.f9812;
        if (enumC4559.compareTo(enumC45592) >= 0) {
            return C4555.m13459(m2553(j3));
        }
        long jM1510 = C4561.m1510(1L, enumC45592, enumC4559);
        long j4 = (j / jM1510) - (j2 / jM1510);
        long j5 = (j % jM1510) - (j2 % jM1510);
        C4555.C0439 c0439 = C4555.f9803;
        return C4555.m13442(C4558.m13596(j4, enumC45592), C4558.m13596(j5, enumC4559));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final long m18208(long j, long j2, @InterfaceC6399 EnumC4559 enumC4559) {
        C5499.m17103(enumC4559, "unit");
        return ((j2 - 1) | 1) == Long.MAX_VALUE ? j == j2 ? C4555.f9803.m13508() : C4555.m13459(m2553(j2)) : (1 | (j - 1)) == Long.MAX_VALUE ? m2553(j) : m18207(j, j2, enumC4559);
    }
}
