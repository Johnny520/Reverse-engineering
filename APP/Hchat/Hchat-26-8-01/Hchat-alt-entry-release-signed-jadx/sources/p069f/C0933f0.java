package p069f;

import gg.AbstractC1416l;
import java.util.List;
import p016b1.C0166f;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p172lg.C2564d;
import p259r9.AbstractC3754e0;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: f.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0933f0 {

    /* JADX INFO: renamed from: a */
    public Object[] f2923a;

    /* JADX INFO: renamed from: b */
    public int f2924b;

    /* JADX INFO: renamed from: c */
    public C0929d0 f2925c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0933f0(int i9) {
        this.f2923a = i9 == 0 ? AbstractC0953p0.f3002a : new Object[i9];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2286a(Object obj) {
        int i9 = this.f2924b + 1;
        Object[] objArr = this.f2923a;
        if (objArr.length < i9) {
            m2298m(i9, objArr);
        }
        Object[] objArr2 = this.f2923a;
        int i10 = this.f2924b;
        objArr2[i10] = obj;
        this.f2924b = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m2287b(C0933f0 c0933f0) {
        c0933f0.getClass();
        if (c0933f0.m2293h()) {
            return;
        }
        int i9 = this.f2924b + c0933f0.f2924b;
        Object[] objArr = this.f2923a;
        if (objArr.length < i9) {
            m2298m(i9, objArr);
        }
        AbstractC4165l.m8379n0(this.f2924b, 0, c0933f0.f2923a, c0933f0.f2924b, this.f2923a);
        this.f2924b += c0933f0.f2924b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m2288c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i9 = this.f2924b;
        int size = list.size() + i9;
        Object[] objArr = this.f2923a;
        if (objArr.length < size) {
            m2298m(size, objArr);
        }
        Object[] objArr2 = this.f2923a;
        int size2 = list.size();
        for (int i10 = 0; i10 < size2; i10++) {
            objArr2[i10 + i9] = list.get(i10);
        }
        this.f2924b = list.size() + this.f2924b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m2289d() {
        AbstractC4165l.m8387v0(0, this.f2924b, null, this.f2923a);
        this.f2924b = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m2290e() {
        if (!m2293h()) {
            return this.f2923a[0];
        }
        C2104o.m5287l("ObjectList is empty.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C0933f0) {
            C0933f0 c0933f0 = (C0933f0) obj;
            int i9 = c0933f0.f2924b;
            int i10 = this.f2924b;
            if (i9 == i10) {
                Object[] objArr = this.f2923a;
                Object[] objArr2 = c0933f0.f2923a;
                C2564d c2564dM7910r0 = AbstractC3754e0.m7910r0(0, i10);
                int i11 = c2564dM7910r0.f8312g;
                int i12 = c2564dM7910r0.f8313h;
                if (i11 > i12) {
                    return true;
                }
                while (AbstractC1416l.m3825a(objArr[i11], objArr2[i11])) {
                    if (i11 == i12) {
                        return true;
                    }
                    i11++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m2291f(int i9) {
        if (i9 >= 0 && i9 < this.f2924b) {
            return this.f2923a[i9];
        }
        m2300o(i9);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m2292g(Object obj) {
        Object[] objArr = this.f2923a;
        int i9 = 0;
        if (obj == null) {
            int i10 = this.f2924b;
            while (i9 < i10) {
                if (objArr[i9] == null) {
                    return i9;
                }
                i9++;
            }
            return -1;
        }
        int i11 = this.f2924b;
        while (i9 < i11) {
            if (obj.equals(objArr[i9])) {
                return i9;
            }
            i9++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m2293h() {
        return this.f2924b == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f2923a;
        int i9 = this.f2924b;
        int iHashCode = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj = objArr[i10];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m2294i() {
        return this.f2924b != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m2295j(Object obj) {
        int iM2292g = m2292g(obj);
        if (iM2292g < 0) {
            return false;
        }
        m2296k(iM2292g);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m2296k(int i9) {
        int i10;
        if (i9 < 0 || i9 >= (i10 = this.f2924b)) {
            m2300o(i9);
            throw null;
        }
        Object[] objArr = this.f2923a;
        Object obj = objArr[i9];
        if (i9 != i10 - 1) {
            AbstractC4165l.m8379n0(i9, i9 + 1, objArr, i10, objArr);
        }
        int i11 = this.f2924b - 1;
        this.f2924b = i11;
        objArr[i11] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m2297l(int i9, int i10) {
        int i11;
        if (i9 < 0 || i9 > (i11 = this.f2924b) || i10 < 0 || i10 > i11) {
            C2104o.m5280e(this.f2924b, AbstractC0921a.m2256s(i9, i10, "Start (", ") and end (", ") must be in 0.."));
            return;
        }
        if (i10 < i9) {
            throw new IllegalArgumentException("Start (" + i9 + ") is more than end (" + i10 + ')');
        }
        if (i10 != i9) {
            if (i10 < i11) {
                Object[] objArr = this.f2923a;
                AbstractC4165l.m8379n0(i9, i10, objArr, i11, objArr);
            }
            int i12 = this.f2924b;
            int i13 = i12 - (i10 - i9);
            AbstractC4165l.m8387v0(i13, i12, null, this.f2923a);
            this.f2924b = i13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m2298m(int i9, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i9, (length * 3) / 2)];
        AbstractC4165l.m8379n0(0, 0, objArr, length, objArr2);
        this.f2923a = objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object m2299n(int i9, Object obj) {
        if (i9 < 0 || i9 >= this.f2924b) {
            m2300o(i9);
            throw null;
        }
        Object[] objArr = this.f2923a;
        Object obj2 = objArr[i9];
        objArr[i9] = obj;
        return obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m2300o(int i9) {
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Index ", " must be in 0..");
        sbM2257t.append(this.f2924b - 1);
        throw new IndexOutOfBoundsException(sbM2257t.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m2301p(int i9) {
        StringBuilder sbM2257t = AbstractC0921a.m2257t(i9, "Index ", " must be in 0..");
        sbM2257t.append(this.f2924b);
        throw new IndexOutOfBoundsException(sbM2257t.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C0166f c0166f = new C0166f(this, 4);
        StringBuilder sb2 = new StringBuilder("[");
        Object[] objArr = this.f2923a;
        int i9 = this.f2924b;
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                sb2.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i10];
            if (i10 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i10 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append((CharSequence) c0166f.invoke(obj));
            i10++;
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (16 int) A[MD:(int):void (m)] (LINE:14) call: f.f0.<init>(int):void type: THIS */
    public /* synthetic */ C0933f0() {
        this(16);
    }
}
