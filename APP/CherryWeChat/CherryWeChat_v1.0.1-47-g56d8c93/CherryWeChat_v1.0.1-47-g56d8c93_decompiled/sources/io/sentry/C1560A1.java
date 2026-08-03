package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.AbstractC2036h;
import java.util.concurrent.ConcurrentHashMap;
import p000.C2648vx;

/* JADX INFO: renamed from: io.sentry.A1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1560A1 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public boolean f5582a;

    /* JADX INFO: renamed from: b */
    public Double f5583b;

    /* JADX INFO: renamed from: c */
    public boolean f5584c;

    /* JADX INFO: renamed from: d */
    public Double f5585d;

    /* JADX INFO: renamed from: e */
    public String f5586e;

    /* JADX INFO: renamed from: f */
    public boolean f5587f;

    /* JADX INFO: renamed from: g */
    public boolean f5588g;

    /* JADX INFO: renamed from: h */
    public int f5589h;

    /* JADX INFO: renamed from: i */
    public boolean f5590i;

    /* JADX INFO: renamed from: j */
    public boolean f5591j;

    /* JADX INFO: renamed from: k */
    public boolean f5592k;

    /* JADX INFO: renamed from: l */
    public EnumC1877g1 f5593l;

    /* JADX INFO: renamed from: m */
    public ConcurrentHashMap f5594m;

    public C1560A1(C2046v2 c2046v2, C2648vx c2648vx) {
        this.f5584c = ((Boolean) c2648vx.f9162a).booleanValue();
        this.f5585d = (Double) c2648vx.f9163b;
        this.f5582a = ((Boolean) c2648vx.f9165d).booleanValue();
        this.f5583b = (Double) c2648vx.f9166e;
        C1617O2 internalTracesSampler = c2046v2.getInternalTracesSampler();
        double dM4179c = AbstractC2036h.m4180a().m4179c();
        Double profileSessionSampleRate = internalTracesSampler.f5819a.getProfileSessionSampleRate();
        this.f5590i = profileSessionSampleRate != null && profileSessionSampleRate.doubleValue() >= dM4179c;
        this.f5586e = c2046v2.getProfilingTracesDirPath();
        this.f5587f = c2046v2.isProfilingEnabled();
        this.f5588g = c2046v2.isContinuousProfilingEnabled();
        this.f5593l = c2046v2.getProfileLifecycle();
        this.f5589h = c2046v2.getProfilingTracesHz();
        this.f5591j = c2046v2.isEnableAppStartProfiling();
        this.f5592k = c2046v2.isStartProfilerOnAppStart();
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        C1901c c1901c = (C1901c) interfaceC1652Z0;
        c1901c.m4101h();
        c1901c.m4106p("profile_sampled");
        c1901c.m4112w(iLogger, Boolean.valueOf(this.f5582a));
        c1901c.m4106p("profile_sample_rate");
        c1901c.m4112w(iLogger, this.f5583b);
        c1901c.m4106p("continuous_profile_sampled");
        c1901c.m4112w(iLogger, Boolean.valueOf(this.f5590i));
        c1901c.m4106p("trace_sampled");
        c1901c.m4112w(iLogger, Boolean.valueOf(this.f5584c));
        c1901c.m4106p("trace_sample_rate");
        c1901c.m4112w(iLogger, this.f5585d);
        c1901c.m4106p("profiling_traces_dir_path");
        c1901c.m4112w(iLogger, this.f5586e);
        c1901c.m4106p("is_profiling_enabled");
        c1901c.m4112w(iLogger, Boolean.valueOf(this.f5587f));
        c1901c.m4106p("is_continuous_profiling_enabled");
        c1901c.m4112w(iLogger, Boolean.valueOf(this.f5588g));
        c1901c.m4106p("profile_lifecycle");
        c1901c.m4112w(iLogger, this.f5593l.name());
        c1901c.m4106p("profiling_traces_hz");
        c1901c.m4112w(iLogger, Integer.valueOf(this.f5589h));
        c1901c.m4106p("is_enable_app_start_profiling");
        c1901c.m4112w(iLogger, Boolean.valueOf(this.f5591j));
        c1901c.m4106p("is_start_profiler_on_app_start");
        c1901c.m4112w(iLogger, Boolean.valueOf(this.f5592k));
        ConcurrentHashMap concurrentHashMap = this.f5594m;
        if (concurrentHashMap != null) {
            for (String str : concurrentHashMap.keySet()) {
                AbstractC1861d.m4087b(this.f5594m, str, c1901c, str, iLogger);
            }
        }
        c1901c.m4102k();
    }
}
