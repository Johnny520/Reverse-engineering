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

    public C1750x(long r1, ILogger r3, long r4, boolean r6, boolean r7) {
        super(r1, r3);
        this.f6354d = r4;
        this.f6355e = r6;
        this.f6356f = r7;
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
        if (this.f6356f == false) goto L6;
        return "anr_background";
    L6:
        return "anr_foreground";
    }

    @Override // io.sentry.hints.AbstractC1885c
    /* JADX INFO: renamed from: f */
    public final boolean mo3740f(C1970t r1) {
        return true;
    }

    @Override // io.sentry.hints.AbstractC1885c
    /* JADX INFO: renamed from: g */
    public final void mo3741g(C1970t r1) {
    }
}
