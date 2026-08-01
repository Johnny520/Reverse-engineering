package p160kb;

import gb.C2713t1;
import p215oc.C5725t;

/* JADX INFO: renamed from: kb.n */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4234n {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ C2713t1 m16717a(InterfaceC4235o interfaceC4235o, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if (obj != null) {
            C5725t.m23179a("Super calls with default arguments not supported in this target, function: newTypeCheckerState");
            return null;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return interfaceC4235o.mo10956z0(z10, z11, z12);
    }
}
