package Yue;

import Yue.C7148;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۨۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4325 {
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final String m1288(@InterfaceC6399 Object obj) {
        return obj.getClass().getSimpleName();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final String m1289(@InterfaceC6399 Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String m12514(@InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        Object objM3438;
        if (interfaceC4199 instanceof C4416) {
            return interfaceC4199.toString();
        }
        try {
            C7148.C1189 c1189 = C7148.f21560;
            objM3438 = C7148.m3438(interfaceC4199 + '@' + m1289(interfaceC4199));
        } catch (Throwable th) {
            C7148.C1189 c11892 = C7148.f21560;
            objM3438 = C7148.m3438(C7149.m3441(th));
        }
        if (C7148.m22403(objM3438) != null) {
            objM3438 = interfaceC4199.getClass().getName() + '@' + m1289(interfaceC4199);
        }
        return (String) objM3438;
    }
}
