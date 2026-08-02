package p000;

/* JADX INFO: renamed from: pt */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0592pt {
    public static final int $stable = 0;
    private final String identityGroup;
    private final String platform;

    @fp2("server_time")
    private final long serverTime;
    private final String status;
    private final String title;
    private final String userId;

    public C0592pt(String str, String str2, String str3, String str4, String str5, long j) {
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

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C0592pt m3970h(C0592pt c0592pt, String str, String str2, String str3, String str4, String str5, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c0592pt.userId;
        }
        if ((i & 2) != 0) {
            str2 = c0592pt.platform;
        }
        if ((i & 4) != 0) {
            str3 = c0592pt.status;
        }
        if ((i & 8) != 0) {
            str4 = c0592pt.identityGroup;
        }
        if ((i & 16) != 0) {
            str5 = c0592pt.title;
        }
        if ((i & 32) != 0) {
            j = c0592pt.serverTime;
        }
        long j2 = j;
        String str6 = str5;
        String str7 = str3;
        return c0592pt.m3977g(str, str2, str7, str4, str6, j2);
    }

    /* JADX INFO: renamed from: a */
    public final String m3971a() {
        return this.userId;
    }

    /* JADX INFO: renamed from: b */
    public final String m3972b() {
        return this.platform;
    }

    /* JADX INFO: renamed from: c */
    public final String m3973c() {
        return this.status;
    }

    /* JADX INFO: renamed from: d */
    public final String m3974d() {
        return this.identityGroup;
    }

    /* JADX INFO: renamed from: e */
    public final String m3975e() {
        return this.title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0592pt)) {
            return false;
        }
        C0592pt c0592pt = (C0592pt) obj;
        return t11.m5086l(this.userId, c0592pt.userId) && t11.m5086l(this.platform, c0592pt.platform) && t11.m5086l(this.status, c0592pt.status) && t11.m5086l(this.identityGroup, c0592pt.identityGroup) && t11.m5086l(this.title, c0592pt.title) && this.serverTime == c0592pt.serverTime;
    }

    /* JADX INFO: renamed from: f */
    public final long m3976f() {
        return this.serverTime;
    }

    /* JADX INFO: renamed from: g */
    public final C0592pt m3977g(String str, String str2, String str3, String str4, String str5, long j) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new C0592pt(str, str2, str3, str4, str5, j);
    }

    public int hashCode() {
        int iM2207f = hk1.m2207f(this.identityGroup, hk1.m2207f(this.status, hk1.m2207f(this.platform, this.userId.hashCode() * 31, 31), 31), 31);
        String str = this.title;
        return Long.hashCode(this.serverTime) + ((iM2207f + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m3978i() {
        return this.identityGroup;
    }

    /* JADX INFO: renamed from: j */
    public final String m3979j() {
        return this.platform;
    }

    /* JADX INFO: renamed from: k */
    public final long m3980k() {
        return this.serverTime;
    }

    /* JADX INFO: renamed from: l */
    public final String m3981l() {
        return this.status;
    }

    /* JADX INFO: renamed from: m */
    public final String m3982m() {
        return this.title;
    }

    /* JADX INFO: renamed from: n */
    public final String m3983n() {
        return this.userId;
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.platform;
        String str3 = this.status;
        String str4 = this.identityGroup;
        String str5 = this.title;
        long j = this.serverTime;
        StringBuilder sbM5696o = vi0.m5696o("ClientReportResponse(userId=", str, ", platform=", str2, ", status=");
        hk1.m2216o(sbM5696o, str3, ", identityGroup=", str4, ", title=");
        sbM5696o.append(str5);
        sbM5696o.append(", serverTime=");
        sbM5696o.append(j);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }

    public /* synthetic */ C0592pt(String str, String str2, String str3, String str4, String str5, long j, int i, c50 c50Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, j);
    }
}
