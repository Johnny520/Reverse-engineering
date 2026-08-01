package p245u0;

import p007B0.C0172E;
import p112W2.InterfaceC1601c;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: u0.C */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3296C {

    /* JADX INFO: renamed from: a */
    public InterfaceC1601c f10183a;

    /* JADX INFO: renamed from: a */
    public abstract void mo5565a(InterfaceC2903d interfaceC2903d);

    /* JADX INFO: renamed from: b */
    public InterfaceC1601c mo5566b() {
        return this.f10183a;
    }

    /* JADX INFO: renamed from: c */
    public final void m5567c() {
        InterfaceC1601c interfaceC1601cMo5566b = mo5566b();
        if (interfaceC1601cMo5566b != null) {
            interfaceC1601cMo5566b.mo1h(this);
        }
    }

    /* JADX INFO: renamed from: d */
    public void mo5568d(C0172E c0172e) {
        this.f10183a = c0172e;
    }
}
