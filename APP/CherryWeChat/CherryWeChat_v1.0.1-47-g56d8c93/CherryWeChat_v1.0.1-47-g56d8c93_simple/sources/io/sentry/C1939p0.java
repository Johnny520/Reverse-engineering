package io.sentry;

/* JADX INFO: renamed from: io.sentry.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1939p0 implements InterfaceC1642W {

    /* JADX INFO: renamed from: a */
    public final Runtime f6830a;

    public C1939p0() {
        this.f6830a = Runtime.getRuntime();
    }

    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: a */
    public final void mo3749a(C1827b1 r6) {
        Runtime r0 = this.f6830a;
        r6.f6602b = Long.valueOf(r0.totalMemory() - r0.freeMemory());
    }

    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: b */
    public final void mo3750b() {
    }
}
