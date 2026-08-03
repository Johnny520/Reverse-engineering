package p261rb;

import af.C0081d;
import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.PowerManager;
import ca.RunnableC0531r;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p002a1.RunnableC0003a;
import p036c9.ThreadFactoryC0478q;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p126ia.C2026t;
import p142jg.AbstractC2136d;
import p198nb.C2924a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p304uf.C4329c;
import tf.AbstractC4166m;
import tf.AbstractC4171r;
import tf.C4173t;

/* JADX INFO: renamed from: rb.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3795k {

    /* JADX INFO: renamed from: a */
    public final C2026t f12441a;

    /* JADX INFO: renamed from: b */
    public final Context f12442b;

    /* JADX INFO: renamed from: c */
    public final C3796l f12443c;

    /* JADX INFO: renamed from: d */
    public final Object f12444d;

    /* JADX INFO: renamed from: e */
    public final ScheduledThreadPoolExecutor f12445e;

    /* JADX INFO: renamed from: f */
    public final ScheduledThreadPoolExecutor f12446f;

    /* JADX INFO: renamed from: g */
    public final ArrayDeque f12447g;

    /* JADX INFO: renamed from: h */
    public final ArrayList f12448h;

    /* JADX INFO: renamed from: i */
    public final ArrayDeque f12449i;

    /* JADX INFO: renamed from: j */
    public final ConcurrentHashMap f12450j;

    /* JADX INFO: renamed from: k */
    public volatile C3787c f12451k;

    /* JADX INFO: renamed from: l */
    public volatile boolean f12452l;

    /* JADX INFO: renamed from: m */
    public boolean f12453m;

    /* JADX INFO: renamed from: n */
    public String f12454n;

    /* JADX INFO: renamed from: o */
    public String f12455o;

    /* JADX INFO: renamed from: p */
    public int f12456p;

    /* JADX INFO: renamed from: q */
    public C3792h f12457q;

    /* JADX INFO: renamed from: r */
    public long f12458r;

    /* JADX INFO: renamed from: s */
    public boolean f12459s;

    /* JADX INFO: renamed from: t */
    public int f12460t;

    /* JADX INFO: renamed from: u */
    public int f12461u;

    /* JADX INFO: renamed from: v */
    public int f12462v;

    /* JADX INFO: renamed from: w */
    public int f12463w;

    /* JADX INFO: renamed from: x */
    public PowerManager.WakeLock f12464x;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3795k(Context context, C2026t c2026t) {
        Object c3959f;
        Object c3959f2;
        this.f12441a = c2026t;
        this.f12442b = context.getApplicationContext();
        C3796l c3796l = new C3796l(context);
        this.f12443c = c3796l;
        this.f12444d = new Object();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0478q(24));
        scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
        this.f12445e = scheduledThreadPoolExecutor;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new ThreadFactoryC0478q(25));
        scheduledThreadPoolExecutor2.setRemoveOnCancelPolicy(true);
        this.f12446f = scheduledThreadPoolExecutor2;
        this.f12447g = new ArrayDeque();
        this.f12448h = new ArrayList();
        this.f12449i = new ArrayDeque();
        this.f12450j = new ConcurrentHashMap();
        this.f12454n = "等待检测";
        this.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
        int i9 = c3796l.f12465a.getInt("zombie_check_total_count", 0);
        this.f12456p = i9 < 0 ? 0 : i9;
        Iterator it = c3796l.m7988b("zombie_check_pending_ids").iterator();
        while (it.hasNext()) {
            this.f12447g.addLast(new C3794j((String) it.next(), 0));
        }
        ArrayList arrayList = this.f12448h;
        String string = this.f12443c.f12465a.getString("zombie_check_results", HttpUrl.FRAGMENT_ENCODE_SET);
        C4173t c4173t = C4173t.f13710g;
        List list = c4173t;
        if (string != null) {
            list = c4173t;
            if (!AbstractC3149m.m6721t0(string)) {
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    C4329c c4329cM7E = AbstractC0000a.m7E();
                    int length = jSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("wxid");
                            strOptString.getClass();
                            String string2 = AbstractC3149m.m6703R0(strOptString).toString();
                            if (string2.length() != 0) {
                                try {
                                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                                    strOptString2.getClass();
                                    c3959f2 = EnumC3789e.valueOf(strOptString2);
                                } catch (Throwable th2) {
                                    c3959f2 = new C3959f(th2);
                                }
                                EnumC3789e enumC3789e = (EnumC3789e) (c3959f2 instanceof C3959f ? EnumC3789e.f12424i : c3959f2);
                                String strOptString3 = jSONObjectOptJSONObject.optString("name");
                                strOptString3 = AbstractC3149m.m6721t0(strOptString3) ? string2 : strOptString3;
                                String strOptString4 = jSONObjectOptJSONObject.optString("message");
                                strOptString4.getClass();
                                c4329cM7E.add(new C3788d(string2, strOptString3, enumC3789e, strOptString4));
                            }
                        }
                    }
                    c3959f = AbstractC0000a.m90t(c4329cM7E);
                } catch (Throwable th3) {
                    c3959f = new C3959f(th3);
                }
                list = (List) (c3959f instanceof C3959f ? c4173t : c3959f);
            }
        }
        AbstractC4171r.m8432h1(arrayList, list);
        if (this.f12456p <= 0) {
            this.f12456p = this.f12448h.size() + this.f12447g.size();
        }
        if (this.f12447g.isEmpty()) {
            return;
        }
        this.f12454n = "检测已暂停，可继续";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m7974g(String str) {
        if (AbstractC3149m.m6721t0(str) || AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6740d0(str, "gh_", false) || str.equals("filehelper") || str.equals("weixin")) {
            return false;
        }
        return !str.equals(WeChatApis.account() != null ? r0.m3652c() : null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m7975a(long j3) {
        Boolean boolValueOf;
        synchronized (this.f12444d) {
            boolValueOf = Boolean.valueOf(j3 == this.f12458r);
        }
        return boolValueOf.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m7976b(String str) {
        ArrayDeque arrayDeque = this.f12449i;
        arrayDeque.addLast(str);
        while (arrayDeque.size() > 80) {
            arrayDeque.removeFirst();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m7977c(long j3) {
        Boolean boolValueOf;
        synchronized (this.f12444d) {
            boolValueOf = Boolean.valueOf(m7978d(j3));
        }
        return boolValueOf.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m7978d(long j3) {
        return this.f12459s && j3 == this.f12458r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m7979e() {
        synchronized (this.f12444d) {
            try {
                if (this.f12453m && this.f12447g.isEmpty() && this.f12457q == null) {
                    int i9 = 0;
                    this.f12453m = false;
                    this.f12455o = HttpUrl.FRAGMENT_ENCODE_SET;
                    this.f12454n = "检测完成";
                    ArrayList arrayList = this.f12448h;
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        int i10 = 0;
                        while (it.hasNext()) {
                            if ((((C3788d) it.next()).f12420c == EnumC3789e.f12423h) && (i10 = i10 + 1) < 0) {
                                AbstractC0000a.m30P0();
                                throw null;
                            }
                        }
                        i9 = i10;
                    }
                    m7976b("检测完成，共发现 " + i9 + " 位异常好友");
                    m7981h();
                    m7983j();
                    m7986m();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m7980f(C3792h c3792h, String str) {
        if (c3792h.f12434a.f12440b >= AbstractC3754e0.m7909r(this.f12443c.f12465a.getInt("zombie_check_max_retries", 2), 0, 5)) {
            String str2 = (String) this.f12450j.get(c3792h.f12434a.f12439a);
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(str2)) {
                str2 = c3792h.f12434a.f12439a;
            }
            m7982i(new C3788d(c3792h.f12434a.f12439a, str2, EnumC3789e.f12424i, str));
            return;
        }
        synchronized (this.f12444d) {
            try {
                boolean z9 = this.f12453m;
                ArrayDeque arrayDeque = this.f12447g;
                C3794j c3794j = c3792h.f12434a;
                if (z9) {
                    int i9 = c3794j.f12440b + 1;
                    String str3 = c3794j.f12439a;
                    str3.getClass();
                    arrayDeque.addFirst(new C3794j(str3, i9));
                    this.f12454n = str.concat("，准备重试");
                    C3794j c3794j2 = c3792h.f12434a;
                    m7976b(c3794j2.f12439a + ": " + str + "，第 " + (c3794j2.f12440b + 1) + " 次重试");
                } else {
                    arrayDeque.addFirst(c3794j);
                }
                m7981h();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m7986m();
        if (m7985l().f12467b) {
            m7984k(500L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m7981h() throws JSONException {
        C4329c c4329cM7E = AbstractC0000a.m7E();
        C3792h c3792h = this.f12457q;
        if (c3792h != null) {
            c4329cM7E.add(c3792h.f12434a.f12439a);
        }
        Iterator it = this.f12447g.iterator();
        while (it.hasNext()) {
            c4329cM7E.add(((C3794j) it.next()).f12439a);
        }
        C4329c c4329cM90t = AbstractC0000a.m90t(c4329cM7E);
        int i9 = this.f12456p;
        C3796l c3796l = this.f12443c;
        c3796l.getClass();
        c4329cM90t.getClass();
        ArrayList<C3788d> arrayList = this.f12448h;
        arrayList.getClass();
        SharedPreferences.Editor editorPutString = c3796l.f12465a.edit().putString("zombie_check_pending_ids", C3796l.m7987a(c4329cM90t));
        if (i9 < 0) {
            i9 = 0;
        }
        SharedPreferences.Editor editorPutInt = editorPutString.putInt("zombie_check_total_count", i9);
        JSONArray jSONArray = new JSONArray();
        for (C3788d c3788d : arrayList) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wxid", c3788d.f12418a);
            jSONObject.put("name", c3788d.f12419b);
            jSONObject.put("type", c3788d.f12420c.name());
            jSONObject.put("message", c3788d.f12421d);
            jSONArray.put(jSONObject);
        }
        String string = jSONArray.toString();
        string.getClass();
        editorPutInt.putString("zombie_check_results", string).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m7982i(C3788d c3788d) {
        Throwable th2;
        String str;
        C3795k c3795k;
        long j3;
        boolean z9 = c3788d.f12420c == EnumC3789e.f12423h;
        synchronized (this.f12444d) {
            try {
                AbstractC4171r.m8433i1(new C2924a(c3788d, 5), this.f12448h);
                this.f12448h.add(c3788d);
                int iOrdinal = c3788d.f12420c.ordinal();
                if (iOrdinal != 0) {
                    try {
                        if (iOrdinal == 1) {
                            str = c3788d.f12419b + "：好友关系异常";
                        } else {
                            if (iOrdinal != 2) {
                                throw new C0081d();
                            }
                            str = c3788d.f12419b + "：检测异常";
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    str = c3788d.f12419b + "：正常";
                }
                this.f12454n = str;
                m7976b(c3788d.f12419b + ": " + c3788d.f12421d);
                m7981h();
                m7986m();
                if (z9) {
                    synchronized (this.f12444d) {
                        j3 = this.f12458r;
                    }
                    c3795k = this;
                    this.f12446f.execute(new RunnableC0531r(c3795k, c3788d, j3, 5));
                } else {
                    c3795k = this;
                }
                C3796l c3796l = c3795k.f12443c;
                long jMo5361c = ((long) AbstractC2136d.f7122g.mo5361c(AbstractC3754e0.m7909r(c3796l.f12465a.getInt("zombie_check_min_delay_seconds", 2), 0, 60), AbstractC3754e0.m7909r(c3796l.f12465a.getInt("zombie_check_max_delay_seconds", 4), AbstractC3754e0.m7909r(c3796l.f12465a.getInt("zombie_check_min_delay_seconds", 2), 0, 60), 120) + 1)) * 1000;
                if (m7985l().f12467b) {
                    m7984k(jMo5361c);
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m7983j() {
        try {
            PowerManager.WakeLock wakeLock = this.f12464x;
            if (wakeLock != null) {
                if (!wakeLock.isHeld()) {
                    wakeLock = null;
                }
                if (wakeLock != null) {
                    wakeLock.release();
                }
            }
        } catch (Throwable unused) {
        }
        this.f12464x = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m7984k(long j3) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f12445e;
        if (scheduledThreadPoolExecutor.isShutdown()) {
            return;
        }
        RunnableC0003a runnableC0003a = new RunnableC0003a(this, 26);
        if (j3 < 0) {
            j3 = 0;
        }
        scheduledThreadPoolExecutor.schedule(runnableC0003a, j3, TimeUnit.MILLISECONDS);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final C3797m m7985l() {
        C3797m c3797m;
        synchronized (this.f12444d) {
            c3797m = new C3797m(this.f12452l, this.f12453m, this.f12454n, this.f12455o, this.f12456p, (this.f12457q != null ? 1 : 0) + this.f12447g.size(), AbstractC4166m.m8407P1(this.f12448h), AbstractC4166m.m8407P1(this.f12449i), this.f12459s, this.f12460t, this.f12461u, this.f12462v, this.f12463w);
        }
        return c3797m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m7986m() {
        Object c3959f;
        NotificationManager notificationManager;
        Context context = this.f12442b;
        try {
            Object systemService = context.getSystemService("notification");
            notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("hchat_zombie_check", "僵尸粉检测", 2);
            notificationChannel.setDescription("显示好友关系检测进度");
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
            C3797m c3797mM7985l = m7985l();
            List list = c3797mM7985l.f12472g;
            int i9 = c3797mM7985l.f12470e;
            if (i9 <= 0) {
                notificationManager.cancel(1212373571);
                return;
            }
            Notification.Builder builder = new Notification.Builder(context, "hchat_zombie_check");
            int i10 = context.getApplicationInfo().icon;
            Integer numValueOf = i10 != 0 ? Integer.valueOf(i10) : null;
            builder.setSmallIcon(numValueOf != null ? numValueOf.intValue() : R.drawable.stat_notify_sync).setContentTitle("僵尸粉检测").setContentText("已检测 " + list.size() + "/" + i9 + "，异常 " + c3797mM7985l.m7990a() + "，失败 " + c3797mM7985l.m7991b()).setProgress(i9, list.size(), false).setOngoing(c3797mM7985l.f12467b).setOnlyAlertOnce(true);
            notificationManager.notify(1212373571, builder.build());
            c3959f = C3967n.f12976a;
            Throwable thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
                this.f12441a.invoke("更新僵尸粉检测通知失败", thM8182b);
            }
        }
    }
}
