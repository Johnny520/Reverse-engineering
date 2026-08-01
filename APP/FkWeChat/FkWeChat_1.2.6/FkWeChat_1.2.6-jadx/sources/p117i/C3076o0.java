package p117i;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1403d;
import p132j.AbstractC3492d;
import p185m8.AbstractC5102r;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: i.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3076o0 extends AbstractC3092w0 {

    /* JADX INFO: renamed from: c */
    public b f8160c;

    /* JADX INFO: renamed from: i.o0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements ListIterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final List f8161q;

        /* JADX INFO: renamed from: r */
        public int f8162r;

        public a(List list, int i10) {
            list.getClass();
            this.f8161q = list;
            this.f8162r = i10 - 1;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            List list = this.f8161q;
            int i10 = this.f8162r + 1;
            this.f8162r = i10;
            list.add(i10, obj);
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f8162r < this.f8161q.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f8162r >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f8161q;
            int i10 = this.f8162r + 1;
            this.f8162r = i10;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f8162r + 1;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            List list = this.f8161q;
            int i10 = this.f8162r;
            this.f8162r = i10 - 1;
            return list.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f8162r;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f8161q.remove(this.f8162r);
            this.f8162r--;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f8161q.set(this.f8162r, obj);
        }
    }

    public /* synthetic */ C3076o0(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 16 : i10);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m11453A(Iterable iterable) {
        iterable.getClass();
        int i10 = this.f8236b;
        m11469v(iterable);
        return i10 != this.f8236b;
    }

    /* JADX INFO: renamed from: B */
    public final Object m11454B(int i10) {
        if (i10 < 0 || i10 >= this.f8236b) {
            m11593l(i10);
        }
        Object[] objArr = this.f8235a;
        Object obj = objArr[i10];
        int i11 = this.f8236b;
        if (i10 != i11 - 1) {
            AbstractC5102r.m20660l(objArr, objArr, i10, i10 + 1, i11);
        }
        int i12 = this.f8236b - 1;
        this.f8236b = i12;
        objArr[i12] = null;
        return obj;
    }

    /* JADX INFO: renamed from: C */
    public final void m11455C(int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > (i12 = this.f8236b) || i11 < 0 || i11 > i12) {
            AbstractC3492d.m13017c("Start (" + i10 + ") and end (" + i11 + ") must be in 0.." + this.f8236b);
        }
        if (i11 < i10) {
            AbstractC3492d.m13015a("Start (" + i10 + ") is more than end (" + i11 + ')');
        }
        if (i11 != i10) {
            int i13 = this.f8236b;
            if (i11 < i13) {
                Object[] objArr = this.f8235a;
                AbstractC5102r.m20660l(objArr, objArr, i10, i11, i13);
            }
            int i14 = this.f8236b;
            int i15 = i14 - (i11 - i10);
            AbstractC5102r.m20672x(this.f8235a, null, i15, i14);
            this.f8236b = i15;
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m11456D(int i10, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        this.f8235a = AbstractC5102r.m20660l(objArr, new Object[Math.max(i10, (length * 3) / 2)], 0, 0, length);
    }

    /* JADX INFO: renamed from: E */
    public final boolean m11457E(Collection collection) {
        collection.getClass();
        int i10 = this.f8236b;
        Object[] objArr = this.f8235a;
        for (int i11 = i10 - 1; -1 < i11; i11--) {
            if (!collection.contains(objArr[i11])) {
                m11454B(i11);
            }
        }
        return i10 != this.f8236b;
    }

    /* JADX INFO: renamed from: F */
    public final Object m11458F(int i10, Object obj) {
        if (i10 < 0 || i10 >= this.f8236b) {
            m11593l(i10);
        }
        Object[] objArr = this.f8235a;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: G */
    public final void m11459G(int i10) {
        AbstractC3492d.m13017c("Index " + i10 + " must be in 0.." + this.f8236b);
    }

    /* JADX INFO: renamed from: m */
    public final void m11460m(int i10, Object obj) {
        if (i10 < 0 || i10 > this.f8236b) {
            m11459G(i10);
        }
        int i11 = this.f8236b + 1;
        Object[] objArr = this.f8235a;
        if (objArr.length < i11) {
            m11456D(i11, objArr);
        }
        Object[] objArr2 = this.f8235a;
        int i12 = this.f8236b;
        if (i10 != i12) {
            AbstractC5102r.m20660l(objArr2, objArr2, i10 + 1, i10, i12);
        }
        objArr2[i10] = obj;
        this.f8236b++;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m11461n(Object obj) {
        int i10 = this.f8236b + 1;
        Object[] objArr = this.f8235a;
        if (objArr.length < i10) {
            m11456D(i10, objArr);
        }
        Object[] objArr2 = this.f8235a;
        int i11 = this.f8236b;
        objArr2[i11] = obj;
        this.f8236b = i11 + 1;
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m11462o(int i10, Collection collection) {
        collection.getClass();
        if (i10 < 0 || i10 > this.f8236b) {
            m11459G(i10);
        }
        int i11 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = this.f8236b + collection.size();
        Object[] objArr = this.f8235a;
        if (objArr.length < size) {
            m11456D(size, objArr);
        }
        Object[] objArr2 = this.f8235a;
        if (i10 != this.f8236b) {
            AbstractC5102r.m20660l(objArr2, objArr2, collection.size() + i10, i10, this.f8236b);
        }
        for (Object obj : collection) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                AbstractC5114x.m20810y();
            }
            objArr2[i11 + i10] = obj;
            i11 = i12;
        }
        this.f8236b += collection.size();
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m11463p(AbstractC3092w0 abstractC3092w0) {
        abstractC3092w0.getClass();
        int i10 = this.f8236b;
        m11470w(abstractC3092w0);
        return i10 != this.f8236b;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m11464q(Iterable iterable) {
        iterable.getClass();
        int i10 = this.f8236b;
        m11471x(iterable);
        return i10 != this.f8236b;
    }

    /* JADX INFO: renamed from: r */
    public final boolean m11465r(List list) {
        list.getClass();
        int i10 = this.f8236b;
        m11472y(list);
        return i10 != this.f8236b;
    }

    /* JADX INFO: renamed from: s */
    public List m11466s() {
        return m11467t();
    }

    /* JADX INFO: renamed from: t */
    public final List m11467t() {
        b bVar = this.f8160c;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f8160c = bVar2;
        return bVar2;
    }

    /* JADX INFO: renamed from: u */
    public final void m11468u() {
        AbstractC5102r.m20672x(this.f8235a, null, 0, this.f8236b);
        this.f8236b = 0;
    }

    /* JADX INFO: renamed from: v */
    public final void m11469v(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m11473z(it.next());
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m11470w(AbstractC3092w0 abstractC3092w0) {
        abstractC3092w0.getClass();
        if (abstractC3092w0.m11589g()) {
            return;
        }
        int i10 = this.f8236b + abstractC3092w0.f8236b;
        Object[] objArr = this.f8235a;
        if (objArr.length < i10) {
            m11456D(i10, objArr);
        }
        AbstractC5102r.m20660l(abstractC3092w0.f8235a, this.f8235a, this.f8236b, 0, abstractC3092w0.f8236b);
        this.f8236b += abstractC3092w0.f8236b;
    }

    /* JADX INFO: renamed from: x */
    public final void m11471x(Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            m11461n(it.next());
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m11472y(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        int i10 = this.f8236b;
        int size = list.size() + i10;
        Object[] objArr = this.f8235a;
        if (objArr.length < size) {
            m11456D(size, objArr);
        }
        Object[] objArr2 = this.f8235a;
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            objArr2[i11 + i10] = list.get(i11);
        }
        this.f8236b += list.size();
    }

    /* JADX INFO: renamed from: z */
    public final boolean m11473z(Object obj) {
        int iM11588f = m11588f(obj);
        if (iM11588f < 0) {
            return false;
        }
        m11454B(iM11588f);
        return true;
    }

    /* JADX INFO: renamed from: i.o0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements List, InterfaceC1403d {

        /* JADX INFO: renamed from: q */
        public final C3076o0 f8163q;

        public b(C3076o0 c3076o0) {
            c3076o0.getClass();
            this.f8163q = c3076o0;
        }

        /* JADX INFO: renamed from: a */
        public int m11474a() {
            return this.f8163q.m11587e();
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f8163q.m11461n(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            collection.getClass();
            return this.f8163q.m11464q(collection);
        }

        /* JADX INFO: renamed from: c */
        public Object m11475c(int i10) {
            AbstractC3094x0.m11602d(this, i10);
            return this.f8163q.m11454B(i10);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f8163q.m11468u();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f8163q.m11583a(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            collection.getClass();
            return this.f8163q.m11584b(collection);
        }

        @Override // java.util.List
        public Object get(int i10) {
            AbstractC3094x0.m11602d(this, i10);
            return this.f8163q.m11586d(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f8163q.m11588f(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f8163q.m11589g();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f8163q.m11592k(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f8163q.m11473z(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            collection.getClass();
            return this.f8163q.m11453A(collection);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            collection.getClass();
            return this.f8163q.m11457E(collection);
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            AbstractC3094x0.m11602d(this, i10);
            return this.f8163q.m11458F(i10, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m11474a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            AbstractC3094x0.m11603e(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            objArr.getClass();
            return AbstractC1041j.m3804b(this, objArr);
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f8163q.m11460m(i10, obj);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return m11475c(i10);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1041j.m3803a(this);
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            collection.getClass();
            return this.f8163q.m11462o(i10, collection);
        }
    }

    /* JADX INFO: renamed from: i.o0$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements List, InterfaceC1403d {

        /* JADX INFO: renamed from: q */
        public final List f8164q;

        /* JADX INFO: renamed from: r */
        public final int f8165r;

        /* JADX INFO: renamed from: s */
        public int f8166s;

        public c(List list, int i10, int i11) {
            list.getClass();
            this.f8164q = list;
            this.f8165r = i10;
            this.f8166s = i11;
        }

        /* JADX INFO: renamed from: a */
        public int m11476a() {
            return this.f8166s - this.f8165r;
        }

        @Override // java.util.List
        public void add(int i10, Object obj) {
            this.f8164q.add(i10 + this.f8165r, obj);
            this.f8166s++;
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection collection) {
            collection.getClass();
            this.f8164q.addAll(i10 + this.f8165r, collection);
            this.f8166s += collection.size();
            return collection.size() > 0;
        }

        /* JADX INFO: renamed from: c */
        public Object m11477c(int i10) {
            AbstractC3094x0.m11602d(this, i10);
            this.f8166s--;
            return this.f8164q.remove(i10 + this.f8165r);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i10 = this.f8166s - 1;
            int i11 = this.f8165r;
            if (i11 <= i10) {
                while (true) {
                    this.f8164q.remove(i10);
                    if (i10 == i11) {
                        break;
                    } else {
                        i10--;
                    }
                }
            }
            this.f8166s = this.f8165r;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i10 = this.f8166s;
            for (int i11 = this.f8165r; i11 < i10; i11++) {
                if (AbstractC1061t.m3842c(this.f8164q.get(i11), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection collection) {
            collection.getClass();
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
            AbstractC3094x0.m11602d(this, i10);
            return this.f8164q.get(i10 + this.f8165r);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i10 = this.f8166s;
            for (int i11 = this.f8165r; i11 < i10; i11++) {
                if (AbstractC1061t.m3842c(this.f8164q.get(i11), obj)) {
                    return i11 - this.f8165r;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f8166s == this.f8165r;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i10 = this.f8166s - 1;
            int i11 = this.f8165r;
            if (i11 > i10) {
                return -1;
            }
            while (!AbstractC1061t.m3842c(this.f8164q.get(i10), obj)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f8165r;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new a(this, 0);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i10 = this.f8166s;
            for (int i11 = this.f8165r; i11 < i10; i11++) {
                if (AbstractC1061t.m3842c(this.f8164q.get(i11), obj)) {
                    this.f8164q.remove(i11);
                    this.f8166s--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection collection) {
            collection.getClass();
            int i10 = this.f8166s;
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            return i10 != this.f8166s;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection collection) {
            collection.getClass();
            int i10 = this.f8166s;
            int i11 = i10 - 1;
            int i12 = this.f8165r;
            if (i12 <= i11) {
                while (true) {
                    if (!collection.contains(this.f8164q.get(i11))) {
                        this.f8164q.remove(i11);
                        this.f8166s--;
                    }
                    if (i11 == i12) {
                        break;
                    }
                    i11--;
                }
            }
            return i10 != this.f8166s;
        }

        @Override // java.util.List
        public Object set(int i10, Object obj) {
            AbstractC3094x0.m11602d(this, i10);
            return this.f8164q.set(i10 + this.f8165r, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m11476a();
        }

        @Override // java.util.List
        public List subList(int i10, int i11) {
            AbstractC3094x0.m11603e(this, i10, i11);
            return new c(this, i10, i11);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            objArr.getClass();
            return AbstractC1041j.m3804b(this, objArr);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i10) {
            return new a(this, i10);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return AbstractC1041j.m3803a(this);
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f8164q;
            int i10 = this.f8166s;
            this.f8166s = i10 + 1;
            list.add(i10, obj);
            return true;
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection collection) {
            collection.getClass();
            this.f8164q.addAll(this.f8166s, collection);
            this.f8166s += collection.size();
            return collection.size() > 0;
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i10) {
            return m11477c(i10);
        }
    }

    public C3076o0(int i10) {
        super(i10, null);
    }
}
