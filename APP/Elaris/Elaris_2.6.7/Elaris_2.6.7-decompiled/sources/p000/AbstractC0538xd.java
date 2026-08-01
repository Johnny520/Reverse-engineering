package p000;

import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: xd */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0538xd {

    /* JADX INFO: renamed from: a */
    public static final String[] f1070a = {"com.tencent.mobileqq.activity.miniaio.c", "com.tencent.mobileqq.activity.miniaio.d", "com.tencent.mobileqq.activity.miniaio.e", "com.tencent.mobileqq.activity.miniaio.f", "com.tencent.mobileqq.activity.miniaio.g", "com.tencent.mobileqq.activity.miniaio.h", "com.tencent.mobileqq.activity.miniaio.i"};

    /* JADX INFO: renamed from: b */
    public static final String[] f1071b = {"com.tencent.qqmini.sdk.core.utils.CustomWidgetUtil", "com.tencent.mobileqq.utils.CustomWidgetUtil", "com.tencent.widget.CustomWidgetUtil"};

    /* JADX INFO: renamed from: c */
    public static final String[] f1072c = {"com.tencent.qqnt.chats.view.RollingTextView", "com.tencent.qqnt.chats.view.RecentRollingTextView", "com.tencent.mobileqq.widget.RollingTextView", "com.tencent.mobileqq.activity.recent.RecentRollingTextView", "com.tencent.mobileqq.activity.home.impl.widget.RecentRollingTextView", "com.tencent.mobileqq.activity.recent.cur.DragFrameLayout$RecentRollingTextView", "com.tencent.widget.RollingTextView"};

    /* JADX INFO: renamed from: d */
    public static final Map f1073d = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: e */
    public static final Set f1074e = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: f */
    public static final Object f1075f = new Object();

    /* JADX INFO: renamed from: g */
    public static long f1076g = 0;

    /* JADX INFO: renamed from: h */
    public static int f1077h = 0;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1141a(int i, Object obj) {
        boolean z;
        String strM575V;
        String strM575V2;
        String name;
        if (obj == null || i <= 0) {
            return;
        }
        if (HookEntry.runtimeBool(Prefs.KEY_DEBUG_LOG) && HookEntry.runtimeBool(Prefs.KEY_UNREAD_FULL_COUNT) && Looper.myLooper() != Looper.getMainLooper()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (f1075f) {
                try {
                    long j = f1076g;
                    if (j == 0 || jCurrentTimeMillis - j >= 300000) {
                        f1076g = jCurrentTimeMillis;
                        f1077h = 1;
                    } else {
                        int i2 = f1077h;
                        if (i2 >= 3) {
                            z = false;
                        } else {
                            f1077h = i2 + 1;
                        }
                    }
                    z = true;
                } finally {
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            strM575V = "";
        } else if (obj instanceof View) {
            StringBuilder sb = new StringBuilder(120);
            AbstractC0497v4.m1085d((View) obj, sb, 0, new int[]{0});
            strM575V = sb.toString();
        } else {
            strM575V = AbstractC0260i5.m575V(obj, 0, AbstractC0260i5.m624i1());
        }
        if (i > 0 && (obj instanceof View)) {
            f1073d.put((View) obj, Integer.valueOf(i));
        }
        String[] strArr = {"mNum", "j"};
        ConcurrentHashMap concurrentHashMap = AbstractC0513w4.f995a;
        for (int i3 = 0; i3 < 2; i3++) {
            Field fieldM1118a = AbstractC0513w4.m1118a(obj.getClass(), strArr[i3]);
            if (fieldM1118a != null && fieldM1118a.getType() == Integer.TYPE) {
                try {
                    fieldM1118a.setAccessible(true);
                    fieldM1118a.setInt(obj, i);
                } catch (Throwable unused) {
                }
            }
        }
        String strValueOf = String.valueOf(i);
        String[] strArr2 = {"mText", "n"};
        ConcurrentHashMap concurrentHashMap2 = AbstractC0513w4.f995a;
        if (strValueOf != null) {
            for (int i4 = 0; i4 < 2; i4++) {
                Field fieldM1118a2 = AbstractC0513w4.m1118a(obj.getClass(), strArr2[i4]);
                if (fieldM1118a2 != null && fieldM1118a2.getType() == String.class) {
                    try {
                        fieldM1118a2.setAccessible(true);
                        fieldM1118a2.set(obj, strValueOf);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
        boolean z2 = obj instanceof View;
        if (z2) {
            View view = (View) obj;
            AbstractC0497v4.m1079F(view, i, 4);
            try {
                view.invalidate();
            } catch (Throwable unused3) {
            }
        }
        if (z) {
            if (z2) {
                StringBuilder sb2 = new StringBuilder(120);
                AbstractC0497v4.m1085d((View) obj, sb2, 0, new int[]{0});
                strM575V2 = sb2.toString();
            } else {
                strM575V2 = AbstractC0260i5.m575V(obj, 0, AbstractC0260i5.m624i1());
            }
            String strM535H1 = "none";
            try {
                StringBuilder sb3 = new StringBuilder(800);
                AbstractC0497v4.m1082a(sb3, "unread-full", "QUIBadge/updateNum");
                sb3.append("\ntarget=");
                sb3.append(obj.getClass().getName());
                sb3.append("\npage=");
                if (obj instanceof View) {
                    name = "unknown";
                    try {
                        Context context = ((View) obj).getContext();
                        if (context != null) {
                            name = context.getClass().getName();
                        }
                    } catch (Throwable unused4) {
                    }
                } else {
                    name = "unknown";
                }
                sb3.append(name);
                sb3.append("\noriginalUnreadFields=");
                sb3.append(i);
                sb3.append("\noriginalBadgeText=");
                sb3.append((strM575V == null || strM575V.length() == 0) ? "none" : AbstractC0260i5.m535H1(strM575V, 300));
                sb3.append("\nmodifiedBadgeText=");
                if (strM575V2 != null && strM575V2.length() != 0) {
                    strM535H1 = AbstractC0260i5.m535H1(strM575V2, 300);
                }
                sb3.append(strM535H1);
                sb3.append("\nskipped=false");
                sb3.append("\nskipReason=none");
                sb3.append("\nreason=");
                sb3.append("QUIBadge count argument");
                AbstractC0497v4.m1076C(sb3.toString());
            } catch (Throwable th) {
                AbstractC0000a.m2c("traceUnreadCountEvent failed: ", th);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1142b(String str, Class cls) {
        String name = cls.getName();
        String strM1004e = AbstractC0463t2.m1004e(str);
        if (strM1004e.length() == 0) {
            AbstractC0463t2.m1015p(str, name);
            return;
        }
        String[] strArrSplit = strM1004e.split("\\|");
        int length = strArrSplit.length;
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            if (name.equals(str2 == null ? "" : str2.trim())) {
                return;
            }
        }
        AbstractC0463t2.m1015p(str, strM1004e + "|" + name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f9  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m1143c(Object obj, int i, Set set) {
        int i2;
        Class<?> cls;
        boolean z;
        String lowerCase;
        if (obj == null || i > 2 || set == null || !set.add(obj) || (obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof Enum)) {
            return 0;
        }
        Class<?> superclass = obj.getClass();
        String lowerCase2 = superclass.getName().toLowerCase();
        boolean z2 = lowerCase2.contains("badge") || lowerCase2.contains("unread") || lowerCase2.contains("recent") || lowerCase2.contains("chat") || lowerCase2.contains("aio") || lowerCase2.contains("message") || lowerCase2.contains("msg") || lowerCase2.contains("contact") || lowerCase2.contains("conversation") || lowerCase2.contains("troop") || lowerCase2.contains("group");
        int i3 = 0;
        while (superclass != null && superclass != Object.class) {
            Field[] declaredFields = superclass.getDeclaredFields();
            int length = declaredFields.length;
            int i4 = 0;
            while (i4 < length) {
                int i5 = i4;
                Field field = declaredFields[i5];
                if (Modifier.isStatic(field.getModifiers())) {
                    i4 = i5 + 1;
                    i2 = length;
                    cls = superclass;
                    z = z2;
                } else {
                    try {
                        i2 = length;
                    } catch (Throwable unused) {
                        i2 = length;
                    }
                    try {
                        lowerCase = field.getName().toLowerCase();
                        cls = superclass;
                        try {
                            z = z2;
                        } catch (Throwable unused2) {
                            z = z2;
                        }
                    } catch (Throwable unused3) {
                        cls = superclass;
                        z = z2;
                        i4 = i5 + 1;
                        superclass = cls;
                        length = i2;
                        z2 = z;
                    }
                    if (field.getType() != Integer.TYPE) {
                        if (field.getType() != Integer.class) {
                            try {
                                if (field.getType() == Long.TYPE || field.getType() == Long.class || Number.class.isAssignableFrom(field.getType())) {
                                    if (z || lowerCase.contains("unread") || lowerCase.contains("count") || lowerCase.contains("badge") || lowerCase.contains("num")) {
                                        try {
                                            field.setAccessible(true);
                                            Object obj2 = field.get(obj);
                                            int iIntValue = obj2 instanceof Number ? ((Number) obj2).intValue() : 0;
                                            if (iIntValue > i3 && iIntValue > 99 && iIntValue < 1000000) {
                                                i3 = iIntValue;
                                            }
                                        } catch (Throwable unused4) {
                                        }
                                    }
                                } else if (i < 2) {
                                    try {
                                        if (lowerCase.contains("data") || lowerCase.contains("info") || lowerCase.contains("model") || lowerCase.contains("item") || lowerCase.contains("badge") || lowerCase.contains("unread") || lowerCase.contains("recent") || lowerCase.contains("contact") || lowerCase.contains("conversation") || lowerCase.contains("troop") || lowerCase.contains("group") || lowerCase.contains("chat")) {
                                            field.setAccessible(true);
                                            int iM1143c = m1143c(field.get(obj), i + 1, set);
                                            if (iM1143c > i3) {
                                                i3 = iM1143c;
                                            }
                                        }
                                    } catch (Throwable unused5) {
                                    }
                                }
                            } catch (Throwable unused6) {
                            }
                        }
                    }
                    i4 = i5 + 1;
                }
                superclass = cls;
                length = i2;
                z2 = z;
            }
            superclass = superclass.getSuperclass();
        }
        return i3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m1144d(String str, Method method) {
        int i;
        try {
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class clsM1008i = AbstractC0463t2.m1008i(method.getDeclaringClass().getClassLoader(), "target.unread_full.qui_badge_class", "com.tencent.mobileqq.quibadge.QUIBadge");
            if (method.getReturnType() != Void.TYPE) {
                return 0;
            }
            Class<?> cls = Integer.TYPE;
            if (clsM1008i != null) {
                i = 0;
                try {
                    if (parameterTypes.length == 5 && clsM1008i.isAssignableFrom(parameterTypes[0]) && parameterTypes[1] == cls && parameterTypes[2] == cls && parameterTypes[3] == cls && parameterTypes[4] == String.class) {
                        if (!m1145e(method)) {
                            return 0;
                        }
                        XposedBridge.hookMethod(method, new C0458sd(60));
                        AbstractC0497v4.m1076C("hooked widget badge full unread count limit (" + str + "): " + AbstractC0497v4.m1078E(method));
                        return 1;
                    }
                } catch (Throwable th) {
                    th = th;
                    AbstractC0000a.m2c("hookOneWidgetUnreadFullMethod failed: ", th);
                    return i;
                }
            } else {
                i = 0;
            }
            if (parameterTypes.length >= 6 && TextView.class.isAssignableFrom(parameterTypes[i]) && parameterTypes[1] == cls && parameterTypes[2] == cls && parameterTypes[3] == cls && parameterTypes[4] == cls && parameterTypes[5] == String.class && m1145e(method)) {
                XposedBridge.hookMethod(method, new C0474td(60));
                AbstractC0497v4.m1076C("hooked widget text full unread count limit (" + str + "): " + AbstractC0497v4.m1078E(method));
                return 1;
            }
            return i;
        } catch (Throwable th2) {
            th = th2;
            i = 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m1145e(Method method) {
        return f1074e.add(AbstractC0497v4.m1078E(method));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m1146f(TextView textView, int i) {
        if (textView == null || i <= 0) {
            return;
        }
        String strValueOf = String.valueOf(i);
        try {
            if (!strValueOf.contentEquals(textView.getText())) {
                textView.setText(strValueOf);
            }
        } catch (Throwable unused) {
        }
        try {
            textView.setMaxWidth(Integer.MAX_VALUE);
        } catch (Throwable unused2) {
        }
        try {
            textView.invalidate();
        } catch (Throwable unused3) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m1147g(Object obj, int i, int i2, Set set) {
        if (obj == null || i <= 0 || i2 < 0 || set == null || !set.add(obj)) {
            return;
        }
        if (obj instanceof TextView) {
            TextView textView = (TextView) obj;
            if (AbstractC0260i5.m525E0(textView.getText()) || AbstractC0260i5.m671y0(textView)) {
                m1146f(textView, i);
                return;
            }
            return;
        }
        if (obj instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) obj;
            int iMin = Math.min(viewGroup.getChildCount(), 32);
            for (int i3 = 0; i3 < iMin; i3++) {
                m1147g(viewGroup.getChildAt(i3), i, i2 - 1, set);
            }
            return;
        }
        if ((obj instanceof View) || (obj instanceof CharSequence) || (obj instanceof Number) || (obj instanceof Boolean)) {
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                try {
                    if (!Modifier.isStatic(field.getModifiers()) && !field.getType().isPrimitive()) {
                        field.setAccessible(true);
                        m1147g(field.get(obj), i, i2 - 1, set);
                    }
                } catch (Throwable unused) {
                }
            }
        }
    }
}
