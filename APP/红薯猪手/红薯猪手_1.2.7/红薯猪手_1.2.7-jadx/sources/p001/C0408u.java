package p001;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ۟.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0408u<T> implements Iterator<T>, InterfaceC0321n4 {

    /* JADX INFO: renamed from: ۥ */
    public final T[] f1118;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1119;

    public C0408u(T[] tArr) {
        this.f1118 = tArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1119 < this.f1118.length;
    }

    @Override // java.util.Iterator
    public final T next() {
        try {
            T[] tArr = this.f1118;
            int i = this.f1119;
            this.f1119 = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f1119--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
