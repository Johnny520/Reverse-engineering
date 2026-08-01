package p198n8;

import bsh.C1189h4;
import java.io.InvalidObjectException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p036c9.InterfaceC1400a;
import p036c9.InterfaceC1404e;
import p080f9.AbstractC2368o;
import p117i.C3039b;
import p185m8.AbstractC5078f;
import p319w2.C9079i0;
import p376zd.C10010p0;

/* JADX INFO: renamed from: n8.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5511d implements Map, Serializable, InterfaceC1404e {

    /* JADX INFO: renamed from: D */
    public static final a f17213D = new a(null);

    /* JADX INFO: renamed from: E */
    public static final C5511d f17214E;

    /* JADX INFO: renamed from: A */
    public C5514g f17215A;

    /* JADX INFO: renamed from: B */
    public C5512e f17216B;

    /* JADX INFO: renamed from: C */
    public boolean f17217C;

    /* JADX INFO: renamed from: q */
    public Object[] f17218q;

    /* JADX INFO: renamed from: r */
    public Object[] f17219r;

    /* JADX INFO: renamed from: s */
    public int[] f17220s;

    /* JADX INFO: renamed from: t */
    public int[] f17221t;

    /* JADX INFO: renamed from: u */
    public int f17222u;

    /* JADX INFO: renamed from: v */
    public int f17223v;

    /* JADX INFO: renamed from: w */
    public int f17224w;

    /* JADX INFO: renamed from: x */
    public int f17225x;

    /* JADX INFO: renamed from: y */
    public int f17226y;

    /* JADX INFO: renamed from: z */
    public C5513f f17227z;

    /* JADX INFO: renamed from: n8.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends d implements Iterator, InterfaceC1400a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C5511d c5511d) {
            super(c5511d);
            c5511d.getClass();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public c next() {
            m22478g();
            if (m22479l() >= m22481v().f17223v) {
                C1189h4.m4429a();
                return null;
            }
            int iM22479l = m22479l();
            m22483y(iM22479l + 1);
            m22484z(iM22479l);
            c cVar = new c(m22481v(), m22480o());
            m22482x();
            return cVar;
        }

        /* JADX INFO: renamed from: B */
        public final void m22475B(StringBuilder sb2) {
            sb2.getClass();
            if (m22479l() >= m22481v().f17223v) {
                C1189h4.m4429a();
                return;
            }
            int iM22479l = m22479l();
            m22483y(iM22479l + 1);
            m22484z(iM22479l);
            Object obj = m22481v().f17218q[m22480o()];
            if (obj == m22481v()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj);
            }
            sb2.append('=');
            Object[] objArr = m22481v().f17219r;
            objArr.getClass();
            Object obj2 = objArr[m22480o()];
            if (obj2 == m22481v()) {
                sb2.append("(this Map)");
            } else {
                sb2.append(obj2);
            }
            m22482x();
        }

        /* JADX INFO: renamed from: C */
        public final int m22476C() {
            if (m22479l() >= m22481v().f17223v) {
                C1189h4.m4429a();
                return 0;
            }
            int iM22479l = m22479l();
            m22483y(iM22479l + 1);
            m22484z(iM22479l);
            Object obj = m22481v().f17218q[m22480o()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = m22481v().f17219r;
            objArr.getClass();
            Object obj2 = objArr[m22480o()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m22482x();
            return iHashCode2;
        }
    }

    /* JADX INFO: renamed from: n8.d$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements Map.Entry, InterfaceC1404e.a {

        /* JADX INFO: renamed from: q */
        public final C5511d f17228q;

        /* JADX INFO: renamed from: r */
        public final int f17229r;

        /* JADX INFO: renamed from: s */
        public final int f17230s;

        public c(C5511d c5511d, int i10) {
            c5511d.getClass();
            this.f17228q = c5511d;
            this.f17229r = i10;
            this.f17230s = c5511d.f17225x;
        }

        /* JADX INFO: renamed from: a */
        private final void m22477a() {
            if (this.f17228q.f17225x != this.f17230s) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC1061t.m3842c(entry.getKey(), getKey()) && AbstractC1061t.m3842c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            m22477a();
            return this.f17228q.f17218q[this.f17229r];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            m22477a();
            Object[] objArr = this.f17228q.f17219r;
            objArr.getClass();
            return objArr[this.f17229r];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            m22477a();
            this.f17228q.m22462r();
            Object[] objArrM22460p = this.f17228q.m22460p();
            int i10 = this.f17229r;
            Object obj2 = objArrM22460p[i10];
            objArrM22460p[i10] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getKey());
            sb2.append('=');
            sb2.append(getValue());
            return sb2.toString();
        }
    }

    /* JADX INFO: renamed from: n8.d$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class d {

        /* JADX INFO: renamed from: q */
        public final C5511d f17231q;

        /* JADX INFO: renamed from: r */
        public int f17232r;

        /* JADX INFO: renamed from: s */
        public int f17233s;

        /* JADX INFO: renamed from: t */
        public int f17234t;

        public d(C5511d c5511d) {
            c5511d.getClass();
            this.f17231q = c5511d;
            this.f17233s = -1;
            this.f17234t = c5511d.f17225x;
            m22482x();
        }

        /* JADX INFO: renamed from: g */
        public final void m22478g() {
            if (this.f17231q.f17225x == this.f17234t) {
                return;
            }
            C3039b.m11232a();
        }

        public final boolean hasNext() {
            return this.f17232r < this.f17231q.f17223v;
        }

        /* JADX INFO: renamed from: l */
        public final int m22479l() {
            return this.f17232r;
        }

        /* JADX INFO: renamed from: o */
        public final int m22480o() {
            return this.f17233s;
        }

        public final void remove() {
            m22478g();
            if (this.f17233s == -1) {
                C10010p0.m38820a("Call next() before removing element from the iterator.");
                return;
            }
            this.f17231q.m22462r();
            this.f17231q.m22453Q(this.f17233s);
            this.f17233s = -1;
            this.f17234t = this.f17231q.f17225x;
        }

        /* JADX INFO: renamed from: v */
        public final C5511d m22481v() {
            return this.f17231q;
        }

        /* JADX INFO: renamed from: x */
        public final void m22482x() {
            while (this.f17232r < this.f17231q.f17223v) {
                int[] iArr = this.f17231q.f17220s;
                int i10 = this.f17232r;
                if (iArr[i10] >= 0) {
                    return;
                } else {
                    this.f17232r = i10 + 1;
                }
            }
        }

        /* JADX INFO: renamed from: y */
        public final void m22483y(int i10) {
            this.f17232r = i10;
        }

        /* JADX INFO: renamed from: z */
        public final void m22484z(int i10) {
            this.f17233s = i10;
        }
    }

    /* JADX INFO: renamed from: n8.d$e */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class e extends d implements Iterator, InterfaceC1400a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C5511d c5511d) {
            super(c5511d);
            c5511d.getClass();
        }

        @Override // java.util.Iterator
        public Object next() {
            m22478g();
            if (m22479l() >= m22481v().f17223v) {
                C1189h4.m4429a();
                return null;
            }
            int iM22479l = m22479l();
            m22483y(iM22479l + 1);
            m22484z(iM22479l);
            Object obj = m22481v().f17218q[m22480o()];
            m22482x();
            return obj;
        }
    }

    /* JADX INFO: renamed from: n8.d$f */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class f extends d implements Iterator, InterfaceC1400a {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C5511d c5511d) {
            super(c5511d);
            c5511d.getClass();
        }

        @Override // java.util.Iterator
        public Object next() {
            m22478g();
            if (m22479l() >= m22481v().f17223v) {
                C1189h4.m4429a();
                return null;
            }
            int iM22479l = m22479l();
            m22483y(iM22479l + 1);
            m22484z(iM22479l);
            Object[] objArr = m22481v().f17219r;
            objArr.getClass();
            Object obj = objArr[m22480o()];
            m22482x();
            return obj;
        }
    }

    static {
        C5511d c5511d = new C5511d(0);
        c5511d.f17217C = true;
        f17214E = c5511d;
    }

    public C5511d(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i10, int i11) {
        this.f17218q = objArr;
        this.f17219r = objArr2;
        this.f17220s = iArr;
        this.f17221t = iArr2;
        this.f17222u = i10;
        this.f17223v = i11;
        this.f17224w = f17213D.m22472d(m22441D());
    }

    /* JADX INFO: renamed from: N */
    private final void m22427N() {
        this.f17225x++;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    /* JADX INFO: renamed from: w */
    private final void m22436w(int i10) {
        if (i10 < 0) {
            throw new OutOfMemoryError();
        }
        if (i10 > m22439B()) {
            int iM20524e = AbstractC5078f.f15387q.m20524e(m22439B(), i10);
            this.f17218q = AbstractC5510c.m22421e(this.f17218q, iM20524e);
            Object[] objArr = this.f17219r;
            this.f17219r = objArr != null ? AbstractC5510c.m22421e(objArr, iM20524e) : null;
            this.f17220s = Arrays.copyOf(this.f17220s, iM20524e);
            int iM22471c = f17213D.m22471c(iM20524e);
            if (iM22471c > m22441D()) {
                m22451O(iM22471c);
            }
        }
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f17217C) {
            return new C5517j(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* JADX INFO: renamed from: x */
    private final void m22437x(int i10) {
        if (m22457U(i10)) {
            m22463s(true);
        } else {
            m22436w(this.f17223v + i10);
        }
    }

    /* JADX INFO: renamed from: A */
    public final int m22438A(Object obj) {
        int i10 = this.f17223v;
        while (true) {
            i10--;
            if (i10 < 0) {
                return -1;
            }
            if (this.f17220s[i10] >= 0) {
                Object[] objArr = this.f17219r;
                objArr.getClass();
                if (AbstractC1061t.m3842c(objArr[i10], obj)) {
                    return i10;
                }
            }
        }
    }

    /* JADX INFO: renamed from: B */
    public final int m22439B() {
        return this.f17218q.length;
    }

    /* JADX INFO: renamed from: C */
    public Set m22440C() {
        C5512e c5512e = this.f17216B;
        if (c5512e != null) {
            return c5512e;
        }
        C5512e c5512e2 = new C5512e(this);
        this.f17216B = c5512e2;
        return c5512e2;
    }

    /* JADX INFO: renamed from: D */
    public final int m22441D() {
        return this.f17221t.length;
    }

    /* JADX INFO: renamed from: E */
    public Set m22442E() {
        C5513f c5513f = this.f17227z;
        if (c5513f != null) {
            return c5513f;
        }
        C5513f c5513f2 = new C5513f(this);
        this.f17227z = c5513f2;
        return c5513f2;
    }

    /* JADX INFO: renamed from: F */
    public int m22443F() {
        return this.f17226y;
    }

    /* JADX INFO: renamed from: G */
    public Collection m22444G() {
        C5514g c5514g = this.f17215A;
        if (c5514g != null) {
            return c5514g;
        }
        C5514g c5514g2 = new C5514g(this);
        this.f17215A = c5514g2;
        return c5514g2;
    }

    /* JADX INFO: renamed from: H */
    public final int m22445H(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.f17224w;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m22446I() {
        return this.f17217C;
    }

    /* JADX INFO: renamed from: J */
    public final e m22447J() {
        return new e(this);
    }

    /* JADX INFO: renamed from: K */
    public final boolean m22448K(Collection collection) {
        boolean z10 = false;
        if (collection.isEmpty()) {
            return false;
        }
        m22437x(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (m22449L((Map.Entry) it.next())) {
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m22449L(Map.Entry entry) {
        int iM22459o = m22459o(entry.getKey());
        Object[] objArrM22460p = m22460p();
        if (iM22459o >= 0) {
            objArrM22460p[iM22459o] = entry.getValue();
            return true;
        }
        int i10 = (-iM22459o) - 1;
        if (AbstractC1061t.m3842c(entry.getValue(), objArrM22460p[i10])) {
            return false;
        }
        objArrM22460p[i10] = entry.getValue();
        return true;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m22450M(int i10) {
        int iM22445H = m22445H(this.f17218q[i10]);
        int i11 = this.f17222u;
        while (true) {
            int[] iArr = this.f17221t;
            if (iArr[iM22445H] == 0) {
                iArr[iM22445H] = i10 + 1;
                this.f17220s[i10] = iM22445H;
                return true;
            }
            i11--;
            if (i11 < 0) {
                return false;
            }
            iM22445H = iM22445H == 0 ? m22441D() - 1 : iM22445H - 1;
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m22451O(int i10) {
        m22427N();
        int i11 = 0;
        if (this.f17223v > size()) {
            m22463s(false);
        }
        this.f17221t = new int[i10];
        this.f17224w = f17213D.m22472d(i10);
        while (i11 < this.f17223v) {
            int i12 = i11 + 1;
            if (!m22450M(i11)) {
                C10010p0.m38820a("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
                return;
            }
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: P */
    public final boolean m22452P(Map.Entry entry) {
        entry.getClass();
        m22462r();
        int iM22468z = m22468z(entry.getKey());
        if (iM22468z < 0) {
            return false;
        }
        Object[] objArr = this.f17219r;
        objArr.getClass();
        if (!AbstractC1061t.m3842c(objArr[iM22468z], entry.getValue())) {
            return false;
        }
        m22453Q(iM22468z);
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m22453Q(int i10) {
        AbstractC5510c.m22422f(this.f17218q, i10);
        Object[] objArr = this.f17219r;
        if (objArr != null) {
            AbstractC5510c.m22422f(objArr, i10);
        }
        m22454R(this.f17220s[i10]);
        this.f17220s[i10] = -1;
        this.f17226y = size() - 1;
        m22427N();
    }

    /* JADX INFO: renamed from: R */
    public final void m22454R(int i10) {
        int i11;
        int i12;
        while (true) {
            int i13 = i10;
            int i14 = 0;
            do {
                i10 = i10 == 0 ? m22441D() - 1 : i10 - 1;
                int[] iArr = this.f17221t;
                i11 = iArr[i10];
                i14++;
                if (i14 > this.f17222u) {
                    iArr[i13] = 0;
                    return;
                } else {
                    if (i11 == 0) {
                        iArr[i13] = 0;
                        return;
                    }
                    i12 = i11 - 1;
                }
            } while (((m22445H(this.f17218q[i12]) - i10) & (m22441D() - 1)) < i14);
            this.f17221t[i13] = i11;
            this.f17220s[i12] = i13;
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m22455S(Object obj) {
        m22462r();
        int iM22468z = m22468z(obj);
        if (iM22468z < 0) {
            return false;
        }
        m22453Q(iM22468z);
        return true;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m22456T(Object obj) {
        m22462r();
        int iM22438A = m22438A(obj);
        if (iM22438A < 0) {
            return false;
        }
        m22453Q(iM22438A);
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m22457U(int i10) {
        int iM22439B = m22439B();
        int i11 = this.f17223v;
        int i12 = iM22439B - i11;
        int size = i11 - size();
        return i12 < i10 && i12 + size >= i10 && size >= m22439B() / 4;
    }

    /* JADX INFO: renamed from: V */
    public final f m22458V() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        m22462r();
        int i10 = this.f17223v - 1;
        if (i10 >= 0) {
            int i11 = 0;
            while (true) {
                int[] iArr = this.f17220s;
                int i12 = iArr[i11];
                if (i12 >= 0) {
                    this.f17221t[i12] = 0;
                    iArr[i11] = -1;
                }
                if (i11 == i10) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        AbstractC5510c.m22423g(this.f17218q, 0, this.f17223v);
        Object[] objArr = this.f17219r;
        if (objArr != null) {
            AbstractC5510c.m22423g(objArr, 0, this.f17223v);
        }
        this.f17226y = 0;
        this.f17223v = 0;
        m22427N();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m22468z(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m22438A(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m22440C();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Map) && m22466v((Map) obj);
        }
        return true;
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int iM22468z = m22468z(obj);
        if (iM22468z < 0) {
            return null;
        }
        Object[] objArr = this.f17219r;
        objArr.getClass();
        return objArr[iM22468z];
    }

    @Override // java.util.Map
    public int hashCode() {
        b bVarM22467y = m22467y();
        int iM22476C = 0;
        while (bVarM22467y.hasNext()) {
            iM22476C += bVarM22467y.m22476C();
        }
        return iM22476C;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m22442E();
    }

    /* JADX INFO: renamed from: o */
    public final int m22459o(Object obj) {
        m22462r();
        while (true) {
            int iM22445H = m22445H(obj);
            int iM8582i = AbstractC2368o.m8582i(this.f17222u * 2, m22441D() / 2);
            int i10 = 0;
            while (true) {
                int i11 = this.f17221t[iM22445H];
                if (i11 == 0) {
                    if (this.f17223v < m22439B()) {
                        int i12 = this.f17223v;
                        int i13 = i12 + 1;
                        this.f17223v = i13;
                        this.f17218q[i12] = obj;
                        this.f17220s[i12] = iM22445H;
                        this.f17221t[iM22445H] = i13;
                        this.f17226y = size() + 1;
                        m22427N();
                        if (i10 > this.f17222u) {
                            this.f17222u = i10;
                        }
                        return i12;
                    }
                    m22437x(1);
                } else {
                    if (AbstractC1061t.m3842c(this.f17218q[i11 - 1], obj)) {
                        return -i11;
                    }
                    i10++;
                    if (i10 > iM8582i) {
                        m22451O(m22441D() * 2);
                        break;
                    }
                    iM22445H = iM22445H == 0 ? m22441D() - 1 : iM22445H - 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final Object[] m22460p() {
        Object[] objArr = this.f17219r;
        if (objArr != null) {
            return objArr;
        }
        Object[] objArrM22420d = AbstractC5510c.m22420d(m22439B());
        this.f17219r = objArrM22420d;
        return objArrM22420d;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        m22462r();
        int iM22459o = m22459o(obj);
        Object[] objArrM22460p = m22460p();
        if (iM22459o >= 0) {
            objArrM22460p[iM22459o] = obj2;
            return null;
        }
        int i10 = (-iM22459o) - 1;
        Object obj3 = objArrM22460p[i10];
        objArrM22460p[i10] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        map.getClass();
        m22462r();
        m22448K(map.entrySet());
    }

    /* JADX INFO: renamed from: q */
    public final Map m22461q() {
        m22462r();
        this.f17217C = true;
        if (size() > 0) {
            return this;
        }
        C5511d c5511d = f17214E;
        c5511d.getClass();
        return c5511d;
    }

    /* JADX INFO: renamed from: r */
    public final void m22462r() {
        if (this.f17217C) {
            C9079i0.m35296a();
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        m22462r();
        int iM22468z = m22468z(obj);
        if (iM22468z < 0) {
            return null;
        }
        Object[] objArr = this.f17219r;
        objArr.getClass();
        Object obj2 = objArr[iM22468z];
        m22453Q(iM22468z);
        return obj2;
    }

    /* JADX INFO: renamed from: s */
    public final void m22463s(boolean z10) {
        int i10;
        Object[] objArr = this.f17219r;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = this.f17223v;
            if (i11 >= i10) {
                break;
            }
            int[] iArr = this.f17220s;
            int i13 = iArr[i11];
            if (i13 >= 0) {
                Object[] objArr2 = this.f17218q;
                objArr2[i12] = objArr2[i11];
                if (objArr != null) {
                    objArr[i12] = objArr[i11];
                }
                if (z10) {
                    iArr[i12] = i13;
                    this.f17221t[i13] = i12 + 1;
                }
                i12++;
            }
            i11++;
        }
        AbstractC5510c.m22423g(this.f17218q, i12, i10);
        if (objArr != null) {
            AbstractC5510c.m22423g(objArr, i12, this.f17223v);
        }
        this.f17223v = i12;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m22443F();
    }

    /* JADX INFO: renamed from: t */
    public final boolean m22464t(Collection collection) {
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m22465u((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder((size() * 3) + 2);
        sb2.append("{");
        b bVarM22467y = m22467y();
        int i10 = 0;
        while (bVarM22467y.hasNext()) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            bVarM22467y.m22475B(sb2);
            i10++;
        }
        sb2.append("}");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: u */
    public final boolean m22465u(Map.Entry entry) {
        entry.getClass();
        int iM22468z = m22468z(entry.getKey());
        if (iM22468z < 0) {
            return false;
        }
        Object[] objArr = this.f17219r;
        objArr.getClass();
        return AbstractC1061t.m3842c(objArr[iM22468z], entry.getValue());
    }

    /* JADX INFO: renamed from: v */
    public final boolean m22466v(Map map) {
        return size() == map.size() && m22464t(map.entrySet());
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m22444G();
    }

    /* JADX INFO: renamed from: y */
    public final b m22467y() {
        return new b(this);
    }

    /* JADX INFO: renamed from: z */
    public final int m22468z(Object obj) {
        int iM22445H = m22445H(obj);
        int i10 = this.f17222u;
        while (true) {
            int i11 = this.f17221t[iM22445H];
            if (i11 == 0) {
                return -1;
            }
            int i12 = i11 - 1;
            if (AbstractC1061t.m3842c(this.f17218q[i12], obj)) {
                return i12;
            }
            i10--;
            if (i10 < 0) {
                return -1;
            }
            iM22445H = iM22445H == 0 ? m22441D() - 1 : iM22445H - 1;
        }
    }

    /* JADX INFO: renamed from: n8.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final int m22471c(int i10) {
            return Integer.highestOneBit(AbstractC2368o.m8578e(i10, 1) * 3);
        }

        /* JADX INFO: renamed from: d */
        public final int m22472d(int i10) {
            return Integer.numberOfLeadingZeros(i10) + 1;
        }

        /* JADX INFO: renamed from: e */
        public final C5511d m22473e() {
            return C5511d.f17214E;
        }

        public a() {
        }
    }

    public C5511d() {
        this(8);
    }

    public C5511d(int i10) {
        this(AbstractC5510c.m22420d(i10), null, new int[i10], new int[f17213D.m22471c(i10)], 2, 0);
    }
}
