package p143c3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p000A.C0006D;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: c3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1903e implements Iterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public final Iterator f6469d;

    /* JADX INFO: renamed from: e */
    public int f6470e = -1;

    /* JADX INFO: renamed from: f */
    public Object f6471f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1904f f6472g;

    public C1903e(C1904f c1904f) {
        this.f6472g = c1904f;
        this.f6469d = ((InterfaceC1905g) c1904f.f6474b).iterator();
    }

    /* JADX INFO: renamed from: a */
    public final void m3389a() {
        Object next;
        do {
            Iterator it = this.f6469d;
            if (!it.hasNext()) {
                this.f6470e = 0;
                return;
            }
            next = it.next();
        } while (!((Boolean) ((C0006D) this.f6472g.f6475c).mo1h(next)).booleanValue());
        this.f6471f = next;
        this.f6470e = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6470e == -1) {
            m3389a();
        }
        return this.f6470e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f6470e == -1) {
            m3389a();
        }
        if (this.f6470e == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f6471f;
        this.f6471f = null;
        this.f6470e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
