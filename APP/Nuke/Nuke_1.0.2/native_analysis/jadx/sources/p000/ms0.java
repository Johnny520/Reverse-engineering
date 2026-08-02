package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ms0 {

    /* JADX INFO: renamed from: a */
    public long f6808a;

    /* JADX INFO: renamed from: b */
    public Object f6809b;

    public ms0(long j, qv1 qv1Var) {
        this.f6809b = qv1Var;
        this.f6808a = j;
    }

    /* JADX INFO: renamed from: a */
    public long m3188a(long j, float f, boolean z) {
        long jM4612e;
        long j2 = this.f6808a;
        if (z) {
            jM4612e = rs1.m4612e(j2, j);
            this.f6808a = jM4612e;
        } else {
            jM4612e = rs1.m4612e(j2, j);
        }
        if ((((qv1) this.f6809b) == null ? rs1.m4610c(jM4612e) : Math.abs(m3189b(jM4612e))) < f) {
            return 9205357640488583168L;
        }
        qv1 qv1Var = (qv1) this.f6809b;
        long j3 = this.f6808a;
        if (qv1Var == null) {
            float fM4610c = rs1.m4610c(j3);
            return rs1.m4611d(this.f6808a, rs1.m4613f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) / fM4610c)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fM4610c)) & 4294967295L)));
        }
        float fM3189b = m3189b(j3) - (Math.signum(m3189b(this.f6808a)) * f);
        long j4 = this.f6808a;
        qv1 qv1Var2 = (qv1) this.f6809b;
        qv1 qv1Var3 = qv1.f9206i;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (qv1Var2 == qv1Var3 ? j4 & 4294967295L : j4 >> 32));
        if (((qv1) this.f6809b) == qv1Var3) {
            return (((long) Float.floatToRawIntBits(fM3189b)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fM3189b)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    /* JADX INFO: renamed from: b */
    public float m3189b(long j) {
        return Float.intBitsToFloat((int) (((qv1) this.f6809b) == qv1.f9206i ? j >> 32 : j & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public js0 m3190c() {
        ye0 ye0Var = new ye0(1);
        while (true) {
            String strMo1690s = ((InterfaceC0549on) this.f6809b).mo1690s(this.f6808a);
            this.f6808a -= (long) strMo1690s.length();
            if (strMo1690s.length() == 0) {
                return ye0Var.m6250b();
            }
            int iM4003p0 = pv2.m4003p0(strMo1690s, ':', 1, 4);
            if (iM4003p0 != -1) {
                n93.m3260a(ye0Var, strMo1690s.substring(0, iM4003p0), strMo1690s.substring(iM4003p0 + 1));
            } else if (strMo1690s.charAt(0) == ':') {
                n93.m3260a(ye0Var, "", strMo1690s.substring(1));
            } else {
                n93.m3260a(ye0Var, "", strMo1690s);
            }
        }
    }

    public /* synthetic */ ms0(qv1 qv1Var) {
        this(0L, qv1Var);
    }
}
