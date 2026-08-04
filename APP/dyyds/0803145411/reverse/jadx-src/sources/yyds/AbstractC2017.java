package yyds;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: yyds.ᲀᛶᛳᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2017 extends AbstractRunnableC2764 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public int f10086;

    public AbstractC2017(int i) {
        super(0L, false);
        this.f10086 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C1118 c1118 = (C1118) mo2311();
            AbstractC1320 abstractC1320 = c1118.f5139;
            InterfaceC2213 interfaceC2213 = abstractC1320.f6070;
            Object objM1832 = AbstractC0797.m1832(interfaceC2213, c1118.f5138);
            InterfaceC2798 interfaceC2798 = null;
            C2101 c2101M981 = objM1832 != AbstractC0797.f3657 ? AbstractC0319.m981(abstractC1320, interfaceC2213, objM1832) : null;
            try {
                Object objMo2310 = mo2310();
                Throwable thMo3627 = mo3627(objMo2310);
                if (thMo3627 == null) {
                    int i = this.f10086;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        interfaceC2798 = (InterfaceC2798) interfaceC2213.mo423(C1586.f8041);
                    }
                }
                if (interfaceC2798 != null && !interfaceC2798.mo2091()) {
                    CancellationException cancellationExceptionMo2092 = interfaceC2798.mo2092();
                    mo3634(cancellationExceptionMo2092);
                    abstractC1320.mo812(new C2658(cancellationExceptionMo2092));
                } else if (thMo3627 != null) {
                    abstractC1320.mo812(new C2658(thMo3627));
                } else {
                    abstractC1320.mo812(mo3620(objMo2310));
                }
                if (c2101M981 != null && !c2101M981.m3995()) {
                    return;
                }
                AbstractC0797.m1826(interfaceC2213, objM1832);
            } catch (Throwable th) {
                if (c2101M981 == null || c2101M981.m3995()) {
                    AbstractC0797.m1826(interfaceC2213, objM1832);
                }
                throw th;
            }
        } catch (Throwable th2) {
            m3894(th2);
        }
    }

    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public abstract Object mo2310();

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public Object mo3620(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public Throwable mo3627(Object obj) {
        C0417 c0417 = obj instanceof C0417 ? (C0417) obj : null;
        if (c0417 != null) {
            return c0417.f2152;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final void m3894(Throwable th) {
        AbstractC2071.m3956(mo2311().mo733(), new C0109("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public void mo3634(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public abstract InterfaceC0274 mo2311();
}
