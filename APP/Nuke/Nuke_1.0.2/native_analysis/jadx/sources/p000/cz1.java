package p000;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class cz1 extends az1 {

    /* JADX INFO: renamed from: k */
    public final bz1 f1792k;

    /* JADX INFO: renamed from: l */
    public Object f1793l;

    /* JADX INFO: renamed from: m */
    public boolean f1794m;

    /* JADX INFO: renamed from: n */
    public int f1795n;

    public cz1(bz1 bz1Var, i43[] i43VarArr) {
        super(bz1Var.f1084j, i43VarArr);
        this.f1792k = bz1Var;
        this.f1795n = bz1Var.f1086l;
    }

    /* JADX INFO: renamed from: c */
    public final void m925c(int i, h43 h43Var, Object obj, int i2) {
        int i3 = i2 * 5;
        i43[] i43VarArr = this.f453h;
        if (i3 <= 30) {
            int iM2330d = 1 << ic3.m2330d(i, i3);
            if (h43Var.m2062h(iM2330d)) {
                i43VarArr[i2].m2269a(h43Var.f3820d, Integer.bitCount(h43Var.f3817a) * 2, h43Var.m2060f(iM2330d));
                this.f454i = i2;
                return;
            } else {
                int iM2073t = h43Var.m2073t(iM2330d);
                h43 h43VarM2072s = h43Var.m2072s(iM2073t);
                i43VarArr[i2].m2269a(h43Var.f3820d, Integer.bitCount(h43Var.f3817a) * 2, iM2073t);
                m925c(i, h43VarM2072s, obj, i2 + 1);
                return;
            }
        }
        i43 i43Var = i43VarArr[i2];
        Object[] objArr = h43Var.f3820d;
        i43Var.m2269a(objArr, objArr.length, 0);
        while (true) {
            i43 i43Var2 = i43VarArr[i2];
            if (t11.m5086l(i43Var2.f4268h[i43Var2.f4270j], obj)) {
                this.f454i = i2;
                return;
            } else {
                i43VarArr[i2].f4270j += 2;
            }
        }
    }

    @Override // p000.az1, java.util.Iterator
    public final Object next() {
        if (this.f1792k.f1086l != this.f1795n) {
            throw new ConcurrentModificationException();
        }
        if (!this.f455j) {
            um2.m5513b();
            return null;
        }
        i43 i43Var = this.f453h[this.f454i];
        this.f1793l = i43Var.f4268h[i43Var.f4270j];
        this.f1794m = true;
        return super.next();
    }

    @Override // p000.az1, java.util.Iterator
    public final void remove() {
        if (!this.f1794m) {
            throw new IllegalStateException();
        }
        boolean z = this.f455j;
        bz1 bz1Var = this.f1792k;
        if (!z) {
            xe1.m6117e(bz1Var).remove(this.f1793l);
        } else {
            if (!z) {
                um2.m5513b();
                return;
            }
            i43 i43Var = this.f453h[this.f454i];
            Object obj = i43Var.f4268h[i43Var.f4270j];
            xe1.m6117e(bz1Var).remove(this.f1793l);
            m925c(obj != null ? obj.hashCode() : 0, bz1Var.f1084j, obj, 0);
        }
        this.f1793l = null;
        this.f1794m = false;
        this.f1795n = bz1Var.f1086l;
    }
}
