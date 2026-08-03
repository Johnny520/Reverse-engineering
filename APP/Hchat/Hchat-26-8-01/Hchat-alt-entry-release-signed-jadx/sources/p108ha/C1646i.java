package p108ha;

import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p010aa.C0039g;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p096g8.C1364e;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p210o8.C3080d;
import p218og.AbstractC3149m;
import p230p8.C3351d0;
import p258r8.AbstractC3736a;
import p258r8.C3742g;

/* JADX INFO: renamed from: ha.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1646i extends AbstractC3736a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "moments_auto_like";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("moments_auto_like", "朋友圈自动点赞", "按好友、内容和时间规则自动点赞", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        String strOptString;
        c3742g.getClass();
        C1650k c1650k = new C1650k(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1646i.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 17));
        String string = c1650k.f5429b.getString("success_records", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            synchronized (c1650k.f5431d) {
                try {
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                        if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("id")) == null) {
                            strOptString = jSONArray.optString(i9);
                        }
                        strOptString.getClass();
                        String string2 = AbstractC3149m.m6703R0(strOptString).toString();
                        if (!AbstractC3149m.m6721t0(string2)) {
                            c1650k.f5434g.add(string2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable unused) {
        }
        if (c1650k.f5436i && c1650k.f5429b.getLong("enabled_at_seconds", 0L) <= 0) {
            c1650k.f5429b.edit().putLong("enabled_at_seconds", System.currentTimeMillis() / 1000).apply();
        }
        c1650k.f5429b.registerOnSharedPreferenceChangeListener(c1650k.f5437j);
        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
        if (c3351d0SnsApi != null) {
            c3351d0SnsApi.m7080n(new C1634c(c1650k, 2));
        }
        C3080d c3080dDatabaseChanges = WeChatApis.databaseChanges();
        if (c3080dDatabaseChanges != null) {
            c3080dDatabaseChanges.m6549g(new C1364e(c1650k, 5));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "朋友圈自动点赞";
    }
}
