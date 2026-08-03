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
    public static boolean m4094d(C2046v2 r0, String r1) {
        if (r0 == null) goto L4;
        ILogger r02 = r0.getLogger();
    L6:
        return m4095e(r1, r02);
    L4:
        r02 = null;
        goto L6
    }

    /* JADX INFO: renamed from: e */
    public static boolean m4095e(String r0, ILogger r1) {
        if (m4096h(r0, r1) == null) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static Class m4096h(String r3, ILogger r4) {
        return Class.forName(r3);
    L10:
        if (r4 == null) goto L20;
        r4.mo3680e(EnumC1657a2.INFO, "Class not available: ".concat(r3), new Object[0]);
        return null;
    L20:
        return null;
    L7:
        e = move-exception;
        if (r4 == null) goto L18;
        r4.mo3683r(EnumC1657a2.ERROR, "Failed to load (UnsatisfiedLinkError) ".concat(r3), e);
        return null;
    L18:
        return null;
    L4:
        th = move-exception;
        if (r4 == null) goto L16;
        r4.mo3683r(EnumC1657a2.ERROR, "Failed to initialize ".concat(r3), th);
        return null;
    L16:
        return null;
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: a */
    public void mo4040a(EnumC1853d r1, C1901c r2) {
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: b */
    public void mo4041b(EnumC1853d r1, EnumC1929n r2) {
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: c */
    public void mo4042c(EnumC1853d r1, EnumC1929n r2, long r3) {
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: f */
    public void mo4043f(EnumC1853d r1, C1620P1 r2) {
    }

    @Override // io.sentry.clientreport.InterfaceC1855f
    /* JADX INFO: renamed from: g */
    public C1901c mo4044g(C1901c r1) {
        return r1;
    }
}
