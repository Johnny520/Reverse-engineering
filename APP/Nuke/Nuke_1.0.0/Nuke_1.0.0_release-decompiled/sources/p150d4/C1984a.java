package p150d4;

import p117X2.AbstractC1665j;
import p118X3.C1706p;
import p118X3.C1707q;
import p149d3.AbstractC1976d;
import p204n0.C2683b;
import p208n4.InterfaceC2708g;
import p227r.EnumC2983d0;

/* JADX INFO: renamed from: d4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1984a {

    /* JADX INFO: renamed from: a */
    public long f6674a;

    /* JADX INFO: renamed from: b */
    public Object f6675b;

    public C1984a(long j5, EnumC2983d0 enumC2983d0) {
        this.f6675b = enumC2983d0;
        this.f6674a = j5;
    }

    /* JADX INFO: renamed from: a */
    public long m3659a(long j5, long j6, float f2) {
        long jM4647e = C2683b.m4647e(this.f6674a, C2683b.m4646d(j5, j6));
        this.f6674a = jM4647e;
        if ((((EnumC2983d0) this.f6675b) == null ? C2683b.m4645c(jM4647e) : Math.abs(m3660b(jM4647e))) < f2) {
            return 9205357640488583168L;
        }
        if (((EnumC2983d0) this.f6675b) == null) {
            long j7 = this.f6674a;
            float fM4645c = C2683b.m4645c(j7);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / fM4645c;
            return C2683b.m4646d(this.f6674a, C2683b.m4648f(f2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) / fM4645c)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32)));
        }
        float fM3660b = m3660b(this.f6674a) - (Math.signum(m3660b(this.f6674a)) * f2);
        long j8 = this.f6674a;
        EnumC2983d0 enumC2983d0 = (EnumC2983d0) this.f6675b;
        EnumC2983d0 enumC2983d02 = EnumC2983d0.f9448e;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (enumC2983d0 == enumC2983d02 ? j8 & 4294967295L : j8 >> 32));
        if (((EnumC2983d0) this.f6675b) == enumC2983d02) {
            return (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fM3660b)) << 32);
        }
        return (((long) Float.floatToRawIntBits(fM3660b)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
    }

    /* JADX INFO: renamed from: b */
    public float m3660b(long j5) {
        return Float.intBitsToFloat((int) (((EnumC2983d0) this.f6675b) == EnumC2983d0.f9448e ? j5 >> 32 : j5 & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public C1707q m3661c() {
        C1706p c1706p = new C1706p(0);
        while (true) {
            String strMo4722o = ((InterfaceC2708g) this.f6675b).mo4722o(this.f6674a);
            this.f6674a -= (long) strMo4722o.length();
            if (strMo4722o.length() == 0) {
                return c1706p.m3024c();
            }
            int iM3634b0 = AbstractC1976d.m3634b0(strMo4722o, ':', 1, 4);
            if (iM3634b0 != -1) {
                String strSubstring = strMo4722o.substring(0, iM3634b0);
                AbstractC1665j.m2984d(strSubstring, "substring(...)");
                String strSubstring2 = strMo4722o.substring(iM3634b0 + 1);
                AbstractC1665j.m2984d(strSubstring2, "substring(...)");
                c1706p.m3023b(strSubstring, strSubstring2);
            } else if (strMo4722o.charAt(0) == ':') {
                String strSubstring3 = strMo4722o.substring(1);
                AbstractC1665j.m2984d(strSubstring3, "substring(...)");
                c1706p.m3023b("", strSubstring3);
            } else {
                c1706p.m3023b("", strMo4722o);
            }
        }
    }

    public /* synthetic */ C1984a(EnumC2983d0 enumC2983d0) {
        this(0L, enumC2983d0);
    }
}
