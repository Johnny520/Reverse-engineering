package p349y0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1403d;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5114x;
import p215oc.C5706c;

/* JADX INFO: renamed from: y0.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C9508c implements RandomAccess {

    /* JADX INFO: renamed from: t */
    public static final int f32298t = 8;

    /* JADX INFO: renamed from: q */
    public Object[] f32299q;

    /* JADX INFO: renamed from: r */
    public List f32300r;

    /* JADX INFO: renamed from: s */
    public int f32301s;

    /* JADX INFO: renamed from: y0.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements ListIterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final List f32306q;

        /* JADX INFO: renamed from: r */
        public int f32307r;

        public c(List list, int i10) {
            this.f32306q = list;
            this.f32307r = i10;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f32306q.add(this.f32307r, obj);
            this.f32307r++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f32307r < this.f32306q.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f32307r > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f32306q;
            int i10 = this.f32307r;
            this.f32307r = i10 + 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f32307r;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f32307r - 1;
            this.f32307r = i10;
            return this.f32306q.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f32307r - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i10 = this.f32307r - 1;
            this.f32307r = i10;
            this.f32306q.remove(i10);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f32306q.set(this.f32307r, obj);
        }
    }

    public C9508c(Object[] objArr, int i10) {
        this.f32299q = objArr;
        this.f32301s = i10;
    }

    /* JADX INFO: renamed from: a */
    public final void m37028a(int i10, Object obj) {
        int i11 = this.f32301s + 1;
        if (this.f32299q.length < i11) {
            m37047t(i11);
        }
        Object[] objArr = this.f32299q;
        int i12 = this.f32301s;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + 1, i12 - i10);
        }
        objArr[i10] = obj;
        this.f32301s++;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m37029b(Object obj) {
        int i10 = this.f32301s + 1;
        if (this.f32299q.length < i10) {
            m37047t(i10);
        }
        Object[] objArr = this.f32299q;
        int i11 = this.f32301s;
        objArr[i11] = obj;
        this.f32301s = i11 + 1;
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m37030c(int i10, Collection collection) {
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i12 = this.f32301s + size;
        if (this.f32299q.length < i12) {
            m37047t(i12);
        }
        Object[] objArr = this.f32299q;
        int i13 = this.f32301s;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i13 - i10);
        }
        for (Object obj : collection) {
            int i14 = i11 + 1;
            if (i11 < 0) {
                AbstractC5114x.m20810y();
            }
            objArr[i11 + i10] = obj;
            i11 = i14;
        }
        this.f32301s += size;
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m37031d(int i10, List list) {
        if (list.isEmpty()) {
            return false;
        }
        int size = list.size();
        int i11 = this.f32301s + size;
        if (this.f32299q.length < i11) {
            m37047t(i11);
        }
        Object[] objArr = this.f32299q;
        int i12 = this.f32301s;
        if (i10 != i12) {
            System.arraycopy(objArr, i10, objArr, i10 + size, i12 - i10);
        }
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            objArr[i10 + i13] = list.get(i13);
        }
        this.f32301s += size;
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m37032e(int i10, C9508c c9508c) {
        int i11 = c9508c.f32301s;
        if (i11 == 0) {
            return false;
        }
        int i12 = this.f32301s + i11;
        if (this.f32299q.length < i12) {
            m37047t(i12);
        }
        Object[] objArr = this.f32299q;
        int i13 = this.f32301s;
        if (i10 != i13) {
            System.arraycopy(objArr, i10, objArr, i10 + i11, i13 - i10);
        }
        System.arraycopy(c9508c.f32299q, 0, objArr, i10, i11);
        this.f32301s += i11;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m37033f(Collection collection) {
        return m37030c(this.f32301s, collection);
    }

    /* JADX INFO: renamed from: g */
    public final List m37034g() {
        List list = this.f32300r;
        if (list != null) {
            return list;
        }
        a aVar = new a(this);
        this.f32300r = aVar;
        return aVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m37035h() {
        Object[] objArr = this.f32299q;
        int i10 = this.f32301s;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f32301s = 0;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m37036i(Object obj) {
        int iM37039l = m37039l() - 1;
        if (iM37039l >= 0) {
            for (int i10 = 0; !AbstractC1061t.m3842c(this.f32299q[i10], obj); i10++) {
                if (i10 != iM37039l) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m37037j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m37036i(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final Object m37038k() {
        if (m37039l() != 0) {
            return this.f32299q[0];
        }
        m37052y("MutableVector is empty.");
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final int m37039l() {
        return this.f32301s;
    }

    /* JADX INFO: renamed from: m */
    public final int m37040m(Object obj) {
        Object[] objArr = this.f32299q;
        int i10 = this.f32301s;
        for (int i11 = 0; i11 < i10; i11++) {
            if (AbstractC1061t.m3842c(obj, objArr[i11])) {
                return i11;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: n */
    public final Object m37041n() {
        if (m37039l() != 0) {
            return this.f32299q[m37039l() - 1];
        }
        m37052y("MutableVector is empty.");
        C5706c.m23089a();
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final int m37042o(Object obj) {
        Object[] objArr = this.f32299q;
        for (int i10 = this.f32301s - 1; i10 >= 0; i10--) {
            if (AbstractC1061t.m3842c(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m37043p(Object obj) {
        int iM37040m = m37040m(obj);
        if (iM37040m < 0) {
            return false;
        }
        m37045r(iM37040m);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m37044q(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int i10 = this.f32301s;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m37043p(it.next());
        }
        return i10 != this.f32301s;
    }

    /* JADX INFO: renamed from: r */
    public final Object m37045r(int i10) {
        Object[] objArr = this.f32299q;
        Object obj = objArr[i10];
        if (i10 != m37039l() - 1) {
            int i11 = i10 + 1;
            System.arraycopy(objArr, i11, objArr, i10, this.f32301s - i11);
        }
        int i12 = this.f32301s - 1;
        this.f32301s = i12;
        objArr[i12] = null;
        return obj;
    }

    /* JADX INFO: renamed from: s */
    public final void m37046s(int i10, int i11) {
        if (i11 > i10) {
            int i12 = this.f32301s;
            if (i11 < i12) {
                Object[] objArr = this.f32299q;
                System.arraycopy(objArr, i11, objArr, i10, i12 - i11);
            }
            int i13 = this.f32301s - (i11 - i10);
            int iM37039l = m37039l() - 1;
            if (i13 <= iM37039l) {
                int i14 = i13;
                while (true) {
                    this.f32299q[i14] = null;
                    if (i14 == iM37039l) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
            this.f32301s = i13;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m37047t(int i10) {
        Object[] objArr = this.f32299q;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i10, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f32299q = objArr2;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m37048u(Collection collection) {
        int i10 = this.f32301s;
        for (int iM37039l = m37039l() - 1; -1 < iM37039l; iM37039l--) {
            if (!collection.contains(this.f32299q[iM37039l])) {
                m37045r(iM37039l);
            }
        }
        return i10 != this.f32301s;
    }

    /* JADX INFO: renamed from: v */
    public final Object m37049v(int i10, Object obj) {
        Object[] objArr = this.f32299q;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: w */
    public final void m37050w(int i10) {
        this.f32301s = i10;
    }

    /* JADX INFO: renamed from: x */
    public final void m37051x(Comparator comparator) {
        AbstractC5102r.m20650J(this.f32299q, comparator, 0, this.f32301s);
    }

    /* JADX INFO: renamed from: y */
    public final Void m37052y(String str) {
        throw new NoSuchElementException(str);
    }

    /* JADX INFO: renamed from: y0.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements List, InterfaceC1403d {

        /* JADX INFO: renamed from: q */
        public final C9508c f32302q;

        public a(C9508c c9508c) {
            this.f32302q = c9508c;
        }

        /* JADX INFO: renamed from: a */
        public int m37053a() {
            return this.f32302q.m37039l();
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f32302q.m37029b(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            return this.f32302q.m37030c(i10, collection);
        }

        /* JADX INFO: renamed from: c */
        public Object m37054c(int i10) {
            AbstractC9509d.m37057a(this, i10);
            return this.f32302q.m37045r(i10);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f32302q.m37035h();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f32302q.m37036i(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            return this.f32302q.m37037j(collection);
        }

        @Override // java.util.List
        public Object get(int i10) {
            AbstractC9509d.m37057a(this, i10);
            return this.f32302q.f32299q[i10];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f32302q.m37040m(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f32302q.m37039l() == 0;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f32302q.m37042o(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f32302q.m37043p(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            return this.f32302q.m37044q(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            return this.f32302q.m37048u(collection);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            AbstractC9509d.m37057a(this, i10);
            return this.f32302q.m37049v(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m37053a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            AbstractC9509d.m37058b(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1041j.m3803a(this);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC1041j.m3804b(this, objArr);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f32302q.m37028a(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            return this.f32302q.m37033f(collection);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return m37054c(i10);
        }
    }

    /* JADX INFO: renamed from: y0.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements List, InterfaceC1403d {

        /* JADX INFO: renamed from: q */
        public final List f32303q;

        /* JADX INFO: renamed from: r */
        public final int f32304r;

        /* JADX INFO: renamed from: s */
        public int f32305s;

        public b(List list, int i10, int i11) {
            this.f32303q = list;
            this.f32304r = i10;
            this.f32305s = i11;
        }

        /* JADX INFO: renamed from: a */
        public int m37055a() {
            return this.f32305s - this.f32304r;
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f32303q.add(i10 + this.f32304r, obj);
            this.f32305s++;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            this.f32303q.addAll(i10 + this.f32304r, collection);
            int size = collection.size();
            this.f32305s += size;
            return size > 0;
        }

        /* JADX INFO: renamed from: c */
        public Object m37056c(int i10) {
            AbstractC9509d.m37057a(this, i10);
            this.f32305s--;
            return this.f32303q.remove(i10 + this.f32304r);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f32305s - 1;
            int i11 = this.f32304r;
            if (i11 <= i10) {
                while (true) {
                    this.f32303q.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f32305s = this.f32304r;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f32305s;
            for (int i11 = this.f32304r; i11 < i10; i11++) {
                if (AbstractC1061t.m3842c(this.f32303q.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i10) {
            AbstractC9509d.m37057a(this, i10);
            return this.f32303q.get(i10 + this.f32304r);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f32305s;
            for (int i11 = this.f32304r; i11 < i10; i11++) {
                if (AbstractC1061t.m3842c(this.f32303q.get(i11), obj)) {
                    return i11 - this.f32304r;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f32305s == this.f32304r;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f32305s - 1;
            int i11 = this.f32304r;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC1061t.m3842c(this.f32303q.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f32304r;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new c(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f32305s;
            for (int i11 = this.f32304r; i11 < i10; i11++) {
                if (AbstractC1061t.m3842c(this.f32303q.get(i11), obj)) {
                    this.f32303q.remove(i11);
                    this.f32305s--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            int i10 = this.f32305s;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f32305s;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            int i10 = this.f32305s;
            int i11 = i10 - 1;
            int i12 = this.f32304r;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f32303q.get(i11))) {
                        this.f32303q.remove(i11);
                        this.f32305s--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f32305s;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            AbstractC9509d.m37057a(this, i10);
            return this.f32303q.set(i10 + this.f32304r, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m37055a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            AbstractC9509d.m37058b(this, i10, i11);
            return new b(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1041j.m3803a(this);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC1041j.m3804b(this, objArr);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new c(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f32303q;
            int i10 = this.f32305s;
            this.f32305s = i10 + 1;
            list.add(i10, obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            this.f32303q.addAll(this.f32305s, collection);
            int size = collection.size();
            this.f32305s += size;
            return size > 0;
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return m37056c(i10);
        }
    }
}
