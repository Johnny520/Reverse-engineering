package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: J3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C0852m {
    public static final int $stable = 8;
    private final String createdAt;
    private final C0846g environment;

    /* JADX INFO: renamed from: id */
    private final String f2695id;
    private final String identityGroup;
    private final String lastLoginAt;
    private final String message;
    private final String platform;
    private final String status;
    private final String title;
    private final String updatedAt;
    private final String userId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0852m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C0846g c0846g) {
        AbstractC1665j.m2985e(str, "id");
        AbstractC1665j.m2985e(str2, "userId");
        AbstractC1665j.m2985e(str3, "platform");
        AbstractC1665j.m2985e(str4, "status");
        AbstractC1665j.m2985e(str5, "identityGroup");
        AbstractC1665j.m2985e(str9, "createdAt");
        AbstractC1665j.m2985e(str10, "updatedAt");
        this.f2695id = str;
        this.userId = str2;
        this.platform = str3;
        this.status = str4;
        this.identityGroup = str5;
        this.title = str6;
        this.message = str7;
        this.lastLoginAt = str8;
        this.createdAt = str9;
        this.updatedAt = str10;
        this.environment = c0846g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static /* synthetic */ C0852m m1739m(C0852m c0852m, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C0846g c0846g, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0852m.f2695id;
        }
        if ((i5 & 2) != 0) {
            str2 = c0852m.userId;
        }
        if ((i5 & 4) != 0) {
            str3 = c0852m.platform;
        }
        if ((i5 & 8) != 0) {
            str4 = c0852m.status;
        }
        if ((i5 & 16) != 0) {
            str5 = c0852m.identityGroup;
        }
        if ((i5 & 32) != 0) {
            str6 = c0852m.title;
        }
        if ((i5 & 64) != 0) {
            str7 = c0852m.message;
        }
        if ((i5 & 128) != 0) {
            str8 = c0852m.lastLoginAt;
        }
        if ((i5 & 256) != 0) {
            str9 = c0852m.createdAt;
        }
        if ((i5 & 512) != 0) {
            str10 = c0852m.updatedAt;
        }
        if ((i5 & 1024) != 0) {
            c0846g = c0852m.environment;
        }
        String str11 = str10;
        C0846g c0846g2 = c0846g;
        String str12 = str8;
        String str13 = str9;
        String str14 = str6;
        String str15 = str7;
        String str16 = str5;
        String str17 = str3;
        return c0852m.m1751l(str, str2, str17, str4, str16, str14, str15, str12, str13, str11, c0846g2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1740a() {
        return this.f2695id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1741b() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C0846g m1742c() {
        return this.environment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m1743d() {
        return this.userId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m1744e() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0852m)) {
            return false;
        }
        C0852m c0852m = (C0852m) obj;
        return AbstractC1665j.m2981a(this.f2695id, c0852m.f2695id) && AbstractC1665j.m2981a(this.userId, c0852m.userId) && AbstractC1665j.m2981a(this.platform, c0852m.platform) && AbstractC1665j.m2981a(this.status, c0852m.status) && AbstractC1665j.m2981a(this.identityGroup, c0852m.identityGroup) && AbstractC1665j.m2981a(this.title, c0852m.title) && AbstractC1665j.m2981a(this.message, c0852m.message) && AbstractC1665j.m2981a(this.lastLoginAt, c0852m.lastLoginAt) && AbstractC1665j.m2981a(this.createdAt, c0852m.createdAt) && AbstractC1665j.m2981a(this.updatedAt, c0852m.updatedAt) && AbstractC1665j.m2981a(this.environment, c0852m.environment);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m1745f() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final String m1746g() {
        return this.identityGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m1747h() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int iM394e = AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m394e(this.f2695id.hashCode() * 31, 31, this.userId), 31, this.platform), 31, this.status), 31, this.identityGroup);
        String str = this.title;
        int iHashCode = (iM394e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.message;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.lastLoginAt;
        int iM394e2 = AbstractC0231b.m394e(AbstractC0231b.m394e((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.createdAt), 31, this.updatedAt);
        C0846g c0846g = this.environment;
        return iM394e2 + (c0846g != null ? c0846g.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m1748i() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m1749j() {
        return this.lastLoginAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m1750k() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C0852m m1751l(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C0846g c0846g) {
        AbstractC1665j.m2985e(str, "id");
        AbstractC1665j.m2985e(str2, "userId");
        AbstractC1665j.m2985e(str3, "platform");
        AbstractC1665j.m2985e(str4, "status");
        AbstractC1665j.m2985e(str5, "identityGroup");
        AbstractC1665j.m2985e(str9, "createdAt");
        AbstractC1665j.m2985e(str10, "updatedAt");
        return new C0852m(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, c0846g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final String m1752n() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final C0846g m1753o() {
        return this.environment;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final String m1754p() {
        return this.f2695id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final String m1755q() {
        return this.identityGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final String m1756r() {
        return this.lastLoginAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final String m1757s() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final String m1758t() {
        return this.platform;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.f2695id;
        String str2 = this.userId;
        String str3 = this.platform;
        String str4 = this.status;
        String str5 = this.identityGroup;
        String str6 = this.title;
        String str7 = this.message;
        String str8 = this.lastLoginAt;
        String str9 = this.createdAt;
        String str10 = this.updatedAt;
        C0846g c0846g = this.environment;
        StringBuilder sbM405p = AbstractC0231b.m405p("ClientUser(id=", str, ", userId=", str2, ", platform=");
        AbstractC3202a.m5468c(sbM405p, str3, ", status=", str4, ", identityGroup=");
        AbstractC3202a.m5468c(sbM405p, str5, ", title=", str6, ", message=");
        AbstractC3202a.m5468c(sbM405p, str7, ", lastLoginAt=", str8, ", createdAt=");
        AbstractC3202a.m5468c(sbM405p, str9, ", updatedAt=", str10, ", environment=");
        sbM405p.append(c0846g);
        sbM405p.append(")");
        return sbM405p.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final String m1759u() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final String m1760v() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final String m1761w() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final String m1762x() {
        return this.userId;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0023: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (r3v0 java.lang.String)
  (r4v0 java.lang.String)
  (r5v0 java.lang.String)
  (r6v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r13v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (wrap:J3.g:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null J3.g) : (r12v0 J3.g))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, J3.g):void (m)] (LINE:13) call: J3.m.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, J3.g):void type: THIS */
    public /* synthetic */ C0852m(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, C0846g c0846g, int i5, AbstractC1661f abstractC1661f) {
        this(str, str2, str3, str4, str5, (i5 & 32) != 0 ? null : str6, (i5 & 64) != 0 ? null : str7, (i5 & 128) != 0 ? null : str8, str9, str10, (i5 & 1024) != 0 ? null : c0846g);
    }
}
