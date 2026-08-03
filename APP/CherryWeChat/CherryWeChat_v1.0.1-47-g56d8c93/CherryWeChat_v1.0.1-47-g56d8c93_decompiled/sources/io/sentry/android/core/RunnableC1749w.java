package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.AbstractC2066z1;
import io.sentry.C1586H;
import io.sentry.C1627R1;
import io.sentry.C1638U1;
import io.sentry.C1654a;
import io.sentry.C2065z0;
import io.sentry.EnumC1657a2;
import io.sentry.android.core.cache.C1689a;
import io.sentry.android.core.internal.threaddump.C1711a;
import io.sentry.android.core.internal.threaddump.C1712b;
import io.sentry.cache.C1838c;
import io.sentry.cache.InterfaceC1839d;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1962l;
import io.sentry.protocol.C1970t;
import io.sentry.transport.C2009d;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000.C1540ib;

/* JADX INFO: renamed from: io.sentry.android.core.w */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1749w implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Context f6351a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f6352b;

    /* JADX INFO: renamed from: c */
    public final long f6353c;

    public RunnableC1749w(Context context, SentryAndroidOptions sentryAndroidOptions, C2009d c2009d) {
        this.f6351a = context;
        this.f6352b = sentryAndroidOptions;
        c2009d.getClass();
        this.f6353c = System.currentTimeMillis() - AnrV2Integration.f5942d;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[Catch: all -> 0x0027, DONT_GENERATE, FINALLY_INSNS, SYNTHETIC, TRY_LEAVE, TryCatch #4 {all -> 0x0027, blocks: (B:6:0x0013, B:10:0x0022, B:26:0x004d, B:59:0x00dc, B:58:0x00d9, B:55:0x00d4, B:8:0x0019, B:16:0x002e, B:25:0x004a, B:53:0x00d1, B:52:0x00ce), top: B:90:0x0013, inners: #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3936a(ApplicationExitInfo applicationExitInfo, boolean z) {
        C1638U1 c1638u1;
        EnumC1751y enumC1751y;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = this.f6352b;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z2 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
            } finally {
                enumC1751y = (EnumC1751y) c1638u1.f5871a;
                if (enumC1751y != EnumC1751y.NO_DUMP) {
                }
            }
            if (traceInputStream == null) {
                c1638u1 = new C1638U1(EnumC1751y.NO_DUMP);
                if (traceInputStream != null) {
                    traceInputStream.close();
                }
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr2 = new byte[1024];
                    while (true) {
                        int i = traceInputStream.read(bArr2, 0, 1024);
                        if (i == -1) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr2, 0, i);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                        try {
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                C1711a c1711a = new C1711a();
                                c1711a.f6185a = line;
                                arrayList.add(c1711a);
                            }
                            C1540ib c1540ib = new C1540ib(arrayList);
                            C1712b c1712b = new C1712b(sentryAndroidOptions, z2);
                            c1712b.m3889d(c1540ib);
                            ArrayList arrayList2 = c1712b.f6202e;
                            c1638u1 = arrayList2.isEmpty() ? new C1638U1(EnumC1751y.NO_DUMP) : new C1638U1(EnumC1751y.DUMP, byteArray, arrayList2, new ArrayList(c1712b.f6201d.values()));
                            bufferedReader.close();
                        } finally {
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to parse ANR thread dump", th);
                        c1638u1 = new C1638U1(EnumC1751y.ERROR, byteArray);
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to read ANR thread dump", th2);
            c1638u1 = new C1638U1(EnumC1751y.NO_DUMP);
        }
        enumC1751y = (EnumC1751y) c1638u1.f5871a;
        if (enumC1751y != EnumC1751y.NO_DUMP) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return;
        }
        C1750x c1750x = new C1750x(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
        C1586H c1586hM4059e = AbstractC1856a.m4059e(c1750x);
        C1627R1 c1627r1 = new C1627R1();
        if (enumC1751y == EnumC1751y.ERROR) {
            C1962l c1962l = new C1962l();
            c1962l.f6965a = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            c1627r1.f5846q = c1962l;
        } else if (enumC1751y == EnumC1751y.DUMP) {
            c1627r1.f5848s = new C2065z0((List) c1638u1.f5873c);
            ArrayList arrayList3 = (ArrayList) c1638u1.f5874d;
            if (arrayList3 != null) {
                C1954d c1954d = new C1954d();
                c1954d.f6892b = new ArrayList(arrayList3);
                c1627r1.f5617n = c1954d;
            }
        }
        c1627r1.f5850u = EnumC1657a2.FATAL;
        c1627r1.f5845p = AbstractC1856a.m4068n(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) c1638u1.f5872b) != null) {
            c1586hM4059e.f5734f = new C1654a(bArr);
        }
        if (AbstractC2066z1.m4233b().mo3723r(c1627r1, c1586hM4059e).equals(C1970t.f7011b) || c1750x.mo3849d()) {
            return;
        }
        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", c1627r1.f5604a);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb A[EDGE_INSN: B:63:0x00cb->B:33:0x00cb BREAK  A[LOOP:0: B:28:0x00b2->B:65:?], SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Long lValueOf;
        Iterator it;
        List historicalProcessExitReasons = ((ActivityManager) this.f6351a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        int size = historicalProcessExitReasons.size();
        SentryAndroidOptions sentryAndroidOptions = this.f6352b;
        if (size == 0) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        InterfaceC1839d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof C1838c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            C1838c c1838c = (C1838c) envelopeDiskCache;
            if (!c1838c.m4009h()) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                c1838c.f6638e.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        int i = C1689a.f6094k;
        String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
        AbstractC1856a.m4048D("Cache dir path should be set for getting ANRs reported", cacheDirPath);
        File file = new File(cacheDirPath, "last_anr_report");
        ApplicationExitInfo applicationExitInfo = null;
        try {
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error reading last ANR marker", th);
        }
        if (file.exists() && file.canRead()) {
            String strM4047C = AbstractC1856a.m4047C(file);
            if (!strM4047C.equals("null")) {
                lValueOf = Long.valueOf(Long.parseLong(strM4047C.trim()));
            }
            it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    break;
                }
                ApplicationExitInfo applicationExitInfoM3930c = AbstractC1748v.m3930c(it.next());
                if (applicationExitInfoM3930c.getReason() == 6) {
                    arrayList.remove(applicationExitInfoM3930c);
                    applicationExitInfo = applicationExitInfoM3930c;
                    break;
                }
            }
            if (applicationExitInfo != null) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
                return;
            }
            long timestamp = applicationExitInfo.getTimestamp();
            long j = this.f6353c;
            if (timestamp < j) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
                return;
            }
            if (lValueOf != null && applicationExitInfo.getTimestamp() <= lValueOf.longValue()) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
                return;
            }
            if (sentryAndroidOptions.isReportHistoricalAnrs()) {
                Collections.reverse(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ApplicationExitInfo applicationExitInfoM3930c2 = AbstractC1748v.m3930c(it2.next());
                    if (applicationExitInfoM3930c2.getReason() == 6) {
                        if (applicationExitInfoM3930c2.getTimestamp() < j) {
                            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "ANR happened too long ago %s.", applicationExitInfoM3930c2);
                        } else if (lValueOf == null || applicationExitInfoM3930c2.getTimestamp() > lValueOf.longValue()) {
                            m3936a(applicationExitInfoM3930c2, false);
                        } else {
                            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "ANR has already been reported %s.", applicationExitInfoM3930c2);
                        }
                    }
                }
            }
            m3936a(applicationExitInfo, true);
            return;
        }
        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
        lValueOf = null;
        it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        if (applicationExitInfo != null) {
        }
    }
}
