package p000;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Vn */
/* JADX INFO: loaded from: classes.dex */
public final class C0932Vn implements InterfaceC0718Qn, InterfaceC1018Xn {

    /* JADX INFO: renamed from: a */
    public final HashSet f2897a = new HashSet();

    /* JADX INFO: renamed from: b */
    public final AbstractC0760Rn f2898b;

    public C0932Vn(AbstractC0760Rn abstractC0760Rn) {
        this.f2898b = abstractC0760Rn;
        abstractC0760Rn.mo1555a(this);
    }

    @Override // p000.InterfaceC0718Qn
    /* JADX INFO: renamed from: d */
    public final void mo1507d(InterfaceC0975Wn interfaceC0975Wn) {
        this.f2897a.remove(interfaceC0975Wn);
    }

    @Override // p000.InterfaceC0718Qn
    /* JADX INFO: renamed from: l */
    public final void mo1508l(InterfaceC0975Wn interfaceC0975Wn) {
        this.f2897a.add(interfaceC0975Wn);
        EnumC0675Pn enumC0675Pn = ((C1185ao) this.f2898b).f4064c;
        if (enumC0675Pn == EnumC0675Pn.f2147a) {
            interfaceC0975Wn.mo392b();
        } else if (enumC0675Pn.m1371a(EnumC0675Pn.f2150d)) {
            interfaceC0975Wn.mo401k();
        } else {
            interfaceC0975Wn.mo394d();
        }
    }

    @InterfaceC2429qt(EnumC0632On.ON_DESTROY)
    public void onDestroy(InterfaceC1061Yn interfaceC1061Yn) {
        Iterator it = AbstractC2622vD.m5134e(this.f2897a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0975Wn) it.next()).mo392b();
        }
        interfaceC1061Yn.getLifecycle().mo1556b(this);
    }

    @InterfaceC2429qt(EnumC0632On.ON_START)
    public void onStart(InterfaceC1061Yn interfaceC1061Yn) {
        Iterator it = AbstractC2622vD.m5134e(this.f2897a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0975Wn) it.next()).mo401k();
        }
    }

    @InterfaceC2429qt(EnumC0632On.ON_STOP)
    public void onStop(InterfaceC1061Yn interfaceC1061Yn) {
        Iterator it = AbstractC2622vD.m5134e(this.f2897a).iterator();
        while (it.hasNext()) {
            ((InterfaceC0975Wn) it.next()).mo394d();
        }
    }
}
