package io.sentry.hints;

import io.sentry.C1620P1;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.ILogger;
import io.sentry.clientreport.EnumC1853d;
import io.sentry.clientreport.InterfaceC1855f;
import io.sentry.internal.debugmeta.C1901c;

/* JADX INFO: renamed from: io.sentry.hints.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1891i implements InterfaceC1855f, InterfaceC1890h {
    /* JADX INFO: renamed from: d */
    public static boolean m4094d(C2046v2 c2046v2, String str) {
        return m4095e(str, c2046v2 != null ? c2046v2.getLogger() : null);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4095e(String str, ILogger iLogger) {
        return m4096h(str, iLogger) != null;
    }

    /* JADX INFO: renamed from: h */
    public static Class m4096h(String str, ILogger iLogger) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (iLogger == null) {
                return null;
            }
            iLogger.mo3680e(EnumC1657a2.INFO, "Class not available: ".concat(str), new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e) {
            if (iLogger == null) {
                return null;
            }
            iLogger.mo3683r(EnumC1657a2.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(str), e);
            return null;
        } catch (Throwable th) {
            if (iLogger == null) {
                return null;
            }
            iLogger.mo3683r(EnumC1657a2.ERROR, "Failed to initialize ".concat(str), th);
            return null;
        }
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: a */
    public void mo4040a(EnumC1853d enumC1853d, C1901c c1901c) {
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: b */
    public void mo4041b(EnumC1853d enumC1853d, EnumC1929n enumC1929n) {
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: c */
    public void mo4042c(EnumC1853d enumC1853d, EnumC1929n enumC1929n, long j) {
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: f */
    public void mo4043f(EnumC1853d enumC1853d, C1620P1 c1620p1) {
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: g */
    public C1901c mo4044g(C1901c c1901c) {
        return c1901c;
    }
}
