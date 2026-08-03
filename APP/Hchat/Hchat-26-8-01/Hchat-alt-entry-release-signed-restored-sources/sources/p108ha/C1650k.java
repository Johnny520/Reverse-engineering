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
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: ha.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1650k {

    /* JADX INFO: renamed from: k */
    public static final Object f5427k = new Object();

    /* JADX INFO: renamed from: a */
    public final C0042b f5428a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f5429b;

    /* JADX INFO: renamed from: c */
    public final ScheduledThreadPoolExecutor f5430c;

    /* JADX INFO: renamed from: d */
    public final Object f5431d;

    /* JADX INFO: renamed from: e */
    public final Object f5432e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f5433f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashSet f5434g;

    /* JADX INFO: renamed from: h */
    public final ConcurrentHashMap f5435h;

    /* JADX INFO: renamed from: i */
    public boolean f5436i;

    /* JADX INFO: renamed from: j */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC0216b f5437j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1650k(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5428a = c0042b;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_moments_auto_like_config");
        this.f5429b = sharedPreferencesM8640c;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0478q(12));
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        this.f5430c = scheduledThreadPoolExecutor;
        this.f5431d = new Object();
        this.f5432e = new Object();
        this.f5433f = new LinkedHashMap();
        this.f5434g = new LinkedHashSet();
        this.f5435h = new ConcurrentHashMap();
        this.f5436i = sharedPreferencesM8640c.getBoolean("enable", false);
        this.f5437j = new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m4220a(String str) {
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
    /* JADX INFO: renamed from: b */
    public final void m4221b(String str) {
        if (this.f5429b.getBoolean("log_enable", false)) {
            String strM9264h = AbstractC4855en.m9264h(new SimpleDateFormat("MM-dd HH:mm:ss", Locale.CHINA).format(new Date()), "  ", str);
            synchronized (f5427k) {
                try {
                    List listM99x0 = AbstractC0000a.m99x0(strM9264h);
                    String string = this.f5429b.getString("logs", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    this.f5429b.edit().putString("logs", AbstractC4166m.m8392A1(AbstractC4166m.m8403L1(200, AbstractC4166m.m8397F1(listM99x0, AbstractC3015m.m6418b0(new C3011i(new C0795n(string, 4), true, new C1271o(6))))), "\n", null, null, null, 62)).apply();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m4222c() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = this.f5433f;
        Set setEntrySet = linkedHashMap.entrySet();
        setEntrySet.getClass();
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getClass();
            if (((C1648j) entry.getValue()).f5410a <= jCurrentTimeMillis) {
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
    /* JADX INFO: renamed from: d */
    public final void m4223d(String str) {
        Object c3959f;
        JSONObject jSONObject;
        synchronized (this.f5432e) {
            try {
                String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(new Date());
                str2.getClass();
                if (AbstractC1416l.m3825a(this.f5429b.getString("daily_like_date", HttpUrl.FRAGMENT_ENCODE_SET), str2)) {
                    try {
                        String string = this.f5429b.getString("daily_like_counts", "{}");
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
                this.f5429b.edit().putString("daily_like_date", str2).putString("daily_like_counts", jSONObject.toString()).commit();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m4224e(C1635c0 c1635c0) {
        boolean z9;
        boolean z10;
        String string;
        Object next;
        Object c3959f;
        int iOptInt;
        if (!this.f5429b.getBoolean("enable", false)) {
            return "功能已关闭";
        }
        C1360a c1360aAccount = WeChatApis.account();
        String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
        if (strM3652c == null) {
            strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        boolean z11 = !AbstractC3149m.m6721t0(strM3652c) && strM3652c.equals(c1635c0.f5352c);
        if (z11 && !this.f5429b.getBoolean("like_self", false)) {
            return "未开启点赞自己的朋友圈";
        }
        int i9 = this.f5429b.getInt("list_mode", 0);
        SharedPreferences sharedPreferences = this.f5429b;
        Set setM7876S = i9 == 1 ? AbstractC3754e0.m7876S(sharedPreferences.getString("blacklist", HttpUrl.FRAGMENT_ENCODE_SET)) : AbstractC3754e0.m7876S(sharedPreferences.getString("whitelist", HttpUrl.FRAGMENT_ENCODE_SET));
        if (!z11 && i9 == 0 && !setM7876S.contains(c1635c0.f5352c)) {
            return "不在白名单";
        }
        if (!z11 && i9 == 1 && setM7876S.contains(c1635c0.f5352c)) {
            return "命中黑名单";
        }
        int i10 = this.f5429b.getInt("daily_like_limit", 0);
        if (i10 < 0) {
            i10 = 0;
        }
        if (i10 > 0) {
            String str = c1635c0.f5352c;
            synchronized (this.f5432e) {
                String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(new Date());
                str2.getClass();
                if (AbstractC1416l.m3825a(this.f5429b.getString("daily_like_date", HttpUrl.FRAGMENT_ENCODE_SET), str2)) {
                    try {
                        String string2 = this.f5429b.getString("daily_like_counts", "{}");
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
                    this.f5429b.edit().putString("daily_like_date", str2).putString("daily_like_counts", "{}").commit();
                }
                iOptInt = 0;
            }
            if (iOptInt >= i10) {
                return "已达到同一人当天点赞上限";
            }
        }
        if (this.f5429b.getBoolean("time_window_enable", false)) {
            String string3 = this.f5429b.getString("start_time", "08:00:00");
            if (string3 == null) {
                string3 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String string4 = this.f5429b.getString("end_time", "23:30:00");
            if (string4 == null) {
                string4 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (!AbstractC3754e0.m7865H(string3, string4)) {
                return "当前不在运行时段";
            }
        }
        int i11 = this.f5429b.getInt("max_age_hours", 24);
        if (i11 < 1) {
            i11 = 1;
        }
        if (c1635c0.f5353d <= 0) {
            return "无法确认发布时间";
        }
        long j3 = this.f5429b.getLong("enabled_at_seconds", 0L);
        if (j3 <= 0 || c1635c0.f5353d < j3) {
            return "早于本次开启时间";
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - c1635c0.f5353d;
        if (0 > jCurrentTimeMillis || jCurrentTimeMillis > ((long) i11) * 3600) {
            return AbstractC0921a.m2250m(i11, "超过", "小时");
        }
        int iOrdinal = c1635c0.f5354e.ordinal();
        if (iOrdinal == 0) {
            z9 = this.f5429b.getBoolean("allow_text", true);
        } else if (iOrdinal == 1) {
            z9 = this.f5429b.getBoolean("allow_image", true);
        } else if (iOrdinal == 2) {
            z9 = this.f5429b.getBoolean("allow_video", true);
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
            z10 = this.f5429b.getBoolean("keyword_text", true);
        } else if (iOrdinal2 == 1) {
            z10 = this.f5429b.getBoolean("keyword_image", true);
        } else if (iOrdinal2 == 2) {
            z10 = this.f5429b.getBoolean("keyword_video", true);
        } else {
            if (iOrdinal2 != 3) {
                C3193a.m6822k();
                return null;
            }
            z10 = false;
        }
        int iOrdinal3 = c1635c0.f5354e.ordinal();
        if (iOrdinal3 == 0) {
            string = this.f5429b.getString("exclude_keywords_text", HttpUrl.FRAGMENT_ENCODE_SET);
        } else if (iOrdinal3 == 1) {
            string = this.f5429b.getString("exclude_keywords_image_text", HttpUrl.FRAGMENT_ENCODE_SET);
        } else if (iOrdinal3 == 2) {
            string = this.f5429b.getString("exclude_keywords_video_text", HttpUrl.FRAGMENT_ENCODE_SET);
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
    /* JADX INFO: renamed from: f */
    public final void m4225f(long j3, String str) {
        synchronized (this.f5431d) {
            this.f5433f.remove(str);
            this.f5433f.put(str, new C1648j(j3));
            m4222c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m4226g() {
        JSONArray jSONArray = new JSONArray();
        synchronized (this.f5431d) {
            Iterator it = this.f5434g.iterator();
            while (it.hasNext()) {
                jSONArray.put((String) it.next());
            }
        }
        this.f5429b.edit().putString("success_records", jSONArray.toString()).commit();
    }
}
