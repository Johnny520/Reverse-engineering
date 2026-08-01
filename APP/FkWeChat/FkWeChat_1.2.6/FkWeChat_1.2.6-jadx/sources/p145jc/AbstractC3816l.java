package p145jc;

import ec.AbstractC2149k0;
import p376zd.C10030z0;

/* JADX INFO: renamed from: jc.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3816l {
    /* JADX INFO: renamed from: a */
    public static final void m15199a(int i10) {
        if (i10 >= 1) {
            return;
        }
        C10030z0.m38853a("Expected positive parallelism level, but got ", i10);
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC2149k0 m15200b(AbstractC2149k0 abstractC2149k0, String str) {
        return str != null ? new C3831v(abstractC2149k0, str) : abstractC2149k0;
    }
}
