package p282t7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1041j;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1405f;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5116y;

/* JADX INFO: renamed from: t7.o */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8191o implements Set, InterfaceC1405f {

    /* JADX INFO: renamed from: q */
    public final Set f27487q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0184l f27488r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC0184l f27489s;

    /* JADX INFO: renamed from: t */
    public final int f27490t;

    /* JADX INFO: renamed from: t7.o$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Iterator f27491q;

        public a() {
            this.f27491q = C8191o.this.f27487q.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f27491q.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C8191o.this.f27488r.mo27m(this.f27491q.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f27491q.remove();
        }
    }

    public C8191o(Set set, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        set.getClass();
        interfaceC0184l.getClass();
        interfaceC0184l2.getClass();
        this.f27487q = set;
        this.f27488r = interfaceC0184l;
        this.f27489s = interfaceC0184l2;
        this.f27490t = set.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        return this.f27487q.add(this.f27489s.mo27m(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        collection.getClass();
        return this.f27487q.addAll(m31867e(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f27487q.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27487q.contains(this.f27489s.mo27m(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        collection.getClass();
        return this.f27487q.containsAll(m31867e(collection));
    }

    /* JADX INFO: renamed from: e */
    public Collection m31867e(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f27489s.mo27m(it.next()));
        }
        return arrayList;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Set)) {
            Collection<?> collectionM31868l = m31868l(this.f27487q);
            if (((Set) obj).containsAll(collectionM31868l) && collectionM31868l.containsAll((Collection) obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f27487q.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f27487q.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    /* JADX INFO: renamed from: l */
    public Collection m31868l(Collection collection) {
        collection.getClass();
        Collection collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(collection2, 10));
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f27488r.mo27m(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public int m31869o() {
        return this.f27490t;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return this.f27487q.remove(this.f27489s.mo27m(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        collection.getClass();
        return this.f27487q.removeAll(AbstractC5081g0.m20564c1(m31867e(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return this.f27487q.retainAll(AbstractC5081g0.m20564c1(m31867e(collection)));
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m31869o();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        objArr.getClass();
        return AbstractC1041j.m3804b(this, objArr);
    }

    public String toString() {
        return m31868l(this.f27487q).toString();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }
}
