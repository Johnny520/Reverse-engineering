package p009E0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: E0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0171b implements Iterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public int f382a;

    /* JADX INFO: renamed from: b */
    public Object f383b;

    /* JADX INFO: renamed from: a */
    public abstract void mo515a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r02 = this.f382a;
        if (r02 == 0) goto L11;
        if (r02 == 1) goto L14;
        if (r02 != 2) goto L9;
        return false;
    L9:
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    L14:
        return true;
    L11:
        this.f382a = 3;
        mo515a();
        if (this.f382a == 1) goto L14;
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int r02 = this.f382a;
        if (r02 != 1) goto L7;
        this.f382a = 0;
        return this.f383b;
    L7:
        if (r02 == 2) goto L13;
        this.f382a = 3;
        mo515a();
        if (this.f382a != 1) goto L13;
        this.f382a = 0;
        return this.f383b;
    L13:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
