package p211o9;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Handler;
import android.view.View;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p010aa.C0035c;
import p025bc.AbstractC0255e;
import p036c9.C0421b2;
import p062e8.C0828b;
import p085fg.InterfaceC1235p;
import p086fh.C1253k;
import p115hh.C1730o;
import p115hh.C1731p;
import p162l3.C2469w;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.C3744i;
import p258r8.EnumC3738c;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: o9.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3090c {

    /* JADX INFO: renamed from: a */
    public static final C3090c f9983a = new C3090c();

    /* JADX INFO: renamed from: b */
    public static volatile boolean f9984b;

    /* JADX INFO: renamed from: c */
    public static volatile boolean f9985c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C3089b m6564a(String str, int i9, char c10, char c11) {
        int iM6724w0;
        int i10;
        int i11 = i9 - 1;
        while (i11 > 0) {
            char cCharAt = str.charAt(i11);
            if (!AbstractC0000a.m95v0(cCharAt) && cCharAt != 160 && cCharAt != 12288) {
                break;
            }
            i11--;
        }
        if (i11 <= 0 || str.charAt(i11) != c11 || (iM6724w0 = AbstractC3149m.m6724w0(str, c10, i11, 4)) < 0 || (i10 = iM6724w0 + 1) >= i11) {
            return null;
        }
        String string = AbstractC3149m.m6703R0(str.substring(i10, i11)).toString();
        if (string.length() == 0) {
            return null;
        }
        return new C3089b(string, i10, i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m6565d(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes != null && parameterTypes.length >= 2) {
            for (Class<?> cls : parameterTypes) {
                if (View.class.isAssignableFrom(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C3089b m6566e(String str) {
        int iM6724w0;
        int i9;
        int iM6723v0 = AbstractC3149m.m6723v0(6, str, "退出了群聊");
        if (iM6723v0 <= 0) {
            return null;
        }
        int i10 = iM6723v0 - 1;
        while (i10 > 0) {
            char cCharAt = str.charAt(i10);
            if (!AbstractC0000a.m95v0(cCharAt) && cCharAt != 160 && cCharAt != 12288) {
                break;
            }
            i10--;
        }
        if (i10 <= 0 || str.charAt(i10) != ']' || (iM6724w0 = AbstractC3149m.m6724w0(str, '[', i10, 4)) < 0 || (i9 = iM6724w0 + 1) >= i10) {
            return null;
        }
        String string = AbstractC3149m.m6703R0(str.substring(i9, i10)).toString();
        if (string.length() == 0) {
            return null;
        }
        return new C3089b(string, i9, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:70:0x00ab */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX INFO: renamed from: f */
    public static List m6567f(C3742g c3742g, boolean z9, InterfaceC1235p interfaceC1235p) {
        ?? c3959f;
        ?? r62;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_group_leave_monitor_method_cache");
        Context context = c3742g.f12143a;
        ClassLoader classLoader = c3742g.f12145c;
        String strM2091g = C0828b.m2091g(context, classLoader);
        if (AbstractC3149m.m6721t0(strM2091g)) {
            strM2091g = null;
        }
        String strConcat = strM2091g != null ? strM2091g.concat("|group_leave_monitor_uri_click_v1") : null;
        if (strConcat == null) {
            strConcat = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean zM6721t0 = AbstractC3149m.m6721t0(strConcat);
        C4173t c4173t = C4173t.f13710g;
        if (!zM6721t0) {
            List listM2090f = C0828b.m2090f(sharedPreferencesM8640c, strConcat, classLoader, "uri_span_click_methods");
            ArrayList arrayList = new ArrayList();
            for (Object obj : listM2090f) {
                if (m6565d((Method) obj)) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
            if (arrayList2 != null) {
                return arrayList2;
            }
            if (z9) {
                try {
                    DexKitBridge dexKitBridge = c3742g.f12146d;
                    C0570e c0570e = new C0570e();
                    C1253k c1253k = new C1253k();
                    c1253k.m3374r0("MicroMsg.URISpanHandlerSet", "LuckyMoneyUriSpanHandler handleSpanClick() clickCallback == null");
                    c0570e.f1764h = c1253k;
                    C1731p<C1730o> c1731pFindMethod = dexKitBridge.findMethod(c0570e);
                    c3959f = new ArrayList();
                    for (C1730o c1730o : c1731pFindMethod) {
                        c1730o.getClass();
                        c3959f.add(c1730o.m4348p().m6023b(classLoader));
                    }
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b == null) {
                    r62 = c3959f;
                } else {
                    interfaceC1235p.invoke("退群监控链接点击方法定位失败", thM8182b);
                    r62 = c4173t;
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : (Iterable) r62) {
                    if (m6565d((Method) obj2)) {
                        arrayList3.add(obj2);
                    }
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (hashSet.add(((Method) obj3).toGenericString())) {
                        arrayList4.add(obj3);
                    }
                }
                if (arrayList4.isEmpty()) {
                    try {
                        SharedPreferences.Editor editorEdit = sharedPreferencesM8640c.edit();
                        if (!AbstractC1416l.m3825a(sharedPreferencesM8640c.getString("cache.key", HttpUrl.FRAGMENT_ENCODE_SET), strConcat)) {
                            editorEdit.clear().putString("cache.key", strConcat);
                        }
                        editorEdit.remove("uri_span_click_methods").apply();
                    } catch (Throwable unused) {
                    }
                } else {
                    C0828b.f2478a.m2097j(sharedPreferencesM8640c, strConcat, "uri_span_click_methods", arrayList4);
                }
                return arrayList4;
            }
        }
        return c4173t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Integer m6568g(String str) {
        Object c3959f;
        String string = str != null ? AbstractC3149m.m6703R0(AbstractC3149m.m6698M0(str, ',')).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.length() != 0) {
            if (!AbstractC3156t.m6740d0(string, "#", false)) {
                string = "#".concat(string);
            }
            String strSubstring = string.substring(1);
            if (strSubstring.length() == 6 || strSubstring.length() == 8) {
                for (int i9 = 0; i9 < strSubstring.length(); i9++) {
                    char cCharAt = strSubstring.charAt(i9);
                    if (!(!Character.isDigit(cCharAt) && ('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                    }
                }
                try {
                    String upperCase = strSubstring.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    c3959f = Integer.valueOf(Color.parseColor("#" + upperCase));
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                return (Integer) (c3959f instanceof C3959f ? null : c3959f);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m6569h(String str, String str2) {
        Pattern patternCompile = Pattern.compile(AbstractC0255e.m1022k("<", str2, ">(.*?)</", str2, ">"), C2469w.m5864f(32));
        patternCompile.getClass();
        Matcher matcher = patternCompile.matcher(str);
        matcher.getClass();
        C3145i c3145iM238b = AbstractC0018a.m238b(matcher, 0, str);
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (c3145iM238b == null) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str4 = (String) AbstractC4166m.m8425w1(1, c3145iM238b.m6676a());
        if (str4 != null) {
            str3 = str4;
        }
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3149m.m6703R0(str3).toString(), "&lt;", "<", false), "&gt;", ">", false), "&quot;", "\"", false), "&apos;", "'", false), "&amp;", "&", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m6570b(C3742g c3742g, InterfaceC1235p interfaceC1235p) {
        c3742g.getClass();
        if (m6571c(c3742g, false, interfaceC1235p)) {
            return;
        }
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C0035c(c3742g, interfaceC1235p), "group_leave_monitor_uri_click", "退群监控链接点击", EnumC3738c.BRIDGE);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized boolean m6571c(C3742g c3742g, boolean z9, InterfaceC1235p interfaceC1235p) {
        int i9;
        Throwable th2;
        Object c3959f;
        try {
            boolean z10 = true;
            if (f9985c) {
                return true;
            }
            List<Method> listM6567f = m6567f(c3742g, z9, interfaceC1235p);
            if (listM6567f.isEmpty()) {
                return false;
            }
            Throwable th3 = null;
            int i10 = 0;
            for (Method method : listM6567f) {
                try {
                    C3744i.f12154b.m7763b(method, new C0421b2(this, c3742g, method));
                    i9 = i10 + 1;
                    try {
                        c3959f = Integer.valueOf(i10);
                    } catch (Throwable th4) {
                        th2 = th4;
                        c3959f = new C3959f(th2);
                    }
                } catch (Throwable th5) {
                    i9 = i10;
                    th2 = th5;
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    th3 = thM8182b;
                }
                i10 = i9;
            }
            if (i10 <= 0) {
                z10 = false;
            }
            f9985c = z10;
            if (!f9985c) {
                interfaceC1235p.invoke("退群监控链接点击 Hook 安装失败", th3);
            }
            return f9985c;
        } catch (Throwable th6) {
            throw th6;
        }
    }
}
