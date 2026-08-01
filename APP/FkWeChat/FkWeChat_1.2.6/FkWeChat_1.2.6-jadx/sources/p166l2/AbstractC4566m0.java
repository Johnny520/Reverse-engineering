package p166l2;

import p165l1.InterfaceC4507m;

/* JADX INFO: renamed from: l2.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4566m0 {
    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m.c m18056b(InterfaceC4553j interfaceC4553j) {
        int iM17812a = AbstractC4547h1.m17812a(4);
        int iM17812a2 = AbstractC4547h1.m17812a(2);
        InterfaceC4507m.c cVarM17453d2 = interfaceC4553j.mo17471z().m17453d2();
        if (cVarM17453d2 == null || (cVarM17453d2.m17452c2() & iM17812a) == 0) {
            return null;
        }
        while (cVarM17453d2 != null && (cVarM17453d2.m17457h2() & iM17812a2) == 0) {
            if ((cVarM17453d2.m17457h2() & iM17812a) != 0) {
                return cVarM17453d2;
            }
            cVarM17453d2 = cVarM17453d2.m17453d2();
        }
        return null;
    }
}
