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

    public /* synthetic */ C0698Q9(int r1, Object r2, Object r3) {
        this.f2246a = r1;
        this.f2247b = r2;
        this.f2248c = r3;
    }

    @Override // p000.InterfaceC0901Uz
    /* JADX INFO: renamed from: a */
    public void mo1423a() {
        switch(this.f2246a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        ((C1495ha) this.f2247b).m2860f((Activity) this.f2248c, true);
        return;
    L6:
        C1495ha r0 = (C1495ha) this.f2247b;
        Activity r1 = (Activity) this.f2248c;
        C1036Y4 r2 = C1036Y4.f3308a;
        boolean r5 = true;
        C0740R9 r3 = new C0740R9(r0, r5, r1, 0);
        C0740R9 r4 = new C0740R9(r0, r5, r1, 1);
        r2.getClass();
        C1036Y4.m1982a(r1, r3, r4, true);
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public void mo1424b(InterfaceC1645X r4) {
        switch(this.f2246a) {
            case 6: goto L6;
            default: goto L4;
        };
    L4:
        r4.mo3777u(new C1572D1((GestureDetectorOnGestureListenerC1707f) this.f2247b, r4, (InterfaceC1895i0) this.f2248c));
        return;
    L6:
        r4.mo3777u(new C1692e((ActivityLifecycleIntegration) this.f2247b, r4, (InterfaceC1895i0) this.f2248c));
    }

    @Override // io.sentry.InterfaceC1940p1
    /* JADX INFO: renamed from: c */
    public void mo1425c(InterfaceC1895i0 r3) {
        switch(this.f2246a) {
            case 4: goto L12;
            case 5: goto L8;
            default: goto L4;
        };
    L4:
        GestureDetectorOnGestureListenerC1707f r0 = (GestureDetectorOnGestureListenerC1707f) this.f2247b;
        InterfaceC1645X r1 = (InterfaceC1645X) this.f2248c;
        if (r3 != r0.f6175e) goto L16;
        r1.mo3771o();
        return;
    L16:
        return;
    L8:
        InterfaceC1895i0 r02 = (InterfaceC1895i0) this.f2247b;
        InterfaceC1645X r12 = (InterfaceC1645X) this.f2248c;
        if (r3 != r02) goto L17;
        r12.mo3771o();
        return;
    L17:
        return;
    L12:
        C1573D2 r03 = (C1573D2) this.f2247b;
        InterfaceC1645X r13 = (InterfaceC1645X) this.f2248c;
        r03.getClass();
        if (r3 != r03) goto L18;
        r13.mo3771o();
        return;
    }

    @Override // io.sentry.InterfaceC2003t0
    /* JADX INFO: renamed from: d */
    public Object mo1426d() {
        C2065z0 r0 = (C2065z0) this.f2247b;
        C1559A0 r1 = (C1559A0) this.f2248c;
        r0.getClass();
        return Integer.valueOf(((C2049a) r1.f5581b).m4211u());
    L5:
        return Double.valueOf(((C2049a) r1.f5581b).m4210t());
    L8:
        return Long.valueOf(((C2049a) r1.f5581b).m4212v());
    }

    @Override // io.sentry.InterfaceC1931n1
    /* JADX INFO: renamed from: e */
    public void mo1427e(C1918l r5) {
        InterfaceC1645X r0 = (InterfaceC1645X) this.f2247b;
        C2046v2 r1 = (C2046v2) this.f2248c;
        C1832c r52 = (C1832c) r5.f6807d;
        if (r52.f6622e == false) goto L12;
        C1918l r2 = r0.mo3755E();
        C1970t r02 = r0.mo3754D();
        r52.m3996b("sentry-trace_id", ((C1970t) r2.f6805b).toString());
        r52.m3996b("sentry-public_key", r1.retrieveParsedDsn().f7295b);
        r52.m3996b("sentry-release", r1.getRelease());
        r52.m3996b("sentry-environment", r1.getEnvironment());
        if (C1970t.f7011b.equals(r02) == true) goto L7;
        r52.m3996b("sentry-replay_id", r02.toString());
    L7:
        r52.m3996b("sentry-transaction", null);
        if (r52.f6622e == false) goto L10;
        r52.f6620c = null;
    L10:
        r52.m3996b("sentry-sampled", null);
        r52.f6622e = false;
        return;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: f */
    public void m1428f(C2046v2 r23) {
        C1743q r0 = (C1743q) this.f2247b;
        Context r3 = (Context) this.f2248c;
        SentryAndroidOptions r4 = (SentryAndroidOptions) r23;
        boolean r2 = C1891i.m4094d(r4, "timber.log.Timber");
        if (C1891i.m4094d(r4, "androidx.fragment.app.FragmentManager$FragmentLifecycleCallbacks") == true) goto L5;
    L7:
        boolean r8 = false;
    L8:
        if (r2 == true) goto L10;
    L12:
        boolean r9 = false;
    L13:
        boolean r10 = C1891i.m4094d(r4, "io.sentry.android.replay.ReplayIntegration");
        C1666I r5 = new C1666I(r0);
        C1891i r22 = new C1891i();
        C0252Fu r11 = new C0252Fu(r4);
        Context r12 = r3.getApplicationContext();
        if (r12 != null) goto L17;
        r12 = r3;
    L17:
        r4.setLogger(r0);
        r4.setFatalLogger(new C1743q(2));
        r4.setDefaultScopeType(EnumC2027u1.CURRENT);
        r4.setOpenTelemetryMode(EnumC1882h2.OFF);
        r4.setDateProvider(new C1688c0());
        r4.setFlushTimeoutMillis(4000);
        r4.setFrameMetricsCollector(new C1727o(r12, r0, r5));
        r4.getLogger();     // Catch: Throwable -> L32
        if (Build.VERSION.SDK_INT < 33) goto L21;
        ApplicationInfo r14 = (ApplicationInfo) AbstractC1665H.f5971d.m97b(r12);     // Catch: Throwable -> L32
    L22:
        if (r14 == null) goto L24;
        Bundle r142 = r14.metaData;     // Catch: Throwable -> L32
    L25:
        ILogger r15 = r4.getLogger();     // Catch: Throwable -> L32
        if (r142 == null) goto L146;
        r4.setDebug(AbstractC1665H.m3827e(r142, r15, "io.sentry.debug", r4.isDebug()));     // Catch: Throwable -> L32
        if (r4.isDebug() == false) goto L36;
        String r7 = r4.getDiagnosticLevel().name();     // Catch: Throwable -> L32
        Locale r1 = Locale.ROOT;     // Catch: Throwable -> L32
        String r6 = AbstractC1665H.m3831i(r142, r15, "io.sentry.debug.level", r7.toLowerCase(r1));     // Catch: Throwable -> L32
        if (r6 == null) goto L36;
        r4.setDiagnosticLevel(EnumC1657a2.valueOf(r6.toUpperCase(r1)));     // Catch: Throwable -> L32
    L36:
        r4.setAnrEnabled(AbstractC1665H.m3827e(r142, r15, "io.sentry.anr.enable", r4.isAnrEnabled()));     // Catch: Throwable -> L32
        r4.setEnableAutoSessionTracking(AbstractC1665H.m3827e(r142, r15, "io.sentry.auto-session-tracking.enable", r4.isEnableAutoSessionTracking()));     // Catch: Throwable -> L32
        if (r4.getSampleRate() != null) goto L41;
        double r16 = AbstractC1665H.m3828f(r142, r15, "io.sentry.sample-rate");     // Catch: Throwable -> L32
        if (r16 == (-1.0d)) goto L41;
        r4.setSampleRate(Double.valueOf(r16));     // Catch: Throwable -> L32
    L41:
        r4.setAnrReportInDebug(AbstractC1665H.m3827e(r142, r15, "io.sentry.anr.report-debug", r4.isAnrReportInDebug()));     // Catch: Throwable -> L32
        r4.setAnrTimeoutIntervalMillis(AbstractC1665H.m3830h(r142, r15, "io.sentry.anr.timeout-interval-millis", r4.getAnrTimeoutIntervalMillis()));     // Catch: Throwable -> L32
        r4.setAttachAnrThreadDump(AbstractC1665H.m3827e(r142, r15, "io.sentry.anr.attach-thread-dumps", r4.isAttachAnrThreadDump()));     // Catch: Throwable -> L32
        String r13 = AbstractC1665H.m3831i(r142, r15, "io.sentry.dsn", r4.getDsn());     // Catch: Throwable -> L32
        boolean r62 = AbstractC1665H.m3827e(r142, r15, "io.sentry.enabled", r4.isEnabled());     // Catch: Throwable -> L32
        if (r62 == false) goto L46;
        if (r13 != null) goto L45;
    L47:
        if (r13 != null) goto L61;
        C1891i r18 = r22;
        Context r19 = r3;
        boolean r20 = r8;
        boolean r21 = r9;
        r4.getLogger().mo3680e(EnumC1657a2.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);     // Catch: Throwable -> L55
    L63:
        r4.setEnabled(r62);     // Catch: Throwable -> L55
        r4.setDsn(r13);     // Catch: Throwable -> L55
        r4.setEnableNdk(AbstractC1665H.m3827e(r142, r15, "io.sentry.ndk.enable", r4.isEnableNdk()));     // Catch: Throwable -> L55
        r4.setEnableScopeSync(AbstractC1665H.m3827e(r142, r15, "io.sentry.ndk.scope-sync.enable", r4.isEnableScopeSync()));     // Catch: Throwable -> L55
        r4.setRelease(AbstractC1665H.m3831i(r142, r15, "io.sentry.release", r4.getRelease()));     // Catch: Throwable -> L55
        r4.setEnvironment(AbstractC1665H.m3831i(r142, r15, "io.sentry.environment", r4.getEnvironment()));     // Catch: Throwable -> L55
        r4.setSessionTrackingIntervalMillis(AbstractC1665H.m3830h(r142, r15, "io.sentry.session-tracking.timeout-interval-millis", r4.getSessionTrackingIntervalMillis()));     // Catch: Throwable -> L55
        r4.setMaxBreadcrumbs((int) AbstractC1665H.m3830h(r142, r15, "io.sentry.max-breadcrumbs", r4.getMaxBreadcrumbs()));     // Catch: Throwable -> L55
        r4.setEnableActivityLifecycleBreadcrumbs(AbstractC1665H.m3827e(r142, r15, "io.sentry.breadcrumbs.activity-lifecycle", r4.isEnableActivityLifecycleBreadcrumbs()));     // Catch: Throwable -> L55
        r4.setEnableAppLifecycleBreadcrumbs(AbstractC1665H.m3827e(r142, r15, "io.sentry.breadcrumbs.app-lifecycle", r4.isEnableAppLifecycleBreadcrumbs()));     // Catch: Throwable -> L55
        r4.setEnableSystemEventBreadcrumbs(AbstractC1665H.m3827e(r142, r15, "io.sentry.breadcrumbs.system-events", r4.isEnableSystemEventBreadcrumbs()));     // Catch: Throwable -> L55
        r4.setEnableAppComponentBreadcrumbs(AbstractC1665H.m3827e(r142, r15, "io.sentry.breadcrumbs.app-components", r4.isEnableAppComponentBreadcrumbs()));     // Catch: Throwable -> L55
        r4.setEnableUserInteractionBreadcrumbs(AbstractC1665H.m3827e(r142, r15, "io.sentry.breadcrumbs.user-interaction", r4.isEnableUserInteractionBreadcrumbs()));     // Catch: Throwable -> L55
        r4.setEnableNetworkEventBreadcrumbs(AbstractC1665H.m3827e(r142, r15, "io.sentry.breadcrumbs.network-events", r4.isEnableNetworkEventBreadcrumbs()));     // Catch: Throwable -> L55
        r4.setEnableUncaughtExceptionHandler(AbstractC1665H.m3827e(r142, r15, "io.sentry.uncaught-exception-handler.enable", r4.isEnableUncaughtExceptionHandler()));     // Catch: Throwable -> L55
        r4.setAttachThreads(AbstractC1665H.m3827e(r142, r15, "io.sentry.attach-threads", r4.isAttachThreads()));     // Catch: Throwable -> L55
        r4.setAttachScreenshot(AbstractC1665H.m3827e(r142, r15, "io.sentry.attach-screenshot", r4.isAttachScreenshot()));     // Catch: Throwable -> L55
        r4.setAttachViewHierarchy(AbstractC1665H.m3827e(r142, r15, "io.sentry.attach-view-hierarchy", r4.isAttachViewHierarchy()));     // Catch: Throwable -> L55
        r4.setSendClientReports(AbstractC1665H.m3827e(r142, r15, "io.sentry.send-client-reports", r4.isSendClientReports()));     // Catch: Throwable -> L55
        if (AbstractC1665H.m3827e(r142, r15, "io.sentry.auto-init", true) == false) goto L66;
        r4.setInitPriority(EnumC1926m0.LOW);     // Catch: Throwable -> L55
    L66:
        r4.setForceInit(AbstractC1665H.m3827e(r142, r15, "io.sentry.force-init", r4.isForceInit()));     // Catch: Throwable -> L55
        r4.setCollectAdditionalContext(AbstractC1665H.m3827e(r142, r15, "io.sentry.additional-context", r4.isCollectAdditionalContext()));     // Catch: Throwable -> L55
        if (r4.getTracesSampleRate() != null) goto L71;
        double r17 = AbstractC1665H.m3828f(r142, r15, "io.sentry.traces.sample-rate");     // Catch: Throwable -> L55
        if (r17 == (-1.0d)) goto L71;
        r4.setTracesSampleRate(Double.valueOf(r17));     // Catch: Throwable -> L55
    L71:
        r4.setTraceSampling(AbstractC1665H.m3827e(r142, r15, "io.sentry.traces.trace-sampling", r4.isTraceSampling()));     // Catch: Throwable -> L55
        r4.setEnableAutoActivityLifecycleTracing(AbstractC1665H.m3827e(r142, r15, "io.sentry.traces.activity.enable", r4.isEnableAutoActivityLifecycleTracing()));     // Catch: Throwable -> L55
        r4.setEnableActivityLifecycleTracingAutoFinish(AbstractC1665H.m3827e(r142, r15, "io.sentry.traces.activity.auto-finish.enable", r4.isEnableActivityLifecycleTracingAutoFinish()));     // Catch: Throwable -> L55
        if (r4.getProfilesSampleRate() != null) goto L77;
        double r110 = AbstractC1665H.m3828f(r142, r15, "io.sentry.traces.profiling.sample-rate");     // Catch: Throwable -> L55
        if (r110 == (-1.0d)) goto L77;
        r4.setProfilesSampleRate(Double.valueOf(r110));     // Catch: Throwable -> L55
    L77:
        if (r4.getProfileSessionSampleRate() != null) goto L81;
        double r111 = AbstractC1665H.m3828f(r142, r15, "io.sentry.traces.profiling.session-sample-rate");     // Catch: Throwable -> L55
        if (r111 == (-1.0d)) goto L81;
        r4.setProfileSessionSampleRate(Double.valueOf(r111));     // Catch: Throwable -> L55
    L81:
        String r24 = r4.getProfileLifecycle().name();     // Catch: Throwable -> L55
        Locale r32 = Locale.ROOT;     // Catch: Throwable -> L55
        String r112 = AbstractC1665H.m3831i(r142, r15, "io.sentry.traces.profiling.lifecycle", r24.toLowerCase(r32));     // Catch: Throwable -> L55
        if (r112 == null) goto L84;
        r4.setProfileLifecycle(EnumC1877g1.valueOf(r112.toUpperCase(r32)));     // Catch: Throwable -> L55
    L84:
        r4.setStartProfilerOnAppStart(AbstractC1665H.m3827e(r142, r15, "io.sentry.traces.profiling.start-on-app-start", r4.isStartProfilerOnAppStart()));     // Catch: Throwable -> L55
        r4.setEnableUserInteractionTracing(AbstractC1665H.m3827e(r142, r15, "io.sentry.traces.user-interaction.enable", r4.isEnableUserInteractionTracing()));     // Catch: Throwable -> L55
        r4.setEnableTimeToFullDisplayTracing(AbstractC1665H.m3827e(r142, r15, "io.sentry.traces.time-to-full-display.enable", r4.isEnableTimeToFullDisplayTracing()));     // Catch: Throwable -> L55
        long r63 = AbstractC1665H.m3830h(r142, r15, "io.sentry.traces.idle-timeout", -1);     // Catch: Throwable -> L55
        if (r63 == (-1)) goto L87;
        r4.setIdleTimeout(Long.valueOf(r63));     // Catch: Throwable -> L55
    L87:
        List<String> r113 = AbstractC1665H.m3829g(r142, r15, "io.sentry.traces.trace-propagation-targets");     // Catch: Throwable -> L55
        if (r142.containsKey("io.sentry.traces.trace-propagation-targets") == false) goto L91;
        if (r113 != null) goto L91;
        r4.setTracePropagationTargets(Collections.EMPTY_LIST);     // Catch: Throwable -> L55
    L93:
        r4.setEnableFramesTracking(AbstractC1665H.m3827e(r142, r15, "io.sentry.traces.frames-tracking", true));     // Catch: Throwable -> L55
        r4.setProguardUuid(AbstractC1665H.m3831i(r142, r15, "io.sentry.proguard-uuid", r4.getProguardUuid()));     // Catch: Throwable -> L55
        C1968r r114 = r4.getSdkVersion();     // Catch: Throwable -> L55
        if (r114 != null) goto L96;
        r114 = new C1968r("", "");     // Catch: Throwable -> L55
    L96:
        String r02 = AbstractC1665H.m3832j(r142, r15, "io.sentry.sdk.name", r114.f6999a);     // Catch: Throwable -> L55
        AbstractC1856a.m4048D("name is required.", r02);     // Catch: Throwable -> L55
        r114.f6999a = r02;     // Catch: Throwable -> L55
        String r03 = AbstractC1665H.m3832j(r142, r15, "io.sentry.sdk.version", r114.f7000b);     // Catch: Throwable -> L55
        AbstractC1856a.m4048D("version is required.", r03);     // Catch: Throwable -> L55
        r114.f7000b = r03;     // Catch: Throwable -> L55
        r4.setSdkVersion(r114);     // Catch: Throwable -> L55
        r4.setSendDefaultPii(AbstractC1665H.m3827e(r142, r15, "io.sentry.send-default-pii", r4.isSendDefaultPii()));     // Catch: Throwable -> L55
        List r04 = AbstractC1665H.m3829g(r142, r15, "io.sentry.gradle-plugin-integrations");     // Catch: Throwable -> L55
        if (r04 == null) goto L102;
        Iterator r05 = r04.iterator();     // Catch: Throwable -> L55
    L100:
        if (r05.hasNext() == false) goto L102;
        C1650Y1.m3790d().m3791a((String) r05.next());     // Catch: Throwable -> L55
    L102:
        r4.setEnableRootCheck(AbstractC1665H.m3827e(r142, r15, "io.sentry.enable-root-check", r4.isEnableRootCheck()));     // Catch: Throwable -> L55
        r4.setSendModules(AbstractC1665H.m3827e(r142, r15, "io.sentry.send-modules", r4.isSendModules()));     // Catch: Throwable -> L55
        r4.setEnablePerformanceV2(AbstractC1665H.m3827e(r142, r15, "io.sentry.performance-v2.enable", r4.isEnablePerformanceV2()));     // Catch: Throwable -> L55
        r4.setEnableAppStartProfiling(AbstractC1665H.m3827e(r142, r15, "io.sentry.profiling.enable-app-start", r4.isEnableAppStartProfiling()));     // Catch: Throwable -> L55
        r4.setEnableScopePersistence(AbstractC1665H.m3827e(r142, r15, "io.sentry.enable-scope-persistence", r4.isEnableScopePersistence()));     // Catch: Throwable -> L55
        r4.setEnableAutoTraceIdGeneration(AbstractC1665H.m3827e(r142, r15, "io.sentry.traces.enable-auto-id-generation", r4.isEnableAutoTraceIdGeneration()));     // Catch: Throwable -> L55
        r4.setDeadlineTimeout(AbstractC1665H.m3830h(r142, r15, "io.sentry.traces.deadline-timeout", r4.getDeadlineTimeout()));     // Catch: Throwable -> L55
        if (r4.getSessionReplay().f7305a != null) goto L113;
        double r64 = AbstractC1665H.m3828f(r142, r15, "io.sentry.session-replay.session-sample-rate");     // Catch: Throwable -> L55
        if (r64 == (-1.0d)) goto L113;
        C2067z2 r06 = r4.getSessionReplay();     // Catch: Throwable -> L55
        Double r33 = Double.valueOf(r64);     // Catch: Throwable -> L55
        r06.getClass();     // Catch: Throwable -> L55
        if (AbstractC1856a.m4077y(r33, true) == false) goto L111;
        r06.f7305a = r33;     // Catch: Throwable -> L55
        goto L113
    L111:
        throw new IllegalArgumentException("The value " + r33 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");     // Catch: Throwable -> L55
    L113:
        if (r4.getSessionReplay().f7306b != null) goto L121;
        double r65 = AbstractC1665H.m3828f(r142, r15, "io.sentry.session-replay.on-error-sample-rate");     // Catch: Throwable -> L55
        if (r65 == (-1.0d)) goto L121;
        C2067z2 r07 = r4.getSessionReplay();     // Catch: Throwable -> L55
        Double r34 = Double.valueOf(r65);     // Catch: Throwable -> L55
        r07.getClass();     // Catch: Throwable -> L55
        if (AbstractC1856a.m4077y(r34, true) == false) goto L120;
        r07.f7306b = r34;     // Catch: Throwable -> L55
        goto L121
    L120:
        throw new IllegalArgumentException("The value " + r34 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");     // Catch: Throwable -> L55
    L121:
        C2067z2 r08 = r4.getSessionReplay();     // Catch: Throwable -> L55
        boolean r115 = AbstractC1665H.m3827e(r142, r15, "io.sentry.session-replay.mask-all-text", true);     // Catch: Throwable -> L55
        CopyOnWriteArraySet r25 = r08.f7308d;     // Catch: Throwable -> L55
        CopyOnWriteArraySet r09 = r08.f7307c;     // Catch: Throwable -> L55
        if (r115 == false) goto L124;
        r09.add("android.widget.TextView");     // Catch: Throwable -> L55
        r25.remove("android.widget.TextView");     // Catch: Throwable -> L55
    L125:
        C2067z2 r010 = r4.getSessionReplay();     // Catch: Throwable -> L55
        boolean r116 = AbstractC1665H.m3827e(r142, r15, "io.sentry.session-replay.mask-all-images", true);     // Catch: Throwable -> L55
        CopyOnWriteArraySet r26 = r010.f7308d;     // Catch: Throwable -> L55
        CopyOnWriteArraySet r011 = r010.f7307c;     // Catch: Throwable -> L55
        if (r116 == false) goto L128;
        r011.add("android.widget.ImageView");     // Catch: Throwable -> L55
        r26.remove("android.widget.ImageView");     // Catch: Throwable -> L55
    L129:
        r4.getSessionReplay().f7316l = AbstractC1665H.m3827e(r142, r15, "io.sentry.session-replay.debug", false);     // Catch: Throwable -> L55
        r4.setIgnoredErrors(AbstractC1665H.m3829g(r142, r15, "io.sentry.ignored-errors"));     // Catch: Throwable -> L55
        List r012 = AbstractC1665H.m3829g(r142, r15, "io.sentry.in-app-includes");     // Catch: Throwable -> L55
        if (r012 != null) goto L132;
    L137:
        List r013 = AbstractC1665H.m3829g(r142, r15, "io.sentry.in-app-excludes");     // Catch: Throwable -> L55
        if (r013 != null) goto L140;
    L145:
        r4.getLogs().f6831a = AbstractC1665H.m3827e(r142, r15, "io.sentry.logs.enabled", r4.getLogs().f6831a);     // Catch: Throwable -> L55
        C1641V1 r014 = r4.getFeedbackOptions();     // Catch: Throwable -> L55
        r014.f5882a = AbstractC1665H.m3827e(r142, r15, "io.sentry.feedback.is-name-required", r014.f5882a);     // Catch: Throwable -> L55
        r014.f5883b = AbstractC1665H.m3827e(r142, r15, "io.sentry.feedback.show-name", r014.f5883b);     // Catch: Throwable -> L55
        r014.f5884c = AbstractC1665H.m3827e(r142, r15, "io.sentry.feedback.is-email-required", r014.f5884c);     // Catch: Throwable -> L55
        r014.f5885d = AbstractC1665H.m3827e(r142, r15, "io.sentry.feedback.show-email", r014.f5885d);     // Catch: Throwable -> L55
        r014.f5886e = AbstractC1665H.m3827e(r142, r15, "io.sentry.feedback.use-sentry-user", r014.f5886e);     // Catch: Throwable -> L55
        r014.f5887f = AbstractC1665H.m3827e(r142, r15, "io.sentry.feedback.show-branding", r014.f5887f);     // Catch: Throwable -> L55
    L147:
        r4.getLogger().mo3680e(EnumC1657a2.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);     // Catch: Throwable -> L55
    L150:
        r4.setCacheDirPath(new File(r12.getCacheDir(), "sentry").getAbsolutePath());
        PackageInfo r015 = AbstractC1665H.m3825c(r12, r5);
        if (r015 == null) goto L161;
        if (r4.getRelease() != null) goto L155;
        r4.setRelease(r015.packageName + "@" + r015.versionName + "+" + Long.toString(r015.getLongVersionCode()));
    L155:
        String r016 = r015.packageName;
        if (r016 == null) goto L161;
        if (r016.startsWith("android.") == true) goto L161;
        r4.addInAppInclude(r016);
    L161:
        if (r4.getDistinctId() == null) goto L202;
    L166:
        C1662E r017 = C1662E.f5959e;
        if (r017.f5961b == null) goto L169;
    L168:
        C1891i r66 = r18;
        Context r35 = r19;
        boolean r82 = r20;
        boolean r92 = r21;
        AbstractC1731m.m3909b(r35, r4, r5, r66, r11, r82, r92, r10);
        C2029a r018 = AbstractC1686b0.f6090b;     // Catch: Throwable -> L175
    L177:
        C1740f r019 = C1740f.m3914b();
        if (r4.isEnablePerformanceV2() == false) goto L183;
        C1741g r117 = r019.f6308c;
        if (r117.f6322c != 0) goto L183;
        r117.m3920c(Process.getStartUptimeMillis());
    L183:
        if ((r35.getApplicationContext() instanceof Application) == false) goto L185;
        r019.m3917d((Application) r35.getApplicationContext());
    L185:
        C1741g r020 = r019.f6309d;
        if (r020.f6322c != 0) goto L188;
        r020.m3920c(AbstractC1686b0.f6089a);
    L188:
        AbstractC1731m.m3908a(r4, r35, r5, r66, r11);
        AbstractC1686b0.m3867a(r4, r82, r92);
        return;
    L175:
        th = move-exception;
        r4.getLogger().mo3683r(EnumC1657a2.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        goto L177
    L169:
        C1981r r118 = r017.f5960a.m4173a();
        r017.m3811i(r4.getLogger());     // Catch: Throwable -> L190
        r118.close();
    L190:
        th = move-exception;
        r118.close();     // Catch: Throwable -> L194
        throw th;
    L194:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L202:
        r4.setDistinctId(AbstractC1675S.m3851a(r12));     // Catch: RuntimeException -> L164
    L164:
        e = move-exception;
        r4.getLogger().mo3683r(EnumC1657a2.ERROR, "Could not generate distinct Id.", e);
        goto L166
    L140:
        if (r013.isEmpty() == true) goto L145;
        Iterator r021 = r013.iterator();     // Catch: Throwable -> L55
    L143:
        if (r021.hasNext() == false) goto L145;
        r4.addInAppExclude((String) r021.next());     // Catch: Throwable -> L55
        goto L143
    L132:
        if (r012.isEmpty() == true) goto L137;
        Iterator r022 = r012.iterator();     // Catch: Throwable -> L55
    L135:
        if (r022.hasNext() == false) goto L137;
        r4.addInAppInclude((String) r022.next());     // Catch: Throwable -> L55
        goto L135
    L128:
        r26.add("android.widget.ImageView");     // Catch: Throwable -> L55
        r011.remove("android.widget.ImageView");     // Catch: Throwable -> L55
        goto L129
    L124:
        r25.add("android.widget.TextView");     // Catch: Throwable -> L55
        r09.remove("android.widget.TextView");     // Catch: Throwable -> L55
    L91:
        if (r113 == null) goto L93;
        r4.setTracePropagationTargets(r113);     // Catch: Throwable -> L55
    L59:
        th = th;
    L34:
        r19 = r3;
        r20 = r8;
        r21 = r9;
    L149:
        r4.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to read configuration from android manifest metadata.", th);
        goto L150
    L61:
        r18 = r22;
        r19 = r3;
        r20 = r8;
        r21 = r9;
        goto L63
    L45:
        if (r13.isEmpty() == false) goto L47;
    L46:
        r18 = r22;
        r19 = r3;
        r20 = r8;
        r21 = r9;
        r4.getLogger().mo3680e(EnumC1657a2.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);     // Catch: Throwable -> L55
        goto L63
    L146:
        r18 = r22;
        r19 = r3;
        r20 = r8;
        r21 = r9;
    L55:
        th = th;
        goto L149
    L24:
        r142 = null;
        goto L25
    L21:
        r14 = (ApplicationInfo) AbstractC1665H.f5972e.m97b(r12);     // Catch: Throwable -> L32
    L32:
        th = th;
        r18 = r22;
        goto L34
    L10:
        if (C1891i.m4094d(r4, "io.sentry.android.timber.SentryTimberIntegration") == false) goto L12;
        r9 = true;
        goto L13
    L5:
        if (C1891i.m4094d(r4, "io.sentry.android.fragment.FragmentLifecycleIntegration") == false) goto L7;
        r8 = true;
        goto L8
    }

    @Override // p000.InterfaceC0566N6
    public void onCancel() {
        Animator r0 = (Animator) this.f2247b;
        C0557My r1 = (C0557My) this.f2248c;
        r0.end();
        if (AbstractC2805zi.m5374G(2) == false) goto L6;
        r1.toString();
        return;
    }

    public /* synthetic */ C0698Q9(C1743q r1, Context r2, C1676T r3) {
        this.f2246a = 8;
        this.f2247b = r1;
        this.f2248c = r2;
    }
}
