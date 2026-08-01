package ec;

import java.util.concurrent.CancellationException;
import lc.AbstractRunnableC4742h;
import p145jc.AbstractC3815k0;
import p145jc.C3808h;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: ec.b1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2112b1 extends AbstractRunnableC4742h {

    /* JADX INFO: renamed from: s */
    public int f5914s;

    public AbstractC2112b1(int i10) {
        this.f5914s = i10;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC5976f mo7623c();

    /* JADX INFO: renamed from: d */
    public Throwable mo7624d(Object obj) {
        C2111b0 c2111b0 = obj instanceof C2111b0 ? (C2111b0) obj : null;
        if (c2111b0 != null) {
            return c2111b0.f5913a;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m7626f(Throwable th) {
        AbstractC2157m0.m7839a(mo7623c().getContext(), new C2177r0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo7627h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC5976f interfaceC5976fMo7623c = mo7623c();
            interfaceC5976fMo7623c.getClass();
            C3808h c3808h = (C3808h) interfaceC5976fMo7623c;
            InterfaceC5976f interfaceC5976f = c3808h.f10982u;
            Object obj = c3808h.f10984w;
            InterfaceC5980j context = interfaceC5976f.getContext();
            Object objM15198f = AbstractC3815k0.m15198f(context, obj);
            InterfaceC2198w1 interfaceC2198w1 = null;
            C2207y2 c2207y2M7772j = objM15198f != AbstractC3815k0.f10996a ? AbstractC2141i0.m7772j(interfaceC5976f, context, objM15198f) : null;
            try {
                InterfaceC5980j context2 = interfaceC5976f.getContext();
                Object objMo7627h = mo7627h();
                Throwable thMo7624d = mo7624d(objMo7627h);
                if (thMo7624d == null && AbstractC2117c1.m7637b(this.f5914s)) {
                    interfaceC2198w1 = (InterfaceC2198w1) context2.mo1654h(InterfaceC2198w1.f6022g);
                }
                if (interfaceC2198w1 != null && !interfaceC2198w1.mo7586c()) {
                    CancellationException cancellationExceptionMo7669T = interfaceC2198w1.mo7669T();
                    mo7622b(objMo7627h, cancellationExceptionMo7669T);
                    C4712s.a aVar = C4712s.f13928r;
                    interfaceC5976f.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(cancellationExceptionMo7669T)));
                } else if (thMo7624d != null) {
                    C4712s.a aVar2 = C4712s.f13928r;
                    interfaceC5976f.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(thMo7624d)));
                } else {
                    C4712s.a aVar3 = C4712s.f13928r;
                    interfaceC5976f.resumeWith(C4712s.m18798b(mo7625e(objMo7627h)));
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
                if (c2207y2M7772j == null || c2207y2M7772j.m7945l1()) {
                    AbstractC3815k0.m15196d(context, objM15198f);
                }
            } catch (Throwable th) {
                if (c2207y2M7772j == null || c2207y2M7772j.m7945l1()) {
                    AbstractC3815k0.m15196d(context, objM15198f);
                }
                throw th;
            }
        } catch (C2209z0 e10) {
            AbstractC2157m0.m7839a(mo7623c().getContext(), e10.getCause());
        } catch (Throwable th2) {
            m7626f(th2);
        }
    }

    /* JADX INFO: renamed from: e */
    public Object mo7625e(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public void mo7622b(Object obj, Throwable th) {
    }
}
