package p063e9;

import android.content.Context;
import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import tf.AbstractC4156d0;
import tf.C4173t;

/* JADX INFO: renamed from: e9.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0848s {

    /* JADX INFO: renamed from: b */
    public static final Set f2595b = AbstractC4156d0.m8355W("filehelper", "fmessage", "tmessage", "qqmail", "weixin", "floatbottle", "medianote", "medianote@chatroom", "masssend", "feedsapp", "blogapp");

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f2596a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0848s(Context context) {
        this.f2596a = context != null ? AbstractC4302b.m8640c(context, "Hchat_custom_notification") : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final C0832c m2150a(String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str2 = string;
        C0832c c0832c = null;
        Object obj = null;
        if (!AbstractC3149m.m6721t0(str2)) {
            if (!f2595b.contains(AbstractC3149m.m6703R0(str2).toString())) {
                if (!AbstractC3149m.m6721t0(str2)) {
                    Iterator it = m2153d().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (AbstractC1416l.m3825a(((C0832c) next).f2511b, str2)) {
                            obj = next;
                            break;
                        }
                    }
                    c0832c = (C0832c) obj;
                }
                if (c0832c != null) {
                    return c0832c;
                }
                boolean z9 = AbstractC3156t.m6733W(str2, "@chatroom", false) || AbstractC3156t.m6733W(str2, "@im.chatroom", false);
                boolean z10 = AbstractC3156t.m6740d0(str2, "gh_", false) || AbstractC3156t.m6733W(str2, "@app", false) || str2.equals("newsapp");
                return C0832c.m2114a(z9 ? C0847r.m2147f(m2152c("custom_notification_default_group"), true, false, m2151b("custom_notification_ignore_wechat_dnd")) : z10 ? C0847r.m2147f(m2152c("custom_notification_default_official"), false, true, m2151b("custom_notification_ignore_wechat_dnd")) : C0847r.m2147f(m2152c("custom_notification_default_private"), false, false, m2151b("custom_notification_ignore_wechat_dnd")), str2, str2, str2, z9, z10, false, 0, false, false, false, false, false, false, false, false, false, null, null, null, false, false, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 2097120);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2151b(String str) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f2596a;
            c3959f = Boolean.valueOf(sharedPreferences != null ? sharedPreferences.getBoolean(str, false) : false);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = obj;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2152c(String str) {
        Object c3959f;
        Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
        try {
            SharedPreferences sharedPreferences = this.f2596a;
            if (sharedPreferences != null) {
                c3959f = sharedPreferences.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
                if (c3959f == null) {
                    c3959f = HttpUrl.FRAGMENT_ENCODE_SET;
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:54:0x0151 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [sf.f] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX INFO: renamed from: d */
    public final List m2153d() {
        ?? c3959f;
        String strM2152c = m2152c("custom_notification_rules");
        boolean zM2151b = m2151b("custom_notification_ignore_wechat_dnd");
        boolean zM6721t0 = AbstractC3149m.m6721t0(strM2152c);
        C4173t c4173t = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM2152c);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("talker");
                    strOptString.getClass();
                    String string = AbstractC3149m.m6703R0(strOptString).toString();
                    if (!AbstractC3149m.m6721t0(string)) {
                        String strOptString2 = jSONObjectOptJSONObject.optString("id");
                        String str = AbstractC3149m.m6721t0(strOptString2) ? string : strOptString2;
                        String strOptString3 = jSONObjectOptJSONObject.optString("label");
                        String str2 = AbstractC3149m.m6721t0(strOptString3) ? string : strOptString3;
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("group", AbstractC3156t.m6733W(string, "@chatroom", false) || AbstractC3156t.m6733W(string, "@im.chatroom", false));
                        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("official", false);
                        boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("enabled", true);
                        int iOptInt = jSONObjectOptJSONObject.optInt("mode", 1);
                        boolean zOptBoolean4 = jSONObjectOptJSONObject.optBoolean("vibrate", true);
                        boolean zOptBoolean5 = jSONObjectOptJSONObject.optBoolean("sound", true);
                        boolean zOptBoolean6 = jSONObjectOptJSONObject.optBoolean("markRead", true);
                        boolean zOptBoolean7 = jSONObjectOptJSONObject.optBoolean("quickReply", false);
                        boolean zOptBoolean8 = jSONObjectOptJSONObject.optBoolean("quoteQuickReply", false);
                        boolean zOptBoolean9 = jSONObjectOptJSONObject.optBoolean("mergeByTalker", false);
                        boolean zOptBoolean10 = jSONObjectOptJSONObject.optBoolean("showDetail", true);
                        boolean zOptBoolean11 = jSONObjectOptJSONObject.has("ignoreWechatDnd") ? jSONObjectOptJSONObject.optBoolean("ignoreWechatDnd", false) : zM2151b;
                        boolean zOptBoolean12 = jSONObjectOptJSONObject.optBoolean("muteEnable", false);
                        String strM2146e = C0847r.m2146e(jSONObjectOptJSONObject.optString("muteStart"), "23:00:00");
                        String strM2146e2 = C0847r.m2146e(jSONObjectOptJSONObject.optString("muteEnd"), "07:00:00");
                        String strOptString4 = jSONObjectOptJSONObject.optString("ringtone");
                        strOptString4.getClass();
                        arrayList.add(new C0832c(str, string, str2, zOptBoolean, zOptBoolean2, zOptBoolean3, iOptInt, zOptBoolean4, zOptBoolean5, zOptBoolean6, zOptBoolean7, zOptBoolean8, zOptBoolean9, zOptBoolean10, zOptBoolean11, zOptBoolean12, strM2146e, strM2146e2, strOptString4, jSONObjectOptJSONObject.optBoolean("blockAtAll", false), jSONObjectOptJSONObject.optBoolean("blockAtMe", false), C0847r.m2145d(jSONObjectOptJSONObject.optString("onlyMembers")), C0847r.m2145d(jSONObjectOptJSONObject.optString("blockMembers"))));
                    }
                }
            }
            HashSet hashSet = new HashSet();
            c3959f = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((C0832c) obj).f2511b)) {
                    c3959f.add(obj);
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        ?? r5 = c4173t;
        if (!(c3959f instanceof C3959f)) {
            r5 = c3959f;
        }
        return (List) r5;
    }
}
