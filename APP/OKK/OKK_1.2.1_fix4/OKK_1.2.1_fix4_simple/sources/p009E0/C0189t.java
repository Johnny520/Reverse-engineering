package p009E0;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p033R0.InterfaceC0319a;

/* JADX INFO: renamed from: E0.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0189t implements ListIterator, InterfaceC0319a {

    /* JADX INFO: renamed from: a */
    public static final C0189t f400a = null;

    static {
        f400a = new C0189t();
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void add(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final /* bridge */ /* synthetic */ void set(Object r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
