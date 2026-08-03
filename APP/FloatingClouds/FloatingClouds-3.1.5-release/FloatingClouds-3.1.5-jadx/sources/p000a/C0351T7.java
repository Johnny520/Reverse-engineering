package p000a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: a.T7 */
/* JADX INFO: loaded from: classes.dex */
public final class C0351T7<T> implements InterfaceC0286Pd<T> {

    /* JADX INFO: renamed from: a */
    public final C0004A3 f1249a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0064D7<T, T> f1250b;

    /* JADX INFO: renamed from: a.T7$a */
    public static final class a implements Iterator<T>, InterfaceC0783q9 {

        /* JADX INFO: renamed from: a */
        public T f1251a;

        /* JADX INFO: renamed from: b */
        public int f1252b = -2;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0351T7<T> f1253c;

        public a(C0351T7<T> c0351t7) {
            this.f1253c = c0351t7;
        }

        /* JADX INFO: renamed from: a */
        public final void m943a() {
            T tMo53f;
            int i = this.f1252b;
            C0351T7<T> c0351t7 = this.f1253c;
            if (i == -2) {
                tMo53f = (T) ((Class) c0351t7.f1249a.f28b);
            } else {
                InterfaceC0064D7<T, T> interfaceC0064D7 = c0351t7.f1250b;
                T t = this.f1251a;
                C0631i9.m1479b(t);
                tMo53f = interfaceC0064D7.mo53f(t);
            }
            this.f1251a = tMo53f;
            this.f1252b = tMo53f == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            if (this.f1252b < 0) {
                m943a();
            }
            return this.f1252b == 1;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (this.f1252b < 0) {
                m943a();
            }
            if (this.f1252b == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f1251a;
            C0631i9.m1480c(t, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f1252b = -1;
            return t;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0351T7(C0004A3 c0004a3, InterfaceC0064D7 interfaceC0064D7) {
        this.f1249a = c0004a3;
        this.f1250b = interfaceC0064D7;
    }

    @Override // p000a.InterfaceC0286Pd
    public final Iterator<T> iterator() {
        return new a(this);
    }
}
