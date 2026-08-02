package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vf0 implements xm0 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ int i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ vf0(int i, String str, wf0 wf0Var) {
        this.i = i;
        this.j = str;
        this.k = wf0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.xm0
    public final Object a() {
        int i = this.h;
        Object obj = this.k;
        int i2 = this.i;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                String str = (String) obj2;
                wf0 wf0Var = (wf0) obj;
                yo2[] yo2VarArr = new yo2[i2];
                for (int i3 = 0; i3 < i2; i3++) {
                    yo2VarArr[i3] = up0.j(str + '.' + wf0Var.e[i3], yv2.j, new yo2[0]);
                }
                return yo2VarArr;
            default:
                qv0 qv0Var = (qv0) obj2;
                try {
                    qv0Var.D.k(i2, (cg0) obj);
                    break;
                } catch (IOException e) {
                    cg0 cg0Var = cg0.PROTOCOL_ERROR;
                    qv0Var.b(cg0Var, cg0Var, e);
                }
                return a83.a;
        }
    }

    public /* synthetic */ vf0(qv0 qv0Var, int i, cg0 cg0Var) {
        this.j = qv0Var;
        this.i = i;
        this.k = cg0Var;
    }
}
