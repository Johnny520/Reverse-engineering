package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: d0 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0112d0 extends AbstractC0945y {
    /* JADX INFO: renamed from: b */
    public abstract AbstractC0112d0 mo7b(int i, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract AbstractC0112d0 mo8c(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0597p, java.util.Collection, java.util.List
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public AbstractC0112d0 mo9d(Collection collection) {
        qq0 qq0VarMo10e = mo10e();
        qq0VarMo10e.addAll(collection);
        return qq0VarMo10e.m3301c();
    }

    /* JADX INFO: renamed from: e */
    public abstract qq0 mo10e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC0112d0 mo11f(C0074c0 c0074c0);

    /* JADX INFO: renamed from: g */
    public abstract AbstractC0112d0 mo12g(int i);

    /* JADX INFO: renamed from: h */
    public abstract AbstractC0112d0 mo13h(int i, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0945y, java.util.List
    public final List subList(int i, int i2) {
        return new w00(this, i, i2);
    }
}
