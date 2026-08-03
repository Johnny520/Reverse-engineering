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
    public static int m4171a(C2022q r0) {
        return r0.getState();
    }

    /* JADX INFO: renamed from: b */
    public static void m4172b(C2022q r2) {
    L2:
        int r0 = r2.getState();
        if (r2.compareAndSetState(r0, r0 + 1) == false) goto L2;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final int tryAcquireShared(int r1) {
        if (getState() != 0) goto L6;
        return 1;
    L6:
        return -1;
    }

    @Override // java.util.concurrent.locks.AbstractQueuedSynchronizer
    public final boolean tryReleaseShared(int r3) {
    L2:
        int r32 = getState();
        if (r32 == 0) goto L4;
        int r1 = r32 - 1;
        if (compareAndSetState(r32, r1) == false) goto L2;
        if (r1 != 0) goto L10;
        return true;
    L10:
        return false;
    L4:
        return false;
    }
}
