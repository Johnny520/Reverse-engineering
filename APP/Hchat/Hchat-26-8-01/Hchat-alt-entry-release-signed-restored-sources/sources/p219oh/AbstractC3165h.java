package p219oh;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.accessibility.AccessibilityNodeInfo;
import ba.C0226f;
import bi.AbstractC0316d;
import bi.C0314b;
import bsh.C0353j;
import bsh.org.objectweb.asm.Opcodes;
import ch.C0570e;
import gf.C1402a;
import gg.AbstractC1416l;
import java.io.File;
import java.lang.reflect.Method;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import md.C2825b;
import md.EnumC2824a;
import nc.C2958a;
import okhttp3.HttpUrl;
import okhttp3.internal.p221ws.WebSocketProtocol;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p012ah.C0086a;
import p014b.C0127f;
import p015b0.C0152r;
import p020b5.C0184c;
import p025bc.AbstractC0255e;
import p028c1.C0372b;
import p028c1.C0374d;
import p029c2.InterfaceC0389a;
import p046d6.C0709f;
import p054dg.C0784c;
import p057e1.C0807b;
import p057e1.C0808c;
import p068eh.AbstractC0921a;
import p069f.AbstractC0959s0;
import p069f.C0945l0;
import p071f1.AbstractC0995c;
import p071f1.AbstractC0996c0;
import p071f1.AbstractC1004g0;
import p071f1.AbstractC1013l;
import p071f1.C0993b;
import p071f1.C1003g;
import p071f1.C1005h;
import p071f1.C1009j;
import p071f1.C1010j0;
import p071f1.C1012k0;
import p071f1.C1014l0;
import p071f1.C1017n;
import p071f1.C1034w;
import p071f1.InterfaceC1031u;
import p072f2.AbstractC1052o;
import p072f2.AbstractC1058u;
import p072f2.C1041d;
import p072f2.C1054q;
import p073f4.C1064a;
import p080fb.AbstractC1184v0;
import p080fb.C1128h0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p086fh.C1253k;
import p092g4.AbstractC1341a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p100h0.AbstractC1522h0;
import p100h0.C1512e;
import p100h0.C1515f;
import p100h0.C1530k;
import p100h0.InterfaceC1533l;
import p101h1.C1564a;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p103h3.C1578g;
import p104h4.AbstractC1605s;
import p104h4.C1587a;
import p104h4.C1588b;
import p104h4.C1590d;
import p104h4.C1592f;
import p104h4.C1593g;
import p104h4.C1603q;
import p104h4.C1607u;
import p108ha.C1635c0;
import p108ha.EnumC1637d0;
import p115hh.C1730o;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.C1873q1;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p118i1.C1902b;
import p118i1.InterfaceC1904d;
import p121i4.C1957a;
import p121i4.C1959b;
import p121i4.C1961c;
import p121i4.C1972m;
import p121i4.C1985z;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p141jf.C2132h;
import p149k4.C2240b;
import p150k5.C2270u;
import p154k9.C2366j;
import p162l3.C2469w;
import p163l4.C2475d;
import p163l4.InterfaceC2473b;
import p167l8.C2534i;
import p173lh.C2570d;
import p179m4.C2779b;
import p185mb.C2822a;
import p192n4.C2893a;
import p193n5.C2894a;
import p193n5.C2895b;
import p193n5.C2896c;
import p193n5.C2897d;
import p193n5.C2898e;
import p193n5.C2899f;
import p193n5.C2900g;
import p199nd.C2984p;
import p206o4.C3044a;
import p206o4.C3045b;
import p210o8.C3087k;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p222p.AbstractC3208d;
import p222p.AbstractC3210d1;
import p222p.AbstractC3222h1;
import p222p.C3205c;
import p222p.C3213e1;
import p222p.C3255s1;
import p227p4.C3315t;
import p227p4.C3320y;
import p230p8.C3351d0;
import p233pd.C3392c;
import p233pd.C3393d;
import p233pd.EnumC3400k;
import p245qc.C3494d;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3510n;
import p255r4.AbstractC3665d;
import p255r4.C3661b;
import p255r4.C3667e;
import p255r4.C3669f;
import p255r4.C3670f0;
import p255r4.C3671g;
import p255r4.C3674h0;
import p255r4.C3678j0;
import p255r4.C3679k;
import p255r4.C3684m0;
import p255r4.C3689p;
import p255r4.C3693r;
import p255r4.C3697t;
import p255r4.C3699u;
import p255r4.C3703w;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p280t2.EnumC4094j;
import p282t4.C4114a;
import p282t4.C4115b;
import p282t4.C4116c;
import p282t4.C4117d;
import p292u1.AbstractC4229a;
import p293u2.C4236f;
import p293u2.C4238h;
import p293u2.C4241k;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p300ub.AbstractC4302b;
import p302ud.C4305a;
import p302ud.C4320p;
import p304uf.C4329c;
import p311v4.AbstractC4446a;
import p311v4.AbstractC4454e;
import p311v4.AbstractC4457f0;
import p311v4.C4447a0;
import p311v4.C4448b;
import p311v4.C4449b0;
import p311v4.C4450c;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4455e0;
import p311v4.C4456f;
import p311v4.C4458g;
import p311v4.C4459h;
import p311v4.C4460i;
import p311v4.C4461j;
import p311v4.C4463l;
import p311v4.C4464m;
import p311v4.C4466o;
import p311v4.C4467p;
import p311v4.C4468q;
import p311v4.C4475x;
import p311v4.C4476y;
import p311v4.C4477z;
import p324w2.AbstractC4679a;
import p326w4.C4681a;
import p326w4.C4682b;
import p326w4.C4683c;
import p332wb.AbstractC4855en;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5615j;
import p339x1.AbstractC5618k;
import p339x1.C5587b1;
import p339x1.C5601f;
import p339x1.C5602f0;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p339x1.InterfaceC5612i;
import p352xf.EnumC5799a;
import p354xh.AbstractC5824i;
import p354xh.C5827l;
import p354xh.C5832q;
import p356y0.AbstractC5839a;
import p356y0.AbstractC5852n;
import p356y0.C5840b;
import p356y0.C5842d;
import p356y0.C5850l;
import p356y0.InterfaceC5841c;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.InterfaceC5905l2;
import p358y2.AbstractC5978m;
import p358y2.C5967c0;
import p358y2.EnumC5969d0;
import p370yf.AbstractC6038c;
import p376z4.C6098l;
import pg.AbstractC3414a;
import pg.AbstractC3415b;
import pg.EnumC3416c;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;
import ua.C4292c;
import ua.C4298i;

/* JADX INFO: renamed from: oh.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3165h {

    /* JADX INFO: renamed from: a */
    public static C3164g f10228a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f10229b = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final int m6749A(int i9, int i10, int i11) {
        if (i11 > 0) {
            if (i9 < i10) {
                int i12 = i10 % i11;
                if (i12 < 0) {
                    i12 += i11;
                }
                int i13 = i9 % i11;
                if (i13 < 0) {
                    i13 += i11;
                }
                int i14 = (i12 - i13) % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
                return i10 - i14;
            }
        } else {
            if (i11 >= 0) {
                C2104o.m5294t("Step is zero.");
                return 0;
            }
            if (i9 > i10) {
                int i15 = -i11;
                int i16 = i9 % i15;
                if (i16 < 0) {
                    i16 += i15;
                }
                int i17 = i10 % i15;
                if (i17 < 0) {
                    i17 += i15;
                }
                int i18 = (i16 - i17) % i15;
                if (i18 < 0) {
                    i18 += i15;
                }
                return i18 + i10;
            }
        }
        return i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static void m6750B(Method method, ClassLoader classLoader) {
        ClassLoader classLoader2 = method.getDeclaringClass().getClassLoader();
        if (classLoader2 != null) {
            classLoader = classLoader2;
        }
        String strM6761M = m6761M(classLoader);
        synchronized (C2822a.class) {
            HashSet hashSet = C2822a.f9114f;
            if (hashSet.contains(strM6761M)) {
                return;
            }
            C3744i.f12154b.m7763b(method, new C0226f(18));
            hashSet.add(strM6761M);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static void m6751C(Method method, ClassLoader classLoader) {
        ClassLoader classLoader2 = method.getDeclaringClass().getClassLoader();
        if (classLoader2 != null) {
            classLoader = classLoader2;
        }
        String strM6761M = m6761M(classLoader);
        synchronized (C2822a.class) {
            HashSet hashSet = C2822a.f9113e;
            if (hashSet.contains(strM6761M)) {
                return;
            }
            C3744i.f12154b.m7763b(method, new C0226f(19));
            hashSet.add(strM6761M);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static void m6752D(DexKitBridge dexKitBridge, ClassLoader classLoader, Context context) {
        DexKitBridge dexKitBridge2;
        ClassLoader classLoader2;
        Context context2;
        Method methodM6797x;
        Method methodM6797x2;
        if (context == null || classLoader == null || dexKitBridge == null || !m6754F(context)) {
            return;
        }
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_wechat_tablet_cache");
        String strM6786m = m6786m(context, classLoader);
        boolean zM6756H = m6756H(classLoader);
        if (zM6756H) {
            dexKitBridge2 = dexKitBridge;
            classLoader2 = classLoader;
            methodM6797x = null;
            context2 = context;
        } else {
            dexKitBridge2 = dexKitBridge;
            classLoader2 = classLoader;
            context2 = context;
            methodM6797x = m6797x(context2, sharedPreferencesM8640c, strM6786m, dexKitBridge2, classLoader2, "pad_method", "Lenovo TB-9707F");
        }
        if (!zM6756H && methodM6797x == null) {
            AbstractC1184v0.m3203m("[Hchat:Tablet] 安装失败: 未定位平板检测方法");
            return;
        }
        if (methodM6797x != null) {
            m6751C(methodM6797x, classLoader2);
        }
        if (m6755G(classLoader2) || (methodM6797x2 = m6797x(context2, sharedPreferencesM8640c, strM6786m, dexKitBridge2, classLoader2, "login_button_method", "loginAsOtherDeviceBtn")) == null) {
            return;
        }
        m6750B(methodM6797x2, classLoader2);
        m6766R(sharedPreferencesM8640c, strM6786m, "login_button_method", methodM6797x2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static boolean m6753E(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
        C4305a c4305a = null;
        for (C4305a c4305a2 : linkedHashMap.keySet()) {
            if (c4305a != null && !c4305a2.equals(c4305a)) {
                return true;
            }
            c4305a = (C4305a) linkedHashMap2.get(c4305a2);
        }
        return c4305a != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m6754F(Context context) {
        if (context == null) {
            return false;
        }
        return AbstractC4302b.m8640c(context, "Hchat_wechat_tablet_config").getBoolean("tablet_enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static boolean m6755G(ClassLoader classLoader) {
        boolean zContains;
        synchronized (C2822a.class) {
            zContains = C2822a.f9114f.contains(m6761M(classLoader));
        }
        return zContains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m6756H(ClassLoader classLoader) {
        boolean zContains;
        synchronized (C2822a.class) {
            zContains = C2822a.f9113e.contains(m6761M(classLoader));
        }
        return zContains;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m6757I(ArrayList arrayList) {
        if (arrayList.size() >= 4) {
            C3494d c3494d = (C3494d) ((C2958a) arrayList.get(0)).f9705h;
            if (c3494d.m7337b() == 5) {
                C2132h c2132hM7336a = c3494d.m7336a();
                if (c2132hM7336a.f7115b.equals("makeConcatWithConstants") && c2132hM7336a.f7116c.equals("Ljava/lang/invoke/StringConcatFactory;") && Objects.equals(((C2958a) arrayList.get(1)).f9705h, "makeConcatWithConstants") && ((C2958a) arrayList.get(3)).f9704g == 10) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static String m6758J(String str) {
        String string;
        String strM6704S0;
        Object c3959f;
        String unsignedString;
        if (str == null || (string = AbstractC3149m.m6703R0(str).toString()) == null || (strM6704S0 = AbstractC3149m.m6704S0(string, '\'', '\"')) == null) {
            return null;
        }
        if (!(strM6704S0.length() > 0)) {
            strM6704S0 = null;
        }
        if (strM6704S0 == null) {
            return null;
        }
        Long lM6743g0 = AbstractC3156t.m6743g0(strM6704S0);
        if (lM6743g0 != null && (unsignedString = Long.toUnsignedString(lM6743g0.longValue())) != null) {
            return unsignedString;
        }
        try {
            c3959f = Long.valueOf(Long.parseUnsignedLong(strM6704S0));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        Long l10 = (Long) c3959f;
        if (l10 != null) {
            return Long.toUnsignedString(l10.longValue());
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static Method m6759K(SharedPreferences sharedPreferences, String str, ClassLoader classLoader, String str2) {
        String string;
        Object c3959f;
        if (str.length() == 0 || !AbstractC1416l.m3825a(sharedPreferences.getString("cache_key", HttpUrl.FRAGMENT_ENCODE_SET), str) || (string = sharedPreferences.getString(str2, HttpUrl.FRAGMENT_ENCODE_SET)) == null) {
            return null;
        }
        if (!(string.length() > 0)) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            c3959f = new C2570d(string).m6023b(classLoader);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        return (Method) (c3959f instanceof C3959f ? null : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static List m6760L(Context context) {
        Object c3959f;
        String string;
        Object c3959f2;
        Object c3959f3;
        Object c3959f4;
        context.getClass();
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "floating_shortcut_menu");
        if (!sharedPreferencesM8640c.getBoolean("legacy_agent_settings_migrated_v1", false)) {
            SharedPreferences sharedPreferencesM8640c2 = AbstractC4302b.m8640c(context, "agent_floating_window");
            SharedPreferences.Editor editorEdit = sharedPreferencesM8640c.edit();
            try {
                c3959f2 = Boolean.valueOf(sharedPreferencesM8640c2.getBoolean("enable", false));
            } catch (Throwable th2) {
                c3959f2 = new C3959f(th2);
            }
            Object obj = Boolean.FALSE;
            if (c3959f2 instanceof C3959f) {
                c3959f2 = obj;
            }
            if (((Boolean) c3959f2).booleanValue() && !sharedPreferencesM8640c.contains("enable")) {
                editorEdit.putBoolean("enable", true);
                if (!sharedPreferencesM8640c.contains("scope")) {
                    editorEdit.putString("scope", "all");
                }
            }
            if (sharedPreferencesM8640c2.contains("position_x") && !sharedPreferencesM8640c.contains("position_x")) {
                try {
                    c3959f4 = Float.valueOf(sharedPreferencesM8640c2.getFloat("position_x", 1.0f));
                } catch (Throwable th3) {
                    c3959f4 = new C3959f(th3);
                }
                Object objValueOf = Float.valueOf(1.0f);
                if (c3959f4 instanceof C3959f) {
                    c3959f4 = objValueOf;
                }
                editorEdit.putFloat("position_x", AbstractC3754e0.m7907q(((Number) c3959f4).floatValue(), 0.0f, 1.0f));
            }
            if (sharedPreferencesM8640c2.contains("position_y") && !sharedPreferencesM8640c.contains("position_y")) {
                try {
                    c3959f3 = Float.valueOf(sharedPreferencesM8640c2.getFloat("position_y", 0.46f));
                } catch (Throwable th4) {
                    c3959f3 = new C3959f(th4);
                }
                Object objValueOf2 = Float.valueOf(0.46f);
                if (c3959f3 instanceof C3959f) {
                    c3959f3 = objValueOf2;
                }
                editorEdit.putFloat("position_y", AbstractC3754e0.m7907q(((Number) c3959f3).floatValue(), 0.0f, 1.0f));
            }
            editorEdit.putBoolean("legacy_agent_settings_migrated_v1", true).apply();
        }
        String string2 = sharedPreferencesM8640c.getString("items", null);
        if (string2 == null || AbstractC3149m.m6721t0(string2)) {
            sharedPreferencesM8640c.edit().putBoolean("agent_item_migrated_v1", true).apply();
            return m6792s();
        }
        try {
            JSONArray jSONArray = new JSONArray(string2);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    strOptString.getClass();
                    String string3 = AbstractC3149m.m6703R0(strOptString).toString();
                    String strOptString2 = jSONObjectOptJSONObject.optString("title");
                    strOptString2.getClass();
                    String string4 = AbstractC3149m.m6703R0(strOptString2).toString();
                    String strOptString3 = jSONObjectOptJSONObject.optString("actionType", "activity");
                    strOptString3.getClass();
                    String string5 = AbstractC3149m.m6703R0(strOptString3).toString();
                    if (AbstractC1416l.m3825a(string5, "activity")) {
                        String strOptString4 = jSONObjectOptJSONObject.optString("target");
                        strOptString4.getClass();
                        string = AbstractC3149m.m6703R0(strOptString4).toString();
                    } else {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String str = string;
                    if (string3.length() != 0 && string4.length() != 0 && ((AbstractC1416l.m3825a(string5, "activity") || AbstractC1416l.m3825a(string5, "module_settings") || AbstractC1416l.m3825a(string5, "plugin_agent")) && (!AbstractC1416l.m3825a(string5, "activity") || str.length() != 0))) {
                        String strOptString5 = jSONObjectOptJSONObject.optString("iconPath");
                        strOptString5.getClass();
                        String string6 = AbstractC3149m.m6703R0(strOptString5).toString();
                        String strOptString6 = jSONObjectOptJSONObject.optString("darkIconPath");
                        strOptString6.getClass();
                        c4329cM7E.add(new C2366j(string3, string4, string5, str, string6, AbstractC3149m.m6703R0(strOptString6).toString(), jSONObjectOptJSONObject.optBoolean("enabled", true)));
                    }
                }
            }
            c3959f = AbstractC0000a.m90t(c4329cM7E);
        } catch (Throwable th5) {
            c3959f = new C3959f(th5);
        }
        Object objM6792s = m6792s();
        if (c3959f instanceof C3959f) {
            c3959f = objM6792s;
        }
        List listM8397F1 = (List) c3959f;
        if (sharedPreferencesM8640c.getBoolean("agent_item_migrated_v1", false)) {
            return listM8397F1;
        }
        if (listM8397F1 == null || !listM8397F1.isEmpty()) {
            Iterator it = listM8397F1.iterator();
            while (it.hasNext()) {
                if (AbstractC1416l.m3825a(((C2366j) it.next()).f7774c, "plugin_agent")) {
                    break;
                }
            }
            listM8397F1 = AbstractC4166m.m8397F1(AbstractC0000a.m99x0(new C2366j("plugin_agent", "插件 Agent", "plugin_agent", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true)), listM8397F1);
        } else {
            listM8397F1 = AbstractC4166m.m8397F1(AbstractC0000a.m99x0(new C2366j("plugin_agent", "插件 Agent", "plugin_agent", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true)), listM8397F1);
        }
        sharedPreferencesM8640c.edit().putString("items", m6796w(listM8397F1).toString()).putBoolean("agent_item_migrated_v1", true).apply();
        return listM8397F1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static String m6761M(ClassLoader classLoader) {
        return System.identityHashCode(classLoader) + ":" + classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static AbstractC0000a m6762N(C2270u c2270u, int i9, int i10) {
        switch (i9) {
            case 0:
                return new C2899f(c2270u, i10);
            case 1:
                return new C2900g(c2270u, i10);
            case 2:
                return new C2895b(c2270u, i10);
            case 3:
                return new C2898e(c2270u, i10);
            case 4:
                return new C2897d(c2270u, i10);
            case 5:
                return new C2894a(c2270u, i10);
            case 6:
                return new C2896c(c2270u, i10);
            default:
                throw new C0709f(null, "Invalid reference type: %d", Integer.valueOf(i9));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static Set m6763O(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{',', '|', ';', '\n', 65292, 65307}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return AbstractC4166m.m8412U1(arrayList2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static void m6764P(String str, C4320p c4320p, ArrayList arrayList, C1402a c1402a) {
        AbstractC3508l abstractC3508lM7372Z;
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(length);
        int i9 = 4;
        int iCharCount = 0;
        int i10 = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            iCharCount += Character.charCount(iCodePointAt);
            boolean z9 = iCodePointAt == 1;
            boolean z10 = iCodePointAt == 2;
            if (z9 || z10) {
                if (sb2.length() != 0) {
                    c4320p.mo7178I(AbstractC3508l.m7372Z(new C3393d(sb2.toString())));
                    sb2.setLength(0);
                }
                if (z9) {
                    c4320p.mo7178I(AbstractC3508l.m7370U(c1402a, i10, AbstractC3506j.f11404u));
                    i10++;
                } else {
                    int i11 = i9 + 1;
                    C2958a c2958a = (C2958a) arrayList.get(i9);
                    Object objM250n = AbstractC0018a.m250n(c2958a);
                    if (objM250n == null) {
                        abstractC3508lM7372Z = AbstractC3508l.m7368S(0L, AbstractC3506j.f11404u);
                    } else if (objM250n instanceof C3510n) {
                        abstractC3508lM7372Z = (C3510n) objM250n;
                    } else if (objM250n instanceof AbstractC3506j) {
                        abstractC3508lM7372Z = AbstractC3508l.m7372Z(new C3392c((AbstractC3506j) objM250n));
                    } else {
                        if (!(objM250n instanceof String)) {
                            C0086a.m452k("Can't build insn arg from encoded value: ".concat(String.valueOf(c2958a)));
                            return;
                        }
                        abstractC3508lM7372Z = AbstractC3508l.m7372Z(new C3393d((String) objM250n));
                    }
                    c4320p.mo7178I(abstractC3508lM7372Z);
                    i9 = i11;
                }
            } else {
                sb2.appendCodePoint(iCodePointAt);
            }
        }
        if (sb2.length() != 0) {
            c4320p.mo7178I(AbstractC3508l.m7372Z(new C3393d(sb2.toString())));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static final C4241k m6765Q(C0808c c0808c) {
        return new C4241k(Math.round(c0808c.f2416a), Math.round(c0808c.f2417b), Math.round(c0808c.f2418c), Math.round(c0808c.f2419d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static void m6766R(SharedPreferences sharedPreferences, String str, String str2, Method method) {
        StringBuilder sb2 = new StringBuilder("L");
        String strReplace = method.getDeclaringClass().getName().replace('.', '/');
        strReplace.getClass();
        sb2.append(strReplace);
        sb2.append(";->");
        sb2.append(method.getName());
        sb2.append('(');
        Class<?>[] parameterTypes = method.getParameterTypes();
        parameterTypes.getClass();
        for (Class<?> cls : parameterTypes) {
            HashSet hashSet = C2822a.f9113e;
            cls.getClass();
            sb2.append(m6771W(cls));
        }
        sb2.append(')');
        HashSet hashSet2 = C2822a.f9113e;
        Class<?> returnType = method.getReturnType();
        returnType.getClass();
        sb2.append(m6771W(returnType));
        m6767S(sharedPreferences, str, str2, sb2.toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public static void m6767S(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        if (str.length() == 0 || str3 == null || str3.length() == 0) {
            return;
        }
        try {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (!AbstractC1416l.m3825a(sharedPreferences.getString("cache_key", HttpUrl.FRAGMENT_ENCODE_SET), str)) {
                editorEdit.clear();
            }
            editorEdit.putString("cache_key", str).putString(str2, str3).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: f2.q.j(int, f2.q):java.util.List */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static final void m6768T(C1054q c1054q, C1578g c1578g) {
        Object objM2320g = c1054q.m2659k().f3341g.m2320g(AbstractC1058u.f3382g);
        if (objM2320g == null) {
            objM2320g = null;
        }
        if (objM2320g != null) {
            C0086a.m445d();
            return;
        }
        C1054q c1054qM2660l = c1054q.m2660l();
        if (c1054qM2660l == null) {
            return;
        }
        Object objM2320g2 = c1054qM2660l.m2659k().f3341g.m2320g(AbstractC1058u.f3380e);
        if (objM2320g2 == null) {
            objM2320g2 = null;
        }
        if (objM2320g2 != null) {
            Object objM2320g3 = c1054qM2660l.m2659k().f3341g.m2320g(AbstractC1058u.f3381f);
            C1041d c1041d = (C1041d) (objM2320g3 != null ? objM2320g3 : null);
            if (c1041d == null || (c1041d.f3274a >= 0 && c1041d.f3275b >= 0)) {
                if (c1054q.m2659k().f3341g.m2316c(AbstractC1058u.f3368I)) {
                    ArrayList arrayList = new ArrayList();
                    List listM2649j = C1054q.m2649j(4, c1054qM2660l);
                    int size = listM2649j.size();
                    int i9 = 0;
                    for (int i10 = 0; i10 < size; i10++) {
                        C1054q c1054q2 = (C1054q) listM2649j.get(i10);
                        if (c1054q2.m2659k().f3341g.m2316c(AbstractC1058u.f3368I)) {
                            arrayList.add(c1054q2);
                            if (c1054q2.f3349c.m10050v() < c1054q.f3349c.m10050v()) {
                                i9++;
                            }
                        }
                    }
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    boolean zM6787n = m6787n(arrayList);
                    int i11 = zM6787n ? 0 : i9;
                    int i12 = zM6787n ? i9 : 0;
                    Object objM2320g4 = c1054q.m2659k().f3341g.m2320g(AbstractC1058u.f3368I);
                    if (objM2320g4 == null) {
                        objM2320g4 = Boolean.FALSE;
                    }
                    c1578g.f5248a.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, 1, i12, 1, false, ((Boolean) objM2320g4).booleanValue()));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static void m6769U(JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("2");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        String strOptString = jSONObjectOptJSONObject.optString("4");
        try {
            Class<?> cls = Class.forName("com.tencent.mmkv.MMKV");
            Object objInvoke = cls.getDeclaredMethod("decodeLong", String.class, Long.TYPE).invoke(cls.getDeclaredMethod("mmkvWithID", String.class, Integer.TYPE).invoke(null, "db_max_id_record", 2), "msg.message", 0L);
            long jLongValue = objInvoke instanceof Number ? ((Number) objInvoke).longValue() : 0L;
            jCurrentTimeMillis = 1;
            if (jLongValue != 0) {
                jCurrentTimeMillis = jLongValue == 1000000 ? 10000000L : jLongValue == 90000000 ? 500000001L : 1 + jLongValue;
            }
        } catch (Throwable unused) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        String str = strOptString + jCurrentTimeMillis + "T" + jCurrentTimeMillis2;
        jSONObjectOptJSONObject.put("8", str);
        int i9 = (int) (jCurrentTimeMillis2 / 1000);
        jSONObjectOptJSONObject.put("7", i9);
        jSONObject.put("7", str);
        jSONObject.put("4", i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static final C0784c m6770V(File file) {
        int length;
        List list;
        int iM6718q0;
        file.getClass();
        String path = file.getPath();
        path.getClass();
        char c10 = File.separatorChar;
        int iM6718q02 = AbstractC3149m.m6718q0(path, c10, 0, 4);
        if (iM6718q02 != 0) {
            length = (iM6718q02 <= 0 || path.charAt(iM6718q02 + (-1)) != ':') ? (iM6718q02 == -1 && AbstractC3149m.m6713l0(path, ':')) ? path.length() : 0 : iM6718q02 + 1;
        } else if (path.length() <= 1 || path.charAt(1) != c10 || (iM6718q0 = AbstractC3149m.m6718q0(path, c10, 2, 4)) < 0) {
            length = 1;
        } else {
            int iM6718q03 = AbstractC3149m.m6718q0(path, c10, iM6718q0 + 1, 4);
            length = iM6718q03 >= 0 ? iM6718q03 + 1 : path.length();
        }
        String strSubstring = path.substring(0, length);
        String strSubstring2 = path.substring(length);
        if (strSubstring2.length() == 0) {
            list = C4173t.f13710g;
        } else {
            List listM6691F0 = AbstractC3149m.m6691F0(strSubstring2, new char[]{c10}, 6);
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
            Iterator it = listM6691F0.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            list = arrayList;
        }
        return new C0784c(new File(strSubstring), list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static String m6771W(Class cls) {
        if (cls.isPrimitive()) {
            return cls.equals(Void.TYPE) ? "V" : cls.equals(Boolean.TYPE) ? "Z" : cls.equals(Byte.TYPE) ? "B" : cls.equals(Character.TYPE) ? "C" : cls.equals(Short.TYPE) ? "S" : cls.equals(Integer.TYPE) ? "I" : cls.equals(Long.TYPE) ? "J" : cls.equals(Float.TYPE) ? "F" : cls.equals(Double.TYPE) ? "D" : "V";
        }
        if (cls.isArray()) {
            String strReplace = cls.getName().replace('.', '/');
            strReplace.getClass();
            return strReplace;
        }
        String strReplace2 = cls.getName().replace('.', '/');
        strReplace2.getClass();
        return AbstractC0921a.m2251n("L", strReplace2, ";");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006d A[PHI: r4
  0x006d: PHI (r4v5 long) = (r4v3 long), (r4v4 long), (r4v4 long), (r4v4 long), (r4v4 long) binds: [B:31:0x006b, B:47:0x0099, B:50:0x009f, B:42:0x0085, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long m6772X(long j3, EnumC3416c enumC3416c) {
        long j4;
        TimeUnit timeUnit = enumC3416c.f11041g;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        long jConvert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-jConvert) <= j3 && j3 <= jConvert) {
            long jConvert2 = timeUnit2.convert(j3, timeUnit);
            C2469w c2469w = AbstractC3414a.f11034g;
            long j5 = jConvert2 << 1;
            int i9 = AbstractC3415b.f11037a;
            return j5;
        }
        if (enumC3416c.compareTo(EnumC3416c.MILLISECONDS) < 0) {
            return m6795v(AbstractC3754e0.m7911s(TimeUnit.MILLISECONDS.convert(j3, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long jSignum = Long.signum(j3);
        if (j3 < -9223372036854775807L) {
            j3 = -9223372036854775807L;
        }
        long jAbs = Math.abs(j3);
        int iOrdinal = enumC3416c.ordinal();
        long j10 = 0;
        if (iOrdinal == 2) {
            j4 = 1;
        } else if (iOrdinal == 3) {
            j4 = 1000;
        } else if (iOrdinal == 4) {
            j4 = 60000;
        } else if (iOrdinal == 5) {
            j4 = 3600000;
        } else {
            if (iOrdinal != 6) {
                C3193a.m6826p(enumC3416c, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j4 = 86400000;
        }
        if (jAbs == 0) {
            jAbs = j10;
        } else {
            j10 = 4611686018427387903L;
            if (jAbs == 1) {
                if (j4 <= 4611686018427387903L) {
                    jAbs = j4;
                }
            } else if (j4 != 1) {
                int iNumberOfLeadingZeros = (128 - Long.numberOfLeadingZeros(jAbs)) - Long.numberOfLeadingZeros(j4);
                if (iNumberOfLeadingZeros < 63) {
                    jAbs *= j4;
                } else if (iNumberOfLeadingZeros <= 63) {
                    jAbs *= j4;
                    if (jAbs > 4611686018427387903L) {
                    }
                }
            } else if (jAbs > 4611686018427387903L) {
            }
        }
        return m6795v(jSignum * jAbs);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static C3679k m6773Y(C2779b c2779b, C2240b c2240b, C3044a c3044a, C2893a c2893a, C3689p c3689p) {
        C4114a c4114a;
        C1607u c1607u;
        boolean z9;
        C1957a c1957aM7040b;
        C1607u c1607u2;
        C4453d0 c4453d0;
        C1607u c1607u3;
        C4114a c4114a2;
        C3045b c3045b = c2779b.f9019a;
        c3044a.getClass();
        if (!c3045b.f9866a) {
            c3045b.f9866a = true;
        }
        c2240b.m5480d();
        C4453d0 c4453d02 = c2240b.f7420f;
        c2240b.m5480d();
        int i9 = c2240b.f7419e & (-33);
        c2240b.m5479c();
        AbstractC1605s abstractC1605sM4125o = c2240b.f7425k.m4125o("SourceFile");
        C4451c0 c4451c0 = abstractC1605sM4125o instanceof C1603q ? ((C1603q) abstractC1605sM4125o).f5271b : null;
        c2240b.m5480d();
        C4453d0 c4453d03 = c2240b.f7421g;
        c2240b.m5480d();
        C3679k c3679k = new C3679k(c4453d02, i9, c4453d03, c2240b.f7422h, c4451c0);
        c2240b.m5480d();
        C4453d0 c4453d04 = c2240b.f7420f;
        c2240b.m5479c();
        C1607u c1607u4 = c2240b.f7425k;
        C4115b c4115bM5045s = AbstractC2043a.m5045s(c1607u4);
        C1592f c1592f = (C1592f) c1607u4.m4125o("EnclosingMethod");
        char c10 = 3;
        if (c1592f == null) {
            c4114a = null;
        } else {
            C4453d0 c4453d05 = c1592f.f5263b;
            C4477z c4477z = c1592f.f5264c;
            if (c4477z == null) {
                c4114a = new C4114a(AbstractC3665d.f11906b, 3);
                c4114a.m8311n(new C4117d(AbstractC3665d.f11915k, c4453d05));
                c4114a.f24613g = false;
            } else {
                C4476y c4476y = new C4476y(c4453d05, c4477z);
                c4114a = new C4114a(AbstractC3665d.f11907c, 3);
                c4114a.m8311n(new C4117d(AbstractC3665d.f11915k, c4476y));
                c4114a.f24613g = false;
            }
        }
        try {
            C4115b c4115bM5022a0 = AbstractC2043a.m5022a0(c4453d04, c1607u4, c4114a == null);
            if (c4115bM5022a0 != null) {
                C4115b c4115b = new C4115b();
                c4115b.m8314m(c4115bM5045s);
                c4115b.m8314m(c4115bM5022a0);
                c4115b.f24613g = false;
                c4115bM5045s = c4115b;
            }
        } catch (C6098l e6) {
            c3044a.f9865a.println("warning: " + e6.getMessage());
        }
        if (c4114a != null) {
            c4115bM5045s = C4115b.m8312n(c4115bM5045s, c4114a);
        }
        c2240b.m5480d();
        if ((c2240b.f7419e & 8192) != 0) {
            c2240b.m5480d();
            C4453d0 c4453d06 = c2240b.f7420f;
            c2240b.m5479c();
            C1607u c1607u5 = c2240b.f7424j;
            int length = c1607u5.f24601h.length;
            C4114a c4114a3 = new C4114a(c4453d06, 4);
            boolean z10 = false;
            for (int i10 = 0; i10 < length; i10++) {
                InterfaceC2473b interfaceC2473b = (InterfaceC2473b) c1607u5.m10840l(i10);
                C1587a c1587a = (C1587a) interfaceC2473b.getAttributes().m4125o("AnnotationDefault");
                if (c1587a != null) {
                    c4114a3.m8309l(new C4117d(interfaceC2473b.mo4878d().f14827g, c1587a.f5252b));
                    z10 = true;
                }
            }
            if (z10) {
                c4114a3.f24613g = false;
                c4114a2 = new C4114a(AbstractC3665d.f11905a, 3);
                c4114a2.m8311n(new C4117d(AbstractC3665d.f11915k, new C4448b(c4114a3)));
                c4114a2.f24613g = false;
            } else {
                c4114a2 = null;
            }
            if (c4114a2 != null) {
                c4115bM5045s = C4115b.m8312n(c4115bM5045s, c4114a2);
            }
        }
        if (c4115bM5045s.f13617h.size() != 0) {
            C3667e c3667e = c3679k.f11954o;
            if (c3667e.f11917k != null) {
                C2104o.m5297w("class annotations already set");
                return null;
            }
            c3667e.f11917k = new C3661b(c4115bM5045s, c3689p);
        }
        C3703w c3703w = c3689p.f12007i;
        C3678j0 c3678j0 = c3689p.f12008j;
        C3674h0 c3674h0 = c3689p.f12012n;
        C3671g c3671g = c3689p.f12011m;
        c2240b.m5480d();
        C4453d0 c4453d07 = c2240b.f7420f;
        c2240b.m5479c();
        C1607u c1607u6 = c2240b.f7423i;
        int length2 = c1607u6.f24601h.length;
        int i11 = 0;
        while (i11 < length2) {
            C2475d c2475d = (C2475d) c1607u6.m10840l(i11);
            char c11 = c10;
            C1607u c1607u7 = c2475d.f8110d;
            C4477z c4477z2 = c2475d.f8109c;
            try {
                C4464m c4464m = new C4464m(c4453d07, c4477z2);
                int i12 = c2475d.f8108b;
                if ((i12 & 8) != 0) {
                    c4453d0 = c4453d07;
                    C1590d c1590d = (C1590d) c1607u7.m4125o("ConstantValue");
                    AbstractC4457f0 abstractC4457f0M6790q = c1590d == null ? null : c1590d.f5261b;
                    c1607u2 = c1607u7;
                    C3693r c3693r = new C3693r(c4464m, i12);
                    if (abstractC4457f0M6790q != null) {
                        abstractC4457f0M6790q = m6790q(abstractC4457f0M6790q, c4477z2.m8917k());
                    }
                    c3679k.m7673i(c3693r, abstractC4457f0M6790q);
                } else {
                    c1607u2 = c1607u7;
                    c4453d0 = c4453d07;
                    c3679k.f11952m.f11941n.add(new C3693r(c4464m, i12));
                }
                C4115b c4115bM5045s2 = AbstractC2043a.m5045s(c1607u2);
                if (c4115bM5045s2.f13617h.size() != 0) {
                    C3667e c3667e2 = c3679k.f11954o;
                    if (c3667e2.f11918l == null) {
                        c3667e2.f11918l = new ArrayList();
                    }
                    c1607u3 = c1607u6;
                    c3667e2.f11918l.add(new C3699u(c4464m, new C3661b(c4115bM5045s2, c3689p)));
                } else {
                    c1607u3 = c1607u6;
                }
                c3689p.f12007i.m7708m(c4464m);
                i11++;
                c1607u6 = c1607u3;
                c10 = c11;
                c4453d07 = c4453d0;
            } catch (RuntimeException e7) {
                throw C1064a.m2686b("...while processing " + c4477z2.f14827g.mo4901a() + " " + c4477z2.f14828h.mo4901a(), e7);
            }
        }
        c2240b.m5480d();
        C4453d0 c4453d08 = c2240b.f7420f;
        c2240b.m5479c();
        C1607u c1607u8 = c2240b.f7424j;
        int length3 = c1607u8.f24601h.length;
        int i13 = 0;
        while (i13 < length3) {
            InterfaceC2473b interfaceC2473b2 = (InterfaceC2473b) c1607u8.m10840l(i13);
            try {
                C4477z c4477zMo4878d = interfaceC2473b2.mo4878d();
                C4476y c4476y2 = new C4476y(c4453d08, c4477zMo4878d);
                int iMo4877c = interfaceC2473b2.mo4877c();
                boolean z11 = (iMo4877c & 8) != 0;
                boolean z12 = (iMo4877c & 2) != 0;
                int i14 = length3;
                boolean z13 = (iMo4877c & Opcodes.ACC_NATIVE) != 0;
                boolean z14 = (iMo4877c & 1024) != 0;
                int i15 = i13;
                boolean z15 = c4477zMo4878d.f14827g.f14760g.equals("<init>") || c4477zMo4878d.f14827g.f14760g.equals("<clinit>");
                if (z13 || z14) {
                    c1607u = c1607u8;
                    z9 = z15;
                    c1957aM7040b = null;
                } else {
                    C1005h c1005hM4912b = C1985z.m4912b(new C1972m(interfaceC2473b2, c2240b), c1607u8, c2893a);
                    c1607u = c1607u8;
                    C4681a c4681a = c4476y2.f14786i;
                    if (z11) {
                        z9 = z15;
                    } else {
                        z9 = z15;
                        if (c4476y2.f14787j == null) {
                            c4476y2.f14787j = c4681a.m9177e(c4453d08.f14784g);
                        }
                        c4681a = c4476y2.f14787j;
                    }
                    int iM9181o = c4681a.f15571i.m9181o();
                    String str = c4453d08.f14784g.f15648g;
                    String str2 = interfaceC2473b2.getName().f14760g;
                    c1957aM7040b = C3320y.m7040b(c1005hM4912b, 2, iM9181o, c2893a);
                }
                if ((iMo4877c & 32) != 0) {
                    iMo4877c |= Opcodes.ACC_DEPRECATED;
                    if (!z13) {
                        iMo4877c &= -33;
                    }
                }
                if (z9) {
                    iMo4877c |= 65536;
                }
                C1593g c1593g = (C1593g) interfaceC2473b2.getAttributes().m4125o("Exceptions");
                C3697t c3697t = new C3697t(c4476y2, iMo4877c, c1957aM7040b, c1593g == null ? C4682b.f15591i : c1593g.f5265b);
                if (c4477zMo4878d.f14827g.f14760g.equals("<init>") || c4477zMo4878d.f14827g.f14760g.equals("<clinit>") || z11 || z12) {
                    c3679k.f11952m.f11942o.add(c3697t);
                } else {
                    c3679k.f11952m.f11943p.add(c3697t);
                }
                C4115b c4115bM5049w = AbstractC2043a.m5049w(interfaceC2473b2);
                if (c4115bM5049w.f13617h.size() != 0) {
                    C3667e c3667e3 = c3679k.f11954o;
                    if (c3667e3.f11919m == null) {
                        c3667e3.f11919m = new ArrayList();
                    }
                    c3667e3.f11919m.add(new C3670f0(c4476y2, new C3661b(c4115bM5049w, c3689p)));
                }
                C4116c c4116cM5051y = AbstractC2043a.m5051y(interfaceC2473b2);
                if (c4116cM5051y.f24601h.length != 0) {
                    C3667e c3667e4 = c3679k.f11954o;
                    if (c3667e4.f11920n == null) {
                        c3667e4.f11920n = new ArrayList();
                    }
                    c3667e4.f11920n.add(new C3684m0(c4476y2, c4116cM5051y, c3689p));
                }
                c3689p.f12008j.m7672m(c4476y2);
                i13 = i15 + 1;
                length3 = i14;
                c1607u8 = c1607u;
            } catch (RuntimeException e10) {
                throw C1064a.m2686b("...while processing " + interfaceC2473b2.getName().mo4901a() + " " + interfaceC2473b2.mo4879e().mo4901a(), e10);
            }
        }
        c2240b.m5480d();
        C4455e0 c4455e0 = c2240b.f7418d;
        int length4 = c4455e0.f14788h.length;
        for (int i16 = 0; i16 < length4; i16++) {
            try {
                AbstractC4446a abstractC4446a = c4455e0.f14788h[i16];
                if (abstractC4446a instanceof C4476y) {
                    c3678j0.m7672m((AbstractC4454e) abstractC4446a);
                } else if (abstractC4446a instanceof C4467p) {
                    c3678j0.m7672m(((C4467p) abstractC4446a).m8911l());
                } else if (abstractC4446a instanceof C4464m) {
                    c3703w.m7708m((C4464m) abstractC4446a);
                } else if (abstractC4446a instanceof C4463l) {
                    c3703w.m7708m(((C4463l) abstractC4446a).m8908k());
                } else if (abstractC4446a instanceof C4475x) {
                    c3674h0.m7661q((C4475x) abstractC4446a);
                } else {
                    if (abstractC4446a instanceof C4468q) {
                        C4468q c4468q = (C4468q) abstractC4446a;
                        int i17 = c4468q.f14810g;
                        c2240b.m5479c();
                        C1588b c1588b = (C1588b) c2240b.f7425k.m4125o("BootstrapMethods");
                        C1959b c1959b = (C1959b) (c1588b != null ? c1588b.f5254b : C1961c.f6662i).m10840l(i17);
                        C4475x c4475x = c1959b.f6661b;
                        C4477z c4477z3 = c4468q.f14811h;
                        C1607u c1607u9 = c1959b.f6660a;
                        if (c4475x == null) {
                            C0353j.m1305c("bootstrapMethodHandle == null");
                            return null;
                        }
                        if (c4477z3 == null) {
                            C0353j.m1305c("nat == null");
                            return null;
                        }
                        C4450c c4450c = new C4450c(c1607u9.f24601h.length + 3);
                        c4450c.m10841m(0, c4475x);
                        c4450c.m10841m(1, c4477z3.f14827g);
                        c4450c.m10841m(2, new C4447a0(C4681a.m9173b(c4477z3.f14828h.f14760g)));
                        for (int i18 = 0; i18 < c1607u9.f24601h.length; i18++) {
                            c4450c.m10841m(i18 + 3, (AbstractC4446a) c1607u9.m10840l(i18));
                        }
                        c4450c.f24613g = false;
                        C4459h c4459h = new C4459h(c4450c);
                        c2240b.m5480d();
                        C4453d0 c4453d09 = c2240b.f7420f;
                        if (c4468q.f14813j != null) {
                            C2104o.m5294t("already added declaring class");
                            return null;
                        }
                        if (c4453d09 == null) {
                            C0353j.m1305c("declaringClass == null");
                            return null;
                        }
                        c4468q.f14813j = c4453d09;
                        if (c4468q.f14814k != null) {
                            C2104o.m5294t("already added call site");
                            return null;
                        }
                        c4468q.f14814k = c4459h;
                        for (C4460i c4460i : c4468q.f14815l) {
                            synchronized (c3671g) {
                                if (c4460i == null) {
                                    throw new NullPointerException("cstRef");
                                }
                                c3671g.m7699g();
                                if (((C3669f) c3671g.f11926g.get(c4460i)) == null) {
                                    c3671g.f11926g.put(c4460i, new C3669f(c4460i));
                                }
                            }
                        }
                    }
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new C1064a("invalid constant pool index ".concat(AbstractC0000a.m46X0(i16)), null);
            }
        }
        return c3679k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m6774a(InterfaceC1533l interfaceC1533l, InterfaceC5841c interfaceC5841c, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(-1090171650);
        if ((i9 & 6) == 0) {
            i10 = ((i9 & 8) == 0 ? c1836h0.m4534f(interfaceC1533l) : c1836h0.m4538h(interfaceC1533l) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4534f(interfaceC5841c) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4538h(c3874d) ? Opcodes.ACC_NATIVE : 128;
        }
        boolean z9 = true;
        if (c1836h0.m4516S(i10 & 1, (i10 & 147) != 146)) {
            boolean z10 = (i10 & 112) == 32;
            if ((i10 & 14) != 4 && ((i10 & 8) == 0 || !c1836h0.m4534f(interfaceC1533l))) {
                z9 = false;
            }
            boolean z11 = z10 | z9;
            Object objM4514P = c1836h0.m4514P();
            if (z11 || objM4514P == C1851l.f6155a) {
                objM4514P = new C1530k(interfaceC5841c, interfaceC1533l);
                c1836h0.m4545k0(objM4514P);
            }
            AbstractC5978m.m10712a((C1530k) objM4514P, null, new C5967c0(false, EnumC5969d0.f24261g, false), c3874d, c1836h0, ((i10 << 3) & 7168) | 384, 2);
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0152r(interfaceC1533l, interfaceC5841c, c3874d, i9, 3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m6775b(final InterfaceC1533l interfaceC1533l, final boolean z9, final EnumC4094j enumC4094j, final boolean z10, long j3, final float f3, final InterfaceC5853o interfaceC5853o, C1836h0 c1836h0, final int i9) {
        int i10;
        final long j4;
        int i11;
        long j5;
        final boolean z11;
        c1836h0.m4527b0(-466280168);
        if ((i9 & 6) == 0) {
            i10 = ((i9 & 8) == 0 ? c1836h0.m4534f(interfaceC1533l) : c1836h0.m4538h(interfaceC1533l) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h0.m4536g(z9) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i10 |= c1836h0.m4530d(enumC4094j.ordinal()) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c1836h0.m4536g(z10) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= 8192;
        }
        if ((1572864 & i9) == 0) {
            i10 |= c1836h0.m4534f(interfaceC5853o) ? 1048576 : 524288;
        }
        if (c1836h0.m4516S(i10 & 1, (533651 & i10) != 533650)) {
            c1836h0.m4521X();
            if ((i9 & 1) == 0 || c1836h0.m4500B()) {
                i11 = i10 & (-57345);
                j5 = 9205357640488583168L;
            } else {
                c1836h0.m4519V();
                i11 = i10 & (-57345);
                j5 = j3;
            }
            c1836h0.m4554q();
            EnumC4094j enumC4094j2 = EnumC4094j.f13555h;
            EnumC4094j enumC4094j3 = EnumC4094j.f13554g;
            if (z9) {
                float f10 = AbstractC1522h0.f5084a;
                z11 = (enumC4094j == enumC4094j3 && !z10) || (enumC4094j == enumC4094j2 && z10);
            } else {
                float f11 = AbstractC1522h0.f5084a;
                z11 = !((enumC4094j == enumC4094j3 && !z10) || (enumC4094j == enumC4094j2 && z10));
            }
            C5842d c5842d = z11 ? AbstractC5839a.f23760b : AbstractC5839a.f23759a;
            int i12 = i11 & 14;
            boolean zM4536g = (i12 == 4 || ((i11 & 8) != 0 && c1836h0.m4538h(interfaceC1533l))) | ((i11 & 112) == 32) | c1836h0.m4536g(z11);
            Object objM4514P = c1836h0.m4514P();
            if (zM4536g || objM4514P == C1851l.f6155a) {
                objM4514P = new C1128h0(interfaceC1533l, z9, z11);
                c1836h0.m4545k0(objM4514P);
            }
            final InterfaceC5853o interfaceC5853oM2648a = AbstractC1052o.m2648a(interfaceC5853o, (InterfaceC1231l) objM4514P);
            final InterfaceC5905l2 interfaceC5905l2 = (InterfaceC5905l2) c1836h0.m4542j(AbstractC5888h1.f23938t);
            long j10 = j5;
            C5842d c5842d2 = c5842d;
            j4 = j10;
            m6774a(interfaceC1533l, c5842d2, AbstractC3879i.m8071e(1365123137, new InterfaceC1235p() { // from class: h0.a
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    C1836h0 c1836h02 = (C1836h0) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C1873q1 c1873q1Mo4582a = AbstractC5888h1.f23938t.mo4582a(interfaceC5905l2);
                        final long j11 = j4;
                        final boolean z12 = z11;
                        final InterfaceC5853o interfaceC5853o2 = interfaceC5853oM2648a;
                        final InterfaceC1533l interfaceC1533l2 = interfaceC1533l;
                        AbstractC1874r.m4619a(c1873q1Mo4582a, AbstractC3879i.m8071e(1260045569, new InterfaceC1235p() { // from class: h0.c
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1235p
                            public final Object invoke(Object obj3, Object obj4) {
                                C1836h0 c1836h03 = (C1836h0) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (c1836h03.m4516S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    long j12 = j11;
                                    boolean z13 = z12;
                                    InterfaceC5853o interfaceC5853o3 = interfaceC5853o2;
                                    final InterfaceC1533l interfaceC1533l3 = interfaceC1533l2;
                                    C1823e c1823e = C1851l.f6155a;
                                    if (j12 != 9205357640488583168L) {
                                        c1836h03.m4525a0(3458246);
                                        C3205c c3205c = z13 ? AbstractC3208d.f10247b : AbstractC3208d.f10246a;
                                        InterfaceC5853o interfaceC5853oM6906i = AbstractC3222h1.m6906i(interfaceC5853o3, C4238h.m8524b(j12), C4238h.m8523a(j12), 0.0f, 0.0f, 12);
                                        C3213e1 c3213e1M6892a = AbstractC3210d1.m6892a(c3205c, C5840b.f23770p, c1836h03, 0);
                                        int iHashCode = Long.hashCode(c1836h03.f6095T);
                                        C3878h c3878hM4546l = c1836h03.m4546l();
                                        InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h03, interfaceC5853oM6906i);
                                        InterfaceC5605g.f22815f.getClass();
                                        C5660y c5660y = C5601f.f22758b;
                                        c1836h03.m4531d0();
                                        if (c1836h03.f6094S) {
                                            c1836h03.m4544k(c5660y);
                                        } else {
                                            c1836h03.m4551n0();
                                        }
                                        AbstractC1874r.m4615A(C5601f.f22761e, c1836h03, c3213e1M6892a);
                                        AbstractC1874r.m4615A(C5601f.f22760d, c1836h03, c3878hM4546l);
                                        AbstractC1874r.m4615A(C5601f.f22762f, c1836h03, Integer.valueOf(iHashCode));
                                        AbstractC1874r.m4641w(C5601f.f22763g, c1836h03);
                                        AbstractC1874r.m4615A(C5601f.f22759c, c1836h03, interfaceC5853oM10543c);
                                        boolean zM4538h = c1836h03.m4538h(interfaceC1533l3);
                                        Object objM4514P2 = c1836h03.m4514P();
                                        if (zM4538h || objM4514P2 == c1823e) {
                                            final int i13 = 0;
                                            objM4514P2 = new InterfaceC1220a() { // from class: h0.d
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1220a
                                                public final Object invoke() {
                                                    switch (i13) {
                                                        case 0:
                                                            return Boolean.valueOf((interfaceC1533l3.mo4036a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((interfaceC1533l3.mo4036a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c1836h03.m4545k0(objM4514P2);
                                        }
                                        AbstractC3165h.m6776c(C5850l.f23787a, (InterfaceC1220a) objM4514P2, z13, c1836h03, 6);
                                        c1836h03.m4553p(true);
                                        c1836h03.m4553p(false);
                                    } else {
                                        c1836h03.m4525a0(4389176);
                                        boolean zM4538h2 = c1836h03.m4538h(interfaceC1533l3);
                                        Object objM4514P3 = c1836h03.m4514P();
                                        if (zM4538h2 || objM4514P3 == c1823e) {
                                            final int i14 = 1;
                                            objM4514P3 = new InterfaceC1220a() { // from class: h0.d
                                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                @Override // p085fg.InterfaceC1220a
                                                public final Object invoke() {
                                                    switch (i14) {
                                                        case 0:
                                                            return Boolean.valueOf((interfaceC1533l3.mo4036a() & 9223372034707292159L) != 9205357640488583168L);
                                                        default:
                                                            return Boolean.valueOf((interfaceC1533l3.mo4036a() & 9223372034707292159L) != 9205357640488583168L);
                                                    }
                                                }
                                            };
                                            c1836h03.m4545k0(objM4514P3);
                                        }
                                        AbstractC3165h.m6776c(interfaceC5853o3, (InterfaceC1220a) objM4514P3, z13, c1836h03, 0);
                                        c1836h03.m4553p(false);
                                    }
                                } else {
                                    c1836h03.m4519V();
                                }
                                return C3967n.f12976a;
                            }
                        }, c1836h02), c1836h02, 56);
                    } else {
                        c1836h02.m4519V();
                    }
                    return C3967n.f12976a;
                }
            }, c1836h0), c1836h0, i12 | 384);
        } else {
            c1836h0.m4519V();
            j4 = j3;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            final long j11 = j4;
            c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: h0.b
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC3165h.m6775b(interfaceC1533l, z9, enumC4094j, z10, j11, f3, interfaceC5853o, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m6776c(InterfaceC5853o interfaceC5853o, InterfaceC1220a interfaceC1220a, boolean z9, C1836h0 c1836h0, int i9) {
        int i10;
        c1836h0.m4527b0(2111672474);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        int i11 = i10 | (c1836h0.m4538h(interfaceC1220a) ? 32 : 16) | (c1836h0.m4536g(z9) ? Opcodes.ACC_NATIVE : 128);
        if (c1836h0.m4516S(i11 & 1, (i11 & 147) != 146)) {
            AbstractC3208d.m6873c(c1836h0, AbstractC5839a.m10541a(AbstractC3222h1.m6908k(interfaceC5853o, AbstractC1522h0.f5084a, AbstractC1522h0.f5085b), new C1515f(interfaceC1220a, z9, 0)));
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C1512e(interfaceC5853o, interfaceC1220a, z9, i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m6777d(InterfaceC5853o interfaceC5853o, final String str, long j3, long j4, long j5, boolean z9, final InterfaceC1220a interfaceC1220a, long j10, long j11, boolean z10, final C3874d c3874d, C1836h0 c1836h0, final int i9, final int i10) {
        int i11;
        final InterfaceC5853o interfaceC5853o2;
        final long j12;
        final long j13;
        final long j14;
        final boolean z11;
        final long j15;
        final long j16;
        final boolean z12;
        long jM1234d;
        int i12;
        int i13;
        long jM1231a;
        long j17;
        long j18;
        InterfaceC5853o interfaceC5853o3;
        long j19;
        boolean z13;
        int i14;
        boolean z14;
        c1836h0.m4527b0(160138296);
        if ((i9 & 6) == 0) {
            i11 = (c1836h0.m4536g(true) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        int i15 = i11 | 48;
        if ((i9 & 384) == 0) {
            i15 |= c1836h0.m4534f(str) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i15 |= 1024;
        }
        int i16 = i15 | 24576;
        if ((i9 & 196608) == 0) {
            i16 = 90112 | i15;
        }
        if ((i9 & 1572864) == 0) {
            i16 |= 524288;
        }
        int i17 = i16 | 12582912;
        if ((100663296 & i9) == 0) {
            i17 |= c1836h0.m4538h(interfaceC1220a) ? 67108864 : 33554432;
        }
        int i18 = i17 | 805306368;
        int i19 = i10 | 438;
        if ((i10 & 3072) == 0) {
            i19 |= c1836h0.m4538h(c3874d) ? Opcodes.ACC_STRICT : 1024;
        }
        if (c1836h0.m4516S(i18 & 1, ((306783379 & i18) == 306783378 && (i19 & 1171) == 1170) ? false : true)) {
            c1836h0.m4521X();
            if ((i9 & 1) == 0 || c1836h0.m4500B()) {
                int i20 = AbstractC5824i.f23664c;
                C1858m2 c1858m2 = AbstractC0316d.f944a;
                jM1234d = ((C0314b) c1836h0.m4542j(c1858m2)).m1234d();
                i12 = 196608;
                i13 = i19;
                long j20 = ((C1034w) ((C0314b) c1836h0.m4542j(c1858m2)).f900K.getValue()).f3265a;
                jM1231a = ((C0314b) c1836h0.m4542j(c1858m2)).m1231a();
                j17 = AbstractC5824i.f23662a;
                j18 = AbstractC5824i.f23663b;
                interfaceC5853o3 = C5850l.f23787a;
                j19 = j20;
                z13 = true;
                i14 = i18 & (-4135937);
                z14 = true;
            } else {
                c1836h0.m4519V();
                interfaceC5853o3 = interfaceC5853o;
                jM1234d = j3;
                j19 = j4;
                jM1231a = j5;
                j17 = j10;
                j18 = j11;
                i12 = 196608;
                i13 = i19;
                z13 = z10;
                i14 = i18 & (-4135937);
                z14 = z9;
            }
            c1836h0.m4554q();
            WeakHashMap weakHashMap = C3255s1.f10360v;
            float fMo6924c = AbstractC3208d.m6874d(C3205c.m6868e(c1836h0).f10366f, c1836h0).mo6924c();
            float fMo6924c2 = AbstractC3208d.m6874d(C3205c.m6868e(c1836h0).f10361a, c1836h0).mo6924c();
            float fMo6924c3 = AbstractC3208d.m6874d(C3205c.m6868e(c1836h0).f10362b, c1836h0).mo6924c();
            boolean zM4528c = c1836h0.m4528c(fMo6924c) | c1836h0.m4528c(fMo6924c2) | c1836h0.m4528c(fMo6924c3);
            long j21 = j19;
            Object objM4514P = c1836h0.m4514P();
            if (zM4528c || objM4514P == C1851l.f6155a) {
                C4236f c4236f = new C4236f(fMo6924c);
                C4236f c4236f2 = new C4236f(fMo6924c2);
                C4236f c4236f3 = new C4236f(fMo6924c3);
                if (c4236f2.compareTo(c4236f3) < 0) {
                    c4236f2 = c4236f3;
                }
                if (c4236f.compareTo(c4236f2) < 0) {
                    c4236f = c4236f2;
                }
                C4236f c4236f4 = new C4236f(c4236f.f13909g);
                c1836h0.m4545k0(c4236f4);
                objM4514P = c4236f4;
            }
            float f3 = ((C4236f) objM4514P).f13909g;
            InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(interfaceC1220a, c1836h0);
            C3874d c3874dM8071e = AbstractC3879i.m8071e(548720147, new C5832q(interfaceC1809a1M4643y, 0), c1836h0);
            C4236f c4236f5 = new C4236f(f3);
            C3874d c3874dM8071e2 = AbstractC3879i.m8071e(-179734068, new C5827l(interfaceC1809a1M4643y, c3874d, 1), c1836h0);
            int i21 = i13 << 12;
            int i22 = (i14 & 14) | 1572864 | (i21 & 57344) | (i21 & 458752);
            int i23 = i14 << 18;
            int i24 = i22 | (i23 & 29360128) | (i23 & 234881024) | ((i14 << 15) & 1879048192);
            int i25 = i14 >> 21;
            int i26 = (i25 & 896) | (i25 & 14) | i12 | (i25 & 112) | ((i13 << 3) & 7168);
            InterfaceC5853o interfaceC5853o4 = interfaceC5853o3;
            long j22 = jM1234d;
            boolean z15 = z14;
            z12 = z13;
            long j23 = j17;
            long j24 = jM1231a;
            long j25 = j18;
            AbstractC1341a.m3587c(j22, j21, j24, j23, j25, c3874dM8071e, interfaceC5853o4, str, z15, interfaceC1220a, z12, c4236f5, c3874dM8071e2, c1836h0, i24, i26);
            z11 = z15;
            j16 = j25;
            interfaceC5853o2 = interfaceC5853o4;
            j15 = j23;
            j14 = j24;
            j13 = j21;
            j12 = j22;
        } else {
            c1836h0.m4519V();
            interfaceC5853o2 = interfaceC5853o;
            j12 = j3;
            j13 = j4;
            j14 = j5;
            z11 = z9;
            j15 = j10;
            j16 = j11;
            z12 = z10;
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: xh.r
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM4617C = AbstractC1874r.m4617C(i9 | 1);
                    int iM4617C2 = AbstractC1874r.m4617C(i10);
                    AbstractC3165h.m6777d(interfaceC5853o2, str, j12, j13, j14, z11, interfaceC1220a, j15, j16, z12, c3874d, (C1836h0) obj, iM4617C, iM4617C2);
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final long m6778e(long j3, long j4) {
        if (j3 != 4611686018427387903L && j3 != -4611686018427387903L) {
            return (j4 == 4611686018427387903L || j4 == -4611686018427387903L) ? j4 : AbstractC3754e0.m7911s(j3 + j4, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j4 || j4 >= 4611686018427387903L) && (j4 ^ j3) < 0) {
            return 9223372036854759646L;
        }
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m6779f(String str, String str2) {
        str2.getClass();
        if (str2.length() != 0) {
            if (str.length() != 0) {
                if (!str2.equals(str)) {
                    if (!AbstractC3156t.m6740d0(str2, str, false)) {
                        if (!AbstractC3156t.m6740d0(str, str2, false)) {
                            return str.concat(str2);
                        }
                    }
                }
            }
            return str2;
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static void m6780g(JSONObject jSONObject) throws JSONException {
        String strM1020i;
        long jCurrentTimeMillis = System.currentTimeMillis();
        jSONObject.put("4", (int) (jCurrentTimeMillis / 1000));
        String string = HttpUrl.FRAGMENT_ENCODE_SET;
        String strM3652c = WeChatApis.account() != null ? WeChatApis.account().m3652c() : HttpUrl.FRAGMENT_ENCODE_SET;
        String str = new SimpleDateFormat("ssHHmmMMddyy", Locale.US).format(new Date(jCurrentTimeMillis));
        if (strM3652c == null || strM3652c.length() <= 1) {
            strM1020i = AbstractC0255e.m1020i(str, "fffffff");
        } else {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strM3652c.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    String hexString = Integer.toHexString(b10 & 255);
                    if (hexString.length() < 2) {
                        sb2.append('0');
                    }
                    sb2.append(hexString);
                }
                string = sb2.toString();
            } catch (Throwable unused) {
            }
            strM1020i = str + string.substring(0, Math.min(7, string.length()));
        }
        jSONObject.put("5", (strM1020i + String.format(Locale.US, "%04x", Long.valueOf(jCurrentTimeMillis % WebSocketProtocol.PAYLOAD_SHORT_MAX)) + ((jCurrentTimeMillis % 7) + 100)).hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m6781h(int i9, int i10, String str) {
        if (i9 < 0) {
            return AbstractC3754e0.m7866I("%s (%s) must not be negative", str, Integer.valueOf(i9));
        }
        if (i10 >= 0) {
            return AbstractC3754e0.m7866I("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i9), Integer.valueOf(i10));
        }
        C2104o.m5294t(AbstractC0921a.m2249l(i10, "negative size: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m6782i(Context context, String str) {
        context.getClass();
        str.getClass();
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_block_at_all_notification_config");
        if (!sharedPreferencesM8640c.getBoolean("block_at_all_notification_enable", false)) {
            return false;
        }
        if (sharedPreferencesM8640c.contains("block_at_all_notification_groups")) {
            return m6763O(sharedPreferencesM8640c.getString("block_at_all_notification_groups", HttpUrl.FRAGMENT_ENCODE_SET)).contains(AbstractC3149m.m6703R0(str).toString());
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final String m6783j(Number number, Number number2) {
        return "Random range is empty: [" + number + ", " + number2 + ").";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final Object m6784k(InterfaceC5612i interfaceC5612i, InterfaceC1220a interfaceC1220a, AbstractC6038c abstractC6038c) {
        Object obj;
        AbstractC5614i1 abstractC5614i1M10166v;
        Object objMo1353A0;
        C5587b1 c5587b1;
        AbstractC5852n abstractC5852n = (AbstractC5852n) interfaceC5612i;
        boolean z9 = abstractC5852n.f23788g.f23801t;
        if (z9) {
            if (!z9) {
                AbstractC4229a.m8494b("visitAncestors called on an unattached node");
            }
            AbstractC5852n abstractC5852n2 = abstractC5852n.f23788g.f23792k;
            C5602f0 c5602f0M10167w = AbstractC5618k.m10167w(interfaceC5612i);
            loop0: while (true) {
                obj = null;
                if (c5602f0M10167w == null) {
                    break;
                }
                if ((c5602f0M10167w.f22778L.f22719f.f23791j & 524288) != 0) {
                    while (abstractC5852n2 != null) {
                        if ((abstractC5852n2.f23790i & 524288) != 0) {
                            AbstractC5852n abstractC5852nM10149e = abstractC5852n2;
                            C2046b c2046b = null;
                            while (abstractC5852nM10149e != null) {
                                if (abstractC5852nM10149e instanceof InterfaceC0389a) {
                                    obj = abstractC5852nM10149e;
                                    break loop0;
                                }
                                if ((abstractC5852nM10149e.f23790i & 524288) != 0 && (abstractC5852nM10149e instanceof AbstractC5615j)) {
                                    int i9 = 0;
                                    for (AbstractC5852n abstractC5852n3 = ((AbstractC5615j) abstractC5852nM10149e).f22875v; abstractC5852n3 != null; abstractC5852n3 = abstractC5852n3.f23793l) {
                                        if ((abstractC5852n3.f23790i & 524288) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                abstractC5852nM10149e = abstractC5852n3;
                                            } else {
                                                if (c2046b == null) {
                                                    c2046b = new C2046b(new AbstractC5852n[16]);
                                                }
                                                if (abstractC5852nM10149e != null) {
                                                    c2046b.m5056b(abstractC5852nM10149e);
                                                    abstractC5852nM10149e = null;
                                                }
                                                c2046b.m5056b(abstractC5852n3);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                abstractC5852nM10149e = AbstractC5618k.m10149e(c2046b);
                            }
                        }
                        abstractC5852n2 = abstractC5852n2.f23792k;
                    }
                }
                c5602f0M10167w = c5602f0M10167w.m10049u();
                abstractC5852n2 = (c5602f0M10167w == null || (c5587b1 = c5602f0M10167w.f22778L) == null) ? null : c5587b1.f22718e;
            }
            InterfaceC0389a interfaceC0389a = (InterfaceC0389a) obj;
            if (interfaceC0389a != null && (objMo1353A0 = interfaceC0389a.mo1353A0((abstractC5614i1M10166v = AbstractC5618k.m10166v(interfaceC5612i)), new C0372b(interfaceC1220a, 1, abstractC5614i1M10166v), abstractC6038c)) == EnumC5799a.f23547g) {
                return objMo1353A0;
            }
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static C4320p m6785l(C1402a c1402a, ArrayList arrayList) {
        try {
            C4320p c4320p = new C4320p(EnumC3400k.f10970V, (arrayList.size() - 3) + c1402a.f4668j);
            m6764P((String) ((C2958a) arrayList.get(3)).f9705h, c4320p, arrayList, c1402a);
            return c4320p;
        } catch (Exception e6) {
            C4320p c4320p2 = new C4320p(EnumC3400k.f10965Q, 0);
            c4320p2.m6231w(EnumC2824a.f9159m);
            c4320p2.m6232x(C2825b.f9188c, new C2984p(AbstractC4855en.m9263g("Failed to process dynamic string concat: ", e6.getMessage()), e6));
            return c4320p2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m6786m(Context context, ClassLoader classLoader) {
        C2534i c2534iM6557a = C3087k.m6557a(context, classLoader);
        return AbstractC4166m.m8392A1(AbstractC0000a.m101y0(c2534iM6557a.f8197c, c2534iM6557a.f8198d, String.valueOf(c2534iM6557a.f8195a), c2534iM6557a.f8199e, c2534iM6557a.f8200f, c2534iM6557a.f8201g, String.valueOf(c2534iM6557a.f8196b)), "|", null, null, null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final boolean m6787n(ArrayList arrayList) {
        List list;
        long j3;
        if (arrayList.size() >= 2) {
            if (arrayList.size() <= 1) {
                list = C4173t.f13710g;
            } else {
                ArrayList arrayList2 = new ArrayList();
                Object obj = arrayList.get(0);
                int size = arrayList.size() - 1;
                int i9 = 0;
                while (i9 < size) {
                    i9++;
                    Object obj2 = arrayList.get(i9);
                    C1054q c1054q = (C1054q) obj2;
                    C1054q c1054q2 = (C1054q) obj;
                    arrayList2.add(new C0807b((((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c1054q2.m2656g().m2046b() >> 32)) - Float.intBitsToFloat((int) (c1054q.m2656g().m2046b() >> 32))))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (c1054q2.m2656g().m2046b() & 4294967295L)) - Float.intBitsToFloat((int) (c1054q.m2656g().m2046b() & 4294967295L))))) & 4294967295L)));
                    obj = obj2;
                }
                list = arrayList2;
            }
            if (list.size() == 1) {
                j3 = ((C0807b) AbstractC4166m.m8422t1(list)).f2414a;
            } else {
                if (list.isEmpty()) {
                    AbstractC4679a.m9172c("Empty collection can't be reduced.");
                }
                Object objM8422t1 = AbstractC4166m.m8422t1(list);
                int size2 = list.size() - 1;
                if (1 <= size2) {
                    int i10 = 1;
                    while (true) {
                        objM8422t1 = new C0807b(C0807b.m2042e(((C0807b) objM8422t1).f2414a, ((C0807b) list.get(i10)).f2414a));
                        if (i10 == size2) {
                            break;
                        }
                        i10++;
                    }
                }
                j3 = ((C0807b) objM8422t1).f2414a;
            }
            if (Float.intBitsToFloat((int) (4294967295L & j3)) >= Float.intBitsToFloat((int) (j3 >> 32))) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m6788o(int i9, int i10) {
        String strM7866I;
        if (i9 < 0 || i9 >= i10) {
            if (i9 < 0) {
                strM7866I = AbstractC3754e0.m7866I("%s (%s) must not be negative", "index", Integer.valueOf(i9));
            } else {
                if (i10 < 0) {
                    C2104o.m5294t(AbstractC0921a.m2249l(i10, "negative size: "));
                    return;
                }
                strM7866I = AbstractC3754e0.m7866I("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i9), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM7866I);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m6789p(int i9, int i10, int i11) {
        if (i9 < 0 || i10 < i9 || i10 > i11) {
            throw new IndexOutOfBoundsException((i9 < 0 || i9 > i11) ? m6781h(i9, i11, "start index") : (i10 < 0 || i10 > i11) ? m6781h(i10, i11, "end index") : AbstractC3754e0.m7866I("end index (%s) must not be less than start index (%s)", Integer.valueOf(i10), Integer.valueOf(i9)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static AbstractC4457f0 m6790q(AbstractC4457f0 abstractC4457f0, C4683c c4683c) {
        if (abstractC4457f0.getType().equals(c4683c)) {
            return abstractC4457f0;
        }
        int i9 = c4683c.f15649h;
        if (i9 == 1) {
            return C4456f.m8907n(((C4466o) abstractC4457f0).f14817g);
        }
        if (i9 == 2) {
            int i10 = ((C4466o) abstractC4457f0).f14817g;
            byte b10 = (byte) i10;
            if (b10 == i10) {
                return new C4458g(b10);
            }
            C2104o.m5294t(AbstractC0921a.m2249l(i10, "bogus byte value: "));
            return null;
        }
        if (i9 == 3) {
            int i11 = ((C4466o) abstractC4457f0).f14817g;
            char c10 = (char) i11;
            if (c10 == i11) {
                return new C4461j(c10);
            }
            C2104o.m5294t(AbstractC0921a.m2249l(i11, "bogus char value: "));
            return null;
        }
        if (i9 != 8) {
            throw new UnsupportedOperationException("can't coerce " + abstractC4457f0 + " to " + c4683c);
        }
        int i12 = ((C4466o) abstractC4457f0).f14817g;
        short s10 = (short) i12;
        if (s10 == i12) {
            return new C4449b0(s10);
        }
        C2104o.m5294t(AbstractC0921a.m2249l(i12, "bogus short value: "));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C1003g m6791r(C0374d c0374d, float f3) {
        int iCeil = ((int) Math.ceil(f3)) * 2;
        C1003g c1003gM2509e = AbstractC3754e0.f12221g;
        C0993b c0993bM2505a = AbstractC3754e0.f12222h;
        C1565b c1565b = AbstractC3754e0.f12223i;
        if (c1003gM2509e == null || c0993bM2505a == null) {
            c1003gM2509e = AbstractC0996c0.m2509e(iCeil, iCeil, 1);
            AbstractC3754e0.f12221g = c1003gM2509e;
            c0993bM2505a = AbstractC0996c0.m2505a(c1003gM2509e);
            AbstractC3754e0.f12222h = c0993bM2505a;
        } else {
            Bitmap bitmap = c1003gM2509e.f3179a;
            if (iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
            }
        }
        C1003g c1003g = c1003gM2509e;
        C0993b c0993b = c0993bM2505a;
        if (c1565b == null) {
            c1565b = new C1565b();
            AbstractC3754e0.f12223i = c1565b;
        }
        C1565b c1565b2 = c1565b;
        C1564a c1564a = c1565b2.f5219g;
        EnumC4243m layoutDirection = c0374d.f1051g.getLayoutDirection();
        Bitmap bitmap2 = c1003g.f3179a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        InterfaceC4233c interfaceC4233c = c1564a.f5215a;
        EnumC4243m enumC4243m = c1564a.f5216b;
        InterfaceC1031u interfaceC1031u = c1564a.f5217c;
        long j3 = c1564a.f5218d;
        c1564a.f5215a = c0374d;
        c1564a.f5216b = layoutDirection;
        c1564a.f5217c = c0993b;
        c1564a.f5218d = jFloatToRawIntBits;
        c0993b.mo2487e();
        InterfaceC1567d.m4087Z(c1565b2, C1034w.f3258b, c1565b2.mo4091a(), 0.0f, 0, 58);
        InterfaceC1567d.m4087Z(c1565b2, AbstractC0996c0.m2508d(4278190080L), (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 0.0f, 0, 120);
        InterfaceC1567d.m4083O(c1565b2, AbstractC0996c0.m2508d(4278190080L), f3, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), 120);
        c0993b.mo2497p();
        c1564a.f5215a = interfaceC4233c;
        c1564a.f5216b = enumC4243m;
        c1564a.f5217c = interfaceC1031u;
        c1564a.f5218d = j3;
        return c1003g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static List m6792s() {
        return AbstractC0000a.m101y0(new C2366j("plugin_agent", "插件 Agent", "plugin_agent", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true), new C2366j("module_settings", "设置", "module_settings", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true), new C2366j("scan", "扫一扫", "activity", "com.tencent.mm.plugin.scanner.ui.BaseScanUI", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true), new C2366j("moments", "朋友圈", "activity", "com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true), new C2366j("finder", "视频号", "activity", "com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true), new C2366j("favorite", "收藏", "activity", "com.tencent.mm.plugin.fav.ui.FavoriteIndexUI", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true), new C2366j("wallet", "钱包", "activity", "com.tencent.mm.plugin.mall.ui.MallIndexUIv2", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, true));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static C4292c m6793t(C3315t c3315t, List list, C4292c c4292c) {
        Object next;
        list.getClass();
        String strM7031y = c3315t.m7031y("transfer_rule_default_template_id", HttpUrl.FRAGMENT_ENCODE_SET);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C4298i) next).f14300a.equals(strM7031y)) {
                break;
            }
        }
        C4298i c4298i = (C4298i) next;
        return c4298i != null ? AbstractC2043a.m5027d(c4298i, c4298i.f14301b, c4292c) : c4292c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static final void m6794u(InterfaceC1567d interfaceC1567d, C1902b c1902b) {
        boolean z9;
        boolean z10;
        Canvas canvas;
        boolean z11;
        float f3;
        InterfaceC1031u interfaceC1031uM819p = interfaceC1567d.mo4081z0().m819p();
        C1902b c1902b2 = (C1902b) interfaceC1567d.mo4081z0().f470b;
        InterfaceC1904d interfaceC1904d = c1902b.f6340a;
        if (c1902b.f6358s) {
            return;
        }
        c1902b.m4673a();
        if (!interfaceC1904d.mo4682A()) {
            try {
                c1902b.f6340a.mo4709m(c1902b.f6341b, c1902b.f6342c, c1902b, c1902b.f6344e);
            } catch (Throwable unused) {
            }
        }
        boolean z12 = interfaceC1904d.mo4694M() > 0.0f;
        if (z12) {
            interfaceC1031uM819p.mo2499r();
        }
        Canvas canvasM2502a = AbstractC0995c.m2502a(interfaceC1031uM819p);
        boolean zIsHardwareAccelerated = canvasM2502a.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            long j3 = c1902b.f6359t;
            float f10 = (int) (j3 >> 32);
            float f11 = (int) (j3 & 4294967295L);
            long j4 = c1902b.f6360u;
            float f12 = ((int) (j4 >> 32)) + f10;
            float f13 = ((int) (j4 & 4294967295L)) + f11;
            float fMo4697a = interfaceC1904d.mo4697a();
            C1017n c1017nMo4720x = interfaceC1904d.mo4720x();
            int iMo4696O = interfaceC1904d.mo4696O();
            if (fMo4697a < 1.0f || iMo4696O != 3 || c1017nMo4720x != null || interfaceC1904d.mo4719w() == 1) {
                C1005h c1005hM2510f = c1902b.f6355p;
                if (c1005hM2510f == null) {
                    c1005hM2510f = AbstractC0996c0.m2510f();
                    c1902b.f6355p = c1005hM2510f;
                }
                c1005hM2510f.m2586u(fMo4697a);
                c1005hM2510f.m2587v(iMo4696O);
                c1005hM2510f.m2589x(c1017nMo4720x);
                canvasM2502a = canvasM2502a;
                f3 = f10;
                canvasM2502a.saveLayer(f3, f11, f12, f13, (Paint) c1005hM2510f.f3182i);
            } else {
                canvasM2502a.save();
                canvasM2502a = canvasM2502a;
                f3 = f10;
            }
            canvasM2502a.translate(f3, f11);
            canvasM2502a.concat(interfaceC1904d.mo4692K());
        }
        boolean z13 = !zIsHardwareAccelerated && c1902b.f6362w;
        if (z13) {
            interfaceC1031uM819p.mo2487e();
            AbstractC0996c0 abstractC0996c0M4676d = c1902b.m4676d();
            if (abstractC0996c0M4676d instanceof C1012k0) {
                InterfaceC1031u.m2630k(interfaceC1031uM819p, ((C1012k0) abstractC0996c0M4676d).f3197f);
            } else if (abstractC0996c0M4676d instanceof C1014l0) {
                C1009j c1009jM2609a = c1902b.f6352m;
                if (c1009jM2609a != null) {
                    c1009jM2609a.f3191a.rewind();
                } else {
                    c1009jM2609a = AbstractC1013l.m2609a();
                    c1902b.f6352m = c1009jM2609a;
                }
                C1009j.m2601c(c1009jM2609a, ((C1014l0) abstractC0996c0M4676d).f3198f);
                interfaceC1031uM819p.mo2486d(c1009jM2609a);
            } else {
                if (!(abstractC0996c0M4676d instanceof C1010j0)) {
                    C3193a.m6822k();
                    return;
                }
                interfaceC1031uM819p.mo2486d(((C1010j0) abstractC0996c0M4676d).f3195f);
            }
        }
        if (c1902b2 != null) {
            C0127f c0127f = c1902b2.f6357r;
            if (!c0127f.f334a) {
                AbstractC1004g0.m2560a("Only add dependencies during a tracking");
            }
            C0945l0 c0945l0 = (C0945l0) c0127f.f337d;
            if (c0945l0 != null) {
                c0945l0.m2328a(c1902b);
            } else if (((C1902b) c0127f.f335b) != null) {
                C0945l0 c0945l02 = AbstractC0959s0.f3019a;
                C0945l0 c0945l03 = new C0945l0();
                C1902b c1902b3 = (C1902b) c0127f.f335b;
                c1902b3.getClass();
                c0945l03.m2328a(c1902b3);
                c0945l03.m2328a(c1902b);
                c0127f.f337d = c0945l03;
                c0127f.f335b = null;
            } else {
                c0127f.f335b = c1902b;
            }
            C0945l0 c0945l04 = (C0945l0) c0127f.f338e;
            if (c0945l04 != null) {
                z11 = !c0945l04.m2339l(c1902b);
            } else if (((C1902b) c0127f.f336c) != c1902b) {
                z11 = true;
            } else {
                c0127f.f336c = null;
                z11 = false;
            }
            if (z11) {
                c1902b.f6356q++;
            }
        }
        if (((C0993b) interfaceC1031uM819p).f3149a.isHardwareAccelerated()) {
            z9 = z12;
            z10 = z13;
            canvas = canvasM2502a;
            interfaceC1904d.mo4695N(interfaceC1031uM819p);
        } else {
            C1565b c1565b = c1902b.f6354o;
            if (c1565b == null) {
                c1565b = new C1565b();
                c1902b.f6354o = c1565b;
            }
            C0184c c0184c = c1565b.f5220h;
            InterfaceC4233c interfaceC4233c = c1902b.f6341b;
            EnumC4243m enumC4243m = c1902b.f6342c;
            long jM7908q0 = AbstractC3754e0.m7908q0(c1902b.f6360u);
            InterfaceC4233c interfaceC4233cM822s = c0184c.m822s();
            EnumC4243m enumC4243mM824u = c0184c.m824u();
            InterfaceC1031u interfaceC1031uM819p2 = c0184c.m819p();
            z10 = z13;
            canvas = canvasM2502a;
            long jM825v = c0184c.m825v();
            z9 = z12;
            C1902b c1902b4 = (C1902b) c0184c.f470b;
            c0184c.m800R(interfaceC4233c);
            c0184c.m801S(enumC4243m);
            c0184c.m798P(interfaceC1031uM819p);
            c0184c.m803U(jM7908q0);
            c0184c.f470b = c1902b;
            interfaceC1031uM819p.mo2487e();
            try {
                c1902b.m4675c(c1565b);
            } finally {
                interfaceC1031uM819p.mo2497p();
                c0184c.m800R(interfaceC4233cM822s);
                c0184c.m801S(enumC4243mM824u);
                c0184c.m798P(interfaceC1031uM819p2);
                c0184c.m803U(jM825v);
                c0184c.f470b = c1902b4;
            }
        }
        if (z10) {
            interfaceC1031uM819p.mo2497p();
        }
        if (z9) {
            interfaceC1031uM819p.mo2489g();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvas.restore();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static final long m6795v(long j3) {
        long j4 = (j3 << 1) + 1;
        AbstractC3414a.f11034g.getClass();
        int i9 = AbstractC3415b.f11037a;
        return j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static JSONArray m6796w(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        HashSet hashSet = new HashSet();
        ArrayList<C2366j> arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((C2366j) obj).f7772a)) {
                arrayList.add(obj);
            }
        }
        for (C2366j c2366j : arrayList) {
            JSONObject jSONObject = new JSONObject();
            String str = c2366j.f7772a;
            String str2 = c2366j.f7774c;
            jSONObject.put("id", str);
            jSONObject.put("title", AbstractC3149m.m6703R0(c2366j.f7773b).toString());
            jSONObject.put("actionType", str2);
            jSONObject.put("target", AbstractC1416l.m3825a(str2, "activity") ? AbstractC3149m.m6703R0(c2366j.f7775d).toString() : HttpUrl.FRAGMENT_ENCODE_SET);
            jSONObject.put("iconPath", AbstractC3149m.m6703R0(c2366j.f7776e).toString());
            jSONObject.put("darkIconPath", AbstractC3149m.m6703R0(c2366j.f7777f).toString());
            jSONObject.put("enabled", c2366j.f7778g);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static Method m6797x(Context context, SharedPreferences sharedPreferences, String str, DexKitBridge dexKitBridge, ClassLoader classLoader, String str2, String... strArr) {
        Object c3959f;
        Method methodM6759K = m6759K(sharedPreferences, str, classLoader, str2);
        if (methodM6759K != null) {
            return methodM6759K;
        }
        try {
            C0570e c0570e = new C0570e();
            C1253k c1253k = new C1253k();
            C1253k.m3367u0(c1253k, AbstractC4165l.m8375L0(strArr));
            c0570e.f1764h = c1253k;
            C1730o c1730o = (C1730o) dexKitBridge.findMethod(c0570e).m4344a();
            if (c1730o != null) {
                m6767S(sharedPreferences, str, str2, c1730o.f5750j);
                c3959f = c1730o.m4350r(classLoader);
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2260w("[Hchat:Tablet] 定位失败: ", AbstractC4165l.m8369F0(strArr, null, 63), " ", thM8182b.getMessage(), thM8182b);
            c3959f = null;
        }
        Method method = (Method) c3959f;
        if (method == null) {
            try {
                sharedPreferences.edit().putString("cache_key", str).remove(str2).apply();
            } catch (Throwable unused) {
            }
            AbstractC1184v0.m3203m("[Hchat:Tablet] 未命中方法: " + AbstractC4165l.m8369F0(strArr, null, 63) + " pkg=" + context.getPackageName());
        }
        return method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static Long m6798y(ContentValues contentValues, String... strArr) {
        Object c3959f;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                return null;
            }
            Object obj = contentValues.get(strArr[i9]);
            if (obj != null) {
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                String strM6758J = m6758J(obj.toString());
                if (strM6758J != null) {
                    try {
                        c3959f = Long.valueOf(Long.parseUnsignedLong(strM6758J));
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    return (Long) (c3959f instanceof C3959f ? null : c3959f);
                }
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0101  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1635c0 m6799z(Object obj, C3351d0 c3351d0) {
        Object c3959f;
        ContentValues contentValues;
        Long lM6798y;
        String str;
        EnumC1637d0 enumC1637d0;
        obj.getClass();
        int i9 = 0;
        if (obj.getClass().getName().equals("com.tencent.mm.plugin.sns.storage.SnsInfo")) {
            try {
                Object objInvokeMethod = KavaReflector.invokeMethod(obj, "convertTo", new Object[0]);
                ContentValues contentValues2 = objInvokeMethod instanceof ContentValues ? (ContentValues) objInvokeMethod : null;
                c3959f = contentValues2 != null ? new ContentValues(contentValues2) : null;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                c3351d0.m7079l("朋友圈记录导出失败: " + thM8182b.getMessage());
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            contentValues = (ContentValues) c3959f;
        } else {
            contentValues = null;
        }
        if (contentValues == null || (lM6798y = m6798y(contentValues, "snsId", "field_snsId", "svrId")) == null) {
            return null;
        }
        long jLongValue = lM6798y.longValue();
        if (jLongValue == 0) {
            return null;
        }
        String[] strArr = {"userName", "field_userName"};
        while (true) {
            if (i9 >= 2) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
                break;
            }
            String asString = contentValues.getAsString(strArr[i9]);
            if (asString != null) {
                if (AbstractC3149m.m6721t0(asString)) {
                    asString = null;
                }
                if (asString != null) {
                    str = asString;
                    break;
                }
            }
            i9++;
            obj = obj;
        }
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return null;
        }
        Long lM6798y2 = m6798y(contentValues, "createTime", "field_createTime", "create_time", "timestamp", "field_timestamp");
        long jLongValue2 = lM6798y2 != null ? lM6798y2.longValue() : 0L;
        Long lM6798y3 = m6798y(contentValues, "type", "field_type");
        int iLongValue = lM6798y3 != null ? (int) lM6798y3.longValue() : -1;
        String strM7869L = AbstractC3754e0.m7869L(obj);
        String unsignedString = Long.toUnsignedString(jLongValue);
        unsignedString.getClass();
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
        return new C1635c0(unsignedString, jLongValue, string, jLongValue2, enumC1637d0, strM7869L, obj);
    }
}
