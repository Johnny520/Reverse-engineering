package p000;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: oq */
/* JADX INFO: loaded from: classes.dex */
public final class C2332oq implements Map, Serializable, InterfaceC0631Om {

    /* JADX INFO: renamed from: n */
    public static final C2332oq f8180n;

    /* JADX INFO: renamed from: a */
    public Object[] f8181a;

    /* JADX INFO: renamed from: b */
    public Object[] f8182b;

    /* JADX INFO: renamed from: c */
    public int[] f8183c;

    /* JADX INFO: renamed from: d */
    public int[] f8184d;

    /* JADX INFO: renamed from: e */
    public int f8185e;

    /* JADX INFO: renamed from: f */
    public int f8186f;

    /* JADX INFO: renamed from: g */
    public int f8187g;

    /* JADX INFO: renamed from: h */
    public int f8188h;

    /* JADX INFO: renamed from: i */
    public int f8189i;

    /* JADX INFO: renamed from: j */
    public C2383pq f8190j;

    /* JADX INFO: renamed from: k */
    public C2426qq f8191k;

    /* JADX INFO: renamed from: l */
    public C2383pq f8192l;

    /* JADX INFO: renamed from: m */
    public boolean f8193m;

    static {
        C2332oq c2332oq = new C2332oq(0);
        c2332oq.f8193m = true;
        f8180n = c2332oq;
    }

    public C2332oq(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.f8181a = objArr;
        this.f8182b = null;
        this.f8183c = iArr;
        this.f8184d = new int[iHighestOneBit];
        this.f8185e = 2;
        this.f8186f = 0;
        this.f8187g = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    /* JADX INFO: renamed from: a */
    public final int m4728a(Object obj) {
        m4729b();
        while (true) {
            int iM4733f = m4733f(obj);
            int i = this.f8185e * 2;
            int length = this.f8184d.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.f8184d;
                int i3 = iArr[iM4733f];
                if (i3 <= 0) {
                    int i4 = this.f8186f;
                    Object[] objArr = this.f8181a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.f8186f = i5;
                        objArr[i4] = obj;
                        this.f8183c[i4] = iM4733f;
                        iArr[iM4733f] = i5;
                        this.f8189i++;
                        this.f8188h++;
                        if (i2 > this.f8185e) {
                            this.f8185e = i2;
                        }
                        return i4;
                    }
                    m4731d(1);
                } else {
                    if (AbstractC0585Nj.m1134a(this.f8181a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        m4734g(this.f8184d.length * 2);
                        break;
                    }
                    iM4733f = iM4733f == 0 ? this.f8184d.length - 1 : iM4733f - 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4729b() {
        if (this.f8193m) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m4730c(boolean z) {
        int i;
        Object[] objArr = this.f8182b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f8186f;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.f8183c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.f8181a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.f8184d[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        Object[] objArr3 = this.f8181a;
        for (int i5 = i3; i5 < i; i5++) {
            objArr3[i5] = null;
        }
        if (objArr != null) {
            int i6 = this.f8186f;
            for (int i7 = i3; i7 < i6; i7++) {
                objArr[i7] = null;
            }
        }
        this.f8186f = i3;
    }

    @Override // java.util.Map
    public final void clear() {
        m4729b();
        int i = this.f8186f - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.f8183c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.f8184d[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        Object[] objArr = this.f8181a;
        int i4 = this.f8186f;
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = null;
        }
        Object[] objArr2 = this.f8182b;
        if (objArr2 != null) {
            int i6 = this.f8186f;
            for (int i7 = 0; i7 < i6; i7++) {
                objArr2[i7] = null;
            }
        }
        this.f8189i = 0;
        this.f8186f = 0;
        this.f8188h++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m4732e(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.f8186f;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.f8183c[i2] >= 0 && AbstractC0585Nj.m1134a(this.f8182b[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    /* JADX INFO: renamed from: d */
    public final void m4731d(int i) {
        Object[] objArr = this.f8181a;
        int length = objArr.length;
        int i2 = this.f8186f;
        int i3 = length - i2;
        int i4 = i2 - this.f8189i;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            m4730c(true);
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
            this.f8181a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.f8182b;
            this.f8182b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.f8183c = Arrays.copyOf(this.f8183c, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.f8184d.length) {
                m4734g(iHighestOneBit);
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final int m4732e(Object obj) {
        int iM4733f = m4733f(obj);
        int i = this.f8185e;
        while (true) {
            int i2 = this.f8184d[iM4733f];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (AbstractC0585Nj.m1134a(this.f8181a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM4733f = iM4733f == 0 ? this.f8184d.length - 1 : iM4733f - 1;
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C2383pq c2383pq = this.f8192l;
        if (c2383pq != null) {
            return c2383pq;
        }
        C2383pq c2383pq2 = new C2383pq(this, 0);
        this.f8192l = c2383pq2;
        return c2383pq2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.f8189i == map.size()) {
                    for (Object obj2 : map.entrySet()) {
                        if (obj2 != null) {
                            try {
                                Map.Entry entry = (Map.Entry) obj2;
                                int iM4732e = m4732e(entry.getKey());
                                if (!(iM4732e < 0 ? false : AbstractC0585Nj.m1134a(this.f8182b[iM4732e], entry.getValue()))) {
                                }
                            } catch (ClassCastException unused) {
                            }
                        }
                        z = false;
                    }
                    z = true;
                    if (z) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m4733f(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f8187g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f8183c[r2] = r0;
        r2 = r6;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4734g(int i) {
        this.f8188h++;
        int i2 = 0;
        if (this.f8186f > this.f8189i) {
            m4730c(false);
        }
        this.f8184d = new int[i];
        this.f8187g = Integer.numberOfLeadingZeros(i) + 1;
        while (i2 < this.f8186f) {
            int i3 = i2 + 1;
            int iM4733f = m4733f(this.f8181a[i2]);
            int i4 = this.f8185e;
            while (true) {
                int[] iArr = this.f8184d;
                if (iArr[iM4733f] == 0) {
                    break;
                }
                i4--;
                if (i4 < 0) {
                    throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                }
                iM4733f = iM4733f == 0 ? iArr.length - 1 : iM4733f - 1;
            }
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM4732e = m4732e(obj);
        if (iM4732e < 0) {
            return null;
        }
        return this.f8182b[iM4732e];
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x001f->B:33:?, LOOP_END, SYNTHETIC] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4735h(int i) {
        this.f8181a[i] = null;
        Object[] objArr = this.f8182b;
        if (objArr != null) {
            objArr[i] = null;
        }
        int length = this.f8183c[i];
        int i2 = this.f8185e * 2;
        int length2 = this.f8184d.length / 2;
        if (i2 > length2) {
            i2 = length2;
        }
        int i3 = i2;
        int i4 = 0;
        int i5 = length;
        while (true) {
            length = length == 0 ? this.f8184d.length - 1 : length - 1;
            i4++;
            if (i4 > this.f8185e) {
                this.f8184d[i5] = 0;
                break;
            }
            int[] iArr = this.f8184d;
            int i6 = iArr[length];
            if (i6 == 0) {
                iArr[i5] = 0;
                break;
            }
            if (i6 < 0) {
                iArr[i5] = -1;
            } else {
                int i7 = i6 - 1;
                int iM4733f = m4733f(this.f8181a[i7]) - length;
                int[] iArr2 = this.f8184d;
                if ((iM4733f & (iArr2.length - 1)) >= i4) {
                    iArr2[i5] = i6;
                    this.f8183c[i7] = i5;
                }
                i3--;
                if (i3 >= 0) {
                    this.f8184d[i5] = -1;
                    break;
                }
            }
            i5 = length;
            i4 = 0;
            i3--;
            if (i3 >= 0) {
            }
        }
        this.f8183c[i] = -1;
        this.f8189i--;
        this.f8188h++;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C2203lq c2203lq = new C2203lq(this, 0);
        int i = 0;
        while (c2203lq.hasNext()) {
            int i2 = c2203lq.f8034a;
            C2332oq c2332oq = (C2332oq) c2203lq.f8037d;
            if (i2 >= c2332oq.f8186f) {
                throw new NoSuchElementException();
            }
            c2203lq.f8034a = i2 + 1;
            c2203lq.f8035b = i2;
            Object obj = c2332oq.f8181a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = c2332oq.f8182b[c2203lq.f8035b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c2203lq.m4626e();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f8189i == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C2383pq c2383pq = this.f8190j;
        if (c2383pq != null) {
            return c2383pq;
        }
        C2383pq c2383pq2 = new C2383pq(this, 1);
        this.f8190j = c2383pq2;
        return c2383pq2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m4729b();
        int iM4728a = m4728a(obj);
        Object[] objArr = this.f8182b;
        if (objArr == null) {
            int length = this.f8181a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.");
            }
            objArr = new Object[length];
            this.f8182b = objArr;
        }
        if (iM4728a >= 0) {
            objArr[iM4728a] = obj2;
            return null;
        }
        int i = (-iM4728a) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        m4729b();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m4731d(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM4728a = m4728a(entry.getKey());
            Object[] objArr = this.f8182b;
            if (objArr == null) {
                int length = this.f8181a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.");
                }
                objArr = new Object[length];
                this.f8182b = objArr;
            }
            if (iM4728a >= 0) {
                objArr[iM4728a] = entry.getValue();
            } else {
                int i = (-iM4728a) - 1;
                if (!AbstractC0585Nj.m1134a(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        m4729b();
        int iM4732e = m4732e(obj);
        if (iM4732e < 0) {
            return null;
        }
        Object obj2 = this.f8182b[iM4732e];
        m4735h(iM4732e);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f8189i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.f8189i * 3) + 2);
        sb.append("{");
        int i = 0;
        C2203lq c2203lq = new C2203lq(this, 0);
        while (c2203lq.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = c2203lq.f8034a;
            C2332oq c2332oq = (C2332oq) c2203lq.f8037d;
            if (i2 >= c2332oq.f8186f) {
                throw new NoSuchElementException();
            }
            c2203lq.f8034a = i2 + 1;
            c2203lq.f8035b = i2;
            Object obj = c2332oq.f8181a[i2];
            if (obj == c2332oq) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = c2332oq.f8182b[c2203lq.f8035b];
            if (obj2 == c2332oq) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            c2203lq.m4626e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        C2426qq c2426qq = this.f8191k;
        if (c2426qq != null) {
            return c2426qq;
        }
        C2426qq c2426qq2 = new C2426qq(this);
        this.f8191k = c2426qq2;
        return c2426qq2;
    }
}
