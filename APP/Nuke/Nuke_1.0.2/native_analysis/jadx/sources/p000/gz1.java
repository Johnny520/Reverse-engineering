package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gz1 extends AbstractC0908y2 implements q41 {

    /* JADX INFO: renamed from: h */
    public final bz1 f3745h;

    public gz1(bz1 bz1Var) {
        this.f3745h = bz1Var;
    }

    @Override // p000.AbstractC0908y2
    /* JADX INFO: renamed from: a */
    public final int mo2038a() {
        return this.f3745h.f1087m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f3745h.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3745h.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        i43[] i43VarArr = new i43[8];
        for (int i = 0; i < 8; i++) {
            i43VarArr[i] = new j43(2);
        }
        return new fz1(this.f3745h, i43VarArr);
    }
}
