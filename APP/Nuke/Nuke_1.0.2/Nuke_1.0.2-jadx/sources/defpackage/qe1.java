package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 extends a3 {
    public final /* synthetic */ int h;
    public final pe1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ qe1(pe1 pe1Var, int i) {
        this.h = i;
        this.i = pe1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a3
    public final int a() {
        switch (this.h) {
        }
        return this.i.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.h) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.h;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.h) {
            case 0:
                this.i.clear();
                break;
            default:
                this.i.clear();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.h;
        pe1 pe1Var = this.i;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                pe1Var.getClass();
                int iG = pe1Var.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                Object[] objArr = pe1Var.i;
                objArr.getClass();
                return t11.l(objArr[iG], entry.getValue());
            default:
                return pe1Var.containsKey(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.h) {
            case 0:
                collection.getClass();
                return this.i.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.h) {
        }
        return this.i.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.h;
        pe1 pe1Var = this.i;
        switch (i) {
            case 0:
                pe1Var.getClass();
                return new ne1(pe1Var, 0);
            default:
                pe1Var.getClass();
                return new ne1(pe1Var, 1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.h;
        pe1 pe1Var = this.i;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    pe1Var.getClass();
                    pe1Var.c();
                    int iG = pe1Var.g(entry.getKey());
                    if (iG >= 0) {
                        Object[] objArr = pe1Var.i;
                        objArr.getClass();
                        if (t11.l(objArr[iG], entry.getValue())) {
                            pe1Var.k(iG);
                        }
                    }
                }
                break;
            default:
                pe1Var.c();
                int iG2 = pe1Var.g(obj);
                if (iG2 >= 0) {
                    pe1Var.k(iG2);
                }
                break;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.h;
        pe1 pe1Var = this.i;
        collection.getClass();
        switch (i) {
            case 0:
                pe1Var.c();
                break;
            default:
                pe1Var.c();
                break;
        }
        return super.removeAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.h;
        pe1 pe1Var = this.i;
        collection.getClass();
        switch (i) {
            case 0:
                pe1Var.c();
                break;
            default:
                pe1Var.c();
                break;
        }
        return super.retainAll(collection);
    }
}
