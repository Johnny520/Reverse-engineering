package p000;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Vn */
/* JADX INFO: loaded from: classes.dex */
public final class C0932Vn implements InterfaceC0718Qn, InterfaceC1018Xn {

    /* JADX INFO: renamed from: a */
    public final HashSet f2897a;

    /* JADX INFO: renamed from: b */
    public final AbstractC0760Rn f2898b;

    public C0932Vn(AbstractC0760Rn r2) {
        this.f2897a = new HashSet();
        this.f2898b = r2;
        r2.mo1555a(this);
    }

    @Override // p000.InterfaceC0718Qn
    /* JADX INFO: renamed from: d */
    public final void mo1507d(InterfaceC0975Wn r2) {
        this.f2897a.remove(r2);
    }

    @Override // p000.InterfaceC0718Qn
    /* JADX INFO: renamed from: l */
    public final void mo1508l(InterfaceC0975Wn r3) {
        this.f2897a.add(r3);
        EnumC0675Pn r0 = ((C1185ao) this.f2898b).f4064c;
        if (r0 != EnumC0675Pn.f2147a) goto L7;
        r3.mo392b();
        return;
    L7:
        if (r0.m1371a(EnumC0675Pn.f2150d) == false) goto L10;
        r3.mo401k();
        return;
    L10:
        r3.mo394d();
    }

    @InterfaceC2429qt(EnumC0632On.ON_DESTROY)
    public void onDestroy(InterfaceC1061Yn r3) {
        Iterator r0 = AbstractC2622vD.m5134e(this.f2897a).iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        ((InterfaceC0975Wn) r0.next()).mo392b();
        goto L4
    L6:
        r3.getLifecycle().mo1556b(this);
    }

    @InterfaceC2429qt(EnumC0632On.ON_START)
    public void onStart(InterfaceC1061Yn r2) {
        Iterator r22 = AbstractC2622vD.m5134e(this.f2897a).iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        ((InterfaceC0975Wn) r22.next()).mo401k();
        goto L4
    }

    @InterfaceC2429qt(EnumC0632On.ON_STOP)
    public void onStop(InterfaceC1061Yn r2) {
        Iterator r22 = AbstractC2622vD.m5134e(this.f2897a).iterator();
    L4:
        if (r22.hasNext() == false) goto L6;
        ((InterfaceC0975Wn) r22.next()).mo394d();
        goto L4
    }
}
