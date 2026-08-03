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

    public C1869a(C1961k c1961k, Throwable th, Thread thread, boolean z) {
        this.f6704a = c1961k;
        AbstractC1856a.m4048D("Throwable is required.", th);
        this.f6705b = th;
        AbstractC1856a.m4048D("Thread is required.", thread);
        this.f6706c = thread;
        this.f6707d = z;
    }
}
