package io.sentry;

import io.sentry.cache.C1838c;
import io.sentry.cache.InterfaceC1839d;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: renamed from: io.sentry.c1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1834c1 implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final Charset f6623b = null;

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6624a;

    static {
        f6623b = Charset.forName("UTF-8");
    }

    public RunnableC1834c1(C2046v2 r1) {
        this.f6624a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final Date m3999a(File r7) {
        C2046v2 r0 = this.f6624a;
        BufferedReader r1 = new BufferedReader(new InputStreamReader(new FileInputStream(r7), f6623b));     // Catch: IllegalArgumentException -> L7 IOException -> L9
        String r72 = r1.readLine();     // Catch: Throwable -> L11
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Crash marker file has %s timestamp.", new Object[]{r72});     // Catch: Throwable -> L11
        Date r73 = AbstractC1856a.m4069o(r72);     // Catch: Throwable -> L11
        r1.close();     // Catch: IllegalArgumentException -> L7 IOException -> L9
        return r73;
    L11:
        th = move-exception;
        r1.close();     // Catch: Throwable -> L14
    L16:
        throw th;     // Catch: IllegalArgumentException -> L7 IOException -> L9
    L14:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IllegalArgumentException -> L7 IOException -> L9
    L9:
        e = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "Error reading the crash marker file.", e);
        return null;
    L7:
        e = move-exception;
        r0.getLogger().mo3682n(EnumC1657a2.ERROR, e, "Error converting the crash timestamp.", new Object[0]);
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2046v2 r0 = this.f6624a;
        String r1 = r0.getCacheDirPath();
        if (r1 != null) goto L7;
        r0.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
        return;
    L7:
        if (r0.isEnableAutoSessionTracking() == true) goto L10;
        r0.getLogger().mo3680e(EnumC1657a2.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
        return;
    L10:
        InterfaceC1839d r3 = r0.getEnvelopeDiskCache();
        if ((r3 instanceof C1838c) == true) goto L13;
    L16:
        Charset r32 = C1838c.f6633i;
        File r33 = new File(r1, "previous_session.json");
        InterfaceC1866e0 r12 = r0.getSerializer();
        if (r33.exists() == false) goto L54;
        r0.getLogger().mo3680e(EnumC1657a2.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
        BufferedReader r4 = new BufferedReader(new InputStreamReader(new FileInputStream(r33), f6623b));     // Catch: Throwable -> L38
        C1581F2 r5 = (C1581F2) r12.mo3607a(r4, C1581F2.class);     // Catch: Throwable -> L23
        if (r5 != null) goto L25;
        r0.getLogger().mo3680e(EnumC1657a2.ERROR, "Stream from path %s resulted in a null envelope.", new Object[]{r33.getAbsolutePath()});     // Catch: Throwable -> L23
    L36:
        r4.close();     // Catch: Throwable -> L38
    L47:
        if (r33.delete() == true) goto L55;
        r0.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to delete the previous session file.", new Object[0]);
        return;
    L55:
        return;
    L25:
        File r6 = new File(r0.getCacheDirPath(), ".sentry-native/last_crash");     // Catch: Throwable -> L23
        if (r6.exists() == false) goto L31;
        r0.getLogger().mo3680e(EnumC1657a2.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);     // Catch: Throwable -> L23
        Date r7 = m3999a(r6);     // Catch: Throwable -> L23
        if (r6.delete() == true) goto L30;
        r0.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete the crash marker file. %s.", new Object[]{r6.getAbsolutePath()});     // Catch: Throwable -> L23
    L30:
        r5.m3664c(EnumC1577E2.Crashed, null, true, null);     // Catch: Throwable -> L23
    L33:
        if (r5.f5709n != null) goto L35;
        r5.m3663b(r7);     // Catch: Throwable -> L23
    L35:
        AbstractC2066z1.m4233b().mo3713g(new C1901c(null, r0.getSdkVersion(), C1620P1.m3730d(r12, r5)), new C1586H());     // Catch: Throwable -> L23
        goto L36
    L31:
        r7 = null;
    L23:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L42
    L44:
        throw th;     // Catch: Throwable -> L38
    L42:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L38
    L38:
        th = move-exception;
        r0.getLogger().mo3683r(EnumC1657a2.ERROR, "Error processing previous session.", th);
        goto L47
    L54:
        return;
    L13:
        if (((C1838c) r3).m4009h() == true) goto L16;
        r0.getLogger().mo3680e(EnumC1657a2.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
    }
}
