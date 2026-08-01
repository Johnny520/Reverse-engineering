package p190k3;

import p074O2.InterfaceC1051i;

/* JADX INFO: renamed from: k3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2457e extends RuntimeException {

    /* JADX INFO: renamed from: d */
    public final transient InterfaceC1051i f7928d;

    public C2457e(InterfaceC1051i interfaceC1051i) {
        this.f7928d = interfaceC1051i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f7928d.toString();
    }
}
