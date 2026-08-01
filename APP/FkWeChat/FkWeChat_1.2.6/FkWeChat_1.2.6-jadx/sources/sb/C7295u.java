package sb;

import bsh.C1189h4;
import java.util.Iterator;
import p010a9.InterfaceC0184l;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: sb.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7295u implements InterfaceC7282h {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7282h f24210a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0184l f24211b;

    /* JADX INFO: renamed from: sb.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Iterator f24212q;

        /* JADX INFO: renamed from: r */
        public int f24213r = -1;

        /* JADX INFO: renamed from: s */
        public Object f24214s;

        public a() {
            this.f24212q = C7295u.this.f24210a.iterator();
        }

        /* JADX INFO: renamed from: g */
        private final void m28920g() {
            if (this.f24212q.hasNext()) {
                Object next = this.f24212q.next();
                if (((Boolean) C7295u.this.f24211b.mo27m(next)).booleanValue()) {
                    this.f24213r = 1;
                    this.f24214s = next;
                    return;
                }
            }
            this.f24213r = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f24213r == -1) {
                m28920g();
            }
            return this.f24213r == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f24213r == -1) {
                m28920g();
            }
            if (this.f24213r == 0) {
                C1189h4.m4429a();
                return null;
            }
            Object obj = this.f24214s;
            this.f24214s = null;
            this.f24213r = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7295u(InterfaceC7282h interfaceC7282h, InterfaceC0184l interfaceC0184l) {
        interfaceC7282h.getClass();
        interfaceC0184l.getClass();
        this.f24210a = interfaceC7282h;
        this.f24211b = interfaceC0184l;
    }

    @Override // sb.InterfaceC7282h
    public Iterator iterator() {
        return new a();
    }
}
