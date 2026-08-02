package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 {
    public static final ph0 b = new ph0(new z33((uh0) null, (t11) null, (cd2) null, (LinkedHashMap) null, 127));
    public static final ph0 c = new ph0(new z33((uh0) null, (t11) null, (cd2) null, (LinkedHashMap) null, 95));
    public final z33 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ph0(z33 z33Var) {
        this.a = z33Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ph0 a(ph0 ph0Var) {
        z33 z33Var = ph0Var.a;
        uh0 uh0Var = z33Var.a;
        z33 z33Var2 = this.a;
        if (uh0Var == null) {
            uh0Var = z33Var2.a;
        }
        cd2 cd2Var = z33Var.b;
        if (cd2Var == null) {
            cd2Var = z33Var2.b;
        }
        return new ph0(new z33(uh0Var, (t11) null, cd2Var, z33Var.c || z33Var2.c, we1.r0(z33Var2.d, z33Var.d)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof ph0) && ((ph0) obj).a.equals(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (equals(b)) {
            return "ExitTransition.None";
        }
        if (equals(c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        z33 z33Var = this.a;
        uh0 uh0Var = z33Var.a;
        sb.append(uh0Var != null ? uh0Var.toString() : null);
        sb.append(",\nSlide - null,\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        cd2 cd2Var = z33Var.b;
        sb.append(cd2Var != null ? cd2Var.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(z33Var.c);
        return sb.toString();
    }
}
