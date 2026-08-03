package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import io.sentry.C1591I0;
import io.sentry.C1595J0;
import io.sentry.C1599K0;
import io.sentry.C1634T0;
import io.sentry.C1649Y0;
import io.sentry.C1934o;
import io.sentry.C1977q;
import io.sentry.C1981r;
import io.sentry.C2002t;
import io.sentry.C2058x1;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1618P;
import io.sentry.InterfaceC1911j0;
import io.sentry.InterfaceC1935o0;
import io.sentry.android.core.EnvelopeFileObserverIntegration;
import io.sentry.android.core.cache.C1689a;
import io.sentry.android.core.internal.gestures.C1702a;
import io.sentry.android.core.internal.util.C1714b;
import io.sentry.android.core.internal.util.C1716d;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.android.core.performance.C1740f;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.replay.C1761b;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.cache.C1840e;
import io.sentry.cache.C1841f;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.C1891i;
import io.sentry.internal.debugmeta.C1900b;
import io.sentry.internal.debugmeta.C1901c;
import io.sentry.internal.modules.C1908e;
import io.sentry.internal.modules.C1909f;
import io.sentry.transport.C2014i;
import io.sentry.transport.C2016k;
import io.sentry.util.C2032d;
import io.sentry.util.thread.C2041b;
import java.util.ArrayList;
import p000.C0252Fu;

/* JADX INFO: renamed from: io.sentry.android.core.m */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1731m {
    /* JADX INFO: renamed from: a */
    public static void m3908a(SentryAndroidOptions r12, Context r13, C1666I r14, C1891i r15, C0252Fu r16) {
        if (r12.getCacheDirPath() == null) goto L8;
        if ((r12.getEnvelopeDiskCache() instanceof C2014i) == false) goto L8;
        r12.setEnvelopeDiskCache(new C1689a(r12));
    L8:
        if ((r12.getConnectionStatusProvider() instanceof C1595J0) == false) goto L11;
        r12.setConnectionStatusProvider(new C1714b(r13, r14, r12));
    L11:
        if (r12.getCacheDirPath() == null) goto L13;
        r12.addScopeObserver(new C1841f(r12));
        r12.addOptionsObserver(new C1840e(r12));
    L13:
        r12.addEventProcessor(new C1934o(r12));
        r12.addEventProcessor(new C1667J(r13, r14, r12));
        r12.addEventProcessor(new C1682Z(r12, r16));
        r12.addEventProcessor(new ScreenshotEventProcessor(r12, r14));
        r12.addEventProcessor(new ViewHierarchyEventProcessor(r12));
        r12.addEventProcessor(new C1747u(r13, r14, r12));
        if ((r12.getTransportGate() instanceof C2016k) == false) goto L16;
        C1666I r1 = new C1666I();
        r1.f5974a = r12;
        r12.setTransportGate(r1);
    L16:
        C1740f r17 = C1740f.m3914b();
        C1981r r4 = C1740f.f6305q.m4173a();
        InterfaceC1911j0 r5 = r17.f6313h;     // Catch: Throwable -> L73
        InterfaceC1618P r6 = r17.f6314i;     // Catch: Throwable -> L73
        r17.f6313h = null;     // Catch: Throwable -> L73
        r17.f6314i = null;     // Catch: Throwable -> L73
        r4.close();
        if (r12.isProfilingEnabled() == false) goto L21;
    L29:
        r12.setContinuousProfiler(C1599K0.f5772a);
        if (r6 == null) goto L32;
        r6.mo3690a(true);
    L32:
        if (r5 == null) goto L34;
        r12.setTransactionProfiler(r5);
    L36:
        if ((r12.getModulesLoader() instanceof C1908e) == false) goto L39;
        r12.setModulesLoader(new C1909f(r13, r12.getLogger()));
    L39:
        if ((r12.getDebugMetaLoader() instanceof C1900b) == false) goto L42;
        r12.setDebugMetaLoader(new C1901c(r13, r12.getLogger()));
    L42:
        if ((r12.getVersionDetector() instanceof C1649Y0) == false) goto L44;
        r12.setVersionDetector(new C2002t(r12, 0));
    L44:
        boolean r18 = C1891i.m4094d(r12, "androidx.core.view.ScrollingView");
        boolean r2 = C1891i.m4094d(r12, "androidx.compose.ui.node.Owner");
        if (r12.getGestureTargetLocators().isEmpty() == false) goto L53;
        ArrayList r3 = new ArrayList(2);
        r3.add(new C1702a(r18));
        if (r2 == true) goto L49;
    L51:
        r12.setGestureTargetLocators(r3);
        goto L53
    L49:
        if (C1891i.m4094d(r12, "io.sentry.compose.gestures.ComposeGestureTargetLocator") == false) goto L51;
        r3.add(new ComposeGestureTargetLocator(r12.getLogger()));
    L53:
        if (r12.getViewHierarchyExporters().isEmpty() == false) goto L59;
        if (r2 == false) goto L59;
        if (C1891i.m4094d(r12, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter") == false) goto L59;
        ArrayList r19 = new ArrayList(1);
        r19.add(new ComposeViewHierarchyExporter(r12.getLogger()));
        r12.setViewHierarchyExporters(r19);
    L59:
        if ((r12.getThreadChecker() instanceof C2041b) == false) goto L62;
        r12.setThreadChecker(C1716d.f6223a);
    L62:
        if ((r12.getSocketTagger() instanceof C1634T0) == false) goto L65;
        r12.setSocketTagger(C1743q.f6325b);
    L65:
        if (r12.getPerformanceCollectors().isEmpty() == false) goto L70;
        r12.addPerformanceCollector(new C1729k());
        r12.addPerformanceCollector(new C1698h(r12.getLogger()));
        if (r12.isEnablePerformanceV2() == false) goto L70;
        C1727o r22 = r12.getFrameMetricsCollector();
        AbstractC1856a.m4048D("options.getFrameMetricsCollector is required", r22);
        r12.addPerformanceCollector(new C1695f0(r12, r22));
    L70:
        if ((r12.getCompositePerformanceCollector() instanceof C1591I0) == false) goto L84;
        r12.setCompositePerformanceCollector(new C1977q(r12));
        return;
    L84:
        return;
    L34:
        C1727o r42 = r12.getFrameMetricsCollector();
        AbstractC1856a.m4048D("options.getFrameMetricsCollector is required", r42);
        r12.setTransactionProfiler(new C1744r(r13, r14, r42, r12.getLogger(), r12.getProfilingTracesDirPath(), r12.isProfilingEnabled(), r12.getProfilingTracesHz(), r12.getExecutorService()));
        goto L36
    L21:
        if (r12.getProfilesSampleRate() != null) goto L29;
        r12.setTransactionProfiler(C1599K0.f5776e);
        if (r5 == null) goto L26;
        r5.close();
    L26:
        if (r6 == null) goto L28;
        r12.setContinuousProfiler(r6);
        goto L36
    L28:
        C1727o r52 = r12.getFrameMetricsCollector();
        AbstractC1856a.m4048D("options.getFrameMetricsCollector is required", r52);
        r12.setContinuousProfiler(new C1696g(r14, r52, r12.getLogger(), r12.getProfilingTracesDirPath(), r12.getProfilingTracesHz(), r12.getExecutorService()));
    L73:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L77
        throw th;
    L77:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public static void m3909b(Context r6, SentryAndroidOptions r7, C1666I r8, C1891i r9, C0252Fu r10, boolean r11, boolean r12, boolean r13) {
        C2032d r0 = new C2032d(new C1730l(r7));
        r7.addIntegration(new SendCachedEnvelopeIntegration(new C2058x1(new C1730l(r7), 0), r0));
        r7.addIntegration(new NdkIntegration(C1891i.m4096h("io.sentry.android.ndk.SentryNdk", r7.getLogger())));
        r7.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration(0));
        r7.addIntegration(new SendCachedEnvelopeIntegration(new C2058x1(new C1730l(r7), 1), r0));
        r7.addIntegration(new AppLifecycleIntegration());
        if (Build.VERSION.SDK_INT < 30) goto L5;
        InterfaceC1935o0 r02 = new AnrV2Integration(r6);
    L6:
        r7.addIntegration(r02);
        if ((r6 instanceof Application) == false) goto L11;
        Application r1 = (Application) r6;
        r7.addIntegration(new ActivityLifecycleIntegration(r1, r8, r10));
        r7.addIntegration(new ActivityBreadcrumbsIntegration(r1));
        r7.addIntegration(new UserInteractionIntegration(r1, r9));
        if (r11 == false) goto L12;
        r7.addIntegration(new FragmentLifecycleIntegration(r1, true, true));
    L12:
        if (r12 == false) goto L14;
        r7.addIntegration(new SentryTimberIntegration());
    L14:
        r7.addIntegration(new AppComponentsBreadcrumbsIntegration(r6));
        r7.addIntegration(new SystemEventsBreadcrumbsIntegration(r6));
        r7.addIntegration(new NetworkBreadcrumbsIntegration(r6, r8));
        if (r13 == false) goto L17;
        ReplayIntegration r82 = new ReplayIntegration(r6);
        r82.f6394m = new C1761b();
        r7.addIntegration(r82);
        r7.setReplayController(r82);
    L17:
        r7.getFeedbackOptions().getClass();
        return;
    L11:
        r7.getLogger().mo3680e(EnumC1657a2.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        goto L12
    L5:
        r02 = new AnrIntegration(r6);
        goto L6
    }
}
