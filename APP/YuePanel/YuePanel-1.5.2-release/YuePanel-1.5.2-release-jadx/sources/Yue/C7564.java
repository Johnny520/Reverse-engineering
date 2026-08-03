package Yue;

/* JADX INFO: renamed from: Yue.ۥۢ۟ۧۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C7564 implements InterfaceC4246 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6489
    public final InterfaceC4246 f22862;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final StackTraceElement f22863;

    public C7564(@InterfaceC6489 InterfaceC4246 interfaceC4246, @InterfaceC6399 StackTraceElement stackTraceElement) {
        this.f22862 = interfaceC4246;
        this.f22863 = stackTraceElement;
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public InterfaceC4246 getCallerFrame() {
        return this.f22862;
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6399
    public StackTraceElement getStackTraceElement() {
        return this.f22863;
    }
}
