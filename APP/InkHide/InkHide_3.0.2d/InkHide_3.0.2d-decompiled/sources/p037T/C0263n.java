package p037T;

import java.util.ArrayList;
import java.util.Iterator;
import p022L.AbstractC0174d;

/* JADX INFO: renamed from: T.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0263n extends AbstractC0264o implements Iterable {

    /* JADX INFO: renamed from: a */
    public final ArrayList f635a = new ArrayList();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.AbstractC0264o
    /* JADX INFO: renamed from: a */
    public final int mo487a() {
        ArrayList arrayList = this.f635a;
        int size = arrayList.size();
        if (size == 1) {
            return ((AbstractC0264o) arrayList.get(0)).mo487a();
        }
        throw new IllegalStateException(AbstractC0174d.m351g(size, "Array must have size 1, but has size "));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof C0263n) && ((C0263n) obj).f635a.equals(this.f635a);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f635a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f635a.iterator();
    }
}
