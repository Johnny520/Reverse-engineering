package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠۟۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4388 extends RuntimeException {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225 f9039;

    public C4388(@InterfaceC6399 InterfaceC4225 interfaceC4225) {
        this.f9039 = interfaceC4225;
    }

    @Override // java.lang.Throwable
    @InterfaceC6399
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @InterfaceC6399
    public String getLocalizedMessage() {
        return this.f9039.toString();
    }
}
