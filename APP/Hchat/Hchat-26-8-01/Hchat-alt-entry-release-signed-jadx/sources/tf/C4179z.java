package tf;

import gg.C1423s;
import java.util.List;
import java.util.ListIterator;
import p114hg.InterfaceC1711a;
import p218og.C3143g;
import p322w0.AbstractC4666q;
import p322w0.C4673x;

/* JADX INFO: renamed from: tf.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4179z implements ListIterator, InterfaceC1711a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13715g = 2;

    /* JADX INFO: renamed from: h */
    public final Object f13716h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13717i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4179z(C3143g c3143g, int i9) {
        this.f13717i = c3143g;
        this.f13716h = ((List) c3143g.f10198h).listIterator(AbstractC4166m.m8414l1(i9, c3143g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.f13715g) {
            case 0:
                ListIterator listIterator = (ListIterator) this.f13716h;
                listIterator.add(obj);
                listIterator.previous();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13715g) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((C1423s) this.f13716h).f4736g < ((C4673x) this.f13717i).f15555j - 1) {
                }
                break;
        }
        return ((ListIterator) this.f13716h).hasPrevious();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.f13715g) {
            case 0:
                break;
            case 1:
                break;
            default:
                if (((C1423s) this.f13716h).f4736g >= 0) {
                }
                break;
        }
        return ((ListIterator) this.f13716h).hasNext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f13715g) {
            case 0:
                return ((ListIterator) this.f13716h).previous();
            case 1:
                return ((ListIterator) this.f13716h).previous();
            default:
                C1423s c1423s = (C1423s) this.f13716h;
                int i9 = c1423s.f4736g + 1;
                C4673x c4673x = (C4673x) this.f13717i;
                AbstractC4666q.m9145a(i9, c4673x.f15555j);
                c1423s.f4736g = i9;
                return c4673x.get(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.f13715g) {
            case 0:
                C4150a0 c4150a0 = (C4150a0) this.f13717i;
                return (c4150a0.size() - 1) - ((ListIterator) this.f13716h).previousIndex();
            case 1:
                C3143g c3143g = (C3143g) this.f13717i;
                return (c3143g.size() - 1) - ((ListIterator) this.f13716h).previousIndex();
            default:
                return ((C1423s) this.f13716h).f4736g + 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f13715g) {
            case 0:
                return ((ListIterator) this.f13716h).next();
            case 1:
                return ((ListIterator) this.f13716h).next();
            default:
                C1423s c1423s = (C1423s) this.f13716h;
                int i9 = c1423s.f4736g;
                C4673x c4673x = (C4673x) this.f13717i;
                AbstractC4666q.m9145a(i9, c4673x.f15555j);
                c1423s.f4736g = i9 - 1;
                return c4673x.get(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.f13715g) {
            case 0:
                C4150a0 c4150a0 = (C4150a0) this.f13717i;
                return (c4150a0.size() - 1) - ((ListIterator) this.f13716h).nextIndex();
            case 1:
                C3143g c3143g = (C3143g) this.f13717i;
                return (c3143g.size() - 1) - ((ListIterator) this.f13716h).nextIndex();
            default:
                return ((C1423s) this.f13716h).f4736g;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.f13715g) {
            case 0:
                ((ListIterator) this.f13716h).remove();
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.f13715g) {
            case 0:
                ((ListIterator) this.f13716h).set(obj);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
        }
    }

    public C4179z(C4150a0 c4150a0, int i9) {
        this.f13717i = c4150a0;
        this.f13716h = c4150a0.f13680g.listIterator(AbstractC4166m.m8414l1(i9, c4150a0));
    }

    public C4179z(C1423s c1423s, C4673x c4673x) {
        this.f13716h = c1423s;
        this.f13717i = c4673x;
    }
}
