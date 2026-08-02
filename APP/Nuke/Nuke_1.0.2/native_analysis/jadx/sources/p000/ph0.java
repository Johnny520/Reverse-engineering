package p000;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ph0 {

    /* JADX INFO: renamed from: b */
    public static final ph0 f8348b = new ph0(new z33((uh0) null, (t11) null, (cd2) null, (LinkedHashMap) null, 127));

    /* JADX INFO: renamed from: c */
    public static final ph0 f8349c = new ph0(new z33((uh0) null, (t11) null, (cd2) null, (LinkedHashMap) null, 95));

    /* JADX INFO: renamed from: a */
    public final z33 f8350a;

    public ph0(z33 z33Var) {
        this.f8350a = z33Var;
    }

    /* JADX INFO: renamed from: a */
    public final ph0 m3866a(ph0 ph0Var) {
        z33 z33Var = ph0Var.f8350a;
        uh0 uh0Var = z33Var.f13712a;
        z33 z33Var2 = this.f8350a;
        if (uh0Var == null) {
            uh0Var = z33Var2.f13712a;
        }
        cd2 cd2Var = z33Var.f13713b;
        if (cd2Var == null) {
            cd2Var = z33Var2.f13713b;
        }
        return new ph0(new z33(uh0Var, (t11) null, cd2Var, z33Var.f13714c || z33Var2.f13714c, we1.m5877r0(z33Var2.f13715d, z33Var.f13715d)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ph0) && ((ph0) obj).f8350a.equals(this.f8350a);
    }

    public final int hashCode() {
        return this.f8350a.hashCode();
    }

    public final String toString() {
        if (equals(f8348b)) {
            return "ExitTransition.None";
        }
        if (equals(f8349c)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        z33 z33Var = this.f8350a;
        uh0 uh0Var = z33Var.f13712a;
        sb.append(uh0Var != null ? uh0Var.toString() : null);
        sb.append(",\nSlide - null,\nShrink - ");
        sb.append((String) null);
        sb.append(",\nScale - ");
        cd2 cd2Var = z33Var.f13713b;
        sb.append(cd2Var != null ? cd2Var.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(z33Var.f13714c);
        return sb.toString();
    }
}
