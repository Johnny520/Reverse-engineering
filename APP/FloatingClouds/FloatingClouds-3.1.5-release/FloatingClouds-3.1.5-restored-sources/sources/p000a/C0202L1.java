package p000a;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p000a.AbstractC0461Z9;

/* JADX INFO: renamed from: a.L1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0202L1<E> implements Collection<E>, Set<E> {

    /* JADX INFO: renamed from: e */
    public static final int[] f681e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f682f = new Object[0];

    /* JADX INFO: renamed from: g */
    public static Object[] f683g;

    /* JADX INFO: renamed from: h */
    public static int f684h;

    /* JADX INFO: renamed from: i */
    public static Object[] f685i;

    /* JADX INFO: renamed from: j */
    public static int f686j;

    /* JADX INFO: renamed from: a */
    public int[] f687a = f681e;

    /* JADX INFO: renamed from: b */
    public Object[] f688b = f682f;

    /* JADX INFO: renamed from: c */
    public int f689c = 0;

    /* JADX INFO: renamed from: d */
    public C0148I1 f690d;

    /* JADX INFO: renamed from: b */
    public static void m572b(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0202L1.class) {
                try {
                    if (f686j < 10) {
                        objArr[0] = f685i;
                        objArr[1] = iArr;
                        for (int i2 = i - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f685i = objArr;
                        f686j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0202L1.class) {
                try {
                    if (f684h < 10) {
                        objArr[0] = f683g;
                        objArr[1] = iArr;
                        for (int i3 = i - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f683g = objArr;
                        f684h++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m573a(int i) {
        if (i == 8) {
            synchronized (C0202L1.class) {
                try {
                    Object[] objArr = f685i;
                    if (objArr != null) {
                        this.f688b = objArr;
                        f685i = (Object[]) objArr[0];
                        this.f687a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f686j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C0202L1.class) {
                try {
                    Object[] objArr2 = f683g;
                    if (objArr2 != null) {
                        this.f688b = objArr2;
                        f683g = (Object[]) objArr2[0];
                        this.f687a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f684h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f687a = new int[i];
        this.f688b = new Object[i];
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int i;
        int iM574c;
        if (e == null) {
            iM574c = m575d();
            i = 0;
        } else {
            int iHashCode = e.hashCode();
            i = iHashCode;
            iM574c = m574c(iHashCode, e);
        }
        if (iM574c >= 0) {
            return false;
        }
        int i2 = ~iM574c;
        int i3 = this.f689c;
        int[] iArr = this.f687a;
        if (i3 >= iArr.length) {
            int i4 = 8;
            if (i3 >= 8) {
                i4 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.f688b;
            m573a(i4);
            int[] iArr2 = this.f687a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f688b, 0, objArr.length);
            }
            m572b(iArr, objArr, this.f689c);
        }
        int i5 = this.f689c;
        if (i2 < i5) {
            int[] iArr3 = this.f687a;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr2 = this.f688b;
            System.arraycopy(objArr2, i2, objArr2, i6, this.f689c - i2);
        }
        this.f687a[i2] = i;
        this.f688b[i2] = e;
        this.f689c++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f689c;
        int[] iArr = this.f687a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f688b;
            m573a(size);
            int i = this.f689c;
            if (i > 0) {
                System.arraycopy(iArr, 0, this.f687a, 0, i);
                System.arraycopy(objArr, 0, this.f688b, 0, this.f689c);
            }
            m572b(iArr, objArr, this.f689c);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX INFO: renamed from: c */
    public final int m574c(int i, Object obj) {
        int i2 = this.f689c;
        if (i2 == 0) {
            return -1;
        }
        int iM2140a = C0889w1.m2140a(i2, i, this.f687a);
        if (iM2140a < 0 || obj.equals(this.f688b[iM2140a])) {
            return iM2140a;
        }
        int i3 = iM2140a + 1;
        while (i3 < i2 && this.f687a[i3] == i) {
            if (obj.equals(this.f688b[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM2140a - 1; i4 >= 0 && this.f687a[i4] == i; i4--) {
            if (obj.equals(this.f688b[i4])) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.f689c;
        if (i != 0) {
            m572b(this.f687a, this.f688b, i);
            this.f687a = f681e;
            this.f688b = f682f;
            this.f689c = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m575d() : m574c(obj.hashCode(), obj)) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final int m575d() {
        int i = this.f689c;
        if (i == 0) {
            return -1;
        }
        int iM2140a = C0889w1.m2140a(i, 0, this.f687a);
        if (iM2140a < 0 || this.f688b[iM2140a] == null) {
            return iM2140a;
        }
        int i2 = iM2140a + 1;
        while (i2 < i && this.f687a[i2] == 0) {
            if (this.f688b[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM2140a - 1; i3 >= 0 && this.f687a[i3] == 0; i3--) {
            if (this.f688b[i3] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: e */
    public final void m576e(int i) {
        Object[] objArr = this.f688b;
        Object obj = objArr[i];
        int i2 = this.f689c;
        if (i2 <= 1) {
            m572b(this.f687a, objArr, i2);
            this.f687a = f681e;
            this.f688b = f682f;
            this.f689c = 0;
            return;
        }
        int[] iArr = this.f687a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            int i3 = i2 - 1;
            this.f689c = i3;
            if (i < i3) {
                int i4 = i + 1;
                System.arraycopy(iArr, i4, iArr, i, i3 - i);
                Object[] objArr2 = this.f688b;
                System.arraycopy(objArr2, i4, objArr2, i, this.f689c - i);
            }
            this.f688b[this.f689c] = null;
            return;
        }
        m573a(i2 > 8 ? i2 + (i2 >> 1) : 8);
        this.f689c--;
        if (i > 0) {
            System.arraycopy(iArr, 0, this.f687a, 0, i);
            System.arraycopy(objArr, 0, this.f688b, 0, i);
        }
        int i5 = this.f689c;
        if (i < i5) {
            int i6 = i + 1;
            System.arraycopy(iArr, i6, this.f687a, i, i5 - i);
            System.arraycopy(objArr, i6, this.f688b, i, this.f689c - i);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f689c != set.size()) {
                return false;
            }
            for (int i = 0; i < this.f689c; i++) {
                try {
                    if (!set.contains(this.f688b[i])) {
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
        int[] iArr = this.f687a;
        int i = this.f689c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f689c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        if (this.f690d == null) {
            this.f690d = new C0148I1(1, this);
        }
        C0148I1 c0148i1 = this.f690d;
        if (c0148i1.f1732b == null) {
            c0148i1.f1732b = new AbstractC0461Z9.c();
        }
        return (Iterator<E>) c0148i1.f1732b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM575d = obj == null ? m575d() : m574c(obj.hashCode(), obj);
        if (iM575d < 0) {
            return false;
        }
        m576e(iM575d);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f689c - 1; i >= 0; i--) {
            if (!collection.contains(this.f688b[i])) {
                m576e(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f689c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.f689c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f688b, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f689c * 14);
        sb.append('{');
        for (int i = 0; i < this.f689c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object obj = this.f688b[i];
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
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f689c) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f689c));
        }
        System.arraycopy(this.f688b, 0, tArr, 0, this.f689c);
        int length = tArr.length;
        int i = this.f689c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
