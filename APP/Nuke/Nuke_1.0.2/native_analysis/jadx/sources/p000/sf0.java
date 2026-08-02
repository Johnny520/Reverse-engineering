package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class sf0 {

    /* JADX INFO: renamed from: b */
    public static final sf0 f10100b = new sf0(new z33((uh0) null, (t11) null, (cd2) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: a */
    public final z33 f10101a;

    public sf0(z33 z33Var) {
        this.f10101a = z33Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof sf0) && ((sf0) obj).f10101a.equals(this.f10101a);
    }

    public final int hashCode() {
        return this.f10101a.hashCode();
    }

    public final String toString() {
        if (equals(f10100b)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        z33 z33Var = this.f10101a;
        uh0 uh0Var = z33Var.f13712a;
        sb.append(uh0Var != null ? uh0Var.toString() : null);
        sb.append(",\nSlide - null,\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        cd2 cd2Var = z33Var.f13713b;
        sb.append(cd2Var != null ? cd2Var.toString() : null);
        return sb.toString();
    }
}
