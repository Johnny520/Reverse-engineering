package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zu0 extends AbstractC0955y9 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zu0(InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        if (interfaceC0322ik == null || interfaceC0322ik.mo540e() == C0220fs.f1799d) {
            return;
        }
        C0921xc.m5131l("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        return C0220fs.f1799d;
    }
}
