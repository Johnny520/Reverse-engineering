package p080fb;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.c1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1109c1 {

    /* JADX INFO: renamed from: a */
    public final String f3602a;

    /* JADX INFO: renamed from: b */
    public final String f3603b;

    /* JADX INFO: renamed from: c */
    public final String f3604c;

    /* JADX INFO: renamed from: d */
    public final String f3605d;

    /* JADX INFO: renamed from: e */
    public final C1138j2 f3606e;

    /* JADX INFO: renamed from: f */
    public final boolean f3607f;

    /* JADX INFO: renamed from: g */
    public final long f3608g;

    /* JADX INFO: renamed from: h */
    public final long f3609h;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r14v0 java.lang.String)
  (r15v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r23v0 int) & (4 int) A[WRAPPED] (LINE:1)) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:7) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r23v0 int) & (8 int) A[WRAPPED] (LINE:11)) != (0 int)) ? (wrap:??:0x000e: SGET  A[WRAPPED] (LINE:15) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r17v0 java.lang.String))
  (wrap:fb.j2:?: TERNARY null = ((wrap:int:0x0012: ARITH (r23v0 int) & (16 int) A[WRAPPED] (LINE:19)) != (0 int)) ? (null fb.j2) : (r18v0 fb.j2))
  true
  (r19v0 long)
  (r21v0 long)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, fb.j2, boolean, long, long):void (m)] (LINE:36) call: fb.c1.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, fb.j2, boolean, long, long):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1109c1(String str, String str2, String str3, String str4, C1138j2 c1138j2, long j3, long j4, int i9) {
        this(str, str2, (i9 & 4) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, (i9 & 8) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4, (i9 & 16) != 0 ? null : c1138j2, true, j3, j4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1109c1 m2845a(C1109c1 c1109c1, String str, String str2, boolean z9, long j3, int i9) {
        if ((i9 & 1) != 0) {
            str = c1109c1.f3602a;
        }
        String str3 = str;
        if ((i9 & 2) != 0) {
            str2 = c1109c1.f3603b;
        }
        String str4 = str2;
        String str5 = c1109c1.f3604c;
        String str6 = c1109c1.f3605d;
        C1138j2 c1138j2 = c1109c1.f3606e;
        long j4 = c1109c1.f3608g;
        c1109c1.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        return new C1109c1(str3, str4, str5, str6, c1138j2, z9, j4, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1109c1)) {
            return false;
        }
        C1109c1 c1109c1 = (C1109c1) obj;
        return AbstractC1416l.m3825a(this.f3602a, c1109c1.f3602a) && AbstractC1416l.m3825a(this.f3603b, c1109c1.f3603b) && AbstractC1416l.m3825a(this.f3604c, c1109c1.f3604c) && AbstractC1416l.m3825a(this.f3605d, c1109c1.f3605d) && AbstractC1416l.m3825a(this.f3606e, c1109c1.f3606e) && this.f3607f == c1109c1.f3607f && this.f3608g == c1109c1.f3608g && this.f3609h == c1109c1.f3609h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM2244g = AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f3602a.hashCode() * 31, 31, this.f3603b), 31, this.f3604c), 31, this.f3605d);
        C1138j2 c1138j2 = this.f3606e;
        return Long.hashCode(this.f3609h) + AbstractC0921a.m2243f(AbstractC0921a.m2245h((iM2244g + (c1138j2 == null ? 0 : c1138j2.hashCode())) * 31, 31, this.f3607f), 31, this.f3608g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentResumeState(turnId=", this.f3602a, ", sourceUserMessageId=", this.f3603b, ", taskGoal=");
        AbstractC2091b.m5173t(sbM1027p, this.f3604c, ", workContext=", this.f3605d, ", workspaceCheckpoint=");
        sbM1027p.append(this.f3606e);
        sbM1027p.append(", autoOpen=");
        sbM1027p.append(this.f3607f);
        sbM1027p.append(", startedAt=");
        sbM1027p.append(this.f3608g);
        sbM1027p.append(", updatedAt=");
        sbM1027p.append(this.f3609h);
        sbM1027p.append(")");
        return sbM1027p.toString();
    }

    public C1109c1(String str, String str2, String str3, String str4, C1138j2 c1138j2, boolean z9, long j3, long j4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f3602a = str;
        this.f3603b = str2;
        this.f3604c = str3;
        this.f3605d = str4;
        this.f3606e = c1138j2;
        this.f3607f = z9;
        this.f3608g = j3;
        this.f3609h = j4;
    }
}
