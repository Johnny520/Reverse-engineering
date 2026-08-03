package io.sentry.android.core;

import android.content.res.Configuration;
import io.sentry.C1586H;
import io.sentry.C1871f;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.RunnableC1587H0;
import io.sentry.android.replay.C1788i;
import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1793n;
import io.sentry.android.replay.capture.AbstractC1767e;
import io.sentry.android.replay.capture.C1764b;
import io.sentry.android.replay.capture.C1765c;
import io.sentry.android.replay.capture.C1770h;
import io.sentry.android.replay.capture.C1773k;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.EnumC1955e;
import io.sentry.rrweb.AbstractC1986b;
import io.sentry.rrweb.C1997m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import p000.AbstractC0585Nj;
import p000.AbstractC2496sa;
import p000.AbstractC2711xa;
import p000.C0253Fv;
import p000.C0382Iv;
import p000.InterfaceC0674Pm;

/* JADX INFO: renamed from: io.sentry.android.core.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1752z implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6357a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f6358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6359c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6360d;

    public /* synthetic */ RunnableC1752z(AppComponentsBreadcrumbsIntegration r2, long r3, Configuration r5) {
        this.f6357a = 0;
        this.f6359c = r2;
        this.f6358b = r3;
        this.f6360d = r5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f6357a) {
            case 0: goto L39;
            default: goto L4;
        };
    L4:
        C1770h r4 = (C1770h) this.f6359c;
        C1793n r0 = (C1793n) this.f6360d;
        C1789j r1 = r4.f6436h;
        if (r1 == null) goto L7;
        r0.mo446d(r1, Long.valueOf(this.f6358b));
    L7:
        long r2 = r4.f6456t.mo3899b() - r4.f6454r.getSessionReplay().f7311g;
        C1789j r8 = r4.f6436h;
        if (r8 == null) goto L10;
        C0382Iv r9 = new C0382Iv();
        AbstractC2711xa.m5283e0(r8.f6505h, new C1788i(r2, r8, r9, 0));
        String r02 = (String) r9.f1315a;
    L11:
        C1765c r12 = r4.f6440l;
        InterfaceC0674Pm r5 = AbstractC1767e.f6428q[2];
        Object r52 = r12.f6421a.getAndSet(r02);
        if (AbstractC0585Nj.m1134a(r52, r02) == true) goto L20;
        C1764b r6 = new C1764b(r52, r02, r12.f6423c, 3);
        AbstractC1767e r03 = r12.f6422b;
        C2046v2 r13 = r03.f6429a;
        if (r13.getThreadChecker().mo3902c() == false) goto L53;
        AbstractC1856a.m4052H((ScheduledExecutorService) r03.f6433e.getValue(), r13, "CaptureStrategy.runInBackground", new RunnableC1587H0(6, r6));
        goto L20
    L53:
        r6.mo6a();     // Catch: Throwable -> L18
    L18:
        th = move-exception;
        r13.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
    L20:
        ArrayList r04 = r4.f6458v;
        C0253Fv r53 = new C0253Fv();
        AbstractC2711xa.m5283e0(r04, new C1788i(r2, r4, r53, 1));
        if (r53.f825a == false) goto L38;
        Iterator r05 = r04.iterator();
        int r14 = 0;
    L24:
        if (r05.hasNext() == false) goto L63;
        Object r22 = r05.next();
        int r3 = r14 + 1;
        if (r14 < 0) goto L36;
        C1773k r23 = (C1773k) r22;
        r23.f6459a.f7284t = r14;
        List r24 = r23.f6460b.f6818b;
        if (r24 == null) goto L35;
        Iterator r25 = r24.iterator();
    L31:
        if (r25.hasNext() == false) goto L35;
        AbstractC1986b r42 = (AbstractC1986b) r25.next();
        if ((r42 instanceof C1997m) == false) goto L31;
        ((C1997m) r42).f7151d = r14;
    L35:
        r14 = r3;
        goto L24
    L36:
        AbstractC2496sa.m4978c0();
        throw null;
    L63:
        return;
    L38:
        return;
    L10:
        r02 = null;
        goto L11
    L39:
        AppComponentsBreadcrumbsIntegration r06 = (AppComponentsBreadcrumbsIntegration) this.f6359c;
        Configuration r15 = (Configuration) this.f6360d;
        if (r06.f5948b == null) goto L64;
        int r26 = r06.f5947a.getResources().getConfiguration().orientation;
        if (r26 != 1) goto L44;
        EnumC1955e r27 = EnumC1955e.PORTRAIT;
    L48:
        if (r27 == null) goto L50;
        String r28 = r27.name().toLowerCase(Locale.ROOT);
    L51:
        C1871f r32 = new C1871f(this.f6358b);
        r32.f6712e = "navigation";
        r32.f6714g = "device.orientation";
        r32.m4093b("position", r28);
        r32.f6716i = EnumC1657a2.INFO;
        C1586H r29 = new C1586H();
        r29.m3668c("android:configuration", r15);
        r06.f5948b.mo3712f(r32, r29);
        return;
    L50:
        r28 = "undefined";
        goto L51
    L44:
        if (r26 == 2) goto L46;
        r27 = null;
        goto L48
    L46:
        r27 = EnumC1955e.LANDSCAPE;
        goto L48
    }

    public /* synthetic */ RunnableC1752z(C1770h r2, C1793n r3, long r4) {
        this.f6357a = 1;
        this.f6359c = r2;
        this.f6360d = r3;
        this.f6358b = r4;
    }
}
