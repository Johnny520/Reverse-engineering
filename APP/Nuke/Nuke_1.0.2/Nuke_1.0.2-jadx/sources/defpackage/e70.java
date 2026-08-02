package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public interface e70 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float A(float f) {
        return b() * f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float K(long j) {
        if (!q13.a(p13.b(j), 4294967296L)) {
            mz0.b("Only Sp can convert to Px");
        }
        float[] fArr = em0.a;
        if (m() < 1.03f) {
            return m() * p13.c(j);
        }
        dm0 dm0VarA = em0.a(m());
        if (dm0VarA != null) {
            return dm0VarA.b(p13.c(j));
        }
        return m() * p13.c(j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default int T(float f) {
        float fA = A(f);
        if (Float.isInfinite(fA)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fA);
    }

    float b();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long d0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fA = A(Float.intBitsToFloat((int) (j >> 32)));
        float fA2 = A(Float.intBitsToFloat((int) (j & 4294967295L)));
        return (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(fA2)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float h0(long j) {
        if (!q13.a(p13.b(j), 4294967296L)) {
            mz0.b("Only Sp can convert to Px");
        }
        return A(K(j));
    }

    float m();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long p0(float f) {
        return x(x0(f));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float u0(int i) {
        return i / b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long x(float f) {
        float[] fArr = em0.a;
        if (m() < 1.03f) {
            return rg3.I(f / m(), 4294967296L);
        }
        dm0 dm0VarA = em0.a(m());
        return rg3.I(dm0VarA != null ? dm0VarA.a(f) : f / m(), 4294967296L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default float x0(float f) {
        return f / b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long y(long j) {
        if (j != 9205357640488583168L) {
            return p7.a(x0(Float.intBitsToFloat((int) (j >> 32))), x0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }
}
