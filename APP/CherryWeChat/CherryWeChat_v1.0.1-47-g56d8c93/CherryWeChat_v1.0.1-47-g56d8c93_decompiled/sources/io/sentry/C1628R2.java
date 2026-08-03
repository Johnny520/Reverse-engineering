package io.sentry;

import io.sentry.hints.AbstractC1885c;
import io.sentry.hints.InterfaceC1890h;
import io.sentry.hints.InterfaceC1893k;
import io.sentry.protocol.C1970t;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.sentry.R2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1628R2 extends AbstractC1885c implements InterfaceC1890h, InterfaceC1893k {

    /* JADX INFO: renamed from: d */
    public final AtomicReference f5855d;

    public C1628R2(long j, ILogger iLogger) {
        super(j, iLogger);
        this.f5855d = new AtomicReference();
    }

    @Override // io.sentry.hints.AbstractC1885c
    /* JADX INFO: renamed from: f */
    public final boolean mo3740f(C1970t c1970t) {
        C1970t c1970t2 = (C1970t) this.f5855d.get();
        return c1970t2 != null && c1970t2.equals(c1970t);
    }

    @Override // io.sentry.hints.AbstractC1885c
    /* JADX INFO: renamed from: g */
    public final void mo3741g(C1970t c1970t) {
        this.f5855d.set(c1970t);
    }
}
