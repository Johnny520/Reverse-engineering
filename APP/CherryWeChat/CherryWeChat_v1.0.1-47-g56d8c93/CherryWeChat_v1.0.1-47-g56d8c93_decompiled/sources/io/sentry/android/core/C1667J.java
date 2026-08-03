package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Looper;
import io.sentry.AbstractC1568C1;
import io.sentry.C1586H;
import io.sentry.C1627R1;
import io.sentry.C1874f2;
import io.sentry.C2059x2;
import io.sentry.C2065z0;
import io.sentry.CallableC1600K1;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.InterfaceC1566C;
import io.sentry.android.core.internal.util.C1716d;
import io.sentry.android.core.performance.C1740f;
import io.sentry.android.core.performance.C1741g;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1944A;
import io.sentry.protocol.C1948E;
import io.sentry.protocol.C1951a;
import io.sentry.protocol.C1953c;
import io.sentry.protocol.C1956f;
import io.sentry.protocol.C1963m;
import io.sentry.protocol.C1969s;
import io.sentry.protocol.C1974x;
import io.sentry.protocol.C1975y;
import io.sentry.protocol.C1976z;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import p000.C1037Y5;

/* JADX INFO: renamed from: io.sentry.android.core.J */
/* JADX INFO: loaded from: classes.dex */
public final class C1667J implements InterfaceC1566C {

    /* JADX INFO: renamed from: a */
    public final Context f5975a;

    /* JADX INFO: renamed from: b */
    public final C1666I f5976b;

    /* JADX INFO: renamed from: c */
    public final SentryAndroidOptions f5977c;

    /* JADX INFO: renamed from: d */
    public final Future f5978d;

    public C1667J(Context context, C1666I c1666i, SentryAndroidOptions sentryAndroidOptions) {
        new C2029a();
        Context applicationContext = context.getApplicationContext();
        this.f5975a = applicationContext != null ? applicationContext : context;
        this.f5976b = c1666i;
        AbstractC1856a.m4048D("The options object is required.", sentryAndroidOptions);
        this.f5977c = sentryAndroidOptions;
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f5978d = executorServiceNewSingleThreadExecutor.submit(new CallableC1600K1(4, this, sentryAndroidOptions));
        executorServiceNewSingleThreadExecutor.shutdown();
    }

    /* JADX INFO: renamed from: a */
    public final void m3836a(AbstractC1568C1 abstractC1568C1, C1586H c1586h) {
        PackageInfo packageInfo;
        Boolean bool;
        C1951a c1951aMo4122d = abstractC1568C1.f5605b.mo4122d();
        if (c1951aMo4122d == null) {
            c1951aMo4122d = new C1951a();
        }
        c1951aMo4122d.f6876e = (String) AbstractC1665H.f5970c.m97b(this.f5975a);
        C1741g c1741gM3915a = C1740f.m3914b().m3915a(this.f5977c);
        C1670M c1670m = null;
        if (c1741gM3915a.m3919b()) {
            c1951aMo4122d.f6873b = (c1741gM3915a.m3919b() ? new C1874f2(c1741gM3915a.f6321b * 1000000) : null) == null ? null : AbstractC1856a.m4068n(Double.valueOf(r2.f6720a / 1000000.0d).longValue());
        }
        if (!AbstractC1856a.m4076w(c1586h) && c1951aMo4122d.f6882k == null && (bool = C1662E.f5959e.f5963d) != null) {
            c1951aMo4122d.f6882k = Boolean.valueOf(!bool.booleanValue());
        }
        Context context = this.f5975a;
        SentryAndroidOptions sentryAndroidOptions = this.f5977c;
        ILogger logger = sentryAndroidOptions.getLogger();
        C1666I c1666i = this.f5976b;
        try {
            c1666i.getClass();
            packageInfo = Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096)) : context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (Throwable th) {
            logger.mo3683r(EnumC1657a2.ERROR, "Error getting package info.", th);
            packageInfo = null;
        }
        if (packageInfo != null) {
            c1666i.getClass();
            String string = Long.toString(packageInfo.getLongVersionCode());
            if (abstractC1568C1.f5615l == null) {
                abstractC1568C1.f5615l = string;
            }
            try {
                c1670m = (C1670M) this.f5978d.get();
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to retrieve device info", th2);
            }
            c1951aMo4122d.f6872a = packageInfo.packageName;
            c1951aMo4122d.f6877f = packageInfo.versionName;
            c1951aMo4122d.f6878g = Long.toString(packageInfo.getLongVersionCode());
            HashMap map = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str = strArr[i];
                    map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
                }
            }
            c1951aMo4122d.f6879h = map;
            if (c1670m != null) {
                try {
                    C1037Y5 c1037y5 = c1670m.f5987f;
                    if (c1037y5 != null) {
                        c1951aMo4122d.f6883l = Boolean.valueOf(c1037y5.f3310a);
                        String[] strArr2 = (String[]) c1037y5.f3311b;
                        if (strArr2 != null) {
                            c1951aMo4122d.f6884m = Arrays.asList(strArr2);
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        abstractC1568C1.f5605b.mo4130l(c1951aMo4122d);
    }

    /* JADX INFO: renamed from: b */
    public final void m3837b(AbstractC1568C1 abstractC1568C1, boolean z, boolean z2) {
        C1948E c1948e = abstractC1568C1.f5612i;
        if (c1948e == null) {
            c1948e = new C1948E();
            abstractC1568C1.f5612i = c1948e;
        }
        if (c1948e.f6850b == null) {
            c1948e.f6850b = AbstractC1675S.m3851a(this.f5975a);
        }
        String str = c1948e.f6852d;
        SentryAndroidOptions sentryAndroidOptions = this.f5977c;
        if (str == null && sentryAndroidOptions.isSendDefaultPii()) {
            c1948e.f6852d = "{{auto}}";
        }
        C1953c c1953c = abstractC1568C1.f5605b;
        C1956f c1956fMo4123e = c1953c.mo4123e();
        Future future = this.f5978d;
        if (c1956fMo4123e == null) {
            try {
                c1953c.mo4132n(((C1670M) future.get()).m3844a(z, z2));
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to retrieve device info", th);
            }
            C1963m c1963mMo4124f = c1953c.mo4124f();
            try {
                c1953c.mo4134p(((C1670M) future.get()).f5988g);
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to retrieve os system", th2);
            }
            if (c1963mMo4124f != null) {
                String str2 = c1963mMo4124f.f6969a;
                c1953c.mo4128j((str2 == null || str2.isEmpty()) ? "os_1" : "os_" + str2.trim().toLowerCase(Locale.ROOT), c1963mMo4124f);
            }
        }
        try {
            C1037Y5 c1037y5 = ((C1670M) future.get()).f5986e;
            if (c1037y5 != null) {
                HashMap map = new HashMap();
                map.put("isSideLoaded", String.valueOf(c1037y5.f3310a));
                String str3 = (String) c1037y5.f3311b;
                if (str3 != null) {
                    map.put("installerStore", str3);
                }
                for (Map.Entry entry : map.entrySet()) {
                    abstractC1568C1.m3606b((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th3) {
            sentryAndroidOptions.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting side loaded info.", th3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3838c(AbstractC1568C1 abstractC1568C1, C1586H c1586h) {
        if (AbstractC1856a.m4050F(c1586h)) {
            return true;
        }
        this.f5977c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", abstractC1568C1.f5604a);
        return false;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: d */
    public final C2059x2 mo3604d(C2059x2 c2059x2, C1586H c1586h) {
        boolean zM3838c = m3838c(c2059x2, c1586h);
        if (zM3838c) {
            m3836a(c2059x2, c1586h);
        }
        m3837b(c2059x2, false, zM3838c);
        return c2059x2;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A c1944a, C1586H c1586h) {
        boolean zM3838c = m3838c(c1944a, c1586h);
        if (zM3838c) {
            m3836a(c1944a, c1586h);
        }
        m3837b(c1944a, false, zM3838c);
        return c1944a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1627R1 mo3585i(C1627R1 c1627r1, C1586H c1586h) {
        C1975y c1975y;
        List list;
        boolean z;
        boolean zM3838c = m3838c(c1627r1, c1586h);
        if (zM3838c) {
            m3836a(c1627r1, c1586h);
            C2065z0 c2065z0 = c1627r1.f5848s;
            if ((c2065z0 != null ? c2065z0.f7297a : null) != null) {
                boolean zM4076w = AbstractC1856a.m4076w(c1586h);
                C2065z0 c2065z02 = c1627r1.f5848s;
                for (C1976z c1976z : c2065z02 != null ? c2065z02.f7297a : null) {
                    C1716d.f6223a.getClass();
                    Long l = c1976z.f7059a;
                    if (l != null) {
                        z = Looper.getMainLooper().getThread().getId() == l.longValue();
                    }
                    if (c1976z.f7064f == null) {
                        c1976z.f7064f = Boolean.valueOf(z);
                    }
                    if (!zM4076w && c1976z.f7066h == null) {
                        c1976z.f7066h = Boolean.valueOf(z);
                    }
                }
            }
        }
        m3837b(c1627r1, true, zM3838c);
        C2065z0 c2065z03 = c1627r1.f5849t;
        ArrayList arrayList = c2065z03 != null ? c2065z03.f7297a : null;
        if (arrayList != null && arrayList.size() > 1) {
            C1969s c1969s = (C1969s) arrayList.get(arrayList.size() - 1);
            if ("java.lang".equals(c1969s.f7006c) && (c1975y = c1969s.f7008e) != null && (list = c1975y.f7055a) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((C1974x) it.next()).f7038f)) {
                        Collections.reverse(arrayList);
                        break;
                    }
                }
            }
        }
        return c1627r1;
    }
}
