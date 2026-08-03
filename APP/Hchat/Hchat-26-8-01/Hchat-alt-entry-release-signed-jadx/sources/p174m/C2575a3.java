package p174m;

import p057e1.C0807b;

/* JADX INFO: renamed from: m.a3 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2575a3 {

    /* JADX INFO: renamed from: a */
    public EnumC2640p1 f8347a;

    /* JADX INFO: renamed from: b */
    public long f8348b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2575a3(long j3, EnumC2640p1 enumC2640p1) {
        this.f8347a = enumC2640p1;
        this.f8348b = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final long m6042a(long j3, float f3, boolean z9) {
        long jM2042e;
        long j4 = this.f8348b;
        if (z9) {
            jM2042e = C0807b.m2042e(j4, j3);
            this.f8348b = jM2042e;
        } else {
            jM2042e = C0807b.m2042e(j4, j3);
        }
        if ((this.f8347a == null ? C0807b.m2040c(jM2042e) : Math.abs(m6043b(jM2042e))) < f3) {
            return 9205357640488583168L;
        }
        EnumC2640p1 enumC2640p1 = this.f8347a;
        long j5 = this.f8348b;
        if (enumC2640p1 == null) {
            float fM2040c = C0807b.m2040c(j5);
            return C0807b.m2041d(this.f8348b, C0807b.m2043f((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 >> 32)) / fM2040c)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j5 & 4294967295L)) / fM2040c)) & 4294967295L), f3));
        }
        float fM6043b = m6043b(j5) - (Math.signum(m6043b(this.f8348b)) * f3);
        long j10 = this.f8348b;
        EnumC2640p1 enumC2640p12 = this.f8347a;
        EnumC2640p1 enumC2640p13 = EnumC2640p1.f8623h;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (enumC2640p12 == enumC2640p13 ? j10 & 4294967295L : j10 >> 32));
        if (this.f8347a == enumC2640p13) {
            return (((long) Float.floatToRawIntBits(fM6043b)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
        }
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fM6043b)) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final float m6043b(long j3) {
        return Float.intBitsToFloat((int) (this.f8347a == EnumC2640p1.f8623h ? j3 >> 32 : j3 & 4294967295L));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (0 long), (r3v0 m.p1) A[MD:(long, m.p1):void (m)] (LINE:9) call: m.a3.<init>(long, m.p1):void type: THIS */
    public /* synthetic */ C2575a3(EnumC2640p1 enumC2640p1) {
        this(0L, enumC2640p1);
    }
}
