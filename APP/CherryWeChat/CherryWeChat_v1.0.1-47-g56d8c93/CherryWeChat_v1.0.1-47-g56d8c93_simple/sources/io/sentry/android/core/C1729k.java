package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C1827b1;
import io.sentry.InterfaceC1642W;

/* JADX INFO: renamed from: io.sentry.android.core.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1729k implements InterfaceC1642W {
    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: a */
    public final void mo3749a(C1827b1 r7) {
        long r0 = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long r2 = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        r7.f6602b = Long.valueOf(r0);
        r7.f6603c = Long.valueOf(r2);
    }

    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: b */
    public final void mo3750b() {
    }
}
