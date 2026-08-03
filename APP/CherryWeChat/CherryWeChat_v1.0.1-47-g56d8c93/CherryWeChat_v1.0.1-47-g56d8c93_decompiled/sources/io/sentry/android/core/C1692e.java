package io.sentry.android.core;

import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1645X;
import io.sentry.InterfaceC1895i0;
import io.sentry.InterfaceC1940p1;

/* JADX INFO: renamed from: io.sentry.android.core.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1692e implements InterfaceC1940p1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ActivityLifecycleIntegration f6100a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6101b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6102c;

    public /* synthetic */ C1692e(ActivityLifecycleIntegration activityLifecycleIntegration, Object obj, Object obj2) {
        this.f6100a = activityLifecycleIntegration;
        this.f6101b = obj;
        this.f6102c = obj2;
    }

    @Override // io.sentry.InterfaceC1940p1
    /* JADX INFO: renamed from: c */
    public void mo1425c(InterfaceC1895i0 interfaceC1895i0) {
        InterfaceC1645X interfaceC1645X = (InterfaceC1645X) this.f6101b;
        InterfaceC1895i0 interfaceC1895i02 = (InterfaceC1895i0) this.f6102c;
        if (interfaceC1895i0 == null) {
            interfaceC1645X.mo3779w(interfaceC1895i02);
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.f6100a.f5920d;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC1895i02.getName());
        }
    }
}
