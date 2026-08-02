package defpackage;

import android.view.ActionMode;
import me.dartcv.nuke.R;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f8 implements aa0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ f8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.aa0
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                p80 p80Var = (p80) obj;
                p80Var.dismiss();
                p80Var.o.f();
                break;
            case 1:
                d22 d22Var = (d22) obj;
                d22Var.f();
                d22Var.setTag(R.id.view_tree_lifecycle_owner, null);
                d22Var.w.removeViewImmediate(d22Var);
                break;
            case 2:
                nb nbVar = (nb) obj;
                ts2 ts2Var = nbVar.e;
                rl1 rl1Var = ts2Var.h;
                if (rl1Var != null) {
                    rl1Var.a();
                }
                ts2Var.a();
                ActionMode actionMode = nbVar.h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                nbVar.h = null;
                break;
            case 3:
                fk fkVar = (fk) ((gk) obj).c.getValue();
                if (fkVar != null) {
                    fkVar.close();
                }
                break;
            case 4:
                ((da0) obj).i.a();
                break;
            case 5:
                ((b03) obj).o();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((y71) obj).d = null;
                break;
            case 7:
                j81 j81Var = (j81) obj;
                f90 f90Var = j81Var.c;
                if (f90Var != null) {
                    f90Var.a = false;
                }
                j81Var.c = null;
                break;
            case 8:
                ((e81) obj).f = true;
                break;
            case 9:
                xk1 xk1Var = (xk1) obj;
                if (((z22) xk1Var.getValue()) != null) {
                    xk1Var.setValue(null);
                }
                break;
            default:
                ((y33) obj).i();
                break;
        }
    }
}
