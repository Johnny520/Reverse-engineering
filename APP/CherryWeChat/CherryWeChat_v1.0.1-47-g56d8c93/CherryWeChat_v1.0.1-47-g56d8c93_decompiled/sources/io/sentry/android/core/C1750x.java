package io.sentry.android.core;

import io.sentry.ILogger;
import io.sentry.hints.AbstractC1885c;
import io.sentry.hints.InterfaceC1883a;
import io.sentry.hints.InterfaceC1884b;
import io.sentry.protocol.C1970t;

/* JADX INFO: renamed from: io.sentry.android.core.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1750x extends AbstractC1885c implements InterfaceC1884b, InterfaceC1883a {

    /* JADX INFO: renamed from: d */
    public final long f6354d;

    /* JADX INFO: renamed from: e */
    public final boolean f6355e;

    /* JADX INFO: renamed from: f */
    public final boolean f6356f;

    public C1750x(long j, ILogger iLogger, long j2, boolean z, boolean z2) {
        super(j, iLogger);
        this.f6354d = j2;
        this.f6355e = z;
        this.f6356f = z2;
    }

    @Override // io.sentry.hints.InterfaceC1884b
    /* JADX INFO: renamed from: a */
    public final boolean mo3937a() {
        return this.f6355e;
    }

    @Override // io.sentry.hints.InterfaceC1883a
    /* JADX INFO: renamed from: b */
    public final Long mo3923b() {
        return Long.valueOf(this.f6354d);
    }

    @Override // io.sentry.hints.InterfaceC1883a
    /* JADX INFO: renamed from: c */
    public final boolean mo3924c() {
        return false;
    }

    @Override // io.sentry.hints.InterfaceC1883a
    /* JADX INFO: renamed from: e */
    public final String mo3925e() {
        return this.f6356f ? "anr_background" : "anr_foreground";
    }

    @Override // io.sentry.hints.AbstractC1885c
    /* JADX INFO: renamed from: f */
    public final boolean mo3740f(C1970t c1970t) {
        return true;
    }

    @Override // io.sentry.hints.AbstractC1885c
    /* JADX INFO: renamed from: g */
    public final void mo3741g(C1970t c1970t) {
    }
}
