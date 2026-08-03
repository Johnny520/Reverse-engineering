package com.abc.core.runtime;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.RunnableC0486k;
import com.abc.core.status.FeatureInstallResult;
import com.abc.core.status.FeatureStatusRegistry;
import com.abc.internal.probe.AppFingerprint;
import com.abc.internal.probe.DiagnosticItem;
import com.abc.internal.probe.DiagnosticLevel;
import com.abc.internal.probe.FeatureProbeCatalog;
import de.robv.android.xposed.AbstractC0762d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.AbstractC0040p;
import p001A0.RunnableC0028d;
import p007D0.C0137c;
import p007D0.C0140f;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.AbstractC0183n;
import p009E0.AbstractC0193x;
import p031Q0.AbstractC0307g;
import p037U.AbstractC0358S;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: f0.i */
/* JADX INFO: loaded from: classes.dex */
public final class HookDiagnostics {

    /* JADX INFO: renamed from: a */
    public static final HookDiagnostics f3000a = new HookDiagnostics();

    /* JADX INFO: renamed from: b */
    public static final Handler f3001b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    public static final AtomicBoolean f3002c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f3003d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static final AtomicBoolean f3004e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f */
    public static final AtomicInteger f3005f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    public static WeakReference f3006g;

    /* JADX INFO: renamed from: h */
    public static Context f3007h;

    /* JADX INFO: renamed from: i */
    public static ClassLoader f3008i;

    /* JADX INFO: renamed from: a */
    public static final void m2151a(Activity activity, String str) {
        f3006g = new WeakReference(activity);
        if (m2153c(activity)) {
            m2156f(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static Activity m2152b() {
        C0140f c0140fM116u;
        Object objInvoke;
        Object objM116u;
        Object objM116u2;
        try {
            objInvoke = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", null).invoke(null, null);
        } catch (Throwable th) {
            c0140fM116u = AbstractC0040p.m116u(th);
        }
        if (objInvoke == null) {
            return null;
        }
        Field declaredField = objInvoke.getClass().getDeclaredField("mActivities");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(objInvoke);
        Map map = obj instanceof Map ? (Map) obj : null;
        if (map == null) {
            return null;
        }
        for (Object obj2 : map.values()) {
            if (obj2 != null) {
                try {
                    Field declaredField2 = obj2.getClass().getDeclaredField("paused");
                    declaredField2.setAccessible(true);
                    objM116u = Boolean.valueOf(declaredField2.getBoolean(obj2));
                } catch (Throwable th2) {
                    objM116u = AbstractC0040p.m116u(th2);
                }
                Object obj3 = Boolean.TRUE;
                if (objM116u instanceof C0140f) {
                    objM116u = obj3;
                }
                if (((Boolean) objM116u).booleanValue()) {
                    continue;
                } else {
                    try {
                        Field declaredField3 = obj2.getClass().getDeclaredField("activity");
                        declaredField3.setAccessible(true);
                        Object obj4 = declaredField3.get(obj2);
                        objM116u2 = obj4 instanceof Activity ? (Activity) obj4 : null;
                    } catch (Throwable th3) {
                        objM116u2 = AbstractC0040p.m116u(th3);
                    }
                    if (objM116u2 instanceof C0140f) {
                        objM116u2 = null;
                    }
                    Activity activity = (Activity) objM116u2;
                    if (activity != null && !activity.isFinishing()) {
                        return activity;
                    }
                }
            }
        }
        c0140fM116u = null;
        return (Activity) (c0140fM116u instanceof C0140f ? null : c0140fM116u);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m2153c(Activity activity) {
        String name = activity.getClass().getName();
        if (name.equals("com.tencent.mm.ui.LauncherUI") || AbstractC0433r.m1028C0(name, ".LauncherUI")) {
            return true;
        }
        return AbstractC0425j.m1005J0(name, "LauncherUI", false) && AbstractC0425j.m1005J0(name, "tencent.mm", false);
    }

    /* JADX INFO: renamed from: d */
    public static String m2154d(String str, String str2, String str3) {
        List listM556h0 = AbstractC0182m.m556h0(str2, str3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM556h0) {
            if (!AbstractC0425j.m1013R0((String) obj)) {
                arrayList.add(obj);
            }
        }
        String strM546r0 = AbstractC0181l.m546r0(arrayList, " · ", null, null, null, 62);
        if (AbstractC0425j.m1013R0(str)) {
            return strM546r0;
        }
        return str + " · " + strM546r0;
    }

    /* JADX INFO: renamed from: e */
    public static AppFingerprint m2155e(AppFingerprint appFingerprint) {
        int iOrdinal;
        ConcurrentHashMap concurrentHashMap = FeatureStatusRegistry.f2728a;
        List listM1968h = FeatureStatusRegistry.m1968h();
        int iM563g0 = AbstractC0193x.m563g0(AbstractC0183n.m559k0(listM1968h, 10));
        if (iM563g0 < 16) {
            iM563g0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM563g0);
        for (Object obj : listM1968h) {
            linkedHashMap.put(((FeatureInstallResult) obj).f2719a, obj);
        }
        List<DiagnosticItem> list = appFingerprint.f1641d;
        ArrayList arrayList = new ArrayList(AbstractC0183n.m559k0(list, 10));
        for (DiagnosticItem diagnosticItemM1375a : list) {
            FeatureInstallResult featureInstallResult = (FeatureInstallResult) linkedHashMap.get(diagnosticItemM1375a.f1668a);
            if (featureInstallResult != null && (iOrdinal = featureInstallResult.f2720b.ordinal()) != 0) {
                DiagnosticLevel diagnosticLevel = DiagnosticLevel.f1666c;
                String str = diagnosticItemM1375a.f1671d;
                String str2 = featureInstallResult.f2721c;
                if (iOrdinal == 1) {
                    diagnosticItemM1375a = DiagnosticItem.m1375a(diagnosticItemM1375a, null, diagnosticLevel, m2154d(str, "运行时安装失败", str2), 3);
                } else if (iOrdinal == 2) {
                    diagnosticItemM1375a = DiagnosticItem.m1375a(diagnosticItemM1375a, null, diagnosticLevel, m2154d(str, "本次未安装", str2), 3);
                } else {
                    if (iOrdinal != 3) {
                        throw new C0137c();
                    }
                    if (diagnosticItemM1375a.f1670c != diagnosticLevel) {
                        diagnosticLevel = DiagnosticLevel.f1665b;
                    }
                    diagnosticItemM1375a = DiagnosticItem.m1375a(diagnosticItemM1375a, null, diagnosticLevel, m2154d(str, "运行时部分生效", str2), 3);
                }
            }
            arrayList.add(diagnosticItemM1375a);
        }
        String str3 = appFingerprint.f1638a;
        AbstractC0307g.m703e(str3, "fingerprint");
        String str4 = appFingerprint.f1639b;
        AbstractC0307g.m703e(str4, "wechatSummary");
        return new AppFingerprint(str3, str4, appFingerprint.f1640c, arrayList, appFingerprint.f1642e);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2156f(String str) {
        final Activity activity;
        Activity activity2;
        if (f3003d.get()) {
            return;
        }
        if (AbstractC0358S.f729i || AbstractC0358S.f728h) {
            WeakReference weakReference = f3006g;
            Activity activity3 = null;
            if (weakReference == null || (activity2 = (Activity) weakReference.get()) == null) {
                Activity activityM2152b = m2152b();
                if (activityM2152b != null && m2153c(activityM2152b)) {
                    activity3 = activityM2152b;
                }
                if (activity3 == null) {
                    return;
                } else {
                    activity = activity3;
                }
            } else {
                if (!m2153c(activity2) || activity2.isFinishing()) {
                    activity2 = null;
                }
                if (activity2 != null) {
                    activity = activity2;
                }
            }
            if (f3004e.compareAndSet(false, true)) {
                m2157g("start interactive scan (" + str + ")");
                Context applicationContext = f3007h;
                if (applicationContext == null) {
                    applicationContext = activity.getApplicationContext();
                }
                final Context context = applicationContext;
                ClassLoader classLoader = f3008i;
                if (classLoader == null) {
                    classLoader = activity.getClassLoader();
                }
                final ClassLoader classLoader2 = classLoader;
                final String str2 = AbstractC0805P.f2920a;
                final DialogC0823e dialogC0823e = new DialogC0823e(activity, FeatureProbeCatalog.f1659b.size());
                f3001b.post(new RunnableC0028d(9, dialogC0823e));
                new Thread(new Runnable() { // from class: f0.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = 0;
                        Context context2 = context;
                        ClassLoader classLoader3 = classLoader2;
                        String str3 = str2;
                        Handler handler = HookDiagnostics.f3001b;
                        HookDiagnostics hookDiagnostics = HookDiagnostics.f3000a;
                        DialogC0823e dialogC0823e2 = dialogC0823e;
                        AbstractC0307g.m703e(dialogC0823e2, "$progress");
                        Activity activity4 = activity;
                        AbstractC0307g.m703e(activity4, "$activity");
                        try {
                            AbstractC0307g.m700b(context2);
                            AbstractC0307g.m700b(classLoader3);
                            AppFingerprint appFingerprintM884e0 = AbstractC0358S.m884e0(context2, new C0817b(dialogC0823e2, i2), classLoader3, str3);
                            FeatureInstaller.m2123a("after-interactive-probe");
                            handler.post(new RunnableC0819c(dialogC0823e2, HookDiagnostics.m2155e(appFingerprintM884e0), activity4, i2));
                        } catch (Throwable th) {
                            HookDiagnostics.m2157g("probe crash: " + th.getMessage());
                            handler.post(new RunnableC0486k(dialogC0823e2, activity4, th, 4));
                        }
                    }
                }).start();
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m2157g(String str) {
        try {
            AbstractC0762d.m1954d("[OKK-CompatUi] " + str);
        } catch (Throwable th) {
            AbstractC0040p.m116u(th);
        }
    }
}
