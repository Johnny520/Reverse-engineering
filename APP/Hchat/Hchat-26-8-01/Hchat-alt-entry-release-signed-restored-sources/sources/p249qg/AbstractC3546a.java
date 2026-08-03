package p249qg;

import af.C0081d;
import gg.AbstractC1428x;
import okio.C3193a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1235p;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6036a;
import vg.AbstractC4552a;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3546a extends C3610y0 implements InterfaceC5557c, InterfaceC3599t {

    /* JADX INFO: renamed from: i */
    public final InterfaceC5561g f11548i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3546a(InterfaceC5561g interfaceC5561g, boolean z9) {
        super(z9);
        m7584L((InterfaceC3596r0) interfaceC5561g.mo2062s(C3593q.f11607h));
        this.f11548i = interfaceC5561g.mo2059e(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: K */
    public final void mo7468K(C0081d c0081d) {
        AbstractC3603v.m7559m(c0081d, this.f11548i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: S */
    public final void mo7469S(Object obj) {
        if (!(obj instanceof C3585n)) {
            mo7471b0(obj);
        } else {
            C3585n c3585n = (C3585n) obj;
            mo7470a0(c3585n.f11599a, C3585n.f11598b.get(c3585n) != 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final void m7472c0(EnumC3601u enumC3601u, AbstractC3546a abstractC3546a, InterfaceC1235p interfaceC1235p) {
        Object objInvoke;
        int iOrdinal = enumC3601u.ordinal();
        C3967n c3967n = C3967n.f12976a;
        if (iOrdinal == 0) {
            try {
                AbstractC4552a.m8989h(c3967n, AbstractC1184v0.m3214x(AbstractC1184v0.m3200j(interfaceC1235p, abstractC3546a, this)));
                return;
            } finally {
                resumeWith(new C3959f(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                interfaceC1235p.getClass();
                AbstractC1184v0.m3214x(AbstractC1184v0.m3200j(interfaceC1235p, abstractC3546a, this)).resumeWith(c3967n);
                return;
            }
            if (iOrdinal != 3) {
                C3193a.m6822k();
                return;
            }
            try {
                InterfaceC5561g interfaceC5561g = this.f11548i;
                Object objM8993l = AbstractC4552a.m8993l(interfaceC5561g, null);
                try {
                    if (interfaceC1235p instanceof AbstractC6036a) {
                        AbstractC1428x.m3838c(2, interfaceC1235p);
                        objInvoke = interfaceC1235p.invoke(abstractC3546a, this);
                    } else {
                        objInvoke = AbstractC1184v0.m3190Q(interfaceC1235p, abstractC3546a, this);
                    }
                    AbstractC4552a.m8988g(interfaceC5561g, objM8993l);
                    if (objInvoke != EnumC5799a.f23547g) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    AbstractC4552a.m8988g(interfaceC5561g, objM8993l);
                    throw th2;
                }
            } catch (Throwable th3) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final InterfaceC5561g getContext() {
        return this.f11548i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.InterfaceC3599t
    /* JADX INFO: renamed from: n */
    public final InterfaceC5561g mo4457n() {
        return this.f11548i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public final void resumeWith(Object obj) {
        Throwable thM8182b = C3960g.m8182b(obj);
        if (thM8182b != null) {
            obj = new C3585n(thM8182b, false);
        }
        Object objM7587O = m7587O(obj);
        if (objM7587O == AbstractC3603v.f11623e) {
            return;
        }
        mo7475u(objM7587O);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p249qg.C3610y0
    /* JADX INFO: renamed from: z */
    public final String mo7473z() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    /* JADX INFO: renamed from: b0 */
    public void mo7471b0(Object obj) {
    }

    /* JADX INFO: renamed from: a0 */
    public void mo7470a0(Throwable th2, boolean z9) {
    }
}
