package p260ra;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import na.C2914b;
import na.C2917e;
import na.C2923k;
import okhttp3.HttpUrl;
import p002a1.RunnableC0006d;
import p025bc.AbstractC0255e;
import p099h.Hchat.utils.KavaReflector;
import p162l3.C2458l;
import p212oa.AbstractC3107b;
import p258r8.C3744i;

/* JADX INFO: renamed from: ra.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3784h {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f12398a;

    /* JADX INFO: renamed from: b */
    public final C2458l f12399b;

    /* JADX INFO: renamed from: c */
    public final C2914b f12400c;

    /* JADX INFO: renamed from: d */
    public final C2914b f12401d;

    /* JADX INFO: renamed from: e */
    public final C2914b f12402e;

    /* JADX INFO: renamed from: f */
    public final C2914b f12403f;

    /* JADX INFO: renamed from: g */
    public final WeakHashMap f12404g = new WeakHashMap();

    /* JADX INFO: renamed from: h */
    public final WeakHashMap f12405h = new WeakHashMap();

    /* JADX INFO: renamed from: i */
    public boolean f12406i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3784h(ClassLoader classLoader, C2458l c2458l, C2914b c2914b, C2914b c2914b2, C2914b c2914b3, C2914b c2914b4) {
        this.f12398a = classLoader;
        this.f12399b = c2458l;
        this.f12400c = c2914b;
        this.f12401d = c2914b2;
        this.f12402e = c2914b3;
        this.f12403f = c2914b4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m7949a(C3784h c3784h, Object obj, String str, boolean z9) {
        int i9;
        boolean z10;
        Intent intent;
        WeakHashMap weakHashMap = c3784h.f12405h;
        WeakHashMap weakHashMap2 = c3784h.f12404g;
        C2458l c2458l = c3784h.f12399b;
        if ((obj instanceof Activity) && c2458l.m5856e()) {
            try {
                i9 = c2458l.m5853b().getInt("hb_grab_mode", 1);
            } catch (Throwable unused) {
                i9 = 1;
            }
            if (i9 == 1) {
                return;
            }
            Activity activity = (Activity) obj;
            try {
                intent = activity.getIntent();
            } catch (Throwable unused2) {
            }
            String stringExtra = intent != null ? intent.getStringExtra("key_native_url") : null;
            c3784h.m7963o("领取页" + str + ": nativeurl=" + stringExtra);
            C2914b c2914b = c3784h.f12400c;
            if (c2914b != null) {
                C2917e c2917e = c2914b.f9449h;
                C2923k c2923k = c2917e.f9462f;
                if (TextUtils.isEmpty(stringExtra)) {
                    int i10 = c2917e.f9477u;
                    String str2 = c2917e.f9478v;
                    if (!TextUtils.isEmpty(str2) && !c2923k.f9547j.isEmpty()) {
                        Iterator it = c2923k.f9547j.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (AbstractC3107b.m6612b((String) it.next(), str2)) {
                                    z10 = true;
                                    break;
                                }
                            } else {
                                z10 = false;
                                break;
                            }
                        }
                        if (i10 == 1 && !z10) {
                            return;
                        }
                        if (i10 == 2 && z10) {
                            return;
                        }
                    }
                } else {
                    String str3 = (String) c2923k.f9543f.get(stringExtra);
                    String str4 = (String) c2923k.f9544g.get(stringExtra);
                    String strM6325b = c2917e.m6325b(str3, (String) c2923k.f9545h.get(stringExtra), str4, TextUtils.isEmpty(str4) ? null : AbstractC3107b.m6615e(str4, "exclusive_recv_username"), stringExtra);
                    if (strM6325b != null) {
                        c2917e.m6327d("实时检查忽略: ".concat(strM6325b));
                        return;
                    }
                }
            }
            if (z9) {
                Boolean bool = Boolean.TRUE;
                if (!bool.equals(weakHashMap2.get(activity)) && !bool.equals(weakHashMap2.get(activity))) {
                    String[] strArr = {"p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o"};
                    int i11 = 0;
                    while (true) {
                        if (i11 < 26) {
                            String str5 = strArr[i11];
                            try {
                                Object field = KavaReflector.readField(obj, str5);
                                if ((field instanceof Button) && !c3784h.m7962n((View) field)) {
                                    c3784h.m7957e((Button) field);
                                    Boolean bool2 = Boolean.TRUE;
                                    weakHashMap.put((View) field, bool2);
                                    weakHashMap2.put(activity, bool2);
                                    c3784h.m7963o("通过字段点击红包按钮: " + str5);
                                    break;
                                }
                            } catch (Throwable unused3) {
                            }
                            i11++;
                        } else {
                            try {
                                for (Field field2 : KavaReflector.declaredFields(obj.getClass())) {
                                    Object field3 = KavaReflector.readField(field2, obj);
                                    if (field3 instanceof Button) {
                                        Button button = (Button) field3;
                                        if (!c3784h.m7962n(button) && m7956m(m7955i(button), true)) {
                                            c3784h.m7957e(button);
                                            Boolean bool3 = Boolean.TRUE;
                                            weakHashMap.put(button, bool3);
                                            weakHashMap2.put(activity, bool3);
                                            c3784h.m7963o("遍历字段点击红包按钮: " + field2.getName());
                                            break;
                                        }
                                    }
                                }
                            } catch (Throwable unused4) {
                            }
                            if (c3784h.m7958g(activity.getWindow().getDecorView())) {
                                weakHashMap2.put(activity, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
            Handler handler = new Handler(activity.getMainLooper());
            int i12 = 10;
            try {
                i12 = c2458l.m5853b().getInt("hb_check_times", 10);
            } catch (Throwable unused5) {
            }
            handler.postDelayed(new RunnableC3782f(c3784h, activity, stringExtra, new int[]{0}, i12, handler), 300L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7950b(C3784h c3784h, Activity activity) {
        boolean z9;
        Intent intent;
        C2458l c2458l = c3784h.f12399b;
        if (c2458l.m5856e()) {
            try {
                intent = activity.getIntent();
            } catch (Throwable unused) {
            }
            String stringExtra = intent != null ? intent.getStringExtra("key_native_url") : null;
            String str = stringExtra;
            try {
                Intent intent2 = activity.getIntent();
                if (intent2 != null) {
                    boolean z10 = intent2.getBooleanExtra("key_is_self_sent", false);
                    z9 = z10;
                }
            } catch (Throwable unused2) {
                z9 = false;
            }
            Handler handler = new Handler(activity.getMainLooper());
            int i9 = 10;
            try {
                i9 = c2458l.m5853b().getInt("hb_check_times", 10);
            } catch (Throwable unused3) {
            }
            handler.postDelayed(new RunnableC3783g(c3784h, activity, str, z9, new int[]{0}, Math.max(3, i9), handler), 100L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m7951c(View view) {
        if (view != null) {
            if (view instanceof TextView) {
                String strM7955i = m7955i((TextView) view);
                if (strM7955i.contains("手慢了") || strM7955i.contains("红包派完了") || strM7955i.contains("已被领完") || strM7955i.contains("来晚了") || strM7955i.contains("已抢完") || strM7955i.contains("已领完") || strM7955i.contains("红包已被抢完") || strM7955i.contains("红包已领完") || strM7955i.contains("该红包已超过") || strM7955i.contains("已过期")) {
                    return true;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    if (m7951c(viewGroup.getChildAt(i9))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m7952d(View view) {
        if (view != null) {
            if (view instanceof TextView) {
                String strM7955i = m7955i((TextView) view);
                if (strM7955i.contains("已存入") || strM7955i.matches(".*\\d+\\.\\d+元.*")) {
                    return true;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    if (m7952d(viewGroup.getChildAt(i9))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m7953f(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof TextView) {
            String strM7955i = m7955i((TextView) view);
            Matcher matcher = Pattern.compile("(\\d+(?:\\.\\d+)?)\\s*元").matcher(strM7955i);
            if (matcher.find()) {
                return matcher.group(0);
            }
            Matcher matcher2 = Pattern.compile("(\\d+(?:\\.\\d+)?)").matcher(strM7955i);
            if (matcher2.find()) {
                String strGroup = matcher2.group(1);
                if (strGroup.length() <= 6 && strGroup.contains(".")) {
                    return strGroup.concat("元");
                }
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            String strM7953f = m7953f(viewGroup.getChildAt(i9));
            if (strM7953f != null) {
                return strM7953f;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static TextView m7954h(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (m7955i(textView).contains("已存入")) {
                return textView;
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
            TextView textViewM7954h = m7954h(viewGroup.getChildAt(i9));
            if (textViewM7954h != null) {
                return textViewM7954h;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m7955i(TextView textView) {
        CharSequence text = textView.getText();
        return text != null ? text.toString() : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m7956m(String str, boolean z9) {
        if (str.contains("開") || str.contains("拆") || str.contains("领取")) {
            return true;
        }
        return z9 && str.length() == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m7957e(View view) {
        view.setEnabled(true);
        view.post(new RunnableC0006d(this, 29, view));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m7958g(View view) {
        if (view != null && !m7962n(view)) {
            boolean z9 = view instanceof Button;
            WeakHashMap weakHashMap = this.f12405h;
            if (z9) {
                Button button = (Button) view;
                CharSequence contentDescription = view.getContentDescription();
                if (m7956m(m7955i(button), false) || (contentDescription != null && contentDescription.toString().contains("開"))) {
                    m7957e(button);
                    weakHashMap.put(button, Boolean.TRUE);
                    return true;
                }
            }
            if (view.isClickable() && (view instanceof TextView) && m7956m(m7955i((TextView) view), false)) {
                m7957e(view);
                weakHashMap.put(view, Boolean.TRUE);
                return true;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                    if (m7958g(viewGroup.getChildAt(i9))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m7959j(Class cls, String str, Class[] clsArr, XC_MethodHook xC_MethodHook) {
        try {
            Method methodFindDeclaredMethod = clsArr == null ? KavaReflector.findDeclaredMethod(cls, str, new Class[0]) : KavaReflector.findDeclaredMethod(cls, str, clsArr);
            if (methodFindDeclaredMethod == null) {
                return false;
            }
            C3744i.f12154b.m7763b(methodFindDeclaredMethod, xC_MethodHook);
            return true;
        } catch (Throwable th2) {
            m7963o("Hook红包页面方法失败: " + cls.getName() + "." + str + " | " + th2.getMessage());
            return false;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m7960k(Class cls, String str) {
        if (cls == null) {
            return;
        }
        if (m7959j(cls, "onCreate", new Class[]{Bundle.class}, new C3781e(this, 5))) {
            m7963o("Hook详情页: " + str + ".onCreate");
        }
        if (m7959j(cls, "onResume", null, new C3781e(this, 6))) {
            m7963o("Hook详情页: " + str + ".onResume");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        p258r8.C3744i.f12154b.m7763b(r3, new p260ra.C3781e(r6, 3));
        m7963o("Hook领取页: " + r8 + ".onSceneEnd");
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m7961l(Class cls, String str) {
        if (cls == null) {
            return;
        }
        if (m7959j(cls, "initView", null, new C3781e(this, 0))) {
            m7963o("Hook领取页: " + str + ".initView");
        }
        m7959j(cls, "onCreate", new Class[]{Bundle.class}, new C3781e(this, 1));
        m7959j(cls, "onResume", null, new C3781e(this, 2));
        try {
            Iterator<Method> it = KavaReflector.declaredMethods(cls).iterator();
            while (true) {
                if (it.hasNext()) {
                    Method next = it.next();
                    if ("onSceneEnd".equals(next.getName()) && next.getParameterTypes().length == 4) {
                        break;
                    }
                }
            }
        } catch (Throwable th2) {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("Hook领取页onSceneEnd失败: ", str, " | ");
            sbM1026o.append(th2.getMessage());
            m7963o(sbM1026o.toString());
        }
        try {
            m7959j(cls, "onDestroy", null, new C3781e(this, 4));
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m7962n(View view) {
        return view != null && Boolean.TRUE.equals(this.f12405h.get(view));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m7963o(String str) {
        C2914b c2914b = this.f12403f;
        if (c2914b != null) {
            c2914b.f9449h.m6327d(str);
        }
    }
}
