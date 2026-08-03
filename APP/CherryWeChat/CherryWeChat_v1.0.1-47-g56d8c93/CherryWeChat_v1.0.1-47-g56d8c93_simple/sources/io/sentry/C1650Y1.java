package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1971u;
import io.sentry.util.C2029a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.Y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1650Y1 {

    /* JADX INFO: renamed from: c */
    public static volatile C1650Y1 f5893c;

    /* JADX INFO: renamed from: d */
    public static final C2029a f5894d = null;

    /* JADX INFO: renamed from: e */
    public static volatile Boolean f5895e;

    /* JADX INFO: renamed from: f */
    public static final C2029a f5896f = null;

    /* JADX INFO: renamed from: a */
    public final CopyOnWriteArraySet f5897a;

    /* JADX INFO: renamed from: b */
    public final CopyOnWriteArraySet f5898b;

    static {
        f5894d = new C2029a();
        f5895e = null;
        f5896f = new C2029a();
    }

    public C1650Y1() {
        this.f5897a = new CopyOnWriteArraySet();
        this.f5898b = new CopyOnWriteArraySet();
    }

    /* JADX INFO: renamed from: d */
    public static C1650Y1 m3790d() {
        if (f5893c != null) goto L18;
        C1981r r0 = f5894d.m4173a();
    L9:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    L6:
        if (f5893c != null) goto L11;
        f5893c = new C1650Y1();     // Catch: Throwable -> L9
    L11:
        r0.close();
    L18:
        return f5893c;
    }

    /* JADX INFO: renamed from: a */
    public final void m3791a(String r2) {
        AbstractC1856a.m4048D("integration is required.", r2);
        this.f5897a.add(r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m3792b(String r2, String r3) {
        C1971u r0 = new C1971u(r2, r3);
        this.f5898b.add(r0);
        C1981r r22 = f5896f.m4173a();
        f5895e = null;     // Catch: Throwable -> L6
        r22.close();
        return;
    L6:
        th = move-exception;
        r22.close();     // Catch: Throwable -> L9
    L11:
        throw th;
    L9:
        th = move-exception;
        th.addSuppressed(th);
        goto L11
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3793c(ILogger r10) {
        Boolean r2 = f5895e;
        if (r2 != null) goto L5;
        C1981r r22 = f5896f.m4173a();
        Iterator r3 = this.f5898b.iterator();     // Catch: Throwable -> L15
        boolean r5 = false;
    L9:
        if (r3.hasNext() == false) goto L17;
        C1971u r6 = (C1971u) r3.next();     // Catch: Throwable -> L15
        if (r6.f7013a.startsWith("maven:io.sentry:") == false) goto L9;
        if ("8.21.1".equalsIgnoreCase(r6.f7014b) == true) goto L9;
        r10.mo3680e(EnumC1657a2.ERROR, "The Sentry SDK has been configured with mixed versions. Expected %s to match core SDK version %s but was %s", new Object[]{r6.f7013a, "8.21.1", r6.f7014b});     // Catch: Throwable -> L15
        r5 = true;
        goto L9
    L17:
        if (r5 == false) goto L19;
        EnumC1657a2 r0 = EnumC1657a2.ERROR;     // Catch: Throwable -> L15
        r10.mo3680e(r0, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);     // Catch: Throwable -> L15
        r10.mo3680e(r0, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);     // Catch: Throwable -> L15
        r10.mo3680e(r0, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);     // Catch: Throwable -> L15
        r10.mo3680e(r0, "^^^^^^^^^^^^^^^^^^^^^^^^^^^^", new Object[0]);     // Catch: Throwable -> L15
    L19:
        f5895e = Boolean.valueOf(r5);     // Catch: Throwable -> L15
        r22.close();
        return r5;
    L15:
        th = move-exception;
        r22.close();     // Catch: Throwable -> L24
    L26:
        throw th;
    L24:
        th = move-exception;
        th.addSuppressed(th);
        goto L26
    L5:
        return r2.booleanValue();
    }
}
