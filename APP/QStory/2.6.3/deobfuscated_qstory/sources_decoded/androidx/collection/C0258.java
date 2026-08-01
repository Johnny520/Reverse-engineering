package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0258 implements Collection {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C0257 f935;

    public C0258(C0257 c0257) {
        this.f935 = c0257;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f935.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f935.m867(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f935.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0261(this.f935, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0257 c0257 = this.f935;
        int iM867 = c0257.m867(obj);
        if (iM867 < 0) {
            return false;
        }
        c0257.mo868(iM867);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0257 c0257 = this.f935;
        int i = c0257.f994;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c0257.m871(i2))) {
                c0257.mo868(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0257 c0257 = this.f935;
        int i = c0257.f994;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c0257.m871(i2))) {
                c0257.mo868(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f935.f994;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0257 c0257 = this.f935;
        int i = c0257.f994;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0257.m871(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0257 c0257 = this.f935;
        int i = c0257.f994;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0257.m871(i2);
        }
        return objArr;
    }
}
