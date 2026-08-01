package p000;

import android.app.Activity;
import android.app.Application;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XC_MethodHook;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import com.p001mr.elaris.xposedcompat.XposedHelpers;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: v4 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0497v4 {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a6 A[Catch: all -> 0x0151, TRY_ENTER, TryCatch #1 {all -> 0x0151, blocks: (B:82:0x0148, B:89:0x0156, B:91:0x015e, B:93:0x0166, B:95:0x016e, B:97:0x0176, B:99:0x017c, B:105:0x01a6, B:107:0x01a9, B:109:0x01b3, B:111:0x01b9), top: B:190:0x0148 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[Catch: all -> 0x008b, TryCatch #8 {all -> 0x008b, blocks: (B:25:0x005e, B:27:0x0066, B:29:0x006e, B:31:0x0074, B:33:0x007a, B:35:0x0082, B:40:0x008d, B:42:0x0093, B:44:0x0099, B:46:0x009f, B:50:0x00a9), top: B:204:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0101  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1074A(ClassLoader classLoader) {
        String str;
        int i;
        int i2;
        String[] strArrM1005f;
        int i3;
        int length;
        int i4;
        String[] strArrM1005f2;
        int i5;
        String[] strArr;
        String[] strArr2;
        int i6;
        int i7;
        String lowerCase;
        ClassLoader classLoader2 = classLoader;
        String[] strArr3 = AbstractC0538xd.f1070a;
        String str2 = "";
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Void.TYPE;
        int i8 = 1;
        try {
            Class clsM1008i = AbstractC0463t2.m1008i(classLoader2, "target.unread_full.qui_badge_class", "com.tencent.mobileqq.quibadge.QUIBadge");
            if (clsM1008i == null) {
                str = "";
                i2 = 0;
            } else {
                Method[] declaredMethods = clsM1008i.getDeclaredMethods();
                int length2 = declaredMethods.length;
                int i9 = 0;
                i2 = 0;
                while (i9 < length2) {
                    Method method = declaredMethods[i9];
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    String name = method.getName();
                    i = 0;
                    try {
                        if (method.getReturnType() == cls2 && parameterTypes.length == i8 && parameterTypes[0] == cls && !Modifier.isAbstract(method.getModifiers())) {
                            String lowerCase2 = name == null ? str2 : name.toLowerCase();
                            str = str2;
                            if (!"updateNum".equals(name)) {
                                try {
                                    if ("setNum".equals(name) || "setGrayNum".equals(name) || "w".equals(name) || lowerCase2.contains("updatenum") || lowerCase2.contains("setnum") || lowerCase2.contains("setgraynum")) {
                                        if (AbstractC0538xd.m1145e(method)) {
                                            XposedBridge.hookMethod(method, new C0490ud("updateNum".equals(name) || "w".equals(name) || lowerCase2.contains("updatenum")));
                                            i2++;
                                            AbstractC0463t2.m1015p("target.unread_full.qui_badge_class", clsM1008i.getName());
                                            m1076C("hooked QUIBadge full unread count: " + m1078E(method));
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    AbstractC0000a.m2c("hookQUIBadgeUnreadFull failed: ", th);
                                    i2 = i;
                                    strArrM1005f = AbstractC0463t2.m1005f("target.unread_full.rolling_text_classes", AbstractC0538xd.f1072c, classLoader2);
                                    i3 = i;
                                    int i10 = i3;
                                    while (i3 < strArrM1005f.length) {
                                    }
                                    int i11 = i2 + i10;
                                    String[] strArrM1005f3 = AbstractC0463t2.m1005f("target.unread_full.mini_widget_classes", AbstractC0538xd.f1071b, classLoader2);
                                    length = strArrM1005f3.length;
                                    i4 = i;
                                    int i12 = i4;
                                    while (i4 < length) {
                                    }
                                    int i13 = i11 + i12;
                                    strArrM1005f2 = AbstractC0463t2.m1005f("target.unread_full.mini_aio_classes", AbstractC0538xd.f1070a, classLoader2);
                                    i5 = i;
                                    int i14 = i5;
                                    while (i5 < strArrM1005f2.length) {
                                    }
                                    m1076C("early full unread count hooks installed count=" + (i13 + i14));
                                }
                            }
                        } else {
                            str = str2;
                        }
                        i9++;
                        str2 = str;
                        i8 = 1;
                    } catch (Throwable th2) {
                        th = th2;
                        str = str2;
                    }
                }
                str = str2;
            }
            i = 0;
        } catch (Throwable th3) {
            th = th3;
            str = str2;
            i = 0;
        }
        strArrM1005f = AbstractC0463t2.m1005f("target.unread_full.rolling_text_classes", AbstractC0538xd.f1072c, classLoader2);
        i3 = i;
        int i102 = i3;
        while (i3 < strArrM1005f.length) {
            String str3 = strArrM1005f[i3];
            try {
                Class clsM1091j = m1091j(classLoader2, str3);
                if (clsM1091j != null) {
                    Method[] declaredMethods2 = clsM1091j.getDeclaredMethods();
                    int length3 = declaredMethods2.length;
                    int i15 = i;
                    while (i15 < length3) {
                        try {
                            Method method2 = declaredMethods2[i15];
                            if (Modifier.isAbstract(method2.getModifiers()) || method2.getReturnType() != cls2) {
                                strArr2 = strArrM1005f;
                                i6 = i3;
                                i7 = i102;
                            } else {
                                Class<?>[] parameterTypes2 = method2.getParameterTypes();
                                if (method2.getName() == null) {
                                    strArr2 = strArrM1005f;
                                    lowerCase = str;
                                } else {
                                    strArr2 = strArrM1005f;
                                    lowerCase = method2.getName().toLowerCase();
                                }
                                i6 = i3;
                                try {
                                    i7 = i102;
                                    if (parameterTypes2.length == 1) {
                                        try {
                                            Class<?> cls3 = parameterTypes2[i];
                                            if (cls3 == cls || cls3 == Integer.class) {
                                                if (lowerCase.contains("num") || lowerCase.contains("count") || lowerCase.contains("unread") || "settext".equals(lowerCase)) {
                                                    if (AbstractC0538xd.m1145e(method2)) {
                                                        XposedBridge.hookMethod(method2, new C0506vd(55));
                                                        i102 = i7 + 1;
                                                        try {
                                                            AbstractC0538xd.m1142b("target.unread_full.rolling_text_classes", clsM1091j);
                                                            m1076C("hooked RollingTextView full unread count int: " + m1078E(method2));
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            m1076C("hookRollingTextViewUnreadFull failed " + str3 + ": " + th);
                                                            i3 = i6 + 1;
                                                            strArrM1005f = strArr2;
                                                        }
                                                    }
                                                } else if (parameterTypes2.length > 0 && CharSequence.class.isAssignableFrom(parameterTypes2[i]) && AbstractC0538xd.m1145e(method2)) {
                                                    XposedBridge.hookMethod(method2, new C0522wd(45));
                                                    i102 = i7 + 1;
                                                    AbstractC0538xd.m1142b("target.unread_full.rolling_text_classes", clsM1091j);
                                                    m1076C("hooked RollingTextView full unread count text: " + m1078E(method2));
                                                }
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            i102 = i7;
                                        }
                                    }
                                    i15++;
                                    i3 = i6;
                                    strArrM1005f = strArr2;
                                } catch (Throwable th6) {
                                    th = th6;
                                    m1076C("hookRollingTextViewUnreadFull failed " + str3 + ": " + th);
                                    i3 = i6 + 1;
                                    strArrM1005f = strArr2;
                                }
                            }
                            i102 = i7;
                            i15++;
                            i3 = i6;
                            strArrM1005f = strArr2;
                        } catch (Throwable th7) {
                            th = th7;
                            strArr2 = strArrM1005f;
                            i6 = i3;
                        }
                    }
                }
                strArr2 = strArrM1005f;
                i6 = i3;
            } catch (Throwable th8) {
                th = th8;
                strArr2 = strArrM1005f;
                i6 = i3;
            }
            i3 = i6 + 1;
            strArrM1005f = strArr2;
        }
        int i112 = i2 + i102;
        String[] strArrM1005f32 = AbstractC0463t2.m1005f("target.unread_full.mini_widget_classes", AbstractC0538xd.f1071b, classLoader2);
        length = strArrM1005f32.length;
        i4 = i;
        int i122 = i4;
        while (i4 < length) {
            String str4 = strArrM1005f32[i4];
            try {
                Class clsM1091j2 = m1091j(classLoader2, str4);
                if (clsM1091j2 != null) {
                    Method[] declaredMethods3 = clsM1091j2.getDeclaredMethods();
                    int length4 = declaredMethods3.length;
                    for (int i16 = i; i16 < length4; i16++) {
                        Method method3 = declaredMethods3[i16];
                        if (!Modifier.isAbstract(method3.getModifiers())) {
                            int iM1144d = AbstractC0538xd.m1144d(str4, method3);
                            if (iM1144d > 0) {
                                AbstractC0538xd.m1142b("target.unread_full.mini_widget_classes", clsM1091j2);
                            }
                            i122 += iM1144d;
                        }
                    }
                }
            } catch (Throwable th9) {
                m1076C("hookMiniWidgetUnreadFull failed " + str4 + ": " + th9);
            }
            i4++;
        }
        int i132 = i112 + i122;
        strArrM1005f2 = AbstractC0463t2.m1005f("target.unread_full.mini_aio_classes", AbstractC0538xd.f1070a, classLoader2);
        i5 = i;
        int i142 = i5;
        while (i5 < strArrM1005f2.length) {
            String str5 = strArrM1005f2[i5];
            try {
                Class clsM1091j3 = m1091j(classLoader2, str5);
                if (clsM1091j3 != null) {
                    Method[] declaredMethods4 = clsM1091j3.getDeclaredMethods();
                    int length5 = declaredMethods4.length;
                    int i17 = i;
                    while (i17 < length5) {
                        Method method4 = declaredMethods4[i17];
                        Class<?>[] parameterTypes3 = method4.getParameterTypes();
                        strArr = strArrM1005f2;
                        try {
                            if ("updateUnreadCount".equals(method4.getName()) && method4.getReturnType() == cls2 && parameterTypes3.length == 2 && parameterTypes3[i] == cls) {
                                try {
                                    if (parameterTypes3[1] == Boolean.TYPE && !Modifier.isAbstract(method4.getModifiers()) && AbstractC0538xd.m1145e(method4)) {
                                        XposedBridge.hookMethod(method4, new C0442rd(50));
                                        i142++;
                                        AbstractC0538xd.m1142b("target.unread_full.mini_aio_classes", clsM1091j3);
                                        m1076C("hooked miniAIO full unread count: " + m1078E(method4));
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    m1076C("hookMiniAioUnreadFull failed " + str5 + ": " + th);
                                    i5++;
                                    classLoader2 = classLoader;
                                    strArrM1005f2 = strArr;
                                }
                            }
                            i17++;
                            strArrM1005f2 = strArr;
                        } catch (Throwable th11) {
                            th = th11;
                            m1076C("hookMiniAioUnreadFull failed " + str5 + ": " + th);
                            i5++;
                            classLoader2 = classLoader;
                            strArrM1005f2 = strArr;
                        }
                    }
                }
                strArr = strArrM1005f2;
            } catch (Throwable th12) {
                th = th12;
                strArr = strArrM1005f2;
            }
            i5++;
            classLoader2 = classLoader;
            strArrM1005f2 = strArr;
        }
        m1076C("early full unread count hooks installed count=" + (i132 + i142));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m1075B() {
        if (AbstractC0539xe.f1078a) {
            return;
        }
        AbstractC0539xe.f1078a = true;
        int i = 0;
        try {
            int i2 = 0;
            for (Method method : Instrumentation.class.getDeclaredMethods()) {
                try {
                    if ("execStartActivity".equals(method.getName()) && !Modifier.isAbstract(method.getModifiers()) && m1094m(method, Intent.class) >= 0) {
                        XposedBridge.hookMethod(method, new C0523we(60));
                        i2++;
                        m1076C("hooked web redirect guards: " + m1078E(method));
                    }
                } catch (Throwable th) {
                    m1076C("hookWebRedirectGuards instrumentation failed: " + th);
                    m1076C("web redirect guards installed count=" + i2);
                }
            }
            i = i2;
        } catch (Throwable unused) {
        }
        m1076C("web redirect guards installed count=" + i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static void m1076C(String str) {
        if (HookEntry.shouldLogMessage(str)) {
            XposedBridge.log("Elaris: ".concat(str));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m1077D(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        return lowerCase.endsWith(".apk") || lowerCase.endsWith(".apk.1") || lowerCase.contains(".apk?");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static String m1078E(Method method) {
        return method.getDeclaringClass().getName() + "." + method.getName() + Arrays.toString(method.getParameterTypes());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static void m1079F(View view, int i, int i2) {
        if (view == null || i <= 0 || i2 < 0) {
            return;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (AbstractC0260i5.m525E0(textView.getText()) || AbstractC0260i5.m671y0(textView)) {
                AbstractC0538xd.m1146f(textView, i);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 24);
            for (int i3 = 0; i3 < iMin; i3++) {
                m1079F(viewGroup.getChildAt(i3), i, i2 - 1);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static void m1080G(XC_MethodHook.MethodHookParam methodHookParam, Class cls) {
        if (cls == null || cls == Void.TYPE) {
            methodHookParam.setResult(null);
            return;
        }
        if (cls == Boolean.TYPE) {
            methodHookParam.setResult(Boolean.FALSE);
            return;
        }
        if (cls == Byte.TYPE) {
            methodHookParam.setResult((byte) 0);
            return;
        }
        if (cls == Short.TYPE) {
            methodHookParam.setResult((short) 0);
            return;
        }
        if (cls == Character.TYPE) {
            methodHookParam.setResult((char) 0);
            return;
        }
        if (cls == Integer.TYPE) {
            methodHookParam.setResult(0);
            return;
        }
        if (cls == Long.TYPE) {
            methodHookParam.setResult(0L);
            return;
        }
        if (cls == Float.TYPE) {
            methodHookParam.setResult(Float.valueOf(0.0f));
        } else if (cls == Double.TYPE) {
            methodHookParam.setResult(Double.valueOf(0.0d));
        } else {
            methodHookParam.setResult(null);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m1081H(Object obj, String str) {
        if (str == null) {
            str = "";
        }
        if (str.contains("aio") || str.contains("contact") || str.contains("peer") || str.contains("uin") || str.contains("uid") || str.contains("troop") || str.contains("group") || str.contains("guild")) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        String lowerCase = obj.getClass().getName().toLowerCase();
        return lowerCase.contains("aio") || lowerCase.contains("contact") || lowerCase.contains("troop") || lowerCase.contains("group") || lowerCase.contains("guild");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1082a(StringBuilder sb, String str, String str2) {
        String processName;
        sb.append(str);
        sb.append(" trace");
        sb.append("\nprocess=");
        String strValueOf = "unknown";
        try {
            processName = Application.getProcessName();
        } catch (Throwable unused) {
        }
        if (processName != null) {
            if (processName.length() > 0) {
                strValueOf = processName;
            } else {
                try {
                    Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentProcessName", null);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(null, null);
                    if (objInvoke != null) {
                        strValueOf = String.valueOf(objInvoke);
                    }
                } catch (Throwable unused2) {
                }
            }
        }
        sb.append(strValueOf);
        sb.append("\nthread=");
        sb.append(Thread.currentThread().getName());
        sb.append("\nhook=");
        sb.append(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1083b(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(63);
        if (iIndexOf >= 0) {
            str = str.substring(0, iIndexOf);
        }
        int iMax = Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
        return iMax >= 0 ? str.substring(iMax + 1) : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m1084c(Object obj, int i, Set set, int[] iArr) {
        int i2;
        boolean z;
        if (obj != null && i <= 3 && (i2 = iArr[0]) < 12) {
            boolean z2 = true;
            if ((obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Enum)) {
                iArr[0] = i2 + 1;
                return String.valueOf(obj);
            }
            if (set == null || set.add(obj)) {
                StringBuilder sb = new StringBuilder();
                String name = obj.getClass().getName();
                if (name.toLowerCase().contains("aio") || name.toLowerCase().contains("contact") || name.toLowerCase().contains("troop") || name.toLowerCase().contains("group")) {
                    sb.append(name);
                    sb.append('{');
                    sb.append(AbstractC0260i5.m565R1(obj));
                    sb.append('}');
                    iArr[0] = iArr[0] + 1;
                }
                if (obj instanceof View) {
                    return sb.toString();
                }
                Class<?> superclass = obj.getClass();
                while (superclass != null && superclass != Object.class && iArr[0] < 12) {
                    Field[] declaredFields = superclass.getDeclaredFields();
                    int length = declaredFields.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            z = z2;
                            break;
                        }
                        Field field = declaredFields[i3];
                        if (!Modifier.isStatic(field.getModifiers())) {
                            String lowerCase = field.getName() == null ? "" : field.getName().toLowerCase();
                            if (m1081H(null, lowerCase) || lowerCase.contains("type")) {
                                try {
                                    field.setAccessible(z2);
                                    Object obj2 = field.get(obj);
                                    z = z2;
                                    if (sb.length() > 0) {
                                        try {
                                            sb.append("; ");
                                        } catch (Throwable unused) {
                                            continue;
                                        }
                                    }
                                    sb.append(field.getName());
                                    sb.append('=');
                                    sb.append(AbstractC0260i5.m575V(obj2, 0, AbstractC0260i5.m624i1()));
                                    iArr[0] = iArr[0] + 1;
                                    String strM1084c = m1084c(obj2, i + 1, set, iArr);
                                    if (strM1084c.length() > 0) {
                                        sb.append("; ");
                                        sb.append(strM1084c);
                                    }
                                    if (iArr[0] >= 12) {
                                        break;
                                    }
                                } catch (Throwable unused2) {
                                    z = z2;
                                }
                                i3++;
                            } else {
                                z = z2;
                                i3++;
                            }
                        }
                        z2 = z;
                    }
                    superclass = superclass.getSuperclass();
                    z2 = z;
                }
                return sb.toString();
            }
        }
        return "";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m1085d(View view, StringBuilder sb, int i, int[] iArr) {
        TextView textView;
        CharSequence text;
        if (view == null || i > 7) {
            return;
        }
        if (iArr[0] >= 10) {
            return;
        }
        if ((view instanceof TextView) && (text = (textView = (TextView) view).getText()) != null) {
            String strTrim = text.toString().trim();
            if (strTrim.length() != 0 && (strTrim.matches("\\d+") || AbstractC0260i5.m525E0(strTrim))) {
                String lowerCase = textView.getClass().getName().toLowerCase();
                if (AbstractC0260i5.m671y0(textView) || lowerCase.contains("badge") || lowerCase.contains("unread")) {
                    if (sb.length() > 0) {
                        sb.append(" | ");
                    }
                    sb.append(AbstractC0260i5.m535H1(text, 80));
                    iArr[0] = iArr[0] + 1;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int iMin = Math.min(viewGroup.getChildCount(), 40);
            for (int i2 = 0; i2 < iMin; i2++) {
                m1085d(viewGroup.getChildAt(i2), sb, i + 1, iArr);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m1086e(String str, String[] strArr) {
        if (str != null && strArr != null) {
            for (String str2 : strArr) {
                if (str2 != null && str2.length() > 0 && str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m1087f(ViewGroup viewGroup) {
        String[] strArr = {"添加标签", "编辑个签", "通知", "相册", "收藏", "文件", "钱包", "会员中心", "个性装扮", "免流量", "设置", "夜间"};
        for (int i = 0; i < 12; i++) {
            if (AbstractC0260i5.m560Q(viewGroup, strArr[i], 0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m1088g(Context context) {
        Activity activityM594b = AbstractC0260i5.m594b(context);
        if (activityM594b == null) {
            try {
                activityM594b = HookEntry.topActivity();
            } catch (Throwable unused) {
            }
        }
        return activityM594b == null ? "unknown" : activityM594b.getClass().getName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m1089h(String str) {
        String strDecode;
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < 3) {
            try {
                strDecode = URLDecoder.decode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            if (strDecode == null || strDecode.equals(str)) {
                break;
            }
            i++;
            str = strDecode;
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static int m1090i(View view, float f) {
        try {
            return (int) TypedValue.applyDimension(1, f, view.getResources().getDisplayMetrics());
        } catch (Throwable unused) {
            return (int) f;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Class m1091j(ClassLoader classLoader, String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC0513w4.f995a;
        try {
            return XposedHelpers.findClass(str, classLoader);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:71:0x00df */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:77:0x0089 */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: java.lang.reflect.Field */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: java.lang.reflect.Field[] */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
    
        if ((r12 instanceof java.lang.Number) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
    
        r0 = ((java.lang.Number) r12).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ca, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1092k(Object obj, Set set, int i, String... strArr) {
        Object tag;
        int iM1092k;
        Object obj2 = obj;
        if (obj2 != null && i <= 4 && set != null && set.add(obj2) && !(obj2 instanceof CharSequence) && !(obj2 instanceof Number) && !(obj2 instanceof Boolean) && !(obj2 instanceof Enum)) {
            boolean z = obj2 instanceof View;
            if (z) {
                try {
                    tag = ((View) obj2).getTag();
                } catch (Throwable unused) {
                    tag = null;
                }
                int iM1092k2 = m1092k(tag, set, i + 1, strArr);
                if (iM1092k2 != Integer.MIN_VALUE) {
                    return iM1092k2;
                }
                try {
                    String lowerCase = ((View) obj2).getClass().getName().toLowerCase(Locale.ROOT);
                    if (lowerCase.contains("com.tencent.aio") || lowerCase.contains("com.tencent.mobileqq.aio")) {
                        Class<?> superclass = obj2.getClass();
                        ?? r0 = obj2;
                        while (superclass != null && superclass != Object.class && (!z || !superclass.getName().startsWith("android.view."))) {
                            Field[] declaredFields = superclass.getDeclaredFields();
                            int length = declaredFields.length;
                            int i2 = 0;
                            ?? IntValue = r0;
                            while (i2 < length) {
                                Field field = declaredFields[i2];
                                try {
                                    if (Modifier.isStatic(field.getModifiers())) {
                                        continue;
                                    } else {
                                        String lowerCase2 = field.getName() == null ? "" : field.getName().toLowerCase();
                                        field.setAccessible(true);
                                        Object obj3 = field.get(IntValue);
                                        if (lowerCase2 != null) {
                                            int length2 = strArr.length;
                                            int i3 = 0;
                                            while (true) {
                                                if (i3 < length2) {
                                                    String str = strArr[i3];
                                                    if (str != null && lowerCase2.equals(str.toLowerCase())) {
                                                        break;
                                                    }
                                                    i3++;
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        if (i < 4 && m1081H(obj3, lowerCase2) && (iM1092k = m1092k(obj3, set, i + 1, strArr)) != Integer.MIN_VALUE) {
                                            return iM1092k;
                                        }
                                    }
                                } catch (Throwable unused2) {
                                }
                                i2++;
                                IntValue = IntValue;
                            }
                            superclass = superclass.getSuperclass();
                            r0 = IntValue;
                        }
                    } else if (lowerCase.contains("drawerframeviewgroup")) {
                    }
                } catch (Throwable unused3) {
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static Object m1093l(Object obj, String str, int i) {
        if (obj == null || i < 0) {
            return null;
        }
        if (str.equals(obj.getClass().getName())) {
            return obj;
        }
        if ((obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean)) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                try {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                        field.setAccessible(true);
                        Object objM1093l = m1093l(field.get(obj), str, i - 1);
                        if (objM1093l != null) {
                            return objM1093l;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static int m1094m(Method method, Class cls) {
        ConcurrentHashMap concurrentHashMap = AbstractC0513w4.f995a;
        Class<?>[] parameterTypes = method.getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (cls.isAssignableFrom(parameterTypes[i])) {
                return i;
            }
        }
        return -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static View m1095n(View view, int i, int[] iArr) {
        if (view == null || i > 12) {
            return null;
        }
        int i2 = iArr[0];
        if (i2 > 260) {
            return null;
        }
        iArr[0] = i2 + 1;
        boolean z = view instanceof ViewGroup;
        if (z && AbstractC0260i5.m560Q(view, "编辑个签", 0) && ((AbstractC0260i5.m560Q(view, "添加标签", 0) || AbstractC0260i5.m554O(view, 0)) && view.getWidth() > m1090i(view, 240.0f) && view.getHeight() > m1090i(view, 160.0f))) {
            return view;
        }
        if (!z) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int iMin = Math.min(viewGroup.getChildCount(), 80);
        for (int i3 = 0; i3 < iMin; i3++) {
            View viewM1095n = m1095n(viewGroup.getChildAt(i3), i + 1, iArr);
            if (viewM1095n != null) {
                return viewM1095n;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static TextView m1096o(int i, Object obj) {
        if (obj == null || i < 0) {
            return null;
        }
        if (obj instanceof TextView) {
            return (TextView) obj;
        }
        if (obj instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) obj;
            int iMin = Math.min(viewGroup.getChildCount(), 24);
            for (int i2 = 0; i2 < iMin; i2++) {
                TextView textViewM1096o = m1096o(i - 1, viewGroup.getChildAt(i2));
                if (textViewM1096o != null) {
                    return textViewM1096o;
                }
            }
        }
        if ((obj instanceof View) || (obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean)) {
            return null;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                try {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                        field.setAccessible(true);
                        TextView textViewM1096o2 = m1096o(i - 1, field.get(obj));
                        if (textViewM1096o2 != null) {
                            return textViewM1096o2;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0062 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #2 {all -> 0x006f, blocks: (B:11:0x0017, B:13:0x0023, B:15:0x0027, B:17:0x002e, B:20:0x0039, B:34:0x0062, B:25:0x0046, B:27:0x004e, B:29:0x0056), top: B:43:0x000e }] */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m1097p(Object obj) {
        boolean z;
        if (obj == null) {
            return null;
        }
        Object objM1119b = AbstractC0513w4.m1119b(obj, "msgRecord");
        if (objM1119b != null) {
            return objM1119b;
        }
        try {
            try {
                return XposedHelpers.callMethod(obj, "getMsgRecord", new Object[0]);
            } catch (Throwable unused) {
                for (Method method : obj.getClass().getDeclaredMethods()) {
                    if (method != null && method.getParameterTypes().length == 0 && !Modifier.isAbstract(method.getModifiers())) {
                        Class<?> returnType = method.getReturnType();
                        if (returnType == null) {
                            z = false;
                            if (!z) {
                                method.setAccessible(true);
                                Object objInvoke = method.invoke(obj, null);
                                if (objInvoke != null) {
                                    return objInvoke;
                                }
                            }
                        } else {
                            try {
                                String name = returnType.getName();
                                if ("com.tencent.qqnt.kernel.nativeinterface.MsgRecord".equals(name) || "com.tencent.qqnt.kernelpublic.nativeinterface.MsgRecord".equals(name) || name.endsWith(".MsgRecord")) {
                                    z = true;
                                }
                            } catch (Throwable unused2) {
                            }
                            if (!z) {
                            }
                        }
                    }
                }
                return null;
            }
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m1098q(Object obj) {
        try {
            if (obj instanceof View) {
                View view = (View) obj;
                view.setVisibility(8);
                view.setAlpha(0.0f);
                view.setMinimumHeight(0);
                view.setMinimumWidth(0);
                view.setPadding(0, 0, 0, 0);
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = 0;
                    layoutParams.width = 0;
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(0, 0, 0, 0);
                    }
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        ((LinearLayout.LayoutParams) layoutParams).weight = 0.0f;
                    }
                    view.setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m1099r(ClassLoader classLoader) {
        try {
            boolean z = AbstractC0228g5.f306a;
            int iM432a = AbstractC0228g5.m432a(classLoader);
            if (iM432a == 0) {
                m1076C(z ? "allow forbid card hooks already installed" : "allow forbid card targets not found");
                return;
            }
            m1076C("allow forbid card hooks installed count=" + iM432a);
        } catch (Throwable th) {
            AbstractC0000a.m2c("hookAllowViewingCard failed: ", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static void m1100s(ClassLoader classLoader) {
        int i;
        Class clsM1091j;
        Class<?> cls = Void.TYPE;
        StringBuilder sb = new StringBuilder("annoying popup hooks installed count=");
        int i2 = 0;
        try {
            clsM1091j = m1091j(classLoader, "com.tencent.mobileqq.upgrade.ui.dialog.UpgradeActivity");
        } catch (Throwable th) {
            AbstractC0000a.m2c("hookUpgradeActivity failed: ", th);
        }
        if (clsM1091j == null) {
            i = 0;
        } else {
            C0519wa c0519wa = new C0519wa(80);
            i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if ("doOnCreate".equals(method.getName()) || "onCreate".equals(method.getName())) {
                    if (method.getReturnType() == cls && !Modifier.isAbstract(method.getModifiers())) {
                        XposedBridge.hookMethod(method, c0519wa);
                        i++;
                        m1076C("hooked upgrade activity finish: " + m1078E(method));
                    }
                }
            }
        }
        try {
            Class clsM1091j2 = m1091j(classLoader, "com.tencent.mobileqq.haoliyou.JefsClass");
            Class clsM1091j3 = m1091j(classLoader, "com.tencent.mobileqq.utils.QQCustomDialog");
            if (clsM1091j2 != null && clsM1091j3 != null) {
                int i3 = 0;
                for (Method method2 : clsM1091j2.getDeclaredMethods()) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    if ("showDialog".equals(method2.getName()) && method2.getReturnType() == cls && parameterTypes.length == 2 && Activity.class.isAssignableFrom(parameterTypes[0]) && clsM1091j3.isAssignableFrom(parameterTypes[1])) {
                        method2.setAccessible(true);
                        XposedBridge.hookMethod(method2, new C0487ua(90));
                        i3++;
                        m1076C("hooked external app dialog precise: " + m1078E(method2));
                    }
                }
                i2 = i3;
            }
        } catch (Throwable th2) {
            AbstractC0000a.m2c("hookExternalAppLeaveDialog failed: ", th2);
        }
        sb.append(m1107z(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.MiniGameBannerProcessor", "updateBanner") + m1107z(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.GameMsgBoxBannerProcessor", "updateBanner") + m1107z(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerProcessor", "initBanner") + m1107z(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerProcessor", "showBanner") + m1107z(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerProcessor", "updateBanner") + AbstractC0535xa.m1139a(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.MiniGameBannerProcessor", "MiniGameBannerProcessor") + AbstractC0535xa.m1139a(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.GameMsgBoxBannerProcessor", "GameMsgBoxBannerProcessor") + AbstractC0535xa.m1139a(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerContainer", "VasADBannerContainer") + AbstractC0535xa.m1139a(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerLayout", "VasADBannerLayout") + AbstractC0535xa.m1139a(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerView", "VasADBannerView") + AbstractC0535xa.m1139a(classLoader, "com.tencent.mobileqq.activity.recent.bannerprocessor.VasADBannerProcessor", "VasADBannerProcessor") + i + i2);
        m1076C(sb.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static void m1101t(ClassLoader classLoader) {
        int i;
        int i2;
        Class<?> cls;
        String name;
        ThreadLocal threadLocal = AbstractC0545y4.f1088a;
        if (HookEntry.runtimeBool(Prefs.KEY_RENAME_APK_FILE) && !AbstractC0509w0.f985a) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            AbstractC0509w0.f985a = true;
            m1076C("apk Bundle/Intent name guard disabled on hot file/download paths");
            if (classLoader == null || AbstractC0509w0.f986b) {
                i = 0;
            } else {
                AbstractC0509w0.f986b = true;
                String[] strArr = {"com.tencent.qqnt.kernel.nativeinterface.FileElement", "com.tencent.qqnt.kernel.nativeinterface.FileInfo", "com.tencent.qqnt.kernel.nativeinterface.FileMsgInfo", "com.tencent.qqnt.kernel.nativeinterface.MsgElement", "com.tencent.qqnt.kernelpublic.nativeinterface.FileElement", "com.tencent.qqnt.kernelpublic.nativeinterface.FileInfo", "com.tencent.qqnt.kernelpublic.nativeinterface.FileMsgInfo", "com.tencent.qqnt.kernelpublic.nativeinterface.MsgElement"};
                int i3 = 0;
                for (int i4 = 0; i4 < 8; i4++) {
                    Class clsM1091j = m1091j(classLoader, strArr[i4]);
                    if (clsM1091j != null) {
                        try {
                            i2 = !XposedBridge.hookAllConstructors(clsM1091j, new C0477u0(18)).isEmpty() ? 1 : 0;
                        } catch (Throwable unused) {
                            i2 = 0;
                        }
                        for (Method method : clsM1091j.getDeclaredMethods()) {
                            if (method != null && !Modifier.isStatic(method.getModifiers()) && !Modifier.isAbstract(method.getModifiers())) {
                                Class<?>[] parameterTypes = method.getParameterTypes();
                                if (parameterTypes.length == 1 && (((cls = parameterTypes[0]) == String.class || cls == CharSequence.class || cls == File.class || cls == Uri.class) && (name = method.getName()) != null)) {
                                    String lowerCase = name.toLowerCase(Locale.ROOT);
                                    if (lowerCase.startsWith("set") || lowerCase.contains("file") || lowerCase.contains("path") || lowerCase.contains("name") || lowerCase.length() <= 3) {
                                        try {
                                            method.setAccessible(true);
                                            XposedBridge.hookMethod(method, new C0493v0(18));
                                            i2++;
                                        } catch (Throwable unused2) {
                                        }
                                    }
                                }
                            }
                        }
                        if (i2 > 0) {
                            m1076C("hooked apk risk file model: " + clsM1091j.getName() + " count=" + i2);
                        }
                        i3 += i2;
                    }
                }
                if (i3 == 0) {
                    m1076C("apk file model sanitizer targets not found");
                } else {
                    m1076C("apk file model sanitizer installed count=" + i3);
                }
                i = i3;
            }
            m1076C("apk file name guards installed count=" + i + ", apk dot one hook cost=" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x005a, TryCatch #0 {all -> 0x005a, blocks: (B:8:0x000d, B:11:0x0017, B:13:0x002a, B:15:0x0036, B:17:0x003d, B:19:0x004d, B:29:0x0065, B:31:0x006d, B:39:0x0092, B:33:0x0079, B:37:0x0081, B:24:0x005c, B:38:0x008a, B:40:0x0094, B:41:0x0097), top: B:52:0x000d }] */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1102u(ClassLoader classLoader) {
        if (AbstractC0044cb.f103a) {
            return;
        }
        int iM114a = 0;
        if (!AbstractC0044cb.f104b) {
            try {
                Class clsM1091j = m1091j(classLoader, "com.tencent.qqnt.kernel.nativeinterface.VASMsgAvatarPendant");
                if (clsM1091j != null) {
                    XposedBridge.hookAllConstructors(clsM1091j, new C0567za(80));
                    int i = 1;
                    for (Method method : clsM1091j.getDeclaredMethods()) {
                        if (!Modifier.isAbstract(method.getModifiers()) && method.getParameterTypes().length == 0) {
                            String name = method.getName();
                            Class<?> returnType = method.getReturnType();
                            if ("getPendantId".equals(name) || name.toLowerCase().contains("pendantid")) {
                                if (returnType == Long.TYPE || returnType == Long.class) {
                                    XposedBridge.hookMethod(method, new C0012ab(80));
                                } else if (("getPendantDiyInfoId".equals(name) || name.toLowerCase().contains("diyinfo")) && (returnType == Integer.TYPE || returnType == Integer.class)) {
                                    XposedBridge.hookMethod(method, new C0028bb(80));
                                }
                                i++;
                            }
                        }
                    }
                    m1076C("hooked avatar pendant data: " + clsM1091j.getName() + " count=" + i);
                    iM114a = i;
                }
            } catch (Throwable th) {
                AbstractC0000a.m2c("hookVASMsgAvatarPendant failed: ", th);
            }
            iM114a = AbstractC0044cb.m114a(classLoader, "com.tencent.mobileqq.vas.api.IVipDataUpdateApi$AvatarPendantInfo") + AbstractC0044cb.m114a(classLoader, "com.tencent.mobileqq.vas.pendant.drawable.interfaces.IPendantInfo") + AbstractC0044cb.m114a(classLoader, "com.tencent.mobileqq.vas.pendant.drawable.PendantInfo") + AbstractC0044cb.m114a(classLoader, "com.tencent.mobileqq.vas.PendantInfo") + iM114a;
            if (iM114a > 0) {
                AbstractC0044cb.f104b = true;
            }
        }
        m1076C("avatar pendant AIO UI hooks skipped for profile stability, dataHooks=" + iM114a);
        if (iM114a > 0) {
            AbstractC0044cb.f103a = true;
        }
        m1076C("avatar pendant hooks installed count=" + iM114a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static void m1103v(ClassLoader classLoader) {
        int i = 0;
        if (!AbstractC0256i1.f370a) {
            try {
                Class clsM1008i = AbstractC0463t2.m1008i(classLoader, "target.chat_right_swipe.drawer_class", "com.tencent.aio.frame.drawer.DrawerFrameViewGroup");
                if (clsM1008i == null) {
                    m1076C("DrawerFrameViewGroup not found for right swipe");
                } else {
                    HashSet hashSet = new HashSet();
                    int i2 = 0;
                    for (Method method : clsM1008i.getDeclaredMethods()) {
                        if (!Modifier.isAbstract(method.getModifiers())) {
                            Class<?>[] parameterTypes = method.getParameterTypes();
                            String name = method.getName();
                            String strM1078E = m1078E(method);
                            if (hashSet.add(strM1078E)) {
                                if (method.getReturnType() == Boolean.TYPE && parameterTypes.length == 2 && parameterTypes[0] == Float.TYPE && parameterTypes[1] == String.class) {
                                    XposedBridge.hookMethod(method, new C0240h1(80));
                                    i2++;
                                    AbstractC0463t2.m1015p("target.chat_right_swipe.drawer_class", clsM1008i.getName());
                                    m1076C("hooked drawer swipe judge: " + strM1078E);
                                } else if ((method.getReturnType() != Void.TYPE || parameterTypes.length != 1 || parameterTypes[0] != Integer.TYPE) && !"onTouchEvent".equals(name) && !"onInterceptTouchEvent".equals(name)) {
                                    "onScrollChanged".equals(name);
                                }
                            }
                        }
                    }
                    if (i2 == 0) {
                        m1076C("DrawerFrameViewGroup right-swipe targets not found");
                    }
                    i = i2;
                }
            } catch (Throwable th) {
                AbstractC0000a.m2c("hookDrawerFrameRightSwipe failed: ", th);
            }
            if (i > 0) {
                AbstractC0256i1.f370a = true;
            }
        }
        if (i <= 0) {
            if (AbstractC0256i1.f370a) {
                return;
            }
            m1076C("chat right-swipe targets not found");
        } else {
            m1076C("chat right-swipe hooks installed count=" + i + ", includeTroopGuild=false");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static void m1104w(ClassLoader classLoader) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        Class clsM1091j;
        Class clsM1091j2;
        int i6;
        int i7;
        Class clsM1091j3;
        if (AbstractC0301kb.f502a) {
            return;
        }
        AbstractC0301kb.f502a = true;
        int i8 = 0;
        if (AbstractC0301kb.f503b) {
            i5 = 0;
            i2 = 0;
        } else {
            AbstractC0301kb.f503b = true;
            try {
                clsM1091j3 = m1091j(classLoader, "com.tencent.mobileqq.profilecard.vas.VasProfileTemplateController");
            } catch (Throwable th) {
                AbstractC0000a.m2c("hookVasProfileTemplateController failed: ", th);
            }
            if (clsM1091j3 == null) {
                i = 0;
            } else {
                i = 0;
                for (Method method : clsM1091j3.getDeclaredMethods()) {
                    if (!Modifier.isAbstract(method.getModifiers())) {
                        boolean zEquals = "onCardUpdate".equals(method.getName());
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (parameterTypes.length > 0) {
                            String name = parameterTypes[0].getName();
                            if (!name.endsWith(".Card")) {
                                name.contains("ProfileCardInfo");
                            }
                        }
                        if (zEquals) {
                            XposedBridge.hookMethod(method, new C0285jb(80));
                            i++;
                        }
                    }
                }
                if (i > 0) {
                    m1076C("hooked DIY card controller: count=" + i);
                }
            }
            String[] strArr = {"com.tencent.mobileqq.profilecard.activity.FriendProfileCardActivity", "com.tencent.mobileqq.activity.FriendProfileCardActivity"};
            int i9 = 0;
            int i10 = 0;
            while (i9 < 2) {
                String str = strArr[i9];
                try {
                    Class clsM1091j4 = m1091j(classLoader, str);
                    if (clsM1091j4 != null) {
                        Method[] declaredMethods = clsM1091j4.getDeclaredMethods();
                        int length = declaredMethods.length;
                        i6 = i8;
                        while (i8 < length) {
                            try {
                                Method method2 = declaredMethods[i8];
                                if (Modifier.isStatic(method2.getModifiers()) || Modifier.isAbstract(method2.getModifiers()) || method2.getReturnType() != Void.TYPE) {
                                    i7 = i8;
                                } else {
                                    Class<?>[] parameterTypes2 = method2.getParameterTypes();
                                    i7 = i8;
                                    if (parameterTypes2.length >= 1 && parameterTypes2.length <= 2) {
                                        String name2 = parameterTypes2[i6].getName();
                                        if (name2.contains("ProfileCardInfo") || name2.endsWith(".Card") || parameterTypes2[i6].getSuperclass() == Object.class) {
                                            XposedBridge.hookMethod(method2, new C0186db(75));
                                            i10++;
                                        }
                                    }
                                }
                                i8 = i7 + 1;
                            } catch (Throwable th2) {
                                th = th2;
                                m1076C("hookFriendProfileCardActivityCardUpdate failed " + str + ": " + th);
                                i9++;
                                i8 = i6;
                            }
                        }
                    } else {
                        i6 = i8;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    i6 = i8;
                }
                i9++;
                i8 = i6;
            }
            i2 = i8;
            if (i10 > 0) {
                m1076C("hooked profile card activity updater count=" + i10);
            }
            int i11 = i + i10;
            try {
                clsM1091j2 = m1091j(classLoader, "com.tencent.mobileqq.profilecard.processor.TempProfileBusinessProcessor");
            } catch (Throwable th4) {
                AbstractC0000a.m2c("hookTempProfileBusinessProcessor failed: ", th4);
            }
            if (clsM1091j2 == null) {
                i3 = i2;
            } else {
                Class<?> clsM1091j5 = m1091j(classLoader, "com.tencent.mobileqq.data.Card");
                Method[] declaredMethods2 = clsM1091j2.getDeclaredMethods();
                int length2 = declaredMethods2.length;
                int i12 = i2;
                i3 = i12;
                while (i12 < length2) {
                    Method method3 = declaredMethods2[i12];
                    if ("updateCardTemplate".equals(method3.getName()) && !Modifier.isAbstract(method3.getModifiers())) {
                        Class<?>[] parameterTypes3 = method3.getParameterTypes();
                        if (parameterTypes3.length >= 1 && (clsM1091j5 == null || parameterTypes3[i2] == clsM1091j5)) {
                            XposedBridge.hookMethod(method3, new C0266ib(80));
                            i3++;
                        }
                    }
                    i12++;
                }
                if (i3 > 0) {
                    m1076C("hooked temp profile template count=" + i3);
                }
            }
            int i13 = i11 + i3;
            String[] strArr2 = {"com.tencent.mobileqq.profilecard.api.impl.ProfileDataServiceImpl", "com.tencent.mobileqq.profilecard.api.impl.ProfileProtocolServiceImpl"};
            int i14 = i2;
            int i15 = i14;
            while (i14 < 2) {
                String str2 = strArr2[i14];
                try {
                    Class clsM1091j6 = m1091j(classLoader, str2);
                    if (clsM1091j6 != null) {
                        Method[] declaredMethods3 = clsM1091j6.getDeclaredMethods();
                        int length3 = declaredMethods3.length;
                        for (int i16 = i2; i16 < length3; i16++) {
                            Method method4 = declaredMethods3[i16];
                            if (!Modifier.isAbstract(method4.getModifiers())) {
                                String strM1078E = m1078E(method4);
                                if (strM1078E.contains("com.tencent.mobileqq.data.Card") || strM1078E.contains("ProfileCardInfo")) {
                                    XposedBridge.hookMethod(method4, new C0250hb(70));
                                    i15++;
                                }
                            }
                        }
                    }
                } catch (Throwable th5) {
                    m1076C("hookProfileDataServiceCard failed " + str2 + ": " + th5);
                }
                i14++;
            }
            if (i15 > 0) {
                m1076C("hooked profile data card sanitizer count=" + i15);
            }
            int i17 = i13 + i15;
            String[] strArr3 = {"com.tencent.mobileqq.profilecard.data.ProfileCardInfo", "com.tencent.mobileqq.profilecard.entity.ProfileCardInfo"};
            int i18 = i2;
            int i19 = i18;
            while (i18 < 2) {
                String str3 = strArr3[i18];
                try {
                    Class clsM1091j7 = m1091j(classLoader, str3);
                    if (clsM1091j7 != null) {
                        XposedBridge.hookAllConstructors(clsM1091j7, new C0218fb(55));
                        i19++;
                    }
                } catch (Throwable th6) {
                    m1076C("hookProfileCardInfoConstructors failed " + str3 + ": " + th6);
                }
                i18++;
            }
            if (i19 > 0) {
                m1076C("hooked profile card info constructors count=" + i19);
            }
            int i20 = i17 + i19;
            try {
                clsM1091j = m1091j(classLoader, "com.tencent.mobileqq.profilecard.api.impl.ProfileCardApiImpl");
            } catch (Throwable th7) {
                AbstractC0000a.m2c("hookProfileCardZplanCover failed: ", th7);
            }
            if (clsM1091j == null) {
                i4 = i2;
            } else {
                Method[] declaredMethods4 = clsM1091j.getDeclaredMethods();
                int length4 = declaredMethods4.length;
                int i21 = i2;
                i4 = i21;
                while (i21 < length4) {
                    Method method5 = declaredMethods4[i21];
                    if (!Modifier.isAbstract(method5.getModifiers()) && method5.getReturnType() == Boolean.TYPE) {
                        String lowerCase = method5.getName().toLowerCase();
                        String lowerCase2 = m1078E(method5).toLowerCase();
                        Class<?>[] parameterTypes4 = method5.getParameterTypes();
                        int i22 = (parameterTypes4.length == 1 && parameterTypes4[i2].getName().contains("ProfileCardInfo")) ? 1 : i2;
                        if (lowerCase.contains("zplan") || lowerCase2.contains("isprofilecardshowzplancover") || lowerCase2.contains("zplancover") || i22 != 0) {
                            XposedBridge.hookMethod(method5, new C0234gb(80));
                            i4++;
                        }
                    }
                    i21++;
                }
                if (i4 > 0) {
                    m1076C("hooked profile card ZPlan cover count=" + i4);
                }
            }
            i5 = i20 + i4;
        }
        String[] strArr4 = {"com.tencent.mobileqq.profilecard.vas.view.VasProfileTemplateView", "com.tencent.mobileqq.profilecard.vas.view.ProfileCardTemplateView", "com.tencent.mobileqq.profilecard.vas.view.ProfileCardDecorView", "com.tencent.mobileqq.profilecard.vas.view.ProfileCardBackgroundView", "com.tencent.mobileqq.profilecard.template.ProfileTemplateView", "com.tencent.mobileqq.profilecard.diy.DiyCardView", "com.tencent.mobileqq.profilecard.diy.ProfileDiyView", "com.tencent.mobileqq.profilecard.vas.ProfileCardPagView", "com.tencent.mobileqq.profilecard.vas.VasProfileCardBackground", "com.tencent.mobileqq.profilecard.vas.view.ProfileCardVideoView", "com.tencent.mobileqq.profilecard.vas.view.ProfileCardVasView", "com.tencent.mobileqq.profilecard.vas.view.ProfileCardDressView", "com.tencent.mobileqq.profilecard.vas.view.ProfileCardNamePlateView", "com.tencent.mobileqq.profilecard.component.ProfileCardBackgroundComponent", "com.tencent.mobileqq.profilecard.component.ProfileCardTemplateComponent"};
        for (int i23 = i2; i23 < 15; i23++) {
            String str4 = strArr4[i23];
            try {
                Class clsM1091j8 = m1091j(classLoader, str4);
                if (clsM1091j8 != null && View.class.isAssignableFrom(clsM1091j8)) {
                    XposedBridge.hookAllConstructors(clsM1091j8, new C0202eb(35));
                    i2++;
                    m1076C("hooked profile decor exact view: " + str4);
                }
            } catch (Throwable th8) {
                m1076C("hook profile decor exact view failed " + str4 + ": " + th8);
            }
        }
        m1076C("profile decor installed data/bounded hooks only");
        m1076C("profile card decor hooks installed count=" + (i5 + i2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static void m1105x(ClassLoader classLoader) {
        if (AbstractC0440rb.f806d) {
            return;
        }
        AbstractC0440rb.f806d = true;
        int iM864c = AbstractC0440rb.m864c(classLoader, AbstractC0440rb.m870i("parts.base", "DrawerEntryExpManager")) + AbstractC0440rb.m864c(classLoader, AbstractC0440rb.m870i("mobile.manager", "Manager")) + AbstractC0440rb.m864c(classLoader, AbstractC0440rb.m870i("avatar.api", "InfoApiImpl")) + AbstractC0440rb.m864c(classLoader, AbstractC0440rb.m870i("mobile.api", "ConfigApiImpl")) + AbstractC0440rb.m864c(classLoader, AbstractC0440rb.m870i("mobile.api", "SwitchApiImpl")) + AbstractC0440rb.m865d(classLoader, AbstractC0440rb.m870i("parts.base.plain", "AnimationSequenceController")) + AbstractC0440rb.m865d(classLoader, AbstractC0440rb.m870i("parts.anim.plain", "AnimationSequenceController")) + AbstractC0440rb.m866e(classLoader, AbstractC0440rb.m870i("mobile.root", "KuiklyPagePart")) + AbstractC0440rb.m866e(classLoader, AbstractC0440rb.m870i("mobile.root", "CapsuleTabBar")) + AbstractC0440rb.m866e(classLoader, AbstractC0440rb.m870i("parts.anim", "AnimView"));
        m1076C("QQShow sidebar installed bounded hooks only");
        m1076C("QQShow sidebar hooks installed count=" + iM864c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m1106y(ClassLoader classLoader) {
        if (AbstractC0366oc.f654c) {
            return;
        }
        try {
            m1076C("reply no-at hard hooks enabled");
            Class clsM1091j = m1091j(classLoader, "com.tencent.mvi.base.route.MsgIntent");
            if (clsM1091j == null) {
                m1076C("MsgIntent not found for reply no-at");
                return;
            }
            String[] strArr = {"com.tencent.mobileqq.aio.input.reply.i", "com.tencent.mobileqq.aio.input.reply.h", "com.tencent.mobileqq.aio.input.reply.d"};
            int i = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                String str = strArr[i2];
                boolean zEquals = "com.tencent.mobileqq.aio.input.reply.d".equals(str);
                Class clsM1091j2 = m1091j(classLoader, str);
                if (clsM1091j2 != null) {
                    for (Method method : clsM1091j2.getDeclaredMethods()) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        if (method.getReturnType() == Void.TYPE && parameterTypes.length == 1 && clsM1091j.isAssignableFrom(parameterTypes[0]) && !Modifier.isAbstract(method.getModifiers())) {
                            XposedBridge.hookMethod(method, new C0318lc(zEquals));
                            i++;
                            m1076C("hooked reply no auto-at: " + m1078E(method));
                        }
                    }
                }
            }
            if (i == 0) {
                m1076C("reply no auto-at target not found");
            }
            if (i > 0) {
                AbstractC0366oc.f654c = true;
            }
        } catch (Throwable th) {
            AbstractC0000a.m2c("hookDisableReplyAutoAt failed: ", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static int m1107z(ClassLoader classLoader, String str, String str2) {
        try {
            Class clsM1091j = m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (str2.equals(method.getName()) && method.getReturnType() == Void.TYPE && !Modifier.isAbstract(method.getModifiers())) {
                    XposedBridge.hookMethod(method, new C0481u4(70));
                    i++;
                    m1076C("hooked noop: " + m1078E(method));
                }
            }
            return i;
        } catch (Throwable th) {
            m1076C("hookNamedMethodsNoop failed " + str + "." + str2 + ": " + th);
            return 0;
        }
    }
}
