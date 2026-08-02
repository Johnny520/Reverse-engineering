package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qe1 extends AbstractC0004a3 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8928h;

    /* JADX INFO: renamed from: i */
    public final pe1 f8929i;

    public /* synthetic */ qe1(pe1 pe1Var, int i) {
        this.f8928h = i;
        this.f8929i = pe1Var;
    }

    @Override // p000.AbstractC0004a3
    /* JADX INFO: renamed from: a */
    public final int mo21a() {
        switch (this.f8928h) {
        }
        return this.f8929i.f8279p;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f8928h) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.f8928h;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f8928h) {
            case 0:
                this.f8929i.clear();
                break;
            default:
                this.f8929i.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.f8928h;
        pe1 pe1Var = this.f8929i;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                pe1Var.getClass();
                int iM3857g = pe1Var.m3857g(entry.getKey());
                if (iM3857g < 0) {
                    return false;
                }
                Object[] objArr = pe1Var.f8272i;
                objArr.getClass();
                return t11.m5086l(objArr[iM3857g], entry.getValue());
            default:
                return pe1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f8928h) {
            case 0:
                collection.getClass();
                return this.f8929i.m3855e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f8928h) {
        }
        return this.f8929i.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f8928h;
        pe1 pe1Var = this.f8929i;
        switch (i) {
            case 0:
                pe1Var.getClass();
                return new ne1(pe1Var, 0);
            default:
                pe1Var.getClass();
                return new ne1(pe1Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.f8928h;
        pe1 pe1Var = this.f8929i;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    pe1Var.getClass();
                    pe1Var.m3853c();
                    int iM3857g = pe1Var.m3857g(entry.getKey());
                    if (iM3857g >= 0) {
                        Object[] objArr = pe1Var.f8272i;
                        objArr.getClass();
                        if (t11.m5086l(objArr[iM3857g], entry.getValue())) {
                            pe1Var.m3861k(iM3857g);
                        }
                    }
                }
                break;
            default:
                pe1Var.m3853c();
                int iM3857g2 = pe1Var.m3857g(obj);
                if (iM3857g2 >= 0) {
                    pe1Var.m3861k(iM3857g2);
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.f8928h;
        pe1 pe1Var = this.f8929i;
        collection.getClass();
        switch (i) {
            case 0:
                pe1Var.m3853c();
                break;
            default:
                pe1Var.m3853c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.f8928h;
        pe1 pe1Var = this.f8929i;
        collection.getClass();
        switch (i) {
            case 0:
                pe1Var.m3853c();
                break;
            default:
                pe1Var.m3853c();
                break;
        }
        return super.retainAll(collection);
    }
}
