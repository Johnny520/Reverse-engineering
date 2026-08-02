package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qf2 {
    public final String a;
    public final String b;
    public final List c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qf2(String str, String str2, List list) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf2)) {
            return false;
        }
        qf2 qf2Var = (qf2) obj;
        return t11.l(this.a, qf2Var.a) && this.b.equals(qf2Var.b) && this.c.equals(qf2Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.c.hashCode() + hk1.f(this.b, this.a.hashCode() * 31, 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sbO = vi0.o("ScriptConfigSection(id=", this.a, ", title=", this.b, ", properties=");
        sbO.append(this.c);
        sbO.append(")");
        return sbO.toString();
    }
}
