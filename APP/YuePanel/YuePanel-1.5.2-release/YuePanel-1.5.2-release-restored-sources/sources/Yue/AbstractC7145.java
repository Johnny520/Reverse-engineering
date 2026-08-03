package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۦۧۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public abstract class AbstractC7145 extends AbstractC3513 {
    public AbstractC7145(@InterfaceC6489 InterfaceC4199<Object> interfaceC4199) {
        super(interfaceC4199);
        if (interfaceC4199 != null && interfaceC4199.getContext() != C4629.f9940) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        return C4629.f9940;
    }
}
