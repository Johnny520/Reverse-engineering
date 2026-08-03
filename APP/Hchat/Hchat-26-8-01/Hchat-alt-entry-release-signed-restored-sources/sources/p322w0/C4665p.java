package p322w0;

import android.os.Parcel;
import android.os.Parcelable;
import gg.AbstractC1415k;
import gg.AbstractC1416l;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import p114hg.InterfaceC1713c;
import p117i0.AbstractC1861n1;
import p202o0.AbstractC3031c;
import p202o0.C3030b;
import p202o0.C3034f;
import p202o0.C3037i;
import p304uf.C4327a;
import th.C4212d;

/* JADX INFO: renamed from: w0.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4665p implements Parcelable, InterfaceC4670u, List, RandomAccess, InterfaceC1713c {
    public static final Parcelable.Creator<C4665p> CREATOR = new C4664o();

    /* JADX INFO: renamed from: g */
    public C4669t f15521g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4665p(AbstractC3031c abstractC3031c) {
        AbstractC4655f abstractC4655fM9129j = AbstractC4662m.m9129j();
        C4669t c4669t = new C4669t(abstractC4655fM9129j.mo9109g(), abstractC3031c);
        if (!(abstractC4655fM9129j instanceof C4650a)) {
            c4669t.f15551b = new C4669t(1, abstractC3031c);
        }
        this.f15521g = c4669t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: a */
    public final AbstractC4672w mo4484a() {
        return this.f15521g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i9;
        AbstractC3031c abstractC3031c;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        do {
            synchronized (AbstractC4666q.f15522a) {
                C4669t c4669t = this.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i9 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            AbstractC3031c abstractC3031cMo6435c = abstractC3031c.mo6435c(obj);
            if (abstractC3031cMo6435c.equals(abstractC3031c)) {
                return false;
            }
            C4669t c4669t3 = this.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = AbstractC4666q.m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, this, abstractC4655fM9129j), i9, abstractC3031cMo6435c, true);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        } while (!zM9146b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i9;
        AbstractC3031c abstractC3031c;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        do {
            synchronized (AbstractC4666q.f15522a) {
                C4669t c4669t = this.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i9 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            AbstractC3031c abstractC3031cMo6436d = abstractC3031c.mo6436d(collection);
            if (AbstractC1416l.m3825a(abstractC3031cMo6436d, abstractC3031c)) {
                return false;
            }
            C4669t c4669t3 = this.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = AbstractC4666q.m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, this, abstractC4655fM9129j), i9, abstractC3031cMo6436d, true);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        } while (!zM9146b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p322w0.InterfaceC4670u
    /* JADX INFO: renamed from: c */
    public final void mo4486c(AbstractC4672w abstractC4672w) {
        abstractC4672w.f15551b = this.f15521g;
        this.f15521g = (C4669t) abstractC4672w;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        AbstractC4655f abstractC4655fM9129j;
        C4669t c4669t = this.f15521g;
        c4669t.getClass();
        synchronized (AbstractC4662m.f15512c) {
            abstractC4655fM9129j = AbstractC4662m.m9129j();
            C4669t c4669t2 = (C4669t) AbstractC4662m.m9142w(c4669t, this, abstractC4655fM9129j);
            synchronized (AbstractC4666q.f15522a) {
                c4669t2.f15546c = C3037i.f9857h;
                c4669t2.f15547d++;
                c4669t2.f15548e++;
            }
        }
        AbstractC4662m.m9133n(abstractC4655fM9129j, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC4666q.m9149f(this).f15546c.contains(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC4666q.m9149f(this).f15546c.containsAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m9144e(int i9, int i10) {
        int i11;
        AbstractC3031c abstractC3031c;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        do {
            synchronized (AbstractC4666q.f15522a) {
                C4669t c4669t = this.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i11 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            C3034f c3034fMo6437e = abstractC3031c.mo6437e();
            c3034fMo6437e.subList(i9, i10).clear();
            AbstractC3031c abstractC3031cM6459d = c3034fMo6437e.m6459d();
            if (AbstractC1416l.m3825a(abstractC3031cM6459d, abstractC3031c)) {
                return;
            }
            C4669t c4669t3 = this.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = AbstractC4666q.m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, this, abstractC4655fM9129j), i11, abstractC3031cM6459d, true);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        } while (!zM9146b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        return AbstractC4666q.m9149f(this).f15546c.get(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC4666q.m9149f(this).f15546c.indexOf(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC4666q.m9149f(this).f15546c.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC4666q.m9149f(this).f15546c.lastIndexOf(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C4327a(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i9;
        AbstractC3031c abstractC3031c;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        do {
            synchronized (AbstractC4666q.f15522a) {
                C4669t c4669t = this.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i9 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            int iIndexOf = abstractC3031c.indexOf(obj);
            AbstractC3031c abstractC3031cMo6439g = iIndexOf != -1 ? abstractC3031c.mo6439g(iIndexOf) : abstractC3031c;
            if (abstractC3031cMo6439g.equals(abstractC3031c)) {
                return false;
            }
            C4669t c4669t3 = this.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = AbstractC4666q.m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, this, abstractC4655fM9129j), i9, abstractC3031cMo6439g, true);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        } while (!zM9146b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i9;
        AbstractC3031c abstractC3031c;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        do {
            synchronized (AbstractC4666q.f15522a) {
                C4669t c4669t = this.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i9 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            AbstractC3031c abstractC3031cMo6438f = abstractC3031c.mo6438f(new C3030b(0, collection));
            if (AbstractC1416l.m3825a(abstractC3031cMo6438f, abstractC3031c)) {
                return false;
            }
            C4669t c4669t3 = this.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = AbstractC4666q.m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, this, abstractC4655fM9129j), i9, abstractC3031cMo6438f, true);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        } while (!zM9146b);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC4666q.m9152i(this, new C3030b(2, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i9, Object obj) {
        int i10;
        AbstractC3031c abstractC3031c;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        Object obj2 = get(i9);
        do {
            synchronized (AbstractC4666q.f15522a) {
                C4669t c4669t = this.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i10 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            AbstractC3031c abstractC3031cMo6440h = abstractC3031c.mo6440h(i9, obj);
            if (abstractC3031cMo6440h.equals(abstractC3031c)) {
                break;
            }
            C4669t c4669t3 = this.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = AbstractC4666q.m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, this, abstractC4655fM9129j), i10, abstractC3031cMo6440h, false);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        } while (!zM9146b);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC4666q.m9149f(this).f15546c.size();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i9, int i10) {
        if (!(i9 >= 0 && i9 <= i10 && i10 <= size())) {
            AbstractC1861n1.m4583a("fromIndex or toIndex are out of bounds");
        }
        return new C4673x(this, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC1415k.m3823a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C4669t c4669t = this.f15521g;
        c4669t.getClass();
        return "SnapshotStateList(value=" + ((C4669t) AbstractC4662m.m9127h(c4669t)).f15546c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        AbstractC3031c abstractC3031c = AbstractC4666q.m9149f(this).f15546c;
        int size = abstractC3031c.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            parcel.writeValue(abstractC3031c.get(i10));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC1415k.m3824b(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i9) {
        return new C4327a(this, i9);
    }

    public C4665p() {
        this(C3037i.f9857h);
    }

    @Override // java.util.List
    public final void add(int i9, Object obj) {
        int i10;
        AbstractC3031c abstractC3031c;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        do {
            synchronized (AbstractC4666q.f15522a) {
                C4669t c4669t = this.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i10 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            AbstractC3031c abstractC3031cMo6434a = abstractC3031c.mo6434a(i9, obj);
            if (abstractC3031cMo6434a.equals(abstractC3031c)) {
                return;
            }
            C4669t c4669t3 = this.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = AbstractC4666q.m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, this, abstractC4655fM9129j), i10, abstractC3031cMo6434a, true);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        } while (!zM9146b);
    }

    @Override // java.util.List
    public final boolean addAll(int i9, Collection collection) {
        return AbstractC4666q.m9152i(this, new C4212d(i9, collection));
    }

    @Override // java.util.List
    public final Object remove(int i9) {
        int i10;
        AbstractC3031c abstractC3031c;
        AbstractC4655f abstractC4655fM9129j;
        boolean zM9146b;
        Object obj = get(i9);
        do {
            synchronized (AbstractC4666q.f15522a) {
                C4669t c4669t = this.f15521g;
                c4669t.getClass();
                C4669t c4669t2 = (C4669t) AbstractC4662m.m9127h(c4669t);
                i10 = c4669t2.f15547d;
                abstractC3031c = c4669t2.f15546c;
            }
            abstractC3031c.getClass();
            AbstractC3031c abstractC3031cMo6439g = abstractC3031c.mo6439g(i9);
            if (abstractC3031cMo6439g.equals(abstractC3031c)) {
                break;
            }
            C4669t c4669t3 = this.f15521g;
            c4669t3.getClass();
            synchronized (AbstractC4662m.f15512c) {
                abstractC4655fM9129j = AbstractC4662m.m9129j();
                zM9146b = AbstractC4666q.m9146b((C4669t) AbstractC4662m.m9142w(c4669t3, this, abstractC4655fM9129j), i10, abstractC3031cMo6439g, true);
            }
            AbstractC4662m.m9133n(abstractC4655fM9129j, this);
        } while (!zM9146b);
        return obj;
    }
}
