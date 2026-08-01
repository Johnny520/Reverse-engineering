package p114X;

import java.util.ListIterator;
import p122Y2.InterfaceC1766a;

/* JADX INFO: renamed from: X.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1612a implements ListIterator, InterfaceC1766a {

    /* JADX INFO: renamed from: d */
    public int f5553d;

    /* JADX INFO: renamed from: e */
    public int f5554e;

    public AbstractC1612a(int i5, int i6) {
        this.f5553d = i5;
        this.f5554e = i6;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f5553d < this.f5554e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f5553d > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f5553d;
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f5553d - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
