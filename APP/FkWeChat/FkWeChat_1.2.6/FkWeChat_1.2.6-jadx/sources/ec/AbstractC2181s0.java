package ec;

import p145jc.C3808h;
import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: ec.s0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2181s0 {
    /* JADX INFO: renamed from: a */
    public static final String m7898a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    /* JADX INFO: renamed from: b */
    public static final String m7899b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX INFO: renamed from: c */
    public static final String m7900c(InterfaceC5976f interfaceC5976f) {
        Object objM18798b;
        if (interfaceC5976f instanceof C3808h) {
            return ((C3808h) interfaceC5976f).toString();
        }
        try {
            C4712s.a aVar = C4712s.f13928r;
            objM18798b = C4712s.m18798b(interfaceC5976f + '@' + m7899b(interfaceC5976f));
        } catch (Throwable th) {
            C4712s.a aVar2 = C4712s.f13928r;
            objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
        }
        if (C4712s.m18801e(objM18798b) != null) {
            objM18798b = interfaceC5976f.getClass().getName() + '@' + m7899b(interfaceC5976f);
        }
        return (String) objM18798b;
    }
}
