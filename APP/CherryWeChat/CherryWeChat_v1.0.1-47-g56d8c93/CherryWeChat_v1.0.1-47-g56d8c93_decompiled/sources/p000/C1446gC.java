package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: gC */
/* JADX INFO: loaded from: classes.dex */
public final class C1446gC implements Collection, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final int[] f5055a;

    @Override // java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof C1402fC)) {
            return false;
        }
        int i = ((C1402fC) obj).f4976a;
        int[] iArr = this.f5055a;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            if (i == iArr[i2]) {
                break;
            }
            i2++;
        }
        return i2 >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C1402fC) {
                    int i = ((C1402fC) obj).f4976a;
                    int[] iArr = this.f5055a;
                    int length = iArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            i2 = -1;
                            break;
                        }
                        if (i == iArr[i2]) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C1446gC) {
            return AbstractC0585Nj.m1134a(this.f5055a, ((C1446gC) obj).f5055a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f5055a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f5055a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2694x(4, this.f5055a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f5055a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0671Pj.m1341B(this);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.f5055a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0671Pj.m1342C(this, objArr);
    }
}
