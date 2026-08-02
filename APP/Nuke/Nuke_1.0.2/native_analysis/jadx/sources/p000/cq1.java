package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cq1 {

    /* JADX INFO: renamed from: a */
    public final String f1675a;

    /* JADX INFO: renamed from: b */
    public final String f1676b;

    /* JADX INFO: renamed from: c */
    public final String f1677c;

    /* JADX INFO: renamed from: d */
    public final String f1678d;

    /* JADX INFO: renamed from: e */
    public final boolean f1679e;

    /* JADX INFO: renamed from: f */
    public final boolean f1680f;

    /* JADX INFO: renamed from: g */
    public final String f1681g;

    /* JADX INFO: renamed from: h */
    public final String f1682h;

    /* JADX INFO: renamed from: i */
    public final List f1683i;

    /* JADX INFO: renamed from: j */
    public final List f1684j;

    /* JADX INFO: renamed from: k */
    public final boolean f1685k;

    public cq1(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, List list, List list2, boolean z3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.f1675a = str;
        this.f1676b = str2;
        this.f1677c = str3;
        this.f1678d = str4;
        this.f1679e = z;
        this.f1680f = z2;
        this.f1681g = str5;
        this.f1682h = str6;
        this.f1683i = list;
        this.f1684j = list2;
        this.f1685k = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq1)) {
            return false;
        }
        cq1 cq1Var = (cq1) obj;
        return t11.m5086l(this.f1675a, cq1Var.f1675a) && t11.m5086l(this.f1676b, cq1Var.f1676b) && t11.m5086l(this.f1677c, cq1Var.f1677c) && t11.m5086l(this.f1678d, cq1Var.f1678d) && this.f1679e == cq1Var.f1679e && this.f1680f == cq1Var.f1680f && t11.m5086l(this.f1681g, cq1Var.f1681g) && t11.m5086l(this.f1682h, cq1Var.f1682h) && this.f1683i.equals(cq1Var.f1683i) && this.f1684j.equals(cq1Var.f1684j) && this.f1685k == cq1Var.f1685k;
    }

    public final int hashCode() {
        int iM2207f = hk1.m2207f(this.f1677c, hk1.m2207f(this.f1676b, this.f1675a.hashCode() * 31, 31), 31);
        String str = this.f1678d;
        int iM2205d = hk1.m2205d(hk1.m2205d((iM2207f + (str == null ? 0 : str.hashCode())) * 31, 31, this.f1679e), 31, this.f1680f);
        String str2 = this.f1681g;
        int iHashCode = (iM2205d + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1682h;
        return Boolean.hashCode(this.f1685k) + ((this.f1684j.hashCode() + ((this.f1683i.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbM5696o = vi0.m5696o("NukeScriptListItem(id=", this.f1675a, ", name=", this.f1676b, ", version=");
        hk1.m2216o(sbM5696o, this.f1677c, ", description=", this.f1678d, ", hasSettings=");
        sbM5696o.append(this.f1679e);
        sbM5696o.append(", isRunning=");
        sbM5696o.append(this.f1680f);
        sbM5696o.append(", error=");
        hk1.m2216o(sbM5696o, this.f1681g, ", startupError=", this.f1682h, ", declaredPermissions=");
        sbM5696o.append(this.f1683i);
        sbM5696o.append(", dangerousPermissions=");
        sbM5696o.append(this.f1684j);
        sbM5696o.append(", dangerousGranted=");
        sbM5696o.append(this.f1685k);
        sbM5696o.append(")");
        return sbM5696o.toString();
    }
}
