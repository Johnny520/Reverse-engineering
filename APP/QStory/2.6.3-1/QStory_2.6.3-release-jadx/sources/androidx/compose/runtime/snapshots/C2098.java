package androidx.compose.runtime.snapshots;

import androidx.collection.C1123;
import androidx.compose.runtime.AbstractC2227;
import androidx.window.area.AbstractC3400;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.Ref$IntRef;
import p064.C7346;
import p070.InterfaceC7394;
import p140.AbstractC8244;
import p140.C8240;

/* JADX INFO: renamed from: androidx.compose.runtime.snapshots.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2098 implements List, InterfaceC7394 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f4017;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f4018;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f4019;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final SnapshotStateList f4020;

    public C2098(SnapshotStateList snapshotStateList, int i, int i2) {
        this.f4020 = snapshotStateList;
        this.f4018 = i;
        this.f4019 = AbstractC2109.m2802(snapshotStateList);
        this.f4017 = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        m2784();
        int i = this.f4018 + this.f4017;
        SnapshotStateList snapshotStateList = this.f4020;
        snapshotStateList.add(i, obj);
        this.f4017++;
        this.f4019 = AbstractC2109.m2802(snapshotStateList);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        m2784();
        int i2 = i + this.f4018;
        SnapshotStateList snapshotStateList = this.f4020;
        boolean zAddAll = snapshotStateList.addAll(i2, collection);
        if (zAddAll) {
            this.f4017 = collection.size() + this.f4017;
            this.f4019 = AbstractC2109.m2802(snapshotStateList);
        }
        return zAddAll;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.f4017 > 0) {
            m2784();
            int i = this.f4017;
            int i2 = this.f4018;
            SnapshotStateList snapshotStateList = this.f4020;
            snapshotStateList.m2755(i2, i + i2);
            this.f4017 = 0;
            this.f4019 = AbstractC2109.m2802(snapshotStateList);
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
        m2784();
        AbstractC2109.m2795(i, this.f4017);
        return this.f4020.get(this.f4018 + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iNextInt;
        m2784();
        int i = this.f4017;
        int i2 = this.f4018;
        Iterator it = AbstractC3400.m5627(i2, i + i2).iterator();
        do {
            C7346 c7346 = (C7346) it;
            if (!c7346.f18168) {
                return -1;
            }
            iNextInt = c7346.nextInt();
        } while (!AbstractC5227.m9466(obj, this.f4020.get(iNextInt)));
        return iNextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.f4017 == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        m2784();
        int i = this.f4017;
        int i2 = this.f4018;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (AbstractC5227.m9466(obj, this.f4020.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        m2784();
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i - 1;
        return new C2099(ref$IntRef, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        m2784();
        int i2 = this.f4018 + i;
        SnapshotStateList snapshotStateList = this.f4020;
        Object objRemove = snapshotStateList.remove(i2);
        this.f4017--;
        this.f4019 = AbstractC2109.m2802(snapshotStateList);
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
        AbstractC8244 abstractC8244;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        m2784();
        SnapshotStateList snapshotStateList = this.f4020;
        int i2 = this.f4018;
        int i3 = this.f4017 + i2;
        int size = snapshotStateList.size();
        do {
            synchronized (AbstractC2109.f4052) {
                C2095 c2095 = snapshotStateList.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            C8240 c8240Mo13189 = abstractC8244.mo13189();
            c8240Mo13189.subList(i2, i3).retainAll(collection);
            AbstractC8244 abstractC8244M13169 = c8240Mo13189.m13169();
            if (AbstractC5227.m9466(abstractC8244M13169, abstractC8244)) {
                break;
            }
            C2095 c20953 = snapshotStateList.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = AbstractC2109.m2794((C2095) AbstractC2115.m2826(c20953, snapshotStateList, abstractC2121M2840), i, abstractC8244M13169, true);
            }
            AbstractC2115.m2829(abstractC2121M2840, snapshotStateList);
        } while (!zM2794);
        int size2 = size - snapshotStateList.size();
        if (size2 > 0) {
            this.f4019 = AbstractC2109.m2802(this.f4020);
            this.f4017 -= size2;
        }
        return size2 > 0;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        AbstractC2109.m2795(i, this.f4017);
        m2784();
        int i2 = i + this.f4018;
        SnapshotStateList snapshotStateList = this.f4020;
        Object obj2 = snapshotStateList.set(i2, obj);
        this.f4019 = AbstractC2109.m2802(snapshotStateList);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.f4017;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.f4017) {
            AbstractC2227.m3098("fromIndex or toIndex are out of bounds");
        }
        m2784();
        int i3 = this.f4018;
        return new C2098(this.f4020, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC5214.m9434(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2784() {
        if (AbstractC2109.m2802(this.f4020) == this.f4019) {
            return;
        }
        C1123.m1400();
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC5214.m9433(this, objArr);
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
        m2784();
        int i2 = this.f4018 + i;
        SnapshotStateList snapshotStateList = this.f4020;
        snapshotStateList.add(i2, obj);
        this.f4017++;
        this.f4019 = AbstractC2109.m2802(snapshotStateList);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.f4017, collection);
    }
}
