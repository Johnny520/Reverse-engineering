package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class uq2 {

    /* JADX INFO: renamed from: h */
    public int[] f11444h = rg3.f9564f;

    /* JADX INFO: renamed from: i */
    public Object[] f11445i = rg3.f9566h;

    /* JADX INFO: renamed from: j */
    public int f11446j;

    public uq2(int i) {
    }

    /* JADX INFO: renamed from: a */
    public final int m5564a(Object obj) {
        int i = this.f11446j * 2;
        Object[] objArr = this.f11445i;
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
    public final void m5565b(int i) {
        int i2 = this.f11446j;
        int[] iArr = this.f11444h;
        if (iArr.length < i) {
            this.f11444h = Arrays.copyOf(iArr, i);
            this.f11445i = Arrays.copyOf(this.f11445i, i * 2);
        }
        if (this.f11446j != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m5566c(int i, Object obj) {
        int i2 = this.f11446j;
        if (i2 == 0) {
            return -1;
        }
        int iM4480p = rg3.m4480p(this.f11444h, i2, i);
        if (iM4480p < 0 || t11.m5086l(obj, this.f11445i[iM4480p << 1])) {
            return iM4480p;
        }
        int i3 = iM4480p + 1;
        while (i3 < i2 && this.f11444h[i3] == i) {
            if (t11.m5086l(obj, this.f11445i[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM4480p - 1; i4 >= 0 && this.f11444h[i4] == i; i4--) {
            if (t11.m5086l(obj, this.f11445i[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public void clear() {
        if (this.f11446j > 0) {
            this.f11444h = rg3.f9564f;
            this.f11445i = rg3.f9566h;
            this.f11446j = 0;
        }
        if (this.f11446j > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m5567d(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m5564a(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final int m5567d(Object obj) {
        return obj == null ? m5568e() : m5566c(obj.hashCode(), obj);
    }

    /* JADX INFO: renamed from: e */
    public final int m5568e() {
        int i = this.f11446j;
        if (i == 0) {
            return -1;
        }
        int iM4480p = rg3.m4480p(this.f11444h, i, 0);
        if (iM4480p < 0 || this.f11445i[iM4480p << 1] == null) {
            return iM4480p;
        }
        int i2 = iM4480p + 1;
        while (i2 < i && this.f11444h[i2] == 0) {
            if (this.f11445i[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM4480p - 1; i3 >= 0 && this.f11444h[i3] == 0; i3--) {
            if (this.f11445i[i3 << 1] == null) {
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
            if (obj instanceof uq2) {
                int i = this.f11446j;
                if (i != ((uq2) obj).f11446j) {
                    return false;
                }
                uq2 uq2Var = (uq2) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM5569f = m5569f(i2);
                    Object objM5570j = m5570j(i2);
                    Object obj2 = uq2Var.get(objM5569f);
                    if (objM5570j == null) {
                        if (obj2 != null || !uq2Var.containsKey(objM5569f)) {
                            return false;
                        }
                    } else if (!objM5570j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f11446j != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f11446j;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM5569f2 = m5569f(i4);
                Object objM5570j2 = m5570j(i4);
                Object obj3 = ((Map) obj).get(objM5569f2);
                if (objM5570j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM5569f2)) {
                        return false;
                    }
                } else if (!objM5570j2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final Object m5569f(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f11446j) {
            z = true;
        }
        if (z) {
            return this.f11445i[i << 1];
        }
        C0676s.m4651j(vi0.m5688g("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    /* JADX INFO: renamed from: g */
    public void mo4513g(C0663ro c0663ro) {
        int i = c0663ro.f11446j;
        m5565b(this.f11446j + i);
        if (this.f11446j != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c0663ro.m5569f(i2), c0663ro.m5570j(i2));
            }
        } else if (i > 0) {
            AbstractC0460mg.m3086a0(c0663ro.f11444h, this.f11444h, 0, 0, i);
            AbstractC0460mg.m3088c0(c0663ro.f11445i, this.f11445i, 0, 0, i << 1);
            this.f11446j = i;
        }
    }

    public Object get(Object obj) {
        int iM5567d = m5567d(obj);
        if (iM5567d >= 0) {
            return this.f11445i[(iM5567d << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM5567d = m5567d(obj);
        return iM5567d >= 0 ? this.f11445i[(iM5567d << 1) + 1] : obj2;
    }

    /* JADX INFO: renamed from: h */
    public Object mo4514h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f11446j)) {
            C0676s.m4651j(vi0.m5688g("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.f11445i;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f11444h;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC0460mg.m3086a0(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.f11445i;
                AbstractC0460mg.m3088c0(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.f11445i;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f11444h = Arrays.copyOf(iArr, i7);
            this.f11445i = Arrays.copyOf(this.f11445i, i7 << 1);
            if (i2 != this.f11446j) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC0460mg.m3086a0(iArr, this.f11444h, 0, 0, i);
                AbstractC0460mg.m3088c0(objArr, this.f11445i, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC0460mg.m3086a0(iArr, this.f11444h, i, i8, i2);
                AbstractC0460mg.m3088c0(objArr, this.f11445i, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.f11446j) {
            throw new ConcurrentModificationException();
        }
        this.f11446j = i4;
        return obj;
    }

    public int hashCode() {
        int[] iArr = this.f11444h;
        Object[] objArr = this.f11445i;
        int i = this.f11446j;
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
    public Object mo4515i(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f11446j) {
            z = true;
        }
        if (!z) {
            C0676s.m4651j(vi0.m5688g("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f11445i;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    public final boolean isEmpty() {
        return this.f11446j <= 0;
    }

    /* JADX INFO: renamed from: j */
    public final Object m5570j(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f11446j) {
            z = true;
        }
        if (z) {
            return this.f11445i[(i << 1) + 1];
        }
        C0676s.m4651j(vi0.m5688g("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f11446j;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM5566c = obj != null ? m5566c(iHashCode, obj) : m5568e();
        if (iM5566c >= 0) {
            int i2 = (iM5566c << 1) + 1;
            Object[] objArr = this.f11445i;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM5566c;
        int[] iArr = this.f11444h;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f11444h = Arrays.copyOf(iArr, i4);
            this.f11445i = Arrays.copyOf(this.f11445i, i4 << 1);
            if (i != this.f11446j) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f11444h;
            int i5 = i3 + 1;
            AbstractC0460mg.m3086a0(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f11445i;
            AbstractC0460mg.m3088c0(objArr2, objArr2, i5 << 1, i3 << 1, this.f11446j << 1);
        }
        int i6 = this.f11446j;
        if (i == i6) {
            int[] iArr3 = this.f11444h;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f11445i;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f11446j = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM5567d = m5567d(obj);
        if (iM5567d < 0 || !t11.m5086l(obj2, m5570j(iM5567d))) {
            return false;
        }
        mo4514h(iM5567d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM5567d = m5567d(obj);
        if (iM5567d < 0 || !t11.m5086l(obj2, m5570j(iM5567d))) {
            return false;
        }
        mo4515i(iM5567d, obj3);
        return true;
    }

    public final int size() {
        return this.f11446j;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11446j * 28);
        sb.append('{');
        int i = this.f11446j;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM5569f = m5569f(i2);
            if (objM5569f != sb) {
                sb.append(objM5569f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM5570j = m5570j(i2);
            if (objM5570j != sb) {
                sb.append(objM5570j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iM5567d = m5567d(obj);
        if (iM5567d >= 0) {
            return mo4514h(iM5567d);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM5567d = m5567d(obj);
        if (iM5567d >= 0) {
            return mo4515i(iM5567d, obj2);
        }
        return null;
    }
}
