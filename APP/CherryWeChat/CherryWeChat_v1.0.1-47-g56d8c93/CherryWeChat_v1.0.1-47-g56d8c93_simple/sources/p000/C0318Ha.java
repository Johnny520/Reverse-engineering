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

    public /* synthetic */ C0318Ha(int r1, Object r2) {
        this.f1045a = r1;
        this.f1046b = r2;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn r2, EnumC0632On r3) {
        switch(this.f1045a) {
            case 0: goto L18;
            case 1: goto L11;
            default: goto L4;
        };
    L4:
        C1518hx r22 = (C1518hx) this.f1046b;
        if (r3 != EnumC0632On.ON_START) goto L8;
        r22.f5374f = true;
        return;
    L8:
        if (r3 != EnumC0632On.ON_STOP) goto L27;
        r22.f5374f = false;
        return;
    L27:
        return;
    L11:
        AbstractActivityC2148ki r23 = (AbstractActivityC2148ki) this.f1046b;
        if (r3 != EnumC0632On.ON_DESTROY) goto L28;
        r23.f2627c.f142b = null;
        if (r23.isChangingConfigurations() == true) goto L16;
        r23.getViewModelStore().m5282a();
    L16:
        ViewTreeObserverOnDrawListenerC0619Oa r24 = r23.f2631g;
        AbstractActivityC2148ki r32 = r24.f1982d;
        r32.getWindow().getDecorView().removeCallbacks(r24);
        r32.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(r24);
        return;
    L28:
        return;
    L18:
        AbstractActivityC2148ki r25 = (AbstractActivityC2148ki) this.f1046b;
        if (r3 != EnumC0632On.ON_STOP) goto L29;
        Window r26 = r25.getWindow();
        if (r26 == null) goto L30;
        View r27 = r26.peekDecorView();
        if (r27 == null) goto L31;
        r27.cancelPendingInputEvents();
        return;
    L31:
        return;
    L30:
        return;
    }
}
