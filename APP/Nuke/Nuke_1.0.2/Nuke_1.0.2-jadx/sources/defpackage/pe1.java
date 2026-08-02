package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class pe1 implements Map, Serializable, s41 {
    public static final pe1 u;
    public Object[] h;
    public Object[] i;
    public int[] j;
    public int[] k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public qe1 q;
    public re1 r;
    public qe1 s;
    public boolean t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        pe1 pe1Var = new pe1(0);
        pe1Var.t = true;
        u = pe1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public pe1(int i) {
        if (i < 0) {
            s.j("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.h = objArr;
        this.i = null;
        this.j = iArr;
        this.k = new int[iHighestOneBit];
        this.l = 2;
        this.m = 0;
        this.n = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.l * 2;
            int length = this.k.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.k;
                int i4 = iArr[i];
                if (i4 == 0) {
                    int i5 = this.m;
                    Object[] objArr = this.h;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.m = i6;
                        objArr[i5] = obj;
                        this.j[i5] = i;
                        iArr[i] = i6;
                        this.p++;
                        this.o++;
                        if (i3 > this.l) {
                            this.l = i3;
                        }
                        return i5;
                    }
                    f(1);
                } else {
                    if (t11.l(this.h[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.k.length * 2);
                        break;
                    }
                    i = i == 0 ? this.k.length - 1 : i - 1;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final pe1 b() {
        c();
        this.t = true;
        if (this.p > 0) {
            return this;
        }
        pe1 pe1Var = u;
        pe1Var.getClass();
        return pe1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c() {
        if (this.t) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.m - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.j;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.k[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        tp0.I(this.h, 0, this.m);
        Object[] objArr = this.i;
        if (objArr != null) {
            tp0.I(objArr, 0, this.m);
        }
        this.p = 0;
        this.m = 0;
        this.o++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(boolean z) {
        int i;
        Object[] objArr = this.i;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.m;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.j;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.h;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.k[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        tp0.I(this.h, i3, i);
        if (objArr != null) {
            tp0.I(objArr, i3, this.m);
        }
        this.m = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(Collection collection) {
        boolean zL;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = g(entry.getKey());
                    if (iG < 0) {
                        zL = false;
                    } else {
                        Object[] objArr = this.i;
                        objArr.getClass();
                        zL = t11.l(objArr[iG], entry.getValue());
                    }
                    if (!zL) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        qe1 qe1Var = this.s;
        if (qe1Var != null) {
            return qe1Var;
        }
        qe1 qe1Var2 = new qe1(this, 0);
        this.s = qe1Var2;
        return qe1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.p == map.size() && e(map.entrySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void f(int i) {
        Object[] objArr = this.h;
        int length = objArr.length;
        int i2 = this.m;
        int i3 = length - i2;
        int i4 = i2 - this.p;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
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
            this.h = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.i;
            this.i = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.j = Arrays.copyOf(this.j, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.k.length) {
                j(iHighestOneBit);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.l;
        while (true) {
            int i3 = this.k[i];
            if (i3 == 0) {
                return -1;
            }
            int i4 = i3 - 1;
            if (t11.l(this.h[i4], obj)) {
                return i4;
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.k.length - 1 : i - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.i;
        objArr.getClass();
        return objArr[iG];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int h(Object obj) {
        int i = this.m;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.j[i] >= 0) {
                Object[] objArr = this.i;
                objArr.getClass();
                if (t11.l(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int hashCode() {
        ne1 ne1Var = new ne1(this, 0);
        int i = 0;
        while (ne1Var.hasNext()) {
            int i2 = ne1Var.i;
            pe1 pe1Var = ne1Var.h;
            if (i2 >= pe1Var.m) {
                um2.b();
                return 0;
            }
            ne1Var.i = i2 + 1;
            ne1Var.j = i2;
            Object obj = pe1Var.h[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = pe1Var.i;
            objArr.getClass();
            Object obj2 = objArr[ne1Var.j];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            ne1Var.b();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.p == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.j[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(int i) {
        this.o++;
        int i2 = 0;
        if (this.m > this.p) {
            d(false);
        }
        this.k = new int[i];
        this.n = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.m) {
            int i3 = i2 + 1;
            int i4 = i(this.h[i2]);
            int i5 = this.l;
            while (true) {
                int[] iArr = this.k;
                if (iArr[i4] == 0) {
                    break;
                }
                i5--;
                if (i5 < 0) {
                    s.l("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                i4 = i4 == 0 ? iArr.length - 1 : i4 - 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(int i) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        Object[] objArr = this.h;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.i;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.j[i];
        loop0: while (true) {
            int i5 = length;
            int i6 = 0;
            do {
                length = length == 0 ? this.k.length - 1 : length - 1;
                int[] iArr2 = this.k;
                i2 = iArr2[length];
                i6++;
                if (i6 > this.l) {
                    iArr2[i5] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i5] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    i4 = i(this.h[i3]) - length;
                    iArr = this.k;
                }
            } while ((i4 & (iArr.length - 1)) < i6);
            iArr[i5] = i2;
            this.j[i3] = i5;
        }
        this.j[i] = -1;
        this.p--;
        this.o++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        qe1 qe1Var = this.q;
        if (qe1Var != null) {
            return qe1Var;
        }
        qe1 qe1Var2 = new qe1(this, 1);
        this.q = qe1Var2;
        return qe1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.i;
        if (objArr == null) {
            int length = this.h.length;
            if (length < 0) {
                s.j("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.i = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.i;
            if (objArr == null) {
                int length = this.h.length;
                if (length < 0) {
                    s.j("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.i = objArr;
                }
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!t11.l(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object[] objArr = this.i;
        objArr.getClass();
        Object obj2 = objArr[iG];
        k(iG);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int size() {
        return this.p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.p * 3) + 2);
        sb.append("{");
        int i = 0;
        ne1 ne1Var = new ne1(this, 0);
        while (ne1Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = ne1Var.i;
            pe1 pe1Var = ne1Var.h;
            if (i2 >= pe1Var.m) {
                um2.b();
                return null;
            }
            ne1Var.i = i2 + 1;
            ne1Var.j = i2;
            Object obj = pe1Var.h[i2];
            if (obj == pe1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = pe1Var.i;
            objArr.getClass();
            Object obj2 = objArr[ne1Var.j];
            if (obj2 == pe1Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            ne1Var.b();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        re1 re1Var = this.r;
        if (re1Var != null) {
            return re1Var;
        }
        re1 re1Var2 = new re1(this);
        this.r = re1Var2;
        return re1Var2;
    }

    public pe1() {
        this(8);
    }
}
