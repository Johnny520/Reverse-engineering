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
import kotlin.jvm.internal.AbstractC4381;
import kotlin.jvm.internal.AbstractC4394;
import p054.InterfaceC6564;
import p124.AbstractC7414;
import p124.C7410;
import p124.C7418;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapshotStateList<T> implements Parcelable, InterfaceC1257, List<T>, RandomAccess, InterfaceC6564 {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new C1282(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1260 f3643;

    public SnapshotStateList(AbstractC7414 abstractC7414) {
        AbstractC1286 abstractC1286M2270 = AbstractC1280.m2270();
        C1260 c1260 = new C1260(abstractC1286M2270.mo2200(), abstractC7414);
        if (!(abstractC1286M2270 instanceof C1272)) {
            c1260.f3645 = new C1260(1L, abstractC7414);
        }
        this.f3643 = c1260;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC7414 abstractC7414;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        do {
            synchronized (AbstractC1274.f3706) {
                C1260 c1260 = this.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            AbstractC7414 abstractC7414Mo12604 = abstractC7414.mo12604(obj);
            if (abstractC7414Mo12604.equals(abstractC7414)) {
                return false;
            }
            C1260 c12603 = this.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = AbstractC1274.m2224((C1260) AbstractC1280.m2256(c12603, this, abstractC1286M2270), i, abstractC7414Mo12604, true);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2224);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC7414 abstractC7414;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        do {
            synchronized (AbstractC1274.f3706) {
                C1260 c1260 = this.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            AbstractC7414 abstractC7414Mo12617 = abstractC7414.mo12617(collection);
            if (AbstractC4394.m8917(abstractC7414Mo12617, abstractC7414)) {
                return false;
            }
            C1260 c12603 = this.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = AbstractC1274.m2224((C1260) AbstractC1280.m2256(c12603, this, abstractC1286M2270), i, abstractC7414Mo12617, true);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2224);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC1286 abstractC1286M2270;
        C1260 c1260 = this.f3643;
        c1260.getClass();
        synchronized (AbstractC1280.f3744) {
            abstractC1286M2270 = AbstractC1280.m2270();
            C1260 c12602 = (C1260) AbstractC1280.m2256(c1260, this, abstractC1286M2270);
            synchronized (AbstractC1274.f3706) {
                c12602.f3659 = C7418.f20115;
                c12602.f3658++;
                c12602.f3657++;
            }
        }
        AbstractC1280.m2259(abstractC1286M2270, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC1274.m2229(this).f3659.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC1274.m2229(this).f3659.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return AbstractC1274.m2229(this).f3659.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC1274.m2229(this).f3659.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC1274.m2229(this).f3659.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC1274.m2229(this).f3659.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C1276(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC7414 abstractC7414;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        do {
            synchronized (AbstractC1274.f3706) {
                C1260 c1260 = this.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            int iIndexOf = abstractC7414.indexOf(obj);
            AbstractC7414 abstractC7414Mo12611 = iIndexOf != -1 ? abstractC7414.mo12611(iIndexOf) : abstractC7414;
            if (abstractC7414Mo12611.equals(abstractC7414)) {
                return false;
            }
            C1260 c12603 = this.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = AbstractC1274.m2224((C1260) AbstractC1280.m2256(c12603, this, abstractC1286M2270), i, abstractC7414Mo12611, true);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2224);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC7414 abstractC7414;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        do {
            synchronized (AbstractC1274.f3706) {
                C1260 c1260 = this.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            AbstractC7414 abstractC7414Mo12612 = abstractC7414.mo12612(new C1284(collection, 1));
            if (AbstractC4394.m8917(abstractC7414Mo12612, abstractC7414)) {
                return false;
            }
            C1260 c12603 = this.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = AbstractC1274.m2224((C1260) AbstractC1280.m2256(c12603, this, abstractC1286M2270), i, abstractC7414Mo12612, true);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2224);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC1274.m2230(this, new C1284(collection, 0));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC7414 abstractC7414;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        Object obj2 = get(i);
        do {
            synchronized (AbstractC1274.f3706) {
                C1260 c1260 = this.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i2 = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            AbstractC7414 abstractC7414Mo12614 = abstractC7414.mo12614(i, obj);
            if (abstractC7414Mo12614.equals(abstractC7414)) {
                break;
            }
            C1260 c12603 = this.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = AbstractC1274.m2224((C1260) AbstractC1280.m2256(c12603, this, abstractC1286M2270), i2, abstractC7414Mo12614, false);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2224);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC1274.m2229(this).f3659.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            AbstractC1392.m2528("fromIndex or toIndex are out of bounds");
        }
        return new C1263(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4381.m8885(this);
    }

    public final String toString() {
        C1260 c1260 = this.f3643;
        c1260.getClass();
        return "SnapshotStateList(value=" + ((C1260) AbstractC1280.m2265(c1260)).f3659 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC7414 abstractC7414 = AbstractC1274.m2229(this).f3659;
        int size = abstractC7414.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(abstractC7414.get(i2));
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC1255 mo2183() {
        return this.f3643;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2184(AbstractC1255 abstractC1255) {
        abstractC1255.f3645 = this.f3643;
        this.f3643 = (C1260) abstractC1255;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2185(int i, int i2) {
        int i3;
        AbstractC7414 abstractC7414;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        do {
            synchronized (AbstractC1274.f3706) {
                C1260 c1260 = this.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i3 = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            C7410 c7410Mo12603 = abstractC7414.mo12603();
            c7410Mo12603.subList(i, i2).clear();
            AbstractC7414 abstractC7414M12584 = c7410Mo12603.m12584();
            if (AbstractC4394.m8917(abstractC7414M12584, abstractC7414)) {
                return;
            }
            C1260 c12603 = this.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = AbstractC1274.m2224((C1260) AbstractC1280.m2256(c12603, this, abstractC1286M2270), i3, abstractC7414M12584, true);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2224);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4381.m8884(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C1276(this, i);
    }

    public SnapshotStateList() {
        this(C7418.f20115);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC7414 abstractC7414;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        do {
            synchronized (AbstractC1274.f3706) {
                C1260 c1260 = this.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i2 = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            AbstractC7414 abstractC7414Mo12605 = abstractC7414.mo12605(i, obj);
            if (abstractC7414Mo12605.equals(abstractC7414)) {
                return;
            }
            C1260 c12603 = this.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = AbstractC1274.m2224((C1260) AbstractC1280.m2256(c12603, this, abstractC1286M2270), i2, abstractC7414Mo12605, true);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2224);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return AbstractC1274.m2230(this, new C1281(collection, i, 0));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC7414 abstractC7414;
        AbstractC1286 abstractC1286M2270;
        boolean zM2224;
        Object obj = get(i);
        do {
            synchronized (AbstractC1274.f3706) {
                C1260 c1260 = this.f3643;
                c1260.getClass();
                C1260 c12602 = (C1260) AbstractC1280.m2265(c1260);
                i2 = c12602.f3658;
                abstractC7414 = c12602.f3659;
            }
            abstractC7414.getClass();
            AbstractC7414 abstractC7414Mo12611 = abstractC7414.mo12611(i);
            if (abstractC7414Mo12611.equals(abstractC7414)) {
                break;
            }
            C1260 c12603 = this.f3643;
            c12603.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2224 = AbstractC1274.m2224((C1260) AbstractC1280.m2256(c12603, this, abstractC1286M2270), i2, abstractC7414Mo12611, true);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2224);
        return obj;
    }
}
