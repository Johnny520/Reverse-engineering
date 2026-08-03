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

    /* JADX INFO: renamed from: d */
    public final long f6000d;

    /* JADX INFO: renamed from: e */
    public final ILogger f6001e;

    /* JADX INFO: renamed from: c */
    public CountDownLatch f5999c = new CountDownLatch(1);

    /* JADX INFO: renamed from: a */
    public boolean f5997a = false;

    /* JADX INFO: renamed from: b */
    public boolean f5998b = false;

    public C1672O(long j, ILogger iLogger) {
        this.f6000d = j;
        AbstractC1856a.m4048D("ILogger is required.", iLogger);
        this.f6001e = iLogger;
    }

    @Override // io.sentry.hints.InterfaceC1889g
    /* JADX INFO: renamed from: a */
    public final boolean mo3846a() {
        return this.f5997a;
    }

    @Override // io.sentry.hints.InterfaceC1892j
    /* JADX INFO: renamed from: b */
    public final void mo3847b(boolean z) {
        this.f5998b = z;
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
        try {
            return this.f5999c.await(this.f6000d, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.f6001e.mo3683r(EnumC1657a2.ERROR, "Exception while awaiting on lock.", e);
            return false;
        }
    }

    @Override // io.sentry.hints.InterfaceC1889g
    /* JADX INFO: renamed from: e */
    public final void mo3850e(boolean z) {
        this.f5997a = z;
    }
}
