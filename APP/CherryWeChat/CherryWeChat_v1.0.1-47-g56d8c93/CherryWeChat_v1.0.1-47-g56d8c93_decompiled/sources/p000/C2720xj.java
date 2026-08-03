package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: xj */
/* JADX INFO: loaded from: classes.dex */
public final class C2720xj implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public Object f9298a;

    /* JADX INFO: renamed from: b */
    public int f9299b = -2;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2763yj f9300c;

    public C2720xj(C2763yj c2763yj) {
        this.f9300c = c2763yj;
    }

    /* JADX INFO: renamed from: a */
    public final void m5286a() {
        int i = this.f9299b;
        C2763yj c2763yj = this.f9300c;
        Object objMo6a = i == -2 ? c2763yj.f9399a.mo6a() : c2763yj.f9400b.mo90g(this.f9298a);
        this.f9298a = objMo6a;
        this.f9299b = objMo6a == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9299b < 0) {
            m5286a();
        }
        return this.f9299b == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9299b < 0) {
            m5286a();
        }
        if (this.f9299b == 0) {
            throw new NoSuchElementException();
        }
        Object obj = this.f9298a;
        this.f9299b = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
