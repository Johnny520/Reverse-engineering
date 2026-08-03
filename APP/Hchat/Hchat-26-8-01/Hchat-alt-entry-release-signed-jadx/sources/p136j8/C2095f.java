package p136j8;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p025bc.C0257g;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.utils.KavaReflector;
import p125i8.C2002f;
import p125i8.C2005i;
import p129ig.AbstractC2043a;
import p215od.C3128a;
import p215od.C3129b;
import p265s.C3816b0;
import p265s.InterfaceC3814a1;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4325u;
import p302ud.InterfaceC4316l;
import p308v1.C4401j1;

/* JADX INFO: renamed from: j8.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2095f {

    /* JADX INFO: renamed from: a */
    public boolean f7000a;

    /* JADX INFO: renamed from: b */
    public final Object f7001b;

    /* JADX INFO: renamed from: c */
    public Object f7002c;

    /* JADX INFO: renamed from: d */
    public Object f7003d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2095f(C0257g c0257g) {
        this.f7001b = new C3129b();
        this.f7002c = new HashMap();
        this.f7003d = new HashMap();
        this.f7000a = c0257g.f716B;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static Object m5195B(Class cls) {
        Object field;
        if (cls != null && !cls.isPrimitive()) {
            try {
                try {
                    return KavaReflector.newInstance(KavaReflector.findConstructor(cls, Long.TYPE, String.class), 0L, null);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                for (Field field2 : KavaReflector.declaredFields(cls)) {
                    if (KavaReflector.isStatic(field2) && cls.isAssignableFrom(field2.getType()) && (field = KavaReflector.readField(field2, (Object) null)) != null) {
                        return field;
                    }
                }
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m5196i(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length >= 6) {
                String str = new String(bArr, 0, 6, StandardCharsets.US_ASCII);
                if (!"GIF87a".equals(str) && !"GIF89a".equals(str)) {
                }
                return true;
            }
            if ((bArr.length >= 8 && (bArr[0] & 255) == 137 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) || ((bArr.length >= 3 && (bArr[0] & 255) == 255 && (bArr[1] & 255) == 216 && (bArr[2] & 255) == 255) || (bArr.length >= 12 && bArr[0] == 82 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 70 && bArr[8] == 87 && bArr[9] == 69 && bArr[10] == 66 && bArr[11] == 80))) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m5197k(String str) {
        String strTrim = str != null ? str.trim() : HttpUrl.FRAGMENT_ENCODE_SET;
        if (strTrim != null && strTrim.length() == 32) {
            for (int i9 = 0; i9 < strTrim.length(); i9++) {
                char cCharAt = strTrim.charAt(i9);
                if ((cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'f') || (cCharAt >= 'A' && cCharAt <= 'F'))) {
                }
            }
            return strTrim.toLowerCase();
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m5198s(Object obj, String str, String str2) {
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, str, new Object[0]);
        if (objInvokeMethod == null) {
            objInvokeMethod = KavaReflector.readField(obj, str2);
        }
        return objInvokeMethod != null ? String.valueOf(objInvokeMethod) : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m5199z(Object obj, String str, Object obj2) {
        Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(obj.getClass(), str);
        if (fieldFindFieldRecursive == null) {
            return;
        }
        Class<?> type = fieldFindFieldRecursive.getType();
        boolean z9 = false;
        z9 = false;
        if (type == Integer.TYPE) {
            obj2 = Integer.valueOf(obj2 instanceof Number ? ((Number) obj2).intValue() : 0);
        } else if (type == Long.TYPE) {
            obj2 = Long.valueOf(obj2 instanceof Number ? ((Number) obj2).longValue() : 0L);
        } else if (type == Boolean.TYPE) {
            if ((obj2 instanceof Boolean) && ((Boolean) obj2).booleanValue()) {
                z9 = true;
            }
            obj2 = Boolean.valueOf(z9);
        }
        KavaReflector.writeField(fieldFindFieldRecursive, obj, obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public Object m5200A(Method method) {
        if (method == null || KavaReflector.isStatic(method)) {
            return null;
        }
        Object objM4995A = AbstractC2043a.m4995A((DexFinder) this.f7001b, method.getDeclaringClass());
        if (objM4995A != null) {
            return objM4995A;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        if (declaringClass == null) {
            return null;
        }
        try {
            return KavaReflector.newInstance(KavaReflector.findConstructor(declaringClass, new Class[0]), new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public boolean m5201a() {
        return ((DexFinder) this.f7001b).emojiSendMethod != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public byte[] m5202b(byte[] bArr) {
        Method method;
        if (bArr.length == 0 || m5196i(bArr)) {
            return bArr;
        }
        synchronized (this) {
            if (this.f7000a) {
                method = (Method) this.f7003d;
            } else {
                this.f7000a = true;
                try {
                    Method method2 = ((DexFinder) this.f7001b).emojiDecodeDataMethod;
                    Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(KavaReflector.loadClass("com.tencent.mm.plugin.gif.MMWXGFJNI", method2 != null ? method2.getDeclaringClass().getClassLoader() : C2095f.class.getClassLoader()), "nativeWxamToGif", byte[].class);
                    if (methodFindDeclaredMethod != null && KavaReflector.isStatic(methodFindDeclaredMethod) && methodFindDeclaredMethod.getReturnType() == byte[].class) {
                        this.f7003d = KavaReflector.accessible(methodFindDeclaredMethod);
                    }
                } catch (Throwable th2) {
                    m5209j("定位WXAM转换方法失败: " + th2.getMessage());
                }
                method = (Method) this.f7003d;
            }
        }
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = KavaReflector.invoke(method, null, bArr);
            if (objInvoke instanceof byte[]) {
                return (byte[]) objInvoke;
            }
            return null;
        } catch (Throwable th3) {
            m5209j("转换WXAM表情失败: " + th3.getMessage());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] m5203c(String str) {
        byte[] bArr;
        Object objInvoke;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        byte[] bArrM5216r = m5216r(file);
        if (m5196i(bArrM5216r)) {
            return bArrM5216r;
        }
        String strM5197k = m5197k(str);
        if (TextUtils.isEmpty(strM5197k) && file.isFile()) {
            strM5197k = m5197k(file.getName());
        }
        try {
        } catch (Throwable th2) {
            m5209j("解码表情数据失败: " + th2.getMessage());
        }
        if (!TextUtils.isEmpty(strM5197k)) {
            Object objM5207g = m5207g(strM5197k);
            DexFinder dexFinder = (DexFinder) this.f7001b;
            Method method = dexFinder.emojiDecodeDataMethod;
            Method method2 = dexFinder.emojiDecodeManagerGetterMethod;
            if (objM5207g == null || method == null || method2 == null || (objInvoke = KavaReflector.invoke(method2, null, new Object[0])) == null) {
                bArr = null;
                if (bArr != null && bArr.length > 0) {
                    byte[] bArrM5202b = m5202b(bArr);
                    return (bArrM5202b != null || bArrM5202b.length <= 0) ? bArr : bArrM5202b;
                }
            } else {
                Object objInvoke2 = KavaReflector.invoke(method, objInvoke, objM5207g);
                if (objInvoke2 instanceof byte[]) {
                    bArr = (byte[]) objInvoke2;
                }
                if (bArr != null) {
                    byte[] bArrM5202b2 = m5202b(bArr);
                    if (bArrM5202b2 != null) {
                    }
                }
            }
            if (bArrM5216r == null && bArrM5216r.length > 0) {
                return bArrM5216r;
            }
        }
        byte[] bArrM5216r2 = m5216r(new File(m5217t(str)));
        if (bArrM5216r2 != null && bArrM5216r2.length > 0) {
            byte[] bArrM5202b3 = m5202b(bArrM5216r2);
            return (bArrM5202b3 == null || bArrM5202b3.length <= 0) ? bArrM5216r2 : bArrM5202b3;
        }
        return bArrM5216r == null ? null : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public String m5204d(String str, String str2, String str3) {
        Method method = ((DexFinder) this.f7001b).emojiFilePathMethod;
        if (method == null) {
            return AbstractC0255e.m1020i(str, str3);
        }
        Object objInvoke = KavaReflector.invoke(method, null, str, str2, str3);
        return objInvoke instanceof String ? (String) objInvoke : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public String m5205e(File file) {
        int i9;
        FileInputStream fileInputStream = null;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = fileInputStream2.read(bArr);
                    if (i10 <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i10);
                }
                byte[] bArrDigest = messageDigest.digest();
                StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
                for (byte b10 : bArrDigest) {
                    int i11 = b10 & 255;
                    if (i11 < 16) {
                        sb2.append('0');
                    }
                    sb2.append(Integer.toHexString(i11));
                }
                String string = sb2.toString();
                try {
                    fileInputStream2.close();
                } catch (Throwable unused) {
                }
                return string;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                try {
                    m5209j("计算表情md5失败: " + th.getMessage());
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                } catch (Throwable th3) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[EDGE_INSN: B:27:0x0078->B:9:0x0028 BREAK  A[LOOP:0: B:17:0x0045->B:57:?]] */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC4316l m5206f(C4309e c4309e, Object obj, boolean z9) {
        InterfaceC4316l interfaceC4316l;
        C4309e c4309e2;
        C3129b c3129b = (C3129b) this.f7001b;
        if (this.f7000a) {
            C4309e c4309eM8715f = c4309e;
            C4325u c4325u = c4309eM8715f.f14371k;
            boolean z10 = true;
            if (obj instanceof Integer) {
                Integer num = (Integer) obj;
                String str = (String) ((HashMap) this.f7003d).get(num);
                if (str != null && (c4309e2 = c4325u.f14454t) != null) {
                    String[] strArrSplit = str.split("/", 2);
                    if (strArrSplit.length != 2) {
                        c4311g = null;
                        if (c4311g != null) {
                            return c4311g;
                        }
                    } else {
                        String str2 = strArrSplit[0];
                        String str3 = strArrSplit[1];
                        Iterator it = c4309e2.f14382v.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                c4309e2.m6382K("Not found resource field with id: " + num + ", name: " + str.replace('/', '.'));
                                break;
                            }
                            C4309e c4309e3 = (C4309e) it.next();
                            if (c4309e3.f14373m.f10139h.equals(str2)) {
                                for (C4311g c4311g : c4309e3.f14381u) {
                                    if (c4311g.f14390l.f10147h.equals(str3)) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (c4311g != null) {
                        }
                    }
                }
            }
            HashSet hashSet = c3129b.f10145b;
            ConcurrentHashMap concurrentHashMap = c3129b.f10144a;
            if (!hashSet.contains(obj) && !concurrentHashMap.containsKey(obj)) {
                z10 = false;
            }
            if (!z10 || z9) {
                while (c4309eM8715f != null) {
                    C3129b c3129b2 = (C3129b) ((HashMap) this.f7002c).get(c4309eM8715f);
                    if (c3129b2 == null || (interfaceC4316l = (InterfaceC4316l) c3129b2.f10144a.get(obj)) == null) {
                        C3128a c3128a = c4309eM8715f.f14373m.f10142k;
                        if (c3128a == null) {
                            break;
                        }
                        c4309eM8715f = c4325u.m8715f(c3128a);
                    } else if (!z10) {
                        return interfaceC4316l;
                    }
                }
                if (z9) {
                    return (InterfaceC4316l) concurrentHashMap.get(obj);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public Object m5207g(String str) {
        Method method = ((DexFinder) this.f7001b).emojiGetByMd5Method;
        if (method == null) {
            return m5215q(str);
        }
        Object objM5200A = m5200A(method);
        if (!KavaReflector.isStatic(method) && objM5200A == null) {
            return m5215q(str);
        }
        Object objInvoke = KavaReflector.invoke(method, objM5200A, str);
        return objInvoke != null ? objInvoke : m5215q(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public boolean m5208h(String str) {
        Method method = ((DexFinder) this.f7001b).emojiCheckGifMethod;
        if (method != null) {
            try {
                Object objM5200A = m5200A(method);
                if (KavaReflector.isStatic(method) || objM5200A != null) {
                    Object objInvoke = KavaReflector.invoke(method, objM5200A, str);
                    if (objInvoke instanceof Boolean) {
                        return ((Boolean) objInvoke).booleanValue();
                    }
                }
            } catch (Throwable th2) {
                m5209j("检测GIF失败: " + th2.getMessage());
            }
        }
        Boolean boolValueOf = null;
        if (!TextUtils.isEmpty(str)) {
            Bundle bundle = new Bundle();
            bundle.putString("key_path", str);
            Bundle bundleM5214p = m5214p("checkGifFile", bundle);
            if (bundleM5214p != null) {
                boolValueOf = Boolean.valueOf(bundleM5214p.getBoolean("key_data", false));
            }
        }
        return boolValueOf != null ? boolValueOf.booleanValue() : str != null && str.toLowerCase().endsWith(".gif");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m5209j(String str) {
        C2005i.m4939f("[WeChatEmojiApi] ".concat(str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public String m5210l() {
        Method method = ((DexFinder) this.f7001b).emojiAccPathMethod;
        if (method == null) {
            return m5213o();
        }
        Object objM5200A = m5200A(method);
        if (!KavaReflector.isStatic(method) && objM5200A == null) {
            return m5213o();
        }
        Object objInvoke = KavaReflector.invoke(method, objM5200A, new Object[0]);
        if (!(objInvoke instanceof String)) {
            return m5213o();
        }
        String str = (String) objInvoke;
        return TextUtils.isEmpty(str) ? m5213o() : str.endsWith("/") ? str : str.concat("/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void mo5211m(int i9, int i10) {
        Object[] objArr = (Object[]) this.f7001b;
        Object obj = objArr[i9];
        objArr[i9] = objArr[i10];
        objArr[i10] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: all -> 0x023c, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x023c, blocks: (B:11:0x003b, B:20:0x0058, B:26:0x006d), top: B:158:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019c  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m5212n(File file, String str) {
        Object obj;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        File parentFile;
        File file2;
        Object parcelable;
        String str2;
        Object obj2;
        Object obj3;
        DexFinder dexFinder = (DexFinder) this.f7001b;
        String strM5210l = m5210l();
        if (TextUtils.isEmpty(strM5210l)) {
            m5209j("发表情失败: 获取微信表情目录失败");
            return null;
        }
        String strM5204d = m5204d(strM5210l, HttpUrl.FRAGMENT_ENCODE_SET, str);
        if (TextUtils.isEmpty(strM5204d)) {
            m5209j("发表情失败: 获取微信表情目标路径失败");
            return null;
        }
        File file3 = new File(strM5204d);
        try {
            parentFile = file3.getParentFile();
        } catch (Throwable th2) {
            th = th2;
            obj = null;
            fileInputStream = null;
            fileOutputStream = null;
        }
        if (parentFile != null) {
            try {
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                fileOutputStream = null;
                obj = null;
                try {
                    m5209j("复制表情文件异常: " + th.getMessage());
                    if (fileInputStream != null) {
                    }
                    if (fileOutputStream != null) {
                    }
                    m5209j("发表情失败: 复制到微信表情目录失败 ".concat(strM5204d));
                    return obj;
                } finally {
                }
            }
            if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                obj = null;
                m5209j("发表情失败: 复制到微信表情目录失败 ".concat(strM5204d));
                return obj;
            }
        }
        if (file3.isFile()) {
            if (file3.length() == file.length()) {
                file2 = file;
            } else {
                file2 = file;
                fileInputStream = new FileInputStream(file2);
                try {
                    fileOutputStream = new FileOutputStream(file3, false);
                    try {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i9 = fileInputStream.read(bArr);
                            if (i9 <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i9);
                        }
                        fileOutputStream.flush();
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused) {
                        }
                        try {
                            fileOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        obj = null;
                        m5209j("复制表情文件异常: " + th.getMessage());
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable unused3) {
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused4) {
                            }
                        }
                        m5209j("发表情失败: 复制到微信表情目录失败 ".concat(strM5204d));
                        return obj;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    obj = null;
                    fileOutputStream = null;
                }
            }
            int i10 = m5208h(file2.getAbsolutePath()) ? 2 : 1;
            long length = file2.length();
            int i11 = length <= 0 ? 0 : length > 2147483647L ? Integer.MAX_VALUE : (int) length;
            Method method = dexFinder.emojiCreateInfoMethod;
            if (method != null) {
                Object objM5200A = m5200A(method);
                if ((!KavaReflector.isStatic(method) && objM5200A == null) || (parcelable = KavaReflector.invoke(method, objM5200A, str, 0, Integer.valueOf(i10), Integer.valueOf(i11))) == null) {
                    if (TextUtils.isEmpty(str)) {
                        parcelable = null;
                    } else {
                        Bundle bundle = new Bundle();
                        bundle.putString("key_md5", str);
                        bundle.putInt("key_group", 0);
                        bundle.putInt("key_type", i10);
                        bundle.putInt("key_size", i11);
                        Bundle bundleM5214p = m5214p("createEmojiInfo", bundle);
                        if (bundleM5214p != null) {
                            try {
                                Method method2 = dexFinder.emojiSendMethod;
                                bundleM5214p.setClassLoader(method2 != null ? method2.getDeclaringClass().getClassLoader() : C2095f.class.getClassLoader());
                            } catch (Throwable unused5) {
                            }
                            parcelable = bundleM5214p.getParcelable("key_emoji_info");
                        }
                    }
                }
            }
            int i12 = i10;
            int i13 = i11;
            if (parcelable == null) {
                str2 = "field_catalog";
            } else {
                try {
                    m5199z(parcelable, "field_md5", str);
                    m5199z(parcelable, "field_catalog", 0);
                    str2 = "field_catalog";
                    try {
                        m5199z(parcelable, "field_type", Integer.valueOf(i12));
                        m5199z(parcelable, "field_size", Integer.valueOf(i13));
                        m5199z(parcelable, "field_start", 0);
                        m5199z(parcelable, "field_state", 0);
                        m5199z(parcelable, "field_needupload", 1);
                        m5199z(parcelable, "field_groupId", HttpUrl.FRAGMENT_ENCODE_SET);
                        m5199z(parcelable, "field_width", 320);
                        m5199z(parcelable, "field_height", 320);
                        m5199z(parcelable, "field_temp", 1);
                    } catch (Throwable th6) {
                        th = th6;
                        m5209j("准备本地表情信息失败: " + th.getMessage());
                    }
                } catch (Throwable th7) {
                    th = th7;
                    str2 = "field_catalog";
                }
            }
            Method method3 = dexFinder.emojiUpdateInfoMethod;
            if (method3 == null || parcelable == null) {
                obj2 = parcelable;
            } else {
                try {
                    Object objM5200A2 = m5200A(method3);
                    if (KavaReflector.isStatic(method3) || objM5200A2 != null) {
                        obj2 = parcelable;
                        try {
                            KavaReflector.invoke(method3, objM5200A2, obj2);
                        } catch (Throwable th8) {
                            th = th8;
                            m5209j("更新本地表情信息失败: " + th.getMessage());
                        }
                    }
                } catch (Throwable th9) {
                    th = th9;
                    obj2 = parcelable;
                }
            }
            try {
                Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(dexFinder.emojiSendMethod.getParameterTypes()[1], String.class), strM5210l);
                m5199z(objNewInstance, "field_md5", str);
                m5199z(objNewInstance, str2, 65);
                m5199z(objNewInstance, "field_type", Integer.valueOf(i12));
                m5199z(objNewInstance, "field_size", Integer.valueOf(i13));
                m5199z(objNewInstance, "field_start", 0);
                m5199z(objNewInstance, "field_state", 0);
                m5199z(objNewInstance, "field_groupId", HttpUrl.FRAGMENT_ENCODE_SET);
                m5199z(objNewInstance, "field_name", HttpUrl.FRAGMENT_ENCODE_SET);
                m5199z(objNewInstance, "field_content", HttpUrl.FRAGMENT_ENCODE_SET);
                m5199z(objNewInstance, "field_reserved4", 0);
                m5199z(objNewInstance, "field_temp", 1);
                obj3 = objNewInstance;
            } catch (Throwable unused6) {
                obj3 = null;
            }
            Object obj4 = obj3 != null ? obj3 : obj2;
            if (obj4 == null) {
                m5209j("发表情失败: 创建临时EmojiInfo失败 ".concat(str));
            }
            return obj4;
        }
        m5209j("发表情失败: 复制到微信表情目录失败 ".concat(strM5204d));
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public String m5213o() {
        Bundle bundleM5214p = m5214p("getAccPath", null);
        if (bundleM5214p == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = bundleM5214p.getString("path", HttpUrl.FRAGMENT_ENCODE_SET);
        return TextUtils.isEmpty(string) ? HttpUrl.FRAGMENT_ENCODE_SET : string.endsWith("/") ? string : string.concat("/");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public Bundle m5214p(String str, Bundle bundle) {
        Context context = (Context) this.f7002c;
        try {
            return context.getContentResolver().call(Uri.parse("content://" + context.getPackageName() + ".storage.provider.emotion/"), str, (String) null, bundle);
        } catch (Throwable th2) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("EmotionProvider调用失败: ", str, " ");
            sbM1026o.append(th2.getMessage());
            m5209j(sbM1026o.toString());
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public Parcelable m5215q(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("key_md5", str);
        Bundle bundleM5214p = m5214p("getEmojiByMd5", bundle);
        if (bundleM5214p == null) {
            return null;
        }
        try {
            Method method = ((DexFinder) this.f7001b).emojiSendMethod;
            bundleM5214p.setClassLoader(method != null ? method.getDeclaringClass().getClassLoader() : C2095f.class.getClassLoader());
        } catch (Throwable unused) {
        }
        return bundleM5214p.getParcelable("key_emoji_info");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public byte[] m5216r(File file) {
        FileInputStream fileInputStream;
        if (file.isFile() && file.length() > 0 && file.length() <= 2147483647L) {
            try {
                int length = (int) file.length();
                byte[] bArr = new byte[length];
                fileInputStream = new FileInputStream(file);
                int i9 = 0;
                while (i9 < length) {
                    try {
                        int i10 = fileInputStream.read(bArr, i9, length - i9);
                        if (i10 < 0) {
                            break;
                        }
                        i9 += i10;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            m5209j("读取表情文件失败: " + th.getMessage());
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused) {
                                }
                            }
                            return null;
                        } catch (Throwable th3) {
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            throw th3;
                        }
                    }
                }
                if (i9 == length) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused3) {
                    }
                    return bArr;
                }
                byte[] bArr2 = new byte[i9];
                System.arraycopy(bArr, 0, bArr2, 0, i9);
                try {
                    fileInputStream.close();
                } catch (Throwable unused4) {
                }
                return bArr2;
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public String m5217t(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.isFile() && file.length() > 0) {
                return file.getAbsolutePath();
            }
            String strM5197k = m5197k(str);
            if (!TextUtils.isEmpty(strM5197k)) {
                try {
                    String strM5210l = m5210l();
                    if (!TextUtils.isEmpty(strM5210l)) {
                        String strM5204d = m5204d(strM5210l, HttpUrl.FRAGMENT_ENCODE_SET, strM5197k);
                        if (!TextUtils.isEmpty(strM5204d)) {
                            File file2 = new File(strM5204d);
                            if (file2.isFile() && file2.length() > 0) {
                                return file2.getAbsolutePath();
                            }
                        }
                        Object objM5207g = m5207g(strM5197k);
                        String strM5198s = objM5207g != null ? m5198s(objM5207g, "getGroupId", "field_groupId") : HttpUrl.FRAGMENT_ENCODE_SET;
                        if (!TextUtils.isEmpty(strM5198s)) {
                            File file3 = new File(m5204d(strM5210l, strM5198s, strM5197k));
                            if (file3.isFile() && file3.length() > 0) {
                                return file3.getAbsolutePath();
                            }
                        }
                    }
                } catch (Throwable th2) {
                    m5209j("解析表情文件路径失败: " + th2.getMessage());
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public void m5218u(int i9, int i10) {
        int iCompare;
        int iCompare2;
        Comparator comparator = (Comparator) this.f7002c;
        Object[] objArr = (Object[]) this.f7001b;
        if (i10 <= i9) {
            return;
        }
        int i11 = ((i10 - i9) / 2) + i9;
        Object obj = objArr[i11];
        this.f7003d = obj;
        if (i9 == i11) {
            Object obj2 = objArr[i10];
            if ((obj != obj2 ? comparator.compare(obj2, obj) : 0) < 0) {
                mo5211m(i9, i10);
                this.f7000a = true;
                return;
            }
            return;
        }
        int i12 = i9;
        int i13 = i10;
        while (i12 <= i13) {
            while (true) {
                Object obj3 = objArr[i12];
                Object obj4 = this.f7003d;
                iCompare = obj4 == obj3 ? 0 : comparator.compare(obj3, obj4);
                if (iCompare >= 0) {
                    break;
                } else {
                    i12++;
                }
            }
            while (true) {
                Object obj5 = objArr[i13];
                Object obj6 = this.f7003d;
                iCompare2 = obj6 == obj5 ? 0 : comparator.compare(obj5, obj6);
                if (iCompare2 <= 0) {
                    break;
                } else {
                    i13--;
                }
            }
            if (i12 <= i13) {
                if (i12 != i13 && (iCompare > 0 || iCompare2 < 0)) {
                    mo5211m(i12, i13);
                    this.f7000a = true;
                }
                i12++;
                i13--;
            }
        }
        if (i9 < i13) {
            m5218u(i9, i13);
        }
        if (i12 < i10) {
            m5218u(i12, i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public boolean m5219v(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            m5209j("发表情失败: talker/emoji为空");
            return false;
        }
        if (!m5201a()) {
            m5209j("发表情失败: API未就绪");
            return false;
        }
        try {
            File file = new File(str2);
            if (file.isFile()) {
                return m5222y(file, str);
            }
            String strM5197k = m5197k(str2);
            if (TextUtils.isEmpty(strM5197k)) {
                m5209j("发表情失败: 不是有效md5，且文件不存在");
                return false;
            }
            Object objM5207g = m5207g(strM5197k);
            if (objM5207g != null) {
                if (m5220w(str, strM5197k)) {
                    return true;
                }
                return m5221x(objM5207g, str);
            }
            m5209j("发表情失败: 微信表情库不存在 " + strM5197k);
            return false;
        } catch (Throwable th2) {
            m5209j("发表情异常: " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public boolean m5220w(String str, String str2) {
        Context context = (Context) this.f7002c;
        Method method = ((DexFinder) this.f7001b).emojiManagerSendMethod;
        if (method != null && !TextUtils.isEmpty(str2)) {
            try {
                Object objM5200A = m5200A(method);
                if (KavaReflector.isStatic(method) || objM5200A != null) {
                    Object objInvoke = KavaReflector.invoke(method, objM5200A, context, str, str2, m5195B(method.getParameterTypes()[3]), 0);
                    if (objInvoke instanceof Boolean) {
                        if (((Boolean) objInvoke).booleanValue()) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th2) {
                m5209j("原生表情管理发送失败: " + th2.getMessage());
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public boolean m5221x(Object obj, String str) {
        Method method = ((DexFinder) this.f7001b).emojiSendMethod;
        Object objM5200A = m5200A(method);
        if (!KavaReflector.isStatic(method) && objM5200A == null) {
            m5209j("发表情失败: 无法创建发送器 ".concat(method.getDeclaringClass().getName()));
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i9 = 0; i9 < parameterTypes.length; i9++) {
            Class<?> cls = parameterTypes[i9];
            if (i9 == 0 && cls == String.class) {
                objArr[i9] = str;
            } else if (i9 == 1 && cls.isInstance(obj)) {
                objArr[i9] = obj;
            } else if (cls == Long.TYPE || cls == Long.class) {
                objArr[i9] = 0L;
            } else if (cls == Integer.TYPE || cls == Integer.class) {
                objArr[i9] = 0;
            } else if (cls == Boolean.TYPE || cls == Boolean.class) {
                objArr[i9] = Boolean.FALSE;
            } else if (cls == String.class) {
                objArr[i9] = HttpUrl.FRAGMENT_ENCODE_SET;
            } else if (i9 == 3) {
                objArr[i9] = m5195B(cls);
            } else {
                objArr[i9] = null;
            }
        }
        KavaReflector.invoke(method, objM5200A, objArr);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public boolean m5222y(File file, String str) {
        if (!m5201a()) {
            m5209j("发表情失败: 本地路径API未就绪");
            return false;
        }
        String strM5205e = m5205e(file);
        if (TextUtils.isEmpty(strM5205e)) {
            m5209j("发表情失败: 计算本地文件md5失败");
            return false;
        }
        try {
            Object objM5207g = m5207g(strM5205e);
            if (objM5207g == null) {
                objM5207g = m5212n(file, strM5205e);
            }
            if (objM5207g == null) {
                return false;
            }
            if (m5220w(str, strM5205e)) {
                return true;
            }
            return m5221x(objM5207g, str);
        } catch (Throwable th2) {
            m5209j("发表情本地路径异常: " + th2.getMessage());
            return false;
        }
    }

    public C2095f() {
        this.f7001b = new Object();
        this.f7002c = new ArrayList();
        this.f7003d = new ArrayList();
        this.f7000a = true;
    }

    public C2095f(Context context, DexFinder dexFinder, C2002f c2002f) {
        this.f7002c = context;
        this.f7001b = dexFinder;
    }

    public C2095f(Object[] objArr, int i9, Comparator comparator) {
        this.f7001b = objArr;
        this.f7002c = comparator;
    }

    public C2095f(C3816b0 c3816b0, C4401j1 c4401j1, InterfaceC3814a1 interfaceC3814a1) {
        this.f7001b = c3816b0;
        this.f7002c = c4401j1;
        this.f7003d = interfaceC3814a1;
        this.f7000a = true;
    }
}
