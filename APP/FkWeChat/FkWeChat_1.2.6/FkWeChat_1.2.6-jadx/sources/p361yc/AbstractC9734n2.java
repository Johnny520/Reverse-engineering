package p361yc;

import p215oc.C5725t;

/* JADX INFO: renamed from: yc.n2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9734n2 {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m37985c(AbstractC9734n2 abstractC9734n2, int i10, int i11, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: ensureCapacity");
            return;
        }
        if ((i11 & 1) != 0) {
            i10 = abstractC9734n2.mo37798d() + 1;
        }
        abstractC9734n2.mo37797b(i10);
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo37796a();

    /* JADX INFO: renamed from: b */
    public abstract void mo37797b(int i10);

    /* JADX INFO: renamed from: d */
    public abstract int mo37798d();
}
