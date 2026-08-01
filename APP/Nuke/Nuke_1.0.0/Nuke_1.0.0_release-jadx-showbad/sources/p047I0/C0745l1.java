package p047I0;

import me.dartcv.nuke.R;
import p002A1.AbstractC0142o;
import p002A1.EnumC0140m;
import p002A1.InterfaceC0143p;
import p002A1.InterfaceC0145r;
import p007B0.C0171D;
import p095T.C1397y;
import p095T.InterfaceC1389u;
import p112W2.InterfaceC1603e;

/* JADX INFO: renamed from: I0.l1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0745l1 implements InterfaceC1389u, InterfaceC0143p {

    /* JADX INFO: renamed from: d */
    public final ViewTreeObserverOnGlobalLayoutListenerC0772y f2327d;

    /* JADX INFO: renamed from: e */
    public final C1397y f2328e;

    /* JADX INFO: renamed from: f */
    public boolean f2329f;

    /* JADX INFO: renamed from: g */
    public AbstractC0142o f2330g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1603e f2331h = AbstractC0753o0.f2340a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0745l1(ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y, C1397y c1397y) {
        this.f2327d = viewTreeObserverOnGlobalLayoutListenerC0772y;
        this.f2328e = c1397y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m1263a() {
        if (!this.f2329f) {
            this.f2329f = true;
            this.f2327d.getView().setTag(R.id.wrapped_composition_tag, null);
            AbstractC0142o abstractC0142o = this.f2330g;
            if (abstractC0142o != null) {
                abstractC0142o.mo185b(this);
            }
        }
        this.f2328e.m2659m();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p002A1.InterfaceC0143p
    /* JADX INFO: renamed from: d */
    public final void mo147d(InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m) {
        if (enumC0140m == EnumC0140m.ON_DESTROY) {
            m1263a();
        } else {
            if (enumC0140m != EnumC0140m.ON_CREATE || this.f2329f) {
                return;
            }
            m1264e(this.f2331h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m1264e(InterfaceC1603e interfaceC1603e) {
        this.f2327d.setOnViewTreeOwnersAvailable(new C0171D(7, this, interfaceC1603e));
    }
}
