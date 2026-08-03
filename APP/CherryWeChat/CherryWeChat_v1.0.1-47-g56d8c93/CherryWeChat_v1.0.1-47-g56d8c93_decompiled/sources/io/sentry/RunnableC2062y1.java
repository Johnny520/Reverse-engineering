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
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.y1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2062y1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7292a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2046v2 f7293b;

    public /* synthetic */ RunnableC2062y1(C2046v2 c2046v2, int i) {
        this.f7292a = i;
        this.f7293b = c2046v2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7292a) {
            case 0:
                this.f7293b.loadLazyFields();
                return;
            case 1:
                C2046v2 c2046v2 = this.f7293b;
                String cacheDirPathWithoutDsn = c2046v2.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        AbstractC1856a.m4060f(file);
                        if (c2046v2.isEnableAppStartProfiling() || c2046v2.isStartProfilerOnAppStart()) {
                            if (!c2046v2.isStartProfilerOnAppStart() && !c2046v2.isTracingEnabled()) {
                                c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                C1560A1 c1560a1 = new C1560A1(c2046v2, c2046v2.isEnableAppStartProfiling() ? c2046v2.getInternalTracesSampler().m3726a(new C1918l(new C1621P2("app.launch", EnumC1946C.CUSTOM, "profile", null), Double.valueOf(AbstractC2036h.m4180a().m4179c()))) : new C2648vx(Boolean.FALSE, null));
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, AbstractC2066z1.f7302e));
                                    try {
                                        c2046v2.getSerializer().mo3610d(c1560a1, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } finally {
                                        try {
                                            break;
                                        } catch (Throwable th) {
                                        }
                                    }
                                } finally {
                                    try {
                                        break;
                                    } catch (Throwable th2) {
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th3) {
                        c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Unable to create app start profiling config file. ", th3);
                        return;
                    }
                }
                return;
            case 2:
                C2046v2 c2046v22 = this.f7293b;
                for (InterfaceC1633T interfaceC1633T : c2046v22.getOptionsObservers()) {
                    String release = c2046v22.getRelease();
                    C1840e c1840e = (C1840e) interfaceC1633T;
                    if (release == null) {
                        c1840e.m4012a("release.json");
                    } else {
                        c1840e.m4013b("release.json", release);
                    }
                    String proguardUuid = c2046v22.getProguardUuid();
                    if (proguardUuid == null) {
                        c1840e.m4012a("proguard-uuid.json");
                    } else {
                        c1840e.m4013b("proguard-uuid.json", proguardUuid);
                    }
                    C1968r sdkVersion = c2046v22.getSdkVersion();
                    if (sdkVersion == null) {
                        c1840e.m4012a("sdk-version.json");
                    } else {
                        c1840e.m4013b("sdk-version.json", sdkVersion);
                    }
                    String dist = c2046v22.getDist();
                    if (dist == null) {
                        c1840e.m4012a("dist.json");
                    } else {
                        c1840e.m4013b("dist.json", dist);
                    }
                    String environment = c2046v22.getEnvironment();
                    if (environment == null) {
                        c1840e.m4012a("environment.json");
                    } else {
                        c1840e.m4013b("environment.json", environment);
                    }
                    c1840e.m4013b("tags.json", c2046v22.getTags());
                    Double d = c2046v22.getSessionReplay().f7306b;
                    if (d == null) {
                        c1840e.m4012a("replay-error-sample-rate.json");
                    } else {
                        c1840e.m4013b("replay-error-sample-rate.json", d.toString());
                    }
                }
                C1841f c1841fFindPersistingScopeObserver = c2046v22.findPersistingScopeObserver();
                if (c1841fFindPersistingScopeObserver != null) {
                    try {
                        ((AbstractC1846e) c1841fFindPersistingScopeObserver.f6645b.m4175a()).clear();
                        break;
                    } catch (IOException e) {
                        c1841fFindPersistingScopeObserver.f6644a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to clear breadcrumbs from file queue", e);
                    }
                    c1841fFindPersistingScopeObserver.m4014f("user.json");
                    c1841fFindPersistingScopeObserver.m4014f("level.json");
                    c1841fFindPersistingScopeObserver.m4014f("request.json");
                    c1841fFindPersistingScopeObserver.m4014f("fingerprint.json");
                    c1841fFindPersistingScopeObserver.m4014f("contexts.json");
                    c1841fFindPersistingScopeObserver.m4014f("extras.json");
                    c1841fFindPersistingScopeObserver.m4014f("tags.json");
                    c1841fFindPersistingScopeObserver.m4014f("trace.json");
                    c1841fFindPersistingScopeObserver.m4014f("transaction.json");
                    return;
                }
                return;
            default:
                AbstractC2066z1.m4233b().mo3708b(this.f7293b.getFlushTimeoutMillis());
                return;
        }
    }
}
