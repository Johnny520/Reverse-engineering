package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: c3 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0077c3 extends AbstractC0832w2 {
    /* JADX INFO: renamed from: b */
    public abstract AbstractC0077c3 mo619b(int i, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract AbstractC0077c3 mo620c(Object obj);

    @Override // p000.AbstractC0372k2, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // p000.AbstractC0372k2, java.util.Collection, java.util.List
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC0077c3 mo621d(Collection collection) {
        lz1 lz1VarMo622e = mo622e();
        lz1VarMo622e.addAll(collection);
        return lz1VarMo622e.m2997c();
    }

    /* JADX INFO: renamed from: e */
    public abstract lz1 mo622e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC0077c3 mo623f(C0041b3 c0041b3);

    /* JADX INFO: renamed from: g */
    public abstract AbstractC0077c3 mo624g(int i);

    /* JADX INFO: renamed from: h */
    public abstract AbstractC0077c3 mo625h(int i, Object obj);

    @Override // p000.AbstractC0832w2, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p000.AbstractC0832w2, java.util.List
    public final List subList(int i, int i2) {
        return new yx0(this, i, i2);
    }
}
