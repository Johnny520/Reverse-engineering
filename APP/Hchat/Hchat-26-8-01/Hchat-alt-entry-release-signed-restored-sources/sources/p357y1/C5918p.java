package p357y1;

import android.os.Handler;
import android.os.Looper;
import gg.AbstractC1417m;
import p015b0.RunnableC0133c;
import p041d1.C0660f;
import p041d1.C0670p;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p249qg.InterfaceC3599t;
import p276sf.C3967n;

/* JADX INFO: renamed from: y1.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5918p extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24026g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC5934t f24027h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5918p(ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t, int i9) {
        super(1);
        this.f24026g = i9;
        this.f24027h = viewTreeObserverOnGlobalLayoutListenerC5934t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f24026g) {
            case 0:
                ((C0670p) this.f24027h.getFocusOwner()).m1849g(((C0660f) obj).f2040a, false);
                return C3967n.f12976a;
            case 1:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj;
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t = this.f24027h;
                viewTreeObserverOnGlobalLayoutListenerC5934t.getUncaughtExceptionHandler$ui();
                Handler handler = viewTreeObserverOnGlobalLayoutListenerC5934t.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    interfaceC1220a.invoke();
                } else {
                    Handler handler2 = viewTreeObserverOnGlobalLayoutListenerC5934t.getHandler();
                    if (handler2 != null) {
                        handler2.post(new RunnableC0133c(interfaceC1220a, 7));
                    }
                }
                return C3967n.f12976a;
            default:
                ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t2 = this.f24027h;
                return new C5899k0(viewTreeObserverOnGlobalLayoutListenerC5934t2, viewTreeObserverOnGlobalLayoutListenerC5934t2.getTextInputService(), (InterfaceC3599t) obj);
        }
    }
}
