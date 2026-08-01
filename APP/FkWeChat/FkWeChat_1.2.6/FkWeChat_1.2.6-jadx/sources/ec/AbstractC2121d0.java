package ec;

import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: ec.d0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2121d0 {
    /* JADX INFO: renamed from: a */
    public static final Object m7723a(Object obj, InterfaceC5976f interfaceC5976f) {
        if (!(obj instanceof C2111b0)) {
            return C4712s.m18798b(obj);
        }
        C4712s.a aVar = C4712s.f13928r;
        return C4712s.m18798b(AbstractC4713t.m18807a(((C2111b0) obj).f5913a));
    }

    /* JADX INFO: renamed from: b */
    public static final Object m7724b(Object obj) {
        Throwable thM18801e = C4712s.m18801e(obj);
        return thM18801e == null ? obj : new C2111b0(thM18801e, false, 2, null);
    }

    /* JADX INFO: renamed from: c */
    public static final Object m7725c(Object obj, InterfaceC2156m interfaceC2156m) {
        Throwable thM18801e = C4712s.m18801e(obj);
        return thM18801e == null ? obj : new C2111b0(thM18801e, false, 2, null);
    }
}
