package p047I0;

import android.view.accessibility.AccessibilityEvent;
import p007B0.C0190d;
import p041H0.C0618s0;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;

/* JADX INFO: renamed from: I0.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0665D extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2104e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ViewOnAttachStateChangeListenerC0667E f2105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0665D(ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E, int i5) {
        super(1);
        this.f2104e = i5;
        this.f2105f = viewOnAttachStateChangeListenerC0667E;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f2104e) {
            case 0:
                ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E = this.f2105f;
                return Boolean.valueOf(viewOnAttachStateChangeListenerC0667E.f2128g.getParent().requestSendAccessibilityEvent(viewOnAttachStateChangeListenerC0667E.f2128g, (AccessibilityEvent) obj));
            default:
                C0682L0 c0682l0 = (C0682L0) obj;
                if (c0682l0.f2164e.contains(c0682l0)) {
                    ViewOnAttachStateChangeListenerC0667E viewOnAttachStateChangeListenerC0667E2 = this.f2105f;
                    C0618s0 snapshotObserver = viewOnAttachStateChangeListenerC0667E2.f2128g.getSnapshotObserver();
                    snapshotObserver.f1972a.m3867c(c0682l0, viewOnAttachStateChangeListenerC0667E2.f2127Q, new C0190d(4, c0682l0, viewOnAttachStateChangeListenerC0667E2));
                }
                return C0891q.f2780a;
        }
    }
}
