package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m41 extends w92 implements nn0 {
    public int j;
    public /* synthetic */ z40 k;
    public final /* synthetic */ dk l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(dk dkVar, t00 t00Var) {
        super(3, t00Var);
        this.l = dkVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.nn0
    public final Object e(Object obj, Object obj2, Object obj3) {
        m41 m41Var = new m41(this.l, (t00) obj3);
        m41Var.k = (z40) obj;
        return m41Var.r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        dk dkVar = this.l;
        qb2 qb2Var = (qb2) dkVar.j;
        z40 z40Var = this.k;
        int i = this.j;
        if (i == 0) {
            fg1.T(obj);
            byte bP = qb2Var.p();
            if (bP == 1) {
                return dkVar.o(true);
            }
            if (bP == 0) {
                return dkVar.o(false);
            }
            if (bP != 6) {
                if (bP == 8) {
                    return dkVar.n();
                }
                qb2.m(qb2Var, "Can't begin reading element, unexpected token", 0, 6);
                throw null;
            }
            this.k = null;
            this.j = 1;
            obj = dk.c(dkVar, z40Var, this);
            k20 k20Var = k20.h;
            if (obj == k20Var) {
                return k20Var;
            }
        } else {
            if (i != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
        }
        return (j31) obj;
    }
}
