package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class vz2 extends tw2 implements in0 {
    public int l;
    public final /* synthetic */ b03 m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz2(b03 b03Var, t00 t00Var) {
        super(1, t00Var);
        this.m = b03Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        return new vz2(this.m, (t00) obj).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (r13 == r6) goto L28;
     */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(Object obj) throws Throwable {
        Object objR;
        int i = this.l;
        a83 a83Var = a83.a;
        b03 b03Var = this.m;
        k20 k20Var = k20.h;
        if (i == 0) {
            fg1.T(obj);
            this.l = 1;
            if (b03Var.s(this) != k20Var) {
            }
            return k20Var;
        }
        if (i != 1) {
            if (i != 2) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fg1.T(obj);
            b03Var.B = true;
            return a83Var;
        }
        fg1.T(obj);
        ow1 ow1VarA = b03.a(b03Var);
        if (ow1VarA != null) {
            String str = (String) ow1VarA.h;
            long j = ((f13) ow1VarA.i).a;
            p02 p02Var = b03Var.j;
            if (p02Var != null) {
                this.l = 2;
                if (str.length() == 0 || f13.c(j)) {
                    objR = a83Var;
                } else {
                    objR = p7.R(p02Var.a, new k9(p02Var, new f2(j, null, p02Var, str), null, 7), this);
                }
                if (objR != k20Var) {
                    objR = a83Var;
                }
            }
        }
        b03Var.B = true;
        return a83Var;
    }
}
