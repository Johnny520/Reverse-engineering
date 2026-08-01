package p000;

/* JADX INFO: renamed from: pg */
/* JADX INFO: loaded from: classes.dex */
public final class C0595pg extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final transient InterfaceC0295he f3709a;

    public C0595pg(InterfaceC0295he interfaceC0295he) {
        this.f3709a = interfaceC0295he;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3709a.toString();
    }
}
