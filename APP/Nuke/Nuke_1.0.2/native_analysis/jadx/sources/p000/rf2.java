package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class rf2 {

    /* JADX INFO: renamed from: a */
    public final d41 f9544a;

    /* JADX INFO: renamed from: b */
    public final d41 f9545b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f9546c;

    public rf2(d41 d41Var, d41 d41Var2, ArrayList arrayList) {
        d41Var.getClass();
        this.f9544a = d41Var;
        this.f9545b = d41Var2;
        this.f9546c = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m4446a() {
        ArrayList arrayList = this.f9546c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((gf2) it.next()).f3491c == hf2.f3994i) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rf2)) {
            return false;
        }
        rf2 rf2Var = (rf2) obj;
        return t11.m5086l(this.f9544a, rf2Var.f9544a) && this.f9545b.equals(rf2Var.f9545b) && this.f9546c.equals(rf2Var.f9546c);
    }

    public final int hashCode() {
        return this.f9546c.hashCode() + ((this.f9545b.f1861h.hashCode() + (this.f9544a.f1861h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ScriptConfigSnapshot(rawValues=" + this.f9544a + ", values=" + this.f9545b + ", issues=" + this.f9546c + ")";
    }
}
