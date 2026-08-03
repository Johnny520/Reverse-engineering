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

    public RunnableC1749w(Context r3, SentryAndroidOptions r4, C2009d r5) {
        this.f6351a = r3;
        this.f6352b = r4;
        r5.getClass();
        this.f6353c = System.currentTimeMillis() - AnrV2Integration.f5942d;
    }

    /* JADX INFO: renamed from: a */
    public final void m3936a(ApplicationExitInfo r12, boolean r13) {
        SentryAndroidOptions r1 = this.f6352b;
        long r6 = AbstractC1748v.m3929b(r12);
        if (AbstractC1748v.m3935h(r12) == 100) goto L5;
        boolean r9 = true;
    L90:
        InputStream r2 = AbstractC1748v.m3932e(r12);     // Catch: Throwable -> L12
        if (r2 != null) goto L16;
        C1638U1 r0 = new C1638U1(EnumC1751y.NO_DUMP);     // Catch: Throwable -> L14
        if (r2 == null) goto L61;
        r2.close();     // Catch: Throwable -> L12
    L61:
        EnumC1751y r10 = (EnumC1751y) r0.f5871a;
        if (r10 != EnumC1751y.NO_DUMP) goto L65;
        r1.getLogger().mo3680e(EnumC1657a2.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", new Object[]{AbstractC1748v.m3933f(r12)});
        return;
    L65:
        C1750x r22 = new C1750x(r1.getFlushTimeoutMillis(), r1.getLogger(), r6, r13, r9);
        C1586H r122 = AbstractC1856a.m4059e(r22);
        C1627R1 r132 = new C1627R1();
        if (r10 != EnumC1751y.ERROR) goto L69;
        C1962l r3 = new C1962l();
        r3.f6965a = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
        r132.f5846q = r3;
    L73:
        r132.f5850u = EnumC1657a2.FATAL;
        r132.f5845p = AbstractC1856a.m4068n(r6);
        if (r1.isAttachAnrThreadDump() == false) goto L79;
        byte[] r02 = (byte[]) r0.f5872b;
        if (r02 == null) goto L79;
        r122.f5734f = new C1654a(r02);
    L79:
        if (AbstractC2066z1.m4233b().mo3723r(r132, r122).equals(C1970t.f7011b) == false) goto L81;
        return;
    L81:
        if (r22.mo3849d() == true) goto L103;
        r1.getLogger().mo3680e(EnumC1657a2.WARNING, "Timed out waiting to flush ANR event to disk. Event: %s", new Object[]{r132.f5604a});
        return;
    L103:
        return;
    L69:
        if (r10 != EnumC1751y.DUMP) goto L73;
        r132.f5848s = new C2065z0((List) r0.f5873c);
        ArrayList r32 = (ArrayList) r0.f5874d;
        if (r32 == null) goto L73;
        C1954d r4 = new C1954d();
        r4.f6892b = new ArrayList(r32);
        r132.f5617n = r4;
        goto L73
    L16:
        ByteArrayOutputStream r42 = new ByteArrayOutputStream();     // Catch: Throwable -> L14
        byte[] r5 = new byte[1024];     // Catch: Throwable -> L22
    L19:
        int r8 = r2.read(r5, 0, 1024);     // Catch: Throwable -> L22
        if (r8 == (-1)) goto L24;
        r42.write(r5, 0, r8);     // Catch: Throwable -> L22
        goto L19
    L24:
        byte[] r33 = r42.toByteArray();     // Catch: Throwable -> L22
        r42.close();     // Catch: Throwable -> L14
        r2.close();     // Catch: Throwable -> L12
        BufferedReader r23 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(r33)));     // Catch: Throwable -> L37
        ArrayList r03 = new ArrayList();     // Catch: Throwable -> L39
    L29:
        String r43 = r23.readLine();     // Catch: Throwable -> L39
        if (r43 == null) goto L32;
        C1711a r52 = new C1711a();     // Catch: Throwable -> L39
        r52.f6185a = r43;     // Catch: Throwable -> L39
        r03.add(r52);     // Catch: Throwable -> L39
        goto L29
    L32:
        C1540ib r44 = new C1540ib(r03);     // Catch: Throwable -> L39
        C1712b r04 = new C1712b(r1, r9);     // Catch: Throwable -> L39
        r04.m3889d(r44);     // Catch: Throwable -> L39
        ArrayList r45 = r04.f6202e;     // Catch: Throwable -> L39
        ArrayList r53 = new ArrayList(r04.f6201d.values());     // Catch: Throwable -> L39
        if (r45.isEmpty() == false) goto L41;
        r0 = new C1638U1(EnumC1751y.NO_DUMP);     // Catch: Throwable -> L39
    L35:
        r23.close();     // Catch: Throwable -> L37
        goto L61
    L41:
        r0 = new C1638U1(EnumC1751y.DUMP, r33, r45, r53);     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        r23.close();     // Catch: Throwable -> L45
    L98:
        throw th;     // Catch: Throwable -> L37
    L45:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L37
        throw th;     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        r1.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to parse ANR thread dump", th);
        r0 = new C1638U1(EnumC1751y.ERROR, r33);
        goto L61
    L22:
        th = move-exception;
        r42.close();     // Catch: Throwable -> L51
    L99:
        throw th;     // Catch: Throwable -> L14
    L51:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L14
        throw th;     // Catch: Throwable -> L14
    L14:
        th = move-exception;
        if (r2 == null) goto L100;
        r2.close();     // Catch: Throwable -> L57
    L101:
        throw th;     // Catch: Throwable -> L12
    L57:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L12
        throw th;     // Catch: Throwable -> L12
    L100:
        throw th;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        r1.getLogger().mo3683r(EnumC1657a2.WARNING, "Failed to read ANR thread dump", th);
        r0 = new C1638U1(EnumC1751y.NO_DUMP);
        goto L61
    L5:
        r9 = false;
        goto L90
    }

    @Override // java.lang.Runnable
    public final void run() {
        List r0 = AbstractC1748v.m3934g((ActivityManager) this.f6351a.getSystemService("activity"));
        int r1 = r0.size();
        SentryAndroidOptions r2 = this.f6352b;
        if (r1 != 0) goto L6;
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "No records in historical exit reasons.", new Object[0]);
        return;
    L6:
        InterfaceC1839d r12 = r2.getEnvelopeDiskCache();
        if ((r12 instanceof C1838c) == true) goto L9;
    L13:
        ArrayList r13 = new ArrayList(r0);
        int r02 = C1689a.f6094k;
        String r03 = r2.getCacheDirPath();
        AbstractC1856a.m4048D("Cache dir path should be set for getting ANRs reported", r03);
        File r4 = new File(r03, "last_anr_report");
        ApplicationExitInfo r04 = null;
    L22:
        th = move-exception;
        r2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error reading last ANR marker", th);
    L20:
        Long r42 = null;
    L27:
        Iterator r5 = r13.iterator();
    L29:
        if (r5.hasNext() == false) goto L33;
        ApplicationExitInfo r6 = AbstractC1748v.m3930c(r5.next());
        if (AbstractC1748v.m3928a(r6) != 6) goto L29;
        r13.remove(r6);
        r04 = r6;
    L33:
        if (r04 != null) goto L36;
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "No ANRs have been found in the historical exit reasons list.", new Object[0]);
        return;
    L36:
        long r52 = AbstractC1748v.m3929b(r04);
        long r8 = this.f6353c;
        if (r52 >= r8) goto L40;
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Latest ANR happened too long ago, returning early.", new Object[0]);
        return;
    L40:
        if (r42 == null) goto L46;
        if (AbstractC1748v.m3929b(r04) > r42.longValue()) goto L46;
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Latest ANR has already been reported, returning early.", new Object[0]);
        return;
    L46:
        if (r2.isReportHistoricalAnrs() == false) goto L60;
        Collections.reverse(r13);
        Iterator r14 = r13.iterator();
    L49:
        if (r14.hasNext() == false) goto L60;
        ApplicationExitInfo r53 = AbstractC1748v.m3930c(r14.next());
        if (AbstractC1748v.m3928a(r53) != 6) goto L49;
        if (AbstractC1748v.m3929b(r53) < r8) goto L54;
        if (r42 == null) goto L59;
        if (AbstractC1748v.m3929b(r53) > r42.longValue()) goto L59;
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "ANR has already been reported %s.", new Object[]{r53});
    L59:
        m3936a(r53, false);
        goto L49
    L54:
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "ANR happened too long ago %s.", new Object[]{r53});
    L60:
        m3936a(r04, true);
        return;
    L15:
        if (r4.exists() == true) goto L17;
    L24:
        r2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Last ANR marker does not exist. %s.", new Object[]{r4.getAbsolutePath()});     // Catch: Throwable -> L22
        goto L20
    L17:
        if (r4.canRead() == false) goto L24;
        String r43 = AbstractC1856a.m4047C(r4);     // Catch: Throwable -> L22
        if (r43.equals("null") == true) goto L20;
        r42 = Long.valueOf(Long.parseLong(r43.trim()));     // Catch: Throwable -> L22
        goto L27
    L9:
        if (r2.isEnableAutoSessionTracking() == false) goto L13;
        C1838c r15 = (C1838c) r12;
        if (r15.m4009h() == true) goto L13;
        r2.getLogger().mo3680e(EnumC1657a2.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
        r15.f6638e.countDown();
        goto L13
    }
}
