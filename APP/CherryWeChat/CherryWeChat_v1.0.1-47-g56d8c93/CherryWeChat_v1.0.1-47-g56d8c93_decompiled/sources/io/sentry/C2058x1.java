package io.sentry;

import io.sentry.android.core.C1730l;
import io.sentry.config.AbstractC1856a;
import p000.C1542id;

/* JADX INFO: renamed from: io.sentry.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2058x1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7278a;

    /* JADX INFO: renamed from: b */
    public final C1730l f7279b;

    public /* synthetic */ C2058x1(C1730l c1730l, int i) {
        this.f7278a = i;
        this.f7279b = c1730l;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m4225b(String str, ILogger iLogger) {
        if (str != null && !str.isEmpty()) {
            return true;
        }
        iLogger.mo3680e(EnumC1657a2.INFO, "No cached dir path is defined in options.", new Object[0]);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final C1542id m4226a(InterfaceC1651Z interfaceC1651Z, C2046v2 c2046v2) {
        switch (this.f7278a) {
            case 0:
                AbstractC1856a.m4048D("Scopes are required", interfaceC1651Z);
                AbstractC1856a.m4048D("SentryOptions is required", c2046v2);
                String cacheDirPath = this.f7279b.f6271a.getCacheDirPath();
                if (cacheDirPath == null || !m4225b(cacheDirPath, c2046v2.getLogger())) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "No cache dir path is defined in options.", new Object[0]);
                }
                break;
            default:
                AbstractC1856a.m4048D("Scopes are required", interfaceC1651Z);
                AbstractC1856a.m4048D("SentryOptions is required", c2046v2);
                String outboxPath = this.f7279b.f6271a.getOutboxPath();
                if (outboxPath == null || !m4225b(outboxPath, c2046v2.getLogger())) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "No outbox dir path is defined in options.", new Object[0]);
                }
                break;
        }
        return null;
    }
}
