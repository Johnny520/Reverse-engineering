package p000;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: q9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2403q9 implements InterfaceC2602uu {

    /* JADX INFO: renamed from: a */
    public static final C2403q9 f8421a = new C2403q9();

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: a */
    public final Class mo28a() {
        return C2352p9.class;
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: b */
    public final Object mo29b(C2656w4 c2656w4) throws GeneralSecurityException {
        if (((C2516su) c2656w4.f9197c) == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = ((ConcurrentMap) c2656w4.f9196b).values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new C2352p9();
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: c */
    public final Class mo30c() {
        return C2352p9.class;
    }
}
