package p001;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ۟.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0395t<T> implements Collection<T>, InterfaceC0321n4 {

    /* JADX INFO: renamed from: ۥ */
    public final T[] f1094;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f1095 = true;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public C0395t(Object[] objArr) {
        this.f1094 = objArr;
    }

    @Override // java.util.Collection
    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i;
        T[] tArr = this.f1094;
        C0237h4.m1090("<this>", tArr);
        if (obj == null) {
            int length = tArr.length;
            i = 0;
            while (i < length) {
                if (tArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = tArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (C0237h4.m864(obj, tArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection<? extends Object> collection) {
        C0237h4.m1090("elements", collection);
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f1094.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        T[] tArr = this.f1094;
        C0237h4.m1090("array", tArr);
        return new C0408u(tArr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f1094.length;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection
    public final Object[] toArray() {
        T[] tArr = this.f1094;
        boolean z = this.f1095;
        C0237h4.m1090("<this>", tArr);
        if (z && C0237h4.m864(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        C0237h4.m1089("copyOf(...)", objArrCopyOf);
        return objArrCopyOf;
    }

    @Override // java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        C0237h4.m1090("array", tArr);
        return (T[]) C0272jb.m1111(this, tArr);
    }
}
