package io.sentry;

import io.sentry.cache.C1838c;
import io.sentry.cache.InterfaceC1839d;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.protocol.C1970t;
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
    public static final Charset f6623b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6624a;

    public RunnableC1834c1(C2046v2 c2046v2) {
        this.f6624a = c2046v2;
    }

    /* JADX INFO: renamed from: a */
    public final Date m3999a(File file) {
        C2046v2 c2046v2 = this.f6624a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f6623b));
            try {
                String line = bufferedReader.readLine();
                c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateM4069o = AbstractC1856a.m4069o(line);
                bufferedReader.close();
                return dateM4069o;
            } finally {
            }
        } catch (IOException e) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            c2046v2.getLogger().mo3682n(EnumC1657a2.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Date dateM3999a;
        C2046v2 c2046v2 = this.f6624a;
        String cacheDirPath = c2046v2.getCacheDirPath();
        if (cacheDirPath == null) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!c2046v2.isEnableAutoSessionTracking()) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        InterfaceC1839d envelopeDiskCache = c2046v2.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof C1838c) && !((C1838c) envelopeDiskCache).m4009h()) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = C1838c.f6633i;
        File file = new File(cacheDirPath, "previous_session.json");
        InterfaceC1866e0 serializer = c2046v2.getSerializer();
        if (file.exists()) {
            c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f6623b));
                try {
                    C1581F2 c1581f2 = (C1581F2) serializer.mo3607a(bufferedReader, C1581F2.class);
                    if (c1581f2 == null) {
                        c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(c2046v2.getCacheDirPath(), ".sentry-native/last_crash");
                        if (file2.exists()) {
                            c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            dateM3999a = m3999a(file2);
                            if (!file2.delete()) {
                                c2046v2.getLogger().mo3680e(EnumC1657a2.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                            }
                            c1581f2.m3664c(EnumC1577E2.Crashed, null, true, null);
                        } else {
                            dateM3999a = null;
                        }
                        if (c1581f2.f5709n == null) {
                            c1581f2.m3663b(dateM3999a);
                        }
                        AbstractC2066z1.m4233b().mo3713g(new C1901c((C1970t) null, c2046v2.getSdkVersion(), C1620P1.m3730d(serializer, c1581f2)), new C1586H());
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th) {
                c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error processing previous session.", th);
            }
            if (file.delete()) {
                return;
            }
            c2046v2.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
