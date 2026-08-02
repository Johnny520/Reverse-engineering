package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: gg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0239gg implements Collection {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0276hg f3502h;

    public C0239gg(C0276hg c0276hg) {
        this.f3502h = c0276hg;
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
        this.f3502h.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f3502h.m5564a(obj) >= 0;
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
        return this.f3502h.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0129dg(this.f3502h, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        C0276hg c0276hg = this.f3502h;
        int iM5564a = c0276hg.m5564a(obj);
        if (iM5564a < 0) {
            return false;
        }
        c0276hg.mo4514h(iM5564a);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        C0276hg c0276hg = this.f3502h;
        int i = c0276hg.f11446j;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(c0276hg.m5570j(i2))) {
                c0276hg.mo4514h(i2);
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
        C0276hg c0276hg = this.f3502h;
        int i = c0276hg.f11446j;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(c0276hg.m5570j(i2))) {
                c0276hg.mo4514h(i2);
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
        return this.f3502h.f11446j;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0276hg c0276hg = this.f3502h;
        int i = c0276hg.f11446j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0276hg.m5570j(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0276hg c0276hg = this.f3502h;
        int i = c0276hg.f11446j;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = c0276hg.m5570j(i2);
        }
        return objArr;
    }
}
