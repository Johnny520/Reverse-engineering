package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1971u;
import io.sentry.util.C2029a;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.Y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1650Y1 {

    /* JADX INFO: renamed from: c */
    public static volatile C1650Y1 f5893c;

    /* JADX INFO: renamed from: d */
    public static final C2029a f5894d = new C2029a();

    /* JADX INFO: renamed from: e */
    public static volatile Boolean f5895e = null;

    /* JADX INFO: renamed from: f */
    public static final C2029a f5896f = new C2029a();

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArraySet f5897a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArraySet f5898b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    public static C1650Y1 m3790d() {
        if (f5893c == null) {
            C1981r c1981rM4173a = f5894d.m4173a();
            try {
                if (f5893c == null) {
                    f5893c = new C1650Y1();
                }
                c1981rM4173a.close();
            } catch (Throwable th) {
                try {
                    c1981rM4173a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return f5893c;
    }

    /* JADX INFO: renamed from: a */
    public final void m3791a(String str) {
        AbstractC1856a.m4048D("integration is required.", str);
        this.f5897a.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m3792b(String str, String str2) {
        this.f5898b.add(new C1971u(str, str2));
        C1981r c1981rM4173a = f5896f.m4173a();
        try {
            f5895e = null;
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3793c(ILogger iLogger) {
        Boolean bool = f5895e;
        if (bool != null) {
            return bool.booleanValue();
        }
        C1981r c1981rM4173a = f5896f.m4173a();
        try {
            boolean z = false;
            for (C1971u c1971u : this.f5898b) {
                if (c1971u.f7013a.startsWith("maven:io.sentry:") && !"8.21.1".equalsIgnoreCase(c1971u.f7014b)) {
                    iLogger.mo3680e(EnumC1657a2.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", c1971u.f7013a, "8.21.1", c1971u.f7014b);
                    z = true;
                }
            }
            if (z) {
                EnumC1657a2 enumC1657a2 = EnumC1657a2.ERROR;
                iLogger.mo3680e(enumC1657a2, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.mo3680e(enumC1657a2, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.mo3680e(enumC1657a2, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
                iLogger.mo3680e(enumC1657a2, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);
            }
            f5895e = Boolean.valueOf(z);
            c1981rM4173a.close();
            return z;
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
