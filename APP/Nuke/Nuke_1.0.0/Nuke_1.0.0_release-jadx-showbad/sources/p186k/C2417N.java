package p186k;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import p061L2.AbstractC0972l;
import p117X2.AbstractC1665j;
import p192l.AbstractC2477a;
import p195l2.C2499c;

/* JADX INFO: renamed from: k.N */
/* JADX INFO: loaded from: classes.dex */
public class C2417N {

    /* JADX INFO: renamed from: d */
    public int[] f7818d = AbstractC2477a.f7971a;

    /* JADX INFO: renamed from: e */
    public Object[] f7819e = AbstractC2477a.f7973c;

    /* JADX INFO: renamed from: f */
    public int f7820f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2417N(int i5) {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m4299a(Object obj) {
        int i5 = this.f7820f * 2;
        Object[] objArr = this.f7819e;
        if (obj == null) {
            for (int i6 = 1; i6 < i5; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i5; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4300b(int i5) {
        int i6 = this.f7820f;
        int[] iArr = this.f7818d;
        if (iArr.length < i5) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
            this.f7818d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7819e, i5 * 2);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            this.f7819e = objArrCopyOf;
        }
        if (this.f7820f != i6) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final int m4301c(int i5, Object obj) {
        int i6 = this.f7820f;
        if (i6 == 0) {
            return -1;
        }
        int iM4420a = AbstractC2477a.m4420a(this.f7818d, i6, i5);
        if (iM4420a < 0 || AbstractC1665j.m2981a(obj, this.f7819e[iM4420a << 1])) {
            return iM4420a;
        }
        int i7 = iM4420a + 1;
        while (i7 < i6 && this.f7818d[i7] == i5) {
            if (AbstractC1665j.m2981a(obj, this.f7819e[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = iM4420a - 1; i8 >= 0 && this.f7818d[i8] == i5; i8--) {
            if (AbstractC1665j.m2981a(obj, this.f7819e[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clear() {
        if (this.f7820f > 0) {
            this.f7818d = AbstractC2477a.f7971a;
            this.f7819e = AbstractC2477a.f7973c;
            this.f7820f = 0;
        }
        if (this.f7820f > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean containsKey(Object obj) {
        return m4302d(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean containsValue(Object obj) {
        return m4299a(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final int m4302d(Object obj) {
        return obj == null ? m4303e() : m4301c(obj.hashCode(), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m4303e() {
        int i5 = this.f7820f;
        if (i5 == 0) {
            return -1;
        }
        int iM4420a = AbstractC2477a.m4420a(this.f7818d, i5, 0);
        if (iM4420a < 0 || this.f7819e[iM4420a << 1] == null) {
            return iM4420a;
        }
        int i6 = iM4420a + 1;
        while (i6 < i5 && this.f7818d[i6] == 0) {
            if (this.f7819e[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iM4420a - 1; i7 >= 0 && this.f7818d[i7] == 0; i7--) {
            if (this.f7819e[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C2417N) {
                int i5 = this.f7820f;
                if (i5 != ((C2417N) obj).f7820f) {
                    return false;
                }
                C2417N c2417n = (C2417N) obj;
                for (int i6 = 0; i6 < i5; i6++) {
                    Object objM4304f = m4304f(i6);
                    Object objM4308j = m4308j(i6);
                    Object obj2 = c2417n.get(objM4304f);
                    if (objM4308j == null) {
                        if (obj2 != null || !c2417n.containsKey(objM4304f)) {
                            return false;
                        }
                    } else if (!objM4308j.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f7820f != ((Map) obj).size()) {
                return false;
            }
            int i7 = this.f7820f;
            for (int i8 = 0; i8 < i7; i8++) {
                Object objM4304f2 = m4304f(i8);
                Object objM4308j2 = m4308j(i8);
                Object obj3 = ((Map) obj).get(objM4304f2);
                if (objM4308j2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM4304f2)) {
                        return false;
                    }
                } else if (!objM4308j2.equals(obj3)) {
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
    public final Object m4304f(int i5) {
        boolean z5 = false;
        if (i5 >= 0 && i5 < this.f7820f) {
            z5 = true;
        }
        if (z5) {
            return this.f7819e[i5 << 1];
        }
        AbstractC2477a.m4422c("Expected index to be within 0..size()-1, but was " + i5);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public void mo4305g(C2499c c2499c) {
        int i5 = c2499c.f7820f;
        m4300b(this.f7820f + i5);
        if (this.f7820f != 0) {
            for (int i6 = 0; i6 < i5; i6++) {
                put(c2499c.m4304f(i6), c2499c.m4308j(i6));
            }
        } else if (i5 > 0) {
            AbstractC0972l.m1991O(c2499c.f7818d, this.f7818d, 0, 0, i5);
            AbstractC0972l.m1993Q(c2499c.f7819e, this.f7819e, 0, 0, i5 << 1);
            this.f7820f = i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object get(Object obj) {
        int iM4302d = m4302d(obj);
        if (iM4302d >= 0) {
            return this.f7819e[(iM4302d << 1) + 1];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object getOrDefault(Object obj, Object obj2) {
        int iM4302d = m4302d(obj);
        return iM4302d >= 0 ? this.f7819e[(iM4302d << 1) + 1] : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public Object mo4306h(int i5) {
        int i6;
        if (i5 < 0 || i5 >= (i6 = this.f7820f)) {
            AbstractC2477a.m4422c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        Object[] objArr = this.f7819e;
        int i7 = i5 << 1;
        Object obj = objArr[i7 + 1];
        if (i6 <= 1) {
            clear();
            return obj;
        }
        int i8 = i6 - 1;
        int[] iArr = this.f7818d;
        if (iArr.length <= 8 || i6 >= iArr.length / 3) {
            if (i5 < i8) {
                int i9 = i5 + 1;
                AbstractC0972l.m1991O(iArr, iArr, i5, i9, i6);
                Object[] objArr2 = this.f7819e;
                AbstractC0972l.m1993Q(objArr2, objArr2, i7, i9 << 1, i6 << 1);
            }
            Object[] objArr3 = this.f7819e;
            int i10 = i8 << 1;
            objArr3[i10] = null;
            objArr3[i10 + 1] = null;
        } else {
            int i11 = i6 > 8 ? i6 + (i6 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i11);
            AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
            this.f7818d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7819e, i11 << 1);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            this.f7819e = objArrCopyOf;
            if (i6 != this.f7820f) {
                throw new ConcurrentModificationException();
            }
            if (i5 > 0) {
                AbstractC0972l.m1991O(iArr, this.f7818d, 0, 0, i5);
                AbstractC0972l.m1993Q(objArr, this.f7819e, 0, 0, i7);
            }
            if (i5 < i8) {
                int i12 = i5 + 1;
                AbstractC0972l.m1991O(iArr, this.f7818d, i5, i12, i6);
                AbstractC0972l.m1993Q(objArr, this.f7819e, i7, i12 << 1, i6 << 1);
            }
        }
        if (i6 != this.f7820f) {
            throw new ConcurrentModificationException();
        }
        this.f7820f = i8;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        int[] iArr = this.f7818d;
        Object[] objArr = this.f7819e;
        int i5 = this.f7820f;
        int i6 = 1;
        int i7 = 0;
        int iHashCode = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i7];
            i7++;
            i6 += 2;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public Object mo4307i(int i5, Object obj) {
        boolean z5 = false;
        if (i5 >= 0 && i5 < this.f7820f) {
            z5 = true;
        }
        if (!z5) {
            AbstractC2477a.m4422c("Expected index to be within 0..size()-1, but was " + i5);
            throw null;
        }
        int i6 = (i5 << 1) + 1;
        Object[] objArr = this.f7819e;
        Object obj2 = objArr[i6];
        objArr[i6] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmpty() {
        return this.f7820f <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Object m4308j(int i5) {
        boolean z5 = false;
        if (i5 >= 0 && i5 < this.f7820f) {
            z5 = true;
        }
        if (z5) {
            return this.f7819e[(i5 << 1) + 1];
        }
        AbstractC2477a.m4422c("Expected index to be within 0..size()-1, but was " + i5);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object put(Object obj, Object obj2) {
        int i5 = this.f7820f;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM4301c = obj != null ? m4301c(iHashCode, obj) : m4303e();
        if (iM4301c >= 0) {
            int i6 = (iM4301c << 1) + 1;
            Object[] objArr = this.f7819e;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~iM4301c;
        int[] iArr = this.f7818d;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
            this.f7818d = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f7819e, i8 << 1);
            AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            this.f7819e = objArrCopyOf;
            if (i5 != this.f7820f) {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i5) {
            int[] iArr2 = this.f7818d;
            int i9 = i7 + 1;
            AbstractC0972l.m1991O(iArr2, iArr2, i9, i7, i5);
            Object[] objArr2 = this.f7819e;
            AbstractC0972l.m1993Q(objArr2, objArr2, i9 << 1, i7 << 1, this.f7820f << 1);
        }
        int i10 = this.f7820f;
        if (i5 == i10) {
            int[] iArr3 = this.f7818d;
            if (i7 < iArr3.length) {
                iArr3[i7] = iHashCode;
                Object[] objArr3 = this.f7819e;
                int i11 = i7 << 1;
                objArr3[i11] = obj;
                objArr3[i11 + 1] = obj2;
                this.f7820f = i10 + 1;
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
    public Object remove(Object obj) {
        int iM4302d = m4302d(obj);
        if (iM4302d >= 0) {
            return mo4306h(iM4302d);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object replace(Object obj, Object obj2) {
        int iM4302d = m4302d(obj);
        if (iM4302d >= 0) {
            return mo4307i(iM4302d, obj2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int size() {
        return this.f7820f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f7820f * 28);
        sb.append('{');
        int i5 = this.f7820f;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            Object objM4304f = m4304f(i6);
            if (objM4304f != sb) {
                sb.append(objM4304f);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM4308j = m4308j(i6);
            if (objM4308j != sb) {
                sb.append(objM4308j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iM4302d = m4302d(obj);
        if (iM4302d < 0 || !AbstractC1665j.m2981a(obj2, m4308j(iM4302d))) {
            return false;
        }
        mo4306h(iM4302d);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM4302d = m4302d(obj);
        if (iM4302d < 0 || !AbstractC1665j.m2981a(obj2, m4308j(iM4302d))) {
            return false;
        }
        mo4307i(iM4302d, obj3);
        return true;
    }
}
