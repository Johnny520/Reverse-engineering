package io.sentry.android.core;

import io.sentry.config.AbstractC1856a;

/* JADX INFO: loaded from: classes.dex */
final class ApplicationNotResponding extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final Thread f5954a;

    public ApplicationNotResponding(String str, Thread thread) {
        super(str);
        AbstractC1856a.m4048D("Thread must be provided.", thread);
        this.f5954a = thread;
        setStackTrace(thread.getStackTrace());
    }
}
