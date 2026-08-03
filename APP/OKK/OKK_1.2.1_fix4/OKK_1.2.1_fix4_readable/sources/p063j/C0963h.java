package p063j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: j.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0963h implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3419a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0956a f3420b;

    public /* synthetic */ C0963h(C0956a c0956a, int i2) {
        this.f3419a = i2;
        this.f3420b = c0956a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f3419a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f3419a) {
            case 0:
                C0956a c0956a = this.f3420b;
                int iM2292d = c0956a.m2292d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    c0956a.m2295g(entry.getKey(), entry.getValue());
                }
                return iM2292d != c0956a.m2292d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f3419a) {
            case 0:
                this.f3420b.m2289a();
                break;
            default:
                this.f3420b.m2289a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3419a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0956a c0956a = this.f3420b;
                int iM2293e = c0956a.m2293e(key);
                if (iM2293e < 0) {
                    return false;
                }
                Object objM2290b = c0956a.m2290b(iM2293e, 1);
                Object value = entry.getValue();
                return objM2290b == value || (objM2290b != null && objM2290b.equals(value));
            default:
                return this.f3420b.m2293e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f3419a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map mapM2291c = this.f3420b.m2291c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapM2291c.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f3419a) {
        }
        return C0956a.m2288j(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f3419a) {
            case 0:
                C0956a c0956a = this.f3420b;
                int iHashCode = 0;
                for (int iM2292d = c0956a.m2292d() - 1; iM2292d >= 0; iM2292d--) {
                    Object objM2290b = c0956a.m2290b(iM2292d, 0);
                    Object objM2290b2 = c0956a.m2290b(iM2292d, 1);
                    iHashCode += (objM2290b == null ? 0 : objM2290b.hashCode()) ^ (objM2290b2 == null ? 0 : objM2290b2.hashCode());
                }
                return iHashCode;
            default:
                C0956a c0956a2 = this.f3420b;
                int iHashCode2 = 0;
                for (int iM2292d2 = c0956a2.m2292d() - 1; iM2292d2 >= 0; iM2292d2--) {
                    Object objM2290b3 = c0956a2.m2290b(iM2292d2, 0);
                    iHashCode2 += objM2290b3 == null ? 0 : objM2290b3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f3419a) {
            case 0:
                if (this.f3420b.m2292d() == 0) {
                }
                break;
            default:
                if (this.f3420b.m2292d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f3419a) {
            case 0:
                return new C0964i(this.f3420b);
            default:
                return new C0962g(this.f3420b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f3419a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0956a c0956a = this.f3420b;
                int iM2293e = c0956a.m2293e(obj);
                if (iM2293e < 0) {
                    return false;
                }
                c0956a.m2296h(iM2293e);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f3419a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM2291c = this.f3420b.m2291c();
                int size = mapM2291c.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapM2291c.remove(it.next());
                }
                return size != mapM2291c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f3419a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                Map mapM2291c = this.f3420b.m2291c();
                int size = mapM2291c.size();
                Iterator it = mapM2291c.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapM2291c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f3419a) {
        }
        return this.f3420b.m2292d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f3419a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f3420b.m2298k(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f3419a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                C0956a c0956a = this.f3420b;
                int iM2292d = c0956a.m2292d();
                Object[] objArr = new Object[iM2292d];
                for (int i2 = 0; i2 < iM2292d; i2++) {
                    objArr[i2] = c0956a.m2290b(i2, 0);
                }
                return objArr;
        }
    }
}
