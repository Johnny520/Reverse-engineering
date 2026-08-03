package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: L4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0478L4 implements Collection {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0521M4 f1577a;

    public C0478L4(C0521M4 r1) {
        this.f1577a = r1;
    }

    @Override // java.util.Collection
    public final boolean add(Object r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection r1) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f1577a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object r2) {
        if (this.f1577a.m4997a(r2) < 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection r2) {
        Iterator r22 = r2.iterator();
    L4:
        if (r22.hasNext() == false) goto L9;
        if (contains(r22.next()) == true) goto L4;
        return false;
    L9:
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
    public final boolean remove(Object r2) {
        C0521M4 r0 = this.f1577a;
        int r22 = r0.m4997a(r2);
        if (r22 < 0) goto L6;
        r0.mo4h(r22);
        return true;
    L6:
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection r7) {
        C0521M4 r0 = this.f1577a;
        int r1 = r0.f8818c;
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 >= r1) goto L8;
        if (r7.contains(r0.m5003j(r2)) == false) goto L7;
        r0.mo4h(r2);
        r2 = r2 - 1;
        r1 = r1 - 1;
        r3 = true;
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r3;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection r7) {
        C0521M4 r0 = this.f1577a;
        int r1 = r0.f8818c;
        int r2 = 0;
        boolean r3 = false;
    L3:
        if (r2 >= r1) goto L8;
        if (r7.contains(r0.m5003j(r2)) == true) goto L7;
        r0.mo4h(r2);
        r2 = r2 - 1;
        r1 = r1 - 1;
        r3 = true;
    L7:
        r2 = r2 + 1;
        goto L3
    L8:
        return r3;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f1577a.f8818c;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        C0521M4 r0 = this.f1577a;
        int r1 = r0.f8818c;
        Object[] r2 = new Object[r1];
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L5;
        r2[r3] = r0.m5003j(r3);
        r3 = r3 + 1;
        goto L3
    L5:
        return r2;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] r5) {
        C0521M4 r0 = this.f1577a;
        int r1 = r0.f8818c;
        if (r5.length >= r1) goto L5;
        r5 = (Object[]) Array.newInstance(r5.getClass().getComponentType(), r1);
    L5:
        int r2 = 0;
    L6:
        if (r2 >= r1) goto L9;
        r5[r2] = r0.m5003j(r2);
        r2 = r2 + 1;
        goto L6
    L9:
        if (r5.length <= r1) goto L11;
        r5[r1] = null;
    L11:
        return r5;
    }
}
