package p200nb;

import java.util.List;
import p200nb.AbstractC5542g;
import p229p9.InterfaceC6056z;

/* JADX INFO: renamed from: nb.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5537b {
    /* JADX INFO: renamed from: a */
    public final AbstractC5542g m22564a(InterfaceC6056z interfaceC6056z) {
        interfaceC6056z.getClass();
        for (C5543h c5543h : mo22565b()) {
            if (c5543h.m22574b(interfaceC6056z)) {
                return c5543h.m22573a(interfaceC6056z);
            }
        }
        return AbstractC5542g.a.f17320b;
    }

    /* JADX INFO: renamed from: b */
    public abstract List mo22565b();
}
