package androidx.compose.runtime.snapshots;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.AbstractC0464b3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1041j;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1403d;
import p119i1.AbstractC3126f0;
import p119i1.AbstractC3137l;
import p119i1.AbstractC3159w;
import p119i1.AbstractC3162x0;
import p119i1.C3114a1;
import p119i1.C3146p0;
import p119i1.C3148q0;
import p119i1.InterfaceC3158v0;
import p172l8.C4700i0;
import p364z0.AbstractC9823a;
import p364z0.InterfaceC9827e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m16757d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010+\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 >*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00060\u0005j\u0002`\u0006:\u0001QB\u0017\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nB\t\b\u0016¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010!J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0016¢\u0006\u0004\b)\u0010*J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b)\u0010+J%\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u0010\u0017J\u001f\u00103\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b3\u00104J%\u00105\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u00106J\u001d\u00105\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b5\u0010\u001bJ\u000f\u00107\u001a\u00020\u000eH\u0016¢\u0006\u0004\b7\u0010\u000bJ\u0017\u00108\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00028\u0000H\u0016¢\u0006\u0004\b8\u0010\u0017J\u001d\u00109\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b9\u0010\u001bJ\u0017\u0010:\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b:\u0010\u001fJ\u001d\u0010;\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0016¢\u0006\u0004\b;\u0010\u001bJ \u0010<\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b<\u0010=J\u001d\u0010>\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c¢\u0006\u0004\b>\u0010?J-\u0010B\u001a\u00020\u001c2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0006\u0010@\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020\u001cH\u0000¢\u0006\u0004\bB\u0010CJ\u001f\u0010G\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u001cH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u001cH\u0016¢\u0006\u0004\bI\u0010JR$\u0010N\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b:\u0010K\u001a\u0004\bL\u0010MR\u0014\u0010P\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010J¨\u0006R"}, m16758d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateList;", "T", "Landroid/os/Parcelable;", "Li1/v0;", _UrlKt.FRAGMENT_ENCODE_SET, "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lz0/e;", "persistentList", "<init>", "(Lz0/e;)V", "()V", "Li1/x0;", "value", "Ll8/i0;", "o", "(Li1/x0;)V", _UrlKt.FRAGMENT_ENCODE_SET, "t", "()Ljava/util/List;", "element", _UrlKt.FRAGMENT_ENCODE_SET, "contains", "(Ljava/lang/Object;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "elements", "containsAll", "(Ljava/util/Collection;)Z", _UrlKt.FRAGMENT_ENCODE_SET, "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", _UrlKt.FRAGMENT_ENCODE_SET, "iterator", "()Ljava/util/Iterator;", "lastIndexOf", _UrlKt.FRAGMENT_ENCODE_SET, "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", _UrlKt.FRAGMENT_ENCODE_SET, "toString", "()Ljava/lang/String;", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "remove", "removeAll", "q", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "r", "(II)V", "start", "end", "s", "(Ljava/util/Collection;II)I", "Landroid/os/Parcel;", "parcel", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Li1/x0;", "e", "()Li1/x0;", "firstStateRecord", "p", "size", "b", "runtime"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
public final class SnapshotStateList<T> implements Parcelable, InterfaceC3158v0, List<T>, RandomAccess, InterfaceC1403d {

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public AbstractC3162x0 firstStateRecord;
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new C0586a();

    /* JADX INFO: renamed from: androidx.compose.runtime.snapshots.SnapshotStateList$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class C0586a implements Parcelable.ClassLoaderCreator {
        /* JADX INFO: renamed from: a */
        public static Object m2208a(Parcel parcel, ClassLoader classLoader, int i10) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList createFromParcel(final Parcel parcel, final ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = C0586a.class.getClassLoader();
            }
            return AbstractC3126f0.m11720a(parcel.readInt(), new InterfaceC0184l() { // from class: i1.e0
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return SnapshotStateList.C0586a.m2208a(parcel, classLoader, ((Integer) obj).intValue());
                }
            });
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SnapshotStateList[] newArray(int i10) {
            return new SnapshotStateList[i10];
        }
    }

    public SnapshotStateList(InterfaceC9827e interfaceC9827e) {
        this.firstStateRecord = AbstractC3126f0.m11731l(this, interfaceC9827e);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m2201a(int i10, Collection collection, List list) {
        return list.addAll(i10, collection);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2202c(Collection collection, List list) {
        return list.retainAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object element) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        do {
            synchronized (AbstractC3126f0.f8329a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e interfaceC9827eAdd = interfaceC9827eM11853i.add(element);
            if (AbstractC1061t.m3842c(interfaceC9827eAdd, interfaceC9827eM11853i)) {
                return false;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3148q0 c3148q02 = (C3148q0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = AbstractC3126f0.m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, this, abstractC3137lM11764c), iM11854j, interfaceC9827eAdd, true);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11725f);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection elements) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        do {
            synchronized (AbstractC3126f0.f8329a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e interfaceC9827eAddAll = interfaceC9827eM11853i.addAll(elements);
            if (AbstractC1061t.m3842c(interfaceC9827eAddAll, interfaceC9827eM11853i)) {
                return false;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3148q0 c3148q02 = (C3148q0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = AbstractC3126f0.m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, this, abstractC3137lM11764c), iM11854j, interfaceC9827eAddAll, true);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11725f);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        AbstractC3137l abstractC3137lM11764c;
        AbstractC3162x0 firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        C3148q0 c3148q0 = (C3148q0) firstStateRecord;
        synchronized (AbstractC3159w.m11883L()) {
            abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
            C3148q0 c3148q02 = (C3148q0) AbstractC3159w.m11917j0(c3148q0, this, abstractC3137lM11764c);
            synchronized (AbstractC3126f0.f8329a) {
                c3148q02.m11856l(AbstractC9823a.m38173b());
                c3148q02.m11857m(c3148q02.m11854j() + 1);
                c3148q02.m11858n(c3148q02.m11855k() + 1);
            }
        }
        AbstractC3159w.m11890S(abstractC3137lM11764c, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object element) {
        return AbstractC3126f0.m11726g(this).m11853i().contains(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        return AbstractC3126f0.m11726g(this).m11853i().containsAll(elements);
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

    @Override // java.util.List
    public Object get(int index) {
        return AbstractC3126f0.m11726g(this).m11853i().get(index);
    }

    @Override // java.util.List
    public int indexOf(Object element) {
        return AbstractC3126f0.m11726g(this).m11853i().indexOf(element);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return AbstractC3126f0.m11726g(this).m11853i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object element) {
        return AbstractC3126f0.m11726g(this).m11853i().lastIndexOf(element);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C3146p0(this, 0);
    }

    @Override // p119i1.InterfaceC3158v0
    /* JADX INFO: renamed from: o */
    public void mo1521o(AbstractC3162x0 value) {
        value.m11942g(getFirstStateRecord());
        this.firstStateRecord = (C3148q0) value;
    }

    /* JADX INFO: renamed from: p */
    public int m2203p() {
        return AbstractC3126f0.m11726g(this).m11853i().size();
    }

    /* JADX INFO: renamed from: q */
    public Object m2204q(int index) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        Object obj = get(index);
        do {
            synchronized (AbstractC3126f0.f8329a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e interfaceC9827eMo33k = interfaceC9827eM11853i.mo33k(index);
            if (AbstractC1061t.m3842c(interfaceC9827eMo33k, interfaceC9827eM11853i)) {
                return obj;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3148q0 c3148q02 = (C3148q0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = AbstractC3126f0.m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, this, abstractC3137lM11764c), iM11854j, interfaceC9827eMo33k, true);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11725f);
        return obj;
    }

    /* JADX INFO: renamed from: r */
    public final void m2205r(int fromIndex, int toIndex) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        do {
            synchronized (AbstractC3126f0.f8329a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e.a aVarBuilder = interfaceC9827eM11853i.builder();
            aVarBuilder.subList(fromIndex, toIndex).clear();
            InterfaceC9827e interfaceC9827eBuild = aVarBuilder.build();
            if (AbstractC1061t.m3842c(interfaceC9827eBuild, interfaceC9827eM11853i)) {
                return;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3148q0 c3148q02 = (C3148q0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = AbstractC3126f0.m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, this, abstractC3137lM11764c), iM11854j, interfaceC9827eBuild, true);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11725f);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object element) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        do {
            synchronized (AbstractC3126f0.f8329a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e interfaceC9827eRemove = interfaceC9827eM11853i.remove(element);
            if (AbstractC1061t.m3842c(interfaceC9827eRemove, interfaceC9827eM11853i)) {
                return false;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3148q0 c3148q02 = (C3148q0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = AbstractC3126f0.m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, this, abstractC3137lM11764c), iM11854j, interfaceC9827eRemove, true);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11725f);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection elements) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        do {
            synchronized (AbstractC3126f0.f8329a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e interfaceC9827eRemoveAll = interfaceC9827eM11853i.removeAll(elements);
            if (AbstractC1061t.m3842c(interfaceC9827eRemoveAll, interfaceC9827eM11853i)) {
                return false;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3148q0 c3148q02 = (C3148q0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = AbstractC3126f0.m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, this, abstractC3137lM11764c), iM11854j, interfaceC9827eRemoveAll, true);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11725f);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection elements) {
        return AbstractC3126f0.m11730k(this, new InterfaceC0184l() { // from class: i1.c0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(SnapshotStateList.m2202c(elements, (List) obj));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public final int m2206s(Collection elements, int start, int end) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        int size = size();
        do {
            synchronized (AbstractC3126f0.f8329a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e.a aVarBuilder = interfaceC9827eM11853i.builder();
            aVarBuilder.subList(start, end).retainAll(elements);
            InterfaceC9827e interfaceC9827eBuild = aVarBuilder.build();
            if (AbstractC1061t.m3842c(interfaceC9827eBuild, interfaceC9827eM11853i)) {
                break;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3148q0 c3148q02 = (C3148q0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = AbstractC3126f0.m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, this, abstractC3137lM11764c), iM11854j, interfaceC9827eBuild, true);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11725f);
        return size - size();
    }

    @Override // java.util.List
    public Object set(int index, Object element) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        Object obj = get(index);
        do {
            synchronized (AbstractC3126f0.f8329a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e interfaceC9827e = interfaceC9827eM11853i.set(index, element);
            if (AbstractC1061t.m3842c(interfaceC9827e, interfaceC9827eM11853i)) {
                return obj;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3148q0 c3148q02 = (C3148q0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = AbstractC3126f0.m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, this, abstractC3137lM11764c), iM11854j, interfaceC9827e, false);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11725f);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m2203p();
    }

    @Override // java.util.List
    public List subList(int fromIndex, int toIndex) {
        if (!(fromIndex >= 0 && fromIndex <= toIndex && toIndex <= size())) {
            AbstractC0464b3.m1535a("fromIndex or toIndex are out of bounds");
        }
        return new C3114a1(this, fromIndex, toIndex);
    }

    /* JADX INFO: renamed from: t */
    public final List m2207t() {
        return AbstractC3126f0.m11726g(this).m11853i();
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC1041j.m3803a(this);
    }

    public String toString() {
        AbstractC3162x0 firstStateRecord = getFirstStateRecord();
        firstStateRecord.getClass();
        return "SnapshotStateList(value=" + ((C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord)).m11853i() + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        List listM2207t = m2207t();
        int size = listM2207t.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeValue(listM2207t.get(i10));
        }
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC1041j.m3804b(this, objArr);
    }

    @Override // java.util.List
    public ListIterator listIterator(int index) {
        return new C3146p0(this, index);
    }

    public SnapshotStateList() {
        this(AbstractC9823a.m38173b());
    }

    @Override // java.util.List
    public void add(int index, Object element) {
        int iM11854j;
        InterfaceC9827e interfaceC9827eM11853i;
        AbstractC3137l abstractC3137lM11764c;
        boolean zM11725f;
        do {
            synchronized (AbstractC3126f0.f8329a) {
                AbstractC3162x0 firstStateRecord = getFirstStateRecord();
                firstStateRecord.getClass();
                C3148q0 c3148q0 = (C3148q0) AbstractC3159w.m11880I((C3148q0) firstStateRecord);
                iM11854j = c3148q0.m11854j();
                interfaceC9827eM11853i = c3148q0.m11853i();
                C4700i0 c4700i0 = C4700i0.f13910a;
            }
            interfaceC9827eM11853i.getClass();
            InterfaceC9827e interfaceC9827eAdd = interfaceC9827eM11853i.add(index, element);
            if (AbstractC1061t.m3842c(interfaceC9827eAdd, interfaceC9827eM11853i)) {
                return;
            }
            AbstractC3162x0 firstStateRecord2 = getFirstStateRecord();
            firstStateRecord2.getClass();
            C3148q0 c3148q02 = (C3148q0) firstStateRecord2;
            synchronized (AbstractC3159w.m11883L()) {
                abstractC3137lM11764c = AbstractC3137l.f8345e.m11764c();
                zM11725f = AbstractC3126f0.m11725f((C3148q0) AbstractC3159w.m11917j0(c3148q02, this, abstractC3137lM11764c), iM11854j, interfaceC9827eAdd, true);
            }
            AbstractC3159w.m11890S(abstractC3137lM11764c, this);
        } while (!zM11725f);
    }

    @Override // java.util.List
    public boolean addAll(final int index, final Collection elements) {
        return AbstractC3126f0.m11730k(this, new InterfaceC0184l() { // from class: i1.d0
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return Boolean.valueOf(SnapshotStateList.m2201a(index, elements, (List) obj));
            }
        });
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i10) {
        return m2204q(i10);
    }
}
