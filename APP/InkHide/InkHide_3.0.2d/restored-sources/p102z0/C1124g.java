package p102z0;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import com.p055lu.wxmask.bean.MaskItemBean;
import com.p055lu.wxmask.bean.OptionData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p003B0.AbstractC0055a;
import p009E0.AbstractC0105e;
import p009E0.C0104d;
import p009E0.C0109i;
import p011F0.AbstractC0120h;
import p011F0.AbstractC0123k;
import p011F0.AbstractC0125m;
import p011F0.AbstractC0134v;
import p011F0.C0131s;
import p011F0.C0132t;
import p011F0.C0133u;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0299i;
import p040U0.AbstractC0307q;
import p052b1.AbstractC0503h;
import p067g0.AbstractC0575a;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: z0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1124g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m2410A() {
        return m2443s() && m2435k().getHideSelfSnsPosts();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m2411B() {
        return m2443s() && m2435k().getHideSingleSearch();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static boolean m2412C() {
        return m2443s() && m2435k().getHideSnsGroupIcon();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static boolean m2413D() {
        return m2443s() && m2435k().getHideStorageChatHistory();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static boolean m2414E() {
        return m2443s() && m2435k().getHideTextStatusFriend();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static boolean m2415F() {
        return m2443s() && m2435k().getQuickAddMaskList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static boolean m2416G() {
        return m2443s() && m2435k().getReadTraceMessage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static boolean m2417H() {
        return m2443s() && m2435k().getDisableSelfSnsLongPressHidePrompt();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static void m2418I() {
        Object c0104d;
        try {
            Context contextM991x = AbstractC0503h.m991x();
            String[] strArr = {contextM991x.getPackageName(), "com.tencent.mm"};
            LinkedHashSet linkedHashSet = new LinkedHashSet(AbstractC0134v.m294Y(2));
            AbstractC0120h.m261i0(strArr, linkedHashSet);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                contextM991x.sendBroadcast(new Intent("com.lu.wxmask.action.CONFIG_CHANGED").setPackage((String) it.next()).putExtra("sourcePid", Process.myPid()));
            }
            AbstractC0731a.m1384a("config changed broadcast sent", contextM991x.getPackageName());
            c0104d = C0109i.f404a;
        } catch (Throwable th) {
            c0104d = new C0104d(th);
        }
        Throwable thM246a = AbstractC0105e.m246a(c0104d);
        if (thM246a != null) {
            AbstractC0731a.m1387d("send config changed broadcast fail", thM246a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static void m2419J() {
        try {
            Method declaredMethod = m2438n().getClass().getDeclaredMethod("startReloadIfChangedUnexpectedly", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(m2438n(), null);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static void m2420K(String str) {
        AbstractC0223g.m418e(str, "username");
        Set<String> setM2439o = m2439o();
        if (setM2439o.remove(str)) {
            SharedPreferences.Editor editorEdit = m2438n().edit();
            boolean z2 = AbstractC1126i.f3786a;
            if (!editorEdit.putStringSet("temp_unhide_close_friends", setM2439o).commit()) {
                AbstractC0731a.m1387d("removeTemporaryUnhideCloseFriend fail");
            } else {
                AbstractC1126i.f3789d = AbstractC0123k.m265B0(setM2439o);
                m2418I();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static void m2421L(ArrayList arrayList, String str) {
        String string = AbstractC0299i.m507C0(str).toString();
        if (AbstractC0307q.m534d0(string)) {
            return;
        }
        LinkedHashMap linkedHashMapM299d0 = AbstractC0134v.m299d0(m2430f());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!AbstractC0307q.m534d0(str2)) {
                linkedHashMapM299d0.put(str2, string);
            }
        }
        SharedPreferences.Editor editorEdit = m2438n().edit();
        boolean z2 = AbstractC1126i.f3786a;
        if (editorEdit.putString("hidden_self_sns_post_images", new JSONObject(linkedHashMapM299d0).toString()).commit()) {
            return;
        }
        AbstractC0731a.m1387d("saveHiddenSelfSnsPostImagePath fail");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static void m2422M(ArrayList arrayList, String str) {
        String string = AbstractC0299i.m507C0(str).toString();
        if (AbstractC0307q.m534d0(string)) {
            return;
        }
        LinkedHashMap linkedHashMapM299d0 = AbstractC0134v.m299d0(m2431g());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (!AbstractC0307q.m534d0(str2)) {
                linkedHashMapM299d0.put(str2, string);
            }
        }
        SharedPreferences.Editor editorEdit = m2438n().edit();
        boolean z2 = AbstractC1126i.f3786a;
        if (editorEdit.putString("hidden_self_sns_post_summaries", new JSONObject(linkedHashMapM299d0).toString()).commit()) {
            return;
        }
        AbstractC0731a.m1387d("saveHiddenSelfSnsPostSummary fail");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m2423N(List list) {
        AbstractC0223g.m418e(list, "data");
        String strM483f = AbstractC0575a.f1940a.m483f(list);
        boolean z2 = AbstractC1126i.f3786a;
        if (!m2438n().edit().putString("maskList", strM483f).commit()) {
            AbstractC0731a.m1387d("set mask list fail");
        } else {
            AbstractC1126i.f3788c = AbstractC0123k.m281w0(list);
            m2418I();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static void m2424O(OptionData optionData) {
        AbstractC0223g.m418e(optionData, "data");
        try {
            SharedPreferences.Editor editorEdit = m2438n().edit();
            boolean z2 = AbstractC1126i.f3786a;
            OptionData.Companion companion = OptionData.Companion;
            SharedPreferences.Editor editorPutString = editorEdit.putString("options", companion.toJson(optionData));
            if (!optionData.getCloseFriendQuickDisplay()) {
                editorPutString.remove("temp_unhide_close_friends");
            }
            if (!editorPutString.commit()) {
                AbstractC0731a.m1387d("setOptionJson fail");
                return;
            }
            AbstractC1126i.f3787b = companion.fromJson(companion.toJson(optionData));
            if (!optionData.getCloseFriendQuickDisplay()) {
                AbstractC1126i.f3789d = C0133u.f428a;
            }
            m2418I();
        } catch (Exception e2) {
            AbstractC0731a.m1387d("setOptionJson fail", e2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m2425a() {
        boolean z2 = AbstractC1126i.f3786a;
        ArrayList arrayList = AbstractC1126i.f3795j;
        AbstractC0731a.m1384a(AbstractC0174d.m351g(arrayList.size(), "notifyConfigSetObserverChanged, observers count="));
        for (InterfaceC1125h interfaceC1125h : AbstractC0123k.m281w0(arrayList)) {
            AbstractC0731a.m1384a("notifying observer");
            interfaceC1125h.mo1472a();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2426b(MaskItemBean maskItemBean) {
        ArrayList arrayListM2433i;
        try {
            arrayListM2433i = m2433i();
        } catch (Exception e2) {
            HashMap map = AbstractC0055a.f298a;
            String strM483f = AbstractC0575a.f1940a.m483f(maskItemBean);
            AbstractC0223g.m417d(strM483f, "toJson(...)");
            AbstractC0731a.m1385b(strM483f, e2);
            arrayListM2433i = null;
        }
        if (arrayListM2433i == null) {
            return;
        }
        arrayListM2433i.add(maskItemBean);
        m2423N(arrayListM2433i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m2427c() {
        int size = m2439o().size();
        if (size == 0) {
            SharedPreferences sharedPreferencesM2438n = m2438n();
            boolean z2 = AbstractC1126i.f3786a;
            if (!sharedPreferencesM2438n.contains("temp_unhide_close_friends")) {
                AbstractC0731a.m1384a("clearTemporaryUnhideCloseFriends skipped", "beforeSize=0");
                return;
            }
        }
        SharedPreferences.Editor editorEdit = m2438n().edit();
        boolean z3 = AbstractC1126i.f3786a;
        if (!editorEdit.remove("temp_unhide_close_friends").commit()) {
            AbstractC0731a.m1387d("clearTemporaryUnhideCloseFriends fail");
            return;
        }
        AbstractC1126i.f3789d = C0133u.f428a;
        AbstractC0731a.m1384a("clearTemporaryUnhideCloseFriends", AbstractC0174d.m351g(size, "beforeSize="));
        m2418I();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static boolean m2428d(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Set setM2432h = m2432h();
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (setM2432h.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static boolean m2429e(String str) {
        if (str == null || AbstractC0307q.m534d0(str) || !m2444t()) {
            return false;
        }
        return m2439o().contains(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Map m2430f() {
        String str = "{}";
        try {
            m2419J();
            SharedPreferences sharedPreferencesM2438n = m2438n();
            boolean z2 = AbstractC1126i.f3786a;
            String string = sharedPreferencesM2438n.getString("hidden_self_sns_post_images", "{}");
            if (string == null) {
                string = "";
            }
            if (!AbstractC0307q.m534d0(string)) {
                str = string;
            }
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            AbstractC0223g.m417d(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObject.optString(next, "");
                AbstractC0223g.m417d(strOptString, "optString(...)");
                String string2 = AbstractC0299i.m507C0(strOptString).toString();
                AbstractC0223g.m415b(next);
                if (!AbstractC0307q.m534d0(next) && !AbstractC0307q.m534d0(string2)) {
                    linkedHashMap.put(next, string2);
                }
            }
            return linkedHashMap;
        } catch (Exception e2) {
            AbstractC0731a.m1387d("getHiddenSelfSnsPostImages fail", e2);
            return C0132t.f427a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static Map m2431g() {
        String str = "{}";
        try {
            m2419J();
            SharedPreferences sharedPreferencesM2438n = m2438n();
            boolean z2 = AbstractC1126i.f3786a;
            String string = sharedPreferencesM2438n.getString("hidden_self_sns_post_summaries", "{}");
            if (string == null) {
                string = "";
            }
            if (!AbstractC0307q.m534d0(string)) {
                str = string;
            }
            JSONObject jSONObject = new JSONObject(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            AbstractC0223g.m417d(itKeys, "keys(...)");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString = jSONObject.optString(next, "");
                AbstractC0223g.m417d(strOptString, "optString(...)");
                String string2 = AbstractC0299i.m507C0(strOptString).toString();
                AbstractC0223g.m415b(next);
                if (!AbstractC0307q.m534d0(next) && !AbstractC0307q.m534d0(string2)) {
                    linkedHashMap.put(next, string2);
                }
            }
            return linkedHashMap;
        } catch (Exception e2) {
            AbstractC0731a.m1387d("getHiddenSelfSnsPostSummaries fail", e2);
            return C0132t.f427a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Set m2432h() {
        Set<String> setM265B0;
        Set set = AbstractC1126i.f3790e;
        if (set != null) {
            return AbstractC0123k.m264A0(set);
        }
        try {
            SharedPreferences sharedPreferencesM2438n = m2438n();
            boolean z2 = AbstractC1126i.f3786a;
            Set<String> set2 = C0133u.f428a;
            Set<String> stringSet = sharedPreferencesM2438n.getStringSet("hidden_self_sns_posts", set2);
            if (stringSet != null) {
                ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(stringSet));
                for (String str : stringSet) {
                    AbstractC0223g.m415b(str);
                    arrayList.add(AbstractC0299i.m507C0(str).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!AbstractC0307q.m534d0((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                setM265B0 = AbstractC0123k.m265B0(arrayList2);
            } else {
                setM265B0 = null;
            }
            if (setM265B0 != null) {
                set2 = setM265B0;
            }
            boolean z3 = AbstractC1126i.f3786a;
            AbstractC1126i.f3790e = set2;
            return AbstractC0123k.m264A0(set2);
        } catch (Exception e2) {
            AbstractC0731a.m1387d("getHiddenSelfSnsPosts fail", e2);
            return new LinkedHashSet();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static ArrayList m2433i() {
        ArrayList arrayList;
        List list = AbstractC1126i.f3788c;
        if (list != null) {
            return new ArrayList(list);
        }
        synchronized (AbstractC1126i.f3792g) {
            try {
                List listM281w0 = AbstractC1126i.f3788c;
                if (listM281w0 == null) {
                    try {
                        boolean z2 = AbstractC1126i.f3786a;
                        m2419J();
                        listM281w0 = AbstractC0123k.m281w0(m2434j());
                        AbstractC1126i.f3788c = listM281w0;
                    } catch (Throwable th) {
                        AbstractC0731a.m1385b(th);
                        listM281w0 = C0131s.f426a;
                    }
                }
                arrayList = new ArrayList(listM281w0);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static ArrayList m2434j() {
        ArrayList arrayList = new ArrayList();
        try {
            SharedPreferences sharedPreferencesM2438n = m2438n();
            boolean z2 = AbstractC1126i.f3786a;
            JSONArray jSONArray = new JSONArray(sharedPreferencesM2438n.getString("maskList", "[]"));
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String strOptString = jSONArray.optString(i2);
                if (strOptString != null && !AbstractC0307q.m534d0(strOptString)) {
                    MaskItemBean maskItemBeanFromJson = MaskItemBean.Companion.fromJson(strOptString);
                    if (!TextUtils.isEmpty(maskItemBeanFromJson.getMaskId())) {
                        arrayList.add(maskItemBeanFromJson);
                    }
                }
            }
        } catch (Exception e2) {
            AbstractC0731a.m1387d("getMaskList fail", e2);
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static OptionData m2435k() {
        OptionData optionDataFromJson;
        String string;
        OptionData optionData = AbstractC1126i.f3787b;
        if (optionData != null) {
            return optionData;
        }
        synchronized (AbstractC1126i.f3792g) {
            optionDataFromJson = AbstractC1126i.f3787b;
            if (optionDataFromJson == null) {
                OptionData.Companion companion = OptionData.Companion;
                boolean z2 = AbstractC1126i.f3786a;
                String string2 = m2438n().getString("options", "{}");
                String str = "{}";
                if (string2 != null && (string = string2.toString()) != null) {
                    str = string;
                }
                optionDataFromJson = companion.fromJson(str);
                AbstractC1126i.f3787b = optionDataFromJson;
            }
        }
        return optionDataFromJson;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static String m2436l() {
        String string = AbstractC0299i.m507C0(m2435k().getQuickAddMenuTitle()).toString();
        return AbstractC0307q.m534d0(string) ? "加入名单" : string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static String m2437m() {
        String str = AbstractC1126i.f3791f;
        if (str != null) {
            return str;
        }
        SharedPreferences sharedPreferencesM2438n = m2438n();
        boolean z2 = AbstractC1126i.f3786a;
        String string = sharedPreferencesM2438n.getString("self_wechat_id", "");
        String string2 = AbstractC0299i.m507C0(string != null ? string : "").toString();
        AbstractC1126i.f3791f = string2;
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static SharedPreferences m2438n() {
        return (SharedPreferences) AbstractC1126i.f3794i.m247a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static Set m2439o() {
        Set<String> setM265B0;
        Set set = AbstractC1126i.f3789d;
        if (set != null) {
            return AbstractC0123k.m264A0(set);
        }
        try {
            SharedPreferences sharedPreferencesM2438n = m2438n();
            boolean z2 = AbstractC1126i.f3786a;
            Set<String> set2 = C0133u.f428a;
            Set<String> stringSet = sharedPreferencesM2438n.getStringSet("temp_unhide_close_friends", set2);
            if (stringSet != null) {
                ArrayList arrayList = new ArrayList(AbstractC0125m.m289c0(stringSet));
                for (String str : stringSet) {
                    AbstractC0223g.m415b(str);
                    arrayList.add(AbstractC0299i.m507C0(str).toString());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!AbstractC0307q.m534d0((String) obj)) {
                        arrayList2.add(obj);
                    }
                }
                setM265B0 = AbstractC0123k.m265B0(arrayList2);
            } else {
                setM265B0 = null;
            }
            if (setM265B0 != null) {
                set2 = setM265B0;
            }
            boolean z3 = AbstractC1126i.f3786a;
            AbstractC1126i.f3789d = set2;
            return AbstractC0123k.m264A0(set2);
        } catch (Exception e2) {
            AbstractC0731a.m1387d("getTemporaryUnhideCloseFriends fail", e2);
            return new LinkedHashSet();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static boolean m2440p() {
        if (m2444t()) {
            return !m2439o().isEmpty();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000d  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2441q(String str) {
        if (str != null) {
            boolean z2 = AbstractC1126i.f3786a;
            if (str.equals("maskList")) {
                AbstractC1126i.f3788c = null;
            }
        }
        if (str != null) {
            boolean z3 = AbstractC1126i.f3786a;
            if (str.equals("options")) {
                AbstractC1126i.f3787b = null;
            }
        }
        if (str != null) {
            boolean z4 = AbstractC1126i.f3786a;
            if (str.equals("temp_unhide_close_friends")) {
                AbstractC1126i.f3789d = null;
            }
        }
        if (str != null) {
            boolean z5 = AbstractC1126i.f3786a;
            if (str.equals("hidden_self_sns_posts")) {
                AbstractC1126i.f3790e = null;
            }
        }
        if (str != null) {
            boolean z6 = AbstractC1126i.f3786a;
            if (!str.equals("self_wechat_id")) {
                return;
            }
        }
        AbstractC1126i.f3791f = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static boolean m2442r() {
        return m2443s() && m2435k().getAntiRevokeMessage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static boolean m2443s() {
        C1120c c1120c = AbstractC1121d.f3779a;
        C1118a c1118aM2490l = AbstractC1135r.m2490l();
        if (!c1118aM2490l.f3763d || !c1118aM2490l.f3764e) {
            return false;
        }
        C1119b c1119bM2406g = AbstractC1121d.f3781c;
        if (c1119bM2406g == null) {
            c1119bM2406g = C1120c.m2406g(null, true);
        }
        if (c1119bM2406g != null) {
            return c1119bM2406g.f3767a;
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static boolean m2444t() {
        return m2443s() && m2435k().getCloseFriendQuickDisplay();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static boolean m2445u() {
        return m2443s() && m2435k().getCustomLocalFriendAvatar();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static boolean m2446v() {
        return m2435k().getUseFullscreenConfigUi();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static boolean m2447w() {
        return m2443s() && m2435k().getHideChatHistory();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static boolean m2448x() {
        return m2443s() && m2435k().getHideCloseFriend();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static boolean m2449y() {
        return m2443s() && m2435k().getHideContactFriend();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m2450z() {
        return m2443s() && m2435k().getHideMainSearch();
    }
}
