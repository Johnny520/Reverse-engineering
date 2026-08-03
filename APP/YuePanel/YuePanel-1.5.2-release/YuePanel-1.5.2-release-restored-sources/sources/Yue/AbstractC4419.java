package Yue;

import Yue.C7148;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: Yue.ۥ۠۟ۢۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4419<T> extends AbstractRunnableC7725 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC5568
    public int f9148;

    public AbstractC4419(int i) {
        this.f9148 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object objM3438;
        Object objM34382;
        InterfaceC7726 interfaceC7726 = this.f23251;
        try {
            C4416 c4416 = (C4416) mo10025();
            InterfaceC4199<T> interfaceC4199 = c4416.f9144;
            Object obj = c4416.f9146;
            InterfaceC4225 context = interfaceC4199.getContext();
            Object objM24718 = C7776.m24718(context, obj);
            C8102<?> c8102M12167 = objM24718 != C7776.f3074 ? C4230.m12167(interfaceC4199, context, objM24718) : null;
            try {
                InterfaceC4225 context2 = interfaceC4199.getContext();
                Object objMo10028 = mo10028();
                Throwable thMo10026 = mo10026(objMo10028);
                InterfaceC5542 interfaceC5542 = (thMo10026 == null && C4420.m12846(this.f9148)) ? (InterfaceC5542) context2.get(InterfaceC5542.f13507) : null;
                if (interfaceC5542 != null && !interfaceC5542.mo5773()) {
                    CancellationException cancellationExceptionMo17161 = interfaceC5542.mo17161();
                    mo733(objMo10028, cancellationExceptionMo17161);
                    C7148.C1189 c1189 = C7148.f21560;
                    interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(cancellationExceptionMo17161)));
                } else if (thMo10026 != null) {
                    C7148.C1189 c11892 = C7148.f21560;
                    interfaceC4199.resumeWith(C7148.m3438(C7149.m3441(thMo10026)));
                } else {
                    C7148.C1189 c11893 = C7148.f21560;
                    interfaceC4199.resumeWith(C7148.m3438(mo10027(objMo10028)));
                }
                C8107 c8107 = C8107.f3222;
                if (c8102M12167 == null || c8102M12167.m26701()) {
                    C7776.m3874(context, objM24718);
                }
                try {
                    C7148.C1189 c11894 = C7148.f21560;
                    interfaceC7726.mo17603();
                    objM34382 = C7148.m3438(c8107);
                } catch (Throwable th) {
                    C7148.C1189 c11895 = C7148.f21560;
                    objM34382 = C7148.m3438(C7149.m3441(th));
                }
                m12845(null, C7148.m22403(objM34382));
            } catch (Throwable th2) {
                if (c8102M12167 == null || c8102M12167.m26701()) {
                    C7776.m3874(context, objM24718);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                C7148.C1189 c11896 = C7148.f21560;
                interfaceC7726.mo17603();
                objM3438 = C7148.m3438(C8107.f3222);
            } catch (Throwable th4) {
                C7148.C1189 c11897 = C7148.f21560;
                objM3438 = C7148.m3438(C7149.m3441(th4));
            }
            m12845(th3, C7148.m22403(objM3438));
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public void mo733(@InterfaceC6489 Object obj, @InterfaceC6399 Throwable th) {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public abstract InterfaceC4199<T> mo10025();

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public Throwable mo10026(@InterfaceC6489 Object obj) {
        C4050 c4050 = obj instanceof C4050 ? (C4050) obj : null;
        if (c4050 != null) {
            return c4050.f637;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public <T> T mo10027(@InterfaceC6489 Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final void m12845(@InterfaceC6489 Throwable th, @InterfaceC6489 Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            C4741.m1656(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C5499.m17100(th);
        C4236.m1201(mo10025().getContext(), new C4248("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public abstract Object mo10028();
}
