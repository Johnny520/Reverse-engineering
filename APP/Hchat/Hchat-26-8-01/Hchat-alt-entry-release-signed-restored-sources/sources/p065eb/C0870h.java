package p065eb;

import android.content.ContentValues;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p085fg.InterfaceC1231l;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p167l8.C2526a;
import p210o8.InterfaceC3079c;
import p218og.AbstractC3156t;
import p276sf.C3959f;
import p276sf.C3960g;

/* JADX INFO: renamed from: eb.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0870h implements InterfaceC3079c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p210o8.InterfaceC3079c
    /* JADX INFO: renamed from: a */
    public final void mo2173a(C2526a c2526a) {
        ContentValues contentValues;
        Object c3959f;
        String string;
        Integer numM6741e0;
        C0876k c0876k = C0876k.f2687a;
        if ("insert".equals(c2526a.f8161a) && AbstractC3156t.m6734X(c2526a.f8162b, "fmessage_msginfo") && (contentValues = c2526a.f8164d) != null) {
            int iIntValue = 0;
            if (contentValues.containsKey("isSend")) {
                try {
                    Integer asInteger = contentValues.getAsInteger("isSend");
                    c3959f = Integer.valueOf(asInteger != null ? asInteger.intValue() : 0);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (C3960g.m8182b(c3959f) != null) {
                    Object obj = contentValues.get("isSend");
                    if (obj != null && (string = obj.toString()) != null && (numM6741e0 = AbstractC3156t.m6741e0(10, string)) != null) {
                        iIntValue = numM6741e0.intValue();
                    }
                    c3959f = Integer.valueOf(iIntValue);
                }
                iIntValue = ((Number) c3959f).intValue();
            }
            if (iIntValue != 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            C0876k.m2176b(sb2, C0876k.m2180f(contentValues, "msgContent"));
            C0876k.m2176b(sb2, C0876k.m2180f(contentValues, "fmsgContent"));
            C0876k.m2176b(sb2, C0876k.m2180f(contentValues, "content"));
            C0876k.m2176b(sb2, C0876k.m2180f(contentValues, "msgSource"));
            C0872i c0872iM2186m = C0876k.m2186m(sb2.toString(), null, C0876k.m2180f(contentValues, "talker"), true, C0876k.m2182h(C0876k.m2180f(contentValues, "fromusername"), C0876k.m2180f(contentValues, "fromUserName"), C0876k.m2180f(contentValues, "encryptusername"), C0876k.m2180f(contentValues, "encryptTalker"), C0876k.m2180f(contentValues, "talker")), C0876k.m2182h(C0876k.m2180f(contentValues, "ticket"), C0876k.m2180f(contentValues, "antispamticket"), C0876k.m2180f(contentValues, "antispam_ticket"), C0876k.m2180f(contentValues, "verifyticket"), C0876k.m2180f(contentValues, "verify_ticket")), C0876k.m2182h(C0876k.m2180f(contentValues, "scene"), C0876k.m2180f(contentValues, "scence"), C0876k.m2180f(contentValues, "sceneid"), C0876k.m2180f(contentValues, "scene_id")));
            if (c0872iM2186m != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0876k.m2179e(jCurrentTimeMillis);
                C0876k.m2188o(c0872iM2186m, jCurrentTimeMillis);
                String strM2181g = C0876k.m2181g(c0872iM2186m);
                ConcurrentHashMap concurrentHashMap = C0876k.f2688b;
                Long l10 = (Long) concurrentHashMap.get(strM2181g);
                if (l10 == null || jCurrentTimeMillis - l10.longValue() >= 3000) {
                    concurrentHashMap.put(strM2181g, Long.valueOf(jCurrentTimeMillis));
                    Iterator it = C0876k.f2690d.iterator();
                    while (it.hasNext()) {
                        try {
                            ((InterfaceC1231l) it.next()).invoke(c0872iM2186m);
                        } catch (Throwable unused) {
                        }
                    }
                    ScriptPluginRuntime.INSTANCE.dispatchOnNewFriend(c0872iM2186m.f2676a, c0872iM2186m.f2678c, c0872iM2186m.f2679d);
                }
            }
        }
    }
}
