package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u22 {

    /* JADX INFO: renamed from: a */
    public final th2 f11075a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f11076b;

    /* JADX INFO: renamed from: c */
    public final String f11077c;

    /* JADX INFO: renamed from: d */
    public final lf2 f11078d;

    /* JADX INFO: renamed from: e */
    public final sz0 f11079e;

    /* JADX INFO: renamed from: f */
    public final List f11080f;

    public u22(th2 th2Var, ArrayList arrayList, String str, lf2 lf2Var, sz0 sz0Var, List list) {
        list.getClass();
        this.f11075a = th2Var;
        this.f11076b = arrayList;
        this.f11077c = str;
        this.f11078d = lf2Var;
        this.f11079e = sz0Var;
        this.f11080f = list;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = ((ii2) it.next()).f4645a;
                String str3 = this.f11075a.f10778g;
                o72 o72Var = oi2.f7689i;
                if (t11.m5086l(str2, str3)) {
                    return;
                }
            }
        }
        String str4 = this.f11075a.f10778g;
        o72 o72Var2 = oi2.f7689i;
        C0676s.m4645c("Entry module is not present in the prepared module catalog: ".concat(str4));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u22) {
            u22 u22Var = (u22) obj;
            if (this.f11075a.equals(u22Var.f11075a) && this.f11076b.equals(u22Var.f11076b) && t11.m5086l(this.f11077c, u22Var.f11077c) && t11.m5086l(this.f11078d, u22Var.f11078d) && this.f11079e == u22Var.f11079e && t11.m5086l(this.f11080f, u22Var.f11080f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11076b.hashCode() + (this.f11075a.hashCode() * 31)) * 31;
        String str = this.f11077c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        lf2 lf2Var = this.f11078d;
        return this.f11080f.hashCode() + ((this.f11079e.hashCode() + ((iHashCode2 + (lf2Var != null ? lf2Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "PreparedScript(manifest=" + this.f11075a + ", modules=" + this.f11076b + ", readme=" + this.f11077c + ", configSchema=" + this.f11078d + ", source=" + this.f11079e + ", files=" + this.f11080f + ")";
    }
}
