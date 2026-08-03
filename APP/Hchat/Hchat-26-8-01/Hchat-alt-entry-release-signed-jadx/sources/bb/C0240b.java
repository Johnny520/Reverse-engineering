package bb;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Xml;
import bsh.org.objectweb.asm.Opcodes;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p011ab.C0042b;
import p023b8.C0203a;
import p035c8.AbstractC0413b;
import p068eh.AbstractC0921a;
import p096g8.C1368i;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p129ig.AbstractC2043a;
import p136j8.C2103n;
import p136j8.C2107r;
import p183m8.C2813a;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p242q8.C3460o;
import p258r8.C3742g;
import p332wb.AbstractC4855en;
import p381zb.AbstractC6134c;

/* JADX INFO: renamed from: bb.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0240b {

    /* JADX INFO: renamed from: a */
    public final Object f637a;

    /* JADX INFO: renamed from: b */
    public final Object f638b;

    /* JADX INFO: renamed from: c */
    public final Object f639c;

    /* JADX INFO: renamed from: d */
    public final Object f640d;

    /* JADX INFO: renamed from: e */
    public volatile GenericDeclaration f641e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0240b(C3742g c3742g, C0042b c0042b, C0241c c0241c) {
        c3742g.getClass();
        this.f637a = c3742g;
        this.f638b = c0042b;
        this.f639c = c0241c;
        this.f640d = new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m955b(String... strArr) {
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static InputStream m956f(ClassLoader classLoader, String str) {
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
    /* JADX INFO: renamed from: h */
    public static long m957h(Object obj) {
        if (obj instanceof Number) {
            return Math.max(0L, ((Number) obj).longValue());
        }
        if (obj != null) {
            try {
                return Math.max(0L, Long.parseLong(String.valueOf(obj).trim()));
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m958i(String str, String str2, LinkedHashMap linkedHashMap) {
        String strTrim = str2 != null ? str2.trim() : HttpUrl.FRAGMENT_ENCODE_SET;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strTrim) || linkedHashMap.containsKey(str)) {
            return;
        }
        linkedHashMap.put(str, strTrim);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m959r(AsyncTask asyncTask, String str, Object obj) {
        Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(asyncTask.getClass(), str);
        if (fieldFindFieldRecursive == null) {
            return;
        }
        try {
            Class<?> type = fieldFindFieldRecursive.getType();
            z = false;
            boolean z9 = false;
            if (type == Boolean.TYPE) {
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
                    z9 = true;
                }
                obj = Boolean.valueOf(z9);
            } else if (type == Integer.TYPE) {
                obj = Integer.valueOf(obj instanceof Number ? ((Number) obj).intValue() : 0);
            } else if (type == Long.TYPE) {
                obj = Long.valueOf(obj instanceof Number ? ((Number) obj).longValue() : 0L);
            }
            if (obj == null || type.isPrimitive() || type.isInstance(obj)) {
                KavaReflector.writeField(fieldFindFieldRecursive, asyncTask, obj);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m960a(String str) {
        FileOutputStream fileOutputStream;
        Bitmap frameAtTime;
        File file;
        String absolutePath = HttpUrl.FRAGMENT_ENCODE_SET;
        if (!TextUtils.isEmpty(HttpUrl.FRAGMENT_ENCODE_SET) && AbstractC0921a.m2262y(HttpUrl.FRAGMENT_ENCODE_SET)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        Bitmap bitmap = null;
        try {
            try {
                mediaMetadataRetriever.setDataSource(str);
                frameAtTime = mediaMetadataRetriever.getFrameAtTime(0L, 2);
            } catch (Throwable unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        if (frameAtTime == null) {
            if (frameAtTime != null) {
            }
            mediaMetadataRetriever.release();
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            file = new File(((Context) this.f637a).getCacheDir(), "Hchat_media");
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            if (file.isDirectory() || file.mkdirs()) {
                File file2 = new File(file, "video_thumb_" + Integer.toHexString(str.hashCode()) + ".jpg");
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    try {
                        if (frameAtTime.compress(Bitmap.CompressFormat.JPEG, 85, fileOutputStream2)) {
                            fileOutputStream2.flush();
                            absolutePath = file2.getAbsolutePath();
                            fileOutputStream2.close();
                        } else {
                            fileOutputStream2.close();
                        }
                    } catch (Throwable unused2) {
                    }
                    frameAtTime.recycle();
                } catch (Throwable th4) {
                    fileOutputStream = fileOutputStream2;
                    th = th4;
                    bitmap = frameAtTime;
                    m961c("生成视频缩略图失败: " + th.getMessage());
                    if (fileOutputStream != null) {
                    }
                    if (bitmap != null) {
                    }
                }
                mediaMetadataRetriever.release();
                return absolutePath;
            }
            m961c("生成视频缩略图失败: " + th.getMessage());
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused3) {
                }
            }
            if (bitmap != null) {
                bitmap.recycle();
            }
            mediaMetadataRetriever.release();
            return absolutePath;
        } finally {
        }
        bitmap = frameAtTime;
        frameAtTime.recycle();
        mediaMetadataRetriever.release();
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m961c(String str) {
        C2005i.m4939f("[WeChatVideoApi] ".concat(str));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public synchronized String m962d(ClassLoader classLoader, String str) {
        if (TextUtils.isEmpty(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        File file = new File(str);
        if (file.isFile()) {
            return file.getAbsolutePath();
        }
        File file2 = new File(((Context) this.f637a).getCacheDir(), "Hchat_message_video");
        if (!file2.isDirectory() && !file2.mkdirs()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        File file3 = new File(file2, "video_" + Integer.toHexString(str.hashCode()) + ".mp4");
        if (file3.isFile() && file3.length() > 0) {
            return file3.getAbsolutePath();
        }
        InputStream inputStreamM956f = m956f(classLoader, str);
        try {
            if (inputStreamM956f == null) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file3, false);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i9 = inputStreamM956f.read(bArr);
                        if (i9 <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, i9);
                    }
                    fileOutputStream.close();
                    inputStreamM956f.close();
                    return (!file3.isFile() || file3.length() <= 0) ? HttpUrl.FRAGMENT_ENCODE_SET : file3.getAbsolutePath();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (file3.exists()) {
                file3.delete();
            }
            m961c("读取视频VFS路径异常: " + th2.getMessage());
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public AsyncTask m963e() {
        Class<?> cls = ((DexFinder) this.f638b).sendVideoTaskClass;
        if (cls == null) {
            return null;
        }
        try {
            Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(cls, new Class[0]), new Object[0]);
            if (objNewInstance instanceof AsyncTask) {
                return (AsyncTask) objNewInstance;
            }
            m961c("发送视频失败: Task类型不匹配 ".concat(cls.getName()));
            return null;
        } catch (Throwable th2) {
            m961c("创建视频发送Task失败: " + cls.getName() + " " + th2.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public LinkedHashMap m964g(String str) {
        int iIndexOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!TextUtils.isEmpty(str) && (iIndexOf = str.indexOf(60)) >= 0) {
            try {
                Object objNewPullParser = Xml.newPullParser();
                StringReader stringReader = new StringReader(str.substring(iIndexOf));
                C0203a c0203a = (C0203a) objNewPullParser;
                c0203a.f1166n = stringReader;
                c0203a.f1173u = 0;
                c0203a.f1155C = false;
                c0203a.f1177y = null;
                c0203a.f1175w = null;
                c0203a.f1153A = false;
                c0203a.f1154B = -1;
                c0203a.f1169q = 0;
                c0203a.f1170r = 0;
                c0203a.f1171s = 0;
                c0203a.f1172t = 0;
                c0203a.f1162j = 0;
                c0203a.f1160h = null;
                c0203a.f504e0 = stringReader;
                String str2 = null;
                for (int iM867z = ((AbstractC0413b) objNewPullParser).f1173u; iM867z != 1; iM867z = ((C0203a) objNewPullParser).m867z()) {
                    if (iM867z == 2) {
                        String str3 = ((AbstractC0413b) objNewPullParser).f1177y;
                        String lowerCase = str3 != null ? str3.trim().toLowerCase(Locale.ROOT) : HttpUrl.FRAGMENT_ENCODE_SET;
                        for (int i9 = 0; i9 < ((AbstractC0413b) objNewPullParser).f1154B; i9++) {
                            AbstractC0413b abstractC0413b = (AbstractC0413b) objNewPullParser;
                            if (i9 >= abstractC0413b.f1154B) {
                                throw new IndexOutOfBoundsException();
                            }
                            int i10 = i9 * 4;
                            String str4 = abstractC0413b.f1156D[i10 + 2];
                            String lowerCase2 = str4 != null ? str4.trim().toLowerCase(Locale.ROOT) : HttpUrl.FRAGMENT_ENCODE_SET;
                            AbstractC0413b abstractC0413b2 = (AbstractC0413b) objNewPullParser;
                            if (i9 >= abstractC0413b2.f1154B) {
                                throw new IndexOutOfBoundsException();
                            }
                            m958i(lowerCase2, abstractC0413b2.f1156D[i10 + 3], linkedHashMap);
                        }
                        str2 = lowerCase;
                    } else if (iM867z == 4 && str2 != null) {
                        m958i(str2, ((AbstractC0413b) objNewPullParser).m1388h(), linkedHashMap);
                    } else if (iM867z == 3) {
                        str2 = null;
                    }
                }
            } catch (Throwable th2) {
                m961c("解析视频reserved4失败: " + th2.getMessage());
                return linkedHashMap;
            }
        }
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m965j(String str) {
        WeChatContact weChatContactM3725n;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f640d;
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C3147k c3147k = C0250l.f693c;
        if (AbstractC6134c.m10905b(string)) {
            C1368i c1368iM9259c = AbstractC4855en.m9259c();
            if (c1368iM9259c == null || (weChatContactM3725n = c1368iM9259c.m3725n(string)) == null || weChatContactM3725n.gender == 0 || AbstractC3149m.m6721t0(weChatContactM3725n.getRegion())) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l10 = (Long) concurrentHashMap.get(string);
                if (jCurrentTimeMillis - (l10 != null ? l10.longValue() : 0L) < 600000) {
                    return;
                }
                concurrentHashMap.put(string, Long.valueOf(jCurrentTimeMillis));
                C3086j c3086jTasks = WeChatApis.tasks();
                if (c3086jTasks != null) {
                    c3086jTasks.m6553d(new RunnableC0239a(this, string, 0));
                } else {
                    new Thread(new RunnableC0239a(this, string, 1)).start();
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void m966k(String str) {
        try {
            if (!m967l(str) && !m968m(str)) {
                return;
            }
            C3086j c3086jTasks = WeChatApis.tasks();
            if (c3086jTasks != null) {
                c3086jTasks.m6555f("real_tail_profile_refresh_".concat(str), 2500L, new RunnableC0239a(this, str, 2));
            }
        } catch (Throwable th2) {
            ((C0042b) this.f638b).invoke("联系人资料预取失败", th2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public boolean m967l(String str) {
        Object objM971p;
        C3742g c3742g = (C3742g) this.f637a;
        List<Method> list = c3742g.f12147e.getContactAddMethods;
        if (list != null) {
            for (Method methodFindMethod : list) {
                methodFindMethod.getClass();
                Class<?> declaringClass = methodFindMethod.getDeclaringClass();
                Object[] objArr = null;
                if (declaringClass != null) {
                    objM971p = m971p(declaringClass);
                    if (objM971p == null) {
                        DexFinder dexFinder = c3742g.f12147e;
                        Object objM4995A = AbstractC2043a.m4995A(dexFinder, declaringClass);
                        if (objM4995A != null) {
                            objM971p = objM4995A;
                        } else {
                            Class<?>[] interfaces = declaringClass.getInterfaces();
                            interfaces.getClass();
                            int length = interfaces.length;
                            int i9 = 0;
                            while (true) {
                                if (i9 >= length) {
                                    objM971p = AbstractC2043a.m4995A(dexFinder, declaringClass.getSuperclass());
                                    break;
                                }
                                Class<?> cls = interfaces[i9];
                                cls.getClass();
                                Object objM971p2 = m971p(cls);
                                if (objM971p2 != null) {
                                    objM971p = objM971p2;
                                    break;
                                }
                                Object objM4995A2 = AbstractC2043a.m4995A(dexFinder, cls);
                                if (objM4995A2 != null) {
                                    objM971p = objM4995A2;
                                    break;
                                }
                                i9++;
                            }
                        }
                    }
                } else {
                    objM971p = null;
                }
                if (objM971p != null) {
                    Class<?>[] parameterTypes = methodFindMethod.getParameterTypes();
                    if (parameterTypes != null) {
                        if (parameterTypes.length == 2 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], String.class)) {
                            objArr = new Object[]{str, HttpUrl.FRAGMENT_ENCODE_SET};
                        } else if (parameterTypes.length == 3 && AbstractC1416l.m3825a(parameterTypes[0], String.class) && AbstractC1416l.m3825a(parameterTypes[1], String.class) && (AbstractC1416l.m3825a(parameterTypes[2], Integer.TYPE) || AbstractC1416l.m3825a(parameterTypes[2], Integer.class))) {
                            objArr = new Object[]{str, HttpUrl.FRAGMENT_ENCODE_SET, 0};
                        }
                    }
                    if (objArr == null) {
                        continue;
                    } else {
                        if (!methodFindMethod.getDeclaringClass().isInstance(objM971p)) {
                            Class<?> cls2 = objM971p.getClass();
                            String name = methodFindMethod.getName();
                            Class<?>[] parameterTypes2 = methodFindMethod.getParameterTypes();
                            Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(cls2, name, (Class[]) Arrays.copyOf(parameterTypes2, parameterTypes2.length));
                            if (methodFindDeclaredMethod != null) {
                                methodFindMethod = methodFindDeclaredMethod;
                            } else {
                                Class<?> cls3 = objM971p.getClass();
                                String name2 = methodFindMethod.getName();
                                Class<?>[] parameterTypes3 = methodFindMethod.getParameterTypes();
                                methodFindMethod = KavaReflector.findMethod(cls3, name2, (Class[]) Arrays.copyOf(parameterTypes3, parameterTypes3.length));
                            }
                        }
                        if (methodFindMethod != null && KavaReflector.invokeSuccessfully(methodFindMethod, objM971p, Arrays.copyOf(objArr, objArr.length))) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c A[PHI: r0
  0x002c: PHI (r0v11 java.lang.Class<?>) = (r0v1 java.lang.Class<?>), (r0v6 java.lang.Class<?>) binds: [B:3:0x0009, B:12:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m968m(String str) {
        C2813a c2813aNetwork;
        Object[] objArr;
        Object objNewInstance;
        Class<?> clsFindNativeNetSceneClass = (Class) this.f641e;
        Object obj = null;
        if (clsFindNativeNetSceneClass != null) {
            Iterator<Constructor<?>> it = KavaReflector.declaredConstructors(clsFindNativeNetSceneClass).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Constructor<?> next = it.next();
                Class<?>[] parameterTypes = next.getParameterTypes();
                if (parameterTypes == null || parameterTypes.length == 0) {
                    objArr = null;
                    if (objArr == null && (objNewInstance = KavaReflector.newInstance(next, objArr)) != null) {
                        int iIntValue = -1;
                        try {
                            Object objInvokeMethod = KavaReflector.invokeMethod(objNewInstance, "getType", new Object[0]);
                            if (objInvokeMethod instanceof Number) {
                                iIntValue = ((Number) objInvokeMethod).intValue();
                            }
                        } catch (Throwable unused) {
                        }
                        if (iIntValue == 182) {
                            obj = objNewInstance;
                            break;
                        }
                    }
                } else {
                    objArr = new Object[parameterTypes.length];
                    int length = parameterTypes.length;
                    int i9 = 0;
                    boolean z9 = false;
                    while (true) {
                        if (i9 < length) {
                            Class<?> cls = parameterTypes[i9];
                            if (!AbstractC1416l.m3825a(cls, String.class)) {
                                if (!AbstractC1416l.m3825a(cls, Integer.TYPE) && !AbstractC1416l.m3825a(cls, Integer.class)) {
                                    if (!AbstractC1416l.m3825a(cls, Long.TYPE) && !AbstractC1416l.m3825a(cls, Long.class)) {
                                        if (!AbstractC1416l.m3825a(cls, Boolean.TYPE) && !AbstractC1416l.m3825a(cls, Boolean.class)) {
                                            break;
                                        }
                                        objArr[i9] = Boolean.FALSE;
                                    } else {
                                        objArr[i9] = 0L;
                                    }
                                } else {
                                    objArr[i9] = 0;
                                }
                            } else {
                                objArr[i9] = str;
                                z9 = true;
                            }
                            i9++;
                        } else if (!z9) {
                            break;
                        }
                    }
                    objArr = null;
                    if (objArr == null) {
                    }
                }
            }
        } else {
            try {
                clsFindNativeNetSceneClass = ((C3742g) this.f637a).f12147e.findNativeNetSceneClass("/cgi-bin/micromsg-bin/getcontact", Opcodes.INVOKEVIRTUAL);
            } catch (Throwable th2) {
                ((C0042b) this.f638b).invoke("定位联系人资料请求失败", th2);
                clsFindNativeNetSceneClass = null;
            }
            if (clsFindNativeNetSceneClass != null) {
                this.f641e = clsFindNativeNetSceneClass;
            } else {
                clsFindNativeNetSceneClass = null;
            }
            if (clsFindNativeNetSceneClass != null) {
            }
        }
        if (obj == null || (c2813aNetwork = WeChatApis.network()) == null) {
            return false;
        }
        return c2813aNetwork.f9079a.m6216j(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public C2107r m969n(String str) {
        long j3;
        Method method = ((DexFinder) this.f638b).videoInfoByFileNameMethod;
        if (!TextUtils.isEmpty(str) && method != null && KavaReflector.isStatic(method)) {
            try {
                Object objInvoke = KavaReflector.invoke(method, null, str);
                if (objInvoke != null) {
                    Class<?> cls = objInvoke.getClass();
                    Method methodAccessible = (Method) this.f641e;
                    if (methodAccessible == null || !methodAccessible.getDeclaringClass().isAssignableFrom(cls)) {
                        Iterator<Method> it = KavaReflector.declaredMethods(cls).iterator();
                        methodAccessible = null;
                        while (true) {
                            if (!it.hasNext()) {
                                this.f641e = methodAccessible;
                                break;
                            }
                            Method next = it.next();
                            if (next.getParameterTypes().length == 0 && next.getReturnType() == ContentValues.class) {
                                if (methodAccessible != null) {
                                    methodAccessible = null;
                                    break;
                                }
                                methodAccessible = KavaReflector.accessible(next);
                            }
                        }
                    }
                    int i9 = 0;
                    ContentValues contentValues = (ContentValues) KavaReflector.invoke(methodAccessible, objInvoke, new Object[0]);
                    if (contentValues != null) {
                        LinkedHashMap linkedHashMapM964g = m964g(contentValues.getAsString("reserved4"));
                        String strM955b = m955b((String) linkedHashMapM964g.get("md5"), (String) linkedHashMapM964g.get("newmd5"), contentValues.getAsString("videomd5"));
                        String strM955b2 = m955b((String) linkedHashMapM964g.get("cdnvideourl"));
                        String strM955b3 = m955b((String) linkedHashMapM964g.get("aeskey"));
                        long[] jArr = {m957h(linkedHashMapM964g.get("length")), m957h(linkedHashMapM964g.get("totallen")), m957h(contentValues.getAsLong("totallen"))};
                        while (true) {
                            if (i9 >= 3) {
                                j3 = 0;
                                break;
                            }
                            j3 = jArr[i9];
                            if (j3 > 0) {
                                break;
                            }
                            i9++;
                        }
                        long jM957h = m957h(contentValues.getAsLong("filenowsize"));
                        if (!TextUtils.isEmpty(strM955b) || !TextUtils.isEmpty(strM955b2) || !TextUtils.isEmpty(strM955b3) || j3 > 0 || jM957h > 0) {
                            return new C2107r(strM955b, strM955b2, strM955b3, j3);
                        }
                    }
                }
            } catch (Throwable th2) {
                m961c("读取视频下载信息失败: " + th2.getMessage());
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public String m970o(String str) {
        DexFinder dexFinder = (DexFinder) this.f638b;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.isFile()) {
                return file.getAbsolutePath();
            }
            Method method = dexFinder.videoPathMethod;
            if (method != null) {
                try {
                    boolean zIsStatic = KavaReflector.isStatic(method);
                    Object obj = null;
                    if (!zIsStatic) {
                        Class<?> declaringClass = method.getDeclaringClass();
                        Object objM4995A = AbstractC2043a.m4995A(dexFinder, declaringClass);
                        if (objM4995A != null) {
                            obj = objM4995A;
                        } else {
                            Method method2 = dexFinder.videoPathOwnerGetterMethod;
                            if (method2 != null && KavaReflector.isStatic(method2) && method2.getParameterTypes().length == 0 && declaringClass.isAssignableFrom(method2.getReturnType())) {
                                Object objInvoke = KavaReflector.invoke(method2, null, new Object[0]);
                                if (declaringClass.isInstance(objInvoke)) {
                                    obj = objInvoke;
                                }
                            }
                        }
                    }
                    if (zIsStatic || obj != null) {
                        Object objInvoke2 = KavaReflector.invoke(method, obj, str);
                        if (objInvoke2 instanceof String) {
                            return m962d(method.getDeclaringClass().getClassLoader(), (String) objInvoke2);
                        }
                    }
                } catch (Throwable th2) {
                    m961c("解析视频消息路径失败: " + th2.getMessage());
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public Object m971p(Class cls) {
        Object objInvoke;
        List<Method> list = ((C3742g) this.f637a).f12147e.getContactServiceGetters;
        if (list != null) {
            for (Method method : list) {
                if (cls.isAssignableFrom(method.getReturnType()) && (objInvoke = KavaReflector.invoke(method, null, new Object[0])) != null && cls.isInstance(objInvoke)) {
                    return objInvoke;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public boolean m972q(String str, String str2) {
        int iMax;
        String strExtractMetadata;
        Context context = (Context) this.f637a;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m961c("发送视频失败: talker/videoPath为空");
            return false;
        }
        if (!AbstractC0921a.m2262y(str2)) {
            m961c("发送视频失败: 文件不存在 " + str2);
            return false;
        }
        if (((DexFinder) this.f638b).sendVideoTaskClass == null) {
            m961c("发送视频失败: API未就绪");
            return false;
        }
        try {
            String strM960a = m960a(str2);
            if (TextUtils.isEmpty(strM960a)) {
                m961c("发送视频失败: 缩略图不可用");
                return false;
            }
            AsyncTask asyncTaskM963e = m963e();
            if (asyncTaskM963e == null) {
                return false;
            }
            m959r(asyncTaskM963e, "a", null);
            Activity activityM7263a = ((C3460o) this.f639c).m7263a();
            if (activityM7263a != null) {
                context = activityM7263a;
            }
            m959r(asyncTaskM963e, "b", context);
            m959r(asyncTaskM963e, "c", Boolean.FALSE);
            m959r(asyncTaskM963e, "d", 0);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str2);
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(strExtractMetadata)) {
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused2) {
                }
                iMax = 0;
            } else {
                iMax = (int) Math.max(0L, (Long.parseLong(strExtractMetadata) + 999) / 1000);
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable unused3) {
                }
            }
            m959r(asyncTaskM963e, "e", Integer.valueOf(iMax));
            m959r(asyncTaskM963e, "f", str2);
            m959r(asyncTaskM963e, "g", strM960a);
            m959r(asyncTaskM963e, "h", str);
            m959r(asyncTaskM963e, "i", HttpUrl.FRAGMENT_ENCODE_SET);
            m959r(asyncTaskM963e, "p", HttpUrl.FRAGMENT_ENCODE_SET);
            m959r(asyncTaskM963e, "r", HttpUrl.FRAGMENT_ENCODE_SET);
            m959r(asyncTaskM963e, "s", HttpUrl.FRAGMENT_ENCODE_SET);
            Boolean bool = Boolean.FALSE;
            m959r(asyncTaskM963e, "j", bool);
            m959r(asyncTaskM963e, "l", bool);
            m959r(asyncTaskM963e, "m", bool);
            asyncTaskM963e.execute(new Object[0]);
            return true;
        } catch (Throwable th2) {
            m961c("发送视频异常: " + th2.getMessage());
            return false;
        }
    }

    public C0240b(Context context, DexFinder dexFinder, C3460o c3460o, C2103n c2103n, C2002f c2002f) {
        this.f637a = context;
        this.f638b = dexFinder;
        this.f639c = c3460o;
        this.f640d = c2103n;
    }
}
