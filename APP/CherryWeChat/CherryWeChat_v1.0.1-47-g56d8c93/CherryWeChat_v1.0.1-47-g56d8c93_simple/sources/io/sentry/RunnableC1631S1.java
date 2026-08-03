package io.sentry;

import android.app.Activity;
import android.os.SystemClock;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.android.core.C1661D;
import io.sentry.android.core.C1662E;
import io.sentry.android.core.C1683a;
import io.sentry.android.core.C1696g;
import io.sentry.android.core.C1734p;
import io.sentry.android.core.SystemEventsBreadcrumbsIntegration;
import io.sentry.android.replay.C1780d;
import io.sentry.android.replay.C1782f;
import io.sentry.android.replay.C1789j;
import io.sentry.android.replay.C1790k;
import io.sentry.android.replay.C1792m;
import io.sentry.android.replay.C1797r;
import io.sentry.android.replay.C1798s;
import io.sentry.android.replay.C1821w;
import io.sentry.android.replay.C1824z;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.AbstractC1775m;
import io.sentry.android.replay.capture.C1772j;
import io.sentry.android.replay.capture.C1773k;
import io.sentry.cache.C1841f;
import io.sentry.cache.tape.AbstractC1846e;
import io.sentry.config.AbstractC1856a;
import io.sentry.internal.modules.C1909f;
import io.sentry.logger.C1923b;
import io.sentry.protocol.C1970t;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC0042Az;
import p000.AbstractC0585Nj;
import p000.AbstractC0714Qj;
import p000.AbstractC2453ra;
import p000.AbstractC2564tz;
import p000.AbstractC2659w7;
import p000.C0252Fu;
import p000.C0452Kf;
import p000.C0584Ni;
import p000.C1216bb;
import p000.C2381po;
import p000.C2438r1;
import p000.RunnableC2531t8;
import p000.WindowOnFrameMetricsAvailableListenerC0541Mi;

/* JADX INFO: renamed from: io.sentry.S1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1631S1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5857a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5858b;

    public /* synthetic */ RunnableC1631S1(int r1, Object r2) {
        this.f5857a = r1;
        this.f5858b = r2;
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [Dn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v29, types: [Dn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f5857a) {
            case 0: goto L189;
            case 1: goto L187;
            case 2: goto L180;
            case 3: goto L178;
            case 4: goto L176;
            case 5: goto L172;
            case 6: goto L170;
            case 7: goto L168;
            case 8: goto L31;
            case 9: goto L12;
            case 10: goto L6;
            default: goto L4;
        };
    L4:
        C1923b r0 = (C1923b) this.f5858b;
        r0.f6814d.mo3695g(r0.f6811a.getShutdownTimeoutMillis());
        return;
    L6:
        C1841f r2 = (C1841f) this.f5858b;
        ((AbstractC1846e) r2.f6645b.m4175a()).clear();     // Catch: IOException -> L9
        return;
    L9:
        e = move-exception;
        r2.f6644a.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to clear breadcrumbs from file queue", e);
        return;
    L12:
        C1798s r02 = (C1798s) this.f5858b;
        if (r02.f6519a.get() == true) goto L221;
        Object r22 = C1824z.f6598b.getValue();     // Catch: Throwable -> L195
        if (r22 == null) goto L30;
        Field r3 = (Field) C1824z.f6599c.getValue();     // Catch: Throwable -> L195
        if (r3 == null) goto L220;
        ArrayList r4 = (ArrayList) r3.get(r22);     // Catch: Throwable -> L195
        C1981r r5 = r02.f6520b.m4173a();     // Catch: Throwable -> L195
        C1797r r03 = r02.f6522d;     // Catch: Throwable -> L24
        r03.addAll(r4);     // Catch: Throwable -> L24
        goto L223
    L22:
        AbstractC0714Qj.m1489k(r5, null);     // Catch: Throwable -> L195
        r3.set(r22, r03);     // Catch: Throwable -> L195
        return;
    L24:
        th = move-exception;
        throw th;     // Catch: Throwable -> L27
    L27:
        th = move-exception;
        AbstractC0714Qj.m1489k(r5, th);     // Catch: Throwable -> L195
        throw th;     // Catch: Throwable -> L195
    L220:
        return;
    L30:
        return;
    L223:
        return;
    L221:
        return;
    L31:
        ReplayIntegration r04 = (ReplayIntegration) this.f5858b;
        C2046v2 r23 = r04.f6384c;
        if (r23 != null) goto L34;
        r23 = null;
    L34:
        C1841f r24 = r23.findPersistingScopeObserver();
        if (r24 == null) goto L166;
        C2046v2 r52 = r04.f6384c;
        if (r52 != null) goto L39;
        r52 = null;
    L39:
        String r53 = (String) r24.m4015g(r52, "replay.json", String.class);
        if (r53 == null) goto L166;
        C1970t r11 = new C1970t(r53);
        if (r11.equals(C1970t.f7011b) == false) goto L45;
        r04.m3945q("");
        return;
    L45:
        C2046v2 r6 = r04.f6384c;
        if (r6 != null) goto L48;
        r6 = null;
    L48:
        String r7 = r6.getCacheDirPath();
        if (r7 != null) goto L51;
    L54:
        r6.getLogger().mo3680e(EnumC1657a2.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
        File r72 = null;
    L55:
        File r9 = new File(r72, ".ongoing_segment");
        if (r9.exists() == true) goto L59;
        r6.getLogger().mo3680e(EnumC1657a2.DEBUG, "No ongoing segment found for replay: %s", new Object[]{r11});
        AbstractC1856a.m4060f(r72);
    L58:
        C1780d r32 = null;
    L143:
        if (r32 != null) goto L145;
        r04.m3945q("");
        return;
    L145:
        C2046v2 r42 = r04.f6384c;
        if (r42 != null) goto L148;
        r42 = null;
    L148:
        Object r25 = r24.m4015g(r42, "breadcrumbs.json", List.class);
        if ((r25 instanceof List) == false) goto L151;
        List r20 = (List) r25;
    L152:
        C2054w1 r62 = r04.f6385d;
        C2046v2 r26 = r04.f6384c;
        if (r26 != null) goto L155;
        C2046v2 r73 = null;
    L156:
        long r8 = r32.f6475e;
        Date r10 = r32.f6473c;
        int r12 = r32.f6474d;
        C1821w r27 = r32.f6471a;
        int r13 = r27.f6590b;
        int r14 = r27.f6589a;
        int r43 = r27.f6593e;
        int r28 = r27.f6594f;
        AbstractC1775m r29 = C1772j.m3965a(r62, r73, r8, r10, r11, r12, r13, r14, r32.f6476f, r32.f6472b, r43, r28, r32.f6477g, r20, new LinkedList(r32.f6478h));
        if ((r29 instanceof C1773k) == false) goto L161;
        C1586H r33 = AbstractC1856a.m4059e(new C1792m());
        C1773k r210 = (C1773k) r29;
        C2054w1 r44 = r04.f6385d;
        if (r44 == null) goto L161;
        C2059x2 r63 = r210.f6459a;
        r33.f5735g = r210.f6460b;
        r44.mo3721p(r63, r33);
    L161:
        r04.m3945q(r53);
        return;
    L155:
        r73 = r26;
        goto L156
    L151:
        r20 = null;
        goto L152
    L59:
        LinkedHashMap r102 = new LinkedHashMap();
        BufferedReader r92 = new BufferedReader(new InputStreamReader(new FileInputStream(r9), AbstractC2659w7.f9201a), 8192);
        Iterator r122 = new C1216bb(new C2381po(0, r92)).iterator();     // Catch: Throwable -> L65
    L61:
        if (r122.hasNext() == false) goto L67;
        List r34 = AbstractC2564tz.m5065Z((String) r122.next(), new String[]{"="}, 2);     // Catch: Throwable -> L65
        r102.put((String) r34.get(0), (String) r34.get(1));     // Catch: Throwable -> L65
        goto L61
    L67:
        r92.close();
        String r35 = (String) r102.get("config.height");
        if (r35 == null) goto L70;
        Integer r36 = AbstractC0042Az.m61H(r35);
    L71:
        String r93 = (String) r102.get("config.width");
        if (r93 == null) goto L74;
        Integer r94 = AbstractC0042Az.m61H(r93);
    L75:
        String r123 = (String) r102.get("config.frame-rate");
        if (r123 == null) goto L78;
        Integer r124 = AbstractC0042Az.m61H(r123);
    L79:
        String r132 = (String) r102.get("config.bit-rate");
        if (r132 == null) goto L82;
        Integer r133 = AbstractC0042Az.m61H(r132);
    L83:
        String r15 = (String) r102.get("segment.id");
        if (r15 == null) goto L86;
        Integer r152 = AbstractC0042Az.m61H(r15);
    L197:
        String r82 = (String) r102.get("segment.timestamp");     // Catch: Throwable -> L92
        if (r82 != null) goto L90;
        r82 = "";
    L90:
        Date r83 = AbstractC1856a.m4069o(r82);     // Catch: Throwable -> L92
    L201:
        String r142 = (String) r102.get("replay.type");     // Catch: Throwable -> L98
        if (r142 != null) goto L96;
        r142 = "";
    L96:
        EnumC2055w2 r143 = EnumC2055w2.valueOf(r142);     // Catch: Throwable -> L98
    L99:
        if (r36 == null) goto L141;
        if (r94 == null) goto L141;
        if (r124 == null) goto L141;
        if (r133 == null) goto L141;
        if (r152 == null) goto L141;
        Integer r19 = r36;
        File r202 = r72;
        if (r152.intValue() == (-1)) goto L108;
        if (r83 == null) goto L108;
        if (r143 == null) goto L108;
        C1821w r21 = new C1821w(r94.intValue(), r19.intValue(), 1.0f, 1.0f, r124.intValue(), r133.intValue());
        C1789j r37 = new C1789j(r6, r11);
        ArrayList r74 = r37.f6505h;
        File r95 = r37.m3972f();
        if (r95 == null) goto L112;
        C2046v2 r192 = r6;
        r95.listFiles(new C2025u(1, r37));
    L114:
        if (r74.isEmpty() == false) goto L117;
        r192.getLogger().mo3680e(EnumC1657a2.DEBUG, "No frames found for replay: %s, deleting the replay", new Object[]{r11});
        AbstractC1856a.m4060f(r202);
        goto L58
    L117:
        if (r74.size() <= 1) goto L121;
        C1782f r64 = new C1782f(0);
        if (r74.size() <= 1) goto L121;
        Collections.sort(r74, r64);
    L121:
        EnumC2055w2 r65 = EnumC2055w2.SESSION;
        if (r143 != r65) goto L124;
        int r232 = r152.intValue();
    L125:
        if (r143 != r65) goto L127;
    L126:
        Date r222 = r83;
        long r242 = (((C1790k) AbstractC2453ra.m4902l0(r74)).f6509b - r222.getTime()) + ((long) (1000 / r124.intValue()));
        String r66 = (String) r102.get("replay.recording");
        if (r66 == null) goto L139;
        C1927m1 r67 = (C1927m1) r192.getSerializer().mo3607a(new StringReader(r66), C1927m1.class);
        if (r67 == null) goto L133;
        List r75 = r67.f6818b;
    L134:
        if (r75 == null) goto L136;
        List r76 = new LinkedList(r67.f6818b);
    L137:
        if (r76 == null) goto L139;
    L140:
        r32 = new C1780d(r21, r37, r222, r232, r242, r143, (String) r102.get("replay.screen-at-start"), AbstractC2453ra.m4904n0(r76, new C1782f(1)));
        goto L143
    L136:
        r76 = null;
        goto L137
    L133:
        r75 = null;
    L139:
        r76 = C0452Kf.f1484a;
        goto L140
    L127:
        r83 = AbstractC1856a.m4068n(((C1790k) AbstractC2453ra.m4898h0(r74)).f6509b);
        goto L126
    L124:
        r232 = 0;
        goto L125
    L112:
        r192 = r6;
    L108:
        C2046v2 r193 = r6;
    L142:
        r193.getLogger().mo3680e(EnumC1657a2.DEBUG, "Incorrect segment values found for replay: %s, deleting the replay", new Object[]{r11});
        AbstractC1856a.m4060f(r202);
    L141:
        r193 = r6;
        r202 = r72;
    L98:
        r143 = null;
    L92:
        r83 = null;
        goto L201
    L86:
        r152 = null;
        goto L197
    L82:
        r133 = null;
        goto L83
    L78:
        r124 = null;
        goto L79
    L74:
        r94 = null;
        goto L75
    L70:
        r36 = null;
    L65:
        th = move-exception;
        throw th;     // Catch: Throwable -> L163
    L163:
        th = move-exception;
        AbstractC0585Nj.m1138f(r92, th);
        throw th;
    L51:
        if (r7.length() == 0) goto L54;
        r72 = new File(r6.getCacheDirPath(), "replay_" + r11);
        r72.mkdirs();
    L166:
        r04.m3945q("");
        return;
    L168:
        ((C1909f) this.f5858b).mo4116a();
        return;
    L170:
        ((SystemEventsBreadcrumbsIntegration) this.f5858b).m3856l();
        return;
    L172:
        C1661D r05 = (C1661D) this.f5858b;
        if (r05 == null) goto L227;
        ProcessLifecycleOwner.f3964i.f3970f.mo1556b(r05);
        return;
    L227:
        return;
    L176:
        ((C1734p) this.f5858b).m3910a(null, true);
        return;
    L178:
        ((C1696g) this.f5858b).m3876e(true);
        return;
    L180:
        C0584Ni r06 = ((FrameMetricsAggregator) ((C0252Fu) this.f5858b).f819a).f3910a;
        ArrayList r211 = (ArrayList) r06.f1894c;
        int r38 = r211.size() - 1;
    L181:
        if (r38 < 0) goto L186;
        WeakReference r45 = (WeakReference) r211.get(r38);
        Activity r54 = (Activity) r45.get();
        if (r45.get() == null) goto L185;
        r54.getWindow().removeOnFrameMetricsAvailableListener((WindowOnFrameMetricsAvailableListenerC0541Mi) r06.f1895d);
        r211.remove(r38);
    L185:
        r38 = r38 - 1;
        goto L181
    L186:
        return;
    L187:
        C1683a r07 = (C1683a) this.f5858b;
        r07.f6078h = SystemClock.uptimeMillis();
        r07.f6079i.set(false);
        return;
    L189:
        C1638U1 r08 = (C1638U1) this.f5858b;
        ScheduledThreadPoolExecutor r212 = (ScheduledThreadPoolExecutor) r08.f5871a;
        int r39 = 0;
    L191:
        if (r39 >= 40) goto L193;
        r212.schedule((RunnableC2531t8) r08.f5873c, 365, TimeUnit.DAYS).cancel(true);     // Catch: RejectedExecutionException -> L196
        r39 = r39 + 1;     // Catch: RejectedExecutionException -> L196
    L228:
        return;
    L193:
        r212.purge();     // Catch: RejectedExecutionException -> L196
    }

    public /* synthetic */ RunnableC1631S1(C1683a r1, C2438r1 r2) {
        this.f5857a = 1;
        this.f5858b = r1;
    }

    public /* synthetic */ RunnableC1631S1(C1662E r1, C1661D r2) {
        this.f5857a = 5;
        this.f5858b = r2;
    }
}
