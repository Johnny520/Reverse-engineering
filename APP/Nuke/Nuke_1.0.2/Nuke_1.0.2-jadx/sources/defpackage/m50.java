package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class m50 extends tw2 implements mn0 {
    public z62 l;
    public id m;
    public int n;
    public final /* synthetic */ float o;
    public final /* synthetic */ n50 p;
    public final /* synthetic */ em2 q;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m50(float f, n50 n50Var, em2 em2Var, t00 t00Var) {
        super(2, t00Var);
        this.o = f;
        this.p = n50Var;
        this.q = em2Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        return ((m50) p((t00) obj2, (j20) obj)).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        return new m50(this.o, this.p, this.q, t00Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        float f;
        id idVar;
        z62 z62Var;
        id idVar2;
        r40 r40Var;
        pc pcVar;
        Object objM;
        Object obj2;
        int i = this.n;
        if (i == 0) {
            fg1.T(obj);
            f = this.o;
            if (Math.abs(f) > 1.0f) {
                z62 z62Var2 = new z62();
                z62Var2.h = f;
                z62 z62Var3 = new z62();
                id idVarA = s11.a(f, 28);
                try {
                    n50 n50Var = this.p;
                    r40Var = n50Var.a;
                    pcVar = new pc(z62Var3, this.q, z62Var2, n50Var, 3);
                    this.l = z62Var2;
                    this.m = idVarA;
                    this.n = 1;
                    idVar = idVarA;
                } catch (CancellationException unused) {
                    idVar = idVarA;
                }
                try {
                    objM = te.m(idVar, new q40(r40Var, rg3.n, idVarA.i.getValue(), idVarA.j), Long.MIN_VALUE, pcVar, this);
                    obj2 = k20.h;
                    if (objM != obj2) {
                        objM = a83.a;
                    }
                } catch (CancellationException unused2) {
                    z62Var = z62Var2;
                    idVar2 = idVar;
                    z62Var.h = ((Number) idVar2.h.b.j(idVar2.j)).floatValue();
                }
                if (objM == obj2) {
                    return obj2;
                }
                z62Var = z62Var2;
                f = z62Var.h;
            }
        } else {
            if (i != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            idVar2 = this.m;
            z62Var = this.l;
            try {
                fg1.T(obj);
            } catch (CancellationException unused3) {
                z62Var.h = ((Number) idVar2.h.b.j(idVar2.j)).floatValue();
            }
            f = z62Var.h;
        }
        return new Float(f);
    }
}
