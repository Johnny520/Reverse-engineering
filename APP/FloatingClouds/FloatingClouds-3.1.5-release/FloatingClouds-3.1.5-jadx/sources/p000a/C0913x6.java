package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p000a.C0035Bf;

/* JADX INFO: renamed from: a.x6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0913x6<T> implements InterfaceC0286Pd<T> {

    /* JADX INFO: renamed from: a */
    public final C0035Bf f3524a;

    /* JADX INFO: renamed from: b */
    public final C0673kd f3525b;

    /* JADX INFO: renamed from: a.x6$a */
    public static final class a implements Iterator<T>, InterfaceC0783q9 {

        /* JADX INFO: renamed from: a */
        public final Iterator<T> f3526a;

        /* JADX INFO: renamed from: b */
        public int f3527b = -1;

        /* JADX INFO: renamed from: c */
        public T f3528c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0913x6<T> f3529d;

        public a(C0913x6<T> c0913x6) {
            this.f3529d = c0913x6;
            this.f3526a = new C0035Bf.a(c0913x6.f3524a);
        }

        /* JADX INFO: renamed from: a */
        public final void m2202a() {
            T next;
            do {
                Iterator<T> it = this.f3526a;
                if (!it.hasNext()) {
                    this.f3527b = 0;
                    return;
                }
                next = it.next();
            } while (((Boolean) this.f3529d.f3525b.mo53f(next)).booleanValue());
            this.f3528c = next;
            this.f3527b = 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f3527b == -1) {
                m2202a();
            }
            return this.f3527b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f3527b == -1) {
                m2202a();
            }
            if (this.f3527b == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f3528c;
            this.f3528c = null;
            this.f3527b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0913x6(C0035Bf c0035Bf, C0673kd c0673kd) {
        this.f3524a = c0035Bf;
        this.f3525b = c0673kd;
    }

    @Override // p000a.InterfaceC0286Pd
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
