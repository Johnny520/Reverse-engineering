package p000;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: renamed from: g7 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0230g7 extends w51 implements in0 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f3333i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0267h7 f3334j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0230g7(ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7, int i) {
        super(1);
        this.f3333i = i;
        this.f3334j = viewOnAttachStateChangeListenerC0267h7;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f3333i;
        ViewOnAttachStateChangeListenerC0267h7 viewOnAttachStateChangeListenerC0267h7 = this.f3334j;
        switch (i) {
            case 0:
                View view = viewOnAttachStateChangeListenerC0267h7.f3864k;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                jl2 jl2Var = (jl2) obj;
                if (jl2Var.f5099i.contains(jl2Var)) {
                    bw1 snapshotObserver = viewOnAttachStateChangeListenerC0267h7.f3864k.getSnapshotObserver();
                    snapshotObserver.f1051a.m5436c(jl2Var, viewOnAttachStateChangeListenerC0267h7.f3863T, new C0723t6(1, jl2Var, viewOnAttachStateChangeListenerC0267h7));
                }
                return a83.f116a;
        }
    }
}
