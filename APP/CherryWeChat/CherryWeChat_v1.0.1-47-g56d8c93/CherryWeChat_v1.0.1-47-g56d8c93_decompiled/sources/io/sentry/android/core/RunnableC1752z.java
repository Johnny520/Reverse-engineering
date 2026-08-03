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
import java.io.IOException;
import java.util.ArrayList;
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
    public final /* synthetic */ int f6357a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f6358b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6359c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f6360d;

    public /* synthetic */ RunnableC1752z(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
        this.f6359c = appComponentsBreadcrumbsIntegration;
        this.f6358b = j;
        this.f6360d = configuration;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        String str;
        switch (this.f6357a) {
            case 0:
                AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) this.f6359c;
                Configuration configuration = (Configuration) this.f6360d;
                if (appComponentsBreadcrumbsIntegration.f5948b != null) {
                    int i = appComponentsBreadcrumbsIntegration.f5947a.getResources().getConfiguration().orientation;
                    EnumC1955e enumC1955e = i != 1 ? i != 2 ? null : EnumC1955e.LANDSCAPE : EnumC1955e.PORTRAIT;
                    String lowerCase = enumC1955e != null ? enumC1955e.name().toLowerCase(Locale.ROOT) : "undefined";
                    C1871f c1871f = new C1871f(this.f6358b);
                    c1871f.f6712e = "navigation";
                    c1871f.f6714g = "device.orientation";
                    c1871f.m4093b("position", lowerCase);
                    c1871f.f6716i = EnumC1657a2.INFO;
                    C1586H c1586h = new C1586H();
                    c1586h.m3668c("android:configuration", configuration);
                    appComponentsBreadcrumbsIntegration.f5948b.mo3712f(c1871f, c1586h);
                    return;
                }
                return;
            default:
                C1770h c1770h = (C1770h) this.f6359c;
                C1793n c1793n = (C1793n) this.f6360d;
                C1789j c1789j = c1770h.f6436h;
                if (c1789j != null) {
                    c1793n.mo446d(c1789j, Long.valueOf(this.f6358b));
                }
                long jMo3899b = c1770h.f6456t.mo3899b() - c1770h.f6454r.getSessionReplay().f7311g;
                C1789j c1789j2 = c1770h.f6436h;
                if (c1789j2 != null) {
                    C0382Iv c0382Iv = new C0382Iv();
                    AbstractC2711xa.m5283e0(c1789j2.f6505h, new C1788i(jMo3899b, c1789j2, c0382Iv, 0));
                    str = (String) c0382Iv.f1315a;
                } else {
                    str = null;
                }
                C1765c c1765c = c1770h.f6440l;
                InterfaceC0674Pm interfaceC0674Pm = AbstractC1767e.f6428q[2];
                Object andSet = c1765c.f6421a.getAndSet(str);
                if (!AbstractC0585Nj.m1134a(andSet, str)) {
                    C1764b c1764b = new C1764b(andSet, str, c1765c.f6423c, 3);
                    AbstractC1767e abstractC1767e = c1765c.f6422b;
                    C2046v2 c2046v2 = abstractC1767e.f6429a;
                    if (c2046v2.getThreadChecker().mo3902c()) {
                        AbstractC1856a.m4052H((ScheduledExecutorService) abstractC1767e.f6433e.getValue(), c2046v2, "CaptureStrategy.runInBackground", new RunnableC1587H0(6, c1764b));
                    } else {
                        try {
                            c1764b.mo6a();
                        } catch (Throwable th) {
                            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                    break;
                }
                ArrayList arrayList = c1770h.f6458v;
                C0253Fv c0253Fv = new C0253Fv();
                AbstractC2711xa.m5283e0(arrayList, new C1788i(jMo3899b, c1770h, c0253Fv, 1));
                if (c0253Fv.f825a) {
                    int i2 = 0;
                    for (Object obj : arrayList) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC2496sa.m4978c0();
                            throw null;
                        }
                        C1773k c1773k = (C1773k) obj;
                        c1773k.f6459a.f7284t = i2;
                        List<AbstractC1986b> list = c1773k.f6460b.f6818b;
                        if (list != null) {
                            for (AbstractC1986b abstractC1986b : list) {
                                if (abstractC1986b instanceof C1997m) {
                                    ((C1997m) abstractC1986b).f7151d = i2;
                                }
                            }
                        }
                        i2 = i3;
                    }
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC1752z(C1770h c1770h, C1793n c1793n, long j) {
        this.f6359c = c1770h;
        this.f6360d = c1793n;
        this.f6358b = j;
    }
}
