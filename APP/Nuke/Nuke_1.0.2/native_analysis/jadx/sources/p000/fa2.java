package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class fa2 extends AbstractC0947z2 {

    /* JADX INFO: renamed from: h */
    public final ArrayList f2883h;

    public fa2(ArrayList arrayList) {
        this.f2883h = arrayList;
    }

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: a */
    public final int mo152a() {
        return this.f2883h.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.f2883h.add(AbstractC0142du.m1155k0(i, this), obj);
    }

    @Override // p000.AbstractC0947z2
    /* JADX INFO: renamed from: b */
    public final Object mo153b(int i) {
        return this.f2883h.remove(AbstractC0142du.m1154j0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f2883h.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.f2883h.get(AbstractC0142du.m1154j0(i, this));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new ea2(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new ea2(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.f2883h.set(AbstractC0142du.m1154j0(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new ea2(this, i);
    }
}
