package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0623q6 implements Collection, Set {

    /* JADX INFO: renamed from: e */
    public static final int[] f4027e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f4028f = new Object[0];

    /* JADX INFO: renamed from: g */
    public static Object[] f4029g;

    /* JADX INFO: renamed from: h */
    public static int f4030h;

    /* JADX INFO: renamed from: i */
    public static Object[] f4031i;

    /* JADX INFO: renamed from: j */
    public static int f4032j;

    /* JADX INFO: renamed from: a */
    public int[] f4033a = f4027e;

    /* JADX INFO: renamed from: b */
    public Object[] f4034b = f4028f;

    /* JADX INFO: renamed from: c */
    public int f4035c = 0;

    /* JADX INFO: renamed from: d */
    public C0474m6 f4036d;

    /* JADX INFO: renamed from: b */
    public static void m2151b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0623q6.class) {
                try {
                    if (f4032j < 10) {
                        objArr[0] = f4031i;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f4031i = objArr;
                        f4032j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0623q6.class) {
                try {
                    if (f4030h < 10) {
                        objArr[0] = f4029g;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f4029g = objArr;
                        f4030h++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2152a(int i) {
        if (i == 8) {
            synchronized (C0623q6.class) {
                try {
                    Object[] objArr = f4031i;
                    if (objArr != null) {
                        this.f4034b = objArr;
                        f4031i = (Object[]) objArr[0];
                        this.f4033a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4032j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C0623q6.class) {
                try {
                    Object[] objArr2 = f4029g;
                    if (objArr2 != null) {
                        this.f4034b = objArr2;
                        f4029g = (Object[]) objArr2[0];
                        this.f4033a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4030h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f4033a = new int[i];
        this.f4034b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM2153c;
        if (obj == null) {
            iM2153c = m2154d();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM2153c = m2153c(iHashCode, obj);
        }
        if (iM2153c >= 0) {
            return false;
        }
        int i2 = ~iM2153c;
        int i3 = this.f4035c;
        int[] iArr = this.f4033a;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f4034b;
            m2152a(i4);
            int[] iArr2 = this.f4033a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f4034b, 0, objArr.length);
            }
            m2151b(iArr, objArr, this.f4035c);
        }
        int i5 = this.f4035c;
        if (i2 < i5) {
            int[] iArr3 = this.f4033a;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f4034b;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f4035c - i2);
        }
        this.f4033a[i2] = i;
        this.f4034b[i2] = obj;
        this.f4035c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f4035c;
        int[] iArr = this.f4033a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f4034b;
            m2152a(size);
            int i = this.f4035c;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f4033a, 0, i);
                System.arraycopy(objArr, 0, this.f4034b, 0, this.f4035c);
            }
            m2151b(iArr, objArr, this.f4035c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public final int m2153c(int i, Object obj) {
        int i2 = this.f4035c;
        if (i2 == 0) {
            return -1;
        }
        int iM1184c = AbstractC0222ff.m1184c(i2, i, this.f4033a);
        if (iM1184c < 0 || obj.equals(this.f4034b[iM1184c])) {
            return iM1184c;
        }
        int i3 = iM1184c + 1;
        while (i3 < i2 && this.f4033a[i3] == i) {
            if (obj.equals(this.f4034b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM1184c - 1; i4 >= 0 && this.f4033a[i4] == i; i4--) {
            if (obj.equals(this.f4034b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f4035c;
        if (i != 0) {
            m2151b(this.f4033a, this.f4034b, i);
            this.f4033a = f4027e;
            this.f4034b = f4028f;
            this.f4035c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m2154d() : m2153c(obj.hashCode(), obj)) >= 0;
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
    public final int m2154d() {
        int i = this.f4035c;
        if (i == 0) {
            return -1;
        }
        int iM1184c = AbstractC0222ff.m1184c(i, 0, this.f4033a);
        if (iM1184c < 0 || this.f4034b[iM1184c] == null) {
            return iM1184c;
        }
        int i2 = iM1184c + 1;
        while (i2 < i && this.f4033a[i2] == 0) {
            if (this.f4034b[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM1184c - 1; i3 >= 0 && this.f4033a[i3] == 0; i3--) {
            if (this.f4034b[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m2155e(int i) {
        Object[] objArr = this.f4034b;
        Object obj = objArr[i];
        int i2 = this.f4035c;
        if (i2 <= 1) {
            m2151b(this.f4033a, objArr, i2);
            this.f4033a = f4027e;
            this.f4034b = f4028f;
            this.f4035c = 0;
            return;
        }
        int[] iArr = this.f4033a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f4035c = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f4034b;
                System.arraycopy(objArr2, i4, objArr2, i, this.f4035c - i);
            }
            this.f4034b[this.f4035c] = null;
            return;
        }
        m2152a(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f4035c--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f4033a, 0, i);
            System.arraycopy(objArr, 0, this.f4034b, 0, i);
        }
        int i5 = this.f4035c;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f4033a, i, i5 - i);
            System.arraycopy(objArr, i6, this.f4034b, i, this.f4035c - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f4035c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f4035c; i++) {
                try {
                    if (!set.contains(this.f4034b[i])) {
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
        int[] iArr = this.f4033a;
        int i = this.f4035c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f4035c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f4036d == null) {
            this.f4036d = new C0474m6(1, this);
        }
        C0474m6 c0474m6 = this.f4036d;
        if (c0474m6.f3147b == null) {
            c0474m6.f3147b = new C0756ts(c0474m6, 1);
        }
        return c0474m6.f3147b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM2154d = obj == null ? m2154d() : m2153c(obj.hashCode(), obj);
        if (iM2154d < 0) {
            return false;
        }
        m2155e(iM2154d);
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
        for (int i = this.f4035c - 1; i >= 0; i--) {
            if (!collection.contains(this.f4034b[i])) {
                m2155e(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f4035c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f4035c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f4034b, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4035c * 14);
        sb.append('{');
        for (int i = 0; i < this.f4035c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f4034b[i];
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
        if (objArr.length < this.f4035c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f4035c);
        }
        System.arraycopy(this.f4034b, 0, objArr, 0, this.f4035c);
        int length = objArr.length;
        int i = this.f4035c;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
