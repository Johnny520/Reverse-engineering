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

    public /* synthetic */ C1692e(ActivityLifecycleIntegration r1, Object r2, Object r3) {
        this.f6100a = r1;
        this.f6101b = r2;
        this.f6102c = r3;
    }

    @Override // io.sentry.InterfaceC1940p1
    /* JADX INFO: renamed from: c */
    public void mo1425c(InterfaceC1895i0 r4) {
        InterfaceC1645X r0 = (InterfaceC1645X) this.f6101b;
        InterfaceC1895i0 r1 = (InterfaceC1895i0) this.f6102c;
        if (r4 != null) goto L6;
        r0.mo3779w(r1);
        return;
    L6:
        SentryAndroidOptions r42 = this.f6100a.f5920d;
        if (r42 == null) goto L10;
        r42.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", new Object[]{r1.getName()});
        return;
    }
}
