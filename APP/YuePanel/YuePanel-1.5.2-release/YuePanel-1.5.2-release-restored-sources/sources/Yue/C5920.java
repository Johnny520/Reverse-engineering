package Yue;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۦۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5920 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C5920 f1780;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final boolean f1781 = false;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    @InterfaceC5568
    public static final AbstractC5912 f14795;

    static {
        C5920 c5920 = new C5920();
        f1780 = c5920;
        C7705.m24502(C5921.f1782, true);
        f14795 = c5920.m2588();
    }

    /* JADX INFO: renamed from: ۥ */
    public final AbstractC5912 m2588() {
        Object next;
        AbstractC5912 abstractC5912M18494;
        try {
            List listM23081 = C7342.m23081(C7332.m22869(ServiceLoader.load(InterfaceC5919.class, InterfaceC5919.class.getClassLoader()).iterator()));
            Iterator it = listM23081.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iMo6568 = ((InterfaceC5919) next).mo6568();
                    do {
                        Object next2 = it.next();
                        int iMo65682 = ((InterfaceC5919) next2).mo6568();
                        if (iMo6568 < iMo65682) {
                            next = next2;
                            iMo6568 = iMo65682;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            InterfaceC5919 interfaceC5919 = (InterfaceC5919) next;
            if (interfaceC5919 != null && (abstractC5912M18494 = C5921.m18494(interfaceC5919, listM23081)) != null) {
                return abstractC5912M18494;
            }
            return C5921.m2590(null, null, 3, null);
        } catch (Throwable th) {
            return C5921.m2590(th, null, 2, null);
        }
    }
}
