package sb;

import bsh.C1189h4;
import java.util.Iterator;
import p010a9.InterfaceC0184l;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: sb.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7280f implements InterfaceC7282h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7282h f24185a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f24186b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f24187c;

    /* JADX INFO: renamed from: sb.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Iterator f24188q;

        /* JADX INFO: renamed from: r */
        public Iterator f24189r;

        /* JADX INFO: renamed from: s */
        public int f24190s;

        public a() {
            this.f24188q = C7280f.this.f24185a.iterator();
        }

        /* JADX INFO: renamed from: g */
        public final boolean m28865g() {
            Iterator it = this.f24189r;
            if (it != null && it.hasNext()) {
                this.f24190s = 1;
                return true;
            }
            while (this.f24188q.hasNext()) {
                Iterator it2 = (Iterator) C7280f.this.f24187c.mo27m(C7280f.this.f24186b.mo27m(this.f24188q.next()));
                if (it2.hasNext()) {
                    this.f24189r = it2;
                    this.f24190s = 1;
                    return true;
                }
            }
            this.f24190s = 2;
            this.f24189r = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i10 = this.f24190s;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return m28865g();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i10 = this.f24190s;
            if (i10 == 2) {
                C1189h4.m4429a();
                return null;
            }
            if (i10 == 0 && !m28865g()) {
                C1189h4.m4429a();
                return null;
            }
            this.f24190s = 0;
            Iterator it = this.f24189r;
            it.getClass();
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7280f(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l, InterfaceC0184l interfaceC0184l2) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        interfaceC0184l2.getClass();
        this.f24185a = interfaceC7282h;
        this.f24186b = interfaceC0184l;
        this.f24187c = interfaceC0184l2;
    }

    @Override // sb.InterfaceC7282h
    public Iterator iterator() {
        return new a();
    }
}
