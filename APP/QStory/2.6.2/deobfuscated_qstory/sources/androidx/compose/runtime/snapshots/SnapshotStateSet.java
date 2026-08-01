package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4381;
import p054.InterfaceC6561;
import p122.C7393;
import p122.C7394;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SnapshotStateSet<T> implements Parcelable, InterfaceC1257, Set<T>, RandomAccess, InterfaceC6561 {
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new C1282(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C1265 f3644;

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        C7394 c7394;
        AbstractC1286 abstractC1286M2270;
        boolean zM2223;
        do {
            synchronized (AbstractC1274.f3704) {
                C1265 c1265 = this.f3644;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2265(c1265);
                i = c12652.f3678;
                c7394 = c12652.f3679;
            }
            c7394.getClass();
            C7394 c7394M12540 = c7394.m12540(obj);
            if (c7394M12540.equals(c7394)) {
                return false;
            }
            C1265 c12653 = this.f3644;
            c12653.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2223 = AbstractC1274.m2223((C1265) AbstractC1280.m2256(c12653, this, abstractC1286M2270), i, c7394M12540);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2223);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        C7394 c7394;
        AbstractC1286 abstractC1286M2270;
        boolean zM2223;
        do {
            synchronized (AbstractC1274.f3704) {
                C1265 c1265 = this.f3644;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2265(c1265);
                i = c12652.f3678;
                c7394 = c12652.f3679;
            }
            c7394.getClass();
            C7393 c7393 = new C7393(c7394);
            c7393.addAll(collection);
            C7394 c7394M12538 = c7393.m12538();
            if (c7394M12538.equals(c7394)) {
                return false;
            }
            C1265 c12653 = this.f3644;
            c12653.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2223 = AbstractC1274.m2223((C1265) AbstractC1280.m2256(c12653, this, abstractC1286M2270), i, c7394M12538);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2223);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        AbstractC1286 abstractC1286M2270;
        C1265 c1265 = this.f3644;
        c1265.getClass();
        synchronized (AbstractC1280.f3744) {
            abstractC1286M2270 = AbstractC1280.m2270();
            C1265 c12652 = (C1265) AbstractC1280.m2256(c1265, this, abstractC1286M2270);
            synchronized (AbstractC1274.f3704) {
                c12652.f3679 = C7394.f20052;
                c12652.f3678++;
            }
        }
        AbstractC1280.m2259(abstractC1286M2270, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC1274.m2228(this).f3679.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC1274.m2228(this).f3679.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC1274.m2228(this).f3679.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C1266(this, AbstractC1274.m2228(this).f3679.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        C7394 c7394;
        AbstractC1286 abstractC1286M2270;
        boolean zM2223;
        do {
            synchronized (AbstractC1274.f3704) {
                C1265 c1265 = this.f3644;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2265(c1265);
                i = c12652.f3678;
                c7394 = c12652.f3679;
            }
            c7394.getClass();
            C7394 c7394M12539 = c7394.m12539(obj);
            if (c7394M12539.equals(c7394)) {
                return false;
            }
            C1265 c12653 = this.f3644;
            c12653.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2223 = AbstractC1274.m2223((C1265) AbstractC1280.m2256(c12653, this, abstractC1286M2270), i, c7394M12539);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2223);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        C7394 c7394;
        AbstractC1286 abstractC1286M2270;
        boolean zM2223;
        do {
            synchronized (AbstractC1274.f3704) {
                C1265 c1265 = this.f3644;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2265(c1265);
                i = c12652.f3678;
                c7394 = c12652.f3679;
            }
            c7394.getClass();
            C7393 c7393 = new C7393(c7394);
            c7393.removeAll(collection);
            C7394 c7394M12538 = c7393.m12538();
            if (c7394M12538.equals(c7394)) {
                return false;
            }
            C1265 c12653 = this.f3644;
            c12653.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2223 = AbstractC1274.m2223((C1265) AbstractC1280.m2256(c12653, this, abstractC1286M2270), i, c7394M12538);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2223);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        C7394 c7394;
        boolean zRetainAll;
        AbstractC1286 abstractC1286M2270;
        boolean zM2223;
        do {
            synchronized (AbstractC1274.f3704) {
                C1265 c1265 = this.f3644;
                c1265.getClass();
                C1265 c12652 = (C1265) AbstractC1280.m2265(c1265);
                i = c12652.f3678;
                c7394 = c12652.f3679;
            }
            if (c7394 == null) {
                C5919.m11250("No set to mutate");
                return false;
            }
            C7393 c7393 = new C7393(c7394);
            zRetainAll = c7393.retainAll(AbstractC4343.m8800(collection));
            C7394 c7394M12538 = c7393.m12538();
            if (c7394M12538.equals(c7394)) {
                break;
            }
            C1265 c12653 = this.f3644;
            c12653.getClass();
            synchronized (AbstractC1280.f3744) {
                abstractC1286M2270 = AbstractC1280.m2270();
                zM2223 = AbstractC1274.m2223((C1265) AbstractC1280.m2256(c12653, this, abstractC1286M2270), i, c7394M12538);
            }
            AbstractC1280.m2259(abstractC1286M2270, this);
        } while (!zM2223);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return AbstractC1274.m2228(this).f3679.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4381.m8885(this);
    }

    public final String toString() {
        C1265 c1265 = this.f3644;
        c1265.getClass();
        return "SnapshotStateSet(value=" + ((C1265) AbstractC1280.m2265(c1265)).f3679 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C7394 c7394 = AbstractC1274.m2228(this).f3679;
        parcel.writeInt(size());
        Iterator it = c7394.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final AbstractC1255 mo2183() {
        return this.f3644;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC1257
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo2184(AbstractC1255 abstractC1255) {
        abstractC1255.f3645 = this.f3644;
        this.f3644 = (C1265) abstractC1255;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4381.m8884(this, objArr);
    }
}
