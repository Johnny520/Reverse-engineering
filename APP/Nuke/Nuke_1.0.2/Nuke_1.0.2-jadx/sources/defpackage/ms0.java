package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ms0 {
    public long a;
    public Object b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ms0(long j, qv1 qv1Var) {
        this.b = qv1Var;
        this.a = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long a(long j, float f, boolean z) {
        long jE;
        long j2 = this.a;
        if (z) {
            jE = rs1.e(j2, j);
            this.a = jE;
        } else {
            jE = rs1.e(j2, j);
        }
        if ((((qv1) this.b) == null ? rs1.c(jE) : Math.abs(b(jE))) < f) {
            return 9205357640488583168L;
        }
        qv1 qv1Var = (qv1) this.b;
        long j3 = this.a;
        if (qv1Var == null) {
            float fC = rs1.c(j3);
            return rs1.d(this.a, rs1.f(f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) / fC)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) / fC)) & 4294967295L)));
        }
        float fB = b(j3) - (Math.signum(b(this.a)) * f);
        long j4 = this.a;
        qv1 qv1Var2 = (qv1) this.b;
        qv1 qv1Var3 = qv1.i;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (qv1Var2 == qv1Var3 ? j4 & 4294967295L : j4 >> 32));
        if (((qv1) this.b) == qv1Var3) {
            return (((long) Float.floatToRawIntBits(fB)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fB)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public float b(long j) {
        return Float.intBitsToFloat((int) (((qv1) this.b) == qv1.i ? j >> 32 : j & 4294967295L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public js0 c() {
        ye0 ye0Var = new ye0(1);
        while (true) {
            String strS = ((on) this.b).s(this.a);
            this.a -= (long) strS.length();
            if (strS.length() == 0) {
                return ye0Var.b();
            }
            int iP0 = pv2.p0(strS, ':', 1, 4);
            if (iP0 != -1) {
                n93.a(ye0Var, strS.substring(0, iP0), strS.substring(iP0 + 1));
            } else if (strS.charAt(0) == ':') {
                n93.a(ye0Var, "", strS.substring(1));
            } else {
                n93.a(ye0Var, "", strS);
            }
        }
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (0 long), (r3v0 qv1) A[MD:(long, qv1):void (m)] (LINE:9) call: ms0.<init>(long, qv1):void type: THIS */
    public /* synthetic */ ms0(qv1 qv1Var) {
        this(0L, qv1Var);
    }
}
