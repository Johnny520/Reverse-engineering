package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۢ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C8099 extends AbstractC4232 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public static final C8099 f24023 = new C8099();

    @Override // Yue.AbstractC4232
    public void dispatch(@InterfaceC6399 InterfaceC4225 interfaceC4225, @InterfaceC6399 Runnable runnable) {
        C8574 c8574 = (C8574) interfaceC4225.get(C8574.f25443);
        if (c8574 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c8574.f25444 = true;
    }

    @Override // Yue.AbstractC4232
    public boolean isDispatchNeeded(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        return false;
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    @InterfaceC4764
    public AbstractC4232 limitedParallelism(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // Yue.AbstractC4232
    @InterfaceC6399
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
