package p117i;

import bsh.C1189h4;
import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p132j.AbstractC3489a;
import p376zd.C10010p0;

/* JADX INFO: renamed from: i.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3036a extends C3059h1 implements Map {

    /* JADX INFO: renamed from: t */
    public a f8052t;

    /* JADX INFO: renamed from: u */
    public c f8053u;

    /* JADX INFO: renamed from: v */
    public e f8054v;

    /* JADX INFO: renamed from: i.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a extends AbstractSet {
        public a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return C3036a.this.new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C3036a.this.size();
        }
    }

    /* JADX INFO: renamed from: i.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class b extends AbstractC3060i {
        public b() {
            super(C3036a.this.size());
        }

        @Override // p117i.AbstractC3060i
        /* JADX INFO: renamed from: g */
        public Object mo11217g(int i10) {
            return C3036a.this.m11332g(i10);
        }

        @Override // p117i.AbstractC3060i
        /* JADX INFO: renamed from: l */
        public void mo11218l(int i10) {
            C3036a.this.m11333i(i10);
        }
    }

    /* JADX INFO: renamed from: i.a$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: q */
        public int f8058q;

        /* JADX INFO: renamed from: r */
        public int f8059r = -1;

        /* JADX INFO: renamed from: s */
        public boolean f8060s;

        public d() {
            this.f8058q = C3036a.this.size() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                C1189h4.m4429a();
                return null;
            }
            this.f8059r++;
            this.f8060s = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f8060s) {
                C10010p0.m38820a("This container does not support retaining Map.Entry objects");
                return false;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC3489a.m13006c(entry.getKey(), C3036a.this.m11332g(this.f8059r)) && AbstractC3489a.m13006c(entry.getValue(), C3036a.this.m11335k(this.f8059r));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f8060s) {
                return C3036a.this.m11332g(this.f8059r);
            }
            C10010p0.m38820a("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f8060s) {
                return C3036a.this.m11335k(this.f8059r);
            }
            C10010p0.m38820a("This container does not support retaining Map.Entry objects");
            return null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8059r < this.f8058q;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f8060s) {
                C10010p0.m38820a("This container does not support retaining Map.Entry objects");
                return 0;
            }
            Object objM11332g = C3036a.this.m11332g(this.f8059r);
            Object objM11335k = C3036a.this.m11335k(this.f8059r);
            return (objM11332g == null ? 0 : objM11332g.hashCode()) ^ (objM11335k != null ? objM11335k.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f8060s) {
                throw new IllegalStateException();
            }
            C3036a.this.m11333i(this.f8059r);
            this.f8059r--;
            this.f8058q--;
            this.f8060s = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f8060s) {
                return C3036a.this.m11334j(this.f8059r, obj);
            }
            C10010p0.m38820a("This container does not support retaining Map.Entry objects");
            return null;
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: i.a$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class f extends AbstractC3060i {
        public f() {
            super(C3036a.this.size());
        }

        @Override // p117i.AbstractC3060i
        /* JADX INFO: renamed from: g */
        public Object mo11217g(int i10) {
            return C3036a.this.m11335k(i10);
        }

        @Override // p117i.AbstractC3060i
        /* JADX INFO: renamed from: l */
        public void mo11218l(int i10) {
            C3036a.this.m11333i(i10);
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m11213m(Set set, Object obj) {
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
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // p117i.C3059h1, java.util.Map
    public boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // p117i.C3059h1, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public Set entrySet() {
        a aVar = this.f8052t;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f8052t = aVar2;
        return aVar2;
    }

    @Override // p117i.C3059h1, java.util.Map
    public Object get(Object obj) {
        return super.get(obj);
    }

    @Override // java.util.Map
    public Set keySet() {
        c cVar = this.f8053u;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        this.f8053u = cVar2;
        return cVar2;
    }

    /* JADX INFO: renamed from: l */
    public boolean m11214l(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public boolean m11215n(Collection collection) {
        int size = size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != size();
    }

    /* JADX INFO: renamed from: o */
    public boolean m11216o(Collection collection) {
        int size = size();
        for (int size2 = size() - 1; size2 >= 0; size2--) {
            if (!collection.contains(m11332g(size2))) {
                m11333i(size2);
            }
        }
        return size != size();
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        m11328b(size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // p117i.C3059h1, java.util.Map
    public Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map
    public Collection values() {
        e eVar = this.f8054v;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e();
        this.f8054v = eVar2;
        return eVar2;
    }

    /* JADX INFO: renamed from: i.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            C3036a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return C3036a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return C3036a.this.m11214l(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return C3036a.m11213m(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int size = C3036a.this.size() - 1; size >= 0; size--) {
                Object objM11332g = C3036a.this.m11332g(size);
                iHashCode += objM11332g == null ? 0 : objM11332g.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return C3036a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C3036a.this.new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iM11330e = C3036a.this.m11330e(obj);
            if (iM11330e < 0) {
                return false;
            }
            C3036a.this.m11333i(iM11330e);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return C3036a.this.m11215n(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return C3036a.this.m11216o(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return C3036a.this.size();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C3036a.this.m11332g(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            int size = C3036a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C3036a.this.m11332g(i10);
            }
            return objArr;
        }
    }

    /* JADX INFO: renamed from: i.a$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            C3036a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return C3036a.this.m11327a(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return C3036a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return C3036a.this.new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iM11327a = C3036a.this.m11327a(obj);
            if (iM11327a < 0) {
                return false;
            }
            C3036a.this.m11333i(iM11327a);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int size = C3036a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (collection.contains(C3036a.this.m11335k(i10))) {
                    C3036a.this.m11333i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int size = C3036a.this.size();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < size) {
                if (!collection.contains(C3036a.this.m11335k(i10))) {
                    C3036a.this.m11333i(i10);
                    i10--;
                    size--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        @Override // java.util.Collection
        public int size() {
            return C3036a.this.size();
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            int size = size();
            if (objArr.length < size) {
                objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
            }
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C3036a.this.m11335k(i10);
            }
            if (objArr.length > size) {
                objArr[size] = null;
            }
            return objArr;
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            int size = C3036a.this.size();
            Object[] objArr = new Object[size];
            for (int i10 = 0; i10 < size; i10++) {
                objArr[i10] = C3036a.this.m11335k(i10);
            }
            return objArr;
        }
    }
}
