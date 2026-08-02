package defpackage;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class cz1 extends az1 {
    public final bz1 k;
    public Object l;
    public boolean m;
    public int n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public cz1(bz1 bz1Var, i43[] i43VarArr) {
        super(bz1Var.j, i43VarArr);
        this.k = bz1Var;
        this.n = bz1Var.l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(int i, h43 h43Var, Object obj, int i2) {
        int i3 = i2 * 5;
        i43[] i43VarArr = this.h;
        if (i3 <= 30) {
            int iD = 1 << ic3.d(i, i3);
            if (h43Var.h(iD)) {
                i43VarArr[i2].a(h43Var.d, Integer.bitCount(h43Var.a) * 2, h43Var.f(iD));
                this.i = i2;
                return;
            } else {
                int iT = h43Var.t(iD);
                h43 h43VarS = h43Var.s(iT);
                i43VarArr[i2].a(h43Var.d, Integer.bitCount(h43Var.a) * 2, iT);
                c(i, h43VarS, obj, i2 + 1);
                return;
            }
        }
        i43 i43Var = i43VarArr[i2];
        Object[] objArr = h43Var.d;
        i43Var.a(objArr, objArr.length, 0);
        while (true) {
            i43 i43Var2 = i43VarArr[i2];
            if (t11.l(i43Var2.h[i43Var2.j], obj)) {
                this.i = i2;
                return;
            } else {
                i43VarArr[i2].j += 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.az1, java.util.Iterator
    public final Object next() {
        if (this.k.l != this.n) {
            throw new ConcurrentModificationException();
        }
        if (!this.j) {
            um2.b();
            return null;
        }
        i43 i43Var = this.h[this.i];
        this.l = i43Var.h[i43Var.j];
        this.m = true;
        return super.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.az1, java.util.Iterator
    public final void remove() {
        if (!this.m) {
            throw new IllegalStateException();
        }
        boolean z = this.j;
        bz1 bz1Var = this.k;
        if (!z) {
            xe1.e(bz1Var).remove(this.l);
        } else {
            if (!z) {
                um2.b();
                return;
            }
            i43 i43Var = this.h[this.i];
            Object obj = i43Var.h[i43Var.j];
            xe1.e(bz1Var).remove(this.l);
            c(obj != null ? obj.hashCode() : 0, bz1Var.j, obj, 0);
        }
        this.l = null;
        this.m = false;
        this.n = bz1Var.l;
    }
}
