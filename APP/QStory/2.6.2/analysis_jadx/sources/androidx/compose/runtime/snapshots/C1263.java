package androidx.compose.runtime.snapshots;

import androidx.collection.C0276;
import androidx.compose.runtime.AbstractC1392;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC4381;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.Ref$IntRef;
import p000.AbstractC6087;
import p048.C6516;
import p054.InterfaceC6564;
import p124.AbstractC7414;
import p124.C7410;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1263 implements List, InterfaceC6564 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f3671;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f3672;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f3673;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SnapshotStateList f3674;

    public C1263(SnapshotStateList snapshotStateList, int i, int i2) {
        this.f3674 = snapshotStateList;
        this.f3672 = i;
        this.f3673 = AbstractC1274.m2232(snapshotStateList);
        this.f3671 = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m2214();
        int i = this.f3672 + this.f3671;
        SnapshotStateList snapshotStateList = this.f3674;
        snapshotStateList.add(i, obj);
        this.f3671++;
        this.f3673 = AbstractC1274.m2232(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m2214();
        int i2 = i + this.f3672;
        SnapshotStateList snapshotStateList = this.f3674;
        boolean zAddAll = snapshotStateList.addAll(i2, collection);
        if (zAddAll) {
            this.f3671 = collection.size() + this.f3671;
            this.f3673 = AbstractC1274.m2232(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f3671 > 0) {
            m2214();
            int i = this.f3671;
            int i2 = this.f3672;
            SnapshotStateList snapshotStateList = this.f3674;
            snapshotStateList.m2185(i2, i + i2);
            this.f3671 = 0;
            this.f3673 = AbstractC1274.m2232(snapshotStateList);
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
        m2214();
        AbstractC1274.m2225(i, this.f3671);
        return this.f3674.get(this.f3672 + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        m2214();
        int i = this.f3671;
        int i2 = this.f3672;
        Iterator it = AbstractC6087.m11422(i2, i + i2).iterator();
        do {
            C6516 c6516 = (C6516) it;
            if (!c6516.f17827) {
                return -1;
            }
            iNextInt = c6516.nextInt();
        } while (!AbstractC4394.m8917(obj, this.f3674.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f3671 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m2214();
        int i = this.f3671;
        int i2 = this.f3672;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (AbstractC4394.m8917(obj, this.f3674.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m2214();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i - 1;
        return new C1264(ref$IntRef, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m2214();
        int i2 = this.f3672 + i;
        SnapshotStateList snapshotStateList = this.f3674;
        Object objRemove = snapshotStateList.remove(i2);
        this.f3671--;
        this.f3673 = AbstractC1274.m2232(snapshotStateList);
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
        AbstractC7414 abstractC7414;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        m2214();
        SnapshotStateList snapshotStateList = this.f3674;
        int i2 = this.f3672;
        int i3 = this.f3671 + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (AbstractC1274.f3706) {
                C1260 c1260 = snapshotStateList.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            C7410 c7410Mo12603 = abstractC7414.mo12603();
            c7410Mo12603.subList(i2, i3).retainAll(collection);
            AbstractC7414 abstractC7414M12584 = c7410Mo12603.m12584();
            if (AbstractC4394.m8917(abstractC7414M12584, abstractC7414)) {
                break;
            }
            C1260 c12603 = snapshotStateList.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = AbstractC1274.m2224((C1260) AbstractC1280.m2256(c12603, snapshotStateList, abstractC1286M2270), i, abstractC7414M12584, true);
            }
            AbstractC1280.m2259(abstractC1286M2270, snapshotStateList);
        } while (!zM2224);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f3673 = AbstractC1274.m2232(this.f3674);
            this.f3671 -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC1274.m2225(i, this.f3671);
        m2214();
        int i2 = i + this.f3672;
        SnapshotStateList snapshotStateList = this.f3674;
        Object obj2 = snapshotStateList.set(i2, obj);
        this.f3673 = AbstractC1274.m2232(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f3671;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f3671) {
            AbstractC1392.m2528("fromIndex or toIndex are out of bounds");
        }
        m2214();
        int i3 = this.f3672;
        return new C1263(this.f3674, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4381.m8885(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2214() {
        if (AbstractC1274.m2232(this.f3674) == this.f3673) {
            return;
        }
        C0276.m839();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4381.m8884(this, objArr);
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
        m2214();
        int i2 = this.f3672 + i;
        SnapshotStateList snapshotStateList = this.f3674;
        snapshotStateList.add(i2, obj);
        this.f3671++;
        this.f3673 = AbstractC1274.m2232(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f3671, collection);
    }
}
