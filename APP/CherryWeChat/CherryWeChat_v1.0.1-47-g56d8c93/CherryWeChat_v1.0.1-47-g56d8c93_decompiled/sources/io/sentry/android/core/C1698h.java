package io.sentry.android.core;

import android.os.SystemClock;
import android.system.Os;
import android.system.OsConstants;
import io.sentry.C1827b1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1642W;
import io.sentry.config.AbstractC1856a;
import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.android.core.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1698h implements InterfaceC1642W {

    /* JADX INFO: renamed from: g */
    public final ILogger f6151g;

    /* JADX INFO: renamed from: a */
    public long f6145a = 0;

    /* JADX INFO: renamed from: b */
    public long f6146b = 0;

    /* JADX INFO: renamed from: c */
    public long f6147c = 1;

    /* JADX INFO: renamed from: d */
    public long f6148d = 1;

    /* JADX INFO: renamed from: e */
    public double f6149e = 1.0E9d / 1;

    /* JADX INFO: renamed from: f */
    public final File f6150f = new File("/proc/self/stat");

    /* JADX INFO: renamed from: h */
    public boolean f6152h = false;

    /* JADX INFO: renamed from: i */
    public final Pattern f6153i = Pattern.compile("[\n\t\r ]");

    public C1698h(ILogger iLogger) {
        AbstractC1856a.m4048D("Logger is required.", iLogger);
        this.f6151g = iLogger;
    }

    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: a */
    public final void mo3749a(C1827b1 c1827b1) {
        if (this.f6152h) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long j = jElapsedRealtimeNanos - this.f6145a;
            this.f6145a = jElapsedRealtimeNanos;
            long jM3878c = m3878c();
            long j2 = jM3878c - this.f6146b;
            this.f6146b = jM3878c;
            c1827b1.f6601a = Double.valueOf(((j2 / j) / this.f6148d) * 100.0d);
        }
    }

    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: b */
    public final void mo3750b() {
        this.f6152h = true;
        this.f6147c = Os.sysconf(OsConstants._SC_CLK_TCK);
        this.f6148d = Os.sysconf(OsConstants._SC_NPROCESSORS_CONF);
        this.f6149e = 1.0E9d / this.f6147c;
        this.f6146b = m3878c();
    }

    /* JADX INFO: renamed from: c */
    public final long m3878c() {
        String strM4047C;
        ILogger iLogger = this.f6151g;
        try {
            strM4047C = AbstractC1856a.m4047C(this.f6150f);
        } catch (IOException e) {
            this.f6152h = false;
            iLogger.mo3683r(EnumC1657a2.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
            strM4047C = null;
        }
        if (strM4047C != null) {
            String[] strArrSplit = this.f6153i.split(strM4047C.trim());
            try {
                long j = Long.parseLong(strArrSplit[13]);
                long j2 = Long.parseLong(strArrSplit[14]);
                return (long) ((j + j2 + Long.parseLong(strArrSplit[15]) + Long.parseLong(strArrSplit[16])) * this.f6149e);
            } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
                iLogger.mo3683r(EnumC1657a2.ERROR, "Error parsing /proc/self/stat file.", e2);
            }
        }
        return 0L;
    }
}
