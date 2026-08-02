package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 implements Map, Serializable, s41 {

    /* JADX INFO: renamed from: u */
    public static final pe1 f8270u;

    /* JADX INFO: renamed from: h */
    public Object[] f8271h;

    /* JADX INFO: renamed from: i */
    public Object[] f8272i;

    /* JADX INFO: renamed from: j */
    public int[] f8273j;

    /* JADX INFO: renamed from: k */
    public int[] f8274k;

    /* JADX INFO: renamed from: l */
    public int f8275l;

    /* JADX INFO: renamed from: m */
    public int f8276m;

    /* JADX INFO: renamed from: n */
    public int f8277n;

    /* JADX INFO: renamed from: o */
    public int f8278o;

    /* JADX INFO: renamed from: p */
    public int f8279p;

    /* JADX INFO: renamed from: q */
    public qe1 f8280q;

    /* JADX INFO: renamed from: r */
    public re1 f8281r;

    /* JADX INFO: renamed from: s */
    public qe1 f8282s;

    /* JADX INFO: renamed from: t */
    public boolean f8283t;

    static {
        pe1 pe1Var = new pe1(0);
        pe1Var.f8283t = true;
        f8270u = pe1Var;
    }

    public pe1(int i) {
        if (i < 0) {
            C0676s.m4651j("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f8271h = objArr;
        this.f8272i = null;
        this.f8273j = iArr;
        this.f8274k = new int[iHighestOneBit];
        this.f8275l = 2;
        this.f8276m = 0;
        this.f8277n = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m3851a(Object obj) {
        m3853c();
        while (true) {
            int iM3859i = m3859i(obj);
            int i = this.f8275l * 2;
            int length = this.f8274k.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f8274k;
                int i3 = iArr[iM3859i];
                if (i3 == 0) {
                    int i4 = this.f8276m;
                    Object[] objArr = this.f8271h;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f8276m = i5;
                        objArr[i4] = obj;
                        this.f8273j[i4] = iM3859i;
                        iArr[iM3859i] = i5;
                        this.f8279p++;
                        this.f8278o++;
                        if (i2 > this.f8275l) {
                            this.f8275l = i2;
                        }
                        return i4;
                    }
                    m3856f(1);
                } else {
                    if (t11.m5086l(this.f8271h[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m3860j(this.f8274k.length * 2);
                        break;
                    }
                    iM3859i = iM3859i == 0 ? this.f8274k.length - 1 : iM3859i - 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final pe1 m3852b() {
        m3853c();
        this.f8283t = true;
        if (this.f8279p > 0) {
            return this;
        }
        pe1 pe1Var = f8270u;
        pe1Var.getClass();
        return pe1Var;
    }

    /* JADX INFO: renamed from: c */
    public final void m3853c() {
        if (this.f8283t) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        m3853c();
        int i = this.f8276m - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f8273j;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f8274k[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        tp0.m5345I(this.f8271h, 0, this.f8276m);
        Object[] objArr = this.f8272i;
        if (objArr != null) {
            tp0.m5345I(objArr, 0, this.f8276m);
        }
        this.f8279p = 0;
        this.f8276m = 0;
        this.f8278o++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m3857g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m3858h(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m3854d(boolean z) {
        int i;
        Object[] objArr = this.f8272i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f8276m;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f8273j;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f8271h;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f8274k[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        tp0.m5345I(this.f8271h, i3, i);
        if (objArr != null) {
            tp0.m5345I(objArr, i3, this.f8276m);
        }
        this.f8276m = i3;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3855e(Collection collection) {
        boolean zM5086l;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM3857g = m3857g(entry.getKey());
                    if (iM3857g < 0) {
                        zM5086l = false;
                    } else {
                        Object[] objArr = this.f8272i;
                        objArr.getClass();
                        zM5086l = t11.m5086l(objArr[iM3857g], entry.getValue());
                    }
                    if (!zM5086l) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        qe1 qe1Var = this.f8282s;
        if (qe1Var != null) {
            return qe1Var;
        }
        qe1 qe1Var2 = new qe1(this, 0);
        this.f8282s = qe1Var2;
        return qe1Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.f8279p == map.size() && m3855e(map.entrySet());
    }

    /* JADX INFO: renamed from: f */
    public final void m3856f(int i) {
        Object[] objArr = this.f8271h;
        int length = objArr.length;
        int i2 = this.f8276m;
        int i3 = length - i2;
        int i4 = i2 - this.f8279p;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m3854d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.f8271h = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f8272i;
            this.f8272i = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f8273j = Arrays.copyOf(this.f8273j, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f8274k.length) {
                m3860j(iHighestOneBit);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m3857g(Object obj) {
        int iM3859i = m3859i(obj);
        int i = this.f8275l;
        while (true) {
            int i2 = this.f8274k[iM3859i];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (t11.m5086l(this.f8271h[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM3859i = iM3859i == 0 ? this.f8274k.length - 1 : iM3859i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM3857g = m3857g(obj);
        if (iM3857g < 0) {
            return null;
        }
        Object[] objArr = this.f8272i;
        objArr.getClass();
        return objArr[iM3857g];
    }

    /* JADX INFO: renamed from: h */
    public final int m3858h(Object obj) {
        int i = this.f8276m;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f8273j[i] >= 0) {
                Object[] objArr = this.f8272i;
                objArr.getClass();
                if (t11.m5086l(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        ne1 ne1Var = new ne1(this, 0);
        int i = 0;
        while (ne1Var.hasNext()) {
            int i2 = ne1Var.f7118i;
            pe1 pe1Var = ne1Var.f7117h;
            if (i2 >= pe1Var.f8276m) {
                um2.m5513b();
                return 0;
            }
            ne1Var.f7118i = i2 + 1;
            ne1Var.f7119j = i2;
            Object obj = pe1Var.f8271h[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = pe1Var.f8272i;
            objArr.getClass();
            Object obj2 = objArr[ne1Var.f7119j];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            ne1Var.m3291b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX INFO: renamed from: i */
    public final int m3859i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f8277n;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f8279p == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f8273j[r2] = r0;
        r2 = r6;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3860j(int i) {
        this.f8278o++;
        int i2 = 0;
        if (this.f8276m > this.f8279p) {
            m3854d(false);
        }
        this.f8274k = new int[i];
        this.f8277n = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f8276m) {
            int i3 = i2 + 1;
            int iM3859i = m3859i(this.f8271h[i2]);
            int i4 = this.f8275l;
            while (true) {
                int[] iArr = this.f8274k;
                if (iArr[iM3859i] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    C0676s.m4653l("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iM3859i = iM3859i == 0 ? iArr.length - 1 : iM3859i - 1;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m3861k(int i) {
        int i2;
        int i3;
        int iM3859i;
        int[] iArr;
        Object[] objArr = this.f8271h;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.f8272i;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f8273j[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f8274k.length - 1 : length - 1;
                int[] iArr2 = this.f8274k;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f8275l) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM3859i = m3859i(this.f8271h[i3]) - length;
                    iArr = this.f8274k;
                }
            } while ((iM3859i & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f8273j[i3] = i4;
        }
        this.f8273j[i] = -1;
        this.f8279p--;
        this.f8278o++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        qe1 qe1Var = this.f8280q;
        if (qe1Var != null) {
            return qe1Var;
        }
        qe1 qe1Var2 = new qe1(this, 1);
        this.f8280q = qe1Var2;
        return qe1Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3853c();
        int iM3851a = m3851a(obj);
        Object[] objArr = this.f8272i;
        if (objArr == null) {
            int length = this.f8271h.length;
            if (length < 0) {
                C0676s.m4651j("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f8272i = objArr;
        }
        if (iM3851a >= 0) {
            objArr[iM3851a] = obj2;
            return null;
        }
        int i = (-iM3851a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        m3853c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m3856f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM3851a = m3851a(entry.getKey());
            Object[] objArr = this.f8272i;
            if (objArr == null) {
                int length = this.f8271h.length;
                if (length < 0) {
                    C0676s.m4651j("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f8272i = objArr;
                }
            }
            if (iM3851a >= 0) {
                objArr[iM3851a] = entry.getValue();
            } else {
                int i = (-iM3851a) - 1;
                if (!t11.m5086l(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m3853c();
        int iM3857g = m3857g(obj);
        if (iM3857g < 0) {
            return null;
        }
        Object[] objArr = this.f8272i;
        objArr.getClass();
        Object obj2 = objArr[iM3857g];
        m3861k(iM3857g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8279p;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f8279p * 3) + 2);
        sb.append("{");
        int i = 0;
        ne1 ne1Var = new ne1(this, 0);
        while (ne1Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = ne1Var.f7118i;
            pe1 pe1Var = ne1Var.f7117h;
            if (i2 >= pe1Var.f8276m) {
                um2.m5513b();
                return null;
            }
            ne1Var.f7118i = i2 + 1;
            ne1Var.f7119j = i2;
            Object obj = pe1Var.f8271h[i2];
            if (obj == pe1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = pe1Var.f8272i;
            objArr.getClass();
            Object obj2 = objArr[ne1Var.f7119j];
            if (obj2 == pe1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            ne1Var.m3291b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        re1 re1Var = this.f8281r;
        if (re1Var != null) {
            return re1Var;
        }
        re1 re1Var2 = new re1(this);
        this.f8281r = re1Var2;
        return re1Var2;
    }

    public pe1() {
        this(8);
    }
}
