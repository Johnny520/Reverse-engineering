package tf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: renamed from: tf.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4150a0 extends AbstractC4160g {

    /* JADX INFO: renamed from: g */
    public final ArrayList f13680g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4150a0(ArrayList arrayList) {
        this.f13680g = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: a */
    public final int mo6457a() {
        return this.f13680g.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final void add(int i9, Object obj) {
        this.f13680g.add(AbstractC4166m.m8414l1(i9, this), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4160g
    /* JADX INFO: renamed from: c */
    public final Object mo6458c(int i9) {
        return this.f13680g.remove(AbstractC4166m.m8413k1(i9, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f13680g.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i9) {
        return this.f13680g.get(AbstractC4166m.m8413k1(i9, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C4179z(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new C4179z(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i9, Object obj) {
        return this.f13680g.set(AbstractC4166m.m8413k1(i9, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i9) {
        return new C4179z(this, i9);
    }
}
