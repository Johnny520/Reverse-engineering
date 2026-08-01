package ba;

import p010a9.InterfaceC0173a;
import p229p9.InterfaceC6001g;

/* JADX INFO: renamed from: ba.a */
/* JADX INFO: loaded from: classes2.dex */
public class C1073a implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final C1083k f3227q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC6001g f3228r;

    public C1073a(C1083k c1083k, InterfaceC6001g interfaceC6001g) {
        this.f3227q = c1083k;
        this.f3228r = interfaceC6001g;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return AbstractC1075c.m3889g(this.f3227q, this.f3228r);
    }
}
