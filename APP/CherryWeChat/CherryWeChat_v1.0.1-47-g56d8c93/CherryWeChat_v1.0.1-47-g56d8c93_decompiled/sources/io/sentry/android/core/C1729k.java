package io.sentry.android.core;

import android.os.Debug;
import io.sentry.C1827b1;
import io.sentry.InterfaceC1642W;

/* JADX INFO: renamed from: io.sentry.android.core.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1729k implements InterfaceC1642W {
    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: a */
    public final void mo3749a(C1827b1 c1827b1) {
        long jFreeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long nativeHeapSize = Debug.getNativeHeapSize() - Debug.getNativeHeapFreeSize();
        c1827b1.f6602b = Long.valueOf(jFreeMemory);
        c1827b1.f6603c = Long.valueOf(nativeHeapSize);
    }

    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: b */
    public final void mo3750b() {
    }
}
