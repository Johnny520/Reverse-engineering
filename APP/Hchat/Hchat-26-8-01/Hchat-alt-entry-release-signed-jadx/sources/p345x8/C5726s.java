package p345x8;

import gg.AbstractC1416l;
import p068eh.AbstractC0921a;

/* JADX INFO: renamed from: x8.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5726s {

    /* JADX INFO: renamed from: a */
    public final String f23312a;

    /* JADX INFO: renamed from: b */
    public final int f23313b;

    /* JADX INFO: renamed from: c */
    public final String f23314c;

    /* JADX INFO: renamed from: d */
    public final long f23315d;

    /* JADX INFO: renamed from: e */
    public final boolean f23316e;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0019: CONSTRUCTOR 
  (wrap:java.lang.String:0x000c: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (wrap:java.lang.String:0x0008: INVOKE (wrap:long:0x0004: INVOKE  STATIC call: java.lang.System.currentTimeMillis():long A[MD:():long (c), WRAPPED] (LINE:5)) STATIC call: java.lang.String.valueOf(long):java.lang.String A[MD:(long):java.lang.String (c), WRAPPED] (LINE:9)) : (r9v0 java.lang.String))
  (0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000d: ARITH (r8v0 int) & (4 int) A[WRAPPED] (LINE:14)) != (0 int)) ? ("你好") : (r10v0 java.lang.String))
  (0 long)
  false
 A[MD:(java.lang.String, int, java.lang.String, long, boolean):void (m)] (LINE:26) call: x8.s.<init>(java.lang.String, int, java.lang.String, long, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5726s(int i9, String str, String str2) {
        this((i9 & 1) != 0 ? String.valueOf(System.currentTimeMillis()) : str, 0, (i9 & 4) != 0 ? "你好" : str2, 0L, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C5726s m10397a(C5726s c5726s, int i9, String str, long j3, boolean z9, int i10) {
        int i11 = i9;
        String str2 = c5726s.f23312a;
        if ((i10 & 2) != 0) {
            i11 = c5726s.f23313b;
        }
        if ((i10 & 4) != 0) {
            str = c5726s.f23314c;
        }
        if ((i10 & 8) != 0) {
            j3 = c5726s.f23315d;
        }
        if ((i10 & 16) != 0) {
            z9 = c5726s.f23316e;
        }
        c5726s.getClass();
        str2.getClass();
        str.getClass();
        long j4 = j3;
        String str3 = str;
        return new C5726s(str2, i11, str3, j4, z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5726s)) {
            return false;
        }
        C5726s c5726s = (C5726s) obj;
        return AbstractC1416l.m3825a(this.f23312a, c5726s.f23312a) && this.f23313b == c5726s.f23313b && AbstractC1416l.m3825a(this.f23314c, c5726s.f23314c) && this.f23315d == c5726s.f23315d && this.f23316e == c5726s.f23316e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f23316e) + AbstractC0921a.m2243f(AbstractC0921a.m2244g(AbstractC0921a.m2242e(this.f23313b, this.f23312a.hashCode() * 31, 31), 31, this.f23314c), 31, this.f23315d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM2258u = AbstractC0921a.m2258u(this.f23313b, "AutoReplyStep(id=", this.f23312a, ", mode=", ", content=");
        sbM2258u.append(this.f23314c);
        sbM2258u.append(", delayMs=");
        sbM2258u.append(this.f23315d);
        sbM2258u.append(", randomDelay=");
        sbM2258u.append(this.f23316e);
        sbM2258u.append(")");
        return sbM2258u.toString();
    }

    public C5726s(String str, int i9, String str2, long j3, boolean z9) {
        str.getClass();
        str2.getClass();
        this.f23312a = str;
        this.f23313b = i9;
        this.f23314c = str2;
        this.f23315d = j3;
        this.f23316e = z9;
    }
}
