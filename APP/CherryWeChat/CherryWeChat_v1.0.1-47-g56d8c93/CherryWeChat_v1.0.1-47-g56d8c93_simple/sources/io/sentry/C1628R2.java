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

    public C1628R2(long r1, ILogger r3) {
        super(r1, r3);
        this.f5855d = new AtomicReference();
    }

    @Override // io.sentry.hints.AbstractC1885c
    /* JADX INFO: renamed from: f */
    public final boolean mo3740f(C1970t r2) {
        C1970t r0 = (C1970t) this.f5855d.get();
        if (r0 != null) goto L5;
        return false;
    L5:
        if (r0.equals(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // io.sentry.hints.AbstractC1885c
    /* JADX INFO: renamed from: g */
    public final void mo3741g(C1970t r2) {
        this.f5855d.set(r2);
    }
}
