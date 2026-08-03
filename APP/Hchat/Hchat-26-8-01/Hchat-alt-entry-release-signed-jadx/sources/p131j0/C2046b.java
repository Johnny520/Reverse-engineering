package p131j0;

import gg.AbstractC1416l;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import p000a.AbstractC0000a;
import p069f.C0929d0;

/* JADX INFO: renamed from: j0.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2046b implements RandomAccess {

    /* JADX INFO: renamed from: g */
    public Object[] f6891g;

    /* JADX INFO: renamed from: h */
    public C0929d0 f6892h;

    /* JADX INFO: renamed from: i */
    public int f6893i = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2046b(Object[] objArr) {
        this.f6891g = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m5055a(int i9, Object obj) {
        int i10 = this.f6893i + 1;
        if (this.f6891g.length < i10) {
            m5067m(i10);
        }
        Object[] objArr = this.f6891g;
        int i11 = this.f6893i;
        if (i9 != i11) {
            System.arraycopy(objArr, i9, objArr, i9 + 1, i11 - i9);
        }
        objArr[i9] = obj;
        this.f6893i++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m5056b(Object obj) {
        int i9 = this.f6893i + 1;
        if (this.f6891g.length < i9) {
            m5067m(i9);
        }
        Object[] objArr = this.f6891g;
        int i10 = this.f6893i;
        objArr[i10] = obj;
        this.f6893i = i10 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5057c(int i9, C2046b c2046b) {
        int i10 = c2046b.f6893i;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f6893i + i10;
        if (this.f6891g.length < i11) {
            m5067m(i11);
        }
        Object[] objArr = this.f6891g;
        int i12 = this.f6893i;
        if (i9 != i12) {
            System.arraycopy(objArr, i9, objArr, i9 + i10, i12 - i9);
        }
        System.arraycopy(c2046b.f6891g, 0, objArr, i9, i10);
        this.f6893i += i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m5058d(int i9, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i10 = this.f6893i + size;
        if (this.f6891g.length < i10) {
            m5067m(i10);
        }
        Object[] objArr = this.f6891g;
        int i11 = this.f6893i;
        if (i9 != i11) {
            System.arraycopy(objArr, i9, objArr, i9 + size, i11 - i9);
        }
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            objArr[i9 + i12] = list.get(i12);
        }
        this.f6893i += size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m5059e(int i9, Collection collection) {
        int i10 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i11 = this.f6893i + size;
        if (this.f6891g.length < i11) {
            m5067m(i11);
        }
        Object[] objArr = this.f6891g;
        int i12 = this.f6893i;
        if (i9 != i12) {
            System.arraycopy(objArr, i9, objArr, i9 + size, i12 - i9);
        }
        for (Object obj : collection) {
            int i13 = i10 + 1;
            if (i10 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            objArr[i10 + i9] = obj;
            i10 = i13;
        }
        this.f6893i += size;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final List m5060f() {
        C0929d0 c0929d0 = this.f6892h;
        if (c0929d0 != null) {
            return c0929d0;
        }
        C0929d0 c0929d02 = new C0929d0(this, 1);
        this.f6892h = c0929d02;
        return c0929d02;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m5061g() {
        Object[] objArr = this.f6891g;
        int i9 = this.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        this.f6893i = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m5062h(Object obj) {
        int i9 = this.f6893i - 1;
        if (i9 >= 0) {
            for (int i10 = 0; !AbstractC1416l.m3825a(this.f6891g[i10], obj); i10++) {
                if (i10 != i9) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m5063i(Object obj) {
        Object[] objArr = this.f6891g;
        int i9 = this.f6893i;
        for (int i10 = 0; i10 < i9; i10++) {
            if (AbstractC1416l.m3825a(obj, objArr[i10])) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m5064j(Object obj) {
        int iM5063i = m5063i(obj);
        if (iM5063i < 0) {
            return false;
        }
        m5065k(iM5063i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m5065k(int i9) {
        Object[] objArr = this.f6891g;
        Object obj = objArr[i9];
        int i10 = this.f6893i;
        if (i9 != i10 - 1) {
            int i11 = i9 + 1;
            System.arraycopy(objArr, i11, objArr, i9, i10 - i11);
        }
        int i12 = this.f6893i - 1;
        this.f6893i = i12;
        objArr[i12] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m5066l(int i9, int i10) {
        if (i10 > i9) {
            int i11 = this.f6893i;
            if (i10 < i11) {
                Object[] objArr = this.f6891g;
                System.arraycopy(objArr, i10, objArr, i9, i11 - i10);
            }
            int i12 = this.f6893i;
            int i13 = i12 - (i10 - i9);
            int i14 = i12 - 1;
            if (i13 <= i14) {
                int i15 = i13;
                while (true) {
                    this.f6891g[i15] = null;
                    if (i15 == i14) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.f6893i = i13;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m5067m(int i9) {
        Object[] objArr = this.f6891g;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i9, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f6891g = objArr2;
    }
}
