package p000;

import android.view.ActionMode;
import me.dartcv.nuke.R;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: f8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0194f8 implements aa0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2844a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2845b;

    public /* synthetic */ C0194f8(int i, Object obj) {
        this.f2844a = i;
        this.f2845b = obj;
    }

    @Override // p000.aa0
    /* JADX INFO: renamed from: a */
    public final void mo120a() {
        int i = this.f2844a;
        Object obj = this.f2845b;
        switch (i) {
            case 0:
                p80 p80Var = (p80) obj;
                p80Var.dismiss();
                p80Var.f8029o.m3468f();
                break;
            case 1:
                d22 d22Var = (d22) obj;
                d22Var.m3468f();
                d22Var.setTag(R.id.view_tree_lifecycle_owner, null);
                d22Var.f1838w.removeViewImmediate(d22Var);
                break;
            case 2:
                C0492nb c0492nb = (C0492nb) obj;
                ts2 ts2Var = c0492nb.f7095e;
                rl1 rl1Var = ts2Var.f10954h;
                if (rl1Var != null) {
                    rl1Var.m4512a();
                }
                ts2Var.m5434a();
                ActionMode actionMode = c0492nb.f7098h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                c0492nb.f7098h = null;
                break;
            case 3:
                C0206fk c0206fk = (C0206fk) ((C0243gk) obj).f3547c.getValue();
                if (c0206fk != null) {
                    c0206fk.close();
                }
                break;
            case 4:
                ((da0) obj).f1944i.mo6a();
                break;
            case 5:
                ((b03) obj).m351o();
                break;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ((y71) obj).f13334d = null;
                break;
            case 7:
                j81 j81Var = (j81) obj;
                f90 f90Var = j81Var.f4915c;
                if (f90Var != null) {
                    f90Var.f2862a = false;
                }
                j81Var.f4915c = null;
                break;
            case 8:
                ((e81) obj).f2349f = true;
                break;
            case 9:
                xk1 xk1Var = (xk1) obj;
                if (((z22) xk1Var.getValue()) != null) {
                    xk1Var.setValue(null);
                }
                break;
            default:
                ((y33) obj).m6219i();
                break;
        }
    }
}
