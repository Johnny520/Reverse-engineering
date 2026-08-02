package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

/* JADX INFO: renamed from: ys */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0934ys extends x73 {

    /* JADX INFO: renamed from: f */
    public final TreeMap f13601f;

    /* JADX INFO: renamed from: g */
    public ArrayList f13602g;

    public C0934ys(z70 z70Var) {
        super("class_defs", z70Var, 4);
        this.f13601f = new TreeMap();
        this.f13602g = null;
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: c */
    public final Collection mo398c() {
        ArrayList arrayList = this.f13602g;
        return arrayList != null ? arrayList : this.f13601f.values();
    }

    @Override // p000.x73
    /* JADX INFO: renamed from: k */
    public final void mo399k() {
        TreeMap treeMap = this.f13601f;
        int size = treeMap.size();
        this.f13602g = new ArrayList(size);
        Iterator it = treeMap.keySet().iterator();
        int iM6321l = 0;
        while (it.hasNext()) {
            iM6321l = m6321l((o43) it.next(), iM6321l, size - iM6321l);
        }
    }

    /* JADX INFO: renamed from: l */
    public final int m6321l(o43 o43Var, int i, int i2) {
        C0897xs c0897xs = (C0897xs) this.f13601f.get(o43Var);
        if (c0897xs == null || c0897xs.f4831h >= 0) {
            return i;
        }
        if (i2 < 0) {
            c80.m663A("class circularity with ", o43Var);
            return 0;
        }
        int i3 = i2 - 1;
        r30 r30Var = c0897xs.f13149k;
        if (r30Var != null) {
            i = m6321l(r30Var.f9342h, i, i3);
        }
        f63 f63Var = c0897xs.f13150l;
        d63 d63Var = f63Var == null ? wu2.f12672j : f63Var.f2823l;
        int length = ((kj0) d63Var).f5590i.length;
        for (int i4 = 0; i4 < length; i4++) {
            i = m6321l(d63Var.getType(i4), i, i3);
        }
        c0897xs.m2417g(i);
        this.f13602g.add(c0897xs);
        return i + 1;
    }
}
