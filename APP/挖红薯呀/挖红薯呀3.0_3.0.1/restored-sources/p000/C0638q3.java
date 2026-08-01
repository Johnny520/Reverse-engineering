package p000;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: renamed from: q3 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0638q3 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5033d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0875w3 f5034e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0638q3(ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3, int i) {
        super(1);
        this.f5033d = i;
        this.f5034e = viewTreeObserverOnGlobalLayoutListenerC0875w3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f5033d;
        na1 na1Var = na1.f4229a;
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = this.f5034e;
        switch (i) {
            case 0:
                int i2 = ((C0665qu) obj).f5222a;
                C1017zu c1017zu = (C1017zu) viewTreeObserverOnGlobalLayoutListenerC0875w3.getFocusOwner();
                ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w32 = c1017zu.f7996a;
                zt0 zt0Var = new zt0();
                zt0Var.f7995d = Boolean.FALSE;
                C0149dv c0149dvM5612f = c1017zu.m5612f();
                Boolean boolM5611e = c1017zu.m5611e(i2, viewTreeObserverOnGlobalLayoutListenerC0875w32.getEmbeddedViewFocusRect(), new C0976yu(i2, zt0Var));
                if ((!p30.m3002l(boolM5611e, Boolean.TRUE) || c0149dvM5612f == c1017zu.m5612f()) && boolM5611e != null && zt0Var.f7995d != null && boolM5611e.booleanValue()) {
                    ((Boolean) zt0Var.f7995d).getClass();
                }
                break;
            default:
                InterfaceC0298hw interfaceC0298hw = (InterfaceC0298hw) obj;
                viewTreeObserverOnGlobalLayoutListenerC0875w3.getUncaughtExceptionHandler$ui();
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC0875w3.getHandler();
                if ((handler != null ? handler.getLooper() : null) != Looper.myLooper()) {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC0875w3.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0824v1(1, interfaceC0298hw));
                    }
                } else {
                    interfaceC0298hw.invoke();
                }
                break;
        }
        return na1Var;
    }
}
