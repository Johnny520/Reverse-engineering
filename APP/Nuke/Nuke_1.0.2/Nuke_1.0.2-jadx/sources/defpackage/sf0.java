package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sf0 {
    public static final sf0 b = new sf0(new z33((uh0) null, (t11) null, (cd2) null, (LinkedHashMap) null, 127));
    public final z33 a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sf0(z33 z33Var) {
        this.a = z33Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return (obj instanceof sf0) && ((sf0) obj).a.equals(this.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (equals(b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        z33 z33Var = this.a;
        uh0 uh0Var = z33Var.a;
        sb.append(uh0Var != null ? uh0Var.toString() : null);
        sb.append(",\nSlide - null,\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        cd2 cd2Var = z33Var.b;
        sb.append(cd2Var != null ? cd2Var.toString() : null);
        return sb.toString();
    }
}
