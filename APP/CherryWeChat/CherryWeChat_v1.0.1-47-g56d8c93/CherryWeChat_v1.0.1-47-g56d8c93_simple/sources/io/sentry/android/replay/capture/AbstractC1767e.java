package io.sentry.android.replay.capture;

import android.view.MotionEvent;
import io.sentry.C2046v2;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC2055w2;
import io.sentry.InterfaceC1651Z;
import io.sentry.RunnableC1587H0;
import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1821w;
import io.sentry.android.replay.gestures.C1786c;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.rrweb.C1991g;
import io.sentry.rrweb.C1992h;
import io.sentry.rrweb.C1993i;
import io.sentry.rrweb.EnumC1990f;
import io.sentry.transport.InterfaceC2011f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC0425Jv;
import p000.AbstractC0585Nj;
import p000.AbstractC2539ta;
import p000.C1251cA;
import p000.C2772ys;
import p000.InterfaceC0674Pm;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1767e implements InterfaceC1776n {

    /* JADX INFO: renamed from: q */
    public static final /* synthetic */ InterfaceC0674Pm[] f6428q = null;

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6429a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1651Z f6430b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2011f f6431c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f6432d;

    /* JADX INFO: renamed from: e */
    public final C1251cA f6433e;

    /* JADX INFO: renamed from: f */
    public final C1786c f6434f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f6435g;

    /* JADX INFO: renamed from: h */
    public C1789j f6436h;

    /* JADX INFO: renamed from: i */
    public final C1765c f6437i;

    /* JADX INFO: renamed from: j */
    public final C1765c f6438j;

    /* JADX INFO: renamed from: k */
    public final AtomicLong f6439k;

    /* JADX INFO: renamed from: l */
    public final C1765c f6440l;

    /* JADX INFO: renamed from: m */
    public final C1765c f6441m;

    /* JADX INFO: renamed from: n */
    public final C1765c f6442n;

    /* JADX INFO: renamed from: o */
    public final C1765c f6443o;

    /* JADX INFO: renamed from: p */
    public final ConcurrentLinkedDeque f6444p;

    static {
        C2772ys r0 = new C2772ys("recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;");
        AbstractC0425Jv.f1405a.getClass();
        f6428q = new InterfaceC0674Pm[]{r0, new C2772ys("segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;"), new C2772ys("screenAtStart", "getScreenAtStart()Ljava/lang/String;"), new C2772ys("currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;"), new C2772ys("currentSegment", "getCurrentSegment()I"), new C2772ys("replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;")};
    }

    public AbstractC1767e(C2046v2 r1, InterfaceC1651Z r2, InterfaceC2011f r3, ScheduledExecutorService r4) {
        this.f6429a = r1;
        this.f6430b = r2;
        this.f6431c = r3;
        this.f6432d = r4;
        this.f6433e = new C1251cA(C1763a.f6416b);
        this.f6434f = new C1786c(r3);
        this.f6435g = new AtomicBoolean(false);
        this.f6437i = new C1765c(this, this, 3);
        this.f6438j = new C1765c(this, this, 4);
        this.f6439k = new AtomicLong();
        this.f6440l = new C1765c(this, this, 5);
        this.f6441m = new C1765c(C1970t.f7011b, this, this);
        this.f6442n = new C1765c(this, this, 1);
        this.f6443o = new C1765c(this, this, 2);
        this.f6444p = new ConcurrentLinkedDeque();
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC1775m m3951h(AbstractC1767e r20, long r21, Date r23, C1970t r24, int r25, int r26, int r27, int r28, int r29) {
        C1765c r1 = r20.f6443o;
        InterfaceC0674Pm[] r3 = f6428q;
        InterfaceC0674Pm r2 = r3[5];
        EnumC2055w2 r13 = (EnumC2055w2) r1.f6421a.get();
        C1789j r14 = r20.f6436h;
        C1765c r12 = r20.f6440l;
        InterfaceC0674Pm r22 = r3[2];
        String r17 = (String) r12.f6421a.get();
        ConcurrentLinkedDeque r15 = r20.f6444p;
        return C1772j.m3965a(r20.f6430b, r20.f6429a, r21, r23, r24, r25, r26, r27, r13, r14, r28, r29, r17, null, r15);
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: a */
    public void mo3952a(MotionEvent r21) {
        C1821w r2 = m3956k();
        if (r2 == null) goto L69;
        C1786c r3 = this.f6434f;
        InterfaceC2011f r4 = r3.f6489a;
        LinkedHashMap r5 = r3.f6490b;
        float r6 = r2.f6592d;
        float r22 = r2.f6591c;
        int r7 = r21.getActionMasked();
        if (r7 != 0) goto L7;
    L51:
        int r32 = r21.getPointerId(r21.getActionIndex());
        int r72 = r21.findPointerIndex(r32);
        if (r72 == (-1)) goto L16;
        r5.put(Integer.valueOf(r32), new ArrayList(10));
        C1991g r52 = new C1991g();
        r52.f7116b = r4.mo3899b();
        r52.f7120f = r21.getX(r72) * r22;
        r52.f7121g = r21.getY(r72) * r6;
        r52.f7119e = 0;
        r52.f7123i = r32;
        r52.f7118d = EnumC1990f.TouchStart;
        List r11 = Collections.singletonList(r52);
    L55:
        if (r11 == null) goto L70;
        this.f6444p.addAll(r11);
        return;
    L70:
        return;
    L16:
        r11 = null;
        goto L55
    L7:
        if (r7 != 1) goto L9;
    L47:
        int r33 = r21.getPointerId(r21.getActionIndex());
        int r73 = r21.findPointerIndex(r33);
        if (r73 == (-1)) goto L16;
        r5.remove(Integer.valueOf(r33));
        C1991g r53 = new C1991g();
        r53.f7116b = r4.mo3899b();
        r53.f7120f = r21.getX(r73) * r22;
        r53.f7121g = r21.getY(r73) * r6;
        r53.f7119e = 0;
        r53.f7123i = r33;
        r53.f7118d = EnumC1990f.TouchEnd;
        r11 = Collections.singletonList(r53);
        goto L55
    L9:
        if (r7 != 2) goto L11;
        long r12 = r4.mo3899b();
        long r14 = r3.f6492d;
        if (r14 == 0) goto L23;
        long r16 = 0;
        if ((r14 + ((long) 50)) > r12) goto L16;
    L24:
        r3.f6492d = r12;
        Iterator r42 = r5.keySet().iterator();
    L26:
        if (r42.hasNext() == false) goto L34;
        Integer r10 = (Integer) r42.next();
        int r112 = r21.findPointerIndex(r10.intValue());
        if (r112 == (-1)) goto L26;
        if (r3.f6491c != r16) goto L33;
        r3.f6491c = r12;
    L33:
        Collection r102 = (Collection) r5.get(r10);
        C1992h r142 = new C1992h();
        r142.f7127b = r21.getX(r112) * r22;
        r142.f7128c = r21.getY(r112) * r6;
        r142.f7126a = 0;
        r142.f7129d = r12 - r3.f6491c;
        r102.add(r142);
        goto L26
    L34:
        long r1 = r12 - r3.f6491c;
        if (r1 <= 500) goto L16;
        ArrayList r43 = new ArrayList(r5.size());
        Iterator r62 = r5.entrySet().iterator();
    L38:
        if (r62.hasNext() == false) goto L46;
        Map.Entry r74 = (Map.Entry) r62.next();
        int r8 = ((Number) r74.getKey()).intValue();
        ArrayList r75 = (ArrayList) r74.getValue();
        if (r75.isEmpty() == true) goto L38;
        C1993i r9 = new C1993i();
        r9.f7116b = r12;
        ArrayList r103 = new ArrayList(AbstractC2539ta.m5019d0(r75, 10));
        Iterator r76 = r75.iterator();
    L43:
        if (r76.hasNext() == false) goto L45;
        C1992h r143 = (C1992h) r76.next();
        r143.f7129d -= r1;
        r103.add(r143);
        r12 = r12;
        goto L43
    L45:
        r9.f7132e = r103;
        r9.f7131d = r8;
        r43.add(r9);
        ((ArrayList) r5.get(Integer.valueOf(r8))).clear();
        goto L38
    L46:
        r3.f6491c = r16;
        r11 = r43;
        goto L55
    L23:
        r16 = 0;
        goto L24
    L11:
        if (r7 != 3) goto L13;
        r5.clear();
        C1991g r34 = new C1991g();
        r34.f7116b = r4.mo3899b();
        r34.f7120f = r21.getX() * r22;
        r34.f7121g = r21.getY() * r6;
        r34.f7119e = 0;
        r34.f7123i = 0;
        r34.f7118d = EnumC1990f.TouchCancel;
        r11 = Collections.singletonList(r34);
        goto L55
    L13:
        if (r7 == 5) goto L51;
        if (r7 == 6) goto L47;
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: f */
    public void mo3953f(int r9, C1970t r10, EnumC2055w2 r11) {
        this.f6436h = new C1789j(this.f6429a, r10);
        InterfaceC0674Pm[] r1 = f6428q;
        InterfaceC0674Pm r0 = r1[3];
        C1765c r02 = this.f6441m;
        Object r2 = r02.f6421a.getAndSet(r10);
        if (AbstractC0585Nj.m1134a(r2, r10) == true) goto L11;
        C1764b r3 = new C1764b(r2, r10, r02.f6423c, 0);
        AbstractC1767e r102 = r02.f6422b;
        C2046v2 r03 = r102.f6429a;
        if (r03.getThreadChecker().mo3902c() == false) goto L30;
        AbstractC1856a.m4052H((ScheduledExecutorService) r102.f6433e.getValue(), r03, "CaptureStrategy.runInBackground", new RunnableC1587H0(1, r3));
        goto L11
    L30:
        r3.mo6a();     // Catch: Throwable -> L9
    L9:
        th = move-exception;
        r03.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
    L11:
        m3957l(r9);
        if (r11 == null) goto L14;
    L17:
        InterfaceC0674Pm r92 = r1[5];
        C1765c r93 = this.f6443o;
        Object r103 = r93.f6421a.getAndSet(r11);
        if (AbstractC0585Nj.m1134a(r103, r11) == true) goto L26;
        C1764b r04 = new C1764b(r103, r11, r93.f6423c, 1);
        AbstractC1767e r94 = r93.f6422b;
        C2046v2 r104 = r94.f6429a;
        if (r104.getThreadChecker().mo3902c() == false) goto L28;
        AbstractC1856a.m4052H((ScheduledExecutorService) r94.f6433e.getValue(), r104, "CaptureStrategy.runInBackground", new RunnableC1587H0(3, r04));
        goto L26
    L28:
        r04.mo6a();     // Catch: Throwable -> L24
    L24:
        th = move-exception;
        r104.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
    L26:
        m3958m(AbstractC1856a.m4067m());
        long r95 = this.f6431c.mo3899b();
        this.f6439k.set(r95);
        return;
    L14:
        if ((this instanceof C1779q) == false) goto L16;
        r11 = EnumC2055w2.SESSION;
        goto L17
    L16:
        r11 = EnumC2055w2.BUFFER;
        goto L17
    }

    /* JADX INFO: renamed from: i */
    public final C1970t m3954i() {
        InterfaceC0674Pm r0 = f6428q[3];
        return (C1970t) this.f6441m.f6421a.get();
    }

    /* JADX INFO: renamed from: j */
    public final int m3955j() {
        InterfaceC0674Pm r0 = f6428q[4];
        return ((Number) this.f6442n.f6421a.get()).intValue();
    }

    /* JADX INFO: renamed from: k */
    public final C1821w m3956k() {
        InterfaceC0674Pm r0 = f6428q[0];
        return (C1821w) this.f6437i.f6421a.get();
    }

    /* JADX INFO: renamed from: l */
    public final void m3957l(int r6) {
        InterfaceC0674Pm r0 = f6428q[4];
        Integer r62 = Integer.valueOf(r6);
        C1765c r02 = this.f6442n;
        Object r1 = r02.f6421a.getAndSet(r62);
        if (AbstractC0585Nj.m1134a(r1, r62) == true) goto L15;
        C1766d r2 = new C1766d(r1, r62, r02.f6423c, 0);
        AbstractC1767e r63 = r02.f6422b;
        C2046v2 r03 = r63.f6429a;
        if (r03.getThreadChecker().mo3902c() == false) goto L13;
        AbstractC1856a.m4052H((ScheduledExecutorService) r63.f6433e.getValue(), r03, "CaptureStrategy.runInBackground", new RunnableC1587H0(2, r2));
        return;
    L13:
        r2.mo6a();     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        r03.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        return;
    }

    /* JADX INFO: renamed from: m */
    public final void m3958m(Date r6) {
        InterfaceC0674Pm r0 = f6428q[1];
        C1765c r02 = this.f6438j;
        Object r1 = r02.f6421a.getAndSet(r6);
        if (AbstractC0585Nj.m1134a(r1, r6) == true) goto L15;
        C1764b r2 = new C1764b(r1, r6, r02.f6423c, 2);
        AbstractC1767e r62 = r02.f6422b;
        C2046v2 r03 = r62.f6429a;
        if (r03.getThreadChecker().mo3902c() == false) goto L13;
        AbstractC1856a.m4052H((ScheduledExecutorService) r62.f6433e.getValue(), r03, "CaptureStrategy.runInBackground", new RunnableC1587H0(5, r2));
        return;
    L13:
        r2.mo6a();     // Catch: Throwable -> L10
        return;
    L10:
        th = move-exception;
        r03.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        return;
    }
}
