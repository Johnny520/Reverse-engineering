package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class c31 implements Parcelable, d41, List, RandomAccess, r40 {
    public static final Parcelable.Creator<c31> CREATOR = new b31();

    /* JADX INFO: renamed from: d */
    public c41 f650d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public c31(AbstractC0112d0 abstractC0112d0) {
        l21 l21VarM4172j = t21.m4172j();
        c41 c41Var = new c41(l21VarM4172j.mo811g(), abstractC0112d0);
        if (!(l21VarM4172j instanceof C0668qx)) {
            c41Var.f1578b = new c41(1L, abstractC0112d0);
        }
        this.f650d = c41Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: a */
    public final f41 mo440a() {
        return this.f650d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC0112d0 abstractC0112d0;
        l21 l21VarM4172j;
        boolean zM3003m;
        do {
            synchronized (p30.f4745l) {
                c41 c41Var = this.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            AbstractC0112d0 abstractC0112d0Mo8c = abstractC0112d0.mo8c(obj);
            if (abstractC0112d0Mo8c.equals(abstractC0112d0)) {
                return false;
            }
            c41 c41Var3 = this.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = p30.m3003m((c41) t21.m4185w(c41Var3, this, l21VarM4172j), i, abstractC0112d0Mo8c, true);
            }
            t21.m4176n(l21VarM4172j, this);
        } while (!zM3003m);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC0112d0 abstractC0112d0;
        l21 l21VarM4172j;
        boolean zM3003m;
        do {
            synchronized (p30.f4745l) {
                c41 c41Var = this.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            AbstractC0112d0 abstractC0112d0Mo9d = abstractC0112d0.mo9d(collection);
            if (p30.m3002l(abstractC0112d0Mo9d, abstractC0112d0)) {
                return false;
            }
            c41 c41Var3 = this.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = p30.m3003m((c41) t21.m4185w(c41Var3, this, l21VarM4172j), i, abstractC0112d0Mo9d, true);
            }
            t21.m4176n(l21VarM4172j, this);
        } while (!zM3003m);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.d41
    /* JADX INFO: renamed from: c */
    public final void mo441c(f41 f41Var) {
        f41Var.f1578b = this.f650d;
        this.f650d = (c41) f41Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        l21 l21VarM4172j;
        c41 c41Var = this.f650d;
        c41Var.getClass();
        synchronized (t21.f5893c) {
            l21VarM4172j = t21.m4172j();
            c41 c41Var2 = (c41) t21.m4185w(c41Var, this, l21VarM4172j);
            synchronized (p30.f4745l) {
                c41Var2.f689c = a21.f28e;
                c41Var2.f690d++;
                c41Var2.f691e++;
            }
        }
        t21.m4176n(l21VarM4172j, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return p30.m2969E(this).f689c.contains(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return p30.m2969E(this).f689c.containsAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m442d(int i, int i2) {
        int i3;
        AbstractC0112d0 abstractC0112d0;
        l21 l21VarM4172j;
        boolean zM3003m;
        do {
            synchronized (p30.f4745l) {
                c41 c41Var = this.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i3 = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            qq0 qq0VarMo10e = abstractC0112d0.mo10e();
            qq0VarMo10e.subList(i, i2).clear();
            AbstractC0112d0 abstractC0112d0M3301c = qq0VarMo10e.m3301c();
            if (p30.m3002l(abstractC0112d0M3301c, abstractC0112d0)) {
                return;
            }
            c41 c41Var3 = this.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = p30.m3003m((c41) t21.m4185w(c41Var3, this, l21VarM4172j), i3, abstractC0112d0M3301c, true);
            }
            t21.m4176n(l21VarM4172j, this);
        } while (!zM3003m);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        return p30.m2969E(this).f689c.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        return p30.m2969E(this).f689c.indexOf(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return p30.m2969E(this).f689c.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return p30.m2969E(this).f689c.lastIndexOf(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C0530ny(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC0112d0 abstractC0112d0;
        l21 l21VarM4172j;
        boolean zM3003m;
        do {
            synchronized (p30.f4745l) {
                c41 c41Var = this.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            int iIndexOf = abstractC0112d0.indexOf(obj);
            AbstractC0112d0 abstractC0112d0Mo12g = iIndexOf != -1 ? abstractC0112d0.mo12g(iIndexOf) : abstractC0112d0;
            if (abstractC0112d0Mo12g.equals(abstractC0112d0)) {
                return false;
            }
            c41 c41Var3 = this.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = p30.m3003m((c41) t21.m4185w(c41Var3, this, l21VarM4172j), i, abstractC0112d0Mo12g, true);
            }
            t21.m4176n(l21VarM4172j, this);
        } while (!zM3003m);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC0112d0 abstractC0112d0;
        l21 l21VarM4172j;
        boolean zM3003m;
        do {
            synchronized (p30.f4745l) {
                c41 c41Var = this.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            AbstractC0112d0 abstractC0112d0Mo11f = abstractC0112d0.mo11f(new C0074c0(0, collection));
            if (p30.m3002l(abstractC0112d0Mo11f, abstractC0112d0)) {
                return false;
            }
            c41 c41Var3 = this.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = p30.m3003m((c41) t21.m4185w(c41Var3, this, l21VarM4172j), i, abstractC0112d0Mo11f, true);
            }
            t21.m4176n(l21VarM4172j, this);
        } while (!zM3003m);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return p30.m2980P(this, new C0074c0(2, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC0112d0 abstractC0112d0;
        l21 l21VarM4172j;
        boolean zM3003m;
        Object obj2 = get(i);
        do {
            synchronized (p30.f4745l) {
                c41 c41Var = this.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i2 = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            AbstractC0112d0 abstractC0112d0Mo13h = abstractC0112d0.mo13h(i, obj);
            if (abstractC0112d0Mo13h.equals(abstractC0112d0)) {
                break;
            }
            c41 c41Var3 = this.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = p30.m3003m((c41) t21.m4185w(c41Var3, this, l21VarM4172j), i2, abstractC0112d0Mo13h, false);
            }
            t21.m4176n(l21VarM4172j, this);
        } while (!zM3003m);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return p30.m2969E(this).f689c.mo6a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            wr0.m5024a("fromIndex or toIndex are out of bounds");
        }
        return new t41(this, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return s91.m4031R(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        c41 c41Var = this.f650d;
        c41Var.getClass();
        return "SnapshotStateList(value=" + ((c41) t21.m4170h(c41Var)).f689c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC0112d0 abstractC0112d0 = p30.m2969E(this).f689c;
        int iMo6a = abstractC0112d0.mo6a();
        parcel.writeInt(iMo6a);
        for (int i2 = 0; i2 < iMo6a; i2++) {
            parcel.writeValue(abstractC0112d0.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return s91.m4032S(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new C0530ny(this, i);
    }

    public c31() {
        this(a21.f28e);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC0112d0 abstractC0112d0;
        l21 l21VarM4172j;
        boolean zM3003m;
        do {
            synchronized (p30.f4745l) {
                c41 c41Var = this.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i2 = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            AbstractC0112d0 abstractC0112d0Mo7b = abstractC0112d0.mo7b(i, obj);
            if (abstractC0112d0Mo7b.equals(abstractC0112d0)) {
                return;
            }
            c41 c41Var3 = this.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = p30.m3003m((c41) t21.m4185w(c41Var3, this, l21VarM4172j), i2, abstractC0112d0Mo7b, true);
            }
            t21.m4176n(l21VarM4172j, this);
        } while (!zM3003m);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return p30.m2980P(this, new h00(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC0112d0 abstractC0112d0;
        l21 l21VarM4172j;
        boolean zM3003m;
        Object obj = get(i);
        do {
            synchronized (p30.f4745l) {
                c41 c41Var = this.f650d;
                c41Var.getClass();
                c41 c41Var2 = (c41) t21.m4170h(c41Var);
                i2 = c41Var2.f690d;
                abstractC0112d0 = c41Var2.f689c;
            }
            abstractC0112d0.getClass();
            AbstractC0112d0 abstractC0112d0Mo12g = abstractC0112d0.mo12g(i);
            if (abstractC0112d0Mo12g.equals(abstractC0112d0)) {
                break;
            }
            c41 c41Var3 = this.f650d;
            c41Var3.getClass();
            synchronized (t21.f5893c) {
                l21VarM4172j = t21.m4172j();
                zM3003m = p30.m3003m((c41) t21.m4185w(c41Var3, this, l21VarM4172j), i2, abstractC0112d0Mo12g, true);
            }
            t21.m4176n(l21VarM4172j, this);
        } while (!zM3003m);
        return obj;
    }
}
