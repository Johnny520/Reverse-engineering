package defpackage;

import android.view.MotionEvent;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cc extends w51 implements in0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ab3 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cc(ab3 ab3Var, int i) {
        super(1);
        this.i = i;
        this.j = ab3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        boolean zDispatchTouchEvent;
        int i = this.i;
        a83 a83Var = a83.a;
        ab3 ab3Var = this.j;
        switch (i) {
            case 0:
                zv1 zv1Var = (zv1) obj;
                b7 b7Var = zv1Var instanceof b7 ? (b7) zv1Var : null;
                if (b7Var != null) {
                    b7Var.getAndroidViewsHandler$ui().removeViewInLayout(ab3Var);
                    xe1.e(b7Var.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(b7Var.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(ab3Var));
                    ab3Var.setImportantForAccessibility(0);
                }
                ab3Var.removeAllViewsInLayout();
                return a83Var;
            case 1:
                ab3Var.x = (in0) obj;
                return a83Var;
            default:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case AIChatConfig.DefaultContextRounds /* 6 */:
                        zDispatchTouchEvent = ab3Var.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = ab3Var.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
        }
    }
}
