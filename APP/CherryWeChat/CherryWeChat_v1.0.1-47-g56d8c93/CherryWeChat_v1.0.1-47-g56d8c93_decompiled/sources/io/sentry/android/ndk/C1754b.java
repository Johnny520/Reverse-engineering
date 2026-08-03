package io.sentry.android.ndk;

import io.sentry.AbstractC2004t1;
import io.sentry.C1589H2;
import io.sentry.C1871f;
import io.sentry.C1979q1;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC1856a;
import io.sentry.ndk.NativeScope;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.android.ndk.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1754b extends AbstractC2004t1 {

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6361a;

    /* JADX INFO: renamed from: b */
    public final NativeScope f6362b;

    public C1754b(SentryAndroidOptions sentryAndroidOptions) {
        NativeScope nativeScope = new NativeScope();
        AbstractC1856a.m4048D("The SentryOptions object is required.", sentryAndroidOptions);
        this.f6361a = sentryAndroidOptions;
        this.f6362b = nativeScope;
    }

    @Override // io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: c */
    public final void mo3785c(C1871f c1871f) {
        C2046v2 c2046v2 = this.f6361a;
        try {
            c2046v2.getExecutorService().submit(new RunnableC2260n3(26, this, c1871f));
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: d */
    public final void mo3786d(C1589H2 c1589h2, C1979q1 c1979q1) {
        C2046v2 c2046v2 = this.f6361a;
        if (c1589h2 == null) {
            return;
        }
        try {
            c2046v2.getExecutorService().submit(new RunnableC2260n3(27, this, c1589h2));
        } catch (Throwable th) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
        }
    }
}
