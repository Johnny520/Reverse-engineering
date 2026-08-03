package p009E0;

import java.util.Enumeration;
import java.util.Iterator;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: E0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0184o implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Enumeration f399a;

    public C0184o(Enumeration r1) {
        this.f399a = r1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f399a.hasMoreElements();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f399a.nextElement();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
