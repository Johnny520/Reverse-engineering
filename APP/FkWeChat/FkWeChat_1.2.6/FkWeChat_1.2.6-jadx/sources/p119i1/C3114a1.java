package p119i1;

import androidx.compose.runtime.AbstractC0464b3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p024b9.C1046l0;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1403d;
import p080f9.AbstractC2368o;
import p117i.C3039b;
import p172l8.C4699i;
import p185m8.AbstractC5101q0;

/* JADX INFO: renamed from: i1.a1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3114a1 implements List, InterfaceC1403d {

    /* JADX INFO: renamed from: q */
    public final SnapshotStateList f8286q;

    /* JADX INFO: renamed from: r */
    public final int f8287r;

    /* JADX INFO: renamed from: s */
    public int f8288s;

    /* JADX INFO: renamed from: t */
    public int f8289t;

    /* JADX INFO: renamed from: i1.a1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements ListIterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ C1046l0 f8290q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ C3114a1 f8291r;

        public a(C1046l0 c1046l0, C3114a1 c3114a1) {
            this.f8290q = c1046l0;
            this.f8291r = c3114a1;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Void add(Object obj) {
            AbstractC3126f0.m11729j();
            throw new C4699i();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f8290q.f3205q < this.f8291r.size() - 1;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f8290q.f3205q >= 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            AbstractC3126f0.m11729j();
            throw new C4699i();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            int i10 = this.f8290q.f3205q + 1;
            AbstractC3126f0.m11732m(i10, this.f8291r.size());
            this.f8290q.f3205q = i10;
            return this.f8291r.get(i10);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f8290q.f3205q + 1;
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public Void set(Object obj) {
            AbstractC3126f0.m11729j();
            throw new C4699i();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i10 = this.f8290q.f3205q;
            AbstractC3126f0.m11732m(i10, this.f8291r.size());
            this.f8290q.f3205q = i10 - 1;
            return this.f8291r.get(i10);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f8290q.f3205q;
        }
    }

    public C3114a1(SnapshotStateList snapshotStateList, int i10, int i11) {
        this.f8286q = snapshotStateList;
        this.f8287r = i10;
        this.f8288s = AbstractC3126f0.m11727h(snapshotStateList);
        this.f8289t = i11 - i10;
    }

    /* JADX INFO: renamed from: e */
    private final void m11648e() {
        if (AbstractC3126f0.m11727h(this.f8286q) == this.f8288s) {
            return;
        }
        C3039b.m11232a();
    }

    /* JADX INFO: renamed from: a */
    public int m11649a() {
        return this.f8289t;
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        m11648e();
        this.f8286q.add(this.f8287r + size(), obj);
        this.f8289t = size() + 1;
        this.f8288s = AbstractC3126f0.m11727h(this.f8286q);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        m11648e();
        boolean zAddAll = this.f8286q.addAll(i10 + this.f8287r, collection);
        if (zAddAll) {
            this.f8289t = size() + collection.size();
            this.f8288s = AbstractC3126f0.m11727h(this.f8286q);
        }
        return zAddAll;
    }

    /* JADX INFO: renamed from: c */
    public Object m11650c(int i10) {
        m11648e();
        Object objRemove = this.f8286q.remove(this.f8287r + i10);
        this.f8289t = size() - 1;
        this.f8288s = AbstractC3126f0.m11727h(this.f8286q);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        if (size() > 0) {
            m11648e();
            SnapshotStateList snapshotStateList = this.f8286q;
            int i10 = this.f8287r;
            snapshotStateList.m2205r(i10, size() + i10);
            this.f8289t = 0;
            this.f8288s = AbstractC3126f0.m11727h(this.f8286q);
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public Object get(int i10) {
        m11648e();
        AbstractC3126f0.m11732m(i10, size());
        return this.f8286q.get(this.f8287r + i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        m11648e();
        int i10 = this.f8287r;
        Iterator it = AbstractC2368o.m8592s(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((AbstractC5101q0) it).nextInt();
            if (AbstractC1061t.m3842c(obj, this.f8286q.get(iNextInt))) {
                return iNextInt - this.f8287r;
            }
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        m11648e();
        int size = this.f8287r + size();
        do {
            size--;
            if (size < this.f8287r) {
                return -1;
            }
        } while (!AbstractC1061t.m3842c(obj, this.f8286q.get(size)));
        return size - this.f8287r;
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        m11648e();
        C1046l0 c1046l0 = new C1046l0();
        c1046l0.f3205q = i10 - 1;
        return new a(c1046l0, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        m11648e();
        SnapshotStateList snapshotStateList = this.f8286q;
        int i10 = this.f8287r;
        int iM2206s = snapshotStateList.m2206s(collection, i10, size() + i10);
        if (iM2206s > 0) {
            this.f8288s = AbstractC3126f0.m11727h(this.f8286q);
            this.f8289t = size() - iM2206s;
        }
        return iM2206s > 0;
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        AbstractC3126f0.m11732m(i10, size());
        m11648e();
        Object obj2 = this.f8286q.set(i10 + this.f8287r, obj);
        this.f8288s = AbstractC3126f0.m11727h(this.f8286q);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m11649a();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            AbstractC0464b3.m1535a("fromIndex or toIndex are out of bounds");
        }
        m11648e();
        SnapshotStateList snapshotStateList = this.f8286q;
        int i12 = this.f8287r;
        return new C3114a1(snapshotStateList, i10 + i12, i11 + i12);
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
    public final /* bridge */ Object remove(int i10) {
        return m11650c(i10);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        m11648e();
        this.f8286q.add(this.f8287r + i10, obj);
        this.f8289t = size() + 1;
        this.f8288s = AbstractC3126f0.m11727h(this.f8286q);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
