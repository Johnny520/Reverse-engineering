package p000;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b40 {

    /* JADX INFO: renamed from: d */
    public static Object[] f675d;

    /* JADX INFO: renamed from: e */
    public static int f676e;

    /* JADX INFO: renamed from: f */
    public static Object[] f677f;

    /* JADX INFO: renamed from: g */
    public static int f678g;

    /* JADX INFO: renamed from: a */
    public int[] f679a = AbstractC0259gf.f1966k;

    /* JADX INFO: renamed from: b */
    public Object[] f680b = AbstractC0259gf.f1967l;

    /* JADX INFO: renamed from: c */
    public int f681c = 0;

    /* JADX INFO: renamed from: c */
    public static void m478c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (b40.class) {
                try {
                    if (f678g < 10) {
                        objArr[0] = f677f;
                        objArr[1] = iArr;
                        for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                            objArr[i2] = null;
                        }
                        f677f = objArr;
                        f678g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b40.class) {
                try {
                    if (f676e < 10) {
                        objArr[0] = f675d;
                        objArr[1] = iArr;
                        for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f675d = objArr;
                        f676e++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m479a(int i) {
        if (i == 8) {
            synchronized (b40.class) {
                try {
                    Object[] objArr = f677f;
                    if (objArr != null) {
                        this.f680b = objArr;
                        f677f = (Object[]) objArr[0];
                        this.f679a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f678g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i == 4) {
            synchronized (b40.class) {
                try {
                    Object[] objArr2 = f675d;
                    if (objArr2 != null) {
                        this.f680b = objArr2;
                        f675d = (Object[]) objArr2[0];
                        this.f679a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f676e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f679a = new int[i];
        this.f680b = new Object[i << 1];
    }

    /* JADX INFO: renamed from: b */
    public final void m480b(int i) {
        int i2 = this.f681c;
        int[] iArr = this.f679a;
        if (iArr.length < i) {
            Object[] objArr = this.f680b;
            m479a(i);
            if (this.f681c > 0) {
                System.arraycopy(iArr, 0, this.f679a, 0, i2);
                System.arraycopy(objArr, 0, this.f680b, 0, i2 << 1);
            }
            m478c(iArr, objArr, i2);
        }
        if (this.f681c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i = this.f681c;
        if (i > 0) {
            int[] iArr = this.f679a;
            Object[] objArr = this.f680b;
            this.f679a = AbstractC0259gf.f1966k;
            this.f680b = AbstractC0259gf.f1967l;
            this.f681c = 0;
            m478c(iArr, objArr, i);
        }
        if (this.f681c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return m482e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return m484g(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m481d(int i, Object obj) {
        int i2 = this.f681c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM1253k = AbstractC0259gf.m1253k(i2, i, this.f679a);
            if (iM1253k < 0 || obj.equals(this.f680b[iM1253k << 1])) {
                return iM1253k;
            }
            int i3 = iM1253k + 1;
            while (i3 < i2 && this.f679a[i3] == i) {
                if (obj.equals(this.f680b[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM1253k - 1; i4 >= 0 && this.f679a[i4] == i; i4--) {
                if (obj.equals(this.f680b[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m482e(Object obj) {
        return obj == null ? m483f() : m481d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b40) {
            b40 b40Var = (b40) obj;
            if (this.f681c != b40Var.f681c) {
                return false;
            }
            for (int i = 0; i < this.f681c; i++) {
                try {
                    Object objM485h = m485h(i);
                    Object objM487j = m487j(i);
                    Object orDefault = b40Var.getOrDefault(objM485h, null);
                    if (objM487j == null) {
                        if (orDefault != null || !b40Var.containsKey(objM485h)) {
                            return false;
                        }
                    } else if (!objM487j.equals(orDefault)) {
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
            if (this.f681c != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f681c; i2++) {
                try {
                    Object objM485h2 = m485h(i2);
                    Object objM487j2 = m487j(i2);
                    Object obj2 = map.get(objM485h2);
                    if (objM487j2 == null) {
                        if (obj2 != null || !map.containsKey(objM485h2)) {
                            return false;
                        }
                    } else if (!objM487j2.equals(obj2)) {
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
    public final int m483f() {
        int i = this.f681c;
        if (i == 0) {
            return -1;
        }
        try {
            int iM1253k = AbstractC0259gf.m1253k(i, 0, this.f679a);
            if (iM1253k < 0 || this.f680b[iM1253k << 1] == null) {
                return iM1253k;
            }
            int i2 = iM1253k + 1;
            while (i2 < i && this.f679a[i2] == 0) {
                if (this.f680b[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = iM1253k - 1; i3 >= 0 && this.f679a[i3] == 0; i3--) {
                if (this.f680b[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m484g(Object obj) {
        int i = this.f681c * 2;
        Object[] objArr = this.f680b;
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
        int iM482e = m482e(obj);
        return iM482e >= 0 ? this.f680b[(iM482e << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public final Object m485h(int i) {
        return this.f680b[i << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f679a;
        Object[] objArr = this.f680b;
        int i = this.f681c;
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
    public final Object m486i(int i) {
        Object[] objArr = this.f680b;
        int i2 = i << 1;
        Object obj = objArr[i2 + 1];
        int i3 = this.f681c;
        int i4 = 0;
        if (i3 <= 1) {
            m478c(this.f679a, objArr, i3);
            this.f679a = AbstractC0259gf.f1966k;
            this.f680b = AbstractC0259gf.f1967l;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f679a;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f680b;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f680b;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                m479a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f681c) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f679a, 0, i);
                    System.arraycopy(objArr, 0, this.f680b, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f679a, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f680b, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f681c) {
            throw new ConcurrentModificationException();
        }
        this.f681c = i4;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f681c <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m487j(int i) {
        return this.f680b[(i << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i;
        int iM481d;
        int i2 = this.f681c;
        if (obj == null) {
            iM481d = m483f();
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iM481d = m481d(iHashCode, obj);
        }
        if (iM481d >= 0) {
            int i3 = (iM481d << 1) + 1;
            Object[] objArr = this.f680b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iM481d;
        int[] iArr = this.f679a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            Object[] objArr2 = this.f680b;
            m479a(i5);
            if (i2 != this.f681c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f679a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f680b, 0, objArr2.length);
            }
            m478c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f679a;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f680b;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f681c - i4) << 1);
        }
        int i7 = this.f681c;
        if (i2 == i7) {
            int[] iArr4 = this.f679a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f680b;
                int i8 = i4 << 1;
                objArr4[i8] = obj;
                objArr4[i8 + 1] = obj2;
                this.f681c = i7 + 1;
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
        int iM482e = m482e(obj);
        if (iM482e >= 0) {
            return m486i(iM482e);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM482e = m482e(obj);
        if (iM482e < 0) {
            return null;
        }
        int i = (iM482e << 1) + 1;
        Object[] objArr = this.f680b;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f681c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f681c * 28);
        sb.append('{');
        for (int i = 0; i < this.f681c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object objM485h = m485h(i);
            if (objM485h != this) {
                sb.append(objM485h);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM487j = m487j(i);
            if (objM487j != this) {
                sb.append(objM487j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM482e = m482e(obj);
        if (iM482e < 0) {
            return false;
        }
        Object objM487j = m487j(iM482e);
        if (obj2 != objM487j && (obj2 == null || !obj2.equals(objM487j))) {
            return false;
        }
        m486i(iM482e);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM482e = m482e(obj);
        if (iM482e < 0) {
            return false;
        }
        Object objM487j = m487j(iM482e);
        if (objM487j != obj2 && (obj2 == null || !obj2.equals(objM487j))) {
            return false;
        }
        int i = (iM482e << 1) + 1;
        Object[] objArr = this.f680b;
        Object obj4 = objArr[i];
        objArr[i] = obj3;
        return true;
    }
}
