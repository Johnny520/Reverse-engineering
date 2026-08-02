package defpackage;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mv0 implements xm0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ int j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ mv0(bo0 bo0Var, int i) {
        this.h = 3;
        this.i = bo0Var;
        this.j = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        switch (this.h) {
            case 0:
                qv0 qv0Var = (qv0) this.i;
                int i = this.j;
                qv0Var.r.getClass();
                try {
                    qv0Var.D.k(i, cg0.CANCEL);
                    synchronized (qv0Var) {
                        qv0Var.F.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return a83.a;
            case 1:
                qv0 qv0Var2 = (qv0) this.i;
                int i2 = this.j;
                qv0Var2.r.getClass();
                synchronized (qv0Var2) {
                    qv0Var2.F.remove(Integer.valueOf(i2));
                }
                return a83.a;
            case 2:
                qv0 qv0Var3 = (qv0) this.i;
                int i3 = this.j;
                qv0Var3.r.getClass();
                try {
                    qv0Var3.D.k(i3, cg0.CANCEL);
                    synchronized (qv0Var3) {
                        qv0Var3.F.remove(Integer.valueOf(i3));
                    }
                } catch (IOException unused2) {
                }
                return a83.a;
            default:
                bo0 bo0Var = (bo0) this.i;
                return Integer.valueOf(((y03) bo0Var.e).b.d(this.j));
        }
    }

    public /* synthetic */ mv0(qv0 qv0Var, int i, Object obj, int i2) {
        this.h = i2;
        this.i = qv0Var;
        this.j = i;
    }

    public /* synthetic */ mv0(qv0 qv0Var, int i, List list, boolean z) {
        this.h = 2;
        this.i = qv0Var;
        this.j = i;
    }
}
