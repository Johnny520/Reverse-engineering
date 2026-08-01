package p000;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class sh0 implements RandomAccess {

    /* JADX INFO: renamed from: d */
    public Object[] f5768d;

    /* JADX INFO: renamed from: e */
    public ph0 f5769e;

    /* JADX INFO: renamed from: f */
    public int f5770f = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sh0(Object[] objArr) {
        this.f5768d = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4071a(int i, Object obj) {
        int i2 = this.f5770f + 1;
        if (this.f5768d.length < i2) {
            m4083m(i2);
        }
        Object[] objArr = this.f5768d;
        int i3 = this.f5770f;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f5770f++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m4072b(Object obj) {
        int i = this.f5770f + 1;
        if (this.f5768d.length < i) {
            m4083m(i);
        }
        Object[] objArr = this.f5768d;
        int i2 = this.f5770f;
        objArr[i2] = obj;
        this.f5770f = i2 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4073c(int i, sh0 sh0Var) {
        int i2 = sh0Var.f5770f;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f5770f + i2;
        if (this.f5768d.length < i3) {
            m4083m(i3);
        }
        Object[] objArr = this.f5768d;
        int i4 = this.f5770f;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(sh0Var.f5768d, 0, objArr, i, i2);
        this.f5770f += i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4074d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f5770f + size;
        if (this.f5768d.length < i2) {
            m4083m(i2);
        }
        Object[] objArr = this.f5768d;
        int i3 = this.f5770f;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f5770f += size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m4075e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f5770f + size;
        if (this.f5768d.length < i3) {
            m4083m(i3);
        }
        Object[] objArr = this.f5768d;
        int i4 = this.f5770f;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                o30.m2757A();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f5770f += size;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final List m4076f() {
        ph0 ph0Var = this.f5769e;
        if (ph0Var != null) {
            return ph0Var;
        }
        ph0 ph0Var2 = new ph0(this);
        this.f5769e = ph0Var2;
        return ph0Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4077g() {
        Object[] objArr = this.f5768d;
        int i = this.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f5770f = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4078h(Object obj) {
        int i = this.f5770f - 1;
        if (i >= 0) {
            for (int i2 = 0; !p30.m3002l(this.f5768d[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final int m4079i(Object obj) {
        Object[] objArr = this.f5768d;
        int i = this.f5770f;
        for (int i2 = 0; i2 < i; i2++) {
            if (p30.m3002l(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m4080j(Object obj) {
        int iM4079i = m4079i(obj);
        if (iM4079i < 0) {
            return false;
        }
        m4081k(iM4079i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Object m4081k(int i) {
        Object[] objArr = this.f5768d;
        Object obj = objArr[i];
        int i2 = this.f5770f;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f5770f - 1;
        this.f5770f = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m4082l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f5770f;
            if (i2 < i3) {
                Object[] objArr = this.f5768d;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f5770f;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f5768d[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f5770f = i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m4083m(int i) {
        Object[] objArr = this.f5768d;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f5768d = objArr2;
    }
}
