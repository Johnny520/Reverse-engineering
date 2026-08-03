package p108ha;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p011ab.C0042b;
import p027c0.C0361f;
import p036c9.C0456k1;
import p062e8.C0828b;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1231l;
import p086fh.C1253k;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p258r8.C3742g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: ha.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1659s {

    /* JADX INFO: renamed from: i */
    public static final C3147k f5452i = new C3147k("\\$\\{(?:originalText|time|type|snsId|userName)\\}");

    /* JADX INFO: renamed from: a */
    public final C3742g f5453a;

    /* JADX INFO: renamed from: b */
    public final C0042b f5454b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f5455c;

    /* JADX INFO: renamed from: d */
    public final SharedPreferences f5456d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f5457e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f5458f;

    /* JADX INFO: renamed from: g */
    public volatile boolean f5459g;

    /* JADX INFO: renamed from: h */
    public final ThreadLocal f5460h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1659s(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5453a = c3742g;
        this.f5454b = c0042b;
        Context context = c3742g.f12143a;
        this.f5455c = AbstractC4302b.m8640c(context, "Hchat_moments_bottom_detail_config");
        this.f5456d = AbstractC4302b.m8640c(context, "Hchat_moments_bottom_detail_method_cache");
        this.f5460h = ThreadLocal.withInitial(new C1656p(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m4229a(C1659s c1659s, Object obj, String str) {
        Long lM4236o;
        Object c3959f;
        String str2;
        EnumC1637d0 enumC1637d0;
        SharedPreferences sharedPreferences = c1659s.f5455c;
        if (obj == null || (lM4236o = m4236o(obj, "field_snsId")) == null) {
            return str;
        }
        long jLongValue = lM4236o.longValue();
        Object field = KavaReflector.readField(obj, "field_userName");
        String string = field != null ? field.toString() : null;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Long lM4236o2 = m4236o(obj, "field_createTime");
        long jLongValue2 = lM4236o2 != null ? lM4236o2.longValue() : 0L;
        Long lM4236o3 = m4236o(obj, "field_type");
        int iLongValue = lM4236o3 != null ? (int) lM4236o3.longValue() : 0;
        if (jLongValue2 <= 0) {
            str2 = str;
        } else {
            String string2 = sharedPreferences.getString("moments_bottom_detail_time_format", "yyyy-MM-dd HH:mm:ss");
            if (string2 == null) {
                string2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string3 = AbstractC3149m.m6703R0(string2).toString();
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AbstractC3149m.m6721t0(string3) ? "yyyy-MM-dd HH:mm:ss" : string3, Locale.CHINA);
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                c3959f = simpleDateFormat.format(new Date(jLongValue2 * 1000));
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (C3960g.m8182b(c3959f) != null) {
                c3959f = str;
            }
            str2 = (String) c3959f;
        }
        C3958e c3958e = new C3958e("${originalText}", str);
        C3958e c3958e2 = new C3958e("${time}", str2);
        EnumC1637d0.f5368h.getClass();
        if (iLongValue == 1) {
            enumC1637d0 = EnumC1637d0.IMAGE;
        } else if (iLongValue == 2) {
            enumC1637d0 = EnumC1637d0.TEXT;
        } else if (iLongValue == 15) {
            enumC1637d0 = EnumC1637d0.VIDEO;
        } else if (iLongValue != 54) {
            enumC1637d0 = EnumC1637d0.UNKNOWN;
        }
        Map mapM8439b0 = AbstractC4178y.m8439b0(c3958e, c3958e2, new C3958e("${type}", enumC1637d0.f5374g), new C3958e("${snsId}", Long.toUnsignedString(jLongValue)), new C3958e("${userName}", string));
        String string4 = sharedPreferences.getString("moments_bottom_detail_text_format", "${originalText} | ${time}");
        if (string4 != null) {
            str3 = string4;
        }
        String string5 = AbstractC3149m.m6703R0(str3).toString();
        return f5452i.m6684e(AbstractC3149m.m6721t0(string5) ? "${originalText} | ${time}" : string5, new C0456k1(mapM8439b0, 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m4230c(Class cls) {
        return (KavaReflector.findFieldRecursive(cls, "field_snsId") == null || KavaReflector.findFieldRecursive(cls, "field_userName") == null || KavaReflector.findFieldRecursive(cls, "field_createTime") == null || KavaReflector.findFieldRecursive(cls, "field_type") == null) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m4231d(Method method) {
        if (KavaReflector.isAbstract(method) || method.getDeclaringClass().isInterface()) {
            return false;
        }
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        return parameterTypes.length == 0 && AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m4232e(Class cls, Method method) {
        if (KavaReflector.isStatic(method) || KavaReflector.isAbstract(method) || method.getDeclaringClass().isInterface() || method.getParameterCount() != 0) {
            return false;
        }
        return (AbstractC1416l.m3825a(method.getReturnType(), Boolean.TYPE) || AbstractC1416l.m3825a(method.getReturnType(), Boolean.class)) && method.getDeclaringClass().isAssignableFrom(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m4233f(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !KavaReflector.isStatic(method) && !KavaReflector.isAbstract(method) && !method.getDeclaringClass().isInterface() && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 3 && TextView.class.isAssignableFrom(parameterTypes[0]) && TextView.class.isAssignableFrom(parameterTypes[1]) && AbstractC1416l.m3825a(parameterTypes[2], Long.TYPE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m4234g(Class cls, Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return (KavaReflector.isStatic(method) || KavaReflector.isAbstract(method) || method.getDeclaringClass().isInterface() || parameterTypes.length != 1 || !AbstractC1416l.m3825a(parameterTypes[0], Integer.TYPE) || method.getReturnType().isPrimitive() || AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) || !cls.isAssignableFrom(method.getDeclaringClass())) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m4235h(Method method) {
        if (KavaReflector.isStatic(method) || KavaReflector.isAbstract(method) || method.getDeclaringClass().isInterface() || method.getParameterCount() != 0 || !AbstractC1416l.m3825a(method.getReturnType(), String.class)) {
            return false;
        }
        Class<?> declaringClass = method.getDeclaringClass();
        declaringClass.getClass();
        return m4230c(declaringClass);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Long m4236o(Object obj, String str) {
        Object field = KavaReflector.readField(obj, str);
        if (field == null) {
            return null;
        }
        Number number = field instanceof Number ? (Number) field : null;
        return number != null ? Long.valueOf(number.longValue()) : AbstractC3156t.m6743g0(field.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final Method m4237b(C1253k c1253k, InterfaceC1231l interfaceC1231l) {
        Object c3959f;
        Object next;
        Object c3959f2;
        C3742g c3742g = this.f5453a;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            ArrayList arrayList = new ArrayList();
            Iterator it = c1731pFindMethod.iterator();
            while (it.hasNext()) {
                try {
                    c3959f2 = ((C1730o) it.next()).m4350r(c3742g.f12145c);
                } catch (Throwable th2) {
                    c3959f2 = new C3959f(th2);
                }
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                Method method = (Method) c3959f2;
                if (method != null) {
                    arrayList.add(method);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (((Boolean) interfaceC1231l.invoke(next)).booleanValue()) {
                    break;
                }
            }
            c3959f = (Method) next;
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f5454b.invoke("朋友圈底部详情 DexKit 定位失败", thM8182b);
        }
        return (Method) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final Method m4238i() {
        String strM4243n = m4243n();
        ClassLoader classLoader = this.f5453a.f12145c;
        SharedPreferences sharedPreferences = this.f5456d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4243n, classLoader, "flutter_profile_switch");
        if (methodM2087c != null) {
            if (!m4231d(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1253k c1253k = new C1253k();
        c1253k.m3374r0("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        Method methodM4237b = m4237b(c1253k, new C0361f(1, this, AbstractC0921a.m2246i(C1659s.class), "isFlutterProfileSwitchMethod", "isFlutterProfileSwitchMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 15));
        if (methodM4237b != null) {
            C0828b.m2092h(sharedPreferences, strM4243n, "flutter_profile_switch", methodM4237b);
            return methodM4237b;
        }
        C0828b.m2085a(sharedPreferences, strM4243n, "flutter_profile_switch");
        return methodM4237b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final Method m4239j(Class cls) {
        String strM4243n = m4243n();
        ClassLoader classLoader = this.f5453a.f12145c;
        SharedPreferences sharedPreferences = this.f5456d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4243n, classLoader, "group_method");
        if (methodM2087c != null) {
            if (!m4232e(cls, methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1253k c1253k = new C1253k();
        c1253k.m3370m0(0);
        c1253k.m3374r0("getShowGroupEnable");
        Method methodM4237b = m4237b(c1253k, new C1657q(this, cls, 0));
        if (methodM4237b != null) {
            C0828b.m2092h(sharedPreferences, strM4243n, "group_method", methodM4237b);
            return methodM4237b;
        }
        C0828b.m2085a(sharedPreferences, strM4243n, "group_method");
        this.f5454b.invoke("朋友圈底部详情未找到可见范围方法", null);
        return methodM4237b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final Method m4240k() {
        String strM4243n = m4243n();
        ClassLoader classLoader = this.f5453a.f12145c;
        SharedPreferences sharedPreferences = this.f5456d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4243n, classLoader, "profile_formatter_method");
        if (methodM2087c != null) {
            if (!m4233f(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1253k c1253k = new C1253k();
        c1253k.m3374r0("cerateTimeView", "formatTimeInGrid");
        Method methodM4237b = m4237b(c1253k, new C0361f(1, this, AbstractC0921a.m2246i(C1659s.class), "isProfileFormatterMethod", "isProfileFormatterMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 16));
        if (methodM4237b != null) {
            C0828b.m2092h(sharedPreferences, strM4243n, "profile_formatter_method", methodM4237b);
            return methodM4237b;
        }
        C0828b.m2085a(sharedPreferences, strM4243n, "profile_formatter_method");
        this.f5454b.invoke("朋友圈底部详情未找到个人主页时间方法", null);
        return methodM4237b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Method m4241l(Class cls) {
        String strM4243n = m4243n();
        ClassLoader classLoader = this.f5453a.f12145c;
        SharedPreferences sharedPreferences = this.f5456d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4243n, classLoader, "profile_item_method");
        if (methodM2087c != null) {
            if (!m4234g(cls, methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1253k c1253k = new C1253k();
        c1253k.m3374r0("getItem", "com.tencent.mm.plugin.sns.ui.SnsSelfAdapter");
        Method methodM4237b = m4237b(c1253k, new C1657q(this, cls, 1));
        if (methodM4237b != null) {
            C0828b.m2092h(sharedPreferences, strM4243n, "profile_item_method", methodM4237b);
            return methodM4237b;
        }
        C0828b.m2085a(sharedPreferences, strM4243n, "profile_item_method");
        this.f5454b.invoke("朋友圈底部详情未找到个人主页条目方法", null);
        return methodM4237b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final Method m4242m() {
        String strM4243n = m4243n();
        ClassLoader classLoader = this.f5453a.f12145c;
        SharedPreferences sharedPreferences = this.f5456d;
        Method methodM2087c = C0828b.m2087c(sharedPreferences, strM4243n, classLoader, "time_method");
        if (methodM2087c != null) {
            if (!m4235h(methodM2087c)) {
                methodM2087c = null;
            }
            if (methodM2087c != null) {
                return methodM2087c;
            }
        }
        C1253k c1253k = new C1253k();
        C1253k.m3366q0(c1253k, "java.lang.String");
        c1253k.m3370m0(0);
        c1253k.m3374r0("getTimeString");
        Method methodM4237b = m4237b(c1253k, new C0361f(1, this, AbstractC0921a.m2246i(C1659s.class), "isTimeMethod", "isTimeMethod(Ljava/lang/reflect/Method;)Z", 0, 0, 17));
        if (methodM4237b != null) {
            C0828b.m2092h(sharedPreferences, strM4243n, "time_method", methodM4237b);
            return methodM4237b;
        }
        C0828b.m2085a(sharedPreferences, strM4243n, "time_method");
        this.f5454b.invoke("朋友圈底部详情未找到时间方法", null);
        return methodM4237b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final String m4243n() {
        C3742g c3742g = this.f5453a;
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        classLoader.getClass();
        return C3087k.m6557a(context, classLoader).f8202h;
    }
}
