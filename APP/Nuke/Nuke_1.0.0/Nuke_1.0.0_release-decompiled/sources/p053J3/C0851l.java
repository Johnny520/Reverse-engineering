package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: J3.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0851l {
    public static final int $stable = 0;
    private final String identityGroup;
    private final String platform;
    private final String status;
    private final String title;
    private final String userId;

    public C0851l(String str, String str2, String str3, String str4, String str5) {
        AbstractC1665j.m2985e(str, "userId");
        AbstractC1665j.m2985e(str2, "platform");
        AbstractC1665j.m2985e(str3, "status");
        AbstractC1665j.m2985e(str4, "identityGroup");
        this.userId = str;
        this.platform = str2;
        this.status = str3;
        this.identityGroup = str4;
        this.title = str5;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C0851l m1727g(C0851l c0851l, String str, String str2, String str3, String str4, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0851l.userId;
        }
        if ((i5 & 2) != 0) {
            str2 = c0851l.platform;
        }
        if ((i5 & 4) != 0) {
            str3 = c0851l.status;
        }
        if ((i5 & 8) != 0) {
            str4 = c0851l.identityGroup;
        }
        if ((i5 & 16) != 0) {
            str5 = c0851l.title;
        }
        String str6 = str5;
        String str7 = str3;
        return c0851l.m1733f(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: a */
    public final String m1728a() {
        return this.userId;
    }

    /* JADX INFO: renamed from: b */
    public final String m1729b() {
        return this.platform;
    }

    /* JADX INFO: renamed from: c */
    public final String m1730c() {
        return this.status;
    }

    /* JADX INFO: renamed from: d */
    public final String m1731d() {
        return this.identityGroup;
    }

    /* JADX INFO: renamed from: e */
    public final String m1732e() {
        return this.title;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0851l)) {
            return false;
        }
        C0851l c0851l = (C0851l) obj;
        return AbstractC1665j.m2981a(this.userId, c0851l.userId) && AbstractC1665j.m2981a(this.platform, c0851l.platform) && AbstractC1665j.m2981a(this.status, c0851l.status) && AbstractC1665j.m2981a(this.identityGroup, c0851l.identityGroup) && AbstractC1665j.m2981a(this.title, c0851l.title);
    }

    /* JADX INFO: renamed from: f */
    public final C0851l m1733f(String str, String str2, String str3, String str4, String str5) {
        AbstractC1665j.m2985e(str, "userId");
        AbstractC1665j.m2985e(str2, "platform");
        AbstractC1665j.m2985e(str3, "status");
        AbstractC1665j.m2985e(str4, "identityGroup");
        return new C0851l(str, str2, str3, str4, str5);
    }

    /* JADX INFO: renamed from: h */
    public final String m1734h() {
        return this.identityGroup;
    }

    public int hashCode() {
        int iM394e = AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m394e(this.userId.hashCode() * 31, 31, this.platform), 31, this.status), 31, this.identityGroup);
        String str = this.title;
        return iM394e + (str == null ? 0 : str.hashCode());
    }

    /* JADX INFO: renamed from: i */
    public final String m1735i() {
        return this.platform;
    }

    /* JADX INFO: renamed from: j */
    public final String m1736j() {
        return this.status;
    }

    /* JADX INFO: renamed from: k */
    public final String m1737k() {
        return this.title;
    }

    /* JADX INFO: renamed from: l */
    public final String m1738l() {
        return this.userId;
    }

    public String toString() {
        String str = this.userId;
        String str2 = this.platform;
        String str3 = this.status;
        String str4 = this.identityGroup;
        String str5 = this.title;
        StringBuilder sbM405p = AbstractC0231b.m405p("ClientStatusResponse(userId=", str, ", platform=", str2, ", status=");
        AbstractC3202a.m5468c(sbM405p, str3, ", identityGroup=", str4, ", title=");
        return AbstractC0231b.m403n(sbM405p, str5, ")");
    }

    public /* synthetic */ C0851l(String str, String str2, String str3, String str4, String str5, int i5, AbstractC1661f abstractC1661f) {
        this(str, str2, str3, str4, (i5 & 16) != 0 ? null : str5);
    }
}
