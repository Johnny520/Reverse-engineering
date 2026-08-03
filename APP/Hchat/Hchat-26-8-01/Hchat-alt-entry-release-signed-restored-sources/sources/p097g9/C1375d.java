package p097g9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.alibaba.fastjson2.JSONB;
import de.robv.android.xposed.XC_MethodHook;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.HttpUrl;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p218og.AbstractC3137a;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p258r8.C3744i;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: g9.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1375d {

    /* JADX INFO: renamed from: g */
    public static final C3147k f4563g = new C3147k("[0-9a-fA-F]{32}");

    /* JADX INFO: renamed from: h */
    public static final byte[] f4564h = {-119, 80, JSONB.Constants.BC_STR_ASCII_FIX_5, JSONB.Constants.BC_INT32_SHORT_MAX, 13, 10, 26, 10};

    /* JADX INFO: renamed from: a */
    public final C3742g f4565a;

    /* JADX INFO: renamed from: b */
    public final C0042b f4566b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f4567c;

    /* JADX INFO: renamed from: d */
    public final Handler f4568d;

    /* JADX INFO: renamed from: e */
    public final Set f4569e;

    /* JADX INFO: renamed from: f */
    public final Map f4570f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1375d(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f4565a = c3742g;
        this.f4566b = c0042b;
        this.f4567c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_emoji_save_config");
        this.f4568d = new Handler(Looper.getMainLooper());
        this.f4569e = AbstractC2091b.m5168o();
        this.f4570f = AbstractC3199a.m6843p();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static Number m3743c(Object obj, String str, String str2, String str3) {
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, str, new Object[0]);
        Number number = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
        if (number != null) {
            return number;
        }
        Object field = KavaReflector.readField(obj, str2);
        Number number2 = field instanceof Number ? (Number) field : null;
        if (number2 != null) {
            return number2;
        }
        Object field2 = KavaReflector.readField(obj, str3);
        if (field2 instanceof Number) {
            return (Number) field2;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m3744d(Object obj, String str, String str2, String str3) {
        String string;
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, str, new Object[0]);
        if (objInvokeMethod != null && (string = objInvokeMethod.toString()) != null) {
            return string;
        }
        Object field = KavaReflector.readField(obj, str2);
        if (field != null) {
            return field.toString();
        }
        Object field2 = KavaReflector.readField(obj, str3);
        String string2 = field2 != null ? field2.toString() : null;
        return string2 != null ? string2 : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m3745e(int i9, Object obj, Set set) {
        Object field;
        Object objM3745e;
        if (obj != null && i9 <= 5 && set.add(obj)) {
            Number numberM3743c = m3743c(obj, "getMsgId", "field_msgId", "msgId");
            if (numberM3743c == null) {
                Object objInvokeMethod = KavaReflector.invokeMethod(obj, "getMsgID", new Object[0]);
                numberM3743c = objInvokeMethod instanceof Number ? (Number) objInvokeMethod : null;
            }
            if (AbstractC0921a.m2263z("com.tencent.mm.storage.", obj, false) && numberM3743c != null) {
                if (numberM3743c.longValue() > 0) {
                    return obj;
                }
            }
            if (obj instanceof View) {
                return m3745e(i9 + 1, ((View) obj).getTag(), set);
            }
            if (obj instanceof Object[]) {
                for (Object obj2 : (Object[]) obj) {
                    Object objM3745e2 = m3745e(i9 + 1, obj2, set);
                    if (objM3745e2 != null) {
                        return objM3745e2;
                    }
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Object objM3745e3 = m3745e(i9 + 1, it.next(), set);
                    if (objM3745e3 != null) {
                        return objM3745e3;
                    }
                }
            } else {
                String name = obj.getClass().getName();
                if (!AbstractC3156t.m6740d0(name, "java.", false) && !AbstractC3156t.m6740d0(name, "android.", false)) {
                    for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        for (Field field2 : KavaReflector.declaredFields(superclass)) {
                            if (!field2.getType().isPrimitive() && !AbstractC1416l.m3825a(field2.getType(), String.class) && (field = KavaReflector.readField(field2, obj)) != null && (objM3745e = m3745e(i9 + 1, field, set)) != null) {
                                return objM3745e;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m3746f(File file, byte[] bArr) {
        Object c3959f;
        try {
            boolean z9 = false;
            FileOutputStream fileOutputStream = new FileOutputStream(file, false);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                if (file.isFile() && file.length() == bArr.length) {
                    z9 = true;
                }
                c3959f = Boolean.valueOf(z9);
            } finally {
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            file.delete();
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final File m3747a(byte[] bArr) {
        Object c3959f;
        String str;
        C3742g c3742g = this.f4565a;
        Context applicationContext = c3742g.f12143a.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = c3742g.f12143a;
        }
        try {
            Object[] externalMediaDirs = applicationContext.getExternalMediaDirs();
            if (externalMediaDirs != null) {
                int length = externalMediaDirs.length;
                for (int i9 = 0; i9 < length; i9++) {
                    c3959f = externalMediaDirs[i9];
                    if (c3959f != null) {
                        break;
                    }
                }
                c3959f = null;
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        File file = (File) c3959f;
        if (file == null) {
            file = new File(AbstractC4855en.m9263g("/storage/emulated/0/Android/media/", applicationContext.getPackageName()));
        }
        File file2 = new File(new File(file, "Hchat"), "Emoji");
        if (!file2.isDirectory() && !file2.mkdirs()) {
            return null;
        }
        String str2 = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS", Locale.US).format(new Date());
        int length2 = bArr.length;
        if (length2 >= 6 && AbstractC4156d0.m8355W("GIF87a", "GIF89a").contains(new String(bArr, 0, 6, AbstractC3137a.f10178b))) {
            str = ".gif";
        } else if (length2 >= 8 && Arrays.equals(AbstractC4165l.m8385t0(bArr, 0, 8), f4564h)) {
            str = ".png";
        } else if (length2 >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) {
            str = ".jpg";
        } else if (length2 >= 12) {
            Charset charset = AbstractC3137a.f10178b;
            str = (new String(bArr, 0, 4, charset).equals("RIFF") && new String(bArr, 8, 4, charset).equals("WEBP")) ? ".webp" : ".bin";
        }
        return new File(file2, AbstractC0921a.m2251n("Hchat_emoji_", str2, str));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m3748b(Method method, XC_MethodHook xC_MethodHook) {
        Object c3959f;
        if (Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) {
            return false;
        }
        Set set = this.f4569e;
        if (!set.add(method)) {
            return true;
        }
        try {
            C3744i c3744i = C3744i.f12154b;
            Method methodAccessible = KavaReflector.accessible(method);
            if (methodAccessible == null) {
                methodAccessible = method;
            }
            c3744i.m7763b(methodAccessible, xC_MethodHook);
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            set.remove(method);
            this.f4566b.invoke("保存表情菜单 Hook 安装失败: " + method.toGenericString(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }
}
