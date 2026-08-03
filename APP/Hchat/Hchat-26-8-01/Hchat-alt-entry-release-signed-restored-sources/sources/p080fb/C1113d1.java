package p080fb;

import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.util.List;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;

/* JADX INFO: renamed from: fb.d1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1113d1 {

    /* JADX INFO: renamed from: a */
    public final String f3636a;

    /* JADX INFO: renamed from: b */
    public final String f3637b;

    /* JADX INFO: renamed from: c */
    public final long f3638c;

    /* JADX INFO: renamed from: d */
    public final long f3639d;

    /* JADX INFO: renamed from: e */
    public final List f3640e;

    /* JADX INFO: renamed from: f */
    public final C1192y f3641f;

    /* JADX INFO: renamed from: g */
    public final String f3642g;

    /* JADX INFO: renamed from: h */
    public final String f3643h;

    /* JADX INFO: renamed from: i */
    public final String f3644i;

    /* JADX INFO: renamed from: j */
    public final String f3645j;

    /* JADX INFO: renamed from: k */
    public final int f3646k;

    /* JADX INFO: renamed from: l */
    public final boolean f3647l;

    /* JADX INFO: renamed from: m */
    public final boolean f3648m;

    /* JADX INFO: renamed from: n */
    public final long f3649n;

    /* JADX INFO: renamed from: o */
    public final C1109c1 f3650o;

    /* JADX INFO: renamed from: p */
    public final long f3651p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1113d1(String str, String str2, long j3, long j4, List list, C1192y c1192y, String str3, String str4, String str5, String str6, int i9, boolean z9, boolean z10, long j5, C1109c1 c1109c1, long j10) {
        str.getClass();
        str2.getClass();
        list.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        this.f3636a = str;
        this.f3637b = str2;
        this.f3638c = j3;
        this.f3639d = j4;
        this.f3640e = list;
        this.f3641f = c1192y;
        this.f3642g = str3;
        this.f3643h = str4;
        this.f3644i = str5;
        this.f3645j = str6;
        this.f3646k = i9;
        this.f3647l = z9;
        this.f3648m = z10;
        this.f3649n = j5;
        this.f3650o = c1109c1;
        this.f3651p = j10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1113d1 m2848a(C1113d1 c1113d1, String str, boolean z9, boolean z10, long j3, int i9) {
        String str2 = c1113d1.f3636a;
        String str3 = (i9 & 2) != 0 ? c1113d1.f3637b : str;
        long j4 = c1113d1.f3638c;
        String str4 = str3;
        long j5 = c1113d1.f3639d;
        List list = c1113d1.f3640e;
        C1192y c1192y = c1113d1.f3641f;
        String str5 = c1113d1.f3642g;
        String str6 = c1113d1.f3643h;
        String str7 = c1113d1.f3644i;
        String str8 = c1113d1.f3645j;
        int i10 = c1113d1.f3646k;
        boolean z11 = (i9 & Opcodes.ACC_STRICT) != 0 ? c1113d1.f3647l : z9;
        boolean z12 = (i9 & 4096) != 0 ? c1113d1.f3648m : z10;
        long j10 = (i9 & 8192) != 0 ? c1113d1.f3649n : j3;
        C1109c1 c1109c1 = c1113d1.f3650o;
        long j11 = c1113d1.f3651p;
        c1113d1.getClass();
        str2.getClass();
        str4.getClass();
        list.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        return new C1113d1(str2, str4, j4, j5, list, c1192y, str5, str6, str7, str8, i10, z11, z12, j10, c1109c1, j11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m2849b() {
        return this.f3636a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1113d1)) {
            return false;
        }
        C1113d1 c1113d1 = (C1113d1) obj;
        return AbstractC1416l.m3825a(this.f3636a, c1113d1.f3636a) && AbstractC1416l.m3825a(this.f3637b, c1113d1.f3637b) && this.f3638c == c1113d1.f3638c && this.f3639d == c1113d1.f3639d && AbstractC1416l.m3825a(this.f3640e, c1113d1.f3640e) && AbstractC1416l.m3825a(this.f3641f, c1113d1.f3641f) && AbstractC1416l.m3825a(this.f3642g, c1113d1.f3642g) && AbstractC1416l.m3825a(this.f3643h, c1113d1.f3643h) && AbstractC1416l.m3825a(this.f3644i, c1113d1.f3644i) && AbstractC1416l.m3825a(this.f3645j, c1113d1.f3645j) && this.f3646k == c1113d1.f3646k && this.f3647l == c1113d1.f3647l && this.f3648m == c1113d1.f3648m && this.f3649n == c1113d1.f3649n && AbstractC1416l.m3825a(this.f3650o, c1113d1.f3650o) && this.f3651p == c1113d1.f3651p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iM5158e = AbstractC2091b.m5158e(this.f3640e, AbstractC0921a.m2243f(AbstractC0921a.m2243f(AbstractC0921a.m2244g(this.f3636a.hashCode() * 31, 31, this.f3637b), 31, this.f3638c), 31, this.f3639d), 31);
        C1192y c1192y = this.f3641f;
        int iM2243f = AbstractC0921a.m2243f(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2242e(this.f3646k, AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g(AbstractC0921a.m2244g((iM5158e + (c1192y == null ? 0 : c1192y.hashCode())) * 31, 31, this.f3642g), 31, this.f3643h), 31, this.f3644i), 31, this.f3645j), 31), 31, this.f3647l), 31, this.f3648m), 31, this.f3649n);
        C1109c1 c1109c1 = this.f3650o;
        return Long.hashCode(this.f3651p) + ((iM2243f + (c1109c1 != null ? c1109c1.hashCode() : 0)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbM1027p = AbstractC0255e.m1027p("ScriptPluginAgentSession(id=", this.f3636a, ", title=", this.f3637b, ", createdAt=");
        sbM1027p.append(this.f3638c);
        AbstractC2091b.m5172s(sbM1027p, ", updatedAt=", this.f3639d, ", messages=");
        sbM1027p.append(this.f3640e);
        sbM1027p.append(", draft=");
        sbM1027p.append(this.f3641f);
        sbM1027p.append(", targetPluginId=");
        AbstractC2091b.m5173t(sbM1027p, this.f3642g, ", conversationSummary=", this.f3643h, ", nativeToolHistory=");
        AbstractC2091b.m5173t(sbM1027p, this.f3644i, ", protocolTranscript=", this.f3645j, ", compactedMessageCount=");
        sbM1027p.append(this.f3646k);
        sbM1027p.append(", pinned=");
        sbM1027p.append(this.f3647l);
        sbM1027p.append(", locked=");
        sbM1027p.append(this.f3648m);
        sbM1027p.append(", sortOrder=");
        sbM1027p.append(this.f3649n);
        sbM1027p.append(", resumeState=");
        sbM1027p.append(this.f3650o);
        sbM1027p.append(", checkpointSeq=");
        return AbstractC0921a.m2253p(sbM1027p, this.f3651p, ")");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0032: CONSTRUCTOR 
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 long)
  (r29v0 long)
  (r31v0 java.util.List)
  (r32v0 fb.y)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r35v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0008: SGET  A[WRAPPED] (LINE:64) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r33v0 java.lang.String))
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r35v0 int) & (wrap:??:SGET  A[WRAPPED] bsh.org.objectweb.asm.Opcodes.ACC_NATIVE int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0010: SGET  A[WRAPPED] (LINE:64) okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String) : (r34v0 java.lang.String))
  (wrap:java.lang.String:SGET  A[WRAPPED] okhttp3.HttpUrl.FRAGMENT_ENCODE_SET java.lang.String)
  (0 int)
  false
  false
  (r29v0 long)
  (null fb.c1)
  (0 long)
 A[MD:(java.lang.String, java.lang.String, long, long, java.util.List, fb.y, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, long, fb.c1, long):void (m)] (LINE:64) call: fb.d1.<init>(java.lang.String, java.lang.String, long, long, java.util.List, fb.y, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, boolean, boolean, long, fb.c1, long):void type: THIS */
    public /* synthetic */ C1113d1(String str, String str2, long j3, long j4, List list, C1192y c1192y, String str3, String str4, int i9) {
        this(str, str2, j3, j4, list, c1192y, (i9 & 64) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str3, HttpUrl.FRAGMENT_ENCODE_SET, (i9 & Opcodes.ACC_NATIVE) != 0 ? HttpUrl.FRAGMENT_ENCODE_SET : str4, HttpUrl.FRAGMENT_ENCODE_SET, 0, false, false, j4, null, 0L);
    }
}
