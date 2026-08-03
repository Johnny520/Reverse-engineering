package p000;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Yp */
/* JADX INFO: loaded from: classes.dex */
public final class C1063Yp implements InterfaceC2602uu {

    /* JADX INFO: renamed from: a */
    public static final Logger f3370a = Logger.getLogger(C1063Yp.class.getName());

    /* JADX INFO: renamed from: b */
    public static final byte[] f3371b = {0};

    /* JADX INFO: renamed from: c */
    public static final C1063Yp f3372c = new C1063Yp();

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: a */
    public final Class mo28a() {
        return InterfaceC0891Up.class;
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: b */
    public final Object mo29b(C2656w4 c2656w4) throws GeneralSecurityException {
        Iterator it = ((ConcurrentMap) c2656w4.f9196b).values().iterator();
        while (it.hasNext()) {
            for (C2516su c2516su : (List) it.next()) {
                AbstractC0828TB abstractC0828TB = c2516su.f8814h;
                if (abstractC0828TB instanceof AbstractC0977Wp) {
                    AbstractC0977Wp abstractC0977Wp = (AbstractC0977Wp) abstractC0828TB;
                    byte[] bArr = c2516su.f8809c;
                    C2787z6 c2787z6M5359a = C2787z6.m5359a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!c2787z6M5359a.equals(abstractC0977Wp.mo300N())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + abstractC0977Wp.mo301O() + " has wrong output prefix (" + abstractC0977Wp.mo300N() + ") instead of (" + c2787z6M5359a + ")");
                    }
                }
            }
        }
        return new C1020Xp(c2656w4);
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: c */
    public final Class mo30c() {
        return InterfaceC0891Up.class;
    }
}
