package p000;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z33 {

    /* JADX INFO: renamed from: a */
    public final uh0 f13712a;

    /* JADX INFO: renamed from: b */
    public final cd2 f13713b;

    /* JADX INFO: renamed from: c */
    public final boolean f13714c;

    /* JADX INFO: renamed from: d */
    public final Map f13715d;

    public /* synthetic */ z33(uh0 uh0Var, t11 t11Var, cd2 cd2Var, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : uh0Var, (i & 4) != 0 ? null : t11Var, (i & 8) != 0 ? null : cd2Var, (i & 32) == 0, (i & 64) != 0 ? ce0.f1492h : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z33)) {
            return false;
        }
        z33 z33Var = (z33) obj;
        return t11.m5086l(this.f13712a, z33Var.f13712a) && t11.m5086l(null, null) && t11.m5086l(this.f13713b, z33Var.f13713b) && this.f13714c == z33Var.f13714c && t11.m5086l(this.f13715d, z33Var.f13715d);
    }

    public final int hashCode() {
        uh0 uh0Var = this.f13712a;
        int iHashCode = (((uh0Var == null ? 0 : uh0Var.hashCode()) * 961) + 0) * 31;
        cd2 cd2Var = this.f13713b;
        return this.f13715d.hashCode() + hk1.m2205d((iHashCode + (cd2Var != null ? cd2Var.hashCode() : 0)) * 961, 31, this.f13714c);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f13712a + ", slide=null, changeSize=" + ((Object) null) + ", scale=" + this.f13713b + ", veil=null, hold=" + this.f13714c + ", effectsMap=" + this.f13715d + ')';
    }

    public z33(uh0 uh0Var, t11 t11Var, cd2 cd2Var, boolean z, Map map) {
        this.f13712a = uh0Var;
        this.f13713b = cd2Var;
        this.f13714c = z;
        this.f13715d = map;
    }
}
