package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hq0 implements Iterator, p40 {

    /* JADX INFO: renamed from: d */
    public final m91[] f2350d;

    /* JADX INFO: renamed from: e */
    public int f2351e;

    /* JADX INFO: renamed from: f */
    public boolean f2352f = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hq0(l91 l91Var, m91[] m91VarArr) {
        this.f2350d = m91VarArr;
        m91VarArr[0].m2485a(l91Var.f3397d, Integer.bitCount(l91Var.f3394a) * 2, 0);
        this.f2351e = 0;
        m1497a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1497a() {
        int i = this.f2351e;
        m91[] m91VarArr = this.f2350d;
        m91 m91Var = m91VarArr[i];
        if (m91Var.f3891f < m91Var.f3890e) {
            return;
        }
        while (-1 < i) {
            int iM1498b = m1498b(i);
            if (iM1498b == -1) {
                m91 m91Var2 = m91VarArr[i];
                int i2 = m91Var2.f3891f;
                Object[] objArr = m91Var2.f3889d;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    m91Var2.f3891f = i2 + 1;
                    iM1498b = m1498b(i);
                }
            }
            if (iM1498b != -1) {
                this.f2351e = iM1498b;
                return;
            }
            if (i > 0) {
                m91 m91Var3 = m91VarArr[i - 1];
                int i3 = m91Var3.f3891f;
                int length2 = m91Var3.f3889d.length;
                m91Var3.f3891f = i3 + 1;
            }
            m91VarArr[i].m2485a(l91.f3393e.f3397d, 0, 0);
            i--;
        }
        this.f2352f = false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final int m1498b(int i) {
        m91[] m91VarArr = this.f2350d;
        m91 m91Var = m91VarArr[i];
        int i2 = m91Var.f3891f;
        if (i2 < m91Var.f3890e) {
            return i;
        }
        Object[] objArr = m91Var.f3889d;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        obj.getClass();
        l91 l91Var = (l91) obj;
        if (i == 6) {
            m91 m91Var2 = m91VarArr[i + 1];
            Object[] objArr2 = l91Var.f3397d;
            m91Var2.m2485a(objArr2, objArr2.length, 0);
        } else {
            m91VarArr[i + 1].m2485a(l91Var.f3397d, Integer.bitCount(l91Var.f3394a) * 2, 0);
        }
        return m1498b(i + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2352f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public Object next() {
        if (!this.f2352f) {
            C0921xc.m5132m();
            return null;
        }
        Object next = this.f2350d[this.f2351e].next();
        m1497a();
        return next;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
