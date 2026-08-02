package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class kh2 {
    public static final List e = eu.O("*");
    public final boolean a;
    public final boolean b;
    public final List c;
    public final String d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public kh2(boolean z, boolean z2, List list, String str) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = str;
        if (!z && !z2) {
            s.j("Host permission must enable reflect or hook.");
            throw null;
        }
        if (list.isEmpty()) {
            s.j("Host permission classes must not be empty.");
            throw null;
        }
        if (list.size() > 256) {
            s.j("Host permission declares too many class patterns.");
            throw null;
        }
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (pv2.s0((String) it.next())) {
                    s.j("Host permission class patterns must not be blank.");
                    throw null;
                }
            }
        }
        String str2 = this.d;
        if (str2 != null && pv2.s0(str2)) {
            s.j("Host permission reason must not be blank.");
            throw null;
        }
        String str3 = this.d;
        if (str3 == null || str3.length() <= 512) {
            return;
        }
        s.j("Host permission reason is too long.");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh2)) {
            return false;
        }
        kh2 kh2Var = (kh2) obj;
        return this.a == kh2Var.a && this.b == kh2Var.b && t11.l(this.c, kh2Var.c) && t11.l(this.d, kh2Var.d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + hk1.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        String str = this.d;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptHostPermission(reflect=" + this.a + ", hook=" + this.b + ", classes=" + this.c + ", reason=" + this.d + ")";
    }
}
