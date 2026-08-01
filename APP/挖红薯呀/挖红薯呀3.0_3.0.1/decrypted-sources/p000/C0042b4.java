package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: b4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0042b4 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f366d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0078c4 f367e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0042b4(ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4, int i) {
        super(1);
        this.f366d = i;
        this.f367e = viewOnAttachStateChangeListenerC0078c4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f366d;
        ViewOnAttachStateChangeListenerC0078c4 viewOnAttachStateChangeListenerC0078c4 = this.f367e;
        switch (i) {
            case 0:
                View view = viewOnAttachStateChangeListenerC0078c4.f669g;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                my0 my0Var = (my0) obj;
                if (my0Var.f4077e.contains(my0Var)) {
                    fn0 snapshotObserver = viewOnAttachStateChangeListenerC0078c4.f669g.getSnapshotObserver();
                    snapshotObserver.f1778a.m777b(my0Var, viewOnAttachStateChangeListenerC0078c4.f668Q, new C0458m3(2, my0Var, viewOnAttachStateChangeListenerC0078c4));
                }
                return na1.f4229a;
        }
    }
}
