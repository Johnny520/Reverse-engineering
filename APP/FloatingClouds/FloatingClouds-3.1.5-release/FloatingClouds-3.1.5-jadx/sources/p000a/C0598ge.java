package p000a;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: a.ge */
/* JADX INFO: loaded from: classes.dex */
public class C0598ge<K, V> {

    /* JADX INFO: renamed from: d */
    public static Object[] f2215d;

    /* JADX INFO: renamed from: e */
    public static int f2216e;

    /* JADX INFO: renamed from: f */
    public static Object[] f2217f;

    /* JADX INFO: renamed from: g */
    public static int f2218g;

    /* JADX INFO: renamed from: a */
    public int[] f2219a = C0889w1.f3481i;

    /* JADX INFO: renamed from: b */
    public Object[] f2220b = C0889w1.f3482j;

    /* JADX INFO: renamed from: c */
    public int f2221c = 0;

    /* JADX INFO: renamed from: c */
    public static void m1429c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C0598ge.class) {
                try {
                    if (f2218g < 10) {
                        objArr[0] = f2217f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f2217f = objArr;
                        f2218g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0598ge.class) {
                try {
                    if (f2216e < 10) {
                        objArr[0] = f2215d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f2215d = objArr;
                        f2216e++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m1430a(int i) {
        if (i == 8) {
            synchronized (C0598ge.class) {
                try {
                    Object[] objArr = f2217f;
                    if (objArr != null) {
                        this.f2220b = objArr;
                        f2217f = (Object[]) objArr[0];
                        this.f2219a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f2218g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (C0598ge.class) {
                try {
                    Object[] objArr2 = f2215d;
                    if (objArr2 != null) {
                        this.f2220b = objArr2;
                        f2215d = (Object[]) objArr2[0];
                        this.f2219a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f2216e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f2219a = new int[i];
        this.f2220b = new Object[i << 1];
    }

    /* JADX INFO: renamed from: b */
    public final void m1431b(int i) {
        int i2 = this.f2221c;
        int[] iArr = this.f2219a;
        if (iArr.length < i) {
            Object[] objArr = this.f2220b;
            m1430a(i);
            if (this.f2221c > 0) {
                System.arraycopy(iArr, 0, this.f2219a, 0, i2);
                System.arraycopy(objArr, 0, this.f2220b, 0, i2 << 1);
            }
            m1429c(iArr, objArr, i2);
        }
        if (this.f2221c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f2221c;
        if (i > 0) {
            int[] iArr = this.f2219a;
            Object[] objArr = this.f2220b;
            this.f2219a = C0889w1.f3481i;
            this.f2220b = C0889w1.f3482j;
            this.f2221c = 0;
            m1429c(iArr, objArr, i);
        }
        if (this.f2221c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m1433e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m1435g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m1432d(int i, Object obj) {
        int i2 = this.f2221c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM2140a = C0889w1.m2140a(i2, i, this.f2219a);
            if (iM2140a < 0 || obj.equals(this.f2220b[iM2140a << 1])) {
                return iM2140a;
            }
            int i3 = iM2140a + 1;
            while (i3 < i2 && this.f2219a[i3] == i) {
                if (obj.equals(this.f2220b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM2140a - 1; i4 >= 0 && this.f2219a[i4] == i; i4--) {
                if (obj.equals(this.f2220b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m1433e(Object obj) {
        return obj == null ? m1434f() : m1432d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0598ge) {
            C0598ge c0598ge = (C0598ge) obj;
            if (this.f2221c != c0598ge.f2221c) {
                return false;
            }
            for (int i = 0; i < this.f2221c; i++) {
                try {
                    K kM1436h = m1436h(i);
                    V vM1438j = m1438j(i);
                    Object orDefault = c0598ge.getOrDefault(kM1436h, null);
                    if (vM1438j == null) {
                        if (orDefault != null || !c0598ge.containsKey(kM1436h)) {
                            return false;
                        }
                    } else if (!vM1438j.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f2221c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2221c; i2++) {
                try {
                    K kM1436h2 = m1436h(i2);
                    V vM1438j2 = m1438j(i2);
                    Object obj2 = map.get(kM1436h2);
                    if (vM1438j2 == null) {
                        if (obj2 != null || !map.containsKey(kM1436h2)) {
                            return false;
                        }
                    } else if (!vM1438j2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m1434f() {
        int i = this.f2221c;
        if (i == 0) {
            return -1;
        }
        try {
            int iM2140a = C0889w1.m2140a(i, 0, this.f2219a);
            if (iM2140a < 0 || this.f2220b[iM2140a << 1] == null) {
                return iM2140a;
            }
            int i2 = iM2140a + 1;
            while (i2 < i && this.f2219a[i2] == 0) {
                if (this.f2220b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM2140a - 1; i3 >= 0 && this.f2219a[i3] == 0; i3--) {
                if (this.f2220b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m1435g(Object obj) {
        int i = this.f2221c * 2;
        Object[] objArr = this.f2220b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v) {
        int iM1433e = m1433e(obj);
        return iM1433e >= 0 ? (V) this.f2220b[(iM1433e << 1) + 1] : v;
    }

    /* JADX INFO: renamed from: h */
    public final K m1436h(int i) {
        return (K) this.f2220b[i << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f2219a;
        Object[] objArr = this.f2220b;
        int i = this.f2221c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final V m1437i(int i) {
        Object[] objArr = this.f2220b;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f2221c;
        int i4 = 0;
        if (i3 <= 1) {
            m1429c(this.f2219a, objArr, i3);
            this.f2219a = C0889w1.f3481i;
            this.f2220b = C0889w1.f3482j;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f2219a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f2220b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f2220b;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m1430a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f2221c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f2219a, 0, i);
                    System.arraycopy(objArr, 0, this.f2220b, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f2219a, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f2220b, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f2221c) {
            throw new ConcurrentModificationException();
        }
        this.f2221c = i4;
        return v;
    }

    public final boolean isEmpty() {
        return this.f2221c <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final V m1438j(int i) {
        return (V) this.f2220b[(i << 1) + 1];
    }

    public final V put(K k, V v) {
        int i;
        int iM1432d;
        int i2 = this.f2221c;
        if (k == null) {
            iM1432d = m1434f();
            i = 0;
        } else {
            int iHashCode = k.hashCode();
            i = iHashCode;
            iM1432d = m1432d(iHashCode, k);
        }
        if (iM1432d >= 0) {
            int i3 = (iM1432d << 1) + 1;
            Object[] objArr = this.f2220b;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~iM1432d;
        int[] iArr = this.f2219a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f2220b;
            m1430a(i5);
            if (i2 != this.f2221c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f2219a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f2220b, 0, objArr2.length);
            }
            m1429c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f2219a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f2220b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f2221c - i4) << 1);
        }
        int i7 = this.f2221c;
        if (i2 == i7) {
            int[] iArr4 = this.f2219a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f2220b;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f2221c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final V remove(Object obj) {
        int iM1433e = m1433e(obj);
        if (iM1433e >= 0) {
            return m1437i(iM1433e);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final V replace(K k, V v) {
        int iM1433e = m1433e(k);
        if (iM1433e < 0) {
            return null;
        }
        int i = (iM1433e << 1) + 1;
        Object[] objArr = this.f2220b;
        V v2 = (V) objArr[i];
        objArr[i] = v;
        return v2;
    }

    public final int size() {
        return this.f2221c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2221c * 28);
        sb.append('{');
        for (int i = 0; i < this.f2221c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K kM1436h = m1436h(i);
            if (kM1436h != this) {
                sb.append(kM1436h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V vM1438j = m1438j(i);
            if (vM1438j != this) {
                sb.append(vM1438j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM1433e = m1433e(obj);
        if (iM1433e < 0) {
            return false;
        }
        V vM1438j = m1438j(iM1433e);
        if (obj2 != vM1438j && (obj2 == null || !obj2.equals(vM1438j))) {
            return false;
        }
        m1437i(iM1433e);
        return true;
    }

    public final boolean replace(K k, V v, V v2) {
        int iM1433e = m1433e(k);
        if (iM1433e < 0) {
            return false;
        }
        V vM1438j = m1438j(iM1433e);
        if (vM1438j != v && (v == null || !v.equals(vM1438j))) {
            return false;
        }
        int i = (iM1433e << 1) + 1;
        Object[] objArr = this.f2220b;
        Object obj = objArr[i];
        objArr[i] = v2;
        return true;
    }
}
