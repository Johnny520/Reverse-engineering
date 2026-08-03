package p315v8;

import ac.AbstractC0063p;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p136j8.AbstractC2091b;
import p178m3.AbstractC2777c;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p304uf.C4329c;
import p304uf.C4331e;
import p304uf.C4335i;
import tf.AbstractC4156d0;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: v8.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4538r {

    /* JADX INFO: renamed from: a */
    public static final C4538r f14978a = new C4538r();

    /* JADX INFO: renamed from: b */
    public static final LinkedHashSet f14979b = AbstractC4156d0.m8350R(WeChatSnsPost.TYPE_TEXT, WeChatSnsPost.TYPE_IMAGE, "voice", WeChatSnsPost.TYPE_VIDEO, "emoji", "quote", "file", "link", "music", "app", "location", "share_card", "note", "video_number_video");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m8966a(Context context) {
        context.getClass();
        return AbstractC4302b.m8640c(context, "Hchat_auto_message_forward_config").getBoolean("enabled", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0180  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m8967b(Context context) {
        C4173t c4173t;
        Object c3959f;
        JSONArray jSONArray;
        int i9;
        LinkedHashSet linkedHashSet;
        context.getClass();
        String string = AbstractC4302b.m8640c(context, "Hchat_auto_message_forward_config").getString("rules_v1", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean zM6721t0 = AbstractC3149m.m6721t0(string);
        C4173t c4173t2 = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t2;
        }
        try {
            JSONArray jSONArray2 = new JSONArray(string);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray2.length();
            boolean z9 = false;
            int i10 = 0;
            while (i10 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArray2.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("id");
                    if (AbstractC3149m.m6721t0(strOptString)) {
                        strOptString = UUID.randomUUID().toString();
                    }
                    strOptString.getClass();
                    String strOptString2 = jSONObjectOptJSONObject.optString("name", "转发规则 " + (i10 + 1));
                    strOptString2.getClass();
                    boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", true);
                    boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("forwardOwnMessages", z9);
                    C4335i c4335iM8970e = m8970e(jSONObjectOptJSONObject.optJSONArray("sourceIds"));
                    C4335i c4335iM8970e2 = m8970e(jSONObjectOptJSONObject.optJSONArray("sourceMemberIds"));
                    jSONArray = jSONArray2;
                    C4335i c4335iM8970e3 = m8970e(jSONObjectOptJSONObject.optJSONArray("targetIds"));
                    C4335i c4335iM8970e4 = m8970e(jSONObjectOptJSONObject.optJSONArray("messageKinds"));
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    Object it = c4335iM8970e4.iterator();
                    while (true) {
                        boolean zHasNext = ((AbstractC2777c) it).hasNext();
                        c4173t = c4173t2;
                        linkedHashSet = f14979b;
                        if (!zHasNext) {
                            break;
                        }
                        try {
                            int i11 = length;
                            Object next = ((C4331e) it).next();
                            C4335i c4335i = c4335iM8970e;
                            if (linkedHashSet.contains((String) next)) {
                                linkedHashSet2.add(next);
                            }
                            c4335iM8970e = c4335i;
                            c4173t2 = c4173t;
                            length = i11;
                        } catch (Throwable th2) {
                            th = th2;
                            c3959f = new C3959f(th);
                            return (List) (!(c3959f instanceof C3959f) ? c4173t : c3959f);
                        }
                    }
                    i9 = length;
                    C4335i c4335i2 = c4335iM8970e;
                    LinkedHashSet linkedHashSet3 = linkedHashSet2.isEmpty() ? linkedHashSet : linkedHashSet2;
                    boolean zOptBoolean3 = jSONObjectOptJSONObject.optBoolean("delayEnabled", jSONObjectOptJSONObject.optLong("delaySeconds", 0L) > 0);
                    long jOptLong = jSONObjectOptJSONObject.optLong("delaySeconds", 0L);
                    if (jOptLong < 0) {
                        jOptLong = 0;
                    }
                    jSONObjectOptJSONObject.optString("includeKeywords", HttpUrl.FRAGMENT_ENCODE_SET).getClass();
                    boolean zOptBoolean4 = jSONObjectOptJSONObject.optBoolean("includeKeywordsEnabled", !AbstractC3149m.m6721t0(r7));
                    String strOptString3 = jSONObjectOptJSONObject.optString("includeKeywords", HttpUrl.FRAGMENT_ENCODE_SET);
                    strOptString3.getClass();
                    jSONObjectOptJSONObject.optString("excludeKeywords", HttpUrl.FRAGMENT_ENCODE_SET).getClass();
                    boolean zOptBoolean5 = jSONObjectOptJSONObject.optBoolean("excludeKeywordsEnabled", !AbstractC3149m.m6721t0(r7));
                    String strOptString4 = jSONObjectOptJSONObject.optString("excludeKeywords", HttpUrl.FRAGMENT_ENCODE_SET);
                    strOptString4.getClass();
                    c4329cM7E.add(new C4521a(strOptString, strOptString2, zOptBoolean, zOptBoolean2, c4335i2, c4335iM8970e2, c4335iM8970e3, linkedHashSet3, zOptBoolean3, jOptLong, zOptBoolean4, strOptString3, zOptBoolean5, strOptString4));
                } else {
                    jSONArray = jSONArray2;
                    c4173t = c4173t2;
                    i9 = length;
                }
                i10++;
                jSONArray2 = jSONArray;
                c4173t2 = c4173t;
                length = i9;
                z9 = false;
            }
            c3959f = AbstractC0000a.m90t(c4329cM7E);
            c4173t = c4173t2;
        } catch (Throwable th3) {
            th = th3;
            c4173t = c4173t2;
        }
        return (List) (!(c3959f instanceof C3959f) ? c4173t : c3959f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static ArrayList m8968c(String str) {
        List listM6691F0 = AbstractC3149m.m6691F0(str, new char[]{'|', ',', 65292, ';', 65307, '\n', '\r'}, 6);
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
        return arrayList2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static JSONArray m8969d(Set set) {
        JSONArray jSONArray = new JSONArray();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(set2));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)).iterator();
        while (it2.hasNext()) {
            jSONArray.put((String) it2.next());
        }
        return jSONArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static C4335i m8970e(JSONArray jSONArray) {
        C4335i c4335i = new C4335i();
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                String strOptString = jSONArray.optString(i9);
                strOptString.getClass();
                String string = AbstractC3149m.m6703R0(strOptString).toString();
                if (!(string.length() > 0)) {
                    string = null;
                }
                if (string != null) {
                    c4335i.add(string);
                }
            }
        }
        return AbstractC0063p.m415h(c4335i);
    }
}
