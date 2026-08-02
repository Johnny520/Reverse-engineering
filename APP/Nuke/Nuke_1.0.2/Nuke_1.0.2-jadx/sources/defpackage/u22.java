package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class u22 {
    public final th2 a;
    public final ArrayList b;
    public final String c;
    public final lf2 d;
    public final sz0 e;
    public final List f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public u22(th2 th2Var, ArrayList arrayList, String str, lf2 lf2Var, sz0 sz0Var, List list) {
        list.getClass();
        this.a = th2Var;
        this.b = arrayList;
        this.c = str;
        this.d = lf2Var;
        this.e = sz0Var;
        this.f = list;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str2 = ((ii2) it.next()).a;
                String str3 = this.a.g;
                o72 o72Var = oi2.i;
                if (t11.l(str2, str3)) {
                    return;
                }
            }
        }
        String str4 = this.a.g;
        o72 o72Var2 = oi2.i;
        s.c("Entry module is not present in the prepared module catalog: ".concat(str4));
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u22) {
            u22 u22Var = (u22) obj;
            if (this.a.equals(u22Var.a) && this.b.equals(u22Var.b) && t11.l(this.c, u22Var.c) && t11.l(this.d, u22Var.d) && this.e == u22Var.e && t11.l(this.f, u22Var.f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        lf2 lf2Var = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode2 + (lf2Var != null ? lf2Var.hashCode() : 0)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "PreparedScript(manifest=" + this.a + ", modules=" + this.b + ", readme=" + this.c + ", configSchema=" + this.d + ", source=" + this.e + ", files=" + this.f + ")";
    }
}
