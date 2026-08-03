package io.sentry.cache.tape;

import java.io.Closeable;

/* JADX INFO: renamed from: io.sentry.cache.tape.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1846e implements Iterable, Closeable {
    public void clear() {
        remove(size());
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo4017q(Object obj);

    public abstract void remove(int i);

    public abstract int size();
}
