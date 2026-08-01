package p102z0;

import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;

/* JADX INFO: renamed from: z0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1119b {

    /* JADX INFO: renamed from: a */
    public final boolean f3767a;

    /* JADX INFO: renamed from: b */
    public final String f3768b;

    /* JADX INFO: renamed from: c */
    public final long f3769c;

    /* JADX INFO: renamed from: d */
    public final boolean f3770d;

    /* JADX INFO: renamed from: e */
    public final int f3771e;

    /* JADX INFO: renamed from: f */
    public final String f3772f;

    /* JADX INFO: renamed from: g */
    public final boolean f3773g;

    /* JADX INFO: renamed from: h */
    public final String f3774h;

    /* JADX INFO: renamed from: i */
    public final String f3775i;

    /* JADX INFO: renamed from: j */
    public final long f3776j;

    /* JADX INFO: renamed from: k */
    public final boolean f3777k;

    /* JADX INFO: renamed from: l */
    public final Throwable f3778l;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (wrap:boolean:0x0007: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? true : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : ("软件完整性校验失败，功能已停用"))
  (0 long)
  false
  (0 int)
  ("")
  false
  ("")
  ("")
  (0 long)
  false
  (wrap:java.lang.Throwable:?: TERNARY null = ((wrap:int:0x0016: ARITH (r19v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Throwable) : (r18v0 java.lang.Throwable))
 A[MD:(boolean, java.lang.String, long, boolean, int, java.lang.String, boolean, java.lang.String, java.lang.String, long, boolean, java.lang.Throwable):void (m)] (LINE:1) call: z0.b.<init>(boolean, java.lang.String, long, boolean, int, java.lang.String, boolean, java.lang.String, java.lang.String, long, boolean, java.lang.Throwable):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1119b(Throwable th, int i2) {
        this((i2 & 1) != 0, (i2 & 2) != 0 ? "" : "软件完整性校验失败，功能已停用", 0L, false, 0, "", false, "", "", 0L, false, (i2 & 2048) != 0 ? null : th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C1119b m2399a(C1119b c1119b, Throwable th, int i2) {
        boolean z2 = (i2 & 1) != 0 ? c1119b.f3767a : false;
        String str = (i2 & 2) != 0 ? c1119b.f3768b : "配置已过期且无法连接后台，软件功能已停用";
        boolean z3 = (i2 & 1024) != 0 ? c1119b.f3777k : true;
        AbstractC0223g.m418e(str, "serviceMessage");
        String str2 = c1119b.f3772f;
        AbstractC0223g.m418e(str2, "latestVersionName");
        String str3 = c1119b.f3774h;
        AbstractC0223g.m418e(str3, "updateMessage");
        String str4 = c1119b.f3775i;
        AbstractC0223g.m418e(str4, "downloadUrl");
        return new C1119b(z2, str, c1119b.f3769c, c1119b.f3770d, c1119b.f3771e, str2, c1119b.f3773g, str3, str4, c1119b.f3776j, z3, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2400b() {
        return this.f3767a && this.f3770d && this.f3771e > 1027 && !AbstractC0307q.m534d0(this.f3775i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1119b)) {
            return false;
        }
        C1119b c1119b = (C1119b) obj;
        return this.f3767a == c1119b.f3767a && AbstractC0223g.m414a(this.f3768b, c1119b.f3768b) && this.f3769c == c1119b.f3769c && this.f3770d == c1119b.f3770d && this.f3771e == c1119b.f3771e && AbstractC0223g.m414a(this.f3772f, c1119b.f3772f) && this.f3773g == c1119b.f3773g && AbstractC0223g.m414a(this.f3774h, c1119b.f3774h) && AbstractC0223g.m414a(this.f3775i, c1119b.f3775i) && this.f3776j == c1119b.f3776j && this.f3777k == c1119b.f3777k && AbstractC0223g.m414a(this.f3778l, c1119b.f3778l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (Boolean.hashCode(this.f3777k) + ((Long.hashCode(this.f3776j) + AbstractC0174d.m347c(this.f3775i, AbstractC0174d.m347c(this.f3774h, (Boolean.hashCode(this.f3773g) + AbstractC0174d.m347c(this.f3772f, AbstractC0174d.m345a(this.f3771e, (Boolean.hashCode(this.f3770d) + ((Long.hashCode(this.f3769c) + AbstractC0174d.m347c(this.f3768b, Boolean.hashCode(this.f3767a) * 31, 31)) * 31)) * 31, 31), 31)) * 31, 31), 31)) * 31)) * 31;
        Throwable th = this.f3778l;
        return iHashCode + (th == null ? 0 : th.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "AppUpdateCheckResult(serviceEnabled=" + this.f3767a + ", serviceMessage=" + this.f3768b + ", validUntil=" + this.f3769c + ", updateEnabled=" + this.f3770d + ", latestVersionCode=" + this.f3771e + ", latestVersionName=" + this.f3772f + ", forceUpdate=" + this.f3773g + ", updateMessage=" + this.f3774h + ", downloadUrl=" + this.f3775i + ", serverTime=" + this.f3776j + ", fromCache=" + this.f3777k + ", error=" + this.f3778l + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C1119b(boolean z2, String str, long j2, boolean z3, int i2, String str2, boolean z4, String str3, String str4, long j3, boolean z5, Throwable th) {
        AbstractC0223g.m418e(str, "serviceMessage");
        this.f3767a = z2;
        this.f3768b = str;
        this.f3769c = j2;
        this.f3770d = z3;
        this.f3771e = i2;
        this.f3772f = str2;
        this.f3773g = z4;
        this.f3774h = str3;
        this.f3775i = str4;
        this.f3776j = j3;
        this.f3777k = z5;
        this.f3778l = th;
    }
}
