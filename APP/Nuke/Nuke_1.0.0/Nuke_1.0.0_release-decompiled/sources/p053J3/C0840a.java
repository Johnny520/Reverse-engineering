package p053J3;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: J3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0840a {
    public static final int $stable = 0;
    private final C0843d admin;
    private final String token;

    public C0840a(String str, C0843d c0843d) {
        AbstractC1665j.m2985e(str, "token");
        AbstractC1665j.m2985e(c0843d, "admin");
        this.token = str;
        this.admin = c0843d;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ C0840a m1557d(C0840a c0840a, String str, C0843d c0843d, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0840a.token;
        }
        if ((i5 & 2) != 0) {
            c0843d = c0840a.admin;
        }
        return c0840a.m1560c(str, c0843d);
    }

    /* JADX INFO: renamed from: a */
    public final String m1558a() {
        return this.token;
    }

    /* JADX INFO: renamed from: b */
    public final C0843d m1559b() {
        return this.admin;
    }

    /* JADX INFO: renamed from: c */
    public final C0840a m1560c(String str, C0843d c0843d) {
        AbstractC1665j.m2985e(str, "token");
        AbstractC1665j.m2985e(c0843d, "admin");
        return new C0840a(str, c0843d);
    }

    /* JADX INFO: renamed from: e */
    public final C0843d m1561e() {
        return this.admin;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0840a)) {
            return false;
        }
        C0840a c0840a = (C0840a) obj;
        return AbstractC1665j.m2981a(this.token, c0840a.token) && AbstractC1665j.m2981a(this.admin, c0840a.admin);
    }

    /* JADX INFO: renamed from: f */
    public final String m1562f() {
        return this.token;
    }

    public int hashCode() {
        return this.admin.hashCode() + (this.token.hashCode() * 31);
    }

    public String toString() {
        return "AdminLoginData(token=" + this.token + ", admin=" + this.admin + ")";
    }
}
