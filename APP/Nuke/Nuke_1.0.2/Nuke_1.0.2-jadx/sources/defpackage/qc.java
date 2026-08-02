package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class qc extends tw2 implements in0 {
    public id l;
    public y62 m;
    public int n;
    public final /* synthetic */ sc o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ cy2 q;
    public final /* synthetic */ long r;
    public final /* synthetic */ in0 s;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc(sc scVar, Object obj, cy2 cy2Var, long j, in0 in0Var, t00 t00Var) {
        super(1, t00Var);
        this.o = scVar;
        this.p = obj;
        this.q = cy2Var;
        this.r = j;
        this.s = in0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        long j = this.r;
        in0 in0Var = this.s;
        return new qc(this.o, this.p, this.q, j, in0Var, (t00) obj).r(a83.a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final Object r(Object obj) {
        sc scVar;
        id idVar;
        y62 y62Var;
        long j;
        pc pcVar;
        id idVar2;
        y62 y62Var2;
        CancellationException cancellationException;
        cy2 cy2Var = this.q;
        int i = this.n;
        sc scVar2 = this.o;
        if (i == 0) {
            fg1.T(obj);
            try {
                scVar2.c.j = (nd) scVar2.a.a.j(this.p);
                scVar2.e.setValue(cy2Var.c);
                scVar2.d.setValue(Boolean.TRUE);
                id idVar3 = scVar2.c;
                idVar = new id(idVar3.h, idVar3.i.getValue(), t11.r(idVar3.j), idVar3.k, Long.MIN_VALUE, idVar3.m);
                y62Var = new y62();
                j = this.r;
                pcVar = new pc(scVar2, idVar, this.s, y62Var, 0);
                scVar = scVar2;
            } catch (CancellationException e) {
                e = e;
                scVar = scVar2;
                cancellationException = e;
                sc.b(scVar);
                throw cancellationException;
            }
            try {
                this.l = idVar;
                this.m = y62Var;
                this.n = 1;
                Object objM = te.m(idVar, cy2Var, j, pcVar, this);
                k20 k20Var = k20.h;
                if (objM == k20Var) {
                    return k20Var;
                }
                idVar2 = idVar;
                y62Var2 = y62Var;
            } catch (CancellationException e2) {
                e = e2;
                cancellationException = e;
                sc.b(scVar);
                throw cancellationException;
            }
        } else {
            if (i != 1) {
                s.l("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y62Var2 = this.m;
            idVar2 = this.l;
            try {
                fg1.T(obj);
                scVar = scVar2;
            } catch (CancellationException e3) {
                cancellationException = e3;
                scVar = scVar2;
                sc.b(scVar);
                throw cancellationException;
            }
        }
        fd fdVar = y62Var2.h ? fd.h : fd.i;
        sc.b(scVar);
        return new sz0(2, idVar2, fdVar);
    }
}
