package p000;

import java.util.ConcurrentModificationException;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public class iq0 extends hq0 {

    /* JADX INFO: renamed from: g */
    public final eq0 f2606g;

    /* JADX INFO: renamed from: h */
    public Object f2607h;

    /* JADX INFO: renamed from: i */
    public boolean f2608i;

    /* JADX INFO: renamed from: j */
    public int f2609j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public iq0(eq0 eq0Var, m91[] m91VarArr) {
        super(eq0Var.f1505e, m91VarArr);
        this.f2606g = eq0Var;
        this.f2609j = eq0Var.f1507g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m1594c(int i, l91 l91Var, Object obj, int i2) {
        int i3 = i2 * 5;
        m91[] m91VarArr = this.f2350d;
        if (i3 <= 30) {
            int iM4917x = 1 << w60.m4917x(i, i3);
            if (l91Var.m1992h(iM4917x)) {
                m91VarArr[i2].m2485a(l91Var.f3397d, Integer.bitCount(l91Var.f3394a) * 2, l91Var.m1990f(iM4917x));
                this.f2351e = i2;
                return;
            } else {
                int iM2003t = l91Var.m2003t(iM4917x);
                l91 l91VarM2002s = l91Var.m2002s(iM2003t);
                m91VarArr[i2].m2485a(l91Var.f3397d, Integer.bitCount(l91Var.f3394a) * 2, iM2003t);
                m1594c(i, l91VarM2002s, obj, i2 + 1);
                return;
            }
        }
        m91 m91Var = m91VarArr[i2];
        Object[] objArr = l91Var.f3397d;
        m91Var.m2485a(objArr, objArr.length, 0);
        while (true) {
            m91 m91Var2 = m91VarArr[i2];
            if (p30.m3002l(m91Var2.f3889d[m91Var2.f3891f], obj)) {
                this.f2351e = i2;
                return;
            } else {
                m91VarArr[i2].f3891f += 2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.hq0, java.util.Iterator
    public final Object next() {
        if (this.f2606g.f1507g != this.f2609j) {
            throw new ConcurrentModificationException();
        }
        if (!this.f2352f) {
            C0921xc.m5132m();
            return null;
        }
        m91 m91Var = this.f2350d[this.f2351e];
        this.f2607h = m91Var.f3889d[m91Var.f3891f];
        this.f2608i = true;
        return super.next();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.hq0, java.util.Iterator
    public final void remove() {
        if (!this.f2608i) {
            throw new IllegalStateException();
        }
        boolean z = this.f2352f;
        eq0 eq0Var = this.f2606g;
        if (!z) {
            s91.m4046k(eq0Var).remove(this.f2607h);
        } else {
            if (!z) {
                C0921xc.m5132m();
                return;
            }
            m91 m91Var = this.f2350d[this.f2351e];
            Object obj = m91Var.f3889d[m91Var.f3891f];
            s91.m4046k(eq0Var).remove(this.f2607h);
            m1594c(obj != null ? obj.hashCode() : 0, eq0Var.f1505e, obj, 0);
        }
        this.f2607h = null;
        this.f2608i = false;
        this.f2609j = eq0Var.f1507g;
    }
}
