package p000;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class n11 {

    /* JADX INFO: renamed from: d */
    public int[] f4118d = o30.f4432b;

    /* JADX INFO: renamed from: e */
    public Object[] f4119e = o30.f4434d;

    /* JADX INFO: renamed from: f */
    public int f4120f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public n11(int i) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m2618a(Object obj) {
        int i = this.f4120f * 2;
        Object[] objArr = this.f4119e;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m2619b(int i, Object obj) {
        int i2 = this.f4120f;
        if (i2 == 0) {
            return -1;
        }
        int iM2770j = o30.m2770j(this.f4118d, i2, i);
        if (iM2770j < 0 || p30.m3002l(obj, this.f4119e[iM2770j << 1])) {
            return iM2770j;
        }
        int i3 = iM2770j + 1;
        while (i3 < i2 && this.f4118d[i3] == i) {
            if (p30.m3002l(obj, this.f4119e[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM2770j - 1; i4 >= 0 && this.f4118d[i4] == i; i4--) {
            if (p30.m3002l(obj, this.f4119e[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m2620c(Object obj) {
        return obj == null ? m2621d() : m2619b(obj.hashCode(), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void clear() {
        if (this.f4120f > 0) {
            this.f4118d = o30.f4432b;
            this.f4119e = o30.f4434d;
            this.f4120f = 0;
        }
        if (this.f4120f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean containsKey(Object obj) {
        return m2620c(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean containsValue(Object obj) {
        return m2618a(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m2621d() {
        int i = this.f4120f;
        if (i == 0) {
            return -1;
        }
        int iM2770j = o30.m2770j(this.f4118d, i, 0);
        if (iM2770j < 0 || this.f4119e[iM2770j << 1] == null) {
            return iM2770j;
        }
        int i2 = iM2770j + 1;
        while (i2 < i && this.f4118d[i2] == 0) {
            if (this.f4119e[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM2770j - 1; i3 >= 0 && this.f4118d[i3] == 0; i3--) {
            if (this.f4119e[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m2622e(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f4120f) {
            z = true;
        }
        if (z) {
            return this.f4119e[i << 1];
        }
        C0921xc.m5131l(AbstractC0748t1.m4154l("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof n11) {
                int i = this.f4120f;
                if (i != ((n11) obj).f4120f) {
                    return false;
                }
                n11 n11Var = (n11) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM2622e = m2622e(i2);
                    Object objM2625h = m2625h(i2);
                    Object obj2 = n11Var.get(objM2622e);
                    if (objM2625h == null) {
                        if (obj2 != null || !n11Var.containsKey(objM2622e)) {
                            return false;
                        }
                    } else if (!objM2625h.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f4120f != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f4120f;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM2622e2 = m2622e(i4);
                Object objM2625h2 = m2625h(i4);
                Object obj3 = ((Map) obj).get(objM2622e2);
                if (objM2625h2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM2622e2)) {
                        return false;
                    }
                } else if (!objM2625h2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m2623f(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f4120f)) {
            C0921xc.m5131l(AbstractC0748t1.m4154l("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        Object[] objArr = this.f4119e;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f4118d;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC0201f9.m1055a0(iArr, iArr, i, i5, i2);
                Object[] objArr2 = this.f4119e;
                AbstractC0201f9.m1057c0(objArr2, objArr2, i3, i5 << 1, i2 << 1);
            }
            Object[] objArr3 = this.f4119e;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f4118d = Arrays.copyOf(iArr, i7);
            this.f4119e = Arrays.copyOf(this.f4119e, i7 << 1);
            if (i2 != this.f4120f) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC0201f9.m1055a0(iArr, this.f4118d, 0, 0, i);
                AbstractC0201f9.m1057c0(objArr, this.f4119e, 0, 0, i3);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC0201f9.m1055a0(iArr, this.f4118d, i, i8, i2);
                AbstractC0201f9.m1057c0(objArr, this.f4119e, i3, i8 << 1, i2 << 1);
            }
        }
        if (i2 != this.f4120f) {
            throw new ConcurrentModificationException();
        }
        this.f4120f = i4;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final Object m2624g(int i, Object obj) {
        boolean z = false;
        if (i >= 0 && i < this.f4120f) {
            z = true;
        }
        if (!z) {
            C0921xc.m5131l(AbstractC0748t1.m4154l("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f4119e;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object get(Object obj) {
        int iM2620c = m2620c(obj);
        if (iM2620c >= 0) {
            return this.f4119e[(iM2620c << 1) + 1];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2620c = m2620c(obj);
        return iM2620c >= 0 ? this.f4119e[(iM2620c << 1) + 1] : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m2625h(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f4120f) {
            z = true;
        }
        if (z) {
            return this.f4119e[(i << 1) + 1];
        }
        C0921xc.m5131l(AbstractC0748t1.m4154l("Expected index to be within 0..size()-1, but was ", i));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        int[] iArr = this.f4118d;
        Object[] objArr = this.f4119e;
        int i = this.f4120f;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmpty() {
        return this.f4120f <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object put(Object obj, Object obj2) {
        int i = this.f4120f;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM2619b = obj != null ? m2619b(iHashCode, obj) : m2621d();
        if (iM2619b >= 0) {
            int i2 = (iM2619b << 1) + 1;
            Object[] objArr = this.f4119e;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM2619b;
        int[] iArr = this.f4118d;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f4118d = Arrays.copyOf(iArr, i4);
            this.f4119e = Arrays.copyOf(this.f4119e, i4 << 1);
            if (i != this.f4120f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f4118d;
            int i5 = i3 + 1;
            AbstractC0201f9.m1055a0(iArr2, iArr2, i5, i3, i);
            Object[] objArr2 = this.f4119e;
            AbstractC0201f9.m1057c0(objArr2, objArr2, i5 << 1, i3 << 1, this.f4120f << 1);
        }
        int i6 = this.f4120f;
        if (i == i6) {
            int[] iArr3 = this.f4118d;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f4119e;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f4120f = i6 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean remove(Object obj, Object obj2) {
        int iM2620c = m2620c(obj);
        if (iM2620c < 0 || !p30.m3002l(obj2, m2625h(iM2620c))) {
            return false;
        }
        m2623f(iM2620c);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2620c = m2620c(obj);
        if (iM2620c < 0 || !p30.m3002l(obj2, m2625h(iM2620c))) {
            return false;
        }
        m2624g(iM2620c, obj3);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.f4120f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4120f * 28);
        sb.append('{');
        int i = this.f4120f;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM2622e = m2622e(i2);
            if (objM2622e != sb) {
                sb.append(objM2622e);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM2625h = m2625h(i2);
            if (objM2625h != sb) {
                sb.append(objM2625h);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public Object remove(Object obj) {
        int iM2620c = m2620c(obj);
        if (iM2620c >= 0) {
            return m2623f(iM2620c);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM2620c = m2620c(obj);
        if (iM2620c >= 0) {
            return m2624g(iM2620c, obj2);
        }
        return null;
    }
}
