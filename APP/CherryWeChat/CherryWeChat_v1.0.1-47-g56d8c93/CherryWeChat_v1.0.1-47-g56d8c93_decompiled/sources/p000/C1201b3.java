package p000;

import android.view.LayoutInflater;

/* JADX INFO: renamed from: b3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1201b3 implements InterfaceC2386pt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractActivityC2528t5 f4113a;

    public C1201b3(AbstractActivityC2528t5 abstractActivityC2528t5) {
        this.f4113a = abstractActivityC2528t5;
    }

    @Override // p000.InterfaceC2386pt
    /* JADX INFO: renamed from: a */
    public final void mo838a() {
        AbstractActivityC2528t5 abstractActivityC2528t5 = this.f4113a;
        AbstractC2397q3 delegate = abstractActivityC2528t5.getDelegate();
        LayoutInflaterFactory2C0176E3 layoutInflaterFactory2C0176E3 = (LayoutInflaterFactory2C0176E3) delegate;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(layoutInflaterFactory2C0176E3.f494k);
        if (layoutInflaterFrom.getFactory() == null) {
            layoutInflaterFrom.setFactory2(layoutInflaterFactory2C0176E3);
        } else {
            layoutInflaterFrom.getFactory2();
        }
        abstractActivityC2528t5.getSavedStateRegistry().m2896a("androidx:appcompat");
        delegate.mo342c();
    }
}
