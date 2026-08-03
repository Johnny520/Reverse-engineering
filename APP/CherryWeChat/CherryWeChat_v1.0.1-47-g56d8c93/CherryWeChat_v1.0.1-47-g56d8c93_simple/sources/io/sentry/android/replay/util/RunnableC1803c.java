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

    public /* synthetic */ RunnableC1803c(int r1, Object r2, Object r3) {
        this.f6535a = r1;
        this.f6536b = r2;
        this.f6537c = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f6535a) {
            case 0: goto L25;
            case 1: goto L19;
            case 2: goto L17;
            case 3: goto L12;
            case 4: goto L6;
            default: goto L4;
        };
    L4:
        C1841f r0 = (C1841f) this.f6536b;
        C1953c r1 = (C1953c) this.f6537c;
        AbstractC1836a.m4003d(r0.f6644a, r1, ".scope-cache", "contexts.json");
        return;
    L6:
        C1841f r02 = (C1841f) this.f6536b;
        ((Runnable) this.f6537c).run();     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        r02.f6644a.getLogger().mo3683r(EnumC1657a2.ERROR, "Serialization task failed", th);
        return;
    L12:
        C1841f r03 = (C1841f) this.f6536b;
        String r12 = (String) this.f6537c;
        if (r12 != null) goto L15;
        r03.m4014f("transaction.json");
        return;
    L15:
        AbstractC1836a.m4003d(r03.f6644a, r12, ".scope-cache", "transaction.json");
        return;
    L17:
        C1841f r04 = (C1841f) this.f6536b;
        C1970t r13 = (C1970t) this.f6537c;
        AbstractC1836a.m4003d(r04.f6644a, r13, ".scope-cache", "replay.json");
        return;
    L19:
        C1841f r05 = (C1841f) this.f6536b;
        C1871f r14 = (C1871f) this.f6537c;
        ((AbstractC1846e) r05.f6645b.m4175a()).mo4017q(r14);     // Catch: IOException -> L22
        return;
    L22:
        e = move-exception;
        r05.f6644a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to add breadcrumb to file queue", e);
        return;
    L25:
        RunnableC1631S1 r06 = (RunnableC1631S1) this.f6536b;
        C2046v2 r15 = (C2046v2) this.f6537c;
        r06.run();     // Catch: Throwable -> L28
        return;
    L28:
        th = move-exception;
        r15.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task ReplayIntegration.finalize_previous_replay", th);
    }
}
