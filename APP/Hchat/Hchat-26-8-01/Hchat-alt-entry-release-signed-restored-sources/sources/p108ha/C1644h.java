package p108ha;

import android.content.SharedPreferences;
import gg.AbstractC1416l;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.AbstractC3015m;
import ng.C3011i;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p011ab.C0042b;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p025bc.AbstractC0255e;
import p036c9.ThreadFactoryC0478q;
import p054dg.C0795n;
import p068eh.AbstractC0921a;
import p088g0.C1271o;
import p096g8.C1360a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p142jg.AbstractC2136d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p230p8.C3348c;
import p230p8.C3350d;
import p230p8.C3351d0;
import p230p8.C3363o;
import p230p8.C3367s;
import p230p8.C3370v;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: ha.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1644h {

    /* JADX INFO: renamed from: m */
    public static final Object f5394m = new Object();

    /* JADX INFO: renamed from: a */
    public final C0042b f5395a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f5396b;

    /* JADX INFO: renamed from: c */
    public final C3363o f5397c;

    /* JADX INFO: renamed from: d */
    public final ScheduledThreadPoolExecutor f5398d;

    /* JADX INFO: renamed from: e */
    public final Object f5399e;

    /* JADX INFO: renamed from: f */
    public final Object f5400f;

    /* JADX INFO: renamed from: g */
    public final Object f5401g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f5402h;

    /* JADX INFO: renamed from: i */
    public final ConcurrentHashMap f5403i;

    /* JADX INFO: renamed from: j */
    public volatile boolean f5404j;

    /* JADX INFO: renamed from: k */
    public volatile long f5405k;

    /* JADX INFO: renamed from: l */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC0216b f5406l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1644h(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5395a = c0042b;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_moments_auto_forward_config");
        this.f5396b = sharedPreferencesM8640c;
        this.f5397c = new C3363o(c3742g, c0042b);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0478q(11));
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        this.f5398d = scheduledThreadPoolExecutor;
        this.f5399e = new Object();
        this.f5400f = new Object();
        this.f5401g = new Object();
        this.f5402h = new LinkedHashSet();
        this.f5403i = new ConcurrentHashMap();
        this.f5404j = sharedPreferencesM8640c.getBoolean("enable", false);
        this.f5406l = new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m4178m(EnumC1660t enumC1660t, String str, C3348c c3348c) {
        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
        if (c3351d0SnsApi == null) {
            return false;
        }
        int iOrdinal = enumC1660t.ordinal();
        if (iOrdinal == 0) {
            return c3351d0SnsApi.m7087u(str, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if (iOrdinal == 1) {
            return c3351d0SnsApi.m7090x(str, c3348c.m7065b(), HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if (iOrdinal == 2) {
            return c3351d0SnsApi.m7091y(str, c3348c.f10771c, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4) {
                return false;
            }
            C3193a.m6822k();
            return false;
        }
        C3350d c3350d = (C3350d) AbstractC4166m.m8400I1(c3348c.f10770b);
        if (c3350d == null || !c3350d.m7066a()) {
            return false;
        }
        return c3351d0SnsApi.m7089w(new JSONObject().put("content", str).put("imagePath", c3350d.f10775a).put("videoPath", c3350d.f10776b).put("coverTimeMs", 0L));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m4179a() {
        synchronized (this.f5400f) {
            this.f5402h.clear();
        }
        if (this.f5396b.edit().putLong("enabled_at_seconds", System.currentTimeMillis() / 1000).putString("handled_ids", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI).commit()) {
            return;
        }
        this.f5395a.invoke("初始化朋友圈自动转发启用状态失败", null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:11:0x0020 */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m4180b(String str) {
        Object c3959f;
        WeChatContact weChatContactM3725n;
        String strDisplayName;
        try {
            WeChatApis.contact().getClass();
            C1368i c1368i = WeChatApis.contactApi;
            if (c1368i == null || (weChatContactM3725n = c1368i.m3725n(str)) == null || (strDisplayName = weChatContactM3725n.displayName()) == null) {
                c3959f = str;
            } else {
                boolean zM6721t0 = AbstractC3149m.m6721t0(strDisplayName);
                c3959f = strDisplayName;
                if (zM6721t0) {
                    c3959f = str;
                }
                if (c3959f == null) {
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f5395a.invoke("读取朋友圈发布者名称失败: " + str, thM8182b);
        }
        Object obj = str;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (String) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    /* JADX INFO: renamed from: c */
    public final void m4181c(C1642g c1642g) {
        AtomicBoolean atomicBoolean = c1642g.f5385e;
        long j3 = c1642g.f5384d;
        C1635c0 c1635c0 = c1642g.f5381a;
        ConcurrentHashMap concurrentHashMap = this.f5403i;
        boolean zM4184f = false;
        try {
            try {
                boolean zM4186h = m4186h(c1642g);
                C3370v c3370v = c1642g.f5382b;
                EnumC1660t enumC1660t = c1642g.f5383c;
                String str = c1635c0.f5350a;
                if (!zM4186h) {
                    concurrentHashMap.remove(str, c1642g);
                    return;
                }
                String strM4192o = m4192o(c1635c0, c3370v, enumC1660t);
                if (strM4192o != null) {
                    if (!strM4192o.equals("暂时无法确认当前账号")) {
                        m4182d(c1635c0, j3, strM4192o);
                        concurrentHashMap.remove(str, c1642g);
                        return;
                    } else {
                        if (m4184f(c1642g, strM4192o, null)) {
                            return;
                        }
                        concurrentHashMap.remove(str, c1642g);
                        return;
                    }
                }
                String strM4183e = m4183e(c1635c0, c3370v, enumC1660t);
                C3348c c3348cM7135q = this.f5397c.m7135q(c3370v, atomicBoolean);
                if (!m4186h(c1642g)) {
                    concurrentHashMap.remove(str, c1642g);
                    return;
                }
                if (m4178m(enumC1660t, strM4183e, c3348cM7135q)) {
                    m4191n();
                    m4188j(j3, str);
                    m4187i("已提交到微信发布队列 " + m4180b(c1635c0.f5352c) + " · " + enumC1660t.f5467g);
                } else {
                    zM4184f = m4184f(c1642g, "静默发布失败", null);
                }
                if (zM4184f) {
                    return;
                }
                concurrentHashMap.remove(str, c1642g);
            } finally {
                concurrentHashMap.remove(c1635c0.f5350a, c1642g);
            }
        } catch (InterruptedException e6) {
            if (!atomicBoolean.get() && m4185g(j3)) {
                zM4184f = m4184f(c1642g, "媒体准备被中断", e6);
            }
            if (zM4184f) {
            }
        } catch (Throwable th2) {
            if (m4184f(c1642g, "准备或发布朋友圈失败", th2)) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m4182d(C1635c0 c1635c0, long j3, String str) {
        if (m4188j(j3, c1635c0.f5350a)) {
            m4187i("跳过 " + m4180b(c1635c0.f5352c) + "：" + str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m4183e(C1635c0 c1635c0, C3370v c3370v, EnumC1660t enumC1660t) {
        String str = c1635c0.f5352c;
        String string = this.f5396b.getString("content_template", "%content%");
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return AbstractC3149m.m6703R0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(string, "%sender%", m4180b(str), false), "%wxid%", str, false), "%type%", enumC1660t.f5467g, false), "%content%", c3370v.f10880b, false), "%snsid%", c1635c0.f5350a, false)).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m4184f(C1642g c1642g, String str, Throwable th2) {
        Object c3959f;
        this.f5395a.invoke(str + ": snsId=" + c1642g.f5381a.f5350a + " attempt=" + (c1642g.f5386f + 1), th2);
        if (c1642g.f5386f == 0 && m4186h(c1642g)) {
            c1642g.f5386f = 1;
            try {
                c3959f = this.f5398d.schedule(new RunnableC1640f(this, c1642g, 0), 300L, TimeUnit.SECONDS);
            } catch (Throwable th3) {
                c3959f = new C3959f(th3);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                this.f5395a.invoke("调度朋友圈自动转发重试失败: snsId=".concat(c1642g.f5381a.f5350a), thM8182b);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            ScheduledFuture scheduledFuture = (ScheduledFuture) c3959f;
            if (scheduledFuture != null) {
                c1642g.f5387g = scheduledFuture;
                if (c1642g.f5385e.get() || this.f5403i.get(c1642g.f5381a.f5350a) != c1642g) {
                    scheduledFuture.cancel(true);
                    return false;
                }
                m4187i("转发失败 " + m4180b(c1642g.f5381a.f5352c) + "，300秒后重试一次");
                return true;
            }
        }
        m4188j(c1642g.f5384d, c1642g.f5381a.f5350a);
        m4187i("转发失败 " + m4180b(c1642g.f5381a.f5352c) + "，已停止重试");
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m4185g(long j3) {
        return this.f5404j && this.f5405k == j3 && this.f5396b.getBoolean("enable", false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m4186h(C1642g c1642g) {
        return this.f5403i.get(c1642g.f5381a.f5350a) == c1642g && !c1642g.f5385e.get() && m4185g(c1642g.f5384d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m4187i(String str) {
        if (this.f5396b.getBoolean("log_enable", false)) {
            String strM9264h = AbstractC4855en.m9264h(new SimpleDateFormat("MM-dd HH:mm:ss", Locale.CHINA).format(new Date()), "  ", str);
            synchronized (f5394m) {
                try {
                    List listM99x0 = AbstractC0000a.m99x0(strM9264h);
                    String string = this.f5396b.getString("logs", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string == null) {
                        string = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    this.f5396b.edit().putString("logs", AbstractC4166m.m8392A1(AbstractC4166m.m8403L1(200, AbstractC4166m.m8397F1(listM99x0, AbstractC3015m.m6418b0(new C3011i(new C0795n(string, 4), true, new C1271o(5))))), "\n", null, null, null, 62)).apply();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m4188j(long j3, String str) {
        boolean zM4189k;
        synchronized (this.f5399e) {
            zM4189k = !m4185g(j3) ? false : m4189k(str);
        }
        return zM4189k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m4189k(String str) {
        synchronized (this.f5400f) {
            if (!this.f5402h.add(str)) {
                return false;
            }
            List listM8407P1 = AbstractC4166m.m8407P1(this.f5402h);
            JSONArray jSONArray = new JSONArray();
            Iterator it = listM8407P1.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            if (this.f5396b.edit().putString("handled_ids", jSONArray.toString()).commit()) {
                return true;
            }
            this.f5395a.invoke("保存朋友圈自动转发去重记录失败", null);
            return true;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final long m4190l() {
        SharedPreferences sharedPreferences = this.f5396b;
        if (sharedPreferences.getInt("delay_mode", 0) == 0) {
            return sharedPreferences.getInt("fixed_delay_seconds", 0) >= 0 ? r0 : 0;
        }
        int i9 = sharedPreferences.getInt("random_min_seconds", 60);
        long j3 = i9 >= 0 ? i9 : 0;
        long j4 = sharedPreferences.getInt("random_max_seconds", 300);
        if (j4 < j3) {
            j4 = j3;
        }
        if (j3 == j4) {
            return j3;
        }
        return AbstractC2136d.f7122g.mo5362e(j3, j4 + 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m4191n() {
        int i9;
        synchronized (this.f5401g) {
            try {
                String str = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(new Date());
                str.getClass();
                int i10 = 0;
                if (AbstractC1416l.m3825a(this.f5396b.getString("daily_date", HttpUrl.FRAGMENT_ENCODE_SET), str) && (i9 = this.f5396b.getInt("daily_count", 0)) >= 0) {
                    i10 = i9;
                }
                if (!this.f5396b.edit().putString("daily_date", str).putInt("daily_count", i10 + 1).commit()) {
                    this.f5395a.invoke("保存朋友圈自动转发每日计数失败", null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final String m4192o(C1635c0 c1635c0, C3370v c3370v, EnumC1660t enumC1660t) {
        Object c3959f;
        boolean z9;
        boolean z10;
        Object next;
        int i9 = 0;
        if (!this.f5396b.getBoolean("enable", false)) {
            return "功能已关闭";
        }
        try {
            c3959f = Boolean.valueOf(AbstractC1416l.m3825a(KavaReflector.invokeMethod(c1635c0.f5356g, "isAd", new Object[0]), Boolean.TRUE));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f5395a.invoke("判断朋友圈广告状态失败", thM8182b);
        }
        Boolean bool = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
            c3959f = bool;
        }
        if (((Boolean) c3959f).booleanValue()) {
            return "广告内容";
        }
        String strM4194q = m4194q(c1635c0);
        if (strM4194q != null) {
            return strM4194q;
        }
        long j3 = this.f5396b.getLong("enabled_at_seconds", 0L);
        long j4 = c1635c0.f5353d;
        if (j4 <= 0) {
            return "无法确认发布时间";
        }
        if (j3 <= 0 || j4 < j3) {
            return "早于本次开启时间";
        }
        if (enumC1660t == EnumC1660t.UNKNOWN) {
            return "未知或卡片类型";
        }
        int iOrdinal = enumC1660t.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        if (iOrdinal == 4) {
                            return "未知或卡片类型";
                        }
                        C3193a.m6822k();
                        return null;
                    }
                    if (c3370v.f10882d.size() != 1 || ((C3367s) AbstractC4166m.m8399H1(c3370v.f10882d)).f10870f == null) {
                        return "多张或混合实况不支持自动转发";
                    }
                    if (!this.f5396b.getBoolean("allow_live_photo", true)) {
                        return "已过滤实况类型";
                    }
                } else {
                    if (c3370v.f10882d.isEmpty()) {
                        return "未找到朋友圈视频";
                    }
                    if (!this.f5396b.getBoolean("allow_video", true)) {
                        return "已过滤视频类型";
                    }
                }
            } else {
                if (c3370v.f10882d.isEmpty()) {
                    return "未找到朋友圈图片";
                }
                if (!this.f5396b.getBoolean("allow_image", true)) {
                    return "已过滤图片类型";
                }
            }
        } else {
            if (!c3370v.f10882d.isEmpty()) {
                return "文字类型包含未知媒体";
            }
            if (!this.f5396b.getBoolean("allow_text", true)) {
                return "已过滤文字类型";
            }
            if (AbstractC3149m.m6721t0(m4183e(c1635c0, c3370v, enumC1660t))) {
                return "转发文字为空";
            }
        }
        int i10 = this.f5396b.getInt("daily_limit", 20);
        if (i10 < 0) {
            i10 = 0;
        }
        String str = c3370v.f10880b;
        Locale locale = Locale.ROOT;
        String strM5165l = AbstractC2091b.m5165l(locale, str, locale);
        SharedPreferences sharedPreferences = this.f5396b;
        sharedPreferences.getClass();
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (sharedPreferences.contains("include_keywords_enable")) {
            z9 = sharedPreferences.getBoolean("include_keywords_enable", false);
        } else {
            String string = sharedPreferences.getString("include_keywords", HttpUrl.FRAGMENT_ENCODE_SET);
            if (string != null) {
                str2 = string;
            }
            z9 = !AbstractC3149m.m6721t0(str2);
        }
        if (z9) {
            Set setM7877T = AbstractC3754e0.m7877T(this.f5396b.getString("include_keywords", HttpUrl.FRAGMENT_ENCODE_SET));
            if (!setM7877T.isEmpty()) {
                Set set = setM7877T;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return "未命中包含关键词";
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (AbstractC3149m.m6709h0(strM5165l, (CharSequence) it.next(), false)) {
                    }
                }
                return "未命中包含关键词";
            }
        }
        SharedPreferences sharedPreferences2 = this.f5396b;
        sharedPreferences2.getClass();
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (sharedPreferences2.contains("exclude_keywords_enable")) {
            z10 = sharedPreferences2.getBoolean("exclude_keywords_enable", false);
        } else {
            String string2 = sharedPreferences2.getString("exclude_keywords", HttpUrl.FRAGMENT_ENCODE_SET);
            if (string2 != null) {
                str3 = string2;
            }
            z10 = !AbstractC3149m.m6721t0(str3);
        }
        if (z10 && !AbstractC3149m.m6721t0(strM5165l)) {
            Iterator it2 = AbstractC3754e0.m7877T(this.f5396b.getString("exclude_keywords", HttpUrl.FRAGMENT_ENCODE_SET)).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (AbstractC3149m.m6709h0(strM5165l, (CharSequence) next, false)) {
                    break;
                }
            }
            String str4 = (String) next;
            if (str4 != null) {
                return AbstractC0921a.m2251n("命中排除关键词“", str4, "”");
            }
        }
        if (i10 > 0) {
            synchronized (this.f5401g) {
                String str5 = new SimpleDateFormat("yyyy-MM-dd", Locale.ROOT).format(new Date());
                str5.getClass();
                boolean zM3825a = AbstractC1416l.m3825a(this.f5396b.getString("daily_date", HttpUrl.FRAGMENT_ENCODE_SET), str5);
                SharedPreferences sharedPreferences3 = this.f5396b;
                if (zM3825a) {
                    int i11 = sharedPreferences3.getInt("daily_count", 0);
                    if (i11 >= 0) {
                        i9 = i11;
                    }
                } else if (!sharedPreferences3.edit().putString("daily_date", str5).putInt("daily_count", 0).commit()) {
                    this.f5395a.invoke("重置朋友圈自动转发每日计数失败", null);
                }
            }
            if (i9 >= i10) {
                return "已达到今日转发上限";
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m4193p(C1635c0 c1635c0, C3370v c3370v, EnumC1660t enumC1660t, long j3, long j4) {
        boolean zContains;
        Object c3959f;
        C1642g c1642g = new C1642g(c1635c0, c3370v, enumC1660t, j3);
        synchronized (this.f5399e) {
            try {
                if (m4185g(j3)) {
                    String str = c1635c0.f5350a;
                    synchronized (this.f5400f) {
                        zContains = this.f5402h.contains(str);
                    }
                    if (!zContains) {
                        if (this.f5403i.putIfAbsent(c1635c0.f5350a, c1642g) != null) {
                            return;
                        }
                        try {
                            c3959f = this.f5398d.schedule(new RunnableC1640f(this, c1642g, 1), j4, TimeUnit.SECONDS);
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        Throwable thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            this.f5403i.remove(c1635c0.f5350a, c1642g);
                            this.f5395a.invoke("调度朋友圈自动转发失败: snsId=".concat(c1635c0.f5350a), thM8182b);
                        }
                        if (c3959f instanceof C3959f) {
                            c3959f = null;
                        }
                        ScheduledFuture scheduledFuture = (ScheduledFuture) c3959f;
                        if (scheduledFuture != null) {
                            c1642g.f5387g = scheduledFuture;
                            if (c1642g.f5385e.get() || this.f5403i.get(c1635c0.f5350a) != c1642g) {
                                scheduledFuture.cancel(true);
                            }
                            StringBuilder sbM1027p = AbstractC0255e.m1027p("已捕捉 ", m4180b(c1635c0.f5352c), " 的", enumC1660t.f5467g, "朋友圈，");
                            sbM1027p.append(j4);
                            sbM1027p.append("秒后转发");
                            m4187i(sbM1027p.toString());
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final String m4194q(C1635c0 c1635c0) {
        Object c3959f;
        String str = c1635c0.f5352c;
        SharedPreferences sharedPreferences = this.f5396b;
        Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
        Set setM7876S = AbstractC3754e0.m7876S(sharedPreferences.getString("targets", HttpUrl.FRAGMENT_ENCODE_SET));
        if (setM7876S.isEmpty()) {
            return "未指定好友";
        }
        if (!setM7876S.contains(str)) {
            return "不在指定好友中";
        }
        try {
            C1360a c1360aAccount = WeChatApis.account();
            String strM3652c = c1360aAccount != null ? c1360aAccount.m3652c() : null;
            if (strM3652c == null) {
                strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            c3959f = AbstractC3149m.m6703R0(strM3652c).toString();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f5395a.invoke("读取当前微信账号失败", thM8182b);
        }
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        String str2 = (String) obj;
        if (AbstractC3149m.m6721t0(str2)) {
            return "暂时无法确认当前账号";
        }
        if (AbstractC1416l.m3825a(str, str2)) {
            return "自己的朋友圈";
        }
        return null;
    }
}
