package p063e9;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONException;
import org.json.JSONObject;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p276sf.C3959f;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4175v;

/* JADX INFO: renamed from: e9.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0847r {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C0832c m2142a(boolean z9, boolean z10) {
        String str = z10 ? "__hchat_custom_notification_default_official__" : z9 ? "__hchat_custom_notification_default_group__" : "__hchat_custom_notification_default_private__";
        return new C0832c(str, str, z10 ? "默认公众号通知" : z9 ? "默认群聊通知" : "默认私聊通知", z9, z10, 8388544);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m2143b(C0832c c0832c, boolean z9, boolean z10) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("enabled", c0832c.f2515f);
        jSONObject.put("mode", c0832c.f2516g);
        jSONObject.put("vibrate", c0832c.f2517h);
        jSONObject.put("sound", c0832c.f2518i);
        jSONObject.put("markRead", c0832c.f2519j);
        jSONObject.put("quickReply", c0832c.f2520k);
        jSONObject.put("quoteQuickReply", c0832c.f2521l);
        jSONObject.put("mergeByTalker", c0832c.f2522m);
        jSONObject.put("showDetail", c0832c.f2523n);
        jSONObject.put("ignoreWechatDnd", c0832c.f2524o);
        jSONObject.put("muteEnable", c0832c.f2525p);
        jSONObject.put("muteStart", m2146e(c0832c.f2526q, "23:00:00"));
        jSONObject.put("muteEnd", m2146e(c0832c.f2527r, "07:00:00"));
        jSONObject.put("ringtone", c0832c.f2528s);
        boolean z11 = false;
        jSONObject.put("blockAtAll", z9 && !z10 && c0832c.f2529t);
        if (z9 && !z10 && c0832c.f2530u) {
            z11 = true;
        }
        jSONObject.put("blockAtMe", z11);
        String string = jSONObject.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m2144c(String str, String str2, String str3, String str4) {
        Set setM2149h = m2149h(str);
        if (!setM2149h.isEmpty()) {
            Locale locale = Locale.US;
            String strM5165l = AbstractC2091b.m5165l(locale, str2, locale);
            String lowerCase = str3.toLowerCase(locale);
            lowerCase.getClass();
            if (str4 == null) {
                str4 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String lowerCase2 = str4.toLowerCase(locale);
            lowerCase2.getClass();
            Set<String> set = setM2149h;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                for (String str5 : set) {
                    Locale locale2 = Locale.US;
                    String strM5165l2 = AbstractC2091b.m5165l(locale2, str5, locale2);
                    if ((!TextUtils.isEmpty(strM5165l) && (strM5165l.equals(strM5165l2) || AbstractC3149m.m6709h0(strM5165l, strM5165l2, false) || AbstractC3149m.m6709h0(strM5165l2, strM5165l, false))) || (!TextUtils.isEmpty(lowerCase) && (lowerCase.equals(strM5165l2) || AbstractC3149m.m6709h0(lowerCase, strM5165l2, false) || AbstractC3149m.m6709h0(strM5165l2, lowerCase, false))) || (!TextUtils.isEmpty(lowerCase2) && (AbstractC3156t.m6740d0(lowerCase2, strM5165l2.concat(":"), false) || AbstractC3156t.m6740d0(lowerCase2, strM5165l2.concat("："), false)))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m2145d(String str) {
        return AbstractC4166m.m8392A1(m2149h(str), ",", null, null, null, 62);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m2146e(String str, String str2) {
        int iM2148g = m2148g(str);
        return iM2148g < 0 ? str2 : String.format(Locale.US, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(iM2148g / 3600), Integer.valueOf((iM2148g / 60) % 60), Integer.valueOf(iM2148g % 60)}, 3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C0832c m2147f(String str, boolean z9, boolean z10, boolean z11) {
        Object c3959f;
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return C0832c.m2114a(m2142a(z9, z10), null, null, null, false, false, false, 0, false, false, false, false, false, false, false, z11, false, null, null, null, false, false, null, null, 8372223);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0832c c0832cM2142a = m2142a(z9, z10);
            boolean zOptBoolean = jSONObject.optBoolean("enabled", c0832cM2142a.f2515f);
            int iOptInt = jSONObject.optInt("mode", 1);
            boolean zOptBoolean2 = jSONObject.optBoolean("vibrate", true);
            boolean zOptBoolean3 = jSONObject.optBoolean("sound", true);
            boolean zOptBoolean4 = jSONObject.optBoolean("markRead", true);
            boolean zOptBoolean5 = jSONObject.optBoolean("quickReply", false);
            boolean zOptBoolean6 = jSONObject.optBoolean("quoteQuickReply", false);
            boolean zOptBoolean7 = jSONObject.optBoolean("mergeByTalker", false);
            boolean zOptBoolean8 = jSONObject.optBoolean("showDetail", true);
            boolean zOptBoolean9 = jSONObject.has("ignoreWechatDnd") ? jSONObject.optBoolean("ignoreWechatDnd", false) : z11;
            boolean zOptBoolean10 = jSONObject.optBoolean("muteEnable", false);
            String strM2146e = m2146e(jSONObject.optString("muteStart"), "23:00:00");
            String strM2146e2 = m2146e(jSONObject.optString("muteEnd"), "07:00:00");
            String strOptString = jSONObject.optString("ringtone");
            strOptString.getClass();
            c3959f = C0832c.m2114a(c0832cM2142a, null, null, null, false, false, zOptBoolean, iOptInt, zOptBoolean2, zOptBoolean3, zOptBoolean4, zOptBoolean5, zOptBoolean6, zOptBoolean7, zOptBoolean8, zOptBoolean9, zOptBoolean10, strM2146e, strM2146e2, strOptString, z9 ? jSONObject.optBoolean("blockAtAll", false) : false, z9 ? jSONObject.optBoolean("blockAtMe", false) : false, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 31);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object objM2114a = C0832c.m2114a(m2142a(z9, z10), null, null, null, false, false, false, 0, false, false, false, false, false, false, false, z11, false, null, null, null, false, false, null, null, 8372223);
        if (c3959f instanceof C3959f) {
            c3959f = objM2114a;
        }
        return (C0832c) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m2148g(String str) {
        List listM6692G0;
        int size;
        Integer numM6741e0;
        if (str == null || AbstractC3149m.m6721t0(str) || 2 > (size = (listM6692G0 = AbstractC3149m.m6692G0(AbstractC3149m.m6703R0(str).toString(), new String[]{":"})).size()) || size >= 4) {
            return -1;
        }
        int iIntValue = 0;
        Integer numM6742f0 = AbstractC3156t.m6742f0((String) listM6692G0.get(0));
        if (numM6742f0 == null) {
            return -1;
        }
        int iIntValue2 = numM6742f0.intValue();
        Integer numM6742f02 = AbstractC3156t.m6742f0((String) listM6692G0.get(1));
        if (numM6742f02 == null) {
            return -1;
        }
        int iIntValue3 = numM6742f02.intValue();
        String str2 = (String) AbstractC4166m.m8425w1(2, listM6692G0);
        if (str2 != null && (numM6741e0 = AbstractC3156t.m6741e0(10, str2)) != null) {
            iIntValue = numM6741e0.intValue();
        }
        if (iIntValue2 < 0 || iIntValue2 >= 24 || iIntValue3 < 0 || iIntValue3 >= 60 || iIntValue < 0 || iIntValue >= 60) {
            return -1;
        }
        return AbstractC3199a.m6834g(iIntValue3, 60, iIntValue2 * 3600, iIntValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static Set m2149h(String str) {
        if (str == null || AbstractC3149m.m6721t0(str)) {
            return C4175v.f13712g;
        }
        String strReplace = str.replace((char) 65292, ',');
        strReplace.getClass();
        String strReplace2 = strReplace.replace((char) 65307, ',');
        strReplace2.getClass();
        String strReplace3 = strReplace2.replace(';', ',');
        strReplace3.getClass();
        String strReplace4 = strReplace3.replace('\n', ',');
        strReplace4.getClass();
        List listM6691F0 = AbstractC3149m.m6691F0(strReplace4, new char[]{','}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC4166m.m8412U1(arrayList2);
    }
}
