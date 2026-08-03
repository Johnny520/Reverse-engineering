package p000;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.youth.banner.listener.OnBannerListener;
import io.sentry.C1563B0;
import io.sentry.C1569C2;
import io.sentry.C1573D2;
import io.sentry.C1581F2;
import io.sentry.C1585G2;
import io.sentry.C1625Q2;
import io.sentry.C1918l;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1593I2;
import io.sentry.InterfaceC1645X;
import io.sentry.InterfaceC1895i0;
import io.sentry.InterfaceC1925m;
import io.sentry.InterfaceC1931n1;
import io.sentry.InterfaceC2000s1;
import io.sentry.RunnableC1587H0;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C1678V;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC1707f;
import io.sentry.android.replay.capture.AbstractC1767e;
import io.sentry.android.replay.capture.C1764b;
import io.sentry.android.replay.capture.C1765c;
import io.sentry.android.replay.capture.C1770h;
import io.sentry.android.replay.capture.C1779q;
import io.sentry.cache.AbstractC1836a;
import io.sentry.cache.C1838c;
import io.sentry.cache.C1841f;
import io.sentry.cache.tape.C1843b;
import io.sentry.cache.tape.C1845d;
import io.sentry.cache.tape.C1849h;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.InterfaceC2031c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import java.util.ListIterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import party.iroiro.luajava.luajit.LuaJitConsts;

/* JADX INFO: renamed from: rl */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2464rl implements OnBannerListener, InterfaceC0566N6, InterfaceC0901Uz, InterfaceC1593I2, InterfaceC2000s1, InterfaceC2031c, InterfaceC1931n1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8687b;

    public /* synthetic */ C2464rl(int i, Object obj) {
        this.f8686a = i;
        this.f8687b = obj;
    }

    @Override // com.youth.banner.listener.OnBannerListener
    public void OnBannerClick(Object obj, int i) {
        C2112jq c2112jq = (C2112jq) this.f8687b;
        C1304d1 c1304d1 = (C1304d1) obj;
        AbstractC0295Gu.m625r(-821481214834741L);
        c2112jq.getClass();
        try {
            Intent intent = new Intent(AbstractC0295Gu.m625r(-824985908148277L));
            intent.setData(Uri.parse(c1304d1.f4747c));
            intent.addFlags(268435456);
            c2112jq.getContext().startActivity(intent);
        } catch (Exception unused) {
            AbstractC0213Ey.m413k(-825101872265269L, c2112jq.getContext(), 0);
        }
    }

    @Override // p000.InterfaceC0901Uz
    /* JADX INFO: renamed from: a */
    public void mo1423a() {
        C0701QC c0701qc = (C0701QC) this.f8687b;
        int iOrdinal = c0701qc.f2264k.ordinal();
        InterfaceC0190Eb interfaceC0190Eb = null;
        if (iOrdinal == 0) {
            C1498hd c1498hd = AbstractC1499he.f5282a;
            AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0529MC(c0701qc, interfaceC0190Eb, 2), 3);
            return;
        }
        int i = 1;
        if (iOrdinal != 1) {
            throw new C0232Fa();
        }
        C1498hd c1498hd2 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0615OC(c0701qc, interfaceC0190Eb, i), 3);
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public void mo1424b(InterfaceC1645X interfaceC1645X) {
        C1581F2 c1581f2Mo3781y;
        switch (this.f8686a) {
            case 7:
                interfaceC1645X.mo3777u(new C0698Q9(5, (InterfaceC1895i0) this.f8687b, interfaceC1645X));
                break;
            case LuaJitConsts.LUA_TTHREAD /* 8 */:
                AtomicLong atomicLong = ((C1678V) this.f8687b).f6046a;
                if (atomicLong.get() == 0 && (c1581f2Mo3781y = interfaceC1645X.mo3781y()) != null) {
                    Date date = c1581f2Mo3781y.f5696a;
                    if ((date == null ? null : (Date) date.clone()) != null) {
                        atomicLong.set((date != null ? (Date) date.clone() : null).getTime());
                    }
                    break;
                }
                break;
            case LuaJitConsts.LUA_GCISRUNNING /* 9 */:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f8687b;
                C1581F2 c1581f2Mo3781y2 = interfaceC1645X.mo3781y();
                if (c1581f2Mo3781y2 != null) {
                    Date date2 = c1581f2Mo3781y2.f5696a;
                    if ((date2 == null ? null : (Date) date2.clone()) != null) {
                        atomicBoolean.set(true);
                    }
                }
                break;
            case 10:
                interfaceC1645X.mo3777u(new C0698Q9(11, (GestureDetectorOnGestureListenerC1707f) this.f8687b, interfaceC1645X));
                break;
            case 11:
                interfaceC1645X.mo3767k(((C1770h) this.f8687b).m3954i());
                break;
            default:
                C1779q c1779q = (C1779q) this.f8687b;
                interfaceC1645X.mo3767k(c1779q.m3954i());
                String strMo3775s = interfaceC1645X.mo3775s();
                String strM5068c0 = strMo3775s != null ? AbstractC2564tz.m5068c0(strMo3775s, '.') : null;
                C1765c c1765c = c1779q.f6440l;
                InterfaceC0674Pm interfaceC0674Pm = AbstractC1767e.f6428q[2];
                Object andSet = c1765c.f6421a.getAndSet(strM5068c0);
                if (!AbstractC0585Nj.m1134a(andSet, strM5068c0)) {
                    C1764b c1764b = new C1764b(andSet, strM5068c0, c1765c.f6423c, 3);
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
                }
                break;
        }
    }

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        C1849h c1849h;
        int maxBreadcrumbs;
        RandomAccessFile randomAccessFileM4020q;
        switch (this.f8686a) {
            case 13:
                return ((C1838c) this.f8687b).f6634a.getSerializer();
            default:
                C1841f c1841f = (C1841f) this.f8687b;
                C2046v2 c2046v2 = c1841f.f6644a;
                File fileM4001b = AbstractC1836a.m4001b(c2046v2, ".scope-cache");
                if (fileM4001b == null) {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new C1843b();
                }
                File file = new File(fileM4001b, "breadcrumbs.json");
                try {
                    try {
                        maxBreadcrumbs = c2046v2.getMaxBreadcrumbs();
                        randomAccessFileM4020q = C1849h.m4020q(file);
                    } catch (IOException e) {
                        c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to create breadcrumbs queue", e);
                        return new C1843b();
                    }
                } catch (IOException unused) {
                    file.delete();
                    try {
                        c1849h = new C1849h(file, C1849h.m4020q(file), c2046v2.getMaxBreadcrumbs());
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                try {
                    c1849h = new C1849h(file, randomAccessFileM4020q, maxBreadcrumbs);
                    return new C1845d(c1849h, new C1563B0(c1841f));
                } finally {
                    randomAccessFileM4020q.close();
                }
        }
    }

    @Override // io.sentry.InterfaceC1593I2
    /* JADX INFO: renamed from: d */
    public void mo3614d(C1585G2 c1585g2) {
        C1573D2 c1573d2 = (C1573D2) this.f8687b;
        InterfaceC1925m interfaceC1925m = c1573d2.f5644q;
        if (interfaceC1925m != null) {
            interfaceC1925m.mo3677d(c1585g2);
        }
        C1569C2 c1569c2 = c1573d2.f5633f;
        C1625Q2 c1625q2 = c1573d2.f5645r;
        if (c1625q2.f5841g == null) {
            if (c1569c2.f5620a) {
                c1573d2.mo3631q(c1569c2.f5621b, null);
                return;
            }
            return;
        }
        if (c1625q2.f5840f) {
            ListIterator listIterator = c1573d2.f5630c.listIterator();
            while (listIterator.hasNext()) {
                C1585G2 c1585g22 = (C1585G2) listIterator.next();
                if (!c1585g22.f5722f && c1585g22.f5718b == null) {
                    return;
                }
            }
        }
        c1573d2.mo3625k();
    }

    @Override // io.sentry.InterfaceC1931n1
    /* JADX INFO: renamed from: e */
    public void mo1427e(C1918l c1918l) {
        ((InterfaceC1645X) this.f8687b).mo3752B(new C1918l());
    }

    @Override // p000.InterfaceC0566N6
    public void onCancel() {
        ((C0557My) this.f8687b).m1097a();
    }

    public /* synthetic */ C2464rl(C0701QC c0701qc, Activity activity) {
        this.f8686a = 5;
        this.f8687b = c0701qc;
    }

    public /* synthetic */ C2464rl(ActivityLifecycleIntegration activityLifecycleIntegration, InterfaceC1895i0 interfaceC1895i0) {
        this.f8686a = 7;
        this.f8687b = interfaceC1895i0;
    }
}
