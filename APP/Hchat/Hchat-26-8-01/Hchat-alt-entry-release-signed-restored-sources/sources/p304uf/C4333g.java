package p304uf;

import bsh.C0353j;
import gg.AbstractC1416l;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p114hg.InterfaceC1714d;
import p136j8.C2104o;
import p223p0.C3279g;
import p259r9.AbstractC3754e0;
import tf.AbstractC4159f;
import tf.C4153c;

/* JADX INFO: renamed from: uf.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4333g implements Map, Serializable, InterfaceC1714d {

    /* JADX INFO: renamed from: t */
    public static final C4333g f14476t;

    /* JADX INFO: renamed from: g */
    public Object[] f14477g;

    /* JADX INFO: renamed from: h */
    public Object[] f14478h;

    /* JADX INFO: renamed from: i */
    public int[] f14479i;

    /* JADX INFO: renamed from: j */
    public int[] f14480j;

    /* JADX INFO: renamed from: k */
    public int f14481k;

    /* JADX INFO: renamed from: l */
    public int f14482l;

    /* JADX INFO: renamed from: m */
    public int f14483m;

    /* JADX INFO: renamed from: n */
    public int f14484n;

    /* JADX INFO: renamed from: o */
    public int f14485o;

    /* JADX INFO: renamed from: p */
    public C4334h f14486p;

    /* JADX INFO: renamed from: q */
    public C3279g f14487q;

    /* JADX INFO: renamed from: r */
    public C4334h f14488r;

    /* JADX INFO: renamed from: s */
    public boolean f14489s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        C4333g c4333g = new C4333g(0);
        c4333g.f14489s = true;
        f14476t = c4333g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4333g(int i9) {
        if (i9 < 0) {
            C2104o.m5294t("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i9];
        int[] iArr = new int[i9];
        int iHighestOneBit = Integer.highestOneBit((i9 < 1 ? 1 : i9) * 3);
        this.f14477g = objArr;
        this.f14478h = null;
        this.f14479i = iArr;
        this.f14480j = new int[iHighestOneBit];
        this.f14481k = 2;
        this.f14482l = 0;
        this.f14483m = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final int m8779a(Object obj) {
        m8781d();
        while (true) {
            int iM8787j = m8787j(obj);
            int i9 = this.f14481k * 2;
            int length = this.f14480j.length / 2;
            if (i9 > length) {
                i9 = length;
            }
            int i10 = 0;
            while (true) {
                int[] iArr = this.f14480j;
                int i11 = iArr[iM8787j];
                if (i11 == 0) {
                    int i12 = this.f14482l;
                    Object[] objArr = this.f14477g;
                    if (i12 < objArr.length) {
                        int i13 = i12 + 1;
                        this.f14482l = i13;
                        objArr[i12] = obj;
                        this.f14479i[i12] = iM8787j;
                        iArr[iM8787j] = i13;
                        this.f14485o++;
                        this.f14484n++;
                        if (i10 > this.f14481k) {
                            this.f14481k = i10;
                        }
                        return i12;
                    }
                    m8784g(1);
                } else {
                    if (AbstractC1416l.m3825a(this.f14477g[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > i9) {
                        m8788k(this.f14480j.length * 2);
                        break;
                    }
                    iM8787j = iM8787j == 0 ? this.f14480j.length - 1 : iM8787j - 1;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C4333g m8780c() {
        m8781d();
        this.f14489s = true;
        if (this.f14485o > 0) {
            return this;
        }
        C4333g c4333g = f14476t;
        c4333g.getClass();
        return c4333g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void clear() {
        m8781d();
        int i9 = this.f14482l - 1;
        if (i9 >= 0) {
            int i10 = 0;
            while (true) {
                int[] iArr = this.f14479i;
                int i11 = iArr[i10];
                if (i11 >= 0) {
                    this.f14480j[i11] = 0;
                    iArr[i10] = -1;
                }
                if (i10 == i9) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        AbstractC3754e0.m7891g0(this.f14477g, 0, this.f14482l);
        Object[] objArr = this.f14478h;
        if (objArr != null) {
            AbstractC3754e0.m7891g0(objArr, 0, this.f14482l);
        }
        this.f14485o = 0;
        this.f14482l = 0;
        this.f14484n++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return m8785h(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return m8786i(obj) >= 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m8781d() {
        if (this.f14489s) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m8782e(boolean z9) {
        int i9;
        Object[] objArr = this.f14478h;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            i9 = this.f14482l;
            if (i10 >= i9) {
                break;
            }
            int[] iArr = this.f14479i;
            int i12 = iArr[i10];
            if (i12 >= 0) {
                Object[] objArr2 = this.f14477g;
                objArr2[i11] = objArr2[i10];
                if (objArr != null) {
                    objArr[i11] = objArr[i10];
                }
                if (z9) {
                    iArr[i11] = i12;
                    this.f14480j[i12] = i11 + 1;
                }
                i11++;
            }
            i10++;
        }
        AbstractC3754e0.m7891g0(this.f14477g, i11, i9);
        if (objArr != null) {
            AbstractC3754e0.m7891g0(objArr, i11, this.f14482l);
        }
        this.f14482l = i11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set entrySet() {
        C4334h c4334h = this.f14488r;
        if (c4334h != null) {
            return c4334h;
        }
        C4334h c4334h2 = new C4334h(this, 0);
        this.f14488r = c4334h2;
        return c4334h2;
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
        return this.f14485o == map.size() && m8783f(map.entrySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m8783f(Collection collection) {
        boolean zM3825a;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iM8785h = m8785h(entry.getKey());
                    if (iM8785h < 0) {
                        zM3825a = false;
                    } else {
                        Object[] objArr = this.f14478h;
                        objArr.getClass();
                        zM3825a = AbstractC1416l.m3825a(objArr[iM8785h], entry.getValue());
                    }
                    if (!zM3825a) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m8784g(int i9) {
        Object[] objArr = this.f14477g;
        int length = objArr.length;
        int i10 = this.f14482l;
        int i11 = length - i10;
        int i12 = i10 - this.f14485o;
        if (i11 < i9 && i11 + i12 >= i9 && i12 >= objArr.length / 4) {
            m8782e(true);
            return;
        }
        int i13 = i10 + i9;
        if (i13 < 0) {
            throw new OutOfMemoryError();
        }
        if (i13 > objArr.length) {
            C4153c c4153c = AbstractC4159f.Companion;
            int length2 = objArr.length;
            c4153c.getClass();
            int iM8348d = C4153c.m8348d(length2, i13);
            Object[] objArr2 = this.f14477g;
            objArr2.getClass();
            this.f14477g = Arrays.copyOf(objArr2, iM8348d);
            Object[] objArr3 = this.f14478h;
            this.f14478h = objArr3 != null ? Arrays.copyOf(objArr3, iM8348d) : null;
            this.f14479i = Arrays.copyOf(this.f14479i, iM8348d);
            int iHighestOneBit = Integer.highestOneBit((iM8348d >= 1 ? iM8348d : 1) * 3);
            if (iHighestOneBit > this.f14480j.length) {
                m8788k(iHighestOneBit);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object get(Object obj) {
        int iM8785h = m8785h(obj);
        if (iM8785h < 0) {
            return null;
        }
        Object[] objArr = this.f14478h;
        objArr.getClass();
        return objArr[iM8785h];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m8785h(Object obj) {
        int iM8787j = m8787j(obj);
        int i9 = this.f14481k;
        while (true) {
            int i10 = this.f14480j[iM8787j];
            if (i10 == 0) {
                return -1;
            }
            int i11 = i10 - 1;
            if (AbstractC1416l.m3825a(this.f14477g[i11], obj)) {
                return i11;
            }
            i9--;
            if (i9 < 0) {
                return -1;
            }
            iM8787j = iM8787j == 0 ? this.f14480j.length - 1 : iM8787j - 1;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int hashCode() {
        C4331e c4331e = new C4331e(this, 0);
        int i9 = 0;
        while (c4331e.hasNext()) {
            int i10 = c4331e.f9015g;
            C4333g c4333g = (C4333g) c4331e.f9018j;
            if (i10 >= c4333g.f14482l) {
                C0353j.m1307e();
                return 0;
            }
            c4331e.f9015g = i10 + 1;
            c4331e.f9016h = i10;
            Object obj = c4333g.f14477g[i10];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = c4333g.f14478h;
            objArr.getClass();
            Object obj2 = objArr[c4331e.f9016h];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            c4331e.m6157d();
            i9 += iHashCode ^ iHashCode2;
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m8786i(Object obj) {
        int i9 = this.f14482l;
        while (true) {
            i9--;
            if (i9 < 0) {
                return -1;
            }
            if (this.f14479i[i9] >= 0) {
                Object[] objArr = this.f14478h;
                objArr.getClass();
                if (AbstractC1416l.m3825a(objArr[i9], obj)) {
                    return i9;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f14485o == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final int m8787j(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f14483m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.f14479i[r2] = r0;
        r2 = r6;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m8788k(int i9) {
        this.f14484n++;
        int i10 = 0;
        if (this.f14482l > this.f14485o) {
            m8782e(false);
        }
        this.f14480j = new int[i9];
        this.f14483m = Integer.numberOfLeadingZeros(i9) + 1;
        while (i10 < this.f14482l) {
            int i11 = i10 + 1;
            int iM8787j = m8787j(this.f14477g[i10]);
            int i12 = this.f14481k;
            while (true) {
                int[] iArr = this.f14480j;
                if (iArr[iM8787j] == 0) {
                    break;
                }
                i12--;
                if (i12 < 0) {
                    C2104o.m5276A("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                    return;
                }
                iM8787j = iM8787j == 0 ? iArr.length - 1 : iM8787j - 1;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Set keySet() {
        C4334h c4334h = this.f14486p;
        if (c4334h != null) {
            return c4334h;
        }
        C4334h c4334h2 = new C4334h(this, 1);
        this.f14486p = c4334h2;
        return c4334h2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m8789l(int i9) {
        int i10;
        int i11;
        int iM8787j;
        int[] iArr;
        Object[] objArr = this.f14477g;
        objArr.getClass();
        objArr[i9] = null;
        Object[] objArr2 = this.f14478h;
        if (objArr2 != null) {
            objArr2[i9] = null;
        }
        int length = this.f14479i[i9];
        loop0: while (true) {
            int i12 = length;
            int i13 = 0;
            do {
                length = length == 0 ? this.f14480j.length - 1 : length - 1;
                int[] iArr2 = this.f14480j;
                i10 = iArr2[length];
                i13++;
                if (i13 > this.f14481k) {
                    iArr2[i12] = 0;
                    break loop0;
                } else if (i10 == 0) {
                    iArr2[i12] = 0;
                    break loop0;
                } else {
                    i11 = i10 - 1;
                    iM8787j = m8787j(this.f14477g[i11]) - length;
                    iArr = this.f14480j;
                }
            } while ((iM8787j & (iArr.length - 1)) < i13);
            iArr[i12] = i10;
            this.f14479i[i11] = i12;
        }
        this.f14479i[i9] = -1;
        this.f14485o--;
        this.f14484n++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        m8781d();
        int iM8779a = m8779a(obj);
        Object[] objArr = this.f14478h;
        if (objArr == null) {
            int length = this.f14477g.length;
            if (length < 0) {
                C2104o.m5294t("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.f14478h = objArr;
        }
        if (iM8779a >= 0) {
            objArr[iM8779a] = obj2;
            return null;
        }
        int i9 = (-iM8779a) - 1;
        Object obj3 = objArr[i9];
        objArr[i9] = obj2;
        return obj3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        m8781d();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        m8784g(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iM8779a = m8779a(entry.getKey());
            Object[] objArr = this.f14478h;
            if (objArr == null) {
                int length = this.f14477g.length;
                if (length < 0) {
                    C2104o.m5294t("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.f14478h = objArr;
                }
            }
            if (iM8779a >= 0) {
                objArr[iM8779a] = entry.getValue();
            } else {
                int i9 = (-iM8779a) - 1;
                if (!AbstractC1416l.m3825a(entry.getValue(), objArr[i9])) {
                    objArr[i9] = entry.getValue();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Object remove(Object obj) {
        m8781d();
        int iM8785h = m8785h(obj);
        if (iM8785h < 0) {
            return null;
        }
        Object[] objArr = this.f14478h;
        objArr.getClass();
        Object obj2 = objArr[iM8785h];
        m8789l(iM8785h);
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final int size() {
        return this.f14485o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder((this.f14485o * 3) + 2);
        sb2.append("{");
        int i9 = 0;
        C4331e c4331e = new C4331e(this, 0);
        while (c4331e.hasNext()) {
            if (i9 > 0) {
                sb2.append(", ");
            }
            int i10 = c4331e.f9015g;
            C4333g c4333g = (C4333g) c4331e.f9018j;
            if (i10 >= c4333g.f14482l) {
                C0353j.m1307e();
                return null;
            }
            c4331e.f9015g = i10 + 1;
            c4331e.f9016h = i10;
            Object obj = c4333g.f14477g[i10];
            if (obj == c4333g) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = c4333g.f14478h;
            objArr.getClass();
            Object obj2 = objArr[c4331e.f9016h];
            if (obj2 == c4333g) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            c4331e.m6157d();
            i9++;
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Map
    public final Collection values() {
        C3279g c3279g = this.f14487q;
        if (c3279g != null) {
            return c3279g;
        }
        C3279g c3279g2 = new C3279g(this, 1);
        this.f14487q = c3279g2;
        return c3279g2;
    }

    public C4333g() {
        this(8);
    }
}
