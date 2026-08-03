package p370yf;

import p136j8.C2104o;
import wf.C5562h;
import wf.InterfaceC5557c;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: yf.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6042g extends AbstractC6036a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC6042g(InterfaceC5557c interfaceC5557c) {
        super(interfaceC5557c);
        if (interfaceC5557c == null || interfaceC5557c.getContext() == C5562h.f22661g) {
            return;
        }
        C2104o.m5294t("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5557c
    public InterfaceC5561g getContext() {
        return C5562h.f22661g;
    }
}
