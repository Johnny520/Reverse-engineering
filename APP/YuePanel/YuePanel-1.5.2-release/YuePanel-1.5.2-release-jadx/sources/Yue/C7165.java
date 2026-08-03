package Yue;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7165<T> extends AbstractC2996<T> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final List<T> f21579;

    /* JADX INFO: renamed from: Yue.ۥۡۧ$ۥ */
    public static final class C1194 implements ListIterator<T>, InterfaceC5596 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final ListIterator<T> f21580;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7165<T> f21581;

        public C1194(C7165<T> c7165, int i) {
            this.f21581 = c7165;
            this.f21580 = c7165.f21579.listIterator(C3886.m10811(c7165, i));
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            this.f21580.add(t);
            this.f21580.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f21580.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f21580.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f21580.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return C3886.m10810(this.f21581, this.f21580.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f21580.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return C3886.m10810(this.f21581, this.f21580.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f21580.remove();
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            this.f21580.set(t);
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final ListIterator<T> m3452() {
            return this.f21580;
        }
    }

    public C7165(@InterfaceC6399 List<T> list) {
        C5499.m17103(list, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.f21579 = list;
    }

    @Override // Yue.AbstractC2996, java.util.AbstractList, java.util.List
    public void add(int i, T t) {
        this.f21579.add(C3886.m10811(this, i), t);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f21579.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i) {
        return this.f21579.get(C3886.m10809(this, i));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @InterfaceC6399
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractList, java.util.List
    @InterfaceC6399
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // Yue.AbstractC2996, java.util.AbstractList, java.util.List
    public T set(int i, T t) {
        return this.f21579.set(C3886.m10809(this, i), t);
    }

    @Override // Yue.AbstractC2996
    /* JADX INFO: renamed from: ۥ */
    public int mo62() {
        return this.f21579.size();
    }

    @Override // Yue.AbstractC2996
    /* JADX INFO: renamed from: ۥ۟ */
    public T mo63(int i) {
        return this.f21579.remove(C3886.m10809(this, i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.AbstractList, java.util.List
    @InterfaceC6399
    public ListIterator<T> listIterator(int i) {
        return new C1194(this, i);
    }
}
