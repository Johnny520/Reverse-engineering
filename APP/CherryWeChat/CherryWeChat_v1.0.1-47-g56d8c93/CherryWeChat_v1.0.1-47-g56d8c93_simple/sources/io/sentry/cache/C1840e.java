package io.sentry.cache;

import io.sentry.C2046v2;
import io.sentry.InterfaceC1633T;
import io.sentry.android.core.SentryAndroidOptions;

/* JADX INFO: renamed from: io.sentry.cache.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1840e implements InterfaceC1633T {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6642a;

    public C1840e(SentryAndroidOptions r1) {
        this.f6642a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m4012a(String r3) {
        AbstractC1836a.m4000a(this.f6642a, ".options-cache", r3);
    }

    /* JADX INFO: renamed from: b */
    public final void m4013b(String r3, Object r4) {
        AbstractC1836a.m4003d(this.f6642a, r4, ".options-cache", r3);
    }
}
