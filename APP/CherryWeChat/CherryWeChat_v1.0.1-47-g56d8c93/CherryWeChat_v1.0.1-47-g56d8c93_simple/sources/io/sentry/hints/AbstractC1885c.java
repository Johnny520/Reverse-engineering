package io.sentry.hints;

import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.protocol.C1970t;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.hints.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1885c implements InterfaceC1888f {

    /* JADX INFO: renamed from: a */
    public final CountDownLatch f6761a;

    /* JADX INFO: renamed from: b */
    public final long f6762b;

    /* JADX INFO: renamed from: c */
    public final ILogger f6763c;

    public AbstractC1885c(long r1, ILogger r3) {
        this.f6762b = r1;
        this.f6761a = new CountDownLatch(1);
        this.f6763c = r3;
    }

    @Override // io.sentry.hints.InterfaceC1888f
    /* JADX INFO: renamed from: d */
    public final boolean mo3849d() {
        return this.f6761a.await(this.f6762b, TimeUnit.MILLISECONDS);
    L4:
        e = move-exception;
        Thread.currentThread().interrupt();
        EnumC1657a2 r1 = EnumC1657a2.ERROR;
        this.f6763c.mo3683r(r1, "Exception while awaiting for flush in BlockingFlushHint", e);
        return false;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo3740f(C1970t r1);

    /* JADX INFO: renamed from: g */
    public abstract void mo3741g(C1970t r1);
}
