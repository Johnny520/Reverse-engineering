package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: pq */
/* JADX INFO: loaded from: classes.dex */
public final class C2383pq extends AbstractSet implements Set, InterfaceC0588Nm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8381a;

    /* JADX INFO: renamed from: b */
    public final C2332oq f8382b;

    public /* synthetic */ C2383pq(C2332oq c2332oq, int i) {
        this.f8381a = i;
        this.f8382b = c2332oq;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f8381a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.f8381a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f8381a) {
            case 0:
                this.f8382b.clear();
                break;
            default:
                this.f8382b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f8381a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C2332oq c2332oq = this.f8382b;
                c2332oq.getClass();
                int iM4732e = c2332oq.m4732e(entry.getKey());
                if (iM4732e < 0) {
                    return false;
                }
                return AbstractC0585Nj.m1134a(c2332oq.f8182b[iM4732e], entry.getValue());
            default:
                return this.f8382b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.f8381a) {
            case 0:
                C2332oq c2332oq = this.f8382b;
                c2332oq.getClass();
                for (Object obj : collection) {
                    if (obj == null) {
                        return false;
                    }
                    try {
                        Map.Entry entry = (Map.Entry) obj;
                        int iM4732e = c2332oq.m4732e(entry.getKey());
                        if (!(iM4732e < 0 ? false : AbstractC0585Nj.m1134a(c2332oq.f8182b[iM4732e], entry.getValue()))) {
                            return false;
                        }
                    } catch (ClassCastException unused) {
                        return false;
                    }
                }
                return true;
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.f8381a) {
        }
        return this.f8382b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f8381a) {
            case 0:
                C2332oq c2332oq = this.f8382b;
                c2332oq.getClass();
                return new C2203lq(c2332oq, 0);
            default:
                C2332oq c2332oq2 = this.f8382b;
                c2332oq2.getClass();
                return new C2203lq(c2332oq2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f8381a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    C2332oq c2332oq = this.f8382b;
                    c2332oq.m4729b();
                    int iM4732e = c2332oq.m4732e(entry.getKey());
                    if (iM4732e >= 0 && AbstractC0585Nj.m1134a(c2332oq.f8182b[iM4732e], entry.getValue())) {
                        c2332oq.m4735h(iM4732e);
                    }
                    break;
                }
                break;
            default:
                C2332oq c2332oq2 = this.f8382b;
                c2332oq2.m4729b();
                int iM4732e2 = c2332oq2.m4732e(obj);
                if (iM4732e2 >= 0) {
                    c2332oq2.m4735h(iM4732e2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.f8381a) {
            case 0:
                this.f8382b.m4729b();
                break;
            default:
                this.f8382b.m4729b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.f8381a) {
            case 0:
                this.f8382b.m4729b();
                break;
            default:
                this.f8382b.m4729b();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f8381a) {
        }
        return this.f8382b.f8189i;
    }
}
