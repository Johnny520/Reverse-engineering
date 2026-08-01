package p053J3;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0841b {
    public static final int $stable = 0;
    private final String password;
    private final String username;

    public C0841b(String str, String str2) {
        AbstractC1665j.m2985e(str, "username");
        AbstractC1665j.m2985e(str2, "password");
        this.username = str;
        this.password = str2;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0841b m1563d(C0841b c0841b, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0841b.username;
        }
        if ((i5 & 2) != 0) {
            str2 = c0841b.password;
        }
        return c0841b.m1566c(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public final String m1564a() {
        return this.username;
    }

    /* JADX INFO: renamed from: b */
    public final String m1565b() {
        return this.password;
    }

    /* JADX INFO: renamed from: c */
    public final C0841b m1566c(String str, String str2) {
        AbstractC1665j.m2985e(str, "username");
        AbstractC1665j.m2985e(str2, "password");
        return new C0841b(str, str2);
    }

    /* JADX INFO: renamed from: e */
    public final String m1567e() {
        return this.password;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0841b)) {
            return false;
        }
        C0841b c0841b = (C0841b) obj;
        return AbstractC1665j.m2981a(this.username, c0841b.username) && AbstractC1665j.m2981a(this.password, c0841b.password);
    }

    /* JADX INFO: renamed from: f */
    public final String m1568f() {
        return this.username;
    }

    public int hashCode() {
        return this.password.hashCode() + (this.username.hashCode() * 31);
    }

    public String toString() {
        return "AdminLoginRequest(username=" + this.username + ", password=" + this.password + ")";
    }
}
