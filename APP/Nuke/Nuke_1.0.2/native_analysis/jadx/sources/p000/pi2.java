package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pi2 {

    /* JADX INFO: renamed from: a */
    public final Set f8364a;

    /* JADX INFO: renamed from: b */
    public final boolean f8365b;

    /* JADX INFO: renamed from: c */
    public final boolean f8366c;

    /* JADX INFO: renamed from: d */
    public final boolean f8367d;

    /* JADX INFO: renamed from: e */
    public final boolean f8368e;

    /* JADX INFO: renamed from: f */
    public final boolean f8369f;

    public pi2(Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        set.getClass();
        this.f8364a = set;
        this.f8365b = z;
        this.f8366c = z2;
        this.f8367d = z3;
        this.f8368e = z4;
        this.f8369f = z5;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            xe1.m6116d0((String) it.next());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi2)) {
            return false;
        }
        pi2 pi2Var = (pi2) obj;
        return t11.m5086l(this.f8364a, pi2Var.f8364a) && this.f8365b == pi2Var.f8365b && this.f8366c == pi2Var.f8366c && this.f8367d == pi2Var.f8367d && this.f8368e == pi2Var.f8368e && this.f8369f == pi2Var.f8369f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f8369f) + hk1.m2205d(hk1.m2205d(hk1.m2205d(hk1.m2205d(this.f8364a.hashCode() * 31, 31, this.f8365b), 31, this.f8366c), 31, this.f8367d), 31, this.f8368e);
    }

    public final String toString() {
        return "ScriptPermissionGrant(networkOrigins=" + this.f8364a + ", privateNetwork=" + this.f8365b + ", allowAnyOrigin=" + this.f8366c + ", hostAccess=" + this.f8367d + ", filesystemExternal=" + this.f8368e + ", filesystemHost=" + this.f8369f + ")";
    }
}
