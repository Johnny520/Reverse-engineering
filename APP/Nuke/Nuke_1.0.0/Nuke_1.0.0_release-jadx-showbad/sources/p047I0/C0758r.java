package p047I0;

import android.os.Handler;
import android.os.Looper;
import me.dartcv.nuke.BuildConfig;
import p028F.RunnableC0342c;
import p056K2.C0891q;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p160f3.InterfaceC2160t;
import p198m0.C2575f;
import p198m0.C2584o;

/* JADX INFO: renamed from: I0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0758r extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2374e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0772y f2375f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0758r(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, int i5) {
        super(1);
        this.f2374e = i5;
        this.f2375f = viewTreeObserverOnGlobalLayoutListenerC0772y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f2374e) {
            case 0:
                ((C2584o) this.f2375f.getFocusOwner()).m4532g(((C2575f) obj).f8210a, false);
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) obj;
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = this.f2375f;
                viewTreeObserverOnGlobalLayoutListenerC0772y.getUncaughtExceptionHandler$ui();
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC0772y.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1599a.mo6a();
                } else {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC0772y.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0342c(interfaceC1599a, 1));
                    }
                }
                return C0891q.f2780a;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y2 = this.f2375f;
                return new C0696T(viewTreeObserverOnGlobalLayoutListenerC0772y2, viewTreeObserverOnGlobalLayoutListenerC0772y2.getTextInputService(), (InterfaceC2160t) obj);
        }
    }
}
