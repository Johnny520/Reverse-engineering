package io.sentry.exception;

import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1961k;

/* JADX INFO: renamed from: io.sentry.exception.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1869a extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final C1961k f6704a;

    /* JADX INFO: renamed from: b */
    public final Throwable f6705b;

    /* JADX INFO: renamed from: c */
    public final Thread f6706c;

    /* JADX INFO: renamed from: d */
    public final boolean f6707d;

    public C1869a(C1961k r1, Throwable r2, Thread r3, boolean r4) {
        this.f6704a = r1;
        AbstractC1856a.m4048D("Throwable is required.", r2);
        this.f6705b = r2;
        AbstractC1856a.m4048D("Thread is required.", r3);
        this.f6706c = r3;
        this.f6707d = r4;
    }
}
