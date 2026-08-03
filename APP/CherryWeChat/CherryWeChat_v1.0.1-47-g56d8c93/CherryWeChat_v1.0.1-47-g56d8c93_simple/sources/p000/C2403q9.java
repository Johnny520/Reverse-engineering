package p000;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: q9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2403q9 implements InterfaceC2602uu {

    /* JADX INFO: renamed from: a */
    public static final C2403q9 f8421a = null;

    static {
        f8421a = new C2403q9();
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: a */
    public final Class mo28a() {
        return C2352p9.class;
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: b */
    public final Object mo29b(C2656w4 r3) {
        if (((C2516su) r3.f9197c) == null) goto L14;
        Iterator r32 = ((ConcurrentMap) r3.f9196b).values().iterator();
    L6:
        if (r32.hasNext() == false) goto L12;
        Iterator r0 = ((List) r32.next()).iterator();
    L9:
        if (r0.hasNext() == false) goto L6;
        C2352p9 r1 = (C2352p9) ((C2516su) r0.next()).f8807a;
        goto L9
    L12:
        return new C2352p9();
    L14:
        throw new GeneralSecurityException("no primary in primitive set");
    }

    @Override // p000.InterfaceC2602uu
    /* JADX INFO: renamed from: c */
    public final Class mo30c() {
        return C2352p9.class;
    }
}
