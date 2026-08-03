package io.sentry.util;

import io.sentry.C1981r;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.sentry.util.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2029a extends ReentrantLock {
    /* JADX INFO: renamed from: a */
    public final C1981r m4173a() {
        lock();
        return new C1981r(1, this);
    }
}
