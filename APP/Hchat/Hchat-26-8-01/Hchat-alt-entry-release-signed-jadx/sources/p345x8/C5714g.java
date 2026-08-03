package p345x8;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: x8.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5714g {

    /* JADX INFO: renamed from: a */
    public final String f23241a;

    /* JADX INFO: renamed from: b */
    public final String f23242b;

    /* JADX INFO: renamed from: c */
    public final String f23243c;

    /* JADX INFO: renamed from: d */
    public final long f23244d;

    /* JADX INFO: renamed from: e */
    public final boolean f23245e;

    /* JADX INFO: renamed from: f */
    public final boolean f23246f;

    /* JADX INFO: renamed from: g */
    public final boolean f23247g;

    /* JADX INFO: renamed from: h */
    public final boolean f23248h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5714g(String str, String str2, String str3, long j3, boolean z9, boolean z10, boolean z11, boolean z12) {
        str3.getClass();
        this.f23241a = str;
        this.f23242b = str2;
        this.f23243c = str3;
        this.f23244d = j3;
        this.f23245e = z9;
        this.f23246f = z10;
        this.f23247g = z11;
        this.f23248h = z12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5714g)) {
            return false;
        }
        C5714g c5714g = (C5714g) obj;
        return AbstractC1416l.m3825a(this.f23241a, c5714g.f23241a) && AbstractC1416l.m3825a(this.f23242b, c5714g.f23242b) && AbstractC1416l.m3825a(this.f23243c, c5714g.f23243c) && this.f23244d == c5714g.f23244d && this.f23245e == c5714g.f23245e && this.f23246f == c5714g.f23246f && this.f23247g == c5714g.f23247g && this.f23248h == c5714g.f23248h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f23248h) + AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f23241a.hashCode() * 31, 31, this.f23242b), 31, this.f23243c), 31, this.f23244d), 31, this.f23245e), 31, this.f23246f), 31, this.f23247g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("MessageContext(talker=", this.f23241a, ", sender=", this.f23242b, ", content=");
        sbM1027p.append(this.f23243c);
        sbM1027p.append(", msgId=");
        sbM1027p.append(this.f23244d);
        sbM1027p.append(", group=");
        sbM1027p.append(this.f23245e);
        sbM1027p.append(", atMe=");
        sbM1027p.append(this.f23246f);
        sbM1027p.append(", atAll=");
        sbM1027p.append(this.f23247g);
        sbM1027p.append(", patMe=");
        sbM1027p.append(this.f23248h);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r12v0 java.lang.String)
  (r13v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0004: SGET  A[WRAPPED] (LINE:24) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r14v0 java.lang.String))
  (0 long)
  false
  false
  false
  false
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, boolean, boolean, boolean, boolean):void (m)] (LINE:25) call: x8.g.<init>(java.lang.String, java.lang.String, java.lang.String, long, boolean, boolean, boolean, boolean):void type: THIS */
    public /* synthetic */ C5714g(int i9, String str, String str2, String str3) {
        this(str, str2, (i9 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, 0L, false, false, false, false);
    }
}
