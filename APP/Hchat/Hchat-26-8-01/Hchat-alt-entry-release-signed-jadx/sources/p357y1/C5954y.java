package p357y1;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import gg.AbstractC1417m;
import p028c1.C0372b;
import p085fg.InterfaceC1231l;
import p276sf.C3967n;
import p339x1.C5647t1;

/* JADX INFO: renamed from: y1.y */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5954y extends AbstractC1417m implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f24190g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC5958z f24191h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5954y(ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z, int i9) {
        super(1);
        this.f24190g = i9;
        this.f24191h = viewOnAttachStateChangeListenerC5958z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f24190g) {
            case 0:
                View view = this.f24191h.f24215j;
                return Boolean.valueOf(view.getParent().requestSendAccessibilityEvent(view, (AccessibilityEvent) obj));
            default:
                C5877e2 c5877e2 = (C5877e2) obj;
                if (c5877e2.f23851h.contains(c5877e2)) {
                    ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = this.f24191h;
                    C5647t1 snapshotObserver = viewOnAttachStateChangeListenerC5958z.f24215j.getSnapshotObserver();
                    snapshotObserver.f23001a.m9162c(c5877e2, viewOnAttachStateChangeListenerC5958z.f24214S, new C0372b(c5877e2, 9, viewOnAttachStateChangeListenerC5958z));
                }
                return C3967n.f12976a;
        }
    }
}
