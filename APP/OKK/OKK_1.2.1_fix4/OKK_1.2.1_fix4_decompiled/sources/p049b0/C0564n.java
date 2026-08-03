package p049b0;

import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0564n {

    /* JADX INFO: renamed from: a */
    public final String f1668a;

    /* JADX INFO: renamed from: b */
    public final String f1669b;

    /* JADX INFO: renamed from: c */
    public final EnumC0563m f1670c;

    /* JADX INFO: renamed from: d */
    public final String f1671d;

    public C0564n(String str, String str2, EnumC0563m enumC0563m, String str3) {
        AbstractC0307g.m703e(str, "id");
        AbstractC0307g.m703e(str2, "title");
        AbstractC0307g.m703e(enumC0563m, "level");
        AbstractC0307g.m703e(str3, "detail");
        this.f1668a = str;
        this.f1669b = str2;
        this.f1670c = enumC0563m;
        this.f1671d = str3;
    }

    /* JADX INFO: renamed from: a */
    public static C0564n m1375a(C0564n c0564n, String str, EnumC0563m enumC0563m, String str2, int i2) {
        if ((i2 & 2) != 0) {
            str = c0564n.f1669b;
        }
        if ((i2 & 4) != 0) {
            enumC0563m = c0564n.f1670c;
        }
        if ((i2 & 8) != 0) {
            str2 = c0564n.f1671d;
        }
        String str3 = c0564n.f1668a;
        AbstractC0307g.m703e(str3, "id");
        AbstractC0307g.m703e(str, "title");
        AbstractC0307g.m703e(enumC0563m, "level");
        AbstractC0307g.m703e(str2, "detail");
        return new C0564n(str3, str, enumC0563m, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0564n)) {
            return false;
        }
        C0564n c0564n = (C0564n) obj;
        return AbstractC0307g.m699a(this.f1668a, c0564n.f1668a) && AbstractC0307g.m699a(this.f1669b, c0564n.f1669b) && this.f1670c == c0564n.f1670c && AbstractC0307g.m699a(this.f1671d, c0564n.f1671d);
    }

    public final int hashCode() {
        return this.f1671d.hashCode() + ((this.f1670c.hashCode() + ((this.f1669b.hashCode() + (this.f1668a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ProbeResult(id=" + this.f1668a + ", title=" + this.f1669b + ", level=" + this.f1670c + ", detail=" + this.f1671d + ")";
    }
}
