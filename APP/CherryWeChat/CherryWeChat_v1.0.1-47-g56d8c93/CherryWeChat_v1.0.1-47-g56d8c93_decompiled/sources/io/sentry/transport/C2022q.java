package io.sentry.transport;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/* JADX INFO: renamed from: io.sentry.transport.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2022q extends AbstractQueuedSynchronizer {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f7210a = 0;

    public C2022q() {
        setState(0);
    }

    /* JADX INFO: renamed from: a */
    public static int m4171a(C2022q c2022q) {
        return c2022q.getState();
    }

    /* JADX INFO: renamed from: b */
    public static void m4172b(C2022q c2022q) {
        int state;
        do {
            state = c2022q.getState();
        } while (!c2022q.compareAndSetState(state, state + 1));
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int i) {
        return getState() == 0 ? 1 : -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int i) {
        int state;
        int i2;
        do {
            state = getState();
            if (state == 0) {
                return false;
            }
            i2 = state - 1;
        } while (!compareAndSetState(state, i2));
        return i2 == 0;
    }
}
