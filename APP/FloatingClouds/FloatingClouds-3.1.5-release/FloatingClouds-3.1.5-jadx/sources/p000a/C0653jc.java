package p000a;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: a.jc */
/* JADX INFO: loaded from: classes.dex */
public final class C0653jc {

    /* JADX INFO: renamed from: A */
    public boolean f2409A;

    /* JADX INFO: renamed from: B */
    public boolean f2410B;

    /* JADX INFO: renamed from: C */
    public String f2411C;

    /* JADX INFO: renamed from: D */
    public boolean f2412D;

    /* JADX INFO: renamed from: E */
    public boolean f2413E;

    /* JADX INFO: renamed from: F */
    public boolean f2414F;

    /* JADX INFO: renamed from: G */
    public int f2415G;

    /* JADX INFO: renamed from: H */
    public boolean f2416H;

    /* JADX INFO: renamed from: I */
    public int f2417I;

    /* JADX INFO: renamed from: J */
    public boolean f2418J;

    /* JADX INFO: renamed from: K */
    public int f2419K;

    /* JADX INFO: renamed from: L */
    public boolean f2420L;

    /* JADX INFO: renamed from: M */
    public boolean f2421M;

    /* JADX INFO: renamed from: N */
    public boolean f2422N;

    /* JADX INFO: renamed from: O */
    public boolean f2423O;

    /* JADX INFO: renamed from: P */
    public String f2424P;

    /* JADX INFO: renamed from: Q */
    public String f2425Q;

    /* JADX INFO: renamed from: R */
    public boolean f2426R;

    /* JADX INFO: renamed from: S */
    public String f2427S;

    /* JADX INFO: renamed from: T */
    public String f2428T;

    /* JADX INFO: renamed from: U */
    public String f2429U;

    /* JADX INFO: renamed from: V */
    public String f2430V;

    /* JADX INFO: renamed from: a */
    public boolean f2431a;

    /* JADX INFO: renamed from: b */
    public boolean f2432b;

    /* JADX INFO: renamed from: c */
    public boolean f2433c;

    /* JADX INFO: renamed from: d */
    public boolean f2434d;

    /* JADX INFO: renamed from: e */
    public boolean f2435e;

    /* JADX INFO: renamed from: f */
    public boolean f2436f;

    /* JADX INFO: renamed from: g */
    public boolean f2437g;

    /* JADX INFO: renamed from: h */
    public boolean f2438h;

    /* JADX INFO: renamed from: i */
    public boolean f2439i;

    /* JADX INFO: renamed from: j */
    public boolean f2440j;

    /* JADX INFO: renamed from: k */
    public boolean f2441k;

    /* JADX INFO: renamed from: l */
    public boolean f2442l;

    /* JADX INFO: renamed from: m */
    public boolean f2443m;

    /* JADX INFO: renamed from: n */
    public boolean f2444n;

    /* JADX INFO: renamed from: o */
    public boolean f2445o;

    /* JADX INFO: renamed from: p */
    public boolean f2446p;

    /* JADX INFO: renamed from: q */
    public boolean f2447q;

    /* JADX INFO: renamed from: r */
    public boolean f2448r;

    /* JADX INFO: renamed from: s */
    public boolean f2449s;

    /* JADX INFO: renamed from: t */
    public boolean f2450t;

    /* JADX INFO: renamed from: u */
    public boolean f2451u;

    /* JADX INFO: renamed from: v */
    public int f2452v;

    /* JADX INFO: renamed from: w */
    public int f2453w;

    /* JADX INFO: renamed from: x */
    public boolean f2454x;

    /* JADX INFO: renamed from: y */
    public int f2455y;

    /* JADX INFO: renamed from: z */
    public boolean f2456z;

    /* JADX INFO: renamed from: a.jc$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static C0653jc m1517a(String str) {
            JSONObject jSONObject;
            C0631i9.m1482e(str, "jsonText");
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            boolean zOptBoolean = jSONObject.optBoolean("hideMainSearch", true);
            boolean zOptBoolean2 = jSONObject.optBoolean("hideMainSearchStrong", false);
            boolean zOptBoolean3 = jSONObject.optBoolean("viewWxDbPw", true);
            boolean zOptBoolean4 = jSONObject.optBoolean("hideStorageChatRecordEntry", true);
            boolean zOptBoolean5 = jSONObject.optBoolean("hideStorageCache", true);
            boolean zOptBoolean6 = jSONObject.optBoolean("hideSnsEntry", true);
            boolean zOptBoolean7 = jSONObject.optBoolean("hideDiscoverSnsEntry", true);
            boolean zOptBoolean8 = jSONObject.optBoolean("hideDiscoverEntries", true);
            boolean zOptBoolean9 = jSONObject.optBoolean("hideRecentForward", true);
            boolean zOptBoolean10 = jSONObject.optBoolean("hideOwnSns", true);
            boolean zOptBoolean11 = jSONObject.optBoolean("showOwnSnsHideDialog", true);
            boolean zOptBoolean12 = jSONObject.optBoolean("hideSnsInteraction", true);
            boolean zOptBoolean13 = jSONObject.optBoolean("hideSnsGroupIcon", true);
            boolean zOptBoolean14 = jSONObject.optBoolean("hideMainConvList", true);
            boolean zOptBoolean15 = jSONObject.optBoolean("hideContactList", true);
            boolean zOptBoolean16 = jSONObject.optBoolean("hideInLabel", true);
            boolean zOptBoolean17 = jSONObject.optBoolean("hideConversation", true);
            boolean zOptBoolean18 = jSONObject.optBoolean("hideMaskedMessageNotification", true);
            boolean zOptBoolean19 = jSONObject.optBoolean("blockEnterChat", true);
            boolean zOptBoolean20 = jSONObject.optBoolean("blockContactInfo", true);
            boolean zOptBoolean21 = jSONObject.optBoolean("enableMultiClickTempUnhide", true);
            int iOptInt = jSONObject.optInt("multiClickCount", 3);
            int iOptInt2 = jSONObject.optInt("multiClickInterval", 500);
            boolean zOptBoolean22 = jSONObject.optBoolean("enableLongPressTempUnhide", true);
            int iOptInt3 = jSONObject.optInt("longPressDuration", 800);
            boolean zOptBoolean23 = jSONObject.optBoolean("blockScanLogin", true);
            boolean zOptBoolean24 = jSONObject.optBoolean("enableLongPressAddMask", true);
            boolean zOptBoolean25 = jSONObject.optBoolean("enableContactLongPressAddMask", true);
            String strOptString = jSONObject.optString("addMaskMenuText", "加入密友");
            C0631i9.m1481d(strOptString, "optString(...)");
            boolean zOptBoolean26 = jSONObject.optBoolean("blockVoipCall", true);
            boolean zOptBoolean27 = jSONObject.optBoolean("hideTextStatus", true);
            boolean zOptBoolean28 = jSONObject.optBoolean("boldBottomTabOnMaskedMsg", false);
            int iOptInt4 = jSONObject.optInt("boldBottomTabPercent", 50);
            boolean zOptBoolean29 = jSONObject.optBoolean("dotIndicatorEnabled", false);
            int iOptInt5 = jSONObject.optInt("dotIndicatorSizePercent", 100);
            boolean zOptBoolean30 = jSONObject.optBoolean("vibrateOnMaskedMessage", true);
            int iOptInt6 = jSONObject.optInt("vibrateIntensity", 60);
            boolean zOptBoolean31 = jSONObject.optBoolean("masterEnabled", true);
            boolean zOptBoolean32 = jSONObject.optBoolean("blockHotUpdate", true);
            boolean zOptBoolean33 = jSONObject.optBoolean("rehideOnLeaveChat", true);
            boolean zOptBoolean34 = jSONObject.optBoolean("rehideOnLeaveApp", true);
            String strOptString2 = jSONObject.optString("cmdOpenSettings", "#jz#");
            C0631i9.m1481d(strOptString2, "optString(...)");
            String strOptString3 = jSONObject.optString("cmdTempUnhide", "#mm#");
            C0631i9.m1481d(strOptString3, "optString(...)");
            boolean zOptBoolean35 = jSONObject.optBoolean("actionHintEnabled", false);
            String strOptString4 = jSONObject.optString("hintTempUnhide", "刻舟求剑");
            C0631i9.m1481d(strOptString4, "optString(...)");
            String strOptString5 = jSONObject.optString("hintAddMask", "刻舟求剑");
            C0631i9.m1481d(strOptString5, "optString(...)");
            String strOptString6 = jSONObject.optString("hintRemoveMask", "刻舟求剑");
            C0631i9.m1481d(strOptString6, "optString(...)");
            String strOptString7 = jSONObject.optString("hintAddSns", "刻舟求剑");
            C0631i9.m1481d(strOptString7, "optString(...)");
            C0653jc c0653jc = new C0653jc();
            c0653jc.f2431a = zOptBoolean;
            c0653jc.f2432b = zOptBoolean2;
            c0653jc.f2433c = zOptBoolean3;
            c0653jc.f2434d = zOptBoolean4;
            c0653jc.f2435e = zOptBoolean5;
            c0653jc.f2436f = zOptBoolean6;
            c0653jc.f2437g = zOptBoolean7;
            c0653jc.f2438h = zOptBoolean8;
            c0653jc.f2439i = zOptBoolean9;
            c0653jc.f2440j = zOptBoolean10;
            c0653jc.f2441k = zOptBoolean11;
            c0653jc.f2442l = zOptBoolean12;
            c0653jc.f2443m = zOptBoolean13;
            c0653jc.f2444n = zOptBoolean14;
            c0653jc.f2445o = zOptBoolean15;
            c0653jc.f2446p = zOptBoolean16;
            c0653jc.f2447q = zOptBoolean17;
            c0653jc.f2448r = zOptBoolean18;
            c0653jc.f2449s = zOptBoolean19;
            c0653jc.f2450t = zOptBoolean20;
            c0653jc.f2451u = zOptBoolean21;
            c0653jc.f2452v = iOptInt;
            c0653jc.f2453w = iOptInt2;
            c0653jc.f2454x = zOptBoolean22;
            c0653jc.f2455y = iOptInt3;
            c0653jc.f2456z = zOptBoolean23;
            c0653jc.f2409A = zOptBoolean24;
            c0653jc.f2410B = zOptBoolean25;
            c0653jc.f2411C = strOptString;
            c0653jc.f2412D = zOptBoolean26;
            c0653jc.f2413E = zOptBoolean27;
            c0653jc.f2414F = zOptBoolean28;
            c0653jc.f2415G = iOptInt4;
            c0653jc.f2416H = zOptBoolean29;
            c0653jc.f2417I = iOptInt5;
            c0653jc.f2418J = zOptBoolean30;
            c0653jc.f2419K = iOptInt6;
            c0653jc.f2420L = zOptBoolean31;
            c0653jc.f2421M = zOptBoolean32;
            c0653jc.f2422N = zOptBoolean33;
            c0653jc.f2423O = zOptBoolean34;
            c0653jc.f2424P = strOptString2;
            c0653jc.f2425Q = strOptString3;
            c0653jc.f2426R = zOptBoolean35;
            c0653jc.f2427S = strOptString4;
            c0653jc.f2428T = strOptString5;
            c0653jc.f2429U = strOptString6;
            c0653jc.f2430V = strOptString7;
            return c0653jc;
        }

        /* JADX INFO: renamed from: b */
        public static String m1518b(C0653jc c0653jc) throws JSONException {
            C0631i9.m1482e(c0653jc, "data");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("hideMainSearch", c0653jc.f2431a);
            jSONObject.put("hideMainSearchStrong", c0653jc.f2432b);
            jSONObject.put("viewWxDbPw", c0653jc.f2433c);
            jSONObject.put("hideStorageChatRecordEntry", c0653jc.f2434d);
            jSONObject.put("hideStorageCache", c0653jc.f2435e);
            jSONObject.put("hideSnsEntry", c0653jc.f2436f);
            jSONObject.put("hideDiscoverSnsEntry", c0653jc.f2437g);
            jSONObject.put("hideDiscoverEntries", c0653jc.f2438h);
            jSONObject.put("hideRecentForward", c0653jc.f2439i);
            jSONObject.put("hideOwnSns", c0653jc.f2440j);
            jSONObject.put("showOwnSnsHideDialog", c0653jc.f2441k);
            jSONObject.put("hideSnsInteraction", c0653jc.f2442l);
            jSONObject.put("hideSnsGroupIcon", c0653jc.f2443m);
            jSONObject.put("hideMainConvList", c0653jc.f2444n);
            jSONObject.put("hideContactList", c0653jc.f2445o);
            jSONObject.put("hideInLabel", c0653jc.f2446p);
            jSONObject.put("hideConversation", c0653jc.f2447q);
            jSONObject.put("hideMaskedMessageNotification", c0653jc.f2448r);
            jSONObject.put("blockEnterChat", c0653jc.f2449s);
            jSONObject.put("blockContactInfo", c0653jc.f2450t);
            jSONObject.put("enableMultiClickTempUnhide", c0653jc.f2451u);
            jSONObject.put("multiClickCount", c0653jc.f2452v);
            jSONObject.put("multiClickInterval", c0653jc.f2453w);
            jSONObject.put("enableLongPressTempUnhide", c0653jc.f2454x);
            jSONObject.put("longPressDuration", c0653jc.f2455y);
            jSONObject.put("blockScanLogin", c0653jc.f2456z);
            jSONObject.put("enableLongPressAddMask", c0653jc.f2409A);
            jSONObject.put("enableContactLongPressAddMask", c0653jc.f2410B);
            jSONObject.put("addMaskMenuText", c0653jc.f2411C);
            jSONObject.put("blockVoipCall", c0653jc.f2412D);
            jSONObject.put("hideTextStatus", c0653jc.f2413E);
            jSONObject.put("boldBottomTabOnMaskedMsg", c0653jc.f2414F);
            jSONObject.put("boldBottomTabPercent", c0653jc.f2415G);
            jSONObject.put("dotIndicatorEnabled", c0653jc.f2416H);
            jSONObject.put("dotIndicatorSizePercent", c0653jc.f2417I);
            jSONObject.put("vibrateOnMaskedMessage", c0653jc.f2418J);
            jSONObject.put("vibrateIntensity", c0653jc.f2419K);
            jSONObject.put("masterEnabled", c0653jc.f2420L);
            jSONObject.put("blockHotUpdate", c0653jc.f2421M);
            jSONObject.put("rehideOnLeaveChat", c0653jc.f2422N);
            jSONObject.put("rehideOnLeaveApp", c0653jc.f2423O);
            jSONObject.put("cmdOpenSettings", c0653jc.f2424P);
            jSONObject.put("cmdTempUnhide", c0653jc.f2425Q);
            jSONObject.put("actionHintEnabled", c0653jc.f2426R);
            jSONObject.put("hintTempUnhide", c0653jc.f2427S);
            jSONObject.put("hintAddMask", c0653jc.f2428T);
            jSONObject.put("hintRemoveMask", c0653jc.f2429U);
            jSONObject.put("hintAddSns", c0653jc.f2430V);
            String string = jSONObject.toString();
            C0631i9.m1481d(string, "toString(...)");
            return string;
        }
    }
}
