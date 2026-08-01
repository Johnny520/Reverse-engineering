package androidx.compose.runtime.snapshots;

import androidx.collection.C0276;
import androidx.compose.runtime.AbstractC1392;
import androidx.window.area.AbstractC2567;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4382;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.Ref$IntRef;
import p048.C6517;
import p054.InterfaceC6565;
import p124.AbstractC7415;
import p124.C7411;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1263 implements List, InterfaceC6565 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f3672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3673;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3674;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SnapshotStateList f3675;

    public C1263(SnapshotStateList snapshotStateList, int i, int i2) {
        this.f3675 = snapshotStateList;
        this.f3673 = i;
        this.f3674 = AbstractC1274.m2242(snapshotStateList);
        this.f3672 = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m2224();
        int i = this.f3673 + this.f3672;
        SnapshotStateList snapshotStateList = this.f3675;
        snapshotStateList.add(i, obj);
        this.f3672++;
        this.f3674 = AbstractC1274.m2242(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m2224();
        int i2 = i + this.f3673;
        SnapshotStateList snapshotStateList = this.f3675;
        boolean zAddAll = snapshotStateList.addAll(i2, collection);
        if (zAddAll) {
            this.f3672 = collection.size() + this.f3672;
            this.f3674 = AbstractC1274.m2242(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f3672 > 0) {
            m2224();
            int i = this.f3672;
            int i2 = this.f3673;
            SnapshotStateList snapshotStateList = this.f3675;
            snapshotStateList.m2195(i2, i + i2);
            this.f3672 = 0;
            this.f3674 = AbstractC1274.m2242(snapshotStateList);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        m2224();
        AbstractC1274.m2235(i, this.f3672);
        return this.f3675.get(this.f3673 + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        m2224();
        int i = this.f3672;
        int i2 = this.f3673;
        Iterator it = AbstractC2567.m5067(i2, i + i2).iterator();
        do {
            C6517 c6517 = (C6517) it;
            if (!c6517.f17823) {
                return -1;
            }
            iNextInt = c6517.nextInt();
        } while (!AbstractC4395.m8907(obj, this.f3675.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3672 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m2224();
        int i = this.f3672;
        int i2 = this.f3673;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (AbstractC4395.m8907(obj, this.f3675.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m2224();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i - 1;
        return new C1264(ref$IntRef, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m2224();
        int i2 = this.f3673 + i;
        SnapshotStateList snapshotStateList = this.f3675;
        Object objRemove = snapshotStateList.remove(i2);
        this.f3672--;
        this.f3674 = AbstractC1274.m2242(snapshotStateList);
        return objRemove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        AbstractC7415 abstractC7415;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        m2224();
        SnapshotStateList snapshotStateList = this.f3675;
        int i2 = this.f3673;
        int i3 = this.f3672 + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (AbstractC1274.f3707) {
                C1260 c1260 = snapshotStateList.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            C7411 c7411Mo12630 = abstractC7415.mo12630();
            c7411Mo12630.subList(i2, i3).retainAll(collection);
            AbstractC7415 abstractC7415M12610 = c7411Mo12630.m12610();
            if (AbstractC4395.m8907(abstractC7415M12610, abstractC7415)) {
                break;
            }
            C1260 c12603 = snapshotStateList.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = AbstractC1274.m2234((C1260) AbstractC1280.m2266(c12603, snapshotStateList, abstractC1286M2280), i, abstractC7415M12610, true);
            }
            AbstractC1280.m2269(abstractC1286M2280, snapshotStateList);
        } while (!zM2234);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f3674 = AbstractC1274.m2242(this.f3675);
            this.f3672 -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC1274.m2235(i, this.f3672);
        m2224();
        int i2 = i + this.f3673;
        SnapshotStateList snapshotStateList = this.f3675;
        Object obj2 = snapshotStateList.set(i2, obj);
        this.f3674 = AbstractC1274.m2242(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3672;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f3672) {
            AbstractC1392.m2538("fromIndex or toIndex are out of bounds");
        }
        m2224();
        int i3 = this.f3673;
        return new C1263(this.f3675, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4382.m8875(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2224() {
        if (AbstractC1274.m2242(this.f3675) == this.f3674) {
            return;
        }
        C0276.m840();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4382.m8874(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        m2224();
        int i2 = this.f3673 + i;
        SnapshotStateList snapshotStateList = this.f3675;
        snapshotStateList.add(i2, obj);
        this.f3672++;
        this.f3674 = AbstractC1274.m2242(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f3672, collection);
    }
}
