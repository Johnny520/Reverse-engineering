package com.p055lu.wxmask;

import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.Thread;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0026a;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p014H.C0142a;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p053c.InterfaceC0508a;
import p054c0.AbstractC0513e;
import p054c0.AbstractC0514f;
import p059d0.InterfaceC0517b;
import p062e0.AbstractC0552b;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;
import p077m0.C0766d;
import p077m0.C0767e;
import p077m0.C0768f;
import p084q0.C0801a;
import p084q0.C0806f;
import p084q0.C0807g;
import p084q0.C0808h;
import p086r0.C0925n1;
import p102z0.AbstractC1121d;
import p102z0.AbstractC1135r;
import p102z0.AbstractC1138u;
import p102z0.C1118a;
import p102z0.C1119b;
import p102z0.C1120c;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public class MainHook implements IXposedHookLoadPackage, IXposedHookZygoteInit, IXposedHookInitPackageResources {
    private static final String TARGET_PACKAGE = "com.tencent.mm";
    public static CopyOnWriteArraySet<String> uniqueMetaStore = new CopyOnWriteArraySet<>();
    private static String MODULE_PATH = null;
    private boolean hasInit = false;
    private List<XC_MethodHook.Unhook> initUnHookList = new ArrayList();
    private boolean isHookEntryHandle = false;
    private final HashSet<String> handledProcessKeys = new HashSet<>();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public void initPlugin(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        if (context == null) {
            AbstractC0731a.m1387d("context is null");
            return;
        }
        if (this.hasInit) {
            return;
        }
        AbstractC0731a.m1386c("start init Plugin");
        this.hasInit = true;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            AbstractC0503h.f1600i = context;
        } else {
            AbstractC0503h.f1600i = applicationContext;
        }
        if ("com.lu.wxmask272".equals(loadPackageParam.packageName)) {
            initSelfPlugins(context, loadPackageParam);
        } else {
            initTargetPlugins(context, loadPackageParam);
        }
        for (XC_MethodHook.Unhook unhook : this.initUnHookList) {
            if (unhook != null) {
                unhook.unhook();
            }
        }
        AbstractC0731a.m1386c("init plugin finish");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void initSelfPlugins(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        SelfHook.getInstance().handleHook(context, loadPackageParam);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void initTargetPlugins(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        C1118a c1118aM2490l = AbstractC1135r.m2490l();
        if (!(c1118aM2490l.f3763d && c1118aM2490l.f3764e)) {
            AbstractC0731a.m1387d("MaskWechat integrity check failed, skip all target hooks");
            AbstractC1135r.m2474B(true);
            return;
        }
        C1120c c1120c = AbstractC1121d.f3779a;
        C1118a c1118aM2490l2 = AbstractC1135r.m2490l();
        if (c1118aM2490l2.f3763d && c1118aM2490l2.f3764e) {
            C1119b c1119bM2406g = C1120c.m2406g(null, true);
            if (c1119bM2406g != null) {
                if (c1119bM2406g.f3767a) {
                    if (C1120c.m2403d(c1119bM2406g)) {
                        c1120c.m2409h(true, new C0925n1(20));
                    }
                }
            }
            c1120c.m2409h(false, new C0925n1(21));
            if (loadPackageParam.packageName.equals(loadPackageParam.processName)) {
                AtomicBoolean atomicBoolean = AbstractC1138u.f3841a;
                AbstractC0223g.m418e(context, "context");
                if (AbstractC1138u.f3841a.compareAndSet(false, true)) {
                    final Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    final Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: z0.s
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // java.lang.Thread.UncaughtExceptionHandler
                        public final void uncaughtException(Thread thread, Throwable th) {
                            Object c0104d;
                            Context context2 = applicationContext;
                            if (AbstractC1138u.f3842b.compareAndSet(false, true)) {
                                try {
                                    AbstractC0223g.m415b(th);
                                    if (AbstractC1138u.m2505a(th)) {
                                        AbstractC0223g.m415b(thread);
                                        AbstractC1138u.m2506b(context2, thread, th);
                                    }
                                    c0104d = C0109i.f404a;
                                } catch (Throwable th2) {
                                    c0104d = new C0104d(th2);
                                }
                                Throwable thM246a = AbstractC0105e.m246a(c0104d);
                                if (thM246a != null) {
                                    AbstractC0731a.m1387d("runtime crash diagnostics fail", thM246a);
                                }
                            }
                            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = defaultUncaughtExceptionHandler;
                            if (uncaughtExceptionHandler != null) {
                                uncaughtExceptionHandler.uncaughtException(thread, th);
                            } else {
                                Process.killProcess(Process.myPid());
                                System.exit(10);
                                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
                            }
                        }
                    });
                    AbstractC0731a.m1384a("runtime crash diagnostics installed");
                }
                AbstractC1135r.m2474B(false);
            }
            C0801a c0801a = new C0801a(0);
            C0807g c0807g = new C0807g();
            C0806f c0806f = new C0806f();
            c0806f.f2678a = false;
            new Handler(Looper.getMainLooper());
            InterfaceC0551a[] interfaceC0551aArr = (InterfaceC0551a[]) Arrays.copyOf(new InterfaceC0551a[]{c0801a, c0807g, c0806f, new C0808h()}, 4);
            AbstractC0223g.m418e(interfaceC0551aArr, "plugins");
            for (InterfaceC0551a interfaceC0551a : interfaceC0551aArr) {
                AbstractC0552b.f1859a.put(interfaceC0551a.getClass(), interfaceC0551a);
            }
            AbstractC0223g.m418e(context, "context");
            Collection<InterfaceC0551a> collectionValues = AbstractC0552b.f1859a.values();
            AbstractC0223g.m417d(collectionValues, "<get-values>(...)");
            for (InterfaceC0551a interfaceC0551a2 : collectionValues) {
                if (interfaceC0551a2 != null) {
                    try {
                        interfaceC0551a2.handleHook(context, loadPackageParam);
                    } catch (Exception e2) {
                        Log.e(">>>", "plugins handleHooks", e2);
                    }
                }
            }
            return;
        }
        AbstractC0731a.m1387d("MaskWechat service disabled, skip all target hooks");
        c1120c.m2409h(true, new C0925n1(19));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$handleLoadPackage$0(Throwable th) {
        if (th instanceof InvocationTargetException) {
            th = ((InvocationTargetException) th).getTargetException();
        }
        AbstractC0731a.m1387d("MaskPlugin error", th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$handleLoadPackage$1(Method method, Throwable th) {
        Class<?> returnType = method.getReturnType();
        if (String.class.equals(returnType) || CharSequence.class.isAssignableFrom(returnType)) {
            return "";
        }
        if (Integer.TYPE.equals(returnType) || Integer.class.equals(returnType)) {
            return 0;
        }
        if (Long.TYPE.equals(returnType) || Long.class.equals(returnType)) {
            return 0L;
        }
        if (Double.TYPE.equals(returnType) || Double.class.equals(returnType)) {
            return Double.valueOf(0.0d);
        }
        if (Float.TYPE.equals(returnType) || Float.class.equals(returnType)) {
            return Float.valueOf(0.0f);
        }
        if (Byte.TYPE.equals(returnType) || Byte.class.equals(returnType)) {
            return (byte) 0;
        }
        if (Short.TYPE.equals(returnType) || Short.class.equals(returnType)) {
            return (short) 0;
        }
        if (Boolean.TYPE.equals(returnType) || Boolean.class.equals(returnType)) {
            return Boolean.FALSE;
        }
        if (Character.TYPE.equals(returnType) || Character.class.equals(returnType)) {
            return (char) 0;
        }
        if (byte[].class.equals(returnType)) {
            return new byte[0];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam initPackageResourcesParam) {
        if ("com.lu.wxmask272".equals(initPackageResourcesParam.packageName)) {
            return;
        }
        TARGET_PACKAGE.equals(initPackageResourcesParam.packageName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam loadPackageParam) {
        String str = loadPackageParam.packageName + ":" + loadPackageParam.processName;
        if (this.handledProcessKeys.contains(str)) {
            return;
        }
        this.handledProcessKeys.add(str);
        HashSet hashSet = new HashSet();
        hashSet.add("com.lu.wxmask272");
        hashSet.add(TARGET_PACKAGE);
        if (hashSet.contains(loadPackageParam.packageName)) {
            AbstractC0731a.f2484a = new C0766d(25);
            AbstractC0731a.m1386c("start main plugin for wechat", loadPackageParam.processName, Integer.valueOf(Process.myPid()));
            C0142a c0142a = AbstractC0514f.f1621a;
            InterfaceC0517b interfaceC0517b = AbstractC0513e.f1619a;
            synchronized (AbstractC0513e.class) {
                InterfaceC0517b interfaceC0517b2 = AbstractC0513e.f1619a;
                AbstractC0513e.f1620b = interfaceC0517b2;
                AbstractC0514f.f1622b = interfaceC0517b2;
            }
            c0142a.f443b = new C0026a(23);
            c0142a.f444c = new C0026a(24);
            this.initUnHookList.add(AbstractC0514f.f1622b.mo1023n(Application.class.getName(), loadPackageParam.classLoader, "onCreate", new C0767e(this, loadPackageParam)));
            this.initUnHookList.add(AbstractC0514f.f1622b.mo1023n(Instrumentation.class.getName(), loadPackageParam.classLoader, "callApplicationOnCreate", Application.class.getName(), new C0768f(this, loadPackageParam)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void initZygote(IXposedHookZygoteInit.StartupParam startupParam) {
        String str = startupParam.modulePath;
        MODULE_PATH = str;
        if (str == null || AbstractC0307q.m534d0(str) || AbstractC0223g.m414a(AbstractC1135r.f3831c, str)) {
            return;
        }
        AbstractC1135r.f3831c = str;
        AbstractC1135r.f3832d = null;
    }
}
