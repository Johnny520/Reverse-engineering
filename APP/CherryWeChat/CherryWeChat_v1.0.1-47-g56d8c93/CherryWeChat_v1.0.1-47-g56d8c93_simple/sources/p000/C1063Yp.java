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
    public static final Logger f3370a = null;

    /* JADX INFO: renamed from: b */
    public static final byte[] f3371b = null;

    /* JADX INFO: renamed from: c */
    public static final C1063Yp f3372c = null;

    static {
        f3370a = Logger.getLogger(C1063Yp.class.getName());
        f3371b = new byte[]{0};
        f3372c = new C1063Yp();
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: a */
    public final Class mo28a() {
        return InterfaceC0891Up.class;
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: b */
    public final Object mo29b(C2656w4 r6) {
        Iterator r0 = ((ConcurrentMap) r6.f9196b).values().iterator();
    L4:
        if (r0.hasNext() == false) goto L20;
        Iterator r1 = ((List) r0.next()).iterator();
    L7:
        if (r1.hasNext() == false) goto L4;
        C2516su r2 = (C2516su) r1.next();
        AbstractC0828TB r3 = r2.f8814h;
        if ((r3 instanceof AbstractC0977Wp) == false) goto L7;
        AbstractC0977Wp r32 = (AbstractC0977Wp) r3;
        byte[] r22 = r2.f8809c;
        if (r22 != null) goto L13;
        byte[] r23 = null;
    L14:
        C2787z6 r24 = C2787z6.m5359a(r23);
        if (r24.equals(r32.mo300N()) == true) goto L7;
        throw new GeneralSecurityException("Mac Key with parameters " + r32.mo301O() + " has wrong output prefix (" + r32.mo300N() + ") instead of (" + r24 + ")");
    L13:
        r23 = Arrays.copyOf(r22, r22.length);
        goto L14
    L20:
        return new C1020Xp(r6);
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: c */
    public final Class mo30c() {
        return InterfaceC0891Up.class;
    }
}
