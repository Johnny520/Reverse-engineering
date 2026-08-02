package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lw0 implements dp, cp {
    public final /* synthetic */ int h;
    public final /* synthetic */ mp i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lw0(mp mpVar, int i) {
        this.h = i;
        this.i = mpVar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dp
    public void a(s52 s52Var, r92 r92Var) throws j90 {
        mp mpVar = this.i;
        if (mpVar.y()) {
            mpVar.i(r92Var, kw0.h);
        } else {
            r92Var.close();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cp
    public void b(wo woVar, q92 q92Var) {
        int i = this.h;
        mp mpVar = this.i;
        switch (i) {
            case 1:
                if (!q92Var.a.w) {
                    mpVar.h(new x92(new pv(q92Var)));
                } else {
                    Object obj = q92Var.b;
                    if (obj != null) {
                        mpVar.h(obj);
                    } else {
                        k82 k82VarC = woVar.c();
                        k82VarC.getClass();
                        bt btVarA = d72.a(d21.class);
                        Object objCast = p40.y(btVarA).cast(k82VarC.e.u(btVarA));
                        objCast.getClass();
                        mpVar.h(new x92(new t51("Response from " + ip0.class.getName() + '.' + ((d21) objCast).b.getName() + " was null but response body type was declared as non-null")));
                    }
                }
                break;
            case 2:
                if (!q92Var.a.w) {
                    mpVar.h(new x92(new pv(q92Var)));
                } else {
                    mpVar.h(q92Var.b);
                }
                break;
            default:
                mpVar.h(q92Var);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.cp
    public void d(wo woVar, Throwable th) {
        int i = this.h;
        mp mpVar = this.i;
        switch (i) {
            case 1:
                mpVar.h(new x92(th));
                break;
            case 2:
                mpVar.h(new x92(th));
                break;
            default:
                mpVar.h(new x92(th));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dp
    public void j(s52 s52Var, IOException iOException) {
        mp mpVar = this.i;
        if (mpVar.y()) {
            mpVar.h(new x92(iOException));
        }
    }
}
