package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tq1 {
    public final List a;
    public final boolean b;
    public final String c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tq1(List list, boolean z, String str) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static tq1 a(tq1 tq1Var, ArrayList arrayList, boolean z, String str, int i) {
        List list = arrayList;
        if ((i & 1) != 0) {
            list = tq1Var.a;
        }
        if ((i & 2) != 0) {
            z = tq1Var.b;
        }
        if ((i & 4) != 0) {
            str = tq1Var.c;
        }
        tq1Var.getClass();
        list.getClass();
        return new tq1(list, z, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq1)) {
            return false;
        }
        tq1 tq1Var = (tq1) obj;
        return t11.l(this.a, tq1Var.a) && this.b == tq1Var.b && t11.l(this.c, tq1Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iD = hk1.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("NukeScriptServiceState(scripts=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", error=");
        return hk1.j(sb, this.c, ")");
    }
}
