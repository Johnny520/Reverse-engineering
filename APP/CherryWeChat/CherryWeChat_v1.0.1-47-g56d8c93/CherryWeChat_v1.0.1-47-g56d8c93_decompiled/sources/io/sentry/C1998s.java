package io.sentry;

/* JADX INFO: renamed from: io.sentry.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1998s implements InterfaceC1655a0 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f7166a = new ThreadLocal();

    @Override // io.sentry.InterfaceC1655a0
    /* JADX INFO: renamed from: a */
    public final InterfaceC1862d0 mo3736a(InterfaceC1651Z interfaceC1651Z) {
        InterfaceC1651Z interfaceC1651Z2 = get();
        f7166a.set(interfaceC1651Z);
        return new C1981r(0, interfaceC1651Z2);
    }

    @Override // io.sentry.InterfaceC1655a0
    public final void close() {
        f7166a.remove();
    }

    @Override // io.sentry.InterfaceC1655a0
    public final InterfaceC1651Z get() {
        return (InterfaceC1651Z) f7166a.get();
    }
}
