package io.sentry.android.core.internal.util;

import android.os.SystemClock;
import io.sentry.transport.InterfaceC2011f;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1715c implements InterfaceC2011f {

    /* JADX INFO: renamed from: a */
    public static final C1715c f6222a = null;

    static {
        f6222a = new C1715c();
    }

    @Override // io.sentry.transport.InterfaceC2011f
    /* JADX INFO: renamed from: b */
    public long mo3899b() {
        return SystemClock.uptimeMillis();
    }
}
