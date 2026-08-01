package p075l;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: l.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0745c implements Collection, Set {

    /* JADX INFO: renamed from: e */
    public static final int[] f2516e = new int[0];

    /* JADX INFO: renamed from: f */
    public static final Object[] f2517f = new Object[0];

    /* JADX INFO: renamed from: g */
    public static Object[] f2518g;

    /* JADX INFO: renamed from: h */
    public static int f2519h;

    /* JADX INFO: renamed from: i */
    public static Object[] f2520i;

    /* JADX INFO: renamed from: j */
    public static int f2521j;

    /* JADX INFO: renamed from: a */
    public int[] f2522a = f2516e;

    /* JADX INFO: renamed from: b */
    public Object[] f2523b = f2517f;

    /* JADX INFO: renamed from: c */
    public int f2524c = 0;

    /* JADX INFO: renamed from: d */
    public C0743a f2525d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1401b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0745c.class) {
                try {
                    if (f2521j < 10) {
                        objArr[0] = f2520i;
                        objArr[1] = iArr;
                        for (int i3 = i2 - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f2520i = objArr;
                        f2521j++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0745c.class) {
                try {
                    if (f2519h < 10) {
                        objArr[0] = f2518g;
                        objArr[1] = iArr;
                        for (int i4 = i2 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f2518g = objArr;
                        f2519h++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1402a(int i2) {
        if (i2 == 8) {
            synchronized (C0745c.class) {
                try {
                    Object[] objArr = f2520i;
                    if (objArr != null) {
                        this.f2523b = objArr;
                        f2520i = (Object[]) objArr[0];
                        this.f2522a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f2521j--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C0745c.class) {
                try {
                    Object[] objArr2 = f2518g;
                    if (objArr2 != null) {
                        this.f2523b = objArr2;
                        f2518g = (Object[]) objArr2[0];
                        this.f2522a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f2519h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f2522a = new int[i2];
        this.f2523b = new Object[i2];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iM1403c;
        if (obj == null) {
            iM1403c = m1404d();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iM1403c = m1403c(iHashCode, obj);
        }
        if (iM1403c >= 0) {
            return false;
        }
        int i3 = ~iM1403c;
        int i4 = this.f2524c;
        int[] iArr = this.f2522a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f2523b;
            m1402a(i5);
            int[] iArr2 = this.f2522a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2523b, 0, objArr.length);
            }
            m1401b(iArr, objArr, this.f2524c);
        }
        int i6 = this.f2524c;
        if (i3 < i6) {
            int[] iArr3 = this.f2522a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f2523b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f2524c - i3);
        }
        this.f2522a[i3] = i2;
        this.f2523b[i3] = obj;
        this.f2524c++;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f2524c;
        int[] iArr = this.f2522a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f2523b;
            m1402a(size);
            int i2 = this.f2524c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f2522a, 0, i2);
                System.arraycopy(objArr, 0, this.f2523b, 0, this.f2524c);
            }
            m1401b(iArr, objArr, this.f2524c);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m1403c(int i2, Object obj) {
        int i3 = this.f2524c;
        if (i3 == 0) {
            return -1;
        }
        int iM1406a = AbstractC0746d.m1406a(i3, i2, this.f2522a);
        if (iM1406a < 0 || obj.equals(this.f2523b[iM1406a])) {
            return iM1406a;
        }
        int i4 = iM1406a + 1;
        while (i4 < i3 && this.f2522a[i4] == i2) {
            if (obj.equals(this.f2523b[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iM1406a - 1; i5 >= 0 && this.f2522a[i5] == i2; i5--) {
            if (obj.equals(this.f2523b[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i2 = this.f2524c;
        if (i2 != 0) {
            m1401b(this.f2522a, this.f2523b, i2);
            this.f2522a = f2516e;
            this.f2523b = f2517f;
            this.f2524c = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? m1404d() : m1403c(obj.hashCode(), obj)) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m1404d() {
        int i2 = this.f2524c;
        if (i2 == 0) {
            return -1;
        }
        int iM1406a = AbstractC0746d.m1406a(i2, 0, this.f2522a);
        if (iM1406a < 0 || this.f2523b[iM1406a] == null) {
            return iM1406a;
        }
        int i3 = iM1406a + 1;
        while (i3 < i2 && this.f2522a[i3] == 0) {
            if (this.f2523b[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM1406a - 1; i4 >= 0 && this.f2522a[i4] == 0; i4--) {
            if (this.f2523b[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1405e(int i2) {
        Object[] objArr = this.f2523b;
        Object obj = objArr[i2];
        int i3 = this.f2524c;
        if (i3 <= 1) {
            m1401b(this.f2522a, objArr, i3);
            this.f2522a = f2516e;
            this.f2523b = f2517f;
            this.f2524c = 0;
            return;
        }
        int[] iArr = this.f2522a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            int i4 = i3 - 1;
            this.f2524c = i4;
            if (i2 < i4) {
                int i5 = i2 + 1;
                System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                Object[] objArr2 = this.f2523b;
                System.arraycopy(objArr2, i5, objArr2, i2, this.f2524c - i2);
            }
            this.f2523b[this.f2524c] = null;
            return;
        }
        m1402a(i3 > 8 ? i3 + (i3 >> 1) : 8);
        this.f2524c--;
        if (i2 > 0) {
            System.arraycopy(iArr, 0, this.f2522a, 0, i2);
            System.arraycopy(objArr, 0, this.f2523b, 0, i2);
        }
        int i6 = this.f2524c;
        if (i2 < i6) {
            int i7 = i2 + 1;
            System.arraycopy(iArr, i7, this.f2522a, i2, i6 - i2);
            System.arraycopy(objArr, i7, this.f2523b, i2, this.f2524c - i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f2524c != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2524c; i2++) {
                try {
                    if (!set.contains(this.f2523b[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f2522a;
        int i2 = this.f2524c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f2524c <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f2525d == null) {
            this.f2525d = new C0743a(1, this);
        }
        C0743a c0743a = this.f2525d;
        if (c0743a.f2511b == null) {
            c0743a.f2511b = new C0750h(c0743a, 1);
        }
        return c0743a.f2511b.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iM1404d = obj == null ? m1404d() : m1403c(obj.hashCode(), obj);
        if (iM1404d < 0) {
            return false;
        }
        m1405e(iM1404d);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
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
        boolean z2 = false;
        for (int i2 = this.f2524c - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f2523b[i2])) {
                m1405e(i2);
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f2524c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i2 = this.f2524c;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f2523b, 0, objArr, 0, i2);
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2524c * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2524c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f2523b[i2];
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
        if (objArr.length < this.f2524c) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f2524c);
        }
        System.arraycopy(this.f2523b, 0, objArr, 0, this.f2524c);
        int length = objArr.length;
        int i2 = this.f2524c;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
