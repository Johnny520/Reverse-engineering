package p000;

import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class dh0 {

    /* JADX INFO: renamed from: a */
    public Object[] f1108a;

    /* JADX INFO: renamed from: b */
    public int f1109b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public dh0(int i) {
        this.f1108a = i == 0 ? kk0.f3182a : new Object[i];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m697a(Object obj) {
        int i = this.f1109b + 1;
        Object[] objArr = this.f1108a;
        if (objArr.length < i) {
            m709m(i, objArr);
        }
        Object[] objArr2 = this.f1108a;
        int i2 = this.f1109b;
        objArr2[i2] = obj;
        this.f1109b = i2 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m698b(dh0 dh0Var) {
        dh0Var.getClass();
        if (dh0Var.m704h()) {
            return;
        }
        int i = this.f1109b + dh0Var.f1109b;
        Object[] objArr = this.f1108a;
        if (objArr.length < i) {
            m709m(i, objArr);
        }
        AbstractC0201f9.m1057c0(dh0Var.f1108a, this.f1108a, this.f1109b, 0, dh0Var.f1109b);
        this.f1109b += dh0Var.f1109b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m699c(List list) {
        if (list.isEmpty()) {
            return;
        }
        int i = this.f1109b;
        int size = list.size() + i;
        Object[] objArr = this.f1108a;
        if (objArr.length < size) {
            m709m(size, objArr);
        }
        Object[] objArr2 = this.f1108a;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            objArr2[i2 + i] = list.get(i2);
        }
        this.f1109b = list.size() + this.f1109b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m700d() {
        AbstractC0201f9.m1061g0(this.f1108a, 0, this.f1109b);
        this.f1109b = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final Object m701e() {
        if (m704h()) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        return this.f1108a[0];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof dh0) {
            dh0 dh0Var = (dh0) obj;
            int i = dh0Var.f1109b;
            int i2 = this.f1109b;
            if (i == i2) {
                Object[] objArr = this.f1108a;
                Object[] objArr2 = dh0Var.f1108a;
                z20 z20VarM4893O = w60.m4893O(0, i2);
                int i3 = z20VarM4893O.f7248d;
                int i4 = z20VarM4893O.f7249e;
                if (i3 > i4) {
                    return true;
                }
                while (p30.m3002l(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Object m702f(int i) {
        if (i >= 0 && i < this.f1109b) {
            return this.f1108a[i];
        }
        m710n(i);
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final int m703g(Object obj) {
        Object[] objArr = this.f1108a;
        int i = 0;
        if (obj == null) {
            int i2 = this.f1109b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.f1109b;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m704h() {
        return this.f1109b == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        Object[] objArr = this.f1108a;
        int i = this.f1109b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m705i() {
        return this.f1109b != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m706j(Object obj) {
        int iM703g = m703g(obj);
        if (iM703g < 0) {
            return false;
        }
        m707k(iM703g);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m707k(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f1109b)) {
            m710n(i);
            throw null;
        }
        Object[] objArr = this.f1108a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            AbstractC0201f9.m1057c0(objArr, objArr, i, i + 1, i2);
        }
        int i3 = this.f1109b - 1;
        this.f1109b = i3;
        objArr[i3] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m708l(int i, int i2) {
        int i3;
        if (i < 0 || i > (i3 = this.f1109b) || i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("Start (" + i + ") and end (" + i2 + ") must be in 0.." + this.f1109b);
        }
        if (i2 < i) {
            throw new IllegalArgumentException("Start (" + i + ") is more than end (" + i2 + ')');
        }
        if (i2 != i) {
            if (i2 < i3) {
                Object[] objArr = this.f1108a;
                AbstractC0201f9.m1057c0(objArr, objArr, i, i2, i3);
            }
            int i4 = this.f1109b;
            int i5 = i4 - (i2 - i);
            AbstractC0201f9.m1061g0(this.f1108a, i5, i4);
            this.f1109b = i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m709m(int i, Object[] objArr) {
        objArr.getClass();
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, (length * 3) / 2)];
        AbstractC0201f9.m1057c0(objArr, objArr2, 0, 0, length);
        this.f1108a = objArr2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m710n(int i) {
        StringBuilder sb = new StringBuilder("Index ");
        sb.append(i);
        sb.append(" must be in 0..");
        sb.append(this.f1109b - 1);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C0711s2 c0711s2 = new C0711s2(16, this);
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f1108a;
        int i = this.f1109b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) c0711s2.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (16 int) A[MD:(int):void (m)] (LINE:14) call: dh0.<init>(int):void type: THIS */
    public /* synthetic */ dh0() {
        this(16);
    }
}
