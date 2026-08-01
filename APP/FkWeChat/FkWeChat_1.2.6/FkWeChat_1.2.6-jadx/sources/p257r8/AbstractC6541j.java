package p257r8;

import p228p8.C5981k;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p376zd.C9987e;

/* JADX INFO: renamed from: r8.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6541j extends AbstractC6532a {
    public AbstractC6541j(InterfaceC5976f interfaceC5976f) {
        super(interfaceC5976f);
        if (interfaceC5976f == null || interfaceC5976f.getContext() == C5981k.f18917q) {
            return;
        }
        C9987e.m38645a("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // p228p8.InterfaceC5976f
    public InterfaceC5980j getContext() {
        return C5981k.f18917q;
    }
}
