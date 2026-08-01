package p160f3;

import java.util.concurrent.CancellationException;
import p056K2.C0881g;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p084Q2.AbstractC1178c;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p190k3.AbstractC2453a;
import p190k3.C2458f;
import p201m3.AbstractRunnableC2612i;

/* JADX INFO: renamed from: f3.B */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2099B extends AbstractRunnableC2612i {

    /* JADX INFO: renamed from: f */
    public int f7028f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC2099B(int i5) {
        super(0L, false);
        this.f7028f = i5;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC1046d mo3878c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public Throwable mo3879f(Object obj) {
        C2149n c2149n = obj instanceof C2149n ? (C2149n) obj : null;
        if (c2149n != null) {
            return c2149n.f7092a;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3881h(Throwable th) {
        AbstractC2162v.m3990l(mo3878c().mo275e(), new C0881g("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: j */
    public abstract Object mo3882j();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC1046d interfaceC1046dMo3878c = mo3878c();
            AbstractC1665j.m2983c(interfaceC1046dMo3878c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C2458f c2458f = (C2458f) interfaceC1046dMo3878c;
            AbstractC1178c abstractC1178c = c2458f.f7931h;
            Object obj = c2458f.f7933j;
            InterfaceC1051i interfaceC1051iMo275e = abstractC1178c.mo275e();
            Object objM4384l = AbstractC2453a.m4384l(interfaceC1051iMo275e, obj);
            InterfaceC2115S interfaceC2115S = null;
            C2154p0 c2154p0M4000v = objM4384l != AbstractC2453a.f7920d ? AbstractC2162v.m4000v(abstractC1178c, interfaceC1051iMo275e, objM4384l) : null;
            try {
                InterfaceC1051i interfaceC1051iMo275e2 = abstractC1178c.mo275e();
                Object objMo3882j = mo3882j();
                Throwable thMo3879f = mo3879f(objMo3882j);
                if (thMo3879f == null) {
                    int i5 = this.f7028f;
                    boolean z5 = true;
                    if (i5 != 1 && i5 != 2) {
                        z5 = false;
                    }
                    if (z5) {
                        interfaceC2115S = (InterfaceC2115S) interfaceC1051iMo275e2.mo1166C(C2155q.f7102e);
                    }
                }
                if (interfaceC2115S != null && !interfaceC2115S.mo3904b()) {
                    CancellationException cancellationExceptionMo3907n = interfaceC2115S.mo3907n();
                    mo3877b(cancellationExceptionMo3907n);
                    abstractC1178c.mo278i(AbstractC1784a.m3229o(cancellationExceptionMo3907n));
                } else if (thMo3879f != null) {
                    abstractC1178c.mo278i(AbstractC1784a.m3229o(thMo3879f));
                } else {
                    abstractC1178c.mo278i(mo3880g(objMo3882j));
                }
                if (c2154p0M4000v != null && !c2154p0M4000v.m3977g0()) {
                    return;
                }
                AbstractC2453a.m4379g(interfaceC1051iMo275e, objM4384l);
            } catch (Throwable th) {
                if (c2154p0M4000v == null || c2154p0M4000v.m3977g0()) {
                    AbstractC2453a.m4379g(interfaceC1051iMo275e, objM4384l);
                }
                throw th;
            }
        } catch (Throwable th2) {
            m3881h(th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo3877b(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: g */
    public Object mo3880g(Object obj) {
        return obj;
    }
}
