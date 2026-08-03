package p000;

import android.view.LayoutInflater;

/* JADX INFO: renamed from: b3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1201b3 implements InterfaceC2386pt {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractActivityC2528t5 f4113a;

    public C1201b3(AbstractActivityC2528t5 r1) {
        this.f4113a = r1;
    }

    @Override // p000.InterfaceC2386pt
    /* JADX INFO: renamed from: a */
    public final void mo838a() {
        AbstractActivityC2528t5 r0 = this.f4113a;
        AbstractC2397q3 r1 = r0.getDelegate();
        LayoutInflaterFactory2C0176E3 r2 = (LayoutInflaterFactory2C0176E3) r1;
        LayoutInflater r3 = LayoutInflater.from(r2.f494k);
        if (r3.getFactory() != null) goto L5;
        r3.setFactory2(r2);
    L6:
        r0.getSavedStateRegistry().m2896a("androidx:appcompat");
        r1.mo342c();
        return;
    L5:
        r3.getFactory2();
        goto L6
    }
}
