package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import io.sentry.util.AbstractC2036h;
import java.util.Iterator;
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

    public C1560A1(C2046v2 r5, C2648vx r6) {
        this.f5584c = ((Boolean) r6.f9162a).booleanValue();
        this.f5585d = (Double) r6.f9163b;
        this.f5582a = ((Boolean) r6.f9165d).booleanValue();
        this.f5583b = (Double) r6.f9166e;
        C1617O2 r62 = r5.getInternalTracesSampler();
        double r0 = AbstractC2036h.m4180a().m4179c();
        Double r63 = r62.f5819a.getProfileSessionSampleRate();
        if (r63 != null) goto L5;
    L7:
        boolean r64 = false;
    L8:
        this.f5590i = r64;
        this.f5586e = r5.getProfilingTracesDirPath();
        this.f5587f = r5.isProfilingEnabled();
        this.f5588g = r5.isContinuousProfilingEnabled();
        this.f5593l = r5.getProfileLifecycle();
        this.f5589h = r5.getProfilingTracesHz();
        this.f5591j = r5.isEnableAppStartProfiling();
        this.f5592k = r5.isStartProfilerOnAppStart();
        return;
    L5:
        if (r63.doubleValue() < r0) goto L7;
        r64 = true;
        goto L8
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 r4, ILogger r5) {
        C1901c r42 = (C1901c) r4;
        r42.m4101h();
        r42.m4106p("profile_sampled");
        r42.m4112w(r5, Boolean.valueOf(this.f5582a));
        r42.m4106p("profile_sample_rate");
        r42.m4112w(r5, this.f5583b);
        r42.m4106p("continuous_profile_sampled");
        r42.m4112w(r5, Boolean.valueOf(this.f5590i));
        r42.m4106p("trace_sampled");
        r42.m4112w(r5, Boolean.valueOf(this.f5584c));
        r42.m4106p("trace_sample_rate");
        r42.m4112w(r5, this.f5585d);
        r42.m4106p("profiling_traces_dir_path");
        r42.m4112w(r5, this.f5586e);
        r42.m4106p("is_profiling_enabled");
        r42.m4112w(r5, Boolean.valueOf(this.f5587f));
        r42.m4106p("is_continuous_profiling_enabled");
        r42.m4112w(r5, Boolean.valueOf(this.f5588g));
        r42.m4106p("profile_lifecycle");
        r42.m4112w(r5, this.f5593l.name());
        r42.m4106p("profiling_traces_hz");
        r42.m4112w(r5, Integer.valueOf(this.f5589h));
        r42.m4106p("is_enable_app_start_profiling");
        r42.m4112w(r5, Boolean.valueOf(this.f5591j));
        r42.m4106p("is_start_profiler_on_app_start");
        r42.m4112w(r5, Boolean.valueOf(this.f5592k));
        ConcurrentHashMap r0 = this.f5594m;
        if (r0 == null) goto L8;
        Iterator r02 = r0.keySet().iterator();
    L6:
        if (r02.hasNext() == false) goto L8;
        String r1 = (String) r02.next();
        AbstractC1861d.m4087b(this.f5594m, r1, r42, r1, r5);
    L8:
        r42.m4102k();
    }
}
