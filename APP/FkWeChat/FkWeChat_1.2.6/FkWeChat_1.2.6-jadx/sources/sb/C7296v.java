package sb;

import java.util.Iterator;
import p010a9.InterfaceC0184l;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: sb.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7296v implements InterfaceC7282h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7282h f24216a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f24217b;

    /* JADX INFO: renamed from: sb.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Iterator f24218q;

        public a() {
            this.f24218q = C7296v.this.f24216a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24218q.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return C7296v.this.f24217b.mo27m(this.f24218q.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7296v(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        this.f24216a = interfaceC7282h;
        this.f24217b = interfaceC0184l;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC7282h m28923d(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        return new C7280f(this.f24216a, this.f24217b, interfaceC0184l);
    }

    @Override // sb.InterfaceC7282h
    public Iterator iterator() {
        return new a();
    }
}
