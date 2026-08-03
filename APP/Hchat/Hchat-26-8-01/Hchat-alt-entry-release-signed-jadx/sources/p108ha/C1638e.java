package p108ha;

import okhttp3.HttpUrl;
import org.json.JSONArray;
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
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;

/* JADX INFO: renamed from: ha.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1638e extends AbstractC3736a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "moments_auto_forward";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("moments_auto_forward", "朋友圈自动转发", "按好友和内容规则静默转发朋友圈", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        Object c3959f;
        c3742g.getClass();
        C1644h c1644h = new C1644h(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1638e.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 16));
        String string = c1644h.f5396b.getString("handled_ids", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            synchronized (c1644h.f5400f) {
                c1644h.f5402h.clear();
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    String strOptString = jSONArray.optString(i9);
                    strOptString.getClass();
                    String string2 = AbstractC3149m.m6703R0(strOptString).toString();
                    if (AbstractC3149m.m6721t0(string2)) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        c1644h.f5402h.add(string2);
                    }
                }
            }
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            synchronized (c1644h.f5400f) {
                c1644h.f5402h.clear();
            }
            c1644h.f5395a.invoke("读取朋友圈自动转发去重记录失败", thM8182b);
        }
        synchronized (c1644h.f5399e) {
            try {
                if (c1644h.f5404j) {
                    c1644h.f5405k++;
                    if (c1644h.f5396b.getLong("enabled_at_seconds", 0L) <= 0 || !c1644h.f5396b.contains("handled_ids")) {
                        c1644h.m4179a();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        c1644h.f5396b.registerOnSharedPreferenceChangeListener(c1644h.f5406l);
        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
        if (c3351d0SnsApi != null) {
            c3351d0SnsApi.m7080n(new C1634c(c1644h, 1));
        }
        C3080d c3080dDatabaseChanges = WeChatApis.databaseChanges();
        if (c3080dDatabaseChanges != null) {
            c3080dDatabaseChanges.m6549g(new C1364e(c1644h, 4));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "朋友圈自动转发";
    }
}
