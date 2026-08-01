package p167l3;

import android.view.View;
import p165l1.InterfaceC4507m;
import p235q1.AbstractC6211k;
import p235q1.InterfaceC6226t;
import p235q1.InterfaceC6228v;
import p250r1.C6457g;

/* JADX INFO: renamed from: l3.n */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4621n extends InterfaceC4507m.c implements InterfaceC6228v {
    @Override // p235q1.InterfaceC6228v
    /* JADX INFO: renamed from: j1 */
    public void mo17557j1(InterfaceC6226t interfaceC6226t) {
        C6457g c6457gM24421a;
        View viewM18542g = AbstractC4615h.m18542g(this);
        interfaceC6226t.mo17627o(mo17471z().m17461m2() && AbstractC4615h.m18542g(this).hasFocusable());
        View viewFindFocus = viewM18542g.findFocus();
        if (viewFindFocus == null || (c6457gM24421a = AbstractC6211k.m24421a(viewFindFocus, viewM18542g)) == null) {
            return;
        }
        interfaceC6226t.mo24534g(c6457gM24421a);
    }
}
