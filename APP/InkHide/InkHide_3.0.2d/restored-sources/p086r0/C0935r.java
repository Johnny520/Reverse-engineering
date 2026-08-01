package p086r0;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import com.p055lu.wxmask.MainHook;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import p001A0.C0051x;
import p005C0.C0070d;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0129q;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p054c0.AbstractC0514f;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p084q0.C0804d;
import p102z0.AbstractC1126i;
import p102z0.C1124g;

/* JADX INFO: renamed from: r0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0935r implements InterfaceC0551a {

    /* JADX INFO: renamed from: b */
    public static final String[] f3330b = {"com.tencent.tinker.lib.service.TinkerPatchForeService", "com.tencent.tinker.lib.service.TinkerPatchService", "com.tencent.tinker.lib.service.TinkerPatchService$InnerService", "com.tencent.tinker.lib.service.DefaultTinkerResultService"};

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3331a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [q0.h.<init>():void] */
    public /* synthetic */ C0935r(int i2) {
        this.f3331a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m2049a(Bundle bundle, LinkedHashSet linkedHashSet, int i2) {
        Object c0104d;
        if (bundle == null || i2 > 3) {
            return;
        }
        Set<String> setKeySet = bundle.keySet();
        AbstractC0223g.m417d(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            try {
                c0104d = bundle.get(str);
            } catch (Throwable th) {
                c0104d = new C0104d(th);
            }
            if (c0104d instanceof C0104d) {
                c0104d = null;
            }
            if (c0104d != null) {
                if (c0104d instanceof CharSequence) {
                    linkedHashSet.add(c0104d.toString());
                } else if (c0104d instanceof Bundle) {
                    m2049a((Bundle) c0104d, linkedHashSet, i2 + 1);
                } else if (c0104d instanceof Object[]) {
                    for (Object obj : (Object[]) c0104d) {
                        int i3 = i2 + 1;
                        if (obj instanceof CharSequence) {
                            linkedHashSet.add(obj.toString());
                        } else if (obj instanceof Bundle) {
                            m2049a((Bundle) obj, linkedHashSet, i3);
                        }
                    }
                } else if (c0104d instanceof Iterable) {
                    for (Object obj2 : (Iterable) c0104d) {
                        int i4 = i2 + 1;
                        if (obj2 instanceof CharSequence) {
                            linkedHashSet.add(obj2.toString());
                        } else if (obj2 instanceof Bundle) {
                            m2049a((Bundle) obj2, linkedHashSet, i4);
                        }
                    }
                } else {
                    AbstractC0223g.m415b(str);
                    if (AbstractC0299i.m511i0(str, "user", true) || AbstractC0299i.m511i0(str, "talker", true) || AbstractC0299i.m511i0(str, "title", true)) {
                        linkedHashSet.add(c0104d.toString());
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2050b(PendingIntent pendingIntent, LinkedHashSet linkedHashSet) {
        Object c0104d;
        String strFlattenToShortString;
        if (pendingIntent == null) {
            return;
        }
        try {
            c0104d = (Intent) AbstractC0514f.f1622b.mo1012c(pendingIntent, "getIntent", new Object[0]);
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        if (c0104d instanceof C0104d) {
            c0104d = null;
        }
        Intent intent = (Intent) c0104d;
        if (intent == null) {
            return;
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            linkedHashSet.add(dataString);
        }
        ComponentName component = intent.getComponent();
        if (component != null && (strFlattenToShortString = component.flattenToShortString()) != null) {
            linkedHashSet.add(strFlattenToShortString);
        }
        m2049a(intent.getExtras(), linkedHashSet, 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m2051c(Method method) {
        String name = method.getDeclaringClass().getName();
        String name2 = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
        return name + "#" + name2 + "(" + AbstractC0120h.m260h0(parameterTypes, ",", new C0804d(23), 30) + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        Object c0104d;
        Object c0104d2;
        XC_MethodHook.Unhook c0104d3;
        XC_MethodHook.Unhook c0104d4;
        XC_MethodHook.Unhook c0104d5;
        switch (this.f3331a) {
            case 0:
                ClassLoader classLoader = context.getClassLoader();
                AbstractC0223g.m417d(classLoader, "getClassLoader(...)");
                Class clsMo1021l = AbstractC0514f.f1622b.mo1021l(classLoader, "com.tencent.tinker.loader.shareutil.ShareTinkerInternals");
                C0109i c0109i = C0109i.f404a;
                if (clsMo1021l != null) {
                    Method[] declaredMethods = clsMo1021l.getDeclaredMethods();
                    AbstractC0223g.m417d(declaredMethods, "getDeclaredMethods(...)");
                    ArrayList<Method> arrayList = new ArrayList();
                    for (Method method : declaredMethods) {
                        String name = method.getName();
                        AbstractC0223g.m417d(name, "getName(...)");
                        if (AbstractC0307q.m538h0(name, false, "isTinkerEnabled") && (AbstractC0223g.m414a(method.getReturnType(), Boolean.TYPE) || AbstractC0223g.m414a(method.getReturnType(), Boolean.class))) {
                            arrayList.add(method);
                        }
                    }
                    for (Method method2 : arrayList) {
                        String name2 = method2.getDeclaringClass().getName();
                        String name3 = method2.getName();
                        Class<?>[] parameterTypes = method2.getParameterTypes();
                        AbstractC0223g.m417d(parameterTypes, "getParameterTypes(...)");
                        String str = "disable-wechat-hot-update-" + name2 + "#" + name3 + "#" + AbstractC0120h.m260h0(parameterTypes, ",", new C0804d(14), 30);
                        if (MainHook.uniqueMetaStore.add(str)) {
                            try {
                                method2.setAccessible(true);
                                AbstractC0514f.m1027d(method2, new C0051x(3));
                                AbstractC0731a.m1384a("disable wechat hot update hooked", method2.getName());
                                c0104d2 = c0109i;
                            } catch (Throwable th) {
                                c0104d2 = new C0104d(th);
                            }
                            Throwable thM246a = AbstractC0105e.m246a(c0104d2);
                            if (thM246a != null) {
                                MainHook.uniqueMetaStore.remove(str);
                                AbstractC0731a.m1387d("disable wechat hot update hook fail", method2.getName(), thM246a);
                            }
                        }
                    }
                }
                boolean z2 = AbstractC1126i.f3786a;
                i = (C1124g.m2443s() && C1124g.m2435k().getDisableWechatHotUpdate()) ? 2 : 0;
                String[] strArr = f3330b;
                for (int i2 = 0; i2 < 4; i2++) {
                    String str2 = strArr[i2];
                    try {
                        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context.getPackageName(), str2), i, 1);
                        c0104d = c0109i;
                    } catch (Throwable th2) {
                        c0104d = new C0104d(th2);
                    }
                    Throwable thM246a2 = AbstractC0105e.m246a(c0104d);
                    if (thM246a2 != null) {
                        AbstractC0731a.m1387d("apply tinker component state fail", str2, thM246a2);
                    }
                }
                break;
            case 1:
                if (AbstractC0223g.m414a(loadPackageParam.processName, loadPackageParam.packageName + ":push")) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Class<NotificationManager> superclass = NotificationManager.class; superclass != null; superclass = superclass.getSuperclass()) {
                        Method[] declaredMethods2 = superclass.getDeclaredMethods();
                        AbstractC0223g.m417d(declaredMethods2, "getDeclaredMethods(...)");
                        AbstractC0129q.m292f0(arrayList2, declaredMethods2);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        Method method3 = (Method) obj;
                        String name4 = method3.getName();
                        AbstractC0223g.m417d(name4, "getName(...)");
                        if (AbstractC0307q.m538h0(name4, false, "notify")) {
                            Class<?>[] parameterTypes2 = method3.getParameterTypes();
                            AbstractC0223g.m417d(parameterTypes2, "getParameterTypes(...)");
                            int length = parameterTypes2.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    break;
                                } else if (Notification.class.isAssignableFrom(parameterTypes2[i3])) {
                                    arrayList3.add(obj);
                                } else {
                                    i3++;
                                }
                            }
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList<Method> arrayList4 = new ArrayList();
                    for (Object obj2 : arrayList3) {
                        if (hashSet.add(m2051c((Method) obj2))) {
                            arrayList4.add(obj2);
                        }
                    }
                    for (Method method4 : arrayList4) {
                        String strM352h = AbstractC0174d.m352h("hide-close-friend-push-notification-", m2051c(method4));
                        if (!MainHook.uniqueMetaStore.contains(strM352h)) {
                            AbstractC0514f.m1027d(method4, new C0070d(i, this));
                            MainHook.uniqueMetaStore.add(strM352h);
                        }
                    }
                    break;
                }
                break;
            default:
                ClassLoader classLoader2 = AbstractC0503h.m991x().getClassLoader();
                AbstractC0223g.m418e(classLoader2, "classLoader");
                Class clsMo1021l2 = AbstractC0514f.f1622b.mo1021l(classLoader2, "com.tencent.mm.ui.LauncherUI");
                Class cls = Integer.TYPE;
                if (clsMo1021l2 != null) {
                    try {
                        c0104d3 = AbstractC0514f.f1622b.mo1017h(clsMo1021l2, "dispatchKeyEvent", KeyEvent.class, new C0051x(10));
                    } catch (Throwable th3) {
                        c0104d3 = new C0104d(th3);
                    }
                    Throwable thM246a3 = AbstractC0105e.m246a(c0104d3);
                    if (thM246a3 != null) {
                        AbstractC0731a.m1387d("AttachUI hook LauncherUI dispatchKeyEvent fail", thM246a3);
                    }
                    try {
                        c0104d4 = AbstractC0514f.f1622b.mo1017h(clsMo1021l2, "onKeyDown", cls, KeyEvent.class, new C0051x(11));
                    } catch (Throwable th4) {
                        c0104d4 = new C0104d(th4);
                    }
                    Throwable thM246a4 = AbstractC0105e.m246a(c0104d4);
                    if (thM246a4 != null) {
                        AbstractC0731a.m1387d("AttachUI hook LauncherUI onKeyDown fail", thM246a4);
                    }
                    try {
                        c0104d5 = AbstractC0514f.f1622b.mo1017h(clsMo1021l2, "onBackPressed", new C0051x(12));
                    } catch (Throwable th5) {
                        c0104d5 = new C0104d(th5);
                    }
                    Throwable thM246a5 = AbstractC0105e.m246a(c0104d5);
                    if (thM246a5 != null) {
                        AbstractC0731a.m1387d("AttachUI hook LauncherUI onBackPressed fail", thM246a5);
                    }
                }
                AbstractC0514f.m1025b(Activity.class, "onKeyDown", cls, KeyEvent.class, new C0051x(8));
                AbstractC0514f.m1025b(Activity.class, "dispatchKeyEvent", KeyEvent.class, new C0051x(9));
                ClassLoader classLoader3 = AbstractC0503h.m991x().getClassLoader();
                AbstractC0223g.m418e(classLoader3, "classLoader");
                AbstractC0514f.m1025b(AbstractC0514f.f1622b.mo1021l(classLoader3, "com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro"), "initView", new C0051x(7));
                break;
        }
    }
}
