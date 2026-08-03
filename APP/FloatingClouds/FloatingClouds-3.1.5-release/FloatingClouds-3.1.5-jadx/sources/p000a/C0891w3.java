package p000a;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: a.w3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0891w3 implements InterfaceC0819s7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3495a;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [a.Gb.<clinit>():void, a.K3.<clinit>():void] */
    public /* synthetic */ C0891w3(int i) {
        this.f3495a = i;
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v46, types: [java.lang.Object, java.util.Map] */
    @Override // p000a.InterfaceC0819s7
    /* JADX INFO: renamed from: a */
    public final Object mo31a() {
        JSONArray jSONArrayOptJSONArray;
        String str;
        JSONArray jSONArrayOptJSONArray2;
        String str2;
        JSONArray jSONArrayOptJSONArray3;
        String str3;
        JSONArray jSONArrayOptJSONArray4;
        String str4;
        switch (this.f3495a) {
            case 0:
                return new C0410Wc("^SELECT (FTS5MetaContact|FTS5MetaTopHits|FTS5MetaKefuContact|FTS5MetaFeature|FTS5MetaWeApp|FTS5MetaFinderFollow|FTS5MetaFavorite)\\.docid, type, subtype, entity_id, aux_index,.*");
            case 1:
                return C0726n9.m1676s("fc_config");
            case 2:
                return C0726n9.m1676s("fc_options");
            case 3:
                HandlerThread handlerThread = new HandlerThread("MaskMuteThread");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 4:
                HandlerThread handlerThread2 = new HandlerThread("NativeHideAsync");
                handlerThread2.start();
                return new Handler(handlerThread2.getLooper());
            case 5:
                return C0088Ed.f277i;
            case 6:
                return C0088Ed.f270b;
            case 7:
                return C0088Ed.f278j;
            case 8:
                return C0088Ed.f279k;
            case 9:
                return C0088Ed.f281m;
            case 10:
                ?? r1 = C0475a5.f1753a;
                JSONObject jSONObject = null;
                if (r1 != 0 && (str = (String) r1.get("sns_timeline_adapter_v1")) != null) {
                    try {
                        jSONObject = new JSONObject(str);
                    } catch (Exception unused) {
                    }
                }
                C0439Y5 c0439y5 = C0439Y5.f1645a;
                if (jSONObject == null || (jSONArrayOptJSONArray = jSONObject.optJSONArray("classNames")) == null) {
                    return c0439y5;
                }
                C0574f9 c0574f9M749D = C0267Oc.m749D(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList = new ArrayList(C0758p3.m1800g0(c0574f9M749D, 10));
                Iterator<Integer> it = c0574f9M749D.iterator();
                while (((C0555e9) it).f2095c) {
                    arrayList.add(jSONArrayOptJSONArray.optString(((AbstractC0517c9) it).mo1278a(), ""));
                }
                return arrayList;
            case 11:
                return C0088Ed.f282n;
            case 12:
                return C0088Ed.f283o;
            case 13:
                return C0088Ed.f280l;
            case 14:
                return C0088Ed.f271c;
            case 15:
                return C0088Ed.f272d;
            case 16:
                ?? r12 = C0475a5.f1753a;
                JSONObject jSONObject2 = null;
                if (r12 != 0 && (str2 = (String) r12.get("sns_msg_adapter_v1")) != null) {
                    try {
                        jSONObject2 = new JSONObject(str2);
                    } catch (Exception unused2) {
                    }
                }
                C0439Y5 c0439y52 = C0439Y5.f1645a;
                if (jSONObject2 == null || (jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("classNames")) == null) {
                    return c0439y52;
                }
                C0574f9 c0574f9M749D2 = C0267Oc.m749D(0, jSONArrayOptJSONArray2.length());
                ArrayList arrayList2 = new ArrayList(C0758p3.m1800g0(c0574f9M749D2, 10));
                Iterator<Integer> it2 = c0574f9M749D2.iterator();
                while (((C0555e9) it2).f2095c) {
                    arrayList2.add(jSONArrayOptJSONArray2.optString(((AbstractC0517c9) it2).mo1278a(), ""));
                }
                return arrayList2;
            case 17:
                return C0088Ed.f274f;
            case 18:
                return C0088Ed.f273e;
            case 19:
                ?? r13 = C0475a5.f1753a;
                JSONObject jSONObject3 = null;
                if (r13 != 0 && (str3 = (String) r13.get("sns_msg_relevance_v1")) != null) {
                    try {
                        jSONObject3 = new JSONObject(str3);
                    } catch (Exception unused3) {
                    }
                }
                C0439Y5 c0439y53 = C0439Y5.f1645a;
                if (jSONObject3 == null || (jSONArrayOptJSONArray3 = jSONObject3.optJSONArray("classNames")) == null) {
                    return c0439y53;
                }
                C0574f9 c0574f9M749D3 = C0267Oc.m749D(0, jSONArrayOptJSONArray3.length());
                ArrayList arrayList3 = new ArrayList(C0758p3.m1800g0(c0574f9M749D3, 10));
                Iterator<Integer> it3 = c0574f9M749D3.iterator();
                while (((C0555e9) it3).f2095c) {
                    arrayList3.add(jSONArrayOptJSONArray3.optString(((AbstractC0517c9) it3).mo1278a(), ""));
                }
                return arrayList3;
            case 20:
                ?? r14 = C0475a5.f1753a;
                JSONObject jSONObject4 = null;
                if (r14 != 0 && (str4 = (String) r14.get("sns_timeline_v1")) != null) {
                    try {
                        jSONObject4 = new JSONObject(str4);
                    } catch (Exception unused4) {
                    }
                }
                C0439Y5 c0439y54 = C0439Y5.f1645a;
                if (jSONObject4 == null || (jSONArrayOptJSONArray4 = jSONObject4.optJSONArray("classNames")) == null) {
                    return c0439y54;
                }
                C0574f9 c0574f9M749D4 = C0267Oc.m749D(0, jSONArrayOptJSONArray4.length());
                ArrayList arrayList4 = new ArrayList(C0758p3.m1800g0(c0574f9M749D4, 10));
                Iterator<Integer> it4 = c0574f9M749D4.iterator();
                while (((C0555e9) it4).f2095c) {
                    arrayList4.add(jSONArrayOptJSONArray4.optString(((AbstractC0517c9) it4).mo1278a(), ""));
                }
                return arrayList4;
            case 21:
                return C0088Ed.f275g;
            case 22:
                return C0088Ed.f276h;
            case 23:
                JSONObject jSONObjectM1155d = C0475a5.m1155d("sns_recycler_adapter_v1");
                return jSONObjectM1155d != null ? C0475a5.m1158g("classNames", jSONObjectM1155d) : C0439Y5.f1645a;
            case 24:
                return C0726n9.m1681z("filehelper", "weixin", "qmessage", "qqmail", "newsapp", "fmessage", "tmessage", "medianote", "floatbottle", "lbsapp", "masssendapp", "blogapp", "shakeapp", "officialaccounts", "service_officialaccounts", "notifymessage", "notification_messages", "schedule_message", "message_fold", "helper_entry", "conversationboxservice", "appbrand_notify_message", "appbrandcustomerservicemsg", "opencustomerservicemsg", "facebookapp", "qqsync");
            default:
                return C0726n9.m1681z("message_fold", "helper_entry", "conversationboxservice", "notification_messages", "schedule_message", "@placeholder_foldgroup");
        }
    }
}
