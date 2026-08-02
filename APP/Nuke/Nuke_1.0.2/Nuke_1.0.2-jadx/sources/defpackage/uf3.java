package defpackage;

import java.util.ArrayList;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uf3 implements fa1 {
    public final /* synthetic */ s00 h;
    public final /* synthetic */ xb i;
    public final /* synthetic */ i62 j;
    public final /* synthetic */ o72 k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public uf3(s00 s00Var, xb xbVar, i62 i62Var, o72 o72Var) {
        this.h = s00Var;
        this.i = xbVar;
        this.j = i62Var;
        this.k = o72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fa1
    public final void g(ia1 ia1Var, z91 z91Var) {
        boolean z;
        lp lpVarY = null;
        switch (tf3.a[z91Var.ordinal()]) {
            case 1:
                p7.A(this.h, null, new k9(this.k, this.j, ia1Var, this, null, 11), 1);
                return;
            case 2:
                xb xbVar = this.i;
                if (xbVar != null) {
                    f90 f90Var = (f90) xbVar.j;
                    synchronized (f90Var.b) {
                        try {
                            synchronized (f90Var.b) {
                                z = f90Var.a;
                            }
                            if (!z) {
                                ArrayList arrayList = (ArrayList) f90Var.c;
                                f90Var.c = (ArrayList) f90Var.d;
                                f90Var.d = arrayList;
                                f90Var.a = true;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    ((t00) arrayList.get(i)).h(a83.a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                i62 i62Var = this.j;
                synchronized (i62Var.c) {
                    if (i62Var.t) {
                        i62Var.t = false;
                        lpVarY = i62Var.y();
                    }
                    break;
                }
                if (lpVarY != null) {
                    ((mp) lpVarY).h(a83.a);
                    return;
                }
                return;
            case 3:
                i62 i62Var2 = this.j;
                synchronized (i62Var2.c) {
                    i62Var2.t = true;
                }
                return;
            case 4:
                this.j.x();
                return;
            case 5:
            case AIChatConfig.DefaultContextRounds /* 6 */:
            case 7:
                return;
            default:
                c80.s();
                return;
        }
    }
}
