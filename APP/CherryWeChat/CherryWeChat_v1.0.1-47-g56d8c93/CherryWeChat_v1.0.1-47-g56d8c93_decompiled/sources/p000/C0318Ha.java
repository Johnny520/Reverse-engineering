package p000;

import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: Ha */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0318Ha implements InterfaceC0889Un {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1046b;

    public /* synthetic */ C0318Ha(int i, Object obj) {
        this.f1045a = i;
        this.f1046b = obj;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
        Window window;
        View viewPeekDecorView;
        switch (this.f1045a) {
            case 0:
                AbstractActivityC2148ki abstractActivityC2148ki = (AbstractActivityC2148ki) this.f1046b;
                if (enumC0632On == EnumC0632On.ON_STOP && (window = abstractActivityC2148ki.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC2148ki abstractActivityC2148ki2 = (AbstractActivityC2148ki) this.f1046b;
                if (enumC0632On == EnumC0632On.ON_DESTROY) {
                    abstractActivityC2148ki2.f2627c.f142b = null;
                    if (!abstractActivityC2148ki2.isChangingConfigurations()) {
                        abstractActivityC2148ki2.getViewModelStore().m5282a();
                    }
                    ViewTreeObserverOnDrawListenerC0619Oa viewTreeObserverOnDrawListenerC0619Oa = abstractActivityC2148ki2.f2631g;
                    AbstractActivityC2148ki abstractActivityC2148ki3 = viewTreeObserverOnDrawListenerC0619Oa.f1982d;
                    abstractActivityC2148ki3.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0619Oa);
                    abstractActivityC2148ki3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0619Oa);
                }
                break;
            default:
                C1518hx c1518hx = (C1518hx) this.f1046b;
                if (enumC0632On == EnumC0632On.ON_START) {
                    c1518hx.f5374f = true;
                } else if (enumC0632On == EnumC0632On.ON_STOP) {
                    c1518hx.f5374f = false;
                }
                break;
        }
    }
}
