package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5214;
import p070.InterfaceC7391;
import p138.C8223;
import p138.C8224;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, m151d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class SnapshotStateSet<T> implements Parcelable, InterfaceC2092, Set<T>, RandomAccess, InterfaceC7391 {
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new C2117(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2100 f3990;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        C8224 c8224;
        AbstractC2121 abstractC2121M2840;
        boolean zM2793;
        do {
            synchronized (AbstractC2109.f4050) {
                C2100 c2100 = this.f3990;
                c2100.getClass();
                C2100 c21002 = (C2100) AbstractC2115.m2835(c2100);
                i = c21002.f4024;
                c8224 = c21002.f4025;
            }
            c8224.getClass();
            C8224 c8224M13126 = c8224.m13126(obj);
            if (c8224M13126.equals(c8224)) {
                return false;
            }
            C2100 c21003 = this.f3990;
            c21003.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2793 = AbstractC2109.m2793((C2100) AbstractC2115.m2826(c21003, this, abstractC2121M2840), i, c8224M13126);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2793);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        C8224 c8224;
        AbstractC2121 abstractC2121M2840;
        boolean zM2793;
        do {
            synchronized (AbstractC2109.f4050) {
                C2100 c2100 = this.f3990;
                c2100.getClass();
                C2100 c21002 = (C2100) AbstractC2115.m2835(c2100);
                i = c21002.f4024;
                c8224 = c21002.f4025;
            }
            c8224.getClass();
            C8223 c8223 = new C8223(c8224);
            c8223.addAll(collection);
            C8224 c8224M13124 = c8223.m13124();
            if (c8224M13124.equals(c8224)) {
                return false;
            }
            C2100 c21003 = this.f3990;
            c21003.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2793 = AbstractC2109.m2793((C2100) AbstractC2115.m2826(c21003, this, abstractC2121M2840), i, c8224M13124);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2793);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        AbstractC2121 abstractC2121M2840;
        C2100 c2100 = this.f3990;
        c2100.getClass();
        synchronized (AbstractC2115.f4090) {
            abstractC2121M2840 = AbstractC2115.m2840();
            C2100 c21002 = (C2100) AbstractC2115.m2826(c2100, this, abstractC2121M2840);
            synchronized (AbstractC2109.f4050) {
                c21002.f4025 = C8224.f20392;
                c21002.f4024++;
            }
        }
        AbstractC2115.m2829(abstractC2121M2840, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC2109.m2798(this).f4025.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC2109.m2798(this).f4025.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC2109.m2798(this).f4025.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C2101(this, AbstractC2109.m2798(this).f4025.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C8224 c8224;
        AbstractC2121 abstractC2121M2840;
        boolean zM2793;
        do {
            synchronized (AbstractC2109.f4050) {
                C2100 c2100 = this.f3990;
                c2100.getClass();
                C2100 c21002 = (C2100) AbstractC2115.m2835(c2100);
                i = c21002.f4024;
                c8224 = c21002.f4025;
            }
            c8224.getClass();
            C8224 c8224M13125 = c8224.m13125(obj);
            if (c8224M13125.equals(c8224)) {
                return false;
            }
            C2100 c21003 = this.f3990;
            c21003.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2793 = AbstractC2109.m2793((C2100) AbstractC2115.m2826(c21003, this, abstractC2121M2840), i, c8224M13125);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2793);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        C8224 c8224;
        AbstractC2121 abstractC2121M2840;
        boolean zM2793;
        do {
            synchronized (AbstractC2109.f4050) {
                C2100 c2100 = this.f3990;
                c2100.getClass();
                C2100 c21002 = (C2100) AbstractC2115.m2835(c2100);
                i = c21002.f4024;
                c8224 = c21002.f4025;
            }
            c8224.getClass();
            C8223 c8223 = new C8223(c8224);
            c8223.removeAll(collection);
            C8224 c8224M13124 = c8223.m13124();
            if (c8224M13124.equals(c8224)) {
                return false;
            }
            C2100 c21003 = this.f3990;
            c21003.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2793 = AbstractC2109.m2793((C2100) AbstractC2115.m2826(c21003, this, abstractC2121M2840), i, c8224M13124);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2793);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        C8224 c8224;
        boolean zRetainAll;
        AbstractC2121 abstractC2121M2840;
        boolean zM2793;
        do {
            synchronized (AbstractC2109.f4050) {
                C2100 c2100 = this.f3990;
                c2100.getClass();
                C2100 c21002 = (C2100) AbstractC2115.m2835(c2100);
                i = c21002.f4024;
                c8224 = c21002.f4025;
            }
            if (c8224 == null) {
                C6755.m11870("No set to mutate");
                return false;
            }
            C8223 c8223 = new C8223(c8224);
            zRetainAll = c8223.retainAll(AbstractC5176.m9347(collection));
            C8224 c8224M13124 = c8223.m13124();
            if (c8224M13124.equals(c8224)) {
                break;
            }
            C2100 c21003 = this.f3990;
            c21003.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2793 = AbstractC2109.m2793((C2100) AbstractC2115.m2826(c21003, this, abstractC2121M2840), i, c8224M13124);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2793);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return AbstractC2109.m2798(this).f4025.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC5214.m9434(this);
    }

    public final String toString() {
        C2100 c2100 = this.f3990;
        c2100.getClass();
        return "SnapshotStateSet(value=" + ((C2100) AbstractC2115.m2835(c2100)).f4025 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C8224 c8224 = AbstractC2109.m2798(this).f4025;
        parcel.writeInt(size());
        Iterator it = c8224.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC2090 mo2753() {
        return this.f3990;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2754(AbstractC2090 abstractC2090) {
        abstractC2090.f3991 = this.f3990;
        this.f3990 = (C2100) abstractC2090;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC5214.m9433(this, objArr);
    }
}
