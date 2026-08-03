package Yue;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: Yue.ۥۡۧ۠ۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7185 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Set<C7184> f2724 = new LinkedHashSet();

    /* JADX INFO: renamed from: ۥ */
    public final synchronized void m3470(@InterfaceC6399 C7184 c7184) {
        C5499.m17103(c7184, "route");
        this.f2724.remove(c7184);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final synchronized void m3471(@InterfaceC6399 C7184 c7184) {
        C5499.m17103(c7184, "failedRoute");
        this.f2724.add(c7184);
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final synchronized boolean m22508(@InterfaceC6399 C7184 c7184) {
        C5499.m17103(c7184, "route");
        return this.f2724.contains(c7184);
    }
}
