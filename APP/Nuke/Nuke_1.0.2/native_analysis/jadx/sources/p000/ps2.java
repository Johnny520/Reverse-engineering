package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ps2 implements Parcelable, pu2, List, RandomAccess, q41 {
    public static final Parcelable.Creator<ps2> CREATOR = new os2();

    /* JADX INFO: renamed from: h */
    public mu2 f8552h;

    public ps2(AbstractC0077c3 abstractC0077c3) {
        vr2 vr2VarM1126j = ds2.m1126j();
        mu2 mu2Var = new mu2(vr2VarM1126j.mo79g(), abstractC0077c3);
        if (!(vr2VarM1126j instanceof hq0)) {
            mu2Var.f9761b = new mu2(1L, abstractC0077c3);
        }
        this.f8552h = mu2Var;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: a */
    public final ru2 mo2588a() {
        return this.f8552h;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        AbstractC0077c3 abstractC0077c3;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        do {
            synchronized (AbstractC0738tl.f10826g) {
                mu2 mu2Var = this.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            AbstractC0077c3 abstractC0077c3Mo620c = abstractC0077c3.mo620c(obj);
            if (abstractC0077c3Mo620c.equals(abstractC0077c3)) {
                return false;
            }
            mu2 mu2Var3 = this.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = AbstractC0738tl.m5309h((mu2) ds2.m1139w(mu2Var3, this, vr2VarM1126j), i, abstractC0077c3Mo620c, true);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM5309h);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        AbstractC0077c3 abstractC0077c3;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        do {
            synchronized (AbstractC0738tl.f10826g) {
                mu2 mu2Var = this.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            AbstractC0077c3 abstractC0077c3Mo621d = abstractC0077c3.mo621d(collection);
            if (t11.m5086l(abstractC0077c3Mo621d, abstractC0077c3)) {
                return false;
            }
            mu2 mu2Var3 = this.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = AbstractC0738tl.m5309h((mu2) ds2.m1139w(mu2Var3, this, vr2VarM1126j), i, abstractC0077c3Mo621d, true);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM5309h);
        return true;
    }

    @Override // p000.pu2
    /* JADX INFO: renamed from: c */
    public final void mo2590c(ru2 ru2Var) {
        ru2Var.f9761b = this.f8552h;
        this.f8552h = (mu2) ru2Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        vr2 vr2VarM1126j;
        mu2 mu2Var = this.f8552h;
        mu2Var.getClass();
        synchronized (ds2.f2181c) {
            vr2VarM1126j = ds2.m1126j();
            mu2 mu2Var2 = (mu2) ds2.m1139w(mu2Var, this, vr2VarM1126j);
            synchronized (AbstractC0738tl.f10826g) {
                mu2Var2.f6884c = ur2.f11454i;
                mu2Var2.f6885d++;
                mu2Var2.f6886e++;
            }
        }
        ds2.m1130n(vr2VarM1126j, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return AbstractC0738tl.m5280G(this).f6884c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return AbstractC0738tl.m5280G(this).f6884c.containsAll(collection);
    }

    /* JADX INFO: renamed from: d */
    public final void m3969d(int i, int i2) {
        int i3;
        AbstractC0077c3 abstractC0077c3;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        do {
            synchronized (AbstractC0738tl.f10826g) {
                mu2 mu2Var = this.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i3 = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            lz1 lz1VarMo622e = abstractC0077c3.mo622e();
            lz1VarMo622e.subList(i, i2).clear();
            AbstractC0077c3 abstractC0077c3M2997c = lz1VarMo622e.m2997c();
            if (t11.m5086l(abstractC0077c3M2997c, abstractC0077c3)) {
                return;
            }
            mu2 mu2Var3 = this.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = AbstractC0738tl.m5309h((mu2) ds2.m1139w(mu2Var3, this, vr2VarM1126j), i3, abstractC0077c3M2997c, true);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM5309h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return AbstractC0738tl.m5280G(this).f6884c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return AbstractC0738tl.m5280G(this).f6884c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return AbstractC0738tl.m5280G(this).f6884c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return AbstractC0738tl.m5280G(this).f6884c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new vs0(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        AbstractC0077c3 abstractC0077c3;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        do {
            synchronized (AbstractC0738tl.f10826g) {
                mu2 mu2Var = this.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            int iIndexOf = abstractC0077c3.indexOf(obj);
            AbstractC0077c3 abstractC0077c3Mo624g = iIndexOf != -1 ? abstractC0077c3.mo624g(iIndexOf) : abstractC0077c3;
            if (abstractC0077c3Mo624g.equals(abstractC0077c3)) {
                return false;
            }
            mu2 mu2Var3 = this.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = AbstractC0738tl.m5309h((mu2) ds2.m1139w(mu2Var3, this, vr2VarM1126j), i, abstractC0077c3Mo624g, true);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM5309h);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        AbstractC0077c3 abstractC0077c3;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        do {
            synchronized (AbstractC0738tl.f10826g) {
                mu2 mu2Var = this.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            AbstractC0077c3 abstractC0077c3Mo623f = abstractC0077c3.mo623f(new C0041b3(0, collection));
            if (t11.m5086l(abstractC0077c3Mo623f, abstractC0077c3)) {
                return false;
            }
            mu2 mu2Var3 = this.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = AbstractC0738tl.m5309h((mu2) ds2.m1139w(mu2Var3, this, vr2VarM1126j), i, abstractC0077c3Mo623f, true);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM5309h);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return AbstractC0738tl.m5286N(this, new C0041b3(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        AbstractC0077c3 abstractC0077c3;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        Object obj2 = get(i);
        do {
            synchronized (AbstractC0738tl.f10826g) {
                mu2 mu2Var = this.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i2 = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            AbstractC0077c3 abstractC0077c3Mo625h = abstractC0077c3.mo625h(i, obj);
            if (abstractC0077c3Mo625h.equals(abstractC0077c3)) {
                break;
            }
            mu2 mu2Var3 = this.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = AbstractC0738tl.m5309h((mu2) ds2.m1139w(mu2Var3, this, vr2VarM1126j), i2, abstractC0077c3Mo625h, false);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM5309h);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return AbstractC0738tl.m5280G(this).f6884c.mo529a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            j22.m2429a("fromIndex or toIndex are out of bounds");
        }
        return new ew2(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return AbstractC0738tl.m5299a0(this);
    }

    public final String toString() {
        mu2 mu2Var = this.f8552h;
        mu2Var.getClass();
        return "SnapshotStateList(value=" + ((mu2) ds2.m1124h(mu2Var)).f6884c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC0077c3 abstractC0077c3 = AbstractC0738tl.m5280G(this).f6884c;
        int iMo529a = abstractC0077c3.mo529a();
        parcel.writeInt(iMo529a);
        for (int i2 = 0; i2 < iMo529a; i2++) {
            parcel.writeValue(abstractC0077c3.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC0738tl.m5301b0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new vs0(this, i);
    }

    public ps2() {
        this(ur2.f11454i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        AbstractC0077c3 abstractC0077c3;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        do {
            synchronized (AbstractC0738tl.f10826g) {
                mu2 mu2Var = this.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i2 = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            AbstractC0077c3 abstractC0077c3Mo619b = abstractC0077c3.mo619b(i, obj);
            if (abstractC0077c3Mo619b.equals(abstractC0077c3)) {
                return;
            }
            mu2 mu2Var3 = this.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = AbstractC0738tl.m5309h((mu2) ds2.m1139w(mu2Var3, this, vr2VarM1126j), i2, abstractC0077c3Mo619b, true);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM5309h);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return AbstractC0738tl.m5286N(this, new C0528o4(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        AbstractC0077c3 abstractC0077c3;
        vr2 vr2VarM1126j;
        boolean zM5309h;
        Object obj = get(i);
        do {
            synchronized (AbstractC0738tl.f10826g) {
                mu2 mu2Var = this.f8552h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.m1124h(mu2Var);
                i2 = mu2Var2.f6885d;
                abstractC0077c3 = mu2Var2.f6884c;
            }
            abstractC0077c3.getClass();
            AbstractC0077c3 abstractC0077c3Mo624g = abstractC0077c3.mo624g(i);
            if (abstractC0077c3Mo624g.equals(abstractC0077c3)) {
                break;
            }
            mu2 mu2Var3 = this.f8552h;
            mu2Var3.getClass();
            synchronized (ds2.f2181c) {
                vr2VarM1126j = ds2.m1126j();
                zM5309h = AbstractC0738tl.m5309h((mu2) ds2.m1139w(mu2Var3, this, vr2VarM1126j), i2, abstractC0077c3Mo624g, true);
            }
            ds2.m1130n(vr2VarM1126j, this);
        } while (!zM5309h);
        return obj;
    }
}
