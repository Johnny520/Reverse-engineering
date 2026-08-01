package p158f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p041H0.C0609o;
import p081Q.C1158a;
import p095T.AbstractC1380p0;
import p114X.AbstractC1614c;
import p114X.C1613b;
import p114X.C1618g;
import p114X.C1621j;
import p117X2.AbstractC1664i;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1767b;

/* JADX INFO: renamed from: f0.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2085q implements Parcelable, InterfaceC2090v, List, RandomAccess, InterfaceC1767b {
    public static final Parcelable.Creator<C2085q> CREATOR = new C2084p();

    /* JADX INFO: renamed from: d */
    public C2089u f6981d;

    public C2085q(AbstractC1614c abstractC1614c) {
        AbstractC2074f abstractC2074fM3834j = AbstractC2082n.m3834j();
        C2089u c2089u = new C2089u(abstractC2074fM3834j.mo3791g(), abstractC1614c);
        if (!(abstractC2074fM3834j instanceof C2069a)) {
            c2089u.f7011b = new C2089u(1, abstractC1614c);
        }
        this.f6981d = c2089u;
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: a */
    public final AbstractC2092x mo2410a() {
        return this.f6981d;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i5;
        AbstractC1614c abstractC1614c;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        do {
            synchronized (AbstractC2086r.f6982a) {
                C2089u c2089u = this.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i5 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            AbstractC1614c abstractC1614cMo2878c = abstractC1614c.mo2878c(obj);
            if (abstractC1614cMo2878c.equals(abstractC1614c)) {
                return false;
            }
            C2089u c2089u3 = this.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = AbstractC2086r.m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, this, abstractC2074fM3834j), i5, abstractC1614cMo2878c, true);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, this);
        } while (!zM3851b);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i5, Collection collection) {
        return AbstractC2086r.m3857i(this, new C1158a(i5, collection));
    }

    @Override // p158f0.InterfaceC2090v
    /* JADX INFO: renamed from: c */
    public final void mo2411c(AbstractC2092x abstractC2092x) {
        abstractC2092x.f7011b = this.f6981d;
        this.f6981d = (C2089u) abstractC2092x;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC2074f abstractC2074fM3834j;
        C2089u c2089u = this.f6981d;
        AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (AbstractC2082n.f6972c) {
            abstractC2074fM3834j = AbstractC2082n.m3834j();
            C2089u c2089u2 = (C2089u) AbstractC2082n.m3847w(c2089u, this, abstractC2074fM3834j);
            synchronized (AbstractC2086r.f6982a) {
                c2089u2.f7006c = C1621j.f5578e;
                c2089u2.f7007d++;
                c2089u2.f7008e++;
            }
        }
        AbstractC2082n.m3838n(abstractC2074fM3834j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC2086r.m3854f(this).f7006c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC2086r.m3854f(this).f7006c.containsAll(collection);
    }

    /* JADX INFO: renamed from: d */
    public final void m3849d(int i5, int i6) {
        int i7;
        AbstractC1614c abstractC1614c;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        do {
            synchronized (AbstractC2086r.f6982a) {
                C2089u c2089u = this.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i7 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            C1618g c1618gMo2880e = abstractC1614c.mo2880e();
            c1618gMo2880e.subList(i5, i6).clear();
            AbstractC1614c abstractC1614cM2899c = c1618gMo2880e.m2899c();
            if (AbstractC1665j.m2981a(abstractC1614cM2899c, abstractC1614c)) {
                return;
            }
            C2089u c2089u3 = this.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = AbstractC2086r.m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, this, abstractC2074fM3834j), i7, abstractC1614cM2899c, true);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, this);
        } while (!zM3851b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i5) {
        return AbstractC2086r.m3854f(this).f7006c.get(i5);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC2086r.m3854f(this).f7006c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC2086r.m3854f(this).f7006c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC2086r.m3854f(this).f7006c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0609o(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i5) {
        int i6;
        AbstractC1614c abstractC1614c;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        Object obj = get(i5);
        do {
            synchronized (AbstractC2086r.f6982a) {
                C2089u c2089u = this.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i6 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            AbstractC1614c abstractC1614cMo2882g = abstractC1614c.mo2882g(i5);
            if (abstractC1614cMo2882g.equals(abstractC1614c)) {
                break;
            }
            C2089u c2089u3 = this.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = AbstractC2086r.m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, this, abstractC2074fM3834j), i6, abstractC1614cMo2882g, true);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, this);
        } while (!zM3851b);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i5;
        AbstractC1614c abstractC1614c;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        do {
            synchronized (AbstractC2086r.f6982a) {
                C2089u c2089u = this.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i5 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            AbstractC1614c abstractC1614cMo2881f = abstractC1614c.mo2881f(new C1613b(0, collection));
            if (AbstractC1665j.m2981a(abstractC1614cMo2881f, abstractC1614c)) {
                return false;
            }
            C2089u c2089u3 = this.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = AbstractC2086r.m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, this, abstractC2074fM3834j), i5, abstractC1614cMo2881f, true);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, this);
        } while (!zM3851b);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC2086r.m3857i(this, new C1613b(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i5, Object obj) {
        int i6;
        AbstractC1614c abstractC1614c;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        Object obj2 = get(i5);
        do {
            synchronized (AbstractC2086r.f6982a) {
                C2089u c2089u = this.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i6 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            AbstractC1614c abstractC1614cMo2883h = abstractC1614c.mo2883h(i5, obj);
            if (abstractC1614cMo2883h.equals(abstractC1614c)) {
                break;
            }
            C2089u c2089u3 = this.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = AbstractC2086r.m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, this, abstractC2074fM3834j), i6, abstractC1614cMo2883h, false);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, this);
        } while (!zM3851b);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC2086r.m3854f(this).f7006c.mo1974a();
    }

    @Override // java.util.List
    public final List subList(int i5, int i6) {
        if (!(i5 >= 0 && i5 <= i6 && i6 <= size())) {
            AbstractC1380p0.m2542a("fromIndex or toIndex are out of bounds");
        }
        return new C2093y(this, i5, i6);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1664i.m2979a(this);
    }

    public final String toString() {
        C2089u c2089u = this.f6981d;
        AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((C2089u) AbstractC2082n.m3832h(c2089u)).f7006c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        AbstractC1614c abstractC1614c = AbstractC2086r.m3854f(this).f7006c;
        int iMo1974a = abstractC1614c.mo1974a();
        parcel.writeInt(iMo1974a);
        for (int i6 = 0; i6 < iMo1974a; i6++) {
            parcel.writeValue(abstractC1614c.get(i6));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i5;
        AbstractC1614c abstractC1614c;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        do {
            synchronized (AbstractC2086r.f6982a) {
                C2089u c2089u = this.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i5 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            AbstractC1614c abstractC1614cMo2879d = abstractC1614c.mo2879d(collection);
            if (AbstractC1665j.m2981a(abstractC1614cMo2879d, abstractC1614c)) {
                return false;
            }
            C2089u c2089u3 = this.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = AbstractC2086r.m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, this, abstractC2074fM3834j), i5, abstractC1614cMo2879d, true);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, this);
        } while (!zM3851b);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i5) {
        return new C0609o(this, i5);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1664i.m2980b(this, objArr);
    }

    public C2085q() {
        this(C1621j.f5578e);
    }

    @Override // java.util.List
    public final void add(int i5, Object obj) {
        int i6;
        AbstractC1614c abstractC1614c;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        do {
            synchronized (AbstractC2086r.f6982a) {
                C2089u c2089u = this.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i6 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            AbstractC1614c abstractC1614cMo2877b = abstractC1614c.mo2877b(i5, obj);
            if (abstractC1614cMo2877b.equals(abstractC1614c)) {
                return;
            }
            C2089u c2089u3 = this.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = AbstractC2086r.m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, this, abstractC2074fM3834j), i6, abstractC1614cMo2877b, true);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, this);
        } while (!zM3851b);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i5;
        AbstractC1614c abstractC1614c;
        AbstractC2074f abstractC2074fM3834j;
        boolean zM3851b;
        do {
            synchronized (AbstractC2086r.f6982a) {
                C2089u c2089u = this.f6981d;
                AbstractC1665j.m2983c(c2089u, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                C2089u c2089u2 = (C2089u) AbstractC2082n.m3832h(c2089u);
                i5 = c2089u2.f7007d;
                abstractC1614c = c2089u2.f7006c;
            }
            AbstractC1665j.m2982b(abstractC1614c);
            int iIndexOf = abstractC1614c.indexOf(obj);
            AbstractC1614c abstractC1614cMo2882g = iIndexOf != -1 ? abstractC1614c.mo2882g(iIndexOf) : abstractC1614c;
            if (abstractC1614cMo2882g.equals(abstractC1614c)) {
                return false;
            }
            C2089u c2089u3 = this.f6981d;
            AbstractC1665j.m2983c(c2089u3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (AbstractC2082n.f6972c) {
                abstractC2074fM3834j = AbstractC2082n.m3834j();
                zM3851b = AbstractC2086r.m3851b((C2089u) AbstractC2082n.m3847w(c2089u3, this, abstractC2074fM3834j), i5, abstractC1614cMo2882g, true);
            }
            AbstractC2082n.m3838n(abstractC2074fM3834j, this);
        } while (!zM3851b);
        return true;
    }
}
