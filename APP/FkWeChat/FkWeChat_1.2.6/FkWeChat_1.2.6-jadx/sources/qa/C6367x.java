package qa;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: qa.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6367x extends AbstractList implements RandomAccess, InterfaceC6358o {

    /* JADX INFO: renamed from: q */
    public final InterfaceC6358o f20062q;

    /* JADX INFO: renamed from: qa.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class a implements ListIterator {

        /* JADX INFO: renamed from: q */
        public ListIterator f20063q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ int f20064r;

        public a(int i10) {
            this.f20064r = i10;
            this.f20063q = C6367x.this.f20062q.listIterator(i10);
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f20063q.next();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f20063q.previous();
        }

        @Override // java.util.ListIterator
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f20063q.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f20063q.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f20063q.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f20063q.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: qa.x$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public class b implements Iterator {

        /* JADX INFO: renamed from: q */
        public Iterator f20066q;

        public b() {
            this.f20066q = C6367x.this.f20062q.iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f20066q.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f20066q.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C6367x(InterfaceC6358o interfaceC6358o) {
        this.f20062q = interfaceC6358o;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        return (String) this.f20062q.get(i10);
    }

    @Override // qa.InterfaceC6358o
    /* JADX INFO: renamed from: g */
    public List mo25267g() {
        return this.f20062q.mo25267g();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // qa.InterfaceC6358o
    /* JADX INFO: renamed from: j */
    public void mo25269j(AbstractC6348e abstractC6348e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i10) {
        return new a(i10);
    }

    @Override // qa.InterfaceC6358o
    /* JADX INFO: renamed from: m */
    public AbstractC6348e mo25271m(int i10) {
        return this.f20062q.mo25271m(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f20062q.size();
    }

    @Override // qa.InterfaceC6358o
    /* JADX INFO: renamed from: n */
    public InterfaceC6358o mo25272n() {
        return this;
    }
}
