package p065M2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import p061L2.AbstractC0968h;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: M2.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1003f extends AbstractC0968h {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3113d;

    /* JADX INFO: renamed from: e */
    public final C1002e f3114e;

    public /* synthetic */ C1003f(C1002e c1002e, int i5) {
        this.f3113d = i5;
        this.f3114e = c1002e;
    }

    @Override // p061L2.AbstractC0968h
    /* JADX INFO: renamed from: a */
    public final int mo1978a() {
        switch (this.f3113d) {
        }
        return this.f3114e.f3108l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f3113d) {
            case 0:
                AbstractC1665j.m2985e((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f3113d) {
            case 0:
                AbstractC1665j.m2985e(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                AbstractC1665j.m2985e(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f3113d) {
            case 0:
                this.f3114e.clear();
                break;
            default:
                this.f3114e.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f3113d) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.f3114e.m2072e((Map.Entry) obj);
            default:
                return this.f3114e.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f3113d) {
            case 0:
                AbstractC1665j.m2985e(collection, "elements");
                return this.f3114e.m2071d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f3113d) {
        }
        return this.f3114e.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f3113d) {
            case 0:
                C1002e c1002e = this.f3114e;
                c1002e.getClass();
                return new C1000c(c1002e, 0);
            default:
                C1002e c1002e2 = this.f3114e;
                c1002e2.getClass();
                return new C1000c(c1002e2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f3113d) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C1002e c1002e = this.f3114e;
                    c1002e.getClass();
                    c1002e.m2069b();
                    int iM2074g = c1002e.m2074g(entry.getKey());
                    if (iM2074g >= 0) {
                        Object[] objArr = c1002e.f3101e;
                        AbstractC1665j.m2982b(objArr);
                        if (AbstractC1665j.m2981a(objArr[iM2074g], entry.getValue())) {
                            c1002e.m2078k(iM2074g);
                            break;
                        }
                    }
                }
                break;
            default:
                C1002e c1002e2 = this.f3114e;
                c1002e2.m2069b();
                int iM2074g2 = c1002e2.m2074g(obj);
                if (iM2074g2 >= 0) {
                    c1002e2.m2078k(iM2074g2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f3113d) {
            case 0:
                AbstractC1665j.m2985e(collection, "elements");
                this.f3114e.m2069b();
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                this.f3114e.m2069b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f3113d) {
            case 0:
                AbstractC1665j.m2985e(collection, "elements");
                this.f3114e.m2069b();
                break;
            default:
                AbstractC1665j.m2985e(collection, "elements");
                this.f3114e.m2069b();
                break;
        }
        return super.retainAll(collection);
    }
}
