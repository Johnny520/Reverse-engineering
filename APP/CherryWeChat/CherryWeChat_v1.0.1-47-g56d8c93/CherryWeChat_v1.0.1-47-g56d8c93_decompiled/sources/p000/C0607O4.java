package p000;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: O4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0607O4 implements Collection, Set, InterfaceC0588Nm {

    /* JADX INFO: renamed from: a */
    public int[] f1945a = AbstractC0714Qj.f2294a;

    /* JADX INFO: renamed from: b */
    public Object[] f1946b = AbstractC0714Qj.f2295b;

    /* JADX INFO: renamed from: c */
    public int f1947c;

    /* JADX INFO: renamed from: a */
    public final Object m1186a(int i) {
        int i2 = this.f1947c;
        Object[] objArr = this.f1946b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i3 = i2 - 1;
        int[] iArr = this.f1945a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i3) {
                int i4 = i + 1;
                AbstractC0650P4.m1309D(i, i4, iArr, iArr, i2);
                Object[] objArr2 = this.f1946b;
                AbstractC0650P4.m1310E(objArr2, objArr2, i, i4, i2);
            }
            this.f1946b[i3] = null;
        } else {
            int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            int[] iArr2 = new int[i5];
            this.f1945a = iArr2;
            this.f1946b = new Object[i5];
            if (i > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i);
                AbstractC0650P4.m1311F(objArr, this.f1946b, 0, i, 6);
            }
            if (i < i3) {
                int i6 = i + 1;
                AbstractC0650P4.m1309D(i, i6, iArr, this.f1945a, i2);
                AbstractC0650P4.m1310E(objArr, this.f1946b, i, i6, i2);
            }
        }
        if (i2 != this.f1947c) {
            throw new ConcurrentModificationException();
        }
        this.f1947c = i3;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM1223C;
        int i2 = this.f1947c;
        if (obj == null) {
            iM1223C = AbstractC0628Oj.m1223C(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM1223C = AbstractC0628Oj.m1223C(this, obj, iHashCode);
        }
        if (iM1223C >= 0) {
            return false;
        }
        int i3 = ~iM1223C;
        int[] iArr = this.f1945a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f1946b;
            int[] iArr2 = new int[i4];
            this.f1945a = iArr2;
            this.f1946b = new Object[i4];
            if (i2 != this.f1947c) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                AbstractC0650P4.m1311F(objArr, this.f1946b, 0, objArr.length, 6);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.f1945a;
            int i5 = i3 + 1;
            AbstractC0650P4.m1309D(i5, i3, iArr3, iArr3, i2);
            Object[] objArr2 = this.f1946b;
            AbstractC0650P4.m1310E(objArr2, objArr2, i5, i3, i2);
        }
        int i6 = this.f1947c;
        if (i2 == i6) {
            int[] iArr4 = this.f1945a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.f1946b[i3] = obj;
                this.f1947c = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f1947c;
        int i = this.f1947c;
        int[] iArr = this.f1945a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f1946b;
            int[] iArr2 = new int[size];
            this.f1945a = iArr2;
            this.f1946b = new Object[size];
            if (i > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i);
                AbstractC0650P4.m1311F(objArr, this.f1946b, 0, this.f1947c, 6);
            }
        }
        if (this.f1947c != i) {
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
        if (this.f1947c != 0) {
            this.f1945a = AbstractC0714Qj.f2294a;
            this.f1946b = AbstractC0714Qj.f2295b;
            this.f1947c = 0;
        }
        if (this.f1947c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? AbstractC0628Oj.m1223C(this, null, 0) : AbstractC0628Oj.m1223C(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
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
        if (!(obj instanceof Set) || this.f1947c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i = this.f1947c;
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) obj).contains(this.f1946b[i2])) {
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
        int[] iArr = this.f1945a;
        int i = this.f1947c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f1947c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0349I4(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM1223C = obj == null ? AbstractC0628Oj.m1223C(this, null, 0) : AbstractC0628Oj.m1223C(this, obj, obj.hashCode());
        if (iM1223C < 0) {
            return false;
        }
        m1186a(iM1223C);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.f1947c - 1; -1 < i; i--) {
            if (!AbstractC2453ra.m4897g0(collection, this.f1946b[i])) {
                m1186a(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f1947c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f1946b;
        int i = this.f1947c;
        int length = objArr.length;
        if (i <= length) {
            return Arrays.copyOfRange(objArr, 0, i);
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f1947c * 14);
        sb.append('{');
        int i = this.f1947c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f1946b[i2];
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
    public final Object[] toArray(Object[] objArr) {
        int i = this.f1947c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        AbstractC0650P4.m1310E(this.f1946b, objArr, 0, 0, this.f1947c);
        return objArr;
    }
}
