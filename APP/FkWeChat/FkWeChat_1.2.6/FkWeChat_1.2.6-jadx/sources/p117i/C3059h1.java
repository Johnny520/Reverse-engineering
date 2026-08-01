package p117i;

import java.util.Arrays;
import java.util.Map;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p132j.AbstractC3489a;
import p132j.AbstractC3492d;
import p185m8.AbstractC5102r;

/* JADX INFO: renamed from: i.h1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3059h1 {

    /* JADX INFO: renamed from: q */
    public int[] f8118q;

    /* JADX INFO: renamed from: r */
    public Object[] f8119r;

    /* JADX INFO: renamed from: s */
    public int f8120s;

    public C3059h1(int i10) {
        this.f8118q = i10 == 0 ? AbstractC3489a.f9693a : new int[i10];
        this.f8119r = i10 == 0 ? AbstractC3489a.f9695c : new Object[i10 << 1];
    }

    /* JADX INFO: renamed from: a */
    public final int m11327a(Object obj) {
        int i10 = this.f8120s * 2;
        Object[] objArr = this.f8119r;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (AbstractC1061t.m3842c(obj, objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public void m11328b(int i10) {
        int i11 = this.f8120s;
        int[] iArr = this.f8118q;
        if (iArr.length < i10) {
            this.f8118q = Arrays.copyOf(iArr, i10);
            this.f8119r = Arrays.copyOf(this.f8119r, i10 * 2);
        }
        if (this.f8120s == i11) {
            return;
        }
        C3039b.m11232a();
    }

    /* JADX INFO: renamed from: c */
    public final int m11329c(Object obj, int i10) {
        int i11 = this.f8120s;
        if (i11 == 0) {
            return -1;
        }
        int iM13004a = AbstractC3489a.m13004a(this.f8118q, i11, i10);
        if (iM13004a < 0 || AbstractC1061t.m3842c(obj, this.f8119r[iM13004a << 1])) {
            return iM13004a;
        }
        int i12 = iM13004a + 1;
        while (i12 < i11 && this.f8118q[i12] == i10) {
            if (AbstractC1061t.m3842c(obj, this.f8119r[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iM13004a - 1; i13 >= 0 && this.f8118q[i13] == i10; i13--) {
            if (AbstractC1061t.m3842c(obj, this.f8119r[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public void clear() {
        if (this.f8120s > 0) {
            this.f8118q = AbstractC3489a.f9693a;
            this.f8119r = AbstractC3489a.f9695c;
            this.f8120s = 0;
        }
        if (this.f8120s <= 0) {
            return;
        }
        C3039b.m11232a();
    }

    public boolean containsKey(Object obj) {
        return m11330e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m11327a(obj) >= 0;
    }

    /* JADX INFO: renamed from: e */
    public int m11330e(Object obj) {
        return obj == null ? m11331f() : m11329c(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C3059h1) {
                if (size() != ((C3059h1) obj).size()) {
                    return false;
                }
                C3059h1 c3059h1 = (C3059h1) obj;
                int i10 = this.f8120s;
                for (int i11 = 0; i11 < i10; i11++) {
                    Object objM11332g = m11332g(i11);
                    Object objM11335k = m11335k(i11);
                    Object obj2 = c3059h1.get(objM11332g);
                    if (objM11335k == null) {
                        if (obj2 != null || !c3059h1.containsKey(objM11332g)) {
                            return false;
                        }
                    } else if (!AbstractC1061t.m3842c(objM11335k, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i12 = this.f8120s;
            for (int i13 = 0; i13 < i12; i13++) {
                Object objM11332g2 = m11332g(i13);
                Object objM11335k2 = m11335k(i13);
                Object obj3 = ((Map) obj).get(objM11332g2);
                if (objM11335k2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM11332g2)) {
                        return false;
                    }
                } else if (!AbstractC1061t.m3842c(objM11335k2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final int m11331f() {
        int i10 = this.f8120s;
        if (i10 == 0) {
            return -1;
        }
        int iM13004a = AbstractC3489a.m13004a(this.f8118q, i10, 0);
        if (iM13004a < 0 || this.f8119r[iM13004a << 1] == null) {
            return iM13004a;
        }
        int i11 = iM13004a + 1;
        while (i11 < i10 && this.f8118q[i11] == 0) {
            if (this.f8119r[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iM13004a - 1; i12 >= 0 && this.f8118q[i12] == 0; i12--) {
            if (this.f8119r[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    /* JADX INFO: renamed from: g */
    public Object m11332g(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f8120s) {
            z10 = true;
        }
        if (!z10) {
            AbstractC3492d.m13015a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f8119r[i10 << 1];
    }

    public Object get(Object obj) {
        int iM11330e = m11330e(obj);
        if (iM11330e >= 0) {
            return this.f8119r[(iM11330e << 1) + 1];
        }
        return null;
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iM11330e = m11330e(obj);
        return iM11330e >= 0 ? this.f8119r[(iM11330e << 1) + 1] : obj2;
    }

    public int hashCode() {
        int[] iArr = this.f8118q;
        Object[] objArr = this.f8119r;
        int i10 = this.f8120s;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public Object m11333i(int i10) {
        if (!(i10 >= 0 && i10 < this.f8120s)) {
            AbstractC3492d.m13015a("Expected index to be within 0..size()-1, but was " + i10);
        }
        Object[] objArr = this.f8119r;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f8120s;
        if (i12 <= 1) {
            clear();
            return obj;
        }
        int i13 = i12 - 1;
        int[] iArr = this.f8118q;
        if (iArr.length <= 8 || i12 >= iArr.length / 3) {
            if (i10 < i13) {
                int i14 = i10 + 1;
                AbstractC5102r.m20658j(iArr, iArr, i10, i14, i12);
                Object[] objArr2 = this.f8119r;
                AbstractC5102r.m20660l(objArr2, objArr2, i11, i14 << 1, i12 << 1);
            }
            Object[] objArr3 = this.f8119r;
            int i15 = i13 << 1;
            objArr3[i15] = null;
            objArr3[i15 + 1] = null;
        } else {
            int i16 = i12 > 8 ? i12 + (i12 >> 1) : 8;
            this.f8118q = Arrays.copyOf(iArr, i16);
            this.f8119r = Arrays.copyOf(this.f8119r, i16 << 1);
            if (i12 != this.f8120s) {
                C3039b.m11232a();
                return null;
            }
            if (i10 > 0) {
                AbstractC5102r.m20658j(iArr, this.f8118q, 0, 0, i10);
                AbstractC5102r.m20660l(objArr, this.f8119r, 0, 0, i11);
            }
            if (i10 < i13) {
                int i17 = i10 + 1;
                AbstractC5102r.m20658j(iArr, this.f8118q, i10, i17, i12);
                AbstractC5102r.m20660l(objArr, this.f8119r, i11, i17 << 1, i12 << 1);
            }
        }
        if (i12 == this.f8120s) {
            this.f8120s = i13;
            return obj;
        }
        C3039b.m11232a();
        return null;
    }

    public boolean isEmpty() {
        return this.f8120s <= 0;
    }

    /* JADX INFO: renamed from: j */
    public Object m11334j(int i10, Object obj) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f8120s) {
            z10 = true;
        }
        if (!z10) {
            AbstractC3492d.m13015a("Expected index to be within 0..size()-1, but was " + i10);
        }
        int i11 = (i10 << 1) + 1;
        Object[] objArr = this.f8119r;
        Object obj2 = objArr[i11];
        objArr[i11] = obj;
        return obj2;
    }

    /* JADX INFO: renamed from: k */
    public Object m11335k(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < this.f8120s) {
            z10 = true;
        }
        if (!z10) {
            AbstractC3492d.m13015a("Expected index to be within 0..size()-1, but was " + i10);
        }
        return this.f8119r[(i10 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i10 = this.f8120s;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM11329c = obj != null ? m11329c(obj, iHashCode) : m11331f();
        if (iM11329c >= 0) {
            int i11 = (iM11329c << 1) + 1;
            Object[] objArr = this.f8119r;
            Object obj3 = objArr[i11];
            objArr[i11] = obj2;
            return obj3;
        }
        int i12 = ~iM11329c;
        int[] iArr = this.f8118q;
        if (i10 >= iArr.length) {
            int i13 = 8;
            if (i10 >= 8) {
                i13 = (i10 >> 1) + i10;
            } else if (i10 < 4) {
                i13 = 4;
            }
            this.f8118q = Arrays.copyOf(iArr, i13);
            this.f8119r = Arrays.copyOf(this.f8119r, i13 << 1);
            if (i10 != this.f8120s) {
                C3039b.m11232a();
                return null;
            }
        }
        if (i12 < i10) {
            int[] iArr2 = this.f8118q;
            int i14 = i12 + 1;
            AbstractC5102r.m20658j(iArr2, iArr2, i14, i12, i10);
            Object[] objArr2 = this.f8119r;
            AbstractC5102r.m20660l(objArr2, objArr2, i14 << 1, i12 << 1, this.f8120s << 1);
        }
        int i15 = this.f8120s;
        if (i10 == i15) {
            int[] iArr3 = this.f8118q;
            if (i12 < iArr3.length) {
                iArr3[i12] = iHashCode;
                Object[] objArr3 = this.f8119r;
                int i16 = i12 << 1;
                objArr3[i16] = obj;
                objArr3[i16 + 1] = obj2;
                this.f8120s = i15 + 1;
                return null;
            }
        }
        C3039b.m11232a();
        return null;
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public boolean remove(Object obj, Object obj2) {
        int iM11330e = m11330e(obj);
        if (iM11330e < 0 || !AbstractC1061t.m3842c(obj2, m11335k(iM11330e))) {
            return false;
        }
        m11333i(iM11330e);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iM11330e = m11330e(obj);
        if (iM11330e < 0 || !AbstractC1061t.m3842c(obj2, m11335k(iM11330e))) {
            return false;
        }
        m11334j(iM11330e, obj3);
        return true;
    }

    public int size() {
        return this.f8120s;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f8120s * 28);
        sb2.append('{');
        int i10 = this.f8120s;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            Object objM11332g = m11332g(i11);
            if (objM11332g != sb2) {
                sb2.append(objM11332g);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objM11335k = m11335k(i11);
            if (objM11335k != sb2) {
                sb2.append(objM11335k);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Object remove(Object obj) {
        int iM11330e = m11330e(obj);
        if (iM11330e >= 0) {
            return m11333i(iM11330e);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iM11330e = m11330e(obj);
        if (iM11330e >= 0) {
            return m11334j(iM11330e, obj2);
        }
        return null;
    }

    public C3059h1() {
        this(0, 1, null);
    }

    public /* synthetic */ C3059h1(int i10, int i11, AbstractC1043k abstractC1043k) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
