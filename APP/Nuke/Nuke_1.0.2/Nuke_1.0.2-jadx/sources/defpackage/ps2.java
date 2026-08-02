package defpackage;

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
    public mu2 h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ps2(c3 c3Var) {
        vr2 vr2VarJ = ds2.j();
        mu2 mu2Var = new mu2(vr2VarJ.g(), c3Var);
        if (!(vr2VarJ instanceof hq0)) {
            mu2Var.b = new mu2(1L, c3Var);
        }
        this.h = mu2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final ru2 a() {
        return this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        c3 c3Var;
        vr2 vr2VarJ;
        boolean zH;
        do {
            synchronized (tl.g) {
                mu2 mu2Var = this.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            c3 c3VarC = c3Var.c(obj);
            if (c3VarC.equals(c3Var)) {
                return false;
            }
            mu2 mu2Var3 = this.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = tl.h((mu2) ds2.w(mu2Var3, this, vr2VarJ), i, c3VarC, true);
            }
            ds2.n(vr2VarJ, this);
        } while (!zH);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        c3 c3Var;
        vr2 vr2VarJ;
        boolean zH;
        do {
            synchronized (tl.g) {
                mu2 mu2Var = this.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            c3 c3VarD = c3Var.d(collection);
            if (t11.l(c3VarD, c3Var)) {
                return false;
            }
            mu2 mu2Var3 = this.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = tl.h((mu2) ds2.w(mu2Var3, this, vr2VarJ), i, c3VarD, true);
            }
            ds2.n(vr2VarJ, this);
        } while (!zH);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.pu2
    public final void c(ru2 ru2Var) {
        ru2Var.b = this.h;
        this.h = (mu2) ru2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        vr2 vr2VarJ;
        mu2 mu2Var = this.h;
        mu2Var.getClass();
        synchronized (ds2.c) {
            vr2VarJ = ds2.j();
            mu2 mu2Var2 = (mu2) ds2.w(mu2Var, this, vr2VarJ);
            synchronized (tl.g) {
                mu2Var2.c = ur2.i;
                mu2Var2.d++;
                mu2Var2.e++;
            }
        }
        ds2.n(vr2VarJ, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return tl.G(this).c.contains(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return tl.G(this).c.containsAll(collection);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, int i2) {
        int i3;
        c3 c3Var;
        vr2 vr2VarJ;
        boolean zH;
        do {
            synchronized (tl.g) {
                mu2 mu2Var = this.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i3 = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            lz1 lz1VarE = c3Var.e();
            lz1VarE.subList(i, i2).clear();
            c3 c3VarC = lz1VarE.c();
            if (t11.l(c3VarC, c3Var)) {
                return;
            }
            mu2 mu2Var3 = this.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = tl.h((mu2) ds2.w(mu2Var3, this, vr2VarJ), i3, c3VarC, true);
            }
            ds2.n(vr2VarJ, this);
        } while (!zH);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i) {
        return tl.G(this).c.get(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        return tl.G(this).c.indexOf(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return tl.G(this).c.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return tl.G(this).c.lastIndexOf(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final ListIterator listIterator() {
        return new vs0(this, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        c3 c3Var;
        vr2 vr2VarJ;
        boolean zH;
        do {
            synchronized (tl.g) {
                mu2 mu2Var = this.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            int iIndexOf = c3Var.indexOf(obj);
            c3 c3VarG = iIndexOf != -1 ? c3Var.g(iIndexOf) : c3Var;
            if (c3VarG.equals(c3Var)) {
                return false;
            }
            mu2 mu2Var3 = this.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = tl.h((mu2) ds2.w(mu2Var3, this, vr2VarJ), i, c3VarG, true);
            }
            ds2.n(vr2VarJ, this);
        } while (!zH);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        c3 c3Var;
        vr2 vr2VarJ;
        boolean zH;
        do {
            synchronized (tl.g) {
                mu2 mu2Var = this.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            c3 c3VarF = c3Var.f(new b3(0, collection));
            if (t11.l(c3VarF, c3Var)) {
                return false;
            }
            mu2 mu2Var3 = this.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = tl.h((mu2) ds2.w(mu2Var3, this, vr2VarJ), i, c3VarF, true);
            }
            ds2.n(vr2VarJ, this);
        } while (!zH);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return tl.N(this, new b3(2, collection));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        c3 c3Var;
        vr2 vr2VarJ;
        boolean zH;
        Object obj2 = get(i);
        do {
            synchronized (tl.g) {
                mu2 mu2Var = this.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i2 = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            c3 c3VarH = c3Var.h(i, obj);
            if (c3VarH.equals(c3Var)) {
                break;
            }
            mu2 mu2Var3 = this.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = tl.h((mu2) ds2.w(mu2Var3, this, vr2VarJ), i2, c3VarH, false);
            }
            ds2.n(vr2VarJ, this);
        } while (!zH);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final int size() {
        return tl.G(this).c.a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            j22.a("fromIndex or toIndex are out of bounds");
        }
        return new ew2(this, i, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return tl.a0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        mu2 mu2Var = this.h;
        mu2Var.getClass();
        return "SnapshotStateList(value=" + ((mu2) ds2.h(mu2Var)).c + ")@" + hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        c3 c3Var = tl.G(this).c;
        int iA = c3Var.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(c3Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return tl.b0(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new vs0(this, i);
    }

    public ps2() {
        this(ur2.i);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        c3 c3Var;
        vr2 vr2VarJ;
        boolean zH;
        do {
            synchronized (tl.g) {
                mu2 mu2Var = this.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i2 = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            c3 c3VarB = c3Var.b(i, obj);
            if (c3VarB.equals(c3Var)) {
                return;
            }
            mu2 mu2Var3 = this.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = tl.h((mu2) ds2.w(mu2Var3, this, vr2VarJ), i2, c3VarB, true);
            }
            ds2.n(vr2VarJ, this);
        } while (!zH);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        return tl.N(this, new o4(i, collection));
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        c3 c3Var;
        vr2 vr2VarJ;
        boolean zH;
        Object obj = get(i);
        do {
            synchronized (tl.g) {
                mu2 mu2Var = this.h;
                mu2Var.getClass();
                mu2 mu2Var2 = (mu2) ds2.h(mu2Var);
                i2 = mu2Var2.d;
                c3Var = mu2Var2.c;
            }
            c3Var.getClass();
            c3 c3VarG = c3Var.g(i);
            if (c3VarG.equals(c3Var)) {
                break;
            }
            mu2 mu2Var3 = this.h;
            mu2Var3.getClass();
            synchronized (ds2.c) {
                vr2VarJ = ds2.j();
                zH = tl.h((mu2) ds2.w(mu2Var3, this, vr2VarJ), i2, c3VarG, true);
            }
            ds2.n(vr2VarJ, this);
        } while (!zH);
        return obj;
    }
}
