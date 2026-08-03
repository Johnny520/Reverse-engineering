package p108ha;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p011ab.C0042b;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p036c9.ThreadFactoryC0478q;
import p049d9.AbstractC0754o;
import p068eh.AbstractC0921a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.runtime.WeChatDatabaseApi;
import p129ig.AbstractC2043a;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p258r8.C3742g;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: ha.b0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1633b0 {

    /* JADX INFO: renamed from: a */
    public final C0042b f5338a;

    /* JADX INFO: renamed from: b */
    public final Context f5339b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f5340c;

    /* JADX INFO: renamed from: d */
    public final Handler f5341d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f5342e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashSet f5343f;

    /* JADX INFO: renamed from: g */
    public final LinkedHashMap f5344g;

    /* JADX INFO: renamed from: h */
    public volatile String f5345h;

    /* JADX INFO: renamed from: i */
    public boolean f5346i;

    /* JADX INFO: renamed from: j */
    public final SharedPreferencesOnSharedPreferenceChangeListenerC0216b f5347j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1633b0(C3742g c3742g, C0042b c0042b) {
        c3742g.getClass();
        this.f5338a = c0042b;
        Context context = c3742g.f12143a;
        this.f5339b = context;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_moments_post_notification_config");
        this.f5340c = sharedPreferencesM8640c;
        this.f5341d = new Handler(Looper.getMainLooper());
        this.f5342e = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(14));
        this.f5343f = new LinkedHashSet();
        this.f5344g = new LinkedHashMap();
        this.f5346i = sharedPreferencesM8640c.getBoolean("enable", false);
        this.f5347j = new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m4156a(C1635c0 c1635c0, String str, String str2) {
        return AbstractC3149m.m6703R0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "%sender%", str2, false), "%wxid%", c1635c0.f5352c, false), "%type%", c1635c0.f5354e.f5374g, false), "%content%", c1635c0.f5355f, false), "%snsid%", c1635c0.f5350a, false)).toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m4157b(String str, boolean z9) {
        Object c3959f;
        Object c3959f2;
        String absolutePath = this.f5345h;
        if (absolutePath == null) {
            Object obj = C4173t.f13710g;
            try {
                WeChatDatabaseApi weChatDatabaseApiDatabase = WeChatApis.database();
                c3959f2 = weChatDatabaseApiDatabase != null ? weChatDatabaseApiDatabase.query("PRAGMA database_list", null) : null;
                if (c3959f2 == null) {
                    c3959f2 = obj;
                }
            } catch (Throwable th2) {
                c3959f2 = new C3959f(th2);
            }
            if (!(c3959f2 instanceof C3959f)) {
                obj = c3959f2;
            }
            Iterator it = ((List) obj).iterator();
            while (true) {
                if (!it.hasNext()) {
                    absolutePath = null;
                    break;
                }
                Object obj2 = ((Map) it.next()).get("file");
                String string = obj2 != null ? obj2.toString() : null;
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                File parentFile = new File(string).getParentFile();
                if (parentFile != null) {
                    File file = new File(parentFile, "avatar");
                    if (file.isDirectory()) {
                        absolutePath = file.getAbsolutePath();
                        break;
                    }
                }
            }
            this.f5345h = absolutePath;
            if (absolutePath == null) {
                return null;
            }
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(AbstractC3137a.f10177a);
            bytes.getClass();
            byte[] bArrDigest = messageDigest.digest(bytes);
            StringBuilder sb2 = new StringBuilder(bArrDigest.length * 2);
            for (byte b10 : bArrDigest) {
                AbstractC0000a.m96w(16);
                String string2 = Integer.toString((b10 >>> 4) & 15, 16);
                string2.getClass();
                sb2.append(string2);
                AbstractC0000a.m96w(16);
                String string3 = Integer.toString(b10 & 15, 16);
                string3.getClass();
                sb2.append(string3);
            }
            c3959f = sb2.toString();
        } catch (Throwable th3) {
            c3959f = new C3959f(th3);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        String str2 = (String) c3959f;
        if (str2 == null) {
            return null;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(AbstractC3149m.m6706U0(absolutePath, '/'));
        sb3.append('/');
        sb3.append(str2.substring(0, 2));
        sb3.append('/');
        sb3.append(str2.substring(2, 4));
        sb3.append("/user_");
        if (z9) {
            sb3.append("hd_");
        }
        String strM2255r = AbstractC0921a.m2255r(sb3, str2, ".png");
        if (AbstractC0921a.m2262y(strM2255r)) {
            return strM2255r;
        }
        return null;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01bf A[EDGE_INSN: B:116:0x01bf->B:84:0x01bf BREAK  A[LOOP:0: B:55:0x0165->B:118:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[LOOP:0: B:55:0x0165->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01b8  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4158c(C1635c0 c1635c0, String str, String str2) {
        Bitmap bitmap;
        Bitmap bitmapM1948e;
        Object c3959f;
        Object objDecodeFile;
        InputStream inputStream;
        Object systemService = this.f5339b.getSystemService("notification");
        Bitmap bitmap2 = null;
        NotificationManager notificationManager = systemService instanceof NotificationManager ? (NotificationManager) systemService : null;
        if (notificationManager != null) {
            if (notificationManager.getNotificationChannel("hchat_moments_post_v2") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("hchat_moments_post_v2", "朋友圈发布通知", 4);
                notificationChannel.enableVibration(true);
                notificationChannel.setVibrationPattern(new long[]{0, 250, 180, 250});
                notificationManager.createNotificationChannel(notificationChannel);
            }
            Notification.Builder builder = new Notification.Builder(this.f5339b, "hchat_moments_post_v2");
            Notification.Builder visibility = builder.setSmallIcon(R.drawable.stat_notify_chat).setContentTitle(str).setContentText(str2).setStyle(new Notification.BigTextStyle().bigText(str2).setBigContentTitle(str).setSummaryText("朋友圈通知")).setWhen(System.currentTimeMillis()).setShowWhen(true).setAutoCancel(true).setOnlyAlertOnce(false).setDefaults(-1).setCategory("msg").setPriority(1).setVisibility(0);
            int iHashCode = c1635c0.f5350a.hashCode();
            Intent intent = new Intent();
            Context context = this.f5339b;
            intent.setComponent(new ComponentName(context.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
            intent.addFlags(872415232);
            Intent intent2 = new Intent();
            intent2.setComponent(new ComponentName(context.getPackageName(), "com.tencent.mm.plugin.sns.ui.SnsTimeLineUI"));
            intent2.addFlags(603979776);
            visibility.setContentIntent(PendingIntent.getActivities(context, iHashCode, new Intent[]{intent, intent2}, 201326592));
            String str3 = c1635c0.f5352c;
            if (!AbstractC3149m.m6721t0(str3)) {
                Context context2 = this.f5339b;
                if (AbstractC4302b.m8640c(context2, "Hchat_custom_friend_avatar_config").getBoolean("enable", false) && AbstractC4302b.m8640c(context2, "Hchat_custom_friend_avatar_config").getBoolean("scope_moments_notifications", true) && (bitmapM1948e = AbstractC0754o.m1948e(this.f5339b, str3)) != null) {
                    bitmap2 = bitmapM1948e;
                } else {
                    synchronized (this.f5344g) {
                        bitmap = (Bitmap) this.f5344g.get(str3);
                    }
                    if (bitmap != null) {
                        bitmap2 = bitmap;
                    } else {
                        C1368i c1368iM9259c = AbstractC4855en.m9259c();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        String strM4157b = m4157b(str3, false);
                        if (strM4157b != null) {
                            linkedHashSet.add(strM4157b);
                        }
                        String strM4157b2 = m4157b(str3, true);
                        if (strM4157b2 != null) {
                            linkedHashSet.add(strM4157b2);
                        }
                        String strM3724m = c1368iM9259c != null ? c1368iM9259c.m3724m(str3, true) : null;
                        if (strM3724m == null) {
                            strM3724m = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC3149m.m6721t0(strM3724m)) {
                            strM3724m = null;
                        }
                        if (strM3724m != null) {
                            linkedHashSet.add(strM3724m);
                        }
                        String strM3724m2 = c1368iM9259c != null ? c1368iM9259c.m3724m(str3, false) : null;
                        if (strM3724m2 == null) {
                            strM3724m2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC3149m.m6721t0(strM3724m2)) {
                            strM3724m2 = null;
                        }
                        if (strM3724m2 != null) {
                            linkedHashSet.add(strM3724m2);
                        }
                        Iterator it = linkedHashSet.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                bitmapM1948e = null;
                                break;
                            }
                            String str4 = (String) it.next();
                            try {
                            } catch (Throwable th2) {
                                c3959f = new C3959f(th2);
                            }
                            try {
                                if (!AbstractC3156t.m6740d0(str4, "http://", false) && !AbstractC3156t.m6740d0(str4, "https://", false)) {
                                    objDecodeFile = BitmapFactory.decodeFile(str4);
                                    if (objDecodeFile instanceof C3959f) {
                                        objDecodeFile = null;
                                    }
                                    bitmapM1948e = (Bitmap) objDecodeFile;
                                    if (bitmapM1948e == null) {
                                        break;
                                    }
                                }
                                c3959f = BitmapFactory.decodeStream(inputStream);
                                AbstractC2043a.m5035i(inputStream, null);
                                objDecodeFile = c3959f;
                                if (objDecodeFile instanceof C3959f) {
                                }
                                bitmapM1948e = (Bitmap) objDecodeFile;
                                if (bitmapM1948e == null) {
                                }
                            } finally {
                            }
                            URLConnection uRLConnectionOpenConnection = new URL(str4).openConnection();
                            uRLConnectionOpenConnection.setConnectTimeout(3000);
                            uRLConnectionOpenConnection.setReadTimeout(3000);
                            inputStream = uRLConnectionOpenConnection.getInputStream();
                        }
                        if (bitmapM1948e != null) {
                            synchronized (this.f5344g) {
                                this.f5344g.put(str3, bitmapM1948e);
                                while (this.f5344g.size() > 128) {
                                    LinkedHashMap linkedHashMap = this.f5344g;
                                    Set setEntrySet = linkedHashMap.entrySet();
                                    setEntrySet.getClass();
                                    linkedHashMap.remove(((Map.Entry) AbstractC4166m.m8421s1(setEntrySet)).getKey());
                                }
                            }
                            bitmap2 = bitmapM1948e;
                        }
                    }
                }
            }
            if (bitmap2 != null) {
                builder.setLargeIcon(bitmap2);
            }
            notificationManager.notify("hchat_sns_".concat(c1635c0.f5350a).hashCode(), builder.build());
        }
    }
}
