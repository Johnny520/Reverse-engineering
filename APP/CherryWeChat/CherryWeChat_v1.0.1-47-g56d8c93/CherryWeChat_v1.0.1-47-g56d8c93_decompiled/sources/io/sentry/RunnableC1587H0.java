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

    public /* synthetic */ RunnableC1587H0(int i, Object obj) {
        this.f5736a = i;
        this.f5737b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5736a;
        Object obj = this.f5737b;
        switch (i) {
            case 0:
                C2046v2 c2046v2 = (C2046v2) obj;
                String cacheDirPath = c2046v2.getCacheDirPath();
                if (cacheDirPath == null) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
                    return;
                }
                if (!c2046v2.isEnableAutoSessionTracking()) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Session tracking is disabled, bailing from previous session mover.", new Object[0]);
                    return;
                }
                InterfaceC1839d envelopeDiskCache = c2046v2.getEnvelopeDiskCache();
                if (envelopeDiskCache instanceof C1838c) {
                    Charset charset = C1838c.f6633i;
                    C1838c c1838c = (C1838c) envelopeDiskCache;
                    c1838c.m4006c(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
                    c1838c.f6638e.countDown();
                    return;
                }
                return;
            case 1:
                ((C1764b) obj).mo6a();
                return;
            case 2:
                ((C1766d) obj).mo6a();
                return;
            case 3:
                ((C1764b) obj).mo6a();
                return;
            case 4:
                ((C1766d) obj).mo6a();
                return;
            case 5:
                ((C1764b) obj).mo6a();
                return;
            case 6:
                ((C1764b) obj).mo6a();
                return;
            default:
                C1923b c1923b = (C1923b) obj;
                do {
                    c1923b.m4144c();
                } while (c1923b.f6813c.size() >= 100);
                C1981r c1981rM4173a = C1923b.f6810f.m4173a();
                try {
                    if (!c1923b.f6813c.isEmpty()) {
                        c1923b.m4145d(false);
                        break;
                    }
                    c1981rM4173a.close();
                    return;
                } catch (Throwable th) {
                    try {
                        c1981rM4173a.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
        }
    }
}
