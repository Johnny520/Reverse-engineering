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
    public boolean f7232a;

    /* JADX INFO: renamed from: b */
    public boolean f7233b;

    /* JADX INFO: renamed from: c */
    public final CountDownLatch f7234c;

    /* JADX INFO: renamed from: d */
    public final long f7235d;

    /* JADX INFO: renamed from: e */
    public final ILogger f7236e;

    /* JADX INFO: renamed from: f */
    public final String f7237f;

    /* JADX INFO: renamed from: g */
    public final Queue f7238g;

    public C2043v(long r2, ILogger r4, String r5, C1609M2 r6) {
        this.f7232a = false;
        this.f7233b = false;
        this.f7235d = r2;
        this.f7237f = r5;
        this.f7238g = r6;
        this.f7234c = new CountDownLatch(1);
        this.f7236e = r4;
    }

    @Override // io.sentry.hints.InterfaceC1889g
    /* JADX INFO: renamed from: a */
    public final boolean mo3846a() {
        return this.f7232a;
    }

    @Override // io.sentry.hints.InterfaceC1892j
    /* JADX INFO: renamed from: b */
    public final void mo3847b(boolean r1) {
        this.f7233b = r1;
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
        return this.f7234c.await(this.f7235d, TimeUnit.MILLISECONDS);
    L4:
        e = move-exception;
        Thread.currentThread().interrupt();
        EnumC1657a2 r1 = EnumC1657a2.ERROR;
        this.f7236e.mo3683r(r1, "Exception while awaiting on lock.", e);
        return false;
    }

    @Override // io.sentry.hints.InterfaceC1889g
    /* JADX INFO: renamed from: e */
    public final void mo3850e(boolean r1) {
        this.f7232a = r1;
    }
}
