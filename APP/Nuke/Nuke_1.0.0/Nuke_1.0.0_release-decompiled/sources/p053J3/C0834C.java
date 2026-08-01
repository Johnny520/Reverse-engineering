package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.C */
/* JADX INFO: loaded from: classes.dex */
public final class C0834C {
    public static final int $stable = 0;
    private final String password;
    private final String role;
    private final String username;

    public C0834C() {
        this(null, null, null, 7, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C0834C m1506e(C0834C c0834c, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0834c.username;
        }
        if ((i5 & 2) != 0) {
            str2 = c0834c.password;
        }
        if ((i5 & 4) != 0) {
            str3 = c0834c.role;
        }
        return c0834c.m1510d(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final String m1507a() {
        return this.username;
    }

    /* JADX INFO: renamed from: b */
    public final String m1508b() {
        return this.password;
    }

    /* JADX INFO: renamed from: c */
    public final String m1509c() {
        return this.role;
    }

    /* JADX INFO: renamed from: d */
    public final C0834C m1510d(String str, String str2, String str3) {
        return new C0834C(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0834C)) {
            return false;
        }
        C0834C c0834c = (C0834C) obj;
        return AbstractC1665j.m2981a(this.username, c0834c.username) && AbstractC1665j.m2981a(this.password, c0834c.password) && AbstractC1665j.m2981a(this.role, c0834c.role);
    }

    /* JADX INFO: renamed from: f */
    public final String m1511f() {
        return this.password;
    }

    /* JADX INFO: renamed from: g */
    public final String m1512g() {
        return this.role;
    }

    /* JADX INFO: renamed from: h */
    public final String m1513h() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.password;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.role;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.username;
        String str2 = this.password;
        return AbstractC0231b.m403n(AbstractC0231b.m405p("UpdateAdminRequest(username=", str, ", password=", str2, ", role="), this.role, ")");
    }

    public C0834C(String str, String str2, String str3) {
        this.username = str;
        this.password = str2;
        this.role = str3;
    }

    public /* synthetic */ C0834C(String str, String str2, String str3, int i5, AbstractC1661f abstractC1661f) {
        this((i5 & 1) != 0 ? null : str, (i5 & 2) != 0 ? null : str2, (i5 & 4) != 0 ? null : str3);
    }
}
