package p037cb;

import p010a9.InterfaceC0173a;
import p143ja.C3782o;

/* JADX INFO: renamed from: cb.f0 */
/* JADX INFO: loaded from: classes2.dex */
public class C1471f0 implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final C1481k0 f4337q;

    /* JADX INFO: renamed from: r */
    public final boolean f4338r;

    /* JADX INFO: renamed from: s */
    public final C3782o f4339s;

    public C1471f0(C1481k0 c1481k0, boolean z10, C3782o c3782o) {
        this.f4337q = c1481k0;
        this.f4338r = z10;
        this.f4339s = c3782o;
    }

    @Override // p010a9.InterfaceC0173a
    public Object invoke() {
        return C1481k0.m5790n(this.f4337q, this.f4338r, this.f4339s);
    }
}
