package io.sentry;

import io.sentry.cache.C1840e;
import io.sentry.cache.C1841f;
import io.sentry.cache.tape.AbstractC1846e;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.EnumC1946C;
import io.sentry.util.AbstractC2036h;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.y1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2062y1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7292a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2046v2 f7293b;

    public /* synthetic */ RunnableC2062y1(C2046v2 r1, int r2) {
        this.f7292a = r2;
        this.f7293b = r1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f7292a) {
            case 0: goto L83;
            case 1: goto L41;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        long r0 = this.f7293b.getFlushTimeoutMillis();
        AbstractC2066z1.m4233b().mo3708b(r0);
        return;
    L6:
        C2046v2 r02 = this.f7293b;
        Iterator<InterfaceC1633T> r1 = r02.getOptionsObservers().iterator();
    L8:
        if (r1.hasNext() == false) goto L33;
        InterfaceC1633T r2 = r1.next();
        String r4 = r02.getRelease();
        C1840e r22 = (C1840e) r2;
        if (r4 != null) goto L12;
        r22.m4012a("release.json");
    L13:
        String r42 = r02.getProguardUuid();
        if (r42 != null) goto L16;
        r22.m4012a("proguard-uuid.json");
    L17:
        C1968r r43 = r02.getSdkVersion();
        if (r43 != null) goto L20;
        r22.m4012a("sdk-version.json");
    L21:
        String r44 = r02.getDist();
        if (r44 != null) goto L24;
        r22.m4012a("dist.json");
    L25:
        String r45 = r02.getEnvironment();
        if (r45 != null) goto L28;
        r22.m4012a("environment.json");
    L29:
        r22.m4013b("tags.json", r02.getTags());
        Double r3 = r02.getSessionReplay().f7306b;
        if (r3 == null) goto L31;
        r22.m4013b("replay-error-sample-rate.json", r3.toString());
        goto L8
    L31:
        r22.m4012a("replay-error-sample-rate.json");
        goto L8
    L28:
        r22.m4013b("environment.json", r45);
        goto L29
    L24:
        r22.m4013b("dist.json", r44);
        goto L25
    L20:
        r22.m4013b("sdk-version.json", r43);
        goto L21
    L16:
        r22.m4013b("proguard-uuid.json", r42);
        goto L17
    L12:
        r22.m4013b("release.json", r4);
        goto L13
    L33:
        C1841f r03 = r02.findPersistingScopeObserver();
        if (r03 == null) goto L101;
        ((AbstractC1846e) r03.f6645b.m4175a()).clear();     // Catch: IOException -> L37
    L39:
        r03.m4014f("user.json");
        r03.m4014f("level.json");
        r03.m4014f("request.json");
        r03.m4014f("fingerprint.json");
        r03.m4014f("contexts.json");
        r03.m4014f("extras.json");
        r03.m4014f("tags.json");
        r03.m4014f("trace.json");
        r03.m4014f("transaction.json");
        return;
    L37:
        e = move-exception;
        r03.f6644a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to clear breadcrumbs from file queue", e);
        goto L39
    L101:
        return;
    L41:
        C2046v2 r04 = this.f7293b;
        String r12 = r04.getCacheDirPathWithoutDsn();
        if (r12 == null) goto L102;
        File r23 = new File(r12, "app_start_profiling_config");
        AbstractC1856a.m4060f(r23);     // Catch: Throwable -> L49
        if (r04.isEnableAppStartProfiling() == true) goto L52;
        if (r04.isStartProfilerOnAppStart() == true) goto L52;
        return;
    L52:
        if (r04.isStartProfilerOnAppStart() == true) goto L57;
        if (r04.isTracingEnabled() == true) goto L57;
        r04.getLogger().mo3680e(EnumC1657a2.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);     // Catch: Throwable -> L49
        return;
    L57:
        if (r23.createNewFile() == true) goto L59;
        return;
    L59:
        if (r04.isEnableAppStartProfiling() == false) goto L61;
        C1918l r32 = new C1918l(new C1621P2("app.launch", EnumC1946C.CUSTOM, "profile", null), Double.valueOf(AbstractC2036h.m4180a().m4179c()));     // Catch: Throwable -> L49
        C2648vx r13 = r04.getInternalTracesSampler().m3726a(r32);     // Catch: Throwable -> L49
    L62:
        C1560A1 r33 = new C1560A1(r04, r13);     // Catch: Throwable -> L49
        FileOutputStream r14 = new FileOutputStream(r23);     // Catch: Throwable -> L49
        BufferedWriter r24 = new BufferedWriter(new OutputStreamWriter(r14, AbstractC2066z1.f7302e));     // Catch: Throwable -> L68
        r04.getSerializer().mo3610d(r33, r24);     // Catch: Throwable -> L70
        r24.close();     // Catch: Throwable -> L68
        r14.close();     // Catch: Throwable -> L49
        return;
    L70:
        th = move-exception;
        r24.close();     // Catch: Throwable -> L73
    L75:
        throw th;     // Catch: Throwable -> L68
    L73:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L68
    L68:
        th = move-exception;
        r14.close();     // Catch: Throwable -> L78
    L80:
        throw th;     // Catch: Throwable -> L49
    L78:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L49
        goto L80
    L61:
        r13 = new C2648vx(Boolean.FALSE, null);     // Catch: Throwable -> L49
    L49:
        th = move-exception;
        r04.getLogger().mo3683r(EnumC1657a2.ERROR, "Unable to create app start profiling config file. ", th);
        return;
    L102:
        return;
    L83:
        this.f7293b.loadLazyFields();
    }
}
