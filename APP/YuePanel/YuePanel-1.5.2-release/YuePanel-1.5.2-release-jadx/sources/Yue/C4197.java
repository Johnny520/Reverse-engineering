package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۧۤ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4197 implements InterfaceC4243 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225 f8513;

    public C4197(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        this.f8513 = interfaceC4225;
    }

    @Override // Yue.InterfaceC4243
    @InterfaceC6399
    public InterfaceC4225 getCoroutineContext() {
        return this.f8513;
    }

    @InterfaceC6399
    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}
