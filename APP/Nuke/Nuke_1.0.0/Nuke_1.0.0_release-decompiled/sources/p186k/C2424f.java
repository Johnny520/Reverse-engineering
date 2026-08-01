package p186k;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import p061L2.AbstractC0972l;
import p061L2.AbstractC0973m;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1767b;
import p122Y2.InterfaceC1769d;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: k.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2424f implements Collection, Set, InterfaceC1767b, InterfaceC1769d {

    /* JADX INFO: renamed from: d */
    public int[] f7838d = AbstractC2477a.f7971a;

    /* JADX INFO: renamed from: e */
    public Object[] f7839e = AbstractC2477a.f7973c;

    /* JADX INFO: renamed from: f */
    public int f7840f;

    /* JADX INFO: renamed from: a */
    public final Object m4316a(int i5) {
        int i6 = this.f7840f;
        Object[] objArr = this.f7839e;
        Object obj = objArr[i5];
        if (i6 <= 1) {
            clear();
            return obj;
        }
        int i7 = i6 - 1;
        int[] iArr = this.f7838d;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            if (i5 < i7) {
                int i8 = i5 + 1;
                AbstractC0972l.m1991O(iArr, iArr, i5, i8, i6);
                Object[] objArr2 = this.f7839e;
                AbstractC0972l.m1993Q(objArr2, objArr2, i5, i8, i6);
            }
            this.f7839e[i7] = null;
        } else {
            int i9 = i6 > 8 ? i6 + (i6 >> 1) : 8;
            int[] iArr2 = new int[i9];
            this.f7838d = iArr2;
            this.f7839e = new Object[i9];
            if (i5 > 0) {
                AbstractC0972l.m1994R(iArr, iArr2, 0, i5, 6);
                AbstractC0972l.m1995S(objArr, this.f7839e, 0, i5, 6);
            }
            if (i5 < i7) {
                int i10 = i5 + 1;
                AbstractC0972l.m1991O(iArr, this.f7838d, i5, i10, i6);
                AbstractC0972l.m1993Q(objArr, this.f7839e, i5, i10, i6);
            }
        }
        if (i6 != this.f7840f) {
            throw new ConcurrentModificationException();
        }
        this.f7840f = i7;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i5;
        int iM4325a;
        int i6 = this.f7840f;
        if (obj == null) {
            iM4325a = AbstractC2434p.m4325a(this, null, 0);
            i5 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i5 = iHashCode;
            iM4325a = AbstractC2434p.m4325a(this, obj, iHashCode);
        }
        if (iM4325a >= 0) {
            return false;
        }
        int i7 = ~iM4325a;
        int[] iArr = this.f7838d;
        if (i6 >= iArr.length) {
            int i8 = 8;
            if (i6 >= 8) {
                i8 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.f7839e;
            int[] iArr2 = new int[i8];
            this.f7838d = iArr2;
            this.f7839e = new Object[i8];
            if (i6 != this.f7840f) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC0972l.m1994R(iArr, iArr2, 0, iArr.length, 6);
                AbstractC0972l.m1995S(objArr, this.f7839e, 0, objArr.length, 6);
            }
        }
        if (i7 < i6) {
            int[] iArr3 = this.f7838d;
            int i9 = i7 + 1;
            AbstractC0972l.m1991O(iArr3, iArr3, i9, i7, i6);
            Object[] objArr2 = this.f7839e;
            AbstractC0972l.m1993Q(objArr2, objArr2, i9, i7, i6);
        }
        int i10 = this.f7840f;
        if (i6 == i10) {
            int[] iArr4 = this.f7838d;
            if (i7 < iArr4.length) {
                iArr4[i7] = i5;
                this.f7839e[i7] = obj;
                this.f7840f = i10 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        int size = collection.size() + this.f7840f;
        int i5 = this.f7840f;
        int[] iArr = this.f7838d;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f7839e;
            int[] iArr2 = new int[size];
            this.f7838d = iArr2;
            this.f7839e = new Object[size];
            if (i5 > 0) {
                AbstractC0972l.m1994R(iArr, iArr2, 0, i5, 6);
                AbstractC0972l.m1995S(objArr, this.f7839e, 0, this.f7840f, 6);
            }
        }
        if (this.f7840f != i5) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f7840f != 0) {
            this.f7838d = AbstractC2477a.f7971a;
            this.f7839e = AbstractC2477a.f7973c;
            this.f7840f = 0;
        }
        if (this.f7840f != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC2434p.m4325a(this, null, 0) : AbstractC2434p.m4325a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f7840f != ((Set) obj).size()) {
            return false;
        }
        try {
            int i5 = this.f7840f;
            for (int i6 = 0; i6 < i5; i6++) {
                if (!((Set) obj).contains(this.f7839e[i6])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f7838d;
        int i5 = this.f7840f;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6 += iArr[i7];
        }
        return i6;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f7840f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2419a(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM4325a = obj == null ? AbstractC2434p.m4325a(this, null, 0) : AbstractC2434p.m4325a(this, obj, obj.hashCode());
        if (iM4325a < 0) {
            return false;
        }
        m4316a(iM4325a);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC1665j.m2985e(collection, "elements");
        boolean z5 = false;
        for (int i5 = this.f7840f - 1; -1 < i5; i5--) {
            if (!AbstractC0973m.m2010Q(collection, this.f7839e[i5])) {
                m4316a(i5);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f7840f;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0972l.m1997U(this.f7839e, 0, this.f7840f);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7840f * 14);
        sb.append('{');
        int i5 = this.f7840f;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object obj = this.f7839e[i6];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        AbstractC1665j.m2985e(objArr, "array");
        int i5 = this.f7840f;
        if (objArr.length < i5) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i5);
        } else if (objArr.length > i5) {
            objArr[i5] = null;
        }
        AbstractC0972l.m1993Q(this.f7839e, objArr, 0, 0, this.f7840f);
        return objArr;
    }
}
