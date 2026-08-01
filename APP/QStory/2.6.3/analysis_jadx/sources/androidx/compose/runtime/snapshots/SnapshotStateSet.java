package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4382;
import p054.InterfaceC6562;
import p122.C7394;
import p122.C7395;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapshotStateSet<T> implements Parcelable, InterfaceC1257, Set<T>, RandomAccess, InterfaceC6562 {
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new C1282(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1265 f3645;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        C7395 c7395;
        AbstractC1286 abstractC1286M2280;
        boolean zM2233;
        do {
            synchronized (AbstractC1274.f3705) {
                C1265 c1265 = this.f3645;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2275(c1265);
                i = c12652.f3679;
                c7395 = c12652.f3680;
            }
            c7395.getClass();
            C7395 c7395M12567 = c7395.m12567(obj);
            if (c7395M12567.equals(c7395)) {
                return false;
            }
            C1265 c12653 = this.f3645;
            c12653.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2233 = AbstractC1274.m2233((C1265) AbstractC1280.m2266(c12653, this, abstractC1286M2280), i, c7395M12567);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2233);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        C7395 c7395;
        AbstractC1286 abstractC1286M2280;
        boolean zM2233;
        do {
            synchronized (AbstractC1274.f3705) {
                C1265 c1265 = this.f3645;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2275(c1265);
                i = c12652.f3679;
                c7395 = c12652.f3680;
            }
            c7395.getClass();
            C7394 c7394 = new C7394(c7395);
            c7394.addAll(collection);
            C7395 c7395M12565 = c7394.m12565();
            if (c7395M12565.equals(c7395)) {
                return false;
            }
            C1265 c12653 = this.f3645;
            c12653.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2233 = AbstractC1274.m2233((C1265) AbstractC1280.m2266(c12653, this, abstractC1286M2280), i, c7395M12565);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2233);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        AbstractC1286 abstractC1286M2280;
        C1265 c1265 = this.f3645;
        c1265.getClass();
        synchronized (AbstractC1280.f3745) {
            abstractC1286M2280 = AbstractC1280.m2280();
            C1265 c12652 = (C1265) AbstractC1280.m2266(c1265, this, abstractC1286M2280);
            synchronized (AbstractC1274.f3705) {
                c12652.f3680 = C7395.f20047;
                c12652.f3679++;
            }
        }
        AbstractC1280.m2269(abstractC1286M2280, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC1274.m2238(this).f3680.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC1274.m2238(this).f3680.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC1274.m2238(this).f3680.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1266(this, AbstractC1274.m2238(this).f3680.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C7395 c7395;
        AbstractC1286 abstractC1286M2280;
        boolean zM2233;
        do {
            synchronized (AbstractC1274.f3705) {
                C1265 c1265 = this.f3645;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2275(c1265);
                i = c12652.f3679;
                c7395 = c12652.f3680;
            }
            c7395.getClass();
            C7395 c7395M12566 = c7395.m12566(obj);
            if (c7395M12566.equals(c7395)) {
                return false;
            }
            C1265 c12653 = this.f3645;
            c12653.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2233 = AbstractC1274.m2233((C1265) AbstractC1280.m2266(c12653, this, abstractC1286M2280), i, c7395M12566);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2233);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        C7395 c7395;
        AbstractC1286 abstractC1286M2280;
        boolean zM2233;
        do {
            synchronized (AbstractC1274.f3705) {
                C1265 c1265 = this.f3645;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2275(c1265);
                i = c12652.f3679;
                c7395 = c12652.f3680;
            }
            c7395.getClass();
            C7394 c7394 = new C7394(c7395);
            c7394.removeAll(collection);
            C7395 c7395M12565 = c7394.m12565();
            if (c7395M12565.equals(c7395)) {
                return false;
            }
            C1265 c12653 = this.f3645;
            c12653.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2233 = AbstractC1274.m2233((C1265) AbstractC1280.m2266(c12653, this, abstractC1286M2280), i, c7395M12565);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2233);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        C7395 c7395;
        boolean zRetainAll;
        AbstractC1286 abstractC1286M2280;
        boolean zM2233;
        do {
            synchronized (AbstractC1274.f3705) {
                C1265 c1265 = this.f3645;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2275(c1265);
                i = c12652.f3679;
                c7395 = c12652.f3680;
            }
            if (c7395 == null) {
                C5925.m11311("No set to mutate");
                return false;
            }
            C7394 c7394 = new C7394(c7395);
            zRetainAll = c7394.retainAll(AbstractC4344.m8788(collection));
            C7395 c7395M12565 = c7394.m12565();
            if (c7395M12565.equals(c7395)) {
                break;
            }
            C1265 c12653 = this.f3645;
            c12653.getClass();
            synchronized (AbstractC1280.f3745) {
                abstractC1286M2280 = AbstractC1280.m2280();
                zM2233 = AbstractC1274.m2233((C1265) AbstractC1280.m2266(c12653, this, abstractC1286M2280), i, c7395M12565);
            }
            AbstractC1280.m2269(abstractC1286M2280, this);
        } while (!zM2233);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return AbstractC1274.m2238(this).f3680.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4382.m8875(this);
    }

    public final String toString() {
        C1265 c1265 = this.f3645;
        c1265.getClass();
        return "SnapshotStateSet(value=" + ((C1265) AbstractC1280.m2275(c1265)).f3680 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7395 c7395 = AbstractC1274.m2238(this).f3680;
        parcel.writeInt(size());
        Iterator it = c7395.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2193() {
        return this.f3645;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2194(AbstractC1255 abstractC1255) {
        abstractC1255.f3646 = this.f3645;
        this.f3645 = (C1265) abstractC1255;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4382.m8874(this, objArr);
    }
}
