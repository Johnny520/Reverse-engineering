package p249qg;

import eg.C0920a;
import java.util.concurrent.CancellationException;
import p077f8.AbstractC1089i;
import p276sf.C3959f;
import p353xg.AbstractRunnableC5811h;
import p370yf.AbstractC6038c;
import vg.AbstractC4552a;
import vg.C4557f;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: qg.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3550b0 extends AbstractRunnableC5811h {

    /* JADX INFO: renamed from: i */
    public int f11551i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC3550b0(int i9) {
        super(0L, false);
        this.f11551i = i9;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC5557c mo7480c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public Throwable mo7481d(Object obj) {
        C3585n c3585n = obj instanceof C3585n ? (C3585n) obj : null;
        if (c3585n != null) {
            return c3585n.f11599a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m7483f(Throwable th2) {
        AbstractC3603v.m7559m(new C0920a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th2), mo7480c().getContext());
    }

    /* JADX INFO: renamed from: g */
    public abstract Object mo7484g();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC5557c interfaceC5557cMo7480c = mo7480c();
            interfaceC5557cMo7480c.getClass();
            C4557f c4557f = (C4557f) interfaceC5557cMo7480c;
            AbstractC6038c abstractC6038c = c4557f.f15027k;
            Object obj = c4557f.f15029m;
            InterfaceC5561g context = abstractC6038c.getContext();
            Object objM8993l = AbstractC4552a.m8993l(context, obj);
            InterfaceC3596r0 interfaceC3596r0 = null;
            C3584m1 c3584m1M7569w = objM8993l != AbstractC4552a.f15016d ? AbstractC3603v.m7569w(abstractC6038c, context, objM8993l) : null;
            try {
                InterfaceC5561g context2 = abstractC6038c.getContext();
                Object objMo7484g = mo7484g();
                Throwable thMo7481d = mo7481d(objMo7484g);
                if (thMo7481d == null) {
                    int i9 = this.f11551i;
                    boolean z9 = true;
                    if (i9 != 1 && i9 != 2) {
                        z9 = false;
                    }
                    if (z9) {
                        interfaceC3596r0 = (InterfaceC3596r0) context2.mo2062s(C3593q.f11607h);
                    }
                }
                if (interfaceC3596r0 != null && !interfaceC3596r0.mo7486b()) {
                    CancellationException cancellationExceptionMo7489h = interfaceC3596r0.mo7489h();
                    mo7479b(cancellationExceptionMo7489h);
                    abstractC6038c.resumeWith(AbstractC1089i.m2785q(cancellationExceptionMo7489h));
                } else if (thMo7481d != null) {
                    abstractC6038c.resumeWith(new C3959f(thMo7481d));
                } else {
                    abstractC6038c.resumeWith(mo7482e(objMo7484g));
                }
                if (c3584m1M7569w != null && !c3584m1M7569w.m7540d0()) {
                    return;
                }
                AbstractC4552a.m8988g(context, objM8993l);
            } catch (Throwable th2) {
                if (c3584m1M7569w == null || c3584m1M7569w.m7540d0()) {
                    AbstractC4552a.m8988g(context, objM8993l);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            m7483f(th3);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo7479b(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: e */
    public Object mo7482e(Object obj) {
        return obj;
    }
}
