package p053J3;

import p011B4.AbstractC0231b;
import p117X2.AbstractC1661f;
import p117X2.AbstractC1665j;
import p219p2.InterfaceC2891b;

/* JADX INFO: renamed from: J3.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0857r {
    public static final int $stable = 0;

    @InterfaceC2891b("avatar_url")
    private final String avatarUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public C0857r() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C0857r m1810c(C0857r c0857r, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = c0857r.avatarUrl;
        }
        return c0857r.m1812b(str);
    }

    /* JADX INFO: renamed from: a */
    public final String m1811a() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: b */
    public final C0857r m1812b(String str) {
        return new C0857r(str);
    }

    /* JADX INFO: renamed from: d */
    public final String m1813d() {
        return this.avatarUrl;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0857r) && AbstractC1665j.m2981a(this.avatarUrl, ((C0857r) obj).avatarUrl);
    }

    public int hashCode() {
        String str = this.avatarUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return AbstractC0231b.m400k("GitHubUser(avatarUrl=", this.avatarUrl, ")");
    }

    public C0857r(String str) {
        this.avatarUrl = str;
    }

    public /* synthetic */ C0857r(String str, int i5, AbstractC1661f abstractC1661f) {
        this((i5 & 1) != 0 ? null : str);
    }
}
