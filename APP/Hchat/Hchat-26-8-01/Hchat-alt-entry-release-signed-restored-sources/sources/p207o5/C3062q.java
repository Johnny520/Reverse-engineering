package p207o5;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: o5.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3062q implements Iterator {

    /* JADX INFO: renamed from: g */
    public final Iterator f9899g;

    /* JADX INFO: renamed from: h */
    public final Iterator f9900h;

    /* JADX INFO: renamed from: i */
    public final Iterator f9901i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3062q(List list, List list2, Iterator it) {
        this.f9899g = list.iterator();
        this.f9900h = list2.iterator();
        this.f9901i = it;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9899g.hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final Object next() {
        String string = ((CharSequence) this.f9899g.next()).toString();
        Iterator it = this.f9900h;
        Set set = it.hasNext() ? (Set) it.next() : Collections.EMPTY_SET;
        Iterator it2 = this.f9901i;
        return new C3061p(it2.hasNext() ? (String) it2.next() : null, string, set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
