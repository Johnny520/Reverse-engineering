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
    public static final /* synthetic */ InterfaceC0674Pm[] f6428q;

    /* JADX INFO: renamed from: a */
    public final C2046v2 f6429a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1651Z f6430b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2011f f6431c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f6432d;

    /* JADX INFO: renamed from: f */
    public final C1786c f6434f;

    /* JADX INFO: renamed from: h */
    public C1789j f6436h;

    /* JADX INFO: renamed from: e */
    public final C1251cA f6433e = new C1251cA(C1763a.f6416b);

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f6435g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    public final C1765c f6437i = new C1765c(this, this, 3);

    /* JADX INFO: renamed from: j */
    public final C1765c f6438j = new C1765c(this, this, 4);

    /* JADX INFO: renamed from: k */
    public final AtomicLong f6439k = new AtomicLong();

    /* JADX INFO: renamed from: l */
    public final C1765c f6440l = new C1765c(this, this, 5);

    /* JADX INFO: renamed from: m */
    public final C1765c f6441m = new C1765c(C1970t.f7011b, this, this);

    /* JADX INFO: renamed from: n */
    public final C1765c f6442n = new C1765c(this, this, 1);

    /* JADX INFO: renamed from: o */
    public final C1765c f6443o = new C1765c(this, this, 2);

    /* JADX INFO: renamed from: p */
    public final ConcurrentLinkedDeque f6444p = new ConcurrentLinkedDeque();

    static {
        C2772ys c2772ys = new C2772ys("recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;");
        AbstractC0425Jv.f1405a.getClass();
        f6428q = new InterfaceC0674Pm[]{c2772ys, new C2772ys("segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;"), new C2772ys("screenAtStart", "getScreenAtStart()Ljava/lang/String;"), new C2772ys("currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;"), new C2772ys("currentSegment", "getCurrentSegment()I"), new C2772ys("replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;")};
    }

    public AbstractC1767e(C2046v2 c2046v2, InterfaceC1651Z interfaceC1651Z, InterfaceC2011f interfaceC2011f, ScheduledExecutorService scheduledExecutorService) {
        this.f6429a = c2046v2;
        this.f6430b = interfaceC1651Z;
        this.f6431c = interfaceC2011f;
        this.f6432d = scheduledExecutorService;
        this.f6434f = new C1786c(interfaceC2011f);
    }

    /* JADX INFO: renamed from: h */
    public static AbstractC1775m m3951h(AbstractC1767e abstractC1767e, long j, Date date, C1970t c1970t, int i, int i2, int i3, int i4, int i5) {
        C1765c c1765c = abstractC1767e.f6443o;
        InterfaceC0674Pm[] interfaceC0674PmArr = f6428q;
        InterfaceC0674Pm interfaceC0674Pm = interfaceC0674PmArr[5];
        EnumC2055w2 enumC2055w2 = (EnumC2055w2) c1765c.f6421a.get();
        C1789j c1789j = abstractC1767e.f6436h;
        C1765c c1765c2 = abstractC1767e.f6440l;
        InterfaceC0674Pm interfaceC0674Pm2 = interfaceC0674PmArr[2];
        return C1772j.m3965a(abstractC1767e.f6430b, abstractC1767e.f6429a, j, date, c1970t, i, i2, i3, enumC2055w2, c1789j, i4, i5, (String) c1765c2.f6421a.get(), null, abstractC1767e.f6444p);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0188  */
    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3952a(MotionEvent motionEvent) {
        List listSingletonList;
        long j;
        C1821w c1821wM3956k = m3956k();
        if (c1821wM3956k != null) {
            C1786c c1786c = this.f6434f;
            InterfaceC2011f interfaceC2011f = c1786c.f6489a;
            LinkedHashMap linkedHashMap = c1786c.f6490b;
            float f = c1821wM3956k.f6592d;
            float f2 = c1821wM3956k.f6591c;
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
                if (iFindPointerIndex == -1) {
                    listSingletonList = null;
                } else {
                    linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
                    C1991g c1991g = new C1991g();
                    c1991g.f7116b = interfaceC2011f.mo3899b();
                    c1991g.f7120f = motionEvent.getX(iFindPointerIndex) * f2;
                    c1991g.f7121g = motionEvent.getY(iFindPointerIndex) * f;
                    c1991g.f7119e = 0;
                    c1991g.f7123i = pointerId;
                    c1991g.f7118d = EnumC1990f.TouchStart;
                    listSingletonList = Collections.singletonList(c1991g);
                }
            } else if (actionMasked == 1) {
                int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
                int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
                if (iFindPointerIndex2 != -1) {
                    linkedHashMap.remove(Integer.valueOf(pointerId2));
                    C1991g c1991g2 = new C1991g();
                    c1991g2.f7116b = interfaceC2011f.mo3899b();
                    c1991g2.f7120f = motionEvent.getX(iFindPointerIndex2) * f2;
                    c1991g2.f7121g = motionEvent.getY(iFindPointerIndex2) * f;
                    c1991g2.f7119e = 0;
                    c1991g2.f7123i = pointerId2;
                    c1991g2.f7118d = EnumC1990f.TouchEnd;
                    listSingletonList = Collections.singletonList(c1991g2);
                }
            } else if (actionMasked == 2) {
                long jMo3899b = interfaceC2011f.mo3899b();
                long j2 = c1786c.f6492d;
                if (j2 != 0) {
                    j = 0;
                    if (j2 + ((long) 50) > jMo3899b) {
                    }
                } else {
                    j = 0;
                }
                c1786c.f6492d = jMo3899b;
                for (Integer num : linkedHashMap.keySet()) {
                    int iFindPointerIndex3 = motionEvent.findPointerIndex(num.intValue());
                    if (iFindPointerIndex3 != -1) {
                        if (c1786c.f6491c == j) {
                            c1786c.f6491c = jMo3899b;
                        }
                        Collection collection = (Collection) linkedHashMap.get(num);
                        C1992h c1992h = new C1992h();
                        c1992h.f7127b = motionEvent.getX(iFindPointerIndex3) * f2;
                        c1992h.f7128c = motionEvent.getY(iFindPointerIndex3) * f;
                        c1992h.f7126a = 0;
                        c1992h.f7129d = jMo3899b - c1786c.f6491c;
                        collection.add(c1992h);
                    }
                }
                long j3 = jMo3899b - c1786c.f6491c;
                if (j3 > 500) {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        int iIntValue = ((Number) entry.getKey()).intValue();
                        ArrayList<C1992h> arrayList2 = (ArrayList) entry.getValue();
                        if (!arrayList2.isEmpty()) {
                            C1993i c1993i = new C1993i();
                            c1993i.f7116b = jMo3899b;
                            ArrayList arrayList3 = new ArrayList(AbstractC2539ta.m5019d0(arrayList2, 10));
                            for (C1992h c1992h2 : arrayList2) {
                                c1992h2.f7129d -= j3;
                                arrayList3.add(c1992h2);
                                jMo3899b = jMo3899b;
                            }
                            c1993i.f7132e = arrayList3;
                            c1993i.f7131d = iIntValue;
                            arrayList.add(c1993i);
                            ((ArrayList) linkedHashMap.get(Integer.valueOf(iIntValue))).clear();
                        }
                    }
                    c1786c.f6491c = j;
                    listSingletonList = arrayList;
                }
            } else if (actionMasked != 3) {
                if (actionMasked != 5) {
                    if (actionMasked != 6) {
                    }
                }
                listSingletonList = null;
            } else {
                linkedHashMap.clear();
                C1991g c1991g3 = new C1991g();
                c1991g3.f7116b = interfaceC2011f.mo3899b();
                c1991g3.f7120f = motionEvent.getX() * f2;
                c1991g3.f7121g = motionEvent.getY() * f;
                c1991g3.f7119e = 0;
                c1991g3.f7123i = 0;
                c1991g3.f7118d = EnumC1990f.TouchCancel;
                listSingletonList = Collections.singletonList(c1991g3);
            }
            if (listSingletonList != null) {
                this.f6444p.addAll(listSingletonList);
            }
        }
    }

    @Override // io.sentry.android.replay.capture.InterfaceC1776n
    /* JADX INFO: renamed from: f */
    public void mo3953f(int i, C1970t c1970t, EnumC2055w2 enumC2055w2) {
        this.f6436h = new C1789j(this.f6429a, c1970t);
        InterfaceC0674Pm[] interfaceC0674PmArr = f6428q;
        InterfaceC0674Pm interfaceC0674Pm = interfaceC0674PmArr[3];
        C1765c c1765c = this.f6441m;
        Object andSet = c1765c.f6421a.getAndSet(c1970t);
        if (!AbstractC0585Nj.m1134a(andSet, c1970t)) {
            C1764b c1764b = new C1764b(andSet, c1970t, c1765c.f6423c, 0);
            AbstractC1767e abstractC1767e = c1765c.f6422b;
            C2046v2 c2046v2 = abstractC1767e.f6429a;
            if (c2046v2.getThreadChecker().mo3902c()) {
                AbstractC1856a.m4052H((ScheduledExecutorService) abstractC1767e.f6433e.getValue(), c2046v2, "CaptureStrategy.runInBackground", new RunnableC1587H0(1, c1764b));
            } else {
                try {
                    c1764b.mo6a();
                } catch (Throwable th) {
                    c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }
        }
        m3957l(i);
        if (enumC2055w2 == null) {
            enumC2055w2 = this instanceof C1779q ? EnumC2055w2.SESSION : EnumC2055w2.BUFFER;
        }
        InterfaceC0674Pm interfaceC0674Pm2 = interfaceC0674PmArr[5];
        C1765c c1765c2 = this.f6443o;
        Object andSet2 = c1765c2.f6421a.getAndSet(enumC2055w2);
        if (!AbstractC0585Nj.m1134a(andSet2, enumC2055w2)) {
            C1764b c1764b2 = new C1764b(andSet2, enumC2055w2, c1765c2.f6423c, 1);
            AbstractC1767e abstractC1767e2 = c1765c2.f6422b;
            C2046v2 c2046v22 = abstractC1767e2.f6429a;
            if (c2046v22.getThreadChecker().mo3902c()) {
                AbstractC1856a.m4052H((ScheduledExecutorService) abstractC1767e2.f6433e.getValue(), c2046v22, "CaptureStrategy.runInBackground", new RunnableC1587H0(3, c1764b2));
            } else {
                try {
                    c1764b2.mo6a();
                } catch (Throwable th2) {
                    c2046v22.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                }
            }
        }
        m3958m(AbstractC1856a.m4067m());
        this.f6439k.set(this.f6431c.mo3899b());
    }

    /* JADX INFO: renamed from: i */
    public final C1970t m3954i() {
        InterfaceC0674Pm interfaceC0674Pm = f6428q[3];
        return (C1970t) this.f6441m.f6421a.get();
    }

    /* JADX INFO: renamed from: j */
    public final int m3955j() {
        InterfaceC0674Pm interfaceC0674Pm = f6428q[4];
        return ((Number) this.f6442n.f6421a.get()).intValue();
    }

    /* JADX INFO: renamed from: k */
    public final C1821w m3956k() {
        InterfaceC0674Pm interfaceC0674Pm = f6428q[0];
        return (C1821w) this.f6437i.f6421a.get();
    }

    /* JADX INFO: renamed from: l */
    public final void m3957l(int i) {
        InterfaceC0674Pm interfaceC0674Pm = f6428q[4];
        Integer numValueOf = Integer.valueOf(i);
        C1765c c1765c = this.f6442n;
        Object andSet = c1765c.f6421a.getAndSet(numValueOf);
        if (AbstractC0585Nj.m1134a(andSet, numValueOf)) {
            return;
        }
        C1766d c1766d = new C1766d(andSet, numValueOf, c1765c.f6423c, 0);
        AbstractC1767e abstractC1767e = c1765c.f6422b;
        C2046v2 c2046v2 = abstractC1767e.f6429a;
        if (c2046v2.getThreadChecker().mo3902c()) {
            AbstractC1856a.m4052H((ScheduledExecutorService) abstractC1767e.f6433e.getValue(), c2046v2, "CaptureStrategy.runInBackground", new RunnableC1587H0(2, c1766d));
            return;
        }
        try {
            c1766d.mo6a();
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3958m(Date date) {
        InterfaceC0674Pm interfaceC0674Pm = f6428q[1];
        C1765c c1765c = this.f6438j;
        Object andSet = c1765c.f6421a.getAndSet(date);
        if (AbstractC0585Nj.m1134a(andSet, date)) {
            return;
        }
        C1764b c1764b = new C1764b(andSet, date, c1765c.f6423c, 2);
        AbstractC1767e abstractC1767e = c1765c.f6422b;
        C2046v2 c2046v2 = abstractC1767e.f6429a;
        if (c2046v2.getThreadChecker().mo3902c()) {
            AbstractC1856a.m4052H((ScheduledExecutorService) abstractC1767e.f6433e.getValue(), c2046v2, "CaptureStrategy.runInBackground", new RunnableC1587H0(5, c1764b));
            return;
        }
        try {
            c1764b.mo6a();
        } catch (Throwable th) {
            c2046v2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
        }
    }
}
