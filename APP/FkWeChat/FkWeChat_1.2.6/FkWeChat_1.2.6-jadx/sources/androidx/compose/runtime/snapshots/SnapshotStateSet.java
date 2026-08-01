package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1405f;
import p119i1.AbstractC3137l;
import p119i1.AbstractC3142n0;
import p119i1.AbstractC3159w;
import p119i1.AbstractC3162x0;
import p119i1.C3164y0;
import p119i1.C3166z0;
import p119i1.InterfaceC3158v0;
import p172l8.C4700i0;
import p185m8.AbstractC5081g0;
import p364z0.AbstractC9823a;
import p364z0.InterfaceC9829g;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 6*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u00017B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u0014J\u001d\u0010\"\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u000bH\u0016¢\u0006\u0004\b#\u0010\bJ\u0017\u0010$\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010\u0014J\u001d\u0010%\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b%\u0010\u0018J\u001d\u0010&\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b&\u0010\u0018J\u001f\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010.R$\u00103\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010.¨\u00068"}, m16758d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateSet;", "T", "Landroid/os/Parcelable;", "Li1/v0;", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "<init>", "()V", "Li1/x0;", "value", "Ll8/i0;", "o", "(Li1/x0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "p", "()Ljava/util/Set;", "element", _UrlKt.FRAGMENT_ENCODE_SET, "contains", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", _UrlKt.FRAGMENT_ENCODE_SET, "iterator", "()Ljava/util/Iterator;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "add", "addAll", "clear", "remove", "removeAll", "retainAll", "Landroid/os/Parcel;", "parcel", _UrlKt.FRAGMENT_ENCODE_SET, "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "q", "Li1/x0;", "e", "()Li1/x0;", "firstStateRecord", "c", "size", "r", "b", "runtime"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class SnapshotStateSet<T> implements Parcelable, InterfaceC3158v0, Set<T>, RandomAccess, InterfaceC1405f {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public AbstractC3162x0 firstStateRecord = AbstractC3142n0.m11820f(this, AbstractC9823a.m38174c());
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new C0588a();

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateSet$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C0588a implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet createFromParcel(Parcel parcel, ClassLoader classLoader) {
            SnapshotStateSet snapshotStateSet = new SnapshotStateSet();
            if (classLoader == null) {
                classLoader = SnapshotStateSet.class.getClassLoader();
            }
            int i10 = parcel.readInt();
            for (int i11 = 0; i11 < i10; i11++) {
                snapshotStateSet.add(parcel.readValue(classLoader));
            }
            return snapshotStateSet;
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SnapshotStateSet[] newArray(int i10) {
            return new SnapshotStateSet[i10];
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2212a(Collection collection, Set set) {
        return set.retainAll(AbstractC5081g0.m20564c1(collection));
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object element) {
        int iM11951i;
        InterfaceC9829g interfaceC9829gM11952j;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11816b;
        do {
            synchronized (AbstractC3142n0.f8381a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3166z0 c3166z0 = (C3166z0) AbstractC3159w.m11880I((C3166z0) firstStateRecord);
                iM11951i = c3166z0.m11951i();
                interfaceC9829gM11952j = c3166z0.m11952j();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9829gM11952j.getClass();
            InterfaceC9829g interfaceC9829gAdd = interfaceC9829gM11952j.add(element);
            if (AbstractC1061t.m3842c(interfaceC9829gAdd, interfaceC9829gM11952j)) {
                return false;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3166z0 c3166z02 = (C3166z0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11816b = AbstractC3142n0.m11816b((C3166z0) AbstractC3159w.m11917j0(c3166z02, this, abstractC3137lM11764c), iM11951i, interfaceC9829gAdd);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11816b);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection elements) {
        int iM11951i;
        InterfaceC9829g interfaceC9829gM11952j;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11816b;
        do {
            synchronized (AbstractC3142n0.f8381a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3166z0 c3166z0 = (C3166z0) AbstractC3159w.m11880I((C3166z0) firstStateRecord);
                iM11951i = c3166z0.m11951i();
                interfaceC9829gM11952j = c3166z0.m11952j();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9829gM11952j.getClass();
            InterfaceC9829g interfaceC9829gAddAll = interfaceC9829gM11952j.addAll(elements);
            if (AbstractC1061t.m3842c(interfaceC9829gAddAll, interfaceC9829gM11952j)) {
                return false;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3166z0 c3166z02 = (C3166z0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11816b = AbstractC3142n0.m11816b((C3166z0) AbstractC3159w.m11917j0(c3166z02, this, abstractC3137lM11764c), iM11951i, interfaceC9829gAddAll);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11816b);
        return true;
    }

    /* JADX INFO: renamed from: c */
    public int m2213c() {
        return AbstractC3142n0.m11818d(this).m11952j().size();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        AbstractC3137l abstractC3137lM11764c;
        AbstractC3162x0 firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        C3166z0 c3166z0 = (C3166z0) firstStateRecord;
        synchronized (AbstractC3159w.m11883L()) {
            abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
            C3166z0 c3166z02 = (C3166z0) AbstractC3159w.m11917j0(c3166z0, this, abstractC3137lM11764c);
            synchronized (AbstractC3142n0.f8381a) {
                c3166z02.m11954l(AbstractC9823a.m38174c());
                c3166z02.m11953k(c3166z02.m11951i() + 1);
            }
        }
        AbstractC3159w.m11890S(abstractC3137lM11764c, this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return AbstractC3142n0.m11818d(this).m11952j().contains(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        return AbstractC3142n0.m11818d(this).m11952j().containsAll(elements);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: e, reason: from getter */
    public AbstractC3162x0 getFirstStateRecord() {
        return this.firstStateRecord;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return AbstractC3142n0.m11818d(this).m11952j().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C3164y0(this, AbstractC3142n0.m11818d(this).m11952j().iterator());
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: o */
    public void mo1521o(AbstractC3162x0 value) {
        value.m11942g(getFirstStateRecord());
        this.firstStateRecord = (C3166z0) value;
    }

    /* JADX INFO: renamed from: p */
    public final Set m2214p() {
        return AbstractC3142n0.m11818d(this).m11952j();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        int iM11951i;
        InterfaceC9829g interfaceC9829gM11952j;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11816b;
        do {
            synchronized (AbstractC3142n0.f8381a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3166z0 c3166z0 = (C3166z0) AbstractC3159w.m11880I((C3166z0) firstStateRecord);
                iM11951i = c3166z0.m11951i();
                interfaceC9829gM11952j = c3166z0.m11952j();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9829gM11952j.getClass();
            InterfaceC9829g interfaceC9829gRemove = interfaceC9829gM11952j.remove(element);
            if (AbstractC1061t.m3842c(interfaceC9829gRemove, interfaceC9829gM11952j)) {
                return false;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3166z0 c3166z02 = (C3166z0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11816b = AbstractC3142n0.m11816b((C3166z0) AbstractC3159w.m11917j0(c3166z02, this, abstractC3137lM11764c), iM11951i, interfaceC9829gRemove);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11816b);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        int iM11951i;
        InterfaceC9829g interfaceC9829gM11952j;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11816b;
        do {
            synchronized (AbstractC3142n0.f8381a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3166z0 c3166z0 = (C3166z0) AbstractC3159w.m11880I((C3166z0) firstStateRecord);
                iM11951i = c3166z0.m11951i();
                interfaceC9829gM11952j = c3166z0.m11952j();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9829gM11952j.getClass();
            InterfaceC9829g interfaceC9829gRemoveAll = interfaceC9829gM11952j.removeAll(elements);
            if (AbstractC1061t.m3842c(interfaceC9829gRemoveAll, interfaceC9829gM11952j)) {
                return false;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3166z0 c3166z02 = (C3166z0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11816b = AbstractC3142n0.m11816b((C3166z0) AbstractC3159w.m11917j0(c3166z02, this, abstractC3137lM11764c), iM11951i, interfaceC9829gRemoveAll);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11816b);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(final Collection elements) {
        return AbstractC3142n0.m11819e(this, new InterfaceC0184l() { // from class: i1.m0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(SnapshotStateSet.m2212a(elements, (Set) obj));
            }
        });
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return m2213c();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }

    public String toString() {
        AbstractC3162x0 firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return "SnapshotStateSet(value=" + ((C3166z0) AbstractC3159w.m11880I((C3166z0) firstStateRecord)).m11952j() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Set setM2214p = m2214p();
        parcel.writeInt(size());
        Iterator it = setM2214p.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC1041j.m3804b(this, objArr);
    }
}
