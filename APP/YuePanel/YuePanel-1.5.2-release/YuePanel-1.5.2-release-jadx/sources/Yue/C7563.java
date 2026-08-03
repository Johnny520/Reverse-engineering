package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7563<T> implements InterfaceC4199<T>, InterfaceC4246 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4199<T> f22860;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225 f22861;

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7563(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199, @InterfaceC6399 InterfaceC4225 interfaceC4225) {
        this.f22860 = interfaceC4199;
        this.f22861 = interfaceC4225;
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public InterfaceC4246 getCallerFrame() {
        InterfaceC4199<T> interfaceC4199 = this.f22860;
        if (interfaceC4199 instanceof InterfaceC4246) {
            return (InterfaceC4246) interfaceC4199;
        }
        return null;
    }

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        return this.f22861;
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Yue.InterfaceC4199
    public void resumeWith(@InterfaceC6399 Object obj) {
        this.f22860.resumeWith(obj);
    }
}
