package p024b9;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p036c9.InterfaceC1400a;

/* JADX INFO: renamed from: b9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C1025b implements Iterator, InterfaceC1400a {

    /* JADX INFO: renamed from: q */
    public final Object[] f3182q;

    /* JADX INFO: renamed from: r */
    public int f3183r;

    public C1025b(Object[] objArr) {
        objArr.getClass();
        this.f3182q = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f3183r < this.f3182q.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f3182q;
            int i10 = this.f3183r;
            this.f3183r = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f3183r--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
