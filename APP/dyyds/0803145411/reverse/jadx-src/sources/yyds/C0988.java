package yyds;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᛴᲈᛲᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public class C0988 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f4500;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public int[] f4501 = AbstractC0024.f8167;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public Object[] f4502 = AbstractC0024.f8168;

    public C0988(int i) {
    }

    public void clear() {
        int i = this.f4500;
        if (i > 0) {
            this.f4501 = AbstractC0024.f8167;
            this.f4502 = AbstractC0024.f8168;
            i = 0;
            this.f4500 = 0;
        }
        if (i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return m2174(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m2169(obj) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0988) {
                int i = this.f4500;
                if (i != ((C0988) obj).f4500) {
                    return false;
                }
                C0988 c0988 = (C0988) obj;
                for (int i2 = 0; i2 < i; i2++) {
                    Object objM2173 = m2173(i2);
                    Object objM2171 = m2171(i2);
                    Object obj2 = c0988.get(objM2173);
                    if (objM2171 == null) {
                        if (obj2 != null || !c0988.containsKey(objM2173)) {
                            return false;
                        }
                    } else if (!objM2171.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f4500 != ((Map) obj).size()) {
                return false;
            }
            int i3 = this.f4500;
            for (int i4 = 0; i4 < i3; i4++) {
                Object objM21732 = m2173(i4);
                Object objM21712 = m2171(i4);
                Object obj3 = ((Map) obj).get(objM21732);
                if (objM21712 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM21732)) {
                        return false;
                    }
                } else if (!objM21712.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public Object get(Object obj) {
        int iM2174 = m2174(obj);
        if (iM2174 >= 0) {
            return this.f4502[(iM2174 << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2174 = m2174(obj);
        return iM2174 >= 0 ? this.f4502[(iM2174 << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f4501;
        Object[] objArr = this.f4502;
        int i = this.f4500;
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

    public final boolean isEmpty() {
        return this.f4500 <= 0;
    }

    public Object put(Object obj, Object obj2) {
        int i = this.f4500;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM2172 = obj != null ? m2172(iHashCode, obj) : m2168();
        if (iM2172 >= 0) {
            int i2 = (iM2172 << 1) + 1;
            Object[] objArr = this.f4502;
            Object obj3 = objArr[i2];
            objArr[i2] = obj2;
            return obj3;
        }
        int i3 = ~iM2172;
        int[] iArr = this.f4501;
        if (i >= iArr.length) {
            int i4 = 8;
            if (i >= 8) {
                i4 = (i >> 1) + i;
            } else if (i < 4) {
                i4 = 4;
            }
            this.f4501 = Arrays.copyOf(iArr, i4);
            this.f4502 = Arrays.copyOf(this.f4502, i4 << 1);
            if (i != this.f4500) {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i) {
            int[] iArr2 = this.f4501;
            int i5 = i3 + 1;
            AbstractC2070.m3934(i5, i3, i, iArr2, iArr2);
            Object[] objArr2 = this.f4502;
            AbstractC2070.m3939(i5 << 1, i3 << 1, this.f4500 << 1, objArr2, objArr2);
        }
        int i6 = this.f4500;
        if (i == i6) {
            int[] iArr3 = this.f4501;
            if (i3 < iArr3.length) {
                iArr3[i3] = iHashCode;
                Object[] objArr3 = this.f4502;
                int i7 = i3 << 1;
                objArr3[i7] = obj;
                objArr3[i7 + 1] = obj2;
                this.f4500 = i6 + 1;
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
        int iM2174 = m2174(obj);
        if (iM2174 < 0 || !AbstractC1544.m3188(obj2, m2171(iM2174))) {
            return false;
        }
        mo1163(iM2174);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2174 = m2174(obj);
        if (iM2174 < 0 || !AbstractC1544.m3188(obj2, m2171(iM2174))) {
            return false;
        }
        mo1164(iM2174, obj3);
        return true;
    }

    public final int size() {
        return this.f4500;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f4500 * 28);
        sb.append('{');
        int i = this.f4500;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object objM2173 = m2173(i2);
            if (objM2173 != sb) {
                sb.append(objM2173);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM2171 = m2171(i2);
            if (objM2171 != sb) {
                sb.append(objM2171);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public Object mo1163(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f4500)) {
            AbstractC0024.m3301("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        Object[] objArr = this.f4502;
        int i3 = i << 1;
        Object obj = objArr[i3 + 1];
        if (i2 <= 1) {
            clear();
            return obj;
        }
        int i4 = i2 - 1;
        int[] iArr = this.f4501;
        if (iArr.length <= 8 || i2 >= iArr.length / 3) {
            if (i < i4) {
                int i5 = i + 1;
                AbstractC2070.m3934(i, i5, i2, iArr, iArr);
                Object[] objArr2 = this.f4502;
                AbstractC2070.m3939(i3, i5 << 1, i2 << 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.f4502;
            int i6 = i4 << 1;
            objArr3[i6] = null;
            objArr3[i6 + 1] = null;
        } else {
            int i7 = i2 > 8 ? i2 + (i2 >> 1) : 8;
            this.f4501 = Arrays.copyOf(iArr, i7);
            this.f4502 = Arrays.copyOf(this.f4502, i7 << 1);
            if (i2 != this.f4500) {
                throw new ConcurrentModificationException();
            }
            if (i > 0) {
                AbstractC2070.m3934(0, 0, i, iArr, this.f4501);
                AbstractC2070.m3939(0, 0, i3, objArr, this.f4502);
            }
            if (i < i4) {
                int i8 = i + 1;
                AbstractC2070.m3934(i, i8, i2, iArr, this.f4501);
                AbstractC2070.m3939(i3, i8 << 1, i2 << 1, objArr, this.f4502);
            }
        }
        if (i2 != this.f4500) {
            throw new ConcurrentModificationException();
        }
        this.f4500 = i4;
        return obj;
    }

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public Object mo1164(int i, Object obj) {
        if (i < 0 || i >= this.f4500) {
            AbstractC0024.m3301("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f4502;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final int m2168() {
        int i = this.f4500;
        if (i == 0) {
            return -1;
        }
        int iM3298 = AbstractC0024.m3298(i, 0, this.f4501);
        if (iM3298 < 0 || this.f4502[iM3298 << 1] == null) {
            return iM3298;
        }
        int i2 = iM3298 + 1;
        while (i2 < i && this.f4501[i2] == 0) {
            if (this.f4502[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = iM3298 - 1; i3 >= 0 && this.f4501[i3] == 0; i3--) {
            if (this.f4502[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final int m2169(Object obj) {
        int i = this.f4500 * 2;
        Object[] objArr = this.f4502;
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

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2170(int i) {
        int i2 = this.f4500;
        int[] iArr = this.f4501;
        if (iArr.length < i) {
            this.f4501 = Arrays.copyOf(iArr, i);
            this.f4502 = Arrays.copyOf(this.f4502, i * 2);
        }
        if (this.f4500 != i2) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public void mo1165(C1505 c1505) {
        int i = c1505.f4500;
        m2170(this.f4500 + i);
        if (this.f4500 != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(c1505.m2173(i2), c1505.m2171(i2));
            }
        } else if (i > 0) {
            AbstractC2070.m3934(0, 0, i, c1505.f4501, this.f4501);
            AbstractC2070.m3939(0, 0, i << 1, c1505.f4502, this.f4502);
            this.f4500 = i;
        }
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Object m2171(int i) {
        if (i >= 0 && i < this.f4500) {
            return this.f4502[(i << 1) + 1];
        }
        AbstractC0024.m3301("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final int m2172(int i, Object obj) {
        int i2 = this.f4500;
        if (i2 == 0) {
            return -1;
        }
        int iM3298 = AbstractC0024.m3298(i2, i, this.f4501);
        if (iM3298 < 0 || AbstractC1544.m3188(obj, this.f4502[iM3298 << 1])) {
            return iM3298;
        }
        int i3 = iM3298 + 1;
        while (i3 < i2 && this.f4501[i3] == i) {
            if (AbstractC1544.m3188(obj, this.f4502[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iM3298 - 1; i4 >= 0 && this.f4501[i4] == i; i4--) {
            if (AbstractC1544.m3188(obj, this.f4502[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final Object m2173(int i) {
        if (i >= 0 && i < this.f4500) {
            return this.f4502[i << 1];
        }
        AbstractC0024.m3301("Expected index to be within 0..size()-1, but was " + i);
        throw null;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final int m2174(Object obj) {
        return obj == null ? m2168() : m2172(obj.hashCode(), obj);
    }

    public Object remove(Object obj) {
        int iM2174 = m2174(obj);
        if (iM2174 >= 0) {
            return mo1163(iM2174);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iM2174 = m2174(obj);
        if (iM2174 >= 0) {
            return mo1164(iM2174, obj2);
        }
        return null;
    }
}
