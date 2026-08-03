package io.sentry;

/* JADX INFO: renamed from: io.sentry.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1939p0 implements InterfaceC1642W {

    /* JADX INFO: renamed from: a */
    public final Runtime f6830a = Runtime.getRuntime();

    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: a */
    public final void mo3749a(C1827b1 c1827b1) {
        Runtime runtime = this.f6830a;
        c1827b1.f6602b = Long.valueOf(runtime.totalMemory() - runtime.freeMemory());
    }

    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: b */
    public final void mo3750b() {
    }
}
