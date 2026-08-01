package p145jc;

import ec.AbstractC2135g2;
import java.util.List;
import p172l8.C4699i;

/* JADX INFO: renamed from: jc.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3829t {
    /* JADX INFO: renamed from: a */
    public static final AbstractC3830u m15258a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        m15261d();
        throw new C4699i();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ AbstractC3830u m15259b(Throwable th, String str, int i10, Object obj) throws Throwable {
        if ((i10 & 1) != 0) {
            th = null;
        }
        if ((i10 & 2) != 0) {
            str = null;
        }
        m15258a(th, str);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m15260c(AbstractC2135g2 abstractC2135g2) {
        abstractC2135g2.mo7754q0();
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final Void m15261d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    /* JADX INFO: renamed from: e */
    public static final AbstractC2135g2 m15262e(InterfaceC3827r interfaceC3827r, List list) throws Throwable {
        try {
            return interfaceC3827r.mo8705b(list);
        } catch (Throwable th) {
            m15258a(th, interfaceC3827r.mo8704a());
            return null;
        }
    }
}
