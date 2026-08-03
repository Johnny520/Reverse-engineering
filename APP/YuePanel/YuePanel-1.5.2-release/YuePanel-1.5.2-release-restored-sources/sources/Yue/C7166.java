package Yue;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥۡۧ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7166<T> extends AbstractC2986<T> {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final List<T> f21582;

    /* JADX INFO: renamed from: Yue.ۥۡۧ۟$ۥ */
    public static final class C1195 implements ListIterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final ListIterator<T> f21583;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7166<T> f21584;

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۧ۟<? extends T> */
        /* JADX WARN: Multi-variable type inference failed */
        public C1195(C7166<? extends T> c7166, int i) {
            this.f21584 = c7166;
            this.f21583 = c7166.f21582.listIterator(C3886.m10811(c7166, i));
        }

        @Override // java.util.ListIterator
        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f21583.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f21583.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public T next() {
            return this.f21583.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return C3886.m10810(this.f21584, this.f21583.previousIndex());
        }

        @Override // java.util.ListIterator
        public T previous() {
            return this.f21583.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return C3886.m10810(this.f21584, this.f21583.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ */
        public final ListIterator<T> m3454() {
            return this.f21583;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7166(@InterfaceC6399 List<? extends T> list) {
        C5499.m17103(list, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.f21582 = list;
    }

    @Override // Yue.AbstractC2986, java.util.List
    public T get(int i) {
        return this.f21582.get(C3886.m10809(this, i));
    }

    @Override // Yue.AbstractC2986, Yue.AbstractC2979, java.util.Collection, java.lang.Iterable
    @InterfaceC6399
    public Iterator<T> iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.AbstractC2986, java.util.List
    @InterfaceC6399
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    @Override // Yue.AbstractC2986, Yue.AbstractC2979
    /* JADX INFO: renamed from: ۥ */
    public int mo41() {
        return this.f21582.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.AbstractC2986, java.util.List
    @InterfaceC6399
    public ListIterator<T> listIterator(int i) {
        return new C1195(this, i);
    }
}
