package p000;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Zm */
/* JADX INFO: loaded from: classes.dex */
public final class C1103Zm {

    /* JADX INFO: renamed from: b */
    public static final Logger f3494b = Logger.getLogger(C1103Zm.class.getName());

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f3495a;

    public C1103Zm(C1103Zm c1103Zm) {
        this.f3495a = new ConcurrentHashMap(c1103Zm.f3495a);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C1060Ym m2025a(String str) {
        if (!this.f3495a.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return (C1060Ym) this.f3495a.get(str);
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m2026b(AbstractC1551in abstractC1551in) {
        int iMo2969a = abstractC1551in.mo2969a();
        if (!(iMo2969a != 1 ? AbstractC2374ph.m4806c(iMo2969a) : AbstractC2374ph.m4805b(iMo2969a))) {
            throw new GeneralSecurityException("failed to register key manager " + abstractC1551in.getClass() + " as it is not FIPS compatible.");
        }
        m2027c(new C1060Ym(abstractC1551in));
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m2027c(C1060Ym c1060Ym) {
        try {
            AbstractC1551in abstractC1551in = c1060Ym.f3368a;
            Class cls = abstractC1551in.f5510c;
            if (!abstractC1551in.f5509b.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + abstractC1551in.toString() + " does not support primitive class " + cls.getName());
            }
            String strMo2970b = abstractC1551in.mo2970b();
            C1060Ym c1060Ym2 = (C1060Ym) this.f3495a.get(strMo2970b);
            if (c1060Ym2 != null && !c1060Ym2.f3368a.getClass().equals(c1060Ym.f3368a.getClass())) {
                f3494b.warning("Attempted overwrite of a registered key manager for key type ".concat(strMo2970b));
                throw new GeneralSecurityException("typeUrl (" + strMo2970b + ") is already registered with " + c1060Ym2.f3368a.getClass().getName() + ", cannot be re-registered with " + c1060Ym.f3368a.getClass().getName());
            }
            this.f3495a.putIfAbsent(strMo2970b, c1060Ym);
        } catch (Throwable th) {
            throw th;
        }
    }

    public C1103Zm() {
        this.f3495a = new ConcurrentHashMap();
    }
}
