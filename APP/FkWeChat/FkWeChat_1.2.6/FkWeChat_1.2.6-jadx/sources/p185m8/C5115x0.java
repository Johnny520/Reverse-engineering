package p185m8;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.x0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5115x0 extends AbstractC5086j {

    /* JADX INFO: renamed from: q */
    public final List f15419q;

    /* JADX INFO: renamed from: m8.x0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements ListIterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final ListIterator f15420q;

        public a(int i10) {
            this.f15420q = C5115x0.this.f15419q.listIterator(AbstractC5073d0.m20513U(C5115x0.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f15420q.add(obj);
            this.f15420q.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f15420q.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f15420q.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f15420q.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return AbstractC5073d0.m20512T(C5115x0.this, this.f15420q.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f15420q.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return AbstractC5073d0.m20512T(C5115x0.this, this.f15420q.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f15420q.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f15420q.set(obj);
        }
    }

    public C5115x0(List list) {
        list.getClass();
        this.f15419q = list;
    }

    @Override // p185m8.AbstractC5086j
    /* JADX INFO: renamed from: a */
    public int mo72a() {
        return this.f15419q.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, Object obj) {
        this.f15419q.add(AbstractC5073d0.m20513U(this, i10), obj);
    }

    @Override // p185m8.AbstractC5086j
    /* JADX INFO: renamed from: c */
    public Object mo73c(int i10) {
        return this.f15419q.remove(AbstractC5073d0.m20511S(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f15419q.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        return this.f15419q.get(AbstractC5073d0.m20511S(this, i10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i10, Object obj) {
        return this.f15419q.set(AbstractC5073d0.m20511S(this, i10), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
