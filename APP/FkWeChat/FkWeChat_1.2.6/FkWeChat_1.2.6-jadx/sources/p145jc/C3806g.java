package p145jc;

import p228p8.InterfaceC5980j;

/* JADX INFO: renamed from: jc.g */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3806g extends RuntimeException {

    /* JADX INFO: renamed from: q */
    public final transient InterfaceC5980j f10979q;

    public C3806g(InterfaceC5980j interfaceC5980j) {
        this.f10979q = interfaceC5980j;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public String getLocalizedMessage() {
        return String.valueOf(this.f10979q);
    }
}
