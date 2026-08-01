package ec;

import p145jc.C3808h;
import p215oc.C5725t;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: ec.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2172q {
    /* JADX INFO: renamed from: a */
    public static final void m7887a(InterfaceC2156m interfaceC2156m, InterfaceC2126e1 interfaceC2126e1) {
        m7889c(interfaceC2156m, new C2130f1(interfaceC2126e1));
    }

    /* JADX INFO: renamed from: b */
    public static final C2164o m7888b(InterfaceC5976f interfaceC5976f) {
        if (!(interfaceC5976f instanceof C3808h)) {
            return new C2164o(interfaceC5976f, 1);
        }
        C2164o c2164oM15171j = ((C3808h) interfaceC5976f).m15171j();
        if (c2164oM15171j != null) {
            if (!c2164oM15171j.m7859N()) {
                c2164oM15171j = null;
            }
            if (c2164oM15171j != null) {
                return c2164oM15171j;
            }
        }
        return new C2164o(interfaceC5976f, 2);
    }

    /* JADX INFO: renamed from: c */
    public static final void m7889c(InterfaceC2156m interfaceC2156m, InterfaceC2152l interfaceC2152l) {
        if (interfaceC2156m instanceof C2164o) {
            ((C2164o) interfaceC2156m).m7854H(interfaceC2152l);
        } else {
            C5725t.m23179a("third-party implementation of CancellableContinuation is not supported");
        }
    }
}
