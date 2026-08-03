package Yue;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۧۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4631 implements ListIterator, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C4631 f9943 = new C4631();

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX INFO: renamed from: ۥ */
    public void m1588(Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
    @Override // java.util.ListIterator, java.util.Iterator
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟, reason: merged with bridge method [inline-methods] */
    public Void next() {
        throw new NoSuchElementException();
    }

    /* JADX DEBUG: Method merged with bridge method: previous()Ljava/lang/Object; */
    @Override // java.util.ListIterator
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public Void previous() {
        throw new NoSuchElementException();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m13922(Void r2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
