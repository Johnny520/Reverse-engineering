package com.abc.core.runtime;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.emoji2.text.RunnableC0488m;
import com.abc.core.features.BottomTabConfig;
import com.abc.core.features.C0581D1;
import com.abc.core.features.C0589G0;
import com.abc.core.features.C0593H1;
import com.abc.core.features.C0594I;
import com.abc.core.features.C0596I1;
import com.abc.core.features.C0599J1;
import com.abc.core.features.C0646c1;
import com.abc.core.features.C0648d0;
import com.abc.core.features.C0655f1;
import com.abc.core.features.C0684p0;
import com.abc.core.features.C0692s;
import com.abc.core.features.C0693s0;
import com.abc.core.features.C0695t;
import com.abc.core.features.C0698u;
import com.abc.core.features.C0704w;
import com.abc.core.features.C0707x;
import com.abc.core.features.ConfigStore;
import com.abc.core.features.DownloadRedirector;
import com.abc.core.features.FoldBannerPinHook;
import com.abc.core.features.HotUpdateBlocker;
import com.abc.core.features.InputStatsDatabase;
import com.abc.core.features.InputStatsMessageHook;
import com.abc.core.features.MessageActionDispatcher;
import com.abc.core.features.MomentsAdsBlocker;
import com.abc.core.features.PcAutoLoginConfig;
import com.abc.core.features.RunnableC0713z;
import com.abc.core.features.ThemeWallpaperConfig;
import com.abc.core.features.WallpaperOverlayHook;
import com.abc.core.hooks.ModuleLog;
import com.abc.core.status.FeatureStatusRegistry;
import com.abc.internal.probe.C0565o;
import com.abc.internal.probe.CompatibilityReport;
import com.abc.internal.probe.DexKitManager;
import com.abc.loader.ModernHookEntry;
import de.robv.android.xposed.AbstractC0762d;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.AbstractC0040p;
import p007D0.AbstractC0141g;
import p007D0.C0140f;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p009E0.AbstractC0181l;
import p009E0.AbstractC0182m;
import p009E0.C0172c;
import p009E0.C0180k;
import p009E0.C0190u;
import p026N0.C0266g;
import p026N0.C0268i;
import p029P0.InterfaceC0275a;
import p031Q0.AbstractC0307g;
import p031Q0.AbstractC0317q;
import p037U.AbstractC0358S;
import p040V0.AbstractC0407j;
import p040V0.C0401d;
import p040V0.C0402e;
import p042W0.AbstractC0425j;
import p042W0.AbstractC0433r;

/* JADX INFO: renamed from: f0.W */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class FeatureInstallTask implements InterfaceC0275a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2948a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f2949b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ClassLoader f2950c;

    public /* synthetic */ FeatureInstallTask(Context context, ClassLoader classLoader, int i2) {
        this.f2948a = i2;
        this.f2949b = context;
        this.f2950c = classLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112 A[Catch: all -> 0x0143, TryCatch #1 {all -> 0x0143, blocks: (B:43:0x0101, B:45:0x0112, B:47:0x0120, B:49:0x0126, B:51:0x0134, B:59:0x014a, B:56:0x0145), top: B:90:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a A[Catch: all -> 0x0143, TRY_LEAVE, TryCatch #1 {all -> 0x0143, blocks: (B:43:0x0101, B:45:0x0112, B:47:0x0120, B:49:0x0126, B:51:0x0134, B:59:0x014a, B:56:0x0145), top: B:90:0x0101 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0189 A[Catch: all -> 0x01b0, TryCatch #0 {all -> 0x01b0, blocks: (B:65:0x0178, B:67:0x0189, B:69:0x0197, B:71:0x019e, B:73:0x01ac, B:76:0x01b2, B:77:0x01b4, B:78:0x01b8, B:80:0x01be, B:81:0x01d0), top: B:88:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01be A[Catch: all -> 0x01b0, LOOP:3: B:78:0x01b8->B:80:0x01be, LOOP_END, TryCatch #0 {all -> 0x01b0, blocks: (B:65:0x0178, B:67:0x0189, B:69:0x0197, B:71:0x019e, B:73:0x01ac, B:76:0x01b2, B:77:0x01b4, B:78:0x01b8, B:80:0x01be, B:81:0x01d0), top: B:88:0x0178 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e1  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m2107a() {
        Object objM116u;
        Object objM116u2;
        Throwable thM465a;
        Object objM116u3;
        Throwable thM465a2;
        int length;
        int i2;
        Method method;
        Class<?> cls;
        Method method2;
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader classLoader = this.f2950c;
        AbstractC0307g.m703e(classLoader, "$cl");
        DownloadRedirector downloadRedirector = DownloadRedirector.f2022a;
        C0146l c0146l = C0146l.f339a;
        if (DownloadRedirector.f2023b.compareAndSet(false, true)) {
            DownloadRedirector.m1636e("installing...");
            try {
                cls = Class.forName("com.tencent.mm.sdk.platformtools.u6", false, classLoader);
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
                int length2 = declaredMethods.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        method2 = null;
                        break;
                    }
                    method2 = declaredMethods[i3];
                    if (AbstractC0307g.m699a(method2.getReturnType(), Boolean.TYPE) && method2.getParameterCount() == 5) {
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                        Class cls2 = (Class) AbstractC0179j.m537n0(0, parameterTypes);
                        if (AbstractC0307g.m699a(cls2 != null ? cls2.getName() : null, "android.content.Context")) {
                            Class<?>[] parameterTypes2 = method2.getParameterTypes();
                            AbstractC0307g.m702d(parameterTypes2, "getParameterTypes(...)");
                            Class cls3 = (Class) AbstractC0179j.m537n0(1, parameterTypes2);
                            if (AbstractC0307g.m699a(cls3 != null ? cls3.getName() : null, "java.lang.String")) {
                                Class<?>[] parameterTypes3 = method2.getParameterTypes();
                                AbstractC0307g.m702d(parameterTypes3, "getParameterTypes(...)");
                                Class cls4 = (Class) AbstractC0179j.m537n0(2, parameterTypes3);
                                if (AbstractC0307g.m699a(cls4 != null ? cls4.getName() : null, "java.lang.String")) {
                                    break;
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    i3++;
                }
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (method2 == null) {
                DownloadRedirector.m1636e("ScopedStorageUtil.c not found");
                try {
                    Method[] declaredMethods2 = Class.forName("com.tencent.mm.platformtools.ExportFileUtil", false, classLoader).getDeclaredMethods();
                    AbstractC0307g.m702d(declaredMethods2, "getDeclaredMethods(...)");
                    length = declaredMethods2.length;
                    i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            method = null;
                            break;
                        }
                        method = declaredMethods2[i2];
                        if (AbstractC0307g.m699a(method.getName(), "m") && method.getParameterCount() == 2 && AbstractC0307g.m699a(method.getParameterTypes()[0], Context.class) && AbstractC0307g.m699a(method.getParameterTypes()[1], String.class)) {
                            break;
                        }
                        i2++;
                    }
                    if (method != null) {
                        AbstractC0762d.m1952b(method, new C0648d0(1));
                        DownloadRedirector.m1636e("hooked ExportFileUtil.m");
                    }
                    objM116u2 = c0146l;
                } catch (Throwable th2) {
                    objM116u2 = AbstractC0040p.m116u(th2);
                }
                thM465a = AbstractC0141g.m465a(objM116u2);
                if (thM465a != null) {
                    DownloadRedirector.m1636e("locate ExportFileUtil fail: " + thM465a.getMessage());
                }
                try {
                    Method[] declaredMethods3 = Toast.class.getDeclaredMethods();
                    AbstractC0307g.m702d(declaredMethods3, "getDeclaredMethods(...)");
                    ArrayList<Method> arrayList = new ArrayList();
                    for (Method method3 : declaredMethods3) {
                        if (AbstractC0307g.m699a(method3.getName(), "makeText") && method3.getParameterTypes().length >= 2 && AbstractC0307g.m699a(method3.getParameterTypes()[1], CharSequence.class)) {
                            arrayList.add(method3);
                        }
                    }
                    for (Method method4 : arrayList) {
                        AbstractC0307g.m700b(method4);
                        AbstractC0762d.m1952b(method4, new C0648d0(2));
                    }
                    DownloadRedirector.m1636e("hooked Toast.makeText");
                    objM116u3 = c0146l;
                } catch (Throwable th3) {
                    objM116u3 = AbstractC0040p.m116u(th3);
                }
                thM465a2 = AbstractC0141g.m465a(objM116u3);
                if (thM465a2 != null) {
                    DownloadRedirector.m1636e("locate Toast.makeText fail: " + thM465a2.getMessage());
                }
            } else {
                AbstractC0762d.m1952b(method2, new C0648d0(0));
                DownloadRedirector.m1636e("hooked ScopedStorageUtil.c " + cls.getName() + "." + method2.getName());
                objM116u = c0146l;
                Throwable thM465a3 = AbstractC0141g.m465a(objM116u);
                if (thM465a3 != null) {
                    DownloadRedirector.m1636e("locate ScopedStorageUtil fail: " + thM465a3.getMessage());
                }
                Method[] declaredMethods22 = Class.forName("com.tencent.mm.platformtools.ExportFileUtil", false, classLoader).getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods22, "getDeclaredMethods(...)");
                length = declaredMethods22.length;
                i2 = 0;
                while (true) {
                    if (i2 < length) {
                    }
                    i2++;
                }
                if (method != null) {
                }
                objM116u2 = c0146l;
                thM465a = AbstractC0141g.m465a(objM116u2);
                if (thM465a != null) {
                }
                Method[] declaredMethods32 = Toast.class.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods32, "getDeclaredMethods(...)");
                ArrayList<Method> arrayList2 = new ArrayList();
                while (i < r7) {
                }
                while (r0.hasNext()) {
                }
                DownloadRedirector.m1636e("hooked Toast.makeText");
                objM116u3 = c0146l;
                thM465a2 = AbstractC0141g.m465a(objM116u3);
                if (thM465a2 != null) {
                }
            }
        }
        return c0146l;
    }

    /* JADX INFO: renamed from: c */
    private final Object m2108c() {
        Object objM116u;
        Object objM116u2;
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader classLoader = this.f2950c;
        AbstractC0307g.m703e(classLoader, "$cl");
        C0594I c0594i = C0594I.f1812a;
        int i2 = 0;
        if (C0594I.f1813b.compareAndSet(false, true)) {
            C0594I.m1472d("install hideTitle=" + BottomTabConfig.m1809d());
            try {
                objM116u = AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.LauncherUIBottomTabView");
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (objM116u instanceof C0140f) {
                objM116u = null;
            }
            Class cls = (Class) objM116u;
            if (cls == null) {
                C0594I.m1472d("class not found: com.tencent.mm.ui.LauncherUIBottomTabView");
            } else {
                Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
                AbstractC0307g.m702d(declaredConstructors, "getDeclaredConstructors(...)");
                int length = declaredConstructors.length;
                while (true) {
                    C0594I c0594i2 = C0594I.f1812a;
                    if (i2 < length) {
                        Constructor<?> constructor = declaredConstructors[i2];
                        try {
                            AbstractC0307g.m700b(constructor);
                            AbstractC0762d.m1952b(constructor, new InputStatsMessageHook(13));
                        } catch (Throwable th2) {
                            AbstractC0040p.m116u(th2);
                        }
                        i2++;
                    } else {
                        try {
                            break;
                        } catch (Throwable th3) {
                            objM116u2 = AbstractC0040p.m116u(th3);
                        }
                    }
                }
                objM116u2 = AbstractC0358S.m904q(cls, "onAttachedToWindow", new InputStatsMessageHook(14));
                if (AbstractC0141g.m465a(objM116u2) != null) {
                    try {
                        AbstractC0358S.m904q(View.class, "onAttachedToWindow", new InputStatsMessageHook(15));
                    } catch (Throwable th4) {
                        AbstractC0040p.m116u(th4);
                    }
                }
                C0594I.m1472d("hooked com.tencent.mm.ui.LauncherUIBottomTabView constructors/attach");
            }
        }
        return C0146l.f339a;
    }

    /* JADX INFO: renamed from: d */
    private final Object m2109d() {
        Object objM116u;
        Object objM116u2;
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader classLoader = this.f2950c;
        AbstractC0307g.m703e(classLoader, "$cl");
        C0599J1 c0599j1 = C0599J1.f1831a;
        C0146l c0146l = C0146l.f339a;
        if (C0599J1.f1832b.compareAndSet(false, true)) {
            Object obj = WallpaperOverlayHook.f1792a;
            ThemeWallpaperConfig.f1702b.addIfAbsent(new C0581D1(0));
            ThemeWallpaperConfig themeWallpaperConfig = ThemeWallpaperConfig.f1701a;
            ThemeWallpaperConfig.m1390g(true);
            boolean zM1393e = themeWallpaperConfig.m1393e();
            float fM1391a = themeWallpaperConfig.m1391a();
            ThemeWallpaperConfig.m1390g(false);
            C0599J1.m1485c("install wekit-style en=" + zM1393e + " a=" + fM1391a + " path=" + ThemeWallpaperConfig.f1706f);
            try {
                AbstractC0358S.m904q(Activity.class, "onResume", new C0593H1(1));
                C0599J1.m1485c("hooked Activity.onResume");
                objM116u = c0146l;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            if (thM465a != null) {
                C0599J1 c0599j12 = C0599J1.f1831a;
                C0599J1.m1485c("onResume fail: " + thM465a.getMessage());
            }
            try {
                Class clsM906r = AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.LauncherUI");
                AbstractC0358S.m904q(clsM906r, "onCreate", Bundle.class, new C0596I1(0, false));
                C0599J1.m1485c("hooked LauncherUI.onCreate");
                Class cls = Boolean.TYPE;
                AbstractC0358S.m904q(clsM906r, "closeChatting", cls, new C0596I1(1, false));
                C0599J1.m1485c("hooked LauncherUI.closeChatting");
                AbstractC0358S.m904q(clsM906r, "startChatting", String.class, Bundle.class, cls, new C0593H1(2));
                C0599J1.m1485c("hooked LauncherUI.startChatting");
                try {
                    Class clsM906r2 = AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.NewChattingTabUI");
                    AbstractC0358S.m904q(clsM906r2, "r", String.class, Bundle.class, cls, new C0593H1(3));
                    C0599J1.m1485c("hooked NewChattingTabUI.r");
                    AbstractC0358S.m904q(clsM906r2, "q", Integer.TYPE, new C0593H1(4));
                    C0599J1.m1485c("hooked NewChattingTabUI.q");
                    AbstractC0358S.m904q(clsM906r2, "f", cls, new C0593H1(5));
                    C0599J1.m1485c("hooked NewChattingTabUI.f");
                    objM116u2 = c0146l;
                } catch (Throwable th2) {
                    objM116u2 = AbstractC0040p.m116u(th2);
                }
                Throwable thM465a2 = AbstractC0141g.m465a(objM116u2);
                if (thM465a2 != null) {
                    C0599J1.m1485c("NewChattingTabUI.f fail: " + thM465a2.getMessage());
                }
            } catch (Throwable th3) {
                AbstractC0040p.m116u(th3);
            }
            try {
                Class cls2 = Integer.TYPE;
                AbstractC0358S.m904q(Activity.class, "onActivityResult", cls2, cls2, Intent.class, new C0593H1(0));
            } catch (Throwable th4) {
                AbstractC0040p.m116u(th4);
            }
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0713z(3), 1800L);
        }
        return c0146l;
    }

    /* JADX INFO: renamed from: e */
    private final Object m2110e() {
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        Class cls;
        Object objM116u4;
        Context context = this.f2949b;
        ClassLoader classLoader = this.f2950c;
        AbstractC0307g.m703e(context, "$ctx");
        AbstractC0307g.m703e(classLoader, "$cl");
        InputStatsDatabase inputStatsDatabase = InputStatsDatabase.f1818a;
        C0146l c0146l = C0146l.f339a;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        InputStatsDatabase.f1824g = context;
        if (InputStatsDatabase.f1819b.compareAndSet(false, true)) {
            try {
                Class clsM906r = AbstractC0358S.m906r(classLoader, "com.tencent.mm.pluginsdk.ui.chat.ChatFooter");
                Constructor<?>[] declaredConstructors = clsM906r.getDeclaredConstructors();
                AbstractC0307g.m702d(declaredConstructors, "getDeclaredConstructors(...)");
                for (Constructor<?> constructor : declaredConstructors) {
                    AbstractC0307g.m700b(constructor);
                    AbstractC0762d.m1952b(constructor, new C0589G0(0));
                }
                InputStatsDatabase.m1482j("hooked ChatFooter constructors: " + clsM906r.getDeclaredConstructors().length);
                objM116u = c0146l;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            InputStatsDatabase inputStatsDatabase2 = InputStatsDatabase.f1818a;
            if (thM465a != null) {
                InputStatsDatabase.m1482j("ChatFooter hook skipped: " + thM465a.getMessage());
            }
            try {
                Class clsM906r2 = AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.widget.cedit.api.MMFlexEditText");
                Constructor<?>[] declaredConstructors2 = clsM906r2.getDeclaredConstructors();
                AbstractC0307g.m702d(declaredConstructors2, "getDeclaredConstructors(...)");
                for (Constructor<?> constructor2 : declaredConstructors2) {
                    AbstractC0307g.m700b(constructor2);
                    AbstractC0762d.m1952b(constructor2, new C0589G0(1));
                }
                InputStatsDatabase.m1482j("hooked MMFlexEditText constructors: " + clsM906r2.getDeclaredConstructors().length);
                objM116u2 = c0146l;
            } catch (Throwable th2) {
                objM116u2 = AbstractC0040p.m116u(th2);
            }
            Throwable thM465a2 = AbstractC0141g.m465a(objM116u2);
            if (thM465a2 != null) {
                InputStatsDatabase.m1482j("MMFlexEditText hook skipped: " + thM465a2.getMessage());
            }
            try {
                AbstractC0358S.m904q(TextView.class, "setHint", CharSequence.class, new C0589G0(2));
                InputStatsDatabase.m1482j("hooked TextView.setHint(CharSequence)");
                objM116u3 = c0146l;
            } catch (Throwable th3) {
                objM116u3 = AbstractC0040p.m116u(th3);
            }
            Throwable thM465a3 = AbstractC0141g.m465a(objM116u3);
            if (thM465a3 != null) {
                InputStatsDatabase.m1482j("TextView.setHint hook skipped: " + thM465a3.getMessage());
            }
            AtomicBoolean atomicBoolean = InputStatsDatabase.f1820c;
            if (!atomicBoolean.get()) {
                Iterator it = AbstractC0182m.m556h0("com.tencent.wcdb.database.SQLiteDatabase", "android.database.sqlite.SQLiteDatabase").iterator();
                do {
                    cls = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    try {
                        objM116u4 = AbstractC0358S.m906r(classLoader, (String) it.next());
                    } catch (Throwable th4) {
                        objM116u4 = AbstractC0040p.m116u(th4);
                    }
                    cls = (Class) (objM116u4 instanceof C0140f ? null : objM116u4);
                } while (cls == null);
                if (cls == null) {
                    InputStatsDatabase.m1482j("database class not ready");
                } else {
                    int iM1477e = InputStatsDatabase.m1477e(cls, "insert", String.class, String.class, ContentValues.class) + InputStatsDatabase.m1477e(cls, "insertOrThrow", String.class, String.class, ContentValues.class);
                    Class cls2 = Integer.TYPE;
                    AbstractC0307g.m700b(cls2);
                    int iM1477e2 = iM1477e + InputStatsDatabase.m1477e(cls, "insertWithOnConflict", String.class, String.class, ContentValues.class, cls2);
                    if (iM1477e2 > 0) {
                        atomicBoolean.set(true);
                        InputStatsDatabase.m1482j("hooked " + iM1477e2 + " DB insert methods on " + cls.getName());
                    }
                }
            }
            InputStatsDatabase.m1482j("installed");
        }
        return c0146l;
    }

    /* JADX INFO: renamed from: f */
    private final Object m2111f() {
        Object objM116u;
        AbstractC0307g.m703e(this.f2949b, "$ctx");
        ClassLoader classLoader = this.f2950c;
        AbstractC0307g.m703e(classLoader, "$cl");
        MomentsAdsBlocker momentsAdsBlocker = MomentsAdsBlocker.f2016a;
        boolean zCompareAndSet = MomentsAdsBlocker.f2017b.compareAndSet(false, true);
        C0146l c0146l = C0146l.f339a;
        if (zCompareAndSet) {
            MomentsAdsBlocker.m1631b("install enabled=" + MomentsAdsBlocker.m1630a());
            try {
                Class clsM906r = AbstractC0358S.m906r(classLoader, "com.tencent.mm.plugin.sns.storage.ADInfo");
                C0172c c0172cM714c = AbstractC0317q.m714c(clsM906r.getDeclaredConstructors());
                int i2 = 0;
                while (c0172cM714c.hasNext()) {
                    Constructor constructor = (Constructor) c0172cM714c.next();
                    AbstractC0307g.m700b(constructor);
                    AbstractC0762d.m1952b(constructor, new C0646c1(0));
                    i2++;
                }
                C0172c c0172cM714c2 = AbstractC0317q.m714c(clsM906r.getDeclaredMethods());
                while (c0172cM714c2.hasNext()) {
                    Method method = (Method) c0172cM714c2.next();
                    if (AbstractC0307g.m699a(method.getReturnType(), Boolean.TYPE) || AbstractC0307g.m699a(method.getReturnType(), Boolean.class)) {
                        String name = method.getName();
                        AbstractC0307g.m702d(name, "getName(...)");
                        String lowerCase = name.toLowerCase(Locale.ROOT);
                        AbstractC0307g.m702d(lowerCase, "toLowerCase(...)");
                        if (AbstractC0425j.m1005J0(lowerCase, "ad", false) || AbstractC0425j.m1005J0(lowerCase, "advert", false)) {
                            AbstractC0762d.m1952b(method, new C0646c1(1));
                            i2++;
                        }
                    }
                }
                MomentsAdsBlocker.m1631b("hooked ADInfo paths count=" + i2);
                objM116u = c0146l;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            if (thM465a != null) {
                MomentsAdsBlocker momentsAdsBlocker2 = MomentsAdsBlocker.f2016a;
                MomentsAdsBlocker.m1631b("ADInfo hook fail: " + thM465a.getMessage());
            }
        }
        return c0146l;
    }

    /* JADX INFO: renamed from: g */
    private final Object m2112g() {
        Object objM116u;
        String str;
        Object objM116u2;
        Context context = this.f2949b;
        AbstractC0307g.m703e(context, "$ctx");
        ClassLoader classLoader = this.f2950c;
        AbstractC0307g.m703e(classLoader, "$cl");
        HotUpdateBlocker hotUpdateBlocker = HotUpdateBlocker.f2005a;
        C0146l c0146l = C0146l.f339a;
        if (HotUpdateBlocker.f2007c.compareAndSet(false, true)) {
            HotUpdateBlocker.m1629b("install enabled=" + HotUpdateBlocker.m1628a());
            try {
                C0172c c0172cM714c = AbstractC0317q.m714c(AbstractC0358S.m906r(classLoader, "com.tencent.tinker.loader.shareutil.ShareTinkerInternals").getDeclaredMethods());
                int i2 = 0;
                while (c0172cM714c.hasNext()) {
                    Method method = (Method) c0172cM714c.next();
                    String name = method.getName();
                    AbstractC0307g.m702d(name, "getName(...)");
                    if (AbstractC0433r.m1033H0(name, "isTinkerEnabled", false) && (AbstractC0307g.m699a(method.getReturnType(), Boolean.TYPE) || AbstractC0307g.m699a(method.getReturnType(), Boolean.class))) {
                        AbstractC0762d.m1952b(method, new MessageActionDispatcher(2));
                        i2++;
                        HotUpdateBlocker.m1629b("hooked " + method.getName());
                    }
                }
                HotUpdateBlocker.m1629b("ShareTinkerInternals hooks=" + i2);
                objM116u = c0146l;
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            Throwable thM465a = AbstractC0141g.m465a(objM116u);
            HotUpdateBlocker hotUpdateBlocker2 = HotUpdateBlocker.f2005a;
            if (thM465a != null) {
                HotUpdateBlocker.m1629b("TinkerInternals fail: " + thM465a.getMessage());
            }
            try {
                C0172c c0172cM714c2 = AbstractC0317q.m714c(AbstractC0358S.m906r(classLoader, "com.tencent.tinker.loader.TinkerLoader").getDeclaredMethods());
                while (c0172cM714c2.hasNext()) {
                    Method method2 = (Method) c0172cM714c2.next();
                    String name2 = method2.getName();
                    AbstractC0307g.m702d(name2, "getName(...)");
                    if (!AbstractC0425j.m1005J0(name2, "tryLoad", true)) {
                        String name3 = method2.getName();
                        AbstractC0307g.m702d(name3, "getName(...)");
                        AbstractC0425j.m1005J0(name3, "load", true);
                    }
                }
            } catch (Throwable th2) {
                AbstractC0040p.m116u(th2);
            }
            if (HotUpdateBlocker.m1628a()) {
                File file = new File("/data/data/com.tencent.mm/tinker");
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                if (applicationInfo == null || (str = applicationInfo.dataDir) == null) {
                    str = "";
                }
                for (File file2 : AbstractC0182m.m556h0(file, new File(str, "tinker"), new File("/data/user/0/com.tencent.mm/tinker"))) {
                    try {
                        if (file2.exists()) {
                            C0266g c0266g = new C0266g(new C0268i(file2));
                            while (true) {
                                boolean z2 = true;
                                while (c0266g.hasNext()) {
                                    File file3 = (File) c0266g.next();
                                    if ((file3.delete() || !file3.exists()) && z2) {
                                        break;
                                    }
                                    z2 = false;
                                }
                            }
                            HotUpdateBlocker.m1629b("wiped " + file2.getAbsolutePath());
                        }
                    } catch (Throwable th3) {
                        AbstractC0040p.m116u(th3);
                    }
                }
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    for (String str2 : HotUpdateBlocker.f2006b) {
                        try {
                            packageManager.setComponentEnabledSetting(new ComponentName(ModernHookEntry.WECHAT_PACKAGE, str2), 2, 1);
                            HotUpdateBlocker.m1629b("component " + str2 + " enabled=false");
                            objM116u2 = c0146l;
                        } catch (Throwable th4) {
                            objM116u2 = AbstractC0040p.m116u(th4);
                        }
                        Throwable thM465a2 = AbstractC0141g.m465a(objM116u2);
                        if (thM465a2 != null) {
                            HotUpdateBlocker.m1629b("component " + str2 + " fail: " + thM465a2.getMessage());
                        }
                    }
                }
            }
        }
        return c0146l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0746  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0749  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c A[PHI: r0
  0x006c: PHI (r0v48 java.lang.Class) = (r0v20 java.lang.Class), (r0v24 java.lang.Class) binds: [B:29:0x006a, B:34:0x008a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x0096 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x016e  */
    /* JADX WARN: Type inference failed for: r0v107, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Member, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v188, types: [java.lang.reflect.AccessibleObject, java.lang.reflect.Member, java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v44, types: [int] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m2113h() {
        Object objM116u;
        String strM1383a;
        Object objM116u2;
        Class cls;
        int i2;
        Object objM116u3;
        int i3;
        Iterator it;
        Object objM116u4;
        Class cls2;
        Object next;
        int i4;
        Object objM116u5;
        Class<?> cls3;
        Object objM116u6;
        Object objM116u7;
        Class<?> type;
        int i5;
        Object objM116u8;
        Object obj;
        Object next2;
        Iterator it2;
        Class<?> returnType;
        Object objM116u9;
        Object objM116u10;
        C0401d c0401d;
        Object objM116u11;
        int i6 = 2;
        ?? r5 = 0;
        boolean z2 = true;
        ClassLoader classLoader = this.f2950c;
        Context context = this.f2949b;
        AbstractC0307g.m703e(classLoader, "$classLoader");
        AbstractC0307g.m703e(context, "$appContext");
        SettingsEntryInjector settingsEntryInjector = SettingsEntryInjector.f2992a;
        boolean zCompareAndSet = SettingsEntryInjector.f2993b.compareAndSet(false, true);
        C0146l c0146l = C0146l.f339a;
        if (zCompareAndSet) {
            try {
                objM116u = AbstractC0358S.m882d0(context);
            } catch (Throwable th) {
                objM116u = AbstractC0040p.m116u(th);
            }
            if (objM116u instanceof C0140f) {
                objM116u = null;
            }
            CompatibilityReport compatibilityReport = (CompatibilityReport) objM116u;
            if (compatibilityReport == null || (strM1383a = compatibilityReport.m1383a()) == null) {
                strM1383a = "n/a";
            }
            SettingsEntryInjector.m2146l("install begin ver=".concat(strM1383a));
            boolean zCompareAndSet2 = SettingsEntryInjector.f2994c.compareAndSet(false, true);
            SettingsEntryInjector settingsEntryInjector2 = SettingsEntryInjector.f2992a;
            if (zCompareAndSet2) {
                try {
                    objM116u2 = Class.forName("hy3.d", false, classLoader);
                } catch (Throwable th2) {
                    objM116u2 = AbstractC0040p.m116u(th2);
                }
                if (objM116u2 instanceof C0140f) {
                    objM116u2 = null;
                }
                Class clsM1362a = (Class) objM116u2;
                if (clsM1362a != null) {
                    cls = clsM1362a;
                    if (cls != null) {
                        SettingsEntryInjector.m2146l("modern settings list injection disabled; dataSource missing");
                        i3 = 0;
                        SettingsEntryInjector.m2146l("legacy settings list injection disabled");
                        AtomicBoolean atomicBoolean = DexKitManager.f1646a;
                        List listM1363b = DexKitManager.m1363b(context, classLoader, AbstractC0805P.f2920a, "MicroMsg.PlusSubMenuHelper");
                        it = listM1363b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        if (cls2 == null) {
                        }
                        if (r5 > 0) {
                        }
                        SettingsEntryInjector.m2146l("settings entry hooks installed count=" + (i3 + r5) + " plusMenu=" + (r5 > 0 ? "OK" : "FAIL"));
                        if (r5 == 0) {
                        }
                        ConcurrentHashMap concurrentHashMap = FeatureStatusRegistry.f2728a;
                        if (r5 <= 0) {
                        }
                        FeatureStatusRegistry.m1967g("SettingsEntry", r5 > 0 ? "加号菜单入口已注入" : "加号菜单入口注入失败，模块无可见入口", z2);
                    } else {
                        try {
                            AbstractC0358S.m904q(cls, "onCreate", new C0596I1(4));
                            try {
                                objM116u3 = 0;
                                i2 = 1;
                            } catch (Throwable th3) {
                                th = th3;
                                i2 = 1;
                                objM116u3 = AbstractC0040p.m116u(th);
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            i2 = 0;
                        }
                        Throwable thM465a = AbstractC0141g.m465a(objM116u3);
                        if (thM465a != null) {
                            SettingsEntryInjector.m2146l("modern cleanup onCreate hook fail: " + thM465a.getMessage());
                        }
                        C0172c c0172cM714c = AbstractC0317q.m714c(cls.getDeclaredMethods());
                        while (c0172cM714c.hasNext()) {
                            Method method = (Method) c0172cM714c.next();
                            int parameterCount = method.getParameterCount();
                            if (parameterCount >= 0 && parameterCount < 4 && (method.getName().length() <= i6 || AbstractC0307g.m699a(method.getName(), "a") || AbstractC0307g.m699a(method.getName(), "c") || AbstractC0307g.m699a(method.getName(), "getData"))) {
                                try {
                                    AbstractC0762d.m1952b(method, new C0596I1(5));
                                    i2++;
                                } catch (Throwable th5) {
                                    AbstractC0040p.m116u(th5);
                                }
                            }
                            i6 = 2;
                        }
                        SettingsEntryInjector.m2146l("modern settings list injection disabled; cleanup hooks=" + i2 + " dataSource=" + cls.getName());
                        i3 = i2 > 0 ? 1 : 0;
                        SettingsEntryInjector.m2146l("legacy settings list injection disabled");
                        AtomicBoolean atomicBoolean2 = DexKitManager.f1646a;
                        List listM1363b2 = DexKitManager.m1363b(context, classLoader, AbstractC0805P.f2920a, "MicroMsg.PlusSubMenuHelper");
                        it = listM1363b2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                            }
                        }
                        if (cls2 == null) {
                        }
                        if (r5 > 0) {
                        }
                        SettingsEntryInjector.m2146l("settings entry hooks installed count=" + (i3 + r5) + " plusMenu=" + (r5 > 0 ? "OK" : "FAIL"));
                        if (r5 == 0) {
                        }
                        ConcurrentHashMap concurrentHashMap2 = FeatureStatusRegistry.f2728a;
                        if (r5 <= 0) {
                        }
                        FeatureStatusRegistry.m1967g("SettingsEntry", r5 > 0 ? "加号菜单入口已注入" : "加号菜单入口注入失败，模块无可见入口", z2);
                    }
                } else {
                    AtomicBoolean atomicBoolean3 = DexKitManager.f1646a;
                    clsM1362a = DexKitManager.m1362a(context, classLoader, AbstractC0805P.f2920a, "MicroMsg.SettingDataSource", "get data, size : ");
                    if (clsM1362a == null) {
                        clsM1362a = DexKitManager.m1362a(context, classLoader, AbstractC0805P.f2920a, "MicroMsg.SettingDataSource");
                    }
                    if (clsM1362a == null) {
                        cls = null;
                    }
                    if (cls != null) {
                    }
                }
            } else {
                i3 = 0;
                SettingsEntryInjector.m2146l("legacy settings list injection disabled");
                AtomicBoolean atomicBoolean22 = DexKitManager.f1646a;
                List listM1363b22 = DexKitManager.m1363b(context, classLoader, AbstractC0805P.f2920a, "MicroMsg.PlusSubMenuHelper");
                it = listM1363b22.iterator();
                while (true) {
                    if (it.hasNext()) {
                        cls2 = (Class) it.next();
                        if (!Activity.class.isAssignableFrom(cls2) && !cls2.isInterface() && !cls2.isAnnotation() && !cls2.isEnum()) {
                            boolean z3 = false;
                            boolean z4 = false;
                            boolean z5 = false;
                            for (Class superclass = cls2; superclass != null; superclass = superclass.getSuperclass()) {
                                C0172c c0172cM714c2 = AbstractC0317q.m714c(superclass.getDeclaredFields());
                                while (c0172cM714c2.hasNext()) {
                                    Class<?> type2 = ((Field) c0172cM714c2.next()).getType();
                                    if (SparseArray.class.isAssignableFrom(type2)) {
                                        z3 = true;
                                    }
                                    if (BaseAdapter.class.isAssignableFrom(type2)) {
                                        z4 = true;
                                    }
                                    if (LayoutInflater.class.isAssignableFrom(type2)) {
                                        z5 = true;
                                    }
                                }
                            }
                            if (z3 && z4 && z5) {
                                SettingsEntryInjector.m2146l("plus helper resolved via DexKit: ".concat(cls2.getName()));
                                break;
                            }
                        }
                    } else {
                        if (!listM1363b22.isEmpty()) {
                            SettingsEntryInjector.m2146l("plus helper DexKit candidates rejected: ".concat(AbstractC0181l.m546r0(listM1363b22, null, null, null, new C0813Y(23), 31)));
                        }
                        try {
                            objM116u4 = Class.forName("com.tencent.mm.ui.rg", false, classLoader);
                        } catch (Throwable th6) {
                            objM116u4 = AbstractC0040p.m116u(th6);
                        }
                        if (objM116u4 instanceof C0140f) {
                            objM116u4 = null;
                        }
                        cls2 = (Class) objM116u4;
                    }
                }
                if (cls2 == null) {
                    SettingsEntryInjector.m2146l("plus helper class not resolved (DexKit + fallback both failed)");
                } else {
                    SettingsEntryInjector.m2146l("plus helper class resolved=".concat(cls2.getName()));
                    C0401d c0401d2 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(cls2, null)), new C0813Y(5)), true, new C0813Y(16)));
                    int i7 = 0;
                    while (c0401d2.hasNext()) {
                        Method method2 = (Method) c0401d2.next();
                        try {
                            method2.setAccessible(z2);
                            AbstractC0762d.m1952b(method2, new C0824e0(cls2, classLoader, 0));
                            i7++;
                            String name = method2.getDeclaringClass().getName();
                            String name2 = method2.getName();
                            StringBuilder sb = new StringBuilder();
                            c0401d = c0401d2;
                            try {
                                sb.append("plus menu display hooked ");
                                sb.append(name);
                                sb.append(".");
                                sb.append(name2);
                                SettingsEntryInjector.m2146l(sb.toString());
                                objM116u11 = c0146l;
                            } catch (Throwable th7) {
                                th = th7;
                                objM116u11 = AbstractC0040p.m116u(th);
                            }
                        } catch (Throwable th8) {
                            th = th8;
                            c0401d = c0401d2;
                        }
                        Throwable thM465a2 = AbstractC0141g.m465a(objM116u11);
                        if (thM465a2 != null) {
                            SettingsEntryInjector.m2146l("plus display hook fail " + method2.getDeclaringClass().getName() + "." + method2.getName() + ": " + thM465a2.getMessage());
                        }
                        c0401d2 = c0401d;
                        z2 = true;
                    }
                    ?? r52 = 1;
                    C0401d c0401d3 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(cls2, null)), new C0813Y(20)), true, new C0813Y(21)));
                    while (c0401d3.hasNext()) {
                        ?? r02 = (Method) c0401d3.next();
                        try {
                            r02.setAccessible(r52);
                            AbstractC0762d.m1952b(r02, new C0824e0(cls2, classLoader, r52));
                            i7 += r52;
                            SettingsEntryInjector.m2146l("plus adapter factory hooked " + r02.getDeclaringClass().getName() + "." + r02.getName());
                            objM116u10 = c0146l;
                        } catch (Throwable th9) {
                            objM116u10 = AbstractC0040p.m116u(th9);
                        }
                        Throwable thM465a3 = AbstractC0141g.m465a(objM116u10);
                        if (thM465a3 != null) {
                            SettingsEntryInjector.m2146l("plus adapter factory hook fail: " + thM465a3.getMessage());
                        }
                        r52 = 1;
                    }
                    C0172c c0172cM714c3 = AbstractC0317q.m714c(cls2.getDeclaredMethods());
                    while (c0172cM714c3.hasNext()) {
                        Method method3 = (Method) c0172cM714c3.next();
                        if (AbstractC0307g.m699a(method3.getName(), "onItemClick") && method3.getParameterTypes().length == 4) {
                            try {
                                AbstractC0762d.m1952b(method3, new MessageActionDispatcher(9));
                                int i8 = i7 + 1;
                                try {
                                    objM116u9 = Integer.valueOf(i7);
                                    i7 = i8;
                                } catch (Throwable th10) {
                                    th = th10;
                                    i7 = i8;
                                    objM116u9 = AbstractC0040p.m116u(th);
                                }
                            } catch (Throwable th11) {
                                th = th11;
                            }
                            Throwable thM465a4 = AbstractC0141g.m465a(objM116u9);
                            if (thM465a4 != null) {
                                SettingsEntryInjector.m2146l("plus click hook fail: " + thM465a4.getMessage());
                            }
                        }
                    }
                    if (i7 > 0) {
                        SettingsEntryInjector.m2146l("home plus menu hooked count=" + i7);
                    }
                    C0401d c0401d4 = new C0401d(AbstractC0407j.m994y0(new C0180k(4, new C0565o(cls2, null)), new C0813Y(18)));
                    while (true) {
                        if (!c0401d4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = c0401d4.next();
                        Method method4 = (Method) next;
                        Class<?>[] parameterTypes = method4.getParameterTypes();
                        AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                        if (parameterTypes.length == 0 && BaseAdapter.class.isAssignableFrom(method4.getReturnType()) && !AbstractC0307g.m699a(method4.getReturnType(), BaseAdapter.class)) {
                            break;
                        }
                    }
                    Method method5 = (Method) next;
                    if (method5 == null || (returnType = method5.getReturnType()) == null) {
                        i4 = 0;
                        try {
                            objM116u5 = Class.forName("com.tencent.mm.ui.mg", false, classLoader);
                        } catch (Throwable th12) {
                            objM116u5 = AbstractC0040p.m116u(th12);
                        }
                        if (objM116u5 instanceof C0140f) {
                            objM116u5 = null;
                        }
                        cls3 = (Class) objM116u5;
                    } else {
                        cls3 = returnType;
                        i4 = 0;
                    }
                    if (cls3 == null) {
                        SettingsEntryInjector.m2146l("plus adapter class not resolved");
                    } else {
                        SettingsEntryInjector.m2146l("plus adapter class resolved=".concat(cls3.getName()));
                        boolean z6 = true;
                        C0401d c0401d5 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(cls3, null)), new C0813Y(24)), true, new C0813Y(25)));
                        int i9 = i4;
                        while (c0401d5.hasNext()) {
                            Method method6 = (Method) c0401d5.next();
                            try {
                                method6.setAccessible(z6);
                                AbstractC0762d.m1952b(method6, new C0824e0(cls2, classLoader, 2));
                                i9++;
                                SettingsEntryInjector.m2146l("plus adapter count hooked " + method6.getDeclaringClass().getName());
                                objM116u7 = c0146l;
                            } catch (Throwable th13) {
                                objM116u7 = AbstractC0040p.m116u(th13);
                            }
                            Throwable thM465a5 = AbstractC0141g.m465a(objM116u7);
                            if (thM465a5 != null) {
                                SettingsEntryInjector.m2146l("plus adapter count hook fail: " + thM465a5.getMessage());
                            }
                            z6 = true;
                        }
                        ?? r7 = 1;
                        C0401d c0401d6 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(cls3, null)), new C0813Y(26)), true, new C0813Y(6)));
                        while (c0401d6.hasNext()) {
                            ?? r03 = (Method) c0401d6.next();
                            try {
                                r03.setAccessible(r7);
                                AbstractC0762d.m1952b(r03, new C0824e0(cls2, classLoader, 3));
                                i9 += r7;
                                SettingsEntryInjector.m2146l("plus adapter view hooked " + r03.getDeclaringClass().getName());
                                objM116u6 = c0146l;
                            } catch (Throwable th14) {
                                objM116u6 = AbstractC0040p.m116u(th14);
                            }
                            Throwable thM465a6 = AbstractC0141g.m465a(objM116u6);
                            if (thM465a6 != null) {
                                SettingsEntryInjector.m2146l("plus adapter view hook fail: " + thM465a6.getMessage());
                            }
                            r7 = 1;
                        }
                        if (i9 > 0) {
                            SettingsEntryInjector.m2146l("home plus adapter hooked count=" + i9);
                        }
                        i4 = i9;
                    }
                    int i10 = i7 + i4;
                    try {
                        AtomicBoolean atomicBoolean4 = DexKitManager.f1646a;
                        Iterator it3 = DexKitManager.m1363b(context, classLoader, AbstractC0805P.f2920a, "MicroMsg.PlusMenaDataManager").iterator();
                        loop7: while (true) {
                            if (!it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                            Class cls4 = (Class) next2;
                            if (Activity.class.isAssignableFrom(cls4) || cls4.isInterface()) {
                                it2 = it3;
                            } else {
                                Field[] declaredFields = cls4.getDeclaredFields();
                                AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
                                int length = declaredFields.length;
                                int i11 = 0;
                                while (i11 < length) {
                                    it2 = it3;
                                    if (SparseArray.class.isAssignableFrom(declaredFields[i11].getType())) {
                                        Field[] declaredFields2 = cls4.getDeclaredFields();
                                        AbstractC0307g.m702d(declaredFields2, "getDeclaredFields(...)");
                                        for (Field field : declaredFields2) {
                                            if (AbstractC0307g.m699a(field.getType(), ArrayList.class)) {
                                                break loop7;
                                            }
                                        }
                                    } else {
                                        i11++;
                                        it3 = it2;
                                    }
                                }
                                it2 = it3;
                            }
                            it3 = it2;
                        }
                        type = (Class) next2;
                    } catch (Throwable th15) {
                        AbstractC0040p.m116u(th15);
                    }
                    if (type == null) {
                        C0401d c0401d7 = new C0401d(AbstractC0407j.m994y0(new C0180k(4, new C0565o(cls2, null)), new C0813Y(19)));
                        loop10: while (true) {
                            if (!c0401d7.hasNext()) {
                                obj = null;
                                break;
                            }
                            Object next3 = c0401d7.next();
                            Field field2 = (Field) next3;
                            if (!field2.getType().isPrimitive() && !AbstractC0307g.m699a(field2.getType(), String.class)) {
                                Field[] declaredFields3 = field2.getType().getDeclaredFields();
                                AbstractC0307g.m702d(declaredFields3, "getDeclaredFields(...)");
                                for (Field field3 : declaredFields3) {
                                    if (SparseArray.class.isAssignableFrom(field3.getType())) {
                                        obj = next3;
                                        break loop10;
                                    }
                                }
                            }
                        }
                        Field field4 = (Field) obj;
                        type = field4 != null ? field4.getType() : null;
                    }
                    if (type == null) {
                        i5 = 0;
                        z2 = true;
                    } else {
                        SettingsEntryInjector.m2146l("plus data manager resolved=".concat(type.getName()));
                        z2 = true;
                        C0401d c0401d8 = new C0401d(new C0402e(AbstractC0407j.m994y0(new C0180k(4, new C0565o(type, null)), new C0813Y(8)), true, new C0813Y(9)));
                        i5 = 0;
                        while (c0401d8.hasNext()) {
                            Method method7 = (Method) c0401d8.next();
                            try {
                                method7.setAccessible(true);
                                AbstractC0762d.m1952b(method7, new C0596I1(classLoader));
                                i5++;
                                SettingsEntryInjector.m2146l("plus data manager rebuild hooked " + method7.getDeclaringClass().getName() + "." + method7.getName());
                                objM116u8 = c0146l;
                            } catch (Throwable th16) {
                                objM116u8 = AbstractC0040p.m116u(th16);
                            }
                            Throwable thM465a7 = AbstractC0141g.m465a(objM116u8);
                            if (thM465a7 != null) {
                                SettingsEntryInjector.m2146l("plus data manager hook fail " + method7.getDeclaringClass().getName() + "." + method7.getName() + ": " + thM465a7.getMessage());
                            }
                        }
                        if (i5 > 0) {
                            SettingsEntryInjector.m2146l("plus data manager hooked count=" + i5);
                        }
                    }
                    r5 = i10 + i5 > 0 ? z2 : false;
                }
                SettingsEntryInjector.m2146l("settings entry hooks installed count=" + (i3 + r5) + " plusMenu=" + (r5 > 0 ? "OK" : "FAIL"));
                if (r5 == 0) {
                    SettingsEntryInjector.m2146l("FATAL: plus menu entry unavailable on this build; OKK has no visible entry");
                    try {
                        ModuleLog.INSTANCE.m1813i("严重：加号菜单入口注入失败，模块将没有可见入口");
                    } catch (Throwable th17) {
                        AbstractC0040p.m116u(th17);
                    }
                }
                ConcurrentHashMap concurrentHashMap22 = FeatureStatusRegistry.f2728a;
                if (r5 <= 0) {
                    z2 = false;
                }
                FeatureStatusRegistry.m1967g("SettingsEntry", r5 > 0 ? "加号菜单入口已注入" : "加号菜单入口注入失败，模块无可见入口", z2);
            }
        }
        return c0146l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:325:0x080c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0852 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.reflect.Field] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.lang.reflect.Field[]] */
    @Override // p029P0.InterfaceC0275a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Object objM116u;
        Object objM116u2;
        Object objM116u3;
        int iIntValue;
        ?? M116u;
        boolean z2;
        Field field;
        Field field2;
        Field field3;
        Object objM116u4;
        Object objM116u5;
        int i2;
        Object objM116u6;
        Object objM116u7;
        Object objM116u8;
        Object objM116u9;
        Object objM116u10;
        Object objM116u11;
        Object objM116u12;
        Object objM116u13;
        Object objM116u14;
        boolean z3 = false;
        int i3 = 1;
        switch (this.f2948a) {
            case 0:
                Context context = this.f2949b;
                ClassLoader classLoader = this.f2950c;
                AbstractC0307g.m703e(context, "$ctx");
                AbstractC0307g.m703e(classLoader, "$cl");
                C0693s0 c0693s0 = C0693s0.f2187a;
                boolean zCompareAndSet = C0693s0.f2189c.compareAndSet(false, true);
                C0146l c0146l = C0146l.f339a;
                if (zCompareAndSet) {
                    try {
                        ConfigStore configStore = ConfigStore.f2048a;
                        objM116u = Boolean.valueOf(ConfigStore.m1661c("hide_home_divider", false));
                    } catch (Throwable th) {
                        objM116u = AbstractC0040p.m116u(th);
                    }
                    Boolean bool = Boolean.FALSE;
                    boolean z4 = objM116u instanceof C0140f;
                    Object obj = objM116u;
                    if (z4) {
                        obj = bool;
                    }
                    C0693s0.f2192f = ((Boolean) obj).booleanValue();
                    try {
                        Field declaredField = AbstractC0358S.m906r(classLoader, "com.tencent.mm.R$id").getDeclaredField("dz8");
                        declaredField.setAccessible(true);
                        objM116u2 = Integer.valueOf(declaredField.getInt(null));
                    } catch (Throwable th2) {
                        objM116u2 = AbstractC0040p.m116u(th2);
                    }
                    boolean z5 = objM116u2 instanceof C0140f;
                    Object obj2 = objM116u2;
                    if (z5) {
                        obj2 = 0;
                    }
                    int iIntValue2 = ((Number) obj2).intValue();
                    Integer numValueOf = Integer.valueOf(iIntValue2);
                    if (iIntValue2 == 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        iIntValue = numValueOf.intValue();
                    } else {
                        try {
                            objM116u3 = Integer.valueOf(context.getResources().getIdentifier("dz8", "id", ModernHookEntry.WECHAT_PACKAGE));
                        } catch (Throwable th3) {
                            objM116u3 = AbstractC0040p.m116u(th3);
                        }
                        iIntValue = ((Number) (objM116u3 instanceof C0140f ? 0 : objM116u3)).intValue();
                    }
                    C0693s0.f2191e = iIntValue;
                    try {
                        Class clsM906r = AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.conversation.MainUI");
                        try {
                            objM116u5 = AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.conversation.ConversationListView");
                        } catch (Throwable th4) {
                            objM116u5 = AbstractC0040p.m116u(th4);
                        }
                        boolean z6 = objM116u5 instanceof C0140f;
                        Object obj3 = objM116u5;
                        if (z6) {
                            obj3 = null;
                        }
                        Class cls = (Class) obj3;
                        ?? declaredFields = clsM906r.getDeclaredFields();
                        AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
                        int length = declaredFields.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                M116u = declaredFields[i4];
                                if (cls != null) {
                                    try {
                                        i2 = 1;
                                        if (cls.isAssignableFrom(M116u.getType())) {
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        M116u = AbstractC0040p.m116u(th);
                                    }
                                } else {
                                    i2 = 1;
                                }
                                i4 += i2;
                            } else {
                                M116u = 0;
                            }
                        }
                        if (M116u == 0) {
                            Field[] declaredFields2 = clsM906r.getDeclaredFields();
                            AbstractC0307g.m702d(declaredFields2, "getDeclaredFields(...)");
                            for (Field field4 : declaredFields2) {
                                if (ListView.class.isAssignableFrom(field4.getType()) || AbsListView.class.isAssignableFrom(field4.getType())) {
                                    M116u = field4;
                                }
                            }
                            M116u = 0;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        M116u = AbstractC0040p.m116u(th);
                        z2 = M116u instanceof C0140f;
                        ?? r15 = M116u;
                        if (z2) {
                        }
                        field = (Field) r15;
                        if (field == null) {
                        }
                        C0693s0.f2188b = field2;
                        boolean z7 = C0693s0.f2192f;
                        String hexString = Integer.toHexString(C0693s0.f2191e);
                        field3 = C0693s0.f2188b;
                        if (field3 != null) {
                            String name = "none";
                            C0693s0.m1790c("install enabled=" + z7 + " dz8=0x" + hexString + " listField=" + name);
                            if (C0693s0.f2192f) {
                            }
                        }
                        return c0146l;
                    }
                    z2 = M116u instanceof C0140f;
                    ?? r152 = M116u;
                    if (z2) {
                        r152 = 0;
                    }
                    field = (Field) r152;
                    if (field == null) {
                        field.setAccessible(true);
                        field2 = field;
                    } else {
                        field2 = null;
                    }
                    C0693s0.f2188b = field2;
                    boolean z72 = C0693s0.f2192f;
                    String hexString2 = Integer.toHexString(C0693s0.f2191e);
                    field3 = C0693s0.f2188b;
                    if (field3 != null || (name = field3.getName()) == null) {
                        String name2 = "none";
                    }
                    C0693s0.m1790c("install enabled=" + z72 + " dz8=0x" + hexString2 + " listField=" + name2);
                    if (C0693s0.f2192f) {
                        try {
                            AbstractC0358S.m904q(AbstractC0358S.m906r(classLoader, "com.tencent.mm.ui.conversation.MainUI"), "onResume", new MessageActionDispatcher(3));
                            C0693s0.m1790c("hooked com.tencent.mm.ui.conversation.MainUI.onResume only");
                            objM116u4 = c0146l;
                        } catch (Throwable th7) {
                            objM116u4 = AbstractC0040p.m116u(th7);
                        }
                        Throwable thM465a = AbstractC0141g.m465a(objM116u4);
                        if (thM465a != null) {
                            C0693s0 c0693s02 = C0693s0.f2187a;
                            C0693s0.m1790c("MainUI.onResume hook failed: " + thM465a.getMessage());
                        }
                    }
                    break;
                }
                return c0146l;
            case 1:
                Context context2 = this.f2949b;
                ClassLoader classLoader2 = this.f2950c;
                AbstractC0307g.m703e(context2, "$ctx");
                AbstractC0307g.m703e(classLoader2, "$cl");
                FoldBannerPinHook foldBannerPinHook = FoldBannerPinHook.f2154a;
                C0146l c0146l2 = C0146l.f339a;
                if (FoldBannerPinHook.f2155b.compareAndSet(false, true)) {
                    FoldBannerPinHook.m1763j(true);
                    FoldBannerPinHook.m1765l("install enabled=" + FoldBannerPinHook.f2156c + " (HIDE sticky overlay, keep list item)");
                    try {
                        AbstractC0358S.m904q(AbstractC0358S.m906r(classLoader2, "com.tencent.mm.ui.conversation.ConversationListView"), "setFoldBanner", View.class, new C0684p0(0));
                        FoldBannerPinHook.m1765l("hooked ConversationListView.setFoldBanner");
                        objM116u6 = c0146l2;
                    } catch (Throwable th8) {
                        objM116u6 = AbstractC0040p.m116u(th8);
                    }
                    Throwable thM465a2 = AbstractC0141g.m465a(objM116u6);
                    FoldBannerPinHook foldBannerPinHook2 = FoldBannerPinHook.f2154a;
                    if (thM465a2 != null) {
                        FoldBannerPinHook.m1765l("setFoldBanner: " + thM465a2.getMessage());
                    }
                    try {
                        AbstractC0358S.m904q(View.class, "setVisibility", Integer.TYPE, new InputStatsMessageHook(21));
                        FoldBannerPinHook.m1765l("hooked View.setVisibility");
                        objM116u7 = c0146l2;
                    } catch (Throwable th9) {
                        objM116u7 = AbstractC0040p.m116u(th9);
                    }
                    Throwable thM465a3 = AbstractC0141g.m465a(objM116u7);
                    if (thM465a3 != null) {
                        FoldBannerPinHook.m1765l("setVisibility: " + thM465a3.getMessage());
                    }
                    try {
                        AbstractC0358S.m904q(View.class, "setTranslationY", Float.TYPE, new C0684p0(4));
                        FoldBannerPinHook.m1765l("hooked View.setTranslationY");
                        objM116u8 = c0146l2;
                    } catch (Throwable th10) {
                        objM116u8 = AbstractC0040p.m116u(th10);
                    }
                    Throwable thM465a4 = AbstractC0141g.m465a(objM116u8);
                    if (thM465a4 != null) {
                        FoldBannerPinHook.m1765l("setTranslationY: " + thM465a4.getMessage());
                    }
                    try {
                        AbstractC0358S.m904q(View.class, "setAlpha", Float.TYPE, new InputStatsMessageHook(22));
                        FoldBannerPinHook.m1765l("hooked View.setAlpha");
                        objM116u9 = c0146l2;
                    } catch (Throwable th11) {
                        objM116u9 = AbstractC0040p.m116u(th11);
                    }
                    Throwable thM465a5 = AbstractC0141g.m465a(objM116u9);
                    if (thM465a5 != null) {
                        FoldBannerPinHook.m1765l("setAlpha: " + thM465a5.getMessage());
                    }
                    try {
                        Class clsM906r2 = AbstractC0358S.m906r(classLoader2, "com.tencent.mm.ui.conversation.ConversationListView");
                        Class cls2 = Integer.TYPE;
                        AbstractC0358S.m904q(clsM906r2, "onScroll", AbsListView.class, cls2, cls2, cls2, new InputStatsMessageHook(23));
                        AbstractC0358S.m904q(clsM906r2, "layoutChildren", new InputStatsMessageHook(24));
                        FoldBannerPinHook.m1765l("hooked ConversationListView.onScroll/layoutChildren");
                        objM116u10 = c0146l2;
                    } catch (Throwable th12) {
                        objM116u10 = AbstractC0040p.m116u(th12);
                    }
                    Throwable thM465a6 = AbstractC0141g.m465a(objM116u10);
                    if (thM465a6 != null) {
                        FoldBannerPinHook.m1765l("list hooks: " + thM465a6.getMessage());
                    }
                    try {
                        Class clsM906r3 = AbstractC0358S.m906r(classLoader2, "com.tencent.mm.ui.conversation.l5");
                        C0172c c0172cM714c = AbstractC0317q.m714c(clsM906r3.getDeclaredMethods());
                        int i5 = 0;
                        while (c0172cM714c.hasNext()) {
                            Method method = (Method) c0172cM714c.next();
                            if (method.getParameterTypes().length == 2 && AbstractC0307g.m699a(method.getParameterTypes()[0], Integer.TYPE) && AbstractC0307g.m699a(method.getParameterTypes()[1], Boolean.TYPE)) {
                                AbstractC0762d.m1952b(method, new C0684p0(1));
                                i5++;
                                FoldBannerPinHook.m1765l("hooked FolderHelper." + method.getName() + "(int,boolean)");
                            }
                        }
                        C0172c c0172cM714c2 = AbstractC0317q.m714c(clsM906r3.getDeclaredFields());
                        while (c0172cM714c2.hasNext()) {
                            Field field5 = (Field) c0172cM714c2.next();
                            if (LinearLayout.class.isAssignableFrom(field5.getType()) || View.class.isAssignableFrom(field5.getType())) {
                                String name3 = field5.getName();
                                if (!AbstractC0307g.m699a(name3, "f200744h") && !AbstractC0307g.m699a(name3, "h")) {
                                    AbstractC0307g.m700b(name3);
                                    if (AbstractC0425j.m1005J0(name3, "banner", true) || AbstractC0425j.m1005J0(name3, "fold", true) || AbstractC0433r.m1028C0(name3, "h")) {
                                    }
                                }
                                if (FoldBannerPinHook.f2160g == null) {
                                    FoldBannerPinHook.f2160g = name3;
                                    FoldBannerPinHook.m1765l("pre-resolve banner field=" + name3 + " type=" + field5.getType().getSimpleName());
                                }
                            }
                        }
                        if (i5 == 0) {
                            FoldBannerPinHook.m1765l("FolderHelper: no g(int,boolean) found");
                        }
                        objM116u11 = c0146l2;
                    } catch (Throwable th13) {
                        objM116u11 = AbstractC0040p.m116u(th13);
                    }
                    Throwable thM465a7 = AbstractC0141g.m465a(objM116u11);
                    if (thM465a7 != null) {
                        FoldBannerPinHook.m1765l("FolderHelper g: " + thM465a7.getMessage());
                    }
                    try {
                        Class clsM906r4 = AbstractC0358S.m906r(classLoader2, "com.tencent.mm.ui.conversation.MainUI");
                        for (String str : AbstractC0182m.m556h0("onTabCreate", "onResume", "onActivityCreated", "onShow", "onEnter", "onHiddenChanged")) {
                            Method[] declaredMethods = clsM906r4.getDeclaredMethods();
                            AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
                            ArrayList<Method> arrayList = new ArrayList();
                            for (Method method2 : declaredMethods) {
                                if (AbstractC0307g.m699a(method2.getName(), str)) {
                                    arrayList.add(method2);
                                }
                            }
                            for (Method method3 : arrayList) {
                                AbstractC0307g.m700b(method3);
                                AbstractC0762d.m1952b(method3, new C0684p0(2));
                            }
                        }
                        FoldBannerPinHook.m1765l("hooked MainUI lifecycle for lt5");
                        objM116u12 = c0146l2;
                    } catch (Throwable th14) {
                        objM116u12 = AbstractC0040p.m116u(th14);
                    }
                    Throwable thM465a8 = AbstractC0141g.m465a(objM116u12);
                    if (thM465a8 != null) {
                        FoldBannerPinHook.m1765l("MainUI: " + thM465a8.getMessage());
                    }
                    try {
                        AbstractC0358S.m904q(ViewGroup.class, "addView", View.class, Integer.TYPE, ViewGroup.LayoutParams.class, new C0684p0(3));
                        FoldBannerPinHook.m1765l("hooked ViewGroup.addView for lt5");
                        objM116u13 = c0146l2;
                    } catch (Throwable th15) {
                        objM116u13 = AbstractC0040p.m116u(th15);
                    }
                    Throwable thM465a9 = AbstractC0141g.m465a(objM116u13);
                    if (thM465a9 != null) {
                        FoldBannerPinHook.m1765l("addView: " + thM465a9.getMessage());
                    }
                    break;
                }
                return c0146l2;
            case 2:
                AbstractC0307g.m703e(this.f2949b, "$ctx");
                ClassLoader classLoader3 = this.f2950c;
                AbstractC0307g.m703e(classLoader3, "$cl");
                AtomicBoolean atomicBoolean = C0704w.f2213a;
                if (C0704w.f2213a.compareAndSet(false, true)) {
                    C0707x c0707xM1785a = PcAutoLoginConfig.m1785a();
                    C0704w.m1796d("install enabled=" + c0707xM1785a.f2222a + " sync=" + c0707xM1785a.f2223b + " showDev=" + c0707xM1785a.f2224c + " autoDev=" + c0707xM1785a.f2225d + " click=" + c0707xM1785a.f2226e);
                    try {
                        objM116u14 = AbstractC0358S.m906r(classLoader3, "com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI");
                    } catch (Throwable th16) {
                        objM116u14 = AbstractC0040p.m116u(th16);
                    }
                    Throwable thM465a10 = AbstractC0141g.m465a(objM116u14);
                    AtomicBoolean atomicBoolean2 = C0704w.f2213a;
                    if (thM465a10 == null) {
                        Class cls3 = (Class) objM116u14;
                        Method[] declaredMethods2 = cls3.getDeclaredMethods();
                        AbstractC0307g.m702d(declaredMethods2, "getDeclaredMethods(...)");
                        ArrayList arrayList2 = new ArrayList();
                        for (Method method4 : declaredMethods2) {
                            if (AbstractC0307g.m699a(method4.getName(), "onCreate") && method4.getParameterTypes().length == 1 && Bundle.class.isAssignableFrom(method4.getParameterTypes()[0])) {
                                arrayList2.add(method4);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            Method[] methods = cls3.getMethods();
                            AbstractC0307g.m702d(methods, "getMethods(...)");
                            arrayList2 = new ArrayList();
                            for (Method method5 : methods) {
                                if (method5.getParameterTypes().length == 1 && Bundle.class.isAssignableFrom(method5.getParameterTypes()[0]) && (AbstractC0307g.m699a(method5.getName(), "onCreate") || AbstractC0307g.m699a(method5.getDeclaringClass(), cls3))) {
                                    arrayList2.add(method5);
                                }
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            ConcurrentHashMap.KeySetView keySetView = C0704w.f2214b;
                            if (zHasNext) {
                                Method method6 = (Method) it.next();
                                AbstractC0307g.m700b(method6);
                                if (keySetView.add(C0704w.m1795c(method6))) {
                                    AbstractC0762d.m1952b(method6, new C0698u(method6, i3, z3));
                                    C0704w.m1796d("hooked " + method6.getDeclaringClass().getSimpleName() + "." + method6.getName());
                                }
                            } else {
                                if (arrayList2.isEmpty()) {
                                    C0704w.m1796d("no onCreate method found on com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI");
                                }
                                Method[] declaredMethods3 = cls3.getDeclaredMethods();
                                AbstractC0307g.m702d(declaredMethods3, "getDeclaredMethods(...)");
                                ArrayList arrayList3 = new ArrayList();
                                for (Method method7 : declaredMethods3) {
                                    Class<?>[] parameterTypes = method7.getParameterTypes();
                                    AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                                    if (parameterTypes.length == 0 && ((AbstractC0307g.m699a(method7.getReturnType(), Void.TYPE) || AbstractC0307g.m699a(method7.getReturnType(), Void.class)) && (AbstractC0307g.m699a(method7.getName(), "initView") || AbstractC0307g.m699a(method7.getName(), "init") || AbstractC0433r.m1029D0(method7.getName(), "a", false) || method7.getName().length() <= 2))) {
                                        arrayList3.add(method7);
                                    }
                                }
                                List listM548t0 = AbstractC0181l.m548t0(arrayList3, new C0695t(0, new C0695t(1, new C0692s(false ? 1 : 0))));
                                ArrayList arrayList4 = new ArrayList();
                                for (Object obj4 : listM548t0) {
                                    Method method8 = (Method) obj4;
                                    if (AbstractC0307g.m699a(method8.getName(), "initView") || AbstractC0307g.m699a(method8.getName(), "init")) {
                                        arrayList4.add(obj4);
                                    }
                                }
                                boolean zIsEmpty = arrayList4.isEmpty();
                                List<Method> list = arrayList4;
                                if (zIsEmpty) {
                                    list = C0190u.f401a;
                                }
                                for (Method method9 : list) {
                                    AbstractC0307g.m700b(method9);
                                    if (keySetView.add(C0704w.m1795c(method9))) {
                                        AbstractC0762d.m1952b(method9, new C0698u(method9, false ? 1 : 0, false ? 1 : 0));
                                        C0704w.m1796d("hooked " + method9.getDeclaringClass().getSimpleName() + "." + method9.getName() + "()");
                                    }
                                }
                                if (list.isEmpty()) {
                                    C0704w.m1796d("initView not found; rely on onCreate post click");
                                }
                                C0704w.m1796d("hooks ready for com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI");
                            }
                        }
                    } else {
                        C0704w.m1796d("class not found: com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI (" + thM465a10.getMessage() + ")");
                    }
                    break;
                }
                return C0146l.f339a;
            case 3:
                return m2107a();
            case 4:
                return m2108c();
            case 5:
                return m2109d();
            case 6:
                return m2110e();
            case 7:
                return m2111f();
            case 8:
                AbstractC0307g.m703e(this.f2949b, "$ctx");
                ClassLoader classLoader4 = this.f2950c;
                AbstractC0307g.m703e(classLoader4, "$cl");
                C0655f1 c0655f1 = C0655f1.f2038a;
                if (C0655f1.f2039b.compareAndSet(false, true)) {
                    C0655f1.m1639d("install enabled=" + C0655f1.m1637b());
                    c0655f1.m1640a(classLoader4, "com.tencent.mm.plugin.profile.ui.ContactInfoUI");
                    c0655f1.m1640a(classLoader4, "com.tencent.mm.chatroom.ui.ChatroomInfoUI");
                }
                return C0146l.f339a;
            case 9:
                return m2112g();
            case 10:
                return m2113h();
            default:
                Context context3 = this.f2949b;
                ClassLoader classLoader5 = this.f2950c;
                AbstractC0307g.m703e(context3, "$appContext");
                AbstractC0307g.m703e(classLoader5, "$classLoader");
                HookDiagnostics hookDiagnostics = HookDiagnostics.f3000a;
                boolean zCompareAndSet2 = HookDiagnostics.f3002c.compareAndSet(false, true);
                Context applicationContext = context3.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context3;
                }
                HookDiagnostics.f3007h = applicationContext;
                HookDiagnostics.f3008i = classLoader5;
                if (AbstractC0358S.f729i) {
                    HookDiagnostics.f3003d.set(false);
                    HookDiagnostics.f3004e.set(false);
                }
                HookDiagnostics.m2157g("install first=" + zCompareAndSet2 + " interactive=" + AbstractC0358S.f729i + " pendingDialog=" + AbstractC0358S.f728h);
                if (zCompareAndSet2) {
                    try {
                        AbstractC0358S.m904q(Activity.class, "onResume", new C0596I1(3, false));
                    } catch (Throwable th17) {
                        AbstractC0040p.m116u(th17);
                    }
                    try {
                        AbstractC0358S.m904q(Activity.class, "onWindowFocusChanged", Boolean.TYPE, new C0596I1(2));
                    } catch (Throwable th18) {
                        AbstractC0040p.m116u(th18);
                    }
                    Application application = context3 instanceof Application ? (Application) context3 : null;
                    if (application != null) {
                        HookDiagnostics hookDiagnostics2 = HookDiagnostics.f3000a;
                        application.registerActivityLifecycleCallbacks(new C0829h());
                    } else {
                        Context applicationContext2 = context3.getApplicationContext();
                        Application application2 = applicationContext2 instanceof Application ? (Application) applicationContext2 : null;
                        if (application2 != null) {
                            application = application2;
                            try {
                                HookDiagnostics hookDiagnostics22 = HookDiagnostics.f3000a;
                                application.registerActivityLifecycleCallbacks(new C0829h());
                            } catch (Throwable th19) {
                                AbstractC0040p.m116u(th19);
                            }
                        }
                    }
                    break;
                }
                HookDiagnostics.f3005f.set(0);
                RunnableC0488m runnableC0488m = new RunnableC0488m(1);
                Handler handler = HookDiagnostics.f3001b;
                handler.postDelayed(runnableC0488m, 600L);
                handler.postDelayed(new RunnableC0713z(4), 1200L);
                handler.postDelayed(new RunnableC0713z(5), 3000L);
                handler.postDelayed(new RunnableC0713z(6), 6000L);
                return C0146l.f339a;
        }
    }

    public /* synthetic */ FeatureInstallTask(Context context, ClassLoader classLoader, String str, int i2) {
        this.f2948a = i2;
        this.f2949b = context;
        this.f2950c = classLoader;
    }

    public /* synthetic */ FeatureInstallTask(ClassLoader classLoader, Context context) {
        this.f2948a = 10;
        this.f2950c = classLoader;
        this.f2949b = context;
    }
}
