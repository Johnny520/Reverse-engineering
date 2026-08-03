package p000a;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: a.Z9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0461Z9<K, V> {

    /* JADX INFO: renamed from: a */
    public AbstractC0461Z9<K, V>.b f1731a;

    /* JADX INFO: renamed from: b */
    public AbstractC0461Z9<K, V>.c f1732b;

    /* JADX INFO: renamed from: c */
    public AbstractC0461Z9<K, V>.e f1733c;

    /* JADX INFO: renamed from: a.Z9$a */
    public final class a<T> implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        public final int f1734a;

        /* JADX INFO: renamed from: b */
        public int f1735b;

        /* JADX INFO: renamed from: c */
        public int f1736c;

        /* JADX INFO: renamed from: d */
        public boolean f1737d = false;

        public a(int i) {
            this.f1734a = i;
            this.f1735b = AbstractC0461Z9.this.mo413d();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1736c < this.f1735b;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC0461Z9.this.mo411b(this.f1736c, this.f1734a);
            this.f1736c++;
            this.f1737d = true;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f1737d) {
                throw new IllegalStateException();
            }
            int i = this.f1736c - 1;
            this.f1736c = i;
            this.f1735b--;
            this.f1737d = false;
            AbstractC0461Z9.this.mo417h(i);
        }
    }

    /* JADX INFO: renamed from: a.Z9$b */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            int iMo413d = abstractC0461Z9.mo413d();
            for (Map.Entry<K, V> entry : collection) {
                abstractC0461Z9.mo416g(entry.getKey(), entry.getValue());
            }
            return iMo413d != abstractC0461Z9.mo413d();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC0461Z9.this.mo410a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
                int iMo414e = abstractC0461Z9.mo414e(key);
                if (iMo414e >= 0) {
                    Object objMo411b = abstractC0461Z9.mo411b(iMo414e, 1);
                    Object value = entry.getValue();
                    return objMo411b == value || (objMo411b != null && objMo411b.equals(value));
                }
            }
            return false;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC0461Z9.m1118j(obj, this);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            int iHashCode = 0;
            for (int iMo413d = abstractC0461Z9.mo413d() - 1; iMo413d >= 0; iMo413d--) {
                Object objMo411b = abstractC0461Z9.mo411b(iMo413d, 0);
                Object objMo411b2 = abstractC0461Z9.mo411b(iMo413d, 1);
                iHashCode += (objMo411b == null ? 0 : objMo411b.hashCode()) ^ (objMo411b2 == null ? 0 : objMo411b2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC0461Z9.this.mo413d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC0461Z9.this.mo413d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: a.Z9$c */
    public final class c implements Set<K> {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public final void clear() {
            AbstractC0461Z9.this.mo410a();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC0461Z9.this.mo414e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Map<K, V> mapMo412c = AbstractC0461Z9.this.mo412c();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!mapMo412c.containsKey(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean equals(Object obj) {
            return AbstractC0461Z9.m1118j(obj, this);
        }

        @Override // java.util.Set, java.util.Collection
        public final int hashCode() {
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            int iHashCode = 0;
            for (int iMo413d = abstractC0461Z9.mo413d() - 1; iMo413d >= 0; iMo413d--) {
                Object objMo411b = abstractC0461Z9.mo411b(iMo413d, 0);
                iHashCode += objMo411b == null ? 0 : objMo411b.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean isEmpty() {
            return AbstractC0461Z9.this.mo413d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public final Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean remove(Object obj) {
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            int iMo414e = abstractC0461Z9.mo414e(obj);
            if (iMo414e < 0) {
                return false;
            }
            abstractC0461Z9.mo417h(iMo414e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            Map<K, V> mapMo412c = AbstractC0461Z9.this.mo412c();
            int size = mapMo412c.size();
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                mapMo412c.remove(it.next());
            }
            return size != mapMo412c.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            Map<K, V> mapMo412c = AbstractC0461Z9.this.mo412c();
            int size = mapMo412c.size();
            Iterator<K> it = mapMo412c.keySet().iterator();
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                }
            }
            return size != mapMo412c.size();
        }

        @Override // java.util.Set, java.util.Collection
        public final int size() {
            return AbstractC0461Z9.this.mo413d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Set, java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0461Z9.this.m1119k(0, tArr);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.Set, java.util.Collection
        public final Object[] toArray() {
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            int iMo413d = abstractC0461Z9.mo413d();
            Object[] objArr = new Object[iMo413d];
            for (int i = 0; i < iMo413d; i++) {
                objArr[i] = abstractC0461Z9.mo411b(i, 0);
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: a.Z9$d */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: a */
        public int f1741a;

        /* JADX INFO: renamed from: c */
        public boolean f1743c = false;

        /* JADX INFO: renamed from: b */
        public int f1742b = -1;

        public d() {
            this.f1741a = AbstractC0461Z9.this.mo413d() - 1;
        }

        @Override // java.util.Map.Entry
        public final boolean equals(Object obj) {
            if (!this.f1743c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.f1742b;
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            Object objMo411b = abstractC0461Z9.mo411b(i, 0);
            if (key != objMo411b && (key == null || !key.equals(objMo411b))) {
                return false;
            }
            Object value = entry.getValue();
            Object objMo411b2 = abstractC0461Z9.mo411b(this.f1742b, 1);
            return value == objMo411b2 || (value != null && value.equals(objMo411b2));
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            if (!this.f1743c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (K) AbstractC0461Z9.this.mo411b(this.f1742b, 0);
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
            if (!this.f1743c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            return (V) AbstractC0461Z9.this.mo411b(this.f1742b, 1);
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f1742b < this.f1741a;
        }

        @Override // java.util.Map.Entry
        public final int hashCode() {
            if (!this.f1743c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            int i = this.f1742b;
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            Object objMo411b = abstractC0461Z9.mo411b(i, 0);
            Object objMo411b2 = abstractC0461Z9.mo411b(this.f1742b, 1);
            return (objMo411b == null ? 0 : objMo411b.hashCode()) ^ (objMo411b2 != null ? objMo411b2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public final Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1742b++;
            this.f1743c = true;
            return this;
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (!this.f1743c) {
                throw new IllegalStateException();
            }
            AbstractC0461Z9.this.mo417h(this.f1742b);
            this.f1742b--;
            this.f1741a--;
            this.f1743c = false;
        }

        @Override // java.util.Map.Entry
        public final V setValue(V v) {
            if (this.f1743c) {
                return (V) AbstractC0461Z9.this.mo418i(this.f1742b, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: j */
    public static boolean m1118j(Object obj, Set set) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() == set2.size()) {
                return set.containsAll(set2);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo410a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo411b(int i, int i2);

    /* JADX INFO: renamed from: c */
    public abstract Map<K, V> mo412c();

    /* JADX INFO: renamed from: d */
    public abstract int mo413d();

    /* JADX INFO: renamed from: e */
    public abstract int mo414e(Object obj);

    /* JADX INFO: renamed from: f */
    public abstract int mo415f(Object obj);

    /* JADX INFO: renamed from: g */
    public abstract void mo416g(K k, V v);

    /* JADX INFO: renamed from: h */
    public abstract void mo417h(int i);

    /* JADX INFO: renamed from: i */
    public abstract V mo418i(int i, V v);

    /* JADX INFO: renamed from: k */
    public final Object[] m1119k(int i, Object[] objArr) {
        int iMo413d = mo413d();
        if (objArr.length < iMo413d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iMo413d);
        }
        for (int i2 = 0; i2 < iMo413d; i2++) {
            objArr[i2] = mo411b(i2, i);
        }
        if (objArr.length > iMo413d) {
            objArr[iMo413d] = null;
        }
        return objArr;
    }

    /* JADX INFO: renamed from: a.Z9$e */
    public final class e implements Collection<V> {
        public e() {
        }

        @Override // java.util.Collection
        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public final void clear() {
            AbstractC0461Z9.this.mo410a();
        }

        @Override // java.util.Collection
        public final boolean contains(Object obj) {
            return AbstractC0461Z9.this.mo415f(obj) >= 0;
        }

        @Override // java.util.Collection
        public final boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public final boolean isEmpty() {
            return AbstractC0461Z9.this.mo413d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public final Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            int iMo415f = abstractC0461Z9.mo415f(obj);
            if (iMo415f < 0) {
                return false;
            }
            abstractC0461Z9.mo417h(iMo415f);
            return true;
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection<?> collection) {
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            int iMo413d = abstractC0461Z9.mo413d();
            int i = 0;
            boolean z = false;
            while (i < iMo413d) {
                if (collection.contains(abstractC0461Z9.mo411b(i, 1))) {
                    abstractC0461Z9.mo417h(i);
                    i--;
                    iMo413d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection<?> collection) {
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            int iMo413d = abstractC0461Z9.mo413d();
            int i = 0;
            boolean z = false;
            while (i < iMo413d) {
                if (!collection.contains(abstractC0461Z9.mo411b(i, 1))) {
                    abstractC0461Z9.mo417h(i);
                    i--;
                    iMo413d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public final int size() {
            return AbstractC0461Z9.this.mo413d();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Collection
        public final Object[] toArray() {
            AbstractC0461Z9 abstractC0461Z9 = AbstractC0461Z9.this;
            int iMo413d = abstractC0461Z9.mo413d();
            Object[] objArr = new Object[iMo413d];
            for (int i = 0; i < iMo413d; i++) {
                objArr[i] = abstractC0461Z9.mo411b(i, 1);
            }
            return objArr;
        }

        @Override // java.util.Collection
        public final <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC0461Z9.this.m1119k(1, tArr);
        }
    }
}
