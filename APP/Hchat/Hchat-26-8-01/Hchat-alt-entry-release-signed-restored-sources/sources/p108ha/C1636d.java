package p108ha;

import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p011ab.C0042b;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p036c9.ThreadFactoryC0478q;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p088g0.C1271o;
import p096g8.C1360a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: ha.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1636d {

    /* JADX INFO: renamed from: k */
    public static final Object f5357k = new Object();

    /* JADX INFO: renamed from: a */
    public final C0042b f5358a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f5359b;

    /* JADX INFO: renamed from: c */
    public final ScheduledThreadPoolExecutor f5360c;

    /* JADX INFO: renamed from: d */
    public final Object f5361d;

    /* JADX INFO: renamed from: e */
    public final Object f5362e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f5363f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f5364g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f5365h;

    /* JADX INFO: renamed from: i */
    public boolean f5366i;

    /* JADX INFO: renamed from: j */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC0216b f5367j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1636d(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5358a = c0042b;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_moments_auto_comment_config");
        this.f5359b = sharedPreferencesM8640c;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0478q(10));
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        this.f5360c = scheduledThreadPoolExecutor;
        this.f5361d = new Object();
        this.f5362e = new Object();
        this.f5363f = new LinkedHashMap();
        this.f5364g = new LinkedHashSet();
        this.f5365h = new ConcurrentHashMap();
        this.f5366i = sharedPreferencesM8640c.getBoolean("comment_enable", false);
        this.f5367j = new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m4160b(String str) {
        WeChatContact weChatContactM3725n;
        String strDisplayName;
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (c1368iM9259c != null && (weChatContactM3725n = c1368iM9259c.m3725n(str)) != null && (strDisplayName = weChatContactM3725n.displayName()) != null) {
            if (AbstractC3149m.m6721t0(strDisplayName)) {
                strDisplayName = str;
            }
            if (strDisplayName != null) {
                return strDisplayName;
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m4161a() {
        SharedPreferences sharedPreferences = this.f5359b;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferences.getString("comment_content", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str = string;
        }
        return AbstractC3149m.m6703R0(str).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4162c(String str) {
        if (this.f5359b.getBoolean("comment_log_enable", false)) {
            String strM9264h = AbstractC4855en.m9264h(new SimpleDateFormat("MM-dd HH:mm:ss", Locale.CHINA).format(new Date()), "  ", str);
            synchronized (f5357k) {
                try {
                    List listM99x0 = AbstractC0000a.m99x0(strM9264h);
                    String string = this.f5359b.getString("comment_logs", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    this.f5359b.edit().putString("comment_logs", AbstractC4166m.m8392A1(AbstractC4166m.m8403L1(200, AbstractC4166m.m8397F1(listM99x0, AbstractC3015m.m6418b0(new C3011i(new C0795n(string, 4), true, new C1271o(4))))), "\n", null, null, null, 62)).apply();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4163d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = this.f5363f;
        Set setEntrySet = linkedHashMap.entrySet();
        setEntrySet.getClass();
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getClass();
            if (((C1632b) entry.getValue()).f5337a <= jCurrentTimeMillis) {
                it.remove();
            }
        }
        while (linkedHashMap.size() > 4096) {
            Set setEntrySet2 = linkedHashMap.entrySet();
            setEntrySet2.getClass();
            linkedHashMap.remove(((Map.Entry) AbstractC4166m.m8421s1(setEntrySet2)).getKey());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m4164e(String str) {
        Object c3959f;
        JSONObject jSONObject;
        synchronized (this.f5362e) {
            try {
                String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(new Date());
                str2.getClass();
                if (AbstractC1416l.m3825a(this.f5359b.getString("daily_comment_date", HttpUrl.FRAGMENT_ENCODE_SET), str2)) {
                    try {
                        String string = this.f5359b.getString("daily_comment_counts", "{}");
                        if (string == null) {
                            string = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        c3959f = new JSONObject(string);
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (C3960g.m8182b(c3959f) != null) {
                        c3959f = new JSONObject();
                    }
                    jSONObject = (JSONObject) c3959f;
                } else {
                    jSONObject = new JSONObject();
                }
                int i9 = 0;
                int iOptInt = jSONObject.optInt(str, 0);
                if (iOptInt >= 0) {
                    i9 = iOptInt;
                }
                jSONObject.put(str, i9 + 1);
                this.f5359b.edit().putString("daily_comment_date", str2).putString("daily_comment_counts", jSONObject.toString()).commit();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m4165f(C1635c0 c1635c0) {
        boolean z9;
        boolean z10;
        String string;
        Object next;
        Object c3959f;
        int iOptInt;
        if (!this.f5359b.getBoolean("comment_enable", false)) {
            return "功能已关闭";
        }
        if (m4161a().length() == 0) {
            return "评论内容为空";
        }
        C1360a c1360aAccount = WeChatApis.account();
        String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
        if (strM3652c == null) {
            strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean z11 = !AbstractC3149m.m6721t0(strM3652c) && strM3652c.equals(c1635c0.f5352c);
        if (z11 && !this.f5359b.getBoolean("comment_self", false)) {
            return "未开启评论自己的朋友圈";
        }
        int i9 = this.f5359b.getInt("comment_list_mode", 0);
        SharedPreferences sharedPreferences = this.f5359b;
        Set setM7876S = i9 == 1 ? AbstractC3754e0.m7876S(sharedPreferences.getString("comment_blacklist", HttpUrl.FRAGMENT_ENCODE_SET)) : AbstractC3754e0.m7876S(sharedPreferences.getString("comment_whitelist", HttpUrl.FRAGMENT_ENCODE_SET));
        if (!z11 && i9 == 0 && !setM7876S.contains(c1635c0.f5352c)) {
            return "不在白名单";
        }
        if (!z11 && i9 == 1 && setM7876S.contains(c1635c0.f5352c)) {
            return "命中黑名单";
        }
        int i10 = this.f5359b.getInt("daily_comment_limit", 0);
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 0) {
            String str = c1635c0.f5352c;
            synchronized (this.f5362e) {
                String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(new Date());
                str2.getClass();
                if (AbstractC1416l.m3825a(this.f5359b.getString("daily_comment_date", HttpUrl.FRAGMENT_ENCODE_SET), str2)) {
                    try {
                        String string2 = this.f5359b.getString("daily_comment_counts", "{}");
                        if (string2 == null) {
                            string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        c3959f = new JSONObject(string2);
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (C3960g.m8182b(c3959f) != null) {
                        c3959f = new JSONObject();
                    }
                    iOptInt = ((JSONObject) c3959f).optInt(str, 0);
                    if (iOptInt < 0) {
                    }
                } else {
                    this.f5359b.edit().putString("daily_comment_date", str2).putString("daily_comment_counts", "{}").commit();
                }
                iOptInt = 0;
            }
            if (iOptInt >= i10) {
                return "已达到同一人当天评论上限";
            }
        }
        if (this.f5359b.getBoolean("comment_time_window_enable", false)) {
            String string3 = this.f5359b.getString("comment_start_time", "08:00:00");
            if (string3 == null) {
                string3 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string4 = this.f5359b.getString("comment_end_time", "23:30:00");
            if (string4 == null) {
                string4 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3754e0.m7865H(string3, string4)) {
                return "当前不在运行时段";
            }
        }
        int i11 = this.f5359b.getInt("comment_max_age_hours", 24);
        if (i11 < 1) {
            i11 = 1;
        }
        if (c1635c0.f5353d <= 0) {
            return "无法确认发布时间";
        }
        long j3 = this.f5359b.getLong("comment_enabled_at_seconds", 0L);
        if (j3 <= 0 || c1635c0.f5353d < j3) {
            return "早于本次开启时间";
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - c1635c0.f5353d;
        if (0 > jCurrentTimeMillis || jCurrentTimeMillis > ((long) i11) * 3600) {
            return AbstractC0921a.m2250m(i11, "超过", "小时");
        }
        int iOrdinal = c1635c0.f5354e.ordinal();
        if (iOrdinal == 0) {
            z9 = this.f5359b.getBoolean("comment_allow_text", true);
        } else if (iOrdinal == 1) {
            z9 = this.f5359b.getBoolean("comment_allow_image", true);
        } else if (iOrdinal == 2) {
            z9 = this.f5359b.getBoolean("comment_allow_video", true);
        } else {
            if (iOrdinal != 3) {
                C3193a.m6822k();
                return null;
            }
            z9 = false;
        }
        EnumC1637d0 enumC1637d0 = c1635c0.f5354e;
        if (!z9) {
            return AbstractC0921a.m2251n("已过滤", enumC1637d0.f5374g, "类型");
        }
        int iOrdinal2 = enumC1637d0.ordinal();
        if (iOrdinal2 == 0) {
            z10 = this.f5359b.getBoolean("comment_keyword_text", true);
        } else if (iOrdinal2 == 1) {
            z10 = this.f5359b.getBoolean("comment_keyword_image", true);
        } else if (iOrdinal2 == 2) {
            z10 = this.f5359b.getBoolean("comment_keyword_video", true);
        } else {
            if (iOrdinal2 != 3) {
                C3193a.m6822k();
                return null;
            }
            z10 = false;
        }
        int iOrdinal3 = c1635c0.f5354e.ordinal();
        if (iOrdinal3 == 0) {
            string = this.f5359b.getString("comment_exclude_keywords_text", HttpUrl.FRAGMENT_ENCODE_SET);
        } else if (iOrdinal3 == 1) {
            string = this.f5359b.getString("comment_exclude_keywords_image_text", HttpUrl.FRAGMENT_ENCODE_SET);
        } else if (iOrdinal3 == 2) {
            string = this.f5359b.getString("comment_exclude_keywords_video_text", HttpUrl.FRAGMENT_ENCODE_SET);
        } else {
            if (iOrdinal3 != 3) {
                C3193a.m6822k();
                return null;
            }
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (z10 && !AbstractC3149m.m6721t0(c1635c0.f5355f)) {
            String str3 = c1635c0.f5355f;
            Locale locale = Locale.ROOT;
            String strM5165l = AbstractC2091b.m5165l(locale, str3, locale);
            Iterator it = AbstractC3754e0.m7877T(string).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC3149m.m6709h0(strM5165l, (CharSequence) next, false)) {
                    break;
                }
            }
            String str4 = (String) next;
            if (str4 != null) {
                return AbstractC0921a.m2251n("命中排除关键词“", str4, "”");
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4166g(long j3, String str) {
        synchronized (this.f5361d) {
            this.f5363f.remove(str);
            this.f5363f.put(str, new C1632b(j3));
            m4163d();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final String m4167h() {
        Object c3959f;
        String strM4161a = m4161a();
        String string = this.f5359b.getString("comment_time_format", "yyyy-MM-dd HH:mm:ss");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (strM4161a == null) {
            strM4161a = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string2 = AbstractC3149m.m6703R0(strM4161a).toString();
        if (!AbstractC3149m.m6709h0(string2, "${time}", false)) {
            return string2;
        }
        Date date = new Date(jCurrentTimeMillis);
        try {
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string3 = AbstractC3149m.m6703R0(string).toString();
            if (AbstractC3149m.m6721t0(string3)) {
                string3 = "yyyy-MM-dd HH:mm:ss";
            }
            c3959f = new SimpleDateFormat(string3, Locale.getDefault()).format(date);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(date);
        }
        String str = (String) c3959f;
        str.getClass();
        return AbstractC3156t.m6737a0(string2, "${time}", str, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4168i() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f5361d) {
            Iterator it = this.f5364g.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        this.f5359b.edit().putString("comment_success_records", jSONArray.toString()).commit();
    }
}
