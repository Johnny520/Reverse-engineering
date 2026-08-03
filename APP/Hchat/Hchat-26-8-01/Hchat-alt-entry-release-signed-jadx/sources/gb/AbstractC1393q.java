package gb;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.UUID;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p096g8.C1360a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p136j8.C2104o;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p304uf.C4327a;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import tf.C4173t;

/* JADX INFO: renamed from: gb.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1393q {

    /* JADX INFO: renamed from: a */
    public static final Object f4633a = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static Object m3789a(Context context) {
        Object c3959f;
        context.getClass();
        try {
            C1360a c1360aAccount = WeChatApis.account();
            if (c1360aAccount == null) {
                throw new IllegalStateException("当前微信账号资料尚未就绪，请重启微信后重试");
            }
            String strM3652c = c1360aAccount.m3652c();
            strM3652c.getClass();
            String string = AbstractC3149m.m6703R0(strM3652c).toString();
            if (AbstractC3149m.m6721t0(string)) {
                throw new IllegalArgumentException("无法读取当前账号 wxid，请重启微信后重试");
            }
            try {
                C1368i c1368iContacts = WeChatApis.contacts();
                c3959f = c1368iContacts != null ? c1368iContacts.m3725n(string) : null;
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            WeChatContact weChatContact = (WeChatContact) c3959f;
            String strM3651b = c1360aAccount.m3651b(42);
            strM3651b.getClass();
            String string2 = AbstractC3149m.m6703R0(strM3651b).toString();
            boolean zM6721t0 = AbstractC3149m.m6721t0(string2);
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (zM6721t0) {
                String str2 = weChatContact != null ? weChatContact.customWxId : null;
                if (str2 == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                string2 = AbstractC3149m.m6703R0(str2).toString();
            }
            String strM3651b2 = c1360aAccount.m3651b(4);
            strM3651b2.getClass();
            String string3 = AbstractC3149m.m6703R0(strM3651b2).toString();
            if (AbstractC3149m.m6721t0(string3)) {
                String str3 = weChatContact != null ? weChatContact.nickname : null;
                if (str3 != null) {
                    str = str3;
                }
                string3 = AbstractC3149m.m6703R0(str).toString();
            }
            if (string.length() > 128) {
                throw new IllegalArgumentException("当前账号 wxid 长度异常");
            }
            if (string2.length() > 128) {
                throw new IllegalArgumentException("当前账号微信号长度异常");
            }
            if (string3.length() <= 100) {
                return new C1395s(string, string2, string3);
            }
            throw new IllegalArgumentException("当前账号微信昵称过长");
        } catch (Throwable th3) {
            return new C3959f(th3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static C1379c m3790b(JSONObject jSONObject) {
        String strM9266j = AbstractC4855en.m9266j("commentId", jSONObject);
        String strM9266j2 = AbstractC4855en.m9266j("pluginId", jSONObject);
        String strM9266j3 = AbstractC4855en.m9266j("userNickname", jSONObject);
        String strOptString = jSONObject.optString("content");
        strOptString.getClass();
        String strOptString2 = jSONObject.optString("createdAt");
        strOptString2.getClass();
        return new C1379c(strM9266j, strM9266j2, strM9266j3, strOptString, strOptString2, jSONObject.optBoolean("canDelete", false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1391o m3791c(JSONObject jSONObject) {
        List listM90t;
        Object c3959f;
        int length;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("latestVersion");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("snapshot");
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("files");
        String strOptString = HttpUrl.FRAGMENT_ENCODE_SET;
        if (jSONArrayOptJSONArray != null) {
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length2 = jSONArrayOptJSONArray.length();
            for (int i9 = 0; i9 < length2; i9++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject2 != null) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("name");
                    String str = AbstractC3149m.m6721t0(strOptString2) ? HttpUrl.FRAGMENT_ENCODE_SET : strOptString2;
                    String strOptString3 = jSONObjectOptJSONObject2.optString("content", jSONObjectOptJSONObject2.optString(WeChatSnsPost.TYPE_TEXT));
                    String lowerCase = AbstractC0255e.m1023l("encoding", "utf8", jSONObjectOptJSONObject2).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    try {
                        if (lowerCase.equals("base64")) {
                            length = Base64.decode(strOptString3, 2).length;
                        } else {
                            strOptString3.getClass();
                            byte[] bytes = strOptString3.getBytes(AbstractC3137a.f10177a);
                            bytes.getClass();
                            length = bytes.length;
                        }
                        c3959f = Long.valueOf(length);
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = -1L;
                    }
                    long jOptLong = jSONObjectOptJSONObject2.optLong("size", ((Number) c3959f).longValue());
                    strOptString3.getClass();
                    String lowerCase2 = AbstractC4855en.m9266j("sha256", jSONObjectOptJSONObject2).toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    c4329cM7E.add(new C1383g(str, strOptString3, lowerCase2, lowerCase, jOptLong));
                }
            }
            listM90t = AbstractC0000a.m90t(c4329cM7E);
            if (listM90t == null) {
                listM90t = C4173t.f13710g;
            }
        }
        List list = listM90t;
        String strOptString4 = jSONObject.optString("remotePluginId");
        if (AbstractC3149m.m6721t0(strOptString4)) {
            strOptString4 = jSONObject.optString("pluginId");
        }
        if (AbstractC3149m.m6721t0(strOptString4)) {
            strOptString4 = jSONObject.optString("id");
        }
        String str2 = strOptString4;
        str2.getClass();
        String strOptString5 = jSONObject.optString("sourcePluginId");
        strOptString5.getClass();
        String strOptString6 = jSONObject.optString("displayName");
        if (AbstractC3149m.m6721t0(strOptString6)) {
            strOptString6 = jSONObject.optString("name");
        }
        String str3 = strOptString6;
        str3.getClass();
        String strOptString7 = jSONObject.optString("author");
        strOptString7.getClass();
        String strOptString8 = jSONObject2 != null ? jSONObject2.optString("versionName") : null;
        if (strOptString8 == null) {
            strOptString8 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6721t0(strOptString8)) {
            strOptString8 = jSONObject.optString("version");
        }
        String str4 = strOptString8;
        str4.getClass();
        String strOptString9 = jSONObject2 != null ? jSONObject2.optString("versionId") : null;
        if (strOptString9 == null) {
            strOptString9 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6721t0(strOptString9)) {
            strOptString9 = jSONObject.optString("versionId");
        }
        String str5 = strOptString9;
        str5.getClass();
        String strOptString10 = jSONObject2 != null ? jSONObject2.optString("createdAt") : null;
        if (strOptString10 != null) {
            strOptString = strOptString10;
        }
        if (AbstractC3149m.m6721t0(strOptString)) {
            strOptString = jSONObject.optString("updatedAt");
        }
        if (AbstractC3149m.m6721t0(strOptString)) {
            strOptString = jSONObject.optString("updateTime");
        }
        String str6 = strOptString;
        str6.getClass();
        long jOptLong2 = jSONObject.optLong("downloadCount", 0L);
        long j3 = jOptLong2 < 0 ? 0L : jOptLong2;
        long jOptLong3 = jSONObject.optLong("likeCount", 0L);
        long j4 = jOptLong3 < 0 ? 0L : jOptLong3;
        long jOptLong4 = jSONObject.optLong("commentCount", 0L);
        long j5 = jOptLong4 < 0 ? 0L : jOptLong4;
        String strOptString11 = jSONObject.optString("description", jSONObject.optString("summary"));
        strOptString11.getClass();
        return new C1391o(str2, strOptString5, str3, strOptString7, str4, str5, str6, j3, j4, j5, strOptString11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m3792d(Context context) {
        String string;
        context.getClass();
        synchronized (f4633a) {
            SharedPreferences sharedPreferencesM3796h = m3796h(context);
            String string2 = sharedPreferencesM3796h.getString("install_id", null);
            if (string2 != null && (string = AbstractC3149m.m6703R0(string2).toString()) != null) {
                String str = AbstractC3149m.m6721t0(string) ? null : string;
                if (str != null) {
                    return str;
                }
            }
            String string3 = UUID.randomUUID().toString();
            string3.getClass();
            String strM6737a0 = AbstractC3156t.m6737a0(string3, "-", HttpUrl.FRAGMENT_ENCODE_SET, false);
            if (sharedPreferencesM3796h.edit().putString("install_id", strM6737a0).commit()) {
                return strM6737a0;
            }
            throw new IllegalStateException("保存插件仓库 installId 失败");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C1389m m3793e(Context context, String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return null;
        }
        synchronized (f4633a) {
            JSONObject jSONObjectM3795g = m3795g(context);
            Iterator<String> itKeys = jSONObjectM3795g.keys();
            while (itKeys.hasNext()) {
                C1389m c1389mM3794f = m3794f(jSONObjectM3795g.optJSONObject(itKeys.next()));
                if (c1389mM3794f != null && AbstractC1416l.m3825a(c1389mM3794f.f4611a, string)) {
                    return c1389mM3794f;
                }
            }
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C1389m m3794f(JSONObject jSONObject) {
        String strOptString;
        String strOptString2;
        String string = (jSONObject == null || (strOptString2 = jSONObject.optString("remotePluginId")) == null) ? null : AbstractC3149m.m6703R0(strOptString2).toString();
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string2 = (jSONObject == null || (strOptString = jSONObject.optString("ownerToken")) == null) ? null : AbstractC3149m.m6703R0(strOptString).toString();
        if (string2 != null) {
            str = string2;
        }
        if (AbstractC3149m.m6721t0(string) || AbstractC3149m.m6721t0(str)) {
            return null;
        }
        return new C1389m(string, str, EnumC1392p.f4631i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static JSONObject m3795g(Context context) {
        Object c3959f;
        String string = m3796h(context).getString("ownerships", "{}");
        try {
            c3959f = new JSONObject(string != null ? string : "{}");
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object jSONObject = new JSONObject();
        if (c3959f instanceof C3959f) {
            c3959f = jSONObject;
        }
        return (JSONObject) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static SharedPreferences m3796h(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return AbstractC4302b.m8640c(context, "Hchat_script_plugin_market");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m3797i(Context context, String str) {
        context.getClass();
        synchronized (f4633a) {
            JSONObject jSONObjectM3795g = m3795g(context);
            jSONObjectM3795g.remove(str);
            if (!m3796h(context).edit().putString("ownerships", jSONObjectM3795g.toString()).commit()) {
                throw new IllegalStateException("删除插件仓库归属信息失败");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m3798j(Context context, String str) {
        String string = AbstractC3149m.m6703R0(str).toString();
        if (AbstractC3149m.m6721t0(string)) {
            return;
        }
        synchronized (f4633a) {
            try {
                JSONObject jSONObjectM3795g = m3795g(context);
                C4329c c4329cM7E = AbstractC0000a.m7E();
                Iterator<String> itKeys = jSONObjectM3795g.keys();
                while (itKeys.hasNext()) {
                    c4329cM7E.add(itKeys.next());
                }
                C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = c4329cM90t.listIterator(0);
                while (true) {
                    C4327a c4327a = (C4327a) listIterator;
                    if (!c4327a.hasNext()) {
                        break;
                    }
                    Object next = c4327a.next();
                    C1389m c1389mM3794f = m3794f(jSONObjectM3795g.optJSONObject((String) next));
                    if (AbstractC1416l.m3825a(c1389mM3794f != null ? c1389mM3794f.f4611a : null, string)) {
                        arrayList.add(next);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONObjectM3795g.remove((String) it.next());
                }
                if (!m3796h(context).edit().putString("ownerships", jSONObjectM3795g.toString()).commit()) {
                    throw new IllegalStateException("删除插件仓库归属信息失败");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m3799k(Context context, String str, C1389m c1389m) {
        context.getClass();
        if (AbstractC3149m.m6721t0(str)) {
            C2104o.m5294t("本地插件 ID 不能为空");
            return;
        }
        if (AbstractC3149m.m6721t0(c1389m.f4611a)) {
            C2104o.m5294t("远程插件 ID 不能为空");
            return;
        }
        if (AbstractC3149m.m6721t0(c1389m.f4612b)) {
            C2104o.m5294t("插件 ownerToken 不能为空");
            return;
        }
        synchronized (f4633a) {
            JSONObject jSONObjectM3795g = m3795g(context);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("remotePluginId", c1389m.f4611a);
            jSONObject.put("ownerToken", c1389m.f4612b);
            jSONObjectM3795g.put(str, jSONObject);
            if (!m3796h(context).edit().putString("ownerships", jSONObjectM3795g.toString()).commit()) {
                throw new IllegalStateException("保存插件仓库归属信息失败");
            }
        }
    }
}
