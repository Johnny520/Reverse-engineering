package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: jg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0349jg implements Collection, Set, q41, t41 {

    /* JADX INFO: renamed from: h */
    public int[] f5020h = rg3.f9564f;

    /* JADX INFO: renamed from: i */
    public Object[] f5021i = rg3.f9566h;

    /* JADX INFO: renamed from: j */
    public int f5022j;

    /* JADX INFO: renamed from: a */
    public final Object m2495a(int i) {
        int i2 = this.f5022j;
        Object[] objArr = this.f5021i;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f5020h;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC0460mg.m3086a0(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.f5021i;
                AbstractC0460mg.m3088c0(objArr2, objArr2, i, i4, i2);
            }
            this.f5021i[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f5020h = iArr2;
            this.f5021i = new Object[i5];
            if (i > 0) {
                AbstractC0460mg.m3090e0(iArr, iArr2, 0, i, 6);
                AbstractC0460mg.m3091f0(objArr, this.f5021i, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC0460mg.m3086a0(iArr, this.f5020h, i, i6, i2);
                AbstractC0460mg.m3088c0(objArr, this.f5021i, i, i6, i2);
            }
        }
        if (i2 != this.f5022j) {
            throw new ConcurrentModificationException();
        }
        this.f5022j = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM3696F;
        int i2 = this.f5022j;
        if (obj == null) {
            iM3696F = p40.m3696F(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM3696F = p40.m3696F(this, obj, iHashCode);
        }
        if (iM3696F >= 0) {
            return false;
        }
        int i3 = ~iM3696F;
        int[] iArr = this.f5020h;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f5021i;
            int[] iArr2 = new int[i4];
            this.f5020h = iArr2;
            this.f5021i = new Object[i4];
            if (i2 != this.f5022j) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC0460mg.m3090e0(iArr, iArr2, 0, iArr.length, 6);
                AbstractC0460mg.m3091f0(objArr, this.f5021i, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f5020h;
            int i5 = i3 + 1;
            AbstractC0460mg.m3086a0(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.f5021i;
            AbstractC0460mg.m3088c0(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f5022j;
        if (i2 == i6) {
            int[] iArr4 = this.f5020h;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f5021i[i3] = obj;
                this.f5022j = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f5022j;
        int i = this.f5022j;
        int[] iArr = this.f5020h;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f5021i;
            int[] iArr2 = new int[size];
            this.f5020h = iArr2;
            this.f5021i = new Object[size];
            if (i > 0) {
                AbstractC0460mg.m3090e0(iArr, iArr2, 0, i, 6);
                AbstractC0460mg.m3091f0(objArr, this.f5021i, 0, this.f5022j, 6);
            }
        }
        if (this.f5022j != i) {
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
        if (this.f5022j != 0) {
            this.f5020h = rg3.f9564f;
            this.f5021i = rg3.f9566h;
            this.f5022j = 0;
        }
        if (this.f5022j != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? p40.m3696F(this, null, 0) : p40.m3696F(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        collection.getClass();
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
        if ((obj instanceof Set) && this.f5022j == ((Set) obj).size()) {
            try {
                int i = this.f5022j;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.f5021i[i2])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f5020h;
        int i = this.f5022j;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f5022j <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0129dg(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM3696F = obj == null ? p40.m3696F(this, null, 0) : p40.m3696F(this, obj, obj.hashCode());
        if (iM3696F < 0) {
            return false;
        }
        m2495a(iM3696F);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        collection.getClass();
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.f5022j - 1; -1 < i; i--) {
            if (!AbstractC0142du.m1157m0(collection, this.f5021i[i])) {
                m2495a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f5022j;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f5022j;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC0460mg.m3088c0(this.f5021i, objArr, 0, 0, this.f5022j);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f5022j * 14);
        sb.append('{');
        int i = this.f5022j;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f5021i[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC0460mg.m3093h0(this.f5021i, 0, this.f5022j);
    }
}
