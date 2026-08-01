package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1665j;
import p237s4.AbstractC3202a;

/* JADX INFO: renamed from: J3.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0843d {
    public static final int $stable = 0;
    private final String createdAt;

    /* JADX INFO: renamed from: id */
    private final String f2693id;
    private final String role;
    private final String updatedAt;
    private final String username;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0843d(String str, String str2, String str3, String str4, String str5) {
        AbstractC1665j.m2985e(str, "id");
        AbstractC1665j.m2985e(str2, "username");
        AbstractC1665j.m2985e(str3, "role");
        AbstractC1665j.m2985e(str4, "createdAt");
        AbstractC1665j.m2985e(str5, "updatedAt");
        this.f2693id = str;
        this.username = str2;
        this.role = str3;
        this.createdAt = str4;
        this.updatedAt = str5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ C0843d m1569g(C0843d c0843d, String str, String str2, String str3, String str4, String str5, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0843d.f2693id;
        }
        if ((i5 & 2) != 0) {
            str2 = c0843d.username;
        }
        if ((i5 & 4) != 0) {
            str3 = c0843d.role;
        }
        if ((i5 & 8) != 0) {
            str4 = c0843d.createdAt;
        }
        if ((i5 & 16) != 0) {
            str5 = c0843d.updatedAt;
        }
        String str6 = str5;
        String str7 = str3;
        return c0843d.m1575f(str, str2, str7, str4, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m1570a() {
        return this.f2693id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m1571b() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m1572c() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m1573d() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m1574e() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0843d)) {
            return false;
        }
        C0843d c0843d = (C0843d) obj;
        return AbstractC1665j.m2981a(this.f2693id, c0843d.f2693id) && AbstractC1665j.m2981a(this.username, c0843d.username) && AbstractC1665j.m2981a(this.role, c0843d.role) && AbstractC1665j.m2981a(this.createdAt, c0843d.createdAt) && AbstractC1665j.m2981a(this.updatedAt, c0843d.updatedAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final C0843d m1575f(String str, String str2, String str3, String str4, String str5) {
        AbstractC1665j.m2985e(str, "id");
        AbstractC1665j.m2985e(str2, "username");
        AbstractC1665j.m2985e(str3, "role");
        AbstractC1665j.m2985e(str4, "createdAt");
        AbstractC1665j.m2985e(str5, "updatedAt");
        return new C0843d(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m1576h() {
        return this.createdAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        return this.updatedAt.hashCode() + AbstractC0231b.m394e(AbstractC0231b.m394e(AbstractC0231b.m394e(this.f2693id.hashCode() * 31, 31, this.username), 31, this.role), 31, this.createdAt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m1577i() {
        return this.f2693id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final String m1578j() {
        return this.role;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final String m1579k() {
        return this.updatedAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final String m1580l() {
        return this.username;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        String str = this.f2693id;
        String str2 = this.username;
        String str3 = this.role;
        String str4 = this.createdAt;
        String str5 = this.updatedAt;
        StringBuilder sbM405p = AbstractC0231b.m405p("AdminSummary(id=", str, ", username=", str2, ", role=");
        AbstractC3202a.m5468c(sbM405p, str3, ", createdAt=", str4, ", updatedAt=");
        return AbstractC0231b.m403n(sbM405p, str5, ")");
    }
}
