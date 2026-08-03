package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: L4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0478L4 implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0521M4 f1577a;

    public C0478L4(C0521M4 c0521m4) {
        this.f1577a = c0521m4;
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
        this.f1577a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f1577a.m4997a(obj) >= 0;
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
        return this.f1577a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0349I4(this.f1577a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0521M4 c0521m4 = this.f1577a;
        int iM4997a = c0521m4.m4997a(obj);
        if (iM4997a < 0) {
            return false;
        }
        c0521m4.mo4h(iM4997a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0521M4 c0521m4 = this.f1577a;
        int i = c0521m4.f8818c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c0521m4.m5003j(i2))) {
                c0521m4.mo4h(i2);
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
        C0521M4 c0521m4 = this.f1577a;
        int i = c0521m4.f8818c;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c0521m4.m5003j(i2))) {
                c0521m4.mo4h(i2);
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
        return this.f1577a.f8818c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0521M4 c0521m4 = this.f1577a;
        int i = c0521m4.f8818c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0521m4.m5003j(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0521M4 c0521m4 = this.f1577a;
        int i = c0521m4.f8818c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0521m4.m5003j(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
