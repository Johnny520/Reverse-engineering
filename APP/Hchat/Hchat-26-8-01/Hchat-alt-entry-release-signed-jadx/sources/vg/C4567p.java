package vg;

import p080fb.AbstractC1184v0;
import p249qg.AbstractC3546a;
import p249qg.AbstractC3603v;
import p370yf.InterfaceC6039d;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: vg.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C4567p extends AbstractC3546a implements InterfaceC6039d {

    /* JADX INFO: renamed from: j */
    public final InterfaceC5557c f15051j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4567p(InterfaceC5557c interfaceC5557c, InterfaceC5561g interfaceC5561g) {
        super(interfaceC5561g, true);
        this.f15051j = interfaceC5557c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: N */
    public final boolean mo7586N() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.InterfaceC6039d
    public final InterfaceC6039d getCallerFrame() {
        InterfaceC5557c interfaceC5557c = this.f15051j;
        if (interfaceC5557c instanceof InterfaceC6039d) {
            return (InterfaceC6039d) interfaceC5557c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: r */
    public void mo7474r(Object obj) {
        AbstractC4552a.m8989h(AbstractC3603v.m7564r(obj), AbstractC1184v0.m3214x(this.f15051j));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: u */
    public void mo7475u(Object obj) {
        this.f15051j.resumeWith(AbstractC3603v.m7564r(obj));
    }
}
