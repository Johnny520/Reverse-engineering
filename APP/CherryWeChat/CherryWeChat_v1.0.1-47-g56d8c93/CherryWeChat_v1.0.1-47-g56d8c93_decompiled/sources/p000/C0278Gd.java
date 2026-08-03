package p000;

/* JADX INFO: renamed from: Gd */
/* JADX INFO: loaded from: classes.dex */
public final class C0278Gd extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final transient InterfaceC1137ac f904a;

    public C0278Gd(InterfaceC1137ac interfaceC1137ac) {
        this.f904a = interfaceC1137ac;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return String.valueOf(this.f904a);
    }
}
