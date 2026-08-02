package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zk1 implements RandomAccess {
    public Object[] h;
    public jk1 i;
    public int j = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zk1(Object[] objArr) {
        this.h = objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(int i, Object obj) {
        int i2 = this.j + 1;
        if (this.h.length < i2) {
            m(i2);
        }
        Object[] objArr = this.h;
        int i3 = this.j;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + 1, i3 - i);
        }
        objArr[i] = obj;
        this.j++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Object obj) {
        int i = this.j + 1;
        if (this.h.length < i) {
            m(i);
        }
        Object[] objArr = this.h;
        int i2 = this.j;
        objArr[i2] = obj;
        this.j = i2 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, zk1 zk1Var) {
        int i2 = zk1Var.j;
        if (i2 == 0) {
            return;
        }
        int i3 = this.j + i2;
        if (this.h.length < i3) {
            m(i3);
        }
        Object[] objArr = this.h;
        int i4 = this.j;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + i2, i4 - i);
        }
        System.arraycopy(zk1Var.h, 0, objArr, i, i2);
        this.j += i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(int i, List list) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        int i2 = this.j + size;
        if (this.h.length < i2) {
            m(i2);
        }
        Object[] objArr = this.h;
        int i3 = this.j;
        if (i != i3) {
            System.arraycopy(objArr, i, objArr, i + size, i3 - i);
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            objArr[i + i4] = list.get(i4);
        }
        this.j += size;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean e(int i, Collection collection) {
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        int size = collection.size();
        int i3 = this.j + size;
        if (this.h.length < i3) {
            m(i3);
        }
        Object[] objArr = this.h;
        int i4 = this.j;
        if (i != i4) {
            System.arraycopy(objArr, i, objArr, i + size, i4 - i);
        }
        for (Object obj : collection) {
            int i5 = i2 + 1;
            if (i2 < 0) {
                eu.a0();
                throw null;
            }
            objArr[i2 + i] = obj;
            i2 = i5;
        }
        this.j += size;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List f() {
        jk1 jk1Var = this.i;
        if (jk1Var != null) {
            return jk1Var;
        }
        jk1 jk1Var2 = new jk1(1, this);
        this.i = jk1Var2;
        return jk1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void g() {
        Object[] objArr = this.h;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.j = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean h(Object obj) {
        int i = this.j - 1;
        if (i >= 0) {
            for (int i2 = 0; !t11.l(this.h[i2], obj); i2++) {
                if (i2 != i) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int i(Object obj) {
        Object[] objArr = this.h;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (t11.l(obj, objArr[i2])) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean j(Object obj) {
        int i = i(obj);
        if (i < 0) {
            return false;
        }
        k(i);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Object k(int i) {
        Object[] objArr = this.h;
        Object obj = objArr[i];
        int i2 = this.j;
        if (i != i2 - 1) {
            int i3 = i + 1;
            System.arraycopy(objArr, i3, objArr, i, i2 - i3);
        }
        int i4 = this.j - 1;
        this.j = i4;
        objArr[i4] = null;
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void l(int i, int i2) {
        if (i2 > i) {
            int i3 = this.j;
            if (i2 < i3) {
                Object[] objArr = this.h;
                System.arraycopy(objArr, i2, objArr, i, i3 - i2);
            }
            int i4 = this.j;
            int i5 = i4 - (i2 - i);
            int i6 = i4 - 1;
            if (i5 <= i6) {
                int i7 = i5;
                while (true) {
                    this.h[i7] = null;
                    if (i7 == i6) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.j = i5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m(int i) {
        Object[] objArr = this.h;
        int length = objArr.length;
        Object[] objArr2 = new Object[Math.max(i, length * 2)];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.h = objArr2;
    }
}
