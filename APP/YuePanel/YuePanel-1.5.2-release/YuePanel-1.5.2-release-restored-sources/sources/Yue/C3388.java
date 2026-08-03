package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۧۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3388<T> implements Iterator<T>, InterfaceC5591 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final T[] f5446;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f5447;

    public C3388(@InterfaceC6399 T[] tArr) {
        C5499.m17103(tArr, "array");
        this.f5446 = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5447 < this.f5446.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f5446;
            int i = this.f5447;
            this.f5447 = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f5447--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public final T[] m473() {
        return this.f5446;
    }
}
