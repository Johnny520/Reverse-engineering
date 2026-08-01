package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0854o {
    public static final int $stable = 0;
    private final String password;
    private final String role;
    private final String username;

    public C0854o(String str, String str2, String str3) {
        AbstractC1665j.m2985e(str, "username");
        AbstractC1665j.m2985e(str2, "password");
        this.username = str;
        this.password = str2;
        this.role = str3;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ C0854o m1775e(C0854o c0854o, String str, String str2, String str3, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0854o.username;
        }
        if ((i5 & 2) != 0) {
            str2 = c0854o.password;
        }
        if ((i5 & 4) != 0) {
            str3 = c0854o.role;
        }
        return c0854o.m1779d(str, str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public final String m1776a() {
        return this.username;
    }

    /* JADX INFO: renamed from: b */
    public final String m1777b() {
        return this.password;
    }

    /* JADX INFO: renamed from: c */
    public final String m1778c() {
        return this.role;
    }

    /* JADX INFO: renamed from: d */
    public final C0854o m1779d(String str, String str2, String str3) {
        AbstractC1665j.m2985e(str, "username");
        AbstractC1665j.m2985e(str2, "password");
        return new C0854o(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0854o)) {
            return false;
        }
        C0854o c0854o = (C0854o) obj;
        return AbstractC1665j.m2981a(this.username, c0854o.username) && AbstractC1665j.m2981a(this.password, c0854o.password) && AbstractC1665j.m2981a(this.role, c0854o.role);
    }

    /* JADX INFO: renamed from: f */
    public final String m1780f() {
        return this.password;
    }

    /* JADX INFO: renamed from: g */
    public final String m1781g() {
        return this.role;
    }

    /* JADX INFO: renamed from: h */
    public final String m1782h() {
        return this.username;
    }

    public int hashCode() {
        int iM394e = AbstractC0231b.m394e(this.username.hashCode() * 31, 31, this.password);
        String str = this.role;
        return iM394e + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.username;
        String str2 = this.password;
        return AbstractC0231b.m403n(AbstractC0231b.m405p("CreateAdminRequest(username=", str, ", password=", str2, ", role="), this.role, ")");
    }

    public /* synthetic */ C0854o(String str, String str2, String str3, int i5, AbstractC1661f abstractC1661f) {
        this(str, str2, (i5 & 4) != 0 ? null : str3);
    }
}
