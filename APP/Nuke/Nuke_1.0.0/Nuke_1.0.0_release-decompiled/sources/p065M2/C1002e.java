package p065M2;

import com.bumptech.glide.AbstractC1924f;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p117X2.AbstractC1665j;
import p122Y2.InterfaceC1768c;

/* JADX INFO: renamed from: M2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1002e implements Map, Serializable, InterfaceC1768c {

    /* JADX INFO: renamed from: q */
    public static final C1002e f3099q;

    /* JADX INFO: renamed from: d */
    public Object[] f3100d;

    /* JADX INFO: renamed from: e */
    public Object[] f3101e;

    /* JADX INFO: renamed from: f */
    public int[] f3102f;

    /* JADX INFO: renamed from: g */
    public int[] f3103g;

    /* JADX INFO: renamed from: h */
    public int f3104h;

    /* JADX INFO: renamed from: i */
    public int f3105i;

    /* JADX INFO: renamed from: j */
    public int f3106j;

    /* JADX INFO: renamed from: k */
    public int f3107k;

    /* JADX INFO: renamed from: l */
    public int f3108l;

    /* JADX INFO: renamed from: m */
    public C1003f f3109m;

    /* JADX INFO: renamed from: n */
    public C1004g f3110n;

    /* JADX INFO: renamed from: o */
    public C1003f f3111o;

    /* JADX INFO: renamed from: p */
    public boolean f3112p;

    static {
        C1002e c1002e = new C1002e(0);
        c1002e.f3112p = true;
        f3099q = c1002e;
    }

    public C1002e(int i5) {
        if (i5 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i5];
        int[] iArr = new int[i5];
        int iHighestOneBit = Integer.highestOneBit((i5 < 1 ? 1 : i5) * 3);
        this.f3100d = objArr;
        this.f3101e = null;
        this.f3102f = iArr;
        this.f3103g = new int[iHighestOneBit];
        this.f3104h = 2;
        this.f3105i = 0;
        this.f3106j = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m2068a(Object obj) {
        m2069b();
        while (true) {
            int iM2076i = m2076i(obj);
            int i5 = this.f3104h * 2;
            int length = this.f3103g.length / 2;
            if (i5 > length) {
                i5 = length;
            }
            int i6 = 0;
            while (true) {
                int[] iArr = this.f3103g;
                int i7 = iArr[iM2076i];
                if (i7 == 0) {
                    int i8 = this.f3105i;
                    Object[] objArr = this.f3100d;
                    if (i8 < objArr.length) {
                        int i9 = i8 + 1;
                        this.f3105i = i9;
                        objArr[i8] = obj;
                        this.f3102f[i8] = iM2076i;
                        iArr[iM2076i] = i9;
                        this.f3108l++;
                        this.f3107k++;
                        if (i6 > this.f3104h) {
                            this.f3104h = i6;
                        }
                        return i8;
                    }
                    m2073f(1);
                } else {
                    if (AbstractC1665j.m2981a(this.f3100d[i7 - 1], obj)) {
                        return -i7;
                    }
                    i6++;
                    if (i6 > i5) {
                        m2077j(this.f3103g.length * 2);
                        break;
                    }
                    iM2076i = iM2076i == 0 ? this.f3103g.length - 1 : iM2076i - 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m2069b() {
        if (this.f3112p) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2070c(boolean z5) {
        int i5;
        Object[] objArr = this.f3101e;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i5 = this.f3105i;
            if (i6 >= i5) {
                break;
            }
            int[] iArr = this.f3102f;
            int i8 = iArr[i6];
            if (i8 >= 0) {
                Object[] objArr2 = this.f3100d;
                objArr2[i7] = objArr2[i6];
                if (objArr != null) {
                    objArr[i7] = objArr[i6];
                }
                if (z5) {
                    iArr[i7] = i8;
                    this.f3103g[i8] = i7 + 1;
                }
                i7++;
            }
            i6++;
        }
        AbstractC1924f.m3506t(this.f3100d, i7, i5);
        if (objArr != null) {
            AbstractC1924f.m3506t(objArr, i7, this.f3105i);
        }
        this.f3105i = i7;
    }

    @Override // java.util.Map
    public final void clear() {
        m2069b();
        int i5 = this.f3105i - 1;
        if (i5 >= 0) {
            int i6 = 0;
            while (true) {
                int[] iArr = this.f3102f;
                int i7 = iArr[i6];
                if (i7 >= 0) {
                    this.f3103g[i7] = 0;
                    iArr[i6] = -1;
                }
                if (i6 == i5) {
                    break;
                } else {
                    i6++;
                }
            }
        }
        AbstractC1924f.m3506t(this.f3100d, 0, this.f3105i);
        Object[] objArr = this.f3101e;
        if (objArr != null) {
            AbstractC1924f.m3506t(objArr, 0, this.f3105i);
        }
        this.f3108l = 0;
        this.f3105i = 0;
        this.f3107k++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m2074g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m2075h(obj) >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2071d(Collection collection) {
        AbstractC1665j.m2985e(collection, "m");
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m2072e((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2072e(Map.Entry entry) {
        AbstractC1665j.m2985e(entry, "entry");
        int iM2074g = m2074g(entry.getKey());
        if (iM2074g < 0) {
            return false;
        }
        Object[] objArr = this.f3101e;
        AbstractC1665j.m2982b(objArr);
        return AbstractC1665j.m2981a(objArr[iM2074g], entry.getValue());
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C1003f c1003f = this.f3111o;
        if (c1003f != null) {
            return c1003f;
        }
        C1003f c1003f2 = new C1003f(this, 0);
        this.f3111o = c1003f2;
        return c1003f2;
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
        return this.f3108l == map.size() && m2071d(map.entrySet());
    }

    /* JADX INFO: renamed from: f */
    public final void m2073f(int i5) {
        Object[] objArrCopyOf;
        Object[] objArr = this.f3100d;
        int length = objArr.length;
        int i6 = this.f3105i;
        int i7 = length - i6;
        int i8 = i6 - this.f3108l;
        if (i7 < i5 && i7 + i8 >= i5 && i8 >= objArr.length / 4) {
            m2070c(true);
            return;
        }
        int i9 = i6 + i5;
        if (i9 < 0) {
            throw new OutOfMemoryError();
        }
        if (i9 > objArr.length) {
            int length2 = objArr.length;
            int i10 = length2 + (length2 >> 1);
            if (i10 - i9 < 0) {
                i10 = i9;
            }
            if (i10 - 2147483639 > 0) {
                i10 = i9 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i10);
            AbstractC1665j.m2984d(objArrCopyOf2, "copyOf(...)");
            this.f3100d = objArrCopyOf2;
            Object[] objArr2 = this.f3101e;
            if (objArr2 != null) {
                objArrCopyOf = Arrays.copyOf(objArr2, i10);
                AbstractC1665j.m2984d(objArrCopyOf, "copyOf(...)");
            } else {
                objArrCopyOf = null;
            }
            this.f3101e = objArrCopyOf;
            int[] iArrCopyOf = Arrays.copyOf(this.f3102f, i10);
            AbstractC1665j.m2984d(iArrCopyOf, "copyOf(...)");
            this.f3102f = iArrCopyOf;
            int iHighestOneBit = Integer.highestOneBit((i10 >= 1 ? i10 : 1) * 3);
            if (iHighestOneBit > this.f3103g.length) {
                m2077j(iHighestOneBit);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final int m2074g(Object obj) {
        int iM2076i = m2076i(obj);
        int i5 = this.f3104h;
        while (true) {
            int i6 = this.f3103g[iM2076i];
            if (i6 == 0) {
                return -1;
            }
            int i7 = i6 - 1;
            if (AbstractC1665j.m2981a(this.f3100d[i7], obj)) {
                return i7;
            }
            i5--;
            if (i5 < 0) {
                return -1;
            }
            iM2076i = iM2076i == 0 ? this.f3103g.length - 1 : iM2076i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM2074g = m2074g(obj);
        if (iM2074g < 0) {
            return null;
        }
        Object[] objArr = this.f3101e;
        AbstractC1665j.m2982b(objArr);
        return objArr[iM2074g];
    }

    /* JADX INFO: renamed from: h */
    public final int m2075h(Object obj) {
        int i5 = this.f3105i;
        while (true) {
            i5--;
            if (i5 < 0) {
                return -1;
            }
            if (this.f3102f[i5] >= 0) {
                Object[] objArr = this.f3101e;
                AbstractC1665j.m2982b(objArr);
                if (AbstractC1665j.m2981a(objArr[i5], obj)) {
                    return i5;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1000c c1000c = new C1000c(this, 0);
        int i5 = 0;
        while (c1000c.hasNext()) {
            int i6 = c1000c.f3092e;
            C1002e c1002e = c1000c.f3091d;
            if (i6 >= c1002e.f3105i) {
                throw new NoSuchElementException();
            }
            c1000c.f3092e = i6 + 1;
            c1000c.f3093f = i6;
            Object obj = c1002e.f3100d[i6];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c1002e.f3101e;
            AbstractC1665j.m2982b(objArr);
            Object obj2 = objArr[c1000c.f3093f];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c1000c.m2066b();
            i5 += iHashCode ^ iHashCode2;
        }
        return i5;
    }

    /* JADX INFO: renamed from: i */
    public final int m2076i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f3106j;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3108l == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f3102f[r2] = r0;
        r2 = r6;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2077j(int r6) {
        /*
            r5 = this;
            int r0 = r5.f3107k
            int r0 = r0 + 1
            r5.f3107k = r0
            int r0 = r5.f3105i
            int r1 = r5.f3108l
            r2 = 0
            if (r0 <= r1) goto L10
            r5.m2070c(r2)
        L10:
            int[] r0 = new int[r6]
            r5.f3103g = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.f3106j = r6
        L1c:
            int r6 = r5.f3105i
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.f3100d
            r0 = r0[r2]
            int r0 = r5.m2076i(r0)
            int r1 = r5.f3104h
        L2c:
            int[] r3 = r5.f3103g
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.f3102f
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r6.<init>(r0)
            throw r6
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p065M2.C1002e.m2077j(int):void");
    }

    /* JADX INFO: renamed from: k */
    public final void m2078k(int i5) {
        int i6;
        int i7;
        int iM2076i;
        int[] iArr;
        Object[] objArr = this.f3100d;
        AbstractC1665j.m2985e(objArr, "<this>");
        objArr[i5] = null;
        Object[] objArr2 = this.f3101e;
        if (objArr2 != null) {
            objArr2[i5] = null;
        }
        int length = this.f3102f[i5];
        loop0: while (true) {
            int i8 = length;
            int i9 = 0;
            do {
                length = length == 0 ? this.f3103g.length - 1 : length - 1;
                int[] iArr2 = this.f3103g;
                i6 = iArr2[length];
                i9++;
                if (i9 > this.f3104h) {
                    iArr2[i8] = 0;
                    break loop0;
                } else if (i6 == 0) {
                    iArr2[i8] = 0;
                    break loop0;
                } else {
                    i7 = i6 - 1;
                    iM2076i = m2076i(this.f3100d[i7]) - length;
                    iArr = this.f3103g;
                }
            } while ((iM2076i & (iArr.length - 1)) < i9);
            iArr[i8] = i6;
            this.f3102f[i7] = i8;
        }
        this.f3102f[i5] = -1;
        this.f3108l--;
        this.f3107k++;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C1003f c1003f = this.f3109m;
        if (c1003f != null) {
            return c1003f;
        }
        C1003f c1003f2 = new C1003f(this, 1);
        this.f3109m = c1003f2;
        return c1003f2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m2069b();
        int iM2068a = m2068a(obj);
        Object[] objArr = this.f3101e;
        if (objArr == null) {
            int length = this.f3100d.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f3101e = objArr;
        }
        if (iM2068a >= 0) {
            objArr[iM2068a] = obj2;
            return null;
        }
        int i5 = (-iM2068a) - 1;
        Object obj3 = objArr[i5];
        objArr[i5] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        AbstractC1665j.m2985e(map, "from");
        m2069b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m2073f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM2068a = m2068a(entry.getKey());
            Object[] objArr = this.f3101e;
            if (objArr == null) {
                int length = this.f3100d.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f3101e = objArr;
            }
            if (iM2068a >= 0) {
                objArr[iM2068a] = entry.getValue();
            } else {
                int i5 = (-iM2068a) - 1;
                if (!AbstractC1665j.m2981a(entry.getValue(), objArr[i5])) {
                    objArr[i5] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m2069b();
        int iM2074g = m2074g(obj);
        if (iM2074g < 0) {
            return null;
        }
        Object[] objArr = this.f3101e;
        AbstractC1665j.m2982b(objArr);
        Object obj2 = objArr[iM2074g];
        m2078k(iM2074g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3108l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f3108l * 3) + 2);
        sb.append("{");
        int i5 = 0;
        C1000c c1000c = new C1000c(this, 0);
        while (c1000c.hasNext()) {
            if (i5 > 0) {
                sb.append(", ");
            }
            int i6 = c1000c.f3092e;
            C1002e c1002e = c1000c.f3091d;
            if (i6 >= c1002e.f3105i) {
                throw new NoSuchElementException();
            }
            c1000c.f3092e = i6 + 1;
            c1000c.f3093f = i6;
            Object obj = c1002e.f3100d[i6];
            if (obj == c1002e) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = c1002e.f3101e;
            AbstractC1665j.m2982b(objArr);
            Object obj2 = objArr[c1000c.f3093f];
            if (obj2 == c1002e) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c1000c.m2066b();
            i5++;
        }
        sb.append("}");
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }

    @Override // java.util.Map
    public final Collection values() {
        C1004g c1004g = this.f3110n;
        if (c1004g != null) {
            return c1004g;
        }
        C1004g c1004g2 = new C1004g(0, this);
        this.f3110n = c1004g2;
        return c1004g2;
    }
}
