package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p219p2.InterfaceC2891b;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: J3.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0850k {
    public static final int $stable = 0;
    private final String identityGroup;
    private final String platform;

    @InterfaceC2891b("server_time")
    private final long serverTime;
    private final String status;
    private final String title;
    private final String userId;

    public C0850k(String str, String str2, String str3, String str4, String str5, long j5) {
        AbstractC1665j.m2985e(str, "userId");
        AbstractC1665j.m2985e(str2, "platform");
        AbstractC1665j.m2985e(str3, "status");
        AbstractC1665j.m2985e(str4, "identityGroup");
        this.userId = str;
        this.platform = str2;
        this.status = str3;
        this.identityGroup = str4;
        this.title = str5;
        this.serverTime = j5;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ C0850k m1713h(C0850k c0850k, String str, String str2, String str3, String str4, String str5, long j5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0850k.userId;
        }
        if ((i5 & 2) != 0) {
            str2 = c0850k.platform;
        }
        if ((i5 & 4) != 0) {
            str3 = c0850k.status;
        }
        if ((i5 & 8) != 0) {
            str4 = c0850k.identityGroup;
        }
        if ((i5 & 16) != 0) {
            str5 = c0850k.title;
        }
        if ((i5 & 32) != 0) {
            j5 = c0850k.serverTime;
        }
        long j6 = j5;
        String str6 = str5;
        String str7 = str3;
        return c0850k.m1720g(str, str2, str7, str4, str6, j6);
    }

    /* JADX INFO: renamed from: a */
    public final String m1714a() {
        return this.userId;
    }

    /* JADX INFO: renamed from: b */
    public final String m1715b() {
        return this.platform;
    }

    /* JADX INFO: renamed from: c */
    public final String m1716c() {
        return this.status;
    }

    /* JADX INFO: renamed from: d */
    public final String m1717d() {
        return this.identityGroup;
    }

    /* JADX INFO: renamed from: e */
    public final String m1718e() {
        return this.title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0850k)) {
            return false;
        }
        C0850k c0850k = (C0850k) obj;
        return AbstractC1665j.m2981a(this.userId, c0850k.userId) && AbstractC1665j.m2981a(this.platform, c0850k.platform) && AbstractC1665j.m2981a(this.status, c0850k.status) && AbstractC1665j.m2981a(this.identityGroup, c0850k.identityGroup) && AbstractC1665j.m2981a(this.title, c0850k.title) && this.serverTime == c0850k.serverTime;
    }

    /* JADX INFO: renamed from: f */
    public final long m1719f() {
        return this.serverTime;
    }

    /* JADX INFO: renamed from: g */
    public final C0850k m1720g(String str, String str2, String str3, String str4, String str5, long j5) {
        AbstractC1665j.m2985e(str, "userId");
        AbstractC1665j.m2985e(str2, "platform");
        AbstractC1665j.m2985e(str3, "status");
        AbstractC1665j.m2985e(str4, "identityGroup");
        return new C0850k(str, str2, str3, str4, str5, j5);
    }

    public int hashCode() {
        int iM394e = AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m394e(this.userId.hashCode() * 31, 31, this.platform), 31, this.status), 31, this.identityGroup);
        String str = this.title;
        return Long.hashCode(this.serverTime) + ((iM394e + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX INFO: renamed from: i */
    public final String m1721i() {
        return this.identityGroup;
    }

    /* JADX INFO: renamed from: j */
    public final String m1722j() {
        return this.platform;
    }

    /* JADX INFO: renamed from: k */
    public final long m1723k() {
        return this.serverTime;
    }

    /* JADX INFO: renamed from: l */
    public final String m1724l() {
        return this.status;
    }

    /* JADX INFO: renamed from: m */
    public final String m1725m() {
        return this.title;
    }

    /* JADX INFO: renamed from: n */
    public final String m1726n() {
        return this.userId;
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.platform;
        String str3 = this.status;
        String str4 = this.identityGroup;
        String str5 = this.title;
        long j5 = this.serverTime;
        StringBuilder sbM405p = AbstractC0231b.m405p("ClientReportResponse(userId=", str, ", platform=", str2, ", status=");
        AbstractC3202a.m5468c(sbM405p, str3, ", identityGroup=", str4, ", title=");
        sbM405p.append(str5);
        sbM405p.append(", serverTime=");
        sbM405p.append(j5);
        sbM405p.append(")");
        return sbM405p.toString();
    }

    public /* synthetic */ C0850k(String str, String str2, String str3, String str4, String str5, long j5, int i5, AbstractC1661f abstractC1661f) {
        this(str, str2, str3, str4, (i5 & 16) != 0 ? null : str5, j5);
    }
}
