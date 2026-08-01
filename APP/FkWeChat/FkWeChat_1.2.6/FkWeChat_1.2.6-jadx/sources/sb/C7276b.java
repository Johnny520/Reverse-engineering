package sb;

import java.util.Iterator;
import p036c9.InterfaceC1400a;
import p376zd.C10001l;

/* JADX INFO: renamed from: sb.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7276b implements InterfaceC7282h, InterfaceC7277c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7282h f24173a;

    /* JADX INFO: renamed from: b */
    public final int f24174b;

    /* JADX INFO: renamed from: sb.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements Iterator, InterfaceC1400a {

        /* JADX INFO: renamed from: q */
        public final Iterator f24175q;

        /* JADX INFO: renamed from: r */
        public int f24176r;

        public a(C7276b c7276b) {
            this.f24175q = c7276b.f24173a.iterator();
            this.f24176r = c7276b.f24174b;
        }

        /* JADX INFO: renamed from: g */
        public final void m28856g() {
            while (this.f24176r > 0 && this.f24175q.hasNext()) {
                this.f24175q.next();
                this.f24176r--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            m28856g();
            return this.f24175q.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            m28856g();
            return this.f24175q.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C7276b(InterfaceC7282h interfaceC7282h, int i10) {
        interfaceC7282h.getClass();
        this.f24173a = interfaceC7282h;
        this.f24174b = i10;
        if (i10 >= 0) {
            return;
        }
        C10001l.m38755a("count must be non-negative, but was ", i10, 46);
        throw null;
    }

    @Override // sb.InterfaceC7277c
    /* JADX INFO: renamed from: a */
    public InterfaceC7282h mo28855a(int i10) {
        int i11 = this.f24174b + i10;
        return i11 < 0 ? new C7276b(this, i10) : new C7276b(this.f24173a, i11);
    }

    @Override // sb.InterfaceC7282h
    public Iterator iterator() {
        return new a(this);
    }
}
