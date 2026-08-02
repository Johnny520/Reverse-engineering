package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ri2 {
    public final ji2 a;
    public final kh2 b;
    public final ch2 c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ri2(ji2 ji2Var, kh2 kh2Var, ch2 ch2Var) {
        this.a = ji2Var;
        this.b = kh2Var;
        this.c = ch2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final LinkedHashSet a() {
        jp2 jp2VarC = c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = jp2VarC.iterator();
        while (((ne1) it).hasNext()) {
            Object next = ((ne1) it).next();
            if (((ef2) next).i) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final pb1 b() {
        pb1 pb1VarE = eu.E();
        kh2 kh2Var = this.b;
        if (kh2Var != null && kh2Var.a) {
            pb1VarE.add(new ff2(ef2.HOST_REFLECT, kh2Var.d));
        }
        if (kh2Var != null && kh2Var.b) {
            pb1VarE.add(new ff2(ef2.HOST_HOOK, kh2Var.d));
        }
        ch2 ch2Var = this.c;
        if (ch2Var != null && ch2Var.b) {
            pb1VarE.add(new ff2(ef2.FILESYSTEM_HOST, ch2Var.c));
        }
        return eu.z(pb1VarE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final jp2 c() {
        jp2 jp2Var = new jp2();
        if (this.a != null) {
            jp2Var.add(ef2.NETWORK);
        }
        ch2 ch2Var = this.c;
        if (ch2Var != null && ch2Var.a) {
            jp2Var.add(ef2.FILESYSTEM_EXTERNAL);
        }
        kh2 kh2Var = this.b;
        if (kh2Var != null && kh2Var.a) {
            jp2Var.add(ef2.HOST_REFLECT);
        }
        if (kh2Var != null && kh2Var.b) {
            jp2Var.add(ef2.HOST_HOOK);
        }
        if (ch2Var != null && ch2Var.b) {
            jp2Var.add(ef2.FILESYSTEM_HOST);
        }
        pe1 pe1Var = jp2Var.h;
        pe1Var.b();
        return pe1Var.p > 0 ? jp2Var : jp2.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri2)) {
            return false;
        }
        ri2 ri2Var = (ri2) obj;
        return t11.l(this.a, ri2Var.a) && t11.l(this.b, ri2Var.b) && t11.l(this.c, ri2Var.c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        ji2 ji2Var = this.a;
        int iHashCode = (ji2Var == null ? 0 : ji2Var.hashCode()) * 31;
        kh2 kh2Var = this.b;
        int iHashCode2 = (iHashCode + (kh2Var == null ? 0 : kh2Var.hashCode())) * 31;
        ch2 ch2Var = this.c;
        return iHashCode2 + (ch2Var != null ? ch2Var.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptPermissions(network=" + this.a + ", host=" + this.b + ", filesystem=" + this.c + ")";
    }
}
