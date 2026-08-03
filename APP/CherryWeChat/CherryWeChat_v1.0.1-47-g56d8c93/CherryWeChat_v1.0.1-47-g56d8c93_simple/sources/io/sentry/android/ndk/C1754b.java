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

    public C1754b(SentryAndroidOptions r3) {
        NativeScope r0 = new NativeScope();
        AbstractC1856a.m4048D("The SentryOptions object is required.", r3);
        this.f6361a = r3;
        this.f6362b = r0;
    }

    @Override // io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: c */
    public final void mo3785c(C1871f r5) {
        C2046v2 r0 = this.f6361a;
        r0.getExecutorService().submit(new RunnableC2260n3(26, this, r5));     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        r0.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Scope sync addBreadcrumb has an error.", new Object[0]);
    }

    @Override // io.sentry.InterfaceC1648Y
    /* JADX INFO: renamed from: d */
    public final void mo3786d(C1589H2 r4, C1979q1 r5) {
        C2046v2 r52 = this.f6361a;
        if (r4 != null) goto L10;
        return;
    L10:
        r52.getExecutorService().submit(new RunnableC2260n3(27, this, r4));     // Catch: Throwable -> L7
        return;
    L7:
        th = move-exception;
        r52.getLogger().mo3682n(EnumC1657a2.ERROR, th, "Scope sync setTrace failed.", new Object[0]);
    }
}
