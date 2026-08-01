package sb;

import bsh.C1189h4;
import java.util.Iterator;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: sb.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7281g implements InterfaceC7282h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0173a f24192a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f24193b;

    /* JADX INFO: renamed from: sb.g$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public Object f24194q;

        /* JADX INFO: renamed from: r */
        public int f24195r = -2;

        public a() {
        }

        /* JADX INFO: renamed from: g */
        private final void m28868g() {
            Object objMo27m;
            int i10 = this.f24195r;
            C7281g c7281g = C7281g.this;
            if (i10 == -2) {
                objMo27m = c7281g.f24192a.invoke();
            } else {
                InterfaceC0184l interfaceC0184l = c7281g.f24193b;
                Object obj = this.f24194q;
                obj.getClass();
                objMo27m = interfaceC0184l.mo27m(obj);
            }
            this.f24194q = objMo27m;
            this.f24195r = objMo27m == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24195r < 0) {
                m28868g();
            }
            return this.f24195r == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f24195r < 0) {
                m28868g();
            }
            if (this.f24195r == 0) {
                C1189h4.m4429a();
                return null;
            }
            Object obj = this.f24194q;
            obj.getClass();
            this.f24195r = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7281g(InterfaceC0173a interfaceC0173a, InterfaceC0184l interfaceC0184l) {
        interfaceC0173a.getClass();
        interfaceC0184l.getClass();
        this.f24192a = interfaceC0173a;
        this.f24193b = interfaceC0184l;
    }

    @Override // sb.InterfaceC7282h
    public Iterator iterator() {
        return new a();
    }
}
