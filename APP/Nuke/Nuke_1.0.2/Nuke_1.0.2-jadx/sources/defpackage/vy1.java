package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 {
    public final String a;
    public final String b;
    public final List c;
    public final boolean d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public vy1(String str, String str2, List list, boolean z) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy1)) {
            return false;
        }
        vy1 vy1Var = (vy1) obj;
        return t11.l(this.a, vy1Var.a) && t11.l(this.b, vy1Var.b) && t11.l(this.c, vy1Var.c) && this.d == vy1Var.d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + hk1.f(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("PendingScriptAuthorization(scriptId=", this.a, ", scriptName=", this.b, ", requests=");
        sbO.append(this.c);
        sbO.append(", enableAfterGrant=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
