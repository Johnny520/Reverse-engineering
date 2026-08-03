package io.sentry.cache.tape;

import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.cache.tape.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1843b extends AbstractC1846e {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1842a();
    }

    @Override // io.sentry.cache.tape.AbstractC1846e
    /* JADX INFO: renamed from: q */
    public final void mo4017q(Object obj) {
    }

    @Override // io.sentry.cache.tape.AbstractC1846e
    public final void remove(int i) {
    }

    @Override // io.sentry.cache.tape.AbstractC1846e
    public final int size() {
        return 0;
    }
}
