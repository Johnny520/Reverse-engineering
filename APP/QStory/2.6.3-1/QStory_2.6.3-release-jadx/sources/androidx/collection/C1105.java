package androidx.collection;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1105 implements Collection {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C1104 f1280;

    public C1105(C1104 c1104) {
        this.f1280 = c1104;
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
        this.f1280.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1280.m1427(obj) >= 0;
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
        return this.f1280.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1108(this.f1280, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C1104 c1104 = this.f1280;
        int iM1427 = c1104.m1427(obj);
        if (iM1427 < 0) {
            return false;
        }
        c1104.mo1428(iM1427);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C1104 c1104 = this.f1280;
        int i = c1104.f1339;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c1104.m1431(i2))) {
                c1104.mo1428(i2);
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
        C1104 c1104 = this.f1280;
        int i = c1104.f1339;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c1104.m1431(i2))) {
                c1104.mo1428(i2);
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
        return this.f1280.f1339;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C1104 c1104 = this.f1280;
        int i = c1104.f1339;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c1104.m1431(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C1104 c1104 = this.f1280;
        int i = c1104.f1339;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c1104.m1431(i2);
        }
        return objArr;
    }
}
