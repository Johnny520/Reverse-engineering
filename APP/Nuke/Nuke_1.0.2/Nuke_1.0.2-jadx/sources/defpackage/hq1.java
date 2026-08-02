package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hq1 implements uk2, sq2 {
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hq1(Object obj, Object obj2) {
        this.h = obj;
        this.i = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.sq2
    public boolean a() {
        p22 p22Var = (p22) this.h;
        ui uiVar = (ui) this.i;
        if (!p22Var.x) {
            p22Var.h();
            uiVar.a = ui.a(p22Var.v, uiVar.a);
            p22Var.x = !p22Var.g(p22Var.u, r1 + uiVar.b);
        }
        return p22Var.x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.uk2
    public vk2 d(th2 th2Var) {
        iz izVar = (iz) this.h;
        File file = (File) this.i;
        vk2 vk2VarD = izVar.d(th2Var);
        return new vk2(vk2VarD.a, vk2VarD.b, file != null ? wi0.g0(file, th2Var.c) : null);
    }
}
