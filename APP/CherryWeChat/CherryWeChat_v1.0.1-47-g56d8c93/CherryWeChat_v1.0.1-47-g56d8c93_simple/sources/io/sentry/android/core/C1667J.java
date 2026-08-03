package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
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
import java.util.Date;
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

    public C1667J(Context r2, C1666I r3, SentryAndroidOptions r4) {
        new C2029a();
        Context r0 = r2.getApplicationContext();
        if (r0 == null) goto L5;
        r2 = r0;
    L5:
        this.f5975a = r2;
        this.f5976b = r3;
        AbstractC1856a.m4048D("The options object is required.", r4);
        this.f5977c = r4;
        ExecutorService r22 = Executors.newSingleThreadExecutor();
        this.f5978d = r22.submit(new CallableC1600K1(4, this, r4));
        r22.shutdown();
    }

    /* JADX INFO: renamed from: a */
    public final void m3836a(AbstractC1568C1 r9, C1586H r10) {
        C1951a r0 = r9.f5605b.mo4122d();
        if (r0 != null) goto L5;
        r0 = new C1951a();
    L5:
        r0.f6876e = (String) AbstractC1665H.f5970c.m97b(this.f5975a);
        C1741g r1 = C1740f.m3914b().m3915a(this.f5977c);
        C1670M r3 = null;
        if (r1.m3919b() == false) goto L16;
        if (r1.m3919b() == false) goto L10;
        C1874f2 r2 = new C1874f2(r1.f6321b * 1000000);
    L11:
        if (r2 != null) goto L13;
        Date r12 = null;
    L14:
        r0.f6873b = r12;
        goto L16
    L13:
        r12 = AbstractC1856a.m4068n(Double.valueOf(r2.f6720a / 1000000.0d).longValue());
        goto L14
    L10:
        r2 = null;
    L16:
        if (AbstractC1856a.m4076w(r10) == false) goto L18;
    L22:
        Context r102 = this.f5975a;
        SentryAndroidOptions r13 = this.f5977c;
        ILogger r22 = r13.getLogger();
        C1666I r4 = this.f5976b;
        r4.getClass();     // Catch: Throwable -> L26
        if (Build.VERSION.SDK_INT < 33) goto L28;
        PackageInfo r103 = AbstractC1664G.m3818b(r102.getPackageManager(), r102.getPackageName(), AbstractC1664G.m3821e(4096));     // Catch: Throwable -> L26
    L64:
    L31:
        if (r103 == null) goto L61;
        r4.getClass();
        String r23 = Long.toString(r103.getLongVersionCode());
        if (r9.f5615l != null) goto L69;
        r9.f5615l = r23;
    L69:
        r3 = (C1670M) this.f5978d.get();     // Catch: Throwable -> L37
    L39:
        r0.f6872a = r103.packageName;
        r0.f6877f = r103.versionName;
        r0.f6878g = Long.toString(r103.getLongVersionCode());
        HashMap r14 = new HashMap();
        String[] r24 = r103.requestedPermissions;
        int[] r104 = r103.requestedPermissionsFlags;
        if (r24 != null) goto L42;
    L54:
        r0.f6879h = r14;
        if (r3 == null) goto L61;
        C1037Y5 r105 = r3.f5987f;     // Catch: Throwable -> L63
        if (r105 == null) goto L61;
        r0.f6883l = Boolean.valueOf(r105.f3310a);     // Catch: Throwable -> L63
        String[] r106 = (String[]) r105.f3311b;     // Catch: Throwable -> L63
        if (r106 == null) goto L61;
        r0.f6884m = Arrays.asList(r106);     // Catch: Throwable -> L63
        goto L61
    L42:
        if (r24.length <= 0) goto L54;
        if (r104 == null) goto L54;
        if (r104.length <= 0) goto L54;
        int r42 = 0;
    L48:
        if (r42 >= r24.length) goto L54;
        String r5 = r24[r42];
        String r52 = r5.substring(r5.lastIndexOf(46) + 1);
        if ((r104[r42] & 2) != 2) goto L52;
        String r6 = "granted";
    L53:
        r14.put(r52, r6);
        r42 = r42 + 1;
        goto L48
    L52:
        r6 = "not_granted";
    L37:
        th = move-exception;
        r13.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to retrieve device info", th);
    L61:
        r9.f5605b.mo4130l(r0);
        return;
    L28:
        r103 = r102.getPackageManager().getPackageInfo(r102.getPackageName(), 4096);     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        r22.mo3683r(EnumC1657a2.ERROR, "Error getting package info.", th);
        r103 = null;
        goto L31
    L18:
        if (r0.f6882k != null) goto L22;
        if (C1662E.f5959e.f5963d == null) goto L22;
        r0.f6882k = Boolean.valueOf(!r10.booleanValue());
        goto L22
    }

    /* JADX INFO: renamed from: b */
    public final void m3837b(AbstractC1568C1 r7, boolean r8, boolean r9) {
        C1948E r0 = r7.f5612i;
        if (r0 != null) goto L6;
        r0 = new C1948E();
        r7.f5612i = r0;
    L6:
        if (r0.f6850b != null) goto L8;
        r0.f6850b = AbstractC1675S.m3851a(this.f5975a);
    L8:
        String r1 = r0.f6852d;
        SentryAndroidOptions r2 = this.f5977c;
        if (r1 == null) goto L11;
    L13:
        C1953c r02 = r7.f5605b;
        C1956f r12 = r02.mo4123e();
        Future r3 = this.f5978d;
        if (r12 == null) goto L49;
    L45:
        C1037Y5 r82 = ((C1670M) r3.get()).f5986e;     // Catch: Throwable -> L42
        if (r82 == null) goto L52;
        HashMap r92 = new HashMap();     // Catch: Throwable -> L42
        r92.put("isSideLoaded", String.valueOf(r82.f3310a));     // Catch: Throwable -> L42
        String r83 = (String) r82.f3311b;     // Catch: Throwable -> L42
        if (r83 == null) goto L37;
        r92.put("installerStore", r83);     // Catch: Throwable -> L42
    L37:
        Iterator r84 = r92.entrySet().iterator();     // Catch: Throwable -> L42
    L38:
        if (r84.hasNext() == false) goto L53;
        Map.Entry r93 = (Map.Entry) r84.next();     // Catch: Throwable -> L42
        r7.m3606b((String) r93.getKey(), (String) r93.getValue());     // Catch: Throwable -> L42
        goto L38
    L53:
        return;
    L52:
        return;
    L42:
        th = move-exception;
        r2.getLogger().mo3683r(EnumC1657a2.ERROR, "Error getting side loaded info.", th);
        return;
    L49:
        r02.mo4132n(((C1670M) r3.get()).m3844a(r8, r9));     // Catch: Throwable -> L17
    L19:
        C1963m r85 = r02.mo4124f();
        r02.mo4134p(((C1670M) r3.get()).f5988g);     // Catch: Throwable -> L22
    L24:
        if (r85 == null) goto L45;
        String r94 = r85.f6969a;
        if (r94 != null) goto L28;
    L30:
        String r95 = "os_1";
    L31:
        r02.mo4128j(r95, r85);
        goto L45
    L28:
        if (r94.isEmpty() == true) goto L30;
        r95 = "os_" + r94.trim().toLowerCase(Locale.ROOT);
    L22:
        th = move-exception;
        r2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to retrieve os system", th);
    L17:
        th = move-exception;
        r2.getLogger().mo3683r(EnumC1657a2.ERROR, "Failed to retrieve device info", th);
        goto L19
    L11:
        if (r2.isSendDefaultPii() == false) goto L13;
        r0.f6852d = "{{auto}}";
        goto L13
    }

    /* JADX INFO: renamed from: c */
    public final boolean m3838c(AbstractC1568C1 r3, C1586H r4) {
        if (AbstractC1856a.m4050F(r4) == false) goto L6;
        return true;
    L6:
        this.f5977c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", new Object[]{r3.f5604a});
        return false;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: d */
    public final C2059x2 mo3604d(C2059x2 r2, C1586H r3) {
        boolean r0 = m3838c(r2, r3);
        if (r0 == false) goto L5;
        m3836a(r2, r3);
    L5:
        m3837b(r2, false, r0);
        return r2;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: f */
    public final C1944A mo3584f(C1944A r2, C1586H r3) {
        boolean r0 = m3838c(r2, r3);
        if (r0 == false) goto L5;
        m3836a(r2, r3);
    L5:
        m3837b(r2, false, r0);
        return r2;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 r10, C1586H r11) {
        boolean r0 = m3838c(r10, r11);
        ArrayList r1 = null;
        if (r0 == false) goto L29;
        m3836a(r10, r11);
        C2065z0 r3 = r10.f5848s;
        if (r3 == null) goto L7;
        ArrayList r32 = r3.f7297a;
    L8:
        if (r32 == null) goto L29;
        boolean r112 = AbstractC1856a.m4076w(r11);
        C2065z0 r33 = r10.f5848s;
        if (r33 == null) goto L12;
        ArrayList r34 = r33.f7297a;
    L13:
        Iterator r35 = r34.iterator();
    L15:
        if (r35.hasNext() == false) goto L29;
        C1976z r4 = (C1976z) r35.next();
        C1716d.f6223a.getClass();
        Long r5 = r4.f7059a;
        if (r5 != null) goto L19;
    L21:
        boolean r52 = false;
    L23:
        if (r4.f7064f != null) goto L25;
        r4.f7064f = Boolean.valueOf(r52);
    L25:
        if (r112 == true) goto L15;
        if (r4.f7066h != null) goto L15;
        r4.f7066h = Boolean.valueOf(r52);
        goto L15
    L19:
        if (Looper.getMainLooper().getThread().getId() != r5.longValue()) goto L21;
        r52 = true;
        goto L23
    L12:
        r34 = null;
        goto L13
    L7:
        r32 = null;
    L29:
        m3837b(r10, true, r0);
        C2065z0 r113 = r10.f5849t;
        if (r113 == null) goto L33;
        r1 = r113.f7297a;
    L33:
        if (r1 != null) goto L35;
    L48:
        return r10;
    L35:
        if (r1.size() <= 1) goto L48;
        C1969s r114 = (C1969s) r1.get(r1.size() - 1);
        if ("java.lang".equals(r114.f7006c) == false) goto L48;
        C1975y r115 = r114.f7008e;
        if (r115 == null) goto L48;
        List r116 = r115.f7055a;
        if (r116 == null) goto L48;
        Iterator r117 = r116.iterator();
    L44:
        if (r117.hasNext() == false) goto L48;
        if ("com.android.internal.os.RuntimeInit$MethodAndArgsCaller".equals(((C1974x) r117.next()).f7038f) == false) goto L44;
        Collections.reverse(r1);
        goto L48
    }
}
