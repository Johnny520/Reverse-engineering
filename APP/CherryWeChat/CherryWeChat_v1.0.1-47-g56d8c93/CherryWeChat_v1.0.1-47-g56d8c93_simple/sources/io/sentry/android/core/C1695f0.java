package io.sentry.android.core;

import android.view.Choreographer;
import io.sentry.AbstractC1588H1;
import io.sentry.C1637U0;
import io.sentry.C1643W0;
import io.sentry.C1878g2;
import io.sentry.C1981r;
import io.sentry.InterfaceC1639V;
import io.sentry.InterfaceC1876g0;
import io.sentry.InterfaceC1895i0;
import io.sentry.android.core.internal.util.C1727o;
import io.sentry.android.core.internal.util.InterfaceC1726n;
import io.sentry.config.AbstractC1856a;
import io.sentry.util.C2029a;
import java.lang.reflect.Field;
import java.util.Date;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.TimeUnit;
import p000.C0454Kh;

/* JADX INFO: renamed from: io.sentry.android.core.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1695f0 implements InterfaceC1639V, InterfaceC1726n {

    /* JADX INFO: renamed from: h */
    public static final long f6111h = 0;

    /* JADX INFO: renamed from: i */
    public static final C1878g2 f6112i = null;

    /* JADX INFO: renamed from: a */
    public final boolean f6113a;

    /* JADX INFO: renamed from: b */
    public final C2029a f6114b;

    /* JADX INFO: renamed from: c */
    public final C1727o f6115c;

    /* JADX INFO: renamed from: d */
    public volatile String f6116d;

    /* JADX INFO: renamed from: e */
    public final TreeSet f6117e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentSkipListSet f6118f;

    /* JADX INFO: renamed from: g */
    public long f6119g;

    static {
        f6111h = TimeUnit.SECONDS.toNanos(1);
        f6112i = new C1878g2(new Date(0), 0);
    }

    public C1695f0(SentryAndroidOptions r4, C1727o r5) {
        this.f6114b = new C2029a();
        this.f6117e = new TreeSet(new C0454Kh(1));
        this.f6118f = new ConcurrentSkipListSet();
        this.f6119g = 16666666;
        this.f6115c = r5;
        if (r4.isEnablePerformanceV2() == true) goto L5;
    L7:
        boolean r42 = false;
    L8:
        this.f6113a = r42;
        return;
    L5:
        if (r4.isEnableFramesTracking() == false) goto L7;
        r42 = true;
        goto L8
    }

    /* JADX INFO: renamed from: g */
    public static long m3869g(AbstractC1588H1 r4) {
        if ((r4 instanceof C1878g2) == true) goto L5;
        long r0 = (System.currentTimeMillis() * 1000000) - r4.mo3672d();
        return System.nanoTime() - r0;
    L5:
        return r4.mo3670b(f6112i);
    }

    @Override // io.sentry.android.core.internal.util.InterfaceC1726n
    /* JADX INFO: renamed from: c */
    public final void mo3870c(long r18, long r20, long r22, long r24, boolean r26, boolean r27, float r28) {
        ConcurrentSkipListSet r1 = this.f6118f;
        if (r1.size() > 3600) goto L12;
        long r2 = (long) (f6111h / ((double) r28));
        this.f6119g = r2;
        if (r26 == true) goto L10;
        if (r27 == true) goto L10;
        return;
    L10:
        r1.add(new C1693e0(r18, r20, r22, r24, r26, r27, r2));
        return;
    }

    /* JADX INFO: renamed from: d */
    public final void m3871d() {
        C1981r r0 = this.f6114b.m4173a();
    L6:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L4:
        if (this.f6116d == null) goto L8;
        this.f6115c.m3906a(this.f6116d);     // Catch: Throwable -> L6
        this.f6116d = null;     // Catch: Throwable -> L6
    L8:
        this.f6118f.clear();     // Catch: Throwable -> L6
        this.f6117e.clear();     // Catch: Throwable -> L6
        r0.close();
    }

    /* JADX INFO: renamed from: e */
    public final void m3872e(InterfaceC1876g0 r36) {
        TreeSet r2 = this.f6117e;
        if (this.f6113a == true) goto L6;
        return;
    L6:
        if ((r36 instanceof C1637U0) == false) goto L9;
        return;
    L9:
        if ((r36 instanceof C1643W0) == false) goto L11;
        return;
    L11:
        C2029a r3 = this.f6114b;
        C1981r r4 = r3.m4173a();
        if (r2.contains(r36) == true) goto L16;
        r4.close();
        return;
    L16:
        r4.close();
        C1981r r42 = r3.m4173a();
        boolean r5 = r2.remove(r36);     // Catch: Throwable -> L74
        ConcurrentSkipListSet r6 = this.f6118f;
        if (r5 == true) goto L21;
    L20:
        r42.close();
        TreeSet r27 = r2;
        C2029a r28 = r3;
    L112:
        C1981r r22 = r28.m4173a();
    L116:
        th = move-exception;
        r22.close();     // Catch: Throwable -> L123
        throw th;
    L123:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L114:
        if (r27.isEmpty() == false) goto L118;
        m3871d();     // Catch: Throwable -> L116
    L119:
        r22.close();
        return;
    L118:
        r6.headSet(new C1693e0(m3869g(((InterfaceC1876g0) r27.first()).mo3635u()))).clear();     // Catch: Throwable -> L116
        goto L119
    L21:
        AbstractC1588H1 r52 = r36.mo3630p();     // Catch: Throwable -> L74
        if (r52 == null) goto L20;
        long r7 = m3869g(r36.mo3635u());     // Catch: Throwable -> L74
        long r9 = m3869g(r52);     // Catch: Throwable -> L74
        long r11 = r9 - r7;     // Catch: Throwable -> L74
        if (r11 <= 0) goto L20;
        long r13 = this.f6119g;     // Catch: Throwable -> L74
        int r17 = 1;
        int r18 = 0;
        if (r6.isEmpty() == true) goto L77;
        Iterator r53 = r6.tailSet(new C1693e0(r7)).iterator();     // Catch: Throwable -> L74
        int r25 = 0;
        int r26 = 0;
        long r19 = 0;
        long r21 = 0;
        long r23 = 0;
    L30:
        if (r53.hasNext() == false) goto L76;
        C1693e0 r15 = (C1693e0) r53.next();     // Catch: Throwable -> L74
        r27 = r2;
        r28 = r3;
        long r24 = r15.f6103a;     // Catch: Throwable -> L74
        long r29 = r15.f6106d;
        long r210 = r15.f6109g;
        long r211 = r15.f6104b;
        if (r24 > r9) goto L35;
        if (r24 < r7) goto L50;
        if (r211 > r9) goto L50;
        long r212 = r15.f6105c;     // Catch: Throwable -> L47
        boolean r132 = r15.f6107e;     // Catch: Throwable -> L47
        r19 = r19 + r212;
        if (r15.f6108f == false) goto L44;
        r23 = r23 + r29;
        r26 = r26 + 1;
    L46:
        C1981r r292 = r42;
        Iterator r16 = r53;
    L73:
        r53 = r16;
        r2 = r27;
        r3 = r28;
        r42 = r292;
        r13 = r210;
        goto L30
    L44:
        if (r132 == false) goto L46;
        r21 = r21 + r29;
        r25 = r25 + 1;
    L47:
        th = move-exception;
        Throwable r213 = th;
        r292 = r42;
    L154:
        r292.close();     // Catch: Throwable -> L128
        throw r213;
    L128:
        th = move-exception;
        r213.addSuppressed(th);
        throw r213;
    L50:
        if (r7 <= r24) goto L54;
        if (r7 >= r211) goto L54;
    L57:
        r292 = r42;
        r16 = r53;
        long r133 = Math.min(r29 - Math.max(0, Math.max(0, r7 - r24) - r210), r11);     // Catch: Throwable -> L71
        long r214 = Math.min(r9, r211) - Math.max(r7, r15.f6103a);     // Catch: Throwable -> L71
        int r43 = C1727o.f6256p;     // Catch: Throwable -> L71
        if (r214 <= r210) goto L61;
        boolean r44 = true;
    L63:
        if (r214 <= C1727o.f6255o) goto L65;
        boolean r54 = true;
    L66:
        r19 = r19 + r214;     // Catch: Throwable -> L71
        if (r54 == false) goto L69;
        r23 = r23 + r133;     // Catch: Throwable -> L71
        r26 = r26 + 1;     // Catch: Throwable -> L71
        goto L73
    L69:
        if (r44 == false) goto L73;
        r21 = r21 + r133;     // Catch: Throwable -> L71
        r25 = r25 + 1;     // Catch: Throwable -> L71
        goto L73
    L65:
        r54 = false;
        goto L66
    L61:
        r44 = false;
    L71:
        th = th;
    L72:
        r213 = th;
    L54:
        if (r9 <= r24) goto L46;
        if (r9 >= r211) goto L46;
    L35:
        r292 = r42;
    L78:
        int r215 = r25 + r26;     // Catch: Throwable -> L71
        C1727o r32 = this.f6115c;     // Catch: Throwable -> L71
        Choreographer r45 = r32.f6266j;     // Catch: Throwable -> L71
        if (r45 == null) goto L86;
        Field r33 = r32.f6267k;     // Catch: Throwable -> L71
        if (r33 == null) goto L86;
        Long r34 = (Long) r33.get(r45);     // Catch: Throwable -> L71 IllegalAccessException -> L138
        if (r34 == null) goto L86;
        long r35 = r34.longValue();     // Catch: Throwable -> L71 IllegalAccessException -> L138
    L88:
        if (r35 != (-1)) goto L90;
    L108:
        double r37 = (r21 + r23) / 1.0E9d;     // Catch: Throwable -> L71
        r36.mo3618d("frames.total", Integer.valueOf(r215));     // Catch: Throwable -> L71
        r36.mo3618d("frames.slow", Integer.valueOf(r25));     // Catch: Throwable -> L71
        r36.mo3618d("frames.frozen", Integer.valueOf(r26));     // Catch: Throwable -> L71
        r36.mo3618d("frames.delay", Double.valueOf(r37));     // Catch: Throwable -> L71
        if ((r36 instanceof InterfaceC1895i0) == false) goto L111;
        r36.mo3624j(Integer.valueOf(r215), "frames_total");     // Catch: Throwable -> L71
        r36.mo3624j(Integer.valueOf(r25), "frames_slow");     // Catch: Throwable -> L71
        r36.mo3624j(Integer.valueOf(r26), "frames_frozen");     // Catch: Throwable -> L71
        r36.mo3624j(Double.valueOf(r37), "frames_delay");     // Catch: Throwable -> L71
    L111:
        r292.close();
        goto L112
    L90:
        long r72 = Math.max(0, r9 - r35);     // Catch: Throwable -> L71
        if (r72 <= r13) goto L93;
        boolean r38 = true;
    L94:
        if (r38 == true) goto L96;
        r17 = 0;
    L104:
        int r216 = r215 + r17;     // Catch: Throwable -> L71
        long r112 = r11 - r19;     // Catch: Throwable -> L71
        if (r112 <= 0) goto L107;
        r18 = (int) Math.ceil(r112 / r13);     // Catch: Throwable -> L71
    L107:
        r215 = r216 + r18;     // Catch: Throwable -> L71
        goto L108
    L96:
        if (r72 <= C1727o.f6255o) goto L98;
        boolean r39 = true;
    L99:
        long r46 = Math.max(0, r72 - r13);     // Catch: Throwable -> L71
        r19 = r19 + r72;     // Catch: Throwable -> L71
        if (r39 == false) goto L102;
        r23 = r23 + r46;     // Catch: Throwable -> L71
        r26 = r26 + 1;     // Catch: Throwable -> L71
        goto L104
    L102:
        r21 = r21 + r46;     // Catch: Throwable -> L71
        r25 = r25 + 1;     // Catch: Throwable -> L71
        goto L104
    L98:
        r39 = false;
        goto L99
    L93:
        r38 = false;
    L86:
        r35 = -1;
        goto L88
    L76:
        r27 = r2;
        r28 = r3;
        goto L35
    L77:
        r27 = r2;
        r28 = r3;
        r292 = r42;
        r25 = 0;
        r26 = 0;
        r19 = 0;
        r21 = 0;
        r23 = 0;
    L74:
        th = th;
        r292 = r42;
    L131:
        th = move-exception;
        r4.close();     // Catch: Throwable -> L135
        throw th;
    L135:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    }

    /* JADX INFO: renamed from: f */
    public final void m3873f(InterfaceC1876g0 r4) {
        if (this.f6113a == true) goto L6;
        return;
    L6:
        if ((r4 instanceof C1637U0) == false) goto L9;
        return;
    L9:
        if ((r4 instanceof C1643W0) == false) goto L11;
        return;
    L11:
        C1981r r0 = this.f6114b.m4173a();
        this.f6117e.add(r4);     // Catch: Throwable -> L20
        if (this.f6116d != null) goto L22;
        C1727o r42 = this.f6115c;     // Catch: Throwable -> L20
        if (r42.f6263g == true) goto L17;
        String r43 = null;
    L18:
        this.f6116d = r43;     // Catch: Throwable -> L20
        goto L22
    L17:
        String r1 = AbstractC1856a.m4065k();     // Catch: Throwable -> L20
        r42.f6262f.put(r1, this);     // Catch: Throwable -> L20
        r42.m3907b();     // Catch: Throwable -> L20
        r43 = r1;
    L22:
        r0.close();
        return;
    L20:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L26
    L28:
        throw th;
    L26:
        th = move-exception;
        th.addSuppressed(th);
        goto L28
    }
}
