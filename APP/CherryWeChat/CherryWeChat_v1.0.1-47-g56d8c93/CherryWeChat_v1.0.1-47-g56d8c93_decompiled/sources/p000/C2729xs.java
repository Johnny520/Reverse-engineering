package p000;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: xs */
/* JADX INFO: loaded from: classes.dex */
public final class C2729xs {

    /* JADX INFO: renamed from: b */
    public static final C2729xs f9326b = new C2729xs();

    /* JADX INFO: renamed from: a */
    public final AtomicReference f9327a = new AtomicReference(new C2430qu(new C0649P3(26)));

    /* JADX INFO: renamed from: a */
    public final Class m5294a(Class cls) {
        HashMap map = ((C2430qu) this.f9327a.get()).f8525b;
        if (map.containsKey(cls)) {
            return ((InterfaceC2602uu) map.get(cls)).mo28a();
        }
        throw new GeneralSecurityException("No input primitive class for " + cls + " available");
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m5295b(C2207lu c2207lu) {
        C0649P3 c0649p3 = new C0649P3((C2430qu) this.f9327a.get());
        c0649p3.m1284O(c2207lu);
        this.f9327a.set(new C2430qu(c0649p3));
    }
}
