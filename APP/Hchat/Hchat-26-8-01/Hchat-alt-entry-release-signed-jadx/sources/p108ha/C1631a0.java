package p108ha;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import p000a.AbstractC0000a;
import p010aa.C0039g;
import p011ab.C0042b;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p218og.AbstractC3149m;
import p230p8.C3351d0;
import p258r8.AbstractC3736a;
import p258r8.C3742g;
import p276sf.C3959f;
import p304uf.C4329c;
import tf.C4173t;

/* JADX INFO: renamed from: ha.a0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1631a0 extends AbstractC3736a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "moments_post_notification";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("moments_post_notification", "朋友圈发布通知", "指定好友发布朋友圈时提醒", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        Object c3959f;
        c3742g.getClass();
        C1633b0 c1633b0 = new C1633b0(c3742g, new C0042b(2, this, AbstractC0921a.m2246i(C1631a0.class), "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 21));
        long j3 = c1633b0.f5340c.getLong("enabled_at_seconds", 0L);
        boolean zContains = c1633b0.f5340c.contains("notified_ids");
        boolean z9 = c1633b0.f5346i;
        if (z9 && (j3 <= 0 || !zContains)) {
            synchronized (c1633b0.f5343f) {
                c1633b0.f5343f.clear();
            }
            c1633b0.f5340c.edit().putLong("enabled_at_seconds", System.currentTimeMillis() / 1000).putString("notified_ids", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI).apply();
        } else if (z9) {
            String string = c1633b0.f5340c.getString("notified_ids", HttpUrl.FRAGMENT_ENCODE_SET);
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                C4329c c4329cM7E = AbstractC0000a.m7E();
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    String strOptString = jSONArray.optString(i9);
                    strOptString.getClass();
                    String string2 = AbstractC3149m.m6703R0(strOptString).toString();
                    if (AbstractC3149m.m6721t0(string2)) {
                        string2 = null;
                    }
                    if (string2 != null) {
                        c4329cM7E.add(string2);
                    }
                }
                c3959f = AbstractC0000a.m90t(c4329cM7E);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            Object obj = C4173t.f13710g;
            if (c3959f instanceof C3959f) {
                c3959f = obj;
            }
            List list = (List) c3959f;
            synchronized (c1633b0.f5343f) {
                c1633b0.f5343f.clear();
                LinkedHashSet linkedHashSet = c1633b0.f5343f;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    linkedHashSet.add((String) it.next());
                }
            }
        }
        c1633b0.f5340c.registerOnSharedPreferenceChangeListener(c1633b0.f5347j);
        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
        if (c3351d0SnsApi != null) {
            c3351d0SnsApi.m7080n(new C1634c(c1633b0, 3));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "朋友圈发布通知";
    }
}
