package io.sentry.android.core;

import io.sentry.C1650Y1;
import io.sentry.C2046v2;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.protocol.C1968r;

/* JADX INFO: loaded from: classes.dex */
public final class SentryAndroidOptions extends C2046v2 {
    private boolean anrEnabled;
    private boolean anrReportInDebug;
    private long anrTimeoutIntervalMillis;
    private boolean attachAnrThreadDump;
    private boolean attachScreenshot;
    private boolean attachViewHierarchy;
    private InterfaceC1691d0 beforeScreenshotCaptureCallback;
    private InterfaceC1691d0 beforeViewHierarchyCaptureCallback;
    private boolean collectAdditionalContext;
    private InterfaceC1674Q debugImagesLoader;
    private boolean enableActivityLifecycleBreadcrumbs;
    private boolean enableActivityLifecycleTracingAutoFinish;
    private boolean enableAppComponentBreadcrumbs;
    private boolean enableAppLifecycleBreadcrumbs;
    private boolean enableAutoActivityLifecycleTracing;
    private boolean enableAutoTraceIdGeneration;
    private boolean enableFramesTracking;
    private boolean enableNdk;
    private boolean enableNetworkEventBreadcrumbs;
    private boolean enablePerformanceV2;
    private boolean enableRootCheck;
    private boolean enableScopeSync;
    private boolean enableSystemEventBreadcrumbs;
    private boolean enableSystemEventBreadcrumbsExtras;
    private C1727o frameMetricsCollector;
    private String nativeSdkName;
    private EnumC1679W ndkHandlerStrategy;
    private boolean reportHistoricalAnrs;
    private final long startupCrashDurationThresholdMillis;
    private long startupCrashFlushTimeoutMillis;

    public SentryAndroidOptions() {
        super(false);
        this.anrEnabled = true;
        this.anrTimeoutIntervalMillis = 5000;
        this.anrReportInDebug = false;
        this.enableActivityLifecycleBreadcrumbs = true;
        this.enableAppLifecycleBreadcrumbs = true;
        this.enableSystemEventBreadcrumbs = true;
        this.enableAppComponentBreadcrumbs = true;
        this.enableNetworkEventBreadcrumbs = true;
        this.enableAutoActivityLifecycleTracing = true;
        this.enableActivityLifecycleTracingAutoFinish = true;
        this.debugImagesLoader = C1743q.f6326c;
        this.collectAdditionalContext = true;
        this.startupCrashFlushTimeoutMillis = 5000;
        this.startupCrashDurationThresholdMillis = 2000;
        this.enableFramesTracking = true;
        this.nativeSdkName = null;
        this.enableRootCheck = true;
        this.enableNdk = true;
        this.ndkHandlerStrategy = EnumC1679W.SENTRY_HANDLER_STRATEGY_DEFAULT;
        this.enableScopeSync = true;
        this.enableAutoTraceIdGeneration = true;
        this.enableSystemEventBreadcrumbsExtras = false;
        this.reportHistoricalAnrs = false;
        this.attachAnrThreadDump = false;
        this.enablePerformanceV2 = true;
        setSentryClientName("sentry.java.android/8.21.1");
        setSdkVersion(createSdkVersion());
        setAttachServerName(false);
    }

    private C1968r createSdkVersion() {
        C1968r r0 = getSdkVersion();
        if (r0 != null) goto L5;
        r0 = new C1968r("sentry.java.android", "8.21.1");
    L6:
        C1650Y1.m3790d().m3792b("maven:io.sentry:sentry-android-core", "8.21.1");
        return r0;
    L5:
        r0.f6999a = "sentry.java.android";
        r0.f7000b = "8.21.1";
        goto L6
    }

    public void enableAllAutoBreadcrumbs(boolean r1) {
        this.enableActivityLifecycleBreadcrumbs = r1;
        this.enableAppComponentBreadcrumbs = r1;
        this.enableSystemEventBreadcrumbs = r1;
        this.enableAppLifecycleBreadcrumbs = r1;
        this.enableNetworkEventBreadcrumbs = r1;
        setEnableUserInteractionBreadcrumbs(r1);
    }

    public long getAnrTimeoutIntervalMillis() {
        return this.anrTimeoutIntervalMillis;
    }

    public InterfaceC1691d0 getBeforeScreenshotCaptureCallback() {
        return null;
    }

    public InterfaceC1691d0 getBeforeViewHierarchyCaptureCallback() {
        return null;
    }

    public InterfaceC1674Q getDebugImagesLoader() {
        return this.debugImagesLoader;
    }

    public C1727o getFrameMetricsCollector() {
        return this.frameMetricsCollector;
    }

    public String getNativeSdkName() {
        return this.nativeSdkName;
    }

    public int getNdkHandlerStrategy() {
        return this.ndkHandlerStrategy.getValue();
    }

    public long getStartupCrashDurationThresholdMillis() {
        return 2000;
    }

    public long getStartupCrashFlushTimeoutMillis() {
        return this.startupCrashFlushTimeoutMillis;
    }

    public boolean isAnrEnabled() {
        return this.anrEnabled;
    }

    public boolean isAnrReportInDebug() {
        return this.anrReportInDebug;
    }

    public boolean isAttachAnrThreadDump() {
        return this.attachAnrThreadDump;
    }

    public boolean isAttachScreenshot() {
        return this.attachScreenshot;
    }

    public boolean isAttachViewHierarchy() {
        return this.attachViewHierarchy;
    }

    public boolean isCollectAdditionalContext() {
        return this.collectAdditionalContext;
    }

    public boolean isEnableActivityLifecycleBreadcrumbs() {
        return this.enableActivityLifecycleBreadcrumbs;
    }

    public boolean isEnableActivityLifecycleTracingAutoFinish() {
        return this.enableActivityLifecycleTracingAutoFinish;
    }

    public boolean isEnableAppComponentBreadcrumbs() {
        return this.enableAppComponentBreadcrumbs;
    }

    public boolean isEnableAppLifecycleBreadcrumbs() {
        return this.enableAppLifecycleBreadcrumbs;
    }

    public boolean isEnableAutoActivityLifecycleTracing() {
        return this.enableAutoActivityLifecycleTracing;
    }

    public boolean isEnableAutoTraceIdGeneration() {
        return this.enableAutoTraceIdGeneration;
    }

    public boolean isEnableFramesTracking() {
        return this.enableFramesTracking;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnableNetworkEventBreadcrumbs() {
        return this.enableNetworkEventBreadcrumbs;
    }

    public boolean isEnablePerformanceV2() {
        return this.enablePerformanceV2;
    }

    public boolean isEnableRootCheck() {
        return this.enableRootCheck;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableSystemEventBreadcrumbs() {
        return this.enableSystemEventBreadcrumbs;
    }

    public boolean isEnableSystemEventBreadcrumbsExtras() {
        return this.enableSystemEventBreadcrumbsExtras;
    }

    public boolean isReportHistoricalAnrs() {
        return this.reportHistoricalAnrs;
    }

    public void setAnrEnabled(boolean r1) {
        this.anrEnabled = r1;
    }

    public void setAnrReportInDebug(boolean r1) {
        this.anrReportInDebug = r1;
    }

    public void setAnrTimeoutIntervalMillis(long r1) {
        this.anrTimeoutIntervalMillis = r1;
    }

    public void setAttachAnrThreadDump(boolean r1) {
        this.attachAnrThreadDump = r1;
    }

    public void setAttachScreenshot(boolean r1) {
        this.attachScreenshot = r1;
    }

    public void setAttachViewHierarchy(boolean r1) {
        this.attachViewHierarchy = r1;
    }

    public void setBeforeScreenshotCaptureCallback(InterfaceC1691d0 r1) {
    }

    public void setBeforeViewHierarchyCaptureCallback(InterfaceC1691d0 r1) {
    }

    public void setCollectAdditionalContext(boolean r1) {
        this.collectAdditionalContext = r1;
    }

    public void setDebugImagesLoader(InterfaceC1674Q r1) {
        if (r1 != null) goto L5;
        r1 = C1743q.f6326c;
    L5:
        this.debugImagesLoader = r1;
    }

    public void setEnableActivityLifecycleBreadcrumbs(boolean r1) {
        this.enableActivityLifecycleBreadcrumbs = r1;
    }

    public void setEnableActivityLifecycleTracingAutoFinish(boolean r1) {
        this.enableActivityLifecycleTracingAutoFinish = r1;
    }

    public void setEnableAppComponentBreadcrumbs(boolean r1) {
        this.enableAppComponentBreadcrumbs = r1;
    }

    public void setEnableAppLifecycleBreadcrumbs(boolean r1) {
        this.enableAppLifecycleBreadcrumbs = r1;
    }

    public void setEnableAutoActivityLifecycleTracing(boolean r1) {
        this.enableAutoActivityLifecycleTracing = r1;
    }

    public void setEnableAutoTraceIdGeneration(boolean r1) {
        this.enableAutoTraceIdGeneration = r1;
    }

    public void setEnableFramesTracking(boolean r1) {
        this.enableFramesTracking = r1;
    }

    public void setEnableNdk(boolean r1) {
        this.enableNdk = r1;
    }

    public void setEnableNetworkEventBreadcrumbs(boolean r1) {
        this.enableNetworkEventBreadcrumbs = r1;
    }

    public void setEnablePerformanceV2(boolean r1) {
        this.enablePerformanceV2 = r1;
    }

    public void setEnableRootCheck(boolean r1) {
        this.enableRootCheck = r1;
    }

    public void setEnableScopeSync(boolean r1) {
        this.enableScopeSync = r1;
    }

    public void setEnableSystemEventBreadcrumbs(boolean r1) {
        this.enableSystemEventBreadcrumbs = r1;
    }

    public void setEnableSystemEventBreadcrumbsExtras(boolean r1) {
        this.enableSystemEventBreadcrumbsExtras = r1;
    }

    public void setFrameMetricsCollector(C1727o r1) {
        this.frameMetricsCollector = r1;
    }

    public void setNativeHandlerStrategy(EnumC1679W r1) {
        this.ndkHandlerStrategy = r1;
    }

    public void setNativeSdkName(String r1) {
        this.nativeSdkName = r1;
    }

    public void setReportHistoricalAnrs(boolean r1) {
        this.reportHistoricalAnrs = r1;
    }

    public void setStartupCrashFlushTimeoutMillis(long r1) {
        this.startupCrashFlushTimeoutMillis = r1;
    }
}
