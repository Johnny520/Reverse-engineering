package p007B0;

import android.view.MotionEvent;
import me.dartcv.nuke.BuildConfig;
import p041H0.InterfaceC0614q0;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p117X2.AbstractC1678w;
import p170h1.C2233x;

/* JADX INFO: renamed from: B0.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0175H extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f620e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2233x f621f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0175H(C2233x c2233x, int i5) {
        super(1);
        this.f620e = i5;
        this.f621f = c2233x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f620e) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                C2233x c2233x = this.f621f;
                switch (actionMasked) {
                    case 0:
                    case BuildConfig.VERSION_CODE /* 1 */:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = c2233x.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = c2233x.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC0614q0 interfaceC0614q0 = (InterfaceC0614q0) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = interfaceC0614q0 instanceof ViewTreeObserverOnGlobalLayoutListenerC0772y ? (ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0 : null;
                C2233x c2233x2 = this.f621f;
                if (viewTreeObserverOnGlobalLayoutListenerC0772y != null) {
                    viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui().removeViewInLayout(c2233x2);
                    AbstractC1678w.m2997a(viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC0772y.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(c2233x2));
                    c2233x2.setImportantForAccessibility(0);
                }
                c2233x2.removeAllViewsInLayout();
                break;
            default:
                this.f621f.f7247t = (InterfaceC1601c) obj;
                break;
        }
        return C0891q.f2780a;
    }
}
