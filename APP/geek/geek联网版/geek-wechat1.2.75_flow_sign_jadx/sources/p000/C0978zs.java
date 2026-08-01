package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: zs */
/* JADX INFO: loaded from: classes.dex */
public final class C0978zs implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5616a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0474m6 f5617b;

    public /* synthetic */ C0978zs(C0474m6 c0474m6, int i) {
        this.f5616a = i;
        this.f5617b = c0474m6;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                C0474m6 c0474m6 = this.f5617b;
                int iM1811d = c0474m6.m1811d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c0474m6.f3079d) {
                        case Base64.DEFAULT /* 0 */:
                            ((C0511n6) c0474m6.f3080e).put(key, value);
                            break;
                        default:
                            ((C0622q6) c0474m6.f3080e).add(key);
                            break;
                    }
                }
                return iM1811d != c0474m6.m1811d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                this.f5617b.m1808a();
                break;
            default:
                this.f5617b.m1808a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0474m6 c0474m6 = this.f5617b;
                int iM1812e = c0474m6.m1812e(key);
                if (iM1812e < 0) {
                    return false;
                }
                Object objM1809b = c0474m6.m1809b(iM1812e, 1);
                Object value = entry.getValue();
                return objM1809b == value || (objM1809b != null && objM1809b.equals(value));
            default:
                return this.f5617b.m1812e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map mapM1810c = this.f5617b.m1810c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapM1810c.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f5616a) {
        }
        return C0474m6.m1807h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                C0474m6 c0474m6 = this.f5617b;
                int iHashCode = 0;
                for (int iM1811d = c0474m6.m1811d() - 1; iM1811d >= 0; iM1811d--) {
                    Object objM1809b = c0474m6.m1809b(iM1811d, 0);
                    Object objM1809b2 = c0474m6.m1809b(iM1811d, 1);
                    iHashCode += (objM1809b == null ? 0 : objM1809b.hashCode()) ^ (objM1809b2 == null ? 0 : objM1809b2.hashCode());
                }
                return iHashCode;
            default:
                C0474m6 c0474m62 = this.f5617b;
                int iHashCode2 = 0;
                for (int iM1811d2 = c0474m62.m1811d() - 1; iM1811d2 >= 0; iM1811d2--) {
                    Object objM1809b3 = c0474m62.m1809b(iM1811d2, 0);
                    iHashCode2 += objM1809b3 == null ? 0 : objM1809b3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                if (this.f5617b.m1811d() == 0) {
                }
                break;
            default:
                if (this.f5617b.m1811d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                return new C0043at(this.f5617b);
            default:
                return new C0941ys(this.f5617b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                C0474m6 c0474m6 = this.f5617b;
                int iM1812e = c0474m6.m1812e(obj);
                if (iM1812e < 0) {
                    return false;
                }
                c0474m6.m1814g(iM1812e);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Map mapM1810c = this.f5617b.m1810c();
                int size = mapM1810c.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapM1810c.remove(it.next());
                }
                return size != mapM1810c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Map mapM1810c = this.f5617b.m1810c();
                int size = mapM1810c.size();
                Iterator it = mapM1810c.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapM1810c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f5616a) {
        }
        return this.f5617b.m1811d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                return this.f5617b.m1815i(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f5616a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                C0474m6 c0474m6 = this.f5617b;
                int iM1811d = c0474m6.m1811d();
                Object[] objArr = new Object[iM1811d];
                for (int i = 0; i < iM1811d; i++) {
                    objArr[i] = c0474m6.m1809b(i, 0);
                }
                return objArr;
        }
    }
}
