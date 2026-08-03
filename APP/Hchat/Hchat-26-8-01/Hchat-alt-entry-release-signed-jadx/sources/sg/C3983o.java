package sg;

import java.util.concurrent.CancellationException;
import p249qg.AbstractC3546a;
import p249qg.AbstractC3603v;
import p249qg.C3585n;
import p249qg.C3598s0;
import p249qg.C3608x0;
import p249qg.C3610y0;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: sg.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3983o extends AbstractC3546a implements InterfaceC3975g, InterfaceC3984p {

    /* JADX INFO: renamed from: j */
    public final C3971c f13024j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3983o(InterfaceC5561g interfaceC5561g, C3971c c3971c) {
        super(interfaceC5561g, true);
        this.f13024j = c3971c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0, p249qg.InterfaceC3596r0
    /* JADX INFO: renamed from: a */
    public final void mo7485a(CancellationException cancellationException) {
        Object obj = C3610y0.f11641g.get(this);
        if (obj instanceof C3585n) {
            return;
        }
        if ((obj instanceof C3608x0) && ((C3608x0) obj).m7575e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C3598s0(mo7473z(), null, this);
        }
        mo7596x(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3546a
    /* JADX INFO: renamed from: a0 */
    public final void mo7470a0(Throwable th2, boolean z9) {
        if (this.f13024j.m8200h(th2, false) || z9) {
            return;
        }
        AbstractC3603v.m7559m(th2, this.f11548i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.AbstractC3546a
    /* JADX INFO: renamed from: b0 */
    public final void mo7471b0(Object obj) {
        this.f13024j.m8200h(null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.InterfaceC3975g
    /* JADX INFO: renamed from: d */
    public final Object mo8197d() {
        return this.f13024j.mo8197d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.InterfaceC3975g
    /* JADX INFO: renamed from: f */
    public final Object mo8198f(InterfaceC5557c interfaceC5557c) {
        return this.f13024j.mo8198f(interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.InterfaceC3975g
    public final C3970b iterator() {
        C3971c c3971c = this.f13024j;
        c3971c.getClass();
        return new C3970b(c3971c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.InterfaceC3984p
    /* JADX INFO: renamed from: p */
    public final Object mo8208p(Object obj) {
        return this.f13024j.mo8208p(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sg.InterfaceC3984p
    /* JADX INFO: renamed from: q */
    public final Object mo8209q(Object obj, InterfaceC5557c interfaceC5557c) {
        return this.f13024j.mo8209q(obj, interfaceC5557c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: x */
    public final void mo7596x(CancellationException cancellationException) {
        this.f13024j.m8200h(cancellationException, true);
        m7595v(cancellationException);
    }
}
