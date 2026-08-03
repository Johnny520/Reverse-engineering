package p136j8;

import android.content.Context;
import android.text.TextUtils;
import ba.C0226f;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import p020b5.C0184c;
import p068eh.AbstractC0921a;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p129ig.AbstractC2043a;
import p258r8.C3744i;

/* JADX INFO: renamed from: j8.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2103n {

    /* JADX INFO: renamed from: d */
    public static final AtomicBoolean f7030d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e */
    public static volatile Object f7031e;

    /* JADX INFO: renamed from: a */
    public final Context f7032a;

    /* JADX INFO: renamed from: b */
    public final DexFinder f7033b;

    /* JADX INFO: renamed from: c */
    public final C2002f f7034c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2103n(Context context, DexFinder dexFinder, C2002f c2002f) {
        this.f7032a = context;
        this.f7033b = dexFinder;
        this.f7034c = c2002f;
        m5258j(dexFinder.marsCdnManagerClass, c2002f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m5255b(Object obj, String str, Object obj2) {
        Method methodFindCompatibleMethod = KavaReflector.findCompatibleMethod(obj.getClass(), str, obj2);
        if (methodFindCompatibleMethod != null) {
            KavaReflector.invoke(methodFindCompatibleMethod, obj, obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Field m5256g(Class cls) {
        for (Field field : KavaReflector.declaredFields(cls)) {
            if (!KavaReflector.isStatic(field) && (field.getType() == Integer.TYPE || field.getType() == Integer.class)) {
                return KavaReflector.accessible(field);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m5257h(String str) {
        if (TextUtils.isEmpty(str)) {
            return "fk_dl_0_" + System.currentTimeMillis();
        }
        return "fk_dl_" + Math.abs(str.hashCode()) + "_" + System.currentTimeMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m5258j(Class cls, InterfaceC2102m interfaceC2102m) {
        if (cls != null && f7030d.compareAndSet(false, true)) {
            try {
                Iterator it = XposedBridge.hookAllConstructors(cls, new C0226f(14)).iterator();
                while (it.hasNext()) {
                    C3744i.f12154b.m7762a((XC_MethodHook.Unhook) it.next());
                }
                Object objStaticInstance = KavaReflector.staticInstance(cls);
                if (objStaticInstance != null) {
                    f7031e = objStaticInstance;
                }
            } catch (Throwable th2) {
                f7030d.set(false);
                interfaceC2102m.mo467a("[WeChatImageApi] ".concat("Mars CDN实例捕获Hook安装失败: " + th2.getMessage()));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static InputStream m5259o(ClassLoader classLoader, String str) {
        if (classLoader != null && !TextUtils.isEmpty(str)) {
            String[] strArr = {"com.tencent.mm.vfs.w6", "com.tencent.mm.vfs.p6"};
            for (int i9 = 0; i9 < 2; i9++) {
                Class<?> clsLoadClass = KavaReflector.loadClass(strArr[i9], classLoader);
                if (clsLoadClass != null) {
                    String[] strArr2 = {"E", "F"};
                    for (int i10 = 0; i10 < 2; i10++) {
                        Object objInvoke = KavaReflector.invoke(KavaReflector.findMethod(clsLoadClass, strArr2[i10], String.class), null, str);
                        if (objInvoke instanceof InputStream) {
                            return (InputStream) objInvoke;
                        }
                    }
                    for (Method method : KavaReflector.declaredMethods(clsLoadClass)) {
                        if (Modifier.isStatic(method.getModifiers()) && method.getReturnType() == InputStream.class) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            if (parameterTypes.length == 1 && parameterTypes[0] == String.class) {
                                Object objInvoke2 = KavaReflector.invoke(method, null, str);
                                if (objInvoke2 instanceof InputStream) {
                                    return (InputStream) objInvoke2;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m5260t(Object obj, String str) {
        Field[] fieldArr = new Field[5];
        int i9 = 0;
        for (Field field : KavaReflector.declaredFields(obj.getClass())) {
            if (!KavaReflector.isStatic(field) && field.getType() == String.class) {
                if (i9 < 5) {
                    fieldArr[i9] = KavaReflector.accessible(field);
                }
                i9++;
            }
        }
        return i9 >= 5 && KavaReflector.writeField(fieldArr[0], obj, str) && KavaReflector.writeField(fieldArr[1], obj, HttpUrl.FRAGMENT_ENCODE_SET) && KavaReflector.writeField(fieldArr[2], obj, HttpUrl.FRAGMENT_ENCODE_SET) && KavaReflector.writeField(fieldArr[3], obj, HttpUrl.FRAGMENT_ENCODE_SET) && KavaReflector.writeField(fieldArr[4], obj, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m5261u(Object obj, String str) {
        Class<?> cls;
        Class<?> superclass = obj.getClass();
        Object field = KavaReflector.readField(m5256g(superclass), obj);
        if (field instanceof Integer) {
            Method methodAccessible = null;
            loop0: while (true) {
                if (superclass == null || superclass == Object.class) {
                    break;
                }
                for (Method method : KavaReflector.declaredMethods(superclass)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 2 && ((cls = parameterTypes[0]) == Integer.TYPE || cls == Integer.class)) {
                        if (parameterTypes[1] != Object.class) {
                            continue;
                        } else {
                            if ("set".equals(method.getName())) {
                                methodAccessible = KavaReflector.accessible(method);
                                break loop0;
                            }
                            if (methodAccessible == null) {
                                methodAccessible = KavaReflector.accessible(method);
                            }
                        }
                    }
                }
                superclass = superclass.getSuperclass();
            }
            if (methodAccessible != null) {
                Integer num = (Integer) field;
                int iIntValue = num.intValue();
                try {
                    KavaReflector.invokeOrThrow(methodAccessible, obj, num, str);
                    KavaReflector.invokeOrThrow(methodAccessible, obj, Integer.valueOf(iIntValue + 4), HttpUrl.FRAGMENT_ENCODE_SET);
                    KavaReflector.invokeOrThrow(methodAccessible, obj, Integer.valueOf(iIntValue + 5), HttpUrl.FRAGMENT_ENCODE_SET);
                    KavaReflector.invokeOrThrow(methodAccessible, obj, Integer.valueOf(iIntValue + 6), HttpUrl.FRAGMENT_ENCODE_SET);
                    return true;
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object[] m5262a(Method method, String str, String str2, String str3, boolean z9) {
        String string;
        String strM2255r;
        int i9;
        Class<?>[] parameterTypes = method.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        if (TextUtils.isEmpty(str3)) {
            strM2255r = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            StringBuilder sb2 = new StringBuilder("<msg><appinfo><appid>");
            if (str3.length() == 0) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                StringBuilder sb3 = new StringBuilder(str3.length());
                for (int i10 = 0; i10 < str3.length(); i10++) {
                    char cCharAt = str3.charAt(i10);
                    if (cCharAt == '&') {
                        sb3.append("&amp;");
                    } else if (cCharAt == '<') {
                        sb3.append("&lt;");
                    } else if (cCharAt == '>') {
                        sb3.append("&gt;");
                    } else {
                        sb3.append(cCharAt);
                    }
                }
                string = sb3.toString();
            }
            strM2255r = AbstractC0921a.m2255r(sb2, string, "</appid></appinfo></msg>");
        }
        if (parameterTypes.length == 8) {
            i9 = parameterTypes[5] != String.class ? -1 : 5;
        }
        int i11 = 0;
        while (i11 < parameterTypes.length) {
            Class<?> cls = parameterTypes[i11];
            if (i11 == 0 && Context.class.isAssignableFrom(cls)) {
                objArr[i11] = this.f7032a;
            } else if (i11 == 1 && cls == String.class) {
                objArr[i11] = str;
            } else if (i11 == 2 && cls == String.class) {
                objArr[i11] = str2;
            } else if (i11 == i9) {
                objArr[i11] = strM2255r;
            } else if (cls == Integer.TYPE || cls == Integer.class) {
                objArr[i11] = Integer.valueOf((z9 && i11 == 3) ? 1 : 0);
            } else if (cls == Boolean.TYPE || cls == Boolean.class) {
                objArr[i11] = Boolean.FALSE;
            } else if (cls == String.class) {
                objArr[i11] = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                objArr[i11] = null;
            }
            i11++;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m5263c() {
        m5258j(this.f7033b.marsCdnManagerClass, this.f7034c);
        StringBuilder sb2 = new StringBuilder("marsReady=");
        sb2.append(this.f7033b.isMarsCdnReady());
        sb2.append(" managerClass=");
        sb2.append(this.f7033b.marsCdnManagerClass != null);
        sb2.append(" requestClass=");
        sb2.append(this.f7033b.marsCdnDownloadRequestClass != null);
        sb2.append(" callbackClass=");
        sb2.append(this.f7033b.marsCdnDownloadCallbackClass != null);
        sb2.append(" startMethod=");
        sb2.append(this.f7033b.marsCdnStartDownloadMethod != null);
        sb2.append(" managerInstance=");
        sb2.append(f7031e != null);
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m5264d(String str, String str2, String str3, int i9, final C0184c c0184c) {
        Object objStaticInstance;
        Object obj = f7031e;
        if (obj == null && (objStaticInstance = KavaReflector.staticInstance(this.f7033b.marsCdnManagerClass)) != null) {
            f7031e = objStaticInstance;
            obj = objStaticInstance;
        }
        if (obj == null) {
            m5268k("Mars CDN未提交: 尚未捕获CdnManager实例");
            return false;
        }
        try {
            Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(this.f7033b.marsCdnDownloadRequestClass, new Class[0]), new Object[0]);
            if (objNewInstance == null) {
                m5268k("Mars CDN未提交: 无法创建C2CDownloadRequest");
                return false;
            }
            final String strM5257h = m5257h(str);
            m5255b(objNewInstance, "setFileKey", strM5257h);
            m5255b(objNewInstance, "setFileid", str);
            m5255b(objNewInstance, "setAeskey", str2);
            if (i9 <= 0) {
                i9 = 2;
            }
            m5255b(objNewInstance, "setFileType", Integer.valueOf(i9));
            m5255b(objNewInstance, "setSavePath2", str3);
            m5255b(objNewInstance, "setBizid", 1);
            m5255b(objNewInstance, "setApptype", 1);
            Method methodFindMethod = KavaReflector.findMethod(objNewInstance.getClass(), "build", new Class[0]);
            if (methodFindMethod != null) {
                KavaReflector.invoke(methodFindMethod, objNewInstance, new Object[0]);
            }
            Object objInvoke = KavaReflector.invoke(this.f7033b.marsCdnStartDownloadMethod, obj, objNewInstance, Proxy.newProxyInstance(this.f7033b.marsCdnDownloadCallbackClass.getClassLoader(), new Class[]{this.f7033b.marsCdnDownloadCallbackClass}, new InvocationHandler() { // from class: j8.k
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj2, Method method, Object[] objArr) {
                    String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                    String name = method != null ? method.getName() : HttpUrl.FRAGMENT_ENCODE_SET;
                    if ("toString".equals(name)) {
                        return AbstractC0921a.m2251n("HchatMarsCdnCallback(", strM5257h, ")");
                    }
                    if ("hashCode".equals(name)) {
                        return Integer.valueOf(System.identityHashCode(obj2));
                    }
                    Object obj3 = null;
                    if ("equals".equals(name)) {
                        if (objArr != null && objArr.length > 0) {
                            obj3 = objArr[0];
                        }
                        return Boolean.valueOf(obj2 == obj3);
                    }
                    boolean zEquals = "onC2CDownloadCompleted".equals(name);
                    C0184c c0184c2 = c0184c;
                    if (zEquals) {
                        Object obj4 = (objArr == null || objArr.length <= 1) ? null : objArr[1];
                        Object field = obj4 != null ? KavaReflector.readField(obj4, "errorCode") : null;
                        int iIntValue = field instanceof Number ? ((Number) field).intValue() : 0;
                        if (iIntValue == 0) {
                            AtomicBoolean atomicBoolean = (AtomicBoolean) c0184c2.f471c;
                            InterfaceC2101l interfaceC2101l = (InterfaceC2101l) c0184c2.f469a;
                            if (interfaceC2101l != null && atomicBoolean.compareAndSet(false, true)) {
                                String str5 = (String) c0184c2.f470b;
                                if (str5 != null) {
                                    str4 = str5;
                                }
                                File file = new File(str4);
                                if (!file.isFile() || file.length() <= 0) {
                                    atomicBoolean.set(false);
                                    c0184c2.m816m("CDN下载完成但目标文件未落盘");
                                } else {
                                    try {
                                        interfaceC2101l.onSuccess(file);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        } else {
                            c0184c2.m816m("CDN下载失败 errorCode=" + iIntValue);
                        }
                    } else if ("onDownloadCanceled".equals(name) || "onCanceled".equals(name)) {
                        c0184c2.m816m("CDN下载已取消");
                    }
                    Class<?> returnType = method != null ? method.getReturnType() : Void.TYPE;
                    if (returnType == Boolean.TYPE) {
                        return Boolean.FALSE;
                    }
                    if (returnType == Integer.TYPE) {
                        return 0;
                    }
                    if (returnType == Long.TYPE) {
                        return 0L;
                    }
                    if (returnType == Float.TYPE) {
                        return Float.valueOf(0.0f);
                    }
                    if (returnType == Double.TYPE) {
                        return Double.valueOf(0.0d);
                    }
                    return null;
                }
            }));
            return objInvoke instanceof Boolean ? ((Boolean) objInvoke).booleanValue() : !(objInvoke instanceof Number) || ((Number) objInvoke).intValue() >= 0;
        } catch (Throwable th2) {
            m5268k("Mars CDN提交异常: " + th2.getClass().getSimpleName() + ": " + th2.getMessage());
            c0184c.m816m(th2.getClass().getSimpleName() + ": " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m5265e(String str, String str2, String str3, int i9, InterfaceC2101l interfaceC2101l) {
        Throwable th2;
        C0184c c0184c = new C0184c();
        c0184c.f471c = new AtomicBoolean(false);
        c0184c.f469a = interfaceC2101l;
        c0184c.f470b = str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            m5268k("下载图片失败: cdnUrl/aesKey/savePath为空");
            c0184c.m816m("cdnUrl/aesKey/savePath为空");
            return false;
        }
        DexFinder dexFinder = this.f7033b;
        Class<?> cls = dexFinder.marsCdnManagerClass;
        C2002f c2002f = this.f7034c;
        m5258j(cls, c2002f);
        if (!dexFinder.isMarsCdnReady()) {
            m5268k("下载图片失败: CDN API未就绪");
            c0184c.m816m("CDN API未就绪");
            return false;
        }
        try {
            m5258j(dexFinder.marsCdnManagerClass, c2002f);
            File parentFile = new File(str3).getParentFile();
            if (parentFile != null) {
                try {
                    if (!parentFile.isDirectory()) {
                        parentFile.mkdirs();
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    m5268k("下载图片异常: " + th2.getClass().getSimpleName() + ": " + th2.getMessage());
                    c0184c.m816m(th2.getClass().getSimpleName() + ": " + th2.getMessage());
                    return false;
                }
            }
            if (!dexFinder.isMarsCdnReady()) {
                m5268k("下载图片失败: Mars CDN API未就绪");
                c0184c.m816m("Mars CDN API未就绪");
                return false;
            }
            try {
                boolean zM5264d = m5264d(str, str2, str3, i9, c0184c);
                if (zM5264d) {
                    return zM5264d;
                }
                c0184c.m816m("CDN任务提交失败");
                return zM5264d;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                m5268k("下载图片异常: " + th2.getClass().getSimpleName() + ": " + th2.getMessage());
                c0184c.m816m(th2.getClass().getSimpleName() + ": " + th2.getMessage());
                return false;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final Constructor m5266f() {
        Class<?> cls;
        DexFinder dexFinder = this.f7033b;
        Class<?> cls2 = dexFinder.sendImageAsyncParamsClass;
        Class<?> cls3 = dexFinder.sendImageCrossParamsClass;
        for (Constructor<?> constructor : KavaReflector.declaredConstructors(cls2)) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            if (parameterTypes.length == 5 && parameterTypes[0] == String.class && ((cls = parameterTypes[1]) == Integer.TYPE || cls == Integer.class)) {
                if (parameterTypes[2] == String.class && parameterTypes[3] == String.class && parameterTypes[4] == cls3) {
                    return KavaReflector.accessible(constructor);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Object m5267i(Class cls) {
        DexFinder dexFinder = this.f7033b;
        Method method = dexFinder.imageStorageGetterMethod;
        if (method != null && KavaReflector.isStatic(method) && method.getParameterTypes().length == 0 && method.getReturnType() == cls) {
            Object objInvoke = KavaReflector.invoke(method, null, new Object[0]);
            if (cls.isInstance(objInvoke)) {
                return objInvoke;
            }
        }
        return AbstractC2043a.m4995A(dexFinder, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m5268k(String str) {
        C2005i.m4939f("[WeChatImageApi] ".concat(str));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final synchronized String m5269l(ClassLoader classLoader, String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        File file = new File(str);
        if (file.isFile()) {
            return file.getAbsolutePath();
        }
        File file2 = new File(this.f7032a.getCacheDir(), "Hchat_message_image");
        if (!file2.isDirectory() && !file2.mkdirs()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        File file3 = new File(file2, "image_" + Integer.toHexString(str.hashCode()) + ".jpg");
        if (file3.isFile() && file3.length() > 0) {
            return file3.getAbsolutePath();
        }
        InputStream inputStreamM5259o = m5259o(classLoader, str);
        if (inputStreamM5259o == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file3, false);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i9 = inputStreamM5259o.read(bArr);
                        if (i9 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i9);
                    }
                    fileOutputStream.close();
                    inputStreamM5259o.close();
                    return (!file3.isFile() || file3.length() <= 0) ? HttpUrl.FRAGMENT_ENCODE_SET : file3.getAbsolutePath();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (file3.exists()) {
                file3.delete();
            }
            m5268k("读取图片VFS路径异常: " + th2.getMessage());
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Object m5270m(String str) {
        try {
            Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(this.f7033b.sendImageAppInfoClass, new Class[0]), new Object[0]);
            if (objNewInstance != null) {
                if (!m5261u(objNewInstance, str)) {
                    if (m5260t(objNewInstance, str)) {
                    }
                }
                return objNewInstance;
            }
            return null;
        } catch (Throwable th2) {
            m5268k("创建图片appinfo异常: " + th2.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final Object m5271n(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            return KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0]);
        } catch (Throwable th2) {
            m5268k("创建图片发送器失败: " + cls.getName() + " " + th2.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final String m5272p(Object obj) {
        Method method = this.f7033b.imageBestPathMethod;
        if (obj != null && method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1 && parameterTypes[0].isInstance(obj)) {
                try {
                    Object objM5267i = m5267i(method.getDeclaringClass());
                    if (objM5267i != null) {
                        String str = (String) KavaReflector.invoke(method, objM5267i, obj);
                        if (!TextUtils.isEmpty(str)) {
                            return m5269l(method.getDeclaringClass().getClassLoader(), str);
                        }
                    }
                } catch (Throwable th2) {
                    m5268k("解析图片原图路径异常: " + th2.getMessage());
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m5273q(String str, String str2, String str3) {
        boolean zWriteField;
        boolean zWriteField2;
        DexFinder dexFinder = this.f7033b;
        try {
            Object objM5271n = m5271n(dexFinder.sendImageCrossParamsClass);
            if (objM5271n == null) {
                m5268k("新版图片appid链路失败: crossParams创建失败");
                return false;
            }
            Field fieldFindField = KavaReflector.findField(objM5271n.getClass(), "a");
            if (fieldFindField == null || (fieldFindField.getType() != Integer.TYPE && fieldFindField.getType() != Integer.class)) {
                fieldFindField = m5256g(objM5271n.getClass());
            }
            if (!KavaReflector.writeField(fieldFindField, objM5271n, (Object) 6)) {
                m5268k("新版图片appid链路失败: crossParams类型字段写入失败");
                return false;
            }
            Object objM5270m = m5270m(str3);
            if (objM5270m == null) {
                m5268k("新版图片appid链路失败: appinfo创建失败");
                return false;
            }
            Class<?> cls = dexFinder.sendImageAppInfoClass;
            if (cls == null) {
                zWriteField = false;
            } else {
                for (Field field : KavaReflector.declaredFields(objM5271n.getClass())) {
                    if (field.getType() == cls) {
                        zWriteField = KavaReflector.writeField(field, objM5271n, objM5270m);
                        break;
                    }
                }
                zWriteField = false;
            }
            if (!zWriteField) {
                m5268k("新版图片appid链路失败: appinfo字段写入失败");
                return false;
            }
            Constructor constructorM5266f = m5266f();
            String str4 = HttpUrl.FRAGMENT_ENCODE_SET;
            try {
                if (WeChatApis.account() != null) {
                    String strM3652c = WeChatApis.account().m3652c();
                    if (strM3652c != null) {
                        str4 = strM3652c;
                    }
                }
            } catch (Throwable unused) {
            }
            Object objNewInstance = KavaReflector.newInstance(constructorM5266f, str2, 0, str4, str, objM5271n);
            if (objNewInstance == null) {
                m5268k("新版图片appid链路失败: params创建失败");
            } else {
                loop0: for (Class<?> superclass = objNewInstance.getClass(); superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field2 : KavaReflector.declaredFields(superclass)) {
                        if (!KavaReflector.isStatic(field2) && field2.getType() == String.class && "msg_raw_img_send".equals(KavaReflector.readField(field2, objNewInstance))) {
                            zWriteField2 = KavaReflector.writeField(field2, objNewInstance, "send_wx_media_message_helper");
                            break loop0;
                        }
                    }
                }
                zWriteField2 = false;
                if (zWriteField2) {
                    Method method = dexFinder.sendImageAsyncSubmitMethod;
                    Object objM4995A = AbstractC2043a.m4995A(dexFinder, method.getDeclaringClass());
                    if (KavaReflector.isStatic(method) || objM4995A != null) {
                        if (KavaReflector.isStatic(method)) {
                            objM4995A = null;
                        }
                        KavaReflector.invokeOrThrow(method, objM4995A, objNewInstance);
                        return true;
                    }
                    m5268k("新版图片appid链路失败: 服务不可用 " + method.getDeclaringClass().getName());
                } else {
                    m5268k("新版图片appid链路失败: 外部来源字段写入失败");
                }
            }
            return false;
        } catch (Throwable th2) {
            m5268k("新版图片appid链路异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m5274r(String str, String str2, String str3, boolean z9) {
        Throwable th2;
        Object objM4995A;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m5268k("发送图片失败: talker/imagePath为空");
            return false;
        }
        if (!AbstractC0921a.m2262y(str2)) {
            m5268k("发送图片失败: 文件不存在 " + str2);
            return false;
        }
        DexFinder dexFinder = this.f7033b;
        if (dexFinder.sendImageMethod == null && (dexFinder.sendImageAsyncParamsClass == null || dexFinder.sendImageCrossParamsClass == null || dexFinder.sendImageAppInfoClass == null || dexFinder.sendImageAsyncSubmitMethod == null)) {
            m5268k("发送图片失败: API未就绪");
            return false;
        }
        try {
            if (!TextUtils.isEmpty(str3)) {
                try {
                    if (m5275s()) {
                        if ((dexFinder.sendImageAsyncParamsClass == null || dexFinder.sendImageCrossParamsClass == null || dexFinder.sendImageAppInfoClass == null || dexFinder.sendImageAsyncSubmitMethod == null) ? false : true) {
                            if (m5273q(str, str2, str3)) {
                                return true;
                            }
                            m5268k("新版图片appid链路失败，回退短签名");
                        }
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            Method method = dexFinder.sendImageMethod;
            if (method == null) {
                m5268k("发送图片失败: 短签名API未就绪");
                return false;
            }
            if (KavaReflector.isStatic(method)) {
                objM4995A = null;
            } else {
                objM4995A = AbstractC2043a.m4995A(dexFinder, method.getDeclaringClass());
                if (objM4995A == null) {
                    objM4995A = m5271n(method.getDeclaringClass());
                }
            }
            if (!KavaReflector.isStatic(method) && objM4995A == null) {
                m5268k("发送图片失败: 无法创建 ".concat(method.getDeclaringClass().getName()));
                return false;
            }
            try {
                KavaReflector.invoke(method, objM4995A, m5262a(method, str, str2, str3, z9));
                return true;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        m5268k("发送图片异常: " + th2.getMessage());
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:61:0x009f) to fix multi-entry loop: BACK_EDGE: B:61:0x009f -> B:46:0x009f */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba A[EDGE_INSN: B:75:0x00ba->B:57:0x00ba BREAK  A[LOOP:0: B:17:0x0047->B:56:0x00b7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r3
  0x001b: PHI (r3v8 java.lang.String) = (r3v2 java.lang.String), (r3v12 java.lang.String) binds: [B:11:0x002d, B:6:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:61:0x009f
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5275s() {
        /*
            r9 = this;
            java.lang.String r0 = ""
            android.content.Context r1 = r9.f7032a
            r2 = 0
            o8.k r3 = p099h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L1d
            if (r3 == 0) goto L1d
            o8.k r3 = p099h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L1d
            l8.i r3 = r3.m6563b()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r3.f8198d     // Catch: java.lang.Throwable -> L1d
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L1d
            if (r4 != 0) goto L1d
        L1b:
            r0 = r3
            goto L30
        L1d:
            android.content.pm.PackageManager r3 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r1.getPackageName()     // Catch: java.lang.Throwable -> L30
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r4, r2)     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L30
            java.lang.String r3 = r3.versionName     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L30
            goto L1b
        L30:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            if (r3 == 0) goto L38
            goto L7e
        L38:
            java.lang.String r3 = "\\."
            java.lang.String[] r0 = r0.split(r3)
            r3 = 8
            r5 = 66
            int[] r3 = new int[]{r3, r2, r5}
            r5 = r2
        L47:
            r6 = 3
            if (r5 >= r6) goto Lba
            int r6 = r0.length
            if (r5 >= r6) goto L76
            r6 = r0[r5]
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 == 0) goto L56
            goto L76
        L56:
            r7 = r2
        L57:
            int r8 = r6.length()
            if (r7 >= r8) goto L6a
            char r8 = r6.charAt(r7)
            boolean r8 = java.lang.Character.isDigit(r8)
            if (r8 == 0) goto L6a
            int r7 = r7 + 1
            goto L57
        L6a:
            if (r7 != 0) goto L6d
            goto L76
        L6d:
            java.lang.String r6 = r6.substring(r2, r7)     // Catch: java.lang.Throwable -> L76
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L76
            goto L77
        L76:
            r6 = r2
        L77:
            r7 = r3[r5]
            if (r6 <= r7) goto L7c
            goto Lba
        L7c:
            if (r6 >= r7) goto Lb7
        L7e:
            o8.k r0 = p099h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L8f
            o8.k r0 = p099h.Hchat.hooks.api.core.WeChatApis.version()     // Catch: java.lang.Throwable -> L8f
            l8.i r0 = r0.m6563b()     // Catch: java.lang.Throwable -> L8f
            long r0 = r0.f8195a     // Catch: java.lang.Throwable -> L8f
            goto Laf
        L8f:
            r5 = 0
            android.content.pm.PackageManager r0 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = r1.getPackageName()     // Catch: java.lang.Throwable -> L9f
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r1, r2)     // Catch: java.lang.Throwable -> L9f
            if (r0 != 0) goto La1
        L9f:
            r0 = r5
            goto Laf
        La1:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L9f
            r3 = 28
            if (r1 < r3) goto Lac
            long r0 = p015b0.AbstractC0132b0.m688b(r0)     // Catch: java.lang.Throwable -> L9f
            goto Laf
        Lac:
            int r0 = r0.versionCode     // Catch: java.lang.Throwable -> L9f
            long r0 = (long) r0
        Laf:
            r5 = 2980(0xba4, double:1.4723E-320)
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 < 0) goto Lb6
            r2 = r4
        Lb6:
            return r2
        Lb7:
            int r5 = r5 + 1
            goto L47
        Lba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p136j8.C2103n.m5275s():boolean");
    }
}
