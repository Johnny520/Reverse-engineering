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

/* JADX INFO: renamed from: rl */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2464rl implements OnBannerListener, InterfaceC0566N6, InterfaceC0901Uz, InterfaceC1593I2, InterfaceC2000s1, InterfaceC2031c, InterfaceC1931n1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8687b;

    public /* synthetic */ C2464rl(int r1, Object r2) {
        this.f8686a = r1;
        this.f8687b = r2;
    }

    @Override // com.youth.banner.listener.OnBannerListener
    public void OnBannerClick(Object r4, int r5) {
        C2112jq r52 = (C2112jq) this.f8687b;
        C1304d1 r42 = (C1304d1) r4;
        AbstractC0295Gu.m625r(-821481214834741L);
        r52.getClass();
        Intent r0 = new Intent(AbstractC0295Gu.m625r(-824985908148277L));     // Catch: Exception -> L5
        r0.setData(Uri.parse(r42.f4747c));     // Catch: Exception -> L5
        r0.addFlags(268435456);     // Catch: Exception -> L5
        r52.getContext().startActivity(r0);     // Catch: Exception -> L5
        return;
    L5:
        AbstractC0213Ey.m413k(-825101872265269L, r52.getContext(), 0);
    }

    @Override // p000.InterfaceC0901Uz
    /* JADX INFO: renamed from: a */
    public void mo1423a() {
        C0701QC r0 = (C0701QC) this.f8687b;
        int r1 = r0.f2264k.ordinal();
        InterfaceC0190Eb r3 = null;
        if (r1 == 0) goto L10;
        int r4 = 1;
        if (r1 != 1) goto L9;
        C1498hd r12 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0615OC(r0, r3, r4), 3);
        return;
    L9:
        throw new C0232Fa();
    L10:
        C1498hd r13 = AbstractC1499he.f5282a;
        AbstractC0585Nj.m1128G(AbstractC0671Pj.m1343a(AbstractC1106Zp.f3500a), new C0529MC(r0, r3, 2), 3);
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public void mo1424b(InterfaceC1645X r6) {
        switch(this.f8686a) {
            case 7: goto L45;
            case 8: goto L31;
            case 9: goto L22;
            case 10: goto L20;
            case 11: goto L18;
            default: goto L4;
        };
    L4:
        C1779q r0 = (C1779q) this.f8687b;
        r6.mo3767k(r0.m3954i());
        String r62 = r6.mo3775s();
        if (r62 == null) goto L7;
        String r63 = AbstractC2564tz.m5068c0(r62, '.');
    L8:
        C1765c r02 = r0.f6440l;
        InterfaceC0674Pm r1 = AbstractC1767e.f6428q[2];
        Object r12 = r02.f6421a.getAndSet(r63);
        if (AbstractC0585Nj.m1134a(r12, r63) == true) goto L49;
        C1764b r2 = new C1764b(r12, r63, r02.f6423c, 3);
        AbstractC1767e r64 = r02.f6422b;
        C2046v2 r03 = r64.f6429a;
        if (r03.getThreadChecker().mo3902c() == false) goto L47;
        AbstractC1856a.m4052H((ScheduledExecutorService) r64.f6433e.getValue(), r03, "CaptureStrategy.runInBackground", new RunnableC1587H0(6, r2));
        return;
    L47:
        r2.mo6a();     // Catch: Throwable -> L15
        return;
    L15:
        th = move-exception;
        r03.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        return;
    L49:
        return;
    L7:
        r63 = null;
        goto L8
    L18:
        r6.mo3767k(((C1770h) this.f8687b).m3954i());
        return;
    L20:
        r6.mo3777u(new C0698Q9(11, (GestureDetectorOnGestureListenerC1707f) this.f8687b, r6));
        return;
    L22:
        AtomicBoolean r04 = (AtomicBoolean) this.f8687b;
        C1581F2 r65 = r6.mo3781y();
        if (r65 == null) goto L52;
        Date r66 = r65.f5696a;
        if (r66 != null) goto L27;
        Date r67 = null;
    L28:
        if (r67 == null) goto L53;
        r04.set(true);
        return;
    L53:
        return;
    L27:
        r67 = (Date) r66.clone();
        goto L28
    L52:
        return;
    L31:
        AtomicLong r05 = ((C1678V) this.f8687b).f6046a;
        if (r05.get() != 0) goto L54;
        C1581F2 r68 = r6.mo3781y();
        if (r68 == null) goto L55;
        Date r69 = r68.f5696a;
        Date r13 = null;
        if (r69 != null) goto L38;
        Date r22 = null;
    L39:
        if (r22 == null) goto L56;
        if (r69 == null) goto L43;
        r13 = (Date) r69.clone();
    L43:
        r05.set(r13.getTime());
        return;
    L56:
        return;
    L38:
        r22 = (Date) r69.clone();
        goto L39
    L55:
        return;
    L54:
        return;
    L45:
        r6.mo3777u(new C0698Q9(5, (InterfaceC1895i0) this.f8687b, r6));
    }

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        switch(this.f8686a) {
            case 13: goto L24;
            default: goto L4;
        };
    L4:
        C1841f r0 = (C1841f) this.f8687b;
        C2046v2 r1 = r0.f6644a;
        File r2 = AbstractC1836a.m4001b(r1, ".scope-cache");
        if (r2 != null) goto L7;
        r1.getLogger().mo3680e(EnumC1657a2.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
        return new C1843b();
    L7:
        File r3 = new File(r2, "breadcrumbs.json");
        int r22 = r1.getMaxBreadcrumbs();     // Catch: IOException -> L14
        RandomAccessFile r4 = C1849h.m4020q(r3);     // Catch: IOException -> L14
        C1849h r5 = new C1849h(r3, r4, r22);     // Catch: Throwable -> L11
    L32:
        return new C1845d(r5, new C1563B0(r0));
    L11:
        th = move-exception;
        r4.close();     // Catch: IOException -> L14
        throw th;     // Catch: IOException -> L14
    L14:
        r3.delete();     // Catch: IOException -> L20
        int r23 = r1.getMaxBreadcrumbs();     // Catch: IOException -> L20
        RandomAccessFile r42 = C1849h.m4020q(r3);     // Catch: IOException -> L20
        r5 = new C1849h(r3, r42, r23);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        r42.close();     // Catch: IOException -> L20
        throw th;     // Catch: IOException -> L20
    L20:
        e = move-exception;
        r1.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to create breadcrumbs queue", e);
        return new C1843b();
    L24:
        return ((C1838c) this.f8687b).f6634a.getSerializer();
    }

    @Override // io.sentry.InterfaceC1593I2
    /* JADX INFO: renamed from: d */
    public void mo3614d(C1585G2 r4) {
        C1573D2 r0 = (C1573D2) this.f8687b;
        InterfaceC1925m r1 = r0.f5644q;
        if (r1 == null) goto L5;
        r1.mo3677d(r4);
    L5:
        C1569C2 r42 = r0.f5633f;
        C1625Q2 r12 = r0.f5645r;
        if (r12.f5841g == null) goto L20;
        if (r12.f5840f == false) goto L17;
        ListIterator r43 = r0.f5630c.listIterator();
    L11:
        if (r43.hasNext() == false) goto L17;
        C1585G2 r13 = (C1585G2) r43.next();
        if (r13.f5722f == true) goto L11;
        if (r13.f5718b != null) goto L11;
        return;
    L17:
        r0.mo3625k();
        return;
    L20:
        if (r42.f5620a == false) goto L29;
        r0.mo3631q(r42.f5621b, null);
        return;
    }

    @Override // io.sentry.InterfaceC1931n1
    /* JADX INFO: renamed from: e */
    public void mo1427e(C1918l r2) {
        ((InterfaceC1645X) this.f8687b).mo3752B(new C1918l());
    }

    @Override // p000.InterfaceC0566N6
    public void onCancel() {
        ((C0557My) this.f8687b).m1097a();
    }

    public /* synthetic */ C2464rl(C0701QC r1, Activity r2) {
        this.f8686a = 5;
        this.f8687b = r1;
    }

    public /* synthetic */ C2464rl(ActivityLifecycleIntegration r1, InterfaceC1895i0 r2) {
        this.f8686a = 7;
        this.f8687b = r2;
    }
}
