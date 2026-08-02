package defpackage;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pi2 {
    public final Set a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pi2(Set set, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        set.getClass();
        this.a = set;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            xe1.d0((String) it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi2)) {
            return false;
        }
        pi2 pi2Var = (pi2) obj;
        return t11.l(this.a, pi2Var.a) && this.b == pi2Var.b && this.c == pi2Var.c && this.d == pi2Var.d && this.e == pi2Var.e && this.f == pi2Var.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.f) + hk1.d(hk1.d(hk1.d(hk1.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptPermissionGrant(networkOrigins=" + this.a + ", privateNetwork=" + this.b + ", allowAnyOrigin=" + this.c + ", hostAccess=" + this.d + ", filesystemExternal=" + this.e + ", filesystemHost=" + this.f + ")";
    }
}
