package p000;

import android.view.WindowInsets;

/* JADX INFO: renamed from: bc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0050bc extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f769i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ab3 f770j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ r61 f771k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0050bc(ab3 ab3Var, r61 r61Var, int i) {
        super(1);
        this.f769i = i;
        this.f770j = ab3Var;
        this.f771k = r61Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        WindowInsets windowInsetsM770b;
        int i = this.f769i;
        a83 a83Var = a83.f116a;
        r61 r61Var = this.f771k;
        ab3 ab3Var = this.f770j;
        switch (i) {
            case 0:
                zv1 zv1Var = (zv1) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = zv1Var instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7 ? (ViewTreeObserverOnGlobalLayoutListenerC0045b7) zv1Var : null;
                if (viewTreeObserverOnGlobalLayoutListenerC0045b7 != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().getHolderToLayoutNode().put(ab3Var, r61Var);
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().addView(ab3Var);
                    viewTreeObserverOnGlobalLayoutListenerC0045b7.getAndroidViewsHandler$ui().getLayoutNodeToHolder().put(r61Var, ab3Var);
                    ab3Var.setImportantForAccessibility(1);
                    wa3.m5862a(ab3Var, new C0606q6(viewTreeObserverOnGlobalLayoutListenerC0045b7, r61Var, viewTreeObserverOnGlobalLayoutListenerC0045b7));
                }
                if (ab3Var.getView().getParent() != ab3Var) {
                    ab3Var.addView(ab3Var.getView());
                }
                break;
            case 1:
                op0.m3584f(ab3Var, r61Var);
                break;
            default:
                op0.m3584f(ab3Var, r61Var);
                ((ViewTreeObserverOnGlobalLayoutListenerC0045b7) ab3Var.f4534j).f654O = true;
                int[] iArr = ab3Var.f4545u;
                int i2 = iArr[0];
                int i3 = iArr[1];
                ab3Var.getView().getLocationOnScreen(iArr);
                long j = ab3Var.f4546v;
                long jMo645L = ((c61) obj).mo645L();
                ab3Var.f4546v = jMo645L;
                cf3 cf3Var = ab3Var.f4547w;
                if (cf3Var != null && ((i2 != iArr[0] || i3 != iArr[1] || !h11.m2041a(j, jMo645L)) && (windowInsetsM770b = ab3Var.m2323g(cf3Var).m770b()) != null)) {
                    ab3Var.getView().dispatchApplyWindowInsets(windowInsetsM770b);
                }
                break;
        }
        return a83Var;
    }
}
