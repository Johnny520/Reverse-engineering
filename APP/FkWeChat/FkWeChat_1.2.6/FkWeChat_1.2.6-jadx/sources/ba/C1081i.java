package ba;

import p010a9.InterfaceC0173a;
import p081fa.InterfaceC2393u;

/* JADX INFO: renamed from: ba.i */
/* JADX INFO: loaded from: classes2.dex */
public class C1081i implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final C1082j f3261q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC2393u f3262r;

    public C1081i(C1082j c1082j, InterfaceC2393u interfaceC2393u) {
        this.f3261q = c1082j;
        this.f3262r = interfaceC2393u;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return C1082j.m3930f(this.f3261q, this.f3262r);
    }
}
