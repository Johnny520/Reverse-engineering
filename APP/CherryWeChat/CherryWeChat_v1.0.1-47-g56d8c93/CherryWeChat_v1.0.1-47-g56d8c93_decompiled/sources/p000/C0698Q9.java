package p000;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import io.sentry.C1559A0;
import io.sentry.C1572D1;
import io.sentry.C1573D2;
import io.sentry.C1641V1;
import io.sentry.C1650Y1;
import io.sentry.C1832c;
import io.sentry.C1918l;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.C2065z0;
import io.sentry.C2067z2;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1877g1;
import io.sentry.EnumC1882h2;
import io.sentry.EnumC1926m0;
import io.sentry.EnumC2027u1;
import io.sentry.ILogger;
import io.sentry.InterfaceC1645X;
import io.sentry.InterfaceC1895i0;
import io.sentry.InterfaceC1931n1;
import io.sentry.InterfaceC1940p1;
import io.sentry.InterfaceC2000s1;
import io.sentry.InterfaceC2003t0;
import io.sentry.android.core.AbstractC1665H;
import io.sentry.android.core.AbstractC1675S;
import io.sentry.android.core.AbstractC1686b0;
import io.sentry.android.core.AbstractC1731m;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C1662E;
import io.sentry.android.core.C1666I;
import io.sentry.android.core.C1676T;
import io.sentry.android.core.C1688c0;
import io.sentry.android.core.C1692e;
import io.sentry.android.core.C1743q;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC1707f;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.android.core.performance.C1740f;
import io.sentry.android.core.performance.C1741g;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.C1891i;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1970t;
import io.sentry.util.C2029a;
import io.sentry.vendor.gson.stream.C2049a;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: Q9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0698Q9 implements InterfaceC0901Uz, InterfaceC0566N6, InterfaceC2003t0, InterfaceC1940p1, InterfaceC2000s1, InterfaceC1931n1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2246a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2247b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2248c;

    public /* synthetic */ C0698Q9(int i, Object obj, Object obj2) {
        this.f2246a = i;
        this.f2247b = obj;
        this.f2248c = obj2;
    }

    @Override // p000.InterfaceC0901Uz
    /* JADX INFO: renamed from: a */
    public void mo1423a() {
        switch (this.f2246a) {
            case 0:
                C1495ha c1495ha = (C1495ha) this.f2247b;
                Activity activity = (Activity) this.f2248c;
                C1036Y4 c1036y4 = C1036Y4.f3308a;
                boolean z = true;
                C0740R9 c0740r9 = new C0740R9(c1495ha, z, activity, 0);
                C0740R9 c0740r92 = new C0740R9(c1495ha, z, activity, 1);
                c1036y4.getClass();
                C1036Y4.m1982a(activity, c0740r9, c0740r92, true);
                break;
            default:
                ((C1495ha) this.f2247b).m2860f((Activity) this.f2248c, true);
                break;
        }
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public void mo1424b(InterfaceC1645X interfaceC1645X) {
        switch (this.f2246a) {
            case 6:
                interfaceC1645X.mo3777u(new C1692e((ActivityLifecycleIntegration) this.f2247b, interfaceC1645X, (InterfaceC1895i0) this.f2248c));
                break;
            default:
                interfaceC1645X.mo3777u(new C1572D1((GestureDetectorOnGestureListenerC1707f) this.f2247b, interfaceC1645X, (InterfaceC1895i0) this.f2248c));
                break;
        }
    }

    @Override // io.sentry.InterfaceC1940p1
    /* JADX INFO: renamed from: c */
    public void mo1425c(InterfaceC1895i0 interfaceC1895i0) {
        switch (this.f2246a) {
            case 4:
                C1573D2 c1573d2 = (C1573D2) this.f2247b;
                InterfaceC1645X interfaceC1645X = (InterfaceC1645X) this.f2248c;
                c1573d2.getClass();
                if (interfaceC1895i0 == c1573d2) {
                    interfaceC1645X.mo3771o();
                }
                break;
            case 5:
                InterfaceC1895i0 interfaceC1895i02 = (InterfaceC1895i0) this.f2247b;
                InterfaceC1645X interfaceC1645X2 = (InterfaceC1645X) this.f2248c;
                if (interfaceC1895i0 == interfaceC1895i02) {
                    interfaceC1645X2.mo3771o();
                }
                break;
            default:
                GestureDetectorOnGestureListenerC1707f gestureDetectorOnGestureListenerC1707f = (GestureDetectorOnGestureListenerC1707f) this.f2247b;
                InterfaceC1645X interfaceC1645X3 = (InterfaceC1645X) this.f2248c;
                if (interfaceC1895i0 == gestureDetectorOnGestureListenerC1707f.f6175e) {
                    interfaceC1645X3.mo3771o();
                }
                break;
        }
    }

    @Override // io.sentry.InterfaceC2003t0
    /* JADX INFO: renamed from: d */
    public Object mo1426d() {
        C2065z0 c2065z0 = (C2065z0) this.f2247b;
        C1559A0 c1559a0 = (C1559A0) this.f2248c;
        c2065z0.getClass();
        try {
            try {
                return Integer.valueOf(((C2049a) c1559a0.f5581b).m4211u());
            } catch (Exception unused) {
                return Double.valueOf(((C2049a) c1559a0.f5581b).m4210t());
            }
        } catch (Exception unused2) {
            return Long.valueOf(((C2049a) c1559a0.f5581b).m4212v());
        }
    }

    @Override // io.sentry.InterfaceC1931n1
    /* JADX INFO: renamed from: e */
    public void mo1427e(C1918l c1918l) {
        InterfaceC1645X interfaceC1645X = (InterfaceC1645X) this.f2247b;
        C2046v2 c2046v2 = (C2046v2) this.f2248c;
        C1832c c1832c = (C1832c) c1918l.f6807d;
        if (c1832c.f6622e) {
            C1918l c1918lMo3755E = interfaceC1645X.mo3755E();
            C1970t c1970tMo3754D = interfaceC1645X.mo3754D();
            c1832c.m3996b("sentry-trace_id", ((C1970t) c1918lMo3755E.f6805b).toString());
            c1832c.m3996b("sentry-public_key", c2046v2.retrieveParsedDsn().f7295b);
            c1832c.m3996b("sentry-release", c2046v2.getRelease());
            c1832c.m3996b("sentry-environment", c2046v2.getEnvironment());
            if (!C1970t.f7011b.equals(c1970tMo3754D)) {
                c1832c.m3996b("sentry-replay_id", c1970tMo3754D.toString());
            }
            c1832c.m3996b("sentry-transaction", null);
            if (c1832c.f6622e) {
                c1832c.f6620c = null;
            }
            c1832c.m3996b("sentry-sampled", null);
            c1832c.f6622e = false;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public void m1428f(C2046v2 c2046v2) {
        C1891i c1891i;
        Context context;
        boolean z;
        boolean z2;
        C1743q c1743q = (C1743q) this.f2247b;
        Context context2 = (Context) this.f2248c;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) c2046v2;
        boolean zM4094d = C1891i.m4094d(sentryAndroidOptions, "timber.log.Timber");
        boolean z3 = C1891i.m4094d(sentryAndroidOptions, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") && C1891i.m4094d(sentryAndroidOptions, "io.sentry.android.fragment.FragmentLifecycleIntegration");
        boolean z4 = zM4094d && C1891i.m4094d(sentryAndroidOptions, "io.sentry.android.timber.SentryTimberIntegration");
        boolean zM4094d2 = C1891i.m4094d(sentryAndroidOptions, "io.sentry.android.replay.ReplayIntegration");
        C1666I c1666i = new C1666I(c1743q);
        C1891i c1891i2 = new C1891i();
        C0252Fu c0252Fu = new C0252Fu(sentryAndroidOptions);
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context2;
        }
        sentryAndroidOptions.setLogger(c1743q);
        sentryAndroidOptions.setFatalLogger(new C1743q(2));
        sentryAndroidOptions.setDefaultScopeType(EnumC2027u1.CURRENT);
        sentryAndroidOptions.setOpenTelemetryMode(EnumC1882h2.OFF);
        sentryAndroidOptions.setDateProvider(new C1688c0());
        sentryAndroidOptions.setFlushTimeoutMillis(4000L);
        sentryAndroidOptions.setFrameMetricsCollector(new C1727o(applicationContext, c1743q, c1666i));
        try {
            sentryAndroidOptions.getLogger();
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) AbstractC1665H.f5971d.m97b(applicationContext) : (ApplicationInfo) AbstractC1665H.f5972e.m97b(applicationContext);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            ILogger logger = sentryAndroidOptions.getLogger();
            try {
                if (bundle != null) {
                    sentryAndroidOptions.setDebug(AbstractC1665H.m3827e(bundle, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                    if (sentryAndroidOptions.isDebug()) {
                        String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                        Locale locale = Locale.ROOT;
                        String strM3831i = AbstractC1665H.m3831i(bundle, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                        if (strM3831i != null) {
                            sentryAndroidOptions.setDiagnosticLevel(EnumC1657a2.valueOf(strM3831i.toUpperCase(locale)));
                        }
                    }
                    sentryAndroidOptions.setAnrEnabled(AbstractC1665H.m3827e(bundle, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                    sentryAndroidOptions.setEnableAutoSessionTracking(AbstractC1665H.m3827e(bundle, logger, "io.sentry.auto-session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking()));
                    if (sentryAndroidOptions.getSampleRate() == null) {
                        double dM3828f = AbstractC1665H.m3828f(bundle, logger, "io.sentry.sample-rate");
                        if (dM3828f != -1.0d) {
                            sentryAndroidOptions.setSampleRate(Double.valueOf(dM3828f));
                        }
                    }
                    sentryAndroidOptions.setAnrReportInDebug(AbstractC1665H.m3827e(bundle, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                    sentryAndroidOptions.setAnrTimeoutIntervalMillis(AbstractC1665H.m3830h(bundle, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                    sentryAndroidOptions.setAttachAnrThreadDump(AbstractC1665H.m3827e(bundle, logger, "io.sentry.anr.attach-thread-dumps", sentryAndroidOptions.isAttachAnrThreadDump()));
                    String strM3831i2 = AbstractC1665H.m3831i(bundle, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                    boolean zM3827e = AbstractC1665H.m3827e(bundle, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                    if (!zM3827e || (strM3831i2 != null && strM3831i2.isEmpty())) {
                        c1891i = c1891i2;
                        context = context2;
                        z = z3;
                        z2 = z4;
                        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                    } else if (strM3831i2 == null) {
                        c1891i = c1891i2;
                        try {
                            context = context2;
                            z = z3;
                            z2 = z4;
                            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                        } catch (Throwable th) {
                            th = th;
                            context = context2;
                            z = z3;
                            z2 = z4;
                            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to read configuration from android manifest metadata.", th);
                        }
                    } else {
                        c1891i = c1891i2;
                        context = context2;
                        z = z3;
                        z2 = z4;
                    }
                    sentryAndroidOptions.setEnabled(zM3827e);
                    sentryAndroidOptions.setDsn(strM3831i2);
                    sentryAndroidOptions.setEnableNdk(AbstractC1665H.m3827e(bundle, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                    sentryAndroidOptions.setEnableScopeSync(AbstractC1665H.m3827e(bundle, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                    sentryAndroidOptions.setRelease(AbstractC1665H.m3831i(bundle, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                    sentryAndroidOptions.setEnvironment(AbstractC1665H.m3831i(bundle, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                    sentryAndroidOptions.setSessionTrackingIntervalMillis(AbstractC1665H.m3830h(bundle, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                    sentryAndroidOptions.setMaxBreadcrumbs((int) AbstractC1665H.m3830h(bundle, logger, "io.sentry.max-breadcrumbs", sentryAndroidOptions.getMaxBreadcrumbs()));
                    sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(AbstractC1665H.m3827e(bundle, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                    sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(AbstractC1665H.m3827e(bundle, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                    sentryAndroidOptions.setEnableSystemEventBreadcrumbs(AbstractC1665H.m3827e(bundle, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                    sentryAndroidOptions.setEnableAppComponentBreadcrumbs(AbstractC1665H.m3827e(bundle, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                    sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(AbstractC1665H.m3827e(bundle, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                    sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(AbstractC1665H.m3827e(bundle, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                    sentryAndroidOptions.setEnableUncaughtExceptionHandler(AbstractC1665H.m3827e(bundle, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                    sentryAndroidOptions.setAttachThreads(AbstractC1665H.m3827e(bundle, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                    sentryAndroidOptions.setAttachScreenshot(AbstractC1665H.m3827e(bundle, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                    sentryAndroidOptions.setAttachViewHierarchy(AbstractC1665H.m3827e(bundle, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                    sentryAndroidOptions.setSendClientReports(AbstractC1665H.m3827e(bundle, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                    if (AbstractC1665H.m3827e(bundle, logger, "io.sentry.auto-init", true)) {
                        sentryAndroidOptions.setInitPriority(EnumC1926m0.LOW);
                    }
                    sentryAndroidOptions.setForceInit(AbstractC1665H.m3827e(bundle, logger, "io.sentry.force-init", sentryAndroidOptions.isForceInit()));
                    sentryAndroidOptions.setCollectAdditionalContext(AbstractC1665H.m3827e(bundle, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                    if (sentryAndroidOptions.getTracesSampleRate() == null) {
                        double dM3828f2 = AbstractC1665H.m3828f(bundle, logger, "io.sentry.traces.sample-rate");
                        if (dM3828f2 != -1.0d) {
                            sentryAndroidOptions.setTracesSampleRate(Double.valueOf(dM3828f2));
                        }
                    }
                    sentryAndroidOptions.setTraceSampling(AbstractC1665H.m3827e(bundle, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                    sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(AbstractC1665H.m3827e(bundle, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                    sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(AbstractC1665H.m3827e(bundle, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                    if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                        double dM3828f3 = AbstractC1665H.m3828f(bundle, logger, "io.sentry.traces.profiling.sample-rate");
                        if (dM3828f3 != -1.0d) {
                            sentryAndroidOptions.setProfilesSampleRate(Double.valueOf(dM3828f3));
                        }
                    }
                    if (sentryAndroidOptions.getProfileSessionSampleRate() == null) {
                        double dM3828f4 = AbstractC1665H.m3828f(bundle, logger, "io.sentry.traces.profiling.session-sample-rate");
                        if (dM3828f4 != -1.0d) {
                            sentryAndroidOptions.setProfileSessionSampleRate(Double.valueOf(dM3828f4));
                        }
                    }
                    String strName2 = sentryAndroidOptions.getProfileLifecycle().name();
                    Locale locale2 = Locale.ROOT;
                    String strM3831i3 = AbstractC1665H.m3831i(bundle, logger, "io.sentry.traces.profiling.lifecycle", strName2.toLowerCase(locale2));
                    if (strM3831i3 != null) {
                        sentryAndroidOptions.setProfileLifecycle(EnumC1877g1.valueOf(strM3831i3.toUpperCase(locale2)));
                    }
                    sentryAndroidOptions.setStartProfilerOnAppStart(AbstractC1665H.m3827e(bundle, logger, "io.sentry.traces.profiling.start-on-app-start", sentryAndroidOptions.isStartProfilerOnAppStart()));
                    sentryAndroidOptions.setEnableUserInteractionTracing(AbstractC1665H.m3827e(bundle, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                    sentryAndroidOptions.setEnableTimeToFullDisplayTracing(AbstractC1665H.m3827e(bundle, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                    long jM3830h = AbstractC1665H.m3830h(bundle, logger, "io.sentry.traces.idle-timeout", -1L);
                    if (jM3830h != -1) {
                        sentryAndroidOptions.setIdleTimeout(Long.valueOf(jM3830h));
                    }
                    List<String> listM3829g = AbstractC1665H.m3829g(bundle, logger, "io.sentry.traces.trace-propagation-targets");
                    if (bundle.containsKey("io.sentry.traces.trace-propagation-targets") && listM3829g == null) {
                        sentryAndroidOptions.setTracePropagationTargets(Collections.EMPTY_LIST);
                    } else if (listM3829g != null) {
                        sentryAndroidOptions.setTracePropagationTargets(listM3829g);
                    }
                    sentryAndroidOptions.setEnableFramesTracking(AbstractC1665H.m3827e(bundle, logger, "io.sentry.traces.frames-tracking", true));
                    sentryAndroidOptions.setProguardUuid(AbstractC1665H.m3831i(bundle, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                    C1968r sdkVersion = sentryAndroidOptions.getSdkVersion();
                    if (sdkVersion == null) {
                        sdkVersion = new C1968r("", "");
                    }
                    String strM3832j = AbstractC1665H.m3832j(bundle, logger, "io.sentry.sdk.name", sdkVersion.f6999a);
                    AbstractC1856a.m4048D("name is required.", strM3832j);
                    sdkVersion.f6999a = strM3832j;
                    String strM3832j2 = AbstractC1665H.m3832j(bundle, logger, "io.sentry.sdk.version", sdkVersion.f7000b);
                    AbstractC1856a.m4048D("version is required.", strM3832j2);
                    sdkVersion.f7000b = strM3832j2;
                    sentryAndroidOptions.setSdkVersion(sdkVersion);
                    sentryAndroidOptions.setSendDefaultPii(AbstractC1665H.m3827e(bundle, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                    List listM3829g2 = AbstractC1665H.m3829g(bundle, logger, "io.sentry.gradle-plugin-integrations");
                    if (listM3829g2 != null) {
                        Iterator it = listM3829g2.iterator();
                        while (it.hasNext()) {
                            C1650Y1.m3790d().m3791a((String) it.next());
                        }
                    }
                    sentryAndroidOptions.setEnableRootCheck(AbstractC1665H.m3827e(bundle, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                    sentryAndroidOptions.setSendModules(AbstractC1665H.m3827e(bundle, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
                    sentryAndroidOptions.setEnablePerformanceV2(AbstractC1665H.m3827e(bundle, logger, "io.sentry.performance-v2.enable", sentryAndroidOptions.isEnablePerformanceV2()));
                    sentryAndroidOptions.setEnableAppStartProfiling(AbstractC1665H.m3827e(bundle, logger, "io.sentry.profiling.enable-app-start", sentryAndroidOptions.isEnableAppStartProfiling()));
                    sentryAndroidOptions.setEnableScopePersistence(AbstractC1665H.m3827e(bundle, logger, "io.sentry.enable-scope-persistence", sentryAndroidOptions.isEnableScopePersistence()));
                    sentryAndroidOptions.setEnableAutoTraceIdGeneration(AbstractC1665H.m3827e(bundle, logger, "io.sentry.traces.enable-auto-id-generation", sentryAndroidOptions.isEnableAutoTraceIdGeneration()));
                    sentryAndroidOptions.setDeadlineTimeout(AbstractC1665H.m3830h(bundle, logger, "io.sentry.traces.deadline-timeout", sentryAndroidOptions.getDeadlineTimeout()));
                    if (sentryAndroidOptions.getSessionReplay().f7305a == null) {
                        double dM3828f5 = AbstractC1665H.m3828f(bundle, logger, "io.sentry.session-replay.session-sample-rate");
                        if (dM3828f5 != -1.0d) {
                            C2067z2 sessionReplay = sentryAndroidOptions.getSessionReplay();
                            Double dValueOf = Double.valueOf(dM3828f5);
                            sessionReplay.getClass();
                            if (!AbstractC1856a.m4077y(dValueOf, true)) {
                                throw new IllegalArgumentException("The value " + dValueOf + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                            }
                            sessionReplay.f7305a = dValueOf;
                        }
                    }
                    if (sentryAndroidOptions.getSessionReplay().f7306b == null) {
                        double dM3828f6 = AbstractC1665H.m3828f(bundle, logger, "io.sentry.session-replay.on-error-sample-rate");
                        if (dM3828f6 != -1.0d) {
                            C2067z2 sessionReplay2 = sentryAndroidOptions.getSessionReplay();
                            Double dValueOf2 = Double.valueOf(dM3828f6);
                            sessionReplay2.getClass();
                            if (!AbstractC1856a.m4077y(dValueOf2, true)) {
                                throw new IllegalArgumentException("The value " + dValueOf2 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
                            }
                            sessionReplay2.f7306b = dValueOf2;
                        }
                    }
                    C2067z2 sessionReplay3 = sentryAndroidOptions.getSessionReplay();
                    boolean zM3827e2 = AbstractC1665H.m3827e(bundle, logger, "io.sentry.session-replay.mask-all-text", true);
                    CopyOnWriteArraySet copyOnWriteArraySet = sessionReplay3.f7308d;
                    CopyOnWriteArraySet copyOnWriteArraySet2 = sessionReplay3.f7307c;
                    if (zM3827e2) {
                        copyOnWriteArraySet2.add("android.widget.TextView");
                        copyOnWriteArraySet.remove("android.widget.TextView");
                    } else {
                        copyOnWriteArraySet.add("android.widget.TextView");
                        copyOnWriteArraySet2.remove("android.widget.TextView");
                    }
                    C2067z2 sessionReplay4 = sentryAndroidOptions.getSessionReplay();
                    boolean zM3827e3 = AbstractC1665H.m3827e(bundle, logger, "io.sentry.session-replay.mask-all-images", true);
                    CopyOnWriteArraySet copyOnWriteArraySet3 = sessionReplay4.f7308d;
                    CopyOnWriteArraySet copyOnWriteArraySet4 = sessionReplay4.f7307c;
                    if (zM3827e3) {
                        copyOnWriteArraySet4.add("android.widget.ImageView");
                        copyOnWriteArraySet3.remove("android.widget.ImageView");
                    } else {
                        copyOnWriteArraySet3.add("android.widget.ImageView");
                        copyOnWriteArraySet4.remove("android.widget.ImageView");
                    }
                    sentryAndroidOptions.getSessionReplay().f7316l = AbstractC1665H.m3827e(bundle, logger, "io.sentry.session-replay.debug", false);
                    sentryAndroidOptions.setIgnoredErrors(AbstractC1665H.m3829g(bundle, logger, "io.sentry.ignored-errors"));
                    List listM3829g3 = AbstractC1665H.m3829g(bundle, logger, "io.sentry.in-app-includes");
                    if (listM3829g3 != null && !listM3829g3.isEmpty()) {
                        Iterator it2 = listM3829g3.iterator();
                        while (it2.hasNext()) {
                            sentryAndroidOptions.addInAppInclude((String) it2.next());
                        }
                    }
                    List listM3829g4 = AbstractC1665H.m3829g(bundle, logger, "io.sentry.in-app-excludes");
                    if (listM3829g4 != null && !listM3829g4.isEmpty()) {
                        Iterator it3 = listM3829g4.iterator();
                        while (it3.hasNext()) {
                            sentryAndroidOptions.addInAppExclude((String) it3.next());
                        }
                    }
                    sentryAndroidOptions.getLogs().f6831a = AbstractC1665H.m3827e(bundle, logger, "io.sentry.logs.enabled", sentryAndroidOptions.getLogs().f6831a);
                    C1641V1 feedbackOptions = sentryAndroidOptions.getFeedbackOptions();
                    feedbackOptions.f5882a = AbstractC1665H.m3827e(bundle, logger, "io.sentry.feedback.is-name-required", feedbackOptions.f5882a);
                    feedbackOptions.f5883b = AbstractC1665H.m3827e(bundle, logger, "io.sentry.feedback.show-name", feedbackOptions.f5883b);
                    feedbackOptions.f5884c = AbstractC1665H.m3827e(bundle, logger, "io.sentry.feedback.is-email-required", feedbackOptions.f5884c);
                    feedbackOptions.f5885d = AbstractC1665H.m3827e(bundle, logger, "io.sentry.feedback.show-email", feedbackOptions.f5885d);
                    feedbackOptions.f5886e = AbstractC1665H.m3827e(bundle, logger, "io.sentry.feedback.use-sentry-user", feedbackOptions.f5886e);
                    feedbackOptions.f5887f = AbstractC1665H.m3827e(bundle, logger, "io.sentry.feedback.show-branding", feedbackOptions.f5887f);
                } else {
                    c1891i = c1891i2;
                    context = context2;
                    z = z3;
                    z2 = z4;
                }
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
            } catch (Throwable th2) {
                th = th2;
                sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to read configuration from android manifest metadata.", th);
            }
        } catch (Throwable th3) {
            th = th3;
            c1891i = c1891i2;
        }
        sentryAndroidOptions.setCacheDirPath(new File(applicationContext.getCacheDir(), "sentry").getAbsolutePath());
        PackageInfo packageInfoM3825c = AbstractC1665H.m3825c(applicationContext, c1666i);
        if (packageInfoM3825c != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(packageInfoM3825c.packageName + "@" + packageInfoM3825c.versionName + "+" + Long.toString(packageInfoM3825c.getLongVersionCode()));
            }
            String str = packageInfoM3825c.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(AbstractC1675S.m3851a(applicationContext));
            } catch (RuntimeException e) {
                sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Could not generate distinct Id.", e);
            }
        }
        C1662E c1662e = C1662E.f5959e;
        if (c1662e.f5961b == null) {
            C1981r c1981rM4173a = c1662e.f5960a.m4173a();
            try {
                c1662e.m3811i(sentryAndroidOptions.getLogger());
                c1981rM4173a.close();
            } finally {
            }
        }
        C1891i c1891i3 = c1891i;
        Context context3 = context;
        boolean z5 = z;
        boolean z6 = z2;
        AbstractC1731m.m3909b(context3, sentryAndroidOptions, c1666i, c1891i3, c0252Fu, z5, z6, zM4094d2);
        try {
            C2029a c2029a = AbstractC1686b0.f6090b;
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th4);
        }
        C1740f c1740fM3914b = C1740f.m3914b();
        if (sentryAndroidOptions.isEnablePerformanceV2()) {
            C1741g c1741g = c1740fM3914b.f6308c;
            if (c1741g.f6322c == 0) {
                c1741g.m3920c(Process.getStartUptimeMillis());
            }
        }
        if (context3.getApplicationContext() instanceof Application) {
            c1740fM3914b.m3917d((Application) context3.getApplicationContext());
        }
        C1741g c1741g2 = c1740fM3914b.f6309d;
        if (c1741g2.f6322c == 0) {
            c1741g2.m3920c(AbstractC1686b0.f6089a);
        }
        AbstractC1731m.m3908a(sentryAndroidOptions, context3, c1666i, c1891i3, c0252Fu);
        AbstractC1686b0.m3867a(sentryAndroidOptions, z5, z6);
    }

    @Override // p000.InterfaceC0566N6
    public void onCancel() {
        Animator animator = (Animator) this.f2247b;
        C0557My c0557My = (C0557My) this.f2248c;
        animator.end();
        if (AbstractC2805zi.m5374G(2)) {
            c0557My.toString();
        }
    }

    public /* synthetic */ C0698Q9(C1743q c1743q, Context context, C1676T c1676t) {
        this.f2246a = 8;
        this.f2247b = c1743q;
        this.f2248c = context;
    }
}
