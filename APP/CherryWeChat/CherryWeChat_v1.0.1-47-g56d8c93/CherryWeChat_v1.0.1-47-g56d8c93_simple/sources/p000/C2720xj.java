package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: xj */
/* JADX INFO: loaded from: classes.dex */
public final class C2720xj implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public Object f9298a;

    /* JADX INFO: renamed from: b */
    public int f9299b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2763yj f9300c;

    public C2720xj(C2763yj r1) {
        this.f9300c = r1;
        this.f9299b = -2;
    }

    /* JADX INFO: renamed from: a */
    public final void m5286a() {
        int r0 = this.f9299b;
        C2763yj r2 = this.f9300c;
        if (r0 != (-2)) goto L5;
        Object r02 = r2.f9399a.mo6a();
    L6:
        this.f9298a = r02;
        if (r02 != null) goto L9;
        int r03 = 0;
    L10:
        this.f9299b = r03;
        return;
    L9:
        r03 = 1;
        goto L10
    L5:
        r02 = r2.f9400b.mo90g(this.f9298a);
        goto L6
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9299b >= 0) goto L6;
        m5286a();
    L6:
        if (this.f9299b != 1) goto L8;
        return true;
    L8:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f9299b >= 0) goto L6;
        m5286a();
    L6:
        if (this.f9299b == 0) goto L10;
        Object r0 = this.f9298a;
        this.f9299b = -1;
        return r0;
    L10:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
