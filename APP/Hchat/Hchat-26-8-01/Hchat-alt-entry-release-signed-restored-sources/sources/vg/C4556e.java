package vg;

import wf.InterfaceC5561g;

/* JADX INFO: renamed from: vg.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4556e extends RuntimeException {

    /* JADX INFO: renamed from: g */
    public final transient InterfaceC5561g f15024g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4556e(InterfaceC5561g interfaceC5561g) {
        this.f15024g = interfaceC5561g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f15024g.toString();
    }
}
