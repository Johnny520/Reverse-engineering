package p009E0;

import java.util.List;
import java.util.ListIterator;
import p033R0.InterfaceC0319a;
import p036T0.C0340c;

/* JADX INFO: renamed from: E0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0194y implements ListIterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public final ListIterator f404a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0195z f405b;

    public C0194y(C0195z c0195z, int i2) {
        this.f405b = c0195z;
        List list = (List) c0195z.f407b;
        if (i2 >= 0 && i2 <= c0195z.size()) {
            this.f404a = list.listIterator(c0195z.size() - i2);
            return;
        }
        throw new IndexOutOfBoundsException("Position index " + i2 + " must be in range [" + new C0340c(0, c0195z.size(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f404a.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f404a.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return this.f404a.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return AbstractC0182m.m555g0(this.f405b) - this.f404a.previousIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f404a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return AbstractC0182m.m555g0(this.f405b) - this.f404a.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
