package p365y9;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import ch.C0570e;
import gg.AbstractC1416l;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import org.luckypray.dexkit.DexKitBridge;
import p007a7.AbstractC0018a;
import p009a9.AbstractC0032i;
import p009a9.C0026c;
import p009a9.C0030g;
import p025bc.AbstractC0255e;
import p086fh.C1253k;
import p096g8.C1360a;
import p096g8.C1363d;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p127ib.C2034b;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import p332wb.C5538zh;
import p381zb.AbstractC6134c;
import tf.AbstractC4165l;
import tf.C4173t;

/* JADX INFO: renamed from: y9.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6009e {

    /* JADX INFO: renamed from: a */
    public final C3742g f24390a;

    /* JADX INFO: renamed from: b */
    public final C2034b f24391b;

    /* JADX INFO: renamed from: c */
    public final C6006b f24392c;

    /* JADX INFO: renamed from: d */
    public final Map f24393d;

    /* JADX INFO: renamed from: e */
    public final Map f24394e;

    /* JADX INFO: renamed from: f */
    public final ConcurrentHashMap f24395f;

    /* JADX INFO: renamed from: g */
    public final ConcurrentHashMap f24396g;

    /* JADX INFO: renamed from: h */
    public final ThreadLocal f24397h;

    /* JADX INFO: renamed from: i */
    public final SharedPreferences f24398i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f24399j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6009e(C3742g c3742g, C2034b c2034b, C6006b c6006b) {
        c3742g.getClass();
        this.f24390a = c3742g;
        this.f24391b = c2034b;
        this.f24392c = c6006b;
        this.f24393d = AbstractC3199a.m6843p();
        this.f24394e = AbstractC3199a.m6843p();
        this.f24395f = new ConcurrentHashMap();
        this.f24396g = new ConcurrentHashMap();
        this.f24397h = new ThreadLocal();
        this.f24398i = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_member_title_method_cache");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m10758b(Object obj) {
        if (obj != null) {
            String[] strArr = {"field_content", "content", "msgContent", "field_xml", "xml"};
            for (int i9 = 0; i9 < 5; i9++) {
                Object field = KavaReflector.readField(obj, strArr[i9]);
                String str = field instanceof String ? (String) field : null;
                if (str != null) {
                    int iM6719r0 = AbstractC3149m.m6719r0(str, ":\n", 0, false, 6) > 0 ? AbstractC3149m.m6719r0(str, ":\n", 0, false, 6) : AbstractC3149m.m6719r0(str, ":\r\n", 0, false, 6) > 0 ? AbstractC3149m.m6719r0(str, ":\r\n", 0, false, 6) : -1;
                    String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    if (iM6719r0 > 0 && iM6719r0 <= 80) {
                        String strSubstring = str.substring(0, iM6719r0);
                        if (!AbstractC6134c.m10905b(strSubstring)) {
                            strSubstring = null;
                        }
                        if (strSubstring != null) {
                            str2 = strSubstring;
                        }
                    }
                    if (AbstractC6134c.m10905b(str2)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m10759e(SpannableStringBuilder spannableStringBuilder) {
        int i9 = 0;
        boolean z9 = false;
        while (i9 < spannableStringBuilder.length()) {
            char cCharAt = spannableStringBuilder.charAt(i9);
            if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t' && cCharAt != ' ' && cCharAt != 12288) {
                i9++;
                z9 = false;
            } else if (z9) {
                spannableStringBuilder.delete(i9, i9 + 1);
            } else {
                int i10 = i9 + 1;
                spannableStringBuilder.replace(i9, i10, " ");
                i9 = i10;
                z9 = true;
            }
        }
        while (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        while (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m10760g(String str) {
        return AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static boolean m10761h(String str) {
        C1360a c1360aAccount = WeChatApis.account();
        String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
        if (strM3652c == null) {
            strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return strM3652c.length() > 0 && strM3652c.equals(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m10762j(String str, String str2) {
        String strM3729r;
        String string;
        String string2 = AbstractC3149m.m6703R0(str).toString();
        if (string2.length() > 0) {
            return string2;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (c1368iM9259c == null || (strM3729r = c1368iM9259c.m3729r(str2)) == null || (string = AbstractC3149m.m6703R0(strM3729r).toString()) == null) {
            return " ";
        }
        String strM5161h = AbstractC2091b.m5161h("\\s+", string, " ");
        if (AbstractC3149m.m6721t0(strM5161h) || AbstractC3156t.m6740d0(strM5161h, "微信用户(", false) || AbstractC3156t.m6740d0(strM5161h, "微信用户（", false)) {
            strM5161h = null;
        }
        return strM5161h != null ? strM5161h : " ";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m10763k(SpannableStringBuilder spannableStringBuilder) {
        while (AbstractC3149m.m6693H0(spannableStringBuilder, "￼")) {
            int iM6719r0 = AbstractC3149m.m6719r0(spannableStringBuilder, " ", 0, false, 6);
            Integer numValueOf = Integer.valueOf(iM6719r0);
            if (!(iM6719r0 >= 0)) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                return;
            }
            int iIntValue = numValueOf.intValue() + 1;
            int length = spannableStringBuilder.length();
            if (iIntValue > length) {
                iIntValue = length;
            }
            spannableStringBuilder.delete(0, iIntValue);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m10764a(TextView textView, String str, String str2) {
        String str3;
        C6010f c6010f;
        SharedPreferences sharedPreferences = this.f24391b.f6870a;
        if (AbstractC6134c.m10905b(str2) && m10760g(str)) {
            C6008d c6008d = new C6008d(str, str2);
            Map map = this.f24394e;
            map.getClass();
            map.put(textView, c6008d);
            WeChatApis.contact().getClass();
            C1363d c1363d = WeChatApis.chatroomApi;
            int iM3678j = c1363d != null ? c1363d.m3678j(str, str2) : 0;
            String strConcat = "custom_title_".concat(C2034b.m4987a(str, str2));
            CharSequence charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
            String string = sharedPreferences.getString(strConcat, HttpUrl.FRAGMENT_ENCODE_SET);
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String strM247k = AbstractC0018a.m247k(string);
            if (strM247k.length() == 0) {
                String str4 = iM3678j != 1 ? iM3678j != 2 ? "member_title" : "owner_title" : "admin_title";
                String str5 = iM3678j != 1 ? iM3678j != 2 ? "群员" : "群主" : "管理员";
                String string2 = sharedPreferences.getString(str4, str5);
                if (string2 == null) {
                    string2 = str5;
                }
                String strM247k2 = AbstractC0018a.m247k(string2);
                if (strM247k2.length() != 0) {
                    str5 = strM247k2;
                }
                str3 = str5;
            } else {
                str3 = strM247k;
            }
            if (str3.length() == 0 || (iM3678j == 0 && strM247k.length() == 0 && !sharedPreferences.getBoolean("show_member", true))) {
                m10769l(textView);
                return false;
            }
            String string3 = sharedPreferences.getString("custom_color_".concat(C2034b.m4987a(str, str2)), HttpUrl.FRAGMENT_ENCODE_SET);
            if (string3 == null) {
                string3 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            C6010f c6010fM219G = AbstractC0018a.m219G(string3);
            if (c6010fM219G == null) {
                if (strM247k.length() > 0) {
                    c6010fM219G = AbstractC0018a.m219G(sharedPreferences.getString("custom_color", "#2563EB"));
                    if (c6010fM219G == null) {
                        int color = Color.parseColor("#2563EB");
                        c6010f = new C6010f(color, color);
                        c6010fM219G = c6010f;
                    }
                } else {
                    String str6 = iM3678j != 1 ? iM3678j != 2 ? "member_color" : "owner_color" : "admin_color";
                    String str7 = iM3678j != 1 ? iM3678j != 2 ? "#64748B" : "#F59E0B" : "#22C55E";
                    String string4 = sharedPreferences.getString(str6, str7);
                    if (string4 == null) {
                        string4 = str7;
                    }
                    c6010fM219G = AbstractC0018a.m219G(string4);
                    if (c6010fM219G == null) {
                        int color2 = Color.parseColor(str7);
                        c6010f = new C6010f(color2, color2);
                        c6010fM219G = c6010f;
                    }
                }
            }
            String string5 = sharedPreferences.getString("custom_text_color_".concat(C2034b.m4987a(str, str2)), HttpUrl.FRAGMENT_ENCODE_SET);
            if (string5 == null) {
                string5 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            C6010f c6010fM219G2 = AbstractC0018a.m219G(string5);
            if (c6010fM219G2 == null) {
                if (strM247k.length() > 0) {
                    c6010fM219G2 = AbstractC0018a.m219G(sharedPreferences.getString("custom_text_color", "#FFFFFF"));
                    if (c6010fM219G2 == null) {
                        c6010fM219G2 = new C6010f(-1, -1);
                    }
                } else {
                    String string6 = sharedPreferences.getString(iM3678j != 1 ? iM3678j != 2 ? "member_text_color" : "owner_text_color" : "admin_text_color", "#FFFFFF");
                    c6010fM219G2 = AbstractC0018a.m219G(string6 != null ? string6 : "#FFFFFF");
                    if (c6010fM219G2 == null) {
                        c6010fM219G2 = new C6010f(-1, -1);
                    }
                }
            }
            boolean z9 = textView.getVisibility() != 0;
            if (z9) {
                textView.setVisibility(0);
            }
            ThreadLocal threadLocal = this.f24397h;
            Object obj = threadLocal.get();
            Boolean bool = Boolean.TRUE;
            if (!AbstractC1416l.m3825a(obj, bool)) {
                try {
                    threadLocal.set(bool);
                    C0026c c0026cM286d = AbstractC0032i.m286d(textView);
                    CharSequence charSequenceM285c = AbstractC0032i.m285c(textView);
                    if (!z9) {
                        charSequence = charSequenceM285c;
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    m10763k(spannableStringBuilder);
                    m10759e(spannableStringBuilder);
                    String string7 = spannableStringBuilder.toString();
                    string7.getClass();
                    String strM10762j = m10762j(string7, str2);
                    if (!AbstractC1416l.m3825a(spannableStringBuilder.toString(), strM10762j)) {
                        spannableStringBuilder.clear();
                        spannableStringBuilder.append((CharSequence) strM10762j);
                    }
                    AbstractC0032i.m287e(c0026cM286d).f83a = spannableStringBuilder;
                    AbstractC0032i.m283a(c0026cM286d);
                    try {
                        textView.setHorizontallyScrolling(false);
                        textView.setEllipsize(null);
                        textView.setSingleLine(false);
                        textView.setMaxLines(Integer.MAX_VALUE);
                    } catch (Throwable unused) {
                    }
                    Map map2 = AbstractC0032i.f101a;
                    AbstractC0032i.m288f(c0026cM286d).f85c = new C0030g(str3, c6010fM219G.f24400a, c6010fM219G.f24401b, c6010fM219G2.f24400a, c6010fM219G2.f24401b, new C5538zh(this, c0026cM286d, c6008d, 16));
                    AbstractC0032i.m283a(c0026cM286d);
                    threadLocal.set(Boolean.FALSE);
                    return true;
                } catch (Throwable th2) {
                    threadLocal.set(Boolean.FALSE);
                    throw th2;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0052 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: c */
    public final List m10765c(String... strArr) {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f24390a;
        try {
            DexKitBridge dexKitBridge = c3742g.f12146d;
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC4165l.m8375L0(strArr));
            c0570e.f1764h = c1253k;
            C1731p c1731pFindMethod = dexKitBridge.findMethod(c0570e);
            c3959f = new ArrayList();
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
                    c3959f.add(method);
                }
            }
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        Object obj = c3959f;
        if (thM8182b != null) {
            this.f24392c.invoke("群员头衔定位方法失败", thM8182b);
            obj = C4173t.f13710g;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Field m10766d(Class cls) {
        Object next;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f24395f;
            Field field = (Field) concurrentHashMap.get(cls);
            if (field != null) {
                return field;
            }
            for (Class superclass = cls; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                Iterator<T> it = KavaReflector.declaredFields(superclass).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    Field field2 = (Field) next;
                    boolean z9 = false;
                    if (AbstractC1416l.m3825a(field2.getType(), TextView.class)) {
                        if (AbstractC1416l.m3825a(field2.getName(), "userTV") || AbstractC1416l.m3825a(field2.getName(), "brc")) {
                            z9 = true;
                        } else {
                            String name = field2.getName();
                            name.getClass();
                            if (AbstractC0255e.m1031t(name, Locale.ROOT, "user", false)) {
                            }
                        }
                    }
                    if (z9) {
                        break;
                    }
                }
                Field field3 = (Field) next;
                if (field3 != null) {
                    concurrentHashMap.put(cls, field3);
                    return field3;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0071  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m10767f(Class cls) {
        boolean z9 = false;
        if (cls == null) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.f24396g;
        Boolean bool = (Boolean) concurrentHashMap.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        if (AbstractC3156t.m6740d0(cls.getName(), "com.tencent.mm.storage.", false)) {
            z9 = true;
            break;
        }
        List<Method> listDeclaredMethods = KavaReflector.declaredMethods(cls);
        if (listDeclaredMethods == null || !listDeclaredMethods.isEmpty()) {
            for (Method method : listDeclaredMethods) {
                if (AbstractC1416l.m3825a(method.getReturnType(), String.class)) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    parameterTypes.getClass();
                    boolean z10 = parameterTypes.length == 0 && AbstractC4165l.m8378m0(new String[]{"R1", "P1", "o0", "x0", "j0", "getSender", "getSendTalker"}, method.getName());
                    if (z10) {
                        z9 = true;
                        break;
                    }
                }
            }
        }
        concurrentHashMap.put(cls, Boolean.valueOf(z9));
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m10768i(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (parameterTypes.length >= 3) {
            int length = parameterTypes.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (Boolean.valueOf(AbstractC1416l.m3825a(parameterTypes[i9], String.class)).booleanValue()) {
                    int length2 = parameterTypes.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length2) {
                            break;
                        }
                        if (!Boolean.valueOf(m10767f(parameterTypes[i10])).booleanValue()) {
                            i10++;
                        } else if (m10766d(parameterTypes[0]) != null) {
                            return true;
                        }
                    }
                } else {
                    i9++;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final void m10769l(TextView textView) {
        C0026c c0026cM284b = AbstractC0032i.m284b(textView);
        if (c0026cM284b != null) {
            AbstractC0032i.m288f(c0026cM284b).f85c = new C0030g();
            AbstractC0032i.m283a(c0026cM284b);
        }
        CharSequence text = textView.getText();
        if (text != null) {
            ThreadLocal threadLocal = this.f24397h;
            Object obj = threadLocal.get();
            Boolean bool = Boolean.TRUE;
            if (AbstractC1416l.m3825a(obj, bool)) {
                return;
            }
            try {
                threadLocal.set(bool);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
                m10763k(spannableStringBuilder);
                m10759e(spannableStringBuilder);
                textView.setText(spannableStringBuilder);
            } finally {
                threadLocal.set(Boolean.FALSE);
            }
        }
    }
}
