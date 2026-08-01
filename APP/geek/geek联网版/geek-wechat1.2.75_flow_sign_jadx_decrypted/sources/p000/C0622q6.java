package p000;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: q6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0622q6 implements Collection, Set {

    /* JADX INFO: renamed from: e */
    public static final int[] f3839e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f3840f = new Object[0];

    /* JADX INFO: renamed from: g */
    public static Object[] f3841g;

    /* JADX INFO: renamed from: h */
    public static int f3842h;

    /* JADX INFO: renamed from: i */
    public static Object[] f3843i;

    /* JADX INFO: renamed from: j */
    public static int f3844j;

    /* JADX INFO: renamed from: a */
    public int[] f3845a = f3839e;

    /* JADX INFO: renamed from: b */
    public Object[] f3846b = f3840f;

    /* JADX INFO: renamed from: c */
    public int f3847c = 0;

    /* JADX INFO: renamed from: d */
    public C0474m6 f3848d;

    /* JADX INFO: renamed from: b */
    public static void m2116b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0622q6.class) {
                try {
                    if (f3844j < 10) {
                        objArr[0] = f3843i;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f3843i = objArr;
                        f3844j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0622q6.class) {
                try {
                    if (f3842h < 10) {
                        objArr[0] = f3841g;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f3841g = objArr;
                        f3842h++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2117a(int i) {
        if (i == 8) {
            synchronized (C0622q6.class) {
                try {
                    Object[] objArr = f3843i;
                    if (objArr != null) {
                        this.f3846b = objArr;
                        f3843i = (Object[]) objArr[0];
                        this.f3845a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3844j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C0622q6.class) {
                try {
                    Object[] objArr2 = f3841g;
                    if (objArr2 != null) {
                        this.f3846b = objArr2;
                        f3841g = (Object[]) objArr2[0];
                        this.f3845a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3842h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f3845a = new int[i];
        this.f3846b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iM2118c;
        if (obj == null) {
            iM2118c = m2119d();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM2118c = m2118c(iHashCode, obj);
        }
        if (iM2118c >= 0) {
            return false;
        }
        int i2 = ~iM2118c;
        int i3 = this.f3847c;
        int[] iArr = this.f3845a;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f3846b;
            m2117a(i4);
            int[] iArr2 = this.f3845a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f3846b, 0, objArr.length);
            }
            m2116b(iArr, objArr, this.f3847c);
        }
        int i5 = this.f3847c;
        if (i2 < i5) {
            int[] iArr3 = this.f3845a;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f3846b;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f3847c - i2);
        }
        this.f3845a[i2] = i;
        this.f3846b[i2] = obj;
        this.f3847c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f3847c;
        int[] iArr = this.f3845a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f3846b;
            m2117a(size);
            int i = this.f3847c;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f3845a, 0, i);
                System.arraycopy(objArr, 0, this.f3846b, 0, this.f3847c);
            }
            m2116b(iArr, objArr, this.f3847c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public final int m2118c(int i, Object obj) {
        int i2 = this.f3847c;
        if (i2 == 0) {
            return -1;
        }
        int iM1253k = AbstractC0259gf.m1253k(i2, i, this.f3845a);
        if (iM1253k < 0 || obj.equals(this.f3846b[iM1253k])) {
            return iM1253k;
        }
        int i3 = iM1253k + 1;
        while (i3 < i2 && this.f3845a[i3] == i) {
            if (obj.equals(this.f3846b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM1253k - 1; i4 >= 0 && this.f3845a[i4] == i; i4--) {
            if (obj.equals(this.f3846b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f3847c;
        if (i != 0) {
            m2116b(this.f3845a, this.f3846b, i);
            this.f3845a = f3839e;
            this.f3846b = f3840f;
            this.f3847c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m2119d() : m2118c(obj.hashCode(), obj)) >= 0;
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
    public final int m2119d() {
        int i = this.f3847c;
        if (i == 0) {
            return -1;
        }
        int iM1253k = AbstractC0259gf.m1253k(i, 0, this.f3845a);
        if (iM1253k < 0 || this.f3846b[iM1253k] == null) {
            return iM1253k;
        }
        int i2 = iM1253k + 1;
        while (i2 < i && this.f3845a[i2] == 0) {
            if (this.f3846b[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM1253k - 1; i3 >= 0 && this.f3845a[i3] == 0; i3--) {
            if (this.f3846b[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m2120e(int i) {
        Object[] objArr = this.f3846b;
        Object obj = objArr[i];
        int i2 = this.f3847c;
        if (i2 <= 1) {
            m2116b(this.f3845a, objArr, i2);
            this.f3845a = f3839e;
            this.f3846b = f3840f;
            this.f3847c = 0;
            return;
        }
        int[] iArr = this.f3845a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f3847c = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f3846b;
                System.arraycopy(objArr2, i4, objArr2, i, this.f3847c - i);
            }
            this.f3846b[this.f3847c] = null;
            return;
        }
        m2117a(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f3847c--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f3845a, 0, i);
            System.arraycopy(objArr, 0, this.f3846b, 0, i);
        }
        int i5 = this.f3847c;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f3845a, i, i5 - i);
            System.arraycopy(objArr, i6, this.f3846b, i, this.f3847c - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f3847c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f3847c; i++) {
                try {
                    if (!set.contains(this.f3846b[i])) {
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
        int[] iArr = this.f3845a;
        int i = this.f3847c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f3847c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f3848d == null) {
            this.f3848d = new C0474m6(1, this);
        }
        C0474m6 c0474m6 = this.f3848d;
        if (c0474m6.f3077b == null) {
            c0474m6.f3077b = new C0978zs(c0474m6, 1);
        }
        return c0474m6.f3077b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM2119d = obj == null ? m2119d() : m2118c(obj.hashCode(), obj);
        if (iM2119d < 0) {
            return false;
        }
        m2120e(iM2119d);
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
        for (int i = this.f3847c - 1; i >= 0; i--) {
            if (!collection.contains(this.f3846b[i])) {
                m2120e(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f3847c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f3847c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f3846b, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3847c * 14);
        sb.append('{');
        for (int i = 0; i < this.f3847c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f3846b[i];
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
        if (objArr.length < this.f3847c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f3847c);
        }
        System.arraycopy(this.f3846b, 0, objArr, 0, this.f3847c);
        int length = objArr.length;
        int i = this.f3847c;
        if (length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
