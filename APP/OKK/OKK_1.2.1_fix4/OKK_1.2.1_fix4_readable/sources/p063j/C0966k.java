package p063j;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: j.k */
/* JADX INFO: loaded from: classes.dex */
public class C0966k {

    /* JADX INFO: renamed from: d */
    public static Object[] f3426d;

    /* JADX INFO: renamed from: e */
    public static int f3427e;

    /* JADX INFO: renamed from: f */
    public static Object[] f3428f;

    /* JADX INFO: renamed from: g */
    public static int f3429g;

    /* JADX INFO: renamed from: a */
    public int[] f3430a = AbstractC0959d.f3402a;

    /* JADX INFO: renamed from: b */
    public Object[] f3431b = AbstractC0959d.f3403b;

    /* JADX INFO: renamed from: c */
    public int f3432c = 0;

    /* JADX INFO: renamed from: c */
    public static void m2315c(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0966k.class) {
                try {
                    if (f3429g < 10) {
                        objArr[0] = f3428f;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f3428f = objArr;
                        f3429g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0966k.class) {
                try {
                    if (f3427e < 10) {
                        objArr[0] = f3426d;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f3426d = objArr;
                        f3427e++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2316a(int i2) {
        if (i2 == 8) {
            synchronized (C0966k.class) {
                try {
                    Object[] objArr = f3428f;
                    if (objArr != null) {
                        this.f3431b = objArr;
                        f3428f = (Object[]) objArr[0];
                        this.f3430a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f3429g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C0966k.class) {
                try {
                    Object[] objArr2 = f3426d;
                    if (objArr2 != null) {
                        this.f3431b = objArr2;
                        f3426d = (Object[]) objArr2[0];
                        this.f3430a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f3427e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f3430a = new int[i2];
        this.f3431b = new Object[i2 << 1];
    }

    /* JADX INFO: renamed from: b */
    public final void m2317b(int i2) {
        int i3 = this.f3432c;
        int[] iArr = this.f3430a;
        if (iArr.length < i2) {
            Object[] objArr = this.f3431b;
            m2316a(i2);
            if (this.f3432c > 0) {
                System.arraycopy(iArr, 0, this.f3430a, 0, i3);
                System.arraycopy(objArr, 0, this.f3431b, 0, i3 << 1);
            }
            m2315c(iArr, objArr, i3);
        }
        if (this.f3432c != i3) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i2 = this.f3432c;
        if (i2 > 0) {
            int[] iArr = this.f3430a;
            Object[] objArr = this.f3431b;
            this.f3430a = AbstractC0959d.f3402a;
            this.f3431b = AbstractC0959d.f3403b;
            this.f3432c = 0;
            m2315c(iArr, objArr, i2);
        }
        if (this.f3432c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m2319e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m2321g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m2318d(int i2, Object obj) {
        int i3 = this.f3432c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iM2304a = AbstractC0959d.m2304a(i3, i2, this.f3430a);
            if (iM2304a < 0 || obj.equals(this.f3431b[iM2304a << 1])) {
                return iM2304a;
            }
            int i4 = iM2304a + 1;
            while (i4 < i3 && this.f3430a[i4] == i2) {
                if (obj.equals(this.f3431b[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iM2304a - 1; i5 >= 0 && this.f3430a[i5] == i2; i5--) {
                if (obj.equals(this.f3431b[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2319e(Object obj) {
        return obj == null ? m2320f() : m2318d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0966k) {
            C0966k c0966k = (C0966k) obj;
            if (this.f3432c != c0966k.f3432c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f3432c; i2++) {
                try {
                    Object objM2322h = m2322h(i2);
                    Object objM2324j = m2324j(i2);
                    Object orDefault = c0966k.getOrDefault(objM2322h, null);
                    if (objM2324j == null) {
                        if (orDefault != null || !c0966k.containsKey(objM2322h)) {
                            return false;
                        }
                    } else if (!objM2324j.equals(orDefault)) {
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
            if (this.f3432c != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f3432c; i3++) {
                try {
                    Object objM2322h2 = m2322h(i3);
                    Object objM2324j2 = m2324j(i3);
                    Object obj2 = map.get(objM2322h2);
                    if (objM2324j2 == null) {
                        if (obj2 != null || !map.containsKey(objM2322h2)) {
                            return false;
                        }
                    } else if (!objM2324j2.equals(obj2)) {
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
    public final int m2320f() {
        int i2 = this.f3432c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM2304a = AbstractC0959d.m2304a(i2, 0, this.f3430a);
            if (iM2304a < 0 || this.f3431b[iM2304a << 1] == null) {
                return iM2304a;
            }
            int i3 = iM2304a + 1;
            while (i3 < i2 && this.f3430a[i3] == 0) {
                if (this.f3431b[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM2304a - 1; i4 >= 0 && this.f3430a[i4] == 0; i4--) {
                if (this.f3431b[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m2321g(Object obj) {
        int i2 = this.f3432c * 2;
        Object[] objArr = this.f3431b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2319e = m2319e(obj);
        return iM2319e >= 0 ? this.f3431b[(iM2319e << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m2322h(int i2) {
        return this.f3431b[i2 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f3430a;
        Object[] objArr = this.f3431b;
        int i2 = this.f3432c;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final Object m2323i(int i2) {
        Object[] objArr = this.f3431b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f3432c;
        int i5 = 0;
        if (i4 <= 1) {
            m2315c(this.f3430a, objArr, i4);
            this.f3430a = AbstractC0959d.f3402a;
            this.f3431b = AbstractC0959d.f3403b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f3430a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f3431b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f3431b;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                m2316a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f3432c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f3430a, 0, i2);
                    System.arraycopy(objArr, 0, this.f3431b, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f3430a, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f3431b, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f3432c) {
            throw new ConcurrentModificationException();
        }
        this.f3432c = i5;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f3432c <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m2324j(int i2) {
        return this.f3431b[(i2 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i2;
        int iM2318d;
        int i3 = this.f3432c;
        if (obj == null) {
            iM2318d = m2320f();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iM2318d = m2318d(iHashCode, obj);
        }
        if (iM2318d >= 0) {
            int i4 = (iM2318d << 1) + 1;
            Object[] objArr = this.f3431b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~iM2318d;
        int[] iArr = this.f3430a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f3431b;
            m2316a(i6);
            if (i3 != this.f3432c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f3430a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f3431b, 0, objArr2.length);
            }
            m2315c(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f3430a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f3431b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f3432c - i5) << 1);
        }
        int i8 = this.f3432c;
        if (i3 == i8) {
            int[] iArr4 = this.f3430a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f3431b;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f3432c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iM2319e = m2319e(obj);
        if (iM2319e >= 0) {
            return m2323i(iM2319e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM2319e = m2319e(obj);
        if (iM2319e < 0) {
            return null;
        }
        int i2 = (iM2319e << 1) + 1;
        Object[] objArr = this.f3431b;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f3432c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f3432c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f3432c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM2322h = m2322h(i2);
            if (objM2322h != this) {
                sb.append(objM2322h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM2324j = m2324j(i2);
            if (objM2324j != this) {
                sb.append(objM2324j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM2319e = m2319e(obj);
        if (iM2319e < 0) {
            return false;
        }
        Object objM2324j = m2324j(iM2319e);
        if (obj2 != objM2324j && (obj2 == null || !obj2.equals(objM2324j))) {
            return false;
        }
        m2323i(iM2319e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2319e = m2319e(obj);
        if (iM2319e < 0) {
            return false;
        }
        Object objM2324j = m2324j(iM2319e);
        if (objM2324j != obj2 && (obj2 == null || !obj2.equals(objM2324j))) {
            return false;
        }
        int i2 = (iM2319e << 1) + 1;
        Object[] objArr = this.f3431b;
        Object obj4 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
