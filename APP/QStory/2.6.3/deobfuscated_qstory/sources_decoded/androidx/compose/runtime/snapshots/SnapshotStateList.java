package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.AbstractC1392;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4382;
import kotlin.jvm.internal.AbstractC4395;
import p054.InterfaceC6565;
import p124.AbstractC7415;
import p124.C7411;
import p124.C7419;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapshotStateList<T> implements Parcelable, InterfaceC1257, List<T>, RandomAccess, InterfaceC6565 {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new C1282(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1260 f3644;

    public SnapshotStateList(AbstractC7415 abstractC7415) {
        AbstractC1286 abstractC1286M2280 = AbstractC1280.m2280();
        C1260 c1260 = new C1260(abstractC1286M2280.mo2210(), abstractC7415);
        if (!(abstractC1286M2280 instanceof C1272)) {
            c1260.f3646 = new C1260(1L, abstractC7415);
        }
        this.f3644 = c1260;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC7415 abstractC7415;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        do {
            synchronized (AbstractC1274.f3707) {
                C1260 c1260 = this.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            AbstractC7415 abstractC7415Mo12631 = abstractC7415.mo12631(obj);
            if (abstractC7415Mo12631.equals(abstractC7415)) {
                return false;
            }
            C1260 c12603 = this.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = AbstractC1274.m2234((C1260) AbstractC1280.m2266(c12603, this, abstractC1286M2280), i, abstractC7415Mo12631, true);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2234);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC7415 abstractC7415;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        do {
            synchronized (AbstractC1274.f3707) {
                C1260 c1260 = this.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            AbstractC7415 abstractC7415Mo12644 = abstractC7415.mo12644(collection);
            if (AbstractC4395.m8907(abstractC7415Mo12644, abstractC7415)) {
                return false;
            }
            C1260 c12603 = this.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = AbstractC1274.m2234((C1260) AbstractC1280.m2266(c12603, this, abstractC1286M2280), i, abstractC7415Mo12644, true);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2234);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC1286 abstractC1286M2280;
        C1260 c1260 = this.f3644;
        c1260.getClass();
        synchronized (AbstractC1280.f3745) {
            abstractC1286M2280 = AbstractC1280.m2280();
            C1260 c12602 = (C1260) AbstractC1280.m2266(c1260, this, abstractC1286M2280);
            synchronized (AbstractC1274.f3707) {
                c12602.f3660 = C7419.f20110;
                c12602.f3659++;
                c12602.f3658++;
            }
        }
        AbstractC1280.m2269(abstractC1286M2280, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC1274.m2239(this).f3660.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC1274.m2239(this).f3660.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return AbstractC1274.m2239(this).f3660.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC1274.m2239(this).f3660.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC1274.m2239(this).f3660.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC1274.m2239(this).f3660.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C1276(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC7415 abstractC7415;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        do {
            synchronized (AbstractC1274.f3707) {
                C1260 c1260 = this.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            int iIndexOf = abstractC7415.indexOf(obj);
            AbstractC7415 abstractC7415Mo12638 = iIndexOf != -1 ? abstractC7415.mo12638(iIndexOf) : abstractC7415;
            if (abstractC7415Mo12638.equals(abstractC7415)) {
                return false;
            }
            C1260 c12603 = this.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = AbstractC1274.m2234((C1260) AbstractC1280.m2266(c12603, this, abstractC1286M2280), i, abstractC7415Mo12638, true);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2234);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC7415 abstractC7415;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        do {
            synchronized (AbstractC1274.f3707) {
                C1260 c1260 = this.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            AbstractC7415 abstractC7415Mo12639 = abstractC7415.mo12639(new C1284(collection, 1));
            if (AbstractC4395.m8907(abstractC7415Mo12639, abstractC7415)) {
                return false;
            }
            C1260 c12603 = this.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = AbstractC1274.m2234((C1260) AbstractC1280.m2266(c12603, this, abstractC1286M2280), i, abstractC7415Mo12639, true);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2234);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC1274.m2240(this, new C1284(collection, 0));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC7415 abstractC7415;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        Object obj2 = get(i);
        do {
            synchronized (AbstractC1274.f3707) {
                C1260 c1260 = this.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i2 = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            AbstractC7415 abstractC7415Mo12641 = abstractC7415.mo12641(i, obj);
            if (abstractC7415Mo12641.equals(abstractC7415)) {
                break;
            }
            C1260 c12603 = this.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = AbstractC1274.m2234((C1260) AbstractC1280.m2266(c12603, this, abstractC1286M2280), i2, abstractC7415Mo12641, false);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2234);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC1274.m2239(this).f3660.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            AbstractC1392.m2538("fromIndex or toIndex are out of bounds");
        }
        return new C1263(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4382.m8875(this);
    }

    public final String toString() {
        C1260 c1260 = this.f3644;
        c1260.getClass();
        return "SnapshotStateList(value=" + ((C1260) AbstractC1280.m2275(c1260)).f3660 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC7415 abstractC7415 = AbstractC1274.m2239(this).f3660;
        int size = abstractC7415.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(abstractC7415.get(i2));
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC1255 mo2193() {
        return this.f3644;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2194(AbstractC1255 abstractC1255) {
        abstractC1255.f3646 = this.f3644;
        this.f3644 = (C1260) abstractC1255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2195(int i, int i2) {
        int i3;
        AbstractC7415 abstractC7415;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        do {
            synchronized (AbstractC1274.f3707) {
                C1260 c1260 = this.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i3 = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            C7411 c7411Mo12630 = abstractC7415.mo12630();
            c7411Mo12630.subList(i, i2).clear();
            AbstractC7415 abstractC7415M12610 = c7411Mo12630.m12610();
            if (AbstractC4395.m8907(abstractC7415M12610, abstractC7415)) {
                return;
            }
            C1260 c12603 = this.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = AbstractC1274.m2234((C1260) AbstractC1280.m2266(c12603, this, abstractC1286M2280), i3, abstractC7415M12610, true);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2234);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4382.m8874(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C1276(this, i);
    }

    public SnapshotStateList() {
        this(C7419.f20110);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC7415 abstractC7415;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        do {
            synchronized (AbstractC1274.f3707) {
                C1260 c1260 = this.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i2 = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            AbstractC7415 abstractC7415Mo12632 = abstractC7415.mo12632(i, obj);
            if (abstractC7415Mo12632.equals(abstractC7415)) {
                return;
            }
            C1260 c12603 = this.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = AbstractC1274.m2234((C1260) AbstractC1280.m2266(c12603, this, abstractC1286M2280), i2, abstractC7415Mo12632, true);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2234);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return AbstractC1274.m2240(this, new C1281(collection, i, 0));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC7415 abstractC7415;
        AbstractC1286 abstractC1286M2280;
        boolean zM2234;
        Object obj = get(i);
        do {
            synchronized (AbstractC1274.f3707) {
                C1260 c1260 = this.f3644;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2275(c1260);
                i2 = c12602.f3659;
                abstractC7415 = c12602.f3660;
            }
            abstractC7415.getClass();
            AbstractC7415 abstractC7415Mo12638 = abstractC7415.mo12638(i);
            if (abstractC7415Mo12638.equals(abstractC7415)) {
                break;
            }
            C1260 c12603 = this.f3644;
            c12603.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2234 = AbstractC1274.m2234((C1260) AbstractC1280.m2266(c12603, this, abstractC1286M2280), i2, abstractC7415Mo12638, true);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2234);
        return obj;
    }
}
