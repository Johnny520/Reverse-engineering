package p202o0;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p188n0.C2861a;
import tf.AbstractC4159f;

/* JADX INFO: renamed from: o0.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3031c extends AbstractC4159f {
    /* JADX INFO: renamed from: a */
    public abstract AbstractC3031c mo6434a(int i9, Object obj);

    /* JADX INFO: renamed from: c */
    public abstract AbstractC3031c mo6435c(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4149a, java.util.Collection, java.util.List
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
    public AbstractC3031c mo6436d(Collection collection) {
        C3034f c3034fMo6437e = mo6437e();
        c3034fMo6437e.addAll(collection);
        return c3034fMo6437e.m6459d();
    }

    /* JADX INFO: renamed from: e */
    public abstract C3034f mo6437e();

    /* JADX INFO: renamed from: f */
    public abstract AbstractC3031c mo6438f(C3030b c3030b);

    /* JADX INFO: renamed from: g */
    public abstract AbstractC3031c mo6439g(int i9);

    /* JADX INFO: renamed from: h */
    public abstract AbstractC3031c mo6440h(int i9, Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // tf.AbstractC4159f, java.util.List
    public final List subList(int i9, int i10) {
        return new C2861a(this, i9, i10);
    }
}
