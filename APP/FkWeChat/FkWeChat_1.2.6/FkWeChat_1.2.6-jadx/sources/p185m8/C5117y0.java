package p185m8;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: m8.y0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C5117y0 extends AbstractC5078f {

    /* JADX INFO: renamed from: r */
    public final List f15422r;

    /* JADX INFO: renamed from: m8.y0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements ListIterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final ListIterator f15423q;

        public a(int i10) {
            this.f15423q = C5117y0.this.f15422r.listIterator(AbstractC5073d0.m20513U(C5117y0.this, i10));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f15423q.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f15423q.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f15423q.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return AbstractC5073d0.m20512T(C5117y0.this, this.f15423q.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f15423q.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return AbstractC5073d0.m20512T(C5117y0.this, this.f15423q.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C5117y0(List list) {
        list.getClass();
        this.f15422r = list;
    }

    @Override // p185m8.AbstractC5066b
    /* JADX INFO: renamed from: c */
    public int mo31c() {
        return this.f15422r.size();
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public Object get(int i10) {
        return this.f15422r.get(AbstractC5073d0.m20511S(this, i10));
    }

    @Override // p185m8.AbstractC5078f, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // p185m8.AbstractC5078f, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }
}
