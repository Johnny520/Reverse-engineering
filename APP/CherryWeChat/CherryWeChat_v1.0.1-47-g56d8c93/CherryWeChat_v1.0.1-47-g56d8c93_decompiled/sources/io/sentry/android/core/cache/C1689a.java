package io.sentry.android.core.cache;

import android.os.SystemClock;
import io.sentry.C1586H;
import io.sentry.C1628R2;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.android.core.C1750x;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.util.C1715c;
import io.sentry.android.core.performance.C1740f;
import io.sentry.android.core.performance.C1741g;
import io.sentry.cache.C1838c;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.io.File;
import java.io.FileOutputStream;
import p000.C0698Q9;

/* JADX INFO: renamed from: io.sentry.android.core.cache.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1689a extends C1838c {

    /* JADX INFO: renamed from: k */
    public static final /* synthetic */ int f6094k = 0;

    /* JADX INFO: renamed from: j */
    public final C1715c f6095j;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1689a(SentryAndroidOptions sentryAndroidOptions) {
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        AbstractC1856a.m4048D("cacheDirPath must not be null", cacheDirPath);
        super(sentryAndroidOptions, cacheDirPath, sentryAndroidOptions.getMaxCacheItems());
        this.f6095j = C1715c.f6222a;
    }

    @Override // io.sentry.cache.C1838c, io.sentry.cache.InterfaceC1839d
    /* JADX INFO: renamed from: i */
    public final boolean mo3868i(C1901c c1901c, C1586H c1586h) {
        boolean zMo3868i = super.mo3868i(c1901c, c1586h);
        C2046v2 c2046v2 = this.f6634a;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c2046v2;
        C1741g c1741g = C1740f.m3914b().f6309d;
        if (C1628R2.class.isInstance(AbstractC1856a.m4072s(c1586h)) && c1741g.m3919b()) {
            this.f6095j.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis() - c1741g.f6322c;
            if (jUptimeMillis <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                ILogger logger = sentryAndroidOptions.getLogger();
                EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
                logger.mo3680e(enumC1657a2, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jUptimeMillis));
                String outboxPath = c2046v2.getOutboxPath();
                if (outboxPath == null) {
                    c2046v2.getLogger().mo3680e(enumC1657a2, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
                } else {
                    try {
                        new File(outboxPath, "startup_crash").createNewFile();
                    } catch (Throwable th) {
                        c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error writing the startup crash marker file to the disk", th);
                    }
                }
            }
        }
        C0698Q9 c0698q9 = new C0698Q9(9, this, sentryAndroidOptions);
        Object objM4072s = AbstractC1856a.m4072s(c1586h);
        if (C1750x.class.isInstance(AbstractC1856a.m4072s(c1586h)) && objM4072s != null) {
            C1689a c1689a = (C1689a) c0698q9.f2247b;
            SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) c0698q9.f2248c;
            Long lValueOf = Long.valueOf(((C1750x) objM4072s).f6354d);
            ILogger logger2 = sentryAndroidOptions2.getLogger();
            EnumC1657a2 enumC1657a22 = EnumC1657a2.DEBUG;
            logger2.mo3680e(enumC1657a22, "Writing last reported ANR marker with timestamp %d", lValueOf);
            C2046v2 c2046v22 = c1689a.f6634a;
            String cacheDirPath = c2046v22.getCacheDirPath();
            if (cacheDirPath == null) {
                c2046v22.getLogger().mo3680e(enumC1657a22, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            } else {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
                    try {
                        fileOutputStream.write(String.valueOf(lValueOf).getBytes(C1838c.f6633i));
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } finally {
                    }
                } catch (Throwable th2) {
                    c2046v22.getLogger().mo3683r(EnumC1657a2.ERROR, "Error writing the ANR marker to the disk", th2);
                }
            }
        }
        return zMo3868i;
    }
}
