package na;

import ae.C0076g;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.LinkedHashSet;
import okhttp3.HttpUrl;
import p096g8.C1363d;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatChatroom;
import p162l3.C2458l;
import p212oa.AbstractC3107b;

/* JADX INFO: renamed from: na.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2919g {

    /* JADX INFO: renamed from: a */
    public final C2458l f9484a;

    /* JADX INFO: renamed from: b */
    public final C0076g f9485b;

    /* JADX INFO: renamed from: c */
    public volatile boolean f9486c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f9487d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2919g(C2458l c2458l, C0076g c0076g) {
        this.f9484a = c2458l;
        this.f9485b = c0076g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m6333a(String str) {
        String strM6617g = AbstractC3107b.m6617g(str);
        return AbstractC3107b.m6616f(strM6617g) ? strM6617g : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m6334b() {
        this.f9484a.m5853b();
        try {
            WeChatApis.contact().getClass();
            C1363d c1363d = WeChatApis.chatroomApi;
            if (c1363d == null) {
                return;
            }
            LinkedHashSet linkedHashSetM6335c = m6335c();
            boolean z9 = false;
            for (WeChatChatroom weChatChatroom : c1363d.m3675g()) {
                if (weChatChatroom != null) {
                    String strM6333a = m6333a(weChatChatroom.chatroomId);
                    if (!TextUtils.isEmpty(strM6333a) && linkedHashSetM6335c.add(strM6333a)) {
                        z9 = true;
                    }
                }
            }
            if (z9) {
                m6336d(linkedHashSetM6335c);
            }
            this.f9487d = true;
        } catch (Throwable th2) {
            String str = "预加载群聊基线失败: " + th2.getMessage();
            C0076g c0076g = this.f9485b;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            c0076g.accept(str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final LinkedHashSet m6335c() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String strM5855d = this.f9484a.m5855d("hb_block_new_group_known", HttpUrl.FRAGMENT_ENCODE_SET);
        if (!TextUtils.isEmpty(strM5855d)) {
            for (String str : strM5855d.split("[|,，\\n\\r]+")) {
                String strM6333a = m6333a(str);
                if (!TextUtils.isEmpty(strM6333a)) {
                    linkedHashSet.add(strM6333a);
                }
            }
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m6336d(LinkedHashSet linkedHashSet) {
        SharedPreferences.Editor editorEdit = this.f9484a.m5853b().edit();
        StringBuilder sb2 = new StringBuilder();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            String strM6333a = m6333a((String) it.next());
            if (!TextUtils.isEmpty(strM6333a)) {
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(strM6333a);
            }
        }
        editorEdit.putString("hb_block_new_group_known", sb2.toString()).commit();
    }
}
