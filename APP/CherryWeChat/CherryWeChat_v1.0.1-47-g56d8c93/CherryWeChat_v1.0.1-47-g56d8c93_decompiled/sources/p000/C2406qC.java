package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: qC */
/* JADX INFO: loaded from: classes.dex */
public final class C2406qC implements Collection, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final short[] f8440a;

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
        if (!(obj instanceof C2355pC)) {
            return false;
        }
        short s = ((C2355pC) obj).f8240a;
        short[] sArr = this.f8440a;
        int length = sArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (s == sArr[i]) {
                break;
            }
            i++;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof C2355pC) {
                    short s = ((C2355pC) obj).f8240a;
                    short[] sArr = this.f8440a;
                    int length = sArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (s == sArr[i]) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj instanceof C2406qC) {
            return AbstractC0585Nj.m1134a(this.f8440a, ((C2406qC) obj).f8440a);
        }
        return false;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return Arrays.hashCode(this.f8440a);
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f8440a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2694x(6, this.f8440a);
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
        return this.f8440a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0671Pj.m1341B(this);
    }

    public final String toString() {
        return "UShortArray(storage=" + Arrays.toString(this.f8440a) + ')';
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0671Pj.m1342C(this, objArr);
    }
}
