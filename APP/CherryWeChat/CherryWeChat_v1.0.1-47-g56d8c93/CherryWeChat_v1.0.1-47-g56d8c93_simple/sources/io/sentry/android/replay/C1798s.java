package io.sentry.android.replay;

import io.sentry.android.core.C1660C;
import io.sentry.util.C2029a;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.sentry.android.replay.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1798s implements Closeable {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f6519a;

    /* JADX INFO: renamed from: b */
    public final C2029a f6520b;

    /* JADX INFO: renamed from: c */
    public final C1660C f6521c;

    /* JADX INFO: renamed from: d */
    public final C1797r f6522d;

    public C1798s() {
        this.f6519a = new AtomicBoolean(false);
        this.f6520b = new C2029a();
        this.f6521c = new C1660C(1, this);
        this.f6522d = new C1797r(this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f6519a.set(true);
        this.f6521c.clear();
    }
}
