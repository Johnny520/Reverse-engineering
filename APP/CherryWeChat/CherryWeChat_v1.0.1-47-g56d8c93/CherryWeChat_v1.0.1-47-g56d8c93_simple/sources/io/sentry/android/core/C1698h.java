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

    /* JADX INFO: renamed from: a */
    public long f6145a;

    /* JADX INFO: renamed from: b */
    public long f6146b;

    /* JADX INFO: renamed from: c */
    public long f6147c;

    /* JADX INFO: renamed from: d */
    public long f6148d;

    /* JADX INFO: renamed from: e */
    public double f6149e;

    /* JADX INFO: renamed from: f */
    public final File f6150f;

    /* JADX INFO: renamed from: g */
    public final ILogger f6151g;

    /* JADX INFO: renamed from: h */
    public boolean f6152h;

    /* JADX INFO: renamed from: i */
    public final Pattern f6153i;

    public C1698h(ILogger r5) {
        this.f6145a = 0;
        this.f6146b = 0;
        this.f6147c = 1;
        this.f6148d = 1;
        this.f6149e = 1.0E9d / 1;
        this.f6150f = new File("/proc/self/stat");
        this.f6152h = false;
        this.f6153i = Pattern.compile("[\n\t\r ]");
        AbstractC1856a.m4048D("Logger is required.", r5);
        this.f6151g = r5;
    }

    @Override // io.sentry.InterfaceC1642W
    /* JADX INFO: renamed from: a */
    public final void mo3749a(C1827b1 r7) {
        if (this.f6152h == true) goto L5;
        return;
    L5:
        long r0 = SystemClock.elapsedRealtimeNanos();
        long r2 = r0 - this.f6145a;
        this.f6145a = r0;
        long r02 = m3878c();
        long r4 = r02 - this.f6146b;
        this.f6146b = r02;
        r7.f6601a = Double.valueOf(((r4 / r2) / this.f6148d) * 100.0d);
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
        ILogger r0 = this.f6151g;
        String r1 = AbstractC1856a.m4047C(this.f6150f);     // Catch: IOException -> L5
    L8:
        if (r1 == null) goto L17;
        String[] r12 = this.f6153i.split(r1.trim());
        long r4 = Long.parseLong(r12[13]);     // Catch: ArrayIndexOutOfBoundsException -> L13 Throwable -> L15
        long r6 = Long.parseLong(r12[14]);     // Catch: ArrayIndexOutOfBoundsException -> L13 Throwable -> L15
        long r42 = (r4 + r6) + Long.parseLong(r12[15]);     // Catch: ArrayIndexOutOfBoundsException -> L13 Throwable -> L15
        return (long) ((r42 + Long.parseLong(r12[16])) * this.f6149e);
    L15:
        e = move-exception;
        r0.mo3683r(EnumC1657a2.ERROR, "Error parsing /proc/self/stat file.", e);
    L17:
        return 0;
    L5:
        e = move-exception;
        this.f6152h = false;
        r0.mo3683r(EnumC1657a2.WARNING, "Unable to read /proc/self/stat file. Disabling cpu collection.", e);
        r1 = null;
        goto L8
    }
}
