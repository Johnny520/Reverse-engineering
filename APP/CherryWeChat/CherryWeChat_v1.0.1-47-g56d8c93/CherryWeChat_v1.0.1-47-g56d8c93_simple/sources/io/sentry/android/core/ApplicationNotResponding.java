package io.sentry.android.core;

import io.sentry.config.AbstractC1856a;

/* JADX INFO: loaded from: classes.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final Thread f5954a;

    public ApplicationNotResponding(String r1, Thread r2) {
        super(r1);
        AbstractC1856a.m4048D("Thread must be provided.", r2);
        this.f5954a = r2;
        setStackTrace(r2.getStackTrace());
    }
}
