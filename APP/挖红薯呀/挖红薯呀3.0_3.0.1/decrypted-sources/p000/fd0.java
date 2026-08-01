package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fd0 implements Map, Serializable, s40 {

    /* JADX INFO: renamed from: q */
    public static final fd0 f1682q;

    /* JADX INFO: renamed from: d */
    public Object[] f1683d;

    /* JADX INFO: renamed from: e */
    public Object[] f1684e;

    /* JADX INFO: renamed from: f */
    public int[] f1685f;

    /* JADX INFO: renamed from: g */
    public int[] f1686g;

    /* JADX INFO: renamed from: h */
    public int f1687h;

    /* JADX INFO: renamed from: i */
    public int f1688i;

    /* JADX INFO: renamed from: j */
    public int f1689j;

    /* JADX INFO: renamed from: k */
    public int f1690k;

    /* JADX INFO: renamed from: l */
    public int f1691l;

    /* JADX INFO: renamed from: m */
    public gd0 f1692m;

    /* JADX INFO: renamed from: n */
    public hd0 f1693n;

    /* JADX INFO: renamed from: o */
    public gd0 f1694o;

    /* JADX INFO: renamed from: p */
    public boolean f1695p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        fd0 fd0Var = new fd0(0);
        fd0Var.f1695p = true;
        f1682q = fd0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fd0(int i) {
        if (i < 0) {
            C0921xc.m5131l("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f1683d = objArr;
        this.f1684e = null;
        this.f1685f = iArr;
        this.f1686g = new int[iHighestOneBit];
        this.f1687h = 2;
        this.f1688i = 0;
        this.f1689j = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m1080a(Object obj) {
        m1081b();
        while (true) {
            int iM1087h = m1087h(obj);
            int i = this.f1687h * 2;
            int length = this.f1686g.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f1686g;
                int i3 = iArr[iM1087h];
                if (i3 == 0) {
                    int i4 = this.f1688i;
                    Object[] objArr = this.f1683d;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f1688i = i5;
                        objArr[i4] = obj;
                        this.f1685f[i4] = iM1087h;
                        iArr[iM1087h] = i5;
                        this.f1691l++;
                        this.f1690k++;
                        if (i2 > this.f1687h) {
                            this.f1687h = i2;
                        }
                        return i4;
                    }
                    m1084e(1);
                } else {
                    if (p30.m3002l(this.f1683d[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m1088i(this.f1686g.length * 2);
                        break;
                    }
                    iM1087h = iM1087h == 0 ? this.f1686g.length - 1 : iM1087h - 1;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m1081b() {
        if (this.f1695p) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1082c(boolean z) {
        int i;
        Object[] objArr = this.f1684e;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f1688i;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f1685f;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f1683d;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f1686g[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        w60.m4886H(this.f1683d, i3, i);
        if (objArr != null) {
            w60.m4886H(objArr, i3, this.f1688i);
        }
        this.f1688i = i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void clear() {
        m1081b();
        int i = this.f1688i - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f1685f;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f1686g[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        w60.m4886H(this.f1683d, 0, this.f1688i);
        Object[] objArr = this.f1684e;
        if (objArr != null) {
            w60.m4886H(objArr, 0, this.f1688i);
        }
        this.f1691l = 0;
        this.f1688i = 0;
        this.f1690k++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m1085f(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m1086g(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m1083d(Collection collection) {
        boolean zM3002l;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM1085f = m1085f(entry.getKey());
                    if (iM1085f < 0) {
                        zM3002l = false;
                    } else {
                        Object[] objArr = this.f1684e;
                        objArr.getClass();
                        zM3002l = p30.m3002l(objArr[iM1085f], entry.getValue());
                    }
                    if (!zM3002l) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1084e(int i) {
        Object[] objArr = this.f1683d;
        int length = objArr.length;
        int i2 = this.f1688i;
        int i3 = length - i2;
        int i4 = i2 - this.f1691l;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m1082c(true);
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
            this.f1683d = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f1684e;
            this.f1684e = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f1685f = Arrays.copyOf(this.f1685f, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f1686g.length) {
                m1088i(iHighestOneBit);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        gd0 gd0Var = this.f1694o;
        if (gd0Var != null) {
            return gd0Var;
        }
        gd0 gd0Var2 = new gd0(this, 0);
        this.f1694o = gd0Var2;
        return gd0Var2;
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
        return this.f1691l == map.size() && m1083d(map.entrySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final int m1085f(Object obj) {
        int iM1087h = m1087h(obj);
        int i = this.f1687h;
        while (true) {
            int i2 = this.f1686g[iM1087h];
            if (i2 == 0) {
                return -1;
            }
            int i3 = i2 - 1;
            if (p30.m3002l(this.f1683d[i3], obj)) {
                return i3;
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM1087h = iM1087h == 0 ? this.f1686g.length - 1 : iM1087h - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m1086g(Object obj) {
        int i = this.f1688i;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f1685f[i] >= 0) {
                Object[] objArr = this.f1684e;
                objArr.getClass();
                if (p30.m3002l(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM1085f = m1085f(obj);
        if (iM1085f < 0) {
            return null;
        }
        Object[] objArr = this.f1684e;
        objArr.getClass();
        return objArr[iM1085f];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m1087h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f1689j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int hashCode() {
        cd0 cd0Var = new cd0(this, 0);
        int i = 0;
        while (cd0Var.hasNext()) {
            int i2 = cd0Var.f1420d;
            fd0 fd0Var = (fd0) cd0Var.f1423g;
            if (i2 >= fd0Var.f1688i) {
                C0921xc.m5132m();
                return 0;
            }
            cd0Var.f1420d = i2 + 1;
            cd0Var.f1421e = i2;
            Object obj = fd0Var.f1683d[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = fd0Var.f1684e;
            objArr.getClass();
            Object obj2 = objArr[cd0Var.f1421e];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            cd0Var.m927c();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f1685f[r2] = r0;
        r2 = r6;
     */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1088i(int i) {
        this.f1690k++;
        int i2 = 0;
        if (this.f1688i > this.f1691l) {
            m1082c(false);
        }
        this.f1686g = new int[i];
        this.f1689j = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f1688i) {
            int i3 = i2 + 1;
            int iM1087h = m1087h(this.f1683d[i2]);
            int i4 = this.f1687h;
            while (true) {
                int[] iArr = this.f1686g;
                if (iArr[iM1087h] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    C0921xc.m5134o("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iM1087h = iM1087h == 0 ? iArr.length - 1 : iM1087h - 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f1691l == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m1089j(int i) {
        int i2;
        int i3;
        int iM1087h;
        int[] iArr;
        Object[] objArr = this.f1683d;
        objArr.getClass();
        objArr[i] = null;
        Object[] objArr2 = this.f1684e;
        if (objArr2 != null) {
            objArr2[i] = null;
        }
        int length = this.f1685f[i];
        loop0: while (true) {
            int i4 = length;
            int i5 = 0;
            do {
                length = length == 0 ? this.f1686g.length - 1 : length - 1;
                int[] iArr2 = this.f1686g;
                i2 = iArr2[length];
                i5++;
                if (i5 > this.f1687h) {
                    iArr2[i4] = 0;
                    break loop0;
                } else if (i2 == 0) {
                    iArr2[i4] = 0;
                    break loop0;
                } else {
                    i3 = i2 - 1;
                    iM1087h = m1087h(this.f1683d[i3]) - length;
                    iArr = this.f1686g;
                }
            } while ((iM1087h & (iArr.length - 1)) < i5);
            iArr[i4] = i2;
            this.f1685f[i3] = i4;
        }
        this.f1685f[i] = -1;
        this.f1691l--;
        this.f1690k++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        gd0 gd0Var = this.f1692m;
        if (gd0Var != null) {
            return gd0Var;
        }
        gd0 gd0Var2 = new gd0(this, 1);
        this.f1692m = gd0Var2;
        return gd0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m1081b();
        int iM1080a = m1080a(obj);
        Object[] objArr = this.f1684e;
        if (objArr == null) {
            int length = this.f1683d.length;
            if (length < 0) {
                C0921xc.m5131l("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f1684e = objArr;
        }
        if (iM1080a >= 0) {
            objArr[iM1080a] = obj2;
            return null;
        }
        int i = (-iM1080a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        m1081b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m1084e(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM1080a = m1080a(entry.getKey());
            Object[] objArr = this.f1684e;
            if (objArr == null) {
                int length = this.f1683d.length;
                if (length < 0) {
                    C0921xc.m5131l("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f1684e = objArr;
                }
            }
            if (iM1080a >= 0) {
                objArr[iM1080a] = entry.getValue();
            } else {
                int i = (-iM1080a) - 1;
                if (!p30.m3002l(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object remove(Object obj) {
        m1081b();
        int iM1085f = m1085f(obj);
        if (iM1085f < 0) {
            return null;
        }
        Object[] objArr = this.f1684e;
        objArr.getClass();
        Object obj2 = objArr[iM1085f];
        m1089j(iM1085f);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int size() {
        return this.f1691l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f1691l * 3) + 2);
        sb.append("{");
        int i = 0;
        cd0 cd0Var = new cd0(this, 0);
        while (cd0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = cd0Var.f1420d;
            fd0 fd0Var = (fd0) cd0Var.f1423g;
            if (i2 >= fd0Var.f1688i) {
                C0921xc.m5132m();
                return null;
            }
            cd0Var.f1420d = i2 + 1;
            cd0Var.f1421e = i2;
            Object obj = fd0Var.f1683d[i2];
            if (obj == fd0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = fd0Var.f1684e;
            objArr.getClass();
            Object obj2 = objArr[cd0Var.f1421e];
            if (obj2 == fd0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            cd0Var.m927c();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        hd0 hd0Var = this.f1693n;
        if (hd0Var != null) {
            return hd0Var;
        }
        hd0 hd0Var2 = new hd0(0, this);
        this.f1693n = hd0Var2;
        return hd0Var2;
    }
}
