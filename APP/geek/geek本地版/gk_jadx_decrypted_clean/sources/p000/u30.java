package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class u30 {

    /* JADX INFO: renamed from: d */
    public static Object[] f4656d;

    /* JADX INFO: renamed from: e */
    public static int f4657e;

    /* JADX INFO: renamed from: f */
    public static Object[] f4658f;

    /* JADX INFO: renamed from: g */
    public static int f4659g;

    /* JADX INFO: renamed from: a */
    public int[] f4660a = AbstractC0222ff.f1944k;

    /* JADX INFO: renamed from: b */
    public Object[] f4661b = AbstractC0222ff.f1945l;

    /* JADX INFO: renamed from: c */
    public int f4662c = 0;

    /* JADX INFO: renamed from: c */
    public static void m2409c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (u30.class) {
                try {
                    if (f4659g < 10) {
                        objArr[0] = f4658f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f4658f = objArr;
                        f4659g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (u30.class) {
                try {
                    if (f4657e < 10) {
                        objArr[0] = f4656d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f4656d = objArr;
                        f4657e++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2410a(int i) {
        if (i == 8) {
            synchronized (u30.class) {
                try {
                    Object[] objArr = f4658f;
                    if (objArr != null) {
                        this.f4661b = objArr;
                        f4658f = (Object[]) objArr[0];
                        this.f4660a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f4659g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (u30.class) {
                try {
                    Object[] objArr2 = f4656d;
                    if (objArr2 != null) {
                        this.f4661b = objArr2;
                        f4656d = (Object[]) objArr2[0];
                        this.f4660a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f4657e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f4660a = new int[i];
        this.f4661b = new Object[i << 1];
    }

    /* JADX INFO: renamed from: b */
    public final void m2411b(int i) {
        int i2 = this.f4662c;
        int[] iArr = this.f4660a;
        if (iArr.length < i) {
            Object[] objArr = this.f4661b;
            m2410a(i);
            if (this.f4662c > 0) {
                System.arraycopy(iArr, 0, this.f4660a, 0, i2);
                System.arraycopy(objArr, 0, this.f4661b, 0, i2 << 1);
            }
            m2409c(iArr, objArr, i2);
        }
        if (this.f4662c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f4662c;
        if (i > 0) {
            int[] iArr = this.f4660a;
            Object[] objArr = this.f4661b;
            this.f4660a = AbstractC0222ff.f1944k;
            this.f4661b = AbstractC0222ff.f1945l;
            this.f4662c = 0;
            m2409c(iArr, objArr, i);
        }
        if (this.f4662c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m2413e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m2415g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m2412d(int i, Object obj) {
        int i2 = this.f4662c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM1184c = AbstractC0222ff.m1184c(i2, i, this.f4660a);
            if (iM1184c < 0 || obj.equals(this.f4661b[iM1184c << 1])) {
                return iM1184c;
            }
            int i3 = iM1184c + 1;
            while (i3 < i2 && this.f4660a[i3] == i) {
                if (obj.equals(this.f4661b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM1184c - 1; i4 >= 0 && this.f4660a[i4] == i; i4--) {
                if (obj.equals(this.f4661b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m2413e(Object obj) {
        return obj == null ? m2414f() : m2412d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u30) {
            u30 u30Var = (u30) obj;
            if (this.f4662c != u30Var.f4662c) {
                return false;
            }
            for (int i = 0; i < this.f4662c; i++) {
                try {
                    Object objM2416h = m2416h(i);
                    Object objM2418j = m2418j(i);
                    Object orDefault = u30Var.getOrDefault(objM2416h, null);
                    if (objM2418j == null) {
                        if (orDefault != null || !u30Var.containsKey(objM2416h)) {
                            return false;
                        }
                    } else if (!objM2418j.equals(orDefault)) {
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
            if (this.f4662c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f4662c; i2++) {
                try {
                    Object objM2416h2 = m2416h(i2);
                    Object objM2418j2 = m2418j(i2);
                    Object obj2 = map.get(objM2416h2);
                    if (objM2418j2 == null) {
                        if (obj2 != null || !map.containsKey(objM2416h2)) {
                            return false;
                        }
                    } else if (!objM2418j2.equals(obj2)) {
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
    public final int m2414f() {
        int i = this.f4662c;
        if (i == 0) {
            return -1;
        }
        try {
            int iM1184c = AbstractC0222ff.m1184c(i, 0, this.f4660a);
            if (iM1184c < 0 || this.f4661b[iM1184c << 1] == null) {
                return iM1184c;
            }
            int i2 = iM1184c + 1;
            while (i2 < i && this.f4660a[i2] == 0) {
                if (this.f4661b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM1184c - 1; i3 >= 0 && this.f4660a[i3] == 0; i3--) {
                if (this.f4661b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m2415g(Object obj) {
        int i = this.f4662c * 2;
        Object[] objArr = this.f4661b;
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

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2413e = m2413e(obj);
        return iM2413e >= 0 ? this.f4661b[(iM2413e << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m2416h(int i) {
        return this.f4661b[i << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f4660a;
        Object[] objArr = this.f4661b;
        int i = this.f4662c;
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
    public final Object m2417i(int i) {
        Object[] objArr = this.f4661b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f4662c;
        int i4 = 0;
        if (i3 <= 1) {
            m2409c(this.f4660a, objArr, i3);
            this.f4660a = AbstractC0222ff.f1944k;
            this.f4661b = AbstractC0222ff.f1945l;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f4660a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f4661b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f4661b;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m2410a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f4662c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f4660a, 0, i);
                    System.arraycopy(objArr, 0, this.f4661b, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f4660a, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f4661b, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f4662c) {
            throw new ConcurrentModificationException();
        }
        this.f4662c = i4;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f4662c <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m2418j(int i) {
        return this.f4661b[(i << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int iM2412d;
        int i2 = this.f4662c;
        if (obj == null) {
            iM2412d = m2414f();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM2412d = m2412d(iHashCode, obj);
        }
        if (iM2412d >= 0) {
            int i3 = (iM2412d << 1) + 1;
            Object[] objArr = this.f4661b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iM2412d;
        int[] iArr = this.f4660a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f4661b;
            m2410a(i5);
            if (i2 != this.f4662c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f4660a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f4661b, 0, objArr2.length);
            }
            m2409c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f4660a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f4661b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f4662c - i4) << 1);
        }
        int i7 = this.f4662c;
        if (i2 == i7) {
            int[] iArr4 = this.f4660a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f4661b;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f4662c = i7 + 1;
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
        int iM2413e = m2413e(obj);
        if (iM2413e >= 0) {
            return m2417i(iM2413e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM2413e = m2413e(obj);
        if (iM2413e < 0) {
            return null;
        }
        int i = (iM2413e << 1) + 1;
        Object[] objArr = this.f4661b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f4662c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4662c * 28);
        sb.append('{');
        for (int i = 0; i < this.f4662c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM2416h = m2416h(i);
            if (objM2416h != this) {
                sb.append(objM2416h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM2418j = m2418j(i);
            if (objM2418j != this) {
                sb.append(objM2418j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM2413e = m2413e(obj);
        if (iM2413e < 0) {
            return false;
        }
        Object objM2418j = m2418j(iM2413e);
        if (obj2 != objM2418j && (obj2 == null || !obj2.equals(objM2418j))) {
            return false;
        }
        m2417i(iM2413e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2413e = m2413e(obj);
        if (iM2413e < 0) {
            return false;
        }
        Object objM2418j = m2418j(iM2413e);
        if (objM2418j != obj2 && (obj2 == null || !obj2.equals(objM2418j))) {
            return false;
        }
        int i = (iM2413e << 1) + 1;
        Object[] objArr = this.f4661b;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
