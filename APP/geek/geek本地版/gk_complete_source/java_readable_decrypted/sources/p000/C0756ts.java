package p000;

import com.github.megatronking.stringfog.Base64;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ts */
/* JADX INFO: loaded from: classes.dex */
public final class C0756ts implements Set {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0474m6 f4615b;

    public /* synthetic */ C0756ts(C0474m6 c0474m6, int i) {
        this.f4614a = i;
        this.f4615b = c0474m6;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                C0474m6 c0474m6 = this.f4615b;
                int iM1789d = c0474m6.m1789d();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    switch (c0474m6.f3149d) {
                        case Base64.DEFAULT /* 0 */:
                            ((C0511n6) c0474m6.f3150e).put(key, value);
                            break;
                        default:
                            ((C0623q6) c0474m6.f3150e).add(key);
                            break;
                    }
                }
                return iM1789d != c0474m6.m1789d();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                this.f4615b.m1786a();
                break;
            default:
                this.f4615b.m1786a();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                C0474m6 c0474m6 = this.f4615b;
                int iM1790e = c0474m6.m1790e(key);
                if (iM1790e < 0) {
                    return false;
                }
                Object objM1787b = c0474m6.m1787b(iM1790e, 1);
                Object value = entry.getValue();
                return objM1787b == value || (objM1787b != null && objM1787b.equals(value));
            default:
                return this.f4615b.m1790e(obj) >= 0;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                Map mapM1788c = this.f4615b.m1788c();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!mapM1788c.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f4614a) {
        }
        return C0474m6.m1785h(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                C0474m6 c0474m6 = this.f4615b;
                int iHashCode = 0;
                for (int iM1789d = c0474m6.m1789d() - 1; iM1789d >= 0; iM1789d--) {
                    Object objM1787b = c0474m6.m1787b(iM1789d, 0);
                    Object objM1787b2 = c0474m6.m1787b(iM1789d, 1);
                    iHashCode += (objM1787b == null ? 0 : objM1787b.hashCode()) ^ (objM1787b2 == null ? 0 : objM1787b2.hashCode());
                }
                return iHashCode;
            default:
                C0474m6 c0474m62 = this.f4615b;
                int iHashCode2 = 0;
                for (int iM1789d2 = c0474m62.m1789d() - 1; iM1789d2 >= 0; iM1789d2--) {
                    Object objM1787b3 = c0474m62.m1787b(iM1789d2, 0);
                    iHashCode2 += objM1787b3 == null ? 0 : objM1787b3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                if (this.f4615b.m1789d() == 0) {
                }
                break;
            default:
                if (this.f4615b.m1789d() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                return new C0793us(this.f4615b);
            default:
                return new C0719ss(this.f4615b, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                C0474m6 c0474m6 = this.f4615b;
                int iM1790e = c0474m6.m1790e(obj);
                if (iM1790e < 0) {
                    return false;
                }
                c0474m6.m1792g(iM1790e);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Map mapM1788c = this.f4615b.m1788c();
                int size = mapM1788c.size();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mapM1788c.remove(it.next());
                }
                return size != mapM1788c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                Map mapM1788c = this.f4615b.m1788c();
                int size = mapM1788c.size();
                Iterator it = mapM1788c.keySet().iterator();
                while (it.hasNext()) {
                    if (!collection.contains(it.next())) {
                        it.remove();
                    }
                }
                return size != mapM1788c.size();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f4614a) {
        }
        return this.f4615b.m1789d();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                return this.f4615b.m1793i(objArr, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f4614a) {
            case Base64.DEFAULT /* 0 */:
                throw new UnsupportedOperationException();
            default:
                C0474m6 c0474m6 = this.f4615b;
                int iM1789d = c0474m6.m1789d();
                Object[] objArr = new Object[iM1789d];
                for (int i = 0; i < iM1789d; i++) {
                    objArr[i] = c0474m6.m1787b(i, 0);
                }
                return objArr;
        }
    }
}
