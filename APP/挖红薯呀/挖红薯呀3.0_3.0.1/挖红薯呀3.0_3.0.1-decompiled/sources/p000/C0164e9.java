package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: e9 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0164e9 implements Collection, Set, q40, t40 {

    /* JADX INFO: renamed from: d */
    public int[] f1350d = o30.f4432b;

    /* JADX INFO: renamed from: e */
    public Object[] f1351e = o30.f4434d;

    /* JADX INFO: renamed from: f */
    public int f1352f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m802a(int i) {
        int i2 = this.f1352f;
        Object[] objArr = this.f1351e;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f1350d;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC0201f9.m1055a0(iArr, iArr, i, i4, i2);
                Object[] objArr2 = this.f1351e;
                AbstractC0201f9.m1057c0(objArr2, objArr2, i, i4, i2);
            }
            this.f1351e[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f1350d = iArr2;
            this.f1351e = new Object[i5];
            if (i > 0) {
                AbstractC0201f9.m1058d0(iArr, iArr2, 0, i, 6);
                AbstractC0201f9.m1059e0(objArr, this.f1351e, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC0201f9.m1055a0(iArr, this.f1350d, i, i6, i2);
                AbstractC0201f9.m1057c0(objArr, this.f1351e, i, i6, i2);
            }
        }
        if (i2 != this.f1352f) {
            throw new ConcurrentModificationException();
        }
        this.f1352f = i3;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM2781u;
        int i2 = this.f1352f;
        if (obj == null) {
            iM2781u = o30.m2781u(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM2781u = o30.m2781u(this, obj, iHashCode);
        }
        if (iM2781u >= 0) {
            return false;
        }
        int i3 = ~iM2781u;
        int[] iArr = this.f1350d;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f1351e;
            int[] iArr2 = new int[i4];
            this.f1350d = iArr2;
            this.f1351e = new Object[i4];
            if (i2 != this.f1352f) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                AbstractC0201f9.m1058d0(iArr, iArr2, 0, iArr.length, 6);
                AbstractC0201f9.m1059e0(objArr, this.f1351e, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f1350d;
            int i5 = i3 + 1;
            AbstractC0201f9.m1055a0(iArr3, iArr3, i5, i3, i2);
            Object[] objArr2 = this.f1351e;
            AbstractC0201f9.m1057c0(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f1352f;
        if (i2 == i6) {
            int[] iArr4 = this.f1350d;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f1351e[i3] = obj;
                this.f1352f = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        collection.getClass();
        int size = collection.size() + this.f1352f;
        int i = this.f1352f;
        int[] iArr = this.f1350d;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1351e;
            int[] iArr2 = new int[size];
            this.f1350d = iArr2;
            this.f1351e = new Object[size];
            if (i > 0) {
                AbstractC0201f9.m1058d0(iArr, iArr2, 0, i, 6);
                AbstractC0201f9.m1059e0(objArr, this.f1351e, 0, this.f1352f, 6);
            }
        }
        if (this.f1352f != i) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f1352f != 0) {
            this.f1350d = o30.f4432b;
            this.f1351e = o30.f4434d;
            this.f1352f = 0;
        }
        if (this.f1352f != 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? o30.m2781u(this, null, 0) : o30.m2781u(this, obj, obj.hashCode())) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f1352f != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f1352f;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f1351e[i2])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f1350d;
        int i = this.f1352f;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1352f <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0991z8(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM2781u = obj == null ? o30.m2781u(this, null, 0) : o30.m2781u(this, obj, obj.hashCode());
        if (iM2781u < 0) {
            return false;
        }
        m802a(iM2781u);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        boolean z = false;
        for (int i = this.f1352f - 1; -1 < i; i--) {
            if (!AbstractC0960ye.m5239I(collection, this.f1351e[i])) {
                m802a(i);
                z = true;
            }
        }
        return z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1352f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int i = this.f1352f;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC0201f9.m1057c0(this.f1351e, objArr, 0, 0, this.f1352f);
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1352f * 14);
        sb.append('{');
        int i = this.f1352f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1351e[i2];
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
        return AbstractC0201f9.m1060f0(this.f1351e, 0, this.f1352f);
    }
}
