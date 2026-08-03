package p109hb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import bb.C0240b;
import bb.C0250l;
import gg.AbstractC1416l;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import p000a.AbstractC0000a;
import p009a9.C0031h;
import p010aa.C0035c;
import p011ab.C0042b;
import p014b.C0126e;
import p015b0.C0153s;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p085fg.InterfaceC1236q;
import p096g8.C1363d;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatChatroom;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p136j8.C2105p;
import p136j8.C2114y;
import p142jg.AbstractC2133a;
import p142jg.AbstractC2136d;
import p153k8.C2343g;
import p153k8.C2356t;
import p167l8.C2529d;
import p211o9.C3092e;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p242q8.C3460o;
import p243q9.C3468d;
import p243q9.C3470f;
import p243q9.C3471g;
import p243q9.C3472h;
import p258r8.C3742g;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p302ud.C4305a;
import p302ud.C4322r;
import p332wb.AbstractC4855en;
import p343x6.AbstractC5700d;
import p350xd.C5777d;
import p369yd.C6028b;
import p384ze.C6141c;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;
import tf.C4173t;
import tf.C4174u;

/* JADX INFO: renamed from: hb.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1695r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5636a;

    /* JADX INFO: renamed from: b */
    public final Object f5637b;

    /* JADX INFO: renamed from: c */
    public final Object f5638c;

    /* JADX INFO: renamed from: d */
    public final Object f5639d;

    /* JADX INFO: renamed from: e */
    public Object f5640e;

    /* JADX INFO: renamed from: f */
    public Object f5641f;

    /* JADX INFO: renamed from: g */
    public Object f5642g;

    /* JADX INFO: renamed from: h */
    public Object f5643h;

    /* JADX INFO: renamed from: i */
    public Object f5644i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1695r(C3742g c3742g, C2026t c2026t) {
        this.f5636a = 2;
        c3742g.getClass();
        this.f5637b = c2026t;
        Context context = c3742g.f12143a;
        this.f5638c = AbstractC4302b.m8640c(context, "Hchat_group_rename_monitor_config");
        this.f5639d = new C0250l(context);
        this.f5640e = new ConcurrentHashMap();
        this.f5641f = new ConcurrentHashMap();
        this.f5642g = new ConcurrentHashMap();
        this.f5643h = new ConcurrentHashMap();
        this.f5644i = new C3147k("\\[AtWx=([^\\]]+)]");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m4311b(String str, C3470f c3470f) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "%userName%", c3470f.f11246b, false), "%groupNickname%", c3470f.f11247c, false), "%oldGroupNickname%", c3470f.f11248d, false), "%newGroupNickname%", c3470f.f11249e, false), "%userWxid%", c3470f.f11245a, false), "%realNameTail%", c3470f.f11250f, false), "%gender%", c3470f.f11251g, false), "%region%", c3470f.f11252h, false), "%groupName%", c3470f.f11253i, false), "%time%", c3470f.f11254j, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Map m4312f(String str, LinkedHashSet linkedHashSet, C0126e c0126e) {
        List listM99x0;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        Map mapM3734w = c1368iM9259c != null ? c1368iM9259c.m3734w(str) : null;
        C4174u c4174u = C4174u.f13711g;
        if (mapM3734w == null) {
            mapM3734w = c4174u;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (mapM3734w.containsKey(str2)) {
                linkedHashMap.put(str2, m4316n((String) mapM3734w.get(str2), str2));
            }
        }
        WeChatChatroom weChatChatroom = c0126e != null ? (WeChatChatroom) c0126e.f333i : null;
        if (weChatChatroom != null && !weChatChatroom.memberIds.isEmpty()) {
            String str3 = weChatChatroom.rawDisplayNames;
            int size = weChatChatroom.memberIds.size();
            if (!AbstractC3149m.m6721t0(str3)) {
                Iterator it2 = AbstractC0000a.m101y0("\u0001", "\u0002", "\n", ";").iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        listM99x0 = AbstractC0000a.m99x0(str3);
                        break;
                    }
                    List listM6692G0 = AbstractC3149m.m6692G0(str3, new String[]{(String) it2.next()});
                    if (listM6692G0.size() == size) {
                        listM99x0 = listM6692G0;
                        break;
                    }
                }
            } else {
                listM99x0 = C4173t.f13710g;
            }
            if (listM99x0.size() == weChatChatroom.memberIds.size()) {
                int i9 = 0;
                for (Object obj : weChatChatroom.memberIds) {
                    int i10 = i9 + 1;
                    if (i9 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    String str4 = (String) obj;
                    if (linkedHashSet.contains(str4) && !linkedHashMap.containsKey(str4)) {
                        linkedHashMap.put(str4, m4316n((String) listM99x0.get(i9), str4));
                    }
                    i9 = i10;
                }
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap.keySet().containsAll(linkedHashSet) ? linkedHashMap : null;
        return linkedHashMap2 == null ? c4174u : linkedHashMap2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m4313h(String str) {
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "&", "&amp;", false), "<", "&lt;", false), ">", "&gt;", false), "\"", "&quot;", false), "'", "&apos;", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m4314i(String... strArr) {
        String str;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                str = null;
                break;
            }
            str = strArr[i9];
            if (!(str == null || AbstractC3149m.m6721t0(str))) {
                break;
            }
            i9++;
        }
        return str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static C1695r m4315l(C1695r c1695r) {
        return new C1695r((C4322r) c1695r.f5637b, C6028b.m10790K((C6028b) c1695r.f5638c), (C4305a) c1695r.f5641f, (C4305a) c1695r.f5640e, (C6141c) c1695r.f5639d, (Set) c1695r.f5642g, (List) c1695r.f5643h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static String m4316n(String str, String str2) {
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str3 = string.equals(str2) ? null : string;
        return str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static String m4317o(String str) {
        List listM6692G0 = AbstractC3149m.m6692G0(str, new String[]{"||"});
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
        if (arrayList2.isEmpty()) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        AbstractC2133a abstractC2133a = AbstractC2136d.f7122g;
        return (String) arrayList2.get(AbstractC2136d.f7122g.m5360g(arrayList2.size()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static Set m4318t(String str) {
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{'|', ','}, 6);
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
    /* JADX INFO: renamed from: a */
    public void m4319a(C1694q c1694q, int i9, long j3) {
        Handler handler = (Handler) this.f5639d;
        this.f5642g = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f5643h = C4173t.f13710g;
        RunnableC1692o runnableC1692o = (RunnableC1692o) this.f5644i;
        if (runnableC1692o != null) {
            handler.removeCallbacks(runnableC1692o);
        }
        this.f5644i = null;
        int i10 = c1694q.f5631f;
        List list = c1694q.f5628c;
        int i11 = i10 + i9;
        int size = list.size();
        if (i11 > size) {
            i11 = size;
        }
        c1694q.f5631f = i11;
        if (i11 >= list.size()) {
            m4322e(c1694q);
        } else {
            handler.postDelayed(new RunnableC1691n(this, c1694q, 0), j3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public String m4320c(String str) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f5638c;
        str.getClass();
        String string = sharedPreferences.getString("group_rename_prompt_type_" + str, "global");
        if (string == null) {
            string = "global";
        }
        String string2 = sharedPreferences.getString(string.equals("global") ? "group_rename_both_order" : AbstractC4855en.m9264h("group_rename_both_order", "_", str), "text_first");
        if (string2 == null) {
            string2 = "text_first";
        }
        return string2.equals("card_first") ? "card_first" : "text_first";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public String m4321d(String str, C3468d c3468d) {
        C3470f c3470fM4329r = m4329r(str, c3468d);
        String string = ((SharedPreferences) this.f5638c).getString("group_rename_notice_text", "%oldGroupNickname% 改名为 %newGroupNickname%(%userWxid%)");
        String str2 = string != null ? string : "%oldGroupNickname% 改名为 %newGroupNickname%(%userWxid%)";
        Map mapM8439b0 = AbstractC4178y.m8439b0(new C3958e("%userName%", c3470fM4329r.f11246b), new C3958e("%groupNickname%", c3470fM4329r.f11247c), new C3958e("%oldGroupNickname%", c3470fM4329r.f11248d), new C3958e("%newGroupNickname%", c3470fM4329r.f11249e), new C3958e("%realNameTail%", c3470fM4329r.f11250f), new C3958e("%gender%", c3470fM4329r.f11251g), new C3958e("%region%", c3470fM4329r.f11252h), new C3958e("%groupName%", c3470fM4329r.f11253i), new C3958e("%time%", c3470fM4329r.f11254j));
        return new C3147k(AbstractC4166m.m8392A1(AbstractC4166m.m8402K1(AbstractC4156d0.m8354V(mapM8439b0.keySet(), "%userWxid%"), new C0031h(27)), "|", null, null, new C3092e(21), 30)).m6684e(str2, new C0153s(this, c3470fM4329r, mapM8439b0, 14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public void m4322e(C1694q c1694q) {
        Handler handler = (Handler) this.f5639d;
        this.f5642g = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f5643h = C4173t.f13710g;
        RunnableC1692o runnableC1692o = (RunnableC1692o) this.f5644i;
        if (runnableC1692o != null) {
            handler.removeCallbacks(runnableC1692o);
        }
        this.f5644i = null;
        c1694q.f5630e++;
        c1694q.f5631f = 0;
        c1694q.f5634i = -1;
        c1694q.f5635j = null;
        handler.postDelayed(new RunnableC1691n(this, c1694q, 2), 350L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public C1696s m4323g(List list, List list2, InterfaceC1236q interfaceC1236q) {
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C1697t c1697t = (C1697t) obj;
            if ((c1697t.f5652g == null && AbstractC3149m.m6721t0(c1697t.f5653h)) ? false : true) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(list2));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList2);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!AbstractC3149m.m6721t0((String) obj2)) {
                arrayList3.add(obj2);
            }
        }
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3));
        if (arrayList.size() != list.size() || listM8407P1.isEmpty()) {
            return null;
        }
        String string = UUID.randomUUID().toString();
        string.getClass();
        C1694q c1694q = new C1694q(string, arrayList, listM8407P1, interfaceC1236q);
        ((Handler) this.f5639d).post(new RunnableC1691n(this, c1694q, 1));
        return new C1696s(new C0035c(this, 14, c1694q));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public C4305a m4324j() {
        C6141c c6141c = (C6141c) this.f5639d;
        return (C4305a) c6141c.f24737g.f14425z.get(c6141c.f24738h.nextSetBit(0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public String m4325k(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f5638c;
        str.getClass();
        String string = sharedPreferences.getString(str2 + "_" + str, null);
        if (string != null) {
            return string;
        }
        String string2 = sharedPreferences.getString(str2, str3);
        return string2 != null ? string2 : str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m4326m(C1695r... c1695rArr) {
        for (C1695r c1695r : c1695rArr) {
            ((C6141c) this.f5639d).f24738h.or(((C6141c) c1695r.f5639d).f24738h);
            ((Set) this.f5642g).addAll((Set) c1695r.f5642g);
            ((List) this.f5643h).addAll((List) c1695r.f5643h);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public void m4327p() {
        Object c3959f;
        try {
            WeChatApis.contact().getClass();
            C1363d c1363d = WeChatApis.chatroomApi;
            if (c1363d == null) {
                return;
            }
            for (WeChatChatroom weChatChatroom : c1363d.m3675g()) {
                String string = AbstractC3149m.m6703R0(weChatChatroom.chatroomId).toString();
                if (string.length() != 0) {
                    C3011i c3011i = new C3011i(AbstractC3015m.m6413W(AbstractC4166m.m8415m1(weChatChatroom.memberIds), new C3092e(17)), true, new C3092e(18));
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    AbstractC3015m.m6417a0(c3011i, linkedHashSet);
                    if (!linkedHashSet.isEmpty()) {
                        ((ConcurrentHashMap) this.f5640e).putIfAbsent(string, linkedHashSet);
                        Map mapM4312f = m4312f(string, linkedHashSet, null);
                        if (!mapM4312f.isEmpty()) {
                            ((ConcurrentHashMap) this.f5641f).putIfAbsent(string, mapM4312f);
                        }
                    }
                }
            }
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            ((C2026t) this.f5637b).invoke("预加载群成员改名快照失败", thM8182b);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public C3471g m4328q(String str) {
        Object obj;
        Object next;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f5638c;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferences.getString("group_rename_template_bindings", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        Iterator it = AbstractC5700d.m10261S(string).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC1416l.m3825a(((C3472h) next).f11264a, str)) {
                break;
            }
        }
        C3472h c3472h = (C3472h) next;
        if (c3472h == null) {
            return null;
        }
        String string2 = sharedPreferences.getString("group_rename_templates", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string2 != null) {
            str2 = string2;
        }
        Iterator it2 = AbstractC5700d.m10263U(str2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((C3471g) next2).f11255a.equals(c3472h.f11266c)) {
                obj = next2;
                break;
            }
        }
        return (C3471g) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3470f m4329r(String str, C3468d c3468d) {
        String str2;
        String strM3674f;
        WeChatContact weChatContactM3725n;
        String strDisplayName;
        String strM3737z;
        String string;
        C0250l c0250l = (C0250l) this.f5639d;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        String str3 = null;
        WeChatContact weChatContactM3725n2 = c1368iM9259c != null ? c1368iM9259c.m3725n(c3468d.f11240a) : null;
        String str4 = weChatContactM3725n2 != null ? weChatContactM3725n2.nickname : null;
        String str5 = weChatContactM3725n2 != null ? weChatContactM3725n2.remarkName : null;
        String str6 = c3468d.f11240a;
        String strM4314i = m4314i(str4, str5, str6);
        String str7 = c3468d.f11241b;
        String str8 = AbstractC3149m.m6721t0(str7) ? strM4314i : str7;
        String str9 = c3468d.f11242c;
        String str10 = AbstractC3149m.m6721t0(str9) ? strM4314i : str9;
        String str11 = c3468d.f11240a;
        String strM1003c = c0250l.m1003c(str11);
        String strM1004d = c0250l.m1004d(c1368iM9259c != null ? c1368iM9259c.m3730s(str6) : 0);
        String strM5161h = (c1368iM9259c == null || (strM3737z = c1368iM9259c.m3737z(str6)) == null || (string = AbstractC3149m.m6703R0(strM3737z).toString()) == null) ? null : AbstractC2091b.m5161h("\\s+", string, " ");
        if (strM5161h == null) {
            strM5161h = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str12 = strM5161h;
        if (c1368iM9259c == null || (weChatContactM3725n = c1368iM9259c.m3725n(str)) == null || (strDisplayName = weChatContactM3725n.displayName()) == null) {
            C1363d c1363dM5159f = AbstractC2091b.m5159f();
            if (c1363dM5159f != null && (strM3674f = c1363dM5159f.m3674f(str)) != null && !AbstractC3149m.m6721t0(strM3674f)) {
                str3 = strM3674f;
            }
            str2 = str3 != null ? str3 : str;
        } else {
            if (AbstractC3149m.m6721t0(strDisplayName) || strDisplayName.equals(str)) {
                strDisplayName = null;
            }
            if (strDisplayName != null) {
                str2 = strDisplayName;
            }
        }
        String str13 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
        str13.getClass();
        return new C3470f(str11, strM4314i, str10, str8, str10, strM1003c, strM1004d, str12, str2, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4330s(C1694q c1694q) {
        Object next;
        C0240b c0240b;
        String absolutePath;
        boolean z9;
        C1693p c1693p;
        Object c3959f;
        Object c3959f2;
        Throwable thM8182b;
        C2343g c2343gMessages;
        C2105p c2105pMedia;
        String str;
        boolean z10;
        C2114y c2114y;
        C0240b c0240b2;
        C3742g c3742g = (C3742g) this.f5637b;
        C0042b c0042b = (C0042b) this.f5638c;
        if (((C1694q) this.f5641f) != c1694q) {
            return;
        }
        int i9 = c1694q.f5630e;
        ArrayList arrayList = c1694q.f5627b;
        List list = c1694q.f5628c;
        int size = arrayList.size();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (i9 >= size) {
            InterfaceC1236q interfaceC1236q = c1694q.f5629d;
            int i10 = c1694q.f5632g;
            int i11 = c1694q.f5633h;
            this.f5641f = null;
            this.f5642g = HttpUrl.FRAGMENT_ENCODE_SET;
            if (interfaceC1236q != null) {
                interfaceC1236q.mo734b(Integer.valueOf(i10), Integer.valueOf(i11), Boolean.FALSE);
            }
            m4331u();
            return;
        }
        C1697t c1697t = (C1697t) arrayList.get(c1694q.f5630e);
        if (c1694q.f5634i == c1694q.f5630e) {
            c1693p = c1694q.f5635j;
        } else {
            int i12 = c1697t.f5647b;
            C2356t c2356t = c1697t.f5652g;
            int i13 = i12 & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            C2343g c2343gM6844q = AbstractC3199a.m6844q();
            if (c2343gM6844q == null) {
                c2343gM6844q = WeChatApis.messages();
            }
            C2105p c2105pMedia2 = WeChatApis.media();
            if (i13 == 43 || i13 == 62) {
                String str3 = c2356t != null ? c2356t.f7746f : null;
                if (str3 == null) {
                    str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                List listM101y0 = AbstractC0000a.m101y0(str3, c1697t.f5650e);
                ArrayList arrayList2 = new ArrayList(AbstractC4167n.m8429e1(listM101y0));
                Iterator it = listM101y0.iterator();
                while (it.hasNext()) {
                    AbstractC2091b.m5171r((String) it.next(), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!AbstractC3149m.m6721t0((String) obj)) {
                        arrayList3.add(obj);
                    }
                }
                List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList3));
                Iterator it2 = listM8407P1.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (AbstractC0921a.m2262y((String) next)) {
                            break;
                        }
                    }
                }
                String str4 = (String) next;
                if (str4 != null) {
                    absolutePath = new File(str4).getAbsolutePath();
                    absolutePath.getClass();
                } else {
                    C2105p c2105pMedia3 = WeChatApis.media();
                    if (c2105pMedia3 == null || (c0240b = c2105pMedia3.f7037c) == null) {
                        absolutePath = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        Iterator it3 = listM8407P1.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                absolutePath = null;
                                break;
                            }
                            String strM970o = c0240b.m970o((String) it3.next());
                            strM970o.getClass();
                            if (AbstractC3149m.m6721t0(strM970o)) {
                                strM970o = null;
                            }
                            if (strM970o != null) {
                                absolutePath = strM970o;
                                break;
                            }
                        }
                        if (absolutePath == null) {
                        }
                    }
                }
                if (i13 == 34) {
                    absolutePath = c1697t.f5653h;
                } else if (i13 != 43) {
                    if (i13 == 47) {
                        String str5 = c2356t != null ? c2356t.f7746f : null;
                        if (str5 == null) {
                            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        absolutePath = AbstractC3149m.m6703R0(str5).toString();
                        if (!AbstractC0921a.m2262y(absolutePath)) {
                            Pattern patternCompile = Pattern.compile("[0-9a-fA-F]{32}");
                            patternCompile.getClass();
                            absolutePath.getClass();
                            if (!patternCompile.matcher(absolutePath).matches()) {
                                String str6 = c2356t != null ? c2356t.f7743c : null;
                                if (str6 == null) {
                                    str6 = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                if (AbstractC3149m.m6721t0(str6)) {
                                    str6 = c1697t.f5649d;
                                }
                                WeChatMessage.Companion.getClass();
                                String strM5947m = C2529d.m5947m(str6, "md5");
                                absolutePath = AbstractC3149m.m6721t0(strM5947m) ? C2529d.m5949o(str6, "md5") : strM5947m;
                            }
                        }
                    } else if (i13 != 62) {
                        absolutePath = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                }
                if (i13 == 1) {
                    if (c2343gM6844q != null) {
                        String str7 = c2356t != null ? c2356t.f7743c : null;
                        if (str7 != null && !AbstractC3149m.m6721t0(str7)) {
                            z9 = true;
                        }
                        c1694q.f5634i = c1694q.f5630e;
                        c1693p = !z9 ? new C1693p(i13, absolutePath) : null;
                        c1694q.f5635j = c1693p;
                    }
                    z9 = false;
                    c1694q.f5634i = c1694q.f5630e;
                    if (!z9) {
                    }
                    c1694q.f5635j = c1693p;
                } else if (i13 == 34 || i13 == 62) {
                    if (c2105pMedia2 == null || AbstractC3149m.m6721t0(absolutePath) || (i13 != 47 && !AbstractC0921a.m2262y(absolutePath))) {
                        z9 = false;
                    }
                    c1694q.f5634i = c1694q.f5630e;
                    if (!z9) {
                    }
                    c1694q.f5635j = c1693p;
                } else if (i13 != 42) {
                    if (i13 != 43) {
                        switch (i13) {
                            case 49:
                                if (!c1697t.m4333a() && c2343gM6844q != null) {
                                    String str8 = c2356t != null ? c2356t.f7743c : null;
                                    if (str8 == null || AbstractC3149m.m6721t0(str8)) {
                                    }
                                }
                                z9 = false;
                                break;
                        }
                        c1694q.f5634i = c1694q.f5630e;
                        if (!z9) {
                        }
                        c1694q.f5635j = c1693p;
                    }
                }
            }
        }
        if (c1693p == null) {
            C2356t c2356t2 = c1697t.f5652g;
            if (c2356t2 == null) {
                m4322e(c1694q);
                return;
            }
            if (c1694q.f5631f >= list.size()) {
                m4322e(c1694q);
                return;
            }
            int i14 = c1694q.f5631f;
            int i15 = i14 + 10;
            int size2 = list.size();
            if (i15 > size2) {
                i15 = size2;
            }
            List listM8407P12 = AbstractC4166m.m8407P1(list.subList(i14, i15));
            String string = UUID.randomUUID().toString();
            string.getClass();
            this.f5642g = string;
            this.f5643h = listM8407P12;
            C3460o c3460oCurrentActivity = WeChatApis.currentActivity();
            Activity activityM7263a = c3460oCurrentActivity != null ? c3460oCurrentActivity.m7263a() : null;
            Activity activity = activityM7263a != null ? activityM7263a : null;
            Context context = activity != null ? activity : c3742g.f12143a;
            Intent intent = new Intent();
            intent.setClassName(c3742g.f12143a.getPackageName(), "com.tencent.mm.ui.transmit.MsgRetransmitUI");
            if (activity == null) {
                intent.addFlags(268435456);
            }
            intent.putExtra("Retr_MsgQuickShare", true);
            intent.putExtra("Select_Conv_User", AbstractC4166m.m8392A1(listM8407P12, ",", null, null, null, 62));
            intent.putExtra("custom_send_text", HttpUrl.FRAGMENT_ENCODE_SET);
            intent.putExtra("Retr_Msg_Type", c2356t2.f7744d);
            intent.putExtra("Retr_Msg_Id", c2356t2.f7741a);
            intent.putExtra("Retr_MsgTalker", c2356t2.f7742b);
            intent.putExtra("Retr_Msg_content", c2356t2.f7743c);
            intent.putExtra("Retr_File_Name", c2356t2.f7746f);
            intent.putExtra("Edit_Mode_Sigle_Msg", true);
            intent.putExtra("Retr_MsgFromScene", c2356t2.f7745e);
            intent.putExtra("Retr_show_success_tips", false);
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_start_where_you_are", true);
            intent.putExtra("scene_from", 17);
            intent.putExtra("hchat_selected_message_send_token", string);
            int i16 = c2356t2.f7747g;
            if (i16 > 0) {
                intent.putExtra("Retr_length", i16);
            }
            try {
                context.startActivity(intent);
                c3959f = C3967n.f12976a;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (!(c3959f instanceof C3959f)) {
                RunnableC1692o runnableC1692o = new RunnableC1692o(this, string, 0);
                ((Handler) this.f5639d).postDelayed(runnableC1692o, 120000L);
                this.f5644i = runnableC1692o;
            }
            Throwable thM8182b2 = C3960g.m8182b(c3959f);
            if (thM8182b2 != null) {
                c0042b.invoke("群发助手启动微信重发失败", thM8182b2);
                m4319a(c1694q, listM8407P12.size(), 750L);
                return;
            }
            return;
        }
        int i17 = c1693p.f5624a;
        if (c1694q.f5631f >= list.size()) {
            m4322e(c1694q);
            return;
        }
        String str9 = (String) list.get(c1694q.f5631f);
        try {
            WeChatApis.message().getClass();
            c2343gMessages = WeChatApis.messageApi;
            if (c2343gMessages == null) {
                c2343gMessages = WeChatApis.messages();
            }
            c2105pMedia = WeChatApis.media();
            C2356t c2356t3 = c1697t.f5652g;
            String str10 = c2356t3 != null ? c2356t3.f7743c : null;
            if (str10 != null) {
                str2 = str10;
            }
            str = c1693p.f5625b;
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        if (i17 != 1) {
            if (i17 != 34) {
                if (i17 == 62) {
                    z10 = (c2105pMedia == null || (c0240b2 = c2105pMedia.f7037c) == null || !c0240b2.m972q(str9, str)) ? false : true;
                } else if (i17 == 42) {
                    if (c2343gMessages != null && c2343gMessages.m5599v(42, str9, str2)) {
                    }
                } else if (i17 != 43) {
                    switch (i17) {
                        case 47:
                            if (c2105pMedia != null && c2105pMedia.f7038d.m5219v(str9, str)) {
                            }
                            break;
                        case 48:
                            if (c2343gMessages != null && c2343gMessages.m5599v(48, str9, str2)) {
                            }
                            break;
                        case 49:
                            if (c2343gMessages == null || !c2343gMessages.m5603z(str9, str2)) {
                            }
                            break;
                    }
                }
                thM8182b = C3960g.m8182b(c3959f2);
                if (thM8182b != null) {
                    c0042b.invoke("群发助手模块发送失败: target=" + str9 + " type=" + i17, thM8182b);
                }
                Boolean bool = Boolean.FALSE;
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = bool;
                }
                if (((Boolean) c3959f2).booleanValue()) {
                    c1694q.f5632g++;
                }
                m4319a(c1694q, 1, 500L);
            }
            if (c2105pMedia != null && (c2114y = c2105pMedia.f7036b) != null && c2114y.m5323s(c1697t.f5654i, str9, str)) {
            }
        } else if (c2343gMessages != null && c2343gMessages.m5601x(str9, str2)) {
        }
        c3959f2 = Boolean.valueOf(z10);
        thM8182b = C3960g.m8182b(c3959f2);
        if (thM8182b != null) {
        }
        Boolean bool2 = Boolean.FALSE;
        if (c3959f2 instanceof C3959f) {
        }
        if (((Boolean) c3959f2).booleanValue()) {
        }
        m4319a(c1694q, 1, 500L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f5636a) {
            case 3:
                return AbstractC0255e.m1021j("IfInfo: then: ", String.valueOf((C4305a) this.f5640e), ", else: ", String.valueOf((C4305a) this.f5641f));
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public void m4331u() {
        if (((C1694q) this.f5641f) != null) {
            return;
        }
        C1694q c1694q = (C1694q) ((ArrayDeque) this.f5640e).pollFirst();
        this.f5641f = c1694q;
        if (c1694q != null) {
            c1694q.f5633h = c1694q.f5628c.size() * c1694q.f5627b.size();
            m4330s(c1694q);
        }
    }

    public C1695r(C3742g c3742g, C0042b c0042b) {
        this.f5636a = 0;
        c3742g.getClass();
        this.f5637b = c3742g;
        this.f5638c = c0042b;
        this.f5639d = new Handler(Looper.getMainLooper());
        this.f5640e = new ArrayDeque();
        this.f5642g = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f5643h = C4173t.f13710g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1695r(C4322r c4322r, C6028b c6028b, C4305a c4305a, C4305a c4305a2) {
        this(c4322r, c6028b, c4305a, c4305a2, new C6141c(c4322r), new HashSet(), new ArrayList());
        this.f5636a = 3;
    }

    public C1695r(C4322r c4322r, C6028b c6028b, C4305a c4305a, C4305a c4305a2, C6141c c6141c, Set set, List list) {
        this.f5636a = 3;
        this.f5637b = c4322r;
        this.f5638c = c6028b;
        this.f5640e = c4305a;
        this.f5641f = c4305a2;
        this.f5639d = c6141c;
        this.f5642g = set;
        this.f5643h = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1695r(C1695r c1695r, C4305a c4305a) {
        this((C4322r) c1695r.f5637b, (C6028b) c1695r.f5638c, c4305a, null, (C6141c) c1695r.f5639d, (Set) c1695r.f5642g, (List) c1695r.f5643h);
        this.f5636a = 3;
    }

    public C1695r(C4322r c4322r, C5777d c5777d) {
        this.f5636a = 1;
        this.f5639d = new ArrayList();
        this.f5637b = c4322r;
        this.f5638c = c5777d;
    }
}
