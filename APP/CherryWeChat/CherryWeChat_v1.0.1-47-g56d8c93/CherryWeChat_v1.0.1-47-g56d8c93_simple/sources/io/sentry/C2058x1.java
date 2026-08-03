package io.sentry;

import io.sentry.android.core.C1730l;
import io.sentry.config.AbstractC1856a;
import java.io.File;
import p000.C1542id;

/* JADX INFO: renamed from: io.sentry.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2058x1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7278a;

    /* JADX INFO: renamed from: b */
    public final C1730l f7279b;

    public /* synthetic */ C2058x1(C1730l r1, int r2) {
        this.f7278a = r2;
        this.f7279b = r1;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4225b(String r3, ILogger r4) {
        if (r3 != null) goto L4;
    L8:
        r4.mo3680e(EnumC1657a2.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    L4:
        if (r3.isEmpty() == true) goto L8;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final C1542id m4226a(InterfaceC1651Z r11, C2046v2 r12) {
        switch(this.f7278a) {
            case 0: goto L12;
            default: goto L4;
        };
    L4:
        AbstractC1856a.m4048D("Scopes are required", r11);
        AbstractC1856a.m4048D("SentryOptions is required", r12);
        String r0 = this.f7279b.f6271a.getOutboxPath();
        if (r0 != null) goto L7;
    L10:
        r12.getLogger().mo3680e(EnumC1657a2.ERROR, "No outbox dir path is defined in options.", new Object[0]);
        return null;
    L7:
        if (m4225b(r0, r12.getLogger()) == false) goto L10;
        C1656a1 r2 = new C1656a1(r11, r12.getEnvelopeReader(), r12.getSerializer(), r12.getLogger(), r12.getFlushTimeoutMillis(), r12.getMaxQueueSize());
        return new C1542id(r12.getLogger(), r0, r2, new File(r0));
    L12:
        AbstractC1856a.m4048D("Scopes are required", r11);
        AbstractC1856a.m4048D("SentryOptions is required", r12);
        String r112 = this.f7279b.f6271a.getCacheDirPath();
        if (r112 != null) goto L15;
    L18:
        r12.getLogger().mo3680e(EnumC1657a2.ERROR, "No cache dir path is defined in options.", new Object[0]);
        return null;
    L15:
        if (m4225b(r112, r12.getLogger()) == false) goto L18;
        C1562B r22 = new C1562B(r11, r12.getSerializer(), r12.getLogger(), r12.getFlushTimeoutMillis(), r12.getMaxQueueSize());
        return new C1542id(r12.getLogger(), r112, r22, new File(r112));
    }
}
