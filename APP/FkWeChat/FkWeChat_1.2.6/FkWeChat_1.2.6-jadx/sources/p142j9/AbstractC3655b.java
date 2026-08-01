package p142j9;

import p010a9.InterfaceC0184l;
import p172l8.AbstractC4713t;
import p172l8.C4712s;

/* JADX INFO: renamed from: j9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3655b {
    static {
        Object objM18798b;
        try {
            C4712s.a aVar = C4712s.f13928r;
            objM18798b = C4712s.m18798b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        if (C4712s.m18804h(objM18798b)) {
            objM18798b = Boolean.TRUE;
        }
        Object objM18798b2 = C4712s.m18798b(objM18798b);
        Boolean bool = Boolean.FALSE;
        if (C4712s.m18803g(objM18798b2)) {
            objM18798b2 = bool;
        }
        ((Boolean) objM18798b2).getClass();
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC3650a m13611a(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.getClass();
        return new C3690i(interfaceC0184l);
    }
}
