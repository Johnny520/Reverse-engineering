package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ys extends x73 {
    public final TreeMap f;
    public ArrayList g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ys(z70 z70Var) {
        super("class_defs", z70Var, 4);
        this.f = new TreeMap();
        this.g = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final Collection c() {
        ArrayList arrayList = this.g;
        return arrayList != null ? arrayList : this.f.values();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.x73
    public final void k() {
        TreeMap treeMap = this.f;
        int size = treeMap.size();
        this.g = new ArrayList(size);
        Iterator it = treeMap.keySet().iterator();
        int iL = 0;
        while (it.hasNext()) {
            iL = l((o43) it.next(), iL, size - iL);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int l(o43 o43Var, int i, int i2) {
        xs xsVar = (xs) this.f.get(o43Var);
        if (xsVar == null || xsVar.h >= 0) {
            return i;
        }
        if (i2 < 0) {
            c80.A("class circularity with ", o43Var);
            return 0;
        }
        int i3 = i2 - 1;
        r30 r30Var = xsVar.k;
        if (r30Var != null) {
            i = l(r30Var.h, i, i3);
        }
        f63 f63Var = xsVar.l;
        d63 d63Var = f63Var == null ? wu2.j : f63Var.l;
        int length = ((kj0) d63Var).i.length;
        for (int i4 = 0; i4 < length; i4++) {
            i = l(d63Var.getType(i4), i, i3);
        }
        xsVar.g(i);
        this.g.add(xsVar);
        return i + 1;
    }
}
