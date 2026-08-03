package p003a2;

import ac.AbstractC0063p;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import ba.EnumC0221a;
import ba.EnumC0234n;
import ga.C1376a;
import gg.AbstractC1416l;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ke.InterfaceC2395d;
import md.AbstractC2828e;
import md.EnumC2824a;
import ng.AbstractC3015m;
import ng.C3005c;
import ng.C3011i;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p010aa.C0033a;
import p010aa.C0034b;
import p010aa.C0040h;
import p019b4.C0178b;
import p041d1.C0655c0;
import p051db.C0763a;
import p051db.C0765c;
import p054dg.C0795n;
import p061e5.C0826a;
import p062e8.C0828b;
import p064ea.C0849a;
import p064ea.C0850b;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p080fb.AbstractC1184v0;
import p099h.Hchat.utils.KavaReflector;
import p122i5.AbstractC1986a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p142jg.AbstractC2136d;
import p218og.AbstractC3149m;
import p233pd.EnumC3400k;
import p239q5.C3440a;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p304uf.C4329c;
import p304uf.C4335i;
import p332wb.AbstractC4855en;
import p343x6.AbstractC5700d;
import p350xd.C5775b;
import p351xe.AbstractC5792m;
import p369yd.C6029c;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4170q;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: a2.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0014a implements InterfaceC2395d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f49g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0014a(ArrayList arrayList) {
        this.f49g = 11;
        if (arrayList.isEmpty()) {
            C2104o.m5294t("Conditions list can't be empty");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static List m165A(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C4173t.f13710g;
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            String strOptString = jSONArray.optString(i9);
            strOptString.getClass();
            String string = AbstractC3149m.m6703R0(strOptString).toString();
            if (AbstractC3149m.m6721t0(string)) {
                string = null;
            }
            if (string != null) {
                c4329cM7E.add(string);
            }
        }
        return AbstractC4166m.m8418p1(AbstractC0000a.m90t(c4329cM7E));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static Set m166B(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C4175v.f13712g;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            String strOptString = jSONArray.optString(i9);
            strOptString.getClass();
            String string = AbstractC3149m.m6703R0(strOptString).toString();
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static List m167C(String str) {
        if (!AbstractC3149m.m6721t0(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("id");
                        if (AbstractC3149m.m6721t0(strOptString)) {
                            strOptString = System.currentTimeMillis() + "_" + i9;
                        }
                        String str2 = strOptString;
                        String strOptString2 = jSONObjectOptJSONObject.optString("name");
                        if (AbstractC3149m.m6721t0(strOptString2)) {
                            strOptString2 = "模板 " + (i9 + 1);
                        }
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", true);
                        int iOptInt = jSONObjectOptJSONObject.optInt("mode", 0);
                        String strOptString3 = jSONObjectOptJSONObject.optString("targets");
                        strOptString3.getClass();
                        String strOptString4 = jSONObjectOptJSONObject.optString("targetGroupMembers");
                        strOptString4.getClass();
                        String strOptString5 = jSONObjectOptJSONObject.optString("excludes");
                        strOptString5.getClass();
                        String strOptString6 = jSONObjectOptJSONObject.optString("excludeGroupMembers");
                        strOptString6.getClass();
                        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("typeAll", false);
                        Set setM168D = m168D(jSONObjectOptJSONObject.optJSONArray("types"));
                        String strOptString7 = jSONObjectOptJSONObject.optString("textKeywords");
                        strOptString7.getClass();
                        arrayList.add(new C0040h(str2, strOptString2, zOptBoolean, iOptInt, strOptString3, strOptString4, strOptString5, strOptString6, zOptBoolean2, setM168D, strOptString7));
                    }
                }
                return arrayList;
            } catch (Throwable unused) {
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static Set m168D(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C4175v.f13712g;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            String strOptString = jSONArray.optString(i9);
            strOptString.getClass();
            String string = AbstractC3149m.m6703R0(strOptString).toString();
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static EnumC0234n m169E(EnumC0221a enumC0221a, boolean z9, boolean z10) {
        enumC0221a.getClass();
        for (EnumC0234n enumC0234n : EnumC0234n.values()) {
            if (enumC0234n.f616i == enumC0221a && enumC0234n.f618k == z10 && (enumC0221a == EnumC0221a.SYSTEM || enumC0234n.f617j == z9)) {
                return enumC0234n;
            }
        }
        C2104o.m5287l("Array contains no element matching the predicate.");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static long m170F(long j3, int i9, Set set, long j4) {
        long jM173b = j3;
        set.getClass();
        if (jM173b <= 0) {
            return 0L;
        }
        if (i9 == 0) {
            return jM173b;
        }
        if (i9 == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (AbstractC4156d0.m8355W(2, 3, 4, 5, 6, 7, 1).contains(Integer.valueOf(((Number) obj).intValue()))) {
                    arrayList.add(obj);
                }
            }
            Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
            if (!setM8412U1.isEmpty()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(jM173b);
                if (!setM8412U1.contains(Integer.valueOf(calendar.get(7)))) {
                    jM173b = m173b(jM173b, i9, setM8412U1);
                }
            }
        }
        for (int i10 = 0; jM173b <= j4 && i10 < 400; i10++) {
            jM173b = m173b(jM173b, i9, set);
        }
        return jM173b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static ArrayList m171G(String str) {
        List listM6692G0 = AbstractC3149m.m6692G0(str, new String[]{"|", ",", "，", "\n", "\r"});
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6692G0));
        Iterator it = listM6692G0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m172a(String str, String str2) {
        return AbstractC4855en.m9264h(AbstractC1416l.m3825a(str, "group_member") ? "group_member" : "contact", "|", AbstractC3149m.m6703R0(str2).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static long m173b(long j3, int i9, Set set) {
        set.getClass();
        if (j3 <= 0) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3);
        if (i9 == 1) {
            calendar.add(5, 1);
        } else if (i9 == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : set) {
                if (AbstractC4156d0.m8355W(2, 3, 4, 5, 6, 7, 1).contains(Integer.valueOf(((Number) obj).intValue()))) {
                    arrayList.add(obj);
                }
            }
            Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
            if (!setM8412U1.isEmpty()) {
                int i10 = 14;
                do {
                    calendar.add(5, 1);
                    i10--;
                    if (i10 <= 0) {
                        break;
                    }
                } while (!setM8412U1.contains(Integer.valueOf(calendar.get(7))));
            } else {
                calendar.add(5, 1);
            }
        }
        return calendar.getTimeInMillis();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static C0034b m174d(boolean z9, boolean z10) {
        String str = z10 ? "默认公众号规则" : z9 ? "默认群聊规则" : "默认私聊规则";
        C4175v c4175v = C4175v.f13712g;
        return new C0034b(z9, str, z10, false, c4175v, false, false, c4175v, HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m175e(List list) throws JSONException {
        Iterator it;
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0033a c0033a = (C0033a) it2.next();
            String str = AbstractC1416l.m3825a(c0033a.f104b, "group_member") ? "group_member" : "contact";
            String strM183q = m183q(str, c0033a.f105c);
            if (strM183q != null) {
                String str2 = AbstractC1416l.m3825a(c0033a.f108f, "exclude") ? "exclude" : "block";
                String strM172a = m172a(str, strM183q);
                C0033a c0033a2 = (C0033a) linkedHashMap.get(strM172a);
                String str3 = c0033a.f106d;
                if (AbstractC3149m.m6721t0(str3) && (c0033a2 == null || (str3 = c0033a2.f106d) == null)) {
                    str3 = strM183q;
                }
                String str4 = str3;
                boolean z9 = c0033a.f107e;
                Set set = c0033a2 != null ? c0033a2.f109g : null;
                Set set2 = C4175v.f13712g;
                if (set == null) {
                    set = set2;
                }
                Set set3 = c0033a.f109g;
                ArrayList arrayList = new ArrayList();
                for (Object obj : set3) {
                    if (!AbstractC3149m.m6721t0((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashSet linkedHashSetM8353U = AbstractC4156d0.m8353U(set, arrayList);
                boolean z10 = c0033a.f110h || (c0033a2 != null && c0033a2.f110h);
                boolean z11 = c0033a.f111i || (c0033a2 != null && c0033a2.f111i);
                Set set4 = c0033a2 != null ? c0033a2.f112j : null;
                if (set4 != null) {
                    set2 = set4;
                }
                Set set5 = c0033a.f112j;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : set5) {
                    Iterator it3 = it2;
                    if (!AbstractC3149m.m6721t0((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                    it2 = it3;
                }
                it = it2;
                LinkedHashSet linkedHashSetM8353U2 = AbstractC4156d0.m8353U(set2, arrayList2);
                String str5 = c0033a.f113k;
                if (AbstractC3149m.m6721t0(str5)) {
                    str5 = c0033a2 != null ? c0033a2.f113k : null;
                    if (str5 == null) {
                        str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
                linkedHashMap.put(strM172a, new C0033a(strM172a, str, strM183q, str4, z9, str2, linkedHashSetM8353U, z10, z11, linkedHashSetM8353U2, str5));
            } else {
                it = it2;
            }
            it2 = it;
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        for (C0033a c0033a3 : AbstractC4166m.m8407P1(collectionValues)) {
            JSONObject jSONObject = new JSONObject();
            String strM9264h = c0033a3.f103a;
            String str6 = c0033a3.f105c;
            String str7 = c0033a3.f104b;
            if (AbstractC3149m.m6721t0(strM9264h)) {
                str7.getClass();
                str6.getClass();
                strM9264h = AbstractC4855en.m9264h(str7.equals("group_member") ? "group_member" : "contact", "|", AbstractC3149m.m6703R0(str6).toString());
            }
            jSONObject.put("id", strM9264h);
            jSONObject.put("targetType", str7);
            jSONObject.put("targetId", str6);
            jSONObject.put("label", c0033a3.f106d);
            jSONObject.put("enabled", c0033a3.f107e);
            jSONObject.put("action", c0033a3.f108f);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it4 = c0033a3.f109g.iterator();
            while (it4.hasNext()) {
                jSONArray2.put((String) it4.next());
            }
            jSONObject.put("templateIds", jSONArray2);
            jSONObject.put("customRules", c0033a3.f110h);
            jSONObject.put("typeAll", c0033a3.f111i);
            JSONArray jSONArray3 = new JSONArray();
            Iterator it5 = c0033a3.f112j.iterator();
            while (it5.hasNext()) {
                jSONArray3.put((String) it5.next());
            }
            jSONObject.put("types", jSONArray3);
            jSONObject.put("textKeywords", c0033a3.f113k);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static String m176f(C0034b c0034b, boolean z9, boolean z10) throws JSONException {
        C0034b c0034bM291a = C0034b.m291a(c0034b, z9, z10 ? "默认公众号规则" : z9 ? "默认群聊规则" : "默认私聊规则", z10, false, null, false, false, null, null, 504);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enabled", c0034bM291a.f117d);
        JSONArray jSONArray = new JSONArray();
        Iterator it = c0034bM291a.f118e.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        jSONObject.put("templateIds", jSONArray);
        jSONObject.put("customRules", c0034bM291a.f119f);
        jSONObject.put("typeAll", c0034bM291a.f120g);
        JSONArray jSONArray2 = new JSONArray();
        Iterator it2 = c0034bM291a.f121h.iterator();
        while (it2.hasNext()) {
            jSONArray2.put((String) it2.next());
        }
        jSONObject.put("types", jSONArray2);
        jSONObject.put("textKeywords", c0034bM291a.f122i);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static String m177g(List list) throws JSONException {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0040h c0040h = (C0040h) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", c0040h.f131a);
            jSONObject.put("name", c0040h.f132b);
            jSONObject.put("enabled", c0040h.f133c);
            jSONObject.put("mode", c0040h.f134d);
            jSONObject.put("targets", c0040h.f135e);
            jSONObject.put("targetGroupMembers", c0040h.f136f);
            jSONObject.put("excludes", c0040h.f137g);
            jSONObject.put("excludeGroupMembers", c0040h.f138h);
            jSONObject.put("typeAll", c0040h.f139i);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = c0040h.f140j.iterator();
            while (it2.hasNext()) {
                jSONArray2.put((String) it2.next());
            }
            jSONObject.put("types", jSONArray2);
            jSONObject.put("textKeywords", c0040h.f141k);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m178k(Context context, ClassLoader classLoader) {
        Object c3959f;
        if (classLoader == null) {
            return false;
        }
        String str = classLoader.getClass().getName() + "@" + System.identityHashCode(classLoader);
        HashSet hashSet = C1376a.f4571e;
        synchronized (hashSet) {
            if (hashSet.contains(str)) {
                return true;
            }
            Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding", classLoader);
            if (clsLoadClass == null) {
                AbstractC1184v0.m3203m("[Hchat:MiniProgramVideoAds] 未找到小程序 JS Bridge: com.tencent.mm.appbrand.commonjni.AppBrandJsBridgeBinding");
                return false;
            }
            Class cls = Integer.TYPE;
            cls.getClass();
            Method methodFindMethod = KavaReflector.findMethod(clsLoadClass, "subscribeHandler", String.class, String.class, cls, String.class);
            if (methodFindMethod == null || !AbstractC1416l.m3825a(methodFindMethod.getReturnType(), Void.TYPE)) {
                AbstractC1184v0.m3203m("[Hchat:MiniProgramVideoAds] 未找到 subscribeHandler(String,String,int,String)");
                return false;
            }
            try {
                C3744i.f12154b.m7763b(methodFindMethod, new C0850b(context, 2));
                hashSet.add(str);
                c3959f = Boolean.TRUE;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC1184v0.m3204n("[Hchat:MiniProgramVideoAds] 安装小程序视频广告 Hook 失败: " + thM8182b.getMessage(), thM8182b);
                c3959f = Boolean.FALSE;
            }
            return ((Boolean) c3959f).booleanValue();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static List m179m(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0040h c0040h = (C0040h) it.next();
            Iterator it2 = m171G(c0040h.f135e).iterator();
            while (true) {
                String str = "contact";
                if (!it2.hasNext()) {
                    break;
                }
                String str2 = (String) it2.next();
                if (m185s(str2) != null) {
                    str = "group_member";
                }
                m180n(linkedHashMap, str, str2, "block", c0040h);
            }
            Iterator it3 = m171G(c0040h.f136f).iterator();
            while (it3.hasNext()) {
                m180n(linkedHashMap, "group_member", (String) it3.next(), "block", c0040h);
            }
            for (String str3 : m171G(c0040h.f137g)) {
                m180n(linkedHashMap, m185s(str3) != null ? "group_member" : "contact", str3, "exclude", c0040h);
            }
            Iterator it4 = m171G(c0040h.f138h).iterator();
            while (it4.hasNext()) {
                m180n(linkedHashMap, "group_member", (String) it4.next(), "exclude", c0040h);
            }
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        return AbstractC4166m.m8407P1(collectionValues);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final void m180n(LinkedHashMap linkedHashMap, String str, String str2, String str3, C0040h c0040h) {
        String str4;
        String str5;
        String str6 = AbstractC1416l.m3825a(str, "group_member") ? "group_member" : "contact";
        String strM183q = m183q(str6, str2);
        if (strM183q != null) {
            String strM172a = m172a(str6, strM183q);
            C0033a c0033a = (C0033a) linkedHashMap.get(strM172a);
            String str7 = (c0033a == null || (str5 = c0033a.f103a) == null) ? strM172a : str5;
            String str8 = (c0033a == null || (str4 = c0033a.f106d) == null) ? strM183q : str4;
            boolean z9 = c0033a != null ? c0033a.f107e : true;
            Set set = c0033a != null ? c0033a.f109g : null;
            if (set == null) {
                set = C4175v.f13712g;
            }
            linkedHashMap.put(strM172a, new C0033a(str7, str6, strM183q, str8, z9, str3, AbstractC4156d0.m8354V(set, c0040h.f131a)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00bc  */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m181o(C0765c c0765c) {
        boolean z9;
        int i9;
        int i10;
        if (c0765c.f2305r == 1) {
            List<C0763a> listM187u = m187u(c0765c);
            int i11 = 0;
            if (listM187u.isEmpty()) {
                z9 = false;
                if (listM187u.isEmpty()) {
                    Iterator it = listM187u.iterator();
                    i9 = 0;
                    while (it.hasNext()) {
                        if ((((C0763a) it.next()).f2286a == 1) && (i9 = i9 + 1) < 0) {
                            AbstractC0000a.m30P0();
                            throw null;
                        }
                    }
                } else {
                    i9 = 0;
                }
                if (!listM187u.isEmpty()) {
                    Iterator it2 = listM187u.iterator();
                    int i12 = 0;
                    while (it2.hasNext()) {
                        if ((((C0763a) it2.next()).f2286a == 2) && (i12 = i12 + 1) < 0) {
                            AbstractC0000a.m30P0();
                            throw null;
                        }
                    }
                    i11 = i12;
                }
                i10 = c0765c.f2306s;
                if (i10 != 0) {
                    if (!z9) {
                        return "请输入朋友圈文字";
                    }
                } else if (i10 == 1) {
                    if (!z9) {
                        return "请输入朋友圈文字";
                    }
                    if (1 > i9 || i9 >= 10) {
                        return "请选择 1-9 张朋友圈图片";
                    }
                } else if (i10 == 2) {
                    if (!z9) {
                        return "请输入朋友圈文字";
                    }
                    if (i11 != 1) {
                        return "请选择 1 个朋友圈视频";
                    }
                } else if (i10 != 3) {
                    if (i10 != 4) {
                        return "请选择朋友圈类型";
                    }
                    if (i11 != 1) {
                        return "请选择 1 个朋友圈视频";
                    }
                } else if (1 > i9 || i9 >= 10) {
                    return "请选择 1-9 张朋友圈图片";
                }
            } else {
                for (C0763a c0763a : listM187u) {
                    if (c0763a.f2286a == 0 && !AbstractC3149m.m6721t0(c0763a.f2287b)) {
                        z9 = true;
                        break;
                    }
                }
                z9 = false;
                if (listM187u.isEmpty()) {
                }
                if (!listM187u.isEmpty()) {
                }
                i10 = c0765c.f2306s;
                if (i10 != 0) {
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C0765c m182p() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        calendar.add(12, 5);
        calendar.set(13, 0);
        calendar.set(14, 0);
        String str = "task_" + jCurrentTimeMillis + "_" + AbstractC2136d.f7122g.mo5361c(1000, 9999);
        long timeInMillis = calendar.getTimeInMillis();
        C4173t c4173t = C4173t.f13710g;
        return new C0765c(str, 0, HttpUrl.FRAGMENT_ENCODE_SET, c4173t, c4173t, c4173t, timeInMillis, 0, C4175v.f13712g, 0, 0, true, "pending", 0L, 0, 0, HttpUrl.FRAGMENT_ENCODE_SET, 0, 0, c4173t, 0, c4173t);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static String m183q(String str, String str2) {
        String string = AbstractC3149m.m6703R0(str2).toString();
        if (string.length() == 0) {
            return null;
        }
        return str.equals("group_member") ? m185s(string) : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:126:0x0112 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX INFO: renamed from: r */
    public static C0765c m184r(C0765c c0765c) {
        int iIntValue;
        int i9;
        int i10;
        int i11;
        List listM186t;
        int iIntValue2;
        ?? arrayList;
        List listM8407P1;
        c0765c.getClass();
        int i12 = c0765c.f2305r;
        Integer numValueOf = Integer.valueOf(i12);
        Integer num = null;
        if (i12 != 0 && i12 != 1) {
            numValueOf = null;
        }
        int iIntValue3 = numValueOf != null ? numValueOf.intValue() : 0;
        int i13 = c0765c.f2306s;
        Integer numValueOf2 = Integer.valueOf(i13);
        if (i13 < 0 || i13 >= 5) {
            numValueOf2 = null;
        }
        int iIntValue4 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        if (iIntValue3 == 0) {
            int i14 = c0765c.f2308u;
            Integer numValueOf3 = Integer.valueOf(i14);
            if (i14 != 0 && i14 != 1) {
                numValueOf3 = null;
            }
            iIntValue = numValueOf3 != null ? numValueOf3.intValue() : 0;
        } else {
            iIntValue = 0;
        }
        if (iIntValue3 == 1) {
            i9 = iIntValue3;
            i10 = 1;
            i11 = 5;
            listM186t = m187u(C0765c.m1980a(c0765c, 0, null, null, null, null, 0L, 0, null, 0, 0, false, null, 0L, 0, 0, null, 0, iIntValue4, null, 0, null, 3932159));
        } else {
            i9 = iIntValue3;
            i10 = 1;
            i11 = 5;
            listM186t = m186t(c0765c);
        }
        List list = listM186t;
        C0763a c0763a = (C0763a) AbstractC4166m.m8424v1(list);
        if (c0763a != null) {
            iIntValue2 = c0763a.f2286a;
        } else {
            int i15 = c0765c.f2289b;
            Integer numValueOf4 = Integer.valueOf(i15);
            if (i15 >= 0 && i15 < 9) {
                num = numValueOf4;
            }
            iIntValue2 = num != null ? num.intValue() : 0;
        }
        List listM8407P12 = C4173t.f13710g;
        if (iIntValue2 == 0 || iIntValue2 == 6) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((C0763a) obj).f2286a == iIntValue2) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(AbstractC4167n.m8429e1(arrayList2));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C0763a) it.next()).f2287b);
            }
        } else {
            arrayList = listM8407P12;
        }
        if (iIntValue2 == 0 || iIntValue2 == 6 || iIntValue2 == 8) {
            listM8407P1 = listM8407P12;
        } else {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((C0763a) obj2).f2286a == iIntValue2) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(arrayList3));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((C0763a) it2.next()).f2287b);
            }
            listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList4));
        }
        List listM188v = m188v(c0765c);
        String string = AbstractC3149m.m6703R0(c0765c.f2304q).toString();
        String str = (String) AbstractC4166m.m8424v1(arrayList);
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (i9 == 0) {
            List list2 = c0765c.f2293f;
            ArrayList arrayList5 = new ArrayList(AbstractC4167n.m8429e1(list2));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                AbstractC2091b.m5171r((String) it3.next(), arrayList5);
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : arrayList5) {
                if (!AbstractC3149m.m6721t0((String) obj3)) {
                    arrayList6.add(obj3);
                }
            }
            listM8407P12 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList6));
        }
        Set set = c0765c.f2296i;
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : set) {
            if (AbstractC4156d0.m8355W(2, 3, 4, Integer.valueOf(i11), 6, 7, Integer.valueOf(i10)).contains(Integer.valueOf(((Number) obj4).intValue()))) {
                arrayList7.add(obj4);
            }
        }
        Set setM8412U1 = AbstractC4166m.m8412U1(arrayList7);
        int iM7909r = AbstractC3754e0.m7909r(c0765c.f2297j, 0, 3600);
        int iM7909r2 = AbstractC3754e0.m7909r(c0765c.f2298k, 0, 3600);
        Long l10 = (Long) AbstractC4166m.m8424v1(listM188v);
        return C0765c.m1980a(c0765c, iIntValue2, str, arrayList, listM8407P1, listM8407P12, l10 != null ? l10.longValue() : 0L, 0, setM8412U1, iM7909r, iM7909r2, false, "pending", 0L, 0, 0, string, i9, iIntValue4, list, iIntValue, listM188v, 59521);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static String m185s(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        char[] cArr = {'/', '#', ':', 65306};
        ArrayList arrayList = new ArrayList(4);
        for (int i9 = 0; i9 < 4; i9++) {
            arrayList.add(Integer.valueOf(AbstractC3149m.m6718q0(string, cArr[i9], 0, 6)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).intValue() > 0) {
                arrayList2.add(next);
            }
        }
        Integer num = (Integer) AbstractC4166m.m8395D1(arrayList2);
        if (num == null) {
            return null;
        }
        int iIntValue = num.intValue();
        String string2 = AbstractC3149m.m6703R0(string.substring(0, iIntValue)).toString();
        String string3 = AbstractC3149m.m6703R0(string.substring(iIntValue + 1)).toString();
        if (string2.length() == 0 || string3.length() == 0) {
            return null;
        }
        return AbstractC4855en.m9264h(string2, "/", string3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x00b5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: t */
    public static ArrayList m186t(C0765c c0765c) {
        c0765c.getClass();
        int i9 = c0765c.f2289b;
        ?? arrayList = c0765c.f2307t;
        if (arrayList.isEmpty()) {
            if (i9 == 0 || i9 == 6) {
                List listM99x0 = c0765c.f2291d;
                if (listM99x0.isEmpty()) {
                    String str = c0765c.f2290c;
                    if (AbstractC3149m.m6721t0(str)) {
                        str = null;
                    }
                    listM99x0 = str != null ? AbstractC0000a.m99x0(str) : C4173t.f13710g;
                }
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM99x0));
                Iterator it = listM99x0.iterator();
                while (it.hasNext()) {
                    AbstractC2091b.m5171r((String) it.next(), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!AbstractC3149m.m6721t0((String) obj)) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(arrayList3));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(new C0763a(i9, (String) it2.next()));
                }
                arrayList = arrayList4;
            } else {
                List list = c0765c.f2292e;
                arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new C0763a(i9, (String) it3.next()));
                }
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (C0763a c0763a : arrayList) {
            int i10 = c0763a.f2286a;
            Integer numValueOf = Integer.valueOf(i10);
            if (i10 < 0 || i10 >= 9) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
            String string = AbstractC3149m.m6703R0(c0763a.f2287b).toString();
            C0763a c0763a2 = AbstractC3149m.m6721t0(string) ? null : new C0763a(iIntValue, string);
            if (c0763a2 != null) {
                arrayList5.add(c0763a2);
            }
        }
        return arrayList5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static List m187u(C0765c c0765c) {
        Object next;
        Object next2;
        String str;
        String str2;
        Collection collectionM186t = c0765c.f2307t;
        if (collectionM186t.isEmpty()) {
            collectionM186t = m186t(c0765c);
        }
        Iterator it = collectionM186t.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((C0763a) next).f2286a == 0) {
                break;
            }
        }
        C0763a c0763a = (C0763a) next;
        String string = (c0763a == null || (str2 = c0763a.f2287b) == null) ? null : AbstractC3149m.m6703R0(str2).toString();
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        List listM6418b0 = AbstractC3015m.m6418b0(AbstractC3015m.m6413W(AbstractC3015m.m6416Z(AbstractC3015m.m6409S(new C3011i(AbstractC3015m.m6413W(new C3011i(new C0795n(collectionM186t, 6), true, new C0178b(25)), new C0178b(26)), true, new C0178b(27))), 9), new C0178b(28)));
        Iterator it2 = collectionM186t.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (((C0763a) next2).f2286a == 2) {
                break;
            }
        }
        C0763a c0763a2 = (C0763a) next2;
        String string2 = (c0763a2 == null || (str = c0763a2.f2287b) == null) ? null : AbstractC3149m.m6703R0(str).toString();
        if (string2 != null) {
            str3 = string2;
        }
        if (!(!AbstractC3149m.m6721t0(str3) && AbstractC0921a.m2262y(str3))) {
            str3 = null;
        }
        C0763a c0763a3 = str3 != null ? new C0763a(2, str3) : null;
        if (AbstractC3149m.m6721t0(string)) {
            string = null;
        }
        C0763a c0763a4 = string != null ? new C0763a(0, string) : null;
        int i9 = c0765c.f2306s;
        return i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? i9 != 4 ? C4173t.f13710g : AbstractC0000a.m1A0(c0763a3) : listM6418b0 : AbstractC0000a.m103z0(c0763a4, c0763a3) : AbstractC4166m.m8397F1(AbstractC0000a.m1A0(c0763a4), listM6418b0) : AbstractC0000a.m1A0(c0763a4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static List m188v(C0765c c0765c) {
        c0765c.getClass();
        List listM99x0 = c0765c.f2309v;
        if (listM99x0.isEmpty()) {
            listM99x0 = AbstractC0000a.m99x0(Long.valueOf(c0765c.f2294g));
        }
        C3005c c3005cM6409S = AbstractC3015m.m6409S(new C3011i(new C0795n(listM99x0, 6), true, new C0178b(24)));
        ArrayList arrayList = new ArrayList();
        AbstractC3015m.m6417a0(c3005cM6409S, arrayList);
        AbstractC4170q.m8430f1(arrayList);
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return C4173t.f13710g;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0000a.m99x0(next);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(next);
        while (it.hasNext()) {
            arrayList2.add(it.next());
        }
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0174  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m189w(String str) {
        JSONArray jSONArray;
        boolean z9;
        if (!AbstractC3149m.m6721t0(str)) {
            try {
                JSONArray jSONArray2 = new JSONArray(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = jSONArray2.length();
                int i9 = 0;
                while (i9 < length) {
                    JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i9);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("targetType");
                        strOptString.getClass();
                        String str2 = AbstractC1416l.m3825a(strOptString, "group_member") ? "group_member" : "contact";
                        String strOptString2 = jSONObjectOptJSONObject.optString("targetId");
                        strOptString2.getClass();
                        String strM183q = m183q(str2, AbstractC3149m.m6703R0(strOptString2).toString());
                        if (strM183q != null) {
                            String strOptString3 = jSONObjectOptJSONObject.optString("action");
                            if (AbstractC3149m.m6721t0(strOptString3)) {
                                strOptString3 = "block";
                            }
                            if (!strOptString3.equals("exclude")) {
                                strOptString3 = null;
                            }
                            String str3 = strOptString3 != null ? strOptString3 : "block";
                            Set setM166B = m166B(jSONObjectOptJSONObject.optJSONArray("templateIds"));
                            boolean zIsEmpty = setM166B.isEmpty();
                            Set set = C4175v.f13712g;
                            if (zIsEmpty) {
                                String strOptString4 = jSONObjectOptJSONObject.optString("templateId");
                                strOptString4.getClass();
                                String string = AbstractC3149m.m6703R0(strOptString4).toString();
                                if (!(string.length() > 0)) {
                                    string = null;
                                }
                                setM166B = string != null ? AbstractC0063p.m404N(string) : set;
                            }
                            Set set2 = setM166B;
                            String strM172a = m172a(str2, strM183q);
                            C0033a c0033a = (C0033a) linkedHashMap.get(strM172a);
                            String strOptString5 = jSONObjectOptJSONObject.optString("label");
                            if (AbstractC3149m.m6721t0(strOptString5) && (c0033a == null || (strOptString5 = c0033a.f106d) == null)) {
                                strOptString5 = strM183q;
                            }
                            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", c0033a != null ? c0033a.f107e : true);
                            Set set3 = c0033a != null ? c0033a.f109g : null;
                            if (set3 == null) {
                                set3 = set;
                            }
                            LinkedHashSet linkedHashSetM8353U = AbstractC4156d0.m8353U(set3, set2);
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : linkedHashSetM8353U) {
                                if (!AbstractC3149m.m6721t0((String) obj)) {
                                    arrayList.add(obj);
                                }
                            }
                            Set setM8412U1 = AbstractC4166m.m8412U1(arrayList);
                            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("customRules", c0033a != null ? c0033a.f110h : false);
                            if (c0033a != null) {
                                jSONArray = jSONArray2;
                                z9 = c0033a.f111i;
                            } else {
                                jSONArray = jSONArray2;
                                z9 = false;
                            }
                            boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("typeAll", z9);
                            Set set4 = c0033a != null ? c0033a.f112j : null;
                            if (set4 != null) {
                                set = set4;
                            }
                            LinkedHashSet linkedHashSetM8353U2 = AbstractC4156d0.m8353U(set, m168D(jSONObjectOptJSONObject.optJSONArray("types")));
                            String str4 = c0033a != null ? c0033a.f113k : null;
                            if (str4 == null) {
                                str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            String strOptString6 = jSONObjectOptJSONObject.optString("textKeywords", str4);
                            strOptString6.getClass();
                            linkedHashMap.put(strM172a, new C0033a(strM172a, str2, strM183q, strOptString5, zOptBoolean, str3, setM8412U1, zOptBoolean2, zOptBoolean3, linkedHashSetM8353U2, strOptString6));
                        } else {
                            jSONArray = jSONArray2;
                        }
                    }
                    i9++;
                    jSONArray2 = jSONArray;
                }
                Collection collectionValues = linkedHashMap.values();
                collectionValues.getClass();
                return AbstractC4166m.m8407P1(collectionValues);
            } catch (Throwable unused) {
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static C0034b m190x(String str, boolean z9, boolean z10) {
        if (AbstractC3149m.m6721t0(str)) {
            return m174d(z9, z10);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0034b c0034bM174d = m174d(z9, z10);
            boolean zOptBoolean = jSONObject.optBoolean("enabled", false);
            Set setM166B = m166B(jSONObject.optJSONArray("templateIds"));
            if (setM166B.isEmpty()) {
                String strOptString = jSONObject.optString("templateId");
                strOptString.getClass();
                String string = AbstractC3149m.m6703R0(strOptString).toString();
                if (!(string.length() > 0)) {
                    string = null;
                }
                setM166B = string != null ? AbstractC0063p.m404N(string) : C4175v.f13712g;
            }
            Set set = setM166B;
            boolean zOptBoolean2 = jSONObject.optBoolean("customRules", false);
            boolean zOptBoolean3 = jSONObject.optBoolean("typeAll", false);
            Set setM168D = m168D(jSONObject.optJSONArray("types"));
            String strOptString2 = jSONObject.optString("textKeywords");
            strOptString2.getClass();
            return C0034b.m291a(c0034bM174d, false, null, false, zOptBoolean, set, zOptBoolean2, zOptBoolean3, setM168D, strOptString2, 7);
        } catch (Throwable unused) {
            return m174d(z9, z10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static Set m191y(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C4175v.f13712g;
        }
        C4335i c4335i = new C4335i();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            int iOptInt = jSONArray.optInt(i9, Integer.MIN_VALUE);
            if (AbstractC4156d0.m8355W(2, 3, 4, 5, 6, 7, 1).contains(Integer.valueOf(iOptInt))) {
                c4335i.add(Integer.valueOf(iOptInt));
            }
        }
        return AbstractC0063p.m415h(c4335i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static List m192z(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("planTimes");
        if (jSONArrayOptJSONArray == null) {
            long jOptLong = jSONObject.optLong("planTime", 0L);
            return AbstractC0000a.m1A0(jOptLong > 0 ? Long.valueOf(jOptLong) : null);
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        int length = jSONArrayOptJSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            long jOptLong2 = jSONArrayOptJSONArray.optLong(i9, 0L);
            Long lValueOf = Long.valueOf(jOptLong2);
            if (!(jOptLong2 > 0)) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                c4329cM7E.add(Long.valueOf(lValueOf.longValue()));
            }
        }
        return AbstractC4166m.m8401J1(AbstractC4166m.m8418p1(AbstractC0000a.m90t(c4329cM7E)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    @Override // ke.InterfaceC2395d
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo193c(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        int iM2747R;
        if (interfaceC4318n instanceof C6029c) {
            C6029c c6029c = (C6029c) interfaceC4318n;
            if (c6029c.f24481n != null) {
                InterfaceC4314j interfaceC4314j = c6029c.f24480m;
                if (interfaceC4314j == null ? false : AbstractC1089i.m2737L(interfaceC4314j, interfaceC4314j)) {
                    if (!AbstractC5792m.m10493j(AbstractC1089i.m2724E(c6029c.f24480m), EnumC3400k.f10988r) && c4322r.m8701Z() && (iM2747R = AbstractC1089i.m2747R(c6029c.f24480m)) < 5) {
                        int iM2747R2 = AbstractC1089i.m2747R(c6029c.f24481n);
                        int i9 = ((AbstractC2828e) c6029c.f24481n).f9217g.mo6235a(EnumC2824a.f9132R) ? 4 : 2;
                        if (iM2747R != iM2747R2 && (iM2747R * i9 <= iM2747R2 || iM2747R >= iM2747R2 * i9)) {
                            InterfaceC4318n interfaceC4318n2 = c6029c.f23506i;
                            C5775b c5775b = new C5775b(interfaceC4318n2);
                            if (interfaceC4318n2.mo8674l(c6029c, c5775b)) {
                                c5775b.m10464H(c6029c);
                                c5775b.m10464H(c6029c.f24481n);
                                c6029c.f24481n = null;
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public String m194h(AbstractC1986a abstractC1986a) {
        StringWriter stringWriter = new StringWriter();
        try {
            C3440a c3440aM196j = m196j(stringWriter);
            c3440aM196j.mo2079s(abstractC1986a.getName());
            c3440aM196j.f11157g.write(58);
            c3440aM196j.m7221t(abstractC1986a.getType());
            return stringWriter.toString();
        } catch (IOException unused) {
            C2104o.m5281f("Unexpected IOException");
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public Signature[] mo195i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public C3440a m196j(StringWriter stringWriter) {
        return new C0826a(stringWriter, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public synchronized boolean m197l(Context context, ClassLoader classLoader) {
        Object c3959f;
        classLoader.getClass();
        if (C0849a.f2598g) {
            return true;
        }
        Method methodM2089e = C0828b.m2089e(AbstractC4302b.m8640c(context, "Hchat_fake_mini_program_host_version_member_cache"), C0828b.m2091g(context, classLoader), classLoader, "private_open_url_method");
        if (methodM2089e != null) {
            if (!AbstractC5700d.m10282j(methodM2089e)) {
                methodM2089e = null;
            }
            if (methodM2089e != null) {
                try {
                    C3744i.f12154b.m7763b(methodM2089e, new C0850b(context, 0, false));
                    C0849a.f2598g = true;
                    c3959f = Boolean.TRUE;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    AbstractC1184v0.m3204n("[Hchat:FakeMiniProgramHostVersion] 小程序进程升级跳转Hook安装失败: " + thM8182b.getMessage(), thM8182b);
                    c3959f = Boolean.FALSE;
                }
                return ((Boolean) c3959f).booleanValue();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f49g) {
            case 4:
                return null;
            case 25:
                return "dex-input: Dex Input - 'Load .dex and .apk files'";
            default:
                return super.toString();
        }
    }

    public C0014a(C0655c0 c0655c0) {
        this.f49g = 0;
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.a.B(android.content.Context):l3.s, androidx.lifecycle.d0.<clinit>():void, b5.c.<init>(a5.a, k5.o):void, b8.e.<init>():void, ba.n.<clinit>():void, e9.a.b(java.lang.Object):void, f.r.<init>(int):void, gb.p.<clinit>():void, ha.d0.<clinit>():void, l3.i.<init>(l3.s):void, l3.s.<clinit>():void, te.b.<init>(bc.k, ff.c):void] */
    public /* synthetic */ C0014a(int i9) {
        this.f49g = i9;
    }
}
