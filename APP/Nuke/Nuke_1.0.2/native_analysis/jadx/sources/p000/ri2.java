package p000;

import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ri2 {

    /* JADX INFO: renamed from: a */
    public final ji2 f9601a;

    /* JADX INFO: renamed from: b */
    public final kh2 f9602b;

    /* JADX INFO: renamed from: c */
    public final ch2 f9603c;

    public ri2(ji2 ji2Var, kh2 kh2Var, ch2 ch2Var) {
        this.f9601a = ji2Var;
        this.f9602b = kh2Var;
        this.f9603c = ch2Var;
    }

    /* JADX INFO: renamed from: a */
    public final LinkedHashSet m4492a() {
        jp2 jp2VarM4494c = m4494c();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = jp2VarM4494c.iterator();
        while (((ne1) it).hasNext()) {
            Object next = ((ne1) it).next();
            if (((ef2) next).f2432i) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    /* JADX INFO: renamed from: b */
    public final pb1 m4493b() {
        pb1 pb1VarM1424E = AbstractC0179eu.m1424E();
        kh2 kh2Var = this.f9602b;
        if (kh2Var != null && kh2Var.f5576a) {
            pb1VarM1424E.add(new ff2(ef2.HOST_REFLECT, kh2Var.f5579d));
        }
        if (kh2Var != null && kh2Var.f5577b) {
            pb1VarM1424E.add(new ff2(ef2.HOST_HOOK, kh2Var.f5579d));
        }
        ch2 ch2Var = this.f9603c;
        if (ch2Var != null && ch2Var.f1543b) {
            pb1VarM1424E.add(new ff2(ef2.FILESYSTEM_HOST, ch2Var.f1544c));
        }
        return AbstractC0179eu.m1476z(pb1VarM1424E);
    }

    /* JADX INFO: renamed from: c */
    public final jp2 m4494c() {
        jp2 jp2Var = new jp2();
        if (this.f9601a != null) {
            jp2Var.add(ef2.NETWORK);
        }
        ch2 ch2Var = this.f9603c;
        if (ch2Var != null && ch2Var.f1542a) {
            jp2Var.add(ef2.FILESYSTEM_EXTERNAL);
        }
        kh2 kh2Var = this.f9602b;
        if (kh2Var != null && kh2Var.f5576a) {
            jp2Var.add(ef2.HOST_REFLECT);
        }
        if (kh2Var != null && kh2Var.f5577b) {
            jp2Var.add(ef2.HOST_HOOK);
        }
        if (ch2Var != null && ch2Var.f1543b) {
            jp2Var.add(ef2.FILESYSTEM_HOST);
        }
        pe1 pe1Var = jp2Var.f5149h;
        pe1Var.m3852b();
        return pe1Var.f8279p > 0 ? jp2Var : jp2.f5148i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri2)) {
            return false;
        }
        ri2 ri2Var = (ri2) obj;
        return t11.m5086l(this.f9601a, ri2Var.f9601a) && t11.m5086l(this.f9602b, ri2Var.f9602b) && t11.m5086l(this.f9603c, ri2Var.f9603c);
    }

    public final int hashCode() {
        ji2 ji2Var = this.f9601a;
        int iHashCode = (ji2Var == null ? 0 : ji2Var.hashCode()) * 31;
        kh2 kh2Var = this.f9602b;
        int iHashCode2 = (iHashCode + (kh2Var == null ? 0 : kh2Var.hashCode())) * 31;
        ch2 ch2Var = this.f9603c;
        return iHashCode2 + (ch2Var != null ? ch2Var.hashCode() : 0);
    }

    public final String toString() {
        return "ScriptPermissions(network=" + this.f9601a + ", host=" + this.f9602b + ", filesystem=" + this.f9603c + ")";
    }
}
