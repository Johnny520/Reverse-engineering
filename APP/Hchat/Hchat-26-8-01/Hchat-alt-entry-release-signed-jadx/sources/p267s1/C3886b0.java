package p267s1;

import android.view.MotionEvent;
import gg.AbstractC1417m;
import gg.AbstractC1428x;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p339x1.InterfaceC5641r1;
import p340x2.C5687v;
import p357y1.ViewTreeObserverOnGlobalLayoutListenerC5934t;

/* JADX INFO: renamed from: s1.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3886b0 extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f12746g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C5687v f12747h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3886b0(C5687v c5687v, int i9) {
        super(1);
        this.f12746g = i9;
        this.f12747h = c5687v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f12746g) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                C5687v c5687v = this.f12747h;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = c5687v.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = c5687v.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                break;
            case 1:
                InterfaceC5641r1 interfaceC5641r1 = (InterfaceC5641r1) obj;
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = interfaceC5641r1 instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t ? (ViewTreeObserverOnGlobalLayoutListenerC5934t) interfaceC5641r1 : null;
                C5687v c5687v2 = this.f12747h;
                if (viewTreeObserverOnGlobalLayoutListenerC5934t != null) {
                    viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().removeViewInLayout(c5687v2);
                    AbstractC1428x.m3837b(viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().getLayoutNodeToHolder()).remove(viewTreeObserverOnGlobalLayoutListenerC5934t.getAndroidViewsHandler$ui().getHolderToLayoutNode().remove(c5687v2));
                    c5687v2.setImportantForAccessibility(0);
                }
                c5687v2.removeAllViewsInLayout();
                break;
            default:
                this.f12747h.f23101w = (InterfaceC1231l) obj;
                break;
        }
        return C3967n.f12976a;
    }
}
