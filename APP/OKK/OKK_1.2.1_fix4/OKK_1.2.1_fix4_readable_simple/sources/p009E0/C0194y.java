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

    public C0194y(C0195z r5, int r6) {
        this.f405b = r5;
        List r02 = (List) r5.f407b;
        if (r6 < 0) goto L9;
        if (r6 > r5.size()) goto L9;
        this.f404a = r02.listIterator(r5.size() - r6);
        return;
    L9:
        throw new IndexOutOfBoundsException("Position index " + r6 + " must be in range [" + new C0340c(0, r5.size(), 1) + "].");
    }

    @Override // java.util.ListIterator
    public final void add(Object r2) {
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
        int r02 = this.f404a.previousIndex();
        return AbstractC0182m.m555g0(this.f405b) - r02;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return this.f404a.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        int r02 = this.f404a.nextIndex();
        return AbstractC0182m.m555g0(this.f405b) - r02;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final void set(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
