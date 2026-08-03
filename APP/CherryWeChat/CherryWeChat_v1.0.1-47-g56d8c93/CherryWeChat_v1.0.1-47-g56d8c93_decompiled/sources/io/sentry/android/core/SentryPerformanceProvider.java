package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import io.sentry.C1560A1;
import io.sentry.C1571D0;
import io.sentry.C1617O2;
import io.sentry.C1638U1;
import io.sentry.C1981r;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.android.core.performance.C1740f;
import io.sentry.util.C2029a;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import p000.C2648vx;

/* JADX INFO: loaded from: classes.dex */
public final class SentryPerformanceProvider extends AbstractC1671N {

    /* JADX INFO: renamed from: e */
    public static final long f6022e = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b */
    public Application f6023b;

    /* JADX INFO: renamed from: c */
    public final C1743q f6024c;

    /* JADX INFO: renamed from: d */
    public final C1666I f6025d;

    public SentryPerformanceProvider() {
        new C2029a();
        C1743q c1743q = new C1743q(3);
        this.f6024c = c1743q;
        this.f6025d = new C1666I(c1743q);
    }

    /* JADX INFO: renamed from: a */
    public final void m3853a(Context context, C1560A1 c1560a1, C1740f c1740f) {
        boolean z = c1560a1.f5590i;
        C1743q c1743q = this.f6024c;
        if (!z) {
            c1743q.mo3680e(EnumC1657a2.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        C1696g c1696g = new C1696g(this.f6025d, new C1727o(context.getApplicationContext(), c1743q, this.f6025d), c1743q, c1560a1.f5586e, c1560a1.f5589h, new C1638U1());
        c1740f.f6313h = null;
        c1740f.f6314i = c1696g;
        c1743q.mo3680e(EnumC1657a2.DEBUG, "App start continuous profiling started.", new Object[0]);
        C2046v2 c2046v2Empty = C2046v2.empty();
        c2046v2Empty.setProfileSessionSampleRate(Double.valueOf(c1560a1.f5590i ? 1.0d : 0.0d));
        c1696g.mo3696h(c1560a1.f5593l, new C1617O2(c2046v2Empty));
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryPerformanceProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    /* JADX INFO: renamed from: b */
    public final void m3854b(Context context, C1560A1 c1560a1, C1740f c1740f) {
        boolean z = c1560a1.f5584c;
        C2648vx c2648vx = new C2648vx(Boolean.valueOf(z), c1560a1.f5585d, (Double) null, Boolean.valueOf(c1560a1.f5582a), c1560a1.f5583b);
        c1740f.f6315j = c2648vx;
        boolean zBooleanValue = ((Boolean) c2648vx.f9165d).booleanValue();
        C1743q c1743q = this.f6024c;
        if (!zBooleanValue || !z) {
            c1743q.mo3680e(EnumC1657a2.DEBUG, "App start profiling was not sampled. It will not start.", new Object[0]);
            return;
        }
        C1744r c1744r = new C1744r(context, this.f6025d, new C1727o(context, c1743q, this.f6025d), c1743q, c1560a1.f5586e, c1560a1.f5587f, c1560a1.f5589h, new C1638U1());
        c1740f.f6314i = null;
        c1740f.f6313h = c1744r;
        c1743q.mo3680e(EnumC1657a2.DEBUG, "App start profiling started.", new Object[0]);
        c1744r.start();
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        C1740f c1740fM3914b = C1740f.m3914b();
        Context context = getContext();
        c1740fM3914b.f6309d.m3920c(f6022e);
        this.f6025d.getClass();
        c1740fM3914b.f6308c.m3920c(Process.getStartUptimeMillis());
        if (context instanceof Application) {
            this.f6023b = (Application) context;
        }
        Application application = this.f6023b;
        if (application != null) {
            c1740fM3914b.m3917d(application);
        }
        Context context2 = getContext();
        C1743q c1743q = this.f6024c;
        if (context2 == null) {
            c1743q.mo3680e(EnumC1657a2.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return true;
        }
        File file = new File(new File(context2.getCacheDir(), "sentry"), "app_start_profiling_config");
        if (!file.exists() || !file.canRead()) {
            return true;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            try {
                C1560A1 c1560a1 = (C1560A1) new C1571D0(C2046v2.empty()).mo3607a(bufferedReader, C1560A1.class);
                if (c1560a1 == null) {
                    c1743q.mo3680e(EnumC1657a2.WARNING, "Unable to deserialize the SentryAppStartProfilingOptions. App start profiling will not start.", new Object[0]);
                } else if (c1560a1.f5588g && c1560a1.f5592k) {
                    m3853a(context2, c1560a1, c1740fM3914b);
                } else if (!c1560a1.f5587f) {
                    c1743q.mo3680e(EnumC1657a2.INFO, "Profiling is not enabled. App start profiling will not start.", new Object[0]);
                } else if (c1560a1.f5591j) {
                    m3854b(context2, c1560a1, c1740fM3914b);
                }
                bufferedReader.close();
                return true;
            } finally {
            }
        } catch (FileNotFoundException e) {
            c1743q.mo3683r(EnumC1657a2.ERROR, "App start profiling config file not found. ", e);
            return true;
        } catch (Throwable th) {
            c1743q.mo3683r(EnumC1657a2.ERROR, "Error reading app start profiling config file. ", th);
            return true;
        }
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        C1981r c1981rM4173a = C1740f.f6305q.m4173a();
        try {
            C1744r c1744r = C1740f.m3914b().f6313h;
            if (c1744r != null) {
                c1744r.close();
            }
            C1696g c1696g = C1740f.m3914b().f6314i;
            if (c1696g != null) {
                c1696g.mo3690a(true);
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
