package io.sentry;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: io.sentry.c0 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1833c0 {
    /* JADX INFO: renamed from: g */
    void mo3695g(long j);

    boolean isClosed();

    /* JADX INFO: renamed from: m */
    void mo3700m();

    /* JADX INFO: renamed from: q */
    Future mo3703q(Runnable runnable, long j);

    Future submit(Runnable runnable);
}
