package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pt {
    public static final int $stable = 0;
    private final String identityGroup;
    private final String platform;

    @fp2("server_time")
    private final long serverTime;
    private final String status;
    private final String title;
    private final String userId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pt(String str, String str2, String str3, String str4, String str5, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.userId = str;
        this.platform = str2;
        this.status = str3;
        this.identityGroup = str4;
        this.title = str5;
        this.serverTime = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ pt h(pt ptVar, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ptVar.userId;
        }
        if ((i & 2) != 0) {
            str2 = ptVar.platform;
        }
        if ((i & 4) != 0) {
            str3 = ptVar.status;
        }
        if ((i & 8) != 0) {
            str4 = ptVar.identityGroup;
        }
        if ((i & 16) != 0) {
            str5 = ptVar.title;
        }
        if ((i & 32) != 0) {
            j = ptVar.serverTime;
        }
        long j2 = j;
        String str6 = str5;
        String str7 = str3;
        return ptVar.g(str, str2, str7, str4, str6, j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String a() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String b() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String c() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String d() {
        return this.identityGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String e() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt)) {
            return false;
        }
        pt ptVar = (pt) obj;
        return t11.l(this.userId, ptVar.userId) && t11.l(this.platform, ptVar.platform) && t11.l(this.status, ptVar.status) && t11.l(this.identityGroup, ptVar.identityGroup) && t11.l(this.title, ptVar.title) && this.serverTime == ptVar.serverTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long f() {
        return this.serverTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final pt g(String str, String str2, String str3, String str4, String str5, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new pt(str, str2, str3, str4, str5, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iF = hk1.f(this.identityGroup, hk1.f(this.status, hk1.f(this.platform, this.userId.hashCode() * 31, 31), 31), 31);
        String str = this.title;
        return Long.hashCode(this.serverTime) + ((iF + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String i() {
        return this.identityGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String j() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final long k() {
        return this.serverTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String l() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String m() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String n() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.userId;
        String str2 = this.platform;
        String str3 = this.status;
        String str4 = this.identityGroup;
        String str5 = this.title;
        long j = this.serverTime;
        StringBuilder sbO = vi0.o("ClientReportResponse(userId=", str, ", platform=", str2, ", status=");
        hk1.o(sbO, str3, ", identityGroup=", str4, ", title=");
        sbO.append(str5);
        sbO.append(", serverTime=");
        sbO.append(j);
        sbO.append(")");
        return sbO.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r16v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (r14v0 long)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void (m)] (LINE:29) call: pt.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long):void type: THIS */
    public /* synthetic */ pt(String str, String str2, String str3, String str4, String str5, long j, int i, c50 c50Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, j);
    }
}
