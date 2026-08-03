package p036c9;

import ac.AbstractC0063p;
import android.content.Context;
import android.content.SharedPreferences;
import gg.AbstractC1416l;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ng.AbstractC3015m;
import ng.C3006d;
import ng.C3010h;
import ng.C3011i;
import ng.C3022t;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p015b0.C0136d0;
import p015b0.C0153s;
import p019b4.C0178b;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p304uf.C4327a;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;
import tf.C4175v;
import tf.C4176w;

/* JADX INFO: renamed from: c9.o2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0473o2 {

    /* JADX INFO: renamed from: a */
    public static final Object f1396a = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final String m1477a() {
        Object c3959f;
        Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            C1360a c1360aAccount = WeChatApis.account();
            String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
            if (strM3652c == null) {
                strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            c3959f = AbstractC3149m.m6703R0(strM3652c).toString();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            obj = c3959f;
        } else {
            AbstractC0921a.m2261x("[Hchat:ConversationGroup] 读取当前账号失败: ", thM8182b.getMessage(), thM8182b);
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1478b(Context context, C0414a c0414a) {
        boolean zM1494r;
        String string;
        context.getClass();
        c0414a.getClass();
        synchronized (f1396a) {
            try {
                String strM1477a = m1477a();
                if (AbstractC3149m.m6721t0(strM1477a)) {
                    zM1494r = false;
                } else {
                    List<C0414a> listM1486j = m1486j(context, strM1477a);
                    String string2 = AbstractC3149m.m6703R0(c0414a.f1179a).toString();
                    String string3 = AbstractC3149m.m6703R0(c0414a.f1180b).toString();
                    String str = c0414a.f1181c;
                    String str2 = null;
                    if (str != null && (string = AbstractC3149m.m6703R0(str).toString()) != null) {
                        if (string.length() > 0) {
                            str2 = string;
                        }
                    }
                    if (!AbstractC3149m.m6721t0(string2) && !AbstractC3149m.m6721t0(string3)) {
                        if (!listM1486j.isEmpty()) {
                            Iterator it = listM1486j.iterator();
                            while (it.hasNext()) {
                                if (AbstractC1416l.m3825a(((C0414a) it.next()).f1179a, string2)) {
                                    break;
                                }
                            }
                        }
                        if (str2 != null) {
                            if (!listM1486j.isEmpty()) {
                                Iterator it2 = listM1486j.iterator();
                                while (it2.hasNext()) {
                                    if (AbstractC1416l.m3825a(((C0414a) it2.next()).f1179a, str2)) {
                                    }
                                }
                            }
                            zM1494r = false;
                        }
                        C3022t c3022tM6413W = AbstractC3015m.m6413W(AbstractC4166m.m8415m1(c0414a.f1183e), C0461l2.f1356n);
                        C0465m2 c0465m2 = C0465m2.f1374n;
                        c0465m2.getClass();
                        C3011i c3011i = new C3011i(c3022tM6413W, true, c0465m2);
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        AbstractC3015m.m6417a0(c3011i, linkedHashSet);
                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM1486j));
                        for (C0414a c0414a2 : listM1486j) {
                            List list = c0414a2.f1183e;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list) {
                                if (!linkedHashSet.contains((String) obj)) {
                                    arrayList2.add(obj);
                                }
                            }
                            List list2 = c0414a2.f1184f;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (!linkedHashSet.contains((String) obj2)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            arrayList.add(C0414a.m1401a(c0414a2, null, null, null, 0, arrayList2, arrayList3, false, null, false, false, false, 4047));
                        }
                        int i9 = c0414a.f1182d;
                        int i10 = i9 < 0 ? 0 : i9;
                        List listM8407P1 = AbstractC4166m.m8407P1(linkedHashSet);
                        List list3 = c0414a.f1184f;
                        String str3 = str2;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj3 : list3) {
                            if (linkedHashSet.contains((String) obj3)) {
                                arrayList4.add(obj3);
                            }
                        }
                        zM1494r = m1494r(context, strM1477a, m1488l(AbstractC4166m.m8398G1(arrayList, C0414a.m1401a(c0414a, string2, string3, str3, i10, listM8407P1, arrayList4, false, null, false, false, false, 4032))));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zM1494r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m1479c(JSONObject jSONObject, String str, boolean z9) {
        Object objOpt = jSONObject.opt(str);
        Boolean bool = objOpt instanceof Boolean ? (Boolean) objOpt : null;
        return bool != null ? bool.booleanValue() : z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final String m1480d(String str, List list) {
        Object next;
        list.getClass();
        str.getClass();
        String string = AbstractC3149m.m6703R0(str).toString();
        if (!AbstractC3149m.m6721t0(string)) {
            Iterator it = m1488l(list).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C0414a) next).f1183e.contains(string)) {
                    break;
                }
            }
            C0414a c0414a = (C0414a) next;
            if (c0414a != null) {
                return c0414a.f1179a;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final boolean m1481e(Context context, Collection collection) {
        boolean zM1494r;
        context.getClass();
        collection.getClass();
        synchronized (f1396a) {
            try {
                String strM1477a = m1477a();
                zM1494r = false;
                if (!AbstractC3149m.m6721t0(strM1477a)) {
                    List listM1486j = m1486j(context, strM1477a);
                    C3022t c3022tM6413W = AbstractC3015m.m6413W(new C0795n(collection, 6), C0441g2.f1297n);
                    C0445h2 c0445h2 = C0445h2.f1306n;
                    c0445h2.getClass();
                    Set setM6419c0 = AbstractC3015m.m6419c0(new C3011i(c3022tM6413W, true, c0445h2));
                    HashSet hashSet = new HashSet();
                    Iterator it = listM1486j.iterator();
                    while (it.hasNext()) {
                        hashSet.add(((C0414a) it.next()).f1179a);
                    }
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (Object obj : setM6419c0) {
                        if (hashSet.contains((String) obj)) {
                            linkedHashSet.add(obj);
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        zM1494r = m1494r(context, strM1477a, m1488l(m1491o(listM1486j, linkedHashSet)));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zM1494r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final Set m1482f(String str, List list) {
        list.getClass();
        str.getClass();
        String string = AbstractC3149m.m6703R0(str).toString();
        if (!AbstractC3149m.m6721t0(string)) {
            ArrayList arrayListM1488l = m1488l(list);
            if (!arrayListM1488l.isEmpty()) {
                Iterator it = arrayListM1488l.iterator();
                while (it.hasNext()) {
                    if (AbstractC1416l.m3825a(((C0414a) it.next()).f1179a, string)) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        C1425u c1425u = new C1425u();
                        c1425u.f4738g = AbstractC0063p.m404N(string);
                        while (!((Collection) c1425u.f4738g).isEmpty()) {
                            C3022t c3022tM6413W = AbstractC3015m.m6413W(new C3011i(new C0795n(arrayListM1488l, 6), true, new C0446i(c1425u, 4, linkedHashSet)), new C0178b(6));
                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                            AbstractC3015m.m6417a0(c3022tM6413W, linkedHashSet2);
                            linkedHashSet.addAll(linkedHashSet2);
                            c1425u.f4738g = linkedHashSet2;
                        }
                        linkedHashSet.remove(string);
                        return linkedHashSet;
                    }
                }
            }
        }
        return C4175v.f13712g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static JSONArray m1483g(List list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0414a c0414a = (C0414a) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", c0414a.f1179a);
            jSONObject.put("name", c0414a.f1180b);
            Object obj = c0414a.f1181c;
            if (obj == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("parentId", obj);
            jSONObject.put("order", c0414a.f1182d);
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = c0414a.f1183e.iterator();
            while (it2.hasNext()) {
                jSONArray2.put((String) it2.next());
            }
            jSONObject.put("conversationIds", jSONArray2);
            JSONArray jSONArray3 = new JSONArray();
            Iterator it3 = c0414a.f1184f.iterator();
            while (it3.hasNext()) {
                jSONArray3.put((String) it3.next());
            }
            jSONObject.put("pinnedConversationIds", jSONArray3);
            jSONObject.put("pinned", c0414a.f1185g);
            jSONObject.put("avatarPath", c0414a.f1186h);
            jSONObject.put("showUnreadCount", c0414a.f1187i);
            jSONObject.put("previewLatestMessage", c0414a.f1188j);
            jSONObject.put("roundAvatar", c0414a.f1189k);
            jSONObject.put("showEmpty", c0414a.f1190l);
            jSONArray.put(jSONObject);
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static final C0437f2 m1484h(Context context, String str) {
        Object c3959f;
        C0437f2 c0437f2;
        synchronized (f1396a) {
            String strM1477a = m1477a();
            if (AbstractC3149m.m6721t0(strM1477a)) {
                c0437f2 = new C0437f2("当前微信账号尚未就绪", 0, false);
            } else {
                try {
                    c3959f = m1490n(str);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b == null) {
                    List list = (List) c3959f;
                    if (m1494r(context, strM1477a, list)) {
                        c0437f2 = new C0437f2("已导入 " + list.size() + " 个分组", list.size(), true);
                    } else {
                        c0437f2 = new C0437f2("保存聊天分组失败", 0, false);
                    }
                } else {
                    AbstractC1184v0.m3204n("[Hchat:ConversationGroup] 校验聊天分组导入文件失败: " + thM8182b.getMessage(), thM8182b);
                    String message = thM8182b.getMessage();
                    if (message == null) {
                        message = "导入文件格式错误";
                    }
                    c0437f2 = new C0437f2(message, 0, false);
                }
            }
        }
        return c0437f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final List m1485i(Context context) {
        List listM1486j;
        context.getClass();
        synchronized (f1396a) {
            try {
                String strM1477a = m1477a();
                listM1486j = AbstractC3149m.m6721t0(strM1477a) ? C4173t.f13710g : m1486j(context, strM1477a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listM1486j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static List m1486j(Context context, String str) {
        Object c3959f;
        Object obj;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_conversation_groups");
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferencesM8640c.getString("groups_v1", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str2 = string;
        }
        boolean zM6721t0 = AbstractC3149m.m6721t0(str2);
        C4173t c4173t = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t;
        }
        try {
            JSONObject jSONObject = new JSONObject(str2);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("accounts");
            if (jSONObjectOptJSONObject != null) {
                List listM1489m = m1489m(jSONObjectOptJSONObject.optJSONArray(str));
                ArrayList arrayListM1488l = m1488l(listM1489m);
                boolean zEquals = arrayListM1488l.equals(listM1489m);
                c3959f = arrayListM1488l;
                if (!zEquals) {
                    jSONObjectOptJSONObject.put(str, m1483g(arrayListM1488l));
                    jSONObject.put("schemaVersion", 1);
                    jSONObject.put("accounts", jSONObjectOptJSONObject);
                    c3959f = arrayListM1488l;
                    if (!sharedPreferencesM8640c.edit().putString("groups_v1", jSONObject.toString()).commit()) {
                        AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 保存账号 " + str + " 的修复结果失败");
                        c3959f = arrayListM1488l;
                    }
                }
            } else {
                c3959f = c4173t;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b == null) {
            obj = c3959f;
        } else {
            AbstractC0921a.m2260w("[Hchat:ConversationGroup] 读取账号 ", str, " 的聊天分组失败: ", thM8182b.getMessage(), thM8182b);
            obj = c4173t;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final C0414a m1487k(String str) {
        String string;
        String string2 = UUID.randomUUID().toString();
        string2.getClass();
        String str2 = null;
        if (str != null && (string = AbstractC3149m.m6703R0(str).toString()) != null) {
            if (Boolean.valueOf(string.length() > 0).booleanValue()) {
                str2 = string;
            }
        }
        C4173t c4173t = C4173t.f13710g;
        return new C0414a(string2, HttpUrl.FRAGMENT_ENCODE_SET, str2, 0, c4173t, c4173t, false, HttpUrl.FRAGMENT_ENCODE_SET, true, true, true, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0140  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList m1488l(List list) {
        String string;
        list.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            C0414a c0414a = (C0414a) it.next();
            String string2 = AbstractC3149m.m6703R0(c0414a.f1179a).toString();
            String string3 = AbstractC3149m.m6703R0(c0414a.f1180b).toString();
            if (!AbstractC3149m.m6721t0(string2) && !AbstractC3149m.m6721t0(string3)) {
                C3022t c3022tM6413W = AbstractC3015m.m6413W(AbstractC4166m.m8415m1(c0414a.f1183e), C0449i2.f1315n);
                C0453j2 c0453j2 = C0453j2.f1328n;
                c0453j2.getClass();
                List listM6418b0 = AbstractC3015m.m6418b0(AbstractC3015m.m6409S(new C3011i(c3022tM6413W, true, c0453j2)));
                List listM6418b02 = AbstractC3015m.m6418b0(AbstractC3015m.m6409S(new C3011i(AbstractC3015m.m6413W(AbstractC4166m.m8415m1(c0414a.f1184f), C0457k2.f1341n), true, new C0136d0(listM6418b0, 4))));
                C0414a c0414a2 = (C0414a) linkedHashMap.get(string2);
                if (c0414a2 == null) {
                    String str2 = c0414a.f1181c;
                    if (str2 != null && (string = AbstractC3149m.m6703R0(str2).toString()) != null) {
                        if (string.length() > 0) {
                            str = string;
                        }
                    }
                    String str3 = str;
                    int i9 = c0414a.f1182d;
                    linkedHashMap.put(string2, C0414a.m1401a(c0414a, string2, string3, str3, i9 < 0 ? 0 : i9, listM6418b0, listM6418b02, false, AbstractC3149m.m6703R0(c0414a.f1186h).toString(), false, false, false, 3904));
                } else {
                    linkedHashMap.put(string2, C0414a.m1401a(c0414a2, null, null, null, 0, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC4166m.m8397F1(c0414a2.f1183e, listM6418b0))), AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC4166m.m8397F1(c0414a2.f1184f, listM6418b02))), false, null, false, false, false, 4047));
                }
            }
        }
        Set setKeySet = linkedHashMap.keySet();
        setKeySet.getClass();
        Set set = setKeySet;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String str4 = (String) entry.getKey();
            String str5 = ((C0414a) entry.getValue()).f1181c;
            if (str5 == null) {
                str5 = null;
            } else if (!str5.equals(str4) && set.contains(str5)) {
            }
            linkedHashMap2.put(key, str5);
        }
        HashMap map = new HashMap();
        Iterator it2 = linkedHashMap2.keySet().iterator();
        while (it2.hasNext()) {
            m1493q(map, linkedHashMap2, (String) it2.next());
        }
        Collection collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        Collection<C0414a> collection = collectionValues;
        ArrayList<C0414a> arrayList = new ArrayList(AbstractC4167n.m8429e1(collection));
        for (C0414a c0414a3 : collection) {
            c0414a3.getClass();
            arrayList.add(C0414a.m1401a(c0414a3, null, null, (String) linkedHashMap2.get(c0414a3.f1179a), 0, null, null, false, null, false, false, false, 4091));
        }
        HashMap map2 = new HashMap();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        C3006d c3006d = new C3006d(arrayList.iterator());
        while (c3006d.f9795i.hasNext()) {
            Object next = c3006d.next();
            String str6 = ((C0414a) ((C4176w) next).f13714b).f1181c;
            Object arrayList2 = linkedHashMap3.get(str6);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap3.put(str6, arrayList2);
            }
            ((List) arrayList2).add(next);
        }
        Iterator it3 = linkedHashMap3.values().iterator();
        while (it3.hasNext()) {
            int i10 = 0;
            for (Object obj : AbstractC4166m.m8402K1((List) it3.next(), new C0415a0(new C0444h1(2), 1))) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    AbstractC0000a.m32Q0();
                    throw null;
                }
                map2.put(((C0414a) ((C4176w) obj).f13714b).f1179a, Integer.valueOf(i10));
                i10 = i11;
            }
        }
        ArrayList<C0414a> arrayList3 = new ArrayList(AbstractC4167n.m8429e1(arrayList));
        for (C0414a c0414a4 : arrayList) {
            Integer num = (Integer) map2.get(c0414a4.f1179a);
            arrayList3.add(C0414a.m1401a(c0414a4, null, null, null, num != null ? num.intValue() : 0, null, null, false, null, false, false, false, 4087));
        }
        HashMap map3 = new HashMap();
        for (C0414a c0414a5 : arrayList3) {
            Iterator it4 = c0414a5.f1183e.iterator();
            while (it4.hasNext()) {
                map3.put((String) it4.next(), c0414a5.f1179a);
            }
        }
        ArrayList arrayList4 = new ArrayList(AbstractC4167n.m8429e1(arrayList3));
        for (C0414a c0414a6 : arrayList3) {
            List list2 = c0414a6.f1183e;
            ArrayList arrayList5 = new ArrayList();
            for (Object obj2 : list2) {
                if (AbstractC1416l.m3825a(map3.get((String) obj2), c0414a6.f1179a)) {
                    arrayList5.add(obj2);
                }
            }
            List list3 = c0414a6.f1184f;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj3 : list3) {
                if (arrayList5.contains((String) obj3)) {
                    arrayList6.add(obj3);
                }
            }
            arrayList4.add(C0414a.m1401a(c0414a6, null, null, null, 0, arrayList5, arrayList6, false, null, false, false, false, 4047));
        }
        return arrayList4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static List m1489m(JSONArray jSONArray) {
        String str;
        String string;
        if (jSONArray == null) {
            return C4173t.f13710g;
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            if (jSONObjectOptJSONObject != null) {
                C4329c c4329cM7E2 = AbstractC0000a.m7E();
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("conversationIds");
                if (jSONArrayOptJSONArray == null) {
                    jSONArrayOptJSONArray = new JSONArray();
                }
                int length2 = jSONArrayOptJSONArray.length();
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        break;
                    }
                    String strOptString = jSONArrayOptJSONArray.optString(i10);
                    str = AbstractC3149m.m6721t0(strOptString) ? null : strOptString;
                    if (str != null) {
                        c4329cM7E2.add(str);
                    }
                    i10++;
                }
                C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E2);
                C4329c c4329cM7E3 = AbstractC0000a.m7E();
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("pinnedConversationIds");
                if (jSONArrayOptJSONArray2 == null) {
                    jSONArrayOptJSONArray2 = new JSONArray();
                }
                JSONArray jSONArray2 = jSONArrayOptJSONArray2;
                int length3 = jSONArray2.length();
                for (int i11 = 0; i11 < length3; i11++) {
                    String strOptString2 = jSONArray2.optString(i11);
                    if (AbstractC3149m.m6721t0(strOptString2)) {
                        strOptString2 = null;
                    }
                    if (strOptString2 != null) {
                        c4329cM7E3.add(strOptString2);
                    }
                }
                C4329c c4329cM90t2 = AbstractC0000a.m90t(c4329cM7E3);
                String strOptString3 = jSONObjectOptJSONObject.optString("id");
                strOptString3.getClass();
                String strOptString4 = jSONObjectOptJSONObject.optString("name");
                strOptString4.getClass();
                String strOptString5 = jSONObjectOptJSONObject.optString("parentId");
                String str2 = !AbstractC3149m.m6721t0(strOptString5) ? strOptString5 : null;
                int iOptInt = jSONObjectOptJSONObject.optInt("order", i9);
                boolean zM1479c = m1479c(jSONObjectOptJSONObject, "pinned", false);
                Object objOpt = jSONObjectOptJSONObject.opt("avatarPath");
                str = objOpt instanceof String ? (String) objOpt : null;
                if (str == null || (string = AbstractC3149m.m6703R0(str).toString()) == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                c4329cM7E.add(new C0414a(strOptString3, strOptString4, str2, iOptInt, c4329cM90t, c4329cM90t2, zM1479c, string, m1479c(jSONObjectOptJSONObject, "showUnreadCount", true), m1479c(jSONObjectOptJSONObject, "previewLatestMessage", true), m1479c(jSONObjectOptJSONObject, "roundAvatar", true), m1479c(jSONObjectOptJSONObject, "showEmpty", false)));
            }
        }
        return AbstractC0000a.m90t(c4329cM7E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static ArrayList m1490n(String str) {
        String str2;
        JSONArray jSONArray;
        String string;
        if (AbstractC3149m.m6721t0(str)) {
            C2104o.m5294t("导入文件为空");
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!AbstractC1416l.m3825a(jSONObject.optString("format"), "HchatConversationGroups") || !(jSONObject.opt("schema") instanceof String) || !AbstractC1416l.m3825a(jSONObject.optString("schema"), "HchatConversationGroups")) {
            C2104o.m5294t("不是 Hchat 聊天分组文件");
            return null;
        }
        if (jSONObject.opt("version") instanceof Number) {
            int i9 = 1;
            if (jSONObject.optInt("version", -1) == 1) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("groups");
                if (jSONArrayOptJSONArray == null) {
                    C2104o.m5276A("导入文件缺少分组数据");
                    return null;
                }
                HashSet hashSet = new HashSet();
                C4329c c4329cM7E = AbstractC0000a.m7E();
                int length = jSONArrayOptJSONArray.length();
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i11);
                    if (jSONObjectOptJSONObject == null) {
                        throw new IllegalStateException(("第 " + (i11 + 1) + " 个分组格式错误").toString());
                    }
                    if (!(jSONObjectOptJSONObject.opt("id") instanceof String) || !(jSONObjectOptJSONObject.opt("name") instanceof String)) {
                        C2104o.m5291q(AbstractC0921a.m2250m(i11 + 1, "第 ", " 个分组字段格式错误"));
                        return null;
                    }
                    String strM9266j = AbstractC4855en.m9266j("id", jSONObjectOptJSONObject);
                    String strM9266j2 = AbstractC4855en.m9266j("name", jSONObjectOptJSONObject);
                    if (AbstractC3149m.m6721t0(strM9266j)) {
                        C2104o.m5291q(AbstractC0921a.m2250m(i11 + 1, "第 ", " 个分组缺少 ID"));
                        return null;
                    }
                    if (AbstractC3149m.m6721t0(strM9266j2)) {
                        C2104o.m5291q(AbstractC0921a.m2250m(i11 + 1, "第 ", " 个分组缺少名称"));
                        return null;
                    }
                    if (!hashSet.add(strM9266j)) {
                        C2104o.m5294t("导入文件包含重复分组 ID");
                        return null;
                    }
                    if (jSONObjectOptJSONObject.isNull("parentId")) {
                        str2 = null;
                    } else {
                        if (!(jSONObjectOptJSONObject.opt("parentId") instanceof String)) {
                            C2104o.m5291q(AbstractC0921a.m2251n("分组 ", strM9266j2, " 的上级分组格式错误"));
                            return null;
                        }
                        String strM9266j3 = AbstractC4855en.m9266j("parentId", jSONObjectOptJSONObject);
                        if ((strM9266j3.length() > 0 ? i9 : i10) == 0) {
                            strM9266j3 = null;
                        }
                        str2 = strM9266j3;
                    }
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("conversationIds");
                    if (jSONArrayOptJSONArray2 == null) {
                        C3193a.m6824m(strM9266j2, "分组 ", " 缺少会话列表");
                        return null;
                    }
                    if (jSONObjectOptJSONObject.has("pinnedConversationIds")) {
                        Object objOpt = jSONObjectOptJSONObject.opt("pinnedConversationIds");
                        if (!(objOpt instanceof JSONArray)) {
                            C2104o.m5291q(AbstractC0921a.m2251n("分组 ", strM9266j2, " 的置顶会话列表格式错误"));
                            return null;
                        }
                        jSONArray = (JSONArray) objOpt;
                    } else {
                        jSONArray = new JSONArray();
                    }
                    if (jSONObjectOptJSONObject.has("order") && !(jSONObjectOptJSONObject.opt("order") instanceof Number)) {
                        C2104o.m5291q(AbstractC0921a.m2251n("分组 ", strM9266j2, " 的排序字段格式错误"));
                        return null;
                    }
                    if (jSONObjectOptJSONObject.has("pinned") && !(jSONObjectOptJSONObject.opt("pinned") instanceof Boolean)) {
                        C2104o.m5291q(AbstractC0921a.m2251n("分组 ", strM9266j2, " 的主页置顶字段格式错误"));
                        return null;
                    }
                    if (jSONObjectOptJSONObject.has("avatarPath") && !(jSONObjectOptJSONObject.opt("avatarPath") instanceof String)) {
                        C2104o.m5291q(AbstractC0921a.m2251n("分组 ", strM9266j2, " 的头像路径字段格式错误"));
                        return null;
                    }
                    if (jSONObjectOptJSONObject.has("showUnreadCount") && !(jSONObjectOptJSONObject.opt("showUnreadCount") instanceof Boolean)) {
                        C2104o.m5291q(AbstractC0921a.m2251n("分组 ", strM9266j2, " 的未读数字字段格式错误"));
                        return null;
                    }
                    JSONArray jSONArray2 = jSONArrayOptJSONArray;
                    if (jSONObjectOptJSONObject.has("previewLatestMessage") && !(jSONObjectOptJSONObject.opt("previewLatestMessage") instanceof Boolean)) {
                        C2104o.m5291q(AbstractC0921a.m2251n("分组 ", strM9266j2, " 的最新消息预览字段格式错误"));
                        return null;
                    }
                    String str3 = "roundAvatar";
                    HashSet hashSet2 = hashSet;
                    if (jSONObjectOptJSONObject.has("roundAvatar") && !(jSONObjectOptJSONObject.opt("roundAvatar") instanceof Boolean)) {
                        C2104o.m5291q(AbstractC0921a.m2251n("分组 ", strM9266j2, " 的圆形头像字段格式错误"));
                        return null;
                    }
                    String str4 = "showEmpty";
                    int i12 = length;
                    if (jSONObjectOptJSONObject.has("showEmpty") && !(jSONObjectOptJSONObject.opt("showEmpty") instanceof Boolean)) {
                        C2104o.m5291q(AbstractC0921a.m2251n("分组 ", strM9266j2, " 的空分组显示字段格式错误"));
                        return null;
                    }
                    C4329c c4329cM7E2 = AbstractC0000a.m7E();
                    int length2 = jSONArrayOptJSONArray2.length();
                    String str5 = strM9266j2;
                    int i13 = 0;
                    while (i13 < length2) {
                        String str6 = str5;
                        int i14 = length2;
                        int i15 = i13;
                        String str7 = str3;
                        String str8 = str4;
                        Object objOpt2 = jSONArrayOptJSONArray2.opt(i15);
                        if (!(objOpt2 instanceof String)) {
                            C2104o.m5291q(AbstractC0921a.m2251n("分组 ", str6, " 的会话数据格式错误"));
                            return null;
                        }
                        String string2 = AbstractC3149m.m6703R0((String) objOpt2).toString();
                        if (!(string2.length() > 0)) {
                            string2 = null;
                        }
                        if (string2 != null) {
                            c4329cM7E2.add(string2);
                        }
                        int i16 = i15 + 1;
                        length2 = i14;
                        str4 = str8;
                        str5 = str6;
                        i13 = i16;
                        str3 = str7;
                    }
                    String str9 = str5;
                    C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E2);
                    C4329c c4329cM7E3 = AbstractC0000a.m7E();
                    int length3 = jSONArray.length();
                    int i17 = 0;
                    while (i17 < length3) {
                        String str10 = str3;
                        Object objOpt3 = jSONArray.opt(i17);
                        String str11 = str4;
                        if (!(objOpt3 instanceof String)) {
                            C2104o.m5291q(AbstractC0921a.m2251n("分组 ", str9, " 的置顶会话数据格式错误"));
                            return null;
                        }
                        String string3 = AbstractC3149m.m6703R0((String) objOpt3).toString();
                        if (!(string3.length() > 0)) {
                            string3 = null;
                        }
                        if (string3 != null) {
                            c4329cM7E3.add(string3);
                        }
                        i17++;
                        str3 = str10;
                        str4 = str11;
                    }
                    C4329c c4329cM90t2 = AbstractC0000a.m90t(c4329cM7E3);
                    int iOptInt = jSONObjectOptJSONObject.optInt("order", i11);
                    if (iOptInt < 0) {
                        iOptInt = 0;
                    }
                    boolean zM1479c = m1479c(jSONObjectOptJSONObject, "pinned", false);
                    Object objOpt4 = jSONObjectOptJSONObject.opt("avatarPath");
                    String str12 = objOpt4 instanceof String ? (String) objOpt4 : null;
                    if (str12 == null || (string = AbstractC3149m.m6703R0(str12).toString()) == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    c4329cM7E.add(new C0414a(strM9266j, str9, str2, iOptInt, c4329cM90t, c4329cM90t2, zM1479c, string, m1479c(jSONObjectOptJSONObject, "showUnreadCount", true), m1479c(jSONObjectOptJSONObject, "previewLatestMessage", true), m1479c(jSONObjectOptJSONObject, str3, true), m1479c(jSONObjectOptJSONObject, str4, false)));
                    i11++;
                    i10 = 0;
                    jSONArrayOptJSONArray = jSONArray2;
                    hashSet = hashSet2;
                    length = i12;
                    i9 = 1;
                }
                C4329c c4329cM90t3 = AbstractC0000a.m90t(c4329cM7E);
                ListIterator listIterator = c4329cM90t3.listIterator(i10);
                while (true) {
                    C4327a c4327a = (C4327a) listIterator;
                    if (!c4327a.hasNext()) {
                        return m1488l(c4329cM90t3);
                    }
                    C0414a c0414a = (C0414a) c4327a.next();
                    String str13 = c0414a.f1181c;
                    if (str13 != null && !hashSet.contains(str13)) {
                        C2104o.m5291q(AbstractC0921a.m2251n("分组 ", c0414a.f1180b, " 的上级分组不存在"));
                        return null;
                    }
                }
            }
        }
        C2104o.m5294t("不支持的聊天分组文件版本");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static List m1491o(List list, final LinkedHashSet linkedHashSet) {
        int iM8438a0 = AbstractC4178y.m8438a0(AbstractC4167n.m8429e1(list));
        if (iM8438a0 < 16) {
            iM8438a0 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8438a0);
        for (Object obj : list) {
            linkedHashMap.put(((C0414a) obj).f1179a, obj);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        final int i9 = 0;
        C3010h c3010h = new C3010h(new C3011i(new C0795n(list, 6), true, new InterfaceC1231l() { // from class: c9.e2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1231l
            public final Object invoke(Object obj2) {
                boolean zContains;
                C0414a c0414a = (C0414a) obj2;
                switch (i9) {
                    case 0:
                        c0414a.getClass();
                        zContains = linkedHashSet.contains(c0414a.f1179a);
                        break;
                    default:
                        c0414a.getClass();
                        zContains = linkedHashSet.contains(c0414a.f1179a);
                        break;
                }
                return Boolean.valueOf(zContains);
            }
        }));
        while (c3010h.hasNext()) {
            C0414a c0414a = (C0414a) c3010h.next();
            String strM1492p = m1492p(linkedHashMap, linkedHashSet, c0414a.f1181c);
            if (strM1492p != null) {
                Object arrayList = linkedHashMap2.get(strM1492p);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap2.put(strM1492p, arrayList);
                }
                ((List) arrayList).addAll(c0414a.f1183e);
            }
        }
        final int i10 = 1;
        return AbstractC3015m.m6418b0(AbstractC3015m.m6413W(new C3011i(new C0795n(list, 6), false, new InterfaceC1231l() { // from class: c9.e2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1231l
            public final Object invoke(Object obj2) {
                boolean zContains;
                C0414a c0414a2 = (C0414a) obj2;
                switch (i10) {
                    case 0:
                        c0414a2.getClass();
                        zContains = linkedHashSet.contains(c0414a2.f1179a);
                        break;
                    default:
                        c0414a2.getClass();
                        zContains = linkedHashSet.contains(c0414a2.f1179a);
                        break;
                }
                return Boolean.valueOf(zContains);
            }
        }), new C0153s(linkedHashMap2, linkedHashMap, linkedHashSet, 5)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static final String m1492p(LinkedHashMap linkedHashMap, LinkedHashSet linkedHashSet, String str) {
        HashSet hashSet = new HashSet();
        while (str != null && hashSet.add(str)) {
            C0414a c0414a = (C0414a) linkedHashMap.get(str);
            if (c0414a == null) {
                return null;
            }
            String str2 = c0414a.f1179a;
            if (!linkedHashSet.contains(str2)) {
                return str2;
            }
            str = c0414a.f1181c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final void m1493q(HashMap map, LinkedHashMap linkedHashMap, String str) {
        Integer num = (Integer) map.get(str);
        if (num != null && num.intValue() == 1) {
            return;
        }
        if (num != null && num.intValue() == 2) {
            return;
        }
        map.put(str, 1);
        String str2 = (String) linkedHashMap.get(str);
        if (str2 != null) {
            Integer num2 = (Integer) map.get(str2);
            if (num2 != null && num2.intValue() == 1) {
                linkedHashMap.put(str, null);
            } else {
                m1493q(map, linkedHashMap, str2);
            }
        }
        map.put(str, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m1494r(Context context, String str, List list) throws JSONException {
        Object c3959f;
        JSONObject jSONObject;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_conversation_groups");
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferencesM8640c.getString("groups_v1", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str2 = string;
        }
        if (AbstractC3149m.m6721t0(str2)) {
            jSONObject = new JSONObject();
        } else {
            try {
                c3959f = new JSONObject(str2);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                AbstractC0921a.m2261x("[Hchat:ConversationGroup] 配置已损坏，拒绝覆盖现有账号数据: ", thM8182b.getMessage(), thM8182b);
                return false;
            }
            jSONObject = (JSONObject) c3959f;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("accounts");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        jSONObjectOptJSONObject.put(str, m1483g(list));
        jSONObject.put("schemaVersion", 1);
        jSONObject.put("accounts", jSONObjectOptJSONObject);
        boolean zCommit = sharedPreferencesM8640c.edit().putString("groups_v1", jSONObject.toString()).commit();
        if (!zCommit) {
            AbstractC1184v0.m3203m("[Hchat:ConversationGroup] 保存账号 " + str + " 的聊天分组失败");
        }
        return zCommit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static final boolean m1495s(Context context, String str, String str2) {
        boolean zM1494r;
        String string;
        context.getClass();
        str.getClass();
        synchronized (f1396a) {
            try {
                String strM1477a = m1477a();
                String string2 = AbstractC3149m.m6703R0(str).toString();
                String str3 = null;
                zM1494r = true;
                if (str2 != null && (string = AbstractC3149m.m6703R0(str2).toString()) != null) {
                    if (string.length() > 0) {
                        str3 = string;
                    }
                }
                if (AbstractC3149m.m6721t0(strM1477a) || AbstractC3149m.m6721t0(string2) || AbstractC3156t.m6740d0(string2, "wxid_hchat_group_", false)) {
                    zM1494r = false;
                } else {
                    List<C0414a> listM1486j = m1486j(context, strM1477a);
                    if (str3 != null) {
                        if (!listM1486j.isEmpty()) {
                            Iterator it = listM1486j.iterator();
                            while (it.hasNext()) {
                                if (AbstractC1416l.m3825a(((C0414a) it.next()).f1179a, str3)) {
                                }
                            }
                        }
                        zM1494r = false;
                    }
                    if (!AbstractC1416l.m3825a(m1480d(string2, listM1486j), str3)) {
                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM1486j));
                        for (C0414a c0414a : listM1486j) {
                            List list = c0414a.f1183e;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : list) {
                                if (!AbstractC1416l.m3825a((String) obj, string2)) {
                                    arrayList2.add(obj);
                                }
                            }
                            List list2 = c0414a.f1184f;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (!AbstractC1416l.m3825a((String) obj2, string2)) {
                                    arrayList3.add(obj2);
                                }
                            }
                            arrayList.add(AbstractC1416l.m3825a(c0414a.f1179a, str3) ? C0414a.m1401a(c0414a, null, null, null, 0, AbstractC4166m.m8398G1(arrayList2, string2), arrayList3, false, null, false, false, false, 4047) : C0414a.m1401a(c0414a, null, null, null, 0, arrayList2, arrayList3, false, null, false, false, false, 4047));
                        }
                        zM1494r = m1494r(context, strM1477a, m1488l(arrayList));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zM1494r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:4:0x0005, B:6:0x000e, B:8:0x0018, B:16:0x0028, B:18:0x004f, B:21:0x0057, B:23:0x005d, B:26:0x0065, B:27:0x0069, B:29:0x006f, B:31:0x007d, B:32:0x008a, B:34:0x0090, B:35:0x00a2, B:37:0x00a8, B:39:0x00b5, B:40:0x00b9, B:41:0x00c4, B:43:0x00ca, B:45:0x00d7, B:46:0x00db, B:48:0x00e3, B:50:0x0116, B:49:0x0103, B:51:0x011b), top: B:56:0x0005 }] */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1496t(Context context, String str, ArrayList arrayList) {
        boolean zM1494r;
        String string;
        synchronized (f1396a) {
            try {
                String strM1477a = m1477a();
                String str2 = null;
                zM1494r = false;
                if (str != null && (string = AbstractC3149m.m6703R0(str).toString()) != null) {
                    if (string.length() > 0) {
                        str2 = string;
                    }
                }
                C3011i c3011i = new C3011i(AbstractC3015m.m6413W(new C0795n(arrayList, 6), C0469n2.f1386n), true, new C0178b(7));
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                AbstractC3015m.m6417a0(c3011i, linkedHashSet);
                if (!AbstractC3149m.m6721t0(strM1477a) && !linkedHashSet.isEmpty()) {
                    List<C0414a> listM1486j = m1486j(context, strM1477a);
                    if (str2 == null) {
                        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM1486j));
                        for (C0414a c0414a : listM1486j) {
                            List list = c0414a.f1183e;
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : list) {
                                if (!linkedHashSet.contains((String) obj)) {
                                    arrayList3.add(obj);
                                }
                            }
                            List list2 = c0414a.f1184f;
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj2 : list2) {
                                if (!linkedHashSet.contains((String) obj2)) {
                                    arrayList4.add(obj2);
                                }
                            }
                            arrayList2.add(AbstractC1416l.m3825a(c0414a.f1179a, str2) ? C0414a.m1401a(c0414a, null, null, null, 0, AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC4166m.m8397F1(arrayList3, linkedHashSet))), arrayList4, false, null, false, false, false, 4047) : C0414a.m1401a(c0414a, null, null, null, 0, arrayList3, arrayList4, false, null, false, false, false, 4047));
                        }
                        zM1494r = m1494r(context, strM1477a, m1488l(arrayList2));
                    } else if (!listM1486j.isEmpty()) {
                        Iterator it = listM1486j.iterator();
                        while (it.hasNext()) {
                            if (AbstractC1416l.m3825a(((C0414a) it.next()).f1179a, str2)) {
                                ArrayList arrayList22 = new ArrayList(AbstractC4167n.m8429e1(listM1486j));
                                while (r6.hasNext()) {
                                }
                                zM1494r = m1494r(context, strM1477a, m1488l(arrayList22));
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zM1494r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:4:0x000d, B:7:0x001b, B:8:0x002f, B:10:0x0035, B:18:0x004f, B:21:0x0061, B:23:0x0068, B:25:0x0072, B:48:0x00ba, B:49:0x00e3, B:51:0x00e9, B:53:0x00f6, B:54:0x00fa, B:55:0x0111, B:57:0x0117, B:59:0x011f, B:61:0x0123, B:64:0x0133, B:78:0x01c3, B:65:0x0159, B:66:0x016c, B:68:0x0172, B:70:0x017f, B:71:0x0183, B:72:0x018e, B:74:0x0194, B:76:0x01a1, B:77:0x01a5, B:79:0x01d6, B:80:0x01d9, B:81:0x01da, B:34:0x0085, B:36:0x008b, B:39:0x0092, B:40:0x0096, B:42:0x009c, B:44:0x00aa, B:13:0x0045), top: B:86:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ba A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:4:0x000d, B:7:0x001b, B:8:0x002f, B:10:0x0035, B:18:0x004f, B:21:0x0061, B:23:0x0068, B:25:0x0072, B:48:0x00ba, B:49:0x00e3, B:51:0x00e9, B:53:0x00f6, B:54:0x00fa, B:55:0x0111, B:57:0x0117, B:59:0x011f, B:61:0x0123, B:64:0x0133, B:78:0x01c3, B:65:0x0159, B:66:0x016c, B:68:0x0172, B:70:0x017f, B:71:0x0183, B:72:0x018e, B:74:0x0194, B:76:0x01a1, B:77:0x01a5, B:79:0x01d6, B:80:0x01d9, B:81:0x01da, B:34:0x0085, B:36:0x008b, B:39:0x0092, B:40:0x0096, B:42:0x009c, B:44:0x00aa, B:13:0x0045), top: B:86:0x000d }] */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m1497u(Context context, C0414a c0414a) {
        boolean zM1494r;
        String string;
        boolean z9;
        String str;
        int i9;
        String str2;
        LinkedHashSet linkedHashSet;
        String str3;
        ArrayList arrayList;
        C0414a c0414aM1401a;
        C0414a c0414a2 = c0414a;
        context.getClass();
        c0414a2.getClass();
        synchronized (f1396a) {
            try {
                String strM1477a = m1477a();
                zM1494r = false;
                if (!AbstractC3149m.m6721t0(strM1477a)) {
                    List listM1486j = m1486j(context, strM1477a);
                    String string2 = AbstractC3149m.m6703R0(c0414a2.f1179a).toString();
                    Iterator it = listM1486j.iterator();
                    int i10 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i10 = -1;
                            break;
                        }
                        if (AbstractC1416l.m3825a(((C0414a) it.next()).f1179a, string2)) {
                            break;
                        }
                        i10++;
                    }
                    int i11 = i10;
                    if (i11 >= 0 && !AbstractC3149m.m6721t0(AbstractC3149m.m6703R0(c0414a2.f1180b).toString())) {
                        String str4 = c0414a2.f1181c;
                        if (str4 == null || (string = AbstractC3149m.m6703R0(str4).toString()) == null) {
                            string = null;
                            if (string != null) {
                                z9 = true;
                            } else if (string.equals(string2) || listM1486j.isEmpty()) {
                                z9 = false;
                            } else {
                                Iterator it2 = listM1486j.iterator();
                                while (it2.hasNext()) {
                                    if (AbstractC1416l.m3825a(((C0414a) it2.next()).f1179a, string)) {
                                        z9 = !m1482f(string2, listM1486j).contains(string);
                                        break;
                                    }
                                }
                                z9 = false;
                            }
                            if (!z9) {
                                C3022t c3022tM6413W = AbstractC3015m.m6413W(AbstractC4166m.m8415m1(c0414a2.f1183e), C0461l2.f1356n);
                                C0465m2 c0465m2 = C0465m2.f1374n;
                                c0465m2.getClass();
                                C3011i c3011i = new C3011i(c3022tM6413W, true, c0465m2);
                                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                AbstractC3015m.m6417a0(c3011i, linkedHashSet2);
                                List list = c0414a2.f1184f;
                                ArrayList arrayList2 = new ArrayList();
                                for (Object obj : list) {
                                    if (linkedHashSet2.contains((String) obj)) {
                                        arrayList2.add(obj);
                                    }
                                }
                                List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
                                ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(listM1486j));
                                int i12 = 0;
                                for (Object obj2 : listM1486j) {
                                    int i13 = i12 + 1;
                                    if (i12 < 0) {
                                        AbstractC0000a.m32Q0();
                                        throw null;
                                    }
                                    C0414a c0414a3 = (C0414a) obj2;
                                    if (i12 == i11) {
                                        String string3 = AbstractC3149m.m6703R0(c0414a2.f1180b).toString();
                                        int i14 = c0414a2.f1182d;
                                        if (i14 < 0) {
                                            i14 = 0;
                                        }
                                        LinkedHashSet linkedHashSet3 = linkedHashSet2;
                                        int i15 = i11;
                                        str2 = string;
                                        str = string2;
                                        str3 = strM1477a;
                                        i9 = i15;
                                        linkedHashSet = linkedHashSet3;
                                        arrayList = arrayList3;
                                        c0414aM1401a = C0414a.m1401a(c0414a2, str, string3, str2, i14, AbstractC4166m.m8407P1(linkedHashSet3), listM8407P1, false, null, false, false, false, 4032);
                                    } else {
                                        str = string2;
                                        i9 = i11;
                                        str2 = string;
                                        linkedHashSet = linkedHashSet2;
                                        str3 = strM1477a;
                                        arrayList = arrayList3;
                                        List list2 = c0414a3.f1183e;
                                        ArrayList arrayList4 = new ArrayList();
                                        for (Object obj3 : list2) {
                                            if (!linkedHashSet.contains((String) obj3)) {
                                                arrayList4.add(obj3);
                                            }
                                        }
                                        List list3 = c0414a3.f1184f;
                                        ArrayList arrayList5 = new ArrayList();
                                        for (Object obj4 : list3) {
                                            if (!linkedHashSet.contains((String) obj4)) {
                                                arrayList5.add(obj4);
                                            }
                                        }
                                        c0414aM1401a = C0414a.m1401a(c0414a3, null, null, null, 0, arrayList4, arrayList5, false, null, false, false, false, 4047);
                                    }
                                    arrayList.add(c0414aM1401a);
                                    c0414a2 = c0414a;
                                    linkedHashSet2 = linkedHashSet;
                                    string2 = str;
                                    string = str2;
                                    arrayList3 = arrayList;
                                    i12 = i13;
                                    i11 = i9;
                                    strM1477a = str3;
                                }
                                zM1494r = m1494r(context, strM1477a, m1488l(arrayList3));
                            }
                        } else {
                            if (string.length() > 0) {
                            }
                            if (string != null) {
                            }
                            if (!z9) {
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zM1494r;
    }
}
