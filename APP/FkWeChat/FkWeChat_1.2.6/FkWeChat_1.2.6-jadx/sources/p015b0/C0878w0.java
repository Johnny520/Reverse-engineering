package p015b0;

import p010a9.InterfaceC0173a;
import p172l8.C4700i0;
import p202o.AbstractC5609r;
import p202o.C5608q;

/* JADX INFO: renamed from: b0.w0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0878w0 implements InterfaceC0173a {

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC0173a f2764q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C5608q f2765r;

    public C0878w0(InterfaceC0173a interfaceC0173a, C5608q c5608q) {
        this.f2764q = interfaceC0173a;
        this.f2765r = c5608q;
    }

    /* JADX INFO: renamed from: a */
    public final void m3236a() {
        this.f2764q.invoke();
        AbstractC5609r.m22742a(this.f2765r);
    }

    @Override // p010a9.InterfaceC0173a
    public /* bridge */ /* synthetic */ Object invoke() {
        m3236a();
        return C4700i0.f13910a;
    }
}
