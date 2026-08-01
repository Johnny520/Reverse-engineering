package com.p001mr.elaris;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Handler;
import android.view.View;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import p000.AbstractC0000a;
import p000.AbstractC0004a3;
import p000.AbstractC0006a5;
import p000.AbstractC0008a7;
import p000.AbstractC0009a8;
import p000.AbstractC0033c0;
import p000.AbstractC0182d7;
import p000.AbstractC0198e7;
import p000.AbstractC0204ed;
import p000.AbstractC0225g2;
import p000.AbstractC0233ga;
import p000.AbstractC0238h;
import p000.AbstractC0242h3;
import p000.AbstractC0260i5;
import p000.AbstractC0264i9;
import p000.AbstractC0273j;
import p000.AbstractC0278j4;
import p000.AbstractC0299k9;
import p000.AbstractC0329m7;
import p000.AbstractC0332ma;
import p000.AbstractC0361o7;
import p000.AbstractC0366oc;
import p000.AbstractC0423qa;
import p000.AbstractC0429r0;
import p000.AbstractC0432r3;
import p000.AbstractC0440rb;
import p000.AbstractC0444s;
import p000.AbstractC0449s4;
import p000.AbstractC0451s6;
import p000.AbstractC0463t2;
import p000.AbstractC0470t9;
import p000.AbstractC0497v4;
import p000.AbstractC0505vc;
import p000.AbstractC0532x7;
import p000.AbstractC0553yc;
import p000.AbstractC0560z3;
import p000.C0223g0;
import p000.C0230g7;
import p000.C0246h7;
import p000.C0262i7;
import p000.C0281j7;
import p000.C0297k7;
import p000.C0529x4;
import p000.C0548y7;
import p000.C0564z7;
import p000.RunnableC0214f7;
import p000.RunnableC0313l7;
import p000.RunnableC0334mc;

/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class HookEntry {

    /* JADX INFO: renamed from: QQ */
    private static final String f114QQ = "com.tencent.mobileqq";
    private static volatile boolean sDefaultDecorationsHooked;
    private static volatile boolean sEmotionAsPicInstalled;
    private static volatile long sLastOriginalImageSendEntryLogAt;
    private static volatile long sLastPicSummaryNoPicLogAt;
    private static volatile boolean sMessageRepeaterInstallTried;
    private static volatile boolean sPicSummarySendHookInstalled;
    private static volatile boolean sQQShowInAioInstalled;
    private static final HookConfig CONFIG = new HookConfig();
    private static final Set<String> LOAD_DISPATCHED = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Set<String> HOST_APP_PREPARED = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Map<String, Field> FIELD_CACHE = new ConcurrentHashMap();
    private static final Set<String> FIELD_MISS_CACHE = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final Set<Integer> DECORATION_DONE = Collections.newSetFromMap(new ConcurrentHashMap());
    private static final C0529x4 FILE_CARRIER_CLASSES = new C0529x4();
    private static final List<XC_MethodHook.Unhook> DEFAULT_DECORATION_UNHOOKS = Collections.synchronizedList(new ArrayList());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void cacheClassList(String str, Class<?> cls) {
        String name;
        if (str == null || cls == null) {
            return;
        }
        try {
            name = cls.getName();
        } catch (Throwable unused) {
            name = "";
        }
        if (name.length() == 0) {
            return;
        }
        String strM1004e = AbstractC0463t2.m1004e(str);
        if (strM1004e.length() == 0) {
            AbstractC0463t2.m1015p(str, name);
            return;
        }
        for (String str2 : strM1004e.split("\\|")) {
            if (name.equals(str2)) {
                return;
            }
        }
        AbstractC0463t2.m1015p(str, strM1004e + "|" + name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static ClassLoader currentHostClassLoader() {
        Context contextHostContext = hostContext();
        ClassLoader classLoader = AbstractC0260i5.f401v;
        if (classLoader != null) {
            return classLoader;
        }
        if (contextHostContext == null) {
            return null;
        }
        try {
            return contextHostContext.getClassLoader();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object findContactArg(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        for (Object obj : objArr) {
            if (obj != null) {
                String name = obj.getClass().getName();
                if (name.endsWith(".Contact") || name.contains("nativeinterface.Contact")) {
                    return obj;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Field findField(Class<?> cls, String str) {
        if (cls != null && str != null) {
            String str2 = cls.getName() + "#" + str;
            Field field = FIELD_CACHE.get(str2);
            if (field != null) {
                return field;
            }
            if (FIELD_MISS_CACHE.contains(str2)) {
                return null;
            }
            while (cls != null) {
                try {
                    Field declaredField = cls.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    FIELD_CACHE.put(str2, declaredField);
                    return declaredField;
                } catch (NoSuchFieldException unused) {
                    cls = cls.getSuperclass();
                }
            }
            FIELD_MISS_CACHE.add(str2);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object firstMsgRecordArg(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        for (Object obj : objArr) {
            if (obj != null && isMsgRecordReturnType(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object firstNonNull(Object obj, Object obj2) {
        return obj != null ? obj : obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void forceDefaultAttrMap(Map<?, ?> map) {
        if (map == null) {
            return;
        }
        Iterator<?> it = map.values().iterator();
        while (it.hasNext()) {
            forceDefaultMsgAttributeInfo(it.next());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void forceDefaultMsgAttributeInfo(Object obj) {
        if (obj == null || looksLikeFileCarrierObject(obj)) {
            return;
        }
        Object objFirstNonNull = firstNonNull(getField(obj, "vasMsgInfo"), getField(obj, "vasMsgElement"));
        if (objFirstNonNull != null) {
            obj = objFirstNonNull;
        }
        HookConfig hookConfig = CONFIG;
        if (hookConfig.bool(Prefs.KEY_DEFAULT_BUBBLE)) {
            Object objFirstNonNull2 = firstNonNull(getField(obj, "bubbleInfo"), getField(obj, "bubble"));
            if (objFirstNonNull2 == null) {
                objFirstNonNull2 = obj;
            }
            setFieldIfExists(objFirstNonNull2, "bubbleId", 0);
            setFieldIfExists(objFirstNonNull2, "subBubbleId", 0);
            setFieldIfExists(objFirstNonNull2, "diyTextId", 0);
            setFieldIfExists(objFirstNonNull2, "vipFaceId", 0);
        }
        if (hookConfig.bool(Prefs.KEY_DEFAULT_FONT)) {
            Object objFirstNonNull3 = firstNonNull(getField(obj, "vasFont"), getField(obj, "font"));
            if (objFirstNonNull3 == null) {
                objFirstNonNull3 = obj;
            }
            setFieldIfExists(objFirstNonNull3, "fontId", 0);
            setFieldIfExists(objFirstNonNull3, "subFontId", 0L);
            setFieldIfExists(objFirstNonNull3, "magicFontType", 0);
            setFieldIfExists(objFirstNonNull3, "fontType", 0);
        }
        if (hookConfig.bool(Prefs.KEY_BLOCK_AVATAR_PENDANT)) {
            Object objFirstNonNull4 = firstNonNull(getField(obj, "avatarPendantInfo"), getField(obj, "avatarPendant"));
            if (objFirstNonNull4 == null) {
                objFirstNonNull4 = firstNonNull(getField(obj, "pendant"), getField(obj, "avatarPendantElement"));
            }
            if (objFirstNonNull4 != null) {
                obj = objFirstNonNull4;
            }
            setFieldIfExists(obj, "pendantId", 0L);
            setFieldIfExists(obj, "pendantDiyInfoId", 0);
            setFieldIfExists(obj, "id", 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void forceDefaultMsgDecorationField(Object obj, String str) {
        forceDefaultMsgDecorationValue(getField(obj, str), 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void forceDefaultMsgDecorationValue(Object obj, int i) {
        if (obj == null || i > 2 || looksLikeFileCarrierObject(obj)) {
            return;
        }
        if (obj instanceof Map) {
            forceDefaultAttrMap((Map) obj);
            return;
        }
        int i2 = 0;
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                forceDefaultMsgDecorationValue(it.next(), i + 1);
                i2++;
                if (i2 >= 80) {
                    return;
                }
            }
            return;
        }
        if (obj.getClass().isArray()) {
            int iMin = Math.min(Array.getLength(obj), 80);
            while (i2 < iMin) {
                forceDefaultMsgDecorationValue(Array.get(obj, i2), i + 1);
                i2++;
            }
            return;
        }
        forceDefaultMsgAttributeInfo(obj);
        int i3 = i + 1;
        forceDefaultMsgDecorationValue(getField(obj, "vasMsgInfo"), i3);
        forceDefaultMsgDecorationValue(getField(obj, "vasMsgElement"), i3);
        forceDefaultMsgDecorationValue(getField(obj, "msgAttributeInfo"), i3);
        forceDefaultMsgDecorationValue(getField(obj, "avatarPendantInfo"), i3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static Object getField(Object obj, String str) {
        if (obj == null) {
            return null;
        }
        try {
            Field fieldFindField = findField(obj.getClass(), str);
            if (fieldFindField == null) {
                return null;
            }
            fieldFindField.setAccessible(true);
            return fieldFindField.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String getHostSourceDir() {
        try {
            Context contextHostContext = hostContext();
            return (contextHostContext == null || contextHostContext.getApplicationInfo() == null) ? "" : contextHostContext.getApplicationInfo().sourceDir;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void handleHostPackage(String str, String str2, ClassLoader classLoader) {
        if (!f114QQ.equals(str) || classLoader == null) {
            return;
        }
        C0548y7 c0548y7 = new C0548y7(str, str2);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("@");
        String str3 = c0548y7.f1092a;
        sb.append(str3);
        String string = sb.toString();
        if (!LOAD_DISPATCHED.add(string)) {
            log("skip duplicated loader dispatch: ".concat(string));
            return;
        }
        logAlways("loaded in " + str + ", process=" + str3);
        try {
            try {
                AbstractC0532x7.m1136e(classLoader, str3);
            } catch (Throwable th) {
                log("host hot update early entry failed: " + th);
            }
            XposedBridge.hookAllMethods(Instrumentation.class, "callApplicationOnCreate", new C0230g7(classLoader, c0548y7, str3));
            XposedBridge.hookAllMethods(Application.class, "onCreate", new C0246h7(classLoader, c0548y7, str3));
        } catch (Throwable th2) {
            log("hook Application.onCreate failed: " + th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean hasDefaultMsgDecorations() {
        HookConfig hookConfig = CONFIG;
        return hookConfig.bool(Prefs.KEY_DEFAULT_BUBBLE) || hookConfig.bool(Prefs.KEY_DEFAULT_FONT) || hookConfig.bool(Prefs.KEY_BLOCK_AVATAR_PENDANT);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasMsfProcessTargets() {
        HookConfig hookConfig = CONFIG;
        return hookConfig.bool(Prefs.KEY_FORCE_TABLET_MODE) || hookConfig.bool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE) || hookConfig.bool(Prefs.KEY_MESSAGE_RECALL_GUARD);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasOtherProcessTargets(String str) {
        if (str == null) {
            return false;
        }
        if (str.contains(":peak") || str.contains(":file") || str.contains(":tool")) {
            HookConfig hookConfig = CONFIG;
            return hookConfig.bool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE) || hookConfig.bool(Prefs.KEY_MEDIA_CLICK_TO_LOAD) || hookConfig.bool(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT) || hookConfig.bool(Prefs.KEY_DOWNLOAD_DIRECT_WRITE) || hookConfig.bool(Prefs.KEY_RENAME_APK_FILE) || hookConfig.bool(Prefs.KEY_PIC_SUMMARY_ENABLED) || hookConfig.bool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT);
        }
        if (!"com.tencent.mobileqq:qqfav".equals(str)) {
            return false;
        }
        HookConfig hookConfig2 = CONFIG;
        return hookConfig2.bool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE) || hookConfig2.bool(Prefs.KEY_EXTERNAL_BROWSER) || hookConfig2.bool(Prefs.KEY_UNBLOCK_RISK_WEB);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean hasToolProcessTargets() {
        HookConfig hookConfig = CONFIG;
        return hookConfig.bool(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT) || hookConfig.bool(Prefs.KEY_DOWNLOAD_DIRECT_WRITE) || hookConfig.bool(Prefs.KEY_WEB_KERNEL_FALLBACK) || hookConfig.bool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static synchronized void hookDefaultMsgDecorations(ClassLoader classLoader) {
        if (sDefaultDecorationsHooked) {
            return;
        }
        try {
            Class<?> clsFindClass = XposedHelpers.findClass("com.tencent.mobileqq.aio.msg.AIOMsgItem", classLoader);
            Set<XC_MethodHook.Unhook> setHookAllConstructors = XposedBridge.hookAllConstructors(clsFindClass, new C0262i7(40));
            if (setHookAllConstructors == null || setHookAllConstructors.isEmpty()) {
                log("AIOMsgItem MsgRecord constructor not found");
            } else {
                DEFAULT_DECORATION_UNHOOKS.addAll(setHookAllConstructors);
                sDefaultDecorationsHooked = true;
                log("default msg decorations constructor hooked class=" + clsFindClass.getName() + " count=" + setHookAllConstructors.size());
            }
        } catch (Throwable th) {
            log("hookDefaultMsgDecorations failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static synchronized void hookEmotionAsPic(ClassLoader classLoader) {
        if (sEmotionAsPicInstalled) {
            return;
        }
        try {
            int i = 0;
            for (Method method : XposedHelpers.findClass("com.tencent.qqnt.aio.adapter.api.impl.RichMediaBrowserApiImpl", classLoader).getDeclaredMethods()) {
                if ("checkIsFavPicAndShowPreview".equals(method.getName()) && method.getReturnType() == Boolean.TYPE && !Modifier.isAbstract(method.getModifiers())) {
                    XposedBridge.hookMethod(method, new C0281j7(60));
                    i++;
                    log("hooked emotion-as-pic: " + methodSig(method));
                }
            }
            if (i == 0) {
                log("emotion-as-pic method not found");
            }
            if (i > 0) {
                sEmotionAsPicInstalled = true;
            }
        } catch (Throwable th) {
            log("hookEmotionAsPic failed: " + th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static synchronized void hookPicSummarySendMsg(ClassLoader classLoader) {
        try {
            if (sPicSummarySendHookInstalled) {
                return;
            }
            int i = 0;
            for (String str : AbstractC0463t2.m1005f("target.kernel.msg_service_classes", new String[]{"com.tencent.qqnt.kernel.nativeinterface.IKernelMsgService$CppProxy", "com.tencent.qqnt.kernelpublic.nativeinterface.IKernelMsgService$CppProxy"}, classLoader)) {
                try {
                    Class<?> clsFindClass = XposedHelpers.findClass(str, classLoader);
                    cacheClassList("target.kernel.msg_service_classes", clsFindClass);
                    for (Method method : clsFindClass.getDeclaredMethods()) {
                        int iM1094m = AbstractC0497v4.m1094m(method, ArrayList.class);
                        if ("sendMsg".equals(method.getName()) && !Modifier.isAbstract(method.getModifiers())) {
                            XposedBridge.hookMethod(method, new C0150d(iM1094m));
                            i++;
                            log("hooked pic summary sendMsg wide: " + methodSig(method));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (i > 0) {
                sPicSummarySendHookInstalled = true;
            } else {
                log("pic summary sendMsg target not found");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void hookQQSettingEntry(ClassLoader classLoader) {
        QQSettingsEntryHooks.hookProviderEntry(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static synchronized void hookQQShowInAio(ClassLoader classLoader) {
        int i;
        if (sQQShowInAioInstalled) {
            return;
        }
        sQQShowInAioInstalled = true;
        try {
            i = 0;
            for (Method method : XposedHelpers.findClass(AbstractC0440rb.m870i("mobile.api", "SwitchApiImpl"), classLoader).getDeclaredMethods()) {
                if ("isQQShowEnableForAIO".equals(method.getName()) && method.getReturnType() == Boolean.TYPE && !Modifier.isAbstract(method.getModifiers())) {
                    XposedBridge.hookMethod(method, new C0297k7(60));
                    i++;
                    log("hooked QQShow in AIO runtime gate: " + methodSig(method));
                }
            }
        } catch (Throwable th) {
            log("hookQQShowInAio failed: " + th);
        }
        if (i != 0) {
            AbstractC0497v4.m1105x(classLoader);
            return;
        } else {
            log("isQQShowEnableForAIO not found");
            AbstractC0497v4.m1105x(classLoader);
            return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Context hostContext() {
        WeakReference weakReference = AbstractC0009a8.f34a;
        if (weakReference == null) {
            return null;
        }
        return (Context) weakReference.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String hostVersionSummary() {
        return AbstractC0009a8.f35b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static int hotReloadGeneration() {
        WeakReference weakReference = AbstractC0009a8.f34a;
        try {
            return Integer.parseInt(System.getProperty("com.mr.elaris.hot_reload_generation", "0"));
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static synchronized void installHooks(ClassLoader classLoader, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        int i = 0;
        try {
            try {
                if (z) {
                    if (AbstractC0329m7.f557a) {
                        return;
                    }
                    AbstractC0329m7.f557a = true;
                    HookConfig hookConfig = CONFIG;
                    if (hookConfig.bool(Prefs.KEY_FORCE_TABLET_MODE)) {
                        logAlways("tablet mode main process skipped; MSF-only for setting entry stability");
                    }
                    long jNanoTime = System.nanoTime();
                    try {
                        hookQQSettingEntry(classLoader);
                        logMainHookCost("settings_entry", jNanoTime);
                        long jNanoTime2 = System.nanoTime();
                        try {
                            installMainImmediateSafeHooks(classLoader, str);
                            logMainHookCost("main_immediate_total", jNanoTime2);
                            long jNanoTime3 = System.nanoTime();
                            try {
                                installMainProfileHooksAsync(classLoader);
                                logMainHookCost("profile_worker_schedule", jNanoTime3);
                                if (hookConfig.bool(Prefs.KEY_HOME_PULL_GUARD)) {
                                    String hostSourceDir = getHostSourceDir();
                                    long jNanoTime4 = System.nanoTime();
                                    AbstractC0361o7.m769a("Elaris-home-pull-hooks", new RunnableC0313l7(i, classLoader, hostSourceDir));
                                    logMainHookCost("home_pull_guard_schedule", jNanoTime4);
                                }
                                if (hookConfig.bool(Prefs.KEY_CLOCK_IN_ENABLED)) {
                                    long jNanoTime5 = System.nanoTime();
                                    if (classLoader != null) {
                                        try {
                                            AbstractC0008a7.f28c = classLoader;
                                        } catch (Throwable th) {
                                            logMainHookCost("group_clock_in", jNanoTime5);
                                            throw th;
                                        }
                                    }
                                    AbstractC0008a7.m69z();
                                    logMainHookCost("group_clock_in", jNanoTime5);
                                }
                                if (hookConfig.bool(Prefs.KEY_KEEP_FIRE_ENABLED)) {
                                    long jNanoTime6 = System.nanoTime();
                                    try {
                                        if (classLoader != null) {
                                            AbstractC0152f.f122c = classLoader;
                                        } else {
                                            AtomicBoolean atomicBoolean = AbstractC0152f.f120a;
                                        }
                                        long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
                                        if (jCurrentTimeMillis > AbstractC0152f.f127h) {
                                            AbstractC0152f.f127h = jCurrentTimeMillis;
                                        }
                                        AbstractC0152f.m224u();
                                        logMainHookCost("keep_fire", jNanoTime6);
                                    } catch (Throwable th2) {
                                        logMainHookCost("keep_fire", jNanoTime6);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                logMainHookCost("profile_worker_schedule", jNanoTime3);
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            logMainHookCost("main_immediate_total", jNanoTime2);
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        logMainHookCost("settings_entry", jNanoTime);
                        throw th5;
                    }
                } else if (z2) {
                    if (!hasMsfProcessTargets()) {
                        return;
                    }
                    if (AbstractC0329m7.f558b) {
                        return;
                    }
                    AbstractC0329m7.f558b = true;
                    if (CONFIG.bool(Prefs.KEY_FORCE_TABLET_MODE)) {
                        AbstractC0238h.m466c(classLoader);
                    }
                    installMsfProcessHooks(classLoader);
                } else if (z3) {
                    if (!hasToolProcessTargets()) {
                        return;
                    }
                    if (AbstractC0329m7.f560d) {
                        return;
                    }
                    AbstractC0329m7.f560d = true;
                    installToolProcessHooks(classLoader);
                } else {
                    if (!z4) {
                        if (z5) {
                            if (!hasOtherProcessTargets(str)) {
                                return;
                            }
                            String str2 = f114QQ;
                            Set set = AbstractC0329m7.f561e;
                            if (str != null && str.length() != 0) {
                                str2 = str;
                            }
                            if (!set.add(str2)) {
                                return;
                            } else {
                                installOtherProcessHooks(classLoader, str);
                            }
                        }
                    }
                    if (!CONFIG.bool(Prefs.KEY_QR_CONFIRM_FAST)) {
                        return;
                    }
                    if (AbstractC0329m7.f559c) {
                        return;
                    }
                    AbstractC0329m7.f559c = true;
                    installOpenSdkProcessHooks(classLoader);
                }
                logAlways("hook install complete process=" + str);
            } catch (Throwable th6) {
                th = th6;
                try {
                    throw th;
                } catch (Throwable th7) {
                    if (z6) {
                        logAlways("hook install complete process=" + str);
                    }
                    throw th7;
                }
            }
        } catch (Throwable th8) {
            th = th8;
            z6 = false;
            throw th;
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[MOVE]}, finally: {[MOVE, INVOKE, MOVE_EXCEPTION, MOVE, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, CONSTRUCTOR, INVOKE, INVOKE, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void installMainImmediateSafeHooks(ClassLoader classLoader, String str) {
        String str2;
        String str3;
        boolean z;
        long jNanoTime;
        String str4;
        String str5;
        String str6;
        ClassLoader classLoader2;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        ArrayList arrayList = new ArrayList();
        HookConfig hookConfig = CONFIG;
        if (hookConfig.bool(Prefs.KEY_GROUP_ADMIN_AVATAR_MENU)) {
            str2 = "unread_full_count";
            z = true;
            long jNanoTime2 = System.nanoTime();
            try {
                AbstractC0451s6.m915D0(true);
                AbstractC0451s6.m924I(classLoader);
                arrayList.add("group_avatar_menu");
                logMainHookCost("group_avatar_menu", jNanoTime2);
                str3 = "safe unread hooks failed: ";
            } catch (Throwable th) {
                str3 = "safe unread hooks failed: ";
                try {
                    log("safe group avatar menu hook failed: " + th);
                } finally {
                    logMainHookCost("group_avatar_menu", jNanoTime2);
                }
            }
        } else {
            str2 = "unread_full_count";
            str3 = "safe unread hooks failed: ";
            z = true;
            AbstractC0451s6.m915D0(false);
        }
        if (hookConfig.bool(Prefs.KEY_MESSAGE_REPEATER) || hookConfig.bool(Prefs.KEY_MESSAGE_REPEATER_LONG_PRESS_MENU)) {
            long jNanoTime3 = System.nanoTime();
            try {
                maybeInstallMessageRepeater(classLoader);
                arrayList.add(Prefs.KEY_MESSAGE_REPEATER);
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hasDefaultMsgDecorations()) {
            long jNanoTime4 = System.nanoTime();
            try {
                hookDefaultMsgDecorations(classLoader);
                arrayList.add("default_msg_decorations");
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hookConfig.bool(Prefs.KEY_DISABLE_REPLY_AUTO_AT)) {
            long jNanoTime5 = System.nanoTime();
            try {
                AbstractC0497v4.m1106y(classLoader);
                arrayList.add("reply_no_auto_at");
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hookConfig.bool(Prefs.KEY_CHAT_EDGE_GUARD)) {
            long jNanoTime6 = System.nanoTime();
            try {
                AbstractC0497v4.m1103v(classLoader);
                arrayList.add("chat_right_swipe");
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hookConfig.bool(Prefs.KEY_UNREAD_FULL_COUNT)) {
            jNanoTime = System.nanoTime();
            try {
                AbstractC0497v4.m1074A(classLoader);
                arrayList.add("unread_full_count_early");
                String str15 = str2;
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hookConfig.bool(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME)) {
            jNanoTime = System.nanoTime();
            try {
                AbstractC0429r0.m830j(classLoader);
                arrayList.add(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME);
                String str16 = "message_status_time";
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hookConfig.bool(Prefs.KEY_HIDE_OFFICIAL_CENTER_TIME)) {
            jNanoTime = System.nanoTime();
            try {
                AbstractC0182d7.m339b(classLoader);
                arrayList.add(Prefs.KEY_HIDE_OFFICIAL_CENTER_TIME);
                String str17 = "official_center_time";
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hookConfig.bool(Prefs.KEY_SELF_MESSAGE_LEFT_SIDE)) {
            long jNanoTime7 = System.nanoTime();
            try {
                AbstractC0505vc.m1116h(classLoader);
                arrayList.add(Prefs.KEY_SELF_MESSAGE_LEFT_SIDE);
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hookConfig.bool(Prefs.KEY_EXTERNAL_BROWSER) || hookConfig.bool(Prefs.KEY_UNBLOCK_RISK_WEB)) {
            jNanoTime = System.nanoTime();
            try {
                AbstractC0497v4.m1075B();
                str4 = "web_redirect";
                try {
                    arrayList.add(str4);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        log("safe web redirect hooks failed: " + th);
                    } finally {
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                str4 = "web_redirect";
            }
        }
        if (hookConfig.bool(Prefs.KEY_NOTICE_BLOCK_AT_ALL) || hookConfig.bool(Prefs.KEY_NOTICE_BLOCK_GROUP_TODO)) {
            jNanoTime = System.nanoTime();
            try {
                AbstractC0432r3.m854l(classLoader, str);
                str5 = "notice_gate";
                try {
                    arrayList.add(str5);
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        log("safe notice gate hooks failed: " + th);
                    } finally {
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                str5 = "notice_gate";
            }
        }
        if (hookConfig.bool(Prefs.KEY_RENAME_APK_FILE)) {
            jNanoTime = System.nanoTime();
            try {
                AbstractC0497v4.m1101t(classLoader);
                arrayList.add("file_model_guards");
                String str18 = "apk_file_name";
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hookConfig.bool(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT)) {
            long jNanoTime8 = System.nanoTime();
            try {
                AbstractC0264i9.m678b(classLoader);
                AbstractC0299k9.m738b(classLoader);
                arrayList.add(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT);
            } finally {
                try {
                } finally {
                }
            }
        }
        if (hookConfig.bool(Prefs.KEY_DOWNLOAD_DIRECT_WRITE)) {
            jNanoTime = System.nanoTime();
            try {
                AbstractC0004a3.m16i(classLoader);
                AbstractC0242h3.m503s(classLoader);
                arrayList.add("download_direct_write");
                String str19 = "download_redirect";
            } finally {
                try {
                } finally {
                }
            }
        }
        if (CONFIG.bool(Prefs.KEY_BLOCK_ANNOYING_POPUPS)) {
            jNanoTime = System.nanoTime();
            try {
                AbstractC0497v4.m1100s(classLoader);
                str14 = "annoying_popups";
                try {
                    arrayList.add(str14);
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        log("safe annoying popup hooks failed: " + th);
                    } finally {
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str14 = "annoying_popups";
            }
        }
        if (hookConfig.bool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE)) {
            jNanoTime = System.nanoTime();
            try {
                AbstractC0532x7.m1135d(classLoader, str);
                str13 = "host_hot_update";
                try {
                    arrayList.add(str13);
                } catch (Throwable th8) {
                    th = th8;
                    try {
                        log("safe host hot update hooks failed: " + th);
                    } finally {
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                str13 = "host_hot_update";
            }
        }
        long jNanoTime9 = System.nanoTime();
        try {
            maybeHookQQShowInAio(classLoader);
            logMainHookCost("qq_show", jNanoTime9);
            if (hookConfig.bool(Prefs.KEY_EMOTION_AS_PIC)) {
                long jNanoTime10 = System.nanoTime();
                try {
                    hookEmotionAsPic(classLoader);
                    arrayList.add(Prefs.KEY_EMOTION_AS_PIC);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            if (hookConfig.bool(Prefs.KEY_MEDIA_CLICK_TO_LOAD)) {
                jNanoTime = System.nanoTime();
                try {
                    AbstractC0204ed.m353i(classLoader);
                    arrayList.add(Prefs.KEY_MEDIA_CLICK_TO_LOAD);
                    String str20 = "media_click_load";
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            if (hookConfig.bool(Prefs.KEY_CLEAN_EMOJI_PANEL_ENTRIES)) {
                jNanoTime = System.nanoTime();
                try {
                    AbstractC0560z3.m1188j(classLoader);
                    str12 = "emoji_panel_cleanup";
                    try {
                        arrayList.add(str12);
                    } catch (Throwable th10) {
                        th = th10;
                        try {
                            log("safe emoji panel cleanup hook failed: " + th);
                        } finally {
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    str12 = "emoji_panel_cleanup";
                }
            }
            if (hookConfig.bool(Prefs.KEY_FAVORITE_EMOTICON_BATCH_SEND)) {
                jNanoTime = System.nanoTime();
                try {
                    AbstractC0278j4.m724p(classLoader);
                    str11 = "favorite_emoticon_batch";
                    try {
                        arrayList.add(str11);
                    } catch (Throwable th12) {
                        th = th12;
                        try {
                            log("safe favorite emoticon batch hook failed: " + th);
                        } finally {
                        }
                    }
                } catch (Throwable th13) {
                    th = th13;
                    str11 = "favorite_emoticon_batch";
                }
            }
            if (hookConfig.bool(Prefs.KEY_CLOUD_STICKER_PANEL)) {
                long jNanoTime11 = System.nanoTime();
                try {
                    AbstractC0225g2.m423i(classLoader);
                    arrayList.add(Prefs.KEY_CLOUD_STICKER_PANEL);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            if (hookConfig.bool(Prefs.KEY_VOICE_MESSAGE_ACTIONS)) {
                long jNanoTime12 = System.nanoTime();
                try {
                    AbstractC0169w.m261P(classLoader);
                    arrayList.add(Prefs.KEY_VOICE_MESSAGE_ACTIONS);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            if (AbstractC0260i5.m528F0(hookConfig.string(Prefs.KEY_AIO_INPUT_BAR_HIDDEN_IDS, ""), hookConfig.bool(Prefs.KEY_AIO_INPUT_BAR_ENABLED), hookConfig.bool(Prefs.KEY_AIO_INPUT_BAR_MIGRATED), hookConfig.bool(Prefs.KEY_HIDE_AIO_INPUT_CAMERA_ENTRIES))) {
                jNanoTime = System.nanoTime();
                try {
                    AbstractC0273j.m700c(classLoader);
                    str10 = "aio_input_bar_cleanup";
                    try {
                        arrayList.add(str10);
                    } catch (Throwable th14) {
                        th = th14;
                        try {
                            log("safe aio input bar cleanup hook failed: " + th);
                        } finally {
                        }
                    }
                } catch (Throwable th15) {
                    th = th15;
                    str10 = "aio_input_bar_cleanup";
                }
            }
            if (hookConfig.bool(Prefs.KEY_ALBUM_VIDEO_BUBBLE)) {
                long jNanoTime13 = System.nanoTime();
                try {
                    AbstractC0444s.m878g(classLoader);
                    arrayList.add(Prefs.KEY_ALBUM_VIDEO_BUBBLE);
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            if (hookConfig.bool(Prefs.KEY_FLASH_PIC_AS_IMAGE)) {
                jNanoTime = System.nanoTime();
                try {
                    AbstractC0006a5.m36f(classLoader);
                    arrayList.add(Prefs.KEY_FLASH_PIC_AS_IMAGE);
                    String str21 = "flash_pic";
                } finally {
                    try {
                    } finally {
                    }
                }
            }
            if (hookConfig.bool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT)) {
                long jNanoTime14 = System.nanoTime();
                try {
                    AbstractC0332ma.m766g(classLoader);
                    arrayList.add("original_image_default_panel");
                } finally {
                    logMainHookCost("original_image_panel", jNanoTime14);
                }
            }
            if (hookConfig.bool(Prefs.KEY_PIC_SUMMARY_ENABLED) || hookConfig.bool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT) || hookConfig.bool(Prefs.KEY_RENAME_APK_FILE)) {
                jNanoTime = System.nanoTime();
                try {
                    hookPicSummarySendMsg(classLoader);
                    str6 = "pic_summary";
                    try {
                        arrayList.add(str6);
                    } catch (Throwable th16) {
                        th = th16;
                        try {
                            log("safe pic summary hook failed: " + th);
                        } finally {
                        }
                    }
                } catch (Throwable th17) {
                    th = th17;
                    str6 = "pic_summary";
                }
                logMainHookCost(str6, jNanoTime);
            }
            if (hookConfig.bool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
                jNanoTime = System.nanoTime();
                classLoader2 = classLoader;
                try {
                    AbstractC0033c0.m82h(classLoader2, z);
                    str9 = "anti_recall";
                    try {
                        arrayList.add(str9);
                    } catch (Throwable th18) {
                        th = th18;
                        try {
                            log("safe anti-recall hook failed: " + th);
                        } finally {
                        }
                    }
                } catch (Throwable th19) {
                    th = th19;
                    str9 = "anti_recall";
                }
                logMainHookCost(str9, jNanoTime);
            } else {
                classLoader2 = classLoader;
            }
            if (hookConfig.bool(Prefs.KEY_QR_GALLERY_GATE)) {
                jNanoTime = System.nanoTime();
                try {
                    AbstractC0470t9.m1024f(classLoader2);
                    str8 = "qr_gallery_gate";
                    try {
                        arrayList.add(str8);
                    } catch (Throwable th20) {
                        th = th20;
                        try {
                            log("safe QR gallery gate hook failed: " + th);
                        } finally {
                        }
                    }
                } catch (Throwable th21) {
                    th = th21;
                    str8 = "qr_gallery_gate";
                }
            }
            if (hookConfig.bool(Prefs.KEY_QR_CONFIRM_FAST)) {
                jNanoTime = System.nanoTime();
                try {
                    if (!AbstractC0470t9.f901d) {
                        AbstractC0470t9.f901d = true;
                        try {
                            AbstractC0470t9.m1021c(classLoader2);
                            AbstractC0470t9.m1022d(classLoader2);
                            AbstractC0470t9.m1026h("hooked QR confirm fast-path main precise targets");
                        } catch (Throwable th22) {
                            AbstractC0470t9.m1026h("hookQrConfirmFastPathMain failed: " + th22);
                        }
                    }
                    str7 = "qr_confirm_fast";
                    try {
                        arrayList.add(str7);
                    } catch (Throwable th23) {
                        th = th23;
                        try {
                            log("safe QR confirm fast-path hook failed: " + th);
                        } finally {
                        }
                    }
                } catch (Throwable th24) {
                    th = th24;
                    str7 = "qr_confirm_fast";
                    log("safe QR confirm fast-path hook failed: " + th);
                    if (arrayList.isEmpty()) {
                    }
                }
            }
            if (arrayList.isEmpty()) {
                logAlways("main immediate safe hooks installed: " + arrayList);
            }
        } catch (Throwable th25) {
            logMainHookCost("qq_show", jNanoTime9);
            throw th25;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void installMainProfileHooksAsync(ClassLoader classLoader) {
        HookConfig hookConfig = CONFIG;
        if (hookConfig.bool(Prefs.KEY_BLOCK_AVATAR_PENDANT) || hookConfig.bool(Prefs.KEY_BLOCK_PROFILE_CARD_DECOR) || hookConfig.bool(Prefs.KEY_ALLOW_FORBID_CARD)) {
            AbstractC0361o7.m769a("Elaris-main-profile-hooks", new RunnableC0151e(classLoader));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void installMsfProcessHooks(ClassLoader classLoader) {
        if (hasMsfProcessTargets()) {
            runMsfProcessHooks(classLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void installOpenSdkProcessHooks(ClassLoader classLoader) {
        if (CONFIG.bool(Prefs.KEY_QR_CONFIRM_FAST)) {
            try {
                AbstractC0470t9.m1023e(classLoader);
                logAlways("openSdk hooks installed: qr_confirm_fast");
            } catch (Throwable th) {
                log("openSdk QR confirm fast-path hook failed: " + th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void installOtherProcessHooks(ClassLoader classLoader, String str) {
        if (hasOtherProcessTargets(str)) {
            runOtherProcessHooks(classLoader, str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void installToolProcessHooks(ClassLoader classLoader) {
        if (hasToolProcessTargets()) {
            runToolProcessHooks(classLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isCurrentHotReloadGeneration(int i) {
        int i2;
        WeakReference weakReference = AbstractC0009a8.f34a;
        try {
            i2 = Integer.parseInt(System.getProperty("com.mr.elaris.hot_reload_generation", "0"));
        } catch (Throwable unused) {
            i2 = 0;
        }
        return i2 == i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isDefaultDecorationSetting(String str) {
        return Prefs.KEY_DEFAULT_BUBBLE.equals(str) || Prefs.KEY_DEFAULT_FONT.equals(str) || Prefs.KEY_BLOCK_AVATAR_PENDANT.equals(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isMsgRecordReturnType(Class<?> cls) {
        if (cls == null) {
            return false;
        }
        String name = cls.getName();
        return "com.tencent.qqnt.kernel.nativeinterface.MsgRecord".equals(name) || "com.tencent.qqnt.kernelpublic.nativeinterface.MsgRecord".equals(name) || name.endsWith(".MsgRecord");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static boolean isUsableActivity(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void log(String str) {
        if (shouldLogMessage(str)) {
            XposedBridge.log("Elaris: " + str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void logAlways(String str) {
        if (shouldLogMessage(str)) {
            XposedBridge.logAlways("Elaris: " + str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void logOriginalImageSendEntry(Object[] objArr) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - sLastOriginalImageSendEntryLogAt < 1500) {
            return;
        }
        sLastOriginalImageSendEntryLogAt = jCurrentTimeMillis;
        logAlways("original image default send entry: args=" + safeArgSummary(objArr));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void logPicSummaryNoPicSend(Object obj) {
        if (runtimeBool(Prefs.KEY_DEBUG_LOG)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - sLastPicSummaryNoPicLogAt < 2500) {
                return;
            }
            sLastPicSummaryNoPicLogAt = jCurrentTimeMillis;
            log("pic summary send skipped no pic element type=" + (obj == null ? "null" : obj.getClass().getName()) + " size=" + (obj instanceof ArrayList ? ((ArrayList) obj).size() : -1));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean looksLikeFileCarrierObject(Object obj) {
        boolean z;
        boolean zBooleanValue;
        String lowerCase;
        C0529x4 c0529x4 = FILE_CARRIER_CLASSES;
        if (obj == null) {
            c0529x4.getClass();
            return false;
        }
        Class<?> cls = obj.getClass();
        ConcurrentHashMap concurrentHashMap = c0529x4.f1029a;
        Boolean bool = (Boolean) concurrentHashMap.get(cls);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            try {
                lowerCase = cls.getName().toLowerCase(Locale.ROOT);
            } catch (Throwable unused) {
            }
            if (!lowerCase.contains("troopfile") && !lowerCase.contains("groupfile") && !lowerCase.contains("qfile") && !lowerCase.contains("fileelement") && !lowerCase.contains("filemessage") && !lowerCase.contains("filemanager") && !lowerCase.contains(".file.")) {
                int i = 0;
                loop0: for (Class<?> superclass = cls; superclass != null && superclass != Object.class && i < 96; superclass = superclass.getSuperclass()) {
                    Field[] declaredFields = superclass.getDeclaredFields();
                    int iMin = Math.min(declaredFields.length, 96 - i);
                    for (int i2 = 0; i2 < iMin; i2++) {
                        String lowerCase2 = declaredFields[i2].getName().toLowerCase(Locale.ROOT);
                        if (!lowerCase2.contains("troopfile") && !lowerCase2.contains("groupfile") && !lowerCase2.contains("qfile") && !lowerCase2.contains("filename") && !lowerCase2.contains("filepath") && !lowerCase2.contains("filesize") && !lowerCase2.contains("fileuuid") && !lowerCase2.contains("fileid") && !lowerCase2.contains("downloadstatus") && !lowerCase2.contains("downloadurl")) {
                        }
                    }
                    i += iMin;
                }
                z = false;
                Boolean bool2 = (Boolean) concurrentHashMap.putIfAbsent(cls, Boolean.valueOf(z));
                zBooleanValue = bool2 != null ? z : bool2.booleanValue();
            }
            z = true;
            Boolean bool22 = (Boolean) concurrentHashMap.putIfAbsent(cls, Boolean.valueOf(z));
            if (bool22 != null) {
            }
        }
        return zBooleanValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void maybeHookDefaultMsgDecorations(ClassLoader classLoader) {
        if (classLoader == null || !hasDefaultMsgDecorations()) {
            return;
        }
        hookDefaultMsgDecorations(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void maybeHookQQShowInAio(ClassLoader classLoader) {
        if (classLoader == null) {
            return;
        }
        hookQQShowInAio(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void maybeInstallMessageRepeater(ClassLoader classLoader) {
        HookConfig hookConfig = CONFIG;
        boolean zBool = hookConfig.bool(Prefs.KEY_MESSAGE_REPEATER);
        boolean zBool2 = hookConfig.bool(Prefs.KEY_MESSAGE_REPEATER_LONG_PRESS_MENU);
        if (sMessageRepeaterInstallTried) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zBool || zBool2) {
            sMessageRepeaterInstallTried = true;
            try {
                String str = MessageRepeater.REPEATER_ICON_TAG;
                Method declaredMethod = MessageRepeater.class.getDeclaredMethod("install", ClassLoader.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, classLoader);
                log("repeater hook install completed, repeater hook cost=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
            } catch (Throwable th) {
                AbstractC0000a.m3d(th, new StringBuilder("repeater hook failed reason="), ": ");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String methodSig(Method method) {
        return method.getDeclaringClass().getName() + "." + method.getName() + Arrays.toString(method.getParameterTypes());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void openModuleSettings(Context context) {
        QQSettingsEntryHooks.openModuleSettings(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static void patchOriginalImageArgs(Object[] objArr) {
        int iM806o;
        if (objArr == null || objArr.length == 0 || !AbstractC0423qa.m803l(objArr)) {
            return;
        }
        AbstractC0423qa.f761j.remove();
        ThreadLocal threadLocal = AbstractC0423qa.f762k;
        threadLocal.remove();
        Object objFindContactArg = findContactArg(objArr);
        if (objFindContactArg == null || ((iM806o = AbstractC0423qa.m806o(objFindContactArg, "chatType")) == Integer.MIN_VALUE && (iM806o = AbstractC0423qa.m806o(objFindContactArg, "type")) == Integer.MIN_VALUE)) {
            iM806o = -1;
        }
        if (iM806o == 2 || iM806o == 4) {
            threadLocal.set(Boolean.TRUE);
        }
        for (Object obj : objArr) {
            if (runtimeBool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT) && obj != null) {
                AbstractC0423qa.m801j(obj, 0, Collections.newSetFromMap(new IdentityHashMap()));
            }
        }
        Boolean bool = Boolean.TRUE;
        ThreadLocal threadLocal2 = AbstractC0423qa.f761j;
        boolean zEquals = bool.equals(threadLocal2.get());
        threadLocal2.remove();
        AbstractC0423qa.f762k.remove();
        if (zEquals) {
            return;
        }
        String strSafeArgSummary = safeArgSummary(objArr);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - AbstractC0423qa.f755d < 1800) {
            return;
        }
        AbstractC0423qa.f755d = jCurrentTimeMillis;
        logAlways("original image default no pic element: args=".concat(AbstractC0423qa.m782C(strSafeArgSummary)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static ClassLoader prepareHostApplication(Application application, ClassLoader classLoader, C0548y7 c0548y7, String str, String str2) {
        if (application == null || !f114QQ.equals(application.getPackageName())) {
            return classLoader;
        }
        ClassLoader classLoader2 = AbstractC0260i5.f400u;
        if (classLoader2 == null) {
            try {
                classLoader2 = application.getClassLoader();
            } catch (Throwable unused) {
            }
        }
        ClassLoader classLoader3 = classLoader2 == null ? classLoader : classLoader2;
        if (classLoader3 != null && classLoader3 != classLoader) {
            StringBuilder sbM1b = AbstractC0000a.m1b("host runtime classloader selected source=", str2, " callback=");
            sbM1b.append(AbstractC0260i5.m558P0(classLoader));
            sbM1b.append(" runtime=");
            sbM1b.append(AbstractC0260i5.m558P0(classLoader3));
            logAlways(sbM1b.toString());
        }
        if (classLoader3 != null) {
            AbstractC0260i5.f401v = classLoader3;
        }
        CONFIG.reloadBlocking(application, str2);
        Context applicationContext = application.getApplicationContext();
        WeakReference weakReference = AbstractC0009a8.f34a;
        AbstractC0009a8.f34a = new WeakReference(applicationContext);
        if (!AbstractC0009a8.f38e) {
            synchronized (AbstractC0009a8.class) {
                try {
                    if (!AbstractC0009a8.f38e) {
                        application.registerActivityLifecycleCallbacks(new C0564z7());
                        AbstractC0009a8.f38e = true;
                    }
                } finally {
                }
            }
        }
        updateHostVersionSummary(application, str);
        if (HOST_APP_PREPARED.add(str)) {
            logAlways("module version loaded: 2.6.7 (1220), qq=" + hostVersionSummary());
        }
        if (AbstractC0009a8.f36c) {
            installHooks(classLoader3, str, c0548y7.f1093b, c0548y7.f1094c, c0548y7.f1095d, c0548y7.f1096e, c0548y7.f1097f);
            return classLoader3;
        }
        logAlways("unsupported QQ version; minimum=9.3.0, business hooks skipped: " + hostVersionSummary());
        return classLoader3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean reinstallForHotReload() {
        ClassLoader classLoader;
        String str;
        String str2;
        Application applicationM70a = AbstractC0009a8.m70a();
        if (applicationM70a == null || (classLoader = applicationM70a.getClassLoader()) == null) {
            return false;
        }
        String strM71b = AbstractC0009a8.m71b();
        AbstractC0009a8.f34a = new WeakReference(applicationM70a.getApplicationContext());
        AbstractC0260i5.f401v = classLoader;
        updateHostVersionSummary(applicationM70a, strM71b);
        if (!AbstractC0009a8.f36c) {
            logAlways("hot reload skipped for unsupported QQ version: " + hostVersionSummary());
            return false;
        }
        CONFIG.reloadBlocking(applicationM70a, "hot-reload");
        logAlways("hot reload reinstall in com.tencent.mobileqq, process=".concat(strM71b));
        resetInstallGuardsForHotReload(strM71b);
        if (strM71b.length() == 0) {
            str = f114QQ;
            str2 = str;
        } else {
            str = strM71b;
            str2 = f114QQ;
        }
        boolean zEquals = str2.equals(str);
        boolean zEquals2 = str2.concat(":MSF").equals(str);
        boolean zEquals3 = str2.concat(":tool").equals(str);
        boolean zEquals4 = str2.concat(":openSdk").equals(str);
        installHooks(classLoader, strM71b, zEquals, zEquals2, zEquals3, zEquals4, (zEquals || zEquals2 || zEquals3 || zEquals4) ? false : true);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void reloadRuntimeConfig(Context context, String str) {
        CONFIG.reloadFromContext(context, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void resetInstallGuardsForHotReload(String str) {
        int i;
        WeakReference weakReference = AbstractC0009a8.f34a;
        try {
            i = Integer.parseInt(System.getProperty("com.mr.elaris.hot_reload_generation", "0"));
        } catch (Throwable unused) {
            i = 0;
        }
        int i2 = i == Integer.MAX_VALUE ? 1 : i + 1;
        try {
            System.setProperty("com.mr.elaris.hot_reload_generation", String.valueOf(i2));
        } catch (Throwable unused2) {
        }
        ConcurrentHashMap concurrentHashMap = AbstractC0361o7.f643a;
        ConcurrentHashMap concurrentHashMap2 = AbstractC0361o7.f643a;
        ArrayList arrayList = new ArrayList(concurrentHashMap2.values());
        concurrentHashMap2.clear();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Future future = (Future) arrayList.get(i3);
            if (future != null) {
                future.cancel(true);
            }
        }
        if (CONFIG.bool(Prefs.KEY_DEBUG_LOG)) {
            log("hot reload generation=" + i2);
        }
        LOAD_DISPATCHED.clear();
        FIELD_CACHE.clear();
        FIELD_MISS_CACHE.clear();
        DECORATION_DONE.clear();
        FILE_CARRIER_CLASSES.f1029a.clear();
        Map map = AbstractC0429r0.f772a;
        synchronized (AbstractC0429r0.class) {
            try {
                XC_MethodHook.Unhook unhook = AbstractC0429r0.f773b;
                AbstractC0429r0.f773b = null;
                AbstractC0429r0.f774c = false;
                AbstractC0429r0.f778g = null;
                if (unhook != null) {
                    try {
                        unhook.unhook();
                    } catch (Throwable th) {
                        AbstractC0198e7.m343a("message-status-row", "hot-reload-unhook", th);
                    }
                }
                AbstractC0429r0.m824d();
                synchronized (AbstractC0429r0.class) {
                    C0223g0 c0223g0 = AbstractC0429r0.f776e;
                    Context context = AbstractC0429r0.f777f;
                    AbstractC0429r0.f776e = null;
                    AbstractC0429r0.f777f = null;
                    if (c0223g0 != null && context != null) {
                        try {
                            context.unregisterReceiver(c0223g0);
                        } catch (IllegalArgumentException unused3) {
                        } catch (Throwable th2) {
                            AbstractC0198e7.m343a("message-status-row", "unregister-status-receiver", th2);
                        }
                    }
                }
                AbstractC0006a5.m32b();
                Set set = AbstractC0182d7.f190a;
                synchronized (AbstractC0182d7.class) {
                    AbstractC0182d7.f191b = false;
                    Set set2 = AbstractC0182d7.f190a;
                    synchronized (set2) {
                        set2.clear();
                    }
                }
                AbstractC0505vc.m1117i();
                String[] strArr = AbstractC0204ed.f229a;
                synchronized (AbstractC0204ed.class) {
                    AbstractC0204ed.f234f = false;
                    AbstractC0204ed.f233e.clear();
                    AbstractC0204ed.f235g = 0L;
                    AbstractC0204ed.f236h = 0L;
                }
                AbstractC0560z3.m1191m();
                AbstractC0278j4.m704A();
                AbstractC0532x7.f1039a.clear();
                AbstractC0532x7.f1040b.clear();
                AbstractC0532x7.f1041c.clear();
                AbstractC0260i5.f400u = null;
                AbstractC0432r3.m858p();
                if (str == null || str.length() == 0) {
                    str = f114QQ;
                }
                boolean zEquals = f114QQ.equals(str);
                boolean zEquals2 = f114QQ.concat(":MSF").equals(str);
                boolean zEquals3 = f114QQ.concat(":tool").equals(str);
                boolean zEquals4 = f114QQ.concat(":openSdk").equals(str);
                boolean z = AbstractC0329m7.f557a;
                if (zEquals) {
                    AbstractC0329m7.f557a = false;
                } else if (zEquals2) {
                    AbstractC0329m7.f558b = false;
                } else if (zEquals3) {
                    AbstractC0329m7.f560d = false;
                } else if (zEquals4) {
                    AbstractC0329m7.f559c = false;
                } else {
                    AbstractC0329m7.f561e.remove(str);
                }
                if (zEquals) {
                    QQSettingsEntryHooks.resetForHotReload();
                    unhookDefaultMsgDecorations();
                    sDefaultDecorationsHooked = false;
                    sEmotionAsPicInstalled = false;
                    sMessageRepeaterInstallTried = false;
                    sPicSummarySendHookInstalled = false;
                    sQQShowInAioInstalled = false;
                    return;
                }
                return;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        AbstractC0006a5.m32b();
        Set set3 = AbstractC0182d7.f190a;
        synchronized (AbstractC0182d7.class) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void rewriteOutgoingPicSummary(ArrayList<?> arrayList, Object obj) {
        AbstractC0260i5.m520C1(arrayList, obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void runMsfProcessHooks(ClassLoader classLoader) {
        HookConfig hookConfig = CONFIG;
        if (hookConfig.bool(Prefs.KEY_FORCE_TABLET_MODE)) {
            AbstractC0238h.m466c(classLoader);
        }
        if (hookConfig.bool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE)) {
            AbstractC0532x7.m1135d(classLoader, "com.tencent.mobileqq:MSF");
        }
        if (hookConfig.bool(Prefs.KEY_MESSAGE_RECALL_GUARD)) {
            AbstractC0033c0.m82h(classLoader, false);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void runOtherProcessHooks(ClassLoader classLoader, String str) {
        if (str != null && (str.contains(":peak") || str.contains(":file") || str.contains(":tool"))) {
            HookConfig hookConfig = CONFIG;
            if (hookConfig.bool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE)) {
                AbstractC0532x7.m1135d(classLoader, str);
            }
            if (hookConfig.bool(Prefs.KEY_MEDIA_CLICK_TO_LOAD)) {
                try {
                    AbstractC0204ed.m353i(classLoader);
                    logAlways("other process media click-load hooks installed: ".concat(str));
                } catch (Throwable th) {
                    log("other process media click-load hook failed: " + str + ": " + th);
                }
            }
            HookConfig hookConfig2 = CONFIG;
            if (hookConfig2.bool(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT)) {
                AbstractC0264i9.m678b(classLoader);
                AbstractC0299k9.m738b(classLoader);
            }
            if (hookConfig2.bool(Prefs.KEY_DOWNLOAD_DIRECT_WRITE)) {
                AbstractC0004a3.m16i(classLoader);
            }
            boolean zBool = hookConfig2.bool(Prefs.KEY_RENAME_APK_FILE);
            boolean z = hookConfig2.bool(Prefs.KEY_PIC_SUMMARY_ENABLED) || hookConfig2.bool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT) || hookConfig2.bool(Prefs.KEY_RENAME_APK_FILE);
            if (zBool || z) {
                if (zBool) {
                    AbstractC0497v4.m1101t(classLoader);
                }
                if (z) {
                    if (hookConfig2.bool(Prefs.KEY_ORIGINAL_IMAGE_DEFAULT)) {
                        AbstractC0332ma.m766g(classLoader);
                    }
                    hookPicSummarySendMsg(classLoader);
                }
                logAlways("other process file/pic hooks installed: ".concat(str));
            }
        }
        if ("com.tencent.mobileqq:qqfav".equals(str)) {
            HookConfig hookConfig3 = CONFIG;
            if (hookConfig3.bool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE)) {
                AbstractC0532x7.m1135d(classLoader, str);
            }
            if (hookConfig3.bool(Prefs.KEY_EXTERNAL_BROWSER) || hookConfig3.bool(Prefs.KEY_UNBLOCK_RISK_WEB)) {
                AbstractC0497v4.m1075B();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void runToolProcessHooks(ClassLoader classLoader) {
        HookConfig hookConfig = CONFIG;
        if (hookConfig.bool(Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT)) {
            AbstractC0264i9.m678b(classLoader);
            AbstractC0299k9.m738b(classLoader);
        }
        if (hookConfig.bool(Prefs.KEY_DOWNLOAD_DIRECT_WRITE)) {
            AbstractC0004a3.m16i(classLoader);
        }
        if (hookConfig.bool(Prefs.KEY_WEB_KERNEL_FALLBACK)) {
            AbstractC0238h.m467d(classLoader);
        }
        if (hookConfig.bool(Prefs.KEY_BLOCK_HOST_HOT_UPDATE)) {
            AbstractC0532x7.m1135d(classLoader, "com.tencent.mobileqq:tool");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean runtimeBool(String str) {
        return CONFIG.bool(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static String runtimeString(String str, String str2) {
        return CONFIG.string(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static String safeArgSummary(Object[] objArr) {
        if (objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(objArr.length, 8);
        for (int i = 0; i < iMin; i++) {
            if (i > 0) {
                sb.append(',');
            }
            Object obj = objArr[i];
            if (obj == null) {
                sb.append("null");
            } else {
                sb.append(obj.getClass().getName());
                if (obj instanceof Collection) {
                    sb.append('#');
                    sb.append(((Collection) obj).size());
                }
            }
        }
        return sb.length() > 220 ? sb.substring(0, 220) : sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void setFieldIfExists(Object obj, String str, Object obj2) {
        if (obj == null) {
            return;
        }
        try {
            Field fieldFindField = findField(obj.getClass(), str);
            if (fieldFindField == null) {
                return;
            }
            fieldFindField.setAccessible(true);
            Class<?> type = fieldFindField.getType();
            if (type == Integer.TYPE) {
                fieldFindField.setInt(obj, obj2 instanceof Number ? ((Number) obj2).intValue() : 0);
                return;
            }
            if (type == Long.TYPE) {
                fieldFindField.setLong(obj, obj2 instanceof Number ? ((Number) obj2).longValue() : 0L);
            } else if (type != Boolean.TYPE) {
                fieldFindField.set(obj, obj2);
            } else {
                fieldFindField.setBoolean(obj, (obj2 instanceof Boolean) && ((Boolean) obj2).booleanValue());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setRuntimeBool(String str, boolean z) {
        HashMap map;
        RunnableC0334mc runnableC0334mc;
        HookConfig hookConfig = CONFIG;
        hookConfig.setBool(str, z);
        if (Prefs.KEY_DEBUG_LOG.equals(str)) {
            XposedBridge.setLoggingEnabled(z);
            logAlways("debug_log=" + z);
        } else if (hookConfig.bool(Prefs.KEY_DEBUG_LOG)) {
            log("runtime bool changed: " + str + "=" + z);
        }
        ClassLoader classLoaderCurrentHostClassLoader = currentHostClassLoader();
        if ((Prefs.KEY_EXTERNAL_BROWSER.equals(str) || Prefs.KEY_UNBLOCK_RISK_WEB.equals(str)) && z) {
            AbstractC0497v4.m1075B();
        }
        if (Prefs.KEY_LEGACY_GROUP_FILE_LAYOUT.equals(str)) {
            if (z) {
                if (classLoaderCurrentHostClassLoader != null) {
                    logAlways("legacy group file layout runtime enabled layout_count=" + AbstractC0264i9.m678b(classLoaderCurrentHostClassLoader));
                } else {
                    logAlways("legacy group file layout runtime enable deferred: classLoader=null");
                }
            } else if (AbstractC0299k9.f501c != 0) {
                AbstractC0299k9.f501c = 0L;
                log("legacy group file page cleared reason=".concat("runtime_disabled"));
            }
        }
        if (Prefs.KEY_UNREAD_FULL_COUNT.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            log("full unread count runtime install deferred for UI stability; restart QQ to apply stable hooks");
        }
        if (Prefs.KEY_DISABLE_REPLY_AUTO_AT.equals(str)) {
            if (z && classLoaderCurrentHostClassLoader != null) {
                AbstractC0497v4.m1106y(classLoaderCurrentHostClassLoader);
            } else if (!z) {
                try {
                    synchronized (AbstractC0366oc.f652a) {
                        try {
                            AbstractC0366oc.f659h++;
                            Handler handler = AbstractC0366oc.f657f;
                            if (handler != null && (runnableC0334mc = AbstractC0366oc.f658g) != null) {
                                handler.removeCallbacks(runnableC0334mc);
                            }
                            AbstractC0366oc.f658g = null;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC0198e7.m343a("reply-no-at", "cancel-delayed-scrub", th2);
                }
            }
        }
        if (isDefaultDecorationSetting(str)) {
            DECORATION_DONE.clear();
            if (z && classLoaderCurrentHostClassLoader != null) {
                maybeHookDefaultMsgDecorations(classLoaderCurrentHostClassLoader);
                hookPicSummarySendMsg(classLoaderCurrentHostClassLoader);
            }
        }
        if (Prefs.KEY_HOME_PULL_GUARD.equals(str)) {
            if (z && classLoaderCurrentHostClassLoader != null) {
                AbstractC0233ga.m446i(classLoaderCurrentHostClassLoader, getHostSourceDir());
            } else if (!z) {
                AbstractC0233ga.m440c();
            }
        }
        if (Prefs.KEY_MESSAGE_REPEATER.equals(str) || Prefs.KEY_MESSAGE_REPEATER_LONG_PRESS_MENU.equals(str)) {
            MessageRepeater.onRuntimeSettingsChanged(classLoaderCurrentHostClassLoader);
            if (z && classLoaderCurrentHostClassLoader != null) {
                log("repeater runtime switch enabled key=" + str);
                AbstractC0361o7.m769a("Elaris-repeater-runtime", new RunnableC0214f7(2, classLoaderCurrentHostClassLoader));
            }
        }
        if (Prefs.KEY_KEEP_FIRE_ENABLED.equals(str) && z) {
            if (classLoaderCurrentHostClassLoader != null) {
                AbstractC0152f.f122c = classLoaderCurrentHostClassLoader;
            } else {
                AtomicBoolean atomicBoolean = AbstractC0152f.f120a;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() + 60000;
            if (jCurrentTimeMillis > AbstractC0152f.f127h) {
                AbstractC0152f.f127h = jCurrentTimeMillis;
            }
            AbstractC0152f.m224u();
        }
        if (Prefs.KEY_GROUP_ADMIN_AVATAR_MENU.equals(str)) {
            AbstractC0451s6.m915D0(z);
            if (z) {
                AbstractC0451s6.m924I(classLoaderCurrentHostClassLoader);
            }
        }
        if (Prefs.KEY_RENAME_APK_FILE.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0497v4.m1101t(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_EMOTION_AS_PIC.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            hookEmotionAsPic(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_MEDIA_CLICK_TO_LOAD.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0204ed.m353i(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_CLEAN_EMOJI_PANEL_ENTRIES.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0560z3.m1188j(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_FAVORITE_EMOTICON_BATCH_SEND.equals(str)) {
            if (z && classLoaderCurrentHostClassLoader != null) {
                AbstractC0278j4.m724p(classLoaderCurrentHostClassLoader);
            } else if (!z) {
                AbstractC0449s4.m887f(null, "runtime_disabled");
            }
        }
        if (Prefs.KEY_CLOUD_STICKER_PANEL.equals(str)) {
            if (z) {
                AbstractC0225g2.m423i(classLoaderCurrentHostClassLoader);
            } else {
                Set set = AbstractC0225g2.f291a;
            }
        }
        if (Prefs.KEY_VOICE_MESSAGE_ACTIONS.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0169w.m261P(classLoaderCurrentHostClassLoader);
        }
        if ((Prefs.KEY_AIO_INPUT_BAR_ENABLED.equals(str) && z) || (Prefs.KEY_HIDE_AIO_INPUT_CAMERA_ENTRIES.equals(str) && z && !hookConfig.bool(Prefs.KEY_AIO_INPUT_BAR_MIGRATED))) {
            AbstractC0273j.m700c(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_ALBUM_VIDEO_BUBBLE.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0444s.m878g(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_ORIGINAL_IMAGE_DEFAULT.equals(str) && z) {
            logAlways("original image default embedded send mode enabled");
            if (classLoaderCurrentHostClassLoader != null) {
                AbstractC0332ma.m766g(classLoaderCurrentHostClassLoader);
            }
        }
        if (Prefs.KEY_FLASH_PIC_AS_IMAGE.equals(str)) {
            if (z && classLoaderCurrentHostClassLoader != null) {
                AbstractC0006a5.m36f(classLoaderCurrentHostClassLoader);
            } else if (!z) {
                AbstractC0006a5.m32b();
            }
        }
        if ((Prefs.KEY_PIC_SUMMARY_ENABLED.equals(str) || Prefs.KEY_ORIGINAL_IMAGE_DEFAULT.equals(str) || Prefs.KEY_RENAME_APK_FILE.equals(str)) && z && classLoaderCurrentHostClassLoader != null) {
            hookPicSummarySendMsg(classLoaderCurrentHostClassLoader);
        }
        int i = 1;
        if (Prefs.KEY_MESSAGE_RECALL_GUARD.equals(str)) {
            if (z && classLoaderCurrentHostClassLoader != null) {
                AbstractC0033c0.m82h(classLoaderCurrentHostClassLoader, true);
            }
            AbstractC0429r0.m834n(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_CHAT_MESSAGE_CORNER_TIME.equals(str)) {
            AbstractC0429r0.m834n(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_HIDE_OFFICIAL_CENTER_TIME.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0182d7.m339b(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_SELF_MESSAGE_LEFT_SIDE.equals(str)) {
            if (z && classLoaderCurrentHostClassLoader != null) {
                AbstractC0505vc.m1116h(classLoaderCurrentHostClassLoader);
            } else if (!z) {
                AbstractC0505vc.f974d.remove();
                AbstractC0553yc.m1172b();
            }
        }
        if (Prefs.KEY_ALLOW_FORBID_CARD.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0497v4.m1099r(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_BLOCK_ANNOYING_POPUPS.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0497v4.m1100s(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_FORCE_TABLET_MODE.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            logAlways("tablet mode runtime enabled; restart QQ for MSF login/device-type handshake");
        }
        if (Prefs.KEY_BLOCK_QQ_SHOW.equals(str)) {
            if (classLoaderCurrentHostClassLoader != null) {
                hookQQShowInAio(classLoaderCurrentHostClassLoader);
            }
            if (z && classLoaderCurrentHostClassLoader != null) {
                AbstractC0497v4.m1105x(classLoaderCurrentHostClassLoader);
                log("runtime QQShow enabled with callback gate");
            } else if (!z) {
                synchronized (AbstractC0440rb.f803a) {
                    WeakHashMap weakHashMap = AbstractC0440rb.f805c;
                    map = new HashMap(weakHashMap);
                    weakHashMap.clear();
                }
                for (Map.Entry entry : map.entrySet()) {
                    View view = (View) entry.getKey();
                    if (view != null) {
                        try {
                            view.removeCallbacks((Runnable) entry.getValue());
                        } catch (Throwable th3) {
                            AbstractC0198e7.m343a("qqshow-sidebar", "cleanup-cancel", th3);
                        }
                    }
                }
            }
        }
        if ((Prefs.KEY_NOTICE_BLOCK_AT_ALL.equals(str) || Prefs.KEY_NOTICE_BLOCK_GROUP_TODO.equals(str)) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0361o7.m769a("Elaris-notice-gate-runtime", new RunnableC0214f7(0, classLoaderCurrentHostClassLoader));
        }
        if (Prefs.KEY_CHAT_EDGE_GUARD.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0361o7.m769a("Elaris-chat-right-swipe-runtime", new RunnableC0214f7(i, classLoaderCurrentHostClassLoader));
        }
        if (Prefs.KEY_WEB_KERNEL_FALLBACK.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0238h.m467d(classLoaderCurrentHostClassLoader);
        }
        if (Prefs.KEY_BLOCK_HOST_HOT_UPDATE.equals(str) && z && classLoaderCurrentHostClassLoader != null) {
            AbstractC0532x7.m1135d(classLoaderCurrentHostClassLoader, AbstractC0009a8.m71b());
            logAlways("host hot update runtime enabled; restart QQ for earliest Tinker/QFix blocking");
        }
        if (Prefs.KEY_BLOCK_PROFILE_CARD_DECOR.equals(str) && z) {
            if (classLoaderCurrentHostClassLoader != null) {
                AbstractC0497v4.m1104w(classLoaderCurrentHostClassLoader);
            }
            log("profile card decor runtime install uses bounded hooks only");
        }
        if (Prefs.KEY_BLOCK_AVATAR_PENDANT.equals(str) && z) {
            if (classLoaderCurrentHostClassLoader != null) {
                AbstractC0497v4.m1102u(classLoaderCurrentHostClassLoader);
            }
            log("avatar pendant runtime install uses bounded hooks only");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void setRuntimeString(String str, String str2) {
        HookConfig hookConfig = CONFIG;
        hookConfig.setString(str, str2);
        if (Prefs.KEY_DOWNLOAD_DIRECT_WRITE_DIR.equals(str)) {
            AbstractC0004a3.f16f = "";
            AbstractC0004a3.f17g = null;
            AbstractC0004a3.f18h = "";
        }
        if (Prefs.KEY_AIO_INPUT_BAR_HIDDEN_IDS.equals(str) && AbstractC0260i5.m528F0(str2, hookConfig.bool(Prefs.KEY_AIO_INPUT_BAR_ENABLED), hookConfig.bool(Prefs.KEY_AIO_INPUT_BAR_MIGRATED), hookConfig.bool(Prefs.KEY_HIDE_AIO_INPUT_CAMERA_ENTRIES))) {
            AbstractC0273j.m700c(currentHostClassLoader());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean shouldLogMessage(String str) {
        if (CONFIG.bool(Prefs.KEY_DEBUG_LOG)) {
            return true;
        }
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.contains("debug_log=") || lowerCase.contains("hot reload") || lowerCase.contains("modern dispatch failed") || lowerCase.contains("send failed") || lowerCase.contains("auto clock-in failed") || lowerCase.contains("keep-fire auto failed") || lowerCase.contains("pending after max attempts") || lowerCase.contains("fatal") || lowerCase.contains("crash") || lowerCase.contains("timeout");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void stripMsgRecordDecorations(Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Integer numValueOf = Integer.valueOf(System.identityHashCode(obj));
            Set<Integer> set = DECORATION_DONE;
            if (set.size() >= 4096) {
                set.clear();
            }
            if (set.add(numValueOf) && !looksLikeFileCarrierObject(obj)) {
                if (CONFIG.bool(Prefs.KEY_BLOCK_AVATAR_PENDANT)) {
                    setFieldIfExists(obj, "avatarPendant", "");
                    setFieldIfExists(obj, "avatarPendantId", 0L);
                    setFieldIfExists(obj, "pendantId", 0L);
                }
                if (hasDefaultMsgDecorations()) {
                    forceDefaultMsgAttributeInfo(obj);
                    forceDefaultMsgDecorationField(obj, "msgAttrs");
                    forceDefaultMsgDecorationField(obj, "msgAttr");
                    forceDefaultMsgDecorationField(obj, "msgAttributeInfo");
                    forceDefaultMsgDecorationField(obj, "msgElements");
                    forceDefaultMsgDecorationField(obj, "elements");
                    forceDefaultMsgDecorationField(obj, "elems");
                    forceDefaultMsgDecorationField(obj, "richText");
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void stripOutgoingMsgDecorations(Object obj, int i, Set<Object> set) {
        Field[] declaredFields;
        if (obj == null || i > 3 || set == null || set.contains(obj) || (obj instanceof String) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Context) || (obj instanceof View)) {
            return;
        }
        set.add(obj);
        stripMsgRecordDecorations(obj);
        int i2 = 0;
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                stripOutgoingMsgDecorations(it.next(), i + 1, set);
                i2++;
                if (i2 >= 96) {
                    return;
                }
            }
            return;
        }
        Class<?> superclass = obj.getClass();
        if (superclass.isPrimitive() || superclass.isEnum() || superclass.isArray()) {
            return;
        }
        String name = superclass.getName();
        if (name.startsWith("com.tencent.") || name.startsWith("java.util.")) {
            while (superclass != null && superclass != Object.class) {
                try {
                    declaredFields = superclass.getDeclaredFields();
                } catch (Throwable unused) {
                    declaredFields = null;
                }
                if (declaredFields != null) {
                    int i3 = 0;
                    for (Field field : declaredFields) {
                        try {
                            if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                                field.setAccessible(true);
                                Object obj2 = field.get(obj);
                                if (obj2 != null) {
                                    String name2 = obj2.getClass().getName();
                                    if ((obj2 instanceof Iterable) || name2.startsWith("com.tencent.")) {
                                        stripOutgoingMsgDecorations(obj2, i + 1, set);
                                    }
                                    i3++;
                                    if (i3 >= 48) {
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
                superclass = superclass.getSuperclass();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Activity topActivity() {
        WeakReference weakReference = AbstractC0009a8.f37d;
        Activity activity = weakReference == null ? null : (Activity) weakReference.get();
        if (isUsableActivity(activity)) {
            return activity;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void unhookDefaultMsgDecorations() {
        List<XC_MethodHook.Unhook> list = DEFAULT_DECORATION_UNHOOKS;
        synchronized (list) {
            try {
                Iterator<XC_MethodHook.Unhook> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        it.next().unhook();
                    } catch (Throwable th) {
                        AbstractC0198e7.m343a("default-msg-decorations", "hot-reload-unhook", th);
                    }
                }
                DEFAULT_DECORATION_UNHOOKS.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void updateHostVersionSummary(Context context, String str) {
        String strTrim;
        int iIndexOf;
        boolean z;
        WeakReference weakReference = AbstractC0009a8.f34a;
        if (context == null) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f114QQ, 0);
            String str2 = packageInfo.versionName;
            String str3 = (str2 == null || str2.length() == 0) ? "unknown" : packageInfo.versionName;
            AbstractC0009a8.f35b = str3 + "(" + packageInfo.getLongVersionCode() + "), process=" + str;
            if (str3 != null && (iIndexOf = (strTrim = str3.trim()).indexOf(46)) > 0) {
                z = true;
                if (iIndexOf != strTrim.length() - 1) {
                    int i = iIndexOf + 1;
                    int iIndexOf2 = strTrim.indexOf(46, i);
                    String strSubstring = strTrim.substring(0, iIndexOf);
                    String strSubstring2 = iIndexOf2 < 0 ? strTrim.substring(i) : strTrim.substring(i, iIndexOf2);
                    try {
                        int i2 = Integer.parseInt(strSubstring);
                        int i3 = Integer.parseInt(strSubstring2);
                        if (i2 <= 9 && (i2 != 9 || i3 < 3)) {
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
                z = false;
            } else {
                z = false;
            }
            AbstractC0009a8.f36c = z;
        } catch (Throwable th) {
            AbstractC0009a8.f35b = "unknown, process=" + str;
            AbstractC0009a8.f36c = false;
            log("host version summary failed: " + th);
        }
    }

    private static void logMainHookCost(String str, long j) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void stripOutgoingMsgDecorations(ArrayList<?> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        try {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
            Iterator<?> it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                stripOutgoingMsgDecorations(it.next(), 0, setNewSetFromMap);
                i++;
                if (i >= 96) {
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
