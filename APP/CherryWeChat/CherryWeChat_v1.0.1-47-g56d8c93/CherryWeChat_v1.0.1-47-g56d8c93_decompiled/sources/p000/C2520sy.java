package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: sy */
/* JADX INFO: loaded from: classes.dex */
public class C2520sy {

    /* JADX INFO: renamed from: a */
    public int[] f8816a;

    /* JADX INFO: renamed from: b */
    public Object[] f8817b;

    /* JADX INFO: renamed from: c */
    public int f8818c;

    public C2520sy(int i) {
        this.f8816a = i == 0 ? AbstractC0714Qj.f2294a : new int[i];
        this.f8817b = i == 0 ? AbstractC0714Qj.f2295b : new Object[i << 1];
    }

    /* JADX INFO: renamed from: a */
    public final int m4997a(Object obj) {
        int i = this.f8818c * 2;
        Object[] objArr = this.f8817b;
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

    /* JADX INFO: renamed from: b */
    public final void m4998b(int i) {
        int i2 = this.f8818c;
        int[] iArr = this.f8816a;
        if (iArr.length < i) {
            this.f8816a = Arrays.copyOf(iArr, i);
            this.f8817b = Arrays.copyOf(this.f8817b, i * 2);
        }
        if (this.f8818c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m4999c(int i, Object obj) {
        int i2 = this.f8818c;
        if (i2 == 0) {
            return -1;
        }
        int iM1482d = AbstractC0714Qj.m1482d(i2, i, this.f8816a);
        if (iM1482d < 0 || AbstractC0585Nj.m1134a(obj, this.f8817b[iM1482d << 1])) {
            return iM1482d;
        }
        int i3 = iM1482d + 1;
        while (i3 < i2 && this.f8816a[i3] == i) {
            if (AbstractC0585Nj.m1134a(obj, this.f8817b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM1482d - 1; i4 >= 0 && this.f8816a[i4] == i; i4--) {
            if (AbstractC0585Nj.m1134a(obj, this.f8817b[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        if (this.f8818c > 0) {
            this.f8816a = AbstractC0714Qj.f2294a;
            this.f8817b = AbstractC0714Qj.f2295b;
            this.f8818c = 0;
        }
        if (this.f8818c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m5000d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m4997a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m5000d(Object obj) {
        return obj == null ? m5001e() : m4999c(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m5001e() {
        int i = this.f8818c;
        if (i == 0) {
            return -1;
        }
        int iM1482d = AbstractC0714Qj.m1482d(i, 0, this.f8816a);
        if (iM1482d < 0 || this.f8817b[iM1482d << 1] == null) {
            return iM1482d;
        }
        int i2 = iM1482d + 1;
        while (i2 < i && this.f8816a[i2] == 0) {
            if (this.f8817b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM1482d - 1; i3 >= 0 && this.f8816a[i3] == 0; i3--) {
            if (this.f8817b[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2520sy) {
                int i = this.f8818c;
                if (i != ((C2520sy) obj).f8818c) {
                    return false;
                }
                C2520sy c2520sy = (C2520sy) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM5002f = m5002f(i2);
                    Object objM5003j = m5003j(i2);
                    Object obj2 = c2520sy.get(objM5002f);
                    if (objM5003j == null) {
                        if (obj2 != null || !c2520sy.containsKey(objM5002f)) {
                            return false;
                        }
                    } else if (!objM5003j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f8818c != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f8818c;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM5002f2 = m5002f(i4);
                Object objM5003j2 = m5003j(i4);
                Object obj3 = ((Map) obj).get(objM5002f2);
                if (objM5003j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM5002f2)) {
                        return false;
                    }
                } else if (!objM5003j2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m5002f(int i) {
        if (i < 0 || i >= this.f8818c) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8817b[i << 1];
    }

    /* JADX INFO: renamed from: g */
    public void mo3g(C0521M4 c0521m4) {
        int i = c0521m4.f8818c;
        m4998b(this.f8818c + i);
        if (this.f8818c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0521m4.m5002f(i2), c0521m4.m5003j(i2));
            }
        } else if (i > 0) {
            AbstractC0650P4.m1309D(0, 0, c0521m4.f8816a, this.f8816a, i);
            AbstractC0650P4.m1310E(c0521m4.f8817b, this.f8817b, 0, 0, i << 1);
            this.f8818c = i;
        }
    }

    public Object get(Object obj) {
        int iM5000d = m5000d(obj);
        if (iM5000d >= 0) {
            return this.f8817b[(iM5000d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM5000d = m5000d(obj);
        return iM5000d >= 0 ? this.f8817b[(iM5000d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public Object mo4h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f8818c)) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        Object[] objArr = this.f8817b;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f8816a;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC0650P4.m1309D(i, i5, iArr, iArr, i2);
                Object[] objArr2 = this.f8817b;
                AbstractC0650P4.m1310E(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.f8817b;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f8816a = Arrays.copyOf(iArr, i7);
            this.f8817b = Arrays.copyOf(this.f8817b, i7 << 1);
            if (i2 != this.f8818c) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC0650P4.m1309D(0, 0, iArr, this.f8816a, i);
                AbstractC0650P4.m1310E(objArr, this.f8817b, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC0650P4.m1309D(i, i8, iArr, this.f8816a, i2);
                AbstractC0650P4.m1310E(objArr, this.f8817b, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.f8818c) {
            throw new ConcurrentModificationException();
        }
        this.f8818c = i4;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f8816a;
        Object[] objArr = this.f8817b;
        int i = this.f8818c;
        int i2 = 1;
        int i3 = 0;
        int iHashCode = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public Object mo5i(int i, Object obj) {
        if (i < 0 || i >= this.f8818c) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f8817b;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f8818c <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m5003j(int i) {
        if (i < 0 || i >= this.f8818c) {
            throw new IllegalArgumentException(AbstractC2374ph.m4812i(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        return this.f8817b[(i << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f8818c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM4999c = obj != null ? m4999c(iHashCode, obj) : m5001e();
        if (iM4999c >= 0) {
            int i2 = (iM4999c << 1) + 1;
            Object[] objArr = this.f8817b;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM4999c;
        int[] iArr = this.f8816a;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f8816a = Arrays.copyOf(iArr, i4);
            this.f8817b = Arrays.copyOf(this.f8817b, i4 << 1);
            if (i != this.f8818c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f8816a;
            int i5 = i3 + 1;
            AbstractC0650P4.m1309D(i5, i3, iArr2, iArr2, i);
            Object[] objArr2 = this.f8817b;
            AbstractC0650P4.m1310E(objArr2, objArr2, i5 << 1, i3 << 1, this.f8818c << 1);
        }
        int i6 = this.f8818c;
        if (i == i6) {
            int[] iArr3 = this.f8816a;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f8817b;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f8818c = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iM5000d = m5000d(obj);
        if (iM5000d >= 0) {
            return mo4h(iM5000d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM5000d = m5000d(obj);
        if (iM5000d >= 0) {
            return mo5i(iM5000d, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f8818c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8818c * 28);
        sb.append('{');
        int i = this.f8818c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM5002f = m5002f(i2);
            if (objM5002f != sb) {
                sb.append(objM5002f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM5003j = m5003j(i2);
            if (objM5003j != sb) {
                sb.append(objM5003j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM5000d = m5000d(obj);
        if (iM5000d < 0 || !AbstractC0585Nj.m1134a(obj2, m5003j(iM5000d))) {
            return false;
        }
        mo4h(iM5000d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM5000d = m5000d(obj);
        if (iM5000d < 0 || !AbstractC0585Nj.m1134a(obj2, m5003j(iM5000d))) {
            return false;
        }
        mo5i(iM5000d, obj3);
        return true;
    }
}
