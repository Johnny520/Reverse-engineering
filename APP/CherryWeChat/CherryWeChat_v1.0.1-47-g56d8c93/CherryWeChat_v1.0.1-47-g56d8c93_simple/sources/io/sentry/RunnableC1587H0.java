package io.sentry;

import io.sentry.android.replay.capture.C1764b;
import io.sentry.android.replay.capture.C1766d;
import io.sentry.cache.C1838c;
import io.sentry.cache.InterfaceC1839d;
import io.sentry.logger.C1923b;
import java.io.File;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: io.sentry.H0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1587H0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5736a;

    /* JADX INFO: renamed from: b */
    public final Object f5737b;

    public /* synthetic */ RunnableC1587H0(int r1, Object r2) {
        this.f5736a = r1;
        this.f5737b = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.f5736a;
        Object r2 = this.f5737b;
        switch(r0) {
            case 0: goto L33;
            case 1: goto L31;
            case 2: goto L29;
            case 3: goto L27;
            case 4: goto L25;
            case 5: goto L23;
            case 6: goto L21;
            default: goto L4;
        };
    L4:
        C1923b r02 = (C1923b) r2;
    L5:
        r02.m4144c();
        if (r02.f6813c.size() >= 100) goto L5;
        C1981r r22 = C1923b.f6810f.m4173a();
    L12:
        th = move-exception;
        r22.close();     // Catch: Throwable -> L18
    L20:
        throw th;
    L18:
        th = move-exception;
        th.addSuppressed(th);
        goto L20
    L9:
        if (r02.f6813c.isEmpty() == true) goto L14;
        r02.m4145d(false);     // Catch: Throwable -> L12
    L14:
        r22.close();
        return;
    L21:
        ((C1764b) r2).mo6a();
        return;
    L23:
        ((C1764b) r2).mo6a();
        return;
    L25:
        ((C1766d) r2).mo6a();
        return;
    L27:
        ((C1764b) r2).mo6a();
        return;
    L29:
        ((C1766d) r2).mo6a();
        return;
    L31:
        ((C1764b) r2).mo6a();
        return;
    L33:
        C2046v2 r23 = (C2046v2) r2;
        String r03 = r23.getCacheDirPath();
        if (r03 != null) goto L37;
        r23.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
        return;
    L37:
        if (r23.isEnableAutoSessionTracking() == true) goto L39;
        r23.getLogger().mo3680e(EnumC1657a2.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
        return;
    L39:
        InterfaceC1839d r1 = r23.getEnvelopeDiskCache();
        if ((r1 instanceof C1838c) == false) goto L51;
        Charset r24 = C1838c.f6633i;
        C1838c r12 = (C1838c) r1;
        r12.m4006c(new File(r03, "session.json"), new File(r03, "previous_session.json"));
        r12.f6638e.countDown();
        return;
    }
}
