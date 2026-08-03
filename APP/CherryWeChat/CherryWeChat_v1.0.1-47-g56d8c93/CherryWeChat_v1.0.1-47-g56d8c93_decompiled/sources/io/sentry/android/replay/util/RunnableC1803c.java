package io.sentry.android.replay.util;

import io.sentry.C1871f;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.RunnableC1631S1;
import io.sentry.cache.AbstractC1836a;
import io.sentry.cache.C1841f;
import io.sentry.cache.tape.AbstractC1846e;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1970t;
import java.io.IOException;

/* JADX INFO: renamed from: io.sentry.android.replay.util.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1803c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6535a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f6536b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6537c;

    public /* synthetic */ RunnableC1803c(int i, Object obj, Object obj2) {
        this.f6535a = i;
        this.f6536b = obj;
        this.f6537c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6535a) {
            case 0:
                RunnableC1631S1 runnableC1631S1 = (RunnableC1631S1) this.f6536b;
                C2046v2 c2046v2 = (C2046v2) this.f6537c;
                try {
                    runnableC1631S1.run();
                } catch (Throwable th) {
                    c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th);
                    return;
                }
                break;
            case 1:
                C1841f c1841f = (C1841f) this.f6536b;
                try {
                    ((AbstractC1846e) c1841f.f6645b.m4175a()).mo4017q((C1871f) this.f6537c);
                } catch (IOException e) {
                    c1841f.f6644a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to add breadcrumb to file queue", e);
                    return;
                }
                break;
            case 2:
                C1841f c1841f2 = (C1841f) this.f6536b;
                AbstractC1836a.m4003d(c1841f2.f6644a, (C1970t) this.f6537c, ".scope-cache", "replay.json");
                break;
            case 3:
                C1841f c1841f3 = (C1841f) this.f6536b;
                String str = (String) this.f6537c;
                if (str != null) {
                    AbstractC1836a.m4003d(c1841f3.f6644a, str, ".scope-cache", "transaction.json");
                } else {
                    c1841f3.m4014f("transaction.json");
                }
                break;
            case 4:
                C1841f c1841f4 = (C1841f) this.f6536b;
                try {
                    ((Runnable) this.f6537c).run();
                } catch (Throwable th2) {
                    c1841f4.f6644a.getLogger().mo3683r(EnumC1657a2.ERROR, "Serialization task failed", th2);
                    return;
                }
                break;
            default:
                C1841f c1841f5 = (C1841f) this.f6536b;
                AbstractC1836a.m4003d(c1841f5.f6644a, (C1953c) this.f6537c, ".scope-cache", "contexts.json");
                break;
        }
    }
}
