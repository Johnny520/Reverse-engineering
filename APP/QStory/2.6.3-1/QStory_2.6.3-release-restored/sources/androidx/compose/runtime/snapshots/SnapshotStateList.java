package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.AbstractC2227;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.AbstractC5227;
import p070.InterfaceC7394;
import p140.AbstractC8244;
import p140.C8240;
import p140.C8248;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006¨\u0006\u0007"}, m151d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Landroidx/compose/runtime/snapshots/飘花落叶言子世楪哲兰苏;", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "runtime"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
public final class SnapshotStateList<T> implements Parcelable, InterfaceC2092, List<T>, RandomAccess, InterfaceC7394 {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new C2117(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public C2095 f3989;

    public SnapshotStateList(AbstractC8244 abstractC8244) {
        AbstractC2121 abstractC2121M2840 = AbstractC2115.m2840();
        C2095 c2095 = new C2095(abstractC2121M2840.mo2770(), abstractC8244);
        if (!(abstractC2121M2840 instanceof C2107)) {
            c2095.f3991 = new C2095(1L, abstractC8244);
        }
        this.f3989 = c2095;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC8244 abstractC8244;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        do {
            synchronized (AbstractC2109.f4052) {
                C2095 c2095 = this.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            AbstractC8244 abstractC8244Mo13190 = abstractC8244.mo13190(obj);
            if (abstractC8244Mo13190.equals(abstractC8244)) {
                return false;
            }
            C2095 c20953 = this.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = AbstractC2109.m2794((C2095) AbstractC2115.m2826(c20953, this, abstractC2121M2840), i, abstractC8244Mo13190, true);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2794);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC8244 abstractC8244;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        do {
            synchronized (AbstractC2109.f4052) {
                C2095 c2095 = this.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            AbstractC8244 abstractC8244Mo13203 = abstractC8244.mo13203(collection);
            if (AbstractC5227.m9466(abstractC8244Mo13203, abstractC8244)) {
                return false;
            }
            C2095 c20953 = this.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = AbstractC2109.m2794((C2095) AbstractC2115.m2826(c20953, this, abstractC2121M2840), i, abstractC8244Mo13203, true);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2794);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC2121 abstractC2121M2840;
        C2095 c2095 = this.f3989;
        c2095.getClass();
        synchronized (AbstractC2115.f4090) {
            abstractC2121M2840 = AbstractC2115.m2840();
            C2095 c20952 = (C2095) AbstractC2115.m2826(c2095, this, abstractC2121M2840);
            synchronized (AbstractC2109.f4052) {
                c20952.f4005 = C8248.f20455;
                c20952.f4004++;
                c20952.f4003++;
            }
        }
        AbstractC2115.m2829(abstractC2121M2840, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC2109.m2799(this).f4005.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC2109.m2799(this).f4005.containsAll(collection);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return AbstractC2109.m2799(this).f4005.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC2109.m2799(this).f4005.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC2109.m2799(this).f4005.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC2109.m2799(this).f4005.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2111(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC8244 abstractC8244;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        do {
            synchronized (AbstractC2109.f4052) {
                C2095 c2095 = this.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            int iIndexOf = abstractC8244.indexOf(obj);
            AbstractC8244 abstractC8244Mo13197 = iIndexOf != -1 ? abstractC8244.mo13197(iIndexOf) : abstractC8244;
            if (abstractC8244Mo13197.equals(abstractC8244)) {
                return false;
            }
            C2095 c20953 = this.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = AbstractC2109.m2794((C2095) AbstractC2115.m2826(c20953, this, abstractC2121M2840), i, abstractC8244Mo13197, true);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2794);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC8244 abstractC8244;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        do {
            synchronized (AbstractC2109.f4052) {
                C2095 c2095 = this.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            AbstractC8244 abstractC8244Mo13198 = abstractC8244.mo13198(new C2119(collection, 1));
            if (AbstractC5227.m9466(abstractC8244Mo13198, abstractC8244)) {
                return false;
            }
            C2095 c20953 = this.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = AbstractC2109.m2794((C2095) AbstractC2115.m2826(c20953, this, abstractC2121M2840), i, abstractC8244Mo13198, true);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2794);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC2109.m2800(this, new C2119(collection, 0));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC8244 abstractC8244;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        Object obj2 = get(i);
        do {
            synchronized (AbstractC2109.f4052) {
                C2095 c2095 = this.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i2 = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            AbstractC8244 abstractC8244Mo13200 = abstractC8244.mo13200(i, obj);
            if (abstractC8244Mo13200.equals(abstractC8244)) {
                break;
            }
            C2095 c20953 = this.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = AbstractC2109.m2794((C2095) AbstractC2115.m2826(c20953, this, abstractC2121M2840), i2, abstractC8244Mo13200, false);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2794);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC2109.m2799(this).f4005.size();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            AbstractC2227.m3098("fromIndex or toIndex are out of bounds");
        }
        return new C2098(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC5214.m9434(this);
    }

    public final String toString() {
        C2095 c2095 = this.f3989;
        c2095.getClass();
        return "SnapshotStateList(value=" + ((C2095) AbstractC2115.m2835(c2095)).f4005 + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC8244 abstractC8244 = AbstractC2109.m2799(this).f4005;
        int size = abstractC8244.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeValue(abstractC8244.get(i2));
        }
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2090 mo2753() {
        return this.f3989;
    }

    @Override // androidx.compose.runtime.snapshots.InterfaceC2092
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2754(AbstractC2090 abstractC2090) {
        abstractC2090.f3991 = this.f3989;
        this.f3989 = (C2095) abstractC2090;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m2755(int i, int i2) {
        int i3;
        AbstractC8244 abstractC8244;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        do {
            synchronized (AbstractC2109.f4052) {
                C2095 c2095 = this.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i3 = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            C8240 c8240Mo13189 = abstractC8244.mo13189();
            c8240Mo13189.subList(i, i2).clear();
            AbstractC8244 abstractC8244M13169 = c8240Mo13189.m13169();
            if (AbstractC5227.m9466(abstractC8244M13169, abstractC8244)) {
                return;
            }
            C2095 c20953 = this.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = AbstractC2109.m2794((C2095) AbstractC2115.m2826(c20953, this, abstractC2121M2840), i3, abstractC8244M13169, true);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2794);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC5214.m9433(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C2111(this, i);
    }

    public SnapshotStateList() {
        this(C8248.f20455);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC8244 abstractC8244;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        do {
            synchronized (AbstractC2109.f4052) {
                C2095 c2095 = this.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i2 = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            AbstractC8244 abstractC8244Mo13191 = abstractC8244.mo13191(i, obj);
            if (abstractC8244Mo13191.equals(abstractC8244)) {
                return;
            }
            C2095 c20953 = this.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = AbstractC2109.m2794((C2095) AbstractC2115.m2826(c20953, this, abstractC2121M2840), i2, abstractC8244Mo13191, true);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2794);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return AbstractC2109.m2800(this, new C2116(collection, i, 0));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC8244 abstractC8244;
        AbstractC2121 abstractC2121M2840;
        boolean zM2794;
        Object obj = get(i);
        do {
            synchronized (AbstractC2109.f4052) {
                C2095 c2095 = this.f3989;
                c2095.getClass();
                C2095 c20952 = (C2095) AbstractC2115.m2835(c2095);
                i2 = c20952.f4004;
                abstractC8244 = c20952.f4005;
            }
            abstractC8244.getClass();
            AbstractC8244 abstractC8244Mo13197 = abstractC8244.mo13197(i);
            if (abstractC8244Mo13197.equals(abstractC8244)) {
                break;
            }
            C2095 c20953 = this.f3989;
            c20953.getClass();
            synchronized (AbstractC2115.f4090) {
                abstractC2121M2840 = AbstractC2115.m2840();
                zM2794 = AbstractC2109.m2794((C2095) AbstractC2115.m2826(c20953, this, abstractC2121M2840), i2, abstractC8244Mo13197, true);
            }
            AbstractC2115.m2829(abstractC2121M2840, this);
        } while (!zM2794);
        return obj;
    }
}
