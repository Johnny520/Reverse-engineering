package sb;

import bsh.C1189h4;
import java.util.Iterator;
import p010a9.InterfaceC0184l;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: sb.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7279e implements InterfaceC7282h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7282h f24178a;

    /* JADX INFO: renamed from: b */
    public final boolean f24179b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0184l f24180c;

    /* JADX INFO: renamed from: sb.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Iterator f24181q;

        /* JADX INFO: renamed from: r */
        public int f24182r = -1;

        /* JADX INFO: renamed from: s */
        public Object f24183s;

        public a() {
            this.f24181q = C7279e.this.f24178a.iterator();
        }

        /* JADX INFO: renamed from: g */
        public final void m28861g() {
            while (this.f24181q.hasNext()) {
                Object next = this.f24181q.next();
                if (((Boolean) C7279e.this.f24180c.mo27m(next)).booleanValue() == C7279e.this.f24179b) {
                    this.f24183s = next;
                    this.f24182r = 1;
                    return;
                }
            }
            this.f24182r = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24182r == -1) {
                m28861g();
            }
            return this.f24182r == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f24182r == -1) {
                m28861g();
            }
            if (this.f24182r == 0) {
                C1189h4.m4429a();
                return null;
            }
            Object obj = this.f24183s;
            this.f24183s = null;
            this.f24182r = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7279e(InterfaceC7282h interfaceC7282h, boolean z10, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        this.f24178a = interfaceC7282h;
        this.f24179b = z10;
        this.f24180c = interfaceC0184l;
    }

    @Override // sb.InterfaceC7282h
    public Iterator iterator() {
        return new a();
    }
}
