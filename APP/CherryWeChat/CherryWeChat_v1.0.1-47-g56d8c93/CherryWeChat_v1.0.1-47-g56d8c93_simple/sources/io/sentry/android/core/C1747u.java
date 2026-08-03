package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.util.DisplayMetrics;
import io.sentry.C1563B0;
import io.sentry.C1586H;
import io.sentry.C1589H2;
import io.sentry.C1627R1;
import io.sentry.C2002t;
import io.sentry.C2046v2;
import io.sentry.C2065z0;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1566C;
import io.sentry.android.core.internal.util.C1717e;
import io.sentry.cache.AbstractC1836a;
import io.sentry.cache.C1841f;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.InterfaceC1883a;
import io.sentry.hints.InterfaceC1884b;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1948E;
import io.sentry.protocol.C1951a;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1954d;
import io.sentry.protocol.C1956f;
import io.sentry.protocol.C1961k;
import io.sentry.protocol.C1963m;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1968r;
import io.sentry.protocol.C1975y;
import io.sentry.protocol.C1976z;
import io.sentry.protocol.DebugImage;
import io.sentry.util.AbstractC2036h;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p000.AbstractC0213Ey;
import p000.C1037Y5;

/* JADX INFO: renamed from: io.sentry.android.core.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1747u implements InterfaceC1566C {

    /* JADX INFO: renamed from: a */
    public final Context f6346a;

    /* JADX INFO: renamed from: b */
    public final SentryAndroidOptions f6347b;

    /* JADX INFO: renamed from: c */
    public final C1666I f6348c;

    /* JADX INFO: renamed from: d */
    public final C1563B0 f6349d;

    /* JADX INFO: renamed from: e */
    public final C1841f f6350e;

    public C1747u(Context r2, C1666I r3, SentryAndroidOptions r4) {
        Context r0 = r2.getApplicationContext();
        if (r0 == null) goto L5;
        r2 = r0;
    L5:
        this.f6346a = r2;
        this.f6347b = r4;
        this.f6348c = r3;
        this.f6350e = r4.findPersistingScopeObserver();
        this.f6349d = new C1563B0(new C2002t(r4, 2));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3926a(InterfaceC1884b r1) {
        if ((r1 instanceof InterfaceC1883a) == true) goto L5;
        return false;
    L5:
        return "anr_background".equals(((InterfaceC1883a) r1).mo3925e());
    }

    /* JADX INFO: renamed from: b */
    public final Object m3927b(C2046v2 r2, String r3, Class r4) {
        C1841f r0 = this.f6350e;
        if (r0 != null) goto L7;
        return null;
    L7:
        return r0.m4015g(r2, r3, r4);
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A r1, C1586H r2) {
        return r1;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 r26, C1586H r27) {
        Object r0 = AbstractC1856a.m4072s(r27);
        boolean r3 = r0 instanceof InterfaceC1884b;
        SentryAndroidOptions r5 = this.f6347b;
        if (r3 == true) goto L6;
        r5.getLogger().mo3680e(EnumC1657a2.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
        return r26;
    L6:
        C1961k r32 = new C1961k();
        InterfaceC1884b r6 = (InterfaceC1884b) r0;
        if (r6.mo3937a() == true) goto L9;
        r32.f6954a = "HistoricalAppExitInfo";
    L11:
        if (m3926a(r6) == false) goto L13;
        String r02 = "Background ANR";
    L14:
        ApplicationNotResponding r7 = new ApplicationNotResponding(r02, Thread.currentThread());
        C2065z0 r03 = r26.f5848s;
        if (r03 == null) goto L17;
        ArrayList r04 = r03.f7297a;
    L18:
        C1953c r9 = r26.f5605b;
        if (r04 == null) goto L28;
        Iterator r05 = r04.iterator();
    L22:
        if (r05.hasNext() == false) goto L28;
        C1976z r10 = (C1976z) r05.next();
        String r11 = r10.f7061c;
        if (r11 == null) goto L22;
        if (r11.equals("main") == false) goto L22;
    L29:
        if (r10 != null) goto L31;
        r10 = new C1976z();
        r10.f7067i = new C1975y();
    L31:
        this.f6349d.getClass();
        C1975y r06 = r10.f7067i;
        boolean r112 = true;
        if (r06 != null) goto L34;
        ArrayList r07 = new ArrayList(0);
    L35:
        r26.f5849t = new C2065z0(r07);
        if (r26.f5611h != null) goto L38;
        r26.f5611h = "java";
    L38:
        C1963m r08 = r9.mo4124f();
        Context r33 = this.f6346a;
        r9.mo4134p(C1670M.m3842c(r33, r5).f5988g);
        if (r08 == null) goto L47;
        String r72 = r08.f6969a;
        if (r72 != null) goto L43;
    L45:
        String r73 = "os_1";
    L46:
        r9.mo4128j(r73, r08);
        goto L47
    L43:
        if (r72.isEmpty() == true) goto L45;
        r73 = "os_" + r72.trim().toLowerCase(Locale.ROOT);
    L47:
        C1956f r09 = r9.mo4123e();
        C1666I r102 = this.f6348c;
        if (r09 != null) goto L71;
        C1956f r12 = new C1956f();
        r12.f6904b = Build.MANUFACTURER;
        r12.f6905c = Build.BRAND;
        r12.f6906d = AbstractC1665H.m3823a(r5.getLogger());
        r12.f6907e = Build.MODEL;
        r12.f6908f = Build.ID;
        r12.f6909g = Build.SUPPORTED_ABIS;
        ActivityManager.MemoryInfo r010 = AbstractC1665H.m3824b(r33, r5.getLogger());
        if (r010 == null) goto L52;
        r12.f6915m = Long.valueOf(r010.totalMem);
    L52:
        r12.f6914l = r102.m3834b();
        ILogger r13 = r5.getLogger();
        DisplayMetrics r011 = r33.getResources().getDisplayMetrics();     // Catch: Throwable -> L55
    L57:
        if (r011 == null) goto L60;
        r12.f6923u = Integer.valueOf(r011.widthPixels);
        r12.f6924v = Integer.valueOf(r011.heightPixels);
        r12.f6925w = Float.valueOf(r011.density);
        r12.f6926x = Integer.valueOf(r011.densityDpi);
    L60:
        if (r12.f6894A == null) goto L302;
    L66:
        ArrayList r012 = C1717e.f6225c.m3903a();
        if (r012.isEmpty() == true) goto L69;
        r12.f6899F = Double.valueOf(((Integer) Collections.max(r012)).doubleValue());
        r12.f6898E = Integer.valueOf(r012.size());
    L69:
        r9.mo4132n(r12);
        goto L71
    L302:
        String r013 = AbstractC1675S.m3851a(r33);     // Catch: Throwable -> L63
    L65:
        r12.f6894A = r013;
    L63:
        th = move-exception;
        r5.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting installationId.", th);
        r013 = null;
    L55:
        th = move-exception;
        r13.mo3683r(EnumC1657a2.ERROR, "Error getting DisplayMetrics.", th);
        r011 = null;
    L71:
        if (r6.mo3937a() == true) goto L75;
        r5.getLogger().mo3680e(EnumC1657a2.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
        return r26;
    L75:
        if (r26.f5607d != null) goto L78;
        r26.f5607d = (C1964n) m3927b(r5, "request.json", C1964n.class);
    L78:
        if (r26.f5612i != null) goto L80;
        r26.f5612i = (C1948E) m3927b(r5, "user.json", C1948E.class);
    L80:
        Map r014 = (Map) m3927b(r5, "tags.json", Map.class);
        if (r014 != null) goto L84;
    L93:
        List r015 = (List) m3927b(r5, "breadcrumbs.json", List.class);
        if (r015 == null) goto L100;
        List r14 = r26.f5616m;
        if (r14 != null) goto L99;
        r26.f5616m = new ArrayList(r015);
        goto L100
    L99:
        r14.addAll(r015);
    L100:
        Map r016 = (Map) m3927b(r5, "extras.json", Map.class);
        if (r016 != null) goto L104;
    L112:
        C1953c r017 = (C1953c) m3927b(r5, "contexts.json", C1953c.class);
        if (r017 == null) goto L126;
        Iterator r018 = new C1953c(r017).f6889a.entrySet().iterator();
    L117:
        if (r018.hasNext() == false) goto L126;
        Map.Entry r8 = (Map.Entry) r018.next();
        Object r142 = r8.getValue();
        boolean r16 = r112;
        if ("trace".equals(r8.getKey()) == false) goto L124;
        if ((r142 instanceof C1589H2) == false) goto L124;
    L122:
        r112 = r16;
    L124:
        if (r9.mo4119a(r8.getKey()) == true) goto L122;
        r9.mo4128j((String) r8.getKey(), r142);
    L126:
        String r019 = (String) m3927b(r5, "transaction.json", String.class);
        if (r26.f5851v != null) goto L129;
        r26.f5851v = r019;
    L129:
        List r020 = (List) m3927b(r5, "fingerprint.json", List.class);
        if (r26.f5852w != null) goto L135;
        if (r020 == null) goto L133;
        ArrayList r4 = new ArrayList(r020);
    L134:
        r26.f5852w = r4;
        goto L135
    L133:
        r4 = null;
    L135:
        boolean r021 = m3926a(r6);
        if (r26.f5852w != null) goto L145;
        if (r021 == false) goto L139;
        String r022 = "background-anr";
    L140:
        List r023 = Arrays.asList(new String[]{"{{ default }}", r022});
        if (r023 == null) goto L143;
        ArrayList r42 = new ArrayList(r023);
    L144:
        r26.f5852w = r42;
        goto L145
    L143:
        r42 = null;
        goto L144
    L139:
        r022 = "foreground-anr";
    L145:
        EnumC1657a2 r024 = (EnumC1657a2) m3927b(r5, "level.json", EnumC1657a2.class);
        if (r26.f5850u != null) goto L148;
        r26.f5850u = r024;
    L148:
        C1589H2 r025 = (C1589H2) m3927b(r5, "trace.json", C1589H2.class);
        if (r9.mo4126h() != null) goto L156;
        if (r025 == null) goto L156;
        if (r025.f5739b == null) goto L156;
        if (r025.f5738a == null) goto L156;
        r9.mo4138t(r025);
    L156:
        String r43 = (String) m3927b(r5, "replay.json", String.class);
        if (new File(r5.getCacheDirPath(), AbstractC0213Ey.m420r("replay_", r43)).exists() == true) goto L185;
        String r1 = (String) AbstractC1836a.m4002c(r5, ".options-cache", "replay-error-sample-rate.json", String.class);
        if (r1 == null) goto L189;
    L165:
        th = move-exception;
        r5.getLogger().mo3683r(EnumC1657a2.ERROR, "Error parsing replay sample rate.", th);
        goto L189
    L162:
        if (Double.parseDouble(r1) >= AbstractC2036h.m4180a().m4179c()) goto L167;
        r5.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", new Object[]{r26.f5604a});     // Catch: Throwable -> L165
        goto L189
    L167:
        File[] r15 = new File(r5.getCacheDirPath()).listFiles();
        if (r15 == null) goto L183;
        int r44 = r15.length;
        long r18 = Long.MIN_VALUE;
        int r143 = 0;
        String r17 = null;
    L170:
        if (r143 >= r44) goto L182;
        File r20 = r15[r143];
        File[] r272 = r15;
        if (r20.isDirectory() == true) goto L174;
    L180:
        int r202 = r44;
    L181:
        r143 = r143 + 1;
        r15 = r272;
        r44 = r202;
        goto L170
    L174:
        if (r20.getName().startsWith("replay_") == false) goto L180;
        if (r20.lastModified() <= r18) goto L180;
        if (r20.lastModified() > ((Date) r26.f5845p.clone()).getTime()) goto L180;
        long r172 = r20.lastModified();
        String r19 = r20.getName();
        r202 = r44;
        r18 = r172;
        r17 = r19.substring(7);
        goto L181
    L182:
        r43 = r17;
        goto L185
    L183:
        r43 = null;
    L189:
        if (r26.f5609f != null) goto L192;
        r26.f5609f = (String) AbstractC1836a.m4002c(r5, ".options-cache", "release.json", String.class);
    L192:
        if (r26.f5610g != null) goto L199;
        String r026 = (String) AbstractC1836a.m4002c(r5, ".options-cache", "environment.json", String.class);
        if (r026 != null) goto L197;
        r026 = r5.getEnvironment();
    L197:
        r26.f5610g = r026;
    L199:
        if (r26.f5615l != null) goto L202;
        r26.f5615l = (String) AbstractC1836a.m4002c(r5, ".options-cache", "dist.json", String.class);
    L202:
        if (r26.f5615l != null) goto L208;
        String r027 = (String) AbstractC1836a.m4002c(r5, ".options-cache", "release.json", String.class);
        if (r027 == null) goto L208;
        r26.f5615l = r027.substring(r027.indexOf(43) + 1);     // Catch: Throwable -> L207
    L207:
        r5.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to parse release from scope cache: %s", new Object[]{r027});
    L208:
        C1954d r028 = r26.f5617n;
        if (r028 != null) goto L212;
        r028 = new C1954d();
    L212:
        if (r028.f6892b != null) goto L214;
        r028.f6892b = new ArrayList(new ArrayList());
    L214:
        List r144 = r028.f6892b;
        if (r144 == null) goto L221;
        String r152 = (String) AbstractC1836a.m4002c(r5, ".options-cache", "proguard-uuid.json", String.class);
        InterfaceC1884b r173 = r6;
        if (r152 == null) goto L219;
        DebugImage r62 = new DebugImage();
        String r182 = "Error getting installationId.";
        r62.setType(DebugImage.PROGUARD);
        r62.setUuid(r152);
        r144.add(r62);
    L220:
        r26.f5617n = r028;
    L223:
        if (r26.f5606c != null) goto L225;
        r26.f5606c = (C1968r) AbstractC1836a.m4002c(r5, ".options-cache", "sdk-version.json", C1968r.class);
    L225:
        C1951a r029 = r9.mo4122d();
        if (r029 != null) goto L228;
        r029 = new C1951a();
    L228:
        C1951a r63 = r029;
        r63.f6876e = (String) AbstractC1665H.f5970c.m97b(r33);
        r63.f6882k = Boolean.valueOf(!m3926a(r173));
        PackageInfo r030 = AbstractC1665H.m3825c(r33, r102);
        if (r030 == null) goto L231;
        r63.f6872a = r030.packageName;
    L231:
        String r031 = r26.f5609f;
        if (r031 != null) goto L235;
        r031 = (String) AbstractC1836a.m4002c(r5, ".options-cache", "release.json", String.class);
    L235:
        if (r031 != null) goto L288;
    L294:
        C1037Y5 r032 = C1670M.m3842c(r33, r5).f5987f;     // Catch: Throwable -> L246
        if (r032 == null) goto L248;
        r63.f6883l = Boolean.valueOf(r032.f3310a);     // Catch: Throwable -> L246
        String[] r033 = (String[]) r032.f3311b;     // Catch: Throwable -> L246
        if (r033 == null) goto L248;
        r63.f6884m = Arrays.asList(r033);     // Catch: Throwable -> L246
    L248:
        r9.mo4130l(r63);
        Map r034 = (Map) AbstractC1836a.m4002c(r5, ".options-cache", "tags.json", Map.class);
        if (r034 != null) goto L252;
    L260:
        C1948E r035 = r26.f5612i;
        if (r035 != null) goto L263;
        r035 = new C1948E();
        r26.f5612i = r035;
    L263:
        C1948E r110 = r035;
        if (r110.f6850b != null) goto L271;
        String r82 = AbstractC1675S.m3851a(r33);     // Catch: Throwable -> L267
    L269:
        r110.f6850b = r82;
    L267:
        th = move-exception;
        r5.getLogger().mo3683r(EnumC1657a2.ERROR, r182, th);
        r82 = null;
    L271:
        if (r110.f6852d == null) goto L273;
    L298:
        C1037Y5 r036 = C1670M.m3842c(r33, r5).f5986e;     // Catch: Throwable -> L285
        if (r036 == null) goto L287;
        HashMap r111 = new HashMap();     // Catch: Throwable -> L285
        r111.put("isSideLoaded", String.valueOf(r036.f3310a));     // Catch: Throwable -> L285
        String r037 = (String) r036.f3311b;     // Catch: Throwable -> L285
        if (r037 == null) goto L280;
        r111.put("installerStore", r037);     // Catch: Throwable -> L285
    L280:
        Iterator r038 = r111.entrySet().iterator();     // Catch: Throwable -> L285
    L281:
        if (r038.hasNext() == false) goto L287;
        Map.Entry r113 = (Map.Entry) r038.next();     // Catch: Throwable -> L285
        r26.m3606b((String) r113.getKey(), (String) r113.getValue());     // Catch: Throwable -> L285
    L287:
        return r26;
    L285:
        th = move-exception;
        r5.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting side loaded info.", th);
        goto L287
    L273:
        if (r5.isSendDefaultPii() == false) goto L298;
        r110.f6852d = "{{auto}}";
        goto L298
    L252:
        if (r26.f5608e != null) goto L254;
        r26.f5608e = new HashMap(new HashMap(r034));
        goto L260
    L254:
        Iterator r039 = r034.entrySet().iterator();
    L256:
        if (r039.hasNext() == false) goto L260;
        Map.Entry r114 = (Map.Entry) r039.next();
        if (r26.f5608e.containsKey(r114.getKey()) == true) goto L256;
        r26.m3606b((String) r114.getKey(), (String) r114.getValue());
    L246:
        th = move-exception;
        r5.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting split apks info.", th);
        goto L248
    L288:
        String r115 = r031.substring(r031.indexOf(64) + 1, r031.indexOf(43));     // Catch: Throwable -> L239
        String r74 = r031.substring(r031.indexOf(43) + 1);     // Catch: Throwable -> L239
        r63.f6877f = r115;     // Catch: Throwable -> L239
        r63.f6878g = r74;     // Catch: Throwable -> L239
    L239:
        r5.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to parse release from scope cache: %s", new Object[]{r031});
        goto L294
    L219:
        r182 = "Error getting installationId.";
        goto L220
    L221:
        r173 = r6;
        r182 = "Error getting installationId.";
    L185:
        if (r43 == null) goto L189;
        Charset r116 = C1841f.f6643c;
        AbstractC1836a.m4003d(r5, r43, ".scope-cache", "replay.json");
        r9.mo4128j("replay_id", r43);
        goto L189
    L104:
        if (r26.f5618o != null) goto L106;
        r26.f5618o = new HashMap(new HashMap(r016));
        goto L112
    L106:
        Iterator r040 = r016.entrySet().iterator();
    L108:
        if (r040.hasNext() == false) goto L112;
        Map.Entry r145 = (Map.Entry) r040.next();
        if (r26.f5618o.containsKey(r145.getKey()) == true) goto L108;
        r26.f5618o.put((String) r145.getKey(), r145.getValue());
        goto L108
    L84:
        if (r26.f5608e != null) goto L86;
        r26.f5608e = new HashMap(new HashMap(r014));
        goto L93
    L86:
        Iterator r041 = r014.entrySet().iterator();
    L88:
        if (r041.hasNext() == false) goto L93;
        Map.Entry r146 = (Map.Entry) r041.next();
        if (r26.f5608e.containsKey(r146.getKey()) == true) goto L88;
        r26.m3606b((String) r146.getKey(), (String) r146.getValue());
        goto L88
    L34:
        ArrayList r122 = new ArrayList(1);
        r122.add(C1563B0.m3589k(r7, r32, r10.f7059a, r06.f7055a, true));
        r07 = r122;
    L28:
        r10 = null;
        goto L29
    L17:
        r04 = null;
        goto L18
    L13:
        r02 = "ANR";
        goto L14
    L9:
        r32.f6954a = "AppExitInfo";
        goto L11
    }
}
