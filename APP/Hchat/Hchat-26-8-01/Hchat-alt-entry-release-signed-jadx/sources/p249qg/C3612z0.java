package p249qg;

import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p276sf.C3959f;
import p276sf.C3967n;
import vg.AbstractC4552a;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3612z0 extends C3560e1 {

    /* JADX INFO: renamed from: j */
    public final InterfaceC5557c f11645j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3612z0(InterfaceC5561g interfaceC5561g, InterfaceC1235p interfaceC1235p) {
        super(interfaceC5561g, false);
        this.f11645j = AbstractC1184v0.m3200j(interfaceC1235p, this, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: T */
    public final void mo7589T() {
        try {
            AbstractC4552a.m8989h(C3967n.f12976a, AbstractC1184v0.m3214x(this.f11645j));
        } catch (Throwable th2) {
            resumeWith(new C3959f(th2));
            throw th2;
        }
    }
}
