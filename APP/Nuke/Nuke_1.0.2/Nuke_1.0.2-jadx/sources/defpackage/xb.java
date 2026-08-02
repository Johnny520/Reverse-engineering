package defpackage;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xb implements y10 {
    public final /* synthetic */ int h;
    public final Object i;
    public final Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public xb(c62 c62Var) {
        this.h = 1;
        this.i = c62Var;
        this.j = new cj(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(in0 in0Var, t00 t00Var) {
        ry1 ry1Var;
        boolean z;
        Object objT;
        switch (this.h) {
            case 0:
                vb vbVar = (vb) this.j;
                mp mpVar = new mp(1, gf1.z(t00Var));
                mpVar.u();
                wb wbVar = new wb(mpVar, this, in0Var);
                if (t11.l(vbVar.j, (Choreographer) this.i)) {
                    synchronized (vbVar.l) {
                        vbVar.n.add(wbVar);
                        if (!vbVar.q) {
                            vbVar.q = true;
                            vbVar.j.postFrameCallback(vbVar.r);
                        }
                        break;
                    }
                    mpVar.w(new fa(3, vbVar, wbVar));
                } else {
                    ((Choreographer) this.i).postFrameCallback(wbVar);
                    mpVar.w(new fa(4, this, wbVar));
                }
                return mpVar.t();
            case 1:
                mp mpVar2 = new mp(1, gf1.z(t00Var));
                mpVar2.u();
                cj cjVar = (cj) this.j;
                ym ymVar = new ym();
                ymVar.a = mpVar2;
                ymVar.b = in0Var;
                mpVar2.w(new zm(0, cjVar.d(ymVar, (c62) this.i)));
                return mpVar2.t();
            default:
                if (t00Var instanceof ry1) {
                    ry1Var = (ry1) t00Var;
                    int i = ry1Var.n;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        ry1Var.n = i - Integer.MIN_VALUE;
                    } else {
                        ry1Var = new ry1(this, t00Var);
                    }
                }
                Object obj = ry1Var.l;
                k20 k20Var = k20.h;
                int i2 = ry1Var.n;
                if (i2 == 0) {
                    fg1.T(obj);
                    f90 f90Var = (f90) this.j;
                    ry1Var.k = in0Var;
                    ry1Var.n = 1;
                    synchronized (f90Var.b) {
                        z = f90Var.a;
                    }
                    if (z) {
                        objT = a83.a;
                    } else {
                        mp mpVar3 = new mp(1, gf1.z(ry1Var));
                        mpVar3.u();
                        synchronized (f90Var.b) {
                            ((ArrayList) f90Var.c).add(mpVar3);
                        }
                        mpVar3.w(new zh(6, f90Var, mpVar3));
                        objT = mpVar3.t();
                        if (objT != k20Var) {
                            objT = a83.a;
                        }
                    }
                    if (objT != k20Var) {
                    }
                    return k20Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        fg1.T(obj);
                        return obj;
                    }
                    s.l("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                in0Var = ry1Var.k;
                fg1.T(obj);
                xb xbVar = (xb) this.i;
                ry1Var.k = null;
                ry1Var.n = 2;
                Object objA = xbVar.a(in0Var, ry1Var);
                if (objA != k20Var) {
                    return objA;
                }
                return k20Var;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.y10
    public z10 getKey() {
        return gd3.A;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 k(a20 a20Var) {
        switch (this.h) {
        }
        return xe1.f0(this, a20Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final y10 o(z10 z10Var) {
        switch (this.h) {
        }
        return xe1.u(this, z10Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final Object r(mn0 mn0Var, Object obj) {
        switch (this.h) {
        }
        return mn0Var.g(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.a20
    public final a20 u(z10 z10Var) {
        switch (this.h) {
        }
        return xe1.W(this, z10Var);
    }

    public xb(xb xbVar) {
        this.h = 2;
        this.i = xbVar;
        this.j = new f90();
    }

    public xb(Choreographer choreographer, vb vbVar) {
        this.h = 0;
        this.i = choreographer;
        this.j = vbVar;
    }
}
