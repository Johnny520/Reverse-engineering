package p172h3;

import java.util.concurrent.CancellationException;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p160f3.AbstractC2123a;
import p160f3.AbstractC2162v;
import p160f3.C2116T;
import p160f3.C2121Y;
import p160f3.C2122Z;
import p160f3.C2149n;

/* JADX INFO: renamed from: h3.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2255o extends AbstractC2123a implements InterfaceC2256p, InterfaceC2247g {

    /* JADX INFO: renamed from: g */
    public final C2243c f7396g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2255o(InterfaceC1051i interfaceC1051i, C2243c c2243c) {
        super(interfaceC1051i, true);
        this.f7396g = c2243c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.InterfaceC2258r
    /* JADX INFO: renamed from: a */
    public final Object mo4079a(InterfaceC1046d interfaceC1046d, Object obj) {
        return this.f7396g.mo4079a(interfaceC1046d, obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.C2122Z, p160f3.InterfaceC2115S
    /* JADX INFO: renamed from: c */
    public final void mo3905c(CancellationException cancellationException) {
        Object obj = C2122Z.f7062d.get(this);
        if (obj instanceof C2149n) {
            return;
        }
        if ((obj instanceof C2121Y) && ((C2121Y) obj).m3918e()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new C2116T(mo3923D(), null, this);
        }
        mo3946z(cancellationException);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2123a
    /* JADX INFO: renamed from: d0 */
    public final void mo3947d0(Throwable th, boolean z5) {
        if (this.f7396g.m4083h(th, false) || z5) {
            return;
        }
        AbstractC2162v.m3990l(this.f7064f, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.AbstractC2123a
    /* JADX INFO: renamed from: e0 */
    public final void mo3948e0(Object obj) {
        this.f7396g.m4083h(null, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.InterfaceC2257q
    /* JADX INFO: renamed from: g */
    public final Object mo4082g() {
        return this.f7396g.mo4082g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.InterfaceC2257q
    public final C2242b iterator() {
        C2243c c2243c = this.f7396g;
        c2243c.getClass();
        return new C2242b(c2243c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.InterfaceC2258r
    /* JADX INFO: renamed from: o */
    public final Object mo4090o(Object obj) {
        return this.f7396g.mo4090o(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.InterfaceC2257q
    /* JADX INFO: renamed from: p */
    public final Object mo4091p(InterfaceC1046d interfaceC1046d) {
        return this.f7396g.mo4091p(interfaceC1046d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: z */
    public final void mo3946z(CancellationException cancellationException) {
        this.f7396g.m4083h(cancellationException, true);
        m3945y(cancellationException);
    }
}
