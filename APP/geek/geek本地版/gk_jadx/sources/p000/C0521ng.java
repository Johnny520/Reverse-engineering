package p000;

/* JADX INFO: renamed from: ng */
/* JADX INFO: loaded from: classes.dex */
public final class C0521ng extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final transient InterfaceC0258ge f3412a;

    public C0521ng(InterfaceC0258ge interfaceC0258ge) {
        this.f3412a = interfaceC0258ge;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f3412a.toString();
    }
}
