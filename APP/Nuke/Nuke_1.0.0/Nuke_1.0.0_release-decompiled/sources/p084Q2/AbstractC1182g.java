package p084Q2;

import p074O2.C1052j;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;

/* JADX INFO: renamed from: Q2.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1182g extends AbstractC1176a {
    public AbstractC1182g(InterfaceC1046d interfaceC1046d) {
        super(interfaceC1046d);
        if (interfaceC1046d != null && interfaceC1046d.mo275e() != C1052j.f3286d) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return C1052j.f3286d;
    }
}
