package bb;

import android.content.SharedPreferences;
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
import p000a.AbstractC0000a;
import p002a1.RunnableC0006d;
import p007a7.AbstractC0018a;
import p009a9.AbstractC0032i;
import p009a9.C0024a;
import p009a9.C0026c;
import p009a9.C0028e;
import p011ab.C0042b;
import p025bc.AbstractC0255e;
import p080fb.AbstractC1184v0;
import p086fh.C1253k;
import p096g8.C1360a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p115hh.C1731p;
import p127ib.C2034b;
import p136j8.AbstractC2091b;
import p210o8.C3086j;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p258r8.C3742g;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import p365y9.C6010f;
import p381zb.AbstractC6134c;
import tf.AbstractC4165l;
import tf.C4173t;

/* JADX INFO: renamed from: bb.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0245g {

    /* JADX INFO: renamed from: a */
    public final C3742g f651a;

    /* JADX INFO: renamed from: b */
    public final C0250l f652b;

    /* JADX INFO: renamed from: c */
    public final C2034b f653c;

    /* JADX INFO: renamed from: d */
    public final C0249k f654d;

    /* JADX INFO: renamed from: e */
    public final C0042b f655e;

    /* JADX INFO: renamed from: f */
    public final Map f656f;

    /* JADX INFO: renamed from: g */
    public final Map f657g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f658h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f659i;

    /* JADX INFO: renamed from: j */
    public final ThreadLocal f660j;

    /* JADX INFO: renamed from: k */
    public final SharedPreferences f661k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f662l;

    /* JADX INFO: renamed from: m */
    public C0240b f663m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0245g(C3742g c3742g, C0250l c0250l, C2034b c2034b, C0249k c0249k, C0042b c0042b) {
        c3742g.getClass();
        this.f651a = c3742g;
        this.f652b = c0250l;
        this.f653c = c2034b;
        this.f654d = c0249k;
        this.f655e = c0042b;
        this.f656f = AbstractC3199a.m6843p();
        this.f657g = AbstractC3199a.m6843p();
        this.f658h = new ConcurrentHashMap();
        this.f659i = new ConcurrentHashMap();
        this.f660j = new ThreadLocal();
        this.f661k = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_real_tail_method_cache");
    }

    /* JADX DEBUG: Class process forced to load method for inline: og.m.r0(java.lang.CharSequence, java.lang.String, int, boolean, int):int */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m974e(Object obj) {
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
                        C3147k c3147k = C0250l.f693c;
                        if (!AbstractC6134c.m10905b(strSubstring)) {
                            strSubstring = null;
                        }
                        if (strSubstring != null) {
                            str2 = strSubstring;
                        }
                    }
                    C3147k c3147k2 = C0250l.f693c;
                    if (AbstractC6134c.m10905b(str2)) {
                        return str2;
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m975i(TextView textView) {
        C0026c c0026cM284b = AbstractC0032i.m284b(textView);
        if (c0026cM284b != null) {
            AbstractC0032i.m288f(c0026cM284b).f84b = null;
            AbstractC0032i.m283a(c0026cM284b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m976j(TextView textView) {
        C0026c c0026cM284b = AbstractC0032i.m284b(textView);
        if (c0026cM284b != null) {
            AbstractC0032i.m288f(c0026cM284b).f86d = HttpUrl.FRAGMENT_ENCODE_SET;
            AbstractC0032i.m283a(c0026cM284b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m977l(String str) {
        C1360a c1360aAccount = WeChatApis.account();
        String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
        if (strM3652c == null) {
            strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return strM3652c.length() > 0 && strM3652c.equals(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m978a(String str) {
        C3086j c3086jTasks;
        String strM6839l = AbstractC3199a.m6839l(str, str);
        C3147k c3147k = C0250l.f693c;
        if (AbstractC6134c.m10905b(strM6839l) && (c3086jTasks = WeChatApis.tasks()) != null) {
            c3086jTasks.m6554e(new RunnableC0006d(this, 4, strM6839l));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m979b(TextView textView) {
        SharedPreferences sharedPreferences = this.f653c.f6870a;
        if (textView.getVisibility() != 0) {
            return;
        }
        C0026c c0026cM286d = AbstractC0032i.m286d(textView);
        C6010f c6010fM219G = AbstractC0018a.m219G(sharedPreferences.getString("nickname_color", HttpUrl.FRAGMENT_ENCODE_SET));
        C3147k c3147k = C0250l.f693c;
        int iM3198h = AbstractC1184v0.m3198h(sharedPreferences.getInt("nickname_weight", 400));
        AbstractC0032i.m288f(c0026cM286d).f84b = new C0024a(c6010fM219G, iM3198h);
        AbstractC0032i.m283a(c0026cM286d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:153:0x026d  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m980c(TextView textView, String str, String str2) {
        String strM3729r;
        String string;
        String strM9262f;
        int length;
        C3147k c3147k = C0250l.f693c;
        if (AbstractC6134c.m10905b(str)) {
            Map map = this.f657g;
            map.getClass();
            map.put(textView, str);
            String strM1003c = this.f652b.m1003c(str);
            if (strM1003c.length() == 0) {
                m976j(textView);
                return false;
            }
            boolean z9 = textView.getVisibility() != 0;
            if (z9) {
                textView.setVisibility(0);
            }
            C0026c c0026cM286d = AbstractC0032i.m286d(textView);
            CharSequence charSequenceM285c = AbstractC0032i.m285c(textView);
            if (z9) {
                charSequenceM285c = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceM285c);
            for (int i9 = 0; i9 < 4; i9++) {
                String string2 = spannableStringBuilder.toString();
                string2.getClass();
                int iMax = Math.max(AbstractC3149m.m6724w0(string2, '(', 0, 6), AbstractC3149m.m6724w0(string2, (char) 65288, 0, 6));
                if (iMax < 0 || iMax >= string2.length() - 2) {
                    break;
                }
                if (AbstractC3149m.m6722u0(string2) != (string2.charAt(iMax) == 65288 ? (char) 65289 : ')')) {
                    break;
                }
                String strM9262f2 = AbstractC4855en.m9262f(1, iMax + 1, string2);
                if (strM9262f2.length() == 0 || strM9262f2.length() > 64) {
                    break;
                }
                if (!AbstractC3149m.m6710i0(strM9262f2, '*') && !strM9262f2.equals(strM1003c) && !AbstractC3156t.m6740d0(strM9262f2, strM1003c.concat(" "), false)) {
                    String strM6702Q0 = AbstractC3149m.m6702Q0(1, strM1003c);
                    if ((strM6702Q0.length() <= 0 || !AbstractC3156t.m6733W(strM9262f2, strM6702Q0, false)) && !AbstractC3149m.m6709h0(strM9262f2, " 男", false) && !AbstractC3149m.m6709h0(strM9262f2, " 女", false)) {
                        break;
                    }
                }
                spannableStringBuilder.delete(iMax, spannableStringBuilder.length());
            }
            if (!AbstractC3149m.m6721t0(str2)) {
                String string3 = spannableStringBuilder.toString();
                string3.getClass();
                int iMax2 = Math.max(AbstractC3149m.m6724w0(string3, '(', 0, 6), AbstractC3149m.m6724w0(string3, (char) 65288, 0, 6));
                if (iMax2 >= 0 && iMax2 < string3.length() - 2) {
                    if (AbstractC3149m.m6722u0(string3) == (string3.charAt(iMax2) == 65288 ? (char) 65289 : ')')) {
                        String strM9262f3 = AbstractC4855en.m9262f(1, iMax2 + 1, string3);
                        if (strM9262f3.length() != 0 && strM9262f3.length() <= 16) {
                            String strM6702Q02 = AbstractC3149m.m6702Q0(1, str2);
                            if (strM9262f3.equals(str2) || (strM6702Q02.length() > 0 && AbstractC3156t.m6733W(strM9262f3, strM6702Q02, false))) {
                                spannableStringBuilder.delete(iMax2, spannableStringBuilder.length());
                            }
                        }
                    }
                }
            }
            for (int i10 = 0; i10 < 4; i10++) {
                String string4 = spannableStringBuilder.toString();
                string4.getClass();
                int iMax3 = Math.max(AbstractC3149m.m6724w0(string4, '(', 0, 6), AbstractC3149m.m6724w0(string4, (char) 65288, 0, 6));
                if (iMax3 < 0 || iMax3 >= string4.length() - 2) {
                    break;
                }
                if (AbstractC3149m.m6722u0(string4) != (string4.charAt(iMax3) == 65288 ? (char) 65289 : ')') || 1 > (length = (strM9262f = AbstractC4855en.m9262f(1, iMax3 + 1, string4)).length()) || length >= 17 || !AbstractC3149m.m6710i0(strM9262f, '*')) {
                    break;
                }
                spannableStringBuilder.delete(iMax3, spannableStringBuilder.length());
            }
            boolean z10 = false;
            int i11 = 0;
            while (i11 < spannableStringBuilder.length()) {
                char cCharAt = spannableStringBuilder.charAt(i11);
                if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t' && cCharAt != ' ' && cCharAt != 12288) {
                    i11++;
                    z10 = false;
                } else if (z10) {
                    spannableStringBuilder.delete(i11, i11 + 1);
                } else {
                    int i12 = i11 + 1;
                    spannableStringBuilder.replace(i11, i12, (CharSequence) " ");
                    i11 = i12;
                    z10 = true;
                }
            }
            while (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            while (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            String string5 = spannableStringBuilder.toString();
            string5.getClass();
            String string6 = AbstractC3149m.m6703R0(string5).toString();
            if (string6.length() <= 0) {
                C1368i c1368iM9259c = AbstractC4855en.m9259c();
                if (c1368iM9259c == null || (strM3729r = c1368iM9259c.m3729r(str)) == null || (string = AbstractC3149m.m6703R0(strM3729r).toString()) == null) {
                    string6 = " ";
                } else {
                    string6 = AbstractC2091b.m5161h("\\s+", string, " ");
                    if (AbstractC3149m.m6721t0(string6) || AbstractC3156t.m6740d0(string6, "微信用户(", false) || AbstractC3156t.m6740d0(string6, "微信用户（", false)) {
                        string6 = null;
                    }
                    if (string6 == null) {
                    }
                }
            }
            if (AbstractC3156t.m6740d0(string6, "微信用户(", false) || AbstractC3156t.m6740d0(string6, "微信用户（", false)) {
                AbstractC0032i.m288f(c0026cM286d).f86d = HttpUrl.FRAGMENT_ENCODE_SET;
                AbstractC0032i.m283a(c0026cM286d);
                return false;
            }
            if (!AbstractC1416l.m3825a(spannableStringBuilder.toString(), string6)) {
                spannableStringBuilder.clear();
                spannableStringBuilder.append((CharSequence) string6);
            }
            ThreadLocal threadLocal = this.f660j;
            Object obj = threadLocal.get();
            Boolean bool = Boolean.TRUE;
            if (!AbstractC1416l.m3825a(obj, bool)) {
                try {
                    threadLocal.set(bool);
                    ArrayList arrayListM982f = m982f(str, strM1003c);
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
                    AbstractC0032i.m288f(c0026cM286d).f86d = m981d(arrayListM982f);
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
    /* JADX INFO: renamed from: d */
    public final SpannableStringBuilder m981d(ArrayList arrayList) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C0250l c0250l = this.f652b;
        C6010f c6010fM1002b = c0250l.m1002b("bracket_color");
        int iM1006f = c0250l.m1006f("bracket_weight");
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) "(");
        spannableStringBuilder.setSpan(new C0028e(c6010fM1002b, iM1006f), length, spannableStringBuilder.length(), 33);
        int i9 = 0;
        for (Object obj : arrayList) {
            int i10 = i9 + 1;
            if (i9 < 0) {
                AbstractC0000a.m32Q0();
                throw null;
            }
            C0244f c0244f = (C0244f) obj;
            if (i9 > 0) {
                spannableStringBuilder.append((CharSequence) " ");
            }
            int length2 = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) c0244f.f648a);
            spannableStringBuilder.setSpan(new C0028e(c0244f.f649b, c0244f.f650c), length2, spannableStringBuilder.length(), 33);
            i9 = i10;
        }
        int length3 = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ")");
        spannableStringBuilder.setSpan(new C0028e(c6010fM1002b, iM1006f), length3, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final ArrayList m982f(String str, String str2) {
        C0240b c0240b;
        String strM3737z;
        String string;
        C0240b c0240b2;
        C0250l c0250l = this.f652b;
        ArrayList arrayListM5C0 = AbstractC0000a.m5C0(new C0244f(str2, c0250l.m1002b("tail_color"), c0250l.m1006f("tail_weight")));
        SharedPreferences sharedPreferences = c0250l.f694a;
        if (sharedPreferences.getBoolean("show_gender", false)) {
            C1368i c1368iM9259c = AbstractC4855en.m9259c();
            String strM1004d = c0250l.m1004d(c1368iM9259c != null ? c1368iM9259c.m3730s(str) : 0);
            String str3 = strM1004d.length() > 0 ? strM1004d : null;
            if (str3 != null) {
                arrayListM5C0.add(new C0244f(str3, c0250l.m1002b("gender_color"), c0250l.m1006f("gender_weight")));
            }
            if (strM1004d.length() == 0 && (c0240b2 = this.f663m) != null) {
                c0240b2.m965j(str);
            }
        }
        if (sharedPreferences.getBoolean("show_region", false)) {
            C1368i c1368iM9259c2 = AbstractC4855en.m9259c();
            String strM5161h = (c1368iM9259c2 == null || (strM3737z = c1368iM9259c2.m3737z(str)) == null || (string = AbstractC3149m.m6703R0(strM3737z).toString()) == null) ? null : AbstractC2091b.m5161h("\\s+", string, " ");
            if (strM5161h == null) {
                strM5161h = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String str4 = strM5161h.length() > 0 ? strM5161h : null;
            if (str4 != null) {
                arrayListM5C0.add(new C0244f(str4, c0250l.m1002b("region_color"), c0250l.m1006f("region_weight")));
            }
            if (strM5161h.length() == 0 && (c0240b = this.f663m) != null) {
                c0240b.m965j(str);
            }
        }
        return arrayListM5C0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:30:0x0052 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: g */
    public final List m983g(String... strArr) {
        Object c3959f;
        Object c3959f2;
        C3742g c3742g = this.f651a;
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
            this.f655e.invoke("实名尾字定位方法失败", thM8182b);
            obj = C4173t.f13710g;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Field m984h(Class cls) {
        Object next;
        if (cls != null) {
            ConcurrentHashMap concurrentHashMap = this.f658h;
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
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m985k(Class cls) {
        boolean z9 = false;
        if (cls == null) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.f659i;
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
    /* JADX INFO: renamed from: m */
    public final boolean m986m(Method method) {
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
                        if (!Boolean.valueOf(m985k(parameterTypes[i10])).booleanValue()) {
                            i10++;
                        } else if (m984h(parameterTypes[0]) != null) {
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
}
