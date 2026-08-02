package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cq {
    public static final cq c = new cq(du.K0(new ArrayList()), null);
    public final Set a;
    public final up0 b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cq(Set set, up0 up0Var) {
        this.a = set;
        this.b = up0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return cqVar.a.equals(this.a) && t11.l(cqVar.b, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        up0 up0Var = this.b;
        return iHashCode + (up0Var != null ? up0Var.hashCode() : 0);
    }
}
