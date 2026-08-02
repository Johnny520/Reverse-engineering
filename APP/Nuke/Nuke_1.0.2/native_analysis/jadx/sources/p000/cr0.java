package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cr0 {

    /* JADX INFO: renamed from: a */
    public final String f1693a;

    /* JADX INFO: renamed from: b */
    public final String f1694b;

    /* JADX INFO: renamed from: c */
    public final String f1695c;

    /* JADX INFO: renamed from: d */
    public final String f1696d;

    /* JADX INFO: renamed from: e */
    public final String f1697e;

    public cr0(String str, String str2, String str3, String str4, String str5) {
        this.f1693a = str;
        this.f1694b = str2;
        this.f1695c = str3;
        this.f1696d = str4;
        this.f1697e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr0)) {
            return false;
        }
        cr0 cr0Var = (cr0) obj;
        return this.f1693a.equals(cr0Var.f1693a) && this.f1694b.equals(cr0Var.f1694b) && this.f1695c.equals(cr0Var.f1695c) && this.f1696d.equals(cr0Var.f1696d) && this.f1697e.equals(cr0Var.f1697e);
    }

    public final int hashCode() {
        return this.f1697e.hashCode() + hk1.m2207f(this.f1696d, hk1.m2207f(this.f1695c, hk1.m2207f(this.f1694b, this.f1693a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("GroupInfoBean(wxId=", this.f1693a, ", nickname=", this.f1694b, ", nicknameInitial=");
        hk1.m2216o(sbM5696o, this.f1695c, ", nicknamePinyin=", this.f1696d, ", avatarUrl=");
        return hk1.m2211j(sbM5696o, this.f1697e, ")");
    }
}
