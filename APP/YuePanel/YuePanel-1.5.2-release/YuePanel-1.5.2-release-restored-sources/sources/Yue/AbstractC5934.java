package Yue;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5934<K, V> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6490
    public AbstractC5934<K, V>.C0906 f1787;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6490
    public AbstractC5934<K, V>.C5935 f1788;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6490
    public AbstractC5934<K, V>.C5937 f14877;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ */
    public final class C0905<T> implements Iterator<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final int f14878;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f14879;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f14880;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public boolean f14881 = false;

        public C0905(int i) {
            this.f14878 = i;
            this.f14879 = AbstractC5934.this.mo7004();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14880 < this.f14879;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC5934.this.mo481(this.f14880, this.f14878);
            this.f14880++;
            this.f14881 = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f14881) {
                throw new IllegalStateException();
            }
            int i = this.f14880 - 1;
            this.f14880 = i;
            this.f14879--;
            this.f14881 = false;
            AbstractC5934.this.mo7008(i);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ۟ */
    public final class C0906 implements Set<Map.Entry<K, V>> {
        public C0906() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iMo7004 = AbstractC5934.this.mo7004();
            for (Map.Entry<K, V> entry : collection) {
                AbstractC5934.this.mo7007(entry.getKey(), entry.getValue());
            }
            return iMo7004 != AbstractC5934.this.mo7004();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC5934.this.mo480();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iMo7005 = AbstractC5934.this.mo7005(entry.getKey());
            if (iMo7005 < 0) {
                return false;
            }
            return C4146.m12009(AbstractC5934.this.mo481(iMo7005, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC5934.m18550(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo7004 = AbstractC5934.this.mo7004() - 1; iMo7004 >= 0; iMo7004--) {
                Object objMo481 = AbstractC5934.this.mo481(iMo7004, 0);
                Object objMo4812 = AbstractC5934.this.mo481(iMo7004, 1);
                iHashCode += (objMo481 == null ? 0 : objMo481.hashCode()) ^ (objMo4812 == null ? 0 : objMo4812.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC5934.this.mo7004() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new C5936();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC5934.this.mo7004();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Method merged with bridge method: add(Ljava/lang/Object;)Z */
        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ۟۟, reason: contains not printable characters */
    public final class C5935 implements Set<K> {
        public C5935() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC5934.this.mo480();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC5934.this.mo7005(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC5934.m18549(AbstractC5934.this.mo7003(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC5934.m18550(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo7004 = AbstractC5934.this.mo7004() - 1; iMo7004 >= 0; iMo7004--) {
                Object objMo481 = AbstractC5934.this.mo481(iMo7004, 0);
                iHashCode += objMo481 == null ? 0 : objMo481.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC5934.this.mo7004() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new C0905(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo7005 = AbstractC5934.this.mo7005(obj);
            if (iMo7005 < 0) {
                return false;
            }
            AbstractC5934.this.mo7008(iMo7005);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC5934.m18551(AbstractC5934.this.mo7003(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC5934.m18552(AbstractC5934.this.mo7003(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC5934.this.mo7004();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC5934.this.m18556(0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC5934.this.m18557(tArr, 0);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ۟۟۟, reason: contains not printable characters */
    public final class C5936 implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f14885;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f14887 = false;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f14886 = -1;

        public C5936() {
            this.f14885 = AbstractC5934.this.mo7004() - 1;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f14887) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return C4146.m12009(entry.getKey(), AbstractC5934.this.mo481(this.f14886, 0)) && C4146.m12009(entry.getValue(), AbstractC5934.this.mo481(this.f14886, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f14887) {
                return (K) AbstractC5934.this.mo481(this.f14886, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f14887) {
                return (V) AbstractC5934.this.mo481(this.f14886, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14886 < this.f14885;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f14887) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objMo481 = AbstractC5934.this.mo481(this.f14886, 0);
            Object objMo4812 = AbstractC5934.this.mo481(this.f14886, 1);
            return (objMo481 == null ? 0 : objMo481.hashCode()) ^ (objMo4812 != null ? objMo4812.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f14887) {
                throw new IllegalStateException();
            }
            AbstractC5934.this.mo7008(this.f14886);
            this.f14886--;
            this.f14885--;
            this.f14887 = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            if (this.f14887) {
                return (V) AbstractC5934.this.mo7009(this.f14886, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f14886++;
            this.f14887 = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۧۡ$ۥ۟۟۟۟, reason: contains not printable characters */
    public final class C5937 implements Collection<V> {
        public C5937() {
        }

        @Override // java.util.Collection
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC5934.this.mo480();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC5934.this.mo7006(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC5934.this.mo7004() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new C0905(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iMo7006 = AbstractC5934.this.mo7006(obj);
            if (iMo7006 < 0) {
                return false;
            }
            AbstractC5934.this.mo7008(iMo7006);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int iMo7004 = AbstractC5934.this.mo7004();
            int i = 0;
            boolean z = false;
            while (i < iMo7004) {
                if (collection.contains(AbstractC5934.this.mo481(i, 1))) {
                    AbstractC5934.this.mo7008(i);
                    i--;
                    iMo7004--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int iMo7004 = AbstractC5934.this.mo7004();
            int i = 0;
            boolean z = false;
            while (i < iMo7004) {
                if (!collection.contains(AbstractC5934.this.mo481(i, 1))) {
                    AbstractC5934.this.mo7008(i);
                    i--;
                    iMo7004--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC5934.this.mo7004();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC5934.this.m18556(1);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC5934.this.m18557(tArr, 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static <K, V> boolean m18549(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static <T> boolean m18550(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static <K, V> boolean m18551(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static <K, V> boolean m18552(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: ۥ */
    public abstract void mo480();

    /* JADX INFO: renamed from: ۥ۟ */
    public abstract Object mo481(int i, int i2);

    /* JADX INFO: renamed from: ۥ۟۟ */
    public abstract Map<K, V> mo7003();

    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public abstract int mo7004();

    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract int mo7005(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public abstract int mo7006(Object obj);

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public abstract void mo7007(K k, V v);

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public abstract void mo7008(int i);

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public abstract V mo7009(int i, V v);

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public Set<Map.Entry<K, V>> m18553() {
        if (this.f1787 == null) {
            this.f1787 = new C0906();
        }
        return this.f1787;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public Set<K> m18554() {
        if (this.f1788 == null) {
            this.f1788 = new C5935();
        }
        return this.f1788;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public Collection<V> m18555() {
        if (this.f14877 == null) {
            this.f14877 = new C5937();
        }
        return this.f14877;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public Object[] m18556(int i) {
        int iMo7004 = mo7004();
        Object[] objArr = new Object[iMo7004];
        for (int i2 = 0; i2 < iMo7004; i2++) {
            objArr[i2] = mo481(i2, i);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public <T> T[] m18557(T[] tArr, int i) {
        int iMo7004 = mo7004();
        if (tArr.length < iMo7004) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo7004));
        }
        for (int i2 = 0; i2 < iMo7004; i2++) {
            tArr[i2] = mo481(i2, i);
        }
        if (tArr.length > iMo7004) {
            tArr[iMo7004] = null;
        }
        return tArr;
    }
}
