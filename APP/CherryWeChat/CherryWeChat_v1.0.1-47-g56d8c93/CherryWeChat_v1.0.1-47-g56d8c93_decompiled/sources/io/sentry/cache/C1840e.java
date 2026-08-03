package io.sentry.cache;

import io.sentry.C2046v2;
import io.sentry.InterfaceC1633T;
import io.sentry.android.core.SentryAndroidOptions;

/* JADX INFO: renamed from: io.sentry.cache.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1840e implements InterfaceC1633T {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6642a;

    public C1840e(SentryAndroidOptions sentryAndroidOptions) {
        this.f6642a = sentryAndroidOptions;
    }

    /* JADX INFO: renamed from: a */
    public final void m4012a(String str) {
        AbstractC1836a.m4000a(this.f6642a, ".options-cache", str);
    }

    /* JADX INFO: renamed from: b */
    public final void m4013b(String str, Object obj) {
        AbstractC1836a.m4003d(this.f6642a, obj, ".options-cache", str);
    }
}
