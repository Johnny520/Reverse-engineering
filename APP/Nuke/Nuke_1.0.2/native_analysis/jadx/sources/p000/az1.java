package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class az1 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final i43[] f453h;

    /* JADX INFO: renamed from: i */
    public int f454i;

    /* JADX INFO: renamed from: j */
    public boolean f455j = true;

    public az1(h43 h43Var, i43[] i43VarArr) {
        this.f453h = i43VarArr;
        i43VarArr[0].m2269a(h43Var.f3820d, Integer.bitCount(h43Var.f3817a) * 2, 0);
        this.f454i = 0;
        m314a();
    }

    /* JADX INFO: renamed from: a */
    public final void m314a() {
        int i = this.f454i;
        i43[] i43VarArr = this.f453h;
        i43 i43Var = i43VarArr[i];
        if (i43Var.f4270j < i43Var.f4269i) {
            return;
        }
        while (-1 < i) {
            int iM315b = m315b(i);
            if (iM315b == -1) {
                i43 i43Var2 = i43VarArr[i];
                int i2 = i43Var2.f4270j;
                Object[] objArr = i43Var2.f4268h;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    i43Var2.f4270j = i2 + 1;
                    iM315b = m315b(i);
                }
            }
            if (iM315b != -1) {
                this.f454i = iM315b;
                return;
            }
            if (i > 0) {
                i43 i43Var3 = i43VarArr[i - 1];
                int i3 = i43Var3.f4270j;
                int length2 = i43Var3.f4268h.length;
                i43Var3.f4270j = i3 + 1;
            }
            i43VarArr[i].m2269a(h43.f3816e.f3820d, 0, 0);
            i--;
        }
        this.f455j = false;
    }

    /* JADX INFO: renamed from: b */
    public final int m315b(int i) {
        i43[] i43VarArr = this.f453h;
        i43 i43Var = i43VarArr[i];
        int i2 = i43Var.f4270j;
        if (i2 < i43Var.f4269i) {
            return i;
        }
        Object[] objArr = i43Var.f4268h;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        h43 h43Var = (h43) obj;
        if (i == 6) {
            i43 i43Var2 = i43VarArr[i + 1];
            Object[] objArr2 = h43Var.f3820d;
            i43Var2.m2269a(objArr2, objArr2.length, 0);
        } else {
            i43VarArr[i + 1].m2269a(h43Var.f3820d, Integer.bitCount(h43Var.f3817a) * 2, 0);
        }
        return m315b(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f455j;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!this.f455j) {
            um2.m5513b();
            return null;
        }
        Object next = this.f453h[this.f454i].next();
        m314a();
        return next;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
