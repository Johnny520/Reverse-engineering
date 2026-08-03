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

    public C1689a(SentryAndroidOptions r3) {
        String r0 = r3.getCacheDirPath();
        AbstractC1856a.m4048D("cacheDirPath must not be null", r0);
        super(r3, r0, r3.getMaxCacheItems());
        this.f6095j = C1715c.f6222a;
    }

    @Override // io.sentry.cache.C1838c, io.sentry.cache.InterfaceC1839d
    /* JADX INFO: renamed from: i */
    public final boolean mo3868i(C1901c r8, C1586H r9) {
        boolean r82 = super.mo3868i(r8, r9);
        C2046v2 r0 = this.f6634a;
        SentryAndroidOptions r1 = (SentryAndroidOptions) r0;
        C1741g r2 = C1740f.m3914b().f6309d;
        if (C1628R2.class.isInstance(AbstractC1856a.m4072s(r9)) == true) goto L5;
    L16:
        C0698Q9 r02 = new C0698Q9(9, this, r1);
        Object r12 = AbstractC1856a.m4072s(r9);
        if (C1750x.class.isInstance(AbstractC1856a.m4072s(r9)) == false) goto L36;
        if (r12 == null) goto L36;
        C1689a r92 = (C1689a) r02.f2247b;
        SentryAndroidOptions r03 = (SentryAndroidOptions) r02.f2248c;
        Long r13 = Long.valueOf(((C1750x) r12).f6354d);
        ILogger r04 = r03.getLogger();
        EnumC1657a2 r22 = EnumC1657a2.DEBUG;
        r04.mo3680e(r22, "Writing last reported ANR marker with timestamp %d", new Object[]{r13});
        C2046v2 r93 = r92.f6634a;
        String r05 = r93.getCacheDirPath();
        if (r05 != null) goto L43;
        r93.getLogger().mo3680e(r22, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
        goto L36
    L43:
        FileOutputStream r06 = new FileOutputStream(new File(r05, "last_anr_report"));     // Catch: Throwable -> L27
        r06.write(String.valueOf(r13).getBytes(C1838c.f6633i));     // Catch: Throwable -> L29
        r06.flush();     // Catch: Throwable -> L29
        r06.close();     // Catch: Throwable -> L27
        goto L36
    L29:
        th = move-exception;
        r06.close();     // Catch: Throwable -> L32
    L34:
        throw th;     // Catch: Throwable -> L27
    L32:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        r93.getLogger().mo3683r(EnumC1657a2.ERROR, "Error writing the ANR marker to the disk", th);
    L36:
        return r82;
    L5:
        if (r2.m3919b() == false) goto L16;
        this.f6095j.getClass();
        long r3 = SystemClock.uptimeMillis() - r2.f6322c;
        if (r3 > r1.getStartupCrashDurationThresholdMillis()) goto L16;
        ILogger r23 = r1.getLogger();
        EnumC1657a2 r5 = EnumC1657a2.DEBUG;
        r23.mo3680e(r5, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", new Object[]{Long.valueOf(r3)});
        String r24 = r0.getOutboxPath();
        if (r24 != null) goto L41;
        r0.getLogger().mo3680e(r5, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
        goto L16
    L41:
        new File(r24, "startup_crash").createNewFile();     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "Error writing the startup crash marker file to the disk", th);
        goto L16
    }
}
