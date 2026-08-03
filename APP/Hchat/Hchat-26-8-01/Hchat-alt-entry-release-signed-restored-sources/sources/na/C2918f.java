package na;

import ac.RunnableC0059l;
import ae.C0076g;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.text.TextUtils;
import be.C0285i;
import ca.C0512c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p014b.C0126e;
import p054dg.C0795n;
import p065eb.C0898v;
import p068eh.AbstractC0921a;
import p096g8.C1363d;
import p096g8.InterfaceC1365f;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatChatroom;
import p109hb.C1695r;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p153k8.C2341e;
import p162l3.C2458l;
import p167l8.C2526a;
import p211o9.C3091d;
import p211o9.C3092e;
import p211o9.C3099l;
import p211o9.C3103p;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p243q9.C3468d;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: na.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2918f implements InterfaceC1365f {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9482a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9483b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2918f(Object obj, int i9) {
        this.f9482a = i9;
        this.f9483b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:230:0x0486 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:25:0x006d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:96:0x018e */
    /* JADX DEBUG: Type inference failed for r6v22. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x064f  */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v23, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    @Override // p096g8.InterfaceC1365f
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2162a(C0126e c0126e) throws Throwable {
        boolean z9;
        String strM3674f;
        C4173t c4173t;
        long j3;
        Throwable th2;
        Object obj;
        Iterator it;
        Iterator it2;
        Throwable th3;
        Object c3959f;
        List listM99x0;
        List<String> listM3677i;
        Set set;
        boolean z10;
        boolean z11;
        List<String> list;
        Iterator<String> it3;
        Set set2;
        boolean z12;
        String str;
        Object c3959f2;
        switch (this.f9482a) {
            case 0:
                C2919g c2919g = (C2919g) this.f9483b;
                c2919g.getClass();
                String strM6333a = C2919g.m6333a(c0126e.m636n());
                if (TextUtils.isEmpty(strM6333a)) {
                    return;
                }
                String str2 = ((C2526a) c0126e.f332h).f8161a;
                if ("delete".equals(str2)) {
                    LinkedHashSet linkedHashSetM6335c = c2919g.m6335c();
                    if (linkedHashSetM6335c.remove(strM6333a)) {
                        c2919g.m6336d(linkedHashSetM6335c);
                        return;
                    }
                    return;
                }
                LinkedHashSet linkedHashSetM6335c2 = c2919g.m6335c();
                if (linkedHashSetM6335c2.add(strM6333a)) {
                    c2919g.m6336d(linkedHashSetM6335c2);
                    if ("insert".equals(str2) || c2919g.f9487d) {
                        try {
                            z9 = c2919g.f9484a.m5853b().getBoolean("hb_block_new_group_enable", false);
                            break;
                        } catch (Throwable unused) {
                            z9 = false;
                        }
                        if (z9) {
                            WeChatChatroom weChatChatroom = (WeChatChatroom) c0126e.f333i;
                            C2458l c2458l = c2919g.f9484a;
                            String strM6333a2 = C2919g.m6333a(strM6333a);
                            if (TextUtils.isEmpty(strM6333a2)) {
                                return;
                            }
                            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                            String strM5855d = c2458l.m5855d("hb_rule_bindings_v1", HttpUrl.FRAGMENT_ENCODE_SET);
                            Iterator it4 = AbstractC0018a.m218F(strM5855d).iterator();
                            while (it4.hasNext()) {
                                if (TextUtils.equals(AbstractC0018a.m241e(((C2921i) it4.next()).f9494b), AbstractC0018a.m241e(strM6333a2))) {
                                    return;
                                }
                            }
                            ArrayList arrayList = new ArrayList(AbstractC0018a.m218F(strM5855d));
                            String strM241e = AbstractC0018a.m241e(strM6333a2);
                            if (weChatChatroom == null || TextUtils.isEmpty(weChatChatroom.name)) {
                                try {
                                    WeChatApis.contact().getClass();
                                    strM3674f = WeChatApis.chatroomApi.m3674f(strM6333a2);
                                    break;
                                } catch (Throwable unused2) {
                                }
                                if (TextUtils.isEmpty(strM3674f)) {
                                    strM3674f = strM6333a2;
                                }
                            } else {
                                strM3674f = weChatChatroom.name;
                            }
                            List listM225M = AbstractC0018a.m225M(c2458l.m5855d("hb_rule_templates_v1", HttpUrl.FRAGMENT_ENCODE_SET));
                            String strTrim = c2458l.m5855d("hb_rule_default_template_id", HttpUrl.FRAGMENT_ENCODE_SET).trim();
                            Iterator it5 = listM225M.iterator();
                            while (true) {
                                if (!it5.hasNext()) {
                                    if (listM225M.size() == 1) {
                                        str3 = ((C2922j) listM225M.get(0)).f9512a;
                                    }
                                    strTrim = str3;
                                } else if (TextUtils.equals(((C2922j) it5.next()).f9512a, strTrim)) {
                                }
                            }
                            arrayList.add(new C2921i(strM241e, strM6333a2, strM3674f, false, strTrim, false, null));
                            c2458l.m5853b().edit().putString("hb_rule_bindings_v1", AbstractC0018a.m253q(arrayList)).commit();
                            String str4 = "已自动加入新进群红包关闭规则: " + strM6333a;
                            C0076g c0076g = c2919g.f9485b;
                            if (TextUtils.isEmpty(str4)) {
                                return;
                            }
                            c0076g.accept(str4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C3103p c3103p = (C3103p) this.f9483b;
                ConcurrentHashMap concurrentHashMap = c3103p.f10029e;
                C4173t c4173t2 = C4173t.f13710g;
                ConcurrentHashMap concurrentHashMap2 = c3103p.f10032h;
                long jCurrentTimeMillis = System.currentTimeMillis();
                boolean zM645w = c0126e.m645w();
                WeChatChatroom weChatChatroom2 = (WeChatChatroom) c0126e.f333i;
                ContentValues contentValues = ((C2526a) c0126e.f332h).f8164d;
                boolean z13 = contentValues != null && contentValues.containsKey("roomdata");
                if (zM645w || z13) {
                    String strM636n = c0126e.m636n();
                    strM636n.getClass();
                    String string = AbstractC3149m.m6703R0(strM636n).toString();
                    if (string.length() == 0) {
                        return;
                    }
                    if (z13) {
                        Long l10 = (Long) concurrentHashMap.get(string);
                        if (l10 != null) {
                            if (jCurrentTimeMillis <= l10.longValue()) {
                                c3103p.m6597g(string);
                                c4173t = c4173t2;
                                j3 = jCurrentTimeMillis;
                            } else {
                                concurrentHashMap.remove(string, l10);
                            }
                        }
                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                        if (concurrentHashMap2.isEmpty()) {
                            c4173t = c4173t2;
                        } else {
                            c4173t = c4173t2;
                            concurrentHashMap2.entrySet().removeIf(new C0285i(new C0512c(jCurrentTimeMillis2, 8), 19));
                        }
                        String strConcat = string.concat("|");
                        Set setEntrySet = concurrentHashMap2.entrySet();
                        setEntrySet.getClass();
                        ArrayList<Map.Entry> arrayList2 = new ArrayList();
                        for (Object obj2 : setEntrySet) {
                            Object key = ((Map.Entry) obj2).getKey();
                            key.getClass();
                            long j4 = jCurrentTimeMillis;
                            if (AbstractC3156t.m6740d0((String) key, strConcat, false)) {
                                arrayList2.add(obj2);
                            }
                            jCurrentTimeMillis = j4;
                        }
                        j3 = jCurrentTimeMillis;
                        for (Map.Entry entry : arrayList2) {
                            Object key2 = entry.getKey();
                            key2.getClass();
                            if (c3103p.m6600o(((C3099l) entry.getValue()).f10007a, string, AbstractC3149m.m6686A0((String) key2, strConcat))) {
                                concurrentHashMap2.remove(entry.getKey());
                            }
                        }
                    } else {
                        c4173t = c4173t2;
                        j3 = jCurrentTimeMillis;
                    }
                    if (zM645w) {
                        ConcurrentHashMap concurrentHashMap3 = c3103p.f10030f;
                        if (weChatChatroom2 != null) {
                            List<String> list2 = weChatChatroom2.memberIds;
                            String str5 = weChatChatroom2.rawDisplayNames;
                            int size = list2.size();
                            if (AbstractC3149m.m6721t0(str5)) {
                                listM99x0 = c4173t;
                                th2 = null;
                            } else {
                                th2 = null;
                                Iterator it6 = AbstractC0000a.m101y0("\u0001", "\u0002", "\n", ";").iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        listM99x0 = AbstractC3149m.m6692G0(str5, new String[]{(String) it6.next()});
                                        if (size <= 0 || listM99x0.size() == size) {
                                        }
                                    } else {
                                        listM99x0 = AbstractC0000a.m99x0(str5);
                                    }
                                }
                            }
                            if (!list2.isEmpty() && listM99x0.size() == list2.size()) {
                                int i9 = 0;
                                for (Object obj3 : list2) {
                                    int i10 = i9 + 1;
                                    if (i9 < 0) {
                                        AbstractC0000a.m32Q0();
                                        throw th2;
                                    }
                                    String str6 = (String) obj3;
                                    String str7 = (String) AbstractC4166m.m8425w1(i9, listM99x0);
                                    ?? string2 = str7 != null ? AbstractC3149m.m6703R0(str7).toString() : th2;
                                    if (string2 == 0) {
                                        string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    concurrentHashMap3.remove(C3103p.m6578e(string, str6));
                                    if (!AbstractC3149m.m6721t0(str6) && !AbstractC3149m.m6721t0(string2) && !string2.equals(str6)) {
                                        concurrentHashMap3.put(C3103p.m6578e(string, str6), string2);
                                    }
                                    i9 = i10;
                                }
                            }
                        } else {
                            th2 = null;
                        }
                        if (weChatChatroom2 == null || (obj = weChatChatroom2.memberIds) == null) {
                            C1363d c1363dM5159f = AbstractC2091b.m5159f();
                            Object objM3677i = c1363dM5159f != null ? c1363dM5159f.m3677i(c0126e.m636n()) : th2;
                            obj = objM3677i != null ? objM3677i : c4173t;
                        }
                        C3011i c3011i = new C3011i(AbstractC3015m.m6413W(new C0795n(obj, 6), new C3092e(3)), true, new C3092e(4));
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        AbstractC3015m.m6417a0(c3011i, linkedHashSet);
                        if (linkedHashSet.isEmpty()) {
                            return;
                        }
                        c3103p.m6588B(string, linkedHashSet);
                        Set set3 = (Set) c3103p.f10028d.put(string, linkedHashSet);
                        if (set3 == null) {
                            concurrentHashMap.put(string, Long.valueOf(j3 + 15000));
                            c3103p.m6597g(string);
                            return;
                        }
                        Set<String> setM8352T = AbstractC4156d0.m8352T(linkedHashSet, set3);
                        Set setM8352T2 = AbstractC4156d0.m8352T(set3, linkedHashSet);
                        if (setM8352T.isEmpty() && setM8352T2.isEmpty()) {
                            return;
                        }
                        Long l11 = (Long) concurrentHashMap.get(string);
                        if (l11 == null) {
                            if (setM8352T2.isEmpty() || setM8352T.size() < 10) {
                                it = setM8352T2.iterator();
                                while (it.hasNext()) {
                                    String str8 = (String) it.next();
                                    if (c3103p.f10026b.getBoolean("group_leave_monitor_enable", false) && c3103p.m6602q(string)) {
                                        C2026t c2026t = c3103p.f10025a;
                                        long jCurrentTimeMillis3 = System.currentTimeMillis();
                                        ConcurrentHashMap concurrentHashMap4 = c3103p.f10031g;
                                        if (concurrentHashMap4.size() < 128) {
                                            it2 = it;
                                        } else {
                                            it2 = it;
                                            concurrentHashMap4.entrySet().removeIf(new C0285i(new C0512c(jCurrentTimeMillis3, 9), 20));
                                        }
                                        String strM9264h = AbstractC4855en.m9264h(string, "|", str8);
                                        Long l12 = (Long) concurrentHashMap4.get(strM9264h);
                                        if (l12 == null || jCurrentTimeMillis3 - l12.longValue() >= 5000) {
                                            concurrentHashMap4.put(strM9264h, Long.valueOf(jCurrentTimeMillis3));
                                            WeChatApis.message().getClass();
                                            C2341e c2341e = WeChatApis.localMessageApi;
                                            if (c2341e == null) {
                                                th3 = th2;
                                                c2026t.invoke("本地消息 API 未就绪", th3);
                                            } else {
                                                try {
                                                    c2341e.m5570c();
                                                    if (c2341e.m5572e(string, c3103p.m6595d(string, c3103p.m6605u(string, str8)), jCurrentTimeMillis3, true) <= 0) {
                                                        th3 = null;
                                                        try {
                                                            c2026t.invoke("退群系统消息插入失败: " + string + "/" + str8, null);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            c3959f = new C3959f(th);
                                                        }
                                                    } else {
                                                        th3 = null;
                                                    }
                                                    c3959f = C3967n.f12976a;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    th3 = null;
                                                }
                                                Throwable thM8182b = C3960g.m8182b(c3959f);
                                                if (thM8182b != null) {
                                                    c2026t.invoke("退群系统消息插入异常", thM8182b);
                                                }
                                            }
                                        }
                                        c3103p.m6601p("left", string, str8);
                                        th2 = th3;
                                        it = it2;
                                    } else {
                                        it2 = it;
                                    }
                                    th3 = th2;
                                    c3103p.m6601p("left", string, str8);
                                    th2 = th3;
                                    it = it2;
                                    break;
                                }
                                for (String str9 : setM8352T) {
                                    if (!c3103p.m6600o(1, string, str9) && C3103p.m6584r(string, str9)) {
                                        long jCurrentTimeMillis4 = System.currentTimeMillis();
                                        if (!concurrentHashMap2.isEmpty()) {
                                            concurrentHashMap2.entrySet().removeIf(new C0285i(new C0512c(jCurrentTimeMillis4, 8), 19));
                                        }
                                        concurrentHashMap2.compute(AbstractC4855en.m9264h(string, "|", str9), new C0898v(1, new C3091d(jCurrentTimeMillis4)));
                                    }
                                    c3103p.m6601p("join", string, str9);
                                }
                                return;
                            }
                        } else if (j3 > l11.longValue()) {
                            concurrentHashMap.remove(string, l11);
                            if (setM8352T2.isEmpty()) {
                            }
                            it = setM8352T2.iterator();
                            while (it.hasNext()) {
                            }
                            while (r0.hasNext()) {
                            }
                            return;
                        }
                        concurrentHashMap.put(string, Long.valueOf(j3 + 15000));
                        c3103p.m6597g(string);
                        c3103p.m6597g(string);
                        return;
                    }
                    return;
                }
                return;
            default:
                C1695r c1695r = (C1695r) this.f9483b;
                ConcurrentHashMap concurrentHashMap5 = (ConcurrentHashMap) c1695r.f5642g;
                Set setM8352T3 = C4175v.f13712g;
                ConcurrentHashMap concurrentHashMap6 = (ConcurrentHashMap) c1695r.f5640e;
                SharedPreferences sharedPreferences = (SharedPreferences) c1695r.f5638c;
                List<String> list3 = C4173t.f13710g;
                boolean zM645w2 = c0126e.m645w();
                ContentValues contentValues2 = ((C2526a) c0126e.f332h).f8164d;
                boolean z14 = contentValues2 != null && contentValues2.containsKey("roomdata");
                if (zM645w2 || z14) {
                    String strM636n2 = c0126e.m636n();
                    strM636n2.getClass();
                    String string3 = AbstractC3149m.m6703R0(strM636n2).toString();
                    if (string3.length() == 0) {
                        return;
                    }
                    WeChatChatroom weChatChatroom3 = (WeChatChatroom) c0126e.f333i;
                    if (weChatChatroom3 == null || (listM3677i = weChatChatroom3.memberIds) == null) {
                        C1363d c1363dM5159f2 = AbstractC2091b.m5159f();
                        listM3677i = c1363dM5159f2 != null ? c1363dM5159f2.m3677i(c0126e.m636n()) : null;
                        if (listM3677i == null) {
                            listM3677i = list3;
                        }
                    }
                    C3011i c3011i2 = new C3011i(AbstractC3015m.m6413W(new C0795n(listM3677i, 6), new C3092e(19)), true, new C3092e(20));
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    AbstractC3015m.m6417a0(c3011i2, linkedHashSet2);
                    if (linkedHashSet2.isEmpty()) {
                        return;
                    }
                    Map mapM4312f = C1695r.m4312f(string3, linkedHashSet2, c0126e);
                    Map map = mapM4312f.isEmpty() ? null : (Map) ((ConcurrentHashMap) c1695r.f5641f).put(string3, mapM4312f);
                    if (zM645w2) {
                        set = (Set) concurrentHashMap6.put(string3, linkedHashSet2);
                    } else {
                        Set set4 = (Set) concurrentHashMap6.get(string3);
                        if (set4 == null) {
                            concurrentHashMap6.putIfAbsent(string3, linkedHashSet2);
                        }
                        set = set4;
                    }
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    Set setM8352T4 = set == null ? setM8352T3 : AbstractC4156d0.m8352T(linkedHashSet2, set);
                    if (set != null) {
                        setM8352T3 = AbstractC4156d0.m8352T(set, linkedHashSet2);
                    }
                    Long l13 = (Long) concurrentHashMap5.get(string3);
                    if (l13 == null) {
                        z10 = false;
                    } else if (jCurrentTimeMillis5 <= l13.longValue()) {
                        z10 = true;
                    } else {
                        concurrentHashMap5.remove(string3, l13);
                        z10 = false;
                    }
                    boolean z15 = setM8352T3.isEmpty() && setM8352T4.size() >= 10;
                    String str10 = HttpUrl.FRAGMENT_ENCODE_SET;
                    if (z10 || z15 || map == null || set == null) {
                        z11 = z15;
                        list = list3;
                    } else {
                        LinkedHashSet<String> linkedHashSetM8426x1 = AbstractC4166m.m8426x1(set, linkedHashSet2);
                        ArrayList arrayList3 = new ArrayList();
                        for (String str11 : linkedHashSetM8426x1) {
                            String str12 = (String) map.get(str11);
                            String string4 = str12 != null ? AbstractC3149m.m6703R0(str12).toString() : null;
                            String str13 = string4 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string4;
                            String str14 = (String) mapM4312f.get(str11);
                            String string5 = str14 != null ? AbstractC3149m.m6703R0(str14).toString() : null;
                            Map map2 = mapM4312f;
                            String str15 = string5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : string5;
                            boolean z16 = z15;
                            C3468d c3468d = str13.equals(str15) ? null : new C3468d(str11, str13, str15);
                            if (c3468d != null) {
                                arrayList3.add(c3468d);
                            }
                            mapM4312f = map2;
                            z15 = z16;
                        }
                        z11 = z15;
                        list = arrayList3;
                    }
                    int size2 = list.size();
                    List<String> list4 = list;
                    if (size2 >= 10) {
                        list4 = null;
                    }
                    if (list4 != null) {
                        list3 = list4;
                    }
                    for (Iterator<String> it7 = list3.iterator(); it7.hasNext(); it7 = it3) {
                        C3468d c3468d2 = (C3468d) it7.next();
                        if (sharedPreferences.getBoolean("group_rename_notice_enable", false)) {
                            String string6 = sharedPreferences.getString("group_rename_notice_scope", "all");
                            if ((string6 != null ? string6 : "all").equals("specific")) {
                                String string7 = sharedPreferences.getString("group_rename_notice_groups", str10);
                                if (string7 == null) {
                                    string7 = str10;
                                }
                                if (!C1695r.m4318t(string7).contains(string3)) {
                                    it3 = it7;
                                    set2 = set;
                                    z12 = zM645w2;
                                }
                                str = str10;
                            }
                            C2026t c2026t2 = (C2026t) c1695r.f5637b;
                            long jCurrentTimeMillis6 = System.currentTimeMillis();
                            ConcurrentHashMap concurrentHashMap7 = (ConcurrentHashMap) c1695r.f5643h;
                            it3 = it7;
                            if (concurrentHashMap7.size() >= 128) {
                                set2 = set;
                                z12 = zM645w2;
                                concurrentHashMap7.entrySet().removeIf(new C0285i(new C0512c(jCurrentTimeMillis6, 10), 22));
                            } else {
                                set2 = set;
                                z12 = zM645w2;
                            }
                            String str16 = c3468d2.f11240a;
                            String str17 = c3468d2.f11241b;
                            String str18 = c3468d2.f11242c;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(string3);
                            sb2.append("|");
                            sb2.append(str16);
                            sb2.append("|");
                            sb2.append(str17);
                            String strM2255r = AbstractC0921a.m2255r(sb2, "|", str18);
                            Long l14 = (Long) concurrentHashMap7.get(strM2255r);
                            if (l14 == null || jCurrentTimeMillis6 - l14.longValue() >= 5000) {
                                concurrentHashMap7.put(strM2255r, Long.valueOf(jCurrentTimeMillis6));
                                WeChatApis.message().getClass();
                                C2341e c2341e2 = WeChatApis.localMessageApi;
                                if (c2341e2 == null) {
                                    c2026t2.invoke("改名系统消息插入失败: 本地消息 API 未就绪", null);
                                    str = str10;
                                } else {
                                    try {
                                        c2341e2.m5570c();
                                        str = str10;
                                        try {
                                            if (c2341e2.m5572e(string3, c1695r.m4321d(string3, c3468d2), jCurrentTimeMillis6, true) <= 0) {
                                                c2026t2.invoke("改名系统消息插入失败: " + string3 + "/" + c3468d2.f11240a, null);
                                            }
                                            c3959f2 = C3967n.f12976a;
                                        } catch (Throwable th6) {
                                            th = th6;
                                            c3959f2 = new C3959f(th);
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        str = str10;
                                    }
                                    Throwable thM8182b2 = C3960g.m8182b(c3959f2);
                                    if (thM8182b2 != null) {
                                        c2026t2.invoke("改名系统消息插入异常", thM8182b2);
                                    }
                                }
                            } else {
                                str = str10;
                            }
                        }
                        if (sharedPreferences.getBoolean("group_rename_send_enable", false)) {
                            String string8 = sharedPreferences.getString("group_rename_listen_groups", str);
                            if (string8 == null) {
                                string8 = str;
                            }
                            if (C1695r.m4318t(string8).contains(string3)) {
                                new Thread(new RunnableC0059l(27, c1695r, c3468d2, string3), "Hchat-GroupRenameMonitor").start();
                            }
                        }
                        str10 = str;
                        set = set2;
                        zM645w2 = z12;
                    }
                    boolean z17 = zM645w2;
                    if (set == null || (z17 && z11)) {
                        concurrentHashMap5.put(string3, Long.valueOf(jCurrentTimeMillis5 + 15000));
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
