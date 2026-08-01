package p075l;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: l.k */
/* JADX INFO: loaded from: classes.dex */
public class C0753k {

    /* JADX INFO: renamed from: d */
    public static Object[] f2550d;

    /* JADX INFO: renamed from: e */
    public static int f2551e;

    /* JADX INFO: renamed from: f */
    public static Object[] f2552f;

    /* JADX INFO: renamed from: g */
    public static int f2553g;

    /* JADX INFO: renamed from: a */
    public int[] f2554a = AbstractC0746d.f2526a;

    /* JADX INFO: renamed from: b */
    public Object[] f2555b = AbstractC0746d.f2527b;

    /* JADX INFO: renamed from: c */
    public int f2556c = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1412b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (C0753k.class) {
                try {
                    if (f2553g < 10) {
                        objArr[0] = f2552f;
                        objArr[1] = iArr;
                        for (int i3 = (i2 << 1) - 1; i3 >= 2; i3--) {
                            objArr[i3] = null;
                        }
                        f2552f = objArr;
                        f2553g++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C0753k.class) {
                try {
                    if (f2551e < 10) {
                        objArr[0] = f2550d;
                        objArr[1] = iArr;
                        for (int i4 = (i2 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f2550d = objArr;
                        f2551e++;
                    }
                } finally {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1413a(int i2) {
        if (i2 == 8) {
            synchronized (C0753k.class) {
                try {
                    Object[] objArr = f2552f;
                    if (objArr != null) {
                        this.f2555b = objArr;
                        f2552f = (Object[]) objArr[0];
                        this.f2554a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f2553g--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i2 == 4) {
            synchronized (C0753k.class) {
                try {
                    Object[] objArr2 = f2550d;
                    if (objArr2 != null) {
                        this.f2555b = objArr2;
                        f2550d = (Object[]) objArr2[0];
                        this.f2554a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f2551e--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f2554a = new int[i2];
        this.f2555b = new Object[i2 << 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m1414c(int i2, Object obj) {
        int i3 = this.f2556c;
        if (i3 == 0) {
            return -1;
        }
        try {
            int iM1406a = AbstractC0746d.m1406a(i3, i2, this.f2554a);
            if (iM1406a < 0 || obj.equals(this.f2555b[iM1406a << 1])) {
                return iM1406a;
            }
            int i4 = iM1406a + 1;
            while (i4 < i3 && this.f2554a[i4] == i2) {
                if (obj.equals(this.f2555b[i4 << 1])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iM1406a - 1; i5 >= 0 && this.f2554a[i5] == i2; i5--) {
                if (obj.equals(this.f2555b[i5 << 1])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void clear() {
        int i2 = this.f2556c;
        if (i2 > 0) {
            int[] iArr = this.f2554a;
            Object[] objArr = this.f2555b;
            this.f2554a = AbstractC0746d.f2526a;
            this.f2555b = AbstractC0746d.f2527b;
            this.f2556c = 0;
            m1412b(iArr, objArr, i2);
        }
        if (this.f2556c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean containsKey(Object obj) {
        return m1415d(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean containsValue(Object obj) {
        return m1417f(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m1415d(Object obj) {
        return obj == null ? m1416e() : m1414c(obj.hashCode(), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m1416e() {
        int i2 = this.f2556c;
        if (i2 == 0) {
            return -1;
        }
        try {
            int iM1406a = AbstractC0746d.m1406a(i2, 0, this.f2554a);
            if (iM1406a < 0 || this.f2555b[iM1406a << 1] == null) {
                return iM1406a;
            }
            int i3 = iM1406a + 1;
            while (i3 < i2 && this.f2554a[i3] == 0) {
                if (this.f2555b[i3 << 1] == null) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = iM1406a - 1; i4 >= 0 && this.f2554a[i4] == 0; i4--) {
                if (this.f2555b[i4 << 1] == null) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0753k) {
            C0753k c0753k = (C0753k) obj;
            if (this.f2556c != c0753k.f2556c) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2556c; i2++) {
                try {
                    Object objM1418g = m1418g(i2);
                    Object objM1420i = m1420i(i2);
                    Object orDefault = c0753k.getOrDefault(objM1418g, null);
                    if (objM1420i == null) {
                        if (orDefault != null || !c0753k.containsKey(objM1418g)) {
                            return false;
                        }
                    } else if (!objM1420i.equals(orDefault)) {
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
            if (this.f2556c != map.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f2556c; i3++) {
                try {
                    Object objM1418g2 = m1418g(i3);
                    Object objM1420i2 = m1420i(i3);
                    Object obj2 = map.get(objM1418g2);
                    if (objM1420i2 == null) {
                        if (obj2 != null || !map.containsKey(objM1418g2)) {
                            return false;
                        }
                    } else if (!objM1420i2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m1417f(Object obj) {
        int i2 = this.f2556c * 2;
        Object[] objArr = this.f2555b;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Object m1418g(int i2) {
        return this.f2555b[i2 << 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getOrDefault(Object obj, Object obj2) {
        int iM1415d = m1415d(obj);
        return iM1415d >= 0 ? this.f2555b[(iM1415d << 1) + 1] : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m1419h(int i2) {
        Object[] objArr = this.f2555b;
        int i3 = i2 << 1;
        Object obj = objArr[i3 + 1];
        int i4 = this.f2556c;
        int i5 = 0;
        if (i4 <= 1) {
            m1412b(this.f2554a, objArr, i4);
            this.f2554a = AbstractC0746d.f2526a;
            this.f2555b = AbstractC0746d.f2527b;
        } else {
            int i6 = i4 - 1;
            int[] iArr = this.f2554a;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    int i8 = i6 - i2;
                    System.arraycopy(iArr, i7, iArr, i2, i8);
                    Object[] objArr2 = this.f2555b;
                    System.arraycopy(objArr2, i7 << 1, objArr2, i3, i8 << 1);
                }
                Object[] objArr3 = this.f2555b;
                int i9 = i6 << 1;
                objArr3[i9] = null;
                objArr3[i9 + 1] = null;
            } else {
                m1413a(i4 > 8 ? i4 + (i4 >> 1) : 8);
                if (i4 != this.f2556c) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2554a, 0, i2);
                    System.arraycopy(objArr, 0, this.f2555b, 0, i3);
                }
                if (i2 < i6) {
                    int i10 = i2 + 1;
                    int i11 = i6 - i2;
                    System.arraycopy(iArr, i10, this.f2554a, i2, i11);
                    System.arraycopy(objArr, i10 << 1, this.f2555b, i3, i11 << 1);
                }
            }
            i5 = i6;
        }
        if (i4 != this.f2556c) {
            throw new ConcurrentModificationException();
        }
        this.f2556c = i5;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int[] iArr = this.f2554a;
        Object[] objArr = this.f2555b;
        int i2 = this.f2556c;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object m1420i(int i2) {
        return this.f2555b[(i2 << 1) + 1];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmpty() {
        return this.f2556c <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object put(Object obj, Object obj2) {
        int i2;
        int iM1414c;
        int i3 = this.f2556c;
        if (obj == null) {
            iM1414c = m1416e();
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iM1414c = m1414c(iHashCode, obj);
        }
        if (iM1414c >= 0) {
            int i4 = (iM1414c << 1) + 1;
            Object[] objArr = this.f2555b;
            Object obj3 = objArr[i4];
            objArr[i4] = obj2;
            return obj3;
        }
        int i5 = ~iM1414c;
        int[] iArr = this.f2554a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr2 = this.f2555b;
            m1413a(i6);
            if (i3 != this.f2556c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f2554a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f2555b, 0, objArr2.length);
            }
            m1412b(iArr, objArr2, i3);
        }
        if (i5 < i3) {
            int[] iArr3 = this.f2554a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr3 = this.f2555b;
            System.arraycopy(objArr3, i5 << 1, objArr3, i7 << 1, (this.f2556c - i5) << 1);
        }
        int i8 = this.f2556c;
        if (i3 == i8) {
            int[] iArr4 = this.f2554a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i2;
                Object[] objArr4 = this.f2555b;
                int i9 = i5 << 1;
                objArr4[i9] = obj;
                objArr4[i9 + 1] = obj2;
                this.f2556c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object remove(Object obj) {
        int iM1415d = m1415d(obj);
        if (iM1415d >= 0) {
            return m1419h(iM1415d);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object replace(Object obj, Object obj2) {
        int iM1415d = m1415d(obj);
        if (iM1415d < 0) {
            return null;
        }
        int i2 = (iM1415d << 1) + 1;
        Object[] objArr = this.f2555b;
        Object obj3 = objArr[i2];
        objArr[i2] = obj2;
        return obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.f2556c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2556c * 28);
        sb.append('{');
        for (int i2 = 0; i2 < this.f2556c; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM1418g = m1418g(i2);
            if (objM1418g != this) {
                sb.append(objM1418g);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM1420i = m1420i(i2);
            if (objM1420i != this) {
                sb.append(objM1420i);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM1415d = m1415d(obj);
        if (iM1415d < 0) {
            return false;
        }
        Object objM1420i = m1420i(iM1415d);
        if (obj2 != objM1420i && (obj2 == null || !obj2.equals(objM1420i))) {
            return false;
        }
        m1419h(iM1415d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM1415d = m1415d(obj);
        if (iM1415d < 0) {
            return false;
        }
        Object objM1420i = m1420i(iM1415d);
        if (objM1420i != obj2 && (obj2 == null || !obj2.equals(objM1420i))) {
            return false;
        }
        int i2 = (iM1415d << 1) + 1;
        Object[] objArr = this.f2555b;
        Object obj4 = objArr[i2];
        objArr[i2] = obj3;
        return true;
    }
}
