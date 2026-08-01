package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.p001mr.elaris.xposedcompat.XposedBridge;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: rb */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0440rb {

    /* JADX INFO: renamed from: a */
    public static final Object f803a = new Object();

    /* JADX INFO: renamed from: b */
    public static final long[] f804b = {0, 180, 450};

    /* JADX INFO: renamed from: c */
    public static final WeakHashMap f805c = new WeakHashMap();

    /* JADX INFO: renamed from: d */
    public static volatile boolean f806d = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m862a(View view, int i) {
        CharSequence contentDescription;
        CharSequence text;
        if (view != null && i <= 5) {
            if ((view instanceof TextView) && (text = ((TextView) view).getText()) != null && m868g(text.toString())) {
                return true;
            }
            try {
                contentDescription = view.getContentDescription();
            } catch (Throwable unused) {
                contentDescription = null;
            }
            if (contentDescription != null && m868g(contentDescription.toString())) {
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(viewGroup.getChildCount(), 40);
                for (int i2 = 0; i2 < iMin; i2++) {
                    if (m862a(viewGroup.getChildAt(i2), i + 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x0037 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:64:0x0037 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.view.View, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public static void m863b(View view, int i, int[] iArr) {
        ?? r1;
        CharSequence text;
        ViewParent parent;
        if (view == null || i > 12) {
            return;
        }
        int i2 = iArr[0];
        if (i2 > 260) {
            return;
        }
        iArr[0] = i2 + 1;
        if (m869h(view)) {
            AbstractC0497v4.m1098q(view);
            return;
        }
        if (!(view instanceof TextView) || (text = (r1 = (TextView) view).getText()) == null || !m868g(text.toString())) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int iMin = Math.min(viewGroup.getChildCount(), 80);
                for (int i3 = 0; i3 < iMin; i3++) {
                    m863b(viewGroup.getChildAt(i3), i + 1, iArr);
                }
                return;
            }
            return;
        }
        int i4 = 0;
        while (i4 < 4) {
            try {
                parent = r1.getParent();
            } catch (Throwable unused) {
            }
            if (!(parent instanceof ViewGroup)) {
                break;
            }
            ViewGroup viewGroup2 = (ViewGroup) parent;
            if (AbstractC0497v4.m1087f(viewGroup2) || (viewGroup2.getChildCount() > 8 && !m869h(viewGroup2))) {
                break;
            }
            i4++;
            r1 = viewGroup2;
        }
        AbstractC0497v4.m1098q(r1);
        try {
            ViewParent parent2 = r1.getParent();
            if (parent2 instanceof ViewGroup) {
                ViewGroup viewGroup3 = (ViewGroup) parent2;
                int iMin2 = Math.min(viewGroup3.getChildCount(), 40);
                for (int i5 = 0; i5 < iMin2; i5++) {
                    View childAt = viewGroup3.getChildAt(i5);
                    if (childAt != r1 && (m869h(childAt) || m862a(childAt, 0))) {
                        AbstractC0497v4.m1098q(childAt);
                    }
                }
            }
        } catch (Throwable th) {
            AbstractC0198e7.m343a("qqshow-sidebar", "hide-nearby-siblings", th);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static int m864c(ClassLoader classLoader, String str) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (method.getReturnType() == Boolean.TYPE && !Modifier.isAbstract(method.getModifiers()) && m867f(method)) {
                    XposedBridge.hookMethod(method, new C0349nb(50));
                    i++;
                }
            }
            if (i > 0) {
                AbstractC0497v4.m1076C("hooked QQShow boolean off: " + str + " count=" + i);
            }
            return i;
        } catch (Throwable th) {
            AbstractC0497v4.m1076C("hookQQShowBooleanFalse failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static int m865d(ClassLoader classLoader, String str) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            int i = 0;
            for (Method method : clsM1091j.getDeclaredMethods()) {
                if (View.class.isAssignableFrom(method.getReturnType()) && !Modifier.isAbstract(method.getModifiers())) {
                    XposedBridge.hookMethod(method, new C0365ob(40));
                    i++;
                }
            }
            if (i > 0) {
                AbstractC0497v4.m1076C("hooked QQShow returned views: " + str + " count=" + i);
            }
            return i;
        } catch (Throwable th) {
            AbstractC0497v4.m1076C("hookQQShowReturnViews failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static int m866e(ClassLoader classLoader, String str) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null || !View.class.isAssignableFrom(clsM1091j)) {
                return 0;
            }
            XposedBridge.hookAllConstructors(clsM1091j, new C0408pb(40));
            AbstractC0497v4.m1076C("hooked QQShow view hide: ".concat(str));
            return 1;
        } catch (Throwable th) {
            AbstractC0497v4.m1076C("hookQQShowViewConstructors failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static boolean m867f(Method method) {
        String lowerCase = method.getName().toLowerCase(Locale.ROOT);
        if (lowerCase.contains("profile") || lowerCase.contains("card") || lowerCase.contains("home")) {
            return false;
        }
        return lowerCase.contains("qqshow") || lowerCase.contains("show") || lowerCase.contains("enable") || lowerCase.contains("entry") || lowerCase.contains("switch") || lowerCase.contains("aio");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m868g(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        return "QQ秀".equals(strTrim) || "超级QQ秀".equals(strTrim) || strTrim.contains("创建QQ秀") || strTrim.contains("开启QQ秀") || strTrim.contains("超级QQ秀") || strTrim.contains("AI".concat("头像")) || strTrim.contains("AI".concat("形象"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m869h(View view) {
        CharSequence contentDescription;
        if (view == null) {
            return false;
        }
        String lowerCase = view.getClass().getName().toLowerCase();
        if (lowerCase.contains("qqshow") || lowerCase.contains("superqqshow")) {
            return true;
        }
        try {
            contentDescription = view.getContentDescription();
        } catch (Throwable unused) {
            contentDescription = null;
        }
        return contentDescription != null && m868g(contentDescription.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m870i(String str, String str2) {
        return ("mobile.main.view".equals(str) ? "com.tencent.mobileqq.ai.avatar.view.AIAvatar" : "mobile.root".equals(str) ? "com.tencent.mobileqq.ai.AIAvatar" : "mobile.api".equals(str) ? "com.tencent.mobileqq.ai.avatar.api.impl.AIAvatar" : "mobile.manager".equals(str) ? "com.tencent.mobileqq.ai.avatar.manager.AIAvatar" : "avatar.api".equals(str) ? "com.tencent.mobileqq.avatar.api.impl.AIAvatar" : "parts.view".equals(str) ? "com.tencent.mobileqq.parts.aiavatar.view.AIAvatar" : "parts.anim".equals(str) ? "com.tencent.mobileqq.parts.aiavatar.anim.AIAvatar" : "parts.base".equals(str) ? "com.tencent.mobileqq.parts.aiavatar.AIAvatar" : "parts.anim.plain".equals(str) ? "com.tencent.mobileqq.parts.aiavatar.anim." : "parts.base.plain".equals(str) ? "com.tencent.mobileqq.parts.aiavatar." : "com.tencent.mobileqq.").concat(str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m871j(View view) {
        WeakHashMap weakHashMap;
        RunnableC0424qb runnableC0424qb;
        if (view == null) {
            return;
        }
        try {
            RunnableC0424qb runnableC0424qb2 = new RunnableC0424qb(view);
            Object obj = f803a;
            synchronized (obj) {
                weakHashMap = f805c;
                runnableC0424qb = (RunnableC0424qb) weakHashMap.put(view, runnableC0424qb2);
            }
            if (runnableC0424qb != null) {
                view.removeCallbacks(runnableC0424qb);
            }
            if (view.post(runnableC0424qb2)) {
                return;
            }
            synchronized (obj) {
                try {
                    if (weakHashMap.get(view) == runnableC0424qb2) {
                        weakHashMap.remove(view);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            AbstractC0198e7.m343a("qqshow-sidebar", "cleanup-schedule", th2);
        }
    }
}
