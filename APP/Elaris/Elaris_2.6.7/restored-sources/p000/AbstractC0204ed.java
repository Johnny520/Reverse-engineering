package p000;

import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ed */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0204ed {

    /* JADX INFO: renamed from: a */
    public static final String[] f229a = {"com.tencent.qqnt.aio.adapter.api.impl.DataLineConfigApiImpl"};

    /* JADX INFO: renamed from: b */
    public static final String[] f230b = {"com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService$CppProxy", "com.tencent.qqnt.kernelpublic.nativeinterface.IKernelRichMediaService$CppProxy", "com.tencent.qqnt.kernel.nativeinterface.IKernelRichMediaService", "com.tencent.qqnt.kernelpublic.nativeinterface.IKernelRichMediaService"};

    /* JADX INFO: renamed from: c */
    public static final String[] f231c = {"com.tencent.qqnt.aio.predownload.api.impl.AIOPreDownloadServiceImpl"};

    /* JADX INFO: renamed from: d */
    public static final String[] f232d = {"com.tencent.mobileqq.emoticonview.PicEmoticonInfo", "com.tencent.mobileqq.emoticonview.SmallEmoticonInfo"};

    /* JADX INFO: renamed from: e */
    public static final Set f233e = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: f */
    public static volatile boolean f234f;

    /* JADX INFO: renamed from: g */
    public static volatile long f235g;

    /* JADX INFO: renamed from: h */
    public static volatile long f236h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m345a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            int iMin = Math.min(stackTraceElementArr.length, 42);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            for (int i = 3; i < iMin; i++) {
                String lowerCase = (stackTraceElementArr[i].getClassName() + "." + stackTraceElementArr[i].getMethodName()).toLowerCase(Locale.ROOT);
                if (!lowerCase.startsWith("com.mr.elaris.")) {
                    if (m358n(lowerCase)) {
                        z = true;
                    }
                    if (m348d(lowerCase, "autodownload", "auto_download", "predownload", "pre_download", "preload", "prefetch", "pre_fetch", "thumbnail", "thumb", "msglist", "itembuilder", "recyclerview", "onbind", "bindview", "binddata", "loadresource", "loadres", "loadimage", "loadpic", "loadgif", "download", "downloader", "fetch", "url", "datalineconfigapiimpl", "aiopiccontentcomponent", "aiomarketfacecomponent", "aioanistickercontentcomponent", "aiosinglesysfacecontentcomponent", "aiomixcontentcomponent", "emoticonspan", "dogetdrwable", "dogetdrawable", "chats.data.converter")) {
                        z2 = true;
                    }
                    if (m357m(lowerCase)) {
                        z3 = true;
                    }
                }
            }
            if (z && z2 && !z3) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m346b(String str, String str2, StackTraceElement[] stackTraceElementArr) {
        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - f235g < 60000) {
                return;
            }
            f235g = jCurrentTimeMillis;
            HookEntry.log("media click-load blocked action=" + str + " method=" + str2 + " stack=" + m360p(stackTraceElementArr));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m347c(String str, String str2, StackTraceElement[] stackTraceElementArr) {
        if (!HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG) || stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return;
        }
        int iMin = Math.min(stackTraceElementArr.length, 42);
        for (int i = 3; i < iMin; i++) {
            String lowerCase = (stackTraceElementArr[i].getClassName() + "." + stackTraceElementArr[i].getMethodName()).toLowerCase(Locale.ROOT);
            if (!lowerCase.startsWith("com.mr.elaris.") && m358n(lowerCase)) {
                if (stackTraceElementArr.length != 0) {
                    int iMin2 = Math.min(stackTraceElementArr.length, 42);
                    for (int i2 = 3; i2 < iMin2; i2++) {
                        String lowerCase2 = (stackTraceElementArr[i2].getClassName() + "." + stackTraceElementArr[i2].getMethodName()).toLowerCase(Locale.ROOT);
                        if (!lowerCase2.startsWith("com.mr.elaris.") && m357m(lowerCase2)) {
                            return;
                        }
                    }
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - f236h < 60000) {
                    return;
                }
                f236h = jCurrentTimeMillis;
                HookEntry.log("media click-load probe action=" + str + " method=" + str2 + " stack=" + m360p(stackTraceElementArr));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m348d(String str, String... strArr) {
        for (String str2 : strArr) {
            if (str2 != null && str2.length() > 0 && str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m349e(ClassLoader classLoader, String str) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && m354j(method)) {
                    String strM1078E = AbstractC0497v4.m1078E(method);
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    boolean z = parameterTypes != null && parameterTypes.length > 0 && parameterTypes[0] == String.class;
                    if (f233e.add(strM1078E)) {
                        method.setAccessible(true);
                        XposedBridge.hookMethod(method, new C0188dd(strM1078E, z));
                        i++;
                        HookEntry.logAlways("hooked aio emoticon drawable guard: " + strM1078E);
                    }
                }
            }
            return i;
        } catch (Throwable th) {
            HookEntry.logAlways("aio emoticon drawable guard failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a A[Catch: all -> 0x008d, TryCatch #0 {all -> 0x008d, blocks: (B:3:0x0001, B:6:0x0008, B:8:0x0011, B:10:0x001d, B:12:0x0024, B:15:0x002d, B:17:0x003d, B:19:0x0040, B:22:0x004f, B:24:0x0057, B:26:0x005a, B:29:0x006b), top: B:37:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b A[Catch: all -> 0x008d, TRY_LEAVE, TryCatch #0 {all -> 0x008d, blocks: (B:3:0x0001, B:6:0x0008, B:8:0x0011, B:10:0x001d, B:12:0x0024, B:15:0x002d, B:17:0x003d, B:19:0x0040, B:22:0x004f, B:24:0x0057, B:26:0x005a, B:29:0x006b), top: B:37:0x0001 }] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m350f(ClassLoader classLoader, String str) {
        String strM1078E;
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers())) {
                    if (m355k(method)) {
                        strM1078E = AbstractC0497v4.m1078E(method);
                        boolean zM355k = m355k(method);
                        if (!f233e.add(strM1078E)) {
                            method.setAccessible(true);
                            XposedBridge.hookMethod(method, new C0046cd(strM1078E, zM355k));
                            i++;
                            HookEntry.logAlways("hooked aio predownload guard: " + strM1078E);
                        }
                    } else if (method.getReturnType() == Void.TYPE) {
                        String name = method.getName();
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if ("onMsgReceive".equals(name)) {
                            if (parameterTypes.length == 1 && "java.util.List".equals(parameterTypes[0].getName())) {
                                strM1078E = AbstractC0497v4.m1078E(method);
                                boolean zM355k2 = m355k(method);
                                if (!f233e.add(strM1078E)) {
                                }
                            }
                        } else if (!"onGetOfflineMessageFinish".equals(name) || parameterTypes.length != 0) {
                        }
                    }
                }
            }
            return i;
        } catch (Throwable th) {
            HookEntry.logAlways("aio predownload guard failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m351g(ClassLoader classLoader, String str) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && m356l(method)) {
                    String strM1078E = AbstractC0497v4.m1078E(method);
                    if (f233e.add(strM1078E)) {
                        method.setAccessible(true);
                        XposedBridge.hookMethod(method, new C0014ad(strM1078E));
                        i++;
                        HookEntry.log("hooked sticker auto-load config: " + strM1078E);
                    }
                }
            }
            return i;
        } catch (Throwable th) {
            HookEntry.log("sticker auto-load config failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static int m352h(ClassLoader classLoader, String str) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (!Modifier.isAbstract(method.getModifiers()) && m359o(method.getName()).contains("querypicdownloadsize")) {
                    String strM1078E = AbstractC0497v4.m1078E(method);
                    if (f233e.add(strM1078E)) {
                        method.setAccessible(true);
                        XposedBridge.hookMethod(method, new C0030bd(strM1078E, method));
                        i++;
                        HookEntry.log("hooked sticker rich-media guard: " + strM1078E);
                    }
                }
            }
            return i;
        } catch (Throwable th) {
            HookEntry.log("sticker rich-media guard failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static synchronized void m353i(ClassLoader classLoader) {
        try {
            if (!f234f && classLoader != null) {
                String[] strArr = f229a;
                int iM349e = 0;
                for (int i = 0; i < 1; i++) {
                    iM349e += m351g(classLoader, strArr[i]);
                }
                String[] strArr2 = f230b;
                for (int i2 = 0; i2 < 4; i2++) {
                    iM349e += m352h(classLoader, strArr2[i2]);
                }
                String[] strArr3 = f231c;
                for (int i3 = 0; i3 < 1; i3++) {
                    iM349e += m350f(classLoader, strArr3[i3]);
                }
                String[] strArr4 = f232d;
                for (int i4 = 0; i4 < 2; i4++) {
                    iM349e += m349e(classLoader, strArr4[i4]);
                }
                if (iM349e > 0) {
                    f234f = true;
                    HookEntry.logAlways("media click-load guard installed count=" + iM349e);
                } else {
                    HookEntry.log("sticker auto-load guard target not found");
                }
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m354j(Method method) {
        Class<?>[] parameterTypes;
        String name = method.getReturnType().getName();
        if ("com.tencent.image.URLDrawable".equals(name) || "android.graphics.drawable.Drawable".equals(name)) {
            String name2 = method.getName();
            if ("getLoadingDrawable".equals(name2) && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length > 0 && parameterTypes[0] == String.class) {
                return true;
            }
            if ("getBigDrawable".equals(name2) && method.getParameterTypes().length == 2 && "android.content.Context".equals(method.getParameterTypes()[0].getName()) && method.getParameterTypes()[1] == Float.TYPE) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m355k(Method method) {
        return method.getReturnType() == Void.TYPE && "registerPreDownloader".equals(method.getName()) && method.getParameterTypes().length == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m356l(Method method) {
        Class<?> returnType = method.getReturnType();
        if (returnType != Boolean.TYPE && returnType != Boolean.class) {
            return false;
        }
        String strM359o = m359o(method.getName());
        return strM359o.contains("autodownload") || strM359o.contains("allowdownload") || strM359o.contains("candownload") || strM359o.contains("downloadinwifi") || strM359o.contains("downloadunderwifi");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m357m(String str) {
        if (m348d(str, "sendmsg", "send_msg", "sendphoto", "sendpicture", "sendpic", "upload", "uploader", "selectphoto", "selectpicture", "editpic", "photoedit", "camera", "input", "aionewinput", "album", "picker", "onactivityresult")) {
            return true;
        }
        return m348d(str, "onclick", "clicklistener", "gallery", "photoview", "imageviewer", "previewactivity", "aioimagepreview", "preview", "richmediabrowser", "viewer", "viewpager", "downloadinvisit", "getvideoplayurlinvisit", "play", "player", "animation", "animate", "browserapi", "showpreview", "openimage", "openpic", "showimage", "showpic", "openmedia", "showmedia", "openface", "showface");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static boolean m358n(String str) {
        return m348d(str, "anisticker", "ani_sticker", "marketface", "market_face", "sysface", "sys_face", "facebubble", "face_bubble", "magicface", "superface", "smallface", "smallyellowface", "emotion", "emoticon", "sticker", "aioanisticker", "aiomarketface", "aiosinglesysface", "aio_pic", "aiopic", "piccontent", "flashpic", "richmedia", "pic_element", "picelement", "apng", "lottie", "gif");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m359o(String str) {
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb.append(Character.toLowerCase(cCharAt));
            }
        }
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m360p(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null || stackTraceElementArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(stackTraceElementArr.length, 18);
        for (int i = 3; i < iMin; i++) {
            String str = stackTraceElementArr[i].getClassName() + "." + stackTraceElementArr[i].getMethodName();
            if (!str.startsWith("com.mr.elaris.")) {
                if (sb.length() > 0) {
                    sb.append(" <- ");
                }
                sb.append(str);
                if (sb.length() > 240) {
                    break;
                }
            }
        }
        return sb.toString();
    }
}
