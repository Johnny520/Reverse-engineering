package io.sentry.android.core;

import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.InterfaceC1886d;
import io.sentry.hints.InterfaceC1888f;
import io.sentry.hints.InterfaceC1889g;
import io.sentry.hints.InterfaceC1892j;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.android.core.O */
/* JADX INFO: loaded from: classes.dex */
public final class C1672O implements InterfaceC1886d, InterfaceC1889g, InterfaceC1892j, InterfaceC1888f {

    /* JADX INFO: renamed from: a */
    public boolean f5997a;

    /* JADX INFO: renamed from: b */
    public boolean f5998b;

    /* JADX INFO: renamed from: c */
    public CountDownLatch f5999c;

    /* JADX INFO: renamed from: d */
    public final long f6000d;

    /* JADX INFO: renamed from: e */
    public final ILogger f6001e;

    public C1672O(long r3, ILogger r5) {
        this.f5999c = new CountDownLatch(1);
        this.f5997a = false;
        this.f5998b = false;
        this.f6000d = r3;
        AbstractC1856a.m4048D("ILogger is required.", r5);
        this.f6001e = r5;
    }

    @Override // io.sentry.hints.InterfaceC1889g
    /* JADX INFO: renamed from: a */
    public final boolean mo3846a() {
        return this.f5997a;
    }

    @Override // io.sentry.hints.InterfaceC1892j
    /* JADX INFO: renamed from: b */
    public final void mo3847b(boolean r1) {
        this.f5998b = r1;
        this.f5999c.countDown();
    }

    @Override // io.sentry.hints.InterfaceC1892j
    /* JADX INFO: renamed from: c */
    public final boolean mo3848c() {
        return this.f5998b;
    }

    @Override // io.sentry.hints.InterfaceC1888f
    /* JADX INFO: renamed from: d */
    public final boolean mo3849d() {
        return this.f5999c.await(this.f6000d, TimeUnit.MILLISECONDS);
    L4:
        e = move-exception;
        Thread.currentThread().interrupt();
        EnumC1657a2 r1 = EnumC1657a2.ERROR;
        this.f6001e.mo3683r(r1, "Exception while awaiting on lock.", e);
        return false;
    }

    @Override // io.sentry.hints.InterfaceC1889g
    /* JADX INFO: renamed from: e */
    public final void mo3850e(boolean r1) {
        this.f5997a = r1;
    }
}
