package io.sentry;

import io.sentry.hints.InterfaceC1886d;
import io.sentry.hints.InterfaceC1888f;
import io.sentry.hints.InterfaceC1889g;
import io.sentry.hints.InterfaceC1892j;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.v */
/* JADX INFO: loaded from: classes.dex */
public final class C2043v implements InterfaceC1886d, InterfaceC1889g, InterfaceC1892j, InterfaceC1888f {

    /* JADX INFO: renamed from: a */
    public boolean f7232a = false;

    /* JADX INFO: renamed from: b */
    public boolean f7233b = false;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f7234c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d */
    public final long f7235d;

    /* JADX INFO: renamed from: e */
    public final ILogger f7236e;

    /* JADX INFO: renamed from: f */
    public final String f7237f;

    /* JADX INFO: renamed from: g */
    public final Queue f7238g;

    public C2043v(long j, ILogger iLogger, String str, C1609M2 c1609m2) {
        this.f7235d = j;
        this.f7237f = str;
        this.f7238g = c1609m2;
        this.f7236e = iLogger;
    }

    @Override // io.sentry.hints.InterfaceC1889g
    /* JADX INFO: renamed from: a */
    public final boolean mo3846a() {
        return this.f7232a;
    }

    @Override // io.sentry.hints.InterfaceC1892j
    /* JADX INFO: renamed from: b */
    public final void mo3847b(boolean z) {
        this.f7233b = z;
        this.f7234c.countDown();
    }

    @Override // io.sentry.hints.InterfaceC1892j
    /* JADX INFO: renamed from: c */
    public final boolean mo3848c() {
        return this.f7233b;
    }

    @Override // io.sentry.hints.InterfaceC1888f
    /* JADX INFO: renamed from: d */
    public final boolean mo3849d() {
        try {
            return this.f7234c.await(this.f7235d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f7236e.mo3683r(EnumC1657a2.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.InterfaceC1889g
    /* JADX INFO: renamed from: e */
    public final void mo3850e(boolean z) {
        this.f7232a = z;
    }
}
