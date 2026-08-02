package p000;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zk1 implements RandomAccess {

    /* JADX INFO: renamed from: h */
    public Object[] f13934h;

    /* JADX INFO: renamed from: i */
    public jk1 f13935i;

    /* JADX INFO: renamed from: j */
    public int f13936j = 0;

    public zk1(Object[] objArr) {
        this.f13934h = objArr;
    }

    /* JADX INFO: renamed from: a */
    public final void m6422a(int i, Object obj) {
        int i2 = this.f13936j + 1;
        if (this.f13934h.length < i2) {
            m6434m(i2);
        }
        Object[] objArr = this.f13934h;
        int i3 = this.f13936j;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.f13936j++;
    }

    /* JADX INFO: renamed from: b */
    public final void m6423b(Object obj) {
        int i = this.f13936j + 1;
        if (this.f13934h.length < i) {
            m6434m(i);
        }
        Object[] objArr = this.f13934h;
        int i2 = this.f13936j;
        objArr[i2] = obj;
        this.f13936j = i2 + 1;
    }

    /* JADX INFO: renamed from: c */
    public final void m6424c(int i, zk1 zk1Var) {
        int i2 = zk1Var.f13936j;
        if (i2 == 0) {
            return;
        }
        int i3 = this.f13936j + i2;
        if (this.f13934h.length < i3) {
            m6434m(i3);
        }
        Object[] objArr = this.f13934h;
        int i4 = this.f13936j;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(zk1Var.f13934h, 0, objArr, i, i2);
        this.f13936j += i2;
    }

    /* JADX INFO: renamed from: d */
    public final void m6425d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.f13936j + size;
        if (this.f13934h.length < i2) {
            m6434m(i2);
        }
        Object[] objArr = this.f13934h;
        int i3 = this.f13936j;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.f13936j += size;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m6426e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.f13936j + size;
        if (this.f13934h.length < i3) {
            m6434m(i3);
        }
        Object[] objArr = this.f13934h;
        int i4 = this.f13936j;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                AbstractC0179eu.m1447a0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.f13936j += size;
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final List m6427f() {
        jk1 jk1Var = this.f13935i;
        if (jk1Var != null) {
            return jk1Var;
        }
        jk1 jk1Var2 = new jk1(1, this);
        this.f13935i = jk1Var2;
        return jk1Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m6428g() {
        Object[] objArr = this.f13934h;
        int i = this.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f13936j = 0;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m6429h(Object obj) {
        int i = this.f13936j - 1;
        if (i >= 0) {
            for (int i2 = 0; !t11.m5086l(this.f13934h[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final int m6430i(Object obj) {
        Object[] objArr = this.f13934h;
        int i = this.f13936j;
        for (int i2 = 0; i2 < i; i2++) {
            if (t11.m5086l(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m6431j(Object obj) {
        int iM6430i = m6430i(obj);
        if (iM6430i < 0) {
            return false;
        }
        m6432k(iM6430i);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final Object m6432k(int i) {
        Object[] objArr = this.f13934h;
        Object obj = objArr[i];
        int i2 = this.f13936j;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.f13936j - 1;
        this.f13936j = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX INFO: renamed from: l */
    public final void m6433l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f13936j;
            if (i2 < i3) {
                Object[] objArr = this.f13934h;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.f13936j;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.f13934h[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.f13936j = i5;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6434m(int i) {
        Object[] objArr = this.f13934h;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f13934h = objArr2;
    }
}
