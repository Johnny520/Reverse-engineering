package p063j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0958c implements Collection, Set {

    /* JADX INFO: renamed from: e */
    public static final int[] f3392e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f3393f = new Object[0];

    /* JADX INFO: renamed from: g */
    public static Object[] f3394g;

    /* JADX INFO: renamed from: h */
    public static int f3395h;

    /* JADX INFO: renamed from: i */
    public static Object[] f3396i;

    /* JADX INFO: renamed from: j */
    public static int f3397j;

    /* JADX INFO: renamed from: a */
    public int[] f3398a;

    /* JADX INFO: renamed from: b */
    public Object[] f3399b;

    /* JADX INFO: renamed from: c */
    public int f3400c;

    /* JADX INFO: renamed from: d */
    public C0956a f3401d;

    /* JADX INFO: renamed from: b */
    public static void m2299b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0958c.class) {
                try {
                    if (f3397j < 10) {
                        objArr[0] = f3396i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f3396i = objArr;
                        f3397j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0958c.class) {
                try {
                    if (f3395h < 10) {
                        objArr[0] = f3394g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f3394g = objArr;
                        f3395h++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2300a(int i2) {
        if (i2 == 8) {
            synchronized (C0958c.class) {
                try {
                    Object[] objArr = f3396i;
                    if (objArr != null) {
                        this.f3399b = objArr;
                        f3396i = (Object[]) objArr[0];
                        this.f3398a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3397j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C0958c.class) {
                try {
                    Object[] objArr2 = f3394g;
                    if (objArr2 != null) {
                        this.f3399b = objArr2;
                        f3394g = (Object[]) objArr2[0];
                        this.f3398a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3395h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f3398a = new int[i2];
        this.f3399b = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iM2301c;
        if (obj == null) {
            iM2301c = m2302d();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iM2301c = m2301c(iHashCode, obj);
        }
        if (iM2301c >= 0) {
            return false;
        }
        int i3 = ~iM2301c;
        int i4 = this.f3400c;
        int[] iArr = this.f3398a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f3399b;
            m2300a(i5);
            int[] iArr2 = this.f3398a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3399b, 0, objArr.length);
            }
            m2299b(iArr, objArr, this.f3400c);
        }
        int i6 = this.f3400c;
        if (i3 < i6) {
            int[] iArr3 = this.f3398a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f3399b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f3400c - i3);
        }
        this.f3398a[i3] = i2;
        this.f3399b[i3] = obj;
        this.f3400c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f3400c;
        int[] iArr = this.f3398a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3399b;
            m2300a(size);
            int i2 = this.f3400c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f3398a, 0, i2);
                System.arraycopy(objArr, 0, this.f3399b, 0, this.f3400c);
            }
            m2299b(iArr, objArr, this.f3400c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public final int m2301c(int i2, Object obj) {
        int i3 = this.f3400c;
        if (i3 == 0) {
            return -1;
        }
        int iM2304a = AbstractC0959d.m2304a(i3, i2, this.f3398a);
        if (iM2304a < 0 || obj.equals(this.f3399b[iM2304a])) {
            return iM2304a;
        }
        int i4 = iM2304a + 1;
        while (i4 < i3 && this.f3398a[i4] == i2) {
            if (obj.equals(this.f3399b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iM2304a - 1; i5 >= 0 && this.f3398a[i5] == i2; i5--) {
            if (obj.equals(this.f3399b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f3400c;
        if (i2 != 0) {
            m2299b(this.f3398a, this.f3399b, i2);
            this.f3398a = f3392e;
            this.f3399b = f3393f;
            this.f3400c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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

    /* JADX INFO: renamed from: d */
    public final int m2302d() {
        int i2 = this.f3400c;
        if (i2 == 0) {
            return -1;
        }
        int iM2304a = AbstractC0959d.m2304a(i2, 0, this.f3398a);
        if (iM2304a < 0 || this.f3399b[iM2304a] == null) {
            return iM2304a;
        }
        int i3 = iM2304a + 1;
        while (i3 < i2 && this.f3398a[i3] == 0) {
            if (this.f3399b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM2304a - 1; i4 >= 0 && this.f3398a[i4] == 0; i4--) {
            if (this.f3399b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: e */
    public final void m2303e(int i2) {
        Object[] objArr = this.f3399b;
        Object obj = objArr[i2];
        int i3 = this.f3400c;
        if (i3 <= 1) {
            m2299b(this.f3398a, objArr, i3);
            this.f3398a = f3392e;
            this.f3399b = f3393f;
            this.f3400c = 0;
            return;
        }
        int[] iArr = this.f3398a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.f3400c = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                Object[] objArr2 = this.f3399b;
                System.arraycopy(objArr2, i5, objArr2, i2, this.f3400c - i2);
            }
            this.f3399b[this.f3400c] = null;
            return;
        }
        m2300a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.f3400c--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.f3398a, 0, i2);
            System.arraycopy(objArr, 0, this.f3399b, 0, i2);
        }
        int i6 = this.f3400c;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, this.f3398a, i2, i6 - i2);
            System.arraycopy(objArr, i7, this.f3399b, i2, this.f3400c - i2);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3400c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f3400c; i2++) {
                try {
                    if (!set.contains(this.f3399b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f3398a;
        int i2 = this.f3400c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public final int indexOf(Object obj) {
        return obj == null ? m2302d() : m2301c(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3400c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f3401d == null) {
            this.f3401d = new C0956a(1, this);
        }
        C0956a c0956a = this.f3401d;
        if (c0956a.f3387b == null) {
            c0956a.f3387b = new C0963h(c0956a, 1);
        }
        return c0956a.f3387b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        m2303e(iIndexOf);
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
        boolean z2 = false;
        for (int i2 = this.f3400c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f3399b[i2])) {
                m2303e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3400c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.f3400c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f3399b, 0, objArr, 0, i2);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3400c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3400c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f3399b[i2];
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
        if (objArr.length < this.f3400c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f3400c);
        }
        System.arraycopy(this.f3399b, 0, objArr, 0, this.f3400c);
        int length = objArr.length;
        int i2 = this.f3400c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
