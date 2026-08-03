package p069f;

import gg.AbstractC1416l;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p068eh.AbstractC0921a;
import p087g.AbstractC1256a;
import p134j6.C2074l;
import p136j8.C2104o;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0930e implements Map {

    /* JADX INFO: renamed from: g */
    public int[] f2910g = AbstractC1256a.f4113a;

    /* JADX INFO: renamed from: h */
    public Object[] f2911h = AbstractC1256a.f4115c;

    /* JADX INFO: renamed from: i */
    public int f2912i;

    /* JADX INFO: renamed from: j */
    public C2074l f2913j;

    /* JADX INFO: renamed from: k */
    public C0924b f2914k;

    /* JADX INFO: renamed from: l */
    public C0928d f2915l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m2274a(Object obj) {
        int i9 = this.f2912i * 2;
        Object[] objArr = this.f2911h;
        if (obj == null) {
            for (int i10 = 1; i10 < i9; i10 += 2) {
                if (objArr[i10] == null) {
                    return i10 >> 1;
                }
            }
            return -1;
        }
        for (int i11 = 1; i11 < i9; i11 += 2) {
            if (obj.equals(objArr[i11])) {
                return i11 >> 1;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m2275c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void clear() {
        if (this.f2912i > 0) {
            this.f2910g = AbstractC1256a.f4113a;
            this.f2911h = AbstractC1256a.f4115c;
            this.f2912i = 0;
        }
        if (this.f2912i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m2274a(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: containsKey(Ljava/lang/Object;)Z */
    @Override // java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        return m2278f(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final int m2277e(int i9, Object obj) {
        int i10 = this.f2912i;
        if (i10 == 0) {
            return -1;
        }
        int iM3379a = AbstractC1256a.m3379a(this.f2910g, i10, i9);
        if (iM3379a < 0 || AbstractC1416l.m3825a(obj, this.f2911h[iM3379a << 1])) {
            return iM3379a;
        }
        int i11 = iM3379a + 1;
        while (i11 < i10 && this.f2910g[i11] == i9) {
            if (AbstractC1416l.m3825a(obj, this.f2911h[i11 << 1])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iM3379a - 1; i12 >= 0 && this.f2910g[i12] == i9; i12--) {
            if (AbstractC1416l.m3825a(obj, this.f2911h[i12 << 1])) {
                return i12;
            }
        }
        return ~i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        C2074l c2074l = this.f2913j;
        if (c2074l != null) {
            return c2074l;
        }
        C2074l c2074l2 = new C2074l(this, 2);
        this.f2913j = c2074l2;
        return c2074l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof C0930e) {
                int i9 = this.f2912i;
                if (i9 != ((C0930e) obj).f2912i) {
                    return false;
                }
                C0930e c0930e = (C0930e) obj;
                for (int i10 = 0; i10 < i9; i10++) {
                    Object objM2280h = m2280h(i10);
                    Object objM2284l = m2284l(i10);
                    Object obj2 = c0930e.get(objM2280h);
                    if (objM2284l == null) {
                        if (obj2 != null || !c0930e.containsKey(objM2280h)) {
                            return false;
                        }
                    } else if (!objM2284l.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f2912i != ((Map) obj).size()) {
                return false;
            }
            int i11 = this.f2912i;
            for (int i12 = 0; i12 < i11; i12++) {
                Object objM2280h2 = m2280h(i12);
                Object objM2284l2 = m2284l(i12);
                Object obj3 = ((Map) obj).get(objM2280h2);
                if (objM2284l2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objM2280h2)) {
                        return false;
                    }
                } else if (!objM2284l2.equals(obj3)) {
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
    public final int m2278f(Object obj) {
        return obj == null ? m2279g() : m2277e(obj.hashCode(), obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m2279g() {
        int i9 = this.f2912i;
        if (i9 == 0) {
            return -1;
        }
        int iM3379a = AbstractC1256a.m3379a(this.f2910g, i9, 0);
        if (iM3379a < 0 || this.f2911h[iM3379a << 1] == null) {
            return iM3379a;
        }
        int i10 = iM3379a + 1;
        while (i10 < i9 && this.f2910g[i10] == 0) {
            if (this.f2911h[i10 << 1] == null) {
                return i10;
            }
            i10++;
        }
        for (int i11 = iM3379a - 1; i11 >= 0 && this.f2910g[i11] == 0; i11--) {
            if (this.f2911h[i11 << 1] == null) {
                return i11;
            }
        }
        return ~i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public Object get(Object obj) {
        int iM2278f = m2278f(obj);
        if (iM2278f >= 0) {
            return this.f2911h[(iM2278f << 1) + 1];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        int iM2278f = m2278f(obj);
        return iM2278f >= 0 ? this.f2911h[(iM2278f << 1) + 1] : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final Object m2280h(int i9) {
        if (i9 >= 0 && i9 < this.f2912i) {
            return this.f2911h[i9 << 1];
        }
        C2104o.m5294t(AbstractC0921a.m2249l(i9, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int hashCode() {
        int[] iArr = this.f2910g;
        Object[] objArr = this.f2911h;
        int i9 = this.f2912i;
        int i10 = 1;
        int i11 = 0;
        int iHashCode = 0;
        while (i11 < i9) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i11];
            i11++;
            i10 += 2;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        int iM2278f = m2278f(obj);
        if (iM2278f >= 0) {
            return m2282j(iM2278f);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f2912i <= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Object m2282j(int i9) {
        int i10;
        if (i9 < 0 || i9 >= (i10 = this.f2912i)) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        Object[] objArr = this.f2911h;
        int i11 = i9 << 1;
        Object obj = objArr[i11 + 1];
        if (i10 <= 1) {
            clear();
            return obj;
        }
        int i12 = i10 - 1;
        int[] iArr = this.f2910g;
        if (iArr.length <= 8 || i10 >= iArr.length / 3) {
            if (i9 < i12) {
                int i13 = i9 + 1;
                AbstractC4165l.m8381p0(iArr, iArr, i9, i13, i10);
                Object[] objArr2 = this.f2911h;
                AbstractC4165l.m8379n0(i11, i13 << 1, objArr2, i10 << 1, objArr2);
            }
            Object[] objArr3 = this.f2911h;
            int i14 = i12 << 1;
            objArr3[i14] = null;
            objArr3[i14 + 1] = null;
        } else {
            int i15 = i10 > 8 ? i10 + (i10 >> 1) : 8;
            this.f2910g = Arrays.copyOf(iArr, i15);
            this.f2911h = Arrays.copyOf(this.f2911h, i15 << 1);
            if (i10 != this.f2912i) {
                throw new ConcurrentModificationException();
            }
            if (i9 > 0) {
                AbstractC4165l.m8381p0(iArr, this.f2910g, 0, 0, i9);
                AbstractC4165l.m8379n0(0, 0, objArr, i11, this.f2911h);
            }
            if (i9 < i12) {
                int i16 = i9 + 1;
                AbstractC4165l.m8381p0(iArr, this.f2910g, i9, i16, i10);
                AbstractC4165l.m8379n0(i11, i16 << 1, objArr, i10 << 1, this.f2911h);
            }
        }
        if (i10 != this.f2912i) {
            throw new ConcurrentModificationException();
        }
        this.f2912i = i12;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m2283k(int i9, Object obj) {
        if (i9 < 0 || i9 >= this.f2912i) {
            C2104o.m5294t(AbstractC0921a.m2249l(i9, "Expected index to be within 0..size()-1, but was "));
            return null;
        }
        int i10 = (i9 << 1) + 1;
        Object[] objArr = this.f2911h;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        C0924b c0924b = this.f2914k;
        if (c0924b != null) {
            return c0924b;
        }
        C0924b c0924b2 = new C0924b(this);
        this.f2914k = c0924b2;
        return c0924b2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Object m2284l(int i9) {
        if (i9 >= 0 && i9 < this.f2912i) {
            return this.f2911h[(i9 << 1) + 1];
        }
        C2104o.m5294t(AbstractC0921a.m2249l(i9, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        int i9 = this.f2912i;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iM2277e = obj != null ? m2277e(iHashCode, obj) : m2279g();
        if (iM2277e >= 0) {
            int i10 = (iM2277e << 1) + 1;
            Object[] objArr = this.f2911h;
            Object obj3 = objArr[i10];
            objArr[i10] = obj2;
            return obj3;
        }
        int i11 = ~iM2277e;
        int[] iArr = this.f2910g;
        if (i9 >= iArr.length) {
            int i12 = 8;
            if (i9 >= 8) {
                i12 = (i9 >> 1) + i9;
            } else if (i9 < 4) {
                i12 = 4;
            }
            this.f2910g = Arrays.copyOf(iArr, i12);
            this.f2911h = Arrays.copyOf(this.f2911h, i12 << 1);
            if (i9 != this.f2912i) {
                throw new ConcurrentModificationException();
            }
        }
        if (i11 < i9) {
            int[] iArr2 = this.f2910g;
            int i13 = i11 + 1;
            AbstractC4165l.m8381p0(iArr2, iArr2, i13, i11, i9);
            Object[] objArr2 = this.f2911h;
            AbstractC4165l.m8379n0(i13 << 1, i11 << 1, objArr2, this.f2912i << 1, objArr2);
        }
        int i14 = this.f2912i;
        if (i9 == i14) {
            int[] iArr3 = this.f2910g;
            if (i11 < iArr3.length) {
                iArr3[i11] = iHashCode;
                Object[] objArr3 = this.f2911h;
                int i15 = i11 << 1;
                objArr3[i15] = obj;
                objArr3[i15 + 1] = obj2;
                this.f2912i = i14 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f2912i;
        int i9 = this.f2912i;
        int[] iArr = this.f2910g;
        if (iArr.length < size) {
            this.f2910g = Arrays.copyOf(iArr, size);
            this.f2911h = Arrays.copyOf(this.f2911h, size * 2);
        }
        if (this.f2912i != i9) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int iM2278f = m2278f(obj);
        if (iM2278f < 0 || !AbstractC1416l.m3825a(obj2, m2284l(iM2278f))) {
            return false;
        }
        m2282j(iM2278f);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iM2278f = m2278f(obj);
        if (iM2278f < 0 || !AbstractC1416l.m3825a(obj2, m2284l(iM2278f))) {
            return false;
        }
        m2283k(iM2278f, obj3);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int size() {
        return this.f2912i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f2912i * 28);
        sb2.append('{');
        int i9 = this.f2912i;
        for (int i10 = 0; i10 < i9; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objM2280h = m2280h(i10);
            if (objM2280h != sb2) {
                sb2.append(objM2280h);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object objM2284l = m2284l(i10);
            if (objM2284l != sb2) {
                sb2.append(objM2284l);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        C0928d c0928d = this.f2915l;
        if (c0928d != null) {
            return c0928d;
        }
        C0928d c0928d2 = new C0928d(this);
        this.f2915l = c0928d2;
        return c0928d2;
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        int iM2278f = m2278f(obj);
        if (iM2278f >= 0) {
            return m2283k(iM2278f, obj2);
        }
        return null;
    }
}
