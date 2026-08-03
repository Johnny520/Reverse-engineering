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
    public static void m3908a(SentryAndroidOptions sentryAndroidOptions, Context context, C1666I c1666i, C1891i c1891i, C0252Fu c0252Fu) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C2014i)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new C1689a(sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getConnectionStatusProvider() instanceof C1595J0) {
            sentryAndroidOptions.setConnectionStatusProvider(new C1714b(context, c1666i, sentryAndroidOptions));
        }
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new C1841f(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new C1840e(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new C1934o(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C1667J(context, c1666i, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C1682Z(sentryAndroidOptions, c0252Fu));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c1666i));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C1747u(context, c1666i, sentryAndroidOptions));
        if (sentryAndroidOptions.getTransportGate() instanceof C2016k) {
            C1666I c1666i2 = new C1666I();
            c1666i2.f5974a = sentryAndroidOptions;
            sentryAndroidOptions.setTransportGate(c1666i2);
        }
        C1740f c1740fM3914b = C1740f.m3914b();
        C1981r c1981rM4173a = C1740f.f6305q.m4173a();
        try {
            InterfaceC1911j0 interfaceC1911j0 = c1740fM3914b.f6313h;
            InterfaceC1618P interfaceC1618P = c1740fM3914b.f6314i;
            c1740fM3914b.f6313h = null;
            c1740fM3914b.f6314i = null;
            c1981rM4173a.close();
            if (sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.getProfilesSampleRate() != null) {
                sentryAndroidOptions.setContinuousProfiler(C1599K0.f5772a);
                if (interfaceC1618P != null) {
                    interfaceC1618P.mo3690a(true);
                }
                if (interfaceC1911j0 != null) {
                    sentryAndroidOptions.setTransactionProfiler(interfaceC1911j0);
                } else {
                    C1727o frameMetricsCollector = sentryAndroidOptions.getFrameMetricsCollector();
                    AbstractC1856a.m4048D("options.getFrameMetricsCollector is required", frameMetricsCollector);
                    sentryAndroidOptions.setTransactionProfiler(new C1744r(context, c1666i, frameMetricsCollector, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
                }
            } else {
                sentryAndroidOptions.setTransactionProfiler(C1599K0.f5776e);
                if (interfaceC1911j0 != null) {
                    interfaceC1911j0.close();
                }
                if (interfaceC1618P != null) {
                    sentryAndroidOptions.setContinuousProfiler(interfaceC1618P);
                } else {
                    C1727o frameMetricsCollector2 = sentryAndroidOptions.getFrameMetricsCollector();
                    AbstractC1856a.m4048D("options.getFrameMetricsCollector is required", frameMetricsCollector2);
                    sentryAndroidOptions.setContinuousProfiler(new C1696g(c1666i, frameMetricsCollector2, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService()));
                }
            }
            if (sentryAndroidOptions.getModulesLoader() instanceof C1908e) {
                sentryAndroidOptions.setModulesLoader(new C1909f(context, sentryAndroidOptions.getLogger()));
            }
            if (sentryAndroidOptions.getDebugMetaLoader() instanceof C1900b) {
                sentryAndroidOptions.setDebugMetaLoader(new C1901c(context, sentryAndroidOptions.getLogger()));
            }
            if (sentryAndroidOptions.getVersionDetector() instanceof C1649Y0) {
                sentryAndroidOptions.setVersionDetector(new C2002t(sentryAndroidOptions, 0));
            }
            boolean zM4094d = C1891i.m4094d(sentryAndroidOptions, "androidx.core.view.ScrollingView");
            boolean zM4094d2 = C1891i.m4094d(sentryAndroidOptions, "androidx.compose.ui.node.Owner");
            if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(new C1702a(zM4094d));
                if (zM4094d2 && C1891i.m4094d(sentryAndroidOptions, "io.sentry.compose.gestures.ComposeGestureTargetLocator")) {
                    arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
                }
                sentryAndroidOptions.setGestureTargetLocators(arrayList);
            }
            if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zM4094d2 && C1891i.m4094d(sentryAndroidOptions, "io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter")) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
                sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
            }
            if (sentryAndroidOptions.getThreadChecker() instanceof C2041b) {
                sentryAndroidOptions.setThreadChecker(C1716d.f6223a);
            }
            if (sentryAndroidOptions.getSocketTagger() instanceof C1634T0) {
                sentryAndroidOptions.setSocketTagger(C1743q.f6325b);
            }
            if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
                sentryAndroidOptions.addPerformanceCollector(new C1729k());
                sentryAndroidOptions.addPerformanceCollector(new C1698h(sentryAndroidOptions.getLogger()));
                if (sentryAndroidOptions.isEnablePerformanceV2()) {
                    C1727o frameMetricsCollector3 = sentryAndroidOptions.getFrameMetricsCollector();
                    AbstractC1856a.m4048D("options.getFrameMetricsCollector is required", frameMetricsCollector3);
                    sentryAndroidOptions.addPerformanceCollector(new C1695f0(sentryAndroidOptions, frameMetricsCollector3));
                }
            }
            if (sentryAndroidOptions.getCompositePerformanceCollector() instanceof C1591I0) {
                sentryAndroidOptions.setCompositePerformanceCollector(new C1977q(sentryAndroidOptions));
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3909b(Context context, SentryAndroidOptions sentryAndroidOptions, C1666I c1666i, C1891i c1891i, C0252Fu c0252Fu, boolean z, boolean z2, boolean z3) {
        C2032d c2032d = new C2032d(new C1730l(sentryAndroidOptions));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C2058x1(new C1730l(sentryAndroidOptions), 0), c2032d));
        sentryAndroidOptions.addIntegration(new NdkIntegration(C1891i.m4096h("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger())));
        sentryAndroidOptions.addIntegration(new EnvelopeFileObserverIntegration.OutboxEnvelopeFileObserverIntegration(0));
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C2058x1(new C1730l(sentryAndroidOptions), 1), c2032d));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(Build.VERSION.SDK_INT >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, c1666i, c0252Fu));
            sentryAndroidOptions.addIntegration(new ActivityBreadcrumbsIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, c1891i));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, c1666i));
        if (z3) {
            ReplayIntegration replayIntegration = new ReplayIntegration(context);
            replayIntegration.f6394m = new C1761b();
            sentryAndroidOptions.addIntegration(replayIntegration);
            sentryAndroidOptions.setReplayController(replayIntegration);
        }
        sentryAndroidOptions.getFeedbackOptions().getClass();
    }
}
