package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface e70 {
    /* JADX INFO: renamed from: A */
    default float mo689A(float f) {
        return mo693b() * f;
    }

    /* JADX INFO: renamed from: K */
    default float mo690K(long j) {
        if (!q13.m4041a(p13.m3674b(j), 4294967296L)) {
            mz0.m3221b("Only Sp can convert to Px");
        }
        float[] fArr = em0.f2505a;
        if (mo697m() < 1.03f) {
            return mo697m() * p13.m3675c(j);
        }
        dm0 dm0VarM1365a = em0.m1365a(mo697m());
        if (dm0VarM1365a != null) {
            return dm0VarM1365a.mo124b(p13.m3675c(j));
        }
        return mo697m() * p13.m3675c(j);
    }

    /* JADX INFO: renamed from: T */
    default int mo692T(float f) {
        float fMo689A = mo689A(f);
        if (Float.isInfinite(fMo689A)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fMo689A);
    }

    /* JADX INFO: renamed from: b */
    float mo693b();

    /* JADX INFO: renamed from: d0 */
    default long mo694d0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fMo689A = mo689A(Float.intBitsToFloat((int) (j >> 32)));
        float fMo689A2 = mo689A(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (((long) Float.floatToRawIntBits(fMo689A)) << 32) | (((long) Float.floatToRawIntBits(fMo689A2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: h0 */
    default float mo695h0(long j) {
        if (!q13.m4041a(p13.m3674b(j), 4294967296L)) {
            mz0.m3221b("Only Sp can convert to Px");
        }
        return mo689A(mo690K(j));
    }

    /* JADX INFO: renamed from: m */
    float mo697m();

    /* JADX INFO: renamed from: p0 */
    default long mo698p0(float f) {
        return mo701x(mo702x0(f));
    }

    /* JADX INFO: renamed from: u0 */
    default float mo700u0(int i) {
        return i / mo693b();
    }

    /* JADX INFO: renamed from: x */
    default long mo701x(float f) {
        float[] fArr = em0.f2505a;
        if (mo697m() < 1.03f) {
            return rg3.m4455I(f / mo697m(), 4294967296L);
        }
        dm0 dm0VarM1365a = em0.m1365a(mo697m());
        return rg3.m4455I(dm0VarM1365a != null ? dm0VarM1365a.mo123a(f) : f / mo697m(), 4294967296L);
    }

    /* JADX INFO: renamed from: x0 */
    default float mo702x0(float f) {
        return f / mo693b();
    }

    /* JADX INFO: renamed from: y */
    default long mo703y(long j) {
        if (j != 9205357640488583168L) {
            return AbstractC0570p7.m3765a(mo702x0(Float.intBitsToFloat((int) (j >> 32))), mo702x0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }
}
