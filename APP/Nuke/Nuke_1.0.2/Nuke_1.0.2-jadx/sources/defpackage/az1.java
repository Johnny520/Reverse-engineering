package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class az1 implements Iterator, q41 {
    public final i43[] h;
    public int i;
    public boolean j = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public az1(h43 h43Var, i43[] i43VarArr) {
        this.h = i43VarArr;
        i43VarArr[0].a(h43Var.d, Integer.bitCount(h43Var.a) * 2, 0);
        this.i = 0;
        a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a() {
        int i = this.i;
        i43[] i43VarArr = this.h;
        i43 i43Var = i43VarArr[i];
        if (i43Var.j < i43Var.i) {
            return;
        }
        while (-1 < i) {
            int iB = b(i);
            if (iB == -1) {
                i43 i43Var2 = i43VarArr[i];
                int i2 = i43Var2.j;
                Object[] objArr = i43Var2.h;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    i43Var2.j = i2 + 1;
                    iB = b(i);
                }
            }
            if (iB != -1) {
                this.i = iB;
                return;
            }
            if (i > 0) {
                i43 i43Var3 = i43VarArr[i - 1];
                int i3 = i43Var3.j;
                int length2 = i43Var3.h.length;
                i43Var3.j = i3 + 1;
            }
            i43VarArr[i].a(h43.e.d, 0, 0);
            i--;
        }
        this.j = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int b(int i) {
        i43[] i43VarArr = this.h;
        i43 i43Var = i43VarArr[i];
        int i2 = i43Var.j;
        if (i2 < i43Var.i) {
            return i;
        }
        Object[] objArr = i43Var.h;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        h43 h43Var = (h43) obj;
        if (i == 6) {
            i43 i43Var2 = i43VarArr[i + 1];
            Object[] objArr2 = h43Var.d;
            i43Var2.a(objArr2, objArr2.length, 0);
        } else {
            i43VarArr[i + 1].a(h43Var.d, Integer.bitCount(h43Var.a) * 2, 0);
        }
        return b(i + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public Object next() {
        if (!this.j) {
            um2.b();
            return null;
        }
        Object next = this.h[this.i].next();
        a();
        return next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
