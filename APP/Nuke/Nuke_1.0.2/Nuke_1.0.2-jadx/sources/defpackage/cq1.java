package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cq1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final String g;
    public final String h;
    public final List i;
    public final List j;
    public final boolean k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cq1(String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, String str6, List list, List list2, boolean z3) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = z2;
        this.g = str5;
        this.h = str6;
        this.i = list;
        this.j = list2;
        this.k = z3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq1)) {
            return false;
        }
        cq1 cq1Var = (cq1) obj;
        return t11.l(this.a, cq1Var.a) && t11.l(this.b, cq1Var.b) && t11.l(this.c, cq1Var.c) && t11.l(this.d, cq1Var.d) && this.e == cq1Var.e && this.f == cq1Var.f && t11.l(this.g, cq1Var.g) && t11.l(this.h, cq1Var.h) && this.i.equals(cq1Var.i) && this.j.equals(cq1Var.j) && this.k == cq1Var.k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iF = hk1.f(this.c, hk1.f(this.b, this.a.hashCode() * 31, 31), 31);
        String str = this.d;
        int iD = hk1.d(hk1.d((iF + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        return Boolean.hashCode(this.k) + ((this.j.hashCode() + ((this.i.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("NukeScriptListItem(id=", this.a, ", name=", this.b, ", version=");
        hk1.o(sbO, this.c, ", description=", this.d, ", hasSettings=");
        sbO.append(this.e);
        sbO.append(", isRunning=");
        sbO.append(this.f);
        sbO.append(", error=");
        hk1.o(sbO, this.g, ", startupError=", this.h, ", declaredPermissions=");
        sbO.append(this.i);
        sbO.append(", dangerousPermissions=");
        sbO.append(this.j);
        sbO.append(", dangerousGranted=");
        sbO.append(this.k);
        sbO.append(")");
        return sbO.toString();
    }
}
