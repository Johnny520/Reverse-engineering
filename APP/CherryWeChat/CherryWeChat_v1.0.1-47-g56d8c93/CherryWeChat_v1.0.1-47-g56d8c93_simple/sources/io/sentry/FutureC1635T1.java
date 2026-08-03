package io.sentry;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.sentry.T1 */
/* JADX INFO: loaded from: classes.dex */
public final class FutureC1635T1 implements Future {
    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean r1) {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        throw new CancellationException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long r1, TimeUnit r3) {
        throw new CancellationException();
    }
}
