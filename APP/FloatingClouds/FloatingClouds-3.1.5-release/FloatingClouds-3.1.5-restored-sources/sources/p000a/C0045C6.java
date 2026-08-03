package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.C6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0045C6<T, R, E> implements InterfaceC0286Pd<E> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0286Pd<T> f168a;

    /* JADX INFO: renamed from: b */
    public final C0673kd f169b;

    /* JADX INFO: renamed from: a.C6$a */
    public static final class a implements Iterator<E>, InterfaceC0783q9 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f170a;

        /* JADX INFO: renamed from: b */
        public Iterator<? extends E> f171b;

        /* JADX INFO: renamed from: c */
        public int f172c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0045C6<T, R, E> f173d;

        public a(C0045C6<T, R, E> c0045c6) {
            this.f173d = c0045c6;
            this.f170a = c0045c6.f168a.iterator();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: a.Td */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public final boolean m126a() {
            Iterator<? extends E> itMo53f;
            Iterator<? extends E> it = this.f171b;
            if (it != null && it.hasNext()) {
                this.f172c = 1;
                return true;
            }
            do {
                Iterator<T> it2 = this.f170a;
                if (!it2.hasNext()) {
                    this.f172c = 2;
                    this.f171b = null;
                    return false;
                }
                T next = it2.next();
                C0045C6<T, R, E> c0045c6 = this.f173d;
                c0045c6.getClass();
                itMo53f = C0357Td.f1352i.mo53f(c0045c6.f169b.mo53f(next));
            } while (!itMo53f.hasNext());
            this.f171b = itMo53f;
            this.f172c = 1;
            return true;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.f172c;
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            return m126a();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.f172c;
            if (i == 2) {
                throw new NoSuchElementException();
            }
            if (i == 0 && !m126a()) {
                throw new NoSuchElementException();
            }
            this.f172c = 0;
            Iterator<? extends E> it = this.f171b;
            C0631i9.m1479b(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0045C6(InterfaceC0286Pd interfaceC0286Pd, C0673kd c0673kd) {
        C0357Td c0357Td = C0357Td.f1352i;
        this.f168a = interfaceC0286Pd;
        this.f169b = c0673kd;
    }

    @Override // p000a.InterfaceC0286Pd
    public final Iterator<E> iterator() {
        return new a(this);
    }
}
