package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1872f0;

/* JADX INFO: renamed from: io.sentry.android.core.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1743q implements InterfaceC1872f0, InterfaceC1674Q, ILogger {

    /* JADX INFO: renamed from: b */
    public static final C1743q f6325b = null;

    /* JADX INFO: renamed from: c */
    public static final C1743q f6326c = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6327a;

    static {
        f6325b = new C1743q(0);
        f6326c = new C1743q(1);
    }

    public /* synthetic */ C1743q(int r1) {
        this.f6327a = r1;
    }

    @Override // io.sentry.InterfaceC1872f0
    /* JADX INFO: renamed from: a */
    public void mo3745a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.InterfaceC1872f0
    /* JADX INFO: renamed from: b */
    public void mo3746b() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: e */
    public void mo3680e(EnumC1657a2 r9, String r10, Object... r11) {
        switch(this.f6327a) {
            case 2: goto L24;
            default: goto L4;
        };
    L4:
        int r1 = 5;
        if (r11.length != 0) goto L14;
        int r92 = AbstractC1728j.f6270a[r9.ordinal()];
        if (r92 == 1) goto L12;
        if (r92 == 2) goto L13;
        if (r92 == 4) goto L11;
        r1 = 3;
        goto L13
    L11:
        r1 = 7;
    L13:
        Log.println(r1, "Sentry", r10);
        return;
    L12:
        r1 = 4;
        goto L13
    L14:
        int r93 = AbstractC1728j.f6270a[r9.ordinal()];
        if (r93 == 1) goto L20;
        if (r93 == 2) goto L21;
        if (r93 == 4) goto L19;
        r1 = 3;
        goto L21
    L19:
        r1 = 7;
    L21:
        Log.println(r1, "Sentry", String.format(r10, r11));
        return;
    L20:
        r1 = 4;
        goto L21
    L24:
        if (r11.length != 0) goto L26;
        Log.println(7, "Sentry", r10);
        return;
    L26:
        Log.println(7, "Sentry", String.format(r10, r11));
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: i */
    public boolean mo3681i(EnumC1657a2 r1) {
        switch(this.f6327a) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        return true;
    L6:
        return true;
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: n */
    public void mo3682n(EnumC1657a2 r2, Throwable r3, String r4, Object... r5) {
        switch(this.f6327a) {
            case 2: goto L10;
            default: goto L5;
        };
    L5:
        if (r5.length != 0) goto L7;
        mo3683r(r2, r4, r3);
        return;
    L7:
        mo3683r(r2, String.format(r4, r5), r3);
        return;
    L10:
        if (r5.length != 0) goto L12;
        mo3683r(r2, r4, r3);
        return;
    L12:
        mo3683r(r2, String.format(r4, r5), r3);
    }

    @Override // io.sentry.ILogger
    /* JADX INFO: renamed from: r */
    public void mo3683r(EnumC1657a2 r2, String r3, Throwable r4) {
        switch(this.f6327a) {
            case 2: goto L9;
            default: goto L5;
        };
    L9:
        Log.wtf("Sentry", r3, r4);
        return;
    L5:
        if (AbstractC1728j.f6270a[r2.ordinal()] != 4) goto L11;
        Log.wtf("Sentry", r3, r4);
        return;
    }
}
