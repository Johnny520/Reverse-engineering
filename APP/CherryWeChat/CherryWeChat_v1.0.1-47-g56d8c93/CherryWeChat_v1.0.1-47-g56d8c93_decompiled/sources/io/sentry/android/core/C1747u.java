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

    public C1747u(Context context, C1666I c1666i, SentryAndroidOptions sentryAndroidOptions) {
        Context applicationContext = context.getApplicationContext();
        this.f6346a = applicationContext != null ? applicationContext : context;
        this.f6347b = sentryAndroidOptions;
        this.f6348c = c1666i;
        this.f6350e = sentryAndroidOptions.findPersistingScopeObserver();
        this.f6349d = new C1563B0(new C2002t(sentryAndroidOptions, 2));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m3926a(InterfaceC1884b interfaceC1884b) {
        if (interfaceC1884b instanceof InterfaceC1883a) {
            return "anr_background".equals(((InterfaceC1883a) interfaceC1884b).mo3925e());
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final Object m3927b(C2046v2 c2046v2, String str, Class cls) {
        C1841f c1841f = this.f6350e;
        if (c1841f == null) {
            return null;
        }
        return c1841f.m4015g(c2046v2, str, cls);
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A c1944a, C1586H c1586h) {
        return c1944a;
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x042a  */
    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1627R1 mo3585i(C1627R1 c1627r1, C1586H c1586h) {
        ArrayList arrayList;
        InterfaceC1884b interfaceC1884b;
        String str;
        String strM3851a;
        String str2;
        int i;
        DisplayMetrics displayMetrics;
        String strM3851a2;
        Object objM4072s = AbstractC1856a.m4072s(c1586h);
        boolean z = objM4072s instanceof InterfaceC1884b;
        SentryAndroidOptions sentryAndroidOptions = this.f6347b;
        if (!z) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.WARNING, "The event is not Backfillable, but has been passed to BackfillingEventProcessor, skipping.", new Object[0]);
            return c1627r1;
        }
        C1961k c1961k = new C1961k();
        InterfaceC1884b interfaceC1884b2 = (InterfaceC1884b) objM4072s;
        if (interfaceC1884b2.mo3937a()) {
            c1961k.f6954a = "AppExitInfo";
        } else {
            c1961k.f6954a = "HistoricalAppExitInfo";
        }
        ApplicationNotResponding applicationNotResponding = new ApplicationNotResponding(m3926a(interfaceC1884b2) ? "Background ANR" : "ANR", Thread.currentThread());
        C2065z0 c2065z0 = c1627r1.f5848s;
        ArrayList<C1976z> arrayList2 = c2065z0 != null ? c2065z0.f7297a : null;
        C1953c c1953c = c1627r1.f5605b;
        if (arrayList2 != null) {
            for (C1976z c1976z : arrayList2) {
                String str3 = c1976z.f7061c;
                if (str3 != null && str3.equals("main")) {
                    break;
                }
            }
            c1976z = null;
        } else {
            c1976z = null;
        }
        if (c1976z == null) {
            c1976z = new C1976z();
            c1976z.f7067i = new C1975y();
        }
        this.f6349d.getClass();
        C1975y c1975y = c1976z.f7067i;
        boolean z2 = true;
        if (c1975y == null) {
            arrayList = new ArrayList(0);
        } else {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(C1563B0.m3589k(applicationNotResponding, c1961k, c1976z.f7059a, c1975y.f7055a, true));
            arrayList = arrayList3;
        }
        c1627r1.f5849t = new C2065z0(arrayList);
        if (c1627r1.f5611h == null) {
            c1627r1.f5611h = "java";
        }
        C1963m c1963mMo4124f = c1953c.mo4124f();
        Context context = this.f6346a;
        c1953c.mo4134p(C1670M.m3842c(context, sentryAndroidOptions).f5988g);
        if (c1963mMo4124f != null) {
            String str4 = c1963mMo4124f.f6969a;
            c1953c.mo4128j((str4 == null || str4.isEmpty()) ? "os_1" : "os_" + str4.trim().toLowerCase(Locale.ROOT), c1963mMo4124f);
        }
        C1956f c1956fMo4123e = c1953c.mo4123e();
        C1666I c1666i = this.f6348c;
        if (c1956fMo4123e == null) {
            C1956f c1956f = new C1956f();
            c1956f.f6904b = Build.MANUFACTURER;
            c1956f.f6905c = Build.BRAND;
            c1956f.f6906d = AbstractC1665H.m3823a(sentryAndroidOptions.getLogger());
            c1956f.f6907e = Build.MODEL;
            c1956f.f6908f = Build.ID;
            c1956f.f6909g = Build.SUPPORTED_ABIS;
            ActivityManager.MemoryInfo memoryInfoM3824b = AbstractC1665H.m3824b(context, sentryAndroidOptions.getLogger());
            if (memoryInfoM3824b != null) {
                c1956f.f6915m = Long.valueOf(memoryInfoM3824b.totalMem);
            }
            c1956f.f6914l = c1666i.m3834b();
            ILogger logger = sentryAndroidOptions.getLogger();
            try {
                displayMetrics = context.getResources().getDisplayMetrics();
            } catch (Throwable th) {
                logger.mo3683r(EnumC1657a2.ERROR, "Error getting DisplayMetrics.", th);
                displayMetrics = null;
            }
            if (displayMetrics != null) {
                c1956f.f6923u = Integer.valueOf(displayMetrics.widthPixels);
                c1956f.f6924v = Integer.valueOf(displayMetrics.heightPixels);
                c1956f.f6925w = Float.valueOf(displayMetrics.density);
                c1956f.f6926x = Integer.valueOf(displayMetrics.densityDpi);
            }
            if (c1956f.f6894A == null) {
                try {
                    strM3851a2 = AbstractC1675S.m3851a(context);
                } catch (Throwable th2) {
                    sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting installationId.", th2);
                    strM3851a2 = null;
                }
                c1956f.f6894A = strM3851a2;
            }
            ArrayList arrayListM3903a = C1717e.f6225c.m3903a();
            if (!arrayListM3903a.isEmpty()) {
                c1956f.f6899F = Double.valueOf(((Integer) Collections.max(arrayListM3903a)).doubleValue());
                c1956f.f6898E = Integer.valueOf(arrayListM3903a.size());
            }
            c1953c.mo4132n(c1956f);
        }
        if (!interfaceC1884b2.mo3937a()) {
            sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "The event is Backfillable, but should not be enriched, skipping.", new Object[0]);
            return c1627r1;
        }
        if (c1627r1.f5607d == null) {
            c1627r1.f5607d = (C1964n) m3927b(sentryAndroidOptions, "request.json", C1964n.class);
        }
        if (c1627r1.f5612i == null) {
            c1627r1.f5612i = (C1948E) m3927b(sentryAndroidOptions, "user.json", C1948E.class);
        }
        Map map = (Map) m3927b(sentryAndroidOptions, "tags.json", Map.class);
        if (map != null) {
            if (c1627r1.f5608e == null) {
                c1627r1.f5608e = new HashMap(new HashMap(map));
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    if (!c1627r1.f5608e.containsKey(entry.getKey())) {
                        c1627r1.m3606b((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
        }
        List list = (List) m3927b(sentryAndroidOptions, "breadcrumbs.json", List.class);
        if (list != null) {
            List list2 = c1627r1.f5616m;
            if (list2 == null) {
                c1627r1.f5616m = new ArrayList(list);
            } else {
                list2.addAll(list);
            }
        }
        Map map2 = (Map) m3927b(sentryAndroidOptions, "extras.json", Map.class);
        if (map2 != null) {
            if (c1627r1.f5618o == null) {
                c1627r1.f5618o = new HashMap(new HashMap(map2));
            } else {
                for (Map.Entry entry2 : map2.entrySet()) {
                    if (!c1627r1.f5618o.containsKey(entry2.getKey())) {
                        c1627r1.f5618o.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
        }
        C1953c c1953c2 = (C1953c) m3927b(sentryAndroidOptions, "contexts.json", C1953c.class);
        if (c1953c2 != null) {
            for (Map.Entry entry3 : new C1953c(c1953c2).f6889a.entrySet()) {
                Object value = entry3.getValue();
                boolean z3 = z2;
                if ((!"trace".equals(entry3.getKey()) || !(value instanceof C1589H2)) && !c1953c.mo4119a(entry3.getKey())) {
                    c1953c.mo4128j((String) entry3.getKey(), value);
                }
                z2 = z3;
            }
        }
        String str5 = (String) m3927b(sentryAndroidOptions, "transaction.json", String.class);
        if (c1627r1.f5851v == null) {
            c1627r1.f5851v = str5;
        }
        List list3 = (List) m3927b(sentryAndroidOptions, "fingerprint.json", List.class);
        if (c1627r1.f5852w == null) {
            c1627r1.f5852w = list3 != null ? new ArrayList(list3) : null;
        }
        boolean zM3926a = m3926a(interfaceC1884b2);
        if (c1627r1.f5852w == null) {
            List listAsList = Arrays.asList("{{ default }}", zM3926a ? "background-anr" : "foreground-anr");
            c1627r1.f5852w = listAsList != null ? new ArrayList(listAsList) : null;
        }
        EnumC1657a2 enumC1657a2 = (EnumC1657a2) m3927b(sentryAndroidOptions, "level.json", EnumC1657a2.class);
        if (c1627r1.f5850u == null) {
            c1627r1.f5850u = enumC1657a2;
        }
        C1589H2 c1589h2 = (C1589H2) m3927b(sentryAndroidOptions, "trace.json", C1589H2.class);
        if (c1953c.mo4126h() == null && c1589h2 != null && c1589h2.f5739b != null && c1589h2.f5738a != null) {
            c1953c.mo4138t(c1589h2);
        }
        String str6 = (String) m3927b(sentryAndroidOptions, "replay.json", String.class);
        if (!new File(sentryAndroidOptions.getCacheDirPath(), AbstractC0213Ey.m420r("replay_", str6)).exists()) {
            String str7 = (String) AbstractC1836a.m4002c(sentryAndroidOptions, ".options-cache", "replay-error-sample-rate.json", String.class);
            if (str7 != null) {
                try {
                    if (Double.parseDouble(str7) < AbstractC2036h.m4180a().m4179c()) {
                        sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.DEBUG, "Not capturing replay for ANR %s due to not being sampled.", c1627r1.f5604a);
                    } else {
                        File[] fileArrListFiles = new File(sentryAndroidOptions.getCacheDirPath()).listFiles();
                        if (fileArrListFiles != null) {
                            int length = fileArrListFiles.length;
                            long j = Long.MIN_VALUE;
                            int i2 = 0;
                            String strSubstring = null;
                            while (i2 < length) {
                                File file = fileArrListFiles[i2];
                                File[] fileArr = fileArrListFiles;
                                if (!file.isDirectory() || !file.getName().startsWith("replay_") || file.lastModified() <= j || file.lastModified() > ((Date) c1627r1.f5845p.clone()).getTime()) {
                                    i = length;
                                } else {
                                    long jLastModified = file.lastModified();
                                    String name = file.getName();
                                    i = length;
                                    j = jLastModified;
                                    strSubstring = name.substring(7);
                                }
                                i2++;
                                fileArrListFiles = fileArr;
                                length = i;
                            }
                            str6 = strSubstring;
                        } else {
                            str6 = null;
                        }
                        if (str6 != null) {
                        }
                    }
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error parsing replay sample rate.", th3);
                }
            }
        } else if (str6 != null) {
            Charset charset = C1841f.f6643c;
            AbstractC1836a.m4003d(sentryAndroidOptions, str6, ".scope-cache", "replay.json");
            c1953c.mo4128j("replay_id", str6);
        }
        if (c1627r1.f5609f == null) {
            c1627r1.f5609f = (String) AbstractC1836a.m4002c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (c1627r1.f5610g == null) {
            String environment = (String) AbstractC1836a.m4002c(sentryAndroidOptions, ".options-cache", "environment.json", String.class);
            if (environment == null) {
                environment = sentryAndroidOptions.getEnvironment();
            }
            c1627r1.f5610g = environment;
        }
        if (c1627r1.f5615l == null) {
            c1627r1.f5615l = (String) AbstractC1836a.m4002c(sentryAndroidOptions, ".options-cache", "dist.json", String.class);
        }
        if (c1627r1.f5615l == null && (str2 = (String) AbstractC1836a.m4002c(sentryAndroidOptions, ".options-cache", "release.json", String.class)) != null) {
            try {
                c1627r1.f5615l = str2.substring(str2.indexOf(43) + 1);
            } catch (Throwable unused) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to parse release from scope cache: %s", str2);
            }
        }
        C1954d c1954d = c1627r1.f5617n;
        if (c1954d == null) {
            c1954d = new C1954d();
        }
        if (c1954d.f6892b == null) {
            c1954d.f6892b = new ArrayList(new ArrayList());
        }
        List list4 = c1954d.f6892b;
        if (list4 != null) {
            String str8 = (String) AbstractC1836a.m4002c(sentryAndroidOptions, ".options-cache", "proguard-uuid.json", String.class);
            interfaceC1884b = interfaceC1884b2;
            if (str8 != null) {
                DebugImage debugImage = new DebugImage();
                str = "Error getting installationId.";
                debugImage.setType(DebugImage.PROGUARD);
                debugImage.setUuid(str8);
                list4.add(debugImage);
            } else {
                str = "Error getting installationId.";
            }
            c1627r1.f5617n = c1954d;
        } else {
            interfaceC1884b = interfaceC1884b2;
            str = "Error getting installationId.";
        }
        if (c1627r1.f5606c == null) {
            c1627r1.f5606c = (C1968r) AbstractC1836a.m4002c(sentryAndroidOptions, ".options-cache", "sdk-version.json", C1968r.class);
        }
        C1951a c1951aMo4122d = c1953c.mo4122d();
        if (c1951aMo4122d == null) {
            c1951aMo4122d = new C1951a();
        }
        C1951a c1951a = c1951aMo4122d;
        c1951a.f6876e = (String) AbstractC1665H.f5970c.m97b(context);
        c1951a.f6882k = Boolean.valueOf(!m3926a(interfaceC1884b));
        PackageInfo packageInfoM3825c = AbstractC1665H.m3825c(context, c1666i);
        if (packageInfoM3825c != null) {
            c1951a.f6872a = packageInfoM3825c.packageName;
        }
        String str9 = c1627r1.f5609f;
        if (str9 == null) {
            str9 = (String) AbstractC1836a.m4002c(sentryAndroidOptions, ".options-cache", "release.json", String.class);
        }
        if (str9 != null) {
            try {
                String strSubstring2 = str9.substring(str9.indexOf(64) + 1, str9.indexOf(43));
                String strSubstring3 = str9.substring(str9.indexOf(43) + 1);
                c1951a.f6877f = strSubstring2;
                c1951a.f6878g = strSubstring3;
            } catch (Throwable unused2) {
                sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.WARNING, "Failed to parse release from scope cache: %s", str9);
            }
        }
        try {
            C1037Y5 c1037y5 = C1670M.m3842c(context, sentryAndroidOptions).f5987f;
            if (c1037y5 != null) {
                c1951a.f6883l = Boolean.valueOf(c1037y5.f3310a);
                String[] strArr = (String[]) c1037y5.f3311b;
                if (strArr != null) {
                    c1951a.f6884m = Arrays.asList(strArr);
                }
            }
        } catch (Throwable th4) {
            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting split apks info.", th4);
        }
        c1953c.mo4130l(c1951a);
        Map map3 = (Map) AbstractC1836a.m4002c(sentryAndroidOptions, ".options-cache", "tags.json", Map.class);
        if (map3 != null) {
            if (c1627r1.f5608e == null) {
                c1627r1.f5608e = new HashMap(new HashMap(map3));
            } else {
                for (Map.Entry entry4 : map3.entrySet()) {
                    if (!c1627r1.f5608e.containsKey(entry4.getKey())) {
                        c1627r1.m3606b((String) entry4.getKey(), (String) entry4.getValue());
                    }
                }
            }
        }
        C1948E c1948e = c1627r1.f5612i;
        if (c1948e == null) {
            c1948e = new C1948E();
            c1627r1.f5612i = c1948e;
        }
        C1948E c1948e2 = c1948e;
        if (c1948e2.f6850b == null) {
            try {
                strM3851a = AbstractC1675S.m3851a(context);
            } catch (Throwable th5) {
                sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, str, th5);
                strM3851a = null;
            }
            c1948e2.f6850b = strM3851a;
        }
        if (c1948e2.f6852d == null && sentryAndroidOptions.isSendDefaultPii()) {
            c1948e2.f6852d = "{{auto}}";
        }
        try {
            C1037Y5 c1037y52 = C1670M.m3842c(context, sentryAndroidOptions).f5986e;
            if (c1037y52 != null) {
                HashMap map4 = new HashMap();
                map4.put("isSideLoaded", String.valueOf(c1037y52.f3310a));
                String str10 = (String) c1037y52.f3311b;
                if (str10 != null) {
                    map4.put("installerStore", str10);
                }
                for (Map.Entry entry5 : map4.entrySet()) {
                    c1627r1.m3606b((String) entry5.getKey(), (String) entry5.getValue());
                }
            }
        } catch (Throwable th6) {
            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting side loaded info.", th6);
        }
        return c1627r1;
    }
}
