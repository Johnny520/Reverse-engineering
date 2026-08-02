package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: w6 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0836w6 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f12361i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0045b7 f12362j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0836w6(ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7, int i) {
        super(1);
        this.f12361i = i;
        this.f12362j = viewTreeObserverOnGlobalLayoutListenerC0045b7;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f12361i;
        a83 a83Var = a83.f116a;
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7 = this.f12362j;
        switch (i) {
            case 0:
                ((bl0) viewTreeObserverOnGlobalLayoutListenerC0045b7.getFocusOwner()).m562g(((ok0) obj).f7701a, false);
                return a83Var;
            case 1:
                xm0 xm0Var = (xm0) obj;
                viewTreeObserverOnGlobalLayoutListenerC0045b7.getUncaughtExceptionHandler$ui();
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC0045b7.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    xm0Var.mo6a();
                } else {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC0045b7.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0413l6(xm0Var, 1));
                    }
                }
                return a83Var;
            default:
                return new C0233ga(viewTreeObserverOnGlobalLayoutListenerC0045b7, viewTreeObserverOnGlobalLayoutListenerC0045b7.getTextInputService(), (j20) obj);
        }
    }
}
