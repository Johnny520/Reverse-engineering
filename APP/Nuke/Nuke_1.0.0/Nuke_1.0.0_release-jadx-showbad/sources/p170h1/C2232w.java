package p170h1;

import android.view.View;
import p169h0.AbstractC2206o;
import p198m0.AbstractC2577h;
import p198m0.InterfaceC2586q;
import p198m0.InterfaceC2589t;

/* JADX INFO: renamed from: h1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C2232w extends AbstractC2206o implements InterfaceC2589t {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p198m0.InterfaceC2589t
    /* JADX INFO: renamed from: e */
    public final void mo947e(InterfaceC2586q interfaceC2586q) {
        View viewM4031c = AbstractC2219j.m4031c(this);
        interfaceC2586q.mo956d(this.f7186d.f7199q && AbstractC2219j.m4031c(this).hasFocusable());
        View viewFindFocus = viewM4031c.findFocus();
        if (viewFindFocus != null) {
            interfaceC2586q.mo4538e(AbstractC2577h.m4521a(viewFindFocus, viewM4031c));
        }
    }
}
