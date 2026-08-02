package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ji2 {
    public final List a;
    public final boolean b;
    public final boolean c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ji2(List list, boolean z, boolean z2) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = z2;
        if (!z2 && list.isEmpty()) {
            s.j("Network permission must set any=true or declare at least one origin.");
            throw null;
        }
        if (list.size() > 128) {
            s.j("Network permission contains too many origins.");
            throw null;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (pv2.s0((String) it.next())) {
                    s.j("Network origins must not be blank.");
                    throw null;
                }
            }
        }
        if (du.n0(this.a).size() != this.a.size()) {
            s.j("Network origins must not repeat.");
            throw null;
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            xe1.d0((String) it2.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji2)) {
            return false;
        }
        ji2 ji2Var = (ji2) obj;
        return t11.l(this.a, ji2Var.a) && this.b == ji2Var.b && this.c == ji2Var.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return Boolean.hashCode(this.c) + hk1.d(this.a.hashCode() * 31, 31, this.b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptNetworkPermission(origins=" + this.a + ", privateNetwork=" + this.b + ", any=" + this.c + ")";
    }
}
