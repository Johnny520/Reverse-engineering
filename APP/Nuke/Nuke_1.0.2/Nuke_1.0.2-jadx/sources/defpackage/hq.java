package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hq implements zj0 {
    public final a20 h;
    public final int i;
    public final hn j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hq(a20 a20Var, int i, hn hnVar) {
        this.h = a20Var;
        this.i = i;
        this.j = hnVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.zj0
    public Object a(ak0 ak0Var, t00 t00Var) {
        Object objU = te.u(new b2(ak0Var, this, (t00) null, 4), t00Var);
        return objU == k20.h ? objU : a83.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String b() {
        return null;
    }

    public abstract Object c(o32 o32Var, t00 t00Var);

    public abstract hq d(a20 a20Var, int i, hn hnVar);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zj0 e() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fq f(j20 j20Var) {
        int i = this.i;
        if (i == -3) {
            i = -2;
        }
        mn0 a2Var = new a2(this, null, 8);
        o32 o32Var = new o32(rg3.H(j20Var, this.h), fg1.a(i, 4, this.j));
        o32Var.i0(m20.j, o32Var, a2Var);
        return o32Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strB = b();
        if (strB != null) {
            arrayList.add(strB);
        }
        zd0 zd0Var = zd0.h;
        a20 a20Var = this.h;
        if (a20Var != zd0Var) {
            arrayList.add("context=" + a20Var);
        }
        int i = this.i;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        hn hnVar = hn.h;
        hn hnVar2 = this.j;
        if (hnVar2 != hnVar) {
            arrayList.add("onBufferOverflow=" + hnVar2);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        return hk1.i(sb, du.u0(arrayList, ", ", null, null, null, 62), ']');
    }
}
