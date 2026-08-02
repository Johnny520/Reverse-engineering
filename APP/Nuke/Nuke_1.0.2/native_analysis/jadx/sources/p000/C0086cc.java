package p000;

import android.view.MotionEvent;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: cc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0086cc extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f1472i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ab3 f1473j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0086cc(ab3 ab3Var, int i) {
        super(1);
        this.f1472i = i;
        this.f1473j = ab3Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        boolean zDispatchTouchEvent;
        int i = this.f1472i;
        a83 a83Var = a83.f116a;
        ab3 ab3Var = this.f1473j;
        switch (i) {
            case 0:
                zv1 zv1Var = (zv1) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = zv1Var instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7 ? (ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var : null;
                if (viewTreeObserverOnGlobalLayoutListenerC0045b7 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().removeViewInLayout(ab3Var);
                    xe1.m6117e(viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(ab3Var));
                    ab3Var.setImportantForAccessibility(0);
                }
                ab3Var.removeAllViewsInLayout();
                return a83Var;
            case 1:
                ab3Var.f4548x = (in0) obj;
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
